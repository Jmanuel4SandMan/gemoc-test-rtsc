package org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.BehaviorAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.BehavioralElementAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.NamedElementAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.RealtimestatechartAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.StateAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.TransitionAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.VertexAdapter;
import org.muml.xsrtsc.xsrtsc.rtsc.Behavior;
import org.muml.xsrtsc.xsrtsc.rtsc.BehavioralElement;
import org.muml.xsrtsc.xsrtsc.rtsc.NamedElement;
import org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart;
import org.muml.xsrtsc.xsrtsc.rtsc.State;
import org.muml.xsrtsc.xsrtsc.rtsc.Transition;
import org.muml.xsrtsc.xsrtsc.rtsc.Vertex;

@SuppressWarnings("all")
public class XSRTSCMTAdaptersFactory implements AdaptersFactory {
  private static XSRTSCMTAdaptersFactory instance;
  
  public static XSRTSCMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public XSRTSCMTAdaptersFactory() {
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
    if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.Vertex){
    	return createVertexAdapter((org.muml.xsrtsc.xsrtsc.rtsc.Vertex) o, res);
    }
    
    return null;
  }
  
  public BehaviorAdapter createBehaviorAdapter(final Behavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.BehaviorAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.BehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.BehaviorAdapter) adapter;
    }
  }
  
  public BehavioralElementAdapter createBehavioralElementAdapter(final BehavioralElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.BehavioralElementAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.BehavioralElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.BehavioralElementAdapter) adapter;
    }
  }
  
  public RealtimestatechartAdapter createRealtimestatechartAdapter(final Realtimestatechart adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.RealtimestatechartAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.RealtimestatechartAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.RealtimestatechartAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.StateAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.StateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.TransitionAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.TransitionAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.NamedElementAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.NamedElementAdapter) adapter;
    }
  }
  
  public VertexAdapter createVertexAdapter(final Vertex adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.VertexAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.VertexAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.VertexAdapter) adapter;
    }
  }
}
