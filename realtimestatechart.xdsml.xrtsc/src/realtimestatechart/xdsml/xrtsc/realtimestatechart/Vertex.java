/**
 */
package realtimestatechart.xdsml.xrtsc.realtimestatechart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link realtimestatechart.xdsml.xrtsc.realtimestatechart.Vertex#isActive <em>Active</em>}</li>
 * </ul>
 *
 * @see realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartPackage#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends EObject {
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
	 * @see realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartPackage#getVertex_Active()
	 * @model unique="false"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link realtimestatechart.xdsml.xrtsc.realtimestatechart.Vertex#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

} // Vertex
