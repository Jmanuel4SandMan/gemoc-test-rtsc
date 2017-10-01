/**
 */
package rtscTrace.States.rtsc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.xsrtsc.xsrtsc.rtsc.Realtimestatechart;

import rtscTrace.States.Realtimestatechart_rounds_Value;
import rtscTrace.States.StatesPackage;

import rtscTrace.States.rtsc.RtscPackage;
import rtscTrace.States.rtsc.TracedRealtimestatechart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Realtimestatechart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rtscTrace.States.rtsc.impl.TracedRealtimestatechartImpl#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link rtscTrace.States.rtsc.impl.TracedRealtimestatechartImpl#getRoundsSequence <em>Rounds Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedRealtimestatechartImpl extends TracedBehaviorImpl implements TracedRealtimestatechart {
	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected Realtimestatechart originalObject;

	/**
	 * The cached value of the '{@link #getRoundsSequence() <em>Rounds Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundsSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Realtimestatechart_rounds_Value> roundsSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedRealtimestatechartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtscPackage.Literals.TRACED_REALTIMESTATECHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realtimestatechart getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (Realtimestatechart)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtscPackage.TRACED_REALTIMESTATECHART__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realtimestatechart basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(Realtimestatechart newOriginalObject) {
		Realtimestatechart oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.TRACED_REALTIMESTATECHART__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realtimestatechart_rounds_Value> getRoundsSequence() {
		if (roundsSequence == null) {
			roundsSequence = new EObjectContainmentWithInverseEList<Realtimestatechart_rounds_Value>(Realtimestatechart_rounds_Value.class, this, RtscPackage.TRACED_REALTIMESTATECHART__ROUNDS_SEQUENCE, StatesPackage.REALTIMESTATECHART_ROUNDS_VALUE__PARENT);
		}
		return roundsSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtscPackage.TRACED_REALTIMESTATECHART__ROUNDS_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoundsSequence()).basicAdd(otherEnd, msgs);
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
			case RtscPackage.TRACED_REALTIMESTATECHART__ROUNDS_SEQUENCE:
				return ((InternalEList<?>)getRoundsSequence()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtscPackage.TRACED_REALTIMESTATECHART__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
			case RtscPackage.TRACED_REALTIMESTATECHART__ROUNDS_SEQUENCE:
				return getRoundsSequence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RtscPackage.TRACED_REALTIMESTATECHART__ORIGINAL_OBJECT:
				setOriginalObject((Realtimestatechart)newValue);
				return;
			case RtscPackage.TRACED_REALTIMESTATECHART__ROUNDS_SEQUENCE:
				getRoundsSequence().clear();
				getRoundsSequence().addAll((Collection<? extends Realtimestatechart_rounds_Value>)newValue);
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
			case RtscPackage.TRACED_REALTIMESTATECHART__ORIGINAL_OBJECT:
				setOriginalObject((Realtimestatechart)null);
				return;
			case RtscPackage.TRACED_REALTIMESTATECHART__ROUNDS_SEQUENCE:
				getRoundsSequence().clear();
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
			case RtscPackage.TRACED_REALTIMESTATECHART__ORIGINAL_OBJECT:
				return originalObject != null;
			case RtscPackage.TRACED_REALTIMESTATECHART__ROUNDS_SEQUENCE:
				return roundsSequence != null && !roundsSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedRealtimestatechartImpl
