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

import org.muml.xsrtsc.xsrtsc.rtsc.Transition;

import rtscTrace.States.StatesPackage;
import rtscTrace.States.Transition_hitCount_Value;

import rtscTrace.States.rtsc.RtscPackage;
import rtscTrace.States.rtsc.TracedTransition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rtscTrace.States.rtsc.impl.TracedTransitionImpl#getHitCountSequence <em>Hit Count Sequence</em>}</li>
 *   <li>{@link rtscTrace.States.rtsc.impl.TracedTransitionImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedTransitionImpl extends TracedNamedElementImpl implements TracedTransition {
	/**
	 * The cached value of the '{@link #getHitCountSequence() <em>Hit Count Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHitCountSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition_hitCount_Value> hitCountSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected Transition originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtscPackage.Literals.TRACED_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition_hitCount_Value> getHitCountSequence() {
		if (hitCountSequence == null) {
			hitCountSequence = new EObjectContainmentWithInverseEList<Transition_hitCount_Value>(Transition_hitCount_Value.class, this, RtscPackage.TRACED_TRANSITION__HIT_COUNT_SEQUENCE, StatesPackage.TRANSITION_HIT_COUNT_VALUE__PARENT);
		}
		return hitCountSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (Transition)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtscPackage.TRACED_TRANSITION__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(Transition newOriginalObject) {
		Transition oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.TRACED_TRANSITION__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
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
			case RtscPackage.TRACED_TRANSITION__HIT_COUNT_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHitCountSequence()).basicAdd(otherEnd, msgs);
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
			case RtscPackage.TRACED_TRANSITION__HIT_COUNT_SEQUENCE:
				return ((InternalEList<?>)getHitCountSequence()).basicRemove(otherEnd, msgs);
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
			case RtscPackage.TRACED_TRANSITION__HIT_COUNT_SEQUENCE:
				return getHitCountSequence();
			case RtscPackage.TRACED_TRANSITION__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
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
			case RtscPackage.TRACED_TRANSITION__HIT_COUNT_SEQUENCE:
				getHitCountSequence().clear();
				getHitCountSequence().addAll((Collection<? extends Transition_hitCount_Value>)newValue);
				return;
			case RtscPackage.TRACED_TRANSITION__ORIGINAL_OBJECT:
				setOriginalObject((Transition)newValue);
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
			case RtscPackage.TRACED_TRANSITION__HIT_COUNT_SEQUENCE:
				getHitCountSequence().clear();
				return;
			case RtscPackage.TRACED_TRANSITION__ORIGINAL_OBJECT:
				setOriginalObject((Transition)null);
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
			case RtscPackage.TRACED_TRANSITION__HIT_COUNT_SEQUENCE:
				return hitCountSequence != null && !hitCountSequence.isEmpty();
			case RtscPackage.TRACED_TRANSITION__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedTransitionImpl
