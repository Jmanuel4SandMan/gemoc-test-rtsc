package org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.muml.rtsc.Realtimestatechart;
import org.muml.rtsc.Transition;
import org.muml.xsrtsc.xsrtsc.adapters.rtscmt.RTSCMTAdaptersFactory;
import org.muml.xsrtsc.xsrtsc.rtsc.State;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements org.muml.rtsc.State {
  private RTSCMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(org.muml.xsrtsc.xsrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance());
    adaptersFactory = org.muml.xsrtsc.xsrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance();
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
    	adaptee.setOwningRTSC(((org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.RealtimestatechartAdapter) o).getAdaptee());
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
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean INITIAL_EDEFAULT = false;
  
  protected final static boolean FINAL_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.muml.rtsc.RtscPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.muml.rtsc.RtscPackage.STATE__NAME:
    		return getName();
    	case org.muml.rtsc.RtscPackage.STATE__SUB_STATECHARTS:
    		return getSubStatecharts();
    	case org.muml.rtsc.RtscPackage.STATE__INITIAL:
    		return isInitial() ? Boolean.TRUE : Boolean.FALSE;
    	case org.muml.rtsc.RtscPackage.STATE__FINAL:
    		return isFinal() ? Boolean.TRUE : Boolean.FALSE;
    	case org.muml.rtsc.RtscPackage.STATE__OWNING_RTSC:
    		return getOwningRTSC();
    	case org.muml.rtsc.RtscPackage.STATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions();
    	case org.muml.rtsc.RtscPackage.STATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.muml.rtsc.RtscPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.muml.rtsc.RtscPackage.STATE__SUB_STATECHARTS:
    		return getSubStatecharts() != null && !getSubStatecharts().isEmpty();
    	case org.muml.rtsc.RtscPackage.STATE__INITIAL:
    		return isInitial() != INITIAL_EDEFAULT;
    	case org.muml.rtsc.RtscPackage.STATE__FINAL:
    		return isFinal() != FINAL_EDEFAULT;
    	case org.muml.rtsc.RtscPackage.STATE__OWNING_RTSC:
    		return getOwningRTSC() != null;
    	case org.muml.rtsc.RtscPackage.STATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions() != null && !getIncomingTransitions().isEmpty();
    	case org.muml.rtsc.RtscPackage.STATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions() != null && !getOutgoingTransitions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.muml.rtsc.RtscPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.muml.rtsc.RtscPackage.STATE__SUB_STATECHARTS:
    		getSubStatecharts().clear();
    		getSubStatecharts().addAll((Collection) newValue);
    		return;
    	case org.muml.rtsc.RtscPackage.STATE__INITIAL:
    		setInitial(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.muml.rtsc.RtscPackage.STATE__FINAL:
    		setFinal(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.muml.rtsc.RtscPackage.STATE__OWNING_RTSC:
    		setOwningRTSC(
    		(org.muml.rtsc.Realtimestatechart)
    		 newValue);
    		return;
    	case org.muml.rtsc.RtscPackage.STATE__INCOMING_TRANSITIONS:
    		getIncomingTransitions().clear();
    		getIncomingTransitions().addAll((Collection) newValue);
    		return;
    	case org.muml.rtsc.RtscPackage.STATE__OUTGOING_TRANSITIONS:
    		getOutgoingTransitions().clear();
    		getOutgoingTransitions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.muml.rtsc.NamedElement.class) {
    	switch (derivedFeatureID) {
    		case org.muml.rtsc.RtscPackage.STATE__NAME:
    			return org.muml.rtsc.RtscPackage.NAMED_ELEMENT__NAME;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.muml.rtsc.NamedElement.class) {
    	switch (baseFeatureID) {
    		case org.muml.rtsc.RtscPackage.NAMED_ELEMENT__NAME:
    			return org.muml.rtsc.RtscPackage.STATE__NAME;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
