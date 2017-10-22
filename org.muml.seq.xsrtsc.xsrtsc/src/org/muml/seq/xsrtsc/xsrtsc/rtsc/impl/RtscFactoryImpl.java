/**
 */
package org.muml.seq.xsrtsc.xsrtsc.rtsc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.muml.seq.xsrtsc.xsrtsc.rtsc.Clock;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.ClockConstraint;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.ClockResetEvent;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Connector;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.CoordinationProtocol;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Guard;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Message;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageBuffer;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageEvent;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageType;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageTypeRepository;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Port;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscFactory;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscPackage;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.State;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Variable;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.VariableAssignmentEvent;
import org.muml.seq.xsrtsc.xsrtsc.rtsc.Vertex;

import org.muml.udbm.Federation;
import org.muml.udbm.UDBMClock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RtscFactoryImpl extends EFactoryImpl implements RtscFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RtscFactory init() {
		try {
			RtscFactory theRtscFactory = (RtscFactory)EPackage.Registry.INSTANCE.getEFactory(RtscPackage.eNS_URI);
			if (theRtscFactory != null) {
				return theRtscFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RtscFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtscFactoryImpl() {
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
			case RtscPackage.REALTIMESTATECHART: return createRealtimestatechart();
			case RtscPackage.STATE: return createState();
			case RtscPackage.TRANSITION: return createTransition();
			case RtscPackage.VERTEX: return createVertex();
			case RtscPackage.GUARD: return createGuard();
			case RtscPackage.CLOCK_CONSTRAINT: return createClockConstraint();
			case RtscPackage.VARIABLE: return createVariable();
			case RtscPackage.CLOCK: return createClock();
			case RtscPackage.PORT: return createPort();
			case RtscPackage.MESSAGE_BUFFER: return createMessageBuffer();
			case RtscPackage.CONNECTOR: return createConnector();
			case RtscPackage.COORDINATION_PROTOCOL: return createCoordinationProtocol();
			case RtscPackage.MESSAGE_TYPE: return createMessageType();
			case RtscPackage.MESSAGE: return createMessage();
			case RtscPackage.SYSTEM: return createSystem();
			case RtscPackage.MESSAGE_TYPE_REPOSITORY: return createMessageTypeRepository();
			case RtscPackage.MESSAGE_EVENT: return createMessageEvent();
			case RtscPackage.CLOCK_RESET_EVENT: return createClockResetEvent();
			case RtscPackage.VARIABLE_ASSIGNMENT_EVENT: return createVariableAssignmentEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RtscPackage.FEDERATION:
				return createFederationFromString(eDataType, initialValue);
			case RtscPackage.UDBM_CLOCK:
				return createUDBMClockFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RtscPackage.FEDERATION:
				return convertFederationToString(eDataType, instanceValue);
			case RtscPackage.UDBM_CLOCK:
				return convertUDBMClockToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realtimestatechart createRealtimestatechart() {
		RealtimestatechartImpl realtimestatechart = new RealtimestatechartImpl();
		return realtimestatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex createVertex() {
		VertexImpl vertex = new VertexImpl();
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard createGuard() {
		GuardImpl guard = new GuardImpl();
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockConstraint createClockConstraint() {
		ClockConstraintImpl clockConstraint = new ClockConstraintImpl();
		return clockConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock createClock() {
		ClockImpl clock = new ClockImpl();
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBuffer createMessageBuffer() {
		MessageBufferImpl messageBuffer = new MessageBufferImpl();
		return messageBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocol createCoordinationProtocol() {
		CoordinationProtocolImpl coordinationProtocol = new CoordinationProtocolImpl();
		return coordinationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType createMessageType() {
		MessageTypeImpl messageType = new MessageTypeImpl();
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.seq.xsrtsc.xsrtsc.rtsc.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTypeRepository createMessageTypeRepository() {
		MessageTypeRepositoryImpl messageTypeRepository = new MessageTypeRepositoryImpl();
		return messageTypeRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEvent createMessageEvent() {
		MessageEventImpl messageEvent = new MessageEventImpl();
		return messageEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockResetEvent createClockResetEvent() {
		ClockResetEventImpl clockResetEvent = new ClockResetEventImpl();
		return clockResetEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignmentEvent createVariableAssignmentEvent() {
		VariableAssignmentEventImpl variableAssignmentEvent = new VariableAssignmentEventImpl();
		return variableAssignmentEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Federation createFederationFromString(EDataType eDataType, String initialValue) {
		return (Federation)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFederationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDBMClock createUDBMClockFromString(EDataType eDataType, String initialValue) {
		return (UDBMClock)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUDBMClockToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtscPackage getRtscPackage() {
		return (RtscPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RtscPackage getPackage() {
		return RtscPackage.eINSTANCE;
	}

} //RtscFactoryImpl
