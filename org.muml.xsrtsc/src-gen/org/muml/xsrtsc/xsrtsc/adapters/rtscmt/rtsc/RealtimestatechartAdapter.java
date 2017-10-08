package org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.muml.rtsc.State;
import org.muml.rtsc.Transition;
import org.muml.xsrtsc.xsrtsc.adapters.rtscmt.RTSCMTAdaptersFactory;
import org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart;

@SuppressWarnings("all")
public class RealtimestatechartAdapter extends EObjectAdapter<Realtimestatechart> implements org.muml.rtsc.Realtimestatechart {
  private RTSCMTAdaptersFactory adaptersFactory;
  
  public RealtimestatechartAdapter() {
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
  
  private EList<Transition> transitions_;
  
  @Override
  public EList<Transition> getTransitions() {
    if (transitions_ == null)
    	transitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTransitions(), adaptersFactory, eResource);
    return transitions_;
  }
  
  private EList<State> states_;
  
  @Override
  public EList<State> getStates() {
    if (states_ == null)
    	states_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getStates(), adaptersFactory, eResource);
    return states_;
  }
  
  @Override
  public State getInitialState() {
    return (State) adaptersFactory.createAdapter(adaptee.getInitialState(), eResource);
  }
  
  @Override
  public void setInitialState(final State o) {
    if (o != null)
    	adaptee.setInitialState(((org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.StateAdapter) o).getAdaptee());
    else adaptee.setInitialState(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.muml.rtsc.RtscPackage.eINSTANCE.getRealtimestatechart();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.muml.rtsc.RtscPackage.REALTIMESTATECHART__NAME:
    		return getName();
    	case org.muml.rtsc.RtscPackage.REALTIMESTATECHART__TRANSITIONS:
    		return getTransitions();
    	case org.muml.rtsc.RtscPackage.REALTIMESTATECHART__STATES:
    		return getStates();
    	case org.muml.rtsc.RtscPackage.REALTIMESTATECHART__INITIAL_STATE:
    		return getInitialState();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.muml.rtsc.RtscPackage.REALTIMESTATECHART__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.muml.rtsc.RtscPackage.REALTIMESTATECHART__TRANSITIONS:
    		return getTransitions() != null && !getTransitions().isEmpty();
    	case org.muml.rtsc.RtscPackage.REALTIMESTATECHART__STATES:
    		return getStates() != null && !getStates().isEmpty();
    	case org.muml.rtsc.RtscPackage.REALTIMESTATECHART__INITIAL_STATE:
    		return getInitialState() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.muml.rtsc.RtscPackage.REALTIMESTATECHART__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.muml.rtsc.RtscPackage.REALTIMESTATECHART__TRANSITIONS:
    		getTransitions().clear();
    		getTransitions().addAll((Collection) newValue);
    		return;
    	case org.muml.rtsc.RtscPackage.REALTIMESTATECHART__STATES:
    		getStates().clear();
    		getStates().addAll((Collection) newValue);
    		return;
    	case org.muml.rtsc.RtscPackage.REALTIMESTATECHART__INITIAL_STATE:
    		setInitialState(
    		(org.muml.rtsc.State)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.muml.rtsc.NamedElement.class) {
    	switch (derivedFeatureID) {
    		case org.muml.rtsc.RtscPackage.REALTIMESTATECHART__NAME:
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
    			return org.muml.rtsc.RtscPackage.REALTIMESTATECHART__NAME;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
