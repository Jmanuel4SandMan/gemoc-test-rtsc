package realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition;
import realtimestatechart.xdsml.xrtscmt.realtimestatechart.Vertex;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements realtimestatechart.xdsml.xrtscmt.realtimestatechart.Transition {
  private XRTSCMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory.getInstance());
    adaptersFactory = realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Vertex getSource() {
    return (Vertex) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final Vertex o) {
    if (o != null)
    	adaptee.setSource(((realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.VertexAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public Vertex getTarget() {
    return (Vertex) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final Vertex o) {
    if (o != null)
    	adaptee.setTarget(((realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.VertexAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public boolean canFire() {
    return realtimestatechart.xdsml.xrtsc.aspects.TransitionAspect.canFire(adaptee);
  }
  
  @Override
  public void fire() {
    realtimestatechart.xdsml.xrtsc.aspects.TransitionAspect.fire(adaptee);
  }
  
  @Override
  public int getHitCount() {
    return realtimestatechart.xdsml.xrtsc.aspects.TransitionAspect.hitCount(adaptee);
  }
  
  @Override
  public void setHitCount(final int hitCount) {
    realtimestatechart.xdsml.xrtsc.aspects.TransitionAspect.hitCount(adaptee, hitCount
    );
  }
  
  protected final static int HIT_COUNT_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.TRANSITION__SOURCE:
    		return getSource();
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.TRANSITION__TARGET:
    		return getTarget();
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.TRANSITION__HIT_COUNT:
    		return new java.lang.Integer(getHitCount());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.TRANSITION__SOURCE:
    		return getSource() != null;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.TRANSITION__HIT_COUNT:
    		return getHitCount() != HIT_COUNT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.TRANSITION__SOURCE:
    		setSource(
    		(realtimestatechart.xdsml.xrtscmt.realtimestatechart.Vertex)
    		 newValue);
    		return;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.TRANSITION__TARGET:
    		setTarget(
    		(realtimestatechart.xdsml.xrtscmt.realtimestatechart.Vertex)
    		 newValue);
    		return;
    	case realtimestatechart.xdsml.xrtscmt.realtimestatechart.RealtimestatechartPackage.TRANSITION__HIT_COUNT:
    		setHitCount(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
