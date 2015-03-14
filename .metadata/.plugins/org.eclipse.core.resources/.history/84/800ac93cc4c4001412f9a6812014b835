/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftrace.metamodel.BPMN2Model.Activity;
import org.emftrace.metamodel.BPMN2Model.AdHocOrdering;
import org.emftrace.metamodel.BPMN2Model.AdHocSubProcess;
import org.emftrace.metamodel.BPMN2Model.Artifact;
import org.emftrace.metamodel.BPMN2Model.Assignment;
import org.emftrace.metamodel.BPMN2Model.Association;
import org.emftrace.metamodel.BPMN2Model.AssociationDirection;
import org.emftrace.metamodel.BPMN2Model.Auditing;
import org.emftrace.metamodel.BPMN2Model.BPMN2ModelFactory;
import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.BaseElement;
import org.emftrace.metamodel.BPMN2Model.BoundaryEvent;
import org.emftrace.metamodel.BPMN2Model.BusinessRuleTask;
import org.emftrace.metamodel.BPMN2Model.CallActivity;
import org.emftrace.metamodel.BPMN2Model.CallChoreography;
import org.emftrace.metamodel.BPMN2Model.CallConversation;
import org.emftrace.metamodel.BPMN2Model.CallableElement;
import org.emftrace.metamodel.BPMN2Model.CancelEventDefinition;
import org.emftrace.metamodel.BPMN2Model.Category;
import org.emftrace.metamodel.BPMN2Model.CategoryValue;
import org.emftrace.metamodel.BPMN2Model.Choreography;
import org.emftrace.metamodel.BPMN2Model.ChoreographyLoopType;
import org.emftrace.metamodel.BPMN2Model.ChoreographyTask;
import org.emftrace.metamodel.BPMN2Model.Collaboration;
import org.emftrace.metamodel.BPMN2Model.CompensateEventDefinition;
import org.emftrace.metamodel.BPMN2Model.ComplexBehaviorDefinition;
import org.emftrace.metamodel.BPMN2Model.ComplexGateway;
import org.emftrace.metamodel.BPMN2Model.ConditionalEventDefinition;
import org.emftrace.metamodel.BPMN2Model.Conversation;
import org.emftrace.metamodel.BPMN2Model.ConversationAssociation;
import org.emftrace.metamodel.BPMN2Model.ConversationLink;
import org.emftrace.metamodel.BPMN2Model.ConversationNode;
import org.emftrace.metamodel.BPMN2Model.CorrelationKey;
import org.emftrace.metamodel.BPMN2Model.CorrelationProperty;
import org.emftrace.metamodel.BPMN2Model.CorrelationPropertyBinding;
import org.emftrace.metamodel.BPMN2Model.CorrelationPropertyRetrievalExpression;
import org.emftrace.metamodel.BPMN2Model.CorrelationSubscription;
import org.emftrace.metamodel.BPMN2Model.DataAssociation;
import org.emftrace.metamodel.BPMN2Model.DataInput;
import org.emftrace.metamodel.BPMN2Model.DataInputAssociation;
import org.emftrace.metamodel.BPMN2Model.DataObject;
import org.emftrace.metamodel.BPMN2Model.DataObjectReference;
import org.emftrace.metamodel.BPMN2Model.DataOutput;
import org.emftrace.metamodel.BPMN2Model.DataOutputAssociation;
import org.emftrace.metamodel.BPMN2Model.DataState;
import org.emftrace.metamodel.BPMN2Model.DataStore;
import org.emftrace.metamodel.BPMN2Model.DataStoreReference;
import org.emftrace.metamodel.BPMN2Model.Definitions;
import org.emftrace.metamodel.BPMN2Model.DocumentRoot;
import org.emftrace.metamodel.BPMN2Model.Documentation;
import org.emftrace.metamodel.BPMN2Model.EndEvent;
import org.emftrace.metamodel.BPMN2Model.EndPoint;
import org.emftrace.metamodel.BPMN2Model.ErrorEventDefinition;
import org.emftrace.metamodel.BPMN2Model.Escalation;
import org.emftrace.metamodel.BPMN2Model.EscalationEventDefinition;
import org.emftrace.metamodel.BPMN2Model.EventBasedGateway;
import org.emftrace.metamodel.BPMN2Model.EventBasedGatewayType;
import org.emftrace.metamodel.BPMN2Model.EventDefinition;
import org.emftrace.metamodel.BPMN2Model.ExclusiveGateway;
import org.emftrace.metamodel.BPMN2Model.Expression;
import org.emftrace.metamodel.BPMN2Model.Extension;
import org.emftrace.metamodel.BPMN2Model.ExtensionAttributeDefinition;
import org.emftrace.metamodel.BPMN2Model.ExtensionAttributeValue;
import org.emftrace.metamodel.BPMN2Model.ExtensionDefinition;
import org.emftrace.metamodel.BPMN2Model.FormalExpression;
import org.emftrace.metamodel.BPMN2Model.GatewayDirection;
import org.emftrace.metamodel.BPMN2Model.GlobalBusinessRuleTask;
import org.emftrace.metamodel.BPMN2Model.GlobalChoreographyTask;
import org.emftrace.metamodel.BPMN2Model.GlobalConversation;
import org.emftrace.metamodel.BPMN2Model.GlobalManualTask;
import org.emftrace.metamodel.BPMN2Model.GlobalScriptTask;
import org.emftrace.metamodel.BPMN2Model.GlobalTask;
import org.emftrace.metamodel.BPMN2Model.GlobalUserTask;
import org.emftrace.metamodel.BPMN2Model.Group;
import org.emftrace.metamodel.BPMN2Model.HumanPerformer;
import org.emftrace.metamodel.BPMN2Model.ImplicitThrowEvent;
import org.emftrace.metamodel.BPMN2Model.Import;
import org.emftrace.metamodel.BPMN2Model.InclusiveGateway;
import org.emftrace.metamodel.BPMN2Model.InputOutputBinding;
import org.emftrace.metamodel.BPMN2Model.InputOutputSpecification;
import org.emftrace.metamodel.BPMN2Model.InputSet;
import org.emftrace.metamodel.BPMN2Model.InteractionNode;
import org.emftrace.metamodel.BPMN2Model.Interface;
import org.emftrace.metamodel.BPMN2Model.IntermediateCatchEvent;
import org.emftrace.metamodel.BPMN2Model.IntermediateThrowEvent;
import org.emftrace.metamodel.BPMN2Model.ItemAwareElement;
import org.emftrace.metamodel.BPMN2Model.ItemDefinition;
import org.emftrace.metamodel.BPMN2Model.ItemKind;
import org.emftrace.metamodel.BPMN2Model.Lane;
import org.emftrace.metamodel.BPMN2Model.LaneSet;
import org.emftrace.metamodel.BPMN2Model.LinkEventDefinition;
import org.emftrace.metamodel.BPMN2Model.ManualTask;
import org.emftrace.metamodel.BPMN2Model.Message;
import org.emftrace.metamodel.BPMN2Model.MessageEventDefinition;
import org.emftrace.metamodel.BPMN2Model.MessageFlow;
import org.emftrace.metamodel.BPMN2Model.MessageFlowAssociation;
import org.emftrace.metamodel.BPMN2Model.Monitoring;
import org.emftrace.metamodel.BPMN2Model.MultiInstanceBehavior;
import org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics;
import org.emftrace.metamodel.BPMN2Model.Operation;
import org.emftrace.metamodel.BPMN2Model.OutputSet;
import org.emftrace.metamodel.BPMN2Model.ParallelGateway;
import org.emftrace.metamodel.BPMN2Model.Participant;
import org.emftrace.metamodel.BPMN2Model.ParticipantAssociation;
import org.emftrace.metamodel.BPMN2Model.ParticipantMultiplicity;
import org.emftrace.metamodel.BPMN2Model.PartnerEntity;
import org.emftrace.metamodel.BPMN2Model.PartnerRole;
import org.emftrace.metamodel.BPMN2Model.Performer;
import org.emftrace.metamodel.BPMN2Model.PotentialOwner;
import org.emftrace.metamodel.BPMN2Model.ProcessType;
import org.emftrace.metamodel.BPMN2Model.Property;
import org.emftrace.metamodel.BPMN2Model.ReceiveTask;
import org.emftrace.metamodel.BPMN2Model.Relationship;
import org.emftrace.metamodel.BPMN2Model.RelationshipDirection;
import org.emftrace.metamodel.BPMN2Model.Rendering;
import org.emftrace.metamodel.BPMN2Model.Resource;
import org.emftrace.metamodel.BPMN2Model.ResourceAssignmentExpression;
import org.emftrace.metamodel.BPMN2Model.ResourceParameter;
import org.emftrace.metamodel.BPMN2Model.ResourceParameterBinding;
import org.emftrace.metamodel.BPMN2Model.ResourceRole;
import org.emftrace.metamodel.BPMN2Model.RootElement;
import org.emftrace.metamodel.BPMN2Model.ScriptTask;
import org.emftrace.metamodel.BPMN2Model.SendTask;
import org.emftrace.metamodel.BPMN2Model.SequenceFlow;
import org.emftrace.metamodel.BPMN2Model.ServiceTask;
import org.emftrace.metamodel.BPMN2Model.Signal;
import org.emftrace.metamodel.BPMN2Model.SignalEventDefinition;
import org.emftrace.metamodel.BPMN2Model.StandardLoopCharacteristics;
import org.emftrace.metamodel.BPMN2Model.StartEvent;
import org.emftrace.metamodel.BPMN2Model.SubChoreography;
import org.emftrace.metamodel.BPMN2Model.SubConversation;
import org.emftrace.metamodel.BPMN2Model.SubProcess;
import org.emftrace.metamodel.BPMN2Model.Task;
import org.emftrace.metamodel.BPMN2Model.TerminateEventDefinition;
import org.emftrace.metamodel.BPMN2Model.TextAnnotation;
import org.emftrace.metamodel.BPMN2Model.TimerEventDefinition;
import org.emftrace.metamodel.BPMN2Model.Transaction;
import org.emftrace.metamodel.BPMN2Model.UserTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMN2ModelFactoryImpl extends EFactoryImpl implements BPMN2ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BPMN2ModelFactory init() {
		try {
			BPMN2ModelFactory theBPMN2ModelFactory = (BPMN2ModelFactory)EPackage.Registry.INSTANCE.getEFactory(BPMN2ModelPackage.eNS_URI);
			if (theBPMN2ModelFactory != null) {
				return theBPMN2ModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BPMN2ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN2ModelFactoryImpl() {
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
			case BPMN2ModelPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case BPMN2ModelPackage.ACTIVITY: return createActivity();
			case BPMN2ModelPackage.AD_HOC_SUB_PROCESS: return createAdHocSubProcess();
			case BPMN2ModelPackage.ARTIFACT: return createArtifact();
			case BPMN2ModelPackage.ASSIGNMENT: return createAssignment();
			case BPMN2ModelPackage.ASSOCIATION: return createAssociation();
			case BPMN2ModelPackage.AUDITING: return createAuditing();
			case BPMN2ModelPackage.BASE_ELEMENT: return createBaseElement();
			case BPMN2ModelPackage.BOUNDARY_EVENT: return createBoundaryEvent();
			case BPMN2ModelPackage.BUSINESS_RULE_TASK: return createBusinessRuleTask();
			case BPMN2ModelPackage.CALL_ACTIVITY: return createCallActivity();
			case BPMN2ModelPackage.CALL_CHOREOGRAPHY: return createCallChoreography();
			case BPMN2ModelPackage.CALL_CONVERSATION: return createCallConversation();
			case BPMN2ModelPackage.CALLABLE_ELEMENT: return createCallableElement();
			case BPMN2ModelPackage.CANCEL_EVENT_DEFINITION: return createCancelEventDefinition();
			case BPMN2ModelPackage.CATEGORY: return createCategory();
			case BPMN2ModelPackage.CATEGORY_VALUE: return createCategoryValue();
			case BPMN2ModelPackage.CHOREOGRAPHY: return createChoreography();
			case BPMN2ModelPackage.CHOREOGRAPHY_TASK: return createChoreographyTask();
			case BPMN2ModelPackage.COLLABORATION: return createCollaboration();
			case BPMN2ModelPackage.COMPENSATE_EVENT_DEFINITION: return createCompensateEventDefinition();
			case BPMN2ModelPackage.COMPLEX_BEHAVIOR_DEFINITION: return createComplexBehaviorDefinition();
			case BPMN2ModelPackage.COMPLEX_GATEWAY: return createComplexGateway();
			case BPMN2ModelPackage.CONDITIONAL_EVENT_DEFINITION: return createConditionalEventDefinition();
			case BPMN2ModelPackage.CONVERSATION: return createConversation();
			case BPMN2ModelPackage.CONVERSATION_ASSOCIATION: return createConversationAssociation();
			case BPMN2ModelPackage.CONVERSATION_LINK: return createConversationLink();
			case BPMN2ModelPackage.CONVERSATION_NODE: return createConversationNode();
			case BPMN2ModelPackage.CORRELATION_KEY: return createCorrelationKey();
			case BPMN2ModelPackage.CORRELATION_PROPERTY: return createCorrelationProperty();
			case BPMN2ModelPackage.CORRELATION_PROPERTY_BINDING: return createCorrelationPropertyBinding();
			case BPMN2ModelPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION: return createCorrelationPropertyRetrievalExpression();
			case BPMN2ModelPackage.CORRELATION_SUBSCRIPTION: return createCorrelationSubscription();
			case BPMN2ModelPackage.DATA_ASSOCIATION: return createDataAssociation();
			case BPMN2ModelPackage.DATA_INPUT: return createDataInput();
			case BPMN2ModelPackage.DATA_INPUT_ASSOCIATION: return createDataInputAssociation();
			case BPMN2ModelPackage.DATA_OBJECT: return createDataObject();
			case BPMN2ModelPackage.DATA_OBJECT_REFERENCE: return createDataObjectReference();
			case BPMN2ModelPackage.DATA_OUTPUT: return createDataOutput();
			case BPMN2ModelPackage.DATA_OUTPUT_ASSOCIATION: return createDataOutputAssociation();
			case BPMN2ModelPackage.DATA_STATE: return createDataState();
			case BPMN2ModelPackage.DATA_STORE: return createDataStore();
			case BPMN2ModelPackage.DATA_STORE_REFERENCE: return createDataStoreReference();
			case BPMN2ModelPackage.DEFINITIONS: return createDefinitions();
			case BPMN2ModelPackage.DOCUMENTATION: return createDocumentation();
			case BPMN2ModelPackage.END_EVENT: return createEndEvent();
			case BPMN2ModelPackage.END_POINT: return createEndPoint();
			case BPMN2ModelPackage.ERROR: return createError();
			case BPMN2ModelPackage.ERROR_EVENT_DEFINITION: return createErrorEventDefinition();
			case BPMN2ModelPackage.ESCALATION: return createEscalation();
			case BPMN2ModelPackage.ESCALATION_EVENT_DEFINITION: return createEscalationEventDefinition();
			case BPMN2ModelPackage.EVENT_BASED_GATEWAY: return createEventBasedGateway();
			case BPMN2ModelPackage.EVENT_DEFINITION: return createEventDefinition();
			case BPMN2ModelPackage.EXCLUSIVE_GATEWAY: return createExclusiveGateway();
			case BPMN2ModelPackage.EXPRESSION: return createExpression();
			case BPMN2ModelPackage.EXTENSION: return createExtension();
			case BPMN2ModelPackage.EXTENSION_ATTRIBUTE_DEFINITION: return createExtensionAttributeDefinition();
			case BPMN2ModelPackage.EXTENSION_ATTRIBUTE_VALUE: return createExtensionAttributeValue();
			case BPMN2ModelPackage.EXTENSION_DEFINITION: return createExtensionDefinition();
			case BPMN2ModelPackage.FORMAL_EXPRESSION: return createFormalExpression();
			case BPMN2ModelPackage.GLOBAL_BUSINESS_RULE_TASK: return createGlobalBusinessRuleTask();
			case BPMN2ModelPackage.GLOBAL_CHOREOGRAPHY_TASK: return createGlobalChoreographyTask();
			case BPMN2ModelPackage.GLOBAL_CONVERSATION: return createGlobalConversation();
			case BPMN2ModelPackage.GLOBAL_MANUAL_TASK: return createGlobalManualTask();
			case BPMN2ModelPackage.GLOBAL_SCRIPT_TASK: return createGlobalScriptTask();
			case BPMN2ModelPackage.GLOBAL_TASK: return createGlobalTask();
			case BPMN2ModelPackage.GLOBAL_USER_TASK: return createGlobalUserTask();
			case BPMN2ModelPackage.GROUP: return createGroup();
			case BPMN2ModelPackage.HUMAN_PERFORMER: return createHumanPerformer();
			case BPMN2ModelPackage.IMPLICIT_THROW_EVENT: return createImplicitThrowEvent();
			case BPMN2ModelPackage.IMPORT: return createImport();
			case BPMN2ModelPackage.INCLUSIVE_GATEWAY: return createInclusiveGateway();
			case BPMN2ModelPackage.INPUT_OUTPUT_BINDING: return createInputOutputBinding();
			case BPMN2ModelPackage.INPUT_OUTPUT_SPECIFICATION: return createInputOutputSpecification();
			case BPMN2ModelPackage.INPUT_SET: return createInputSet();
			case BPMN2ModelPackage.INTERACTION_NODE: return createInteractionNode();
			case BPMN2ModelPackage.INTERFACE: return createInterface();
			case BPMN2ModelPackage.INTERMEDIATE_CATCH_EVENT: return createIntermediateCatchEvent();
			case BPMN2ModelPackage.INTERMEDIATE_THROW_EVENT: return createIntermediateThrowEvent();
			case BPMN2ModelPackage.ITEM_AWARE_ELEMENT: return createItemAwareElement();
			case BPMN2ModelPackage.ITEM_DEFINITION: return createItemDefinition();
			case BPMN2ModelPackage.LANE: return createLane();
			case BPMN2ModelPackage.LANE_SET: return createLaneSet();
			case BPMN2ModelPackage.LINK_EVENT_DEFINITION: return createLinkEventDefinition();
			case BPMN2ModelPackage.MANUAL_TASK: return createManualTask();
			case BPMN2ModelPackage.MESSAGE: return createMessage();
			case BPMN2ModelPackage.MESSAGE_EVENT_DEFINITION: return createMessageEventDefinition();
			case BPMN2ModelPackage.MESSAGE_FLOW: return createMessageFlow();
			case BPMN2ModelPackage.MESSAGE_FLOW_ASSOCIATION: return createMessageFlowAssociation();
			case BPMN2ModelPackage.MONITORING: return createMonitoring();
			case BPMN2ModelPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS: return createMultiInstanceLoopCharacteristics();
			case BPMN2ModelPackage.OPERATION: return createOperation();
			case BPMN2ModelPackage.OUTPUT_SET: return createOutputSet();
			case BPMN2ModelPackage.PARALLEL_GATEWAY: return createParallelGateway();
			case BPMN2ModelPackage.PARTICIPANT: return createParticipant();
			case BPMN2ModelPackage.PARTICIPANT_ASSOCIATION: return createParticipantAssociation();
			case BPMN2ModelPackage.PARTICIPANT_MULTIPLICITY: return createParticipantMultiplicity();
			case BPMN2ModelPackage.PARTNER_ENTITY: return createPartnerEntity();
			case BPMN2ModelPackage.PARTNER_ROLE: return createPartnerRole();
			case BPMN2ModelPackage.PERFORMER: return createPerformer();
			case BPMN2ModelPackage.POTENTIAL_OWNER: return createPotentialOwner();
			case BPMN2ModelPackage.PROCESS: return createProcess();
			case BPMN2ModelPackage.PROPERTY: return createProperty();
			case BPMN2ModelPackage.RECEIVE_TASK: return createReceiveTask();
			case BPMN2ModelPackage.RELATIONSHIP: return createRelationship();
			case BPMN2ModelPackage.RENDERING: return createRendering();
			case BPMN2ModelPackage.RESOURCE: return createResource();
			case BPMN2ModelPackage.RESOURCE_ASSIGNMENT_EXPRESSION: return createResourceAssignmentExpression();
			case BPMN2ModelPackage.RESOURCE_PARAMETER: return createResourceParameter();
			case BPMN2ModelPackage.RESOURCE_PARAMETER_BINDING: return createResourceParameterBinding();
			case BPMN2ModelPackage.RESOURCE_ROLE: return createResourceRole();
			case BPMN2ModelPackage.ROOT_ELEMENT: return createRootElement();
			case BPMN2ModelPackage.SCRIPT_TASK: return createScriptTask();
			case BPMN2ModelPackage.SEND_TASK: return createSendTask();
			case BPMN2ModelPackage.SEQUENCE_FLOW: return createSequenceFlow();
			case BPMN2ModelPackage.SERVICE_TASK: return createServiceTask();
			case BPMN2ModelPackage.SIGNAL: return createSignal();
			case BPMN2ModelPackage.SIGNAL_EVENT_DEFINITION: return createSignalEventDefinition();
			case BPMN2ModelPackage.STANDARD_LOOP_CHARACTERISTICS: return createStandardLoopCharacteristics();
			case BPMN2ModelPackage.START_EVENT: return createStartEvent();
			case BPMN2ModelPackage.SUB_CHOREOGRAPHY: return createSubChoreography();
			case BPMN2ModelPackage.SUB_CONVERSATION: return createSubConversation();
			case BPMN2ModelPackage.SUB_PROCESS: return createSubProcess();
			case BPMN2ModelPackage.TASK: return createTask();
			case BPMN2ModelPackage.TERMINATE_EVENT_DEFINITION: return createTerminateEventDefinition();
			case BPMN2ModelPackage.TEXT_ANNOTATION: return createTextAnnotation();
			case BPMN2ModelPackage.TIMER_EVENT_DEFINITION: return createTimerEventDefinition();
			case BPMN2ModelPackage.TRANSACTION: return createTransaction();
			case BPMN2ModelPackage.USER_TASK: return createUserTask();
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
			case BPMN2ModelPackage.AD_HOC_ORDERING:
				return createAdHocOrderingFromString(eDataType, initialValue);
			case BPMN2ModelPackage.ASSOCIATION_DIRECTION:
				return createAssociationDirectionFromString(eDataType, initialValue);
			case BPMN2ModelPackage.CHOREOGRAPHY_LOOP_TYPE:
				return createChoreographyLoopTypeFromString(eDataType, initialValue);
			case BPMN2ModelPackage.EVENT_BASED_GATEWAY_TYPE:
				return createEventBasedGatewayTypeFromString(eDataType, initialValue);
			case BPMN2ModelPackage.GATEWAY_DIRECTION:
				return createGatewayDirectionFromString(eDataType, initialValue);
			case BPMN2ModelPackage.ITEM_KIND:
				return createItemKindFromString(eDataType, initialValue);
			case BPMN2ModelPackage.MULTI_INSTANCE_BEHAVIOR:
				return createMultiInstanceBehaviorFromString(eDataType, initialValue);
			case BPMN2ModelPackage.PROCESS_TYPE:
				return createProcessTypeFromString(eDataType, initialValue);
			case BPMN2ModelPackage.RELATIONSHIP_DIRECTION:
				return createRelationshipDirectionFromString(eDataType, initialValue);
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
			case BPMN2ModelPackage.AD_HOC_ORDERING:
				return convertAdHocOrderingToString(eDataType, instanceValue);
			case BPMN2ModelPackage.ASSOCIATION_DIRECTION:
				return convertAssociationDirectionToString(eDataType, instanceValue);
			case BPMN2ModelPackage.CHOREOGRAPHY_LOOP_TYPE:
				return convertChoreographyLoopTypeToString(eDataType, instanceValue);
			case BPMN2ModelPackage.EVENT_BASED_GATEWAY_TYPE:
				return convertEventBasedGatewayTypeToString(eDataType, instanceValue);
			case BPMN2ModelPackage.GATEWAY_DIRECTION:
				return convertGatewayDirectionToString(eDataType, instanceValue);
			case BPMN2ModelPackage.ITEM_KIND:
				return convertItemKindToString(eDataType, instanceValue);
			case BPMN2ModelPackage.MULTI_INSTANCE_BEHAVIOR:
				return convertMultiInstanceBehaviorToString(eDataType, instanceValue);
			case BPMN2ModelPackage.PROCESS_TYPE:
				return convertProcessTypeToString(eDataType, instanceValue);
			case BPMN2ModelPackage.RELATIONSHIP_DIRECTION:
				return convertRelationshipDirectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocSubProcess createAdHocSubProcess() {
		AdHocSubProcessImpl adHocSubProcess = new AdHocSubProcessImpl();
		return adHocSubProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auditing createAuditing() {
		AuditingImpl auditing = new AuditingImpl();
		return auditing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement createBaseElement() {
		BaseElementImpl baseElement = new BaseElementImpl();
		return baseElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryEvent createBoundaryEvent() {
		BoundaryEventImpl boundaryEvent = new BoundaryEventImpl();
		return boundaryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRuleTask createBusinessRuleTask() {
		BusinessRuleTaskImpl businessRuleTask = new BusinessRuleTaskImpl();
		return businessRuleTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallActivity createCallActivity() {
		CallActivityImpl callActivity = new CallActivityImpl();
		return callActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallChoreography createCallChoreography() {
		CallChoreographyImpl callChoreography = new CallChoreographyImpl();
		return callChoreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConversation createCallConversation() {
		CallConversationImpl callConversation = new CallConversationImpl();
		return callConversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallableElement createCallableElement() {
		CallableElementImpl callableElement = new CallableElementImpl();
		return callableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelEventDefinition createCancelEventDefinition() {
		CancelEventDefinitionImpl cancelEventDefinition = new CancelEventDefinitionImpl();
		return cancelEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryValue createCategoryValue() {
		CategoryValueImpl categoryValue = new CategoryValueImpl();
		return categoryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choreography createChoreography() {
		ChoreographyImpl choreography = new ChoreographyImpl();
		return choreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyTask createChoreographyTask() {
		ChoreographyTaskImpl choreographyTask = new ChoreographyTaskImpl();
		return choreographyTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration createCollaboration() {
		CollaborationImpl collaboration = new CollaborationImpl();
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensateEventDefinition createCompensateEventDefinition() {
		CompensateEventDefinitionImpl compensateEventDefinition = new CompensateEventDefinitionImpl();
		return compensateEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexBehaviorDefinition createComplexBehaviorDefinition() {
		ComplexBehaviorDefinitionImpl complexBehaviorDefinition = new ComplexBehaviorDefinitionImpl();
		return complexBehaviorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexGateway createComplexGateway() {
		ComplexGatewayImpl complexGateway = new ComplexGatewayImpl();
		return complexGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalEventDefinition createConditionalEventDefinition() {
		ConditionalEventDefinitionImpl conditionalEventDefinition = new ConditionalEventDefinitionImpl();
		return conditionalEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conversation createConversation() {
		ConversationImpl conversation = new ConversationImpl();
		return conversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationAssociation createConversationAssociation() {
		ConversationAssociationImpl conversationAssociation = new ConversationAssociationImpl();
		return conversationAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationLink createConversationLink() {
		ConversationLinkImpl conversationLink = new ConversationLinkImpl();
		return conversationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationNode createConversationNode() {
		ConversationNodeImpl conversationNode = new ConversationNodeImpl();
		return conversationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationKey createCorrelationKey() {
		CorrelationKeyImpl correlationKey = new CorrelationKeyImpl();
		return correlationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationProperty createCorrelationProperty() {
		CorrelationPropertyImpl correlationProperty = new CorrelationPropertyImpl();
		return correlationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationPropertyBinding createCorrelationPropertyBinding() {
		CorrelationPropertyBindingImpl correlationPropertyBinding = new CorrelationPropertyBindingImpl();
		return correlationPropertyBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationPropertyRetrievalExpression createCorrelationPropertyRetrievalExpression() {
		CorrelationPropertyRetrievalExpressionImpl correlationPropertyRetrievalExpression = new CorrelationPropertyRetrievalExpressionImpl();
		return correlationPropertyRetrievalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationSubscription createCorrelationSubscription() {
		CorrelationSubscriptionImpl correlationSubscription = new CorrelationSubscriptionImpl();
		return correlationSubscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAssociation createDataAssociation() {
		DataAssociationImpl dataAssociation = new DataAssociationImpl();
		return dataAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInput createDataInput() {
		DataInputImpl dataInput = new DataInputImpl();
		return dataInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInputAssociation createDataInputAssociation() {
		DataInputAssociationImpl dataInputAssociation = new DataInputAssociationImpl();
		return dataInputAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject createDataObject() {
		DataObjectImpl dataObject = new DataObjectImpl();
		return dataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectReference createDataObjectReference() {
		DataObjectReferenceImpl dataObjectReference = new DataObjectReferenceImpl();
		return dataObjectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutput createDataOutput() {
		DataOutputImpl dataOutput = new DataOutputImpl();
		return dataOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutputAssociation createDataOutputAssociation() {
		DataOutputAssociationImpl dataOutputAssociation = new DataOutputAssociationImpl();
		return dataOutputAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataState createDataState() {
		DataStateImpl dataState = new DataStateImpl();
		return dataState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStore createDataStore() {
		DataStoreImpl dataStore = new DataStoreImpl();
		return dataStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStoreReference createDataStoreReference() {
		DataStoreReferenceImpl dataStoreReference = new DataStoreReferenceImpl();
		return dataStoreReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definitions createDefinitions() {
		DefinitionsImpl definitions = new DefinitionsImpl();
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent createEndEvent() {
		EndEventImpl endEvent = new EndEventImpl();
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPoint createEndPoint() {
		EndPointImpl endPoint = new EndPointImpl();
		return endPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.emftrace.metamodel.BPMN2Model.Error createError() {
		ErrorImpl error = new ErrorImpl();
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorEventDefinition createErrorEventDefinition() {
		ErrorEventDefinitionImpl errorEventDefinition = new ErrorEventDefinitionImpl();
		return errorEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Escalation createEscalation() {
		EscalationImpl escalation = new EscalationImpl();
		return escalation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EscalationEventDefinition createEscalationEventDefinition() {
		EscalationEventDefinitionImpl escalationEventDefinition = new EscalationEventDefinitionImpl();
		return escalationEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedGateway createEventBasedGateway() {
		EventBasedGatewayImpl eventBasedGateway = new EventBasedGatewayImpl();
		return eventBasedGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefinition createEventDefinition() {
		EventDefinitionImpl eventDefinition = new EventDefinitionImpl();
		return eventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveGateway createExclusiveGateway() {
		ExclusiveGatewayImpl exclusiveGateway = new ExclusiveGatewayImpl();
		return exclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAttributeDefinition createExtensionAttributeDefinition() {
		ExtensionAttributeDefinitionImpl extensionAttributeDefinition = new ExtensionAttributeDefinitionImpl();
		return extensionAttributeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAttributeValue createExtensionAttributeValue() {
		ExtensionAttributeValueImpl extensionAttributeValue = new ExtensionAttributeValueImpl();
		return extensionAttributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionDefinition createExtensionDefinition() {
		ExtensionDefinitionImpl extensionDefinition = new ExtensionDefinitionImpl();
		return extensionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression createFormalExpression() {
		FormalExpressionImpl formalExpression = new FormalExpressionImpl();
		return formalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalBusinessRuleTask createGlobalBusinessRuleTask() {
		GlobalBusinessRuleTaskImpl globalBusinessRuleTask = new GlobalBusinessRuleTaskImpl();
		return globalBusinessRuleTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalChoreographyTask createGlobalChoreographyTask() {
		GlobalChoreographyTaskImpl globalChoreographyTask = new GlobalChoreographyTaskImpl();
		return globalChoreographyTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalConversation createGlobalConversation() {
		GlobalConversationImpl globalConversation = new GlobalConversationImpl();
		return globalConversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalManualTask createGlobalManualTask() {
		GlobalManualTaskImpl globalManualTask = new GlobalManualTaskImpl();
		return globalManualTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalScriptTask createGlobalScriptTask() {
		GlobalScriptTaskImpl globalScriptTask = new GlobalScriptTaskImpl();
		return globalScriptTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalTask createGlobalTask() {
		GlobalTaskImpl globalTask = new GlobalTaskImpl();
		return globalTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalUserTask createGlobalUserTask() {
		GlobalUserTaskImpl globalUserTask = new GlobalUserTaskImpl();
		return globalUserTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanPerformer createHumanPerformer() {
		HumanPerformerImpl humanPerformer = new HumanPerformerImpl();
		return humanPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitThrowEvent createImplicitThrowEvent() {
		ImplicitThrowEventImpl implicitThrowEvent = new ImplicitThrowEventImpl();
		return implicitThrowEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusiveGateway createInclusiveGateway() {
		InclusiveGatewayImpl inclusiveGateway = new InclusiveGatewayImpl();
		return inclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputBinding createInputOutputBinding() {
		InputOutputBindingImpl inputOutputBinding = new InputOutputBindingImpl();
		return inputOutputBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputSpecification createInputOutputSpecification() {
		InputOutputSpecificationImpl inputOutputSpecification = new InputOutputSpecificationImpl();
		return inputOutputSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSet createInputSet() {
		InputSetImpl inputSet = new InputSetImpl();
		return inputSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionNode createInteractionNode() {
		InteractionNodeImpl interactionNode = new InteractionNodeImpl();
		return interactionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateCatchEvent createIntermediateCatchEvent() {
		IntermediateCatchEventImpl intermediateCatchEvent = new IntermediateCatchEventImpl();
		return intermediateCatchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateThrowEvent createIntermediateThrowEvent() {
		IntermediateThrowEventImpl intermediateThrowEvent = new IntermediateThrowEventImpl();
		return intermediateThrowEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAwareElement createItemAwareElement() {
		ItemAwareElementImpl itemAwareElement = new ItemAwareElementImpl();
		return itemAwareElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition createItemDefinition() {
		ItemDefinitionImpl itemDefinition = new ItemDefinitionImpl();
		return itemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane createLane() {
		LaneImpl lane = new LaneImpl();
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneSet createLaneSet() {
		LaneSetImpl laneSet = new LaneSetImpl();
		return laneSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEventDefinition createLinkEventDefinition() {
		LinkEventDefinitionImpl linkEventDefinition = new LinkEventDefinitionImpl();
		return linkEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManualTask createManualTask() {
		ManualTaskImpl manualTask = new ManualTaskImpl();
		return manualTask;
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
	public MessageEventDefinition createMessageEventDefinition() {
		MessageEventDefinitionImpl messageEventDefinition = new MessageEventDefinitionImpl();
		return messageEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlow createMessageFlow() {
		MessageFlowImpl messageFlow = new MessageFlowImpl();
		return messageFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlowAssociation createMessageFlowAssociation() {
		MessageFlowAssociationImpl messageFlowAssociation = new MessageFlowAssociationImpl();
		return messageFlowAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitoring createMonitoring() {
		MonitoringImpl monitoring = new MonitoringImpl();
		return monitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiInstanceLoopCharacteristics createMultiInstanceLoopCharacteristics() {
		MultiInstanceLoopCharacteristicsImpl multiInstanceLoopCharacteristics = new MultiInstanceLoopCharacteristicsImpl();
		return multiInstanceLoopCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSet createOutputSet() {
		OutputSetImpl outputSet = new OutputSetImpl();
		return outputSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelGateway createParallelGateway() {
		ParallelGatewayImpl parallelGateway = new ParallelGatewayImpl();
		return parallelGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantAssociation createParticipantAssociation() {
		ParticipantAssociationImpl participantAssociation = new ParticipantAssociationImpl();
		return participantAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantMultiplicity createParticipantMultiplicity() {
		ParticipantMultiplicityImpl participantMultiplicity = new ParticipantMultiplicityImpl();
		return participantMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerEntity createPartnerEntity() {
		PartnerEntityImpl partnerEntity = new PartnerEntityImpl();
		return partnerEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerRole createPartnerRole() {
		PartnerRoleImpl partnerRole = new PartnerRoleImpl();
		return partnerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performer createPerformer() {
		PerformerImpl performer = new PerformerImpl();
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotentialOwner createPotentialOwner() {
		PotentialOwnerImpl potentialOwner = new PotentialOwnerImpl();
		return potentialOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.emftrace.metamodel.BPMN2Model.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveTask createReceiveTask() {
		ReceiveTaskImpl receiveTask = new ReceiveTaskImpl();
		return receiveTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rendering createRendering() {
		RenderingImpl rendering = new RenderingImpl();
		return rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAssignmentExpression createResourceAssignmentExpression() {
		ResourceAssignmentExpressionImpl resourceAssignmentExpression = new ResourceAssignmentExpressionImpl();
		return resourceAssignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceParameter createResourceParameter() {
		ResourceParameterImpl resourceParameter = new ResourceParameterImpl();
		return resourceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceParameterBinding createResourceParameterBinding() {
		ResourceParameterBindingImpl resourceParameterBinding = new ResourceParameterBindingImpl();
		return resourceParameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRole createResourceRole() {
		ResourceRoleImpl resourceRole = new ResourceRoleImpl();
		return resourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElement createRootElement() {
		RootElementImpl rootElement = new RootElementImpl();
		return rootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptTask createScriptTask() {
		ScriptTaskImpl scriptTask = new ScriptTaskImpl();
		return scriptTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendTask createSendTask() {
		SendTaskImpl sendTask = new SendTaskImpl();
		return sendTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlow createSequenceFlow() {
		SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
		return sequenceFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTask createServiceTask() {
		ServiceTaskImpl serviceTask = new ServiceTaskImpl();
		return serviceTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalEventDefinition createSignalEventDefinition() {
		SignalEventDefinitionImpl signalEventDefinition = new SignalEventDefinitionImpl();
		return signalEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardLoopCharacteristics createStandardLoopCharacteristics() {
		StandardLoopCharacteristicsImpl standardLoopCharacteristics = new StandardLoopCharacteristicsImpl();
		return standardLoopCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEvent createStartEvent() {
		StartEventImpl startEvent = new StartEventImpl();
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubChoreography createSubChoreography() {
		SubChoreographyImpl subChoreography = new SubChoreographyImpl();
		return subChoreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubConversation createSubConversation() {
		SubConversationImpl subConversation = new SubConversationImpl();
		return subConversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubProcess createSubProcess() {
		SubProcessImpl subProcess = new SubProcessImpl();
		return subProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminateEventDefinition createTerminateEventDefinition() {
		TerminateEventDefinitionImpl terminateEventDefinition = new TerminateEventDefinitionImpl();
		return terminateEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAnnotation createTextAnnotation() {
		TextAnnotationImpl textAnnotation = new TextAnnotationImpl();
		return textAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerEventDefinition createTimerEventDefinition() {
		TimerEventDefinitionImpl timerEventDefinition = new TimerEventDefinitionImpl();
		return timerEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction createTransaction() {
		TransactionImpl transaction = new TransactionImpl();
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTask createUserTask() {
		UserTaskImpl userTask = new UserTaskImpl();
		return userTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocOrdering createAdHocOrderingFromString(EDataType eDataType, String initialValue) {
		AdHocOrdering result = AdHocOrdering.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdHocOrderingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationDirection createAssociationDirectionFromString(EDataType eDataType, String initialValue) {
		AssociationDirection result = AssociationDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssociationDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyLoopType createChoreographyLoopTypeFromString(EDataType eDataType, String initialValue) {
		ChoreographyLoopType result = ChoreographyLoopType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChoreographyLoopTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedGatewayType createEventBasedGatewayTypeFromString(EDataType eDataType, String initialValue) {
		EventBasedGatewayType result = EventBasedGatewayType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventBasedGatewayTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GatewayDirection createGatewayDirectionFromString(EDataType eDataType, String initialValue) {
		GatewayDirection result = GatewayDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGatewayDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemKind createItemKindFromString(EDataType eDataType, String initialValue) {
		ItemKind result = ItemKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertItemKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiInstanceBehavior createMultiInstanceBehaviorFromString(EDataType eDataType, String initialValue) {
		MultiInstanceBehavior result = MultiInstanceBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiInstanceBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessType createProcessTypeFromString(EDataType eDataType, String initialValue) {
		ProcessType result = ProcessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipDirection createRelationshipDirectionFromString(EDataType eDataType, String initialValue) {
		RelationshipDirection result = RelationshipDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN2ModelPackage getBPMN2ModelPackage() {
		return (BPMN2ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BPMN2ModelPackage getPackage() {
		return BPMN2ModelPackage.eINSTANCE;
	}

} //BPMN2ModelFactoryImpl
