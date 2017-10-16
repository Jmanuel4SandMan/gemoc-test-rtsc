package org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory;
import org.muml.xsrtsc.xsrtsc.rtsc.Transition;
import org.muml.xsrtsc.xsrtscmt.rtsc.ClockConstraint;
import org.muml.xsrtsc.xsrtscmt.rtsc.Guard;
import org.muml.xsrtsc.xsrtscmt.rtsc.MessageType;
import org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart;
import org.muml.xsrtsc.xsrtscmt.rtsc.State;
import org.muml.xsrtsc.xsrtscmt.rtsc.Vertex;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements org.muml.xsrtsc.xsrtscmt.rtsc.Transition {
  private XSRTSCMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory.getInstance());
    adaptersFactory = org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.XSRTSCMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public State getSource() {
    return (State) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final State o) {
    if (o != null)
    	adaptee.setSource(((org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.StateAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public State getTarget() {
    return (State) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final State o) {
    if (o != null)
    	adaptee.setTarget(((org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.StateAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  private EList<Guard> guards_;
  
  @Override
  public EList<Guard> getGuards() {
    if (guards_ == null)
    	guards_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getGuards(), adaptersFactory, eResource);
    return guards_;
  }
  
  private EList<ClockConstraint> clockConstraints_;
  
  @Override
  public EList<ClockConstraint> getClockConstraints() {
    if (clockConstraints_ == null)
    	clockConstraints_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getClockConstraints(), adaptersFactory, eResource);
    return clockConstraints_;
  }
  
  @Override
  public Realtimestatechart getStatechart() {
    return (Realtimestatechart) adaptersFactory.createAdapter(adaptee.getStatechart(), eResource);
  }
  
  @Override
  public void setStatechart(final Realtimestatechart o) {
    if (o != null)
    	adaptee.setStatechart(((org.muml.xsrtsc.xsrtsc.adapters.xsrtscmt.rtsc.RealtimestatechartAdapter) o).getAdaptee());
    else adaptee.setStatechart(null);
  }
  
  private EList<MessageType> triggerMessage_;
  
  @Override
  public EList<MessageType> getTriggerMessage() {
    if (triggerMessage_ == null)
    	triggerMessage_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTriggerMessage(), adaptersFactory, eResource);
    return triggerMessage_;
  }
  
  @Override
  public boolean canFire() {
    return org.muml.xsrtsc.xsrtsc.aspects.TransitionAspect.canFire(adaptee);
  }
  
  @Override
  public boolean checkMessages() {
    return org.muml.xsrtsc.xsrtsc.aspects.TransitionAspect.checkMessages(adaptee);
  }
  
  @Override
  public boolean clocksHold() {
    return org.muml.xsrtsc.xsrtsc.aspects.TransitionAspect.clocksHold(adaptee);
  }
  
  @Override
  public Vertex fire() {
    return (Vertex) adaptersFactory.createAdapter(org.muml.xsrtsc.xsrtsc.aspects.TransitionAspect.fire(adaptee), eResource);
  }
  
  @Override
  public boolean guardsHold() {
    return org.muml.xsrtsc.xsrtsc.aspects.TransitionAspect.guardsHold(adaptee);
  }
  
  @Override
  public int getHitCount() {
    return org.muml.xsrtsc.xsrtsc.aspects.TransitionAspect.hitCount(adaptee);
  }
  
  @Override
  public void setHitCount(final int hitCount) {
    org.muml.xsrtsc.xsrtsc.aspects.TransitionAspect.hitCount(adaptee, hitCount
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static int HIT_COUNT_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__NAME:
    		return getName();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__SOURCE:
    		return getSource();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__TARGET:
    		return getTarget();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__GUARDS:
    		return getGuards();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__CLOCK_CONSTRAINTS:
    		return getClockConstraints();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__STATECHART:
    		return getStatechart();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__TRIGGER_MESSAGE:
    		return getTriggerMessage();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__HIT_COUNT:
    		return new java.lang.Integer(getHitCount());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__SOURCE:
    		return getSource() != null;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__GUARDS:
    		return getGuards() != null && !getGuards().isEmpty();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__CLOCK_CONSTRAINTS:
    		return getClockConstraints() != null && !getClockConstraints().isEmpty();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__STATECHART:
    		return getStatechart() != null;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__TRIGGER_MESSAGE:
    		return getTriggerMessage() != null && !getTriggerMessage().isEmpty();
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__HIT_COUNT:
    		return getHitCount() != HIT_COUNT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__SOURCE:
    		setSource(
    		(org.muml.xsrtsc.xsrtscmt.rtsc.State)
    		 newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__TARGET:
    		setTarget(
    		(org.muml.xsrtsc.xsrtscmt.rtsc.State)
    		 newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__GUARDS:
    		getGuards().clear();
    		getGuards().addAll((Collection) newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__CLOCK_CONSTRAINTS:
    		getClockConstraints().clear();
    		getClockConstraints().addAll((Collection) newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__STATECHART:
    		setStatechart(
    		(org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart)
    		 newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__TRIGGER_MESSAGE:
    		getTriggerMessage().clear();
    		getTriggerMessage().addAll((Collection) newValue);
    		return;
    	case org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage.TRANSITION__HIT_COUNT:
    		setHitCount(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
