/**
 */
package rtscTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import rtscTrace.States.rtsc.TracedTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtsc Transition Fire</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rtscTrace.Steps.StepsPackage#getRtsc_Transition_Fire()
 * @model
 * @generated
 */
public interface Rtsc_Transition_Fire extends Rtsc_Realtimestatechart_Step_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (rtscTrace.States.rtsc.TracedTransition) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedTransition getCaller();

} // Rtsc_Transition_Fire
