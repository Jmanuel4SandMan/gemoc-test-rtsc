/**
 */
package rtscTrace.States;

import org.eclipse.emf.common.util.EList;

import rtscTrace.States.rtsc.TracedTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition hit Count Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rtscTrace.States.Transition_hitCount_Value#getHitCount <em>Hit Count</em>}</li>
 *   <li>{@link rtscTrace.States.Transition_hitCount_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link rtscTrace.States.Transition_hitCount_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see rtscTrace.States.StatesPackage#getTransition_hitCount_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Transition_hitCount_Value extends Value {
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
	 * @see rtscTrace.States.StatesPackage#getTransition_hitCount_Value_HitCount()
	 * @model unique="false"
	 * @generated
	 */
	int getHitCount();

	/**
	 * Sets the value of the '{@link rtscTrace.States.Transition_hitCount_Value#getHitCount <em>Hit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hit Count</em>' attribute.
	 * @see #getHitCount()
	 * @generated
	 */
	void setHitCount(int value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rtscTrace.States.rtsc.TracedTransition#getHitCountSequence <em>Hit Count Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedTransition)
	 * @see rtscTrace.States.StatesPackage#getTransition_hitCount_Value_Parent()
	 * @see rtscTrace.States.rtsc.TracedTransition#getHitCountSequence
	 * @model opposite="hitCountSequence" required="true" transient="false"
	 * @generated
	 */
	TracedTransition getParent();

	/**
	 * Sets the value of the '{@link rtscTrace.States.Transition_hitCount_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedTransition value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link rtscTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link rtscTrace.States.State#getTransition_hitCount_Values <em>Transition hit Count Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see rtscTrace.States.StatesPackage#getTransition_hitCount_Value_States()
	 * @see rtscTrace.States.State#getTransition_hitCount_Values
	 * @model opposite="transition_hitCount_Values" required="true"
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

} // Transition_hitCount_Value
