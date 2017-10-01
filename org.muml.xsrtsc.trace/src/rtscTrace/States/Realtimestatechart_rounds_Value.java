/**
 */
package rtscTrace.States;

import org.eclipse.emf.common.util.EList;

import rtscTrace.States.rtsc.TracedRealtimestatechart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realtimestatechart rounds Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rtscTrace.States.Realtimestatechart_rounds_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link rtscTrace.States.Realtimestatechart_rounds_Value#getRounds <em>Rounds</em>}</li>
 *   <li>{@link rtscTrace.States.Realtimestatechart_rounds_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see rtscTrace.States.StatesPackage#getRealtimestatechart_rounds_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Realtimestatechart_rounds_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rtscTrace.States.rtsc.TracedRealtimestatechart#getRoundsSequence <em>Rounds Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedRealtimestatechart)
	 * @see rtscTrace.States.StatesPackage#getRealtimestatechart_rounds_Value_Parent()
	 * @see rtscTrace.States.rtsc.TracedRealtimestatechart#getRoundsSequence
	 * @model opposite="roundsSequence" required="true" transient="false"
	 * @generated
	 */
	TracedRealtimestatechart getParent();

	/**
	 * Sets the value of the '{@link rtscTrace.States.Realtimestatechart_rounds_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedRealtimestatechart value);

	/**
	 * Returns the value of the '<em><b>Rounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rounds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rounds</em>' attribute.
	 * @see #setRounds(int)
	 * @see rtscTrace.States.StatesPackage#getRealtimestatechart_rounds_Value_Rounds()
	 * @model unique="false"
	 * @generated
	 */
	int getRounds();

	/**
	 * Sets the value of the '{@link rtscTrace.States.Realtimestatechart_rounds_Value#getRounds <em>Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rounds</em>' attribute.
	 * @see #getRounds()
	 * @generated
	 */
	void setRounds(int value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link rtscTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link rtscTrace.States.State#getRealtimestatechart_rounds_Values <em>Realtimestatechart rounds Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see rtscTrace.States.StatesPackage#getRealtimestatechart_rounds_Value_States()
	 * @see rtscTrace.States.State#getRealtimestatechart_rounds_Values
	 * @model opposite="realtimestatechart_rounds_Values" required="true"
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

} // Realtimestatechart_rounds_Value
