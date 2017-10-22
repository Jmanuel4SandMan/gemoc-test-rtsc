/**
 */
package org.muml.rtsc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Reset Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.rtsc.ClockResetEvent#getClock <em>Clock</em>}</li>
 * </ul>
 *
 * @see org.muml.rtsc.RtscPackage#getClockResetEvent()
 * @model
 * @generated
 */
public interface ClockResetEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' reference.
	 * @see #setClock(Clock)
	 * @see org.muml.rtsc.RtscPackage#getClockResetEvent_Clock()
	 * @model required="true"
	 * @generated
	 */
	Clock getClock();

	/**
	 * Sets the value of the '{@link org.muml.rtsc.ClockResetEvent#getClock <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' reference.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(Clock value);

} // ClockResetEvent
