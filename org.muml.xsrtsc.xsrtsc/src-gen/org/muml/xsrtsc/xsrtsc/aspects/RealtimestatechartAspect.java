package org.muml.xsrtsc.xsrtsc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart;
import org.muml.xsrtsc.xsrtsc.rtsc.State;
import org.muml.xsrtsc.xsrtsc.aspects.BehaviorAspect;
import org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties;
import org.muml.xsrtsc.xsrtsc.aspects.VertexAspect;

@Aspect(className = Realtimestatechart.class)
@SuppressWarnings("all")
public class RealtimestatechartAspect extends BehaviorAspect {
  @Main
  public static void main(final Realtimestatechart _self) {
	final org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  @Step
  @InitializeModel
  public static void initialize(final Realtimestatechart _self, final EList<String> args) {
    final org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext.getSelf(_self);
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
  public static void initRTSC(final Realtimestatechart _self) {
	final org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_initRTSC(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Realtimestatechart", "initRTSC");
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
  
  public static void step(final Realtimestatechart _self) {
	final org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext
			.getSelf(_self);
	_privk3_step(_self_, _self);
	;
}
  
  public static int rounds(final Realtimestatechart _self) {
	final org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_rounds(_self_, _self);
	;
	return (int) result;
}
  
  public static void rounds(final Realtimestatechart _self, final int rounds) {
	final org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext
			.getSelf(_self);
	_privk3_rounds(_self_, _self, rounds);
	;
}
  
  protected static void _privk3_main(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self) {
    while (true) {
      RealtimestatechartAspect.step(_self);
    }
  }
  
  protected static void _privk3_initialize(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self, final EList<String> args) {
    RealtimestatechartAspect.initRTSC(_self);
  }
  
  protected static void _privk3_initRTSC(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self) {
    String _name = _self.getName();
    String _plus = ("Initializing " + _name);
    InputOutput.<String>println(_plus);
    State _initialState = _self.getInitialState();
    VertexAspect.active(_initialState, true);
  }
  
  protected static void _privk3_step(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self) {
    String _name = _self.getName();
    String _plus = ("Stepping " + _name);
    InputOutput.<String>println(_plus);
    int _rounds = RealtimestatechartAspect.rounds(_self);
    int _plus_1 = (_rounds + 1);
    RealtimestatechartAspect.rounds(_self, _plus_1);
  }
  
  protected static int _privk3_rounds(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getRounds") &&
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
    return _self_.rounds;
  }
  
  protected static void _privk3_rounds(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self, final int rounds) {
    _self_.rounds = rounds; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setRounds")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, rounds);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
