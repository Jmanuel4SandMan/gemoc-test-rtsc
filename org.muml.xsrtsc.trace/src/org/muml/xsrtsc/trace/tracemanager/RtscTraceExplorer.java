package org.muml.xsrtsc.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.gemoc.executionframework.engine.core.CommandExecution;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Step;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.api.ITraceViewListener;

public class RtscTraceExplorer implements ITraceExplorer {
	private rtscTrace.SpecificTrace traceRoot;
	private Resource modelResource;
	private final Map<EObject, EObject> tracedToExe;

	private int lastJumpIndex = -1;
	private rtscTrace.States.State currentState = null;
	private final List<Step> callStack = new ArrayList<>();

	private final List<List<? extends rtscTrace.States.Value>> valueTraces = new ArrayList<>();

	private List<rtscTrace.States.State> statesTrace;

	private rtscTrace.Steps.SpecificStep stepIntoResult;
	private rtscTrace.Steps.SpecificStep stepOverResult;
	private rtscTrace.Steps.SpecificStep stepReturnResult;

	private rtscTrace.Steps.SpecificStep stepBackIntoResult;
	private rtscTrace.Steps.SpecificStep stepBackOverResult;
	private rtscTrace.Steps.SpecificStep stepBackOutResult;

	private final Map<rtscTrace.Steps.SpecificStep, Integer> stepToStartingIndex = new HashMap<>();
	private final Map<rtscTrace.Steps.SpecificStep, Integer> stepToEndingIndex = new HashMap<>();

	private final HashMap<List<? extends rtscTrace.States.Value>, rtscTrace.States.Value> backValueCache = new HashMap<>();

	private final Map<ITraceViewListener, Set<TraceViewCommand>> listeners = new HashMap<>();

	public RtscTraceExplorer(Map<EObject, EObject> tracedToExe) {
		this.tracedToExe = tracedToExe;
	}

	public RtscTraceExplorer() {
		this.tracedToExe = null;
	}

	private List<List<? extends rtscTrace.States.Value>> getAllValueTraces() {
		final List<List<? extends rtscTrace.States.Value>> result = new ArrayList<>();
		for (rtscTrace.States.rtsc.TracedRealtimestatechart tracedObject : traceRoot
				.getRtsc_tracedRealtimestatecharts()) {
			result.add(tracedObject.getRoundsSequence());
		}
		for (rtscTrace.States.rtsc.TracedState tracedObject : traceRoot.getRtsc_tracedStates()) {
			result.add(tracedObject.getActiveSequence());
		}
		for (rtscTrace.States.rtsc.TracedTransition tracedObject : traceRoot.getRtsc_tracedTransitions()) {
			result.add(tracedObject.getHitCountSequence());
		}
		for (rtscTrace.States.rtsc.TracedVertex tracedObject : traceRoot.getRtsc_tracedVertexs()) {
			result.add(tracedObject.getActiveSequence());
		}
		return result;
	}

	private rtscTrace.States.Value getActiveValue(final List<? extends rtscTrace.States.Value> valueTrace,
			final rtscTrace.States.State state) {
		rtscTrace.States.Value result = null;
		for (rtscTrace.States.Value value : valueTrace) {
			if (value.getStatesNoOpposite().contains(state)) {
				result = value;
				break;
			}
		}
		return result;
	}

	private rtscTrace.States.Value getPreviousValue(final List<? extends rtscTrace.States.Value> valueTrace) {
		int i = getCurrentStateIndex() - 1;
		final rtscTrace.States.Value value = getActiveValue(valueTrace, statesTrace.get(i + 1));
		rtscTrace.States.Value previousValue = null;
		while (i > -1 && (previousValue == null || previousValue == value)) {
			previousValue = getActiveValue(valueTrace, statesTrace.get(i));
			i--;
		}
		return previousValue;
	}

	private rtscTrace.States.Value getNextValue(final List<? extends rtscTrace.States.Value> valueTrace) {
		int i = getCurrentStateIndex() + 1;
		final rtscTrace.States.Value value = getActiveValue(valueTrace, statesTrace.get(i - 1));
		rtscTrace.States.Value nextValue = null;
		final int traceLength = valueTrace.stream().map(v -> v.getStatesNoOpposite().size()).reduce(0, (a, b) -> a + b);
		while (i < traceLength && (nextValue == null || nextValue == value)) {
			nextValue = getActiveValue(valueTrace, statesTrace.get(i));
			i++;
		}
		return nextValue;
	}

	private int getStartingIndex(rtscTrace.Steps.SpecificStep step) {
		return stepToStartingIndex.computeIfAbsent(step, s -> {
			return statesTrace.indexOf(s.getStartingState());
		});
	}

	private int getEndingIndex(rtscTrace.Steps.SpecificStep step) {
		if (step.getEndingState() != null) {
			return stepToEndingIndex.computeIfAbsent(step, s -> {
				return statesTrace.indexOf(s.getEndingState());
			});
		}
		return -1;
	}

	@SuppressWarnings("unchecked")
	private rtscTrace.Steps.SpecificStep findNextStep(final List<rtscTrace.Steps.SpecificStep> stepPath,
			final rtscTrace.Steps.SpecificStep previousStep, final int start) {
		final List<rtscTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		rtscTrace.Steps.SpecificStep result = null;
		int i = start;
		int depth = stepPath.size();
		rtscTrace.Steps.SpecificStep previous = previousStep;
		while (result == null && i < depth) {
			final rtscTrace.Steps.SpecificStep currentStep = stepPath.get(depth - i - 1);
			final List<rtscTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
			if (currentStep instanceof SequentialStep<?>) {
				currentSubSteps.addAll(((SequentialStep<rtscTrace.Steps.SpecificStep>) currentStep).getSubSteps());
			}
			if (currentSubSteps.isEmpty()) {
				// No substep to step into, we thus have to explore the substeps
				// of the parent step
				previous = currentStep;
			} else {
				if (previous == null) {
					// First time we step into
					result = currentSubSteps.get(0);
				} else {
					final int idx = currentSubSteps.indexOf(previous) + 1;
					if (idx < currentSubSteps.size()) {
						// We step into the next step
						result = currentSubSteps.get(idx);
					} else {
						previous = currentStep;
					}
				}
			}
			i++;
		}
		if (result == null) {
			final int idx = rootSteps.indexOf(previous) + 1;
			if (idx < rootSteps.size()) {
				result = rootSteps.get(idx);
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private rtscTrace.Steps.SpecificStep computeBackInto(List<rtscTrace.Steps.SpecificStep> stepPath) {
		final List<rtscTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		rtscTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final rtscTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final rtscTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<rtscTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<rtscTrace.Steps.SpecificStep>) parentStep;
			final List<? extends rtscTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else if (idx > 0) {
				// Otherwise, return the deepest substep in the previous sibling
				// step
				final rtscTrace.Steps.SpecificStep previousSiblingStep = parentSubSteps.get(idx - 1);
				rtscTrace.Steps.SpecificStep tmpStep = previousSiblingStep;
				final List<rtscTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<rtscTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<rtscTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<rtscTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<rtscTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		} else if (depth == 1) {
			final rtscTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				rtscTrace.Steps.SpecificStep tmpStep = rootSteps.get(idx - 1);
				final List<rtscTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<rtscTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<rtscTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<rtscTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<rtscTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private rtscTrace.Steps.SpecificStep computeBackOver(List<rtscTrace.Steps.SpecificStep> stepPath) {
		final List<rtscTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		rtscTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final rtscTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final rtscTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<rtscTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<rtscTrace.Steps.SpecificStep>) parentStep;
			final List<rtscTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else {
				// Otherwise, return the previous sibling step
				result = parentSubSteps.get(idx - 1);
			}
		} else if (depth == 1) {
			final rtscTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				result = rootSteps.get(idx - 1);
			}
		}
		return result;
	}

	private rtscTrace.Steps.SpecificStep computeBackOut(List<rtscTrace.Steps.SpecificStep> stepPath) {
		if (stepPath.size() > 1) {
			return stepPath.get(stepPath.size() - 2);
		}
		return null;
	}

	private rtscTrace.Steps.SpecificStep computeStepInto(List<rtscTrace.Steps.SpecificStep> stepPath,
			List<rtscTrace.Steps.SpecificStep> rootSteps) {
		return findNextStep(stepPath, null, 0);
	}

	private rtscTrace.Steps.SpecificStep computeStepOver(List<rtscTrace.Steps.SpecificStep> stepPath,
			List<rtscTrace.Steps.SpecificStep> rootSteps) {
		if (!stepPath.isEmpty()) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 1), 1);
		}
		return null;
	}

	private rtscTrace.Steps.SpecificStep computeStepReturn(List<rtscTrace.Steps.SpecificStep> stepPath,
			List<rtscTrace.Steps.SpecificStep> rootSteps) {
		if (stepPath.size() > 1) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 2), 2);
		}
		return null;
	}

	private void computeExplorerState(List<rtscTrace.Steps.SpecificStep> stepPath) {
		final List<rtscTrace.Steps.SpecificStep> rootSteps = getStepsForStates(0, statesTrace.size());

		final List<rtscTrace.Steps.SpecificStep> stepPathUnmodifiable = Collections.unmodifiableList(stepPath);

		stepIntoResult = computeStepInto(stepPathUnmodifiable, rootSteps);
		stepOverResult = computeStepOver(stepPathUnmodifiable, rootSteps);
		stepReturnResult = computeStepReturn(stepPathUnmodifiable, rootSteps);

		stepBackIntoResult = computeBackInto(stepPathUnmodifiable);
		stepBackOverResult = computeBackOver(stepPathUnmodifiable);
		stepBackOutResult = computeBackOut(stepPathUnmodifiable);

		callStack.clear();
		callStack.addAll(stepPathUnmodifiable.stream().map(s -> (Step) s).collect(Collectors.toList()));
	}

	private void goTo(EObject eObject) {
		if (eObject instanceof rtscTrace.States.State) {
			rtscTrace.States.State stateToGo = (rtscTrace.States.State) eObject;
			for (rtscTrace.States.Vertex_active_Value value : stateToGo.getVertex_active_Values()) {
				if (value.getParent() instanceof rtscTrace.States.rtsc.TracedState) {
					rtscTrace.States.rtsc.TracedState parent_cast = (rtscTrace.States.rtsc.TracedState) value
							.getParent();
					boolean toset = value.isActive();
					boolean current = ((org.muml.xsrtsc.xsrtsc.rtsc.Vertex) parent_cast.getOriginalObject_Vertex())
							.isActive();
					if (current != toset) {
						((org.muml.xsrtsc.xsrtsc.rtsc.Vertex) parent_cast.getOriginalObject_Vertex())
								.setActive((boolean) toset);
					}
				}
				if (value.getParent() instanceof rtscTrace.States.rtsc.TracedVertex) {
					rtscTrace.States.rtsc.TracedVertex parent_cast = (rtscTrace.States.rtsc.TracedVertex) value
							.getParent();
					boolean toset = value.isActive();
					boolean current = ((org.muml.xsrtsc.xsrtsc.rtsc.Vertex) parent_cast.getOriginalObject_Vertex())
							.isActive();
					if (current != toset) {
						((org.muml.xsrtsc.xsrtsc.rtsc.Vertex) parent_cast.getOriginalObject_Vertex())
								.setActive((boolean) toset);
					}
				}
			}
			for (rtscTrace.States.Transition_hitCount_Value value : stateToGo.getTransition_hitCount_Values()) {
				if (value.getParent() instanceof rtscTrace.States.rtsc.TracedTransition) {
					rtscTrace.States.rtsc.TracedTransition parent_cast = (rtscTrace.States.rtsc.TracedTransition) value
							.getParent();
					int toset = value.getHitCount();
					int current = ((org.muml.xsrtsc.xsrtsc.rtsc.Transition) parent_cast.getOriginalObject())
							.getHitCount();
					if (current != toset) {
						((org.muml.xsrtsc.xsrtsc.rtsc.Transition) parent_cast.getOriginalObject())
								.setHitCount((int) toset);
					}
				}
			}
			for (rtscTrace.States.Realtimestatechart_rounds_Value value : stateToGo
					.getRealtimestatechart_rounds_Values()) {
				if (value.getParent() instanceof rtscTrace.States.rtsc.TracedRealtimestatechart) {
					rtscTrace.States.rtsc.TracedRealtimestatechart parent_cast = (rtscTrace.States.rtsc.TracedRealtimestatechart) value
							.getParent();
					int toset = value.getRounds();
					int current = ((org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart) parent_cast.getOriginalObject())
							.getRounds();
					if (current != toset) {
						((org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart) parent_cast.getOriginalObject())
								.setRounds((int) toset);
					}
				}
			}
			backValueCache.clear();
		} else if (eObject instanceof rtscTrace.States.Value) {
			goTo(((rtscTrace.States.Value) eObject).getStatesNoOpposite().get(0));
		}
	}

	private void goTo(int stateNumber) {
		if (modelResource != null) {
			try {
				final TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(modelResource);
				if (ed != null) {
					final RecordingCommand command = new RecordingCommand(ed, "") {
						protected void doExecute() {
							goTo(statesTrace.get(stateNumber));
						}
					};
					CommandExecution.execute(ed, command);
				}
			} catch (Exception e) {
				throw e;
			}
		}
	}

	private void jumpBeforeStep(rtscTrace.Steps.SpecificStep step) {
		if (step != null) {
			final int i = getStartingIndex(step);
			if (i == statesTrace.size() - 1) {
				lastJumpIndex = -1;
				currentState = statesTrace.get(statesTrace.size() - 1);
			} else {
				lastJumpIndex = i;
				currentState = statesTrace.get(i);
			}
			if (tracedToExe != null) {
				goTo(i);
			}
			updateCallStack(step);
		}
	}

	public void loadTrace(rtscTrace.SpecificTrace root) {
		traceRoot = root;
		statesTrace = traceRoot.getStatesTrace();
		if (!statesTrace.isEmpty()) {
			currentState = statesTrace.get(0);
		}
		valueTraces.addAll(getAllValueTraces());
	}

	public void loadTrace(Resource modelResource, rtscTrace.SpecificTrace root) {
		loadTrace(root);
		this.modelResource = modelResource;
	}

	@Override
	public boolean canBackValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			return backValueCache.computeIfAbsent(valueTraces.get(traceIndex),
					valueTrace -> getPreviousValue(valueTrace)) != null;
		}
		return false;
	}

	@Override
	public boolean canStepValue(int traceIndex) {
		return true;
	}

	@Override
	public void backValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final rtscTrace.States.Value previousValue = backValueCache.get(valueTraces.get(traceIndex));
			if (previousValue != null) {
				jump(previousValue);
			}
		}
	}

	@Override
	public void stepValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final rtscTrace.States.Value nextValue = getNextValue(valueTraces.get(traceIndex));
			if (nextValue != null) {
				jump(nextValue);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void jump(int i) {
		final List<rtscTrace.States.State> states = statesTrace;
		if (i < states.size()) {
			final List<rtscTrace.Steps.SpecificStep> rootSteps = getStepsForStates(i, i);
			final List<rtscTrace.Steps.SpecificStep> searchPath = new ArrayList<>();
			rtscTrace.Steps.SpecificStep firstStepOfState = null;
			if (!rootSteps.isEmpty()) {
				final Predicate<rtscTrace.Steps.SpecificStep> p = s -> {
					final int stepStartingState = getStartingIndex(s);
					final int stepEndingState = getEndingIndex(s);
					return (stepEndingState == -1 || stepEndingState >= i) && stepStartingState <= i;
				};
				rtscTrace.Steps.SpecificStep currentStep = rootSteps.get(0);
				final List<rtscTrace.Steps.SpecificStep> siblingSteps = new ArrayList<>(rootSteps);
				final List<rtscTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
				if (currentStep instanceof SequentialStep<?>) {
					final SequentialStep<rtscTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<rtscTrace.Steps.SpecificStep>) currentStep;
					currentSubSteps
							.addAll(currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
				}
				while (firstStepOfState == null) {
					final int startingIndex = getStartingIndex(currentStep);
					final int endingIndex = getEndingIndex(currentStep);
					if (startingIndex < i && (endingIndex > i || endingIndex == -1)) {
						if (currentSubSteps.isEmpty()) {
							throw new IllegalStateException("Unreachable state");
						} else {
							searchPath.add(0, currentStep);
							siblingSteps.clear();
							siblingSteps.addAll(currentSubSteps);
							currentStep = siblingSteps.get(0);
							currentSubSteps.clear();
							if (currentStep instanceof SequentialStep<?>) {
								final SequentialStep<rtscTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<rtscTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (endingIndex == i && startingIndex != i) {
						if (currentSubSteps.isEmpty()) {
							// We need to explore the next sibling step
							rtscTrace.Steps.SpecificStep tmp = currentStep;
							currentStep = null;
							while (currentStep == null) {
								final int idx = siblingSteps.indexOf(tmp) + 1;
								if (idx < siblingSteps.size()) {
									currentStep = siblingSteps.get(idx);
									if (currentStep instanceof SequentialStep<?>) {
										final SequentialStep<rtscTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<rtscTrace.Steps.SpecificStep>) currentStep;
										currentSubSteps.addAll(currentStep_cast.getSubSteps().stream().filter(p)
												.collect(Collectors.toList()));
									}
								} else {
									if (searchPath.isEmpty()) {
										throw new IllegalStateException("Unreachable state");
									} else {
										tmp = searchPath.remove(0);
										siblingSteps.clear();
										if (searchPath.isEmpty()) {
											siblingSteps.addAll(rootSteps);
										} else {
											final rtscTrace.Steps.SpecificStep s = searchPath.get(0);
											if (s instanceof SequentialStep<?>) {
												final SequentialStep<rtscTrace.Steps.SpecificStep> s_cast = (SequentialStep<rtscTrace.Steps.SpecificStep>) s;
												siblingSteps.addAll((s_cast).getSubSteps().stream().filter(p)
														.collect(Collectors.toList()));
											}
										}
									}
								}
							}
						} else {
							// We need to explore the substeps in case one of them starts on i
							searchPath.add(0, currentStep);
							siblingSteps.clear();
							siblingSteps.addAll(currentSubSteps);
							currentStep = siblingSteps.get(0);
							currentSubSteps.clear();
							if (currentStep instanceof SequentialStep<?>) {
								final SequentialStep<rtscTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<rtscTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (startingIndex == i) {
						firstStepOfState = currentStep;
					}
				}
			}
			jumpBeforeStep(firstStepOfState);
		}
	}

	@Override
	public boolean canStepBackInto() {
		return stepBackIntoResult != null;
	}

	@Override
	public boolean canStepBackOver() {
		return stepBackOverResult != null;
	}

	@Override
	public boolean canStepBackOut() {
		return stepBackOutResult != null;
	}

	@Override
	public int getCurrentStateIndex() {
		if (lastJumpIndex != -1) {
			return lastJumpIndex;
		}
		return statesTrace.size() - 1;
	}

	@Override
	public List<Step> getCallStack() {
		return callStack;
	}

	private List<rtscTrace.Steps.SpecificStep> getStepsForStates(int startingState, int endingState) {
		Predicate<rtscTrace.Steps.SpecificStep> predicate = s -> {
			final int stepStartingState = getStartingIndex(s);
			final int stepEndingState = getEndingIndex(s);
			return (stepEndingState == -1 || stepEndingState >= startingState) && stepStartingState <= endingState;
		};
		return traceRoot.getRootStep().getSubSteps().stream().filter(predicate).collect(Collectors.toList());
	}

	@Override
	public void notifyListeners() {
		for (Map.Entry<ITraceViewListener, Set<TraceViewCommand>> entry : listeners.entrySet()) {
			entry.getValue().forEach(c -> c.execute());
		}
	}

	@Override
	public void registerCommand(ITraceViewListener listener, TraceViewCommand command) {
		if (listener != null) {
			Set<TraceViewCommand> commands = listeners.get(listener);
			if (commands == null) {
				commands = new HashSet<>();
				listeners.put(listener, commands);
			}
			commands.add(command);
		}
	}

	@Override
	public void removeListener(ITraceViewListener listener) {
		if (listener != null) {
			listeners.remove(listener);
		}
	}

	@Override
	public Step getCurrentForwardStep() {
		if (!callStack.isEmpty()) {
			return callStack.get(callStack.size() - 1);
		}
		return null;
	}

	@Override
	public Step getCurrentBackwardStep() {
		return stepBackOverResult;
	}

	@Override
	public Step getCurrentBigStep() {
		return stepBackOutResult;
	}

	@Override
	public void jump(EObject o) {
		int idx = -1;
		if (o instanceof rtscTrace.States.State) {
			idx = statesTrace.indexOf(o);
		} else if (o instanceof rtscTrace.States.Value) {
			final rtscTrace.States.State state = ((rtscTrace.States.Value) o).getStatesNoOpposite().get(0);
			idx = statesTrace.indexOf(state);
		}
		if (idx != -1) {
			jump(idx);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void loadLastState() {
		final int idx = statesTrace.size() - 1;
		final List<rtscTrace.Steps.SpecificStep> steps = getStepsForStates(idx, idx);
		rtscTrace.Steps.SpecificStep lastStep = null;
		while (!steps.isEmpty()) {
			lastStep = steps.get(steps.size() - 1);
			steps.clear();
			if (lastStep instanceof SequentialStep<?>) {
				steps.addAll(((SequentialStep<rtscTrace.Steps.SpecificStep>) lastStep).getSubSteps());
			}
		}
		final int endingIndex = getEndingIndex(lastStep);
		if (endingIndex == -1 || endingIndex == idx) {
			jumpBeforeStep(lastStep);
		}
	}

	@Override
	public boolean stepInto() {
		if (stepIntoResult != null) {
			jumpBeforeStep(stepIntoResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepOver() {
		if (stepOverResult != null) {
			jumpBeforeStep(stepOverResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepReturn() {
		if (stepReturnResult != null) {
			jumpBeforeStep(stepReturnResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackInto() {
		if (stepBackIntoResult != null) {
			jumpBeforeStep(stepBackIntoResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackOver() {
		if (stepBackOverResult != null) {
			jumpBeforeStep(stepBackOverResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackOut() {
		if (stepBackOutResult != null) {
			jumpBeforeStep(stepBackOutResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean isInReplayMode() {
		return stepIntoResult != null;
	}

	@Override
	public void updateCallStack(Step step) {
		if (step instanceof rtscTrace.Steps.SpecificStep) {
			rtscTrace.Steps.SpecificStep step_cast = (rtscTrace.Steps.SpecificStep) step;
			final List<rtscTrace.Steps.SpecificStep> newPath = new ArrayList<>();
			newPath.add(step_cast);
			EObject container = step.eContainer();
			while (container != null && container instanceof rtscTrace.Steps.SpecificStep) {
				newPath.add(0, (rtscTrace.Steps.SpecificStep) container);
				container = container.eContainer();
			}
			computeExplorerState(newPath);
			notifyListeners();
		} else {
			throw new IllegalArgumentException(
					"RtscTraceExplorer expects specific steps and cannot handle this: " + step);
		}
	}

	@Override
	public void statesAdded(List<EObject> state) {
	}

	@Override
	public void valuesAdded(List<EObject> value) {
	}

	@Override
	public void dimensionsAdded(List<List<? extends EObject>> dimensions) {
		valueTraces.clear();
		valueTraces.addAll(getAllValueTraces());
		notifyListeners();
	}

	@Override
	public void stepsStarted(List<EObject> steps) {
	}

	@Override
	public void stepsEnded(List<EObject> steps) {
	}
}
