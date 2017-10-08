/**
 */
package rtscTrace.Steps;

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
 * @see rtscTrace.Steps.StepsFactory
 * @model kind="package"
 * @generated
 */
public interface StepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Steps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "rtscTrace_Steps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsPackage eINSTANCE = rtscTrace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link rtscTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.Steps.impl.RootImplicitStepImpl
	 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSEOCCURRENCE = TracePackage.SMALL_STEP__MSEOCCURRENCE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = TracePackage.SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rtscTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.Steps.SpecificStep
	 * @see rtscTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
	 * @generated
	 */
	int SPECIFIC_STEP = 10;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__MSEOCCURRENCE = TracePackage.STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__ENDING_STATE = TracePackage.STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__STARTING_STATE = TracePackage.STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_FEATURE_COUNT = TracePackage.STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize_AbstractSubStep <em>Rtsc Realtimestatechart Initialize Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize_AbstractSubStep
	 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Realtimestatechart_Initialize_AbstractSubStep()
	 * @generated
	 */
	int RTSC_REALTIMESTATECHART_INITIALIZE_ABSTRACT_SUB_STEP = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_INITIALIZE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_INITIALIZE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_INITIALIZE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Rtsc Realtimestatechart Initialize Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_INITIALIZE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rtscTrace.Steps.impl.Rtsc_Realtimestatechart_InitRTSCImpl <em>Rtsc Realtimestatechart Init RTSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.Steps.impl.Rtsc_Realtimestatechart_InitRTSCImpl
	 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Realtimestatechart_InitRTSC()
	 * @generated
	 */
	int RTSC_REALTIMESTATECHART_INIT_RTSC = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_INIT_RTSC__MSEOCCURRENCE = RTSC_REALTIMESTATECHART_INITIALIZE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_INIT_RTSC__ENDING_STATE = RTSC_REALTIMESTATECHART_INITIALIZE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_INIT_RTSC__STARTING_STATE = RTSC_REALTIMESTATECHART_INITIALIZE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Rtsc Realtimestatechart Init RTSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_INIT_RTSC_FEATURE_COUNT = RTSC_REALTIMESTATECHART_INITIALIZE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rtscTrace.Steps.impl.Rtsc_Realtimestatechart_InitializeImpl <em>Rtsc Realtimestatechart Initialize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.Steps.impl.Rtsc_Realtimestatechart_InitializeImpl
	 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Realtimestatechart_Initialize()
	 * @generated
	 */
	int RTSC_REALTIMESTATECHART_INITIALIZE = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_INITIALIZE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_INITIALIZE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_INITIALIZE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_INITIALIZE__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtsc Realtimestatechart Initialize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_INITIALIZE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rtscTrace.Steps.impl.Rtsc_Realtimestatechart_Initialize_ImplicitStepImpl <em>Rtsc Realtimestatechart Initialize Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.Steps.impl.Rtsc_Realtimestatechart_Initialize_ImplicitStepImpl
	 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Realtimestatechart_Initialize_ImplicitStep()
	 * @generated
	 */
	int RTSC_REALTIMESTATECHART_INITIALIZE_IMPLICIT_STEP = 4;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_INITIALIZE_IMPLICIT_STEP__MSEOCCURRENCE = RTSC_REALTIMESTATECHART_INITIALIZE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_INITIALIZE_IMPLICIT_STEP__ENDING_STATE = RTSC_REALTIMESTATECHART_INITIALIZE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_INITIALIZE_IMPLICIT_STEP__STARTING_STATE = RTSC_REALTIMESTATECHART_INITIALIZE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Rtsc Realtimestatechart Initialize Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_INITIALIZE_IMPLICIT_STEP_FEATURE_COUNT = RTSC_REALTIMESTATECHART_INITIALIZE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rtscTrace.Steps.impl.Rtsc_Realtimestatechart_StepImpl <em>Rtsc Realtimestatechart Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.Steps.impl.Rtsc_Realtimestatechart_StepImpl
	 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Realtimestatechart_Step()
	 * @generated
	 */
	int RTSC_REALTIMESTATECHART_STEP = 5;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_STEP__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtsc Realtimestatechart Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rtscTrace.Steps.Rtsc_Realtimestatechart_Step_AbstractSubStep <em>Rtsc Realtimestatechart Step Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.Steps.Rtsc_Realtimestatechart_Step_AbstractSubStep
	 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Realtimestatechart_Step_AbstractSubStep()
	 * @generated
	 */
	int RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP = 6;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Rtsc Realtimestatechart Step Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rtscTrace.Steps.impl.Rtsc_Realtimestatechart_Step_ImplicitStepImpl <em>Rtsc Realtimestatechart Step Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.Steps.impl.Rtsc_Realtimestatechart_Step_ImplicitStepImpl
	 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Realtimestatechart_Step_ImplicitStep()
	 * @generated
	 */
	int RTSC_REALTIMESTATECHART_STEP_IMPLICIT_STEP = 7;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_STEP_IMPLICIT_STEP__MSEOCCURRENCE = RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_STEP_IMPLICIT_STEP__ENDING_STATE = RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_STEP_IMPLICIT_STEP__STARTING_STATE = RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Rtsc Realtimestatechart Step Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_REALTIMESTATECHART_STEP_IMPLICIT_STEP_FEATURE_COUNT = RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rtscTrace.Steps.impl.Rtsc_Transition_CanFireImpl <em>Rtsc Transition Can Fire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.Steps.impl.Rtsc_Transition_CanFireImpl
	 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Transition_CanFire()
	 * @generated
	 */
	int RTSC_TRANSITION_CAN_FIRE = 8;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_TRANSITION_CAN_FIRE__MSEOCCURRENCE = RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_TRANSITION_CAN_FIRE__ENDING_STATE = RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_TRANSITION_CAN_FIRE__STARTING_STATE = RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Rtsc Transition Can Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_TRANSITION_CAN_FIRE_FEATURE_COUNT = RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rtscTrace.Steps.impl.Rtsc_Transition_FireImpl <em>Rtsc Transition Fire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.Steps.impl.Rtsc_Transition_FireImpl
	 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Transition_Fire()
	 * @generated
	 */
	int RTSC_TRANSITION_FIRE = 9;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_TRANSITION_FIRE__MSEOCCURRENCE = RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_TRANSITION_FIRE__ENDING_STATE = RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_TRANSITION_FIRE__STARTING_STATE = RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Rtsc Transition Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTSC_TRANSITION_FIRE_FEATURE_COUNT = RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link rtscTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see rtscTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link rtscTrace.Steps.Rtsc_Realtimestatechart_InitRTSC <em>Rtsc Realtimestatechart Init RTSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtsc Realtimestatechart Init RTSC</em>'.
	 * @see rtscTrace.Steps.Rtsc_Realtimestatechart_InitRTSC
	 * @generated
	 */
	EClass getRtsc_Realtimestatechart_InitRTSC();

	/**
	 * Returns the meta object for class '{@link rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize <em>Rtsc Realtimestatechart Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtsc Realtimestatechart Initialize</em>'.
	 * @see rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize
	 * @generated
	 */
	EClass getRtsc_Realtimestatechart_Initialize();

	/**
	 * Returns the meta object for class '{@link rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize_AbstractSubStep <em>Rtsc Realtimestatechart Initialize Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtsc Realtimestatechart Initialize Abstract Sub Step</em>'.
	 * @see rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize_AbstractSubStep
	 * @generated
	 */
	EClass getRtsc_Realtimestatechart_Initialize_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize_ImplicitStep <em>Rtsc Realtimestatechart Initialize Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtsc Realtimestatechart Initialize Implicit Step</em>'.
	 * @see rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize_ImplicitStep
	 * @generated
	 */
	EClass getRtsc_Realtimestatechart_Initialize_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link rtscTrace.Steps.Rtsc_Realtimestatechart_Step <em>Rtsc Realtimestatechart Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtsc Realtimestatechart Step</em>'.
	 * @see rtscTrace.Steps.Rtsc_Realtimestatechart_Step
	 * @generated
	 */
	EClass getRtsc_Realtimestatechart_Step();

	/**
	 * Returns the meta object for class '{@link rtscTrace.Steps.Rtsc_Realtimestatechart_Step_AbstractSubStep <em>Rtsc Realtimestatechart Step Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtsc Realtimestatechart Step Abstract Sub Step</em>'.
	 * @see rtscTrace.Steps.Rtsc_Realtimestatechart_Step_AbstractSubStep
	 * @generated
	 */
	EClass getRtsc_Realtimestatechart_Step_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link rtscTrace.Steps.Rtsc_Realtimestatechart_Step_ImplicitStep <em>Rtsc Realtimestatechart Step Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtsc Realtimestatechart Step Implicit Step</em>'.
	 * @see rtscTrace.Steps.Rtsc_Realtimestatechart_Step_ImplicitStep
	 * @generated
	 */
	EClass getRtsc_Realtimestatechart_Step_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link rtscTrace.Steps.Rtsc_Transition_CanFire <em>Rtsc Transition Can Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtsc Transition Can Fire</em>'.
	 * @see rtscTrace.Steps.Rtsc_Transition_CanFire
	 * @generated
	 */
	EClass getRtsc_Transition_CanFire();

	/**
	 * Returns the meta object for class '{@link rtscTrace.Steps.Rtsc_Transition_Fire <em>Rtsc Transition Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtsc Transition Fire</em>'.
	 * @see rtscTrace.Steps.Rtsc_Transition_Fire
	 * @generated
	 */
	EClass getRtsc_Transition_Fire();

	/**
	 * Returns the meta object for class '{@link rtscTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Step</em>'.
	 * @see rtscTrace.Steps.SpecificStep
	 * @generated
	 */
	EClass getSpecificStep();

	/**
	 * Returns the meta object for the reference '{@link rtscTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see rtscTrace.Steps.SpecificStep#getEndingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_EndingState();

	/**
	 * Returns the meta object for the reference '{@link rtscTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see rtscTrace.Steps.SpecificStep#getStartingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_StartingState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepsFactory getStepsFactory();

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
		 * The meta object literal for the '{@link rtscTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.Steps.impl.RootImplicitStepImpl
		 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link rtscTrace.Steps.impl.Rtsc_Realtimestatechart_InitRTSCImpl <em>Rtsc Realtimestatechart Init RTSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.Steps.impl.Rtsc_Realtimestatechart_InitRTSCImpl
		 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Realtimestatechart_InitRTSC()
		 * @generated
		 */
		EClass RTSC_REALTIMESTATECHART_INIT_RTSC = eINSTANCE.getRtsc_Realtimestatechart_InitRTSC();

		/**
		 * The meta object literal for the '{@link rtscTrace.Steps.impl.Rtsc_Realtimestatechart_InitializeImpl <em>Rtsc Realtimestatechart Initialize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.Steps.impl.Rtsc_Realtimestatechart_InitializeImpl
		 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Realtimestatechart_Initialize()
		 * @generated
		 */
		EClass RTSC_REALTIMESTATECHART_INITIALIZE = eINSTANCE.getRtsc_Realtimestatechart_Initialize();

		/**
		 * The meta object literal for the '{@link rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize_AbstractSubStep <em>Rtsc Realtimestatechart Initialize Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize_AbstractSubStep
		 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Realtimestatechart_Initialize_AbstractSubStep()
		 * @generated
		 */
		EClass RTSC_REALTIMESTATECHART_INITIALIZE_ABSTRACT_SUB_STEP = eINSTANCE.getRtsc_Realtimestatechart_Initialize_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link rtscTrace.Steps.impl.Rtsc_Realtimestatechart_Initialize_ImplicitStepImpl <em>Rtsc Realtimestatechart Initialize Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.Steps.impl.Rtsc_Realtimestatechart_Initialize_ImplicitStepImpl
		 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Realtimestatechart_Initialize_ImplicitStep()
		 * @generated
		 */
		EClass RTSC_REALTIMESTATECHART_INITIALIZE_IMPLICIT_STEP = eINSTANCE.getRtsc_Realtimestatechart_Initialize_ImplicitStep();

		/**
		 * The meta object literal for the '{@link rtscTrace.Steps.impl.Rtsc_Realtimestatechart_StepImpl <em>Rtsc Realtimestatechart Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.Steps.impl.Rtsc_Realtimestatechart_StepImpl
		 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Realtimestatechart_Step()
		 * @generated
		 */
		EClass RTSC_REALTIMESTATECHART_STEP = eINSTANCE.getRtsc_Realtimestatechart_Step();

		/**
		 * The meta object literal for the '{@link rtscTrace.Steps.Rtsc_Realtimestatechart_Step_AbstractSubStep <em>Rtsc Realtimestatechart Step Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.Steps.Rtsc_Realtimestatechart_Step_AbstractSubStep
		 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Realtimestatechart_Step_AbstractSubStep()
		 * @generated
		 */
		EClass RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP = eINSTANCE.getRtsc_Realtimestatechart_Step_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link rtscTrace.Steps.impl.Rtsc_Realtimestatechart_Step_ImplicitStepImpl <em>Rtsc Realtimestatechart Step Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.Steps.impl.Rtsc_Realtimestatechart_Step_ImplicitStepImpl
		 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Realtimestatechart_Step_ImplicitStep()
		 * @generated
		 */
		EClass RTSC_REALTIMESTATECHART_STEP_IMPLICIT_STEP = eINSTANCE.getRtsc_Realtimestatechart_Step_ImplicitStep();

		/**
		 * The meta object literal for the '{@link rtscTrace.Steps.impl.Rtsc_Transition_CanFireImpl <em>Rtsc Transition Can Fire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.Steps.impl.Rtsc_Transition_CanFireImpl
		 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Transition_CanFire()
		 * @generated
		 */
		EClass RTSC_TRANSITION_CAN_FIRE = eINSTANCE.getRtsc_Transition_CanFire();

		/**
		 * The meta object literal for the '{@link rtscTrace.Steps.impl.Rtsc_Transition_FireImpl <em>Rtsc Transition Fire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.Steps.impl.Rtsc_Transition_FireImpl
		 * @see rtscTrace.Steps.impl.StepsPackageImpl#getRtsc_Transition_Fire()
		 * @generated
		 */
		EClass RTSC_TRANSITION_FIRE = eINSTANCE.getRtsc_Transition_Fire();

		/**
		 * The meta object literal for the '{@link rtscTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.Steps.SpecificStep
		 * @see rtscTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
		 * @generated
		 */
		EClass SPECIFIC_STEP = eINSTANCE.getSpecificStep();

		/**
		 * The meta object literal for the '<em><b>Ending State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__ENDING_STATE = eINSTANCE.getSpecificStep_EndingState();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__STARTING_STATE = eINSTANCE.getSpecificStep_StartingState();

	}

} //StepsPackage
