/**
 */
package rtscTrace.States.rtsc.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rtscTrace.RtscTracePackage;

import rtscTrace.States.StatesPackage;

import rtscTrace.States.impl.StatesPackageImpl;

import rtscTrace.States.rtsc.RtscFactory;
import rtscTrace.States.rtsc.RtscPackage;
import rtscTrace.States.rtsc.TracedBehavior;
import rtscTrace.States.rtsc.TracedNamedElement;
import rtscTrace.States.rtsc.TracedRealtimestatechart;
import rtscTrace.States.rtsc.TracedState;
import rtscTrace.States.rtsc.TracedTransition;
import rtscTrace.States.rtsc.TracedVertex;

import rtscTrace.Steps.StepsPackage;

import rtscTrace.Steps.impl.StepsPackageImpl;

import rtscTrace.impl.RtscTracePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RtscPackageImpl extends EPackageImpl implements RtscPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedRealtimestatechartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedVertexEClass = null;

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
	 * @see rtscTrace.States.rtsc.RtscPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RtscPackageImpl() {
		super(eNS_URI, RtscFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RtscPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RtscPackage init() {
		if (isInited) return (RtscPackage)EPackage.Registry.INSTANCE.getEPackage(RtscPackage.eNS_URI);

		// Obtain or create and register package
		RtscPackageImpl theRtscPackage = (RtscPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RtscPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RtscPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RtscTracePackageImpl theRtscTracePackage = (RtscTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtscTracePackage.eNS_URI) instanceof RtscTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtscTracePackage.eNS_URI) : RtscTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		theRtscPackage.createPackageContents();
		theRtscTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		theRtscPackage.initializePackageContents();
		theRtscTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRtscPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RtscPackage.eNS_URI, theRtscPackage);
		return theRtscPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBehavior() {
		return tracedBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedNamedElement() {
		return tracedNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedRealtimestatechart() {
		return tracedRealtimestatechartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedRealtimestatechart_OriginalObject() {
		return (EReference)tracedRealtimestatechartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedRealtimestatechart_RoundsSequence() {
		return (EReference)tracedRealtimestatechartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedState() {
		return tracedStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTransition() {
		return tracedTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedTransition_HitCountSequence() {
		return (EReference)tracedTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedTransition_OriginalObject() {
		return (EReference)tracedTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedVertex() {
		return tracedVertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedVertex_ActiveSequence() {
		return (EReference)tracedVertexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedVertex_OriginalObject_Vertex() {
		return (EReference)tracedVertexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtscFactory getRtscFactory() {
		return (RtscFactory)getEFactoryInstance();
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
		tracedBehaviorEClass = createEClass(TRACED_BEHAVIOR);

		tracedNamedElementEClass = createEClass(TRACED_NAMED_ELEMENT);

		tracedRealtimestatechartEClass = createEClass(TRACED_REALTIMESTATECHART);
		createEReference(tracedRealtimestatechartEClass, TRACED_REALTIMESTATECHART__ORIGINAL_OBJECT);
		createEReference(tracedRealtimestatechartEClass, TRACED_REALTIMESTATECHART__ROUNDS_SEQUENCE);

		tracedStateEClass = createEClass(TRACED_STATE);

		tracedTransitionEClass = createEClass(TRACED_TRANSITION);
		createEReference(tracedTransitionEClass, TRACED_TRANSITION__HIT_COUNT_SEQUENCE);
		createEReference(tracedTransitionEClass, TRACED_TRANSITION__ORIGINAL_OBJECT);

		tracedVertexEClass = createEClass(TRACED_VERTEX);
		createEReference(tracedVertexEClass, TRACED_VERTEX__ACTIVE_SEQUENCE);
		createEReference(tracedVertexEClass, TRACED_VERTEX__ORIGINAL_OBJECT_VERTEX);
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
		org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage theRtscPackage_1 = (org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage)EPackage.Registry.INSTANCE.getEPackage(org.muml.xsrtsc.xsrtsc.rtsc.RtscPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedRealtimestatechartEClass.getESuperTypes().add(this.getTracedBehavior());
		tracedRealtimestatechartEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedStateEClass.getESuperTypes().add(this.getTracedVertex());
		tracedStateEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedTransitionEClass.getESuperTypes().add(this.getTracedNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(tracedBehaviorEClass, TracedBehavior.class, "TracedBehavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedNamedElementEClass, TracedNamedElement.class, "TracedNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedRealtimestatechartEClass, TracedRealtimestatechart.class, "TracedRealtimestatechart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedRealtimestatechart_OriginalObject(), theRtscPackage_1.getRealtimestatechart(), null, "originalObject", null, 0, 1, TracedRealtimestatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedRealtimestatechart_RoundsSequence(), theStatesPackage.getRealtimestatechart_rounds_Value(), theStatesPackage.getRealtimestatechart_rounds_Value_Parent(), "roundsSequence", null, 0, -1, TracedRealtimestatechart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedStateEClass, TracedState.class, "TracedState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedTransitionEClass, TracedTransition.class, "TracedTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedTransition_HitCountSequence(), theStatesPackage.getTransition_hitCount_Value(), theStatesPackage.getTransition_hitCount_Value_Parent(), "hitCountSequence", null, 0, -1, TracedTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedTransition_OriginalObject(), theRtscPackage_1.getTransition(), null, "originalObject", null, 0, 1, TracedTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedVertexEClass, TracedVertex.class, "TracedVertex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedVertex_ActiveSequence(), theStatesPackage.getVertex_active_Value(), theStatesPackage.getVertex_active_Value_Parent(), "activeSequence", null, 0, -1, TracedVertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedVertex_OriginalObject_Vertex(), theRtscPackage_1.getVertex(), null, "originalObject_Vertex", null, 0, 1, TracedVertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //RtscPackageImpl
