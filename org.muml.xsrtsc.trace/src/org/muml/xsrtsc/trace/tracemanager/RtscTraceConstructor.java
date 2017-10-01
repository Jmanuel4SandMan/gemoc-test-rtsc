package org.muml.xsrtsc.trace.tracemanager;

import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.commons.model.trace.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class RtscTraceConstructor implements ITraceConstructor {
	private rtscTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private rtscTrace.States.State lastState;

	private Resource traceResource;
	private final Deque<rtscTrace.Steps.SpecificStep> context = new LinkedList<rtscTrace.Steps.SpecificStep>();

	public RtscTraceConstructor(Resource exeModel, Resource traceResource, Map<EObject, EObject> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = rtscTrace.States.StatesFactory.eINSTANCE.createState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.Vertex) {
						org.muml.xsrtsc.xsrtsc.rtsc.Vertex o_cast = (org.muml.xsrtsc.xsrtsc.rtsc.Vertex) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.Behavior) {
						org.muml.xsrtsc.xsrtsc.rtsc.Behavior o_cast = (org.muml.xsrtsc.xsrtsc.rtsc.Behavior) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.NamedElement) {
						org.muml.xsrtsc.xsrtsc.rtsc.NamedElement o_cast = (org.muml.xsrtsc.xsrtsc.rtsc.NamedElement) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	private boolean addNewObjectToState(org.muml.xsrtsc.xsrtsc.rtsc.Behavior o_cast, rtscTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart) {
			added = addNewObjectToState((org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.muml.xsrtsc.xsrtsc.rtsc.NamedElement o_cast,
			rtscTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.muml.xsrtsc.xsrtsc.rtsc.Transition) {
			added = addNewObjectToState((org.muml.xsrtsc.xsrtsc.rtsc.Transition) o_cast, newState);
		} else if (o_cast instanceof org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart) {
			added = addNewObjectToState((org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart) o_cast, newState);
		} else if (o_cast instanceof org.muml.xsrtsc.xsrtsc.rtsc.State) {
			added = addNewObjectToState((org.muml.xsrtsc.xsrtsc.rtsc.State) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart o_cast,
			rtscTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			rtscTrace.States.rtsc.TracedRealtimestatechart tracedObject = rtscTrace.States.rtsc.RtscFactory.eINSTANCE
					.createTracedRealtimestatechart();
			tracedObject.setOriginalObject((org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getRtsc_tracedRealtimestatecharts().add(tracedObject);

			// Creation of the first value of the field rounds
			rtscTrace.States.Realtimestatechart_rounds_Value firstValue_rounds = rtscTrace.States.StatesFactory.eINSTANCE
					.createRealtimestatechart_rounds_Value();

			firstValue_rounds.setRounds((int) o_cast.getRounds());
			tracedObject.getRoundsSequence().add(firstValue_rounds);
			newState.getRealtimestatechart_rounds_Values().add(firstValue_rounds);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.muml.xsrtsc.xsrtsc.rtsc.State o_cast, rtscTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			rtscTrace.States.rtsc.TracedState tracedObject = rtscTrace.States.rtsc.RtscFactory.eINSTANCE
					.createTracedState();
			tracedObject.setOriginalObject_Vertex((org.muml.xsrtsc.xsrtsc.rtsc.Vertex) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getRtsc_tracedStates().add(tracedObject);

			// Creation of the first value of the field active
			rtscTrace.States.Vertex_active_Value firstValue_active = rtscTrace.States.StatesFactory.eINSTANCE
					.createVertex_active_Value();

			firstValue_active.setActive((boolean) o_cast.isActive());
			tracedObject.getActiveSequence().add(firstValue_active);
			newState.getVertex_active_Values().add(firstValue_active);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.muml.xsrtsc.xsrtsc.rtsc.Transition o_cast,
			rtscTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			rtscTrace.States.rtsc.TracedTransition tracedObject = rtscTrace.States.rtsc.RtscFactory.eINSTANCE
					.createTracedTransition();
			tracedObject.setOriginalObject((org.muml.xsrtsc.xsrtsc.rtsc.Transition) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getRtsc_tracedTransitions().add(tracedObject);

			// Creation of the first value of the field hitCount
			rtscTrace.States.Transition_hitCount_Value firstValue_hitCount = rtscTrace.States.StatesFactory.eINSTANCE
					.createTransition_hitCount_Value();

			firstValue_hitCount.setHitCount((int) o_cast.getHitCount());
			tracedObject.getHitCountSequence().add(firstValue_hitCount);
			newState.getTransition_hitCount_Values().add(firstValue_hitCount);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.muml.xsrtsc.xsrtsc.rtsc.Vertex o_cast, rtscTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.muml.xsrtsc.xsrtsc.rtsc.State) {
			added = addNewObjectToState((org.muml.xsrtsc.xsrtsc.rtsc.State) o_cast, newState);
		}

		if (!added && !exeToTraced.containsKey(o_cast)) {
			rtscTrace.States.rtsc.TracedVertex tracedObject = rtscTrace.States.rtsc.RtscFactory.eINSTANCE
					.createTracedVertex();
			tracedObject.setOriginalObject_Vertex((org.muml.xsrtsc.xsrtsc.rtsc.Vertex) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getRtsc_tracedVertexs().add(tracedObject);

			// Creation of the first value of the field active
			rtscTrace.States.Vertex_active_Value firstValue_active = rtscTrace.States.StatesFactory.eINSTANCE
					.createVertex_active_Value();

			firstValue_active.setActive((boolean) o_cast.isActive());
			tracedObject.getActiveSequence().add(firstValue_active);
			newState.getVertex_active_Values().add(firstValue_active);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean copiedState = false;

	private rtscTrace.States.State copyState(rtscTrace.States.State oldState) {
		rtscTrace.States.State newState = rtscTrace.States.StatesFactory.eINSTANCE.createState();
		newState.getVertex_active_Values().addAll(oldState.getVertex_active_Values());
		newState.getTransition_hitCount_Values().addAll(oldState.getTransition_hitCount_Values());
		newState.getRealtimestatechart_rounds_Values().addAll(oldState.getRealtimestatechart_rounds_Values());
		copiedState = true;
		return newState;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addState(List<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
		if (lastState == null) {
			addInitialState();
		}
		if (!changes.isEmpty()) {
			boolean stateChanged = false;
			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that changed
			rtscTrace.States.State newState = copyState(lastState);
			for (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();

					if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.Transition) {
						org.muml.xsrtsc.xsrtsc.rtsc.Transition o_cast = (org.muml.xsrtsc.xsrtsc.rtsc.Transition) o;

						if (p.getFeatureID() == org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage.eINSTANCE
								.getTransition_HitCount().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							rtscTrace.States.rtsc.TracedTransition traced = (rtscTrace.States.rtsc.TracedTransition) exeToTraced
									.get(o);
							rtscTrace.States.Transition_hitCount_Value lastValue = traced.getHitCountSequence()
									.get(traced.getHitCountSequence().size() - 1);
							newState.getTransition_hitCount_Values().remove(lastValue);

							// And we create a proper new value
							rtscTrace.States.Transition_hitCount_Value newValue = rtscTrace.States.StatesFactory.eINSTANCE
									.createTransition_hitCount_Value();

							int value = o_cast.getHitCount();

							newValue.setHitCount((int) value);

							traced.getHitCountSequence().add(newValue);
							newState.getTransition_hitCount_Values().add(newValue);
						}
					}

					if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.Vertex) {
						org.muml.xsrtsc.xsrtsc.rtsc.Vertex o_cast = (org.muml.xsrtsc.xsrtsc.rtsc.Vertex) o;

						if (p.getFeatureID() == org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage.eINSTANCE.getVertex_Active()
								.getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							rtscTrace.States.rtsc.TracedVertex traced = (rtscTrace.States.rtsc.TracedVertex) exeToTraced
									.get(o);
							rtscTrace.States.Vertex_active_Value lastValue = traced.getActiveSequence()
									.get(traced.getActiveSequence().size() - 1);
							newState.getVertex_active_Values().remove(lastValue);

							// And we create a proper new value
							rtscTrace.States.Vertex_active_Value newValue = rtscTrace.States.StatesFactory.eINSTANCE
									.createVertex_active_Value();

							boolean value = o_cast.isActive();

							newValue.setActive((boolean) value);

							traced.getActiveSequence().add(newValue);
							newState.getVertex_active_Values().add(newValue);
						}
					}

					if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart) {
						org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart o_cast = (org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart) o;

						if (p.getFeatureID() == org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage.eINSTANCE
								.getRealtimestatechart_Rounds().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							rtscTrace.States.rtsc.TracedRealtimestatechart traced = (rtscTrace.States.rtsc.TracedRealtimestatechart) exeToTraced
									.get(o);
							rtscTrace.States.Realtimestatechart_rounds_Value lastValue = traced.getRoundsSequence()
									.get(traced.getRoundsSequence().size() - 1);
							newState.getRealtimestatechart_rounds_Values().remove(lastValue);

							// And we create a proper new value
							rtscTrace.States.Realtimestatechart_rounds_Value newValue = rtscTrace.States.StatesFactory.eINSTANCE
									.createRealtimestatechart_rounds_Value();

							int value = o_cast.getRounds();

							newValue.setRounds((int) value);

							traced.getRoundsSequence().add(newValue);
							newState.getRealtimestatechart_rounds_Values().add(newValue);
						}
					}
				}
			}
			if (stateChanged) {
				final rtscTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof fr.inria.diverse.trace.commons.model.trace.BigStep) {
					final rtscTrace.States.State startingState = lastState;
					final rtscTrace.States.State endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStatesTrace().add(lastState);
			} else if (copiedState) {
				newState.getVertex_active_Values().clear();
				newState.getTransition_hitCount_Values().clear();
				newState.getRealtimestatechart_rounds_Values().clear();
			}
			copiedState = false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		rtscTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof rtscTrace.Steps.SpecificStep) {
			step_cast = (rtscTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			rtscTrace.States.State state = traceRoot.getStatesTrace().get(traceRoot.getStatesTrace().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<rtscTrace.Steps.SpecificStep>) context.getFirst()).getSubSteps().add(step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize) {
				rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize rtsc_Realtimestatechart_InitializeInstance = (rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize) step_cast;
				traceRoot.getRtsc_Realtimestatechart_Initialize_Sequence()
						.add(rtsc_Realtimestatechart_InitializeInstance);
			} else if (step_cast instanceof rtscTrace.Steps.Rtsc_Realtimestatechart_Step) {
				rtscTrace.Steps.Rtsc_Realtimestatechart_Step rtsc_Realtimestatechart_StepInstance = (rtscTrace.Steps.Rtsc_Realtimestatechart_Step) step_cast;
				traceRoot.getRtsc_Realtimestatechart_Step_Sequence().add(rtsc_Realtimestatechart_StepInstance);
			} else if (step_cast instanceof rtscTrace.Steps.Rtsc_Transition_CanFire) {
				rtscTrace.Steps.Rtsc_Transition_CanFire rtsc_Transition_CanFireInstance = (rtscTrace.Steps.Rtsc_Transition_CanFire) step_cast;
				traceRoot.getRtsc_Transition_CanFire_Sequence().add(rtsc_Transition_CanFireInstance);
			} else if (step_cast instanceof rtscTrace.Steps.Rtsc_Transition_Fire) {
				rtscTrace.Steps.Rtsc_Transition_Fire rtsc_Transition_FireInstance = (rtscTrace.Steps.Rtsc_Transition_Fire) step_cast;
				traceRoot.getRtsc_Transition_Fire_Sequence().add(rtsc_Transition_FireInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(rtscTrace.Steps.SpecificStep currentStep, rtscTrace.States.State startingState,
			rtscTrace.States.State endingState) {

		rtscTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof rtscTrace.Steps.Rtsc_Realtimestatechart_Step) {
			implicitStep = rtscTrace.Steps.StepsFactory.eINSTANCE.createRtsc_Realtimestatechart_Step_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<rtscTrace.Steps.SpecificStep>) currentStep).getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		rtscTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = rtscTrace.RtscTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		fr.inria.diverse.trace.commons.model.trace.SequentialStep<rtscTrace.Steps.SpecificStep> rootStep = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createSequentialStep();
		traceRoot.setRootStep(rootStep);

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		return traceRoot;
	}

	@Override
	public void save() {
		try {
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(URI uri) {
		try {
			traceResource.setURI(uri);
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	private Set<Resource> getAllExecutedModelResources() {
		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		allResources.removeIf(r -> r == null);
		return allResources;
	}

	@Override
	public boolean isPartialTraceConstructor() {
		return false;
	}
}
