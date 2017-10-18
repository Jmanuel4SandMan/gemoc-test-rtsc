package org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory;
import org.muml.xsrtsc.xsrtsc.rtsc.Behavior;
import org.muml.xsrtsc.xsrtscmt.rtsc.BehavioralElement;

@SuppressWarnings("all")
public class BehaviorAdapter extends EObjectAdapter<Behavior> implements org.muml.xsrtsc.xsrtscmt.rtsc.Behavior {
  private XSRTSCMTAdaptersFactory adaptersFactory;
  
  public BehaviorAdapter() {
    super(org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory.getInstance());
    adaptersFactory = org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory.getInstance();
  }
  
  @Override
  public BehavioralElement getBehaviouralElement() {
    return (BehavioralElement) adaptersFactory.createAdapter(adaptee.getBehaviouralElement(), eResource);
  }
  
  @Override
  public void setBehaviouralElement(final BehavioralElement o) {
    if (o != null)
    	adaptee.setBehaviouralElement(((org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.BehavioralElementAdapter) o).getAdaptee());
    else adaptee.setBehaviouralElement(null);
  }
  
  @Override
  public EClass eClass() {
    return org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.eINSTANCE.getBehavior();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.BEHAVIOR__BEHAVIOURAL_ELEMENT:
    		return getBehaviouralElement();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.BEHAVIOR__BEHAVIOURAL_ELEMENT:
    		return getBehaviouralElement() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.BEHAVIOR__BEHAVIOURAL_ELEMENT:
    		setBehaviouralElement(
    		(org.muml.xsrtsc.xsrtscmt.rtsc.BehavioralElement)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
