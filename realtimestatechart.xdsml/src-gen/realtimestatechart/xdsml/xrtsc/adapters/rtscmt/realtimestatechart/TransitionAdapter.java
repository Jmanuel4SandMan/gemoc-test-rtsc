package realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import realtimestatechart.Vertex;
import realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements realtimestatechart.Transition {
  private RTSCMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance());
    adaptersFactory = realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Vertex getSource() {
    return (Vertex) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final Vertex o) {
    if (o != null)
    	adaptee.setSource(((realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.VertexAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public Vertex getTarget() {
    return (Vertex) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final Vertex o) {
    if (o != null)
    	adaptee.setTarget(((realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.VertexAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public EClass eClass() {
    return realtimestatechart.RealtimestatechartPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case realtimestatechart.RealtimestatechartPackage.TRANSITION__SOURCE:
    		return getSource();
    	case realtimestatechart.RealtimestatechartPackage.TRANSITION__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case realtimestatechart.RealtimestatechartPackage.TRANSITION__SOURCE:
    		return getSource() != null;
    	case realtimestatechart.RealtimestatechartPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case realtimestatechart.RealtimestatechartPackage.TRANSITION__SOURCE:
    		setSource(
    		(realtimestatechart.Vertex)
    		 newValue);
    		return;
    	case realtimestatechart.RealtimestatechartPackage.TRANSITION__TARGET:
    		setTarget(
    		(realtimestatechart.Vertex)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
