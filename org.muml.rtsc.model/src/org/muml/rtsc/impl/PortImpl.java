/**
 */
package org.muml.rtsc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.muml.rtsc.Behavior;
import org.muml.rtsc.Connector;
import org.muml.rtsc.MessageBuffer;
import org.muml.rtsc.Port;
import org.muml.rtsc.RtscPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.rtsc.impl.PortImpl#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link org.muml.rtsc.impl.PortImpl#getIncomingBuffer <em>Incoming Buffer</em>}</li>
 *   <li>{@link org.muml.rtsc.impl.PortImpl#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends BehavioralElementImpl implements Port {
	/**
	 * The cached value of the '{@link #getBehaviour() <em>Behaviour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviour()
	 * @generated
	 * @ordered
	 */
	protected Behavior behaviour;

	/**
	 * The cached value of the '{@link #getIncomingBuffer() <em>Incoming Buffer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingBuffer()
	 * @generated
	 * @ordered
	 */
	protected MessageBuffer incomingBuffer;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected Connector connector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtscPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBehaviour() {
		if (behaviour != null && behaviour.eIsProxy()) {
			InternalEObject oldBehaviour = (InternalEObject)behaviour;
			behaviour = (Behavior)eResolveProxy(oldBehaviour);
			if (behaviour != oldBehaviour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtscPackage.PORT__BEHAVIOUR, oldBehaviour, behaviour));
			}
		}
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBehaviour() {
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviour(Behavior newBehaviour) {
		Behavior oldBehaviour = behaviour;
		behaviour = newBehaviour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.PORT__BEHAVIOUR, oldBehaviour, behaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBuffer getIncomingBuffer() {
		return incomingBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingBuffer(MessageBuffer newIncomingBuffer, NotificationChain msgs) {
		MessageBuffer oldIncomingBuffer = incomingBuffer;
		incomingBuffer = newIncomingBuffer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtscPackage.PORT__INCOMING_BUFFER, oldIncomingBuffer, newIncomingBuffer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingBuffer(MessageBuffer newIncomingBuffer) {
		if (newIncomingBuffer != incomingBuffer) {
			NotificationChain msgs = null;
			if (incomingBuffer != null)
				msgs = ((InternalEObject)incomingBuffer).eInverseRemove(this, RtscPackage.MESSAGE_BUFFER__PORT, MessageBuffer.class, msgs);
			if (newIncomingBuffer != null)
				msgs = ((InternalEObject)newIncomingBuffer).eInverseAdd(this, RtscPackage.MESSAGE_BUFFER__PORT, MessageBuffer.class, msgs);
			msgs = basicSetIncomingBuffer(newIncomingBuffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.PORT__INCOMING_BUFFER, newIncomingBuffer, newIncomingBuffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector() {
		if (connector != null && connector.eIsProxy()) {
			InternalEObject oldConnector = (InternalEObject)connector;
			connector = (Connector)eResolveProxy(oldConnector);
			if (connector != oldConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtscPackage.PORT__CONNECTOR, oldConnector, connector));
			}
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetConnector() {
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(Connector newConnector, NotificationChain msgs) {
		Connector oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtscPackage.PORT__CONNECTOR, oldConnector, newConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		if (newConnector != connector) {
			NotificationChain msgs = null;
			if (connector != null)
				msgs = ((InternalEObject)connector).eInverseRemove(this, RtscPackage.CONNECTOR__ENDPOINTS, Connector.class, msgs);
			if (newConnector != null)
				msgs = ((InternalEObject)newConnector).eInverseAdd(this, RtscPackage.CONNECTOR__ENDPOINTS, Connector.class, msgs);
			msgs = basicSetConnector(newConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.PORT__CONNECTOR, newConnector, newConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtscPackage.PORT__INCOMING_BUFFER:
				if (incomingBuffer != null)
					msgs = ((InternalEObject)incomingBuffer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtscPackage.PORT__INCOMING_BUFFER, null, msgs);
				return basicSetIncomingBuffer((MessageBuffer)otherEnd, msgs);
			case RtscPackage.PORT__CONNECTOR:
				if (connector != null)
					msgs = ((InternalEObject)connector).eInverseRemove(this, RtscPackage.CONNECTOR__ENDPOINTS, Connector.class, msgs);
				return basicSetConnector((Connector)otherEnd, msgs);
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
			case RtscPackage.PORT__INCOMING_BUFFER:
				return basicSetIncomingBuffer(null, msgs);
			case RtscPackage.PORT__CONNECTOR:
				return basicSetConnector(null, msgs);
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
			case RtscPackage.PORT__BEHAVIOUR:
				if (resolve) return getBehaviour();
				return basicGetBehaviour();
			case RtscPackage.PORT__INCOMING_BUFFER:
				return getIncomingBuffer();
			case RtscPackage.PORT__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
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
			case RtscPackage.PORT__BEHAVIOUR:
				setBehaviour((Behavior)newValue);
				return;
			case RtscPackage.PORT__INCOMING_BUFFER:
				setIncomingBuffer((MessageBuffer)newValue);
				return;
			case RtscPackage.PORT__CONNECTOR:
				setConnector((Connector)newValue);
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
			case RtscPackage.PORT__BEHAVIOUR:
				setBehaviour((Behavior)null);
				return;
			case RtscPackage.PORT__INCOMING_BUFFER:
				setIncomingBuffer((MessageBuffer)null);
				return;
			case RtscPackage.PORT__CONNECTOR:
				setConnector((Connector)null);
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
			case RtscPackage.PORT__BEHAVIOUR:
				return behaviour != null;
			case RtscPackage.PORT__INCOMING_BUFFER:
				return incomingBuffer != null;
			case RtscPackage.PORT__CONNECTOR:
				return connector != null;
		}
		return super.eIsSet(featureID);
	}

} //PortImpl
