package org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory;
import org.muml.xsrtsc.xsrtsc.rtsc.Transition;
import org.muml.xsrtsc.xsrtscmt.rtsc.State;
import org.muml.xsrtsc.xsrtscmt.rtsc.Vertex;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements org.muml.xsrtsc.xsrtscmt.rtsc.Transition {
  private XSRTSCMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory.getInstance());
    adaptersFactory = org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public String getInput() {
    return adaptee.getInput();
  }
  
  @Override
  public void setInput(final String o) {
    adaptee.setInput(o);
  }
  
  @Override
  public String getOutput() {
    return adaptee.getOutput();
  }
  
  @Override
  public void setOutput(final String o) {
    adaptee.setOutput(o);
  }
  
  @Override
  public State getSource() {
    return (State) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final State o) {
    if (o != null)
    	adaptee.setSource(((org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.StateAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public State getTarget() {
    return (State) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final State o) {
    if (o != null)
    	adaptee.setTarget(((org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.StateAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public boolean canFire() {
    return org.muml.xsrtsc.xsrtsc.aspects.TransitionAspect.canFire(adaptee);
  }
  
  @Override
  public Vertex fire() {
    return (Vertex) adaptersFactory.createAdapter(org.muml.xsrtsc.xsrtsc.aspects.TransitionAspect.fire(adaptee), eResource);
  }
  
  @Override
  public int getHitCount() {
    return org.muml.xsrtsc.xsrtsc.aspects.TransitionAspect.hitCount(adaptee);
  }
  
  @Override
  public void setHitCount(final int hitCount) {
    org.muml.xsrtsc.xsrtsc.aspects.TransitionAspect.hitCount(adaptee, hitCount
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String INPUT_EDEFAULT = null;
  
  protected final static String OUTPUT_EDEFAULT = null;
  
  protected final static int HIT_COUNT_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__NAME:
    		return getName();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__SOURCE:
    		return getSource();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__TARGET:
    		return getTarget();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__INPUT:
    		return getInput();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__OUTPUT:
    		return getOutput();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__HIT_COUNT:
    		return new java.lang.Integer(getHitCount());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__SOURCE:
    		return getSource() != null;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__INPUT:
    		return getInput() != INPUT_EDEFAULT;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__OUTPUT:
    		return getOutput() != OUTPUT_EDEFAULT;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__HIT_COUNT:
    		return getHitCount() != HIT_COUNT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__SOURCE:
    		setSource(
    		(org.muml.xsrtsc.xsrtscmt.rtsc.State)
    		 newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__TARGET:
    		setTarget(
    		(org.muml.xsrtsc.xsrtscmt.rtsc.State)
    		 newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__INPUT:
    		setInput(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__OUTPUT:
    		setOutput(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__HIT_COUNT:
    		setHitCount(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
