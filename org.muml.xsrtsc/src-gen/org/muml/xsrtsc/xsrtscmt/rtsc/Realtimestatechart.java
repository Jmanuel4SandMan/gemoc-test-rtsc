/**
 */
package org.muml.xsrtsc.xsrtscmt.rtsc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realtimestatechart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getStates <em>States</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getUnprocessedString <em>Unprocessed String</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getConsummedString <em>Consummed String</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getProducedString <em>Produced String</em>}</li>
 * </ul>
 *
 * @see org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage#getRealtimestatechart()
 * @model
 * @generated
 */
public interface Realtimestatechart extends Behavior, NamedElement {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.xsrtsc.xsrtscmt.rtsc.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage#getRealtimestatechart_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.xsrtsc.xsrtscmt.rtsc.State}.
	 * It is bidirectional and its opposite is '{@link org.muml.xsrtsc.xsrtscmt.rtsc.State#getOwningRTSC <em>Owning RTSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage#getRealtimestatechart_States()
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.State#getOwningRTSC
	 * @model opposite="owningRTSC" containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage#getRealtimestatechart_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' reference.
	 * @see #setCurrentState(State)
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage#getRealtimestatechart_CurrentState()
	 * @model
	 * @generated
	 */
	State getCurrentState();

	/**
	 * Sets the value of the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getCurrentState <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(State value);

	/**
	 * Returns the value of the '<em><b>Unprocessed String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unprocessed String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unprocessed String</em>' attribute.
	 * @see #setUnprocessedString(String)
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage#getRealtimestatechart_UnprocessedString()
	 * @model unique="false"
	 * @generated
	 */
	String getUnprocessedString();

	/**
	 * Sets the value of the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getUnprocessedString <em>Unprocessed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unprocessed String</em>' attribute.
	 * @see #getUnprocessedString()
	 * @generated
	 */
	void setUnprocessedString(String value);

	/**
	 * Returns the value of the '<em><b>Consummed String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consummed String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consummed String</em>' attribute.
	 * @see #setConsummedString(String)
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage#getRealtimestatechart_ConsummedString()
	 * @model unique="false"
	 * @generated
	 */
	String getConsummedString();

	/**
	 * Sets the value of the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getConsummedString <em>Consummed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consummed String</em>' attribute.
	 * @see #getConsummedString()
	 * @generated
	 */
	void setConsummedString(String value);

	/**
	 * Returns the value of the '<em><b>Produced String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced String</em>' attribute.
	 * @see #setProducedString(String)
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage#getRealtimestatechart_ProducedString()
	 * @model unique="false"
	 * @generated
	 */
	String getProducedString();

	/**
	 * Sets the value of the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getProducedString <em>Produced String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produced String</em>' attribute.
	 * @see #getProducedString()
	 * @generated
	 */
	void setProducedString(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void main();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argsMany="true"
	 * @generated
	 */
	void initializeModel(EList<String> args);

} // Realtimestatechart
