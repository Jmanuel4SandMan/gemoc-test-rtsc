package org.muml.xsrtsc.xsrtsc.aspects;

import java.util.Map;
import org.muml.xsrtsc.xsrtsc.rtsc.BehavioralElement;
import org.muml.xsrtsc.xsrtsc.aspects.BehavioralElementAspectBehavioralElementAspectProperties;

@SuppressWarnings("all")
public class BehavioralElementAspectBehavioralElementAspectContext {
  public final static BehavioralElementAspectBehavioralElementAspectContext INSTANCE = new BehavioralElementAspectBehavioralElementAspectContext();
  
  public static BehavioralElementAspectBehavioralElementAspectProperties getSelf(final BehavioralElement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.muml.xsrtsc.xsrtsc.aspects.BehavioralElementAspectBehavioralElementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BehavioralElement, BehavioralElementAspectBehavioralElementAspectProperties> map = new java.util.WeakHashMap<org.muml.xsrtsc.xsrtsc.rtsc.BehavioralElement, org.muml.xsrtsc.xsrtsc.aspects.BehavioralElementAspectBehavioralElementAspectProperties>();
  
  public Map<BehavioralElement, BehavioralElementAspectBehavioralElementAspectProperties> getMap() {
    return map;
  }
}
