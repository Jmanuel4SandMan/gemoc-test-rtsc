package org.muml.xsrtsc.trace.tracemanager;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.BatchModelChangeListener;
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange;
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NewObjectModelChange;

import fr.inria.diverse.trace.gemoc.api.ITraceListener;
import fr.inria.diverse.trace.gemoc.api.ITraceNotifier;

public class RtscTraceNotifier implements ITraceNotifier {

	private BatchModelChangeListener traceListener;

	private final List<ITraceListener> listeners = new ArrayList<>();

	public RtscTraceNotifier(BatchModelChangeListener traceListener) {
		this.traceListener = traceListener;
	}

	@Override
	public void notifyListeners() {
		for (ITraceListener listener : listeners) {
			notifyListener(listener);
		}
	}

	@Override
	public void notifyListener(ITraceListener listener) {
		final List<ModelChange> changes = traceListener.getChanges(listener);
		if (!changes.isEmpty()) {
			final List<EObject> startedSteps = new ArrayList<>();
			final List<EObject> endedSteps = new ArrayList<>();
			final List<EObject> newStates = new ArrayList<>();
			final List<EObject> newValues = new ArrayList<>();
			final List<List<? extends EObject>> newDimensions = new ArrayList<>();
			changes.forEach(c -> {
				if (c instanceof NewObjectModelChange) {
					final EObject o = c.getChangedObject();
					if (o instanceof rtscTrace.States.Value) {
						newValues.add((rtscTrace.States.Value) o);
					} else if (o instanceof rtscTrace.Steps.SpecificStep) {
						startedSteps.add((rtscTrace.Steps.SpecificStep) o);
					} else if (o instanceof rtscTrace.States.State) {
						final rtscTrace.States.State newState = (rtscTrace.States.State) o;
						newStates.add(newState);
						endedSteps.addAll(newState.getEndedSteps());
					} else if (o instanceof rtscTrace.States.rtsc.TracedRealtimestatechart) {
						newDimensions.add(((rtscTrace.States.rtsc.TracedRealtimestatechart) o).getRoundsSequence());
					} else if (o instanceof rtscTrace.States.rtsc.TracedState) {
						newDimensions.add(((rtscTrace.States.rtsc.TracedState) o).getActiveSequence());
					} else if (o instanceof rtscTrace.States.rtsc.TracedTransition) {
						newDimensions.add(((rtscTrace.States.rtsc.TracedTransition) o).getHitCountSequence());
					} else if (o instanceof rtscTrace.States.rtsc.TracedVertex) {
						newDimensions.add(((rtscTrace.States.rtsc.TracedVertex) o).getActiveSequence());
					}
				}
			});
			listener.valuesAdded(newValues);
			listener.dimensionsAdded(newDimensions);
			listener.statesAdded(newStates);
			listener.stepsStarted(startedSteps);
			listener.stepsEnded(endedSteps);
		}
	}

	@Override
	public void addListener(ITraceListener listener) {
		listeners.add(listener);
		traceListener.registerObserver(listener);
	}

	@Override
	public void removeListener(ITraceListener listener) {
		listeners.remove(listener);
		traceListener.removeObserver(listener);
	}
}
