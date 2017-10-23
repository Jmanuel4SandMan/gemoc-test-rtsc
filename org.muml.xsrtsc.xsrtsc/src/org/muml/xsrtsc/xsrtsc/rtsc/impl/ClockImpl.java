/**
 */
package org.muml.xsrtsc.xsrtsc.rtsc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.muml.udbm.UDBMClock;

import org.muml.xsrtsc.xsrtsc.rtsc.Clock;
import org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart;
import org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.ClockImpl#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.ClockImpl#getUClock <em>UClock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockImpl extends NamedElementImpl implements Clock {
	/**
	 * The default value of the '{@link #getUClock() <em>UClock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUClock()
	 * @generated
	 * @ordered
	 */
	protected static final UDBMClock UCLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUClock() <em>UClock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUClock()
	 * @generated
	 * @ordered
	 */
	protected UDBMClock uClock = UCLOCK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtscPackage.Literals.CLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realtimestatechart getStatechart() {
		if (eContainerFeatureID() != RtscPackage.CLOCK__STATECHART) return null;
		return (Realtimestatechart)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatechart(Realtimestatechart newStatechart, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStatechart, RtscPackage.CLOCK__STATECHART, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatechart(Realtimestatechart newStatechart) {
		if (newStatechart != eInternalContainer() || (eContainerFeatureID() != RtscPackage.CLOCK__STATECHART && newStatechart != null)) {
			if (EcoreUtil.isAncestor(this, newStatechart))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStatechart != null)
				msgs = ((InternalEObject)newStatechart).eInverseAdd(this, RtscPackage.REALTIMESTATECHART__CLOCKS, Realtimestatechart.class, msgs);
			msgs = basicSetStatechart(newStatechart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.CLOCK__STATECHART, newStatechart, newStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDBMClock getUClock() {
		return uClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUClock(UDBMClock newUClock) {
		UDBMClock oldUClock = uClock;
		uClock = newUClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.CLOCK__UCLOCK, oldUClock, uClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialize() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String printValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reset() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtscPackage.CLOCK__STATECHART:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStatechart((Realtimestatechart)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtscPackage.CLOCK__STATECHART:
				return basicSetStatechart(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RtscPackage.CLOCK__STATECHART:
				return eInternalContainer().eInverseRemove(this, RtscPackage.REALTIMESTATECHART__CLOCKS, Realtimestatechart.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtscPackage.CLOCK__STATECHART:
				return getStatechart();
			case RtscPackage.CLOCK__UCLOCK:
				return getUClock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RtscPackage.CLOCK__STATECHART:
				setStatechart((Realtimestatechart)newValue);
				return;
			case RtscPackage.CLOCK__UCLOCK:
				setUClock((UDBMClock)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RtscPackage.CLOCK__STATECHART:
				setStatechart((Realtimestatechart)null);
				return;
			case RtscPackage.CLOCK__UCLOCK:
				setUClock(UCLOCK_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RtscPackage.CLOCK__STATECHART:
				return getStatechart() != null;
			case RtscPackage.CLOCK__UCLOCK:
				return UCLOCK_EDEFAULT == null ? uClock != null : !UCLOCK_EDEFAULT.equals(uClock);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uClock: ");
		result.append(uClock);
		result.append(')');
		return result.toString();
	}

} //ClockImpl
