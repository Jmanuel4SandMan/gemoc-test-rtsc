package realtimestatechart.xdsml.xrtsc.aspects;

import java.util.Map;

import realtimestatechart.xdsml.xrtsc.realtimestatechart.Realtimestatechart;

@SuppressWarnings("all")
public class RealtimestatechartAspectRealtimestatechartAspectContext {
  public final static RealtimestatechartAspectRealtimestatechartAspectContext INSTANCE = new RealtimestatechartAspectRealtimestatechartAspectContext();
  
  public static RealtimestatechartAspectRealtimestatechartAspectProperties getSelf(final Realtimestatechart _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new realtimestatechart.xdsml.xrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Realtimestatechart, RealtimestatechartAspectRealtimestatechartAspectProperties> map = new java.util.WeakHashMap<realtimestatechart.xdsml.xrtsc.realtimestatechart.Realtimestatechart, realtimestatechart.xdsml.xrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties>();
  
  public Map<Realtimestatechart, RealtimestatechartAspectRealtimestatechartAspectProperties> getMap() {
    return map;
  }
}
