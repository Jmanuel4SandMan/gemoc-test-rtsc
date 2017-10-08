/**
 */
package rtscTrace;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rtscTrace.RtscTraceFactory
 * @model kind="package"
 * @generated
 */
public interface RtscTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rtscTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "rtscTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rtscTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RtscTracePackage eINSTANCE = rtscTrace.impl.RtscTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link rtscTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.impl.SpecificTraceImpl
	 * @see rtscTrace.impl.RtscTracePackageImpl#getSpecificTrace()
	 * @generated
	 */
	int SPECIFIC_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Root Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ROOT_STEP = TracePackage.TRACE__ROOT_STEP;

	/**
	 * The feature id for the '<em><b>Launchconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LAUNCHCONFIGURATION = TracePackage.TRACE__LAUNCHCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Rtsc Realtimestatechart Init RTSC Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_INIT_RTSC_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rtsc Realtimestatechart Initialize Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_INITIALIZE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rtsc Realtimestatechart Step Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_STEP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rtsc Transition Can Fire Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__RTSC_TRANSITION_CAN_FIRE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rtsc Transition Fire Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__RTSC_TRANSITION_FIRE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rtsc traced Realtimestatecharts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__RTSC_TRACED_REALTIMESTATECHARTS = TracePackage.TRACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rtsc traced States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__RTSC_TRACED_STATES = TracePackage.TRACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rtsc traced Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__RTSC_TRACED_TRANSITIONS = TracePackage.TRACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rtsc traced Vertexs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__RTSC_TRACED_VERTEXS = TracePackage.TRACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__STATES_TRACE = TracePackage.TRACE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_FEATURE_COUNT = TracePackage.TRACE_FEATURE_COUNT + 10;


	/**
	 * Returns the meta object for class '{@link rtscTrace.SpecificTrace <em>Specific Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Trace</em>'.
	 * @see rtscTrace.SpecificTrace
	 * @generated
	 */
	EClass getSpecificTrace();

	/**
	 * Returns the meta object for the reference list '{@link rtscTrace.SpecificTrace#getRtsc_Realtimestatechart_InitRTSC_Sequence <em>Rtsc Realtimestatechart Init RTSC Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rtsc Realtimestatechart Init RTSC Sequence</em>'.
	 * @see rtscTrace.SpecificTrace#getRtsc_Realtimestatechart_InitRTSC_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Rtsc_Realtimestatechart_InitRTSC_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link rtscTrace.SpecificTrace#getRtsc_Realtimestatechart_Initialize_Sequence <em>Rtsc Realtimestatechart Initialize Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rtsc Realtimestatechart Initialize Sequence</em>'.
	 * @see rtscTrace.SpecificTrace#getRtsc_Realtimestatechart_Initialize_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Rtsc_Realtimestatechart_Initialize_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link rtscTrace.SpecificTrace#getRtsc_Realtimestatechart_Step_Sequence <em>Rtsc Realtimestatechart Step Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rtsc Realtimestatechart Step Sequence</em>'.
	 * @see rtscTrace.SpecificTrace#getRtsc_Realtimestatechart_Step_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Rtsc_Realtimestatechart_Step_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link rtscTrace.SpecificTrace#getRtsc_Transition_CanFire_Sequence <em>Rtsc Transition Can Fire Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rtsc Transition Can Fire Sequence</em>'.
	 * @see rtscTrace.SpecificTrace#getRtsc_Transition_CanFire_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Rtsc_Transition_CanFire_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link rtscTrace.SpecificTrace#getRtsc_Transition_Fire_Sequence <em>Rtsc Transition Fire Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rtsc Transition Fire Sequence</em>'.
	 * @see rtscTrace.SpecificTrace#getRtsc_Transition_Fire_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Rtsc_Transition_Fire_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link rtscTrace.SpecificTrace#getRtsc_tracedRealtimestatecharts <em>Rtsc traced Realtimestatecharts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rtsc traced Realtimestatecharts</em>'.
	 * @see rtscTrace.SpecificTrace#getRtsc_tracedRealtimestatecharts()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Rtsc_tracedRealtimestatecharts();

	/**
	 * Returns the meta object for the containment reference list '{@link rtscTrace.SpecificTrace#getRtsc_tracedStates <em>Rtsc traced States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rtsc traced States</em>'.
	 * @see rtscTrace.SpecificTrace#getRtsc_tracedStates()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Rtsc_tracedStates();

	/**
	 * Returns the meta object for the containment reference list '{@link rtscTrace.SpecificTrace#getRtsc_tracedTransitions <em>Rtsc traced Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rtsc traced Transitions</em>'.
	 * @see rtscTrace.SpecificTrace#getRtsc_tracedTransitions()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Rtsc_tracedTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link rtscTrace.SpecificTrace#getRtsc_tracedVertexs <em>Rtsc traced Vertexs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rtsc traced Vertexs</em>'.
	 * @see rtscTrace.SpecificTrace#getRtsc_tracedVertexs()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Rtsc_tracedVertexs();

	/**
	 * Returns the meta object for the containment reference list '{@link rtscTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see rtscTrace.SpecificTrace#getStatesTrace()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_StatesTrace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RtscTraceFactory getRtscTraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rtscTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.impl.SpecificTraceImpl
		 * @see rtscTrace.impl.RtscTracePackageImpl#getSpecificTrace()
		 * @generated
		 */
		EClass SPECIFIC_TRACE = eINSTANCE.getSpecificTrace();

		/**
		 * The meta object literal for the '<em><b>Rtsc Realtimestatechart Init RTSC Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_INIT_RTSC_SEQUENCE = eINSTANCE.getSpecificTrace_Rtsc_Realtimestatechart_InitRTSC_Sequence();

		/**
		 * The meta object literal for the '<em><b>Rtsc Realtimestatechart Initialize Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_INITIALIZE_SEQUENCE = eINSTANCE.getSpecificTrace_Rtsc_Realtimestatechart_Initialize_Sequence();

		/**
		 * The meta object literal for the '<em><b>Rtsc Realtimestatechart Step Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__RTSC_REALTIMESTATECHART_STEP_SEQUENCE = eINSTANCE.getSpecificTrace_Rtsc_Realtimestatechart_Step_Sequence();

		/**
		 * The meta object literal for the '<em><b>Rtsc Transition Can Fire Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__RTSC_TRANSITION_CAN_FIRE_SEQUENCE = eINSTANCE.getSpecificTrace_Rtsc_Transition_CanFire_Sequence();

		/**
		 * The meta object literal for the '<em><b>Rtsc Transition Fire Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__RTSC_TRANSITION_FIRE_SEQUENCE = eINSTANCE.getSpecificTrace_Rtsc_Transition_Fire_Sequence();

		/**
		 * The meta object literal for the '<em><b>Rtsc traced Realtimestatecharts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__RTSC_TRACED_REALTIMESTATECHARTS = eINSTANCE.getSpecificTrace_Rtsc_tracedRealtimestatecharts();

		/**
		 * The meta object literal for the '<em><b>Rtsc traced States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__RTSC_TRACED_STATES = eINSTANCE.getSpecificTrace_Rtsc_tracedStates();

		/**
		 * The meta object literal for the '<em><b>Rtsc traced Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__RTSC_TRACED_TRANSITIONS = eINSTANCE.getSpecificTrace_Rtsc_tracedTransitions();

		/**
		 * The meta object literal for the '<em><b>Rtsc traced Vertexs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__RTSC_TRACED_VERTEXS = eINSTANCE.getSpecificTrace_Rtsc_tracedVertexs();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__STATES_TRACE = eINSTANCE.getSpecificTrace_StatesTrace();

	}

} //RtscTracePackage
