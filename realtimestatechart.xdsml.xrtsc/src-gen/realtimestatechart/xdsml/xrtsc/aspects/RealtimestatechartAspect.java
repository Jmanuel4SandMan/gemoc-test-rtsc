package realtimestatechart.xdsml.xrtsc.aspects;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Realtimestatechart;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.State;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition;

@Aspect(className = Realtimestatechart.class)
@SuppressWarnings("all")
public class RealtimestatechartAspect extends BehaviorAspect {
  @Main
  public static void main(final Realtimestatechart _self) {
	final realtimestatechart.xdsml.xrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = realtimestatechart.xdsml.xrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  @Step
  @InitializeModel
  public static void initialize(final Realtimestatechart _self, final EList<String> args) {
    final realtimestatechart.xdsml.xrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = realtimestatechart.xdsml.xrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_initialize(_self_, _self,args);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Realtimestatechart","initialize");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  @Step
  public static void step(final Realtimestatechart _self) {
	final realtimestatechart.xdsml.xrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = realtimestatechart.xdsml.xrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_step(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Realtimestatechart", "step");
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
  
  protected static void _privk3_main(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self) {
    while (true) {
      RealtimestatechartAspect.step(_self);
    }
  }
  
  protected static void _privk3_initialize(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self, final EList<String> args) {
    String _name = _self.getName();
    String _plus = ("Initializing " + _name);
    InputOutput.<String>println(_plus);
    EList<State> _states = _self.getStates();
    final Function1<State, Boolean> _function = (State it) -> {
      return Boolean.valueOf(it.isInitial());
    };
    State _findFirst = IterableExtensions.<State>findFirst(_states, _function);
    VertexAspect.active(_findFirst, true);
  }
  
  protected static void _privk3_step(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self) {
    String _name = _self.getName();
    String _plus = ("Stepping " + _name);
    InputOutput.<String>println(_plus);
    EList<Transition> _transitions = _self.getTransitions();
    final Function1<Transition, Boolean> _function = (Transition it) -> {
      return Boolean.valueOf(TransitionAspect.canFire(it));
    };
    Transition _findFirst = IterableExtensions.<Transition>findFirst(_transitions, _function);
    if (_findFirst!=null) {
      TransitionAspect.fire(_findFirst);
    }
  }
}
