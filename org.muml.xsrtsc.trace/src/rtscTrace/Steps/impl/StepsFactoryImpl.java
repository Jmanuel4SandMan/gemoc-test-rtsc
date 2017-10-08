/**
 */
package rtscTrace.Steps.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rtscTrace.Steps.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsFactoryImpl extends EFactoryImpl implements StepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepsFactory init() {
		try {
			StepsFactory theStepsFactory = (StepsFactory)EPackage.Registry.INSTANCE.getEFactory(StepsPackage.eNS_URI);
			if (theStepsFactory != null) {
				return theStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StepsPackage.ROOT_IMPLICIT_STEP: return createRootImplicitStep();
			case StepsPackage.RTSC_REALTIMESTATECHART_INIT_RTSC: return createRtsc_Realtimestatechart_InitRTSC();
			case StepsPackage.RTSC_REALTIMESTATECHART_INITIALIZE: return createRtsc_Realtimestatechart_Initialize();
			case StepsPackage.RTSC_REALTIMESTATECHART_INITIALIZE_IMPLICIT_STEP: return createRtsc_Realtimestatechart_Initialize_ImplicitStep();
			case StepsPackage.RTSC_REALTIMESTATECHART_STEP: return createRtsc_Realtimestatechart_Step();
			case StepsPackage.RTSC_REALTIMESTATECHART_STEP_IMPLICIT_STEP: return createRtsc_Realtimestatechart_Step_ImplicitStep();
			case StepsPackage.RTSC_TRANSITION_CAN_FIRE: return createRtsc_Transition_CanFire();
			case StepsPackage.RTSC_TRANSITION_FIRE: return createRtsc_Transition_Fire();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootImplicitStep createRootImplicitStep() {
		RootImplicitStepImpl rootImplicitStep = new RootImplicitStepImpl();
		return rootImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rtsc_Realtimestatechart_InitRTSC createRtsc_Realtimestatechart_InitRTSC() {
		Rtsc_Realtimestatechart_InitRTSCImpl rtsc_Realtimestatechart_InitRTSC = new Rtsc_Realtimestatechart_InitRTSCImpl();
		return rtsc_Realtimestatechart_InitRTSC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rtsc_Realtimestatechart_Initialize createRtsc_Realtimestatechart_Initialize() {
		Rtsc_Realtimestatechart_InitializeImpl rtsc_Realtimestatechart_Initialize = new Rtsc_Realtimestatechart_InitializeImpl();
		return rtsc_Realtimestatechart_Initialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rtsc_Realtimestatechart_Initialize_ImplicitStep createRtsc_Realtimestatechart_Initialize_ImplicitStep() {
		Rtsc_Realtimestatechart_Initialize_ImplicitStepImpl rtsc_Realtimestatechart_Initialize_ImplicitStep = new Rtsc_Realtimestatechart_Initialize_ImplicitStepImpl();
		return rtsc_Realtimestatechart_Initialize_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rtsc_Realtimestatechart_Step createRtsc_Realtimestatechart_Step() {
		Rtsc_Realtimestatechart_StepImpl rtsc_Realtimestatechart_Step = new Rtsc_Realtimestatechart_StepImpl();
		return rtsc_Realtimestatechart_Step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rtsc_Realtimestatechart_Step_ImplicitStep createRtsc_Realtimestatechart_Step_ImplicitStep() {
		Rtsc_Realtimestatechart_Step_ImplicitStepImpl rtsc_Realtimestatechart_Step_ImplicitStep = new Rtsc_Realtimestatechart_Step_ImplicitStepImpl();
		return rtsc_Realtimestatechart_Step_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rtsc_Transition_CanFire createRtsc_Transition_CanFire() {
		Rtsc_Transition_CanFireImpl rtsc_Transition_CanFire = new Rtsc_Transition_CanFireImpl();
		return rtsc_Transition_CanFire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rtsc_Transition_Fire createRtsc_Transition_Fire() {
		Rtsc_Transition_FireImpl rtsc_Transition_Fire = new Rtsc_Transition_FireImpl();
		return rtsc_Transition_Fire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsPackage getStepsPackage() {
		return (StepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StepsPackage getPackage() {
		return StepsPackage.eINSTANCE;
	}

} //StepsFactoryImpl
