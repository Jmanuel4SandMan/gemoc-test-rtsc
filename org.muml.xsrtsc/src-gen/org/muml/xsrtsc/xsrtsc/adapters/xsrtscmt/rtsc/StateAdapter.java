package org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory;
import org.muml.xsrtsc.xsrtsc.rtsc.State;
import org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart;
import org.muml.xsrtsc.xsrtscmt.rtsc.Transition;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements org.muml.xsrtsc.xsrtscmt.rtsc.State {
  private XSRTSCMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
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
  public boolean isInitial() {
    return adaptee.isInitial();
  }
  
  @Override
  public void setInitial(final boolean o) {
    adaptee.setInitial(o);
  }
  
  @Override
  public boolean isFinal() {
    return adaptee.isFinal();
  }
  
  @Override
  public void setFinal(final boolean o) {
    adaptee.setFinal(o);
  }
  
  private EList<Realtimestatechart> subStatecharts_;
  
  @Override
  public EList<Realtimestatechart> getSubStatecharts() {
    if (subStatecharts_ == null)
    	subStatecharts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubStatecharts(), adaptersFactory, eResource);
    return subStatecharts_;
  }
  
  @Override
  public Realtimestatechart getOwningRTSC() {
    return (Realtimestatechart) adaptersFactory.createAdapter(adaptee.getOwningRTSC(), eResource);
  }
  
  @Override
  public void setOwningRTSC(final Realtimestatechart o) {
    if (o != null)
    	adaptee.setOwningRTSC(((org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.RealtimestatechartAdapter) o).getAdaptee());
    else adaptee.setOwningRTSC(null);
  }
  
  private EList<Transition> incomingTransitions_;
  
  @Override
  public EList<Transition> getIncomingTransitions() {
    if (incomingTransitions_ == null)
    	incomingTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingTransitions(), adaptersFactory, eResource);
    return incomingTransitions_;
  }
  
  private EList<Transition> outgoingTransitions_;
  
  @Override
  public EList<Transition> getOutgoingTransitions() {
    if (outgoingTransitions_ == null)
    	outgoingTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingTransitions(), adaptersFactory, eResource);
    return outgoingTransitions_;
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
  
  protected final static boolean ACTIVE_EDEFAULT = false;
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean INITIAL_EDEFAULT = false;
  
  protected final static boolean FINAL_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__ACTIVE:
    		return isActive() ? Boolean.TRUE : Boolean.FALSE;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__NAME:
    		return getName();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__SUB_STATECHARTS:
    		return getSubStatecharts();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__INITIAL:
    		return isInitial() ? Boolean.TRUE : Boolean.FALSE;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__FINAL:
    		return isFinal() ? Boolean.TRUE : Boolean.FALSE;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__OWNING_RTSC:
    		return getOwningRTSC();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__ACTIVE:
    		return isActive() != ACTIVE_EDEFAULT;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__SUB_STATECHARTS:
    		return getSubStatecharts() != null && !getSubStatecharts().isEmpty();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__INITIAL:
    		return isInitial() != INITIAL_EDEFAULT;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__FINAL:
    		return isFinal() != FINAL_EDEFAULT;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__OWNING_RTSC:
    		return getOwningRTSC() != null;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions() != null && !getIncomingTransitions().isEmpty();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions() != null && !getOutgoingTransitions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__ACTIVE:
    		setActive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__SUB_STATECHARTS:
    		getSubStatecharts().clear();
    		getSubStatecharts().addAll((Collection) newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__INITIAL:
    		setInitial(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__FINAL:
    		setFinal(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__OWNING_RTSC:
    		setOwningRTSC(
    		(org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart)
    		 newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__INCOMING_TRANSITIONS:
    		getIncomingTransitions().clear();
    		getIncomingTransitions().addAll((Collection) newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__OUTGOING_TRANSITIONS:
    		getOutgoingTransitions().clear();
    		getOutgoingTransitions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.muml.xsrtsc.xsrtscmt.rtsc.NamedElement.class) {
    	switch (derivedFeatureID) {
    		case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__NAME:
    			return org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.NAMED_ELEMENT__NAME;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.muml.xsrtsc.xsrtscmt.rtsc.NamedElement.class) {
    	switch (baseFeatureID) {
    		case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.NAMED_ELEMENT__NAME:
    			return org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.STATE__NAME;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
