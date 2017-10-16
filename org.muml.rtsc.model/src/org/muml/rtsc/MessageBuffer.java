/**
 */
package org.muml.rtsc;

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
 *   <li>{@link org.muml.rtsc.MessageBuffer#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.muml.rtsc.RtscPackage#getMessageBuffer()
 * @model
 * @generated
 */
public interface MessageBuffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.rtsc.Port#getIncomingBuffer <em>Incoming Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' container reference.
	 * @see #setPort(Port)
	 * @see org.muml.rtsc.RtscPackage#getMessageBuffer_Port()
	 * @see org.muml.rtsc.Port#getIncomingBuffer
	 * @model opposite="incomingBuffer" required="true" transient="false"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link org.muml.rtsc.MessageBuffer#getPort <em>Port</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' container reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

} // MessageBuffer
