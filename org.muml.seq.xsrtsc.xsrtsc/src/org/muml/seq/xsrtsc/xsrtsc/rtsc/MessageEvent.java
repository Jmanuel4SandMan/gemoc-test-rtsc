/**
 */
package org.muml.seq.xsrtsc.xsrtsc.rtsc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageEvent#getMessageType <em>Message Type</em>}</li>
 * </ul>
 *
 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getMessageEvent()
 * @model
 * @generated
 */
public interface MessageEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' reference.
	 * @see #setMessageType(MessageType)
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getMessageEvent_MessageType()
	 * @model required="true"
	 * @generated
	 */
	MessageType getMessageType();

	/**
	 * Sets the value of the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageEvent#getMessageType <em>Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' reference.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(MessageType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // MessageEvent
