/**
 */
package org.emftrace.metamodel.BPMN2Model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

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
 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelFactory
 * @model kind="package"
 * @generated
 */
public interface BPMN2ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BPMN2Model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "BPMN2Model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BPMN2Model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BPMN2ModelPackage eINSTANCE = org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.BPMNBaseImpl <em>BPMN Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMNBaseImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getBPMNBase()
	 * @generated
	 */
	int BPMN_BASE = 138;

	/**
	 * The number of structural features of the '<em>BPMN Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_BASE_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = BPMN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = BPMN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = BPMN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTIVITY = BPMN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ad Hoc Sub Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AD_HOC_SUB_PROCESS = BPMN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Flow Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLOW_ELEMENT = BPMN_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ARTIFACT = BPMN_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSIGNMENT = BPMN_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSOCIATION = BPMN_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUDITING = BPMN_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Base Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASE_ELEMENT = BPMN_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Base Element With Mixed Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT = BPMN_BASE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Boundary Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOUNDARY_EVENT = BPMN_BASE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Business Rule Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUSINESS_RULE_TASK = BPMN_BASE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Callable Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CALLABLE_ELEMENT = BPMN_BASE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Call Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CALL_ACTIVITY = BPMN_BASE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Call Choreography</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CALL_CHOREOGRAPHY = BPMN_BASE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Call Conversation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CALL_CONVERSATION = BPMN_BASE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Conversation Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONVERSATION_NODE = BPMN_BASE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Cancel Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION = BPMN_BASE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVENT_DEFINITION = BPMN_BASE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROOT_ELEMENT = BPMN_BASE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Catch Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CATCH_EVENT = BPMN_BASE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CATEGORY = BPMN_BASE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Category Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CATEGORY_VALUE = BPMN_BASE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Choreography</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHOREOGRAPHY = BPMN_BASE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Collaboration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLLABORATION = BPMN_BASE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Choreography Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY = BPMN_BASE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Choreography Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHOREOGRAPHY_TASK = BPMN_BASE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Compensate Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION = BPMN_BASE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Complex Behavior Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION = BPMN_BASE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Complex Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPLEX_GATEWAY = BPMN_BASE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Conditional Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION = BPMN_BASE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Conversation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONVERSATION = BPMN_BASE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Conversation Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONVERSATION_ASSOCIATION = BPMN_BASE_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Conversation Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONVERSATION_LINK = BPMN_BASE_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Correlation Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CORRELATION_KEY = BPMN_BASE_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Correlation Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CORRELATION_PROPERTY = BPMN_BASE_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Correlation Property Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING = BPMN_BASE_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Correlation Property Retrieval Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION = BPMN_BASE_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Correlation Subscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION = BPMN_BASE_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Data Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_ASSOCIATION = BPMN_BASE_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Data Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_INPUT = BPMN_BASE_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION = BPMN_BASE_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Data Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_OBJECT = BPMN_BASE_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Data Object Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_OBJECT_REFERENCE = BPMN_BASE_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Data Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_OUTPUT = BPMN_BASE_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION = BPMN_BASE_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_STATE = BPMN_BASE_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Data Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_STORE = BPMN_BASE_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Data Store Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_STORE_REFERENCE = BPMN_BASE_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFINITIONS = BPMN_BASE_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENTATION = BPMN_BASE_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>End Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_EVENT = BPMN_BASE_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_POINT = BPMN_BASE_FEATURE_COUNT + 54;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERROR = BPMN_BASE_FEATURE_COUNT + 55;

	/**
	 * The feature id for the '<em><b>Error Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERROR_EVENT_DEFINITION = BPMN_BASE_FEATURE_COUNT + 56;

	/**
	 * The feature id for the '<em><b>Escalation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ESCALATION = BPMN_BASE_FEATURE_COUNT + 57;

	/**
	 * The feature id for the '<em><b>Escalation Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION = BPMN_BASE_FEATURE_COUNT + 58;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVENT = BPMN_BASE_FEATURE_COUNT + 59;

	/**
	 * The feature id for the '<em><b>Event Based Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVENT_BASED_GATEWAY = BPMN_BASE_FEATURE_COUNT + 60;

	/**
	 * The feature id for the '<em><b>Exclusive Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCLUSIVE_GATEWAY = BPMN_BASE_FEATURE_COUNT + 61;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPRESSION = BPMN_BASE_FEATURE_COUNT + 62;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENSION = BPMN_BASE_FEATURE_COUNT + 63;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENSION_ELEMENTS = BPMN_BASE_FEATURE_COUNT + 64;

	/**
	 * The feature id for the '<em><b>Flow Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLOW_NODE = BPMN_BASE_FEATURE_COUNT + 65;

	/**
	 * The feature id for the '<em><b>Formal Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORMAL_EXPRESSION = BPMN_BASE_FEATURE_COUNT + 66;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GATEWAY = BPMN_BASE_FEATURE_COUNT + 67;

	/**
	 * The feature id for the '<em><b>Global Business Rule Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK = BPMN_BASE_FEATURE_COUNT + 68;

	/**
	 * The feature id for the '<em><b>Global Choreography Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK = BPMN_BASE_FEATURE_COUNT + 69;

	/**
	 * The feature id for the '<em><b>Global Conversation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GLOBAL_CONVERSATION = BPMN_BASE_FEATURE_COUNT + 70;

	/**
	 * The feature id for the '<em><b>Global Manual Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GLOBAL_MANUAL_TASK = BPMN_BASE_FEATURE_COUNT + 71;

	/**
	 * The feature id for the '<em><b>Global Script Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK = BPMN_BASE_FEATURE_COUNT + 72;

	/**
	 * The feature id for the '<em><b>Global Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GLOBAL_TASK = BPMN_BASE_FEATURE_COUNT + 73;

	/**
	 * The feature id for the '<em><b>Global User Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GLOBAL_USER_TASK = BPMN_BASE_FEATURE_COUNT + 74;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROUP = BPMN_BASE_FEATURE_COUNT + 75;

	/**
	 * The feature id for the '<em><b>Human Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HUMAN_PERFORMER = BPMN_BASE_FEATURE_COUNT + 76;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERFORMER = BPMN_BASE_FEATURE_COUNT + 77;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_ROLE = BPMN_BASE_FEATURE_COUNT + 78;

	/**
	 * The feature id for the '<em><b>Implicit Throw Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMPLICIT_THROW_EVENT = BPMN_BASE_FEATURE_COUNT + 79;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMPORT = BPMN_BASE_FEATURE_COUNT + 80;

	/**
	 * The feature id for the '<em><b>Inclusive Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INCLUSIVE_GATEWAY = BPMN_BASE_FEATURE_COUNT + 81;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INPUT_SET = BPMN_BASE_FEATURE_COUNT + 82;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERFACE = BPMN_BASE_FEATURE_COUNT + 83;

	/**
	 * The feature id for the '<em><b>Intermediate Catch Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT = BPMN_BASE_FEATURE_COUNT + 84;

	/**
	 * The feature id for the '<em><b>Intermediate Throw Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT = BPMN_BASE_FEATURE_COUNT + 85;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IO_BINDING = BPMN_BASE_FEATURE_COUNT + 86;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IO_SPECIFICATION = BPMN_BASE_FEATURE_COUNT + 87;

	/**
	 * The feature id for the '<em><b>Item Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ITEM_DEFINITION = BPMN_BASE_FEATURE_COUNT + 88;

	/**
	 * The feature id for the '<em><b>Lane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LANE = BPMN_BASE_FEATURE_COUNT + 89;

	/**
	 * The feature id for the '<em><b>Lane Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LANE_SET = BPMN_BASE_FEATURE_COUNT + 90;

	/**
	 * The feature id for the '<em><b>Link Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINK_EVENT_DEFINITION = BPMN_BASE_FEATURE_COUNT + 91;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOOP_CHARACTERISTICS = BPMN_BASE_FEATURE_COUNT + 92;

	/**
	 * The feature id for the '<em><b>Manual Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MANUAL_TASK = BPMN_BASE_FEATURE_COUNT + 93;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE = BPMN_BASE_FEATURE_COUNT + 94;

	/**
	 * The feature id for the '<em><b>Message Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION = BPMN_BASE_FEATURE_COUNT + 95;

	/**
	 * The feature id for the '<em><b>Message Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_FLOW = BPMN_BASE_FEATURE_COUNT + 96;

	/**
	 * The feature id for the '<em><b>Message Flow Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION = BPMN_BASE_FEATURE_COUNT + 97;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MONITORING = BPMN_BASE_FEATURE_COUNT + 98;

	/**
	 * The feature id for the '<em><b>Multi Instance Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS = BPMN_BASE_FEATURE_COUNT + 99;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPERATION = BPMN_BASE_FEATURE_COUNT + 100;

	/**
	 * The feature id for the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OUTPUT_SET = BPMN_BASE_FEATURE_COUNT + 101;

	/**
	 * The feature id for the '<em><b>Parallel Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARALLEL_GATEWAY = BPMN_BASE_FEATURE_COUNT + 102;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARTICIPANT = BPMN_BASE_FEATURE_COUNT + 103;

	/**
	 * The feature id for the '<em><b>Participant Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION = BPMN_BASE_FEATURE_COUNT + 104;

	/**
	 * The feature id for the '<em><b>Participant Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY = BPMN_BASE_FEATURE_COUNT + 105;

	/**
	 * The feature id for the '<em><b>Partner Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARTNER_ENTITY = BPMN_BASE_FEATURE_COUNT + 106;

	/**
	 * The feature id for the '<em><b>Partner Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARTNER_ROLE = BPMN_BASE_FEATURE_COUNT + 107;

	/**
	 * The feature id for the '<em><b>Potential Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POTENTIAL_OWNER = BPMN_BASE_FEATURE_COUNT + 108;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROCESS = BPMN_BASE_FEATURE_COUNT + 109;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY = BPMN_BASE_FEATURE_COUNT + 110;

	/**
	 * The feature id for the '<em><b>Receive Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECEIVE_TASK = BPMN_BASE_FEATURE_COUNT + 111;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELATIONSHIP = BPMN_BASE_FEATURE_COUNT + 112;

	/**
	 * The feature id for the '<em><b>Rendering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RENDERING = BPMN_BASE_FEATURE_COUNT + 113;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE = BPMN_BASE_FEATURE_COUNT + 114;

	/**
	 * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION = BPMN_BASE_FEATURE_COUNT + 115;

	/**
	 * The feature id for the '<em><b>Resource Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_PARAMETER = BPMN_BASE_FEATURE_COUNT + 116;

	/**
	 * The feature id for the '<em><b>Resource Parameter Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING = BPMN_BASE_FEATURE_COUNT + 117;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCRIPT = BPMN_BASE_FEATURE_COUNT + 118;

	/**
	 * The feature id for the '<em><b>Script Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCRIPT_TASK = BPMN_BASE_FEATURE_COUNT + 119;

	/**
	 * The feature id for the '<em><b>Send Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SEND_TASK = BPMN_BASE_FEATURE_COUNT + 120;

	/**
	 * The feature id for the '<em><b>Sequence Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SEQUENCE_FLOW = BPMN_BASE_FEATURE_COUNT + 121;

	/**
	 * The feature id for the '<em><b>Service Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_TASK = BPMN_BASE_FEATURE_COUNT + 122;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNAL = BPMN_BASE_FEATURE_COUNT + 123;

	/**
	 * The feature id for the '<em><b>Signal Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION = BPMN_BASE_FEATURE_COUNT + 124;

	/**
	 * The feature id for the '<em><b>Standard Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS = BPMN_BASE_FEATURE_COUNT + 125;

	/**
	 * The feature id for the '<em><b>Start Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_EVENT = BPMN_BASE_FEATURE_COUNT + 126;

	/**
	 * The feature id for the '<em><b>Sub Choreography</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUB_CHOREOGRAPHY = BPMN_BASE_FEATURE_COUNT + 127;

	/**
	 * The feature id for the '<em><b>Sub Conversation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUB_CONVERSATION = BPMN_BASE_FEATURE_COUNT + 128;

	/**
	 * The feature id for the '<em><b>Sub Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUB_PROCESS = BPMN_BASE_FEATURE_COUNT + 129;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TASK = BPMN_BASE_FEATURE_COUNT + 130;

	/**
	 * The feature id for the '<em><b>Terminate Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION = BPMN_BASE_FEATURE_COUNT + 131;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT = BPMN_BASE_FEATURE_COUNT + 132;

	/**
	 * The feature id for the '<em><b>Text Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_ANNOTATION = BPMN_BASE_FEATURE_COUNT + 133;

	/**
	 * The feature id for the '<em><b>Throw Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THROW_EVENT = BPMN_BASE_FEATURE_COUNT + 134;

	/**
	 * The feature id for the '<em><b>Timer Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIMER_EVENT_DEFINITION = BPMN_BASE_FEATURE_COUNT + 135;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION = BPMN_BASE_FEATURE_COUNT + 136;

	/**
	 * The feature id for the '<em><b>User Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USER_TASK = BPMN_BASE_FEATURE_COUNT + 137;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = BPMN_BASE_FEATURE_COUNT + 138;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.BaseElementImpl <em>Base Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BaseElementImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getBaseElement()
	 * @generated
	 */
	int BASE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT__EXTENSION_VALUES = BPMN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT__DOCUMENTATION = BPMN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT__EXTENSION_DEFINITIONS = BPMN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT__ID = BPMN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT__ANY_ATTRIBUTE = BPMN_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Base Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT_FEATURE_COUNT = BPMN_BASE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.FlowElementImpl <em>Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.FlowElementImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getFlowElement()
	 * @generated
	 */
	int FLOW_ELEMENT = 62;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__AUDITING = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__MONITORING = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__CATEGORY_VALUE_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__NAME = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.FlowNodeImpl <em>Flow Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.FlowNodeImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getFlowNode()
	 * @generated
	 */
	int FLOW_NODE = 64;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__EXTENSION_VALUES = FLOW_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__EXTENSION_DEFINITIONS = FLOW_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__ID = FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__ANY_ATTRIBUTE = FLOW_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__AUDITING = FLOW_ELEMENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__MONITORING = FLOW_ELEMENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__CATEGORY_VALUE_REF = FLOW_ELEMENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__INCOMING = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__LANES = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__OUTGOING = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ActivityImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EXTENSION_VALUES = FLOW_NODE__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DOCUMENTATION = FLOW_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EXTENSION_DEFINITIONS = FLOW_NODE__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ID = FLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ANY_ATTRIBUTE = FLOW_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__AUDITING = FLOW_NODE__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__MONITORING = FLOW_NODE__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CATEGORY_VALUE_REF = FLOW_NODE__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LANES = FLOW_NODE__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IO_SPECIFICATION = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__BOUNDARY_EVENT_REFS = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PROPERTIES = FLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DATA_INPUT_ASSOCIATIONS = FLOW_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DATA_OUTPUT_ASSOCIATIONS = FLOW_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RESOURCES = FLOW_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LOOP_CHARACTERISTICS = FLOW_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__COMPLETION_QUANTITY = FLOW_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DEFAULT = FLOW_NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_FOR_COMPENSATION = FLOW_NODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__START_QUANTITY = FLOW_NODE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.SubProcessImpl <em>Sub Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.SubProcessImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getSubProcess()
	 * @generated
	 */
	int SUB_PROCESS = 130;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__EXTENSION_VALUES = ACTIVITY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__EXTENSION_DEFINITIONS = ACTIVITY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__AUDITING = ACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__MONITORING = ACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__CATEGORY_VALUE_REF = ACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__INCOMING = ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__LANES = ACTIVITY__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__OUTGOING = ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__IO_SPECIFICATION = ACTIVITY__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__BOUNDARY_EVENT_REFS = ACTIVITY__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__PROPERTIES = ACTIVITY__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__DATA_INPUT_ASSOCIATIONS = ACTIVITY__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__DATA_OUTPUT_ASSOCIATIONS = ACTIVITY__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__LOOP_CHARACTERISTICS = ACTIVITY__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__COMPLETION_QUANTITY = ACTIVITY__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__DEFAULT = ACTIVITY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__IS_FOR_COMPENSATION = ACTIVITY__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__START_QUANTITY = ACTIVITY__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Lane Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__LANE_SETS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__FLOW_ELEMENTS = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__ARTIFACTS = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Triggered By Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__TRIGGERED_BY_EVENT = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.AdHocSubProcessImpl <em>Ad Hoc Sub Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.AdHocSubProcessImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getAdHocSubProcess()
	 * @generated
	 */
	int AD_HOC_SUB_PROCESS = 2;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__EXTENSION_VALUES = SUB_PROCESS__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__DOCUMENTATION = SUB_PROCESS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__EXTENSION_DEFINITIONS = SUB_PROCESS__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__ID = SUB_PROCESS__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__ANY_ATTRIBUTE = SUB_PROCESS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__AUDITING = SUB_PROCESS__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__MONITORING = SUB_PROCESS__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__CATEGORY_VALUE_REF = SUB_PROCESS__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__NAME = SUB_PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__INCOMING = SUB_PROCESS__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__LANES = SUB_PROCESS__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__OUTGOING = SUB_PROCESS__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__IO_SPECIFICATION = SUB_PROCESS__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__BOUNDARY_EVENT_REFS = SUB_PROCESS__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__PROPERTIES = SUB_PROCESS__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__DATA_INPUT_ASSOCIATIONS = SUB_PROCESS__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__DATA_OUTPUT_ASSOCIATIONS = SUB_PROCESS__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__RESOURCES = SUB_PROCESS__RESOURCES;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__LOOP_CHARACTERISTICS = SUB_PROCESS__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__COMPLETION_QUANTITY = SUB_PROCESS__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__DEFAULT = SUB_PROCESS__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__IS_FOR_COMPENSATION = SUB_PROCESS__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__START_QUANTITY = SUB_PROCESS__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Lane Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__LANE_SETS = SUB_PROCESS__LANE_SETS;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__FLOW_ELEMENTS = SUB_PROCESS__FLOW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__ARTIFACTS = SUB_PROCESS__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Triggered By Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__TRIGGERED_BY_EVENT = SUB_PROCESS__TRIGGERED_BY_EVENT;

	/**
	 * The feature id for the '<em><b>Completion Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__COMPLETION_CONDITION = SUB_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cancel Remaining Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES = SUB_PROCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__ORDERING = SUB_PROCESS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ad Hoc Sub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS_FEATURE_COUNT = SUB_PROCESS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ArtifactImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 3;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.AssignmentImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 4;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__FROM = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__TO = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.AssociationImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 5;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__EXTENSION_VALUES = ARTIFACT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DOCUMENTATION = ARTIFACT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__EXTENSION_DEFINITIONS = ARTIFACT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ID = ARTIFACT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ANY_ATTRIBUTE = ARTIFACT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Association Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASSOCIATION_DIRECTION = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE_REF = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_REF = ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.AuditingImpl <em>Auditing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.AuditingImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getAuditing()
	 * @generated
	 */
	int AUDITING = 6;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITING__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITING__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITING__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITING__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITING__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Auditing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.EventImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 53;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EXTENSION_VALUES = FLOW_NODE__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DOCUMENTATION = FLOW_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EXTENSION_DEFINITIONS = FLOW_NODE__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = FLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ANY_ATTRIBUTE = FLOW_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__AUDITING = FLOW_NODE__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__MONITORING = FLOW_NODE__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CATEGORY_VALUE_REF = FLOW_NODE__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LANES = FLOW_NODE__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INCOMING_CONVERSATION_LINKS = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OUTGOING_CONVERSATION_LINKS = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PROPERTIES = FLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.CatchEventImpl <em>Catch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.CatchEventImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getCatchEvent()
	 * @generated
	 */
	int CATCH_EVENT = 15;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__EXTENSION_VALUES = EVENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__DOCUMENTATION = EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__EXTENSION_DEFINITIONS = EVENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__ANY_ATTRIBUTE = EVENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__AUDITING = EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__MONITORING = EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__CATEGORY_VALUE_REF = EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__INCOMING = EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__LANES = EVENT__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__OUTGOING = EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__INCOMING_CONVERSATION_LINKS = EVENT__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__OUTGOING_CONVERSATION_LINKS = EVENT__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__PROPERTIES = EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__DATA_OUTPUTS = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__DATA_OUTPUT_ASSOCIATION = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__OUTPUT_SET = EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__EVENT_DEFINITIONS = EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Event Definition Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__EVENT_DEFINITION_REFS = EVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__PARALLEL_MULTIPLE = EVENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Catch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.BoundaryEventImpl <em>Boundary Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BoundaryEventImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getBoundaryEvent()
	 * @generated
	 */
	int BOUNDARY_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__EXTENSION_VALUES = CATCH_EVENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__DOCUMENTATION = CATCH_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__EXTENSION_DEFINITIONS = CATCH_EVENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__ID = CATCH_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__ANY_ATTRIBUTE = CATCH_EVENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__AUDITING = CATCH_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__MONITORING = CATCH_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__CATEGORY_VALUE_REF = CATCH_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__NAME = CATCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__INCOMING = CATCH_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__LANES = CATCH_EVENT__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__OUTGOING = CATCH_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__INCOMING_CONVERSATION_LINKS = CATCH_EVENT__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__OUTGOING_CONVERSATION_LINKS = CATCH_EVENT__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__PROPERTIES = CATCH_EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__DATA_OUTPUTS = CATCH_EVENT__DATA_OUTPUTS;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__DATA_OUTPUT_ASSOCIATION = CATCH_EVENT__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__OUTPUT_SET = CATCH_EVENT__OUTPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__EVENT_DEFINITIONS = CATCH_EVENT__EVENT_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Event Definition Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__EVENT_DEFINITION_REFS = CATCH_EVENT__EVENT_DEFINITION_REFS;

	/**
	 * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__PARALLEL_MULTIPLE = CATCH_EVENT__PARALLEL_MULTIPLE;

	/**
	 * The feature id for the '<em><b>Attached To Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__ATTACHED_TO_REF = CATCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cancel Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__CANCEL_ACTIVITY = CATCH_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boundary Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.TaskImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 131;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EXTENSION_VALUES = ACTIVITY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EXTENSION_DEFINITIONS = ACTIVITY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__AUDITING = ACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MONITORING = ACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CATEGORY_VALUE_REF = ACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INCOMING = ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LANES = ACTIVITY__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTGOING = ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IO_SPECIFICATION = ACTIVITY__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__BOUNDARY_EVENT_REFS = ACTIVITY__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PROPERTIES = ACTIVITY__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DATA_INPUT_ASSOCIATIONS = ACTIVITY__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DATA_OUTPUT_ASSOCIATIONS = ACTIVITY__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LOOP_CHARACTERISTICS = ACTIVITY__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__COMPLETION_QUANTITY = ACTIVITY__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEFAULT = ACTIVITY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_FOR_COMPENSATION = ACTIVITY__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__START_QUANTITY = ACTIVITY__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INCOMING_CONVERSATION_LINKS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTGOING_CONVERSATION_LINKS = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.BusinessRuleTaskImpl <em>Business Rule Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BusinessRuleTaskImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getBusinessRuleTask()
	 * @generated
	 */
	int BUSINESS_RULE_TASK = 9;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__EXTENSION_VALUES = TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__EXTENSION_DEFINITIONS = TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__AUDITING = TASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__MONITORING = TASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__LANES = TASK__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__BOUNDARY_EVENT_REFS = TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__PROPERTIES = TASK__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__DEFAULT = TASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__START_QUANTITY = TASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__IMPLEMENTATION = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Business Rule Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.CallActivityImpl <em>Call Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.CallActivityImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getCallActivity()
	 * @generated
	 */
	int CALL_ACTIVITY = 10;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__EXTENSION_VALUES = ACTIVITY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__EXTENSION_DEFINITIONS = ACTIVITY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__AUDITING = ACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__MONITORING = ACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__CATEGORY_VALUE_REF = ACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__INCOMING = ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__LANES = ACTIVITY__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__OUTGOING = ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__IO_SPECIFICATION = ACTIVITY__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__BOUNDARY_EVENT_REFS = ACTIVITY__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__PROPERTIES = ACTIVITY__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__DATA_INPUT_ASSOCIATIONS = ACTIVITY__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__DATA_OUTPUT_ASSOCIATIONS = ACTIVITY__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__LOOP_CHARACTERISTICS = ACTIVITY__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__COMPLETION_QUANTITY = ACTIVITY__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__DEFAULT = ACTIVITY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__IS_FOR_COMPENSATION = ACTIVITY__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__START_QUANTITY = ACTIVITY__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Called Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__CALLED_ELEMENT_REF = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ChoreographyActivityImpl <em>Choreography Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ChoreographyActivityImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getChoreographyActivity()
	 * @generated
	 */
	int CHOREOGRAPHY_ACTIVITY = 19;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__EXTENSION_VALUES = FLOW_NODE__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__DOCUMENTATION = FLOW_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__EXTENSION_DEFINITIONS = FLOW_NODE__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__ID = FLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__ANY_ATTRIBUTE = FLOW_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__AUDITING = FLOW_NODE__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__MONITORING = FLOW_NODE__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE_REF = FLOW_NODE__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__LANES = FLOW_NODE__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initiating Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF = FLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loop Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__LOOP_TYPE = FLOW_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Choreography Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.CallChoreographyImpl <em>Call Choreography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.CallChoreographyImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getCallChoreography()
	 * @generated
	 */
	int CALL_CHOREOGRAPHY = 11;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__EXTENSION_VALUES = CHOREOGRAPHY_ACTIVITY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__DOCUMENTATION = CHOREOGRAPHY_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__EXTENSION_DEFINITIONS = CHOREOGRAPHY_ACTIVITY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__ID = CHOREOGRAPHY_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__ANY_ATTRIBUTE = CHOREOGRAPHY_ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__AUDITING = CHOREOGRAPHY_ACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__MONITORING = CHOREOGRAPHY_ACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__CATEGORY_VALUE_REF = CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__NAME = CHOREOGRAPHY_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__INCOMING = CHOREOGRAPHY_ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__LANES = CHOREOGRAPHY_ACTIVITY__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__OUTGOING = CHOREOGRAPHY_ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__PARTICIPANT_REFS = CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__CORRELATION_KEYS = CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS;

	/**
	 * The feature id for the '<em><b>Initiating Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__INITIATING_PARTICIPANT_REF = CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF;

	/**
	 * The feature id for the '<em><b>Loop Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__LOOP_TYPE = CHOREOGRAPHY_ACTIVITY__LOOP_TYPE;

	/**
	 * The feature id for the '<em><b>Participant Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Called Choreography Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY_FEATURE_COUNT = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ConversationNodeImpl <em>Conversation Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ConversationNodeImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getConversationNode()
	 * @generated
	 */
	int CONVERSATION_NODE = 29;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__PARTICIPANT_REFS = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Flow Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__MESSAGE_FLOW_REFS = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__CORRELATION_KEYS = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__NAME = BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Conversation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.CallConversationImpl <em>Call Conversation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.CallConversationImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getCallConversation()
	 * @generated
	 */
	int CALL_CONVERSATION = 12;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__EXTENSION_VALUES = CONVERSATION_NODE__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__DOCUMENTATION = CONVERSATION_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__EXTENSION_DEFINITIONS = CONVERSATION_NODE__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__ID = CONVERSATION_NODE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__ANY_ATTRIBUTE = CONVERSATION_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__INCOMING_CONVERSATION_LINKS = CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__OUTGOING_CONVERSATION_LINKS = CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__PARTICIPANT_REFS = CONVERSATION_NODE__PARTICIPANT_REFS;

	/**
	 * The feature id for the '<em><b>Message Flow Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__MESSAGE_FLOW_REFS = CONVERSATION_NODE__MESSAGE_FLOW_REFS;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__CORRELATION_KEYS = CONVERSATION_NODE__CORRELATION_KEYS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__NAME = CONVERSATION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Participant Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS = CONVERSATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Called Collaboration Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__CALLED_COLLABORATION_REF = CONVERSATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION_FEATURE_COUNT = CONVERSATION_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.RootElementImpl <em>Root Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.RootElementImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getRootElement()
	 * @generated
	 */
	int ROOT_ELEMENT = 119;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Root Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.CallableElementImpl <em>Callable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.CallableElementImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getCallableElement()
	 * @generated
	 */
	int CALLABLE_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Supported Interface Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__IO_SPECIFICATION = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__IO_BINDING = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__NAME = ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Callable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.EventDefinitionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getEventDefinition()
	 * @generated
	 */
	int EVENT_DEFINITION = 55;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.CancelEventDefinitionImpl <em>Cancel Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.CancelEventDefinitionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getCancelEventDefinition()
	 * @generated
	 */
	int CANCEL_EVENT_DEFINITION = 14;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Cancel Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.CategoryImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 16;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Category Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY_VALUE = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.CategoryValueImpl <em>Category Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.CategoryValueImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getCategoryValue()
	 * @generated
	 */
	int CATEGORY_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE__VALUE = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Categorized Flow Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE__CATEGORIZED_FLOW_ELEMENTS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.CollaborationImpl <em>Collaboration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.CollaborationImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getCollaboration()
	 * @generated
	 */
	int COLLABORATION = 21;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__PARTICIPANTS = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__MESSAGE_FLOWS = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__ARTIFACTS = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conversations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__CONVERSATIONS = ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conversation Associations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__CONVERSATION_ASSOCIATIONS = ROOT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Participant Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__PARTICIPANT_ASSOCIATIONS = ROOT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Message Flow Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS = ROOT_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__CORRELATION_KEYS = ROOT_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Choreography Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__CHOREOGRAPHY_REF = ROOT_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Conversation Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__CONVERSATION_LINKS = ROOT_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__IS_CLOSED = ROOT_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__NAME = ROOT_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ChoreographyImpl <em>Choreography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ChoreographyImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getChoreography()
	 * @generated
	 */
	int CHOREOGRAPHY = 18;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__EXTENSION_VALUES = COLLABORATION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__DOCUMENTATION = COLLABORATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__EXTENSION_DEFINITIONS = COLLABORATION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__ID = COLLABORATION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__ANY_ATTRIBUTE = COLLABORATION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__PARTICIPANTS = COLLABORATION__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Message Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__MESSAGE_FLOWS = COLLABORATION__MESSAGE_FLOWS;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__ARTIFACTS = COLLABORATION__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Conversations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__CONVERSATIONS = COLLABORATION__CONVERSATIONS;

	/**
	 * The feature id for the '<em><b>Conversation Associations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__CONVERSATION_ASSOCIATIONS = COLLABORATION__CONVERSATION_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Participant Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS = COLLABORATION__PARTICIPANT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Message Flow Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATIONS = COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__CORRELATION_KEYS = COLLABORATION__CORRELATION_KEYS;

	/**
	 * The feature id for the '<em><b>Choreography Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__CHOREOGRAPHY_REF = COLLABORATION__CHOREOGRAPHY_REF;

	/**
	 * The feature id for the '<em><b>Conversation Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__CONVERSATION_LINKS = COLLABORATION__CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__IS_CLOSED = COLLABORATION__IS_CLOSED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__NAME = COLLABORATION__NAME;

	/**
	 * The feature id for the '<em><b>Lane Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__LANE_SETS = COLLABORATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__FLOW_ELEMENTS = COLLABORATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_FEATURE_COUNT = COLLABORATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ChoreographyTaskImpl <em>Choreography Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ChoreographyTaskImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getChoreographyTask()
	 * @generated
	 */
	int CHOREOGRAPHY_TASK = 20;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__EXTENSION_VALUES = CHOREOGRAPHY_ACTIVITY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__DOCUMENTATION = CHOREOGRAPHY_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__EXTENSION_DEFINITIONS = CHOREOGRAPHY_ACTIVITY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__ID = CHOREOGRAPHY_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__ANY_ATTRIBUTE = CHOREOGRAPHY_ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__AUDITING = CHOREOGRAPHY_ACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__MONITORING = CHOREOGRAPHY_ACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__CATEGORY_VALUE_REF = CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__NAME = CHOREOGRAPHY_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__INCOMING = CHOREOGRAPHY_ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__LANES = CHOREOGRAPHY_ACTIVITY__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__OUTGOING = CHOREOGRAPHY_ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__PARTICIPANT_REFS = CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__CORRELATION_KEYS = CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS;

	/**
	 * The feature id for the '<em><b>Initiating Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF = CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF;

	/**
	 * The feature id for the '<em><b>Loop Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__LOOP_TYPE = CHOREOGRAPHY_ACTIVITY__LOOP_TYPE;

	/**
	 * The feature id for the '<em><b>Message Flow Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__MESSAGE_FLOW_REF = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Choreography Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK_FEATURE_COUNT = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.CompensateEventDefinitionImpl <em>Compensate Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.CompensateEventDefinitionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getCompensateEventDefinition()
	 * @generated
	 */
	int COMPENSATE_EVENT_DEFINITION = 22;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Activity Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wait For Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compensate Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ComplexBehaviorDefinitionImpl <em>Complex Behavior Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ComplexBehaviorDefinitionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getComplexBehaviorDefinition()
	 * @generated
	 */
	int COMPLEX_BEHAVIOR_DEFINITION = 23;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR_DEFINITION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR_DEFINITION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR_DEFINITION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR_DEFINITION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR_DEFINITION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR_DEFINITION__CONDITION = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR_DEFINITION__EVENT = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complex Behavior Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR_DEFINITION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.GatewayImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 66;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__EXTENSION_VALUES = FLOW_NODE__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__DOCUMENTATION = FLOW_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__EXTENSION_DEFINITIONS = FLOW_NODE__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__ID = FLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__ANY_ATTRIBUTE = FLOW_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__AUDITING = FLOW_NODE__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__MONITORING = FLOW_NODE__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__CATEGORY_VALUE_REF = FLOW_NODE__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__LANES = FLOW_NODE__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__GATEWAY_DIRECTION = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ComplexGatewayImpl <em>Complex Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ComplexGatewayImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getComplexGateway()
	 * @generated
	 */
	int COMPLEX_GATEWAY = 24;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__EXTENSION_VALUES = GATEWAY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__DOCUMENTATION = GATEWAY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__EXTENSION_DEFINITIONS = GATEWAY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__ID = GATEWAY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__ANY_ATTRIBUTE = GATEWAY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__AUDITING = GATEWAY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__MONITORING = GATEWAY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__CATEGORY_VALUE_REF = GATEWAY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__LANES = GATEWAY__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

	/**
	 * The feature id for the '<em><b>Activation Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__ACTIVATION_CONDITION = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__DEFAULT = GATEWAY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complex Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ConditionalEventDefinitionImpl <em>Conditional Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ConditionalEventDefinitionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getConditionalEventDefinition()
	 * @generated
	 */
	int CONDITIONAL_EVENT_DEFINITION = 25;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_DEFINITION__CONDITION = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ConversationImpl <em>Conversation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ConversationImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getConversation()
	 * @generated
	 */
	int CONVERSATION = 26;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__EXTENSION_VALUES = CONVERSATION_NODE__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__DOCUMENTATION = CONVERSATION_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__EXTENSION_DEFINITIONS = CONVERSATION_NODE__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__ID = CONVERSATION_NODE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__ANY_ATTRIBUTE = CONVERSATION_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__INCOMING_CONVERSATION_LINKS = CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__OUTGOING_CONVERSATION_LINKS = CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__PARTICIPANT_REFS = CONVERSATION_NODE__PARTICIPANT_REFS;

	/**
	 * The feature id for the '<em><b>Message Flow Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__MESSAGE_FLOW_REFS = CONVERSATION_NODE__MESSAGE_FLOW_REFS;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__CORRELATION_KEYS = CONVERSATION_NODE__CORRELATION_KEYS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__NAME = CONVERSATION_NODE__NAME;

	/**
	 * The number of structural features of the '<em>Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_FEATURE_COUNT = CONVERSATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ConversationAssociationImpl <em>Conversation Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ConversationAssociationImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getConversationAssociation()
	 * @generated
	 */
	int CONVERSATION_ASSOCIATION = 27;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_ASSOCIATION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_ASSOCIATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_ASSOCIATION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_ASSOCIATION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_ASSOCIATION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Inner Conversation Node Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Conversation Node Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conversation Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_ASSOCIATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ConversationLinkImpl <em>Conversation Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ConversationLinkImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getConversationLink()
	 * @generated
	 */
	int CONVERSATION_LINK = 28;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK__SOURCE_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK__TARGET_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conversation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.CorrelationKeyImpl <em>Correlation Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.CorrelationKeyImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getCorrelationKey()
	 * @generated
	 */
	int CORRELATION_KEY = 30;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_KEY__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_KEY__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_KEY__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_KEY__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_KEY__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Correlation Property Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_KEY__CORRELATION_PROPERTY_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_KEY__NAME = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Correlation Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_KEY_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.CorrelationPropertyImpl <em>Correlation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.CorrelationPropertyImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getCorrelationProperty()
	 * @generated
	 */
	int CORRELATION_PROPERTY = 31;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Correlation Property Retrieval Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY__NAME = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY__TYPE = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Correlation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.CorrelationPropertyBindingImpl <em>Correlation Property Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.CorrelationPropertyBindingImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getCorrelationPropertyBinding()
	 * @generated
	 */
	int CORRELATION_PROPERTY_BINDING = 32;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_BINDING__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_BINDING__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_BINDING__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_BINDING__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_BINDING__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_BINDING__DATA_PATH = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correlation Property Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Correlation Property Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_BINDING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.CorrelationPropertyRetrievalExpressionImpl <em>Correlation Property Retrieval Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.CorrelationPropertyRetrievalExpressionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getCorrelationPropertyRetrievalExpression()
	 * @generated
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION = 33;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Message Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Correlation Property Retrieval Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.CorrelationSubscriptionImpl <em>Correlation Subscription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.CorrelationSubscriptionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getCorrelationSubscription()
	 * @generated
	 */
	int CORRELATION_SUBSCRIPTION = 34;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SUBSCRIPTION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SUBSCRIPTION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SUBSCRIPTION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SUBSCRIPTION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SUBSCRIPTION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Correlation Property Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correlation Key Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Correlation Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SUBSCRIPTION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.DataAssociationImpl <em>Data Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.DataAssociationImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getDataAssociation()
	 * @generated
	 */
	int DATA_ASSOCIATION = 35;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__SOURCE_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__TARGET_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__TRANSFORMATION = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__ASSIGNMENT = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ItemAwareElementImpl <em>Item Aware Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ItemAwareElementImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getItemAwareElement()
	 * @generated
	 */
	int ITEM_AWARE_ELEMENT = 86;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_AWARE_ELEMENT__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_AWARE_ELEMENT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_AWARE_ELEMENT__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_AWARE_ELEMENT__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_AWARE_ELEMENT__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_AWARE_ELEMENT__DATA_STATE = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item Aware Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_AWARE_ELEMENT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.DataInputImpl <em>Data Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.DataInputImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getDataInput()
	 * @generated
	 */
	int DATA_INPUT = 36;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__EXTENSION_VALUES = ITEM_AWARE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__DOCUMENTATION = ITEM_AWARE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__EXTENSION_DEFINITIONS = ITEM_AWARE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__ID = ITEM_AWARE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__ANY_ATTRIBUTE = ITEM_AWARE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__DATA_STATE = ITEM_AWARE_ELEMENT__DATA_STATE;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__ITEM_SUBJECT_REF = ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF;

	/**
	 * The feature id for the '<em><b>Input Set With Optional</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__INPUT_SET_WITH_OPTIONAL = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Set With While Executing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Set Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__INPUT_SET_REFS = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__IS_COLLECTION = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__NAME = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_FEATURE_COUNT = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.DataInputAssociationImpl <em>Data Input Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.DataInputAssociationImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getDataInputAssociation()
	 * @generated
	 */
	int DATA_INPUT_ASSOCIATION = 37;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__EXTENSION_VALUES = DATA_ASSOCIATION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__DOCUMENTATION = DATA_ASSOCIATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__EXTENSION_DEFINITIONS = DATA_ASSOCIATION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__ID = DATA_ASSOCIATION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__ANY_ATTRIBUTE = DATA_ASSOCIATION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__SOURCE_REF = DATA_ASSOCIATION__SOURCE_REF;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__TARGET_REF = DATA_ASSOCIATION__TARGET_REF;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__TRANSFORMATION = DATA_ASSOCIATION__TRANSFORMATION;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__ASSIGNMENT = DATA_ASSOCIATION__ASSIGNMENT;

	/**
	 * The number of structural features of the '<em>Data Input Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION_FEATURE_COUNT = DATA_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.DataObjectImpl <em>Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.DataObjectImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getDataObject()
	 * @generated
	 */
	int DATA_OBJECT = 38;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__EXTENSION_VALUES = FLOW_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__EXTENSION_DEFINITIONS = FLOW_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__ID = FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__ANY_ATTRIBUTE = FLOW_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__AUDITING = FLOW_ELEMENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__MONITORING = FLOW_ELEMENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__CATEGORY_VALUE_REF = FLOW_ELEMENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__DATA_STATE = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__ITEM_SUBJECT_REF = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__IS_COLLECTION = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.DataObjectReferenceImpl <em>Data Object Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.DataObjectReferenceImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getDataObjectReference()
	 * @generated
	 */
	int DATA_OBJECT_REFERENCE = 39;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__EXTENSION_VALUES = FLOW_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__EXTENSION_DEFINITIONS = FLOW_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__ID = FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__ANY_ATTRIBUTE = FLOW_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__AUDITING = FLOW_ELEMENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__MONITORING = FLOW_ELEMENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__CATEGORY_VALUE_REF = FLOW_ELEMENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__DATA_STATE = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Object Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__DATA_OBJECT_REF = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Object Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.DataOutputImpl <em>Data Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.DataOutputImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getDataOutput()
	 * @generated
	 */
	int DATA_OUTPUT = 40;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__EXTENSION_VALUES = ITEM_AWARE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__DOCUMENTATION = ITEM_AWARE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__EXTENSION_DEFINITIONS = ITEM_AWARE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__ID = ITEM_AWARE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__ANY_ATTRIBUTE = ITEM_AWARE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__DATA_STATE = ITEM_AWARE_ELEMENT__DATA_STATE;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__ITEM_SUBJECT_REF = ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF;

	/**
	 * The feature id for the '<em><b>Output Set With Optional</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Set With While Executing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Set Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__OUTPUT_SET_REFS = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__IS_COLLECTION = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__NAME = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_FEATURE_COUNT = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.DataOutputAssociationImpl <em>Data Output Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.DataOutputAssociationImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getDataOutputAssociation()
	 * @generated
	 */
	int DATA_OUTPUT_ASSOCIATION = 41;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__EXTENSION_VALUES = DATA_ASSOCIATION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__DOCUMENTATION = DATA_ASSOCIATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__EXTENSION_DEFINITIONS = DATA_ASSOCIATION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__ID = DATA_ASSOCIATION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__ANY_ATTRIBUTE = DATA_ASSOCIATION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__SOURCE_REF = DATA_ASSOCIATION__SOURCE_REF;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__TARGET_REF = DATA_ASSOCIATION__TARGET_REF;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__TRANSFORMATION = DATA_ASSOCIATION__TRANSFORMATION;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__ASSIGNMENT = DATA_ASSOCIATION__ASSIGNMENT;

	/**
	 * The number of structural features of the '<em>Data Output Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION_FEATURE_COUNT = DATA_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.DataStateImpl <em>Data State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.DataStateImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getDataState()
	 * @generated
	 */
	int DATA_STATE = 42;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.DataStoreImpl <em>Data Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.DataStoreImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getDataStore()
	 * @generated
	 */
	int DATA_STORE = 43;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__EXTENSION_VALUES = ITEM_AWARE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__DOCUMENTATION = ITEM_AWARE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__EXTENSION_DEFINITIONS = ITEM_AWARE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__ID = ITEM_AWARE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__ANY_ATTRIBUTE = ITEM_AWARE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__DATA_STATE = ITEM_AWARE_ELEMENT__DATA_STATE;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__ITEM_SUBJECT_REF = ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__CAPACITY = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Unlimited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__IS_UNLIMITED = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__NAME = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_FEATURE_COUNT = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.DataStoreReferenceImpl <em>Data Store Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.DataStoreReferenceImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getDataStoreReference()
	 * @generated
	 */
	int DATA_STORE_REFERENCE = 44;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__EXTENSION_VALUES = FLOW_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__EXTENSION_DEFINITIONS = FLOW_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__ID = FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__ANY_ATTRIBUTE = FLOW_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__AUDITING = FLOW_ELEMENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__MONITORING = FLOW_ELEMENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__CATEGORY_VALUE_REF = FLOW_ELEMENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__DATA_STATE = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__ITEM_SUBJECT_REF = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Store Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__DATA_STORE_REF = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Store Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.DefinitionsImpl <em>Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.DefinitionsImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getDefinitions()
	 * @generated
	 */
	int DEFINITIONS = 45;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__IMPORTS = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXTENSIONS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__ROOT_ELEMENTS = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__RELATIONSHIPS = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Exporter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXPORTER = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exporter Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXPORTER_VERSION = BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXPRESSION_LANGUAGE = BASE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__NAME = BASE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__TARGET_NAMESPACE = BASE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__TYPE_LANGUAGE = BASE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.DocumentationImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 46;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__MIXED = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__TEXT = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__TEXT_FORMAT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ThrowEventImpl <em>Throw Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ThrowEventImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getThrowEvent()
	 * @generated
	 */
	int THROW_EVENT = 134;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__EXTENSION_VALUES = EVENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__DOCUMENTATION = EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__EXTENSION_DEFINITIONS = EVENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__ANY_ATTRIBUTE = EVENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__AUDITING = EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__MONITORING = EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__CATEGORY_VALUE_REF = EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__INCOMING = EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__LANES = EVENT__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__OUTGOING = EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__INCOMING_CONVERSATION_LINKS = EVENT__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__OUTGOING_CONVERSATION_LINKS = EVENT__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__PROPERTIES = EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__DATA_INPUTS = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__DATA_INPUT_ASSOCIATION = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__INPUT_SET = EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__EVENT_DEFINITIONS = EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Event Definition Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__EVENT_DEFINITION_REFS = EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Throw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.EndEventImpl <em>End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.EndEventImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getEndEvent()
	 * @generated
	 */
	int END_EVENT = 47;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__EXTENSION_VALUES = THROW_EVENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__DOCUMENTATION = THROW_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__EXTENSION_DEFINITIONS = THROW_EVENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__ID = THROW_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__ANY_ATTRIBUTE = THROW_EVENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__AUDITING = THROW_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__MONITORING = THROW_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__CATEGORY_VALUE_REF = THROW_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__NAME = THROW_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__INCOMING = THROW_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__LANES = THROW_EVENT__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__OUTGOING = THROW_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__INCOMING_CONVERSATION_LINKS = THROW_EVENT__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__OUTGOING_CONVERSATION_LINKS = THROW_EVENT__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__PROPERTIES = THROW_EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__DATA_INPUTS = THROW_EVENT__DATA_INPUTS;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__DATA_INPUT_ASSOCIATION = THROW_EVENT__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__INPUT_SET = THROW_EVENT__INPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__EVENT_DEFINITIONS = THROW_EVENT__EVENT_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Event Definition Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__EVENT_DEFINITION_REFS = THROW_EVENT__EVENT_DEFINITION_REFS;

	/**
	 * The number of structural features of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_FEATURE_COUNT = THROW_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.EndPointImpl <em>End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.EndPointImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getEndPoint()
	 * @generated
	 */
	int END_POINT = 48;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ErrorImpl <em>Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ErrorImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getError()
	 * @generated
	 */
	int ERROR = 49;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__ERROR_CODE = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__NAME = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Structure Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__STRUCTURE_REF = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ErrorEventDefinitionImpl <em>Error Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ErrorEventDefinitionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getErrorEventDefinition()
	 * @generated
	 */
	int ERROR_EVENT_DEFINITION = 50;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Error Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_DEFINITION__ERROR_REF = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.EscalationImpl <em>Escalation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.EscalationImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getEscalation()
	 * @generated
	 */
	int ESCALATION = 51;

	/**
	 * The feature id for the '<em><b>Escalation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION__ESCALATION_CODE = BPMN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION__NAME = BPMN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Structure Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION__STRUCTURE_REF = BPMN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Escalation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_FEATURE_COUNT = BPMN_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.EscalationEventDefinitionImpl <em>Escalation Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.EscalationEventDefinitionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getEscalationEventDefinition()
	 * @generated
	 */
	int ESCALATION_EVENT_DEFINITION = 52;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Escalation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_EVENT_DEFINITION__ESCALATION_REF = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Escalation Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.EventBasedGatewayImpl <em>Event Based Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.EventBasedGatewayImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getEventBasedGateway()
	 * @generated
	 */
	int EVENT_BASED_GATEWAY = 54;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__EXTENSION_VALUES = GATEWAY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__DOCUMENTATION = GATEWAY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__EXTENSION_DEFINITIONS = GATEWAY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__ID = GATEWAY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__ANY_ATTRIBUTE = GATEWAY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__AUDITING = GATEWAY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__MONITORING = GATEWAY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__CATEGORY_VALUE_REF = GATEWAY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__LANES = GATEWAY__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

	/**
	 * The feature id for the '<em><b>Event Gateway Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instantiate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__INSTANTIATE = GATEWAY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Based Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ExclusiveGatewayImpl <em>Exclusive Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ExclusiveGatewayImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getExclusiveGateway()
	 * @generated
	 */
	int EXCLUSIVE_GATEWAY = 56;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__EXTENSION_VALUES = GATEWAY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__DOCUMENTATION = GATEWAY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__EXTENSION_DEFINITIONS = GATEWAY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__ID = GATEWAY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__ANY_ATTRIBUTE = GATEWAY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__AUDITING = GATEWAY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__MONITORING = GATEWAY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__CATEGORY_VALUE_REF = GATEWAY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__LANES = GATEWAY__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__DEFAULT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ExpressionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 57;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ExtensionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 58;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__DEFINITION = BPMN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Must Understand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__MUST_UNDERSTAND = BPMN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xsd Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__XSD_DEFINITION = BPMN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = BPMN_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ExtensionAttributeDefinitionImpl <em>Extension Attribute Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ExtensionAttributeDefinitionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getExtensionAttributeDefinition()
	 * @generated
	 */
	int EXTENSION_ATTRIBUTE_DEFINITION = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_DEFINITION__NAME = BPMN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_DEFINITION__TYPE = BPMN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE = BPMN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extension Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION = BPMN_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Extension Attribute Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_DEFINITION_FEATURE_COUNT = BPMN_BASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ExtensionAttributeValueImpl <em>Extension Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ExtensionAttributeValueImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getExtensionAttributeValue()
	 * @generated
	 */
	int EXTENSION_ATTRIBUTE_VALUE = 60;

	/**
	 * The feature id for the '<em><b>Value Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_VALUE__VALUE_REF = BPMN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_VALUE__VALUE = BPMN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extension Attribute Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION = BPMN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Extension Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_VALUE_FEATURE_COUNT = BPMN_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ExtensionDefinitionImpl <em>Extension Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ExtensionDefinitionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getExtensionDefinition()
	 * @generated
	 */
	int EXTENSION_DEFINITION = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_DEFINITION__NAME = BPMN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension Attribute Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_DEFINITION__EXTENSION_ATTRIBUTE_DEFINITIONS = BPMN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extension Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_DEFINITION_FEATURE_COUNT = BPMN_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.FlowElementsContainerImpl <em>Flow Elements Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.FlowElementsContainerImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getFlowElementsContainer()
	 * @generated
	 */
	int FLOW_ELEMENTS_CONTAINER = 63;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Lane Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__LANE_SETS = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow Elements Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.FormalExpressionImpl <em>Formal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.FormalExpressionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getFormalExpression()
	 * @generated
	 */
	int FORMAL_EXPRESSION = 65;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION__EXTENSION_VALUES = EXPRESSION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION__DOCUMENTATION = EXPRESSION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION__EXTENSION_DEFINITIONS = EXPRESSION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION__ANY_ATTRIBUTE = EXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION__MIXED = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION__BODY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Evaluates To Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION__LANGUAGE = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Formal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.GlobalTaskImpl <em>Global Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.GlobalTaskImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getGlobalTask()
	 * @generated
	 */
	int GLOBAL_TASK = 72;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__EXTENSION_VALUES = CALLABLE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__DOCUMENTATION = CALLABLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__EXTENSION_DEFINITIONS = CALLABLE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__ID = CALLABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__ANY_ATTRIBUTE = CALLABLE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Supported Interface Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__SUPPORTED_INTERFACE_REFS = CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__IO_SPECIFICATION = CALLABLE_ELEMENT__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__IO_BINDING = CALLABLE_ELEMENT__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__NAME = CALLABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__RESOURCES = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.GlobalBusinessRuleTaskImpl <em>Global Business Rule Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.GlobalBusinessRuleTaskImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getGlobalBusinessRuleTask()
	 * @generated
	 */
	int GLOBAL_BUSINESS_RULE_TASK = 67;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__EXTENSION_VALUES = GLOBAL_TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__DOCUMENTATION = GLOBAL_TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__EXTENSION_DEFINITIONS = GLOBAL_TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__ID = GLOBAL_TASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__ANY_ATTRIBUTE = GLOBAL_TASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Supported Interface Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__SUPPORTED_INTERFACE_REFS = GLOBAL_TASK__SUPPORTED_INTERFACE_REFS;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__IO_SPECIFICATION = GLOBAL_TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__IO_BINDING = GLOBAL_TASK__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__NAME = GLOBAL_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__RESOURCES = GLOBAL_TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__IMPLEMENTATION = GLOBAL_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Business Rule Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK_FEATURE_COUNT = GLOBAL_TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.GlobalChoreographyTaskImpl <em>Global Choreography Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.GlobalChoreographyTaskImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getGlobalChoreographyTask()
	 * @generated
	 */
	int GLOBAL_CHOREOGRAPHY_TASK = 68;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__EXTENSION_VALUES = CHOREOGRAPHY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__DOCUMENTATION = CHOREOGRAPHY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__EXTENSION_DEFINITIONS = CHOREOGRAPHY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__ID = CHOREOGRAPHY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__ANY_ATTRIBUTE = CHOREOGRAPHY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__PARTICIPANTS = CHOREOGRAPHY__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Message Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOWS = CHOREOGRAPHY__MESSAGE_FLOWS;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__ARTIFACTS = CHOREOGRAPHY__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Conversations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__CONVERSATIONS = CHOREOGRAPHY__CONVERSATIONS;

	/**
	 * The feature id for the '<em><b>Conversation Associations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__CONVERSATION_ASSOCIATIONS = CHOREOGRAPHY__CONVERSATION_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Participant Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__PARTICIPANT_ASSOCIATIONS = CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Message Flow Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOW_ASSOCIATIONS = CHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__CORRELATION_KEYS = CHOREOGRAPHY__CORRELATION_KEYS;

	/**
	 * The feature id for the '<em><b>Choreography Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__CHOREOGRAPHY_REF = CHOREOGRAPHY__CHOREOGRAPHY_REF;

	/**
	 * The feature id for the '<em><b>Conversation Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__CONVERSATION_LINKS = CHOREOGRAPHY__CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__IS_CLOSED = CHOREOGRAPHY__IS_CLOSED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__NAME = CHOREOGRAPHY__NAME;

	/**
	 * The feature id for the '<em><b>Lane Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__LANE_SETS = CHOREOGRAPHY__LANE_SETS;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__FLOW_ELEMENTS = CHOREOGRAPHY__FLOW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Initiating Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF = CHOREOGRAPHY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Choreography Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK_FEATURE_COUNT = CHOREOGRAPHY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.GlobalConversationImpl <em>Global Conversation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.GlobalConversationImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getGlobalConversation()
	 * @generated
	 */
	int GLOBAL_CONVERSATION = 69;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__EXTENSION_VALUES = COLLABORATION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__DOCUMENTATION = COLLABORATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__EXTENSION_DEFINITIONS = COLLABORATION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__ID = COLLABORATION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__ANY_ATTRIBUTE = COLLABORATION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__PARTICIPANTS = COLLABORATION__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Message Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__MESSAGE_FLOWS = COLLABORATION__MESSAGE_FLOWS;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__ARTIFACTS = COLLABORATION__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Conversations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__CONVERSATIONS = COLLABORATION__CONVERSATIONS;

	/**
	 * The feature id for the '<em><b>Conversation Associations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__CONVERSATION_ASSOCIATIONS = COLLABORATION__CONVERSATION_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Participant Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__PARTICIPANT_ASSOCIATIONS = COLLABORATION__PARTICIPANT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Message Flow Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__MESSAGE_FLOW_ASSOCIATIONS = COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__CORRELATION_KEYS = COLLABORATION__CORRELATION_KEYS;

	/**
	 * The feature id for the '<em><b>Choreography Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__CHOREOGRAPHY_REF = COLLABORATION__CHOREOGRAPHY_REF;

	/**
	 * The feature id for the '<em><b>Conversation Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__CONVERSATION_LINKS = COLLABORATION__CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__IS_CLOSED = COLLABORATION__IS_CLOSED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__NAME = COLLABORATION__NAME;

	/**
	 * The number of structural features of the '<em>Global Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION_FEATURE_COUNT = COLLABORATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.GlobalManualTaskImpl <em>Global Manual Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.GlobalManualTaskImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getGlobalManualTask()
	 * @generated
	 */
	int GLOBAL_MANUAL_TASK = 70;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__EXTENSION_VALUES = GLOBAL_TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__DOCUMENTATION = GLOBAL_TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__EXTENSION_DEFINITIONS = GLOBAL_TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__ID = GLOBAL_TASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__ANY_ATTRIBUTE = GLOBAL_TASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Supported Interface Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__SUPPORTED_INTERFACE_REFS = GLOBAL_TASK__SUPPORTED_INTERFACE_REFS;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__IO_SPECIFICATION = GLOBAL_TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__IO_BINDING = GLOBAL_TASK__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__NAME = GLOBAL_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__RESOURCES = GLOBAL_TASK__RESOURCES;

	/**
	 * The number of structural features of the '<em>Global Manual Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK_FEATURE_COUNT = GLOBAL_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.GlobalScriptTaskImpl <em>Global Script Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.GlobalScriptTaskImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getGlobalScriptTask()
	 * @generated
	 */
	int GLOBAL_SCRIPT_TASK = 71;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__EXTENSION_VALUES = GLOBAL_TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__DOCUMENTATION = GLOBAL_TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__EXTENSION_DEFINITIONS = GLOBAL_TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__ID = GLOBAL_TASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__ANY_ATTRIBUTE = GLOBAL_TASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Supported Interface Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__SUPPORTED_INTERFACE_REFS = GLOBAL_TASK__SUPPORTED_INTERFACE_REFS;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__IO_SPECIFICATION = GLOBAL_TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__IO_BINDING = GLOBAL_TASK__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__NAME = GLOBAL_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__RESOURCES = GLOBAL_TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__SCRIPT = GLOBAL_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE = GLOBAL_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Global Script Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK_FEATURE_COUNT = GLOBAL_TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.GlobalUserTaskImpl <em>Global User Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.GlobalUserTaskImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getGlobalUserTask()
	 * @generated
	 */
	int GLOBAL_USER_TASK = 73;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__EXTENSION_VALUES = GLOBAL_TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__DOCUMENTATION = GLOBAL_TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__EXTENSION_DEFINITIONS = GLOBAL_TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__ID = GLOBAL_TASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__ANY_ATTRIBUTE = GLOBAL_TASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Supported Interface Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__SUPPORTED_INTERFACE_REFS = GLOBAL_TASK__SUPPORTED_INTERFACE_REFS;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__IO_SPECIFICATION = GLOBAL_TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__IO_BINDING = GLOBAL_TASK__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__NAME = GLOBAL_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__RESOURCES = GLOBAL_TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Renderings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__RENDERINGS = GLOBAL_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__IMPLEMENTATION = GLOBAL_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Global User Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK_FEATURE_COUNT = GLOBAL_TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.GroupImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 74;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__EXTENSION_VALUES = ARTIFACT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DOCUMENTATION = ARTIFACT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__EXTENSION_DEFINITIONS = ARTIFACT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = ARTIFACT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ANY_ATTRIBUTE = ARTIFACT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CATEGORY_VALUE_REF = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ResourceRoleImpl <em>Resource Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ResourceRoleImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getResourceRole()
	 * @generated
	 */
	int RESOURCE_ROLE = 118;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__RESOURCE_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__NAME = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resource Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.PerformerImpl <em>Performer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.PerformerImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getPerformer()
	 * @generated
	 */
	int PERFORMER = 107;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__EXTENSION_VALUES = RESOURCE_ROLE__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__DOCUMENTATION = RESOURCE_ROLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__EXTENSION_DEFINITIONS = RESOURCE_ROLE__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__ID = RESOURCE_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__ANY_ATTRIBUTE = RESOURCE_ROLE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__RESOURCE_REF = RESOURCE_ROLE__RESOURCE_REF;

	/**
	 * The feature id for the '<em><b>Resource Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__RESOURCE_PARAMETER_BINDINGS = RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS;

	/**
	 * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION = RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__NAME = RESOURCE_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER_FEATURE_COUNT = RESOURCE_ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.HumanPerformerImpl <em>Human Performer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.HumanPerformerImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getHumanPerformer()
	 * @generated
	 */
	int HUMAN_PERFORMER = 75;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__EXTENSION_VALUES = PERFORMER__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__DOCUMENTATION = PERFORMER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__EXTENSION_DEFINITIONS = PERFORMER__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__ID = PERFORMER__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__ANY_ATTRIBUTE = PERFORMER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__RESOURCE_REF = PERFORMER__RESOURCE_REF;

	/**
	 * The feature id for the '<em><b>Resource Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__RESOURCE_PARAMETER_BINDINGS = PERFORMER__RESOURCE_PARAMETER_BINDINGS;

	/**
	 * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION = PERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__NAME = PERFORMER__NAME;

	/**
	 * The number of structural features of the '<em>Human Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER_FEATURE_COUNT = PERFORMER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ImplicitThrowEventImpl <em>Implicit Throw Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ImplicitThrowEventImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getImplicitThrowEvent()
	 * @generated
	 */
	int IMPLICIT_THROW_EVENT = 76;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__EXTENSION_VALUES = THROW_EVENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__DOCUMENTATION = THROW_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__EXTENSION_DEFINITIONS = THROW_EVENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__ID = THROW_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__ANY_ATTRIBUTE = THROW_EVENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__AUDITING = THROW_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__MONITORING = THROW_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__CATEGORY_VALUE_REF = THROW_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__NAME = THROW_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__INCOMING = THROW_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__LANES = THROW_EVENT__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__OUTGOING = THROW_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__INCOMING_CONVERSATION_LINKS = THROW_EVENT__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__OUTGOING_CONVERSATION_LINKS = THROW_EVENT__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__PROPERTIES = THROW_EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__DATA_INPUTS = THROW_EVENT__DATA_INPUTS;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__DATA_INPUT_ASSOCIATION = THROW_EVENT__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__INPUT_SET = THROW_EVENT__INPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__EVENT_DEFINITIONS = THROW_EVENT__EVENT_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Event Definition Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__EVENT_DEFINITION_REFS = THROW_EVENT__EVENT_DEFINITION_REFS;

	/**
	 * The number of structural features of the '<em>Implicit Throw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT_FEATURE_COUNT = THROW_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ImportImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 77;

	/**
	 * The feature id for the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_TYPE = BPMN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__LOCATION = BPMN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAMESPACE = BPMN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = BPMN_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.InclusiveGatewayImpl <em>Inclusive Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.InclusiveGatewayImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getInclusiveGateway()
	 * @generated
	 */
	int INCLUSIVE_GATEWAY = 78;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__EXTENSION_VALUES = GATEWAY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__DOCUMENTATION = GATEWAY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__EXTENSION_DEFINITIONS = GATEWAY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__ID = GATEWAY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__ANY_ATTRIBUTE = GATEWAY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__AUDITING = GATEWAY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__MONITORING = GATEWAY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__CATEGORY_VALUE_REF = GATEWAY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__LANES = GATEWAY__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__DEFAULT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.InputOutputBindingImpl <em>Input Output Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.InputOutputBindingImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getInputOutputBinding()
	 * @generated
	 */
	int INPUT_OUTPUT_BINDING = 79;

	/**
	 * The feature id for the '<em><b>Input Data Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_BINDING__INPUT_DATA_REF = BPMN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_BINDING__OPERATION_REF = BPMN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Data Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF = BPMN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input Output Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_BINDING_FEATURE_COUNT = BPMN_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.InputOutputSpecificationImpl <em>Input Output Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.InputOutputSpecificationImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getInputOutputSpecification()
	 * @generated
	 */
	int INPUT_OUTPUT_SPECIFICATION = 80;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Data Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__INPUT_SETS = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Input Output Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.InputSetImpl <em>Input Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.InputSetImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getInputSet()
	 * @generated
	 */
	int INPUT_SET = 81;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Data Input Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__DATA_INPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional Input Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__OPTIONAL_INPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>While Executing Input Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__WHILE_EXECUTING_INPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Set Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__OUTPUT_SET_REFS = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__NAME = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Input Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.InteractionNodeImpl <em>Interaction Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.InteractionNodeImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getInteractionNode()
	 * @generated
	 */
	int INTERACTION_NODE = 82;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_NODE__INCOMING_CONVERSATION_LINKS = BPMN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS = BPMN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interaction Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_NODE_FEATURE_COUNT = BPMN_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.InterfaceImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 83;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OPERATIONS = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__IMPLEMENTATION_REF = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.IntermediateCatchEventImpl <em>Intermediate Catch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.IntermediateCatchEventImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getIntermediateCatchEvent()
	 * @generated
	 */
	int INTERMEDIATE_CATCH_EVENT = 84;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__EXTENSION_VALUES = CATCH_EVENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__DOCUMENTATION = CATCH_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__EXTENSION_DEFINITIONS = CATCH_EVENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__ID = CATCH_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__ANY_ATTRIBUTE = CATCH_EVENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__AUDITING = CATCH_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__MONITORING = CATCH_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__CATEGORY_VALUE_REF = CATCH_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__NAME = CATCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__INCOMING = CATCH_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__LANES = CATCH_EVENT__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__OUTGOING = CATCH_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__INCOMING_CONVERSATION_LINKS = CATCH_EVENT__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__OUTGOING_CONVERSATION_LINKS = CATCH_EVENT__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__PROPERTIES = CATCH_EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__DATA_OUTPUTS = CATCH_EVENT__DATA_OUTPUTS;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__DATA_OUTPUT_ASSOCIATION = CATCH_EVENT__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__OUTPUT_SET = CATCH_EVENT__OUTPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__EVENT_DEFINITIONS = CATCH_EVENT__EVENT_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Event Definition Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__EVENT_DEFINITION_REFS = CATCH_EVENT__EVENT_DEFINITION_REFS;

	/**
	 * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__PARALLEL_MULTIPLE = CATCH_EVENT__PARALLEL_MULTIPLE;

	/**
	 * The number of structural features of the '<em>Intermediate Catch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.IntermediateThrowEventImpl <em>Intermediate Throw Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.IntermediateThrowEventImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getIntermediateThrowEvent()
	 * @generated
	 */
	int INTERMEDIATE_THROW_EVENT = 85;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__EXTENSION_VALUES = THROW_EVENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__DOCUMENTATION = THROW_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__EXTENSION_DEFINITIONS = THROW_EVENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__ID = THROW_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__ANY_ATTRIBUTE = THROW_EVENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__AUDITING = THROW_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__MONITORING = THROW_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__CATEGORY_VALUE_REF = THROW_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__NAME = THROW_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__INCOMING = THROW_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__LANES = THROW_EVENT__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__OUTGOING = THROW_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__INCOMING_CONVERSATION_LINKS = THROW_EVENT__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__OUTGOING_CONVERSATION_LINKS = THROW_EVENT__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__PROPERTIES = THROW_EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__DATA_INPUTS = THROW_EVENT__DATA_INPUTS;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__DATA_INPUT_ASSOCIATION = THROW_EVENT__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__INPUT_SET = THROW_EVENT__INPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__EVENT_DEFINITIONS = THROW_EVENT__EVENT_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Event Definition Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__EVENT_DEFINITION_REFS = THROW_EVENT__EVENT_DEFINITION_REFS;

	/**
	 * The number of structural features of the '<em>Intermediate Throw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_FEATURE_COUNT = THROW_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ItemDefinitionImpl <em>Item Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ItemDefinitionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getItemDefinition()
	 * @generated
	 */
	int ITEM_DEFINITION = 87;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__IS_COLLECTION = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__IMPORT = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Item Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__ITEM_KIND = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Structure Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__STRUCTURE_REF = ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Item Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.LaneImpl <em>Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.LaneImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getLane()
	 * @generated
	 */
	int LANE = 88;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Partition Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__PARTITION_ELEMENT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow Node Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__FLOW_NODE_REFS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child Lane Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__CHILD_LANE_SET = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__NAME = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Partition Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__PARTITION_ELEMENT_REF = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.LaneSetImpl <em>Lane Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.LaneSetImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getLaneSet()
	 * @generated
	 */
	int LANE_SET = 89;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET__LANES = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET__NAME = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lane Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.LinkEventDefinitionImpl <em>Link Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.LinkEventDefinitionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getLinkEventDefinition()
	 * @generated
	 */
	int LINK_EVENT_DEFINITION = 90;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION__SOURCE = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION__TARGET = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION__NAME = EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.LoopCharacteristicsImpl <em>Loop Characteristics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.LoopCharacteristicsImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getLoopCharacteristics()
	 * @generated
	 */
	int LOOP_CHARACTERISTICS = 91;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CHARACTERISTICS__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CHARACTERISTICS__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CHARACTERISTICS__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CHARACTERISTICS__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CHARACTERISTICS__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Loop Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CHARACTERISTICS_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ManualTaskImpl <em>Manual Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ManualTaskImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getManualTask()
	 * @generated
	 */
	int MANUAL_TASK = 92;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__EXTENSION_VALUES = TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__EXTENSION_DEFINITIONS = TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__AUDITING = TASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__MONITORING = TASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__LANES = TASK__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__BOUNDARY_EVENT_REFS = TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__PROPERTIES = TASK__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__DEFAULT = TASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__START_QUANTITY = TASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The number of structural features of the '<em>Manual Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.MessageImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 93;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Item Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ITEM_REF = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.MessageEventDefinitionImpl <em>Message Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.MessageEventDefinitionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getMessageEventDefinition()
	 * @generated
	 */
	int MESSAGE_EVENT_DEFINITION = 94;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_DEFINITION__OPERATION_REF = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_DEFINITION__MESSAGE_REF = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.MessageFlowImpl <em>Message Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.MessageFlowImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getMessageFlow()
	 * @generated
	 */
	int MESSAGE_FLOW = 95;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__MESSAGE_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__NAME = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__SOURCE_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__TARGET_REF = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Message Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.MessageFlowAssociationImpl <em>Message Flow Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.MessageFlowAssociationImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getMessageFlowAssociation()
	 * @generated
	 */
	int MESSAGE_FLOW_ASSOCIATION = 96;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_ASSOCIATION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_ASSOCIATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_ASSOCIATION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_ASSOCIATION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_ASSOCIATION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Inner Message Flow Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Message Flow Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Flow Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_ASSOCIATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.MonitoringImpl <em>Monitoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.MonitoringImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getMonitoring()
	 * @generated
	 */
	int MONITORING = 97;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Monitoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.MultiInstanceLoopCharacteristicsImpl <em>Multi Instance Loop Characteristics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.MultiInstanceLoopCharacteristicsImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS = 98;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__EXTENSION_VALUES = LOOP_CHARACTERISTICS__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__DOCUMENTATION = LOOP_CHARACTERISTICS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__EXTENSION_DEFINITIONS = LOOP_CHARACTERISTICS__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__ID = LOOP_CHARACTERISTICS__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__ANY_ATTRIBUTE = LOOP_CHARACTERISTICS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Loop Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY = LOOP_CHARACTERISTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Data Input Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF = LOOP_CHARACTERISTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loop Data Output Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF = LOOP_CHARACTERISTICS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Data Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM = LOOP_CHARACTERISTICS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output Data Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM = LOOP_CHARACTERISTICS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Complex Behavior Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION = LOOP_CHARACTERISTICS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Completion Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION = LOOP_CHARACTERISTICS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR = LOOP_CHARACTERISTICS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Sequential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL = LOOP_CHARACTERISTICS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>None Behavior Event Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF = LOOP_CHARACTERISTICS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>One Behavior Event Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF = LOOP_CHARACTERISTICS_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Multi Instance Loop Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS_FEATURE_COUNT = LOOP_CHARACTERISTICS_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.OperationImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 99;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>In Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IN_MESSAGE_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OUT_MESSAGE_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ERROR_REFS = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IMPLEMENTATION_REF = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.OutputSetImpl <em>Output Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.OutputSetImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getOutputSet()
	 * @generated
	 */
	int OUTPUT_SET = 100;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Data Output Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__DATA_OUTPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional Output Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__OPTIONAL_OUTPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>While Executing Output Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Set Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__INPUT_SET_REFS = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__NAME = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Output Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ParallelGatewayImpl <em>Parallel Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ParallelGatewayImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getParallelGateway()
	 * @generated
	 */
	int PARALLEL_GATEWAY = 101;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__EXTENSION_VALUES = GATEWAY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__DOCUMENTATION = GATEWAY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__EXTENSION_DEFINITIONS = GATEWAY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__ID = GATEWAY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__ANY_ATTRIBUTE = GATEWAY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__AUDITING = GATEWAY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__MONITORING = GATEWAY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__CATEGORY_VALUE_REF = GATEWAY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__LANES = GATEWAY__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

	/**
	 * The number of structural features of the '<em>Parallel Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ParticipantImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 102;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__INCOMING_CONVERSATION_LINKS = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__OUTGOING_CONVERSATION_LINKS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__INTERFACE_REFS = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Point Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__END_POINT_REFS = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Participant Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__PARTICIPANT_MULTIPLICITY = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NAME = BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Process Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__PROCESS_REF = BASE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ParticipantAssociationImpl <em>Participant Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ParticipantAssociationImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getParticipantAssociation()
	 * @generated
	 */
	int PARTICIPANT_ASSOCIATION = 103;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ASSOCIATION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ASSOCIATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ASSOCIATION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ASSOCIATION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ASSOCIATION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Inner Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Participant Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ASSOCIATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ParticipantMultiplicityImpl <em>Participant Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ParticipantMultiplicityImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getParticipantMultiplicity()
	 * @generated
	 */
	int PARTICIPANT_MULTIPLICITY = 104;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_MULTIPLICITY__MAXIMUM = BPMN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_MULTIPLICITY__MINIMUM = BPMN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Participant Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_MULTIPLICITY_FEATURE_COUNT = BPMN_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.PartnerEntityImpl <em>Partner Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.PartnerEntityImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getPartnerEntity()
	 * @generated
	 */
	int PARTNER_ENTITY = 105;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ENTITY__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ENTITY__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ENTITY__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ENTITY__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ENTITY__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Participant Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ENTITY__PARTICIPANT_REF = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ENTITY__NAME = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Partner Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ENTITY_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.PartnerRoleImpl <em>Partner Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.PartnerRoleImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getPartnerRole()
	 * @generated
	 */
	int PARTNER_ROLE = 106;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ROLE__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ROLE__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ROLE__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ROLE__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ROLE__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Participant Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ROLE__PARTICIPANT_REF = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ROLE__NAME = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Partner Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ROLE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.PotentialOwnerImpl <em>Potential Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.PotentialOwnerImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getPotentialOwner()
	 * @generated
	 */
	int POTENTIAL_OWNER = 108;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__EXTENSION_VALUES = HUMAN_PERFORMER__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__DOCUMENTATION = HUMAN_PERFORMER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__EXTENSION_DEFINITIONS = HUMAN_PERFORMER__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__ID = HUMAN_PERFORMER__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__ANY_ATTRIBUTE = HUMAN_PERFORMER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__RESOURCE_REF = HUMAN_PERFORMER__RESOURCE_REF;

	/**
	 * The feature id for the '<em><b>Resource Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__RESOURCE_PARAMETER_BINDINGS = HUMAN_PERFORMER__RESOURCE_PARAMETER_BINDINGS;

	/**
	 * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__RESOURCE_ASSIGNMENT_EXPRESSION = HUMAN_PERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__NAME = HUMAN_PERFORMER__NAME;

	/**
	 * The number of structural features of the '<em>Potential Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER_FEATURE_COUNT = HUMAN_PERFORMER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ProcessImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 109;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXTENSION_VALUES = CALLABLE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DOCUMENTATION = CALLABLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXTENSION_DEFINITIONS = CALLABLE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ID = CALLABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ANY_ATTRIBUTE = CALLABLE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Supported Interface Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUPPORTED_INTERFACE_REFS = CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IO_SPECIFICATION = CALLABLE_ELEMENT__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IO_BINDING = CALLABLE_ELEMENT__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = CALLABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Lane Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__LANE_SETS = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FLOW_ELEMENTS = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__AUDITING = CALLABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MONITORING = CALLABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROPERTIES = CALLABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ARTIFACTS = CALLABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RESOURCES = CALLABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Correlation Subscriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CORRELATION_SUBSCRIPTIONS = CALLABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Supports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUPPORTS = CALLABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Definitional Collaboration Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DEFINITIONAL_COLLABORATION_REF = CALLABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_CLOSED = CALLABLE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_EXECUTABLE = CALLABLE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Process Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROCESS_TYPE = CALLABLE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.PropertyImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 110;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__EXTENSION_VALUES = ITEM_AWARE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DOCUMENTATION = ITEM_AWARE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__EXTENSION_DEFINITIONS = ITEM_AWARE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID = ITEM_AWARE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ANY_ATTRIBUTE = ITEM_AWARE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DATA_STATE = ITEM_AWARE_ELEMENT__DATA_STATE;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ITEM_SUBJECT_REF = ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ReceiveTaskImpl <em>Receive Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ReceiveTaskImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getReceiveTask()
	 * @generated
	 */
	int RECEIVE_TASK = 111;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__EXTENSION_VALUES = TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__EXTENSION_DEFINITIONS = TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__AUDITING = TASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__MONITORING = TASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__LANES = TASK__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__BOUNDARY_EVENT_REFS = TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__PROPERTIES = TASK__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__DEFAULT = TASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__START_QUANTITY = TASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__IMPLEMENTATION = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instantiate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__INSTANTIATE = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__MESSAGE_REF = TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__OPERATION_REF = TASK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Receive Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.RelationshipImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 112;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCES = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGETS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DIRECTION = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TYPE = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.RenderingImpl <em>Rendering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.RenderingImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getRendering()
	 * @generated
	 */
	int RENDERING = 113;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Rendering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ResourceImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 114;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Resource Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCE_PARAMETERS = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ResourceAssignmentExpressionImpl <em>Resource Assignment Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ResourceAssignmentExpressionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getResourceAssignmentExpression()
	 * @generated
	 */
	int RESOURCE_ASSIGNMENT_EXPRESSION = 115;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION = BPMN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Assignment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = BPMN_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ResourceParameterImpl <em>Resource Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ResourceParameterImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getResourceParameter()
	 * @generated
	 */
	int RESOURCE_PARAMETER = 116;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER__IS_REQUIRED = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER__NAME = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER__TYPE = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ResourceParameterBindingImpl <em>Resource Parameter Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ResourceParameterBindingImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getResourceParameterBinding()
	 * @generated
	 */
	int RESOURCE_PARAMETER_BINDING = 117;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER_BINDING__EXPRESSION = BPMN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER_BINDING__PARAMETER_REF = BPMN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER_BINDING_FEATURE_COUNT = BPMN_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ScriptTaskImpl <em>Script Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ScriptTaskImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getScriptTask()
	 * @generated
	 */
	int SCRIPT_TASK = 120;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__EXTENSION_VALUES = TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__EXTENSION_DEFINITIONS = TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__AUDITING = TASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__MONITORING = TASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__LANES = TASK__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__BOUNDARY_EVENT_REFS = TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__PROPERTIES = TASK__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__DEFAULT = TASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__START_QUANTITY = TASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__SCRIPT = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__SCRIPT_FORMAT = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Script Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.SendTaskImpl <em>Send Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.SendTaskImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getSendTask()
	 * @generated
	 */
	int SEND_TASK = 121;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__EXTENSION_VALUES = TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__EXTENSION_DEFINITIONS = TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__AUDITING = TASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__MONITORING = TASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__LANES = TASK__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__BOUNDARY_EVENT_REFS = TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__PROPERTIES = TASK__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__DEFAULT = TASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__START_QUANTITY = TASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__IMPLEMENTATION = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__MESSAGE_REF = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__OPERATION_REF = TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Send Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.SequenceFlowImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getSequenceFlow()
	 * @generated
	 */
	int SEQUENCE_FLOW = 122;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__EXTENSION_VALUES = FLOW_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__EXTENSION_DEFINITIONS = FLOW_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__ID = FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__ANY_ATTRIBUTE = FLOW_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__AUDITING = FLOW_ELEMENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__MONITORING = FLOW_ELEMENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__CATEGORY_VALUE_REF = FLOW_ELEMENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__CONDITION_EXPRESSION = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__IS_IMMEDIATE = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__SOURCE_REF = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__TARGET_REF = FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.ServiceTaskImpl <em>Service Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.ServiceTaskImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getServiceTask()
	 * @generated
	 */
	int SERVICE_TASK = 123;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__EXTENSION_VALUES = TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__EXTENSION_DEFINITIONS = TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__AUDITING = TASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__MONITORING = TASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__LANES = TASK__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__BOUNDARY_EVENT_REFS = TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__PROPERTIES = TASK__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__DEFAULT = TASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__START_QUANTITY = TASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__IMPLEMENTATION = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__OPERATION_REF = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.SignalImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 124;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Structure Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__STRUCTURE_REF = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.SignalEventDefinitionImpl <em>Signal Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.SignalEventDefinitionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getSignalEventDefinition()
	 * @generated
	 */
	int SIGNAL_EVENT_DEFINITION = 125;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Signal Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_DEFINITION__SIGNAL_REF = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signal Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.StandardLoopCharacteristicsImpl <em>Standard Loop Characteristics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.StandardLoopCharacteristicsImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getStandardLoopCharacteristics()
	 * @generated
	 */
	int STANDARD_LOOP_CHARACTERISTICS = 126;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS__EXTENSION_VALUES = LOOP_CHARACTERISTICS__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS__DOCUMENTATION = LOOP_CHARACTERISTICS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS__EXTENSION_DEFINITIONS = LOOP_CHARACTERISTICS__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS__ID = LOOP_CHARACTERISTICS__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS__ANY_ATTRIBUTE = LOOP_CHARACTERISTICS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION = LOOP_CHARACTERISTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM = LOOP_CHARACTERISTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE = LOOP_CHARACTERISTICS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Standard Loop Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS_FEATURE_COUNT = LOOP_CHARACTERISTICS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.StartEventImpl <em>Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.StartEventImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getStartEvent()
	 * @generated
	 */
	int START_EVENT = 127;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__EXTENSION_VALUES = CATCH_EVENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__DOCUMENTATION = CATCH_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__EXTENSION_DEFINITIONS = CATCH_EVENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__ID = CATCH_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__ANY_ATTRIBUTE = CATCH_EVENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__AUDITING = CATCH_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__MONITORING = CATCH_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__CATEGORY_VALUE_REF = CATCH_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__NAME = CATCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__INCOMING = CATCH_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__LANES = CATCH_EVENT__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__OUTGOING = CATCH_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__INCOMING_CONVERSATION_LINKS = CATCH_EVENT__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__OUTGOING_CONVERSATION_LINKS = CATCH_EVENT__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__PROPERTIES = CATCH_EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__DATA_OUTPUTS = CATCH_EVENT__DATA_OUTPUTS;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__DATA_OUTPUT_ASSOCIATION = CATCH_EVENT__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__OUTPUT_SET = CATCH_EVENT__OUTPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__EVENT_DEFINITIONS = CATCH_EVENT__EVENT_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Event Definition Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__EVENT_DEFINITION_REFS = CATCH_EVENT__EVENT_DEFINITION_REFS;

	/**
	 * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__PARALLEL_MULTIPLE = CATCH_EVENT__PARALLEL_MULTIPLE;

	/**
	 * The feature id for the '<em><b>Is Interrupting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__IS_INTERRUPTING = CATCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.SubChoreographyImpl <em>Sub Choreography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.SubChoreographyImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getSubChoreography()
	 * @generated
	 */
	int SUB_CHOREOGRAPHY = 128;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__EXTENSION_VALUES = CHOREOGRAPHY_ACTIVITY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__DOCUMENTATION = CHOREOGRAPHY_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__EXTENSION_DEFINITIONS = CHOREOGRAPHY_ACTIVITY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__ID = CHOREOGRAPHY_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__ANY_ATTRIBUTE = CHOREOGRAPHY_ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__AUDITING = CHOREOGRAPHY_ACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__MONITORING = CHOREOGRAPHY_ACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__CATEGORY_VALUE_REF = CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__NAME = CHOREOGRAPHY_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__INCOMING = CHOREOGRAPHY_ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__LANES = CHOREOGRAPHY_ACTIVITY__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__OUTGOING = CHOREOGRAPHY_ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__PARTICIPANT_REFS = CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__CORRELATION_KEYS = CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS;

	/**
	 * The feature id for the '<em><b>Initiating Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__INITIATING_PARTICIPANT_REF = CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF;

	/**
	 * The feature id for the '<em><b>Loop Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__LOOP_TYPE = CHOREOGRAPHY_ACTIVITY__LOOP_TYPE;

	/**
	 * The feature id for the '<em><b>Lane Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__LANE_SETS = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__FLOW_ELEMENTS = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__ARTIFACTS = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sub Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY_FEATURE_COUNT = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.SubConversationImpl <em>Sub Conversation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.SubConversationImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getSubConversation()
	 * @generated
	 */
	int SUB_CONVERSATION = 129;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__EXTENSION_VALUES = CONVERSATION_NODE__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__DOCUMENTATION = CONVERSATION_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__EXTENSION_DEFINITIONS = CONVERSATION_NODE__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__ID = CONVERSATION_NODE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__ANY_ATTRIBUTE = CONVERSATION_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__INCOMING_CONVERSATION_LINKS = CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__OUTGOING_CONVERSATION_LINKS = CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__PARTICIPANT_REFS = CONVERSATION_NODE__PARTICIPANT_REFS;

	/**
	 * The feature id for the '<em><b>Message Flow Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__MESSAGE_FLOW_REFS = CONVERSATION_NODE__MESSAGE_FLOW_REFS;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__CORRELATION_KEYS = CONVERSATION_NODE__CORRELATION_KEYS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__NAME = CONVERSATION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Conversation Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__CONVERSATION_NODES = CONVERSATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION_FEATURE_COUNT = CONVERSATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.TerminateEventDefinitionImpl <em>Terminate Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.TerminateEventDefinitionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getTerminateEventDefinition()
	 * @generated
	 */
	int TERMINATE_EVENT_DEFINITION = 132;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Terminate Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.TextAnnotationImpl <em>Text Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.TextAnnotationImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getTextAnnotation()
	 * @generated
	 */
	int TEXT_ANNOTATION = 133;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__EXTENSION_VALUES = ARTIFACT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__DOCUMENTATION = ARTIFACT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__EXTENSION_DEFINITIONS = ARTIFACT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__ID = ARTIFACT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__ANY_ATTRIBUTE = ARTIFACT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__TEXT = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__TEXT_FORMAT = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.TimerEventDefinitionImpl <em>Timer Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.TimerEventDefinitionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getTimerEventDefinition()
	 * @generated
	 */
	int TIMER_EVENT_DEFINITION = 135;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Time Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION__TIME_DATE = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION__TIME_DURATION = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Cycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION__TIME_CYCLE = EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Timer Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.TransactionImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 136;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__EXTENSION_VALUES = SUB_PROCESS__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DOCUMENTATION = SUB_PROCESS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__EXTENSION_DEFINITIONS = SUB_PROCESS__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ID = SUB_PROCESS__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ANY_ATTRIBUTE = SUB_PROCESS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__AUDITING = SUB_PROCESS__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__MONITORING = SUB_PROCESS__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__CATEGORY_VALUE_REF = SUB_PROCESS__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__NAME = SUB_PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__INCOMING = SUB_PROCESS__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__LANES = SUB_PROCESS__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__OUTGOING = SUB_PROCESS__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__IO_SPECIFICATION = SUB_PROCESS__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__BOUNDARY_EVENT_REFS = SUB_PROCESS__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__PROPERTIES = SUB_PROCESS__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DATA_INPUT_ASSOCIATIONS = SUB_PROCESS__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DATA_OUTPUT_ASSOCIATIONS = SUB_PROCESS__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__RESOURCES = SUB_PROCESS__RESOURCES;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__LOOP_CHARACTERISTICS = SUB_PROCESS__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__COMPLETION_QUANTITY = SUB_PROCESS__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DEFAULT = SUB_PROCESS__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__IS_FOR_COMPENSATION = SUB_PROCESS__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__START_QUANTITY = SUB_PROCESS__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Lane Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__LANE_SETS = SUB_PROCESS__LANE_SETS;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__FLOW_ELEMENTS = SUB_PROCESS__FLOW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ARTIFACTS = SUB_PROCESS__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Triggered By Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TRIGGERED_BY_EVENT = SUB_PROCESS__TRIGGERED_BY_EVENT;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__PROTOCOL = SUB_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__METHOD = SUB_PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = SUB_PROCESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.impl.UserTaskImpl <em>User Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.impl.UserTaskImpl
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getUserTask()
	 * @generated
	 */
	int USER_TASK = 137;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__EXTENSION_VALUES = TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__EXTENSION_DEFINITIONS = TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__AUDITING = TASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__MONITORING = TASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__LANES = TASK__LANES;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__BOUNDARY_EVENT_REFS = TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__PROPERTIES = TASK__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__DEFAULT = TASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__START_QUANTITY = TASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Renderings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__RENDERINGS = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__IMPLEMENTATION = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.AdHocOrdering <em>Ad Hoc Ordering</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.AdHocOrdering
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getAdHocOrdering()
	 * @generated
	 */
	int AD_HOC_ORDERING = 139;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.AssociationDirection <em>Association Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.AssociationDirection
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getAssociationDirection()
	 * @generated
	 */
	int ASSOCIATION_DIRECTION = 140;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.ChoreographyLoopType <em>Choreography Loop Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.ChoreographyLoopType
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getChoreographyLoopType()
	 * @generated
	 */
	int CHOREOGRAPHY_LOOP_TYPE = 141;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.EventBasedGatewayType <em>Event Based Gateway Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.EventBasedGatewayType
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getEventBasedGatewayType()
	 * @generated
	 */
	int EVENT_BASED_GATEWAY_TYPE = 142;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.GatewayDirection <em>Gateway Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.GatewayDirection
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getGatewayDirection()
	 * @generated
	 */
	int GATEWAY_DIRECTION = 143;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.ItemKind <em>Item Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.ItemKind
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getItemKind()
	 * @generated
	 */
	int ITEM_KIND = 144;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.MultiInstanceBehavior <em>Multi Instance Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.MultiInstanceBehavior
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getMultiInstanceBehavior()
	 * @generated
	 */
	int MULTI_INSTANCE_BEHAVIOR = 145;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.ProcessType <em>Process Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.ProcessType
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getProcessType()
	 * @generated
	 */
	int PROCESS_TYPE = 146;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.BPMN2Model.RelationshipDirection <em>Relationship Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.BPMN2Model.RelationshipDirection
	 * @see org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl#getRelationshipDirection()
	 * @generated
	 */
	int RELATIONSHIP_DIRECTION = 147;


	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getActivity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getAdHocSubProcess <em>Ad Hoc Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ad Hoc Sub Process</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getAdHocSubProcess()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AdHocSubProcess();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getFlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow Element</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getFlowElement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FlowElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getArtifact()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Artifact();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignment</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getAssignment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Assignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getAssociation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Association();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getAuditing <em>Auditing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditing</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getAuditing()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Auditing();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getBaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Element</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getBaseElement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BaseElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getBaseElementWithMixedContent <em>Base Element With Mixed Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Element With Mixed Content</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getBaseElementWithMixedContent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BaseElementWithMixedContent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getBoundaryEvent <em>Boundary Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boundary Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getBoundaryEvent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BoundaryEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getBusinessRuleTask <em>Business Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Rule Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getBusinessRuleTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BusinessRuleTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCallableElement <em>Callable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Callable Element</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCallableElement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CallableElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCallActivity <em>Call Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Call Activity</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCallActivity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CallActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCallChoreography <em>Call Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Call Choreography</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCallChoreography()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CallChoreography();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCallConversation <em>Call Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Call Conversation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCallConversation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CallConversation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConversationNode <em>Conversation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conversation Node</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConversationNode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConversationNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCancelEventDefinition <em>Cancel Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cancel Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCancelEventDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CancelEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEventDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Element</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getRootElement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RootElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCatchEvent <em>Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catch Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCatchEvent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CatchEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Category</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCategory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Category();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCategoryValue <em>Category Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Category Value</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCategoryValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CategoryValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getChoreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choreography</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getChoreography()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Choreography();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCollaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collaboration</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCollaboration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Collaboration();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getChoreographyActivity <em>Choreography Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choreography Activity</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getChoreographyActivity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChoreographyActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getChoreographyTask <em>Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choreography Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getChoreographyTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChoreographyTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCompensateEventDefinition <em>Compensate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCompensateEventDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CompensateEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Behavior Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getComplexBehaviorDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComplexBehaviorDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getComplexGateway <em>Complex Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Gateway</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getComplexGateway()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComplexGateway();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConditionalEventDefinition <em>Conditional Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditional Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConditionalEventDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConditionalEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConversation <em>Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conversation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConversation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Conversation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConversationAssociation <em>Conversation Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conversation Association</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConversationAssociation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConversationAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConversationLink <em>Conversation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conversation Link</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConversationLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConversationLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationKey <em>Correlation Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Key</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationKey()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CorrelationKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationProperty <em>Correlation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Property</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CorrelationProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Property Binding</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationPropertyBinding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CorrelationPropertyBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Property Retrieval Expression</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationPropertyRetrievalExpression()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CorrelationPropertyRetrievalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationSubscription <em>Correlation Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Subscription</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationSubscription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CorrelationSubscription();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataAssociation <em>Data Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Association</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataAssociation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Input</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataInput()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataInput();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataInputAssociation <em>Data Input Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Input Association</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataInputAssociation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataInputAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Object</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataObjectReference <em>Data Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Object Reference</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataObjectReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataObjectReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataOutput <em>Data Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Output</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataOutput()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataOutput();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataOutputAssociation <em>Data Output Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Output Association</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataOutputAssociation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataOutputAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data State</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataState()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataState();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Store</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataStore()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataStore();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataStoreReference <em>Data Store Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Store Reference</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataStoreReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataStoreReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definitions</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDefinitions()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Definitions();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDocumentation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEndEvent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EndEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Point</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEndPoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EndPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getError()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Error();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getErrorEventDefinition <em>Error Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getErrorEventDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ErrorEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEscalation <em>Escalation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Escalation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEscalation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Escalation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEscalationEventDefinition <em>Escalation Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Escalation Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEscalationEventDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EscalationEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEvent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Event();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEventBasedGateway <em>Event Based Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Based Gateway</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEventBasedGateway()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EventBasedGateway();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getExclusiveGateway <em>Exclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclusive Gateway</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getExclusiveGateway()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExclusiveGateway();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getExpression()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getExtension()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Extension();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getExtensionElements <em>Extension Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Elements</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getExtensionElements()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExtensionElements();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getFlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow Node</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getFlowNode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FlowNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getFormalExpression <em>Formal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formal Expression</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getFormalExpression()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FormalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gateway</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGateway()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Gateway();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalBusinessRuleTask <em>Global Business Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Business Rule Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalBusinessRuleTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GlobalBusinessRuleTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalChoreographyTask <em>Global Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Choreography Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalChoreographyTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GlobalChoreographyTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalConversation <em>Global Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Conversation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalConversation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GlobalConversation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalManualTask <em>Global Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Manual Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalManualTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GlobalManualTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalScriptTask <em>Global Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Script Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalScriptTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GlobalScriptTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalTask <em>Global Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GlobalTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalUserTask <em>Global User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global User Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalUserTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GlobalUserTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Group();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getHumanPerformer <em>Human Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Human Performer</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getHumanPerformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HumanPerformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getPerformer <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Performer</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getPerformer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Performer();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Role</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResourceRole()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResourceRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getImplicitThrowEvent <em>Implicit Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implicit Throw Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getImplicitThrowEvent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ImplicitThrowEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getImport()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Import();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getInclusiveGateway <em>Inclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inclusive Gateway</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getInclusiveGateway()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InclusiveGateway();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getInputSet <em>Input Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Set</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getInputSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InputSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getInterface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Interface();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getIntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intermediate Catch Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getIntermediateCatchEvent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IntermediateCatchEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getIntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intermediate Throw Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getIntermediateThrowEvent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IntermediateThrowEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getIoBinding <em>Io Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Io Binding</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getIoBinding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IoBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getIoSpecification <em>Io Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Io Specification</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getIoSpecification()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IoSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getItemDefinition <em>Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getItemDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ItemDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getLane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lane</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getLane()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Lane();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getLaneSet <em>Lane Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lane Set</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getLaneSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LaneSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getLinkEventDefinition <em>Link Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getLinkEventDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LinkEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getLoopCharacteristics <em>Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Characteristics</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getLoopCharacteristics()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LoopCharacteristics();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getManualTask <em>Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manual Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getManualTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ManualTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMessage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Message();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMessageEventDefinition <em>Message Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMessageEventDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MessageEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMessageFlow <em>Message Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Flow</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMessageFlow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MessageFlow();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMessageFlowAssociation <em>Message Flow Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Flow Association</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMessageFlowAssociation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MessageFlowAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMonitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monitoring</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMonitoring()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Monitoring();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multi Instance Loop Characteristics</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMultiInstanceLoopCharacteristics()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MultiInstanceLoopCharacteristics();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getOperation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getOutputSet <em>Output Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Set</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getOutputSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OutputSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getParallelGateway <em>Parallel Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parallel Gateway</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getParallelGateway()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ParallelGateway();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Participant</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getParticipant()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Participant();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getParticipantAssociation <em>Participant Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Participant Association</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getParticipantAssociation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ParticipantAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getParticipantMultiplicity <em>Participant Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Participant Multiplicity</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getParticipantMultiplicity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ParticipantMultiplicity();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getPartnerEntity <em>Partner Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partner Entity</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getPartnerEntity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PartnerEntity();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getPartnerRole <em>Partner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partner Role</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getPartnerRole()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PartnerRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getPotentialOwner <em>Potential Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Potential Owner</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getPotentialOwner()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PotentialOwner();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getProcess()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Process();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Property();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getReceiveTask <em>Receive Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getReceiveTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReceiveTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getRelationship()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Relationship();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getRendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rendering</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getRendering()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rendering();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Resource();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Assignment Expression</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResourceAssignmentExpression()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResourceAssignmentExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResourceParameter <em>Resource Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Parameter</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResourceParameter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResourceParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResourceParameterBinding <em>Resource Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Parameter Binding</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResourceParameterBinding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResourceParameterBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getScript()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Script();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getScriptTask <em>Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getScriptTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ScriptTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSendTask <em>Send Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Send Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSendTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SendTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Flow</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSequenceFlow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SequenceFlow();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getServiceTask <em>Service Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getServiceTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSignal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Signal();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSignalEventDefinition <em>Signal Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSignalEventDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SignalEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getStandardLoopCharacteristics <em>Standard Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standard Loop Characteristics</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getStandardLoopCharacteristics()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StandardLoopCharacteristics();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getStartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getStartEvent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StartEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSubChoreography <em>Sub Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Choreography</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSubChoreography()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubChoreography();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSubConversation <em>Sub Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Conversation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSubConversation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubConversation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Process</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSubProcess()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubProcess();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Task();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTerminateEventDefinition <em>Terminate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Terminate Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTerminateEventDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TerminateEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTextAnnotation <em>Text Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Annotation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTextAnnotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TextAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getThrowEvent <em>Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throw Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getThrowEvent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ThrowEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTimerEventDefinition <em>Timer Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timer Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTimerEventDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TimerEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTransaction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transaction();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getUserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot#getUserTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UserTask();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.Activity#getIoSpecification <em>Io Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Io Specification</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Activity#getIoSpecification()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_IoSpecification();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.Activity#getBoundaryEventRefs <em>Boundary Event Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boundary Event Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Activity#getBoundaryEventRefs()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_BoundaryEventRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Activity#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Activity#getProperties()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Activity#getDataInputAssociations <em>Data Input Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Input Associations</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Activity#getDataInputAssociations()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_DataInputAssociations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Activity#getDataOutputAssociations <em>Data Output Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Output Associations</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Activity#getDataOutputAssociations()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_DataOutputAssociations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Activity#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Activity#getResources()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.Activity#getLoopCharacteristics <em>Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Characteristics</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Activity#getLoopCharacteristics()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_LoopCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Activity#getCompletionQuantity <em>Completion Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion Quantity</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Activity#getCompletionQuantity()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_CompletionQuantity();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.Activity#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Activity#getDefault()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Activity#isIsForCompensation <em>Is For Compensation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is For Compensation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Activity#isIsForCompensation()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_IsForCompensation();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Activity#getStartQuantity <em>Start Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Quantity</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Activity#getStartQuantity()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_StartQuantity();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.AdHocSubProcess <em>Ad Hoc Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ad Hoc Sub Process</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.AdHocSubProcess
	 * @generated
	 */
	EClass getAdHocSubProcess();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.AdHocSubProcess#getCompletionCondition <em>Completion Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Completion Condition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.AdHocSubProcess#getCompletionCondition()
	 * @see #getAdHocSubProcess()
	 * @generated
	 */
	EReference getAdHocSubProcess_CompletionCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.AdHocSubProcess#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Remaining Instances</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.AdHocSubProcess#isCancelRemainingInstances()
	 * @see #getAdHocSubProcess()
	 * @generated
	 */
	EAttribute getAdHocSubProcess_CancelRemainingInstances();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.AdHocSubProcess#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.AdHocSubProcess#getOrdering()
	 * @see #getAdHocSubProcess()
	 * @generated
	 */
	EAttribute getAdHocSubProcess_Ordering();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.Assignment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Assignment#getFrom()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.Assignment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Assignment#getTo()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_To();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Association#getAssociationDirection <em>Association Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Direction</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Association#getAssociationDirection()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_AssociationDirection();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.Association#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Association#getSourceRef()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_SourceRef();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.Association#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Association#getTargetRef()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_TargetRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Auditing <em>Auditing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auditing</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Auditing
	 * @generated
	 */
	EClass getAuditing();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Element</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.BaseElement
	 * @generated
	 */
	EClass getBaseElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.BaseElement#getExtensionValues <em>Extension Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension Values</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.BaseElement#getExtensionValues()
	 * @see #getBaseElement()
	 * @generated
	 */
	EReference getBaseElement_ExtensionValues();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.BaseElement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.BaseElement#getDocumentation()
	 * @see #getBaseElement()
	 * @generated
	 */
	EReference getBaseElement_Documentation();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.BaseElement#getExtensionDefinitions <em>Extension Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extension Definitions</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.BaseElement#getExtensionDefinitions()
	 * @see #getBaseElement()
	 * @generated
	 */
	EReference getBaseElement_ExtensionDefinitions();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.BaseElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.BaseElement#getId()
	 * @see #getBaseElement()
	 * @generated
	 */
	EAttribute getBaseElement_Id();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.BPMN2Model.BaseElement#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.BaseElement#getAnyAttribute()
	 * @see #getBaseElement()
	 * @generated
	 */
	EAttribute getBaseElement_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.BoundaryEvent <em>Boundary Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boundary Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.BoundaryEvent
	 * @generated
	 */
	EClass getBoundaryEvent();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attached To Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.BoundaryEvent#getAttachedToRef()
	 * @see #getBoundaryEvent()
	 * @generated
	 */
	EReference getBoundaryEvent_AttachedToRef();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.BoundaryEvent#isCancelActivity <em>Cancel Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Activity</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.BoundaryEvent#isCancelActivity()
	 * @see #getBoundaryEvent()
	 * @generated
	 */
	EAttribute getBoundaryEvent_CancelActivity();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.BusinessRuleTask <em>Business Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Rule Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.BusinessRuleTask
	 * @generated
	 */
	EClass getBusinessRuleTask();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.BusinessRuleTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.BusinessRuleTask#getImplementation()
	 * @see #getBusinessRuleTask()
	 * @generated
	 */
	EAttribute getBusinessRuleTask_Implementation();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.CallActivity <em>Call Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Activity</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CallActivity
	 * @generated
	 */
	EClass getCallActivity();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.CallActivity#getCalledElementRef <em>Called Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called Element Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CallActivity#getCalledElementRef()
	 * @see #getCallActivity()
	 * @generated
	 */
	EReference getCallActivity_CalledElementRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.CallChoreography <em>Call Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Choreography</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CallChoreography
	 * @generated
	 */
	EClass getCallChoreography();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.CallChoreography#getParticipantAssociations <em>Participant Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant Associations</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CallChoreography#getParticipantAssociations()
	 * @see #getCallChoreography()
	 * @generated
	 */
	EReference getCallChoreography_ParticipantAssociations();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.CallChoreography#getCalledChoreographyRef <em>Called Choreography Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called Choreography Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CallChoreography#getCalledChoreographyRef()
	 * @see #getCallChoreography()
	 * @generated
	 */
	EReference getCallChoreography_CalledChoreographyRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.CallConversation <em>Call Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Conversation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CallConversation
	 * @generated
	 */
	EClass getCallConversation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.CallConversation#getParticipantAssociations <em>Participant Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant Associations</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CallConversation#getParticipantAssociations()
	 * @see #getCallConversation()
	 * @generated
	 */
	EReference getCallConversation_ParticipantAssociations();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.CallConversation#getCalledCollaborationRef <em>Called Collaboration Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called Collaboration Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CallConversation#getCalledCollaborationRef()
	 * @see #getCallConversation()
	 * @generated
	 */
	EReference getCallConversation_CalledCollaborationRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.CallableElement <em>Callable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Element</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CallableElement
	 * @generated
	 */
	EClass getCallableElement();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.CallableElement#getSupportedInterfaceRefs <em>Supported Interface Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Interface Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CallableElement#getSupportedInterfaceRefs()
	 * @see #getCallableElement()
	 * @generated
	 */
	EReference getCallableElement_SupportedInterfaceRefs();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.CallableElement#getIoSpecification <em>Io Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Io Specification</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CallableElement#getIoSpecification()
	 * @see #getCallableElement()
	 * @generated
	 */
	EReference getCallableElement_IoSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.CallableElement#getIoBinding <em>Io Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Io Binding</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CallableElement#getIoBinding()
	 * @see #getCallableElement()
	 * @generated
	 */
	EReference getCallableElement_IoBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.CallableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CallableElement#getName()
	 * @see #getCallableElement()
	 * @generated
	 */
	EAttribute getCallableElement_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.CancelEventDefinition <em>Cancel Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancel Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CancelEventDefinition
	 * @generated
	 */
	EClass getCancelEventDefinition();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.CatchEvent <em>Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CatchEvent
	 * @generated
	 */
	EClass getCatchEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.CatchEvent#getDataOutputs <em>Data Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Outputs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CatchEvent#getDataOutputs()
	 * @see #getCatchEvent()
	 * @generated
	 */
	EReference getCatchEvent_DataOutputs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.CatchEvent#getDataOutputAssociation <em>Data Output Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Output Association</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CatchEvent#getDataOutputAssociation()
	 * @see #getCatchEvent()
	 * @generated
	 */
	EReference getCatchEvent_DataOutputAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.CatchEvent#getOutputSet <em>Output Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Set</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CatchEvent#getOutputSet()
	 * @see #getCatchEvent()
	 * @generated
	 */
	EReference getCatchEvent_OutputSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.CatchEvent#getEventDefinitions <em>Event Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Definitions</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CatchEvent#getEventDefinitions()
	 * @see #getCatchEvent()
	 * @generated
	 */
	EReference getCatchEvent_EventDefinitions();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.CatchEvent#getEventDefinitionRefs <em>Event Definition Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event Definition Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CatchEvent#getEventDefinitionRefs()
	 * @see #getCatchEvent()
	 * @generated
	 */
	EReference getCatchEvent_EventDefinitionRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.CatchEvent#isParallelMultiple <em>Parallel Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel Multiple</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CatchEvent#isParallelMultiple()
	 * @see #getCatchEvent()
	 * @generated
	 */
	EAttribute getCatchEvent_ParallelMultiple();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Category#getCategoryValue <em>Category Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category Value</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Category#getCategoryValue()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_CategoryValue();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.CategoryValue <em>Category Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Value</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CategoryValue
	 * @generated
	 */
	EClass getCategoryValue();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.CategoryValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CategoryValue#getValue()
	 * @see #getCategoryValue()
	 * @generated
	 */
	EAttribute getCategoryValue_Value();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.CategoryValue#getCategorizedFlowElements <em>Categorized Flow Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categorized Flow Elements</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CategoryValue#getCategorizedFlowElements()
	 * @see #getCategoryValue()
	 * @generated
	 */
	EReference getCategoryValue_CategorizedFlowElements();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Choreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Choreography
	 * @generated
	 */
	EClass getChoreography();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ChoreographyActivity <em>Choreography Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography Activity</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ChoreographyActivity
	 * @generated
	 */
	EClass getChoreographyActivity();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.ChoreographyActivity#getParticipantRefs <em>Participant Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ChoreographyActivity#getParticipantRefs()
	 * @see #getChoreographyActivity()
	 * @generated
	 */
	EReference getChoreographyActivity_ParticipantRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.ChoreographyActivity#getCorrelationKeys <em>Correlation Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Keys</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ChoreographyActivity#getCorrelationKeys()
	 * @see #getChoreographyActivity()
	 * @generated
	 */
	EReference getChoreographyActivity_CorrelationKeys();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ChoreographyActivity#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initiating Participant Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ChoreographyActivity#getInitiatingParticipantRef()
	 * @see #getChoreographyActivity()
	 * @generated
	 */
	EReference getChoreographyActivity_InitiatingParticipantRef();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ChoreographyActivity#getLoopType <em>Loop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Type</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ChoreographyActivity#getLoopType()
	 * @see #getChoreographyActivity()
	 * @generated
	 */
	EAttribute getChoreographyActivity_LoopType();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ChoreographyTask <em>Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ChoreographyTask
	 * @generated
	 */
	EClass getChoreographyTask();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.ChoreographyTask#getMessageFlowRef <em>Message Flow Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message Flow Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ChoreographyTask#getMessageFlowRef()
	 * @see #getChoreographyTask()
	 * @generated
	 */
	EReference getChoreographyTask_MessageFlowRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Collaboration
	 * @generated
	 */
	EClass getCollaboration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Collaboration#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Collaboration#getParticipants()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Participants();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Collaboration#getMessageFlows <em>Message Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Flows</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Collaboration#getMessageFlows()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_MessageFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Collaboration#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Collaboration#getArtifacts()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Artifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Collaboration#getConversations <em>Conversations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conversations</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Collaboration#getConversations()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Conversations();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.Collaboration#getConversationAssociations <em>Conversation Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conversation Associations</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Collaboration#getConversationAssociations()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_ConversationAssociations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Collaboration#getParticipantAssociations <em>Participant Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant Associations</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Collaboration#getParticipantAssociations()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_ParticipantAssociations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Collaboration#getMessageFlowAssociations <em>Message Flow Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Flow Associations</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Collaboration#getMessageFlowAssociations()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_MessageFlowAssociations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Collaboration#getCorrelationKeys <em>Correlation Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Keys</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Collaboration#getCorrelationKeys()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_CorrelationKeys();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.Collaboration#getChoreographyRef <em>Choreography Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Choreography Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Collaboration#getChoreographyRef()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_ChoreographyRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Collaboration#getConversationLinks <em>Conversation Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conversation Links</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Collaboration#getConversationLinks()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_ConversationLinks();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Collaboration#isIsClosed <em>Is Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Closed</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Collaboration#isIsClosed()
	 * @see #getCollaboration()
	 * @generated
	 */
	EAttribute getCollaboration_IsClosed();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Collaboration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Collaboration#getName()
	 * @see #getCollaboration()
	 * @generated
	 */
	EAttribute getCollaboration_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.CompensateEventDefinition <em>Compensate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compensate Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CompensateEventDefinition
	 * @generated
	 */
	EClass getCompensateEventDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.CompensateEventDefinition#getActivityRef <em>Activity Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CompensateEventDefinition#getActivityRef()
	 * @see #getCompensateEventDefinition()
	 * @generated
	 */
	EReference getCompensateEventDefinition_ActivityRef();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.CompensateEventDefinition#isWaitForCompletion <em>Wait For Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wait For Completion</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CompensateEventDefinition#isWaitForCompletion()
	 * @see #getCompensateEventDefinition()
	 * @generated
	 */
	EAttribute getCompensateEventDefinition_WaitForCompletion();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ComplexBehaviorDefinition <em>Complex Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Behavior Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ComplexBehaviorDefinition
	 * @generated
	 */
	EClass getComplexBehaviorDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.ComplexBehaviorDefinition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ComplexBehaviorDefinition#getCondition()
	 * @see #getComplexBehaviorDefinition()
	 * @generated
	 */
	EReference getComplexBehaviorDefinition_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.ComplexBehaviorDefinition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ComplexBehaviorDefinition#getEvent()
	 * @see #getComplexBehaviorDefinition()
	 * @generated
	 */
	EReference getComplexBehaviorDefinition_Event();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ComplexGateway <em>Complex Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Gateway</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ComplexGateway
	 * @generated
	 */
	EClass getComplexGateway();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.ComplexGateway#getActivationCondition <em>Activation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation Condition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ComplexGateway#getActivationCondition()
	 * @see #getComplexGateway()
	 * @generated
	 */
	EReference getComplexGateway_ActivationCondition();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ComplexGateway#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ComplexGateway#getDefault()
	 * @see #getComplexGateway()
	 * @generated
	 */
	EReference getComplexGateway_Default();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ConditionalEventDefinition <em>Conditional Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ConditionalEventDefinition
	 * @generated
	 */
	EClass getConditionalEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.ConditionalEventDefinition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ConditionalEventDefinition#getCondition()
	 * @see #getConditionalEventDefinition()
	 * @generated
	 */
	EReference getConditionalEventDefinition_Condition();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Conversation <em>Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Conversation
	 * @generated
	 */
	EClass getConversation();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ConversationAssociation <em>Conversation Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversation Association</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ConversationAssociation
	 * @generated
	 */
	EClass getConversationAssociation();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ConversationAssociation#getInnerConversationNodeRef <em>Inner Conversation Node Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Conversation Node Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ConversationAssociation#getInnerConversationNodeRef()
	 * @see #getConversationAssociation()
	 * @generated
	 */
	EReference getConversationAssociation_InnerConversationNodeRef();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ConversationAssociation#getOuterConversationNodeRef <em>Outer Conversation Node Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Conversation Node Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ConversationAssociation#getOuterConversationNodeRef()
	 * @see #getConversationAssociation()
	 * @generated
	 */
	EReference getConversationAssociation_OuterConversationNodeRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ConversationLink <em>Conversation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversation Link</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ConversationLink
	 * @generated
	 */
	EClass getConversationLink();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ConversationLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ConversationLink#getName()
	 * @see #getConversationLink()
	 * @generated
	 */
	EAttribute getConversationLink_Name();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ConversationLink#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ConversationLink#getSourceRef()
	 * @see #getConversationLink()
	 * @generated
	 */
	EReference getConversationLink_SourceRef();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ConversationLink#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ConversationLink#getTargetRef()
	 * @see #getConversationLink()
	 * @generated
	 */
	EReference getConversationLink_TargetRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ConversationNode <em>Conversation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversation Node</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ConversationNode
	 * @generated
	 */
	EClass getConversationNode();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.ConversationNode#getParticipantRefs <em>Participant Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ConversationNode#getParticipantRefs()
	 * @see #getConversationNode()
	 * @generated
	 */
	EReference getConversationNode_ParticipantRefs();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.ConversationNode#getMessageFlowRefs <em>Message Flow Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message Flow Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ConversationNode#getMessageFlowRefs()
	 * @see #getConversationNode()
	 * @generated
	 */
	EReference getConversationNode_MessageFlowRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.ConversationNode#getCorrelationKeys <em>Correlation Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Keys</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ConversationNode#getCorrelationKeys()
	 * @see #getConversationNode()
	 * @generated
	 */
	EReference getConversationNode_CorrelationKeys();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ConversationNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ConversationNode#getName()
	 * @see #getConversationNode()
	 * @generated
	 */
	EAttribute getConversationNode_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.CorrelationKey <em>Correlation Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Key</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationKey
	 * @generated
	 */
	EClass getCorrelationKey();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.CorrelationKey#getCorrelationPropertyRef <em>Correlation Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Correlation Property Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationKey#getCorrelationPropertyRef()
	 * @see #getCorrelationKey()
	 * @generated
	 */
	EReference getCorrelationKey_CorrelationPropertyRef();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.CorrelationKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationKey#getName()
	 * @see #getCorrelationKey()
	 * @generated
	 */
	EAttribute getCorrelationKey_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.CorrelationProperty <em>Correlation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Property</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationProperty
	 * @generated
	 */
	EClass getCorrelationProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.CorrelationProperty#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Property Retrieval Expression</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationProperty#getCorrelationPropertyRetrievalExpression()
	 * @see #getCorrelationProperty()
	 * @generated
	 */
	EReference getCorrelationProperty_CorrelationPropertyRetrievalExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.CorrelationProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationProperty#getName()
	 * @see #getCorrelationProperty()
	 * @generated
	 */
	EAttribute getCorrelationProperty_Name();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.CorrelationProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationProperty#getType()
	 * @see #getCorrelationProperty()
	 * @generated
	 */
	EReference getCorrelationProperty_Type();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.CorrelationPropertyBinding <em>Correlation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Property Binding</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationPropertyBinding
	 * @generated
	 */
	EClass getCorrelationPropertyBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.CorrelationPropertyBinding#getDataPath <em>Data Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Path</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationPropertyBinding#getDataPath()
	 * @see #getCorrelationPropertyBinding()
	 * @generated
	 */
	EReference getCorrelationPropertyBinding_DataPath();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.CorrelationPropertyBinding#getCorrelationPropertyRef <em>Correlation Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Correlation Property Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationPropertyBinding#getCorrelationPropertyRef()
	 * @see #getCorrelationPropertyBinding()
	 * @generated
	 */
	EReference getCorrelationPropertyBinding_CorrelationPropertyRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.CorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Property Retrieval Expression</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationPropertyRetrievalExpression
	 * @generated
	 */
	EClass getCorrelationPropertyRetrievalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.CorrelationPropertyRetrievalExpression#getMessagePath <em>Message Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Path</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationPropertyRetrievalExpression#getMessagePath()
	 * @see #getCorrelationPropertyRetrievalExpression()
	 * @generated
	 */
	EReference getCorrelationPropertyRetrievalExpression_MessagePath();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.CorrelationPropertyRetrievalExpression#getMessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationPropertyRetrievalExpression#getMessageRef()
	 * @see #getCorrelationPropertyRetrievalExpression()
	 * @generated
	 */
	EReference getCorrelationPropertyRetrievalExpression_MessageRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.CorrelationSubscription <em>Correlation Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Subscription</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationSubscription
	 * @generated
	 */
	EClass getCorrelationSubscription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.CorrelationSubscription#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Property Binding</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationSubscription#getCorrelationPropertyBinding()
	 * @see #getCorrelationSubscription()
	 * @generated
	 */
	EReference getCorrelationSubscription_CorrelationPropertyBinding();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.CorrelationSubscription#getCorrelationKeyRef <em>Correlation Key Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Correlation Key Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationSubscription#getCorrelationKeyRef()
	 * @see #getCorrelationSubscription()
	 * @generated
	 */
	EReference getCorrelationSubscription_CorrelationKeyRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.DataAssociation <em>Data Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Association</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataAssociation
	 * @generated
	 */
	EClass getDataAssociation();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.DataAssociation#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataAssociation#getSourceRef()
	 * @see #getDataAssociation()
	 * @generated
	 */
	EReference getDataAssociation_SourceRef();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.DataAssociation#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataAssociation#getTargetRef()
	 * @see #getDataAssociation()
	 * @generated
	 */
	EReference getDataAssociation_TargetRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.DataAssociation#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataAssociation#getTransformation()
	 * @see #getDataAssociation()
	 * @generated
	 */
	EReference getDataAssociation_Transformation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.DataAssociation#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignment</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataAssociation#getAssignment()
	 * @see #getDataAssociation()
	 * @generated
	 */
	EReference getDataAssociation_Assignment();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.DataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Input</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataInput
	 * @generated
	 */
	EClass getDataInput();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.DataInput#getInputSetWithOptional <em>Input Set With Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Set With Optional</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataInput#getInputSetWithOptional()
	 * @see #getDataInput()
	 * @generated
	 */
	EReference getDataInput_InputSetWithOptional();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.DataInput#getInputSetWithWhileExecuting <em>Input Set With While Executing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Set With While Executing</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataInput#getInputSetWithWhileExecuting()
	 * @see #getDataInput()
	 * @generated
	 */
	EReference getDataInput_InputSetWithWhileExecuting();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.DataInput#getInputSetRefs <em>Input Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Set Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataInput#getInputSetRefs()
	 * @see #getDataInput()
	 * @generated
	 */
	EReference getDataInput_InputSetRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.DataInput#isIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataInput#isIsCollection()
	 * @see #getDataInput()
	 * @generated
	 */
	EAttribute getDataInput_IsCollection();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.DataInput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataInput#getName()
	 * @see #getDataInput()
	 * @generated
	 */
	EAttribute getDataInput_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.DataInputAssociation <em>Data Input Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Input Association</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataInputAssociation
	 * @generated
	 */
	EClass getDataInputAssociation();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataObject
	 * @generated
	 */
	EClass getDataObject();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.DataObject#isIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataObject#isIsCollection()
	 * @see #getDataObject()
	 * @generated
	 */
	EAttribute getDataObject_IsCollection();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.DataObjectReference <em>Data Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object Reference</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataObjectReference
	 * @generated
	 */
	EClass getDataObjectReference();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.DataObjectReference#getDataObjectRef <em>Data Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Object Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataObjectReference#getDataObjectRef()
	 * @see #getDataObjectReference()
	 * @generated
	 */
	EReference getDataObjectReference_DataObjectRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.DataOutput <em>Data Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Output</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataOutput
	 * @generated
	 */
	EClass getDataOutput();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.DataOutput#getOutputSetWithOptional <em>Output Set With Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Set With Optional</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataOutput#getOutputSetWithOptional()
	 * @see #getDataOutput()
	 * @generated
	 */
	EReference getDataOutput_OutputSetWithOptional();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.DataOutput#getOutputSetWithWhileExecuting <em>Output Set With While Executing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Set With While Executing</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataOutput#getOutputSetWithWhileExecuting()
	 * @see #getDataOutput()
	 * @generated
	 */
	EReference getDataOutput_OutputSetWithWhileExecuting();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.DataOutput#getOutputSetRefs <em>Output Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Set Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataOutput#getOutputSetRefs()
	 * @see #getDataOutput()
	 * @generated
	 */
	EReference getDataOutput_OutputSetRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.DataOutput#isIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataOutput#isIsCollection()
	 * @see #getDataOutput()
	 * @generated
	 */
	EAttribute getDataOutput_IsCollection();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.DataOutput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataOutput#getName()
	 * @see #getDataOutput()
	 * @generated
	 */
	EAttribute getDataOutput_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.DataOutputAssociation <em>Data Output Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Output Association</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataOutputAssociation
	 * @generated
	 */
	EClass getDataOutputAssociation();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.DataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data State</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataState
	 * @generated
	 */
	EClass getDataState();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.DataState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataState#getName()
	 * @see #getDataState()
	 * @generated
	 */
	EAttribute getDataState_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Store</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataStore
	 * @generated
	 */
	EClass getDataStore();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.DataStore#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataStore#getCapacity()
	 * @see #getDataStore()
	 * @generated
	 */
	EAttribute getDataStore_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.DataStore#isIsUnlimited <em>Is Unlimited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unlimited</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataStore#isIsUnlimited()
	 * @see #getDataStore()
	 * @generated
	 */
	EAttribute getDataStore_IsUnlimited();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.DataStore#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataStore#getName()
	 * @see #getDataStore()
	 * @generated
	 */
	EAttribute getDataStore_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.DataStoreReference <em>Data Store Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Store Reference</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataStoreReference
	 * @generated
	 */
	EClass getDataStoreReference();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.DataStoreReference#getDataStoreRef <em>Data Store Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Store Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.DataStoreReference#getDataStoreRef()
	 * @see #getDataStoreReference()
	 * @generated
	 */
	EReference getDataStoreReference_DataStoreRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Definitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Definitions
	 * @generated
	 */
	EClass getDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Definitions#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Definitions#getImports()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Definitions#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensions</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Definitions#getExtensions()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_Extensions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Definitions#getRootElements <em>Root Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Elements</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Definitions#getRootElements()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_RootElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Definitions#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Definitions#getRelationships()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_Relationships();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Definitions#getExporter <em>Exporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exporter</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Definitions#getExporter()
	 * @see #getDefinitions()
	 * @generated
	 */
	EAttribute getDefinitions_Exporter();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Definitions#getExporterVersion <em>Exporter Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exporter Version</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Definitions#getExporterVersion()
	 * @see #getDefinitions()
	 * @generated
	 */
	EAttribute getDefinitions_ExporterVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Definitions#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Definitions#getExpressionLanguage()
	 * @see #getDefinitions()
	 * @generated
	 */
	EAttribute getDefinitions_ExpressionLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Definitions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Definitions#getName()
	 * @see #getDefinitions()
	 * @generated
	 */
	EAttribute getDefinitions_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Definitions#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Definitions#getTargetNamespace()
	 * @see #getDefinitions()
	 * @generated
	 */
	EAttribute getDefinitions_TargetNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Definitions#getTypeLanguage <em>Type Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Language</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Definitions#getTypeLanguage()
	 * @see #getDefinitions()
	 * @generated
	 */
	EAttribute getDefinitions_TypeLanguage();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.BPMN2Model.Documentation#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Documentation#getMixed()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Documentation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Documentation#getText()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Documentation#getTextFormat <em>Text Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Format</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Documentation#getTextFormat()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_TextFormat();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.EndEvent
	 * @generated
	 */
	EClass getEndEvent();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.EndPoint
	 * @generated
	 */
	EClass getEndPoint();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Error
	 * @generated
	 */
	EClass getError();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Error#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Error#getErrorCode()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_ErrorCode();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Error#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Error#getName()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Name();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.Error#getStructureRef <em>Structure Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structure Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Error#getStructureRef()
	 * @see #getError()
	 * @generated
	 */
	EReference getError_StructureRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ErrorEventDefinition <em>Error Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ErrorEventDefinition
	 * @generated
	 */
	EClass getErrorEventDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ErrorEventDefinition#getErrorRef <em>Error Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ErrorEventDefinition#getErrorRef()
	 * @see #getErrorEventDefinition()
	 * @generated
	 */
	EReference getErrorEventDefinition_ErrorRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Escalation <em>Escalation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Escalation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Escalation
	 * @generated
	 */
	EClass getEscalation();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Escalation#getEscalationCode <em>Escalation Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Escalation Code</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Escalation#getEscalationCode()
	 * @see #getEscalation()
	 * @generated
	 */
	EAttribute getEscalation_EscalationCode();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Escalation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Escalation#getName()
	 * @see #getEscalation()
	 * @generated
	 */
	EAttribute getEscalation_Name();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.Escalation#getStructureRef <em>Structure Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structure Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Escalation#getStructureRef()
	 * @see #getEscalation()
	 * @generated
	 */
	EReference getEscalation_StructureRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.EscalationEventDefinition <em>Escalation Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Escalation Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.EscalationEventDefinition
	 * @generated
	 */
	EClass getEscalationEventDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.EscalationEventDefinition#getEscalationRef <em>Escalation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Escalation Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.EscalationEventDefinition#getEscalationRef()
	 * @see #getEscalationEventDefinition()
	 * @generated
	 */
	EReference getEscalationEventDefinition_EscalationRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Event#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Event#getProperties()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Properties();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.EventBasedGateway <em>Event Based Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Based Gateway</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.EventBasedGateway
	 * @generated
	 */
	EClass getEventBasedGateway();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.EventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Gateway Type</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.EventBasedGateway#getEventGatewayType()
	 * @see #getEventBasedGateway()
	 * @generated
	 */
	EAttribute getEventBasedGateway_EventGatewayType();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.EventBasedGateway#isInstantiate <em>Instantiate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instantiate</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.EventBasedGateway#isInstantiate()
	 * @see #getEventBasedGateway()
	 * @generated
	 */
	EAttribute getEventBasedGateway_Instantiate();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.EventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.EventDefinition
	 * @generated
	 */
	EClass getEventDefinition();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ExclusiveGateway <em>Exclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Gateway</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ExclusiveGateway
	 * @generated
	 */
	EClass getExclusiveGateway();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ExclusiveGateway#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ExclusiveGateway#getDefault()
	 * @see #getExclusiveGateway()
	 * @generated
	 */
	EReference getExclusiveGateway_Default();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.Extension#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Extension#getDefinition()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Definition();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Extension#isMustUnderstand <em>Must Understand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Understand</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Extension#isMustUnderstand()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_MustUnderstand();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Extension#getXsdDefinition <em>Xsd Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xsd Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Extension#getXsdDefinition()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_XsdDefinition();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ExtensionAttributeDefinition <em>Extension Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Attribute Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ExtensionAttributeDefinition
	 * @generated
	 */
	EClass getExtensionAttributeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ExtensionAttributeDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ExtensionAttributeDefinition#getName()
	 * @see #getExtensionAttributeDefinition()
	 * @generated
	 */
	EAttribute getExtensionAttributeDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ExtensionAttributeDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ExtensionAttributeDefinition#getType()
	 * @see #getExtensionAttributeDefinition()
	 * @generated
	 */
	EAttribute getExtensionAttributeDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ExtensionAttributeDefinition#isIsReference <em>Is Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reference</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ExtensionAttributeDefinition#isIsReference()
	 * @see #getExtensionAttributeDefinition()
	 * @generated
	 */
	EAttribute getExtensionAttributeDefinition_IsReference();

	/**
	 * Returns the meta object for the container reference '{@link org.emftrace.metamodel.BPMN2Model.ExtensionAttributeDefinition#getExtensionDefinition <em>Extension Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Extension Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ExtensionAttributeDefinition#getExtensionDefinition()
	 * @see #getExtensionAttributeDefinition()
	 * @generated
	 */
	EReference getExtensionAttributeDefinition_ExtensionDefinition();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ExtensionAttributeValue <em>Extension Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Attribute Value</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ExtensionAttributeValue
	 * @generated
	 */
	EClass getExtensionAttributeValue();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ExtensionAttributeValue#getValueRef <em>Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ExtensionAttributeValue#getValueRef()
	 * @see #getExtensionAttributeValue()
	 * @generated
	 */
	EReference getExtensionAttributeValue_ValueRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.BPMN2Model.ExtensionAttributeValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ExtensionAttributeValue#getValue()
	 * @see #getExtensionAttributeValue()
	 * @generated
	 */
	EAttribute getExtensionAttributeValue_Value();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ExtensionAttributeValue#getExtensionAttributeDefinition <em>Extension Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extension Attribute Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ExtensionAttributeValue#getExtensionAttributeDefinition()
	 * @see #getExtensionAttributeValue()
	 * @generated
	 */
	EReference getExtensionAttributeValue_ExtensionAttributeDefinition();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ExtensionDefinition <em>Extension Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ExtensionDefinition
	 * @generated
	 */
	EClass getExtensionDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ExtensionDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ExtensionDefinition#getName()
	 * @see #getExtensionDefinition()
	 * @generated
	 */
	EAttribute getExtensionDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.ExtensionDefinition#getExtensionAttributeDefinitions <em>Extension Attribute Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension Attribute Definitions</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ExtensionDefinition#getExtensionAttributeDefinitions()
	 * @see #getExtensionDefinition()
	 * @generated
	 */
	EReference getExtensionDefinition_ExtensionAttributeDefinitions();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Element</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.FlowElement
	 * @generated
	 */
	EClass getFlowElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.FlowElement#getAuditing <em>Auditing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditing</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.FlowElement#getAuditing()
	 * @see #getFlowElement()
	 * @generated
	 */
	EReference getFlowElement_Auditing();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.FlowElement#getMonitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monitoring</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.FlowElement#getMonitoring()
	 * @see #getFlowElement()
	 * @generated
	 */
	EReference getFlowElement_Monitoring();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.FlowElement#getCategoryValueRef <em>Category Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category Value Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.FlowElement#getCategoryValueRef()
	 * @see #getFlowElement()
	 * @generated
	 */
	EReference getFlowElement_CategoryValueRef();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.FlowElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.FlowElement#getName()
	 * @see #getFlowElement()
	 * @generated
	 */
	EAttribute getFlowElement_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.FlowElementsContainer <em>Flow Elements Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Elements Container</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.FlowElementsContainer
	 * @generated
	 */
	EClass getFlowElementsContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.FlowElementsContainer#getLaneSets <em>Lane Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lane Sets</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.FlowElementsContainer#getLaneSets()
	 * @see #getFlowElementsContainer()
	 * @generated
	 */
	EReference getFlowElementsContainer_LaneSets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.FlowElementsContainer#getFlowElements <em>Flow Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Elements</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.FlowElementsContainer#getFlowElements()
	 * @see #getFlowElementsContainer()
	 * @generated
	 */
	EReference getFlowElementsContainer_FlowElements();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Node</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.FlowNode
	 * @generated
	 */
	EClass getFlowNode();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.FlowNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.FlowNode#getIncoming()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.FlowNode#getLanes <em>Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lanes</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.FlowNode#getLanes()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Lanes();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.FlowNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.FlowNode#getOutgoing()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Outgoing();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.FormalExpression <em>Formal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Expression</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.FormalExpression
	 * @generated
	 */
	EClass getFormalExpression();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.BPMN2Model.FormalExpression#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.FormalExpression#getMixed()
	 * @see #getFormalExpression()
	 * @generated
	 */
	EAttribute getFormalExpression_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.FormalExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.FormalExpression#getBody()
	 * @see #getFormalExpression()
	 * @generated
	 */
	EAttribute getFormalExpression_Body();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.FormalExpression#getEvaluatesToTypeRef <em>Evaluates To Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evaluates To Type Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.FormalExpression#getEvaluatesToTypeRef()
	 * @see #getFormalExpression()
	 * @generated
	 */
	EReference getFormalExpression_EvaluatesToTypeRef();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.FormalExpression#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.FormalExpression#getLanguage()
	 * @see #getFormalExpression()
	 * @generated
	 */
	EAttribute getFormalExpression_Language();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Gateway#getGatewayDirection <em>Gateway Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Direction</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Gateway#getGatewayDirection()
	 * @see #getGateway()
	 * @generated
	 */
	EAttribute getGateway_GatewayDirection();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.GlobalBusinessRuleTask <em>Global Business Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Business Rule Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalBusinessRuleTask
	 * @generated
	 */
	EClass getGlobalBusinessRuleTask();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.GlobalBusinessRuleTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalBusinessRuleTask#getImplementation()
	 * @see #getGlobalBusinessRuleTask()
	 * @generated
	 */
	EAttribute getGlobalBusinessRuleTask_Implementation();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.GlobalChoreographyTask <em>Global Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Choreography Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalChoreographyTask
	 * @generated
	 */
	EClass getGlobalChoreographyTask();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.GlobalChoreographyTask#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initiating Participant Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalChoreographyTask#getInitiatingParticipantRef()
	 * @see #getGlobalChoreographyTask()
	 * @generated
	 */
	EReference getGlobalChoreographyTask_InitiatingParticipantRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.GlobalConversation <em>Global Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Conversation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalConversation
	 * @generated
	 */
	EClass getGlobalConversation();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.GlobalManualTask <em>Global Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Manual Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalManualTask
	 * @generated
	 */
	EClass getGlobalManualTask();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.GlobalScriptTask <em>Global Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Script Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalScriptTask
	 * @generated
	 */
	EClass getGlobalScriptTask();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.GlobalScriptTask#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalScriptTask#getScript()
	 * @see #getGlobalScriptTask()
	 * @generated
	 */
	EAttribute getGlobalScriptTask_Script();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.GlobalScriptTask#getScriptLanguage <em>Script Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Language</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalScriptTask#getScriptLanguage()
	 * @see #getGlobalScriptTask()
	 * @generated
	 */
	EAttribute getGlobalScriptTask_ScriptLanguage();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.GlobalTask <em>Global Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalTask
	 * @generated
	 */
	EClass getGlobalTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.GlobalTask#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalTask#getResources()
	 * @see #getGlobalTask()
	 * @generated
	 */
	EReference getGlobalTask_Resources();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.GlobalUserTask <em>Global User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global User Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalUserTask
	 * @generated
	 */
	EClass getGlobalUserTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.GlobalUserTask#getRenderings <em>Renderings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Renderings</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalUserTask#getRenderings()
	 * @see #getGlobalUserTask()
	 * @generated
	 */
	EReference getGlobalUserTask_Renderings();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.GlobalUserTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalUserTask#getImplementation()
	 * @see #getGlobalUserTask()
	 * @generated
	 */
	EAttribute getGlobalUserTask_Implementation();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.Group#getCategoryValueRef <em>Category Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category Value Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Group#getCategoryValueRef()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_CategoryValueRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.HumanPerformer <em>Human Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Performer</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.HumanPerformer
	 * @generated
	 */
	EClass getHumanPerformer();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ImplicitThrowEvent <em>Implicit Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Throw Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ImplicitThrowEvent
	 * @generated
	 */
	EClass getImplicitThrowEvent();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Import#getImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Type</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Import#getImportType()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportType();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Import#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Import#getLocation()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Import#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Import#getNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Namespace();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.InclusiveGateway <em>Inclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclusive Gateway</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InclusiveGateway
	 * @generated
	 */
	EClass getInclusiveGateway();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.InclusiveGateway#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InclusiveGateway#getDefault()
	 * @see #getInclusiveGateway()
	 * @generated
	 */
	EReference getInclusiveGateway_Default();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.InputOutputBinding <em>Input Output Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Output Binding</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InputOutputBinding
	 * @generated
	 */
	EClass getInputOutputBinding();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.InputOutputBinding#getInputDataRef <em>Input Data Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Data Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InputOutputBinding#getInputDataRef()
	 * @see #getInputOutputBinding()
	 * @generated
	 */
	EReference getInputOutputBinding_InputDataRef();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.InputOutputBinding#getOperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InputOutputBinding#getOperationRef()
	 * @see #getInputOutputBinding()
	 * @generated
	 */
	EReference getInputOutputBinding_OperationRef();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.InputOutputBinding#getOutputDataRef <em>Output Data Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Data Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InputOutputBinding#getOutputDataRef()
	 * @see #getInputOutputBinding()
	 * @generated
	 */
	EReference getInputOutputBinding_OutputDataRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.InputOutputSpecification <em>Input Output Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Output Specification</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InputOutputSpecification
	 * @generated
	 */
	EClass getInputOutputSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.InputOutputSpecification#getDataInputs <em>Data Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Inputs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InputOutputSpecification#getDataInputs()
	 * @see #getInputOutputSpecification()
	 * @generated
	 */
	EReference getInputOutputSpecification_DataInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.InputOutputSpecification#getDataOutputs <em>Data Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Outputs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InputOutputSpecification#getDataOutputs()
	 * @see #getInputOutputSpecification()
	 * @generated
	 */
	EReference getInputOutputSpecification_DataOutputs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.InputOutputSpecification#getInputSets <em>Input Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Sets</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InputOutputSpecification#getInputSets()
	 * @see #getInputOutputSpecification()
	 * @generated
	 */
	EReference getInputOutputSpecification_InputSets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.InputOutputSpecification#getOutputSets <em>Output Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Sets</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InputOutputSpecification#getOutputSets()
	 * @see #getInputOutputSpecification()
	 * @generated
	 */
	EReference getInputOutputSpecification_OutputSets();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.InputSet <em>Input Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Set</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InputSet
	 * @generated
	 */
	EClass getInputSet();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.InputSet#getDataInputRefs <em>Data Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Input Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InputSet#getDataInputRefs()
	 * @see #getInputSet()
	 * @generated
	 */
	EReference getInputSet_DataInputRefs();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.InputSet#getOptionalInputRefs <em>Optional Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Optional Input Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InputSet#getOptionalInputRefs()
	 * @see #getInputSet()
	 * @generated
	 */
	EReference getInputSet_OptionalInputRefs();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.InputSet#getWhileExecutingInputRefs <em>While Executing Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>While Executing Input Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InputSet#getWhileExecutingInputRefs()
	 * @see #getInputSet()
	 * @generated
	 */
	EReference getInputSet_WhileExecutingInputRefs();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.InputSet#getOutputSetRefs <em>Output Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Set Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InputSet#getOutputSetRefs()
	 * @see #getInputSet()
	 * @generated
	 */
	EReference getInputSet_OutputSetRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.InputSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InputSet#getName()
	 * @see #getInputSet()
	 * @generated
	 */
	EAttribute getInputSet_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.InteractionNode <em>Interaction Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Node</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InteractionNode
	 * @generated
	 */
	EClass getInteractionNode();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.InteractionNode#getIncomingConversationLinks <em>Incoming Conversation Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Conversation Links</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InteractionNode#getIncomingConversationLinks()
	 * @see #getInteractionNode()
	 * @generated
	 */
	EReference getInteractionNode_IncomingConversationLinks();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.InteractionNode#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Conversation Links</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.InteractionNode#getOutgoingConversationLinks()
	 * @see #getInteractionNode()
	 * @generated
	 */
	EReference getInteractionNode_OutgoingConversationLinks();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Interface#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Interface#getOperations()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Operations();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.Interface#getImplementationRef <em>Implementation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Interface#getImplementationRef()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ImplementationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.IntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Catch Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.IntermediateCatchEvent
	 * @generated
	 */
	EClass getIntermediateCatchEvent();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.IntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Throw Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.IntermediateThrowEvent
	 * @generated
	 */
	EClass getIntermediateThrowEvent();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ItemAwareElement <em>Item Aware Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Aware Element</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ItemAwareElement
	 * @generated
	 */
	EClass getItemAwareElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.ItemAwareElement#getDataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data State</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ItemAwareElement#getDataState()
	 * @see #getItemAwareElement()
	 * @generated
	 */
	EReference getItemAwareElement_DataState();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ItemAwareElement#getItemSubjectRef <em>Item Subject Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Subject Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ItemAwareElement#getItemSubjectRef()
	 * @see #getItemAwareElement()
	 * @generated
	 */
	EReference getItemAwareElement_ItemSubjectRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ItemDefinition <em>Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ItemDefinition
	 * @generated
	 */
	EClass getItemDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ItemDefinition#isIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ItemDefinition#isIsCollection()
	 * @see #getItemDefinition()
	 * @generated
	 */
	EAttribute getItemDefinition_IsCollection();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ItemDefinition#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ItemDefinition#getImport()
	 * @see #getItemDefinition()
	 * @generated
	 */
	EReference getItemDefinition_Import();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ItemDefinition#getItemKind <em>Item Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Kind</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ItemDefinition#getItemKind()
	 * @see #getItemDefinition()
	 * @generated
	 */
	EAttribute getItemDefinition_ItemKind();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ItemDefinition#getStructureRef <em>Structure Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structure Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ItemDefinition#getStructureRef()
	 * @see #getItemDefinition()
	 * @generated
	 */
	EReference getItemDefinition_StructureRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Lane
	 * @generated
	 */
	EClass getLane();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.Lane#getPartitionElement <em>Partition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partition Element</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Lane#getPartitionElement()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_PartitionElement();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.Lane#getFlowNodeRefs <em>Flow Node Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flow Node Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Lane#getFlowNodeRefs()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_FlowNodeRefs();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.Lane#getChildLaneSet <em>Child Lane Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Lane Set</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Lane#getChildLaneSet()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_ChildLaneSet();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Lane#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Lane#getName()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_Name();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.Lane#getPartitionElementRef <em>Partition Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partition Element Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Lane#getPartitionElementRef()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_PartitionElementRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.LaneSet <em>Lane Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane Set</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.LaneSet
	 * @generated
	 */
	EClass getLaneSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.LaneSet#getLanes <em>Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lanes</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.LaneSet#getLanes()
	 * @see #getLaneSet()
	 * @generated
	 */
	EReference getLaneSet_Lanes();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.LaneSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.LaneSet#getName()
	 * @see #getLaneSet()
	 * @generated
	 */
	EAttribute getLaneSet_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.LinkEventDefinition <em>Link Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.LinkEventDefinition
	 * @generated
	 */
	EClass getLinkEventDefinition();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.LinkEventDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.LinkEventDefinition#getSource()
	 * @see #getLinkEventDefinition()
	 * @generated
	 */
	EReference getLinkEventDefinition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.LinkEventDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.LinkEventDefinition#getTarget()
	 * @see #getLinkEventDefinition()
	 * @generated
	 */
	EReference getLinkEventDefinition_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.LinkEventDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.LinkEventDefinition#getName()
	 * @see #getLinkEventDefinition()
	 * @generated
	 */
	EAttribute getLinkEventDefinition_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.LoopCharacteristics <em>Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Characteristics</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.LoopCharacteristics
	 * @generated
	 */
	EClass getLoopCharacteristics();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ManualTask <em>Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ManualTask
	 * @generated
	 */
	EClass getManualTask();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.Message#getItemRef <em>Item Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Message#getItemRef()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_ItemRef();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.MessageEventDefinition <em>Message Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MessageEventDefinition
	 * @generated
	 */
	EClass getMessageEventDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.MessageEventDefinition#getOperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MessageEventDefinition#getOperationRef()
	 * @see #getMessageEventDefinition()
	 * @generated
	 */
	EReference getMessageEventDefinition_OperationRef();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.MessageEventDefinition#getMessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MessageEventDefinition#getMessageRef()
	 * @see #getMessageEventDefinition()
	 * @generated
	 */
	EReference getMessageEventDefinition_MessageRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.MessageFlow <em>Message Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Flow</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MessageFlow
	 * @generated
	 */
	EClass getMessageFlow();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.MessageFlow#getMessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MessageFlow#getMessageRef()
	 * @see #getMessageFlow()
	 * @generated
	 */
	EReference getMessageFlow_MessageRef();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.MessageFlow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MessageFlow#getName()
	 * @see #getMessageFlow()
	 * @generated
	 */
	EAttribute getMessageFlow_Name();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.MessageFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MessageFlow#getSourceRef()
	 * @see #getMessageFlow()
	 * @generated
	 */
	EReference getMessageFlow_SourceRef();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.MessageFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MessageFlow#getTargetRef()
	 * @see #getMessageFlow()
	 * @generated
	 */
	EReference getMessageFlow_TargetRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.MessageFlowAssociation <em>Message Flow Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Flow Association</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MessageFlowAssociation
	 * @generated
	 */
	EClass getMessageFlowAssociation();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.MessageFlowAssociation#getInnerMessageFlowRef <em>Inner Message Flow Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Message Flow Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MessageFlowAssociation#getInnerMessageFlowRef()
	 * @see #getMessageFlowAssociation()
	 * @generated
	 */
	EReference getMessageFlowAssociation_InnerMessageFlowRef();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.MessageFlowAssociation#getOuterMessageFlowRef <em>Outer Message Flow Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Message Flow Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MessageFlowAssociation#getOuterMessageFlowRef()
	 * @see #getMessageFlowAssociation()
	 * @generated
	 */
	EReference getMessageFlowAssociation_OuterMessageFlowRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Monitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Monitoring
	 * @generated
	 */
	EClass getMonitoring();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Instance Loop Characteristics</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics
	 * @generated
	 */
	EClass getMultiInstanceLoopCharacteristics();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getLoopCardinality <em>Loop Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Cardinality</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getLoopCardinality()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_LoopCardinality();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getLoopDataInputRef <em>Loop Data Input Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loop Data Input Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getLoopDataInputRef()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_LoopDataInputRef();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getLoopDataOutputRef <em>Loop Data Output Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loop Data Output Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getLoopDataOutputRef()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_LoopDataOutputRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getInputDataItem <em>Input Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Data Item</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getInputDataItem()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_InputDataItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getOutputDataItem <em>Output Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Data Item</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getOutputDataItem()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_OutputDataItem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Behavior Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getComplexBehaviorDefinition()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_ComplexBehaviorDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getCompletionCondition <em>Completion Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Completion Condition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getCompletionCondition()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_CompletionCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getBehavior()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EAttribute getMultiInstanceLoopCharacteristics_Behavior();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#isIsSequential <em>Is Sequential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Sequential</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#isIsSequential()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EAttribute getMultiInstanceLoopCharacteristics_IsSequential();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getNoneBehaviorEventRef <em>None Behavior Event Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>None Behavior Event Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getNoneBehaviorEventRef()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_NoneBehaviorEventRef();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getOneBehaviorEventRef <em>One Behavior Event Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>One Behavior Event Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics#getOneBehaviorEventRef()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_OneBehaviorEventRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.Operation#getInMessageRef <em>In Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Message Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Operation#getInMessageRef()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_InMessageRef();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.Operation#getOutMessageRef <em>Out Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Message Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Operation#getOutMessageRef()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_OutMessageRef();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.Operation#getErrorRefs <em>Error Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Operation#getErrorRefs()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ErrorRefs();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.Operation#getImplementationRef <em>Implementation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Operation#getImplementationRef()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ImplementationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.OutputSet <em>Output Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Set</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.OutputSet
	 * @generated
	 */
	EClass getOutputSet();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.OutputSet#getDataOutputRefs <em>Data Output Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Output Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.OutputSet#getDataOutputRefs()
	 * @see #getOutputSet()
	 * @generated
	 */
	EReference getOutputSet_DataOutputRefs();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.OutputSet#getOptionalOutputRefs <em>Optional Output Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Optional Output Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.OutputSet#getOptionalOutputRefs()
	 * @see #getOutputSet()
	 * @generated
	 */
	EReference getOutputSet_OptionalOutputRefs();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.OutputSet#getWhileExecutingOutputRefs <em>While Executing Output Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>While Executing Output Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.OutputSet#getWhileExecutingOutputRefs()
	 * @see #getOutputSet()
	 * @generated
	 */
	EReference getOutputSet_WhileExecutingOutputRefs();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.OutputSet#getInputSetRefs <em>Input Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Set Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.OutputSet#getInputSetRefs()
	 * @see #getOutputSet()
	 * @generated
	 */
	EReference getOutputSet_InputSetRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.OutputSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.OutputSet#getName()
	 * @see #getOutputSet()
	 * @generated
	 */
	EAttribute getOutputSet_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ParallelGateway <em>Parallel Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Gateway</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ParallelGateway
	 * @generated
	 */
	EClass getParallelGateway();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.Participant#getInterfaceRefs <em>Interface Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Participant#getInterfaceRefs()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_InterfaceRefs();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.Participant#getEndPointRefs <em>End Point Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Point Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Participant#getEndPointRefs()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_EndPointRefs();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.Participant#getParticipantMultiplicity <em>Participant Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Participant Multiplicity</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Participant#getParticipantMultiplicity()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_ParticipantMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Participant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Participant#getName()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Name();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.Participant#getProcessRef <em>Process Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Participant#getProcessRef()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_ProcessRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ParticipantAssociation <em>Participant Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Association</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ParticipantAssociation
	 * @generated
	 */
	EClass getParticipantAssociation();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ParticipantAssociation#getInnerParticipantRef <em>Inner Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Participant Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ParticipantAssociation#getInnerParticipantRef()
	 * @see #getParticipantAssociation()
	 * @generated
	 */
	EReference getParticipantAssociation_InnerParticipantRef();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ParticipantAssociation#getOuterParticipantRef <em>Outer Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Participant Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ParticipantAssociation#getOuterParticipantRef()
	 * @see #getParticipantAssociation()
	 * @generated
	 */
	EReference getParticipantAssociation_OuterParticipantRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ParticipantMultiplicity <em>Participant Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Multiplicity</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ParticipantMultiplicity
	 * @generated
	 */
	EClass getParticipantMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ParticipantMultiplicity#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ParticipantMultiplicity#getMaximum()
	 * @see #getParticipantMultiplicity()
	 * @generated
	 */
	EAttribute getParticipantMultiplicity_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ParticipantMultiplicity#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ParticipantMultiplicity#getMinimum()
	 * @see #getParticipantMultiplicity()
	 * @generated
	 */
	EAttribute getParticipantMultiplicity_Minimum();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.PartnerEntity <em>Partner Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partner Entity</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.PartnerEntity
	 * @generated
	 */
	EClass getPartnerEntity();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.PartnerEntity#getParticipantRef <em>Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.PartnerEntity#getParticipantRef()
	 * @see #getPartnerEntity()
	 * @generated
	 */
	EReference getPartnerEntity_ParticipantRef();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.PartnerEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.PartnerEntity#getName()
	 * @see #getPartnerEntity()
	 * @generated
	 */
	EAttribute getPartnerEntity_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.PartnerRole <em>Partner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partner Role</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.PartnerRole
	 * @generated
	 */
	EClass getPartnerRole();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.PartnerRole#getParticipantRef <em>Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.PartnerRole#getParticipantRef()
	 * @see #getPartnerRole()
	 * @generated
	 */
	EReference getPartnerRole_ParticipantRef();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.PartnerRole#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.PartnerRole#getName()
	 * @see #getPartnerRole()
	 * @generated
	 */
	EAttribute getPartnerRole_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Performer <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performer</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Performer
	 * @generated
	 */
	EClass getPerformer();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.PotentialOwner <em>Potential Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potential Owner</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.PotentialOwner
	 * @generated
	 */
	EClass getPotentialOwner();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.Process#getAuditing <em>Auditing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditing</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Process#getAuditing()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Auditing();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.Process#getMonitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monitoring</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Process#getMonitoring()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Monitoring();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Process#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Process#getProperties()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Process#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Process#getArtifacts()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Artifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Process#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Process#getResources()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Process#getCorrelationSubscriptions <em>Correlation Subscriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Subscriptions</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Process#getCorrelationSubscriptions()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_CorrelationSubscriptions();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.Process#getSupports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supports</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Process#getSupports()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Supports();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.Process#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definitional Collaboration Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Process#getDefinitionalCollaborationRef()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_DefinitionalCollaborationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Process#isIsClosed <em>Is Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Closed</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Process#isIsClosed()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_IsClosed();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Process#isIsExecutable <em>Is Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Executable</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Process#isIsExecutable()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_IsExecutable();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Process#getProcessType <em>Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Type</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Process#getProcessType()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_ProcessType();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ReceiveTask <em>Receive Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ReceiveTask
	 * @generated
	 */
	EClass getReceiveTask();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ReceiveTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ReceiveTask#getImplementation()
	 * @see #getReceiveTask()
	 * @generated
	 */
	EAttribute getReceiveTask_Implementation();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ReceiveTask#isInstantiate <em>Instantiate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instantiate</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ReceiveTask#isInstantiate()
	 * @see #getReceiveTask()
	 * @generated
	 */
	EAttribute getReceiveTask_Instantiate();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ReceiveTask#getMessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ReceiveTask#getMessageRef()
	 * @see #getReceiveTask()
	 * @generated
	 */
	EReference getReceiveTask_MessageRef();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ReceiveTask#getOperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ReceiveTask#getOperationRef()
	 * @see #getReceiveTask()
	 * @generated
	 */
	EReference getReceiveTask_OperationRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.Relationship#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sources</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Relationship#getSources()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Sources();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.Relationship#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Relationship#getTargets()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Targets();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Relationship#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Relationship#getDirection()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Relationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Relationship#getType()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Type();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Rendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rendering</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Rendering
	 * @generated
	 */
	EClass getRendering();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.Resource#getResourceParameters <em>Resource Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Parameters</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Resource#getResourceParameters()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ResourceParameters();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ResourceAssignmentExpression <em>Resource Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Assignment Expression</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceAssignmentExpression
	 * @generated
	 */
	EClass getResourceAssignmentExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.ResourceAssignmentExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceAssignmentExpression#getExpression()
	 * @see #getResourceAssignmentExpression()
	 * @generated
	 */
	EReference getResourceAssignmentExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ResourceParameter <em>Resource Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Parameter</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceParameter
	 * @generated
	 */
	EClass getResourceParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ResourceParameter#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceParameter#isIsRequired()
	 * @see #getResourceParameter()
	 * @generated
	 */
	EAttribute getResourceParameter_IsRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ResourceParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceParameter#getName()
	 * @see #getResourceParameter()
	 * @generated
	 */
	EAttribute getResourceParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ResourceParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceParameter#getType()
	 * @see #getResourceParameter()
	 * @generated
	 */
	EReference getResourceParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ResourceParameterBinding <em>Resource Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Parameter Binding</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceParameterBinding
	 * @generated
	 */
	EClass getResourceParameterBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.ResourceParameterBinding#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceParameterBinding#getExpression()
	 * @see #getResourceParameterBinding()
	 * @generated
	 */
	EReference getResourceParameterBinding_Expression();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ResourceParameterBinding#getParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceParameterBinding#getParameterRef()
	 * @see #getResourceParameterBinding()
	 * @generated
	 */
	EReference getResourceParameterBinding_ParameterRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Role</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceRole
	 * @generated
	 */
	EClass getResourceRole();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ResourceRole#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceRole#getResourceRef()
	 * @see #getResourceRole()
	 * @generated
	 */
	EReference getResourceRole_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.ResourceRole#getResourceParameterBindings <em>Resource Parameter Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Parameter Bindings</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceRole#getResourceParameterBindings()
	 * @see #getResourceRole()
	 * @generated
	 */
	EReference getResourceRole_ResourceParameterBindings();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.ResourceRole#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Assignment Expression</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceRole#getResourceAssignmentExpression()
	 * @see #getResourceRole()
	 * @generated
	 */
	EReference getResourceRole_ResourceAssignmentExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ResourceRole#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceRole#getName()
	 * @see #getResourceRole()
	 * @generated
	 */
	EAttribute getResourceRole_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.RootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Element</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.RootElement
	 * @generated
	 */
	EClass getRootElement();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ScriptTask <em>Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ScriptTask
	 * @generated
	 */
	EClass getScriptTask();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ScriptTask#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ScriptTask#getScript()
	 * @see #getScriptTask()
	 * @generated
	 */
	EAttribute getScriptTask_Script();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ScriptTask#getScriptFormat <em>Script Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Format</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ScriptTask#getScriptFormat()
	 * @see #getScriptTask()
	 * @generated
	 */
	EAttribute getScriptTask_ScriptFormat();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.SendTask <em>Send Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SendTask
	 * @generated
	 */
	EClass getSendTask();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.SendTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SendTask#getImplementation()
	 * @see #getSendTask()
	 * @generated
	 */
	EAttribute getSendTask_Implementation();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.SendTask#getMessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SendTask#getMessageRef()
	 * @see #getSendTask()
	 * @generated
	 */
	EReference getSendTask_MessageRef();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.SendTask#getOperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SendTask#getOperationRef()
	 * @see #getSendTask()
	 * @generated
	 */
	EReference getSendTask_OperationRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Flow</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SequenceFlow
	 * @generated
	 */
	EClass getSequenceFlow();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.SequenceFlow#getConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Expression</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SequenceFlow#getConditionExpression()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_ConditionExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.SequenceFlow#isIsImmediate <em>Is Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Immediate</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SequenceFlow#isIsImmediate()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EAttribute getSequenceFlow_IsImmediate();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SequenceFlow#getSourceRef()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_SourceRef();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SequenceFlow#getTargetRef()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_TargetRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ServiceTask <em>Service Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ServiceTask
	 * @generated
	 */
	EClass getServiceTask();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.ServiceTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ServiceTask#getImplementation()
	 * @see #getServiceTask()
	 * @generated
	 */
	EAttribute getServiceTask_Implementation();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.ServiceTask#getOperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ServiceTask#getOperationRef()
	 * @see #getServiceTask()
	 * @generated
	 */
	EReference getServiceTask_OperationRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Signal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Signal#getName()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Name();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.Signal#getStructureRef <em>Structure Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structure Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Signal#getStructureRef()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_StructureRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.SignalEventDefinition <em>Signal Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SignalEventDefinition
	 * @generated
	 */
	EClass getSignalEventDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.BPMN2Model.SignalEventDefinition#getSignalRef <em>Signal Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Ref</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SignalEventDefinition#getSignalRef()
	 * @see #getSignalEventDefinition()
	 * @generated
	 */
	EReference getSignalEventDefinition_SignalRef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.StandardLoopCharacteristics <em>Standard Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Loop Characteristics</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.StandardLoopCharacteristics
	 * @generated
	 */
	EClass getStandardLoopCharacteristics();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.StandardLoopCharacteristics#getLoopCondition <em>Loop Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Condition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.StandardLoopCharacteristics#getLoopCondition()
	 * @see #getStandardLoopCharacteristics()
	 * @generated
	 */
	EReference getStandardLoopCharacteristics_LoopCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.StandardLoopCharacteristics#getLoopMaximum <em>Loop Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Maximum</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.StandardLoopCharacteristics#getLoopMaximum()
	 * @see #getStandardLoopCharacteristics()
	 * @generated
	 */
	EReference getStandardLoopCharacteristics_LoopMaximum();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.StandardLoopCharacteristics#isTestBefore <em>Test Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Before</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.StandardLoopCharacteristics#isTestBefore()
	 * @see #getStandardLoopCharacteristics()
	 * @generated
	 */
	EAttribute getStandardLoopCharacteristics_TestBefore();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.StartEvent
	 * @generated
	 */
	EClass getStartEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.StartEvent#isIsInterrupting <em>Is Interrupting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Interrupting</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.StartEvent#isIsInterrupting()
	 * @see #getStartEvent()
	 * @generated
	 */
	EAttribute getStartEvent_IsInterrupting();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.SubChoreography <em>Sub Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Choreography</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SubChoreography
	 * @generated
	 */
	EClass getSubChoreography();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.SubChoreography#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SubChoreography#getArtifacts()
	 * @see #getSubChoreography()
	 * @generated
	 */
	EReference getSubChoreography_Artifacts();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.SubConversation <em>Sub Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Conversation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SubConversation
	 * @generated
	 */
	EClass getSubConversation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.SubConversation#getConversationNodes <em>Conversation Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conversation Nodes</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SubConversation#getConversationNodes()
	 * @see #getSubConversation()
	 * @generated
	 */
	EReference getSubConversation_ConversationNodes();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.SubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Process</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SubProcess
	 * @generated
	 */
	EClass getSubProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.SubProcess#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SubProcess#getArtifacts()
	 * @see #getSubProcess()
	 * @generated
	 */
	EReference getSubProcess_Artifacts();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.SubProcess#isTriggeredByEvent <em>Triggered By Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Triggered By Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.SubProcess#isTriggeredByEvent()
	 * @see #getSubProcess()
	 * @generated
	 */
	EAttribute getSubProcess_TriggeredByEvent();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.TerminateEventDefinition <em>Terminate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminate Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.TerminateEventDefinition
	 * @generated
	 */
	EClass getTerminateEventDefinition();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.TextAnnotation <em>Text Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Annotation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.TextAnnotation
	 * @generated
	 */
	EClass getTextAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.TextAnnotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.TextAnnotation#getText()
	 * @see #getTextAnnotation()
	 * @generated
	 */
	EAttribute getTextAnnotation_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.TextAnnotation#getTextFormat <em>Text Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Format</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.TextAnnotation#getTextFormat()
	 * @see #getTextAnnotation()
	 * @generated
	 */
	EAttribute getTextAnnotation_TextFormat();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.ThrowEvent <em>Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw Event</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ThrowEvent
	 * @generated
	 */
	EClass getThrowEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.ThrowEvent#getDataInputs <em>Data Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Inputs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ThrowEvent#getDataInputs()
	 * @see #getThrowEvent()
	 * @generated
	 */
	EReference getThrowEvent_DataInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.ThrowEvent#getDataInputAssociation <em>Data Input Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Input Association</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ThrowEvent#getDataInputAssociation()
	 * @see #getThrowEvent()
	 * @generated
	 */
	EReference getThrowEvent_DataInputAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.ThrowEvent#getInputSet <em>Input Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Set</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ThrowEvent#getInputSet()
	 * @see #getThrowEvent()
	 * @generated
	 */
	EReference getThrowEvent_InputSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.ThrowEvent#getEventDefinitions <em>Event Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Definitions</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ThrowEvent#getEventDefinitions()
	 * @see #getThrowEvent()
	 * @generated
	 */
	EReference getThrowEvent_EventDefinitions();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.BPMN2Model.ThrowEvent#getEventDefinitionRefs <em>Event Definition Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event Definition Refs</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ThrowEvent#getEventDefinitionRefs()
	 * @see #getThrowEvent()
	 * @generated
	 */
	EReference getThrowEvent_EventDefinitionRefs();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.TimerEventDefinition <em>Timer Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Event Definition</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.TimerEventDefinition
	 * @generated
	 */
	EClass getTimerEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.TimerEventDefinition#getTimeDate <em>Time Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Date</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.TimerEventDefinition#getTimeDate()
	 * @see #getTimerEventDefinition()
	 * @generated
	 */
	EReference getTimerEventDefinition_TimeDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.TimerEventDefinition#getTimeDuration <em>Time Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Duration</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.TimerEventDefinition#getTimeDuration()
	 * @see #getTimerEventDefinition()
	 * @generated
	 */
	EReference getTimerEventDefinition_TimeDuration();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.BPMN2Model.TimerEventDefinition#getTimeCycle <em>Time Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Cycle</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.TimerEventDefinition#getTimeCycle()
	 * @see #getTimerEventDefinition()
	 * @generated
	 */
	EReference getTimerEventDefinition_TimeCycle();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Transaction#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Transaction#getProtocol()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.Transaction#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.Transaction#getMethod()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Method();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Task</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.UserTask
	 * @generated
	 */
	EClass getUserTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.BPMN2Model.UserTask#getRenderings <em>Renderings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Renderings</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.UserTask#getRenderings()
	 * @see #getUserTask()
	 * @generated
	 */
	EReference getUserTask_Renderings();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.BPMN2Model.UserTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.UserTask#getImplementation()
	 * @see #getUserTask()
	 * @generated
	 */
	EAttribute getUserTask_Implementation();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.BPMN2Model.BPMNBase <em>BPMN Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPMN Base</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.BPMNBase
	 * @generated
	 */
	EClass getBPMNBase();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.BPMN2Model.AdHocOrdering <em>Ad Hoc Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ad Hoc Ordering</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.AdHocOrdering
	 * @generated
	 */
	EEnum getAdHocOrdering();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.BPMN2Model.AssociationDirection <em>Association Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Association Direction</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.AssociationDirection
	 * @generated
	 */
	EEnum getAssociationDirection();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.BPMN2Model.ChoreographyLoopType <em>Choreography Loop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Choreography Loop Type</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ChoreographyLoopType
	 * @generated
	 */
	EEnum getChoreographyLoopType();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.BPMN2Model.EventBasedGatewayType <em>Event Based Gateway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Based Gateway Type</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.EventBasedGatewayType
	 * @generated
	 */
	EEnum getEventBasedGatewayType();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.BPMN2Model.GatewayDirection <em>Gateway Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gateway Direction</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.GatewayDirection
	 * @generated
	 */
	EEnum getGatewayDirection();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.BPMN2Model.ItemKind <em>Item Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Item Kind</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ItemKind
	 * @generated
	 */
	EEnum getItemKind();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.BPMN2Model.MultiInstanceBehavior <em>Multi Instance Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multi Instance Behavior</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.MultiInstanceBehavior
	 * @generated
	 */
	EEnum getMultiInstanceBehavior();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.BPMN2Model.ProcessType <em>Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Type</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.ProcessType
	 * @generated
	 */
	EEnum getProcessType();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.BPMN2Model.RelationshipDirection <em>Relationship Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Direction</em>'.
	 * @see org.emftrace.metamodel.BPMN2Model.RelationshipDirection
	 * @generated
	 */
	EEnum getRelationshipDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BPMN2ModelFactory getBPMN2ModelFactory();

} //BPMN2ModelPackage
