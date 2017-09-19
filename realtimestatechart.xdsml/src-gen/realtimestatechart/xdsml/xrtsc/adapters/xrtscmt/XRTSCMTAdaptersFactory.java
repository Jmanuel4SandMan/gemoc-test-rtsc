package realtimestatechart.xdsml.xrtsc.adapters.xrtscmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.BehaviorAdapter;
import realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.BehavioralElementAdapter;
import realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.NamedElementAdapter;
import realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.RealtimestatechartAdapter;
import realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.StateAdapter;
import realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.StatePointAdapter;
import realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.TransitionAdapter;
import realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.VertexAdapter;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Behavior;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.BehavioralElement;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.NamedElement;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Realtimestatechart;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.State;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.StatePoint;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Vertex;

@SuppressWarnings("all")
public class XRTSCMTAdaptersFactory implements AdaptersFactory {
  private static XRTSCMTAdaptersFactory instance;
  
  public static XRTSCMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.XRTSCMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public XRTSCMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof realtimestatechart.xdsml.xrtsc.realtimestatechart.Realtimestatechart){
    	return createRealtimestatechartAdapter((realtimestatechart.xdsml.xrtsc.realtimestatechart.Realtimestatechart) o, res);
    }
    if (o instanceof realtimestatechart.xdsml.xrtsc.realtimestatechart.State){
    	return createStateAdapter((realtimestatechart.xdsml.xrtsc.realtimestatechart.State) o, res);
    }
    if (o instanceof realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition){
    	return createTransitionAdapter((realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition) o, res);
    }
    if (o instanceof realtimestatechart.xdsml.xrtsc.realtimestatechart.NamedElement){
    	return createNamedElementAdapter((realtimestatechart.xdsml.xrtsc.realtimestatechart.NamedElement) o, res);
    }
    if (o instanceof realtimestatechart.xdsml.xrtsc.realtimestatechart.StatePoint){
    	return createStatePointAdapter((realtimestatechart.xdsml.xrtsc.realtimestatechart.StatePoint) o, res);
    }
    
    return null;
  }
  
  public BehaviorAdapter createBehaviorAdapter(final Behavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.BehaviorAdapter) adapter;
    else {
    	adapter = new realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.BehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.BehaviorAdapter) adapter;
    }
  }
  
  public BehavioralElementAdapter createBehavioralElementAdapter(final BehavioralElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.BehavioralElementAdapter) adapter;
    else {
    	adapter = new realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.BehavioralElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.BehavioralElementAdapter) adapter;
    }
  }
  
  public RealtimestatechartAdapter createRealtimestatechartAdapter(final Realtimestatechart adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.RealtimestatechartAdapter) adapter;
    else {
    	adapter = new realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.RealtimestatechartAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.RealtimestatechartAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.StateAdapter) adapter;
    else {
    	adapter = new realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.StateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.TransitionAdapter) adapter;
    else {
    	adapter = new realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.TransitionAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.NamedElementAdapter) adapter;
    else {
    	adapter = new realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.NamedElementAdapter) adapter;
    }
  }
  
  public StatePointAdapter createStatePointAdapter(final StatePoint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.StatePointAdapter) adapter;
    else {
    	adapter = new realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.StatePointAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.StatePointAdapter) adapter;
    }
  }
  
  public VertexAdapter createVertexAdapter(final Vertex adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.VertexAdapter) adapter;
    else {
    	adapter = new realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.VertexAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (realtimestatechart.xdsml.xrtsc.adapters.xrtscmt.realtimestatechart.VertexAdapter) adapter;
    }
  }
}
