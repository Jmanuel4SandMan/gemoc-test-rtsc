package realtimestatechart.xdsml.xrtsc.aspects;

import java.util.Map;

import realtimestatechart.xdsml.xrtsc.realtimestatechart.BehavioralElement;

@SuppressWarnings("all")
public class BehavioralElementAspectBehavioralElementAspectContext {
  public final static BehavioralElementAspectBehavioralElementAspectContext INSTANCE = new BehavioralElementAspectBehavioralElementAspectContext();
  
  public static BehavioralElementAspectBehavioralElementAspectProperties getSelf(final BehavioralElement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new realtimestatechart.xdsml.xrtsc.aspects.BehavioralElementAspectBehavioralElementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BehavioralElement, BehavioralElementAspectBehavioralElementAspectProperties> map = new java.util.WeakHashMap<realtimestatechart.xdsml.xrtsc.realtimestatechart.BehavioralElement, realtimestatechart.xdsml.xrtsc.aspects.BehavioralElementAspectBehavioralElementAspectProperties>();
  
  public Map<BehavioralElement, BehavioralElementAspectBehavioralElementAspectProperties> getMap() {
    return map;
  }
}
