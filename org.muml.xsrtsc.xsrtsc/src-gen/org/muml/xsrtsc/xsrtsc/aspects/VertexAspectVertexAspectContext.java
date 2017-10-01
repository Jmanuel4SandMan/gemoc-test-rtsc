package org.muml.xsrtsc.xsrtsc.aspects;

import java.util.Map;
import org.muml.xsrtsc.xsrtsc.rtsc.Vertex;
import org.muml.xsrtsc.xsrtsc.aspects.VertexAspectVertexAspectProperties;

@SuppressWarnings("all")
public class VertexAspectVertexAspectContext {
  public final static VertexAspectVertexAspectContext INSTANCE = new VertexAspectVertexAspectContext();
  
  public static VertexAspectVertexAspectProperties getSelf(final Vertex _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.muml.xsrtsc.xsrtsc.aspects.VertexAspectVertexAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Vertex, VertexAspectVertexAspectProperties> map = new java.util.WeakHashMap<org.muml.xsrtsc.xsrtsc.rtsc.Vertex, org.muml.xsrtsc.xsrtsc.aspects.VertexAspectVertexAspectProperties>();
  
  public Map<Vertex, VertexAspectVertexAspectProperties> getMap() {
    return map;
  }
}
