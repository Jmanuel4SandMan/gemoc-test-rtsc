/**
 */
package org.muml.seq.xsrtsc.xsrtsc.rtsc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.seq.xsrtsc.xsrtsc.rtsc.ClockConstraint;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Event;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Guard;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageType;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.State;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.TransitionImpl#getGuards <em>Guards</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.TransitionImpl#getClockConstraints <em>Clock Constraints</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.TransitionImpl#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.TransitionImpl#getTriggerMessage <em>Trigger Message</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.TransitionImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.TransitionImpl#getHitCount <em>Hit Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends NamedElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The cached value of the '{@link #getGuards() <em>Guards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuards()
	 * @generated
	 * @ordered
	 */
	protected EList<Guard> guards;

	/**
	 * The cached value of the '{@link #getClockConstraints() <em>Clock Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ClockConstraint> clockConstraints;

	/**
	 * The cached value of the '{@link #getTriggerMessage() <em>Trigger Message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageType> triggerMessage;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The default value of the '{@link #getHitCount() <em>Hit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHitCount()
	 * @generated
	 * @ordered
	 */
	protected static final int HIT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHitCount() <em>Hit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHitCount()
	 * @generated
	 * @ordered
	 */
	protected int hitCount = HIT_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtscPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtscPackage.TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(State newSource, NotificationChain msgs) {
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtscPackage.TRANSITION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, RtscPackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, RtscPackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.TRANSITION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtscPackage.TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(State newTarget, NotificationChain msgs) {
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtscPackage.TRANSITION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, RtscPackage.STATE__INCOMING_TRANSITIONS, State.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, RtscPackage.STATE__INCOMING_TRANSITIONS, State.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.TRANSITION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guard> getGuards() {
		if (guards == null) {
			guards = new EObjectContainmentEList<Guard>(Guard.class, this, RtscPackage.TRANSITION__GUARDS);
		}
		return guards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClockConstraint> getClockConstraints() {
		if (clockConstraints == null) {
			clockConstraints = new EObjectContainmentEList<ClockConstraint>(ClockConstraint.class, this, RtscPackage.TRANSITION__CLOCK_CONSTRAINTS);
		}
		return clockConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realtimestatechart getStatechart() {
		if (eContainerFeatureID() != RtscPackage.TRANSITION__STATECHART) return null;
		return (Realtimestatechart)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatechart(Realtimestatechart newStatechart, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStatechart, RtscPackage.TRANSITION__STATECHART, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatechart(Realtimestatechart newStatechart) {
		if (newStatechart != eInternalContainer() || (eContainerFeatureID() != RtscPackage.TRANSITION__STATECHART && newStatechart != null)) {
			if (EcoreUtil.isAncestor(this, newStatechart))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStatechart != null)
				msgs = ((InternalEObject)newStatechart).eInverseAdd(this, RtscPackage.REALTIMESTATECHART__TRANSITIONS, Realtimestatechart.class, msgs);
			msgs = basicSetStatechart(newStatechart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.TRANSITION__STATECHART, newStatechart, newStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getTriggerMessage() {
		if (triggerMessage == null) {
			triggerMessage = new EObjectResolvingEList<MessageType>(MessageType.class, this, RtscPackage.TRANSITION__TRIGGER_MESSAGE);
		}
		return triggerMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, RtscPackage.TRANSITION__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHitCount() {
		return hitCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHitCount(int newHitCount) {
		int oldHitCount = hitCount;
		hitCount = newHitCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.TRANSITION__HIT_COUNT, oldHitCount, hitCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canFire() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex fire() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean guardsHold() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean clocksHold() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkMessages() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void consumeMessages() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtscPackage.TRANSITION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, RtscPackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
				return basicSetSource((State)otherEnd, msgs);
			case RtscPackage.TRANSITION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, RtscPackage.STATE__INCOMING_TRANSITIONS, State.class, msgs);
				return basicSetTarget((State)otherEnd, msgs);
			case RtscPackage.TRANSITION__STATECHART:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStatechart((Realtimestatechart)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtscPackage.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case RtscPackage.TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
			case RtscPackage.TRANSITION__GUARDS:
				return ((InternalEList<?>)getGuards()).basicRemove(otherEnd, msgs);
			case RtscPackage.TRANSITION__CLOCK_CONSTRAINTS:
				return ((InternalEList<?>)getClockConstraints()).basicRemove(otherEnd, msgs);
			case RtscPackage.TRANSITION__STATECHART:
				return basicSetStatechart(null, msgs);
			case RtscPackage.TRANSITION__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RtscPackage.TRANSITION__STATECHART:
				return eInternalContainer().eInverseRemove(this, RtscPackage.REALTIMESTATECHART__TRANSITIONS, Realtimestatechart.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtscPackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case RtscPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case RtscPackage.TRANSITION__GUARDS:
				return getGuards();
			case RtscPackage.TRANSITION__CLOCK_CONSTRAINTS:
				return getClockConstraints();
			case RtscPackage.TRANSITION__STATECHART:
				return getStatechart();
			case RtscPackage.TRANSITION__TRIGGER_MESSAGE:
				return getTriggerMessage();
			case RtscPackage.TRANSITION__EVENTS:
				return getEvents();
			case RtscPackage.TRANSITION__HIT_COUNT:
				return getHitCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RtscPackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case RtscPackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case RtscPackage.TRANSITION__GUARDS:
				getGuards().clear();
				getGuards().addAll((Collection<? extends Guard>)newValue);
				return;
			case RtscPackage.TRANSITION__CLOCK_CONSTRAINTS:
				getClockConstraints().clear();
				getClockConstraints().addAll((Collection<? extends ClockConstraint>)newValue);
				return;
			case RtscPackage.TRANSITION__STATECHART:
				setStatechart((Realtimestatechart)newValue);
				return;
			case RtscPackage.TRANSITION__TRIGGER_MESSAGE:
				getTriggerMessage().clear();
				getTriggerMessage().addAll((Collection<? extends MessageType>)newValue);
				return;
			case RtscPackage.TRANSITION__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case RtscPackage.TRANSITION__HIT_COUNT:
				setHitCount((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RtscPackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case RtscPackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case RtscPackage.TRANSITION__GUARDS:
				getGuards().clear();
				return;
			case RtscPackage.TRANSITION__CLOCK_CONSTRAINTS:
				getClockConstraints().clear();
				return;
			case RtscPackage.TRANSITION__STATECHART:
				setStatechart((Realtimestatechart)null);
				return;
			case RtscPackage.TRANSITION__TRIGGER_MESSAGE:
				getTriggerMessage().clear();
				return;
			case RtscPackage.TRANSITION__EVENTS:
				getEvents().clear();
				return;
			case RtscPackage.TRANSITION__HIT_COUNT:
				setHitCount(HIT_COUNT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RtscPackage.TRANSITION__SOURCE:
				return source != null;
			case RtscPackage.TRANSITION__TARGET:
				return target != null;
			case RtscPackage.TRANSITION__GUARDS:
				return guards != null && !guards.isEmpty();
			case RtscPackage.TRANSITION__CLOCK_CONSTRAINTS:
				return clockConstraints != null && !clockConstraints.isEmpty();
			case RtscPackage.TRANSITION__STATECHART:
				return getStatechart() != null;
			case RtscPackage.TRANSITION__TRIGGER_MESSAGE:
				return triggerMessage != null && !triggerMessage.isEmpty();
			case RtscPackage.TRANSITION__EVENTS:
				return events != null && !events.isEmpty();
			case RtscPackage.TRANSITION__HIT_COUNT:
				return hitCount != HIT_COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (hitCount: ");
		result.append(hitCount);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
