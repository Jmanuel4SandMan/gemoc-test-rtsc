/**
 */
package rtscTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import rtscTrace.States.rtsc.TracedRealtimestatechart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtsc Realtimestatechart Initialize</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rtscTrace.Steps.StepsPackage#getRtsc_Realtimestatechart_Initialize()
 * @model
 * @generated
 */
public interface Rtsc_Realtimestatechart_Initialize extends SpecificStep, SequentialStep<Rtsc_Realtimestatechart_Initialize_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (rtscTrace.States.rtsc.TracedRealtimestatechart) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedRealtimestatechart getCaller();

} // Rtsc_Realtimestatechart_Initialize
