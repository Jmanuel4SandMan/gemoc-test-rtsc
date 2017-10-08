/**
 */
package rtscTrace.States;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rtscTrace.States.StatesFactory
 * @model kind="package"
 * @generated
 */
public interface StatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "States";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "rtscTrace_States";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracedclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesPackage eINSTANCE = rtscTrace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link rtscTrace.States.Value <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.States.Value
	 * @see rtscTrace.States.impl.StatesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 3;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__STATES_NO_OPPOSITE = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link rtscTrace.States.impl.Realtimestatechart_rounds_ValueImpl <em>Realtimestatechart rounds Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.States.impl.Realtimestatechart_rounds_ValueImpl
	 * @see rtscTrace.States.impl.StatesPackageImpl#getRealtimestatechart_rounds_Value()
	 * @generated
	 */
	int REALTIMESTATECHART_ROUNDS_VALUE = 0;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESTATECHART_ROUNDS_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESTATECHART_ROUNDS_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESTATECHART_ROUNDS_VALUE__ROUNDS = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESTATECHART_ROUNDS_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Realtimestatechart rounds Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESTATECHART_ROUNDS_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link rtscTrace.States.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.States.impl.StateImpl
	 * @see rtscTrace.States.impl.StatesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENDED_STEPS = 0;

	/**
	 * The feature id for the '<em><b>Realtimestatechart rounds Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REALTIMESTATECHART_ROUNDS_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STARTED_STEPS = 2;

	/**
	 * The feature id for the '<em><b>Transition hit Count Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITION_HIT_COUNT_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Vertex active Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VERTEX_ACTIVE_VALUES = 4;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link rtscTrace.States.impl.Transition_hitCount_ValueImpl <em>Transition hit Count Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.States.impl.Transition_hitCount_ValueImpl
	 * @see rtscTrace.States.impl.StatesPackageImpl#getTransition_hitCount_Value()
	 * @generated
	 */
	int TRANSITION_HIT_COUNT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_HIT_COUNT_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Hit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_HIT_COUNT_VALUE__HIT_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_HIT_COUNT_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_HIT_COUNT_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition hit Count Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_HIT_COUNT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link rtscTrace.States.impl.Vertex_active_ValueImpl <em>Vertex active Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.States.impl.Vertex_active_ValueImpl
	 * @see rtscTrace.States.impl.StatesPackageImpl#getVertex_active_Value()
	 * @generated
	 */
	int VERTEX_ACTIVE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_ACTIVE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_ACTIVE_VALUE__ACTIVE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_ACTIVE_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_ACTIVE_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vertex active Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_ACTIVE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link rtscTrace.States.Realtimestatechart_rounds_Value <em>Realtimestatechart rounds Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realtimestatechart rounds Value</em>'.
	 * @see rtscTrace.States.Realtimestatechart_rounds_Value
	 * @generated
	 */
	EClass getRealtimestatechart_rounds_Value();

	/**
	 * Returns the meta object for the container reference '{@link rtscTrace.States.Realtimestatechart_rounds_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see rtscTrace.States.Realtimestatechart_rounds_Value#getParent()
	 * @see #getRealtimestatechart_rounds_Value()
	 * @generated
	 */
	EReference getRealtimestatechart_rounds_Value_Parent();

	/**
	 * Returns the meta object for the attribute '{@link rtscTrace.States.Realtimestatechart_rounds_Value#getRounds <em>Rounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounds</em>'.
	 * @see rtscTrace.States.Realtimestatechart_rounds_Value#getRounds()
	 * @see #getRealtimestatechart_rounds_Value()
	 * @generated
	 */
	EAttribute getRealtimestatechart_rounds_Value_Rounds();

	/**
	 * Returns the meta object for the reference list '{@link rtscTrace.States.Realtimestatechart_rounds_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see rtscTrace.States.Realtimestatechart_rounds_Value#getStates()
	 * @see #getRealtimestatechart_rounds_Value()
	 * @generated
	 */
	EReference getRealtimestatechart_rounds_Value_States();

	/**
	 * Returns the meta object for class '{@link rtscTrace.States.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see rtscTrace.States.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link rtscTrace.States.State#getEndedSteps <em>Ended Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ended Steps</em>'.
	 * @see rtscTrace.States.State#getEndedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EndedSteps();

	/**
	 * Returns the meta object for the reference list '{@link rtscTrace.States.State#getRealtimestatechart_rounds_Values <em>Realtimestatechart rounds Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realtimestatechart rounds Values</em>'.
	 * @see rtscTrace.States.State#getRealtimestatechart_rounds_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Realtimestatechart_rounds_Values();

	/**
	 * Returns the meta object for the reference list '{@link rtscTrace.States.State#getStartedSteps <em>Started Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Started Steps</em>'.
	 * @see rtscTrace.States.State#getStartedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartedSteps();

	/**
	 * Returns the meta object for the reference list '{@link rtscTrace.States.State#getTransition_hitCount_Values <em>Transition hit Count Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition hit Count Values</em>'.
	 * @see rtscTrace.States.State#getTransition_hitCount_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transition_hitCount_Values();

	/**
	 * Returns the meta object for the reference list '{@link rtscTrace.States.State#getVertex_active_Values <em>Vertex active Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vertex active Values</em>'.
	 * @see rtscTrace.States.State#getVertex_active_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Vertex_active_Values();

	/**
	 * Returns the meta object for class '{@link rtscTrace.States.Transition_hitCount_Value <em>Transition hit Count Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition hit Count Value</em>'.
	 * @see rtscTrace.States.Transition_hitCount_Value
	 * @generated
	 */
	EClass getTransition_hitCount_Value();

	/**
	 * Returns the meta object for the attribute '{@link rtscTrace.States.Transition_hitCount_Value#getHitCount <em>Hit Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hit Count</em>'.
	 * @see rtscTrace.States.Transition_hitCount_Value#getHitCount()
	 * @see #getTransition_hitCount_Value()
	 * @generated
	 */
	EAttribute getTransition_hitCount_Value_HitCount();

	/**
	 * Returns the meta object for the container reference '{@link rtscTrace.States.Transition_hitCount_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see rtscTrace.States.Transition_hitCount_Value#getParent()
	 * @see #getTransition_hitCount_Value()
	 * @generated
	 */
	EReference getTransition_hitCount_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link rtscTrace.States.Transition_hitCount_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see rtscTrace.States.Transition_hitCount_Value#getStates()
	 * @see #getTransition_hitCount_Value()
	 * @generated
	 */
	EReference getTransition_hitCount_Value_States();

	/**
	 * Returns the meta object for class '{@link rtscTrace.States.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see rtscTrace.States.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the reference list '{@link rtscTrace.States.Value#getStatesNoOpposite <em>States No Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States No Opposite</em>'.
	 * @see rtscTrace.States.Value#getStatesNoOpposite()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_StatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link rtscTrace.States.Vertex_active_Value <em>Vertex active Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex active Value</em>'.
	 * @see rtscTrace.States.Vertex_active_Value
	 * @generated
	 */
	EClass getVertex_active_Value();

	/**
	 * Returns the meta object for the attribute '{@link rtscTrace.States.Vertex_active_Value#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see rtscTrace.States.Vertex_active_Value#isActive()
	 * @see #getVertex_active_Value()
	 * @generated
	 */
	EAttribute getVertex_active_Value_Active();

	/**
	 * Returns the meta object for the container reference '{@link rtscTrace.States.Vertex_active_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see rtscTrace.States.Vertex_active_Value#getParent()
	 * @see #getVertex_active_Value()
	 * @generated
	 */
	EReference getVertex_active_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link rtscTrace.States.Vertex_active_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see rtscTrace.States.Vertex_active_Value#getStates()
	 * @see #getVertex_active_Value()
	 * @generated
	 */
	EReference getVertex_active_Value_States();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesFactory getStatesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rtscTrace.States.impl.Realtimestatechart_rounds_ValueImpl <em>Realtimestatechart rounds Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.States.impl.Realtimestatechart_rounds_ValueImpl
		 * @see rtscTrace.States.impl.StatesPackageImpl#getRealtimestatechart_rounds_Value()
		 * @generated
		 */
		EClass REALTIMESTATECHART_ROUNDS_VALUE = eINSTANCE.getRealtimestatechart_rounds_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIMESTATECHART_ROUNDS_VALUE__PARENT = eINSTANCE.getRealtimestatechart_rounds_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>Rounds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIMESTATECHART_ROUNDS_VALUE__ROUNDS = eINSTANCE.getRealtimestatechart_rounds_Value_Rounds();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIMESTATECHART_ROUNDS_VALUE__STATES = eINSTANCE.getRealtimestatechart_rounds_Value_States();

		/**
		 * The meta object literal for the '{@link rtscTrace.States.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.States.impl.StateImpl
		 * @see rtscTrace.States.impl.StatesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Ended Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENDED_STEPS = eINSTANCE.getState_EndedSteps();

		/**
		 * The meta object literal for the '<em><b>Realtimestatechart rounds Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__REALTIMESTATECHART_ROUNDS_VALUES = eINSTANCE.getState_Realtimestatechart_rounds_Values();

		/**
		 * The meta object literal for the '<em><b>Started Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STARTED_STEPS = eINSTANCE.getState_StartedSteps();

		/**
		 * The meta object literal for the '<em><b>Transition hit Count Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITION_HIT_COUNT_VALUES = eINSTANCE.getState_Transition_hitCount_Values();

		/**
		 * The meta object literal for the '<em><b>Vertex active Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__VERTEX_ACTIVE_VALUES = eINSTANCE.getState_Vertex_active_Values();

		/**
		 * The meta object literal for the '{@link rtscTrace.States.impl.Transition_hitCount_ValueImpl <em>Transition hit Count Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.States.impl.Transition_hitCount_ValueImpl
		 * @see rtscTrace.States.impl.StatesPackageImpl#getTransition_hitCount_Value()
		 * @generated
		 */
		EClass TRANSITION_HIT_COUNT_VALUE = eINSTANCE.getTransition_hitCount_Value();

		/**
		 * The meta object literal for the '<em><b>Hit Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_HIT_COUNT_VALUE__HIT_COUNT = eINSTANCE.getTransition_hitCount_Value_HitCount();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_HIT_COUNT_VALUE__PARENT = eINSTANCE.getTransition_hitCount_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_HIT_COUNT_VALUE__STATES = eINSTANCE.getTransition_hitCount_Value_States();

		/**
		 * The meta object literal for the '{@link rtscTrace.States.Value <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.States.Value
		 * @see rtscTrace.States.impl.StatesPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>States No Opposite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__STATES_NO_OPPOSITE = eINSTANCE.getValue_StatesNoOpposite();

		/**
		 * The meta object literal for the '{@link rtscTrace.States.impl.Vertex_active_ValueImpl <em>Vertex active Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.States.impl.Vertex_active_ValueImpl
		 * @see rtscTrace.States.impl.StatesPackageImpl#getVertex_active_Value()
		 * @generated
		 */
		EClass VERTEX_ACTIVE_VALUE = eINSTANCE.getVertex_active_Value();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX_ACTIVE_VALUE__ACTIVE = eINSTANCE.getVertex_active_Value_Active();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX_ACTIVE_VALUE__PARENT = eINSTANCE.getVertex_active_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX_ACTIVE_VALUE__STATES = eINSTANCE.getVertex_active_Value_States();

	}

} //StatesPackage
