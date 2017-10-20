/**
 */
package org.muml.seq.xsrtsc.xsrtsc.rtsc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.seq.xsrtsc.xsrtsc.rtsc.CoordinationProtocol;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageTypeRepository;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.SystemImpl#getStatecharts <em>Statecharts</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.SystemImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.SystemImpl#getMessageTypeRepo <em>Message Type Repo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends EObjectImpl implements org.muml.seq.xsrtsc.xsrtsc.rtsc.System {
	/**
	 * The cached value of the '{@link #getStatecharts() <em>Statecharts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatecharts()
	 * @generated
	 * @ordered
	 */
	protected EList<Realtimestatechart> statecharts;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinationProtocol> protocol;

	/**
	 * The cached value of the '{@link #getMessageTypeRepo() <em>Message Type Repo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTypeRepo()
	 * @generated
	 * @ordered
	 */
	protected MessageTypeRepository messageTypeRepo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtscPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realtimestatechart> getStatecharts() {
		if (statecharts == null) {
			statecharts = new EObjectContainmentEList<Realtimestatechart>(Realtimestatechart.class, this, RtscPackage.SYSTEM__STATECHARTS);
		}
		return statecharts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoordinationProtocol> getProtocol() {
		if (protocol == null) {
			protocol = new EObjectContainmentEList<CoordinationProtocol>(CoordinationProtocol.class, this, RtscPackage.SYSTEM__PROTOCOL);
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTypeRepository getMessageTypeRepo() {
		return messageTypeRepo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageTypeRepo(MessageTypeRepository newMessageTypeRepo, NotificationChain msgs) {
		MessageTypeRepository oldMessageTypeRepo = messageTypeRepo;
		messageTypeRepo = newMessageTypeRepo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtscPackage.SYSTEM__MESSAGE_TYPE_REPO, oldMessageTypeRepo, newMessageTypeRepo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageTypeRepo(MessageTypeRepository newMessageTypeRepo) {
		if (newMessageTypeRepo != messageTypeRepo) {
			NotificationChain msgs = null;
			if (messageTypeRepo != null)
				msgs = ((InternalEObject)messageTypeRepo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtscPackage.SYSTEM__MESSAGE_TYPE_REPO, null, msgs);
			if (newMessageTypeRepo != null)
				msgs = ((InternalEObject)newMessageTypeRepo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtscPackage.SYSTEM__MESSAGE_TYPE_REPO, null, msgs);
			msgs = basicSetMessageTypeRepo(newMessageTypeRepo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.SYSTEM__MESSAGE_TYPE_REPO, newMessageTypeRepo, newMessageTypeRepo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtscPackage.SYSTEM__STATECHARTS:
				return ((InternalEList<?>)getStatecharts()).basicRemove(otherEnd, msgs);
			case RtscPackage.SYSTEM__PROTOCOL:
				return ((InternalEList<?>)getProtocol()).basicRemove(otherEnd, msgs);
			case RtscPackage.SYSTEM__MESSAGE_TYPE_REPO:
				return basicSetMessageTypeRepo(null, msgs);
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
			case RtscPackage.SYSTEM__STATECHARTS:
				return getStatecharts();
			case RtscPackage.SYSTEM__PROTOCOL:
				return getProtocol();
			case RtscPackage.SYSTEM__MESSAGE_TYPE_REPO:
				return getMessageTypeRepo();
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
			case RtscPackage.SYSTEM__STATECHARTS:
				getStatecharts().clear();
				getStatecharts().addAll((Collection<? extends Realtimestatechart>)newValue);
				return;
			case RtscPackage.SYSTEM__PROTOCOL:
				getProtocol().clear();
				getProtocol().addAll((Collection<? extends CoordinationProtocol>)newValue);
				return;
			case RtscPackage.SYSTEM__MESSAGE_TYPE_REPO:
				setMessageTypeRepo((MessageTypeRepository)newValue);
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
			case RtscPackage.SYSTEM__STATECHARTS:
				getStatecharts().clear();
				return;
			case RtscPackage.SYSTEM__PROTOCOL:
				getProtocol().clear();
				return;
			case RtscPackage.SYSTEM__MESSAGE_TYPE_REPO:
				setMessageTypeRepo((MessageTypeRepository)null);
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
			case RtscPackage.SYSTEM__STATECHARTS:
				return statecharts != null && !statecharts.isEmpty();
			case RtscPackage.SYSTEM__PROTOCOL:
				return protocol != null && !protocol.isEmpty();
			case RtscPackage.SYSTEM__MESSAGE_TYPE_REPO:
				return messageTypeRepo != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
