/**
 */
package org.muml.xsrtsc.xsrtsc.rtsc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.Variable#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.Variable#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.Variable#getRuntimeValue <em>Runtime Value</em>}</li>
 * </ul>
 *
 * @see org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Statechart</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statechart</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statechart</em>' container reference.
	 * @see #setStatechart(Realtimestatechart)
	 * @see org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage#getVariable_Statechart()
	 * @see org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getVariables
	 * @model opposite="variables" transient="false"
	 * @generated
	 */
	Realtimestatechart getStatechart();

	/**
	 * Sets the value of the '{@link org.muml.xsrtsc.xsrtsc.rtsc.Variable#getStatechart <em>Statechart</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart</em>' container reference.
	 * @see #getStatechart()
	 * @generated
	 */
	void setStatechart(Realtimestatechart value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(String)
	 * @see org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage#getVariable_InitialValue()
	 * @model
	 * @generated
	 */
	String getInitialValue();

	/**
	 * Sets the value of the '{@link org.muml.xsrtsc.xsrtsc.rtsc.Variable#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(String value);

	/**
	 * Returns the value of the '<em><b>Runtime Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Value</em>' attribute.
	 * @see #setRuntimeValue(String)
	 * @see org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage#getVariable_RuntimeValue()
	 * @model unique="false"
	 * @generated
	 */
	String getRuntimeValue();

	/**
	 * Sets the value of the '{@link org.muml.xsrtsc.xsrtsc.rtsc.Variable#getRuntimeValue <em>Runtime Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Value</em>' attribute.
	 * @see #getRuntimeValue()
	 * @generated
	 */
	void setRuntimeValue(String value);

} // Variable
