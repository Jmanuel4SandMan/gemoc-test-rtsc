/**
 */
package org.muml.seq.xsrtsc.xsrtscmt.rtsc.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.muml.seq.xsrtsc.xsrtscmt.rtsc.Behavior;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.BehavioralElement;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.Clock;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.ClockConstraint;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.Connector;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.CoordinationProtocol;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.Guard;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.Message;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.MessageBuffer;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.MessageType;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.MessageTypeRepository;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.NamedElement;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.Port;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.Realtimestatechart;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.RtscPackage;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.State;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.Transition;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.Variable;
import org.muml.seq.xsrtsc.xsrtscmt.rtsc.Vertex;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.RtscPackage
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
			public Adapter caseBehavior(Behavior object) {
				return createBehaviorAdapter();
			}
			@Override
			public Adapter caseBehavioralElement(BehavioralElement object) {
				return createBehavioralElementAdapter();
			}
			@Override
			public Adapter caseRealtimestatechart(Realtimestatechart object) {
				return createRealtimestatechartAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseVertex(Vertex object) {
				return createVertexAdapter();
			}
			@Override
			public Adapter caseGuard(Guard object) {
				return createGuardAdapter();
			}
			@Override
			public Adapter caseClockConstraint(ClockConstraint object) {
				return createClockConstraintAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseClock(Clock object) {
				return createClockAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseMessageBuffer(MessageBuffer object) {
				return createMessageBufferAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseCoordinationProtocol(CoordinationProtocol object) {
				return createCoordinationProtocolAdapter();
			}
			@Override
			public Adapter caseMessageType(MessageType object) {
				return createMessageTypeAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseSystem(org.muml.seq.xsrtsc.xsrtscmt.rtsc.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseMessageTypeRepository(MessageTypeRepository object) {
				return createMessageTypeRepositoryAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.BehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.BehavioralElement
	 * @generated
	 */
	public Adapter createBehavioralElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Realtimestatechart <em>Realtimestatechart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.Realtimestatechart
	 * @generated
	 */
	public Adapter createRealtimestatechartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.Vertex
	 * @generated
	 */
	public Adapter createVertexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.Guard
	 * @generated
	 */
	public Adapter createGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.ClockConstraint <em>Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.ClockConstraint
	 * @generated
	 */
	public Adapter createClockConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.Clock
	 * @generated
	 */
	public Adapter createClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.MessageBuffer <em>Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.MessageBuffer
	 * @generated
	 */
	public Adapter createMessageBufferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.CoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.CoordinationProtocol
	 * @generated
	 */
	public Adapter createCoordinationProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.MessageType
	 * @generated
	 */
	public Adapter createMessageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.seq.xsrtsc.xsrtscmt.rtsc.MessageTypeRepository <em>Message Type Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.seq.xsrtsc.xsrtscmt.rtsc.MessageTypeRepository
	 * @generated
	 */
	public Adapter createMessageTypeRepositoryAdapter() {
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
