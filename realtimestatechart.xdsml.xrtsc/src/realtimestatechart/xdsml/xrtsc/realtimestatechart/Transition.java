/**
 */
package realtimestatechart.xdsml.xrtsc.realtimestatechart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition#getHitCount <em>Hit Count</em>}</li>
 * </ul>
 *
 * @see realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Vertex)
	 * @see realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartPackage#getTransition_Source()
	 * @model required="true"
	 * @generated
	 */
	Vertex getSource();

	/**
	 * Sets the value of the '{@link realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Vertex value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Vertex)
	 * @see realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartPackage#getTransition_Target()
	 * @model required="true"
	 * @generated
	 */
	Vertex getTarget();

	/**
	 * Sets the value of the '{@link realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Vertex value);

	/**
	 * Returns the value of the '<em><b>Hit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hit Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hit Count</em>' attribute.
	 * @see #setHitCount(int)
	 * @see realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartPackage#getTransition_HitCount()
	 * @model unique="false"
	 * @generated
	 */
	int getHitCount();

	/**
	 * Sets the value of the '{@link realtimestatechart.xdsml.xrtsc.realtimestatechart.Transition#getHitCount <em>Hit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hit Count</em>' attribute.
	 * @see #getHitCount()
	 * @generated
	 */
	void setHitCount(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean canFire();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fire();

} // Transition
