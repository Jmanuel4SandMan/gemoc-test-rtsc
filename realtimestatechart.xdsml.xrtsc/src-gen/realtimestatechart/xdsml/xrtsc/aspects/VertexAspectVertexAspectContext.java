package realtimestatechart.xdsml.xrtsc.aspects;

import java.util.Map;

import realtimestatechart.xdsml.xrtsc.realtimestatechart.Vertex;

@SuppressWarnings("all")
public class VertexAspectVertexAspectContext {
  public final static VertexAspectVertexAspectContext INSTANCE = new VertexAspectVertexAspectContext();
  
  public static VertexAspectVertexAspectProperties getSelf(final Vertex _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new realtimestatechart.xdsml.xrtsc.aspects.VertexAspectVertexAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Vertex, VertexAspectVertexAspectProperties> map = new java.util.WeakHashMap<realtimestatechart.xdsml.xrtsc.realtimestatechart.Vertex, realtimestatechart.xdsml.xrtsc.aspects.VertexAspectVertexAspectProperties>();
  
  public Map<Vertex, VertexAspectVertexAspectProperties> getMap() {
    return map;
  }
}
