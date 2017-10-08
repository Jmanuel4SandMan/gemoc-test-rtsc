/**
 */
package rtscTrace.States.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rtscTrace.States.Realtimestatechart_rounds_Value;
import rtscTrace.States.State;
import rtscTrace.States.StatesPackage;
import rtscTrace.States.Transition_hitCount_Value;
import rtscTrace.States.Vertex_active_Value;

import rtscTrace.Steps.SpecificStep;
import rtscTrace.Steps.StepsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rtscTrace.States.impl.StateImpl#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link rtscTrace.States.impl.StateImpl#getRealtimestatechart_rounds_Values <em>Realtimestatechart rounds Values</em>}</li>
 *   <li>{@link rtscTrace.States.impl.StateImpl#getStartedSteps <em>Started Steps</em>}</li>
 *   <li>{@link rtscTrace.States.impl.StateImpl#getTransition_hitCount_Values <em>Transition hit Count Values</em>}</li>
 *   <li>{@link rtscTrace.States.impl.StateImpl#getVertex_active_Values <em>Vertex active Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getEndedSteps() <em>Ended Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> endedSteps;

	/**
	 * The cached value of the '{@link #getRealtimestatechart_rounds_Values() <em>Realtimestatechart rounds Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealtimestatechart_rounds_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Realtimestatechart_rounds_Value> realtimestatechart_rounds_Values;

	/**
	 * The cached value of the '{@link #getStartedSteps() <em>Started Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> startedSteps;

	/**
	 * The cached value of the '{@link #getTransition_hitCount_Values() <em>Transition hit Count Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition_hitCount_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition_hitCount_Value> transition_hitCount_Values;

	/**
	 * The cached value of the '{@link #getVertex_active_Values() <em>Vertex active Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertex_active_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex_active_Value> vertex_active_Values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getEndedSteps() {
		if (endedSteps == null) {
			endedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__ENDED_STEPS, StepsPackage.SPECIFIC_STEP__ENDING_STATE);
		}
		return endedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realtimestatechart_rounds_Value> getRealtimestatechart_rounds_Values() {
		if (realtimestatechart_rounds_Values == null) {
			realtimestatechart_rounds_Values = new EObjectWithInverseResolvingEList.ManyInverse<Realtimestatechart_rounds_Value>(Realtimestatechart_rounds_Value.class, this, StatesPackage.STATE__REALTIMESTATECHART_ROUNDS_VALUES, StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__STATES);
		}
		return realtimestatechart_rounds_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getStartedSteps() {
		if (startedSteps == null) {
			startedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__STARTED_STEPS, StepsPackage.SPECIFIC_STEP__STARTING_STATE);
		}
		return startedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition_hitCount_Value> getTransition_hitCount_Values() {
		if (transition_hitCount_Values == null) {
			transition_hitCount_Values = new EObjectWithInverseResolvingEList.ManyInverse<Transition_hitCount_Value>(Transition_hitCount_Value.class, this, StatesPackage.STATE__TRANSITION_HIT_COUNT_VALUES, StatesPackage.TRANSITION_HIT_COUNT_VALUE__STATES);
		}
		return transition_hitCount_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex_active_Value> getVertex_active_Values() {
		if (vertex_active_Values == null) {
			vertex_active_Values = new EObjectWithInverseResolvingEList.ManyInverse<Vertex_active_Value>(Vertex_active_Value.class, this, StatesPackage.STATE__VERTEX_ACTIVE_VALUES, StatesPackage.VERTEX_ACTIVE_VALUE__STATES);
		}
		return vertex_active_Values;
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
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__REALTIMESTATECHART_ROUNDS_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealtimestatechart_rounds_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__TRANSITION_HIT_COUNT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransition_hitCount_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__VERTEX_ACTIVE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVertex_active_Values()).basicAdd(otherEnd, msgs);
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
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<?>)getEndedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__REALTIMESTATECHART_ROUNDS_VALUES:
				return ((InternalEList<?>)getRealtimestatechart_rounds_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<?>)getStartedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__TRANSITION_HIT_COUNT_VALUES:
				return ((InternalEList<?>)getTransition_hitCount_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__VERTEX_ACTIVE_VALUES:
				return ((InternalEList<?>)getVertex_active_Values()).basicRemove(otherEnd, msgs);
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
			case StatesPackage.STATE__ENDED_STEPS:
				return getEndedSteps();
			case StatesPackage.STATE__REALTIMESTATECHART_ROUNDS_VALUES:
				return getRealtimestatechart_rounds_Values();
			case StatesPackage.STATE__STARTED_STEPS:
				return getStartedSteps();
			case StatesPackage.STATE__TRANSITION_HIT_COUNT_VALUES:
				return getTransition_hitCount_Values();
			case StatesPackage.STATE__VERTEX_ACTIVE_VALUES:
				return getVertex_active_Values();
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
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				getEndedSteps().addAll((Collection<? extends SpecificStep>)newValue);
				return;
			case StatesPackage.STATE__REALTIMESTATECHART_ROUNDS_VALUES:
				getRealtimestatechart_rounds_Values().clear();
				getRealtimestatechart_rounds_Values().addAll((Collection<? extends Realtimestatechart_rounds_Value>)newValue);
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				getStartedSteps().addAll((Collection<? extends SpecificStep>)newValue);
				return;
			case StatesPackage.STATE__TRANSITION_HIT_COUNT_VALUES:
				getTransition_hitCount_Values().clear();
				getTransition_hitCount_Values().addAll((Collection<? extends Transition_hitCount_Value>)newValue);
				return;
			case StatesPackage.STATE__VERTEX_ACTIVE_VALUES:
				getVertex_active_Values().clear();
				getVertex_active_Values().addAll((Collection<? extends Vertex_active_Value>)newValue);
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
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				return;
			case StatesPackage.STATE__REALTIMESTATECHART_ROUNDS_VALUES:
				getRealtimestatechart_rounds_Values().clear();
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				return;
			case StatesPackage.STATE__TRANSITION_HIT_COUNT_VALUES:
				getTransition_hitCount_Values().clear();
				return;
			case StatesPackage.STATE__VERTEX_ACTIVE_VALUES:
				getVertex_active_Values().clear();
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
			case StatesPackage.STATE__ENDED_STEPS:
				return endedSteps != null && !endedSteps.isEmpty();
			case StatesPackage.STATE__REALTIMESTATECHART_ROUNDS_VALUES:
				return realtimestatechart_rounds_Values != null && !realtimestatechart_rounds_Values.isEmpty();
			case StatesPackage.STATE__STARTED_STEPS:
				return startedSteps != null && !startedSteps.isEmpty();
			case StatesPackage.STATE__TRANSITION_HIT_COUNT_VALUES:
				return transition_hitCount_Values != null && !transition_hitCount_Values.isEmpty();
			case StatesPackage.STATE__VERTEX_ACTIVE_VALUES:
				return vertex_active_Values != null && !vertex_active_Values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
