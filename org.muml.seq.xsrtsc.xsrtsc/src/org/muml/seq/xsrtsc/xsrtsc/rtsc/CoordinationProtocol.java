/**
 */
package org.muml.seq.xsrtsc.xsrtsc.rtsc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.CoordinationProtocol#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.CoordinationProtocol#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getCoordinationProtocol()
 * @model
 * @generated
 */
public interface CoordinationProtocol extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getCoordinationProtocol_Ports()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference.
	 * @see #setConnector(Connector)
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getCoordinationProtocol_Connector()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.CoordinationProtocol#getConnector <em>Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' containment reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

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
	 * @model argumentsMany="true"
	 * @generated
	 */
	void initialize(EList<String> arguments);

} // CoordinationProtocol
