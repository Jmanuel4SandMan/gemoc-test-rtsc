package realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import realtimestatechart.Behavior;
import realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.BehavioralElement;

@SuppressWarnings("all")
public class BehavioralElementAdapter extends EObjectAdapter<BehavioralElement> implements realtimestatechart.BehavioralElement {
  private RTSCMTAdaptersFactory adaptersFactory;
  
  public BehavioralElementAdapter() {
    super(realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance());
    adaptersFactory = realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Behavior getBehavior() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getBehavior(), eResource);
  }
  
  @Override
  public void setBehavior(final Behavior o) {
    if (o != null)
    	adaptee.setBehavior(((realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.BehaviorAdapter) o).getAdaptee());
    else adaptee.setBehavior(null);
  }
  
  @Override
  public EClass eClass() {
    return realtimestatechart.RealtimestatechartPackage.eINSTANCE.getBehavioralElement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case realtimestatechart.RealtimestatechartPackage.BEHAVIORAL_ELEMENT__BEHAVIOR:
    		return getBehavior();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case realtimestatechart.RealtimestatechartPackage.BEHAVIORAL_ELEMENT__BEHAVIOR:
    		return getBehavior() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case realtimestatechart.RealtimestatechartPackage.BEHAVIORAL_ELEMENT__BEHAVIOR:
    		setBehavior(
    		(realtimestatechart.Behavior)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
