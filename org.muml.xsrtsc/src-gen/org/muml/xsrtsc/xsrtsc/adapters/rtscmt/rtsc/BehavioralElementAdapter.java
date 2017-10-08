package org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.muml.rtsc.Behavior;
import org.muml.xsrtsc.xsrtsc.adapters.rtscmt.RTSCMTAdaptersFactory;
import org.muml.xsrtsc.xsrtsc.rtsc.BehavioralElement;

@SuppressWarnings("all")
public class BehavioralElementAdapter extends EObjectAdapter<BehavioralElement> implements org.muml.rtsc.BehavioralElement {
  private RTSCMTAdaptersFactory adaptersFactory;
  
  public BehavioralElementAdapter() {
    super(org.muml.xsrtsc.xsrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance());
    adaptersFactory = org.muml.xsrtsc.xsrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Behavior getBehavior() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getBehavior(), eResource);
  }
  
  @Override
  public void setBehavior(final Behavior o) {
    if (o != null)
    	adaptee.setBehavior(((org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.BehaviorAdapter) o).getAdaptee());
    else adaptee.setBehavior(null);
  }
  
  @Override
  public EClass eClass() {
    return org.muml.rtsc.RtscPackage.eINSTANCE.getBehavioralElement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.muml.rtsc.RtscPackage.BEHAVIORAL_ELEMENT__BEHAVIOR:
    		return getBehavior();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.muml.rtsc.RtscPackage.BEHAVIORAL_ELEMENT__BEHAVIOR:
    		return getBehavior() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.muml.rtsc.RtscPackage.BEHAVIORAL_ELEMENT__BEHAVIOR:
    		setBehavior(
    		(org.muml.rtsc.Behavior)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
