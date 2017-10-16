package org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory;
import org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart;
import org.muml.xsrtsc.xsrtscmt.rtsc.BehavioralElement;
import org.muml.xsrtsc.xsrtscmt.rtsc.Clock;
import org.muml.xsrtsc.xsrtscmt.rtsc.State;
import org.muml.xsrtsc.xsrtscmt.rtsc.Transition;
import org.muml.xsrtsc.xsrtscmt.rtsc.Variable;

@SuppressWarnings("all")
public class RealtimestatechartAdapter extends EObjectAdapter<Realtimestatechart> implements org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart {
  private XSRTSCMTAdaptersFactory adaptersFactory;
  
  public RealtimestatechartAdapter() {
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
  public BehavioralElement getBehaviouralElement() {
    return (BehavioralElement) adaptersFactory.createAdapter(adaptee.getBehaviouralElement(), eResource);
  }
  
  @Override
  public void setBehaviouralElement(final BehavioralElement o) {
    if (o != null)
    	adaptee.setBehaviouralElement(((org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.BehavioralElementAdapter) o).getAdaptee());
    else adaptee.setBehaviouralElement(null);
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
    	adaptee.setInitialState(((org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.StateAdapter) o).getAdaptee());
    else adaptee.setInitialState(null);
  }
  
  private EList<Variable> variables_;
  
  @Override
  public EList<Variable> getVariables() {
    if (variables_ == null)
    	variables_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getVariables(), adaptersFactory, eResource);
    return variables_;
  }
  
  private EList<Clock> clocks_;
  
  @Override
  public EList<Clock> getClocks() {
    if (clocks_ == null)
    	clocks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getClocks(), adaptersFactory, eResource);
    return clocks_;
  }
  
  @Override
  public void initialize(final org.eclipse.emf.common.util.EList<java.lang.String> args) {
    org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspect.initialize(adaptee, args
    );
  }
  
  @Override
  public void main() {
    org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspect.main(adaptee);
  }
  
  @Override
  public int getRounds() {
    return org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspect.rounds(adaptee);
  }
  
  @Override
  public void setRounds(final int rounds) {
    org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspect.rounds(adaptee, rounds
    );
  }
  
  @Override
  public void sequentialStep() {
    org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspect.sequentialStep(adaptee);
  }
  
  @Override
  public void step() {
    org.muml.xsrtsc.xsrtsc.aspects.RealtimestatechartAspect.step(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static int ROUNDS_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.eINSTANCE.getRealtimestatechart();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__BEHAVIOURAL_ELEMENT:
    		return getBehaviouralElement();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__NAME:
    		return getName();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__TRANSITIONS:
    		return getTransitions();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__STATES:
    		return getStates();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__INITIAL_STATE:
    		return getInitialState();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__VARIABLES:
    		return getVariables();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__CLOCKS:
    		return getClocks();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__ROUNDS:
    		return new java.lang.Integer(getRounds());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__BEHAVIOURAL_ELEMENT:
    		return getBehaviouralElement() != null;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__TRANSITIONS:
    		return getTransitions() != null && !getTransitions().isEmpty();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__STATES:
    		return getStates() != null && !getStates().isEmpty();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__INITIAL_STATE:
    		return getInitialState() != null;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__VARIABLES:
    		return getVariables() != null && !getVariables().isEmpty();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__CLOCKS:
    		return getClocks() != null && !getClocks().isEmpty();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__ROUNDS:
    		return getRounds() != ROUNDS_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__BEHAVIOURAL_ELEMENT:
    		setBehaviouralElement(
    		(org.muml.xsrtsc.xsrtscmt.rtsc.BehavioralElement)
    		 newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__TRANSITIONS:
    		getTransitions().clear();
    		getTransitions().addAll((Collection) newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__STATES:
    		getStates().clear();
    		getStates().addAll((Collection) newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__INITIAL_STATE:
    		setInitialState(
    		(org.muml.xsrtsc.xsrtscmt.rtsc.State)
    		 newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__VARIABLES:
    		getVariables().clear();
    		getVariables().addAll((Collection) newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__CLOCKS:
    		getClocks().clear();
    		getClocks().addAll((Collection) newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__ROUNDS:
    		setRounds(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.muml.xsrtsc.xsrtscmt.rtsc.NamedElement.class) {
    	switch (derivedFeatureID) {
    		case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__NAME:
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
    			return org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.REALTIMESTATECHART__NAME;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
