/**
 */
package realtimestatechart.xdsml.xrtsc.realtimestatechart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link realtimestatechart.xdsml.xrtsc.realtimestatechart.State#getSubStatecharts <em>Sub Statecharts</em>}</li>
 *   <li>{@link realtimestatechart.xdsml.xrtsc.realtimestatechart.State#getStatePoints <em>State Points</em>}</li>
 *   <li>{@link realtimestatechart.xdsml.xrtsc.realtimestatechart.State#isInitial <em>Initial</em>}</li>
 *   <li>{@link realtimestatechart.xdsml.xrtsc.realtimestatechart.State#isFinal <em>Final</em>}</li>
 * </ul>
 *
 * @see realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartPackage#getState()
 * @model
 * @generated
 */
public interface State extends Vertex, NamedElement {
	/**
	 * Returns the value of the '<em><b>Sub Statecharts</b></em>' containment reference list.
	 * The list contents are of type {@link realtimestatechart.xdsml.xrtsc.realtimestatechart.Realtimestatechart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Statecharts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Statecharts</em>' containment reference list.
	 * @see realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartPackage#getState_SubStatecharts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Realtimestatechart> getSubStatecharts();

	/**
	 * Returns the value of the '<em><b>State Points</b></em>' containment reference list.
	 * The list contents are of type {@link realtimestatechart.xdsml.xrtsc.realtimestatechart.StatePoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Points</em>' containment reference list.
	 * @see realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartPackage#getState_StatePoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<StatePoint> getStatePoints();

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' attribute.
	 * @see #setInitial(boolean)
	 * @see realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartPackage#getState_Initial()
	 * @model
	 * @generated
	 */
	boolean isInitial();

	/**
	 * Sets the value of the '{@link realtimestatechart.xdsml.xrtsc.realtimestatechart.State#isInitial <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' attribute.
	 * @see #isInitial()
	 * @generated
	 */
	void setInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see realtimestatechart.xdsml.xrtsc.realtimestatechart.RealtimestatechartPackage#getState_Final()
	 * @model
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link realtimestatechart.xdsml.xrtsc.realtimestatechart.State#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

} // State
