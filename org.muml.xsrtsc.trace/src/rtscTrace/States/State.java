/**
 */
package rtscTrace.States;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import rtscTrace.Steps.SpecificStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rtscTrace.States.State#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link rtscTrace.States.State#getRealtimestatechart_rounds_Values <em>Realtimestatechart rounds Values</em>}</li>
 *   <li>{@link rtscTrace.States.State#getStartedSteps <em>Started Steps</em>}</li>
 *   <li>{@link rtscTrace.States.State#getTransition_hitCount_Values <em>Transition hit Count Values</em>}</li>
 *   <li>{@link rtscTrace.States.State#getVertex_active_Values <em>Vertex active Values</em>}</li>
 * </ul>
 *
 * @see rtscTrace.States.StatesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Ended Steps</b></em>' reference list.
	 * The list contents are of type {@link rtscTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link rtscTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Steps</em>' reference list.
	 * @see rtscTrace.States.StatesPackage#getState_EndedSteps()
	 * @see rtscTrace.Steps.SpecificStep#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<SpecificStep> getEndedSteps();

	/**
	 * Returns the value of the '<em><b>Realtimestatechart rounds Values</b></em>' reference list.
	 * The list contents are of type {@link rtscTrace.States.Realtimestatechart_rounds_Value}.
	 * It is bidirectional and its opposite is '{@link rtscTrace.States.Realtimestatechart_rounds_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realtimestatechart rounds Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realtimestatechart rounds Values</em>' reference list.
	 * @see rtscTrace.States.StatesPackage#getState_Realtimestatechart_rounds_Values()
	 * @see rtscTrace.States.Realtimestatechart_rounds_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Realtimestatechart_rounds_Value> getRealtimestatechart_rounds_Values();

	/**
	 * Returns the value of the '<em><b>Started Steps</b></em>' reference list.
	 * The list contents are of type {@link rtscTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link rtscTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Steps</em>' reference list.
	 * @see rtscTrace.States.StatesPackage#getState_StartedSteps()
	 * @see rtscTrace.Steps.SpecificStep#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<SpecificStep> getStartedSteps();

	/**
	 * Returns the value of the '<em><b>Transition hit Count Values</b></em>' reference list.
	 * The list contents are of type {@link rtscTrace.States.Transition_hitCount_Value}.
	 * It is bidirectional and its opposite is '{@link rtscTrace.States.Transition_hitCount_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition hit Count Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition hit Count Values</em>' reference list.
	 * @see rtscTrace.States.StatesPackage#getState_Transition_hitCount_Values()
	 * @see rtscTrace.States.Transition_hitCount_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Transition_hitCount_Value> getTransition_hitCount_Values();

	/**
	 * Returns the value of the '<em><b>Vertex active Values</b></em>' reference list.
	 * The list contents are of type {@link rtscTrace.States.Vertex_active_Value}.
	 * It is bidirectional and its opposite is '{@link rtscTrace.States.Vertex_active_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertex active Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertex active Values</em>' reference list.
	 * @see rtscTrace.States.StatesPackage#getState_Vertex_active_Values()
	 * @see rtscTrace.States.Vertex_active_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Vertex_active_Value> getVertex_active_Values();

} // State
