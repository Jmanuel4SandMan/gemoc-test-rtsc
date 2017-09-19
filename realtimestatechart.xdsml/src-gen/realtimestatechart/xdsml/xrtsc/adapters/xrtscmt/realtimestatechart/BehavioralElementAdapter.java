package realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.BehavioralElement;
import realtimestatechart.xdsml.xrtscmt.realtimestatechart.Behavior;

@SuppressWarnings("all")
public class BehavioralElementAdapter extends EObjectAdapter<BehavioralElement> implements realtimestatechart.xdsml.xrtscmt.realtimestatechart.BehavioralElement {
  private XRTSCMTAdaptersFactory adaptersFactory;
  
  public BehavioralElementAdapter() {
    super(realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory.getInstance());
    adaptersFactory = realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Behavior getBehavior() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getBehavior(), eResource);
  }
  
  @Override
  public void setBehavior(final Behavior o) {
    if (o != null)
    	adaptee.setBehavior(((realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.BehaviorAdapter) o).getAdaptee());
    else adaptee.setBehavior(null);
  }
  
  @Override
  public EClass eClass() {
    return realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.eINSTANCE.getBehavioralElement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.BEHAVIORAL_ELEMENT__BEHAVIOR:
    		return getBehavior();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.BEHAVIORAL_ELEMENT__BEHAVIOR:
    		return getBehavior() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.BEHAVIORAL_ELEMENT__BEHAVIOR:
    		setBehavior(
    		(realtimestatechart.xdsml.xrtscmt.realtimestatechart.Behavior)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
