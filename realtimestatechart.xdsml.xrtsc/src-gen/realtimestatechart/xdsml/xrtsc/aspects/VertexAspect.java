package realtimestatechart.xdsml.xrtsc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Vertex;

@Aspect(className = Vertex.class)
@SuppressWarnings("all")
public abstract class VertexAspect {
  public static boolean active(final Vertex _self) {
	final realtimestatechart.xdsml.xrtsc.aspects.VertexAspectVertexAspectProperties _self_ = realtimestatechart.xdsml.xrtsc.aspects.VertexAspectVertexAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_active(_self_, _self);
	;
	return (boolean) result;
}
  
  public static void active(final Vertex _self, final boolean active) {
	final realtimestatechart.xdsml.xrtsc.aspects.VertexAspectVertexAspectProperties _self_ = realtimestatechart.xdsml.xrtsc.aspects.VertexAspectVertexAspectContext
			.getSelf(_self);
	_privk3_active(_self_, _self, active);
	;
}
  
  protected static boolean _privk3_active(final VertexAspectVertexAspectProperties _self_, final Vertex _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getActive") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.active;
  }
  
  protected static void _privk3_active(final VertexAspectVertexAspectProperties _self_, final Vertex _self, final boolean active) {
    _self_.active = active; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setActive")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, active);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
