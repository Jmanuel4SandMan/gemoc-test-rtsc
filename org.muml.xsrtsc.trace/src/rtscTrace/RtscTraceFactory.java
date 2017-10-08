/**
 */
package rtscTrace;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rtscTrace.RtscTracePackage
 * @generated
 */
public interface RtscTraceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RtscTraceFactory eINSTANCE = rtscTrace.impl.RtscTraceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Specific Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific Trace</em>'.
	 * @generated
	 */
	SpecificTrace createSpecificTrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RtscTracePackage getRtscTracePackage();

} //RtscTraceFactory
