package realtimestatechart.xdsml.xrtsc.adapters.rtscmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.BehaviorAdapter;
import realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.BehavioralElementAdapter;
import realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.NamedElementAdapter;
import realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.RealtimestatechartAdapter;
import realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.StateAdapter;
import realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.StatePointAdapter;
import realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.TransitionAdapter;
import realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.VertexAdapter;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Behavior;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.BehavioralElement;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.NamedElement;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Realtimestatechart;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.State;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.StatePoint;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition;
import realtimestatechart.xdsml.xrtsc.realtimestatechart.Vertex;

@SuppressWarnings("all")
public class RTSCMTAdaptersFactory implements AdaptersFactory {
  private static RTSCMTAdaptersFactory instance;
  
  public static RTSCMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new realtimestatechart.xdsml.xrtsc.adapters.rtscmt.RTSCMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public RTSCMTAdaptersFactory() {
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
    	 return (realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.BehaviorAdapter) adapter;
    else {
    	adapter = new realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.BehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.BehaviorAdapter) adapter;
    }
  }
  
  public BehavioralElementAdapter createBehavioralElementAdapter(final BehavioralElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.BehavioralElementAdapter) adapter;
    else {
    	adapter = new realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.BehavioralElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.BehavioralElementAdapter) adapter;
    }
  }
  
  public RealtimestatechartAdapter createRealtimestatechartAdapter(final Realtimestatechart adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.RealtimestatechartAdapter) adapter;
    else {
    	adapter = new realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.RealtimestatechartAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.RealtimestatechartAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.StateAdapter) adapter;
    else {
    	adapter = new realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.StateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.TransitionAdapter) adapter;
    else {
    	adapter = new realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.TransitionAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.NamedElementAdapter) adapter;
    else {
    	adapter = new realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.NamedElementAdapter) adapter;
    }
  }
  
  public StatePointAdapter createStatePointAdapter(final StatePoint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.StatePointAdapter) adapter;
    else {
    	adapter = new realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.StatePointAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.StatePointAdapter) adapter;
    }
  }
  
  public VertexAdapter createVertexAdapter(final Vertex adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.VertexAdapter) adapter;
    else {
    	adapter = new realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.VertexAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (realtimestatechart.xdsml.xrtsc.adapters.rtscmt.realtimestatechart.VertexAdapter) adapter;
    }
  }
}
