package realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Realtimestatechart;
import realtimestatechart.xdsml.xrtscmt.realtimestatechart.State;
import realtimestatechart.xdsml.xrtscmt.realtimestatechart.Transition;

@SuppressWarnings("all")
public class RealtimestatechartAdapter extends EObjectAdapter<Realtimestatechart> implements realtimestatechart.xdsml.xrtscmt.realtimestatechart.Realtimestatechart {
  private XRTSCMTAdaptersFactory adaptersFactory;
  
  public RealtimestatechartAdapter() {
    super(realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory.getInstance());
    adaptersFactory = realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory.getInstance();
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
  public void initialize(final org.eclipse.emf.common.util.EList<java.lang.String> args) {
    realtimestatechart.xdsml.xrtsc.aspects.RealtimestatechartAspect.initialize(adaptee, args
    );
  }
  
  @Override
  public void main() {
    realtimestatechart.xdsml.xrtsc.aspects.RealtimestatechartAspect.main(adaptee);
  }
  
  @Override
  public void step() {
    realtimestatechart.xdsml.xrtsc.aspects.RealtimestatechartAspect.step(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.eINSTANCE.getRealtimestatechart();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__NAME:
    		return getName();
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__TRANSITIONS:
    		return getTransitions();
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__STATES:
    		return getStates();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__NAME:
    		return getName() != NAME_EDEFAULT;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__TRANSITIONS:
    		return getTransitions() != null && !getTransitions().isEmpty();
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__STATES:
    		return getStates() != null && !getStates().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__TRANSITIONS:
    		getTransitions().clear();
    		getTransitions().addAll((Collection) newValue);
    		return;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__STATES:
    		getStates().clear();
    		getStates().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == realtimestatechart.xdsml.xrtscmt.realtimestatechart.NamedElement.class) {
    	switch (derivedFeatureID) {
    		case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__NAME:
    			return realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.NAMED_ELEMENT__NAME;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == realtimestatechart.xdsml.xrtscmt.realtimestatechart.NamedElement.class) {
    	switch (baseFeatureID) {
    		case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.NAMED_ELEMENT__NAME:
    			return realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.REALTIMESTATECHART__NAME;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
