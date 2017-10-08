/**
 */
package rtscTrace;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Trace;

import org.eclipse.emf.common.util.EList;

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
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rtscTrace.SpecificTrace#getRtsc_Realtimestatechart_InitRTSC_Sequence <em>Rtsc Realtimestatechart Init RTSC Sequence</em>}</li>
 *   <li>{@link rtscTrace.SpecificTrace#getRtsc_Realtimestatechart_Initialize_Sequence <em>Rtsc Realtimestatechart Initialize Sequence</em>}</li>
 *   <li>{@link rtscTrace.SpecificTrace#getRtsc_Realtimestatechart_Step_Sequence <em>Rtsc Realtimestatechart Step Sequence</em>}</li>
 *   <li>{@link rtscTrace.SpecificTrace#getRtsc_Transition_CanFire_Sequence <em>Rtsc Transition Can Fire Sequence</em>}</li>
 *   <li>{@link rtscTrace.SpecificTrace#getRtsc_Transition_Fire_Sequence <em>Rtsc Transition Fire Sequence</em>}</li>
 *   <li>{@link rtscTrace.SpecificTrace#getRtsc_tracedRealtimestatecharts <em>Rtsc traced Realtimestatecharts</em>}</li>
 *   <li>{@link rtscTrace.SpecificTrace#getRtsc_tracedStates <em>Rtsc traced States</em>}</li>
 *   <li>{@link rtscTrace.SpecificTrace#getRtsc_tracedTransitions <em>Rtsc traced Transitions</em>}</li>
 *   <li>{@link rtscTrace.SpecificTrace#getRtsc_tracedVertexs <em>Rtsc traced Vertexs</em>}</li>
 *   <li>{@link rtscTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @see rtscTrace.RtscTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<SpecificStep>> {
	/**
	 * Returns the value of the '<em><b>Rtsc Realtimestatechart Init RTSC Sequence</b></em>' reference list.
	 * The list contents are of type {@link rtscTrace.Steps.Rtsc_Realtimestatechart_InitRTSC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtsc Realtimestatechart Init RTSC Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtsc Realtimestatechart Init RTSC Sequence</em>' reference list.
	 * @see rtscTrace.RtscTracePackage#getSpecificTrace_Rtsc_Realtimestatechart_InitRTSC_Sequence()
	 * @model
	 * @generated
	 */
	EList<Rtsc_Realtimestatechart_InitRTSC> getRtsc_Realtimestatechart_InitRTSC_Sequence();

	/**
	 * Returns the value of the '<em><b>Rtsc Realtimestatechart Initialize Sequence</b></em>' reference list.
	 * The list contents are of type {@link rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtsc Realtimestatechart Initialize Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtsc Realtimestatechart Initialize Sequence</em>' reference list.
	 * @see rtscTrace.RtscTracePackage#getSpecificTrace_Rtsc_Realtimestatechart_Initialize_Sequence()
	 * @model
	 * @generated
	 */
	EList<Rtsc_Realtimestatechart_Initialize> getRtsc_Realtimestatechart_Initialize_Sequence();

	/**
	 * Returns the value of the '<em><b>Rtsc Realtimestatechart Step Sequence</b></em>' reference list.
	 * The list contents are of type {@link rtscTrace.Steps.Rtsc_Realtimestatechart_Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtsc Realtimestatechart Step Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtsc Realtimestatechart Step Sequence</em>' reference list.
	 * @see rtscTrace.RtscTracePackage#getSpecificTrace_Rtsc_Realtimestatechart_Step_Sequence()
	 * @model
	 * @generated
	 */
	EList<Rtsc_Realtimestatechart_Step> getRtsc_Realtimestatechart_Step_Sequence();

	/**
	 * Returns the value of the '<em><b>Rtsc Transition Can Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link rtscTrace.Steps.Rtsc_Transition_CanFire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtsc Transition Can Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtsc Transition Can Fire Sequence</em>' reference list.
	 * @see rtscTrace.RtscTracePackage#getSpecificTrace_Rtsc_Transition_CanFire_Sequence()
	 * @model
	 * @generated
	 */
	EList<Rtsc_Transition_CanFire> getRtsc_Transition_CanFire_Sequence();

	/**
	 * Returns the value of the '<em><b>Rtsc Transition Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link rtscTrace.Steps.Rtsc_Transition_Fire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtsc Transition Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtsc Transition Fire Sequence</em>' reference list.
	 * @see rtscTrace.RtscTracePackage#getSpecificTrace_Rtsc_Transition_Fire_Sequence()
	 * @model
	 * @generated
	 */
	EList<Rtsc_Transition_Fire> getRtsc_Transition_Fire_Sequence();

	/**
	 * Returns the value of the '<em><b>Rtsc traced Realtimestatecharts</b></em>' containment reference list.
	 * The list contents are of type {@link rtscTrace.States.rtsc.TracedRealtimestatechart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtsc traced Realtimestatecharts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtsc traced Realtimestatecharts</em>' containment reference list.
	 * @see rtscTrace.RtscTracePackage#getSpecificTrace_Rtsc_tracedRealtimestatecharts()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedRealtimestatechart> getRtsc_tracedRealtimestatecharts();

	/**
	 * Returns the value of the '<em><b>Rtsc traced States</b></em>' containment reference list.
	 * The list contents are of type {@link rtscTrace.States.rtsc.TracedState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtsc traced States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtsc traced States</em>' containment reference list.
	 * @see rtscTrace.RtscTracePackage#getSpecificTrace_Rtsc_tracedStates()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedState> getRtsc_tracedStates();

	/**
	 * Returns the value of the '<em><b>Rtsc traced Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link rtscTrace.States.rtsc.TracedTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtsc traced Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtsc traced Transitions</em>' containment reference list.
	 * @see rtscTrace.RtscTracePackage#getSpecificTrace_Rtsc_tracedTransitions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedTransition> getRtsc_tracedTransitions();

	/**
	 * Returns the value of the '<em><b>Rtsc traced Vertexs</b></em>' containment reference list.
	 * The list contents are of type {@link rtscTrace.States.rtsc.TracedVertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtsc traced Vertexs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtsc traced Vertexs</em>' containment reference list.
	 * @see rtscTrace.RtscTracePackage#getSpecificTrace_Rtsc_tracedVertexs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedVertex> getRtsc_tracedVertexs();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link rtscTrace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see rtscTrace.RtscTracePackage#getSpecificTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // SpecificTrace
