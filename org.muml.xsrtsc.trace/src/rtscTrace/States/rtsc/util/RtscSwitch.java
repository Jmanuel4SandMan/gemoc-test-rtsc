/**
 */
package rtscTrace.States.rtsc.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rtscTrace.States.rtsc.*;

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
 * @see rtscTrace.States.rtsc.RtscPackage
 * @generated
 */
public class RtscSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RtscPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtscSwitch() {
		if (modelPackage == null) {
			modelPackage = RtscPackage.eINSTANCE;
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
			case RtscPackage.TRACED_BEHAVIOR: {
				TracedBehavior tracedBehavior = (TracedBehavior)theEObject;
				T result = caseTracedBehavior(tracedBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtscPackage.TRACED_NAMED_ELEMENT: {
				TracedNamedElement tracedNamedElement = (TracedNamedElement)theEObject;
				T result = caseTracedNamedElement(tracedNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtscPackage.TRACED_REALTIMESTATECHART: {
				TracedRealtimestatechart tracedRealtimestatechart = (TracedRealtimestatechart)theEObject;
				T result = caseTracedRealtimestatechart(tracedRealtimestatechart);
				if (result == null) result = caseTracedBehavior(tracedRealtimestatechart);
				if (result == null) result = caseTracedNamedElement(tracedRealtimestatechart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtscPackage.TRACED_STATE: {
				TracedState tracedState = (TracedState)theEObject;
				T result = caseTracedState(tracedState);
				if (result == null) result = caseTracedVertex(tracedState);
				if (result == null) result = caseTracedNamedElement(tracedState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtscPackage.TRACED_TRANSITION: {
				TracedTransition tracedTransition = (TracedTransition)theEObject;
				T result = caseTracedTransition(tracedTransition);
				if (result == null) result = caseTracedNamedElement(tracedTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtscPackage.TRACED_VERTEX: {
				TracedVertex tracedVertex = (TracedVertex)theEObject;
				T result = caseTracedVertex(tracedVertex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBehavior(TracedBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedNamedElement(TracedNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Realtimestatechart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Realtimestatechart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedRealtimestatechart(TracedRealtimestatechart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedState(TracedState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedTransition(TracedTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Vertex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedVertex(TracedVertex object) {
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

} //RtscSwitch
