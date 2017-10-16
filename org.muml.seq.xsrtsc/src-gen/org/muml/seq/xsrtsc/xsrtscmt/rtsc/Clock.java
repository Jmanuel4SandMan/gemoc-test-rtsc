/**
 */
package org.muml.seq.xsrtsc.xsrtscmt.rtsc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Clock#getStatechart <em>Statechart</em>}</li>
 * </ul>
 *
 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.RtscPackage#getClock()
 * @model
 * @generated
 */
public interface Clock extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Statechart</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getClocks <em>Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statechart</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statechart</em>' container reference.
	 * @see #setStatechart(Realtimestatechart)
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.RtscPackage#getClock_Statechart()
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getClocks
	 * @model opposite="clocks" required="true" transient="false"
	 * @generated
	 */
	Realtimestatechart getStatechart();

	/**
	 * Sets the value of the '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Clock#getStatechart <em>Statechart</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart</em>' container reference.
	 * @see #getStatechart()
	 * @generated
	 */
	void setStatechart(Realtimestatechart value);

} // Clock
