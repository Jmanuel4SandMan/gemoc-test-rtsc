/**
 */
package rtscTrace.States.rtsc;

import org.eclipse.emf.common.util.EList;

import org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart;

import rtscTrace.States.Realtimestatechart_rounds_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Realtimestatechart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rtscTrace.States.rtsc.TracedRealtimestatechart#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link rtscTrace.States.rtsc.TracedRealtimestatechart#getRoundsSequence <em>Rounds Sequence</em>}</li>
 * </ul>
 *
 * @see rtscTrace.States.rtsc.RtscPackage#getTracedRealtimestatechart()
 * @model
 * @generated
 */
public interface TracedRealtimestatechart extends TracedBehavior, TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Realtimestatechart)
	 * @see rtscTrace.States.rtsc.RtscPackage#getTracedRealtimestatechart_OriginalObject()
	 * @model
	 * @generated
	 */
	Realtimestatechart getOriginalObject();

	/**
	 * Sets the value of the '{@link rtscTrace.States.rtsc.TracedRealtimestatechart#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Realtimestatechart value);

	/**
	 * Returns the value of the '<em><b>Rounds Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link rtscTrace.States.Realtimestatechart_rounds_Value}.
	 * It is bidirectional and its opposite is '{@link rtscTrace.States.Realtimestatechart_rounds_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rounds Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rounds Sequence</em>' containment reference list.
	 * @see rtscTrace.States.rtsc.RtscPackage#getTracedRealtimestatechart_RoundsSequence()
	 * @see rtscTrace.States.Realtimestatechart_rounds_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Realtimestatechart_rounds_Value> getRoundsSequence();

} // TracedRealtimestatechart
