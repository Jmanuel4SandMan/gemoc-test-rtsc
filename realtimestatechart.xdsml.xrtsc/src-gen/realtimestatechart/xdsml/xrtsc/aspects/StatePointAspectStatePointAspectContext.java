package realtimestatechart.xdsml.xrtsc.aspects;

import java.util.Map;

import realtimestatechart.xdsml.xrtsc.realtimestatechart.StatePoint;

@SuppressWarnings("all")
public class StatePointAspectStatePointAspectContext {
  public final static StatePointAspectStatePointAspectContext INSTANCE = new StatePointAspectStatePointAspectContext();
  
  public static StatePointAspectStatePointAspectProperties getSelf(final StatePoint _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new realtimestatechart.xdsml.xrtsc.aspects.StatePointAspectStatePointAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StatePoint, StatePointAspectStatePointAspectProperties> map = new java.util.WeakHashMap<realtimestatechart.xdsml.xrtsc.realtimestatechart.StatePoint, realtimestatechart.xdsml.xrtsc.aspects.StatePointAspectStatePointAspectProperties>();
  
  public Map<StatePoint, StatePointAspectStatePointAspectProperties> getMap() {
    return map;
  }
}
