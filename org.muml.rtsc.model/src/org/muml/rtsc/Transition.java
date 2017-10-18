/**
 */
package org.muml.rtsc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.rtsc.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link org.muml.rtsc.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.muml.rtsc.Transition#getGuards <em>Guards</em>}</li>
 *   <li>{@link org.muml.rtsc.Transition#getClockConstraints <em>Clock Constraints</em>}</li>
 *   <li>{@link org.muml.rtsc.Transition#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link org.muml.rtsc.Transition#getTriggerMessage <em>Trigger Message</em>}</li>
 * </ul>
 *
 * @see org.muml.rtsc.RtscPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.rtsc.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see org.muml.rtsc.RtscPackage#getTransition_Source()
	 * @see org.muml.rtsc.State#getOutgoingTransitions
	 * @model opposite="outgoingTransitions" required="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link org.muml.rtsc.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.rtsc.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see org.muml.rtsc.RtscPackage#getTransition_Target()
	 * @see org.muml.rtsc.State#getIncomingTransitions
	 * @model opposite="incomingTransitions" required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link org.muml.rtsc.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guards</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.rtsc.Guard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guards</em>' containment reference list.
	 * @see org.muml.rtsc.RtscPackage#getTransition_Guards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Guard> getGuards();

	/**
	 * Returns the value of the '<em><b>Clock Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.rtsc.ClockConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Constraints</em>' containment reference list.
	 * @see org.muml.rtsc.RtscPackage#getTransition_ClockConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClockConstraint> getClockConstraints();

	/**
	 * Returns the value of the '<em><b>Statechart</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.rtsc.Realtimestatechart#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statechart</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statechart</em>' container reference.
	 * @see #setStatechart(Realtimestatechart)
	 * @see org.muml.rtsc.RtscPackage#getTransition_Statechart()
	 * @see org.muml.rtsc.Realtimestatechart#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	Realtimestatechart getStatechart();

	/**
	 * Sets the value of the '{@link org.muml.rtsc.Transition#getStatechart <em>Statechart</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart</em>' container reference.
	 * @see #getStatechart()
	 * @generated
	 */
	void setStatechart(Realtimestatechart value);

	/**
	 * Returns the value of the '<em><b>Trigger Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.rtsc.MessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Message</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Message</em>' containment reference list.
	 * @see org.muml.rtsc.RtscPackage#getTransition_TriggerMessage()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageType> getTriggerMessage();

} // Transition
