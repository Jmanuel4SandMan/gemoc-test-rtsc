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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.seq.xsrtsc.xsrtsc.rtsc.NamedElement;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.State;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.StateImpl#getSubStatecharts <em>Sub Statecharts</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.StateImpl#isInitial <em>Initial</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.StateImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.StateImpl#getOwningRTSC <em>Owning RTSC</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.StateImpl#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.StateImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends VertexImpl implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubStatecharts() <em>Sub Statecharts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubStatecharts()
	 * @generated
	 * @ordered
	 */
	protected EList<Realtimestatechart> subStatecharts;

	/**
	 * The default value of the '{@link #isInitial() <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitial() <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected boolean initial = INITIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncomingTransitions() <em>Incoming Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incomingTransitions;

	/**
	 * The cached value of the '{@link #getOutgoingTransitions() <em>Outgoing Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoingTransitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtscPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realtimestatechart> getSubStatecharts() {
		if (subStatecharts == null) {
			subStatecharts = new EObjectContainmentEList<Realtimestatechart>(Realtimestatechart.class, this, RtscPackage.STATE__SUB_STATECHARTS);
		}
		return subStatecharts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(boolean newInitial) {
		boolean oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.STATE__INITIAL, oldInitial, initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.STATE__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realtimestatechart getOwningRTSC() {
		if (eContainerFeatureID() != RtscPackage.STATE__OWNING_RTSC) return null;
		return (Realtimestatechart)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRTSC(Realtimestatechart newOwningRTSC, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRTSC, RtscPackage.STATE__OWNING_RTSC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningRTSC(Realtimestatechart newOwningRTSC) {
		if (newOwningRTSC != eInternalContainer() || (eContainerFeatureID() != RtscPackage.STATE__OWNING_RTSC && newOwningRTSC != null)) {
			if (EcoreUtil.isAncestor(this, newOwningRTSC))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningRTSC != null)
				msgs = ((InternalEObject)newOwningRTSC).eInverseAdd(this, RtscPackage.REALTIMESTATECHART__STATES, Realtimestatechart.class, msgs);
			msgs = basicSetOwningRTSC(newOwningRTSC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.STATE__OWNING_RTSC, newOwningRTSC, newOwningRTSC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncomingTransitions() {
		if (incomingTransitions == null) {
			incomingTransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, RtscPackage.STATE__INCOMING_TRANSITIONS, RtscPackage.TRANSITION__TARGET);
		}
		return incomingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, RtscPackage.STATE__OUTGOING_TRANSITIONS, RtscPackage.TRANSITION__SOURCE);
		}
		return outgoingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void entry() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void exit() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case RtscPackage.STATE__OWNING_RTSC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRTSC((Realtimestatechart)otherEnd, msgs);
			case RtscPackage.STATE__INCOMING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingTransitions()).basicAdd(otherEnd, msgs);
			case RtscPackage.STATE__OUTGOING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransitions()).basicAdd(otherEnd, msgs);
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
			case RtscPackage.STATE__SUB_STATECHARTS:
				return ((InternalEList<?>)getSubStatecharts()).basicRemove(otherEnd, msgs);
			case RtscPackage.STATE__OWNING_RTSC:
				return basicSetOwningRTSC(null, msgs);
			case RtscPackage.STATE__INCOMING_TRANSITIONS:
				return ((InternalEList<?>)getIncomingTransitions()).basicRemove(otherEnd, msgs);
			case RtscPackage.STATE__OUTGOING_TRANSITIONS:
				return ((InternalEList<?>)getOutgoingTransitions()).basicRemove(otherEnd, msgs);
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
			case RtscPackage.STATE__OWNING_RTSC:
				return eInternalContainer().eInverseRemove(this, RtscPackage.REALTIMESTATECHART__STATES, Realtimestatechart.class, msgs);
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
			case RtscPackage.STATE__NAME:
				return getName();
			case RtscPackage.STATE__SUB_STATECHARTS:
				return getSubStatecharts();
			case RtscPackage.STATE__INITIAL:
				return isInitial();
			case RtscPackage.STATE__FINAL:
				return isFinal();
			case RtscPackage.STATE__OWNING_RTSC:
				return getOwningRTSC();
			case RtscPackage.STATE__INCOMING_TRANSITIONS:
				return getIncomingTransitions();
			case RtscPackage.STATE__OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
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
			case RtscPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case RtscPackage.STATE__SUB_STATECHARTS:
				getSubStatecharts().clear();
				getSubStatecharts().addAll((Collection<? extends Realtimestatechart>)newValue);
				return;
			case RtscPackage.STATE__INITIAL:
				setInitial((Boolean)newValue);
				return;
			case RtscPackage.STATE__FINAL:
				setFinal((Boolean)newValue);
				return;
			case RtscPackage.STATE__OWNING_RTSC:
				setOwningRTSC((Realtimestatechart)newValue);
				return;
			case RtscPackage.STATE__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				getIncomingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case RtscPackage.STATE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				getOutgoingTransitions().addAll((Collection<? extends Transition>)newValue);
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
			case RtscPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RtscPackage.STATE__SUB_STATECHARTS:
				getSubStatecharts().clear();
				return;
			case RtscPackage.STATE__INITIAL:
				setInitial(INITIAL_EDEFAULT);
				return;
			case RtscPackage.STATE__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case RtscPackage.STATE__OWNING_RTSC:
				setOwningRTSC((Realtimestatechart)null);
				return;
			case RtscPackage.STATE__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				return;
			case RtscPackage.STATE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
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
			case RtscPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RtscPackage.STATE__SUB_STATECHARTS:
				return subStatecharts != null && !subStatecharts.isEmpty();
			case RtscPackage.STATE__INITIAL:
				return initial != INITIAL_EDEFAULT;
			case RtscPackage.STATE__FINAL:
				return final_ != FINAL_EDEFAULT;
			case RtscPackage.STATE__OWNING_RTSC:
				return getOwningRTSC() != null;
			case RtscPackage.STATE__INCOMING_TRANSITIONS:
				return incomingTransitions != null && !incomingTransitions.isEmpty();
			case RtscPackage.STATE__OUTGOING_TRANSITIONS:
				return outgoingTransitions != null && !outgoingTransitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case RtscPackage.STATE__NAME: return RtscPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case RtscPackage.NAMED_ELEMENT__NAME: return RtscPackage.STATE__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", initial: ");
		result.append(initial);
		result.append(", final: ");
		result.append(final_);
		result.append(')');
		return result.toString();
	}

} //StateImpl
