package realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.StatePoint;

@SuppressWarnings("all")
public class StatePointAdapter extends EObjectAdapter<StatePoint> implements realtimestatechart.xdsml.xrtscmt.realtimestatechart.StatePoint {
  private XRTSCMTAdaptersFactory adaptersFactory;
  
  public StatePointAdapter() {
    super(realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory.getInstance());
    adaptersFactory = realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory.getInstance();
  }
  
  @Override
  public boolean isEntry() {
    return adaptee.isEntry();
  }
  
  @Override
  public void setEntry(final boolean o) {
    adaptee.setEntry(o);
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
  
  protected final static boolean ENTRY_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.eINSTANCE.getStatePoint();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE_POINT__ACTIVE:
    		return isActive() ? Boolean.TRUE : Boolean.FALSE;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE_POINT__ENTRY:
    		return isEntry() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE_POINT__ACTIVE:
    		return isActive() != ACTIVE_EDEFAULT;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE_POINT__ENTRY:
    		return isEntry() != ENTRY_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE_POINT__ACTIVE:
    		setActive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.STATE_POINT__ENTRY:
    		setEntry(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
