package realtimestatechart.xdsml.xrtsc.aspects;

import java.util.Map;

import realtimestatechart.xdsml.xrtsc.realtimestatechart.Behavior;

@SuppressWarnings("all")
public class BehaviorAspectBehaviorAspectContext {
  public final static BehaviorAspectBehaviorAspectContext INSTANCE = new BehaviorAspectBehaviorAspectContext();
  
  public static BehaviorAspectBehaviorAspectProperties getSelf(final Behavior _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new realtimestatechart.xdsml.xrtsc.aspects.BehaviorAspectBehaviorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Behavior, BehaviorAspectBehaviorAspectProperties> map = new java.util.WeakHashMap<realtimestatechart.xdsml.xrtsc.realtimestatechart.Behavior, realtimestatechart.xdsml.xrtsc.aspects.BehaviorAspectBehaviorAspectProperties>();
  
  public Map<Behavior, BehaviorAspectBehaviorAspectProperties> getMap() {
    return map;
  }
}
