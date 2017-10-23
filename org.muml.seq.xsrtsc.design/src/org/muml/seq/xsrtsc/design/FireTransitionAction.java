package org.muml.seq.xsrtsc.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.muml.seq.xsrtsc.xsrtsc.aspects.TransitionAspect;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition;

public class FireTransitionAction implements IExternalJavaAction {

	public FireTransitionAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		Transition t = (Transition) arg1.get("transition");
		EList<Transition> activeTransitions = t.getStatechart().getActiveTransitions();
		activeTransitions.removeIf(t0 -> !t0.equals(t));
		System.out.println("Selected " + t.getName());
	}

}
