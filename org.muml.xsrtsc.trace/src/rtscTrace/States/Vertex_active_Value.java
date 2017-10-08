/**
 */
package rtscTrace.States;

import org.eclipse.emf.common.util.EList;

import rtscTrace.States.rtsc.TracedVertex;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex active Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rtscTrace.States.Vertex_active_Value#isActive <em>Active</em>}</li>
 *   <li>{@link rtscTrace.States.Vertex_active_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link rtscTrace.States.Vertex_active_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see rtscTrace.States.StatesPackage#getVertex_active_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Vertex_active_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see rtscTrace.States.StatesPackage#getVertex_active_Value_Active()
	 * @model unique="false"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link rtscTrace.States.Vertex_active_Value#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rtscTrace.States.rtsc.TracedVertex#getActiveSequence <em>Active Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedVertex)
	 * @see rtscTrace.States.StatesPackage#getVertex_active_Value_Parent()
	 * @see rtscTrace.States.rtsc.TracedVertex#getActiveSequence
	 * @model opposite="activeSequence" required="true" transient="false"
	 * @generated
	 */
	TracedVertex getParent();

	/**
	 * Sets the value of the '{@link rtscTrace.States.Vertex_active_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedVertex value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link rtscTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link rtscTrace.States.State#getVertex_active_Values <em>Vertex active Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see rtscTrace.States.StatesPackage#getVertex_active_Value_States()
	 * @see rtscTrace.States.State#getVertex_active_Values
	 * @model opposite="vertex_active_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // Vertex_active_Value
