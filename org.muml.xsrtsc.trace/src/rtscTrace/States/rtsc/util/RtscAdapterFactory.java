/**
 */
package rtscTrace.States.rtsc.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rtscTrace.States.rtsc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rtscTrace.States.rtsc.RtscPackage
 * @generated
 */
public class RtscAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RtscPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtscAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RtscPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtscSwitch<Adapter> modelSwitch =
		new RtscSwitch<Adapter>() {
			@Override
			public Adapter caseTracedBehavior(TracedBehavior object) {
				return createTracedBehaviorAdapter();
			}
			@Override
			public Adapter caseTracedNamedElement(TracedNamedElement object) {
				return createTracedNamedElementAdapter();
			}
			@Override
			public Adapter caseTracedRealtimestatechart(TracedRealtimestatechart object) {
				return createTracedRealtimestatechartAdapter();
			}
			@Override
			public Adapter caseTracedState(TracedState object) {
				return createTracedStateAdapter();
			}
			@Override
			public Adapter caseTracedTransition(TracedTransition object) {
				return createTracedTransitionAdapter();
			}
			@Override
			public Adapter caseTracedVertex(TracedVertex object) {
				return createTracedVertexAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link rtscTrace.States.rtsc.TracedBehavior <em>Traced Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rtscTrace.States.rtsc.TracedBehavior
	 * @generated
	 */
	public Adapter createTracedBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rtscTrace.States.rtsc.TracedNamedElement <em>Traced Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rtscTrace.States.rtsc.TracedNamedElement
	 * @generated
	 */
	public Adapter createTracedNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rtscTrace.States.rtsc.TracedRealtimestatechart <em>Traced Realtimestatechart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rtscTrace.States.rtsc.TracedRealtimestatechart
	 * @generated
	 */
	public Adapter createTracedRealtimestatechartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rtscTrace.States.rtsc.TracedState <em>Traced State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rtscTrace.States.rtsc.TracedState
	 * @generated
	 */
	public Adapter createTracedStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rtscTrace.States.rtsc.TracedTransition <em>Traced Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rtscTrace.States.rtsc.TracedTransition
	 * @generated
	 */
	public Adapter createTracedTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rtscTrace.States.rtsc.TracedVertex <em>Traced Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rtscTrace.States.rtsc.TracedVertex
	 * @generated
	 */
	public Adapter createTracedVertexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RtscAdapterFactory
