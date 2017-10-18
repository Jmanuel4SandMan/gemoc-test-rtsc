/**
 */
package org.muml.rtsc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.muml.rtsc.Behavior;
import org.muml.rtsc.BehavioralElement;
import org.muml.rtsc.RtscPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.rtsc.impl.BehaviorImpl#getBehaviouralElement <em>Behavioural Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BehaviorImpl extends MinimalEObjectImpl.Container implements Behavior {
	/**
	 * The cached value of the '{@link #getBehaviouralElement() <em>Behavioural Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviouralElement()
	 * @generated
	 * @ordered
	 */
	protected BehavioralElement behaviouralElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtscPackage.Literals.BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralElement getBehaviouralElement() {
		return behaviouralElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehaviouralElement(BehavioralElement newBehaviouralElement, NotificationChain msgs) {
		BehavioralElement oldBehaviouralElement = behaviouralElement;
		behaviouralElement = newBehaviouralElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtscPackage.BEHAVIOR__BEHAVIOURAL_ELEMENT, oldBehaviouralElement, newBehaviouralElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviouralElement(BehavioralElement newBehaviouralElement) {
		if (newBehaviouralElement != behaviouralElement) {
			NotificationChain msgs = null;
			if (behaviouralElement != null)
				msgs = ((InternalEObject)behaviouralElement).eInverseRemove(this, RtscPackage.BEHAVIORAL_ELEMENT__BEHAVIOR, BehavioralElement.class, msgs);
			if (newBehaviouralElement != null)
				msgs = ((InternalEObject)newBehaviouralElement).eInverseAdd(this, RtscPackage.BEHAVIORAL_ELEMENT__BEHAVIOR, BehavioralElement.class, msgs);
			msgs = basicSetBehaviouralElement(newBehaviouralElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.BEHAVIOR__BEHAVIOURAL_ELEMENT, newBehaviouralElement, newBehaviouralElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtscPackage.BEHAVIOR__BEHAVIOURAL_ELEMENT:
				if (behaviouralElement != null)
					msgs = ((InternalEObject)behaviouralElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtscPackage.BEHAVIOR__BEHAVIOURAL_ELEMENT, null, msgs);
				return basicSetBehaviouralElement((BehavioralElement)otherEnd, msgs);
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
			case RtscPackage.BEHAVIOR__BEHAVIOURAL_ELEMENT:
				return basicSetBehaviouralElement(null, msgs);
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
			case RtscPackage.BEHAVIOR__BEHAVIOURAL_ELEMENT:
				return getBehaviouralElement();
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
			case RtscPackage.BEHAVIOR__BEHAVIOURAL_ELEMENT:
				setBehaviouralElement((BehavioralElement)newValue);
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
			case RtscPackage.BEHAVIOR__BEHAVIOURAL_ELEMENT:
				setBehaviouralElement((BehavioralElement)null);
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
			case RtscPackage.BEHAVIOR__BEHAVIOURAL_ELEMENT:
				return behaviouralElement != null;
		}
		return super.eIsSet(featureID);
	}

} //BehaviorImpl
