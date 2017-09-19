package org.muml.xsrtsc.xsrtsc.aspects;

import java.util.Map;
import org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart;
import org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties;

@SuppressWarnings("all")
public class RealtimestatechartAspectRealtimestatechartAspectContext {
  public final static RealtimestatechartAspectRealtimestatechartAspectContext INSTANCE = new RealtimestatechartAspectRealtimestatechartAspectContext();
  
  public static RealtimestatechartAspectRealtimestatechartAspectProperties getSelf(final Realtimestatechart _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Realtimestatechart, RealtimestatechartAspectRealtimestatechartAspectProperties> map = new java.util.WeakHashMap<org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart, org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspectRealtimestatechartAspectProperties>();
  
  public Map<Realtimestatechart, RealtimestatechartAspectRealtimestatechartAspectProperties> getMap() {
    return map;
  }
}
