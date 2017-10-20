/**
 */
package org.muml.seq.xsrtsc.xsrtsc.rtsc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageBuffer#getPort <em>Port</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageBuffer#getTypes <em>Types</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageBuffer#getAllMessages <em>All Messages</em>}</li>
 * </ul>
 *
 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getMessageBuffer()
 * @model
 * @generated
 */
public interface MessageBuffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Port#getIncomingBuffer <em>Incoming Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' container reference.
	 * @see #setPort(Port)
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getMessageBuffer_Port()
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Port#getIncomingBuffer
	 * @model opposite="incomingBuffer" required="true" transient="false"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageBuffer#getPort <em>Port</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' container reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getMessageBuffer_Types()
	 * @model required="true"
	 * @generated
	 */
	EList<MessageType> getTypes();

	/**
	 * Returns the value of the '<em><b>All Messages</b></em>' reference list.
	 * The list contents are of type {@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Messages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Messages</em>' reference list.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getMessageBuffer_AllMessages()
	 * @model
	 * @generated
	 */
	EList<Message> getAllMessages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Message getMessage(MessageType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasMessage(MessageType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addMessage(Message message);

} // MessageBuffer
