/**
 */
package org.muml.xsrtsc.xsrtscmt.rtsc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.xsrtsc.xsrtscmt.rtsc.Behavior#getBehaviouralElement <em>Behavioural Element</em>}</li>
 * </ul>
 *
 * @see org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage#getBehavior()
 * @model abstract="true"
 * @generated
 */
public interface Behavior extends EObject {

	/**
	 * Returns the value of the '<em><b>Behavioural Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.muml.xsrtsc.xsrtscmt.rtsc.BehavioralElement#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavioural Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavioural Element</em>' containment reference.
	 * @see #setBehaviouralElement(BehavioralElement)
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.RtscPackage#getBehavior_BehaviouralElement()
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.BehavioralElement#getBehavior
	 * @model opposite="behavior" containment="true"
	 * @generated
	 */
	BehavioralElement getBehaviouralElement();

	/**
	 * Sets the value of the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Behavior#getBehaviouralElement <em>Behavioural Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavioural Element</em>' containment reference.
	 * @see #getBehaviouralElement()
	 * @generated
	 */
	void setBehaviouralElement(BehavioralElement value);
} // Behavior
