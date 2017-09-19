package realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.State;
import realtimestatechart.xdsml.xrtscmt.realtimestatechart.Realtimestatechart;
import realtimestatechart.xdsml.xrtscmt.realtimestatechart.StatePoint;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements realtimestatechart.xdsml.xrtscmt.realtimestatechart.State {
  private XRTSCMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
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
  
  @Override
  public boolean isActive() {
    return realtimestatechart.xdsml.xrtsc.aspects.VertexAspect.active(adaptee);
  }
  
  @Override
  public void setActive(final boolean active) {
    realtimestatechart.xdsml.xrtsc.aspects.VertexAspect.active(adaptee, active
    );
  }
  
  protected final static boolean ACTIVE_EDEFAULT = false;
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean INITIAL_EDEFAULT = false;
  
  protected final static boolean FINAL_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__ACTIVE:
    		return isActive() ? Boolean.TRUE : Boolean.FALSE;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__NAME:
    		return getName();
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__SUB_STATECHARTS:
    		return getSubStatecharts();
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__STATE_POINTS:
    		return getStatePoints();
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__INITIAL:
    		return isInitial() ? Boolean.TRUE : Boolean.FALSE;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__FINAL:
    		return isFinal() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__ACTIVE:
    		return isActive() != ACTIVE_EDEFAULT;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__SUB_STATECHARTS:
    		return getSubStatecharts() != null && !getSubStatecharts().isEmpty();
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__STATE_POINTS:
    		return getStatePoints() != null && !getStatePoints().isEmpty();
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__INITIAL:
    		return isInitial() != INITIAL_EDEFAULT;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__FINAL:
    		return isFinal() != FINAL_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__ACTIVE:
    		setActive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__SUB_STATECHARTS:
    		getSubStatecharts().clear();
    		getSubStatecharts().addAll((Collection) newValue);
    		return;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__STATE_POINTS:
    		getStatePoints().clear();
    		getStatePoints().addAll((Collection) newValue);
    		return;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__INITIAL:
    		setInitial(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__FINAL:
    		setFinal(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == realtimestatechart.xdsml.xrtscmt.realtimestatechart.NamedElement.class) {
    	switch (derivedFeatureID) {
    		case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__NAME:
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
    			return realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE__NAME;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
