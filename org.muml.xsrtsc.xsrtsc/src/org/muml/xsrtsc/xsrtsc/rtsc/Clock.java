/**
 */
package org.muml.xsrtsc.xsrtsc.rtsc;

import org.muml.udbm.UDBMClock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.Clock#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.Clock#getUClock <em>UClock</em>}</li>
 * </ul>
 *
 * @see org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage#getClock()
 * @model
 * @generated
 */
public interface Clock extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Statechart</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getClocks <em>Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statechart</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statechart</em>' container reference.
	 * @see #setStatechart(Realtimestatechart)
	 * @see org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage#getClock_Statechart()
	 * @see org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getClocks
	 * @model opposite="clocks" required="true" transient="false"
	 * @generated
	 */
	Realtimestatechart getStatechart();

	/**
	 * Sets the value of the '{@link org.muml.xsrtsc.xsrtsc.rtsc.Clock#getStatechart <em>Statechart</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart</em>' container reference.
	 * @see #getStatechart()
	 * @generated
	 */
	void setStatechart(Realtimestatechart value);

	/**
	 * Returns the value of the '<em><b>UClock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UClock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UClock</em>' attribute.
	 * @see #setUClock(UDBMClock)
	 * @see org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage#getClock_UClock()
	 * @model unique="false" dataType="org.muml.xsrtsc.xsrtsc.rtsc.UDBMClock"
	 * @generated
	 */
	UDBMClock getUClock();

	/**
	 * Sets the value of the '{@link org.muml.xsrtsc.xsrtsc.rtsc.Clock#getUClock <em>UClock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UClock</em>' attribute.
	 * @see #getUClock()
	 * @generated
	 */
	void setUClock(UDBMClock value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String printValue();

} // Clock
