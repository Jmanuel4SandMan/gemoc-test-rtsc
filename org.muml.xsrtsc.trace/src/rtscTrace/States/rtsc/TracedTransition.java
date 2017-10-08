/**
 */
package rtscTrace.States.rtsc;

import org.eclipse.emf.common.util.EList;

import org.muml.xsrtsc.xsrtsc.rtsc.Transition;

import rtscTrace.States.Transition_hitCount_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rtscTrace.States.rtsc.TracedTransition#getHitCountSequence <em>Hit Count Sequence</em>}</li>
 *   <li>{@link rtscTrace.States.rtsc.TracedTransition#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see rtscTrace.States.rtsc.RtscPackage#getTracedTransition()
 * @model
 * @generated
 */
public interface TracedTransition extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Hit Count Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link rtscTrace.States.Transition_hitCount_Value}.
	 * It is bidirectional and its opposite is '{@link rtscTrace.States.Transition_hitCount_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hit Count Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hit Count Sequence</em>' containment reference list.
	 * @see rtscTrace.States.rtsc.RtscPackage#getTracedTransition_HitCountSequence()
	 * @see rtscTrace.States.Transition_hitCount_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Transition_hitCount_Value> getHitCountSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Transition)
	 * @see rtscTrace.States.rtsc.RtscPackage#getTracedTransition_OriginalObject()
	 * @model
	 * @generated
	 */
	Transition getOriginalObject();

	/**
	 * Sets the value of the '{@link rtscTrace.States.rtsc.TracedTransition#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Transition value);

} // TracedTransition
