package org.muml.xsrtsc.xsrtsc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart;
import org.muml.xsrtsc.xsrtsc.rtsc.State;
import org.muml.xsrtsc.xsrtsc.rtsc.Transition;
import org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspect;
import org.muml.xsrtsc.xsrtsc.aspects.TransitionAspectTransitionAspectProperties;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  @Step
  public static void fire(final Transition _self) {
	final org.muml.xsrtsc.xsrtsc.aspects.TransitionAspectTransitionAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.TransitionAspectTransitionAspectContext
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
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    String _name = _self.getName();
    String _plus = ("Firing " + _name);
    String _plus_1 = (_plus + " and entering ");
    State _target = _self.getTarget();
    String _name_1 = _target.getName();
    String _plus_2 = (_plus_1 + _name_1);
    InputOutput.<String>println(_plus_2);
    State _source = _self.getSource();
    final Realtimestatechart rtsc = _source.getOwningRTSC();
    State _target_1 = _self.getTarget();
    RealtimestatechartAspect.currentState(rtsc, _target_1);
    String _producedString = RealtimestatechartAspect.producedString(rtsc);
    String _output = _self.getOutput();
    String _plus_3 = (_producedString + _output);
    RealtimestatechartAspect.producedString(rtsc, _plus_3);
    String _consummedString = RealtimestatechartAspect.consummedString(rtsc);
    String _input = _self.getInput();
    String _plus_4 = (_consummedString + _input);
    RealtimestatechartAspect.consummedString(rtsc, _plus_4);
    String _unprocessedString = RealtimestatechartAspect.unprocessedString(rtsc);
    String _input_1 = _self.getInput();
    int _length = _input_1.length();
    String _substring = _unprocessedString.substring(_length);
    RealtimestatechartAspect.unprocessedString(rtsc, _substring);
  }
}
