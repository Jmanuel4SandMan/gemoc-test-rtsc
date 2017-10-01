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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.xsrtsc.xsrtsc.rtsc.Vertex;

import rtscTrace.States.StatesPackage;
import rtscTrace.States.Vertex_active_Value;

import rtscTrace.States.rtsc.RtscPackage;
import rtscTrace.States.rtsc.TracedVertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rtscTrace.States.rtsc.impl.TracedVertexImpl#getActiveSequence <em>Active Sequence</em>}</li>
 *   <li>{@link rtscTrace.States.rtsc.impl.TracedVertexImpl#getOriginalObject_Vertex <em>Original Object Vertex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedVertexImpl extends MinimalEObjectImpl.Container implements TracedVertex {
	/**
	 * The cached value of the '{@link #getActiveSequence() <em>Active Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex_active_Value> activeSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject_Vertex() <em>Original Object Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject_Vertex()
	 * @generated
	 * @ordered
	 */
	protected Vertex originalObject_Vertex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedVertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtscPackage.Literals.TRACED_VERTEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex_active_Value> getActiveSequence() {
		if (activeSequence == null) {
			activeSequence = new EObjectContainmentWithInverseEList<Vertex_active_Value>(Vertex_active_Value.class, this, RtscPackage.TRACED_VERTEX__ACTIVE_SEQUENCE, StatesPackage.VERTEX_ACTIVE_VALUE__PARENT);
		}
		return activeSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getOriginalObject_Vertex() {
		if (originalObject_Vertex != null && originalObject_Vertex.eIsProxy()) {
			InternalEObject oldOriginalObject_Vertex = (InternalEObject)originalObject_Vertex;
			originalObject_Vertex = (Vertex)eResolveProxy(oldOriginalObject_Vertex);
			if (originalObject_Vertex != oldOriginalObject_Vertex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtscPackage.TRACED_VERTEX__ORIGINAL_OBJECT_VERTEX, oldOriginalObject_Vertex, originalObject_Vertex));
			}
		}
		return originalObject_Vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetOriginalObject_Vertex() {
		return originalObject_Vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject_Vertex(Vertex newOriginalObject_Vertex) {
		Vertex oldOriginalObject_Vertex = originalObject_Vertex;
		originalObject_Vertex = newOriginalObject_Vertex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.TRACED_VERTEX__ORIGINAL_OBJECT_VERTEX, oldOriginalObject_Vertex, originalObject_Vertex));
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
			case RtscPackage.TRACED_VERTEX__ACTIVE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveSequence()).basicAdd(otherEnd, msgs);
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
			case RtscPackage.TRACED_VERTEX__ACTIVE_SEQUENCE:
				return ((InternalEList<?>)getActiveSequence()).basicRemove(otherEnd, msgs);
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
			case RtscPackage.TRACED_VERTEX__ACTIVE_SEQUENCE:
				return getActiveSequence();
			case RtscPackage.TRACED_VERTEX__ORIGINAL_OBJECT_VERTEX:
				if (resolve) return getOriginalObject_Vertex();
				return basicGetOriginalObject_Vertex();
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
			case RtscPackage.TRACED_VERTEX__ACTIVE_SEQUENCE:
				getActiveSequence().clear();
				getActiveSequence().addAll((Collection<? extends Vertex_active_Value>)newValue);
				return;
			case RtscPackage.TRACED_VERTEX__ORIGINAL_OBJECT_VERTEX:
				setOriginalObject_Vertex((Vertex)newValue);
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
			case RtscPackage.TRACED_VERTEX__ACTIVE_SEQUENCE:
				getActiveSequence().clear();
				return;
			case RtscPackage.TRACED_VERTEX__ORIGINAL_OBJECT_VERTEX:
				setOriginalObject_Vertex((Vertex)null);
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
			case RtscPackage.TRACED_VERTEX__ACTIVE_SEQUENCE:
				return activeSequence != null && !activeSequence.isEmpty();
			case RtscPackage.TRACED_VERTEX__ORIGINAL_OBJECT_VERTEX:
				return originalObject_Vertex != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedVertexImpl
