package realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import realtimestatechart.Realtimestatechart;
import realtimestatechart.StatePoint;
import realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.State;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements realtimestatechart.State {
  private RTSCMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
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
  
  private EList<StatePoint> statePoints_;
  
  @Override
  public EList<StatePoint> getStatePoints() {
    if (statePoints_ == null)
    	statePoints_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getStatePoints(), adaptersFactory, eResource);
    return statePoints_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean INITIAL_EDEFAULT = false;
  
  protected final static boolean FINAL_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return realtimestatechart.RealtimestatechartPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case realtimestatechart.RealtimestatechartPackage.STATE__NAME:
    		return getName();
    	case realtimestatechart.RealtimestatechartPackage.STATE__SUB_STATECHARTS:
    		return getSubStatecharts();
    	case realtimestatechart.RealtimestatechartPackage.STATE__STATE_POINTS:
    		return getStatePoints();
    	case realtimestatechart.RealtimestatechartPackage.STATE__INITIAL:
    		return isInitial() ? Boolean.TRUE : Boolean.FALSE;
    	case realtimestatechart.RealtimestatechartPackage.STATE__FINAL:
    		return isFinal() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case realtimestatechart.RealtimestatechartPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case realtimestatechart.RealtimestatechartPackage.STATE__SUB_STATECHARTS:
    		return getSubStatecharts() != null && !getSubStatecharts().isEmpty();
    	case realtimestatechart.RealtimestatechartPackage.STATE__STATE_POINTS:
    		return getStatePoints() != null && !getStatePoints().isEmpty();
    	case realtimestatechart.RealtimestatechartPackage.STATE__INITIAL:
    		return isInitial() != INITIAL_EDEFAULT;
    	case realtimestatechart.RealtimestatechartPackage.STATE__FINAL:
    		return isFinal() != FINAL_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case realtimestatechart.RealtimestatechartPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case realtimestatechart.RealtimestatechartPackage.STATE__SUB_STATECHARTS:
    		getSubStatecharts().clear();
    		getSubStatecharts().addAll((Collection) newValue);
    		return;
    	case realtimestatechart.RealtimestatechartPackage.STATE__STATE_POINTS:
    		getStatePoints().clear();
    		getStatePoints().addAll((Collection) newValue);
    		return;
    	case realtimestatechart.RealtimestatechartPackage.STATE__INITIAL:
    		setInitial(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case realtimestatechart.RealtimestatechartPackage.STATE__FINAL:
    		setFinal(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == realtimestatechart.NamedElement.class) {
    	switch (derivedFeatureID) {
    		case realtimestatechart.RealtimestatechartPackage.STATE__NAME:
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
    			return realtimestatechart.RealtimestatechartPackage.STATE__NAME;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
