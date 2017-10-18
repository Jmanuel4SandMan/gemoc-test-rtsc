/**
 */
package org.muml.rtsc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realtimestatechart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.rtsc.Realtimestatechart#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.muml.rtsc.Realtimestatechart#getStates <em>States</em>}</li>
 *   <li>{@link org.muml.rtsc.Realtimestatechart#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @see org.muml.rtsc.RtscPackage#getRealtimestatechart()
 * @model
 * @generated
 */
public interface Realtimestatechart extends Behavior, NamedElement {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.rtsc.Transition}.
	 * It is bidirectional and its opposite is '{@link org.muml.rtsc.Transition#getOwningRTSC <em>Owning RTSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.muml.rtsc.RtscPackage#getRealtimestatechart_Transitions()
	 * @see org.muml.rtsc.Transition#getOwningRTSC
	 * @model opposite="owningRTSC" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.rtsc.State}.
	 * It is bidirectional and its opposite is '{@link org.muml.rtsc.State#getOwningRTSC <em>Owning RTSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.muml.rtsc.RtscPackage#getRealtimestatechart_States()
	 * @see org.muml.rtsc.State#getOwningRTSC
	 * @model opposite="owningRTSC" containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see org.muml.rtsc.RtscPackage#getRealtimestatechart_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link org.muml.rtsc.Realtimestatechart#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

} // Realtimestatechart
