/**
 */
package rtscTrace.Steps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rtscTrace.Steps.StepsPackage
 * @generated
 */
public interface StepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsFactory eINSTANCE = rtscTrace.Steps.impl.StepsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Implicit Step</em>'.
	 * @generated
	 */
	RootImplicitStep createRootImplicitStep();

	/**
	 * Returns a new object of class '<em>Rtsc Realtimestatechart Init RTSC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rtsc Realtimestatechart Init RTSC</em>'.
	 * @generated
	 */
	Rtsc_Realtimestatechart_InitRTSC createRtsc_Realtimestatechart_InitRTSC();

	/**
	 * Returns a new object of class '<em>Rtsc Realtimestatechart Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rtsc Realtimestatechart Initialize</em>'.
	 * @generated
	 */
	Rtsc_Realtimestatechart_Initialize createRtsc_Realtimestatechart_Initialize();

	/**
	 * Returns a new object of class '<em>Rtsc Realtimestatechart Initialize Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rtsc Realtimestatechart Initialize Implicit Step</em>'.
	 * @generated
	 */
	Rtsc_Realtimestatechart_Initialize_ImplicitStep createRtsc_Realtimestatechart_Initialize_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Rtsc Realtimestatechart Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rtsc Realtimestatechart Step</em>'.
	 * @generated
	 */
	Rtsc_Realtimestatechart_Step createRtsc_Realtimestatechart_Step();

	/**
	 * Returns a new object of class '<em>Rtsc Realtimestatechart Step Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rtsc Realtimestatechart Step Implicit Step</em>'.
	 * @generated
	 */
	Rtsc_Realtimestatechart_Step_ImplicitStep createRtsc_Realtimestatechart_Step_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Rtsc Transition Can Fire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rtsc Transition Can Fire</em>'.
	 * @generated
	 */
	Rtsc_Transition_CanFire createRtsc_Transition_CanFire();

	/**
	 * Returns a new object of class '<em>Rtsc Transition Fire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rtsc Transition Fire</em>'.
	 * @generated
	 */
	Rtsc_Transition_Fire createRtsc_Transition_Fire();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StepsPackage getStepsPackage();

} //StepsFactory
