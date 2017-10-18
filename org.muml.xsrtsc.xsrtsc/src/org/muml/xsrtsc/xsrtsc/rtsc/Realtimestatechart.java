/**
 */
package org.muml.xsrtsc.xsrtsc.rtsc;

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
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getStates <em>States</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getRounds <em>Rounds</em>}</li>
 * </ul>
 *
 * @see org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage#getRealtimestatechart()
 * @model
 * @generated
 */
public interface Realtimestatechart extends Behavior, NamedElement {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.xsrtsc.xsrtsc.rtsc.Transition}.
	 * It is bidirectional and its opposite is '{@link org.muml.xsrtsc.xsrtsc.rtsc.Transition#getOwningRTSC <em>Owning RTSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage#getRealtimestatechart_Transitions()
	 * @see org.muml.xsrtsc.xsrtsc.rtsc.Transition#getOwningRTSC
	 * @model opposite="owningRTSC" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.xsrtsc.xsrtsc.rtsc.State}.
	 * It is bidirectional and its opposite is '{@link org.muml.xsrtsc.xsrtsc.rtsc.State#getOwningRTSC <em>Owning RTSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage#getRealtimestatechart_States()
	 * @see org.muml.xsrtsc.xsrtsc.rtsc.State#getOwningRTSC
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
	 * @see org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage#getRealtimestatechart_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Rounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rounds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rounds</em>' attribute.
	 * @see #setRounds(int)
	 * @see org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage#getRealtimestatechart_Rounds()
	 * @model unique="false"
	 * @generated
	 */
	int getRounds();

	/**
	 * Sets the value of the '{@link org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getRounds <em>Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rounds</em>' attribute.
	 * @see #getRounds()
	 * @generated
	 */
	void setRounds(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void main();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initRTSC();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void step();

} // Realtimestatechart
