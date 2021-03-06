package org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.BehaviorAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.BehavioralElementAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.ClockAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.ClockConstraintAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.ConnectorAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.CoordinationProtocolAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.GuardAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.MessageAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.MessageBufferAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.MessageTypeAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.MessageTypeRepositoryAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.NamedElementAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.PortAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.RealtimestatechartAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.StateAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.SystemAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.TransitionAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.VariableAdapter;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.VertexAdapter;
import org.muml.xsrtsc.xsrtsc.rtsc.Behavior;
import org.muml.xsrtsc.xsrtsc.rtsc.BehavioralElement;
import org.muml.xsrtsc.xsrtsc.rtsc.Clock;
import org.muml.xsrtsc.xsrtsc.rtsc.ClockConstraint;
import org.muml.xsrtsc.xsrtsc.rtsc.Connector;
import org.muml.xsrtsc.xsrtsc.rtsc.CoordinationProtocol;
import org.muml.xsrtsc.xsrtsc.rtsc.Guard;
import org.muml.xsrtsc.xsrtsc.rtsc.Message;
import org.muml.xsrtsc.xsrtsc.rtsc.MessageBuffer;
import org.muml.xsrtsc.xsrtsc.rtsc.MessageType;
import org.muml.xsrtsc.xsrtsc.rtsc.MessageTypeRepository;
import org.muml.xsrtsc.xsrtsc.rtsc.NamedElement;
import org.muml.xsrtsc.xsrtsc.rtsc.Port;
import org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart;
import org.muml.xsrtsc.xsrtsc.rtsc.State;
import org.muml.xsrtsc.xsrtsc.rtsc.Transition;
import org.muml.xsrtsc.xsrtsc.rtsc.Variable;
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
    if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.Guard){
    	return createGuardAdapter((org.muml.xsrtsc.xsrtsc.rtsc.Guard) o, res);
    }
    if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.ClockConstraint){
    	return createClockConstraintAdapter((org.muml.xsrtsc.xsrtsc.rtsc.ClockConstraint) o, res);
    }
    if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.Variable){
    	return createVariableAdapter((org.muml.xsrtsc.xsrtsc.rtsc.Variable) o, res);
    }
    if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.Clock){
    	return createClockAdapter((org.muml.xsrtsc.xsrtsc.rtsc.Clock) o, res);
    }
    if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.Port){
    	return createPortAdapter((org.muml.xsrtsc.xsrtsc.rtsc.Port) o, res);
    }
    if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.MessageBuffer){
    	return createMessageBufferAdapter((org.muml.xsrtsc.xsrtsc.rtsc.MessageBuffer) o, res);
    }
    if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.Connector){
    	return createConnectorAdapter((org.muml.xsrtsc.xsrtsc.rtsc.Connector) o, res);
    }
    if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.CoordinationProtocol){
    	return createCoordinationProtocolAdapter((org.muml.xsrtsc.xsrtsc.rtsc.CoordinationProtocol) o, res);
    }
    if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.MessageType){
    	return createMessageTypeAdapter((org.muml.xsrtsc.xsrtsc.rtsc.MessageType) o, res);
    }
    if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.Message){
    	return createMessageAdapter((org.muml.xsrtsc.xsrtsc.rtsc.Message) o, res);
    }
    if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.System){
    	return createSystemAdapter((org.muml.xsrtsc.xsrtsc.rtsc.System) o, res);
    }
    if (o instanceof org.muml.xsrtsc.xsrtsc.rtsc.MessageTypeRepository){
    	return createMessageTypeRepositoryAdapter((org.muml.xsrtsc.xsrtsc.rtsc.MessageTypeRepository) o, res);
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
  
  public GuardAdapter createGuardAdapter(final Guard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.GuardAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.GuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.GuardAdapter) adapter;
    }
  }
  
  public ClockConstraintAdapter createClockConstraintAdapter(final ClockConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.ClockConstraintAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.ClockConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.ClockConstraintAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.VariableAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.VariableAdapter) adapter;
    }
  }
  
  public ClockAdapter createClockAdapter(final Clock adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.ClockAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.ClockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.ClockAdapter) adapter;
    }
  }
  
  public PortAdapter createPortAdapter(final Port adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.PortAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.PortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.PortAdapter) adapter;
    }
  }
  
  public MessageBufferAdapter createMessageBufferAdapter(final MessageBuffer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.MessageBufferAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.MessageBufferAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.MessageBufferAdapter) adapter;
    }
  }
  
  public ConnectorAdapter createConnectorAdapter(final Connector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.ConnectorAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.ConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.ConnectorAdapter) adapter;
    }
  }
  
  public CoordinationProtocolAdapter createCoordinationProtocolAdapter(final CoordinationProtocol adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.CoordinationProtocolAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.CoordinationProtocolAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.CoordinationProtocolAdapter) adapter;
    }
  }
  
  public MessageTypeAdapter createMessageTypeAdapter(final MessageType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.MessageTypeAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.MessageTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.MessageTypeAdapter) adapter;
    }
  }
  
  public MessageAdapter createMessageAdapter(final Message adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.MessageAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.MessageAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.MessageAdapter) adapter;
    }
  }
  
  public SystemAdapter createSystemAdapter(final org.muml.xsrtsc.xsrtsc.rtsc.System adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.SystemAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.SystemAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.SystemAdapter) adapter;
    }
  }
  
  public MessageTypeRepositoryAdapter createMessageTypeRepositoryAdapter(final MessageTypeRepository adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.MessageTypeRepositoryAdapter) adapter;
    else {
    	adapter = new org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.MessageTypeRepositoryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.MessageTypeRepositoryAdapter) adapter;
    }
  }
}
