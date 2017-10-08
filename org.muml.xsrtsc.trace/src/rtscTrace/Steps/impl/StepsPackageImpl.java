/**
 */
package rtscTrace.Steps.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage;

import rtscTrace.RtscTracePackage;

import rtscTrace.States.StatesPackage;

import rtscTrace.States.impl.StatesPackageImpl;

import rtscTrace.States.rtsc.impl.RtscPackageImpl;

import rtscTrace.Steps.RootImplicitStep;
import rtscTrace.Steps.Rtsc_Realtimestatechart_InitRTSC;
import rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize;
import rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize_AbstractSubStep;
import rtscTrace.Steps.Rtsc_Realtimestatechart_Initialize_ImplicitStep;
import rtscTrace.Steps.Rtsc_Realtimestatechart_Step;
import rtscTrace.Steps.Rtsc_Realtimestatechart_Step_AbstractSubStep;
import rtscTrace.Steps.Rtsc_Realtimestatechart_Step_ImplicitStep;
import rtscTrace.Steps.Rtsc_Transition_CanFire;
import rtscTrace.Steps.Rtsc_Transition_Fire;
import rtscTrace.Steps.SpecificStep;
import rtscTrace.Steps.StepsFactory;
import rtscTrace.Steps.StepsPackage;

import rtscTrace.impl.RtscTracePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsPackageImpl extends EPackageImpl implements StepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtsc_Realtimestatechart_InitRTSCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtsc_Realtimestatechart_InitializeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtsc_Realtimestatechart_Initialize_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtsc_Realtimestatechart_Initialize_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtsc_Realtimestatechart_StepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtsc_Realtimestatechart_Step_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtsc_Realtimestatechart_Step_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtsc_Transition_CanFireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtsc_Transition_FireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificStepEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see rtscTrace.Steps.StepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StepsPackageImpl() {
		super(eNS_URI, StepsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StepsPackage init() {
		if (isInited) return (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Obtain or create and register package
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StepsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		RtscPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RtscTracePackageImpl theRtscTracePackage = (RtscTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtscTracePackage.eNS_URI) instanceof RtscTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtscTracePackage.eNS_URI) : RtscTracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		RtscPackageImpl theRtscPackage_1 = (RtscPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(rtscTrace.States.rtsc.RtscPackage.eNS_URI) instanceof RtscPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(rtscTrace.States.rtsc.RtscPackage.eNS_URI) : rtscTrace.States.rtsc.RtscPackage.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		theRtscTracePackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theRtscPackage_1.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		theRtscTracePackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theRtscPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StepsPackage.eNS_URI, theStepsPackage);
		return theStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootImplicitStep() {
		return rootImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtsc_Realtimestatechart_InitRTSC() {
		return rtsc_Realtimestatechart_InitRTSCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtsc_Realtimestatechart_Initialize() {
		return rtsc_Realtimestatechart_InitializeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtsc_Realtimestatechart_Initialize_AbstractSubStep() {
		return rtsc_Realtimestatechart_Initialize_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtsc_Realtimestatechart_Initialize_ImplicitStep() {
		return rtsc_Realtimestatechart_Initialize_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtsc_Realtimestatechart_Step() {
		return rtsc_Realtimestatechart_StepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtsc_Realtimestatechart_Step_AbstractSubStep() {
		return rtsc_Realtimestatechart_Step_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtsc_Realtimestatechart_Step_ImplicitStep() {
		return rtsc_Realtimestatechart_Step_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtsc_Transition_CanFire() {
		return rtsc_Transition_CanFireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtsc_Transition_Fire() {
		return rtsc_Transition_FireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificStep() {
		return specificStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_EndingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_StartingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactory getStepsFactory() {
		return (StepsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		rtsc_Realtimestatechart_InitRTSCEClass = createEClass(RTSC_REALTIMESTATECHART_INIT_RTSC);

		rtsc_Realtimestatechart_InitializeEClass = createEClass(RTSC_REALTIMESTATECHART_INITIALIZE);

		rtsc_Realtimestatechart_Initialize_AbstractSubStepEClass = createEClass(RTSC_REALTIMESTATECHART_INITIALIZE_ABSTRACT_SUB_STEP);

		rtsc_Realtimestatechart_Initialize_ImplicitStepEClass = createEClass(RTSC_REALTIMESTATECHART_INITIALIZE_IMPLICIT_STEP);

		rtsc_Realtimestatechart_StepEClass = createEClass(RTSC_REALTIMESTATECHART_STEP);

		rtsc_Realtimestatechart_Step_AbstractSubStepEClass = createEClass(RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP);

		rtsc_Realtimestatechart_Step_ImplicitStepEClass = createEClass(RTSC_REALTIMESTATECHART_STEP_IMPLICIT_STEP);

		rtsc_Transition_CanFireEClass = createEClass(RTSC_TRANSITION_CAN_FIRE);

		rtsc_Transition_FireEClass = createEClass(RTSC_TRANSITION_FIRE);

		specificStepEClass = createEClass(SPECIFIC_STEP);
		createEReference(specificStepEClass, SPECIFIC_STEP__ENDING_STATE);
		createEReference(specificStepEClass, SPECIFIC_STEP__STARTING_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		rtscTrace.States.rtsc.RtscPackage theRtscPackage_1 = (rtscTrace.States.rtsc.RtscPackage)EPackage.Registry.INSTANCE.getEPackage(rtscTrace.States.rtsc.RtscPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rootImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		rtsc_Realtimestatechart_InitRTSCEClass.getESuperTypes().add(this.getRtsc_Realtimestatechart_Initialize_AbstractSubStep());
		rtsc_Realtimestatechart_InitRTSCEClass.getESuperTypes().add(this.getSpecificStep());
		rtsc_Realtimestatechart_InitRTSCEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		EGenericType g1 = createEGenericType(this.getSpecificStep());
		rtsc_Realtimestatechart_InitializeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		EGenericType g2 = createEGenericType(this.getRtsc_Realtimestatechart_Initialize_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		rtsc_Realtimestatechart_InitializeEClass.getEGenericSuperTypes().add(g1);
		rtsc_Realtimestatechart_Initialize_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		rtsc_Realtimestatechart_Initialize_ImplicitStepEClass.getESuperTypes().add(this.getRtsc_Realtimestatechart_Initialize_AbstractSubStep());
		rtsc_Realtimestatechart_Initialize_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getSpecificStep());
		rtsc_Realtimestatechart_StepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getRtsc_Realtimestatechart_Step_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		rtsc_Realtimestatechart_StepEClass.getEGenericSuperTypes().add(g1);
		rtsc_Realtimestatechart_Step_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		rtsc_Realtimestatechart_Step_ImplicitStepEClass.getESuperTypes().add(this.getRtsc_Realtimestatechart_Step_AbstractSubStep());
		rtsc_Realtimestatechart_Step_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		rtsc_Transition_CanFireEClass.getESuperTypes().add(this.getRtsc_Realtimestatechart_Step_AbstractSubStep());
		rtsc_Transition_CanFireEClass.getESuperTypes().add(this.getSpecificStep());
		rtsc_Transition_CanFireEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		rtsc_Transition_FireEClass.getESuperTypes().add(this.getRtsc_Realtimestatechart_Step_AbstractSubStep());
		rtsc_Transition_FireEClass.getESuperTypes().add(this.getSpecificStep());
		rtsc_Transition_FireEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		specificStepEClass.getESuperTypes().add(theTracePackage.getStep());

		// Initialize classes and features; add operations and parameters
		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtsc_Realtimestatechart_InitRTSCEClass, Rtsc_Realtimestatechart_InitRTSC.class, "Rtsc_Realtimestatechart_InitRTSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(rtsc_Realtimestatechart_InitRTSCEClass, theRtscPackage_1.getTracedRealtimestatechart(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rtsc_Realtimestatechart_InitializeEClass, Rtsc_Realtimestatechart_Initialize.class, "Rtsc_Realtimestatechart_Initialize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(rtsc_Realtimestatechart_InitializeEClass, theRtscPackage_1.getTracedRealtimestatechart(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rtsc_Realtimestatechart_Initialize_AbstractSubStepEClass, Rtsc_Realtimestatechart_Initialize_AbstractSubStep.class, "Rtsc_Realtimestatechart_Initialize_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtsc_Realtimestatechart_Initialize_ImplicitStepEClass, Rtsc_Realtimestatechart_Initialize_ImplicitStep.class, "Rtsc_Realtimestatechart_Initialize_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtsc_Realtimestatechart_StepEClass, Rtsc_Realtimestatechart_Step.class, "Rtsc_Realtimestatechart_Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(rtsc_Realtimestatechart_StepEClass, theRtscPackage_1.getTracedRealtimestatechart(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rtsc_Realtimestatechart_Step_AbstractSubStepEClass, Rtsc_Realtimestatechart_Step_AbstractSubStep.class, "Rtsc_Realtimestatechart_Step_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtsc_Realtimestatechart_Step_ImplicitStepEClass, Rtsc_Realtimestatechart_Step_ImplicitStep.class, "Rtsc_Realtimestatechart_Step_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtsc_Transition_CanFireEClass, Rtsc_Transition_CanFire.class, "Rtsc_Transition_CanFire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(rtsc_Transition_CanFireEClass, theRtscPackage_1.getTracedTransition(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rtsc_Transition_FireEClass, Rtsc_Transition_Fire.class, "Rtsc_Transition_Fire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(rtsc_Transition_FireEClass, theRtscPackage_1.getTracedTransition(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(specificStepEClass, SpecificStep.class, "SpecificStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificStep_EndingState(), theStatesPackage.getState(), theStatesPackage.getState_EndedSteps(), "endingState", null, 0, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificStep_StartingState(), theStatesPackage.getState(), theStatesPackage.getState_StartedSteps(), "startingState", null, 1, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StepsPackageImpl
