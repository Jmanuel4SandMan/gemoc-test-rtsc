/**
 */
package org.muml.seq.xsrtsc.xsrtsc.rtsc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.State#getSubStatecharts <em>Sub Statecharts</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.State#isInitial <em>Initial</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.State#isFinal <em>Final</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.State#getOwningRTSC <em>Owning RTSC</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.State#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 * </ul>
 *
 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getState()
 * @model
 * @generated
 */
public interface State extends Vertex, NamedElement {
	/**
	 * Returns the value of the '<em><b>Sub Statecharts</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Statecharts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Statecharts</em>' containment reference list.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getState_SubStatecharts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Realtimestatechart> getSubStatecharts();

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' attribute.
	 * @see #setInitial(boolean)
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getState_Initial()
	 * @model
	 * @generated
	 */
	boolean isInitial();

	/**
	 * Sets the value of the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.State#isInitial <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' attribute.
	 * @see #isInitial()
	 * @generated
	 */
	void setInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getState_Final()
	 * @model
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.State#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Owning RTSC</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning RTSC</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning RTSC</em>' container reference.
	 * @see #setOwningRTSC(Realtimestatechart)
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getState_OwningRTSC()
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getStates
	 * @model opposite="states" required="true" transient="false"
	 * @generated
	 */
	Realtimestatechart getOwningRTSC();

	/**
	 * Sets the value of the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.State#getOwningRTSC <em>Owning RTSC</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning RTSC</em>' container reference.
	 * @see #getOwningRTSC()
	 * @generated
	 */
	void setOwningRTSC(Realtimestatechart value);

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition}.
	 * It is bidirectional and its opposite is '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getState_IncomingTransitions()
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition}.
	 * It is bidirectional and its opposite is '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getState_OutgoingTransitions()
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void entry();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void exit();

} // State
