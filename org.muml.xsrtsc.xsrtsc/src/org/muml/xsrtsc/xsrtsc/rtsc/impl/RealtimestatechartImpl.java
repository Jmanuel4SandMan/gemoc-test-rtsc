/**
 */
package org.muml.xsrtsc.xsrtsc.rtsc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.xsrtsc.xsrtsc.rtsc.Clock;
import org.muml.xsrtsc.xsrtsc.rtsc.NamedElement;
import org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart;
import org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage;
import org.muml.xsrtsc.xsrtsc.rtsc.State;
import org.muml.xsrtsc.xsrtsc.rtsc.Transition;
import org.muml.xsrtsc.xsrtsc.rtsc.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realtimestatechart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl#getClocks <em>Clocks</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl#getRounds <em>Rounds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealtimestatechartImpl extends BehaviorImpl implements Realtimestatechart {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getClocks() <em>Clocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> clocks;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealtimestatechartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtscPackage.Literals.REALTIMESTATECHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.REALTIMESTATECHART__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, RtscPackage.REALTIMESTATECHART__TRANSITIONS, RtscPackage.TRANSITION__STATECHART);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentWithInverseEList<State>(State.class, this, RtscPackage.REALTIMESTATECHART__STATES, RtscPackage.STATE__OWNING_RTSC);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (State)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtscPackage.REALTIMESTATECHART__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.REALTIMESTATECHART__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, RtscPackage.REALTIMESTATECHART__VARIABLES, RtscPackage.VARIABLE__STATECHART);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getClocks() {
		if (clocks == null) {
			clocks = new EObjectContainmentWithInverseEList<Clock>(Clock.class, this, RtscPackage.REALTIMESTATECHART__CLOCKS, RtscPackage.CLOCK__STATECHART);
		}
		return clocks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.REALTIMESTATECHART__ROUNDS, oldRounds, rounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialize(EList<String> args) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void step() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sequentialStep() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case RtscPackage.REALTIMESTATECHART__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
			case RtscPackage.REALTIMESTATECHART__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
			case RtscPackage.REALTIMESTATECHART__VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariables()).basicAdd(otherEnd, msgs);
			case RtscPackage.REALTIMESTATECHART__CLOCKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClocks()).basicAdd(otherEnd, msgs);
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
			case RtscPackage.REALTIMESTATECHART__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case RtscPackage.REALTIMESTATECHART__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case RtscPackage.REALTIMESTATECHART__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case RtscPackage.REALTIMESTATECHART__CLOCKS:
				return ((InternalEList<?>)getClocks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtscPackage.REALTIMESTATECHART__NAME:
				return getName();
			case RtscPackage.REALTIMESTATECHART__TRANSITIONS:
				return getTransitions();
			case RtscPackage.REALTIMESTATECHART__STATES:
				return getStates();
			case RtscPackage.REALTIMESTATECHART__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case RtscPackage.REALTIMESTATECHART__VARIABLES:
				return getVariables();
			case RtscPackage.REALTIMESTATECHART__CLOCKS:
				return getClocks();
			case RtscPackage.REALTIMESTATECHART__ROUNDS:
				return getRounds();
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
			case RtscPackage.REALTIMESTATECHART__NAME:
				setName((String)newValue);
				return;
			case RtscPackage.REALTIMESTATECHART__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case RtscPackage.REALTIMESTATECHART__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case RtscPackage.REALTIMESTATECHART__INITIAL_STATE:
				setInitialState((State)newValue);
				return;
			case RtscPackage.REALTIMESTATECHART__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case RtscPackage.REALTIMESTATECHART__CLOCKS:
				getClocks().clear();
				getClocks().addAll((Collection<? extends Clock>)newValue);
				return;
			case RtscPackage.REALTIMESTATECHART__ROUNDS:
				setRounds((Integer)newValue);
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
			case RtscPackage.REALTIMESTATECHART__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RtscPackage.REALTIMESTATECHART__TRANSITIONS:
				getTransitions().clear();
				return;
			case RtscPackage.REALTIMESTATECHART__STATES:
				getStates().clear();
				return;
			case RtscPackage.REALTIMESTATECHART__INITIAL_STATE:
				setInitialState((State)null);
				return;
			case RtscPackage.REALTIMESTATECHART__VARIABLES:
				getVariables().clear();
				return;
			case RtscPackage.REALTIMESTATECHART__CLOCKS:
				getClocks().clear();
				return;
			case RtscPackage.REALTIMESTATECHART__ROUNDS:
				setRounds(ROUNDS_EDEFAULT);
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
			case RtscPackage.REALTIMESTATECHART__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RtscPackage.REALTIMESTATECHART__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case RtscPackage.REALTIMESTATECHART__STATES:
				return states != null && !states.isEmpty();
			case RtscPackage.REALTIMESTATECHART__INITIAL_STATE:
				return initialState != null;
			case RtscPackage.REALTIMESTATECHART__VARIABLES:
				return variables != null && !variables.isEmpty();
			case RtscPackage.REALTIMESTATECHART__CLOCKS:
				return clocks != null && !clocks.isEmpty();
			case RtscPackage.REALTIMESTATECHART__ROUNDS:
				return rounds != ROUNDS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case RtscPackage.REALTIMESTATECHART__NAME: return RtscPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case RtscPackage.NAMED_ELEMENT__NAME: return RtscPackage.REALTIMESTATECHART__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", rounds: ");
		result.append(rounds);
		result.append(')');
		return result.toString();
	}

} //RealtimestatechartImpl
