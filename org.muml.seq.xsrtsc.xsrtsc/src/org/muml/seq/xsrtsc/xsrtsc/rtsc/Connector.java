/**
 */
package org.muml.seq.xsrtsc.xsrtsc.rtsc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Connector#getEndpoints <em>Endpoints</em>}</li>
 * </ul>
 *
 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Endpoints</b></em>' reference list.
	 * The list contents are of type {@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Port}.
	 * It is bidirectional and its opposite is '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Port#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoints</em>' reference list.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage#getConnector_Endpoints()
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Port#getConnector
	 * @model opposite="connector" lower="2" upper="2"
	 * @generated
	 */
	EList<Port> getEndpoints();

} // Connector
