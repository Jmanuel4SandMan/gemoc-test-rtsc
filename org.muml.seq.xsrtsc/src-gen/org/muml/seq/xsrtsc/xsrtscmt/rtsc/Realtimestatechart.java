/**
 */
package org.muml.seq.xsrtsc.xsrtscmt.rtsc;

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
 *   <li>{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getStates <em>States</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getClocks <em>Clocks</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getRounds <em>Rounds</em>}</li>
 * </ul>
 *
 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.RtscPackage#getRealtimestatechart()
 * @model
 * @generated
 */
public interface Realtimestatechart extends Behavior, NamedElement {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Transition}.
	 * It is bidirectional and its opposite is '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Transition#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.RtscPackage#getRealtimestatechart_Transitions()
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.Transition#getStatechart
	 * @model opposite="statechart" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.State}.
	 * It is bidirectional and its opposite is '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.State#getOwningRTSC <em>Owning RTSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.RtscPackage#getRealtimestatechart_States()
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.State#getOwningRTSC
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
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.RtscPackage#getRealtimestatechart_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Variable}.
	 * It is bidirectional and its opposite is '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Variable#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.RtscPackage#getRealtimestatechart_Variables()
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.Variable#getStatechart
	 * @model opposite="statechart" containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Clocks</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Clock}.
	 * It is bidirectional and its opposite is '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Clock#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clocks</em>' containment reference list.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.RtscPackage#getRealtimestatechart_Clocks()
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.Clock#getStatechart
	 * @model opposite="statechart" containment="true"
	 * @generated
	 */
	EList<Clock> getClocks();

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
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.RtscPackage#getRealtimestatechart_Rounds()
	 * @model unique="false"
	 * @generated
	 */
	int getRounds();

	/**
	 * Sets the value of the '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getRounds <em>Rounds</em>}' attribute.
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
	 * @model argsMany="true"
	 * @generated
	 */
	void initialize(EList<String> args);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void step();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sequentialStep();

} // Realtimestatechart
