/**
 */
package rtscTrace.States.rtsc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.muml.xsrtsc.xsrtsc.rtsc.Vertex;

import rtscTrace.States.Vertex_active_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rtscTrace.States.rtsc.TracedVertex#getActiveSequence <em>Active Sequence</em>}</li>
 *   <li>{@link rtscTrace.States.rtsc.TracedVertex#getOriginalObject_Vertex <em>Original Object Vertex</em>}</li>
 * </ul>
 *
 * @see rtscTrace.States.rtsc.RtscPackage#getTracedVertex()
 * @model
 * @generated
 */
public interface TracedVertex extends EObject {
	/**
	 * Returns the value of the '<em><b>Active Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link rtscTrace.States.Vertex_active_Value}.
	 * It is bidirectional and its opposite is '{@link rtscTrace.States.Vertex_active_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Sequence</em>' containment reference list.
	 * @see rtscTrace.States.rtsc.RtscPackage#getTracedVertex_ActiveSequence()
	 * @see rtscTrace.States.Vertex_active_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Vertex_active_Value> getActiveSequence();

	/**
	 * Returns the value of the '<em><b>Original Object Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object Vertex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object Vertex</em>' reference.
	 * @see #setOriginalObject_Vertex(Vertex)
	 * @see rtscTrace.States.rtsc.RtscPackage#getTracedVertex_OriginalObject_Vertex()
	 * @model
	 * @generated
	 */
	Vertex getOriginalObject_Vertex();

	/**
	 * Sets the value of the '{@link rtscTrace.States.rtsc.TracedVertex#getOriginalObject_Vertex <em>Original Object Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object Vertex</em>' reference.
	 * @see #getOriginalObject_Vertex()
	 * @generated
	 */
	void setOriginalObject_Vertex(Vertex value);

} // TracedVertex
