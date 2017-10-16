package org.muml.seq.xsrtsc.design.services;

import org.eclipse.emf.ecore.EObject;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.State;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition;

/** RTSC services.
 * 
* @author <a href="mailto:didier.vojtisek@inria.fr">Didier Vojtisek</a>
 * 
 */
public class XRTSCServices {

	public String getTypeString(EObject o) {
		return o.getClass().toString();
	}
	
	
	
	public boolean isCurrentState(EObject o){
		if(o instanceof State){
			return ((State)o).isActive();
		} else {
			return false;
		}
	}

}
