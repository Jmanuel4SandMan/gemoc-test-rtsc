package realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Vertex;

@SuppressWarnings("all")
public class VertexAdapter extends EObjectAdapter<Vertex> implements realtimestatechart.xdsml.xrtscmt.realtimestatechart.Vertex {
  private XRTSCMTAdaptersFactory adaptersFactory;
  
  public VertexAdapter() {
    super(realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory.getInstance());
    adaptersFactory = realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory.getInstance();
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
  
  @Override
  public EClass eClass() {
    return realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.eINSTANCE.getVertex();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.VERTEX__ACTIVE:
    		return isActive() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.VERTEX__ACTIVE:
    		return isActive() != ACTIVE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.VERTEX__ACTIVE:
    		setActive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
