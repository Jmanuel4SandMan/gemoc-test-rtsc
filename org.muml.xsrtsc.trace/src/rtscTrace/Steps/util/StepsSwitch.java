/**
 */
package rtscTrace.Steps.util;

import fr.inria.diverse.trace.commons.model.trace.BigStep;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.Step;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rtscTrace.Steps.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see rtscTrace.Steps.StepsPackage
 * @generated
 */
public class StepsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsSwitch() {
		if (modelPackage == null) {
			modelPackage = StepsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StepsPackage.ROOT_IMPLICIT_STEP: {
				RootImplicitStep rootImplicitStep = (RootImplicitStep)theEObject;
				T result = caseRootImplicitStep(rootImplicitStep);
				if (result == null) result = caseSmallStep(rootImplicitStep);
				if (result == null) result = caseStep(rootImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.RTSC_REALTIMESTATECHART_INIT_RTSC: {
				Rtsc_Realtimestatechart_InitRTSC rtsc_Realtimestatechart_InitRTSC = (Rtsc_Realtimestatechart_InitRTSC)theEObject;
				T result = caseRtsc_Realtimestatechart_InitRTSC(rtsc_Realtimestatechart_InitRTSC);
				if (result == null) result = caseRtsc_Realtimestatechart_Initialize_AbstractSubStep(rtsc_Realtimestatechart_InitRTSC);
				if (result == null) result = caseSmallStep(rtsc_Realtimestatechart_InitRTSC);
				if (result == null) result = caseSpecificStep(rtsc_Realtimestatechart_InitRTSC);
				if (result == null) result = caseStep(rtsc_Realtimestatechart_InitRTSC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.RTSC_REALTIMESTATECHART_INITIALIZE: {
				Rtsc_Realtimestatechart_Initialize rtsc_Realtimestatechart_Initialize = (Rtsc_Realtimestatechart_Initialize)theEObject;
				T result = caseRtsc_Realtimestatechart_Initialize(rtsc_Realtimestatechart_Initialize);
				if (result == null) result = caseSpecificStep(rtsc_Realtimestatechart_Initialize);
				if (result == null) result = caseSequentialStep(rtsc_Realtimestatechart_Initialize);
				if (result == null) result = caseBigStep(rtsc_Realtimestatechart_Initialize);
				if (result == null) result = caseStep(rtsc_Realtimestatechart_Initialize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.RTSC_REALTIMESTATECHART_INITIALIZE_ABSTRACT_SUB_STEP: {
				Rtsc_Realtimestatechart_Initialize_AbstractSubStep rtsc_Realtimestatechart_Initialize_AbstractSubStep = (Rtsc_Realtimestatechart_Initialize_AbstractSubStep)theEObject;
				T result = caseRtsc_Realtimestatechart_Initialize_AbstractSubStep(rtsc_Realtimestatechart_Initialize_AbstractSubStep);
				if (result == null) result = caseSpecificStep(rtsc_Realtimestatechart_Initialize_AbstractSubStep);
				if (result == null) result = caseStep(rtsc_Realtimestatechart_Initialize_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.RTSC_REALTIMESTATECHART_INITIALIZE_IMPLICIT_STEP: {
				Rtsc_Realtimestatechart_Initialize_ImplicitStep rtsc_Realtimestatechart_Initialize_ImplicitStep = (Rtsc_Realtimestatechart_Initialize_ImplicitStep)theEObject;
				T result = caseRtsc_Realtimestatechart_Initialize_ImplicitStep(rtsc_Realtimestatechart_Initialize_ImplicitStep);
				if (result == null) result = caseRtsc_Realtimestatechart_Initialize_AbstractSubStep(rtsc_Realtimestatechart_Initialize_ImplicitStep);
				if (result == null) result = caseSmallStep(rtsc_Realtimestatechart_Initialize_ImplicitStep);
				if (result == null) result = caseSpecificStep(rtsc_Realtimestatechart_Initialize_ImplicitStep);
				if (result == null) result = caseStep(rtsc_Realtimestatechart_Initialize_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.RTSC_REALTIMESTATECHART_STEP: {
				Rtsc_Realtimestatechart_Step rtsc_Realtimestatechart_Step = (Rtsc_Realtimestatechart_Step)theEObject;
				T result = caseRtsc_Realtimestatechart_Step(rtsc_Realtimestatechart_Step);
				if (result == null) result = caseSpecificStep(rtsc_Realtimestatechart_Step);
				if (result == null) result = caseSequentialStep(rtsc_Realtimestatechart_Step);
				if (result == null) result = caseBigStep(rtsc_Realtimestatechart_Step);
				if (result == null) result = caseStep(rtsc_Realtimestatechart_Step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.RTSC_REALTIMESTATECHART_STEP_ABSTRACT_SUB_STEP: {
				Rtsc_Realtimestatechart_Step_AbstractSubStep rtsc_Realtimestatechart_Step_AbstractSubStep = (Rtsc_Realtimestatechart_Step_AbstractSubStep)theEObject;
				T result = caseRtsc_Realtimestatechart_Step_AbstractSubStep(rtsc_Realtimestatechart_Step_AbstractSubStep);
				if (result == null) result = caseSpecificStep(rtsc_Realtimestatechart_Step_AbstractSubStep);
				if (result == null) result = caseStep(rtsc_Realtimestatechart_Step_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.RTSC_REALTIMESTATECHART_STEP_IMPLICIT_STEP: {
				Rtsc_Realtimestatechart_Step_ImplicitStep rtsc_Realtimestatechart_Step_ImplicitStep = (Rtsc_Realtimestatechart_Step_ImplicitStep)theEObject;
				T result = caseRtsc_Realtimestatechart_Step_ImplicitStep(rtsc_Realtimestatechart_Step_ImplicitStep);
				if (result == null) result = caseRtsc_Realtimestatechart_Step_AbstractSubStep(rtsc_Realtimestatechart_Step_ImplicitStep);
				if (result == null) result = caseSmallStep(rtsc_Realtimestatechart_Step_ImplicitStep);
				if (result == null) result = caseSpecificStep(rtsc_Realtimestatechart_Step_ImplicitStep);
				if (result == null) result = caseStep(rtsc_Realtimestatechart_Step_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.RTSC_TRANSITION_CAN_FIRE: {
				Rtsc_Transition_CanFire rtsc_Transition_CanFire = (Rtsc_Transition_CanFire)theEObject;
				T result = caseRtsc_Transition_CanFire(rtsc_Transition_CanFire);
				if (result == null) result = caseRtsc_Realtimestatechart_Step_AbstractSubStep(rtsc_Transition_CanFire);
				if (result == null) result = caseSmallStep(rtsc_Transition_CanFire);
				if (result == null) result = caseSpecificStep(rtsc_Transition_CanFire);
				if (result == null) result = caseStep(rtsc_Transition_CanFire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.RTSC_TRANSITION_FIRE: {
				Rtsc_Transition_Fire rtsc_Transition_Fire = (Rtsc_Transition_Fire)theEObject;
				T result = caseRtsc_Transition_Fire(rtsc_Transition_Fire);
				if (result == null) result = caseRtsc_Realtimestatechart_Step_AbstractSubStep(rtsc_Transition_Fire);
				if (result == null) result = caseSmallStep(rtsc_Transition_Fire);
				if (result == null) result = caseSpecificStep(rtsc_Transition_Fire);
				if (result == null) result = caseStep(rtsc_Transition_Fire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.SPECIFIC_STEP: {
				SpecificStep specificStep = (SpecificStep)theEObject;
				T result = caseSpecificStep(specificStep);
				if (result == null) result = caseStep(specificStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootImplicitStep(RootImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtsc Realtimestatechart Init RTSC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtsc Realtimestatechart Init RTSC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtsc_Realtimestatechart_InitRTSC(Rtsc_Realtimestatechart_InitRTSC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtsc Realtimestatechart Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtsc Realtimestatechart Initialize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtsc_Realtimestatechart_Initialize(Rtsc_Realtimestatechart_Initialize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtsc Realtimestatechart Initialize Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtsc Realtimestatechart Initialize Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtsc_Realtimestatechart_Initialize_AbstractSubStep(Rtsc_Realtimestatechart_Initialize_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtsc Realtimestatechart Initialize Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtsc Realtimestatechart Initialize Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtsc_Realtimestatechart_Initialize_ImplicitStep(Rtsc_Realtimestatechart_Initialize_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtsc Realtimestatechart Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtsc Realtimestatechart Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtsc_Realtimestatechart_Step(Rtsc_Realtimestatechart_Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtsc Realtimestatechart Step Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtsc Realtimestatechart Step Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtsc_Realtimestatechart_Step_AbstractSubStep(Rtsc_Realtimestatechart_Step_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtsc Realtimestatechart Step Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtsc Realtimestatechart Step Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtsc_Realtimestatechart_Step_ImplicitStep(Rtsc_Realtimestatechart_Step_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtsc Transition Can Fire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtsc Transition Can Fire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtsc_Transition_CanFire(Rtsc_Transition_CanFire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtsc Transition Fire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtsc Transition Fire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtsc_Transition_Fire(Rtsc_Transition_Fire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificStep(SpecificStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmallStep(SmallStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StepSubtype extends Step> T caseBigStep(BigStep<StepSubtype> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StepSubtype extends Step> T caseSequentialStep(SequentialStep<StepSubtype> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StepsSwitch
