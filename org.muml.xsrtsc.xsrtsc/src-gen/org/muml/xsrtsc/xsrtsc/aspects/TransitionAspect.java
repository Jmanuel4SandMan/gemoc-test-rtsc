package org.muml.xsrtsc.xsrtsc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.muml.xsrtsc.xsrtsc.rtsc.NamedElement;
import org.muml.xsrtsc.xsrtsc.rtsc.State;
import org.muml.xsrtsc.xsrtsc.rtsc.Transition;
import org.muml.xsrtsc.xsrtsc.rtsc.Vertex;
import org.muml.xsrtsc.xsrtsc.aspects.TransitionAspectTransitionAspectProperties;
import org.muml.xsrtsc.xsrtsc.aspects.VertexAspect;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  @Step
  public static boolean canFire(final Transition _self) {
	final org.muml.xsrtsc.xsrtsc.aspects.TransitionAspectTransitionAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	Object result = null;
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			addToResult(_privk3_canFire(_self_, _self));
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Transition", "canFire");
	} else {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager(null);
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	result = command.getResult();
	;
	;
	return (boolean) result;
}
  
  @Step
  public static Vertex fire(final Transition _self) {
	final org.muml.xsrtsc.xsrtsc.aspects.TransitionAspectTransitionAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	Object result = null;
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			addToResult(_privk3_fire(_self_, _self));
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Transition", "fire");
	} else {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager(null);
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	result = command.getResult();
	;
	;
	return (org.muml.xsrtsc.xsrtsc.rtsc.Vertex) result;
}
  
  public static int hitCount(final Transition _self) {
	final org.muml.xsrtsc.xsrtsc.aspects.TransitionAspectTransitionAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_hitCount(_self_, _self);
	;
	return (int) result;
}
  
  public static void hitCount(final Transition _self, final int hitCount) {
	final org.muml.xsrtsc.xsrtsc.aspects.TransitionAspectTransitionAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	_privk3_hitCount(_self_, _self, hitCount);
	;
}
  
  protected static boolean _privk3_canFire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    State _source = _self.getSource();
    return VertexAspect.active(_source);
  }
  
  protected static Vertex _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    State _source = _self.getSource();
    VertexAspect.active(_source, false);
    State _target = _self.getTarget();
    VertexAspect.active(_target, true);
    int _hitCount = TransitionAspect.hitCount(_self);
    int _plus = (_hitCount + 1);
    TransitionAspect.hitCount(_self, _plus);
    State _source_1 = _self.getSource();
    String _name = ((NamedElement) _source_1).getName();
    String _plus_1 = ("Firing " + _name);
    String _plus_2 = (_plus_1 + " to ");
    State _target_1 = _self.getTarget();
    String _name_1 = ((NamedElement) _target_1).getName();
    String _plus_3 = (_plus_2 + _name_1);
    InputOutput.<String>println(_plus_3);
    return _self.getTarget();
  }
  
  protected static int _privk3_hitCount(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getHitCount") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.hitCount;
  }
  
  protected static void _privk3_hitCount(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final int hitCount) {
    _self_.hitCount = hitCount; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setHitCount")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, hitCount);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
