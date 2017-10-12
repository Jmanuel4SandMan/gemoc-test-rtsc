package org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory;
import org.muml.xsrtsc.xsrtsc.rtsc.BehavioralElement;
import org.muml.xsrtsc.xsrtscmt.rtsc.Behavior;

@SuppressWarnings("all")
public class BehavioralElementAdapter extends EObjectAdapter<BehavioralElement> implements org.muml.xsrtsc.xsrtscmt.rtsc.BehavioralElement {
  private XSRTSCMTAdaptersFactory adaptersFactory;
  
  public BehavioralElementAdapter() {
    super(org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory.getInstance());
    adaptersFactory = org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Behavior getBehavior() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getBehavior(), eResource);
  }
  
  @Override
  public void setBehavior(final Behavior o) {
    if (o != null)
    	adaptee.setBehavior(((org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.BehaviorAdapter) o).getAdaptee());
    else adaptee.setBehavior(null);
  }
  
  @Override
  public EClass eClass() {
    return org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.eINSTANCE.getBehavioralElement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.BEHAVIORAL_ELEMENT__BEHAVIOR:
    		return getBehavior();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.BEHAVIORAL_ELEMENT__BEHAVIOR:
    		return getBehavior() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.BEHAVIORAL_ELEMENT__BEHAVIOR:
    		setBehavior(
    		(org.muml.xsrtsc.xsrtscmt.rtsc.Behavior)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
