package org.muml.rtsc.k3dsa;

import java.util.Map;
import org.muml.rtsc.BehavioralElement;
import org.muml.rtsc.k3dsa.BehavioralElementAspectBehavioralElementAspectProperties;

@SuppressWarnings("all")
public class BehavioralElementAspectBehavioralElementAspectContext {
  public final static BehavioralElementAspectBehavioralElementAspectContext INSTANCE = new BehavioralElementAspectBehavioralElementAspectContext();
  
  public static BehavioralElementAspectBehavioralElementAspectProperties getSelf(final BehavioralElement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.muml.rtsc.k3dsa.BehavioralElementAspectBehavioralElementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BehavioralElement, BehavioralElementAspectBehavioralElementAspectProperties> map = new java.util.WeakHashMap<org.muml.rtsc.BehavioralElement, org.muml.rtsc.k3dsa.BehavioralElementAspectBehavioralElementAspectProperties>();
  
  public Map<BehavioralElement, BehavioralElementAspectBehavioralElementAspectProperties> getMap() {
    return map;
  }
}
