/**
 */
package rtscTrace.States.rtsc;

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
 * @see rtscTrace.States.rtsc.RtscFactory
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
	String eNS_URI = "rtscTrace_rtsc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RtscPackage eINSTANCE = rtscTrace.States.rtsc.impl.RtscPackageImpl.init();

	/**
	 * The meta object id for the '{@link rtscTrace.States.rtsc.impl.TracedBehaviorImpl <em>Traced Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.States.rtsc.impl.TracedBehaviorImpl
	 * @see rtscTrace.States.rtsc.impl.RtscPackageImpl#getTracedBehavior()
	 * @generated
	 */
	int TRACED_BEHAVIOR = 0;

	/**
	 * The number of structural features of the '<em>Traced Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BEHAVIOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link rtscTrace.States.rtsc.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.States.rtsc.impl.TracedNamedElementImpl
	 * @see rtscTrace.States.rtsc.impl.RtscPackageImpl#getTracedNamedElement()
	 * @generated
	 */
	int TRACED_NAMED_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Traced Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link rtscTrace.States.rtsc.impl.TracedRealtimestatechartImpl <em>Traced Realtimestatechart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.States.rtsc.impl.TracedRealtimestatechartImpl
	 * @see rtscTrace.States.rtsc.impl.RtscPackageImpl#getTracedRealtimestatechart()
	 * @generated
	 */
	int TRACED_REALTIMESTATECHART = 2;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REALTIMESTATECHART__ORIGINAL_OBJECT = TRACED_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rounds Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REALTIMESTATECHART__ROUNDS_SEQUENCE = TRACED_BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Realtimestatechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REALTIMESTATECHART_FEATURE_COUNT = TRACED_BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rtscTrace.States.rtsc.impl.TracedVertexImpl <em>Traced Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.States.rtsc.impl.TracedVertexImpl
	 * @see rtscTrace.States.rtsc.impl.RtscPackageImpl#getTracedVertex()
	 * @generated
	 */
	int TRACED_VERTEX = 5;

	/**
	 * The feature id for the '<em><b>Active Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VERTEX__ACTIVE_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Original Object Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VERTEX__ORIGINAL_OBJECT_VERTEX = 1;

	/**
	 * The number of structural features of the '<em>Traced Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VERTEX_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link rtscTrace.States.rtsc.impl.TracedStateImpl <em>Traced State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.States.rtsc.impl.TracedStateImpl
	 * @see rtscTrace.States.rtsc.impl.RtscPackageImpl#getTracedState()
	 * @generated
	 */
	int TRACED_STATE = 3;

	/**
	 * The feature id for the '<em><b>Active Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE__ACTIVE_SEQUENCE = TRACED_VERTEX__ACTIVE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE__ORIGINAL_OBJECT_VERTEX = TRACED_VERTEX__ORIGINAL_OBJECT_VERTEX;

	/**
	 * The number of structural features of the '<em>Traced State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_FEATURE_COUNT = TRACED_VERTEX_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rtscTrace.States.rtsc.impl.TracedTransitionImpl <em>Traced Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rtscTrace.States.rtsc.impl.TracedTransitionImpl
	 * @see rtscTrace.States.rtsc.impl.RtscPackageImpl#getTracedTransition()
	 * @generated
	 */
	int TRACED_TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Hit Count Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION__HIT_COUNT_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION__ORIGINAL_OBJECT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link rtscTrace.States.rtsc.TracedBehavior <em>Traced Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Behavior</em>'.
	 * @see rtscTrace.States.rtsc.TracedBehavior
	 * @generated
	 */
	EClass getTracedBehavior();

	/**
	 * Returns the meta object for class '{@link rtscTrace.States.rtsc.TracedNamedElement <em>Traced Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Named Element</em>'.
	 * @see rtscTrace.States.rtsc.TracedNamedElement
	 * @generated
	 */
	EClass getTracedNamedElement();

	/**
	 * Returns the meta object for class '{@link rtscTrace.States.rtsc.TracedRealtimestatechart <em>Traced Realtimestatechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Realtimestatechart</em>'.
	 * @see rtscTrace.States.rtsc.TracedRealtimestatechart
	 * @generated
	 */
	EClass getTracedRealtimestatechart();

	/**
	 * Returns the meta object for the reference '{@link rtscTrace.States.rtsc.TracedRealtimestatechart#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see rtscTrace.States.rtsc.TracedRealtimestatechart#getOriginalObject()
	 * @see #getTracedRealtimestatechart()
	 * @generated
	 */
	EReference getTracedRealtimestatechart_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link rtscTrace.States.rtsc.TracedRealtimestatechart#getRoundsSequence <em>Rounds Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rounds Sequence</em>'.
	 * @see rtscTrace.States.rtsc.TracedRealtimestatechart#getRoundsSequence()
	 * @see #getTracedRealtimestatechart()
	 * @generated
	 */
	EReference getTracedRealtimestatechart_RoundsSequence();

	/**
	 * Returns the meta object for class '{@link rtscTrace.States.rtsc.TracedState <em>Traced State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced State</em>'.
	 * @see rtscTrace.States.rtsc.TracedState
	 * @generated
	 */
	EClass getTracedState();

	/**
	 * Returns the meta object for class '{@link rtscTrace.States.rtsc.TracedTransition <em>Traced Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Transition</em>'.
	 * @see rtscTrace.States.rtsc.TracedTransition
	 * @generated
	 */
	EClass getTracedTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link rtscTrace.States.rtsc.TracedTransition#getHitCountSequence <em>Hit Count Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hit Count Sequence</em>'.
	 * @see rtscTrace.States.rtsc.TracedTransition#getHitCountSequence()
	 * @see #getTracedTransition()
	 * @generated
	 */
	EReference getTracedTransition_HitCountSequence();

	/**
	 * Returns the meta object for the reference '{@link rtscTrace.States.rtsc.TracedTransition#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see rtscTrace.States.rtsc.TracedTransition#getOriginalObject()
	 * @see #getTracedTransition()
	 * @generated
	 */
	EReference getTracedTransition_OriginalObject();

	/**
	 * Returns the meta object for class '{@link rtscTrace.States.rtsc.TracedVertex <em>Traced Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Vertex</em>'.
	 * @see rtscTrace.States.rtsc.TracedVertex
	 * @generated
	 */
	EClass getTracedVertex();

	/**
	 * Returns the meta object for the containment reference list '{@link rtscTrace.States.rtsc.TracedVertex#getActiveSequence <em>Active Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Active Sequence</em>'.
	 * @see rtscTrace.States.rtsc.TracedVertex#getActiveSequence()
	 * @see #getTracedVertex()
	 * @generated
	 */
	EReference getTracedVertex_ActiveSequence();

	/**
	 * Returns the meta object for the reference '{@link rtscTrace.States.rtsc.TracedVertex#getOriginalObject_Vertex <em>Original Object Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object Vertex</em>'.
	 * @see rtscTrace.States.rtsc.TracedVertex#getOriginalObject_Vertex()
	 * @see #getTracedVertex()
	 * @generated
	 */
	EReference getTracedVertex_OriginalObject_Vertex();

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
		 * The meta object literal for the '{@link rtscTrace.States.rtsc.impl.TracedBehaviorImpl <em>Traced Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.States.rtsc.impl.TracedBehaviorImpl
		 * @see rtscTrace.States.rtsc.impl.RtscPackageImpl#getTracedBehavior()
		 * @generated
		 */
		EClass TRACED_BEHAVIOR = eINSTANCE.getTracedBehavior();

		/**
		 * The meta object literal for the '{@link rtscTrace.States.rtsc.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.States.rtsc.impl.TracedNamedElementImpl
		 * @see rtscTrace.States.rtsc.impl.RtscPackageImpl#getTracedNamedElement()
		 * @generated
		 */
		EClass TRACED_NAMED_ELEMENT = eINSTANCE.getTracedNamedElement();

		/**
		 * The meta object literal for the '{@link rtscTrace.States.rtsc.impl.TracedRealtimestatechartImpl <em>Traced Realtimestatechart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.States.rtsc.impl.TracedRealtimestatechartImpl
		 * @see rtscTrace.States.rtsc.impl.RtscPackageImpl#getTracedRealtimestatechart()
		 * @generated
		 */
		EClass TRACED_REALTIMESTATECHART = eINSTANCE.getTracedRealtimestatechart();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_REALTIMESTATECHART__ORIGINAL_OBJECT = eINSTANCE.getTracedRealtimestatechart_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Rounds Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_REALTIMESTATECHART__ROUNDS_SEQUENCE = eINSTANCE.getTracedRealtimestatechart_RoundsSequence();

		/**
		 * The meta object literal for the '{@link rtscTrace.States.rtsc.impl.TracedStateImpl <em>Traced State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.States.rtsc.impl.TracedStateImpl
		 * @see rtscTrace.States.rtsc.impl.RtscPackageImpl#getTracedState()
		 * @generated
		 */
		EClass TRACED_STATE = eINSTANCE.getTracedState();

		/**
		 * The meta object literal for the '{@link rtscTrace.States.rtsc.impl.TracedTransitionImpl <em>Traced Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.States.rtsc.impl.TracedTransitionImpl
		 * @see rtscTrace.States.rtsc.impl.RtscPackageImpl#getTracedTransition()
		 * @generated
		 */
		EClass TRACED_TRANSITION = eINSTANCE.getTracedTransition();

		/**
		 * The meta object literal for the '<em><b>Hit Count Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRANSITION__HIT_COUNT_SEQUENCE = eINSTANCE.getTracedTransition_HitCountSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRANSITION__ORIGINAL_OBJECT = eINSTANCE.getTracedTransition_OriginalObject();

		/**
		 * The meta object literal for the '{@link rtscTrace.States.rtsc.impl.TracedVertexImpl <em>Traced Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rtscTrace.States.rtsc.impl.TracedVertexImpl
		 * @see rtscTrace.States.rtsc.impl.RtscPackageImpl#getTracedVertex()
		 * @generated
		 */
		EClass TRACED_VERTEX = eINSTANCE.getTracedVertex();

		/**
		 * The meta object literal for the '<em><b>Active Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VERTEX__ACTIVE_SEQUENCE = eINSTANCE.getTracedVertex_ActiveSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object Vertex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VERTEX__ORIGINAL_OBJECT_VERTEX = eINSTANCE.getTracedVertex_OriginalObject_Vertex();

	}

} //RtscPackage
