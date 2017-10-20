/**
 */
package org.muml.seq.xsrtsc.xsrtsc.rtsc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageTypeRepository#getMessageTypes <em>Message Types</em>}</li>
 * </ul>
 *
 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getMessageTypeRepository()
 * @model
 * @generated
 */
public interface MessageTypeRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Types</em>' containment reference list.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getMessageTypeRepository_MessageTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageType> getMessageTypes();

} // MessageTypeRepository
