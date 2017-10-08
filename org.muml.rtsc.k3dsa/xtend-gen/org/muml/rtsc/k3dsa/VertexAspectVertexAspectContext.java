package org.muml.rtsc.k3dsa;

import java.util.Map;
import org.muml.rtsc.Vertex;
import org.muml.rtsc.k3dsa.VertexAspectVertexAspectProperties;

@SuppressWarnings("all")
public class VertexAspectVertexAspectContext {
  public final static VertexAspectVertexAspectContext INSTANCE = new VertexAspectVertexAspectContext();
  
  public static VertexAspectVertexAspectProperties getSelf(final Vertex _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.muml.rtsc.k3dsa.VertexAspectVertexAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Vertex, VertexAspectVertexAspectProperties> map = new java.util.WeakHashMap<org.muml.rtsc.Vertex, org.muml.rtsc.k3dsa.VertexAspectVertexAspectProperties>();
  
  public Map<Vertex, VertexAspectVertexAspectProperties> getMap() {
    return map;
  }
}
