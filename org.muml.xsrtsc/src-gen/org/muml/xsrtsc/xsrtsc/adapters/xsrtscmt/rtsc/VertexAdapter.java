package org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory;
import org.muml.xsrtsc.xsrtsc.rtsc.Vertex;

@SuppressWarnings("all")
public class VertexAdapter extends EObjectAdapter<Vertex> implements org.muml.xsrtsc.xsrtscmt.rtsc.Vertex {
  private XSRTSCMTAdaptersFactory adaptersFactory;
  
  public VertexAdapter() {
    super(org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory.getInstance());
    adaptersFactory = org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory.getInstance();
  }
  
  @Override
  public boolean isUnchangeableTest() {
    return adaptee.isUnchangeableTest();
  }
  
  @Override
  public boolean isActive() {
    return org.muml.xsrtsc.xsrtsc.aspects.VertexAspect.active(adaptee);
  }
  
  @Override
  public void setActive(final boolean active) {
    org.muml.xsrtsc.xsrtsc.aspects.VertexAspect.active(adaptee, active
    );
  }
  
  protected final static boolean UNCHANGEABLE_TEST_EDEFAULT = false;
  
  protected final static boolean ACTIVE_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.eINSTANCE.getVertex();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.VERTEX__UNCHANGEABLE_TEST:
    		return isUnchangeableTest() ? Boolean.TRUE : Boolean.FALSE;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.VERTEX__ACTIVE:
    		return isActive() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.VERTEX__UNCHANGEABLE_TEST:
    		return isUnchangeableTest() != UNCHANGEABLE_TEST_EDEFAULT;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.VERTEX__ACTIVE:
    		return isActive() != ACTIVE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.VERTEX__ACTIVE:
    		setActive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
