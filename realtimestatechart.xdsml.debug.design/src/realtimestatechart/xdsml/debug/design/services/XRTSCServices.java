package realtimestatechart.xdsml.debug.design.services;

import org.eclipse.emf.ecore.EObject;

import realtimestatechart.xdsml.xrtsc.realtimestatechart.State;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Vertex;

/**
 * The services class used by VSM.
 */
public class XRTSCServices {
	
	public boolean isActive(EObject o){
		if (o instanceof Vertex){
			return ((Vertex) o).isActive();
		}
		return false;
	}
	
	public boolean isInitial(EObject o){
		if (o instanceof State){
			return ((State) o).isInitial();
		}
		return false;
	}
	
	public boolean canFire(EObject o){
		if (o instanceof Transition){
			return ((Transition) o).canFire();
		}
		return false;
	}
}
