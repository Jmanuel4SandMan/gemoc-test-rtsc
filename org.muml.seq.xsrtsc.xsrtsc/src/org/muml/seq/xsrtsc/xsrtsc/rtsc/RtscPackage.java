/**
 */
package org.muml.seq.xsrtsc.xsrtsc.rtsc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.RtscFactory
 * @model kind="package"
 * @generated
 */
public interface RtscPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rtsc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.muml.seq.xsrtsc.xsrtsc/rtsc/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rtsc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RtscPackage eINSTANCE = org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.BehaviorImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Behavioural Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__BEHAVIOURAL_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.NamedElementImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.BehavioralElementImpl <em>Behavioral Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.BehavioralElementImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getBehavioralElement()
	 * @generated
	 */
	int BEHAVIORAL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ELEMENT__BEHAVIOR = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavioral Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl <em>Realtimestatechart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getRealtimestatechart()
	 * @generated
	 */
	int REALTIMESTATECHART = 2;

	/**
	 * The feature id for the '<em><b>Behavioural Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESTATECHART__BEHAVIOURAL_ELEMENT = BEHAVIOR__BEHAVIOURAL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESTATECHART__NAME = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESTATECHART__TRANSITIONS = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESTATECHART__STATES = BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESTATECHART__INITIAL_STATE = BEHAVIOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESTATECHART__VARIABLES = BEHAVIOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESTATECHART__CLOCKS = BEHAVIOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESTATECHART__ROUNDS = BEHAVIOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Realtimestatechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESTATECHART_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.VertexImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 6;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__ACTIVE = 0;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.StateImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getState()
	 * @generated
	 */
	int STATE = 3;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVE = VERTEX__ACTIVE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Statecharts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SUB_STATECHARTS = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INITIAL = VERTEX_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FINAL = VERTEX_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owning RTSC</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNING_RTSC = VERTEX_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITIONS = VERTEX_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITIONS = VERTEX_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.TransitionImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARDS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clock Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CLOCK_CONSTRAINTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__STATECHART = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Trigger Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER_MESSAGE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Hit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__HIT_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.GuardImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 7;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.ClockConstraintImpl <em>Clock Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.ClockConstraintImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getClockConstraint()
	 * @generated
	 */
	int CLOCK_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT__CLOCK = 0;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT__BOUND = 1;

	/**
	 * The number of structural features of the '<em>Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.VariableImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__STATECHART = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Runtime Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__RUNTIME_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.ClockImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__STATECHART = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.PortImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = BEHAVIORAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BEHAVIOR = BEHAVIORAL_ELEMENT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BEHAVIOUR = BEHAVIORAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Buffer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__INCOMING_BUFFER = BEHAVIORAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = BEHAVIORAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.MessageBufferImpl <em>Message Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.MessageBufferImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getMessageBuffer()
	 * @generated
	 */
	int MESSAGE_BUFFER = 12;

	/**
	 * The feature id for the '<em><b>Port</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__PORT = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__TYPES = 1;

	/**
	 * The feature id for the '<em><b>All Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__ALL_MESSAGES = 2;

	/**
	 * The number of structural features of the '<em>Message Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.ConnectorImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 13;

	/**
	 * The feature id for the '<em><b>Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ENDPOINTS = 0;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.CoordinationProtocolImpl <em>Coordination Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.CoordinationProtocolImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getCoordinationProtocol()
	 * @generated
	 */
	int COORDINATION_PROTOCOL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__PORTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__CONNECTOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coordination Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.MessageTypeImpl <em>Message Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.MessageTypeImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.MessageImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.SystemImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 17;

	/**
	 * The feature id for the '<em><b>Statecharts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__STATECHARTS = 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROTOCOL = 1;

	/**
	 * The feature id for the '<em><b>Message Type Repo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__MESSAGE_TYPE_REPO = 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.MessageTypeRepositoryImpl <em>Message Type Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.MessageTypeRepositoryImpl
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getMessageTypeRepository()
	 * @generated
	 */
	int MESSAGE_TYPE_REPOSITORY = 18;

	/**
	 * The feature id for the '<em><b>Message Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_REPOSITORY__MESSAGE_TYPES = 0;

	/**
	 * The number of structural features of the '<em>Message Type Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_REPOSITORY_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Behavior#getBehaviouralElement <em>Behavioural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behavioural Element</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Behavior#getBehaviouralElement()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_BehaviouralElement();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.BehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Element</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.BehavioralElement
	 * @generated
	 */
	EClass getBehavioralElement();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.BehavioralElement#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Behavior</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.BehavioralElement#getBehavior()
	 * @see #getBehavioralElement()
	 * @generated
	 */
	EReference getBehavioralElement_Behavior();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart <em>Realtimestatechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realtimestatechart</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart
	 * @generated
	 */
	EClass getRealtimestatechart();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getTransitions()
	 * @see #getRealtimestatechart()
	 * @generated
	 */
	EReference getRealtimestatechart_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getStates()
	 * @see #getRealtimestatechart()
	 * @generated
	 */
	EReference getRealtimestatechart_States();

	/**
	 * Returns the meta object for the reference '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getInitialState()
	 * @see #getRealtimestatechart()
	 * @generated
	 */
	EReference getRealtimestatechart_InitialState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getVariables()
	 * @see #getRealtimestatechart()
	 * @generated
	 */
	EReference getRealtimestatechart_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getClocks <em>Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clocks</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getClocks()
	 * @see #getRealtimestatechart()
	 * @generated
	 */
	EReference getRealtimestatechart_Clocks();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getRounds <em>Rounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounds</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Realtimestatechart#getRounds()
	 * @see #getRealtimestatechart()
	 * @generated
	 */
	EAttribute getRealtimestatechart_Rounds();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.State#getSubStatecharts <em>Sub Statecharts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Statecharts</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.State#getSubStatecharts()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_SubStatecharts();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.State#isInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.State#isInitial()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Initial();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.State#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.State#isFinal()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Final();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.State#getOwningRTSC <em>Owning RTSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning RTSC</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.State#getOwningRTSC()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OwningRTSC();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.State#getIncomingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.State#getOutgoingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingTransitions();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getGuards <em>Guards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guards</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getGuards()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guards();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getClockConstraints <em>Clock Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clock Constraints</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getClockConstraints()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ClockConstraints();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statechart</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getStatechart()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Statechart();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getTriggerMessage <em>Trigger Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trigger Message</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getTriggerMessage()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TriggerMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getHitCount <em>Hit Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hit Count</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Transition#getHitCount()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_HitCount();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Vertex#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Vertex#isActive()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_Active();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for the reference '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Guard#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Guard#getVariable()
	 * @see #getGuard()
	 * @generated
	 */
	EReference getGuard_Variable();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Guard#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Guard#getValue()
	 * @see #getGuard()
	 * @generated
	 */
	EAttribute getGuard_Value();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.ClockConstraint <em>Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Constraint</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.ClockConstraint
	 * @generated
	 */
	EClass getClockConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.ClockConstraint#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.ClockConstraint#getClock()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EReference getClockConstraint_Clock();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.ClockConstraint#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.ClockConstraint#getBound()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EAttribute getClockConstraint_Bound();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Variable#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statechart</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Variable#getStatechart()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Statechart();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Variable#getRuntimeValue <em>Runtime Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Value</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Variable#getRuntimeValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_RuntimeValue();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Clock#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statechart</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Clock#getStatechart()
	 * @see #getClock()
	 * @generated
	 */
	EReference getClock_Statechart();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Port#getBehaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behaviour</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Port#getBehaviour()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Behaviour();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Port#getIncomingBuffer <em>Incoming Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Incoming Buffer</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Port#getIncomingBuffer()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_IncomingBuffer();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageBuffer <em>Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Buffer</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageBuffer
	 * @generated
	 */
	EClass getMessageBuffer();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageBuffer#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Port</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageBuffer#getPort()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EReference getMessageBuffer_Port();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageBuffer#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageBuffer#getTypes()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EReference getMessageBuffer_Types();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageBuffer#getAllMessages <em>All Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Messages</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageBuffer#getAllMessages()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EReference getMessageBuffer_AllMessages();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Connector#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Endpoints</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Connector#getEndpoints()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Endpoints();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.CoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Protocol</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.CoordinationProtocol
	 * @generated
	 */
	EClass getCoordinationProtocol();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.CoordinationProtocol#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.CoordinationProtocol#getPorts()
	 * @see #getCoordinationProtocol()
	 * @generated
	 */
	EReference getCoordinationProtocol_Ports();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.CoordinationProtocol#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.CoordinationProtocol#getConnector()
	 * @see #getCoordinationProtocol()
	 * @generated
	 */
	EReference getCoordinationProtocol_Connector();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Type</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageType
	 * @generated
	 */
	EClass getMessageType();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.Message#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.Message#getType()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Type();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.System#getStatecharts <em>Statecharts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statecharts</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.System#getStatecharts()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Statecharts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.System#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocol</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.System#getProtocol()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Protocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.System#getMessageTypeRepo <em>Message Type Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Type Repo</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.System#getMessageTypeRepo()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_MessageTypeRepo();

	/**
	 * Returns the meta object for class '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageTypeRepository <em>Message Type Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Type Repository</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageTypeRepository
	 * @generated
	 */
	EClass getMessageTypeRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageTypeRepository#getMessageTypes <em>Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Types</em>'.
	 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.MessageTypeRepository#getMessageTypes()
	 * @see #getMessageTypeRepository()
	 * @generated
	 */
	EReference getMessageTypeRepository_MessageTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RtscFactory getRtscFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.BehaviorImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Behavioural Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__BEHAVIOURAL_ELEMENT = eINSTANCE.getBehavior_BehaviouralElement();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.BehavioralElementImpl <em>Behavioral Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.BehavioralElementImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getBehavioralElement()
		 * @generated
		 */
		EClass BEHAVIORAL_ELEMENT = eINSTANCE.getBehavioralElement();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_ELEMENT__BEHAVIOR = eINSTANCE.getBehavioralElement_Behavior();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl <em>Realtimestatechart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RealtimestatechartImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getRealtimestatechart()
		 * @generated
		 */
		EClass REALTIMESTATECHART = eINSTANCE.getRealtimestatechart();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIMESTATECHART__TRANSITIONS = eINSTANCE.getRealtimestatechart_Transitions();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIMESTATECHART__STATES = eINSTANCE.getRealtimestatechart_States();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIMESTATECHART__INITIAL_STATE = eINSTANCE.getRealtimestatechart_InitialState();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIMESTATECHART__VARIABLES = eINSTANCE.getRealtimestatechart_Variables();

		/**
		 * The meta object literal for the '<em><b>Clocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIMESTATECHART__CLOCKS = eINSTANCE.getRealtimestatechart_Clocks();

		/**
		 * The meta object literal for the '<em><b>Rounds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIMESTATECHART__ROUNDS = eINSTANCE.getRealtimestatechart_Rounds();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.StateImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Sub Statecharts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SUB_STATECHARTS = eINSTANCE.getState_SubStatecharts();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__INITIAL = eINSTANCE.getState_Initial();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__FINAL = eINSTANCE.getState_Final();

		/**
		 * The meta object literal for the '<em><b>Owning RTSC</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OWNING_RTSC = eINSTANCE.getState_OwningRTSC();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING_TRANSITIONS = eINSTANCE.getState_IncomingTransitions();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.TransitionImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARDS = eINSTANCE.getTransition_Guards();

		/**
		 * The meta object literal for the '<em><b>Clock Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CLOCK_CONSTRAINTS = eINSTANCE.getTransition_ClockConstraints();

		/**
		 * The meta object literal for the '<em><b>Statechart</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__STATECHART = eINSTANCE.getTransition_Statechart();

		/**
		 * The meta object literal for the '<em><b>Trigger Message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGER_MESSAGE = eINSTANCE.getTransition_TriggerMessage();

		/**
		 * The meta object literal for the '<em><b>Hit Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__HIT_COUNT = eINSTANCE.getTransition_HitCount();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.NamedElementImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.VertexImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__ACTIVE = eINSTANCE.getVertex_Active();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.GuardImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD__VARIABLE = eINSTANCE.getGuard_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD__VALUE = eINSTANCE.getGuard_Value();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.ClockConstraintImpl <em>Clock Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.ClockConstraintImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getClockConstraint()
		 * @generated
		 */
		EClass CLOCK_CONSTRAINT = eINSTANCE.getClockConstraint();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_CONSTRAINT__CLOCK = eINSTANCE.getClockConstraint_Clock();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK_CONSTRAINT__BOUND = eINSTANCE.getClockConstraint_Bound();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.VariableImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Statechart</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__STATECHART = eINSTANCE.getVariable_Statechart();

		/**
		 * The meta object literal for the '<em><b>Runtime Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__RUNTIME_VALUE = eINSTANCE.getVariable_RuntimeValue();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.ClockImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

		/**
		 * The meta object literal for the '<em><b>Statechart</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK__STATECHART = eINSTANCE.getClock_Statechart();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.PortImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Behaviour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__BEHAVIOUR = eINSTANCE.getPort_Behaviour();

		/**
		 * The meta object literal for the '<em><b>Incoming Buffer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__INCOMING_BUFFER = eINSTANCE.getPort_IncomingBuffer();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.MessageBufferImpl <em>Message Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.MessageBufferImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getMessageBuffer()
		 * @generated
		 */
		EClass MESSAGE_BUFFER = eINSTANCE.getMessageBuffer();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_BUFFER__PORT = eINSTANCE.getMessageBuffer_Port();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_BUFFER__TYPES = eINSTANCE.getMessageBuffer_Types();

		/**
		 * The meta object literal for the '<em><b>All Messages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_BUFFER__ALL_MESSAGES = eINSTANCE.getMessageBuffer_AllMessages();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.ConnectorImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Endpoints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__ENDPOINTS = eINSTANCE.getConnector_Endpoints();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.CoordinationProtocolImpl <em>Coordination Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.CoordinationProtocolImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getCoordinationProtocol()
		 * @generated
		 */
		EClass COORDINATION_PROTOCOL = eINSTANCE.getCoordinationProtocol();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PROTOCOL__PORTS = eINSTANCE.getCoordinationProtocol_Ports();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PROTOCOL__CONNECTOR = eINSTANCE.getCoordinationProtocol_Connector();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.MessageTypeImpl <em>Message Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.MessageTypeImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getMessageType()
		 * @generated
		 */
		EClass MESSAGE_TYPE = eINSTANCE.getMessageType();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.MessageImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__TYPE = eINSTANCE.getMessage_Type();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.SystemImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Statecharts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__STATECHARTS = eINSTANCE.getSystem_Statecharts();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PROTOCOL = eINSTANCE.getSystem_Protocol();

		/**
		 * The meta object literal for the '<em><b>Message Type Repo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__MESSAGE_TYPE_REPO = eINSTANCE.getSystem_MessageTypeRepo();

		/**
		 * The meta object literal for the '{@link org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.MessageTypeRepositoryImpl <em>Message Type Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.MessageTypeRepositoryImpl
		 * @see org.muml.seq.xsrtsc.xsrtsc.rtsc.impl.RtscPackageImpl#getMessageTypeRepository()
		 * @generated
		 */
		EClass MESSAGE_TYPE_REPOSITORY = eINSTANCE.getMessageTypeRepository();

		/**
		 * The meta object literal for the '<em><b>Message Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_TYPE_REPOSITORY__MESSAGE_TYPES = eINSTANCE.getMessageTypeRepository_MessageTypes();

	}

} //RtscPackage
