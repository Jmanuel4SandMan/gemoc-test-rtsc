package org.muml.xsrtsc.xsrtsc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.muml.xsrtsc.xsrtsc.rtsc.State;
import org.muml.xsrtsc.xsrtsc.aspects.StateAspectStateAspectProperties;
import org.muml.xsrtsc.xsrtsc.aspects.VertexAspect;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect extends VertexAspect {
  /**
   * BE CAREFUL :
   * 
   * This class has more than one superclass
   * please specify which parent you want with the 'super' expected calling
   */
  public static void entry(final State _self) {
	final org.muml.xsrtsc.xsrtsc.aspects.StateAspectStateAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	_privk3_entry(_self_, _self);
	;
}
  
  public static void exit(final State _self) {
	final org.muml.xsrtsc.xsrtsc.aspects.StateAspectStateAspectProperties _self_ = org.muml.xsrtsc.xsrtsc.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	_privk3_exit(_self_, _self);
	;
}
  
  protected static void _privk3_entry(final StateAspectStateAspectProperties _self_, final State _self) {
    VertexAspect.active(_self, true);
  }
  
  protected static void _privk3_exit(final StateAspectStateAspectProperties _self_, final State _self) {
    VertexAspect.active(_self, false);
  }
}
