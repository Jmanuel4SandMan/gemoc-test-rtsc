/**
 */
package rtscTrace.States.rtsc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rtscTrace.States.rtsc.RtscPackage
 * @generated
 */
public interface RtscFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RtscFactory eINSTANCE = rtscTrace.States.rtsc.impl.RtscFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Realtimestatechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Realtimestatechart</em>'.
	 * @generated
	 */
	TracedRealtimestatechart createTracedRealtimestatechart();

	/**
	 * Returns a new object of class '<em>Traced State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced State</em>'.
	 * @generated
	 */
	TracedState createTracedState();

	/**
	 * Returns a new object of class '<em>Traced Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Transition</em>'.
	 * @generated
	 */
	TracedTransition createTracedTransition();

	/**
	 * Returns a new object of class '<em>Traced Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Vertex</em>'.
	 * @generated
	 */
	TracedVertex createTracedVertex();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RtscPackage getRtscPackage();

} //RtscFactory
