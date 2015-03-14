/**
 */
package org.emftrace.metamodel.BPMN2Model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emftrace.metamodel.BPMN2Model.Activity;
import org.emftrace.metamodel.BPMN2Model.AdHocSubProcess;
import org.emftrace.metamodel.BPMN2Model.Artifact;
import org.emftrace.metamodel.BPMN2Model.Assignment;
import org.emftrace.metamodel.BPMN2Model.Association;
import org.emftrace.metamodel.BPMN2Model.Auditing;
import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.BPMNBase;
import org.emftrace.metamodel.BPMN2Model.BaseElement;
import org.emftrace.metamodel.BPMN2Model.BoundaryEvent;
import org.emftrace.metamodel.BPMN2Model.BusinessRuleTask;
import org.emftrace.metamodel.BPMN2Model.CallActivity;
import org.emftrace.metamodel.BPMN2Model.CallChoreography;
import org.emftrace.metamodel.BPMN2Model.CallConversation;
import org.emftrace.metamodel.BPMN2Model.CallableElement;
import org.emftrace.metamodel.BPMN2Model.CancelEventDefinition;
import org.emftrace.metamodel.BPMN2Model.CatchEvent;
import org.emftrace.metamodel.BPMN2Model.Category;
import org.emftrace.metamodel.BPMN2Model.CategoryValue;
import org.emftrace.metamodel.BPMN2Model.Choreography;
import org.emftrace.metamodel.BPMN2Model.ChoreographyActivity;
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
import org.emftrace.metamodel.BPMN2Model.Event;
import org.emftrace.metamodel.BPMN2Model.EventBasedGateway;
import org.emftrace.metamodel.BPMN2Model.EventDefinition;
import org.emftrace.metamodel.BPMN2Model.ExclusiveGateway;
import org.emftrace.metamodel.BPMN2Model.Expression;
import org.emftrace.metamodel.BPMN2Model.Extension;
import org.emftrace.metamodel.BPMN2Model.ExtensionAttributeDefinition;
import org.emftrace.metamodel.BPMN2Model.ExtensionAttributeValue;
import org.emftrace.metamodel.BPMN2Model.ExtensionDefinition;
import org.emftrace.metamodel.BPMN2Model.FlowElement;
import org.emftrace.metamodel.BPMN2Model.FlowElementsContainer;
import org.emftrace.metamodel.BPMN2Model.FlowNode;
import org.emftrace.metamodel.BPMN2Model.FormalExpression;
import org.emftrace.metamodel.BPMN2Model.Gateway;
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
import org.emftrace.metamodel.BPMN2Model.Lane;
import org.emftrace.metamodel.BPMN2Model.LaneSet;
import org.emftrace.metamodel.BPMN2Model.LinkEventDefinition;
import org.emftrace.metamodel.BPMN2Model.LoopCharacteristics;
import org.emftrace.metamodel.BPMN2Model.ManualTask;
import org.emftrace.metamodel.BPMN2Model.Message;
import org.emftrace.metamodel.BPMN2Model.MessageEventDefinition;
import org.emftrace.metamodel.BPMN2Model.MessageFlow;
import org.emftrace.metamodel.BPMN2Model.MessageFlowAssociation;
import org.emftrace.metamodel.BPMN2Model.Monitoring;
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
import org.emftrace.metamodel.BPMN2Model.Property;
import org.emftrace.metamodel.BPMN2Model.ReceiveTask;
import org.emftrace.metamodel.BPMN2Model.Relationship;
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
import org.emftrace.metamodel.BPMN2Model.ThrowEvent;
import org.emftrace.metamodel.BPMN2Model.TimerEventDefinition;
import org.emftrace.metamodel.BPMN2Model.Transaction;
import org.emftrace.metamodel.BPMN2Model.UserTask;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage
 * @generated
 */
public class BPMN2ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BPMN2ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN2ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BPMN2ModelPackage.eINSTANCE;
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
	protected BPMN2ModelSwitch<Adapter> modelSwitch =
		new BPMN2ModelSwitch<Adapter>() {
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseAdHocSubProcess(AdHocSubProcess object) {
				return createAdHocSubProcessAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseAuditing(Auditing object) {
				return createAuditingAdapter();
			}
			@Override
			public Adapter caseBaseElement(BaseElement object) {
				return createBaseElementAdapter();
			}
			@Override
			public Adapter caseBoundaryEvent(BoundaryEvent object) {
				return createBoundaryEventAdapter();
			}
			@Override
			public Adapter caseBusinessRuleTask(BusinessRuleTask object) {
				return createBusinessRuleTaskAdapter();
			}
			@Override
			public Adapter caseCallActivity(CallActivity object) {
				return createCallActivityAdapter();
			}
			@Override
			public Adapter caseCallChoreography(CallChoreography object) {
				return createCallChoreographyAdapter();
			}
			@Override
			public Adapter caseCallConversation(CallConversation object) {
				return createCallConversationAdapter();
			}
			@Override
			public Adapter caseCallableElement(CallableElement object) {
				return createCallableElementAdapter();
			}
			@Override
			public Adapter caseCancelEventDefinition(CancelEventDefinition object) {
				return createCancelEventDefinitionAdapter();
			}
			@Override
			public Adapter caseCatchEvent(CatchEvent object) {
				return createCatchEventAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseCategoryValue(CategoryValue object) {
				return createCategoryValueAdapter();
			}
			@Override
			public Adapter caseChoreography(Choreography object) {
				return createChoreographyAdapter();
			}
			@Override
			public Adapter caseChoreographyActivity(ChoreographyActivity object) {
				return createChoreographyActivityAdapter();
			}
			@Override
			public Adapter caseChoreographyTask(ChoreographyTask object) {
				return createChoreographyTaskAdapter();
			}
			@Override
			public Adapter caseCollaboration(Collaboration object) {
				return createCollaborationAdapter();
			}
			@Override
			public Adapter caseCompensateEventDefinition(CompensateEventDefinition object) {
				return createCompensateEventDefinitionAdapter();
			}
			@Override
			public Adapter caseComplexBehaviorDefinition(ComplexBehaviorDefinition object) {
				return createComplexBehaviorDefinitionAdapter();
			}
			@Override
			public Adapter caseComplexGateway(ComplexGateway object) {
				return createComplexGatewayAdapter();
			}
			@Override
			public Adapter caseConditionalEventDefinition(ConditionalEventDefinition object) {
				return createConditionalEventDefinitionAdapter();
			}
			@Override
			public Adapter caseConversation(Conversation object) {
				return createConversationAdapter();
			}
			@Override
			public Adapter caseConversationAssociation(ConversationAssociation object) {
				return createConversationAssociationAdapter();
			}
			@Override
			public Adapter caseConversationLink(ConversationLink object) {
				return createConversationLinkAdapter();
			}
			@Override
			public Adapter caseConversationNode(ConversationNode object) {
				return createConversationNodeAdapter();
			}
			@Override
			public Adapter caseCorrelationKey(CorrelationKey object) {
				return createCorrelationKeyAdapter();
			}
			@Override
			public Adapter caseCorrelationProperty(CorrelationProperty object) {
				return createCorrelationPropertyAdapter();
			}
			@Override
			public Adapter caseCorrelationPropertyBinding(CorrelationPropertyBinding object) {
				return createCorrelationPropertyBindingAdapter();
			}
			@Override
			public Adapter caseCorrelationPropertyRetrievalExpression(CorrelationPropertyRetrievalExpression object) {
				return createCorrelationPropertyRetrievalExpressionAdapter();
			}
			@Override
			public Adapter caseCorrelationSubscription(CorrelationSubscription object) {
				return createCorrelationSubscriptionAdapter();
			}
			@Override
			public Adapter caseDataAssociation(DataAssociation object) {
				return createDataAssociationAdapter();
			}
			@Override
			public Adapter caseDataInput(DataInput object) {
				return createDataInputAdapter();
			}
			@Override
			public Adapter caseDataInputAssociation(DataInputAssociation object) {
				return createDataInputAssociationAdapter();
			}
			@Override
			public Adapter caseDataObject(DataObject object) {
				return createDataObjectAdapter();
			}
			@Override
			public Adapter caseDataObjectReference(DataObjectReference object) {
				return createDataObjectReferenceAdapter();
			}
			@Override
			public Adapter caseDataOutput(DataOutput object) {
				return createDataOutputAdapter();
			}
			@Override
			public Adapter caseDataOutputAssociation(DataOutputAssociation object) {
				return createDataOutputAssociationAdapter();
			}
			@Override
			public Adapter caseDataState(DataState object) {
				return createDataStateAdapter();
			}
			@Override
			public Adapter caseDataStore(DataStore object) {
				return createDataStoreAdapter();
			}
			@Override
			public Adapter caseDataStoreReference(DataStoreReference object) {
				return createDataStoreReferenceAdapter();
			}
			@Override
			public Adapter caseDefinitions(Definitions object) {
				return createDefinitionsAdapter();
			}
			@Override
			public Adapter caseDocumentation(Documentation object) {
				return createDocumentationAdapter();
			}
			@Override
			public Adapter caseEndEvent(EndEvent object) {
				return createEndEventAdapter();
			}
			@Override
			public Adapter caseEndPoint(EndPoint object) {
				return createEndPointAdapter();
			}
			@Override
			public Adapter caseError(org.emftrace.metamodel.BPMN2Model.Error object) {
				return createErrorAdapter();
			}
			@Override
			public Adapter caseErrorEventDefinition(ErrorEventDefinition object) {
				return createErrorEventDefinitionAdapter();
			}
			@Override
			public Adapter caseEscalation(Escalation object) {
				return createEscalationAdapter();
			}
			@Override
			public Adapter caseEscalationEventDefinition(EscalationEventDefinition object) {
				return createEscalationEventDefinitionAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseEventBasedGateway(EventBasedGateway object) {
				return createEventBasedGatewayAdapter();
			}
			@Override
			public Adapter caseEventDefinition(EventDefinition object) {
				return createEventDefinitionAdapter();
			}
			@Override
			public Adapter caseExclusiveGateway(ExclusiveGateway object) {
				return createExclusiveGatewayAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseExtensionAttributeDefinition(ExtensionAttributeDefinition object) {
				return createExtensionAttributeDefinitionAdapter();
			}
			@Override
			public Adapter caseExtensionAttributeValue(ExtensionAttributeValue object) {
				return createExtensionAttributeValueAdapter();
			}
			@Override
			public Adapter caseExtensionDefinition(ExtensionDefinition object) {
				return createExtensionDefinitionAdapter();
			}
			@Override
			public Adapter caseFlowElement(FlowElement object) {
				return createFlowElementAdapter();
			}
			@Override
			public Adapter caseFlowElementsContainer(FlowElementsContainer object) {
				return createFlowElementsContainerAdapter();
			}
			@Override
			public Adapter caseFlowNode(FlowNode object) {
				return createFlowNodeAdapter();
			}
			@Override
			public Adapter caseFormalExpression(FormalExpression object) {
				return createFormalExpressionAdapter();
			}
			@Override
			public Adapter caseGateway(Gateway object) {
				return createGatewayAdapter();
			}
			@Override
			public Adapter caseGlobalBusinessRuleTask(GlobalBusinessRuleTask object) {
				return createGlobalBusinessRuleTaskAdapter();
			}
			@Override
			public Adapter caseGlobalChoreographyTask(GlobalChoreographyTask object) {
				return createGlobalChoreographyTaskAdapter();
			}
			@Override
			public Adapter caseGlobalConversation(GlobalConversation object) {
				return createGlobalConversationAdapter();
			}
			@Override
			public Adapter caseGlobalManualTask(GlobalManualTask object) {
				return createGlobalManualTaskAdapter();
			}
			@Override
			public Adapter caseGlobalScriptTask(GlobalScriptTask object) {
				return createGlobalScriptTaskAdapter();
			}
			@Override
			public Adapter caseGlobalTask(GlobalTask object) {
				return createGlobalTaskAdapter();
			}
			@Override
			public Adapter caseGlobalUserTask(GlobalUserTask object) {
				return createGlobalUserTaskAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseHumanPerformer(HumanPerformer object) {
				return createHumanPerformerAdapter();
			}
			@Override
			public Adapter caseImplicitThrowEvent(ImplicitThrowEvent object) {
				return createImplicitThrowEventAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseInclusiveGateway(InclusiveGateway object) {
				return createInclusiveGatewayAdapter();
			}
			@Override
			public Adapter caseInputOutputBinding(InputOutputBinding object) {
				return createInputOutputBindingAdapter();
			}
			@Override
			public Adapter caseInputOutputSpecification(InputOutputSpecification object) {
				return createInputOutputSpecificationAdapter();
			}
			@Override
			public Adapter caseInputSet(InputSet object) {
				return createInputSetAdapter();
			}
			@Override
			public Adapter caseInteractionNode(InteractionNode object) {
				return createInteractionNodeAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseIntermediateCatchEvent(IntermediateCatchEvent object) {
				return createIntermediateCatchEventAdapter();
			}
			@Override
			public Adapter caseIntermediateThrowEvent(IntermediateThrowEvent object) {
				return createIntermediateThrowEventAdapter();
			}
			@Override
			public Adapter caseItemAwareElement(ItemAwareElement object) {
				return createItemAwareElementAdapter();
			}
			@Override
			public Adapter caseItemDefinition(ItemDefinition object) {
				return createItemDefinitionAdapter();
			}
			@Override
			public Adapter caseLane(Lane object) {
				return createLaneAdapter();
			}
			@Override
			public Adapter caseLaneSet(LaneSet object) {
				return createLaneSetAdapter();
			}
			@Override
			public Adapter caseLinkEventDefinition(LinkEventDefinition object) {
				return createLinkEventDefinitionAdapter();
			}
			@Override
			public Adapter caseLoopCharacteristics(LoopCharacteristics object) {
				return createLoopCharacteristicsAdapter();
			}
			@Override
			public Adapter caseManualTask(ManualTask object) {
				return createManualTaskAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseMessageEventDefinition(MessageEventDefinition object) {
				return createMessageEventDefinitionAdapter();
			}
			@Override
			public Adapter caseMessageFlow(MessageFlow object) {
				return createMessageFlowAdapter();
			}
			@Override
			public Adapter caseMessageFlowAssociation(MessageFlowAssociation object) {
				return createMessageFlowAssociationAdapter();
			}
			@Override
			public Adapter caseMonitoring(Monitoring object) {
				return createMonitoringAdapter();
			}
			@Override
			public Adapter caseMultiInstanceLoopCharacteristics(MultiInstanceLoopCharacteristics object) {
				return createMultiInstanceLoopCharacteristicsAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseOutputSet(OutputSet object) {
				return createOutputSetAdapter();
			}
			@Override
			public Adapter caseParallelGateway(ParallelGateway object) {
				return createParallelGatewayAdapter();
			}
			@Override
			public Adapter caseParticipant(Participant object) {
				return createParticipantAdapter();
			}
			@Override
			public Adapter caseParticipantAssociation(ParticipantAssociation object) {
				return createParticipantAssociationAdapter();
			}
			@Override
			public Adapter caseParticipantMultiplicity(ParticipantMultiplicity object) {
				return createParticipantMultiplicityAdapter();
			}
			@Override
			public Adapter casePartnerEntity(PartnerEntity object) {
				return createPartnerEntityAdapter();
			}
			@Override
			public Adapter casePartnerRole(PartnerRole object) {
				return createPartnerRoleAdapter();
			}
			@Override
			public Adapter casePerformer(Performer object) {
				return createPerformerAdapter();
			}
			@Override
			public Adapter casePotentialOwner(PotentialOwner object) {
				return createPotentialOwnerAdapter();
			}
			@Override
			public Adapter caseProcess(org.emftrace.metamodel.BPMN2Model.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseReceiveTask(ReceiveTask object) {
				return createReceiveTaskAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseRendering(Rendering object) {
				return createRenderingAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseResourceAssignmentExpression(ResourceAssignmentExpression object) {
				return createResourceAssignmentExpressionAdapter();
			}
			@Override
			public Adapter caseResourceParameter(ResourceParameter object) {
				return createResourceParameterAdapter();
			}
			@Override
			public Adapter caseResourceParameterBinding(ResourceParameterBinding object) {
				return createResourceParameterBindingAdapter();
			}
			@Override
			public Adapter caseResourceRole(ResourceRole object) {
				return createResourceRoleAdapter();
			}
			@Override
			public Adapter caseRootElement(RootElement object) {
				return createRootElementAdapter();
			}
			@Override
			public Adapter caseScriptTask(ScriptTask object) {
				return createScriptTaskAdapter();
			}
			@Override
			public Adapter caseSendTask(SendTask object) {
				return createSendTaskAdapter();
			}
			@Override
			public Adapter caseSequenceFlow(SequenceFlow object) {
				return createSequenceFlowAdapter();
			}
			@Override
			public Adapter caseServiceTask(ServiceTask object) {
				return createServiceTaskAdapter();
			}
			@Override
			public Adapter caseSignal(Signal object) {
				return createSignalAdapter();
			}
			@Override
			public Adapter caseSignalEventDefinition(SignalEventDefinition object) {
				return createSignalEventDefinitionAdapter();
			}
			@Override
			public Adapter caseStandardLoopCharacteristics(StandardLoopCharacteristics object) {
				return createStandardLoopCharacteristicsAdapter();
			}
			@Override
			public Adapter caseStartEvent(StartEvent object) {
				return createStartEventAdapter();
			}
			@Override
			public Adapter caseSubChoreography(SubChoreography object) {
				return createSubChoreographyAdapter();
			}
			@Override
			public Adapter caseSubConversation(SubConversation object) {
				return createSubConversationAdapter();
			}
			@Override
			public Adapter caseSubProcess(SubProcess object) {
				return createSubProcessAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseTerminateEventDefinition(TerminateEventDefinition object) {
				return createTerminateEventDefinitionAdapter();
			}
			@Override
			public Adapter caseTextAnnotation(TextAnnotation object) {
				return createTextAnnotationAdapter();
			}
			@Override
			public Adapter caseThrowEvent(ThrowEvent object) {
				return createThrowEventAdapter();
			}
			@Override
			public Adapter caseTimerEventDefinition(TimerEventDefinition object) {
				return createTimerEventDefinitionAdapter();
			}
			@Override
			public Adapter caseTransaction(Transaction object) {
				return createTransactionAdapter();
			}
			@Override
			public Adapter caseUserTask(UserTask object) {
				return createUserTaskAdapter();
			}
			@Override
			public Adapter caseBPMNBase(BPMNBase object) {
				return createBPMNBaseAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.AdHocSubProcess <em>Ad Hoc Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.AdHocSubProcess
	 * @generated
	 */
	public Adapter createAdHocSubProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Auditing <em>Auditing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Auditing
	 * @generated
	 */
	public Adapter createAuditingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.BaseElement
	 * @generated
	 */
	public Adapter createBaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.BoundaryEvent <em>Boundary Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.BoundaryEvent
	 * @generated
	 */
	public Adapter createBoundaryEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.BusinessRuleTask <em>Business Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.BusinessRuleTask
	 * @generated
	 */
	public Adapter createBusinessRuleTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.CallActivity <em>Call Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.CallActivity
	 * @generated
	 */
	public Adapter createCallActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.CallChoreography <em>Call Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.CallChoreography
	 * @generated
	 */
	public Adapter createCallChoreographyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.CallConversation <em>Call Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.CallConversation
	 * @generated
	 */
	public Adapter createCallConversationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.CallableElement <em>Callable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.CallableElement
	 * @generated
	 */
	public Adapter createCallableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.CancelEventDefinition <em>Cancel Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.CancelEventDefinition
	 * @generated
	 */
	public Adapter createCancelEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.CatchEvent <em>Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.CatchEvent
	 * @generated
	 */
	public Adapter createCatchEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.CategoryValue <em>Category Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.CategoryValue
	 * @generated
	 */
	public Adapter createCategoryValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Choreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Choreography
	 * @generated
	 */
	public Adapter createChoreographyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ChoreographyActivity <em>Choreography Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ChoreographyActivity
	 * @generated
	 */
	public Adapter createChoreographyActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ChoreographyTask <em>Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ChoreographyTask
	 * @generated
	 */
	public Adapter createChoreographyTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Collaboration
	 * @generated
	 */
	public Adapter createCollaborationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.CompensateEventDefinition <em>Compensate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.CompensateEventDefinition
	 * @generated
	 */
	public Adapter createCompensateEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ComplexBehaviorDefinition <em>Complex Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ComplexBehaviorDefinition
	 * @generated
	 */
	public Adapter createComplexBehaviorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ComplexGateway <em>Complex Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ComplexGateway
	 * @generated
	 */
	public Adapter createComplexGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ConditionalEventDefinition <em>Conditional Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ConditionalEventDefinition
	 * @generated
	 */
	public Adapter createConditionalEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Conversation <em>Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Conversation
	 * @generated
	 */
	public Adapter createConversationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ConversationAssociation <em>Conversation Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ConversationAssociation
	 * @generated
	 */
	public Adapter createConversationAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ConversationLink <em>Conversation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ConversationLink
	 * @generated
	 */
	public Adapter createConversationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ConversationNode <em>Conversation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ConversationNode
	 * @generated
	 */
	public Adapter createConversationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.CorrelationKey <em>Correlation Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationKey
	 * @generated
	 */
	public Adapter createCorrelationKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.CorrelationProperty <em>Correlation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationProperty
	 * @generated
	 */
	public Adapter createCorrelationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.CorrelationPropertyBinding <em>Correlation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationPropertyBinding
	 * @generated
	 */
	public Adapter createCorrelationPropertyBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.CorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationPropertyRetrievalExpression
	 * @generated
	 */
	public Adapter createCorrelationPropertyRetrievalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.CorrelationSubscription <em>Correlation Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.CorrelationSubscription
	 * @generated
	 */
	public Adapter createCorrelationSubscriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.DataAssociation <em>Data Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.DataAssociation
	 * @generated
	 */
	public Adapter createDataAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.DataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.DataInput
	 * @generated
	 */
	public Adapter createDataInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.DataInputAssociation <em>Data Input Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.DataInputAssociation
	 * @generated
	 */
	public Adapter createDataInputAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.DataObject
	 * @generated
	 */
	public Adapter createDataObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.DataObjectReference <em>Data Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.DataObjectReference
	 * @generated
	 */
	public Adapter createDataObjectReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.DataOutput <em>Data Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.DataOutput
	 * @generated
	 */
	public Adapter createDataOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.DataOutputAssociation <em>Data Output Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.DataOutputAssociation
	 * @generated
	 */
	public Adapter createDataOutputAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.DataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.DataState
	 * @generated
	 */
	public Adapter createDataStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.DataStore
	 * @generated
	 */
	public Adapter createDataStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.DataStoreReference <em>Data Store Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.DataStoreReference
	 * @generated
	 */
	public Adapter createDataStoreReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Definitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Definitions
	 * @generated
	 */
	public Adapter createDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Documentation
	 * @generated
	 */
	public Adapter createDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.EndEvent
	 * @generated
	 */
	public Adapter createEndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.EndPoint
	 * @generated
	 */
	public Adapter createEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Error
	 * @generated
	 */
	public Adapter createErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ErrorEventDefinition <em>Error Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ErrorEventDefinition
	 * @generated
	 */
	public Adapter createErrorEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Escalation <em>Escalation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Escalation
	 * @generated
	 */
	public Adapter createEscalationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.EscalationEventDefinition <em>Escalation Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.EscalationEventDefinition
	 * @generated
	 */
	public Adapter createEscalationEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.EventBasedGateway <em>Event Based Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.EventBasedGateway
	 * @generated
	 */
	public Adapter createEventBasedGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.EventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.EventDefinition
	 * @generated
	 */
	public Adapter createEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ExclusiveGateway <em>Exclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ExclusiveGateway
	 * @generated
	 */
	public Adapter createExclusiveGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ExtensionAttributeDefinition <em>Extension Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ExtensionAttributeDefinition
	 * @generated
	 */
	public Adapter createExtensionAttributeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ExtensionAttributeValue <em>Extension Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ExtensionAttributeValue
	 * @generated
	 */
	public Adapter createExtensionAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ExtensionDefinition <em>Extension Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ExtensionDefinition
	 * @generated
	 */
	public Adapter createExtensionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.FlowElement
	 * @generated
	 */
	public Adapter createFlowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.FlowElementsContainer <em>Flow Elements Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.FlowElementsContainer
	 * @generated
	 */
	public Adapter createFlowElementsContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.FlowNode
	 * @generated
	 */
	public Adapter createFlowNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.FormalExpression <em>Formal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.FormalExpression
	 * @generated
	 */
	public Adapter createFormalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Gateway
	 * @generated
	 */
	public Adapter createGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.GlobalBusinessRuleTask <em>Global Business Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalBusinessRuleTask
	 * @generated
	 */
	public Adapter createGlobalBusinessRuleTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.GlobalChoreographyTask <em>Global Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalChoreographyTask
	 * @generated
	 */
	public Adapter createGlobalChoreographyTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.GlobalConversation <em>Global Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalConversation
	 * @generated
	 */
	public Adapter createGlobalConversationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.GlobalManualTask <em>Global Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalManualTask
	 * @generated
	 */
	public Adapter createGlobalManualTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.GlobalScriptTask <em>Global Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalScriptTask
	 * @generated
	 */
	public Adapter createGlobalScriptTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.GlobalTask <em>Global Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalTask
	 * @generated
	 */
	public Adapter createGlobalTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.GlobalUserTask <em>Global User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.GlobalUserTask
	 * @generated
	 */
	public Adapter createGlobalUserTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.HumanPerformer <em>Human Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.HumanPerformer
	 * @generated
	 */
	public Adapter createHumanPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ImplicitThrowEvent <em>Implicit Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ImplicitThrowEvent
	 * @generated
	 */
	public Adapter createImplicitThrowEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.InclusiveGateway <em>Inclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.InclusiveGateway
	 * @generated
	 */
	public Adapter createInclusiveGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.InputOutputBinding <em>Input Output Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.InputOutputBinding
	 * @generated
	 */
	public Adapter createInputOutputBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.InputOutputSpecification <em>Input Output Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.InputOutputSpecification
	 * @generated
	 */
	public Adapter createInputOutputSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.InputSet <em>Input Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.InputSet
	 * @generated
	 */
	public Adapter createInputSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.InteractionNode <em>Interaction Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.InteractionNode
	 * @generated
	 */
	public Adapter createInteractionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.IntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.IntermediateCatchEvent
	 * @generated
	 */
	public Adapter createIntermediateCatchEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.IntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.IntermediateThrowEvent
	 * @generated
	 */
	public Adapter createIntermediateThrowEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ItemAwareElement <em>Item Aware Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ItemAwareElement
	 * @generated
	 */
	public Adapter createItemAwareElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ItemDefinition <em>Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ItemDefinition
	 * @generated
	 */
	public Adapter createItemDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Lane
	 * @generated
	 */
	public Adapter createLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.LaneSet <em>Lane Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.LaneSet
	 * @generated
	 */
	public Adapter createLaneSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.LinkEventDefinition <em>Link Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.LinkEventDefinition
	 * @generated
	 */
	public Adapter createLinkEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.LoopCharacteristics <em>Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.LoopCharacteristics
	 * @generated
	 */
	public Adapter createLoopCharacteristicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ManualTask <em>Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ManualTask
	 * @generated
	 */
	public Adapter createManualTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.MessageEventDefinition <em>Message Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.MessageEventDefinition
	 * @generated
	 */
	public Adapter createMessageEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.MessageFlow <em>Message Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.MessageFlow
	 * @generated
	 */
	public Adapter createMessageFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.MessageFlowAssociation <em>Message Flow Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.MessageFlowAssociation
	 * @generated
	 */
	public Adapter createMessageFlowAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Monitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Monitoring
	 * @generated
	 */
	public Adapter createMonitoringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.MultiInstanceLoopCharacteristics
	 * @generated
	 */
	public Adapter createMultiInstanceLoopCharacteristicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.OutputSet <em>Output Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.OutputSet
	 * @generated
	 */
	public Adapter createOutputSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ParallelGateway <em>Parallel Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ParallelGateway
	 * @generated
	 */
	public Adapter createParallelGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ParticipantAssociation <em>Participant Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ParticipantAssociation
	 * @generated
	 */
	public Adapter createParticipantAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ParticipantMultiplicity <em>Participant Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ParticipantMultiplicity
	 * @generated
	 */
	public Adapter createParticipantMultiplicityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.PartnerEntity <em>Partner Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.PartnerEntity
	 * @generated
	 */
	public Adapter createPartnerEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.PartnerRole <em>Partner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.PartnerRole
	 * @generated
	 */
	public Adapter createPartnerRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Performer <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Performer
	 * @generated
	 */
	public Adapter createPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.PotentialOwner <em>Potential Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.PotentialOwner
	 * @generated
	 */
	public Adapter createPotentialOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ReceiveTask <em>Receive Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ReceiveTask
	 * @generated
	 */
	public Adapter createReceiveTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Rendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Rendering
	 * @generated
	 */
	public Adapter createRenderingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ResourceAssignmentExpression <em>Resource Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceAssignmentExpression
	 * @generated
	 */
	public Adapter createResourceAssignmentExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ResourceParameter <em>Resource Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceParameter
	 * @generated
	 */
	public Adapter createResourceParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ResourceParameterBinding <em>Resource Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceParameterBinding
	 * @generated
	 */
	public Adapter createResourceParameterBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ResourceRole
	 * @generated
	 */
	public Adapter createResourceRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.RootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.RootElement
	 * @generated
	 */
	public Adapter createRootElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ScriptTask <em>Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ScriptTask
	 * @generated
	 */
	public Adapter createScriptTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.SendTask <em>Send Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.SendTask
	 * @generated
	 */
	public Adapter createSendTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.SequenceFlow
	 * @generated
	 */
	public Adapter createSequenceFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ServiceTask <em>Service Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ServiceTask
	 * @generated
	 */
	public Adapter createServiceTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Signal
	 * @generated
	 */
	public Adapter createSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.SignalEventDefinition <em>Signal Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.SignalEventDefinition
	 * @generated
	 */
	public Adapter createSignalEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.StandardLoopCharacteristics <em>Standard Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.StandardLoopCharacteristics
	 * @generated
	 */
	public Adapter createStandardLoopCharacteristicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.StartEvent
	 * @generated
	 */
	public Adapter createStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.SubChoreography <em>Sub Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.SubChoreography
	 * @generated
	 */
	public Adapter createSubChoreographyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.SubConversation <em>Sub Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.SubConversation
	 * @generated
	 */
	public Adapter createSubConversationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.SubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.SubProcess
	 * @generated
	 */
	public Adapter createSubProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.TerminateEventDefinition <em>Terminate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.TerminateEventDefinition
	 * @generated
	 */
	public Adapter createTerminateEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.TextAnnotation <em>Text Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.TextAnnotation
	 * @generated
	 */
	public Adapter createTextAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.ThrowEvent <em>Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.ThrowEvent
	 * @generated
	 */
	public Adapter createThrowEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.TimerEventDefinition <em>Timer Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.TimerEventDefinition
	 * @generated
	 */
	public Adapter createTimerEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.Transaction
	 * @generated
	 */
	public Adapter createTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.UserTask
	 * @generated
	 */
	public Adapter createUserTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.BPMN2Model.BPMNBase <em>BPMN Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.BPMN2Model.BPMNBase
	 * @generated
	 */
	public Adapter createBPMNBaseAdapter() {
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

} //BPMN2ModelAdapterFactory
