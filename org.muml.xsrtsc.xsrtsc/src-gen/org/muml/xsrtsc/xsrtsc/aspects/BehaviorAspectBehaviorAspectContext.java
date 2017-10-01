package org.muml.xsrtsc.xsrtsc.aspects;

import java.util.Map;
import org.muml.xsrtsc.xsrtsc.rtsc.Behavior;
import org.muml.xsrtsc.xsrtsc.aspects.BehaviorAspectBehaviorAspectProperties;

@SuppressWarnings("all")
public class BehaviorAspectBehaviorAspectContext {
  public final static BehaviorAspectBehaviorAspectContext INSTANCE = new BehaviorAspectBehaviorAspectContext();
  
  public static BehaviorAspectBehaviorAspectProperties getSelf(final Behavior _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.muml.xsrtsc.xsrtsc.aspects.BehaviorAspectBehaviorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Behavior, BehaviorAspectBehaviorAspectProperties> map = new java.util.WeakHashMap<org.muml.xsrtsc.xsrtsc.rtsc.Behavior, org.muml.xsrtsc.xsrtsc.aspects.BehaviorAspectBehaviorAspectProperties>();
  
  public Map<Behavior, BehaviorAspectBehaviorAspectProperties> getMap() {
    return map;
  }
}
