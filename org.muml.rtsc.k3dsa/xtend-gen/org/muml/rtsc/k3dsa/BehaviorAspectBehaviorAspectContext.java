package org.muml.rtsc.k3dsa;

import java.util.Map;
import org.muml.rtsc.Behavior;
import org.muml.rtsc.k3dsa.BehaviorAspectBehaviorAspectProperties;

@SuppressWarnings("all")
public class BehaviorAspectBehaviorAspectContext {
  public final static BehaviorAspectBehaviorAspectContext INSTANCE = new BehaviorAspectBehaviorAspectContext();
  
  public static BehaviorAspectBehaviorAspectProperties getSelf(final Behavior _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.muml.rtsc.k3dsa.BehaviorAspectBehaviorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Behavior, BehaviorAspectBehaviorAspectProperties> map = new java.util.WeakHashMap<org.muml.rtsc.Behavior, org.muml.rtsc.k3dsa.BehaviorAspectBehaviorAspectProperties>();
  
  public Map<Behavior, BehaviorAspectBehaviorAspectProperties> getMap() {
    return map;
  }
}
