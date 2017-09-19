package org.muml.xsrtsc.xsrtsc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart;
import org.muml.xsrtsc.xsrtsc.rtsc.State;
import org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties;
import org.muml.xsrtsc.xsrtsc.aspects.StateAspect;

@Aspect(className = Realtimestatechart.class)
@SuppressWarnings("all")
public class RealtimestatechartAspect {
  @Main
  public static void main(final Realtimestatechart _self) {
	final org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  @Step
  @InitializeModel
  public static void initializeModel(final Realtimestatechart _self, final EList<String> args) {
    final org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_initializeModel(_self_, _self,args);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Realtimestatechart","initializeModel");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  public static State currentState(final Realtimestatechart _self) {
	final org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentState(_self_, _self);
	;
	return (org.muml.xsrtsc.xsrtsc.rtsc.State) result;
}
  
  public static void currentState(final Realtimestatechart _self, final State currentState) {
	final org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext
			.getSelf(_self);
	_privk3_currentState(_self_, _self, currentState);
	;
}
  
  public static String unprocessedString(final Realtimestatechart _self) {
	final org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_unprocessedString(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static void unprocessedString(final Realtimestatechart _self, final String unprocessedString) {
	final org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext
			.getSelf(_self);
	_privk3_unprocessedString(_self_, _self, unprocessedString);
	;
}
  
  public static String consummedString(final Realtimestatechart _self) {
	final org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_consummedString(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static void consummedString(final Realtimestatechart _self, final String consummedString) {
	final org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext
			.getSelf(_self);
	_privk3_consummedString(_self_, _self, consummedString);
	;
}
  
  public static String producedString(final Realtimestatechart _self) {
	final org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_producedString(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static void producedString(final Realtimestatechart _self, final String producedString) {
	final org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectContext
			.getSelf(_self);
	_privk3_producedString(_self_, _self, producedString);
	;
}
  
  protected static void _privk3_main(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self) {
    try {
      while ((!RealtimestatechartAspect.unprocessedString(_self).isEmpty())) {
        State _currentState = RealtimestatechartAspect.currentState(_self);
        String _unprocessedString = RealtimestatechartAspect.unprocessedString(_self);
        StateAspect.step(_currentState, _unprocessedString);
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception nt = (Exception)_t;
        String _message = nt.getMessage();
        String _plus = ("Stopped due to " + _message);
        InputOutput.<String>println(_plus);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    String _unprocessedString = RealtimestatechartAspect.unprocessedString(_self);
    String _plus_1 = ("unprocessed string: " + _unprocessedString);
    InputOutput.<String>println(_plus_1);
    String _consummedString = RealtimestatechartAspect.consummedString(_self);
    String _plus_2 = ("processed string: " + _consummedString);
    InputOutput.<String>println(_plus_2);
    String _producedString = RealtimestatechartAspect.producedString(_self);
    String _plus_3 = ("produced string: " + _producedString);
    InputOutput.<String>println(_plus_3);
  }
  
  protected static void _privk3_initializeModel(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self, final EList<String> args) {
    State _initialState = _self.getInitialState();
    RealtimestatechartAspect.currentState(_self, _initialState);
    String _get = args.get(0);
    RealtimestatechartAspect.unprocessedString(_self, _get);
    RealtimestatechartAspect.consummedString(_self, "");
    RealtimestatechartAspect.producedString(_self, "");
  }
  
  protected static State _privk3_currentState(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.muml.xsrtsc.xsrtsc.rtsc.State) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentState;
  }
  
  protected static void _privk3_currentState(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self, final State currentState) {
    _self_.currentState = currentState; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentState);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_unprocessedString(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getUnprocessedString") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.unprocessedString;
  }
  
  protected static void _privk3_unprocessedString(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self, final String unprocessedString) {
    _self_.unprocessedString = unprocessedString; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setUnprocessedString")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, unprocessedString);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_consummedString(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getConsummedString") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.consummedString;
  }
  
  protected static void _privk3_consummedString(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self, final String consummedString) {
    _self_.consummedString = consummedString; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setConsummedString")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, consummedString);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_producedString(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getProducedString") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.producedString;
  }
  
  protected static void _privk3_producedString(final RealtimestatechartAspectRealtimestatechartAspectProperties _self_, final Realtimestatechart _self, final String producedString) {
    _self_.producedString = producedString; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setProducedString")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, producedString);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
