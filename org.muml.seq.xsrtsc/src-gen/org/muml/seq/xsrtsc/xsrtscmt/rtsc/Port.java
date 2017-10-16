/**
 */
package org.muml.seq.xsrtsc.xsrtscmt.rtsc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Port#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Port#getIncomingBuffer <em>Incoming Buffer</em>}</li>
 * </ul>
 *
 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.RtscPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends BehavioralElement {
	/**
	 * Returns the value of the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour</em>' reference.
	 * @see #setBehaviour(Behavior)
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.RtscPackage#getPort_Behaviour()
	 * @model
	 * @generated
	 */
	Behavior getBehaviour();

	/**
	 * Sets the value of the '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Port#getBehaviour <em>Behaviour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour</em>' reference.
	 * @see #getBehaviour()
	 * @generated
	 */
	void setBehaviour(Behavior value);

	/**
	 * Returns the value of the '<em><b>Incoming Buffer</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.MessageBuffer#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Buffer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Buffer</em>' containment reference.
	 * @see #setIncomingBuffer(MessageBuffer)
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.RtscPackage#getPort_IncomingBuffer()
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.MessageBuffer#getPort
	 * @model opposite="port" containment="true"
	 * @generated
	 */
	MessageBuffer getIncomingBuffer();

	/**
	 * Sets the value of the '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Port#getIncomingBuffer <em>Incoming Buffer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Buffer</em>' containment reference.
	 * @see #getIncomingBuffer()
	 * @generated
	 */
	void setIncomingBuffer(MessageBuffer value);

} // Port
