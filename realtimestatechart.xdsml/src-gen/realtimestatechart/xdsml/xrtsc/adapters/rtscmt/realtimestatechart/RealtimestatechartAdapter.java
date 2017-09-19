package realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import realtimestatechart.State;
import realtimestatechart.Transition;
import realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Realtimestatechart;

@SuppressWarnings("all")
public class RealtimestatechartAdapter extends EObjectAdapter<Realtimestatechart> implements realtimestatechart.Realtimestatechart {
  private RTSCMTAdaptersFactory adaptersFactory;
  
  public RealtimestatechartAdapter() {
    super(realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance());
    adaptersFactory = realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance();
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
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return realtimestatechart.RealtimestatechartPackage.eINSTANCE.getRealtimestatechart();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__NAME:
    		return getName();
    	case realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__TRANSITIONS:
    		return getTransitions();
    	case realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__STATES:
    		return getStates();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__NAME:
    		return getName() != NAME_EDEFAULT;
    	case realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__TRANSITIONS:
    		return getTransitions() != null && !getTransitions().isEmpty();
    	case realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__STATES:
    		return getStates() != null && !getStates().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__TRANSITIONS:
    		getTransitions().clear();
    		getTransitions().addAll((Collection) newValue);
    		return;
    	case realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__STATES:
    		getStates().clear();
    		getStates().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == realtimestatechart.NamedElement.class) {
    	switch (derivedFeatureID) {
    		case realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__NAME:
    			return realtimestatechart.RealtimestatechartPackage.NAMED_ELEMENT__NAME;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == realtimestatechart.NamedElement.class) {
    	switch (baseFeatureID) {
    		case realtimestatechart.RealtimestatechartPackage.NAMED_ELEMENT__NAME:
    			return realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__NAME;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
