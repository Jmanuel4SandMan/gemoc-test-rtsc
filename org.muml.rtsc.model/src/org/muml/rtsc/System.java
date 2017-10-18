/**
 */
package org.muml.rtsc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.rtsc.System#getStatecharts <em>Statecharts</em>}</li>
 *   <li>{@link org.muml.rtsc.System#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.muml.rtsc.System#getMessageTypeRepo <em>Message Type Repo</em>}</li>
 * </ul>
 *
 * @see org.muml.rtsc.RtscPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Statecharts</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.rtsc.Realtimestatechart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statecharts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statecharts</em>' containment reference list.
	 * @see org.muml.rtsc.RtscPackage#getSystem_Statecharts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Realtimestatechart> getStatecharts();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.rtsc.CoordinationProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference list.
	 * @see org.muml.rtsc.RtscPackage#getSystem_Protocol()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoordinationProtocol> getProtocol();

	/**
	 * Returns the value of the '<em><b>Message Type Repo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Type Repo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type Repo</em>' containment reference.
	 * @see #setMessageTypeRepo(MessageTypeRepository)
	 * @see org.muml.rtsc.RtscPackage#getSystem_MessageTypeRepo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MessageTypeRepository getMessageTypeRepo();

	/**
	 * Sets the value of the '{@link org.muml.rtsc.System#getMessageTypeRepo <em>Message Type Repo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type Repo</em>' containment reference.
	 * @see #getMessageTypeRepo()
	 * @generated
	 */
	void setMessageTypeRepo(MessageTypeRepository value);

} // System
