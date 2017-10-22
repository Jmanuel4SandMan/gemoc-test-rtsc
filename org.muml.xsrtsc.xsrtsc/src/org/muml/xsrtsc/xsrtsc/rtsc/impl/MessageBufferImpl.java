/**
 */
package org.muml.xsrtsc.xsrtsc.rtsc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.muml.xsrtsc.xsrtsc.rtsc.Message;
import org.muml.xsrtsc.xsrtsc.rtsc.MessageBuffer;
import org.muml.xsrtsc.xsrtsc.rtsc.MessageType;
import org.muml.xsrtsc.xsrtsc.rtsc.Port;
import org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Buffer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.MessageBufferImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.MessageBufferImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.muml.xsrtsc.xsrtsc.rtsc.impl.MessageBufferImpl#getAllMessages <em>All Messages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageBufferImpl extends EObjectImpl implements MessageBuffer {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageType> types;

	/**
	 * The cached value of the '{@link #getAllMessages() <em>All Messages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> allMessages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageBufferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtscPackage.Literals.MESSAGE_BUFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		if (eContainerFeatureID() != RtscPackage.MESSAGE_BUFFER__PORT) return null;
		return (Port)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort(Port newPort, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPort, RtscPackage.MESSAGE_BUFFER__PORT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort) {
		if (newPort != eInternalContainer() || (eContainerFeatureID() != RtscPackage.MESSAGE_BUFFER__PORT && newPort != null)) {
			if (EcoreUtil.isAncestor(this, newPort))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPort != null)
				msgs = ((InternalEObject)newPort).eInverseAdd(this, RtscPackage.PORT__INCOMING_BUFFER, Port.class, msgs);
			msgs = basicSetPort(newPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.MESSAGE_BUFFER__PORT, newPort, newPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getTypes() {
		if (types == null) {
			types = new EObjectResolvingEList<MessageType>(MessageType.class, this, RtscPackage.MESSAGE_BUFFER__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getAllMessages() {
		if (allMessages == null) {
			allMessages = new EObjectResolvingEList<Message>(Message.class, this, RtscPackage.MESSAGE_BUFFER__ALL_MESSAGES);
		}
		return allMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage(MessageType type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasMessage(MessageType type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addMessage(Message message) {
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
			case RtscPackage.MESSAGE_BUFFER__PORT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPort((Port)otherEnd, msgs);
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
			case RtscPackage.MESSAGE_BUFFER__PORT:
				return basicSetPort(null, msgs);
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
			case RtscPackage.MESSAGE_BUFFER__PORT:
				return eInternalContainer().eInverseRemove(this, RtscPackage.PORT__INCOMING_BUFFER, Port.class, msgs);
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
			case RtscPackage.MESSAGE_BUFFER__PORT:
				return getPort();
			case RtscPackage.MESSAGE_BUFFER__TYPES:
				return getTypes();
			case RtscPackage.MESSAGE_BUFFER__ALL_MESSAGES:
				return getAllMessages();
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
			case RtscPackage.MESSAGE_BUFFER__PORT:
				setPort((Port)newValue);
				return;
			case RtscPackage.MESSAGE_BUFFER__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends MessageType>)newValue);
				return;
			case RtscPackage.MESSAGE_BUFFER__ALL_MESSAGES:
				getAllMessages().clear();
				getAllMessages().addAll((Collection<? extends Message>)newValue);
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
			case RtscPackage.MESSAGE_BUFFER__PORT:
				setPort((Port)null);
				return;
			case RtscPackage.MESSAGE_BUFFER__TYPES:
				getTypes().clear();
				return;
			case RtscPackage.MESSAGE_BUFFER__ALL_MESSAGES:
				getAllMessages().clear();
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
			case RtscPackage.MESSAGE_BUFFER__PORT:
				return getPort() != null;
			case RtscPackage.MESSAGE_BUFFER__TYPES:
				return types != null && !types.isEmpty();
			case RtscPackage.MESSAGE_BUFFER__ALL_MESSAGES:
				return allMessages != null && !allMessages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessageBufferImpl
