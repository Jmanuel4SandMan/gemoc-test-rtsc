/**
 */
package rtscTrace.States.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import rtscTrace.States.State;
import rtscTrace.States.StatesPackage;
import rtscTrace.States.Transition_hitCount_Value;

import rtscTrace.States.rtsc.RtscPackage;
import rtscTrace.States.rtsc.TracedTransition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition hit Count Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rtscTrace.States.impl.Transition_hitCount_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link rtscTrace.States.impl.Transition_hitCount_ValueImpl#getHitCount <em>Hit Count</em>}</li>
 *   <li>{@link rtscTrace.States.impl.Transition_hitCount_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link rtscTrace.States.impl.Transition_hitCount_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition_hitCount_ValueImpl extends MinimalEObjectImpl.Container implements Transition_hitCount_Value {
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
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition_hitCount_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.TRANSITION_HIT_COUNT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.TRANSITION_HIT_COUNT_VALUE__HIT_COUNT, oldHitCount, hitCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTransition getParent() {
		if (eContainerFeatureID() != StatesPackage.TRANSITION_HIT_COUNT_VALUE__PARENT) return null;
		return (TracedTransition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedTransition newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.TRANSITION_HIT_COUNT_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedTransition newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.TRANSITION_HIT_COUNT_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, RtscPackage.TRACED_TRANSITION__HIT_COUNT_SEQUENCE, TracedTransition.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.TRANSITION_HIT_COUNT_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.TRANSITION_HIT_COUNT_VALUE__STATES, StatesPackage.STATE__TRANSITION_HIT_COUNT_VALUES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedTransition)otherEnd, msgs);
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
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
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, RtscPackage.TRACED_TRANSITION__HIT_COUNT_SEQUENCE, TracedTransition.class, msgs);
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
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__HIT_COUNT:
				return getHitCount();
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__PARENT:
				return getParent();
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__STATES:
				return getStates();
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
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__HIT_COUNT:
				setHitCount((Integer)newValue);
				return;
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__PARENT:
				setParent((TracedTransition)newValue);
				return;
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__HIT_COUNT:
				setHitCount(HIT_COUNT_EDEFAULT);
				return;
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__PARENT:
				setParent((TracedTransition)null);
				return;
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__STATES:
				getStates().clear();
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
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__HIT_COUNT:
				return hitCount != HIT_COUNT_EDEFAULT;
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.TRANSITION_HIT_COUNT_VALUE__STATES:
				return states != null && !states.isEmpty();
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

} //Transition_hitCount_ValueImpl
