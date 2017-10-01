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

import rtscTrace.States.Realtimestatechart_rounds_Value;
import rtscTrace.States.State;
import rtscTrace.States.StatesPackage;

import rtscTrace.States.rtsc.RtscPackage;
import rtscTrace.States.rtsc.TracedRealtimestatechart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realtimestatechart rounds Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rtscTrace.States.impl.Realtimestatechart_rounds_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link rtscTrace.States.impl.Realtimestatechart_rounds_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link rtscTrace.States.impl.Realtimestatechart_rounds_ValueImpl#getRounds <em>Rounds</em>}</li>
 *   <li>{@link rtscTrace.States.impl.Realtimestatechart_rounds_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Realtimestatechart_rounds_ValueImpl extends MinimalEObjectImpl.Container implements Realtimestatechart_rounds_Value {
	/**
	 * The default value of the '{@link #getRounds() <em>Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRounds()
	 * @generated
	 * @ordered
	 */
	protected static final int ROUNDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRounds() <em>Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRounds()
	 * @generated
	 * @ordered
	 */
	protected int rounds = ROUNDS_EDEFAULT;

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
	protected Realtimestatechart_rounds_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.REALTIMESTATECHART_ROUNDS_VALUE;
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
	public TracedRealtimestatechart getParent() {
		if (eContainerFeatureID() != StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__PARENT) return null;
		return (TracedRealtimestatechart)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedRealtimestatechart newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedRealtimestatechart newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, RtscPackage.TRACED_REALTIMESTATECHART__ROUNDS_SEQUENCE, TracedRealtimestatechart.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRounds() {
		return rounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRounds(int newRounds) {
		int oldRounds = rounds;
		rounds = newRounds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__ROUNDS, oldRounds, rounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__STATES, StatesPackage.STATE__REALTIMESTATECHART_ROUNDS_VALUES);
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
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedRealtimestatechart)otherEnd, msgs);
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__STATES:
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
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__STATES:
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
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, RtscPackage.TRACED_REALTIMESTATECHART__ROUNDS_SEQUENCE, TracedRealtimestatechart.class, msgs);
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
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__PARENT:
				return getParent();
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__ROUNDS:
				return getRounds();
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__STATES:
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
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__PARENT:
				setParent((TracedRealtimestatechart)newValue);
				return;
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__ROUNDS:
				setRounds((Integer)newValue);
				return;
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__STATES:
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
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__PARENT:
				setParent((TracedRealtimestatechart)null);
				return;
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__ROUNDS:
				setRounds(ROUNDS_EDEFAULT);
				return;
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__STATES:
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
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__ROUNDS:
				return rounds != ROUNDS_EDEFAULT;
			case StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__STATES:
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
		result.append(" (rounds: ");
		result.append(rounds);
		result.append(')');
		return result.toString();
	}

} //Realtimestatechart_rounds_ValueImpl
