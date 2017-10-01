/**
 */
package org.muml.xsrtsc.xsrtscmt.rtsc;

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
 * @see org.muml.xsrtsc.xsrtscmt.rtsc.RtscFactory
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
	String eNS_URI = "http://org.muml.xsrtsc.xsrtscmt/rtsc/";

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
	RtscPackage eINSTANCE = org.muml.xsrtsc.xsrtscmt.rtsc.impl.RtscPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.BehaviorImpl
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.RtscPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 0;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.impl.BehavioralElementImpl <em>Behavioral Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.BehavioralElementImpl
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.RtscPackageImpl#getBehavioralElement()
	 * @generated
	 */
	int BEHAVIORAL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ELEMENT__BEHAVIOR = 0;

	/**
	 * The number of structural features of the '<em>Behavioral Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.impl.RealtimestatechartImpl <em>Realtimestatechart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.RealtimestatechartImpl
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.RtscPackageImpl#getRealtimestatechart()
	 * @generated
	 */
	int REALTIMESTATECHART = 2;

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
	 * The feature id for the '<em><b>Rounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESTATECHART__ROUNDS = BEHAVIOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Realtimestatechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESTATECHART_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.VertexImpl
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.RtscPackageImpl#getVertex()
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
	 * The meta object id for the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.StateImpl
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.RtscPackageImpl#getState()
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
	 * The meta object id for the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.NamedElementImpl
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.RtscPackageImpl#getNamedElement()
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
	 * The meta object id for the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.TransitionImpl
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.RtscPackageImpl#getTransition()
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
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INPUT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTPUT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__HIT_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for class '{@link org.muml.xsrtsc.xsrtscmt.rtsc.BehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Element</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.BehavioralElement
	 * @generated
	 */
	EClass getBehavioralElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.xsrtsc.xsrtscmt.rtsc.BehavioralElement#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behavior</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.BehavioralElement#getBehavior()
	 * @see #getBehavioralElement()
	 * @generated
	 */
	EReference getBehavioralElement_Behavior();

	/**
	 * Returns the meta object for class '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart <em>Realtimestatechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realtimestatechart</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart
	 * @generated
	 */
	EClass getRealtimestatechart();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getTransitions()
	 * @see #getRealtimestatechart()
	 * @generated
	 */
	EReference getRealtimestatechart_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getStates()
	 * @see #getRealtimestatechart()
	 * @generated
	 */
	EReference getRealtimestatechart_States();

	/**
	 * Returns the meta object for the reference '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getInitialState()
	 * @see #getRealtimestatechart()
	 * @generated
	 */
	EReference getRealtimestatechart_InitialState();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getRounds <em>Rounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounds</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.Realtimestatechart#getRounds()
	 * @see #getRealtimestatechart()
	 * @generated
	 */
	EAttribute getRealtimestatechart_Rounds();

	/**
	 * Returns the meta object for class '{@link org.muml.xsrtsc.xsrtscmt.rtsc.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.xsrtsc.xsrtscmt.rtsc.State#getSubStatecharts <em>Sub Statecharts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Statecharts</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.State#getSubStatecharts()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_SubStatecharts();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.xsrtsc.xsrtscmt.rtsc.State#isInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.State#isInitial()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Initial();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.xsrtsc.xsrtscmt.rtsc.State#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.State#isFinal()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Final();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.xsrtsc.xsrtscmt.rtsc.State#getOwningRTSC <em>Owning RTSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning RTSC</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.State#getOwningRTSC()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OwningRTSC();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.xsrtsc.xsrtscmt.rtsc.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.State#getIncomingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.xsrtsc.xsrtscmt.rtsc.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.State#getOutgoingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingTransitions();

	/**
	 * Returns the meta object for class '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Transition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.Transition#getInput()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Input();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Transition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.Transition#getOutput()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Output();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Transition#getHitCount <em>Hit Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hit Count</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.Transition#getHitCount()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_HitCount();

	/**
	 * Returns the meta object for class '{@link org.muml.xsrtsc.xsrtscmt.rtsc.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.xsrtsc.xsrtscmt.rtsc.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.xsrtsc.xsrtscmt.rtsc.Vertex#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.muml.xsrtsc.xsrtscmt.rtsc.Vertex#isActive()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_Active();

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
		 * The meta object literal for the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.BehaviorImpl
		 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.RtscPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.impl.BehavioralElementImpl <em>Behavioral Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.BehavioralElementImpl
		 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.RtscPackageImpl#getBehavioralElement()
		 * @generated
		 */
		EClass BEHAVIORAL_ELEMENT = eINSTANCE.getBehavioralElement();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_ELEMENT__BEHAVIOR = eINSTANCE.getBehavioralElement_Behavior();

		/**
		 * The meta object literal for the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.impl.RealtimestatechartImpl <em>Realtimestatechart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.RealtimestatechartImpl
		 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.RtscPackageImpl#getRealtimestatechart()
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
		 * The meta object literal for the '<em><b>Rounds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIMESTATECHART__ROUNDS = eINSTANCE.getRealtimestatechart_Rounds();

		/**
		 * The meta object literal for the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.StateImpl
		 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.RtscPackageImpl#getState()
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
		 * The meta object literal for the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.TransitionImpl
		 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.RtscPackageImpl#getTransition()
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
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__INPUT = eINSTANCE.getTransition_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__OUTPUT = eINSTANCE.getTransition_Output();

		/**
		 * The meta object literal for the '<em><b>Hit Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__HIT_COUNT = eINSTANCE.getTransition_HitCount();

		/**
		 * The meta object literal for the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.NamedElementImpl
		 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.RtscPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link org.muml.xsrtsc.xsrtscmt.rtsc.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.VertexImpl
		 * @see org.muml.xsrtsc.xsrtscmt.rtsc.impl.RtscPackageImpl#getVertex()
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

	}

} //RtscPackage
