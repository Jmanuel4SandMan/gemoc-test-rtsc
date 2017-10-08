/**
 */
package rtscTrace.impl;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import fr.inria.diverse.trace.commons.model.trace.impl.TraceImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rtscTrace.RtscTracePackage;
import rtscTrace.SpecificTrace;

import rtscTrace.States.State;

import rtscTrace.States.rtsc.TracedRealtimestatechart;
import rtscTrace.States.rtsc.TracedState;
import rtscTrace.States.rtsc.TracedTransition;
import rtscTrace.States.rtsc.TracedVertex;

import rtscTrace.Steps.Rtsc_Realtimestatechart_InitRTSC;
import rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize;
import rtscTrace.Steps.Rtsc_Realtimestatechart_Step;
import rtscTrace.Steps.Rtsc_Transition_CanFire;
import rtscTrace.Steps.Rtsc_Transition_Fire;
import rtscTrace.Steps.SpecificStep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rtscTrace.impl.SpecificTraceImpl#getRtsc_Realtimestatechart_InitRTSC_Sequence <em>Rtsc Realtimestatechart Init RTSC Sequence</em>}</li>
 *   <li>{@link rtscTrace.impl.SpecificTraceImpl#getRtsc_Realtimestatechart_Initialize_Sequence <em>Rtsc Realtimestatechart Initialize Sequence</em>}</li>
 *   <li>{@link rtscTrace.impl.SpecificTraceImpl#getRtsc_Realtimestatechart_Step_Sequence <em>Rtsc Realtimestatechart Step Sequence</em>}</li>
 *   <li>{@link rtscTrace.impl.SpecificTraceImpl#getRtsc_Transition_CanFire_Sequence <em>Rtsc Transition Can Fire Sequence</em>}</li>
 *   <li>{@link rtscTrace.impl.SpecificTraceImpl#getRtsc_Transition_Fire_Sequence <em>Rtsc Transition Fire Sequence</em>}</li>
 *   <li>{@link rtscTrace.impl.SpecificTraceImpl#getRtsc_tracedRealtimestatecharts <em>Rtsc traced Realtimestatecharts</em>}</li>
 *   <li>{@link rtscTrace.impl.SpecificTraceImpl#getRtsc_tracedStates <em>Rtsc traced States</em>}</li>
 *   <li>{@link rtscTrace.impl.SpecificTraceImpl#getRtsc_tracedTransitions <em>Rtsc traced Transitions</em>}</li>
 *   <li>{@link rtscTrace.impl.SpecificTraceImpl#getRtsc_tracedVertexs <em>Rtsc traced Vertexs</em>}</li>
 *   <li>{@link rtscTrace.impl.SpecificTraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificTraceImpl extends TraceImpl<SequentialStep<SpecificStep>> implements SpecificTrace {
	/**
	 * The cached value of the '{@link #getRtsc_Realtimestatechart_InitRTSC_Sequence() <em>Rtsc Realtimestatechart Init RTSC Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtsc_Realtimestatechart_InitRTSC_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Rtsc_Realtimestatechart_InitRTSC> rtsc_Realtimestatechart_InitRTSC_Sequence;

	/**
	 * The cached value of the '{@link #getRtsc_Realtimestatechart_Initialize_Sequence() <em>Rtsc Realtimestatechart Initialize Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtsc_Realtimestatechart_Initialize_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Rtsc_Realtimestatechart_Initialize> rtsc_Realtimestatechart_Initialize_Sequence;

	/**
	 * The cached value of the '{@link #getRtsc_Realtimestatechart_Step_Sequence() <em>Rtsc Realtimestatechart Step Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtsc_Realtimestatechart_Step_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Rtsc_Realtimestatechart_Step> rtsc_Realtimestatechart_Step_Sequence;

	/**
	 * The cached value of the '{@link #getRtsc_Transition_CanFire_Sequence() <em>Rtsc Transition Can Fire Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtsc_Transition_CanFire_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Rtsc_Transition_CanFire> rtsc_Transition_CanFire_Sequence;

	/**
	 * The cached value of the '{@link #getRtsc_Transition_Fire_Sequence() <em>Rtsc Transition Fire Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtsc_Transition_Fire_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Rtsc_Transition_Fire> rtsc_Transition_Fire_Sequence;

	/**
	 * The cached value of the '{@link #getRtsc_tracedRealtimestatecharts() <em>Rtsc traced Realtimestatecharts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtsc_tracedRealtimestatecharts()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedRealtimestatechart> rtsc_tracedRealtimestatecharts;

	/**
	 * The cached value of the '{@link #getRtsc_tracedStates() <em>Rtsc traced States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtsc_tracedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedState> rtsc_tracedStates;

	/**
	 * The cached value of the '{@link #getRtsc_tracedTransitions() <em>Rtsc traced Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtsc_tracedTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedTransition> rtsc_tracedTransitions;

	/**
	 * The cached value of the '{@link #getRtsc_tracedVertexs() <em>Rtsc traced Vertexs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtsc_tracedVertexs()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedVertex> rtsc_tracedVertexs;

	/**
	 * The cached value of the '{@link #getStatesTrace() <em>States Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<State> statesTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtscTracePackage.Literals.SPECIFIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRootStep(SequentialStep<SpecificStep> newRootStep, NotificationChain msgs) {
		return super.basicSetRootStep(newRootStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rtsc_Realtimestatechart_InitRTSC> getRtsc_Realtimestatechart_InitRTSC_Sequence() {
		if (rtsc_Realtimestatechart_InitRTSC_Sequence == null) {
			rtsc_Realtimestatechart_InitRTSC_Sequence = new EObjectResolvingEList<Rtsc_Realtimestatechart_InitRTSC>(Rtsc_Realtimestatechart_InitRTSC.class, this, RtscTracePackage.SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_INIT_RTSC_SEQUENCE);
		}
		return rtsc_Realtimestatechart_InitRTSC_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rtsc_Realtimestatechart_Initialize> getRtsc_Realtimestatechart_Initialize_Sequence() {
		if (rtsc_Realtimestatechart_Initialize_Sequence == null) {
			rtsc_Realtimestatechart_Initialize_Sequence = new EObjectResolvingEList<Rtsc_Realtimestatechart_Initialize>(Rtsc_Realtimestatechart_Initialize.class, this, RtscTracePackage.SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_INITIALIZE_SEQUENCE);
		}
		return rtsc_Realtimestatechart_Initialize_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rtsc_Realtimestatechart_Step> getRtsc_Realtimestatechart_Step_Sequence() {
		if (rtsc_Realtimestatechart_Step_Sequence == null) {
			rtsc_Realtimestatechart_Step_Sequence = new EObjectResolvingEList<Rtsc_Realtimestatechart_Step>(Rtsc_Realtimestatechart_Step.class, this, RtscTracePackage.SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_STEP_SEQUENCE);
		}
		return rtsc_Realtimestatechart_Step_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rtsc_Transition_CanFire> getRtsc_Transition_CanFire_Sequence() {
		if (rtsc_Transition_CanFire_Sequence == null) {
			rtsc_Transition_CanFire_Sequence = new EObjectResolvingEList<Rtsc_Transition_CanFire>(Rtsc_Transition_CanFire.class, this, RtscTracePackage.SPECIFIC_TRACE__RTSC_TRANSITION_CAN_FIRE_SEQUENCE);
		}
		return rtsc_Transition_CanFire_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rtsc_Transition_Fire> getRtsc_Transition_Fire_Sequence() {
		if (rtsc_Transition_Fire_Sequence == null) {
			rtsc_Transition_Fire_Sequence = new EObjectResolvingEList<Rtsc_Transition_Fire>(Rtsc_Transition_Fire.class, this, RtscTracePackage.SPECIFIC_TRACE__RTSC_TRANSITION_FIRE_SEQUENCE);
		}
		return rtsc_Transition_Fire_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedRealtimestatechart> getRtsc_tracedRealtimestatecharts() {
		if (rtsc_tracedRealtimestatecharts == null) {
			rtsc_tracedRealtimestatecharts = new EObjectContainmentEList<TracedRealtimestatechart>(TracedRealtimestatechart.class, this, RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_REALTIMESTATECHARTS);
		}
		return rtsc_tracedRealtimestatecharts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedState> getRtsc_tracedStates() {
		if (rtsc_tracedStates == null) {
			rtsc_tracedStates = new EObjectContainmentEList<TracedState>(TracedState.class, this, RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_STATES);
		}
		return rtsc_tracedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedTransition> getRtsc_tracedTransitions() {
		if (rtsc_tracedTransitions == null) {
			rtsc_tracedTransitions = new EObjectContainmentEList<TracedTransition>(TracedTransition.class, this, RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_TRANSITIONS);
		}
		return rtsc_tracedTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedVertex> getRtsc_tracedVertexs() {
		if (rtsc_tracedVertexs == null) {
			rtsc_tracedVertexs = new EObjectContainmentEList<TracedVertex>(TracedVertex.class, this, RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_VERTEXS);
		}
		return rtsc_tracedVertexs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, RtscTracePackage.SPECIFIC_TRACE__STATES_TRACE);
		}
		return statesTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_REALTIMESTATECHARTS:
				return ((InternalEList<?>)getRtsc_tracedRealtimestatecharts()).basicRemove(otherEnd, msgs);
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_STATES:
				return ((InternalEList<?>)getRtsc_tracedStates()).basicRemove(otherEnd, msgs);
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_TRANSITIONS:
				return ((InternalEList<?>)getRtsc_tracedTransitions()).basicRemove(otherEnd, msgs);
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_VERTEXS:
				return ((InternalEList<?>)getRtsc_tracedVertexs()).basicRemove(otherEnd, msgs);
			case RtscTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
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
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_INIT_RTSC_SEQUENCE:
				return getRtsc_Realtimestatechart_InitRTSC_Sequence();
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_INITIALIZE_SEQUENCE:
				return getRtsc_Realtimestatechart_Initialize_Sequence();
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_STEP_SEQUENCE:
				return getRtsc_Realtimestatechart_Step_Sequence();
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRANSITION_CAN_FIRE_SEQUENCE:
				return getRtsc_Transition_CanFire_Sequence();
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRANSITION_FIRE_SEQUENCE:
				return getRtsc_Transition_Fire_Sequence();
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_REALTIMESTATECHARTS:
				return getRtsc_tracedRealtimestatecharts();
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_STATES:
				return getRtsc_tracedStates();
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_TRANSITIONS:
				return getRtsc_tracedTransitions();
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_VERTEXS:
				return getRtsc_tracedVertexs();
			case RtscTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return getStatesTrace();
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
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_INIT_RTSC_SEQUENCE:
				getRtsc_Realtimestatechart_InitRTSC_Sequence().clear();
				getRtsc_Realtimestatechart_InitRTSC_Sequence().addAll((Collection<? extends Rtsc_Realtimestatechart_InitRTSC>)newValue);
				return;
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_INITIALIZE_SEQUENCE:
				getRtsc_Realtimestatechart_Initialize_Sequence().clear();
				getRtsc_Realtimestatechart_Initialize_Sequence().addAll((Collection<? extends Rtsc_Realtimestatechart_Initialize>)newValue);
				return;
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_STEP_SEQUENCE:
				getRtsc_Realtimestatechart_Step_Sequence().clear();
				getRtsc_Realtimestatechart_Step_Sequence().addAll((Collection<? extends Rtsc_Realtimestatechart_Step>)newValue);
				return;
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRANSITION_CAN_FIRE_SEQUENCE:
				getRtsc_Transition_CanFire_Sequence().clear();
				getRtsc_Transition_CanFire_Sequence().addAll((Collection<? extends Rtsc_Transition_CanFire>)newValue);
				return;
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRANSITION_FIRE_SEQUENCE:
				getRtsc_Transition_Fire_Sequence().clear();
				getRtsc_Transition_Fire_Sequence().addAll((Collection<? extends Rtsc_Transition_Fire>)newValue);
				return;
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_REALTIMESTATECHARTS:
				getRtsc_tracedRealtimestatecharts().clear();
				getRtsc_tracedRealtimestatecharts().addAll((Collection<? extends TracedRealtimestatechart>)newValue);
				return;
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_STATES:
				getRtsc_tracedStates().clear();
				getRtsc_tracedStates().addAll((Collection<? extends TracedState>)newValue);
				return;
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_TRANSITIONS:
				getRtsc_tracedTransitions().clear();
				getRtsc_tracedTransitions().addAll((Collection<? extends TracedTransition>)newValue);
				return;
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_VERTEXS:
				getRtsc_tracedVertexs().clear();
				getRtsc_tracedVertexs().addAll((Collection<? extends TracedVertex>)newValue);
				return;
			case RtscTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
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
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_INIT_RTSC_SEQUENCE:
				getRtsc_Realtimestatechart_InitRTSC_Sequence().clear();
				return;
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_INITIALIZE_SEQUENCE:
				getRtsc_Realtimestatechart_Initialize_Sequence().clear();
				return;
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_STEP_SEQUENCE:
				getRtsc_Realtimestatechart_Step_Sequence().clear();
				return;
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRANSITION_CAN_FIRE_SEQUENCE:
				getRtsc_Transition_CanFire_Sequence().clear();
				return;
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRANSITION_FIRE_SEQUENCE:
				getRtsc_Transition_Fire_Sequence().clear();
				return;
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_REALTIMESTATECHARTS:
				getRtsc_tracedRealtimestatecharts().clear();
				return;
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_STATES:
				getRtsc_tracedStates().clear();
				return;
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_TRANSITIONS:
				getRtsc_tracedTransitions().clear();
				return;
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_VERTEXS:
				getRtsc_tracedVertexs().clear();
				return;
			case RtscTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
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
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_INIT_RTSC_SEQUENCE:
				return rtsc_Realtimestatechart_InitRTSC_Sequence != null && !rtsc_Realtimestatechart_InitRTSC_Sequence.isEmpty();
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_INITIALIZE_SEQUENCE:
				return rtsc_Realtimestatechart_Initialize_Sequence != null && !rtsc_Realtimestatechart_Initialize_Sequence.isEmpty();
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_STEP_SEQUENCE:
				return rtsc_Realtimestatechart_Step_Sequence != null && !rtsc_Realtimestatechart_Step_Sequence.isEmpty();
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRANSITION_CAN_FIRE_SEQUENCE:
				return rtsc_Transition_CanFire_Sequence != null && !rtsc_Transition_CanFire_Sequence.isEmpty();
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRANSITION_FIRE_SEQUENCE:
				return rtsc_Transition_Fire_Sequence != null && !rtsc_Transition_Fire_Sequence.isEmpty();
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_REALTIMESTATECHARTS:
				return rtsc_tracedRealtimestatecharts != null && !rtsc_tracedRealtimestatecharts.isEmpty();
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_STATES:
				return rtsc_tracedStates != null && !rtsc_tracedStates.isEmpty();
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_TRANSITIONS:
				return rtsc_tracedTransitions != null && !rtsc_tracedTransitions.isEmpty();
			case RtscTracePackage.SPECIFIC_TRACE__RTSC_TRACED_VERTEXS:
				return rtsc_tracedVertexs != null && !rtsc_tracedVertexs.isEmpty();
			case RtscTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl
