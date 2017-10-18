/**
 */
package org.muml.xsrtsc.xsrtsc.rtsc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.BehavioralElement#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @see org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage#getBehavioralElement()
 * @model abstract="true"
 * @generated
 */
public interface BehavioralElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.xsrtsc.xsrtsc.rtsc.Behavior#getBehaviouralElement <em>Behavioural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' container reference.
	 * @see #setBehavior(Behavior)
	 * @see org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage#getBehavioralElement_Behavior()
	 * @see org.muml.xsrtsc.xsrtsc.rtsc.Behavior#getBehaviouralElement
	 * @model opposite="behaviouralElement" transient="false"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link org.muml.xsrtsc.xsrtsc.rtsc.BehavioralElement#getBehavior <em>Behavior</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' container reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

} // BehavioralElement
