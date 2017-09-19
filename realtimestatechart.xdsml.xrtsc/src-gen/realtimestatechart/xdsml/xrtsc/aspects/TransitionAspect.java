package realtimestatechart.xdsml.xrtsc.aspects;

import org.eclipse.xtext.xbase.lib.InputOutput;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.NamedElement;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Vertex;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  @Step
  public static boolean canFire(final Transition _self) {
	final realtimestatechart.xdsml.xrtsc.aspects.TransitionAspectTransitionAspectProperties _self_ = realtimestatechart.xdsml.xrtsc.aspects.TransitionAspectTransitionAspectContext
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
  public static void fire(final Transition _self) {
	final realtimestatechart.xdsml.xrtsc.aspects.TransitionAspectTransitionAspectProperties _self_ = realtimestatechart.xdsml.xrtsc.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_fire(_self_, _self);
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
	;
	;
}
  
  public static int hitCount(final Transition _self) {
	final realtimestatechart.xdsml.xrtsc.aspects.TransitionAspectTransitionAspectProperties _self_ = realtimestatechart.xdsml.xrtsc.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_hitCount(_self_, _self);
	;
	return (int) result;
}
  
  public static void hitCount(final Transition _self, final int hitCount) {
	final realtimestatechart.xdsml.xrtsc.aspects.TransitionAspectTransitionAspectProperties _self_ = realtimestatechart.xdsml.xrtsc.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	_privk3_hitCount(_self_, _self, hitCount);
	;
}
  
  protected static boolean _privk3_canFire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    Vertex _source = _self.getSource();
    return VertexAspect.active(_source);
  }
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    Vertex _source = _self.getSource();
    VertexAspect.active(_source, false);
    Vertex _target = _self.getTarget();
    VertexAspect.active(_target, true);
    int _hitCount = TransitionAspect.hitCount(_self);
    int _plus = (_hitCount + 1);
    TransitionAspect.hitCount(_self, _plus);
    Vertex _source_1 = _self.getSource();
    String _name = ((NamedElement) _source_1).getName();
    String _plus_1 = ("Firing " + _name);
    String _plus_2 = (_plus_1 + " to ");
    Vertex _target_1 = _self.getTarget();
    String _name_1 = ((NamedElement) _target_1).getName();
    String _plus_3 = (_plus_2 + _name_1);
    InputOutput.<String>println(_plus_3);
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
