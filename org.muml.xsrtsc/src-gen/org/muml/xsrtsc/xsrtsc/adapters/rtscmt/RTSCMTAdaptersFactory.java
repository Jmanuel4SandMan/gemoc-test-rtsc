package org.muml.xsrtsc.xsrtsc.adapters.rtscmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.BehaviorAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.BehavioralElementAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.NamedElementAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.RealtimestatechartAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.StateAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.TransitionAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.VertexAdapter;
import org.muml.xsrtsc.xsrtsc.rtsc.Behavior;
import org.muml.xsrtsc.xsrtsc.rtsc.BehavioralElement;
import org.muml.xsrtsc.xsrtsc.rtsc.NamedElement;
import org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart;
import org.muml.xsrtsc.xsrtsc.rtsc.State;
import org.muml.xsrtsc.xsrtsc.rtsc.Transition;
import org.muml.xsrtsc.xsrtsc.rtsc.Vertex;

@SuppressWarnings("all")
public class RTSCMTAdaptersFactory implements AdaptersFactory {
  private static RTSCMTAdaptersFactory instance;
  
  public static RTSCMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.muml.xsrtsc.xsrtsc.adapters.rtscmt.RTSCMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public RTSCMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart){
    	return createRealtimestatechartAdapter((org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart) o, res);
    }
    if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.State){
    	return createStateAdapter((org.muml.xsrtsc.xsrtsc.rtsc.State) o, res);
    }
    if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.Transition){
    	return createTransitionAdapter((org.muml.xsrtsc.xsrtsc.rtsc.Transition) o, res);
    }
    
    return null;
  }
  
  public BehaviorAdapter createBehaviorAdapter(final Behavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.BehaviorAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.BehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.BehaviorAdapter) adapter;
    }
  }
  
  public BehavioralElementAdapter createBehavioralElementAdapter(final BehavioralElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.BehavioralElementAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.BehavioralElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.BehavioralElementAdapter) adapter;
    }
  }
  
  public RealtimestatechartAdapter createRealtimestatechartAdapter(final Realtimestatechart adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.RealtimestatechartAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.RealtimestatechartAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.RealtimestatechartAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.StateAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.StateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.TransitionAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.TransitionAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.NamedElementAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.NamedElementAdapter) adapter;
    }
  }
  
  public VertexAdapter createVertexAdapter(final Vertex adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.VertexAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.VertexAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.rtscmt.rtsc.VertexAdapter) adapter;
    }
  }
}
