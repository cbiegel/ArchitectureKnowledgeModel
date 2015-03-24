/**
 */
package org.emftrace.metamodel.BPMN2Model.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.ArchitectureKnowledgeCatalogPackageFactory;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelFactory;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelFactory;
import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.DocumentRoot;

import org.emftrace.metamodel.ChangeModel.ChangeModelFactory;

import org.emftrace.metamodel.EMFfitModel.EMFfitModelFactory;

import org.emftrace.metamodel.FeatureModel.FeatureModelFactory;

import org.emftrace.metamodel.LinkModel.LinkModelFactory;

import org.emftrace.metamodel.OWLModel.OWLModelFactory;

import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;

import org.emftrace.metamodel.QUARCModel.GSS.GSSFactory;

import org.emftrace.metamodel.QUARCModel.Packages.PackagesFactory;

import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;

import org.emftrace.metamodel.ReportModel.ReportModelFactory;

import org.emftrace.metamodel.RuleModel.RuleModelFactory;

import org.emftrace.metamodel.UMLModel.UMLModelFactory;

import org.emftrace.metamodel.URNModel.URNModelFactory;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.BPMN2Model.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
	extends BPMNBaseItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addMixedPropertyDescriptor(object);
			addXMLNSPrefixMapPropertyDescriptor(object);
			addXSISchemaLocationPropertyDescriptor(object);
			addActivityPropertyDescriptor(object);
			addAdHocSubProcessPropertyDescriptor(object);
			addFlowElementPropertyDescriptor(object);
			addArtifactPropertyDescriptor(object);
			addAssignmentPropertyDescriptor(object);
			addAssociationPropertyDescriptor(object);
			addAuditingPropertyDescriptor(object);
			addBaseElementPropertyDescriptor(object);
			addBaseElementWithMixedContentPropertyDescriptor(object);
			addBoundaryEventPropertyDescriptor(object);
			addBusinessRuleTaskPropertyDescriptor(object);
			addCallableElementPropertyDescriptor(object);
			addCallActivityPropertyDescriptor(object);
			addCallChoreographyPropertyDescriptor(object);
			addCallConversationPropertyDescriptor(object);
			addConversationNodePropertyDescriptor(object);
			addCancelEventDefinitionPropertyDescriptor(object);
			addEventDefinitionPropertyDescriptor(object);
			addRootElementPropertyDescriptor(object);
			addCatchEventPropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
			addCategoryValuePropertyDescriptor(object);
			addChoreographyPropertyDescriptor(object);
			addCollaborationPropertyDescriptor(object);
			addChoreographyActivityPropertyDescriptor(object);
			addChoreographyTaskPropertyDescriptor(object);
			addCompensateEventDefinitionPropertyDescriptor(object);
			addComplexBehaviorDefinitionPropertyDescriptor(object);
			addComplexGatewayPropertyDescriptor(object);
			addConditionalEventDefinitionPropertyDescriptor(object);
			addConversationPropertyDescriptor(object);
			addConversationAssociationPropertyDescriptor(object);
			addConversationLinkPropertyDescriptor(object);
			addCorrelationKeyPropertyDescriptor(object);
			addCorrelationPropertyPropertyDescriptor(object);
			addCorrelationPropertyBindingPropertyDescriptor(object);
			addCorrelationPropertyRetrievalExpressionPropertyDescriptor(object);
			addCorrelationSubscriptionPropertyDescriptor(object);
			addDataAssociationPropertyDescriptor(object);
			addDataInputPropertyDescriptor(object);
			addDataInputAssociationPropertyDescriptor(object);
			addDataObjectPropertyDescriptor(object);
			addDataObjectReferencePropertyDescriptor(object);
			addDataOutputPropertyDescriptor(object);
			addDataOutputAssociationPropertyDescriptor(object);
			addDataStatePropertyDescriptor(object);
			addDataStorePropertyDescriptor(object);
			addDataStoreReferencePropertyDescriptor(object);
			addDefinitionsPropertyDescriptor(object);
			addDocumentationPropertyDescriptor(object);
			addEndEventPropertyDescriptor(object);
			addEndPointPropertyDescriptor(object);
			addErrorPropertyDescriptor(object);
			addErrorEventDefinitionPropertyDescriptor(object);
			addEscalationPropertyDescriptor(object);
			addEscalationEventDefinitionPropertyDescriptor(object);
			addEventPropertyDescriptor(object);
			addEventBasedGatewayPropertyDescriptor(object);
			addExclusiveGatewayPropertyDescriptor(object);
			addExpressionPropertyDescriptor(object);
			addExtensionPropertyDescriptor(object);
			addExtensionElementsPropertyDescriptor(object);
			addFlowNodePropertyDescriptor(object);
			addFormalExpressionPropertyDescriptor(object);
			addGatewayPropertyDescriptor(object);
			addGlobalBusinessRuleTaskPropertyDescriptor(object);
			addGlobalChoreographyTaskPropertyDescriptor(object);
			addGlobalConversationPropertyDescriptor(object);
			addGlobalManualTaskPropertyDescriptor(object);
			addGlobalScriptTaskPropertyDescriptor(object);
			addGlobalTaskPropertyDescriptor(object);
			addGlobalUserTaskPropertyDescriptor(object);
			addGroupPropertyDescriptor(object);
			addHumanPerformerPropertyDescriptor(object);
			addPerformerPropertyDescriptor(object);
			addResourceRolePropertyDescriptor(object);
			addImplicitThrowEventPropertyDescriptor(object);
			addImportPropertyDescriptor(object);
			addInclusiveGatewayPropertyDescriptor(object);
			addInputSetPropertyDescriptor(object);
			addInterfacePropertyDescriptor(object);
			addIntermediateCatchEventPropertyDescriptor(object);
			addIntermediateThrowEventPropertyDescriptor(object);
			addIoBindingPropertyDescriptor(object);
			addIoSpecificationPropertyDescriptor(object);
			addItemDefinitionPropertyDescriptor(object);
			addLanePropertyDescriptor(object);
			addLaneSetPropertyDescriptor(object);
			addLinkEventDefinitionPropertyDescriptor(object);
			addLoopCharacteristicsPropertyDescriptor(object);
			addManualTaskPropertyDescriptor(object);
			addMessagePropertyDescriptor(object);
			addMessageEventDefinitionPropertyDescriptor(object);
			addMessageFlowPropertyDescriptor(object);
			addMessageFlowAssociationPropertyDescriptor(object);
			addMonitoringPropertyDescriptor(object);
			addMultiInstanceLoopCharacteristicsPropertyDescriptor(object);
			addOperationPropertyDescriptor(object);
			addOutputSetPropertyDescriptor(object);
			addParallelGatewayPropertyDescriptor(object);
			addParticipantPropertyDescriptor(object);
			addParticipantAssociationPropertyDescriptor(object);
			addParticipantMultiplicityPropertyDescriptor(object);
			addPartnerEntityPropertyDescriptor(object);
			addPartnerRolePropertyDescriptor(object);
			addPotentialOwnerPropertyDescriptor(object);
			addProcessPropertyDescriptor(object);
			addPropertyPropertyDescriptor(object);
			addReceiveTaskPropertyDescriptor(object);
			addRelationshipPropertyDescriptor(object);
			addRenderingPropertyDescriptor(object);
			addResourcePropertyDescriptor(object);
			addResourceAssignmentExpressionPropertyDescriptor(object);
			addResourceParameterPropertyDescriptor(object);
			addResourceParameterBindingPropertyDescriptor(object);
			addScriptPropertyDescriptor(object);
			addScriptTaskPropertyDescriptor(object);
			addSendTaskPropertyDescriptor(object);
			addSequenceFlowPropertyDescriptor(object);
			addServiceTaskPropertyDescriptor(object);
			addSignalPropertyDescriptor(object);
			addSignalEventDefinitionPropertyDescriptor(object);
			addStandardLoopCharacteristicsPropertyDescriptor(object);
			addStartEventPropertyDescriptor(object);
			addSubChoreographyPropertyDescriptor(object);
			addSubConversationPropertyDescriptor(object);
			addSubProcessPropertyDescriptor(object);
			addTaskPropertyDescriptor(object);
			addTerminateEventDefinitionPropertyDescriptor(object);
			addTextPropertyDescriptor(object);
			addTextAnnotationPropertyDescriptor(object);
			addThrowEventPropertyDescriptor(object);
			addTimerEventDefinitionPropertyDescriptor(object);
			addTransactionPropertyDescriptor(object);
			addUserTaskPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mixed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMixedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_mixed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_mixed_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Mixed(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the XMLNS Prefix Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXMLNSPrefixMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_xMLNSPrefixMap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_xMLNSPrefixMap_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_XMLNSPrefixMap(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the XSI Schema Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXSISchemaLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_xSISchemaLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_xSISchemaLocation_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_XSISchemaLocation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_activity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_activity_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Activity(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ad Hoc Sub Process feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdHocSubProcessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_adHocSubProcess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_adHocSubProcess_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_AdHocSubProcess(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flow Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlowElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_flowElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_flowElement_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Artifact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArtifactPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_artifact_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_artifact_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Artifact(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssignmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_assignment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_assignment_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Assignment(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_association_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_association_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Association(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auditing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuditingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_auditing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_auditing_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Auditing(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_baseElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_baseElement_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Element With Mixed Content feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseElementWithMixedContentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_baseElementWithMixedContent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_baseElementWithMixedContent_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Boundary Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoundaryEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_boundaryEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_boundaryEvent_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BoundaryEvent(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Business Rule Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusinessRuleTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_businessRuleTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_businessRuleTask_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BusinessRuleTask(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Callable Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCallableElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_callableElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_callableElement_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallableElement(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Call Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCallActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_callActivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_callActivity_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallActivity(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Call Choreography feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCallChoreographyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_callChoreography_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_callChoreography_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallChoreography(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Call Conversation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCallConversationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_callConversation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_callConversation_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallConversation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conversation Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConversationNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_conversationNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_conversationNode_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConversationNode(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cancel Event Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCancelEventDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_cancelEventDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_cancelEventDefinition_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CancelEventDefinition(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_eventDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_eventDefinition_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Root Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_rootElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_rootElement_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Catch Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCatchEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_catchEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_catchEvent_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CatchEvent(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_category_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Category(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_categoryValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_categoryValue_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CategoryValue(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Choreography feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChoreographyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_choreography_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_choreography_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Choreography(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Collaboration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollaborationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_collaboration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_collaboration_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Collaboration(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Choreography Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChoreographyActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_choreographyActivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_choreographyActivity_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ChoreographyActivity(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Choreography Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChoreographyTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_choreographyTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_choreographyTask_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ChoreographyTask(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compensate Event Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompensateEventDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_compensateEventDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_compensateEventDefinition_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CompensateEventDefinition(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Complex Behavior Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComplexBehaviorDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_complexBehaviorDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_complexBehaviorDefinition_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ComplexBehaviorDefinition(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Complex Gateway feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComplexGatewayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_complexGateway_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_complexGateway_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ComplexGateway(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conditional Event Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionalEventDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_conditionalEventDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_conditionalEventDefinition_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConditionalEventDefinition(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conversation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConversationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_conversation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_conversation_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Conversation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conversation Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConversationAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_conversationAssociation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_conversationAssociation_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConversationAssociation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conversation Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConversationLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_conversationLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_conversationLink_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConversationLink(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Correlation Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCorrelationKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_correlationKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_correlationKey_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationKey(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Correlation Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCorrelationPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_correlationProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_correlationProperty_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationProperty(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Correlation Property Binding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCorrelationPropertyBindingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_correlationPropertyBinding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_correlationPropertyBinding_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationPropertyBinding(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Correlation Property Retrieval Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCorrelationPropertyRetrievalExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_correlationPropertyRetrievalExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_correlationPropertyRetrievalExpression_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationPropertyRetrievalExpression(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Correlation Subscription feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCorrelationSubscriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_correlationSubscription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_correlationSubscription_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationSubscription(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_dataAssociation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dataAssociation_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataAssociation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_dataInput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dataInput_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataInput(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Input Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataInputAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_dataInputAssociation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dataInputAssociation_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataInputAssociation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataObjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_dataObject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dataObject_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataObject(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Object Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataObjectReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_dataObjectReference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dataObjectReference_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataObjectReference(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Output feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataOutputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_dataOutput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dataOutput_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataOutput(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Output Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataOutputAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_dataOutputAssociation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dataOutputAssociation_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataOutputAssociation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_dataState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dataState_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataState(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Store feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataStorePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_dataStore_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dataStore_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataStore(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Store Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataStoreReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_dataStoreReference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dataStoreReference_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataStoreReference(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Definitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefinitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_definitions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_definitions_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Definitions(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Documentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_documentation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_documentation_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Documentation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_endEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_endEvent_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EndEvent(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndPointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_endPoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_endPoint_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EndPoint(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_error_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_error_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Error(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Event Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorEventDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_errorEventDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_errorEventDefinition_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ErrorEventDefinition(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Escalation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEscalationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_escalation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_escalation_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Escalation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Escalation Event Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEscalationEventDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_escalationEventDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_escalationEventDefinition_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EscalationEventDefinition(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_event_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_event_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Event(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event Based Gateway feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventBasedGatewayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_eventBasedGateway_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_eventBasedGateway_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventBasedGateway(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exclusive Gateway feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExclusiveGatewayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_exclusiveGateway_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_exclusiveGateway_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ExclusiveGateway(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_expression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_expression_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Expression(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_extension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_extension_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Extension(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extension Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtensionElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_extensionElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_extensionElements_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ExtensionElements(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flow Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlowNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_flowNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_flowNode_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Formal Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormalExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_formalExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_formalExpression_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FormalExpression(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gateway feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGatewayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_gateway_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_gateway_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Gateway(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Global Business Rule Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlobalBusinessRuleTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_globalBusinessRuleTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_globalBusinessRuleTask_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalBusinessRuleTask(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Global Choreography Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlobalChoreographyTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_globalChoreographyTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_globalChoreographyTask_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalChoreographyTask(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Global Conversation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlobalConversationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_globalConversation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_globalConversation_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalConversation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Global Manual Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlobalManualTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_globalManualTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_globalManualTask_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalManualTask(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Global Script Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlobalScriptTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_globalScriptTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_globalScriptTask_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalScriptTask(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Global Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlobalTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_globalTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_globalTask_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Global User Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlobalUserTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_globalUserTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_globalUserTask_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalUserTask(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_group_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_group_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Group(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Human Performer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHumanPerformerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_humanPerformer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_humanPerformer_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_HumanPerformer(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Performer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerformerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_performer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_performer_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Performer(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_resourceRole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_resourceRole_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceRole(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Throw Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitThrowEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_implicitThrowEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_implicitThrowEvent_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ImplicitThrowEvent(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Import feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_import_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_import_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Import(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inclusive Gateway feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInclusiveGatewayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_inclusiveGateway_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_inclusiveGateway_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_InclusiveGateway(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_inputSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_inputSet_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_InputSet(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_interface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_interface_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Interface(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Intermediate Catch Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntermediateCatchEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_intermediateCatchEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_intermediateCatchEvent_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_IntermediateCatchEvent(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Intermediate Throw Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntermediateThrowEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_intermediateThrowEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_intermediateThrowEvent_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_IntermediateThrowEvent(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Io Binding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIoBindingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_ioBinding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_ioBinding_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_IoBinding(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Io Specification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIoSpecificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_ioSpecification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_ioSpecification_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_IoSpecification(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Item Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItemDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_itemDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_itemDefinition_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ItemDefinition(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lane feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLanePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_lane_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_lane_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Lane(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lane Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLaneSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_laneSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_laneSet_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_LaneSet(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link Event Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkEventDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_linkEventDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_linkEventDefinition_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_LinkEventDefinition(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Loop Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoopCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_loopCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_loopCharacteristics_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_LoopCharacteristics(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Manual Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManualTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_manualTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_manualTask_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ManualTask(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_message_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_message_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Message(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message Event Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageEventDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_messageEventDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_messageEventDefinition_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_MessageEventDefinition(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message Flow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageFlowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_messageFlow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_messageFlow_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_MessageFlow(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message Flow Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageFlowAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_messageFlowAssociation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_messageFlowAssociation_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_MessageFlowAssociation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Monitoring feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonitoringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_monitoring_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_monitoring_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Monitoring(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multi Instance Loop Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiInstanceLoopCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_multiInstanceLoopCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_multiInstanceLoopCharacteristics_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_MultiInstanceLoopCharacteristics(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_operation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_operation_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Operation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_outputSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_outputSet_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_OutputSet(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parallel Gateway feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParallelGatewayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_parallelGateway_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_parallelGateway_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ParallelGateway(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Participant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParticipantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_participant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_participant_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Participant(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Participant Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParticipantAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_participantAssociation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_participantAssociation_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ParticipantAssociation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Participant Multiplicity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParticipantMultiplicityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_participantMultiplicity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_participantMultiplicity_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ParticipantMultiplicity(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Partner Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartnerEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_partnerEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_partnerEntity_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_PartnerEntity(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Partner Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartnerRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_partnerRole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_partnerRole_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_PartnerRole(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Potential Owner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPotentialOwnerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_potentialOwner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_potentialOwner_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_PotentialOwner(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Process feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_process_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_process_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Process(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_property_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_property_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Property(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Receive Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReceiveTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_receiveTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_receiveTask_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ReceiveTask(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relationship feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelationshipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_relationship_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_relationship_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Relationship(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rendering feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRenderingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_rendering_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_rendering_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Rendering(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_resource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_resource_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Resource(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource Assignment Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceAssignmentExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_resourceAssignmentExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_resourceAssignmentExpression_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceAssignmentExpression(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_resourceParameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_resourceParameter_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceParameter(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource Parameter Binding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceParameterBindingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_resourceParameterBinding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_resourceParameterBinding_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceParameterBinding(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Script feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScriptPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_script_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_script_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Script Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScriptTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_scriptTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_scriptTask_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ScriptTask(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Send Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSendTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_sendTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_sendTask_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SendTask(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sequence Flow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSequenceFlowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_sequenceFlow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_sequenceFlow_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SequenceFlow(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_serviceTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_serviceTask_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ServiceTask(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Signal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_signal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_signal_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Signal(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Signal Event Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignalEventDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_signalEventDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_signalEventDefinition_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SignalEventDefinition(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Standard Loop Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStandardLoopCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_standardLoopCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_standardLoopCharacteristics_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_StandardLoopCharacteristics(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_startEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_startEvent_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_StartEvent(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Choreography feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubChoreographyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_subChoreography_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_subChoreography_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SubChoreography(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Conversation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubConversationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_subConversation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_subConversation_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SubConversation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Process feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubProcessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_subProcess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_subProcess_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SubProcess(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_task_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_task_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Task(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Terminate Event Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTerminateEventDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_terminateEventDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_terminateEventDefinition_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_TerminateEventDefinition(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_text_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_text_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Annotation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextAnnotationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_textAnnotation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_textAnnotation_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_TextAnnotation(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Throw Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThrowEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_throwEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_throwEvent_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ThrowEvent(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer Event Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimerEventDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_timerEventDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_timerEventDefinition_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_TimerEventDefinition(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transaction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransactionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_transaction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_transaction_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Transaction(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_userTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_userTask_feature", "_UI_DocumentRoot_type"),
				 BPMN2ModelPackage.eINSTANCE.getDocumentRoot_UserTask(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Activity());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_AdHocSubProcess());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Artifact());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Assignment());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Association());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Auditing());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BoundaryEvent());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BusinessRuleTask());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallableElement());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallActivity());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallChoreography());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallConversation());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConversationNode());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CancelEventDefinition());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventDefinition());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CatchEvent());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Category());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CategoryValue());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Choreography());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Collaboration());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ChoreographyActivity());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ChoreographyTask());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CompensateEventDefinition());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ComplexBehaviorDefinition());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ComplexGateway());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConditionalEventDefinition());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Conversation());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConversationAssociation());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConversationLink());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationKey());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationProperty());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationPropertyBinding());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationPropertyRetrievalExpression());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationSubscription());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataAssociation());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataInput());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataInputAssociation());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataObject());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataObjectReference());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataOutput());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataOutputAssociation());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataState());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataStore());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataStoreReference());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Definitions());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Documentation());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EndEvent());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EndPoint());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Error());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ErrorEventDefinition());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Escalation());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EscalationEventDefinition());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Event());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventBasedGateway());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ExclusiveGateway());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Expression());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Extension());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ExtensionElements());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FormalExpression());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Gateway());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalBusinessRuleTask());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalChoreographyTask());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalConversation());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalManualTask());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalScriptTask());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalTask());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalUserTask());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Group());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_HumanPerformer());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Performer());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceRole());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ImplicitThrowEvent());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Import());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_InclusiveGateway());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_InputSet());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Interface());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_IntermediateCatchEvent());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_IntermediateThrowEvent());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_IoBinding());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_IoSpecification());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ItemDefinition());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Lane());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_LaneSet());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_LinkEventDefinition());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_LoopCharacteristics());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ManualTask());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Message());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_MessageEventDefinition());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_MessageFlow());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_MessageFlowAssociation());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Monitoring());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_MultiInstanceLoopCharacteristics());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Operation());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_OutputSet());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ParallelGateway());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Participant());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ParticipantAssociation());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ParticipantMultiplicity());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_PartnerEntity());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_PartnerRole());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_PotentialOwner());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Process());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Property());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ReceiveTask());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Relationship());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Rendering());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Resource());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceAssignmentExpression());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceParameter());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceParameterBinding());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ScriptTask());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SendTask());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SequenceFlow());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ServiceTask());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Signal());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SignalEventDefinition());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_StandardLoopCharacteristics());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_StartEvent());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SubChoreography());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SubConversation());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SubProcess());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Task());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_TerminateEventDefinition());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_TextAnnotation());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ThrowEvent());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_TimerEventDefinition());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Transaction());
			childrenFeatures.add(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_UserTask());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case BPMN2ModelPackage.DOCUMENT_ROOT__ACTIVITY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS:
			case BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_ELEMENT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__ARTIFACT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__ASSIGNMENT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__ASSOCIATION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__AUDITING:
			case BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__BOUNDARY_EVENT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__BUSINESS_RULE_TASK:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_ACTIVITY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CHOREOGRAPHY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CONVERSATION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_NODE:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_DEFINITION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATCH_EVENT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY_VALUE:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__COLLABORATION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_TASK:
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_GATEWAY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_LINK:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_KEY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_ASSOCIATION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT_REFERENCE:
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STATE:
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE:
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE_REFERENCE:
			case BPMN2ModelPackage.DOCUMENT_ROOT__DEFINITIONS:
			case BPMN2ModelPackage.DOCUMENT_ROOT__DOCUMENTATION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__END_EVENT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__END_POINT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__ERROR:
			case BPMN2ModelPackage.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_BASED_GATEWAY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXPRESSION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION_ELEMENTS:
			case BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_NODE:
			case BPMN2ModelPackage.DOCUMENT_ROOT__FORMAL_EXPRESSION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__GATEWAY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK:
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CONVERSATION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK:
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK:
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_TASK:
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_USER_TASK:
			case BPMN2ModelPackage.DOCUMENT_ROOT__GROUP:
			case BPMN2ModelPackage.DOCUMENT_ROOT__HUMAN_PERFORMER:
			case BPMN2ModelPackage.DOCUMENT_ROOT__PERFORMER:
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ROLE:
			case BPMN2ModelPackage.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__IMPORT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__INCLUSIVE_GATEWAY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__INPUT_SET:
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERFACE:
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__IO_BINDING:
			case BPMN2ModelPackage.DOCUMENT_ROOT__IO_SPECIFICATION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__ITEM_DEFINITION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__LANE:
			case BPMN2ModelPackage.DOCUMENT_ROOT__LANE_SET:
			case BPMN2ModelPackage.DOCUMENT_ROOT__LINK_EVENT_DEFINITION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__LOOP_CHARACTERISTICS:
			case BPMN2ModelPackage.DOCUMENT_ROOT__MANUAL_TASK:
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE:
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW:
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__MONITORING:
			case BPMN2ModelPackage.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
			case BPMN2ModelPackage.DOCUMENT_ROOT__OPERATION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__OUTPUT_SET:
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARALLEL_GATEWAY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ENTITY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ROLE:
			case BPMN2ModelPackage.DOCUMENT_ROOT__POTENTIAL_OWNER:
			case BPMN2ModelPackage.DOCUMENT_ROOT__PROCESS:
			case BPMN2ModelPackage.DOCUMENT_ROOT__PROPERTY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__RECEIVE_TASK:
			case BPMN2ModelPackage.DOCUMENT_ROOT__RELATIONSHIP:
			case BPMN2ModelPackage.DOCUMENT_ROOT__RENDERING:
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE:
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER:
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING:
			case BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT_TASK:
			case BPMN2ModelPackage.DOCUMENT_ROOT__SEND_TASK:
			case BPMN2ModelPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
			case BPMN2ModelPackage.DOCUMENT_ROOT__SERVICE_TASK:
			case BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL:
			case BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS:
			case BPMN2ModelPackage.DOCUMENT_ROOT__START_EVENT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CHOREOGRAPHY:
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CONVERSATION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_PROCESS:
			case BPMN2ModelPackage.DOCUMENT_ROOT__TASK:
			case BPMN2ModelPackage.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__TEXT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__TEXT_ANNOTATION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__THROW_EVENT:
			case BPMN2ModelPackage.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__TRANSACTION:
			case BPMN2ModelPackage.DOCUMENT_ROOT__USER_TASK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Activity(),
				 BPMN2ModelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Activity(),
				 BPMN2ModelFactory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Activity(),
				 BPMN2ModelFactory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Activity(),
				 BPMN2ModelFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Activity(),
				 BPMN2ModelFactory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Activity(),
				 BPMN2ModelFactory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Activity(),
				 BPMN2ModelFactory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Activity(),
				 BPMN2ModelFactory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Activity(),
				 BPMN2ModelFactory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Activity(),
				 BPMN2ModelFactory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Activity(),
				 BPMN2ModelFactory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Activity(),
				 BPMN2ModelFactory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Activity(),
				 BPMN2ModelFactory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_AdHocSubProcess(),
				 BPMN2ModelFactory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataStoreReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement(),
				 BPMN2ModelFactory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Artifact(),
				 BPMN2ModelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Artifact(),
				 BPMN2ModelFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Artifact(),
				 BPMN2ModelFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Artifact(),
				 BPMN2ModelFactory.eINSTANCE.createTextAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Assignment(),
				 BPMN2ModelFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Association(),
				 BPMN2ModelFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Auditing(),
				 BPMN2ModelFactory.eINSTANCE.createAuditing()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createBaseElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createAuditing()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createConversationNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createCallConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createRootElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createCallableElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createCancelEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createCategoryValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createCompensateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createComplexBehaviorDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createConditionalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createConversationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createConversationLink()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationKey()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationPropertyBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationPropertyRetrievalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationSubscription()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createItemAwareElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataInput()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataInputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataOutput()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataOutputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataState()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataStore()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataStoreReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createError()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createErrorEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createEscalationEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createFormalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createResourceRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createInputOutputSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createInputSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createItemDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createLane()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createLaneSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createLinkEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createMessageEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createMessageFlowAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createMonitoring()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createMultiInstanceLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createOutputSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createParticipantAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createPartnerEntity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createPartnerRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createResourceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createSignalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createStandardLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createSubConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createTerminateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createTextAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createTimerEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement(),
				 BPMN2ModelFactory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createBaseElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createAuditing()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createConversationNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createCallConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createRootElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createCallableElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createCancelEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createCategoryValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createCompensateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createComplexBehaviorDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createConditionalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createConversationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createConversationLink()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationKey()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationPropertyBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationPropertyRetrievalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationSubscription()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createDataAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createItemAwareElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createDataInput()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createDataInputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createDataObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createDataOutput()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createDataOutputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createDataState()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createDataStore()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createDataStoreReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createError()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createErrorEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createEscalationEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createFormalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createResourceRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createInputOutputSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createInputSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createItemDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createLane()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createLaneSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createLinkEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createMessageEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createMessageFlowAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createMonitoring()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createMultiInstanceLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createOutputSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createParticipantAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createPartnerEntity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createPartnerRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createResourceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createSignalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createStandardLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createSubConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createTerminateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createTextAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createTimerEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 BPMN2ModelFactory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BoundaryEvent(),
				 BPMN2ModelFactory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BusinessRuleTask(),
				 BPMN2ModelFactory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallableElement(),
				 BPMN2ModelFactory.eINSTANCE.createCallableElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallableElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallableElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallableElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallableElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallableElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallableElement(),
				 BPMN2ModelFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallActivity(),
				 BPMN2ModelFactory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallChoreography(),
				 BPMN2ModelFactory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallConversation(),
				 BPMN2ModelFactory.eINSTANCE.createCallConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConversationNode(),
				 BPMN2ModelFactory.eINSTANCE.createConversationNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConversationNode(),
				 BPMN2ModelFactory.eINSTANCE.createCallConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConversationNode(),
				 BPMN2ModelFactory.eINSTANCE.createConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConversationNode(),
				 BPMN2ModelFactory.eINSTANCE.createSubConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CancelEventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createCancelEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createCancelEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createCompensateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createConditionalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createErrorEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createEscalationEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createLinkEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createMessageEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createSignalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createTerminateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createTimerEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createRootElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createCallableElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createCancelEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createCompensateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createConditionalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createDataStore()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createError()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createErrorEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createEscalationEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createItemDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createLinkEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createMessageEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createPartnerEntity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createPartnerRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createSignalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createTerminateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement(),
				 BPMN2ModelFactory.eINSTANCE.createTimerEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CatchEvent(),
				 BPMN2ModelFactory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CatchEvent(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CatchEvent(),
				 BPMN2ModelFactory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Category(),
				 BPMN2ModelFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CategoryValue(),
				 BPMN2ModelFactory.eINSTANCE.createCategoryValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Choreography(),
				 BPMN2ModelFactory.eINSTANCE.createChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Choreography(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Collaboration(),
				 BPMN2ModelFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Collaboration(),
				 BPMN2ModelFactory.eINSTANCE.createChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Collaboration(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Collaboration(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ChoreographyActivity(),
				 BPMN2ModelFactory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ChoreographyActivity(),
				 BPMN2ModelFactory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ChoreographyActivity(),
				 BPMN2ModelFactory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ChoreographyTask(),
				 BPMN2ModelFactory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CompensateEventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createCompensateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ComplexBehaviorDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createComplexBehaviorDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ComplexGateway(),
				 BPMN2ModelFactory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConditionalEventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createConditionalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Conversation(),
				 BPMN2ModelFactory.eINSTANCE.createConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConversationAssociation(),
				 BPMN2ModelFactory.eINSTANCE.createConversationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConversationLink(),
				 BPMN2ModelFactory.eINSTANCE.createConversationLink()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationKey(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationKey()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationProperty(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationPropertyBinding(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationPropertyBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationPropertyRetrievalExpression(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationPropertyRetrievalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationSubscription(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationSubscription()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataAssociation(),
				 BPMN2ModelFactory.eINSTANCE.createDataAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataAssociation(),
				 BPMN2ModelFactory.eINSTANCE.createDataInputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataAssociation(),
				 BPMN2ModelFactory.eINSTANCE.createDataOutputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataInput(),
				 BPMN2ModelFactory.eINSTANCE.createDataInput()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataInputAssociation(),
				 BPMN2ModelFactory.eINSTANCE.createDataInputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataObject(),
				 BPMN2ModelFactory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataObjectReference(),
				 BPMN2ModelFactory.eINSTANCE.createDataObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataOutput(),
				 BPMN2ModelFactory.eINSTANCE.createDataOutput()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataOutputAssociation(),
				 BPMN2ModelFactory.eINSTANCE.createDataOutputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataState(),
				 BPMN2ModelFactory.eINSTANCE.createDataState()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataStore(),
				 BPMN2ModelFactory.eINSTANCE.createDataStore()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataStoreReference(),
				 BPMN2ModelFactory.eINSTANCE.createDataStoreReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Definitions(),
				 BPMN2ModelFactory.eINSTANCE.createDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Documentation(),
				 BPMN2ModelFactory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EndEvent(),
				 BPMN2ModelFactory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EndPoint(),
				 BPMN2ModelFactory.eINSTANCE.createEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Error(),
				 BPMN2ModelFactory.eINSTANCE.createError()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ErrorEventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createErrorEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Escalation(),
				 BPMN2ModelFactory.eINSTANCE.createEscalation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EscalationEventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createEscalationEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Event(),
				 BPMN2ModelFactory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Event(),
				 BPMN2ModelFactory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Event(),
				 BPMN2ModelFactory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Event(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Event(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Event(),
				 BPMN2ModelFactory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventBasedGateway(),
				 BPMN2ModelFactory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ExclusiveGateway(),
				 BPMN2ModelFactory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Expression(),
				 BPMN2ModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Expression(),
				 BPMN2ModelFactory.eINSTANCE.createFormalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Extension(),
				 BPMN2ModelFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ExtensionElements(),
				 BPMN2ModelFactory.eINSTANCE.createExtensionAttributeValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode(),
				 BPMN2ModelFactory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FormalExpression(),
				 BPMN2ModelFactory.eINSTANCE.createFormalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalBusinessRuleTask(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalChoreographyTask(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalConversation(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalManualTask(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalScriptTask(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalUserTask(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Group(),
				 BPMN2ModelFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_HumanPerformer(),
				 BPMN2ModelFactory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_HumanPerformer(),
				 BPMN2ModelFactory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Performer(),
				 BPMN2ModelFactory.eINSTANCE.createPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Performer(),
				 BPMN2ModelFactory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Performer(),
				 BPMN2ModelFactory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceRole(),
				 BPMN2ModelFactory.eINSTANCE.createResourceRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceRole(),
				 BPMN2ModelFactory.eINSTANCE.createPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceRole(),
				 BPMN2ModelFactory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceRole(),
				 BPMN2ModelFactory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ImplicitThrowEvent(),
				 BPMN2ModelFactory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Import(),
				 BPMN2ModelFactory.eINSTANCE.createImport()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_InclusiveGateway(),
				 BPMN2ModelFactory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_InputSet(),
				 BPMN2ModelFactory.eINSTANCE.createInputSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Interface(),
				 BPMN2ModelFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_IntermediateCatchEvent(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_IntermediateThrowEvent(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_IoBinding(),
				 BPMN2ModelFactory.eINSTANCE.createInputOutputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_IoSpecification(),
				 BPMN2ModelFactory.eINSTANCE.createInputOutputSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ItemDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createItemDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Lane(),
				 BPMN2ModelFactory.eINSTANCE.createLane()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_LaneSet(),
				 BPMN2ModelFactory.eINSTANCE.createLaneSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_LinkEventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createLinkEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_LoopCharacteristics(),
				 BPMN2ModelFactory.eINSTANCE.createMultiInstanceLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_LoopCharacteristics(),
				 BPMN2ModelFactory.eINSTANCE.createStandardLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ManualTask(),
				 BPMN2ModelFactory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Message(),
				 BPMN2ModelFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_MessageEventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createMessageEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_MessageFlow(),
				 BPMN2ModelFactory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_MessageFlowAssociation(),
				 BPMN2ModelFactory.eINSTANCE.createMessageFlowAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Monitoring(),
				 BPMN2ModelFactory.eINSTANCE.createMonitoring()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_MultiInstanceLoopCharacteristics(),
				 BPMN2ModelFactory.eINSTANCE.createMultiInstanceLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Operation(),
				 BPMN2ModelFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_OutputSet(),
				 BPMN2ModelFactory.eINSTANCE.createOutputSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ParallelGateway(),
				 BPMN2ModelFactory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Participant(),
				 BPMN2ModelFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ParticipantAssociation(),
				 BPMN2ModelFactory.eINSTANCE.createParticipantAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ParticipantMultiplicity(),
				 BPMN2ModelFactory.eINSTANCE.createParticipantMultiplicity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_PartnerEntity(),
				 BPMN2ModelFactory.eINSTANCE.createPartnerEntity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_PartnerRole(),
				 BPMN2ModelFactory.eINSTANCE.createPartnerRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_PotentialOwner(),
				 BPMN2ModelFactory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Process(),
				 BPMN2ModelFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Property(),
				 BPMN2ModelFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ReceiveTask(),
				 BPMN2ModelFactory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Relationship(),
				 BPMN2ModelFactory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Rendering(),
				 BPMN2ModelFactory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Resource(),
				 BPMN2ModelFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceAssignmentExpression(),
				 BPMN2ModelFactory.eINSTANCE.createResourceAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceParameter(),
				 BPMN2ModelFactory.eINSTANCE.createResourceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceParameterBinding(),
				 BPMN2ModelFactory.eINSTANCE.createResourceParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createDocumentRoot()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createBaseElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createAuditing()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createConversationNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createCallConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createRootElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createCallableElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createCancelEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createCategoryValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createCompensateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createComplexBehaviorDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createConditionalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createConversationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createConversationLink()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationKey()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationPropertyBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationPropertyRetrievalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationSubscription()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createDataAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createItemAwareElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createDataInput()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createDataInputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createDataObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createDataOutput()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createDataOutputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createDataState()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createDataStore()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createDataStoreReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createError()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createErrorEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createEscalation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createEscalationEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createExtensionAttributeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createExtensionAttributeValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createExtensionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createFormalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createResourceRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createImport()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createInputOutputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createInputOutputSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createInputSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createInteractionNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createItemDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createLane()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createLaneSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createLinkEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createMessageEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createMessageFlowAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createMonitoring()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createMultiInstanceLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createOutputSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createParticipantAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createParticipantMultiplicity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createPartnerEntity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createPartnerRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createResourceAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createResourceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createResourceParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createSignalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createStandardLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createSubConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createTerminateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createTextAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createTimerEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 BPMN2ModelFactory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 LinkModelFactory.eINSTANCE.createDesignAlternatives()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 LinkModelFactory.eINSTANCE.createDesignDecision()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 LinkModelFactory.eINSTANCE.createTraceLink()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 LinkModelFactory.eINSTANCE.createTrace()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 LinkModelFactory.eINSTANCE.createLinkType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 LinkModelFactory.eINSTANCE.createLinkTypeCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 LinkModelFactory.eINSTANCE.createLinkContainer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 RuleModelFactory.eINSTANCE.createRuleCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 RuleModelFactory.eINSTANCE.createRule()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 RuleModelFactory.eINSTANCE.createElementDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 RuleModelFactory.eINSTANCE.createActionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 RuleModelFactory.eINSTANCE.createLogicCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 RuleModelFactory.eINSTANCE.createBaseCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ReportModelFactory.eINSTANCE.createViolationType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ReportModelFactory.eINSTANCE.createViolationTypeCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ReportModelFactory.eINSTANCE.createReportContainer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ReportModelFactory.eINSTANCE.createImpactReport()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ReportModelFactory.eINSTANCE.createConsistenceReport()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 FeatureModelFactory.eINSTANCE.createConsulModel()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 FeatureModelFactory.eINSTANCE.createHead()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 FeatureModelFactory.eINSTANCE.createProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 FeatureModelFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 FeatureModelFactory.eINSTANCE.createRestrictions()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 FeatureModelFactory.eINSTANCE.createRestSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 FeatureModelFactory.eINSTANCE.createRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 FeatureModelFactory.eINSTANCE.createElements()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 FeatureModelFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 FeatureModelFactory.eINSTANCE.createDesc()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 FeatureModelFactory.eINSTANCE.createVName()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 FeatureModelFactory.eINSTANCE.createRelations()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 FeatureModelFactory.eINSTANCE.createRelation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 FeatureModelFactory.eINSTANCE.createTarget()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 FeatureModelFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 FeatureModelFactory.eINSTANCE.createCalculate()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 FeatureModelFactory.eINSTANCE.createScript()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createAbbreviatedIRI()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createAnnotationAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createAnnotationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createAnnotationPropertyDomain()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createAnnotationPropertyRange()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createAnonymousIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createAsymmetricObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createClassAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDataAllValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDataComplementOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDataExactCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDataHasValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDataIntersectionOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDataMaxCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDataMinCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDataOneOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDataPropertyAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDataPropertyDomain()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDataPropertyRange()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDataSomeValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDatatypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDatatypeRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDataUnionOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDifferentIndividuals()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDisjointClasses()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDisjointDataProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDisjointObjectProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createDisjointUnion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createEquivalentClasses()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createEquivalentDataProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createEquivalentObjectProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createFacetRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createFunctionalDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createFunctionalObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createHasKey()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createImport()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createInverseFunctionalObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createInverseObjectProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createIRI()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createIrreflexiveObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createNamedIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createNegativeDataPropertyAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createNegativeObjectPropertyAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createObjectAllValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createObjectComplementOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createObjectExactCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createObjectHasSelf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createObjectHasValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createObjectIntersectionOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createObjectInverseOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createObjectMaxCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createObjectMinCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createObjectOneOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createObjectPropertyAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createObjectPropertyChain()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createObjectPropertyDomain()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createObjectPropertyRange()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createObjectSomeValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createObjectUnionOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createOntology()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createPrefix()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createReflexiveObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createSameIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createSubAnnotationPropertyOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createSubClassOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createSubDataPropertyOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createSubObjectPropertyOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createSymmetricObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 OWLModelFactory.eINSTANCE.createTransitiveObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createURNmodelElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createUCMmodelElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createGeneralResource()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createActiveResource()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createGRLmodelElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createGRLLinkableElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createActorRef()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createPathNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createAndFork()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createAndJoin()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createWorkload()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createClosedWorkload()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createGRLNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createCollapsedActorRef()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createComment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createComponentBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createComponentRef()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createConcern()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createConcreteCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createConcreteGRLspec()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createConcreteStyle()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createConcreteURNspec()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createConnect()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createElementLink()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createContribution()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createDemand()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createDirectionArrow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createDocumentRoot()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createEmptyPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createEnumerationType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createEvaluation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createEvaluationStrategy()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createExternalOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createGRLGraph()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createGRLspec()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createInBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createInitialization()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createIntentionalElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createIntentionalElementRef()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createLinkRef()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createLinkRefBendpoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createMetadata()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createNodeConnection()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createOpenWorkload()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createOrFork()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createOrJoin()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createOutBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createOWPeriodic()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createOWPhaseType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createOWPoisson()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createOWUniform()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createPassiveResource()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createPluginBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createProcessingResource()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createResponsibility()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createRespRef()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createScenarioDef()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createScenarioGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createSize()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createStartPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createStrategiesGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createStub()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createWaitingPlace()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createTimer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createUCMmap()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createUCMspec()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createURNlink()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createURNspec()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 URNModelFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createAcceptCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createActionExecutionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createPin()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createActionInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createActivityFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createActivityPartition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createActivityParameterNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createAddVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createBehaviorExecutionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createBroadcastSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createCallBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createTemplateParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createClassifierTemplateParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createClause()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createClearVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createClearAssociationAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createClearStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createCollaborationUse()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createComment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createCombinedFragment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createConsiderIgnoreFragment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createContinuation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createConnectableElementTemplateParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createConnectorEnd()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createConnectionPointReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createCreationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createCreateLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createCreateLinkObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createCreateObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createCentralBufferNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createDataStoreNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createDecisionNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createDestroyLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createDestroyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createDestructionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createElementImport()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createExceptionHandler()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createExecutionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createExecutionOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createExpansionNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createExtend()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createExtensionPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createForkNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createFlowFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createGate()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createGeneralOrdering()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createInclude()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createInterruptibleActivityRegion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createInitialNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createInteractionUse()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createInteractionOperand()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createJoinNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createLifeline()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createLinkEndData()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createLinkEndCreationData()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createLinkEndDestructionData()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createMessageOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createMergeNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createOperationTemplateParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createOpaqueAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createObjectFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createOutputPin()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createPackageImport()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createPackageMerge()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createParameterSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createPartDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createProtocolTransition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createProfileApplication()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createProtocolConformance()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createPseudostate()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createQualifierValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createRaiseExceptionAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createReceiveOperationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createReceiveSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createReclassifyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createReadExtentAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createReadLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createReadLinkObjectEndAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createReadSelfAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createReadStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createReadVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createRedefinableTemplateSignature()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createReduceAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createReplyAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createRemoveVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createReception()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createRegion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createSendSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createSlot()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createStateInvariant()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createStartClassifierBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createSendObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createTemplateBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createTemplateSignature()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createTemplateParameterSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createTestIdentityAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createTimeObservation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createUnmarshallAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createValuePin()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createValueSpecificationAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 UMLModelFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EMFfitModelFactory.eINSTANCE.createHypertext()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EMFfitModelFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EMFfitModelFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EMFfitModelFactory.eINSTANCE.createFactorTable()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EMFfitModelFactory.eINSTANCE.createFactorCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EMFfitModelFactory.eINSTANCE.createFactor()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EMFfitModelFactory.eINSTANCE.createIssueCard()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EMFfitModelFactory.eINSTANCE.createStrategy()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EMFfitModelFactory.eINSTANCE.createInfluencingFactor()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EMFfitModelFactory.eINSTANCE.createRelatedIssue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EMFfitModelFactory.eINSTANCE.createFTICPackage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ConstraintsFactory.eINSTANCE.createLogicCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ConstraintsFactory.eINSTANCE.createBaseCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ConstraintsFactory.eINSTANCE.createPredefinedConstraintSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ConstraintsFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ConstraintsFactory.eINSTANCE.createPrecondition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ConstraintsFactory.eINSTANCE.createStringTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ConstraintsFactory.eINSTANCE.createIntegerTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ConstraintsFactory.eINSTANCE.createBooleanTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ConstraintsFactory.eINSTANCE.createFloatTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ConstraintsFactory.eINSTANCE.createRegularExpressionTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ConstraintsFactory.eINSTANCE.createEnumTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ConstraintsFactory.eINSTANCE.createTechnicalPropertiesCatalogue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ConstraintsFactory.eINSTANCE.createPredefinedConstraintSetCatalogue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ConstraintsFactory.eINSTANCE.createTechnicalPropertyCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 GSSFactory.eINSTANCE.createDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 GSSFactory.eINSTANCE.createImpact()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 GSSFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 GSSFactory.eINSTANCE.createPrinciple()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 GSSFactory.eINSTANCE.createPattern()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 GSSFactory.eINSTANCE.createRefactoring()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 GSSFactory.eINSTANCE.createOffset()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 GSSFactory.eINSTANCE.createFlaw()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 GSSFactory.eINSTANCE.createGSS()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 GSSFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 GSSFactory.eINSTANCE.createTagsCatalogue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 GSSFactory.eINSTANCE.createisA()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 QueryFactory.eINSTANCE.createGSSQuery()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 QueryFactory.eINSTANCE.createGSSQueryContainment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 QueryFactory.eINSTANCE.createQueryResultSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 QueryFactory.eINSTANCE.createApplicableElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 QueryFactory.eINSTANCE.createRating()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 QueryFactory.eINSTANCE.createSelectedGoalsSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 QueryFactory.eINSTANCE.createAssignedConstraintsSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 QueryFactory.eINSTANCE.createPrioritizedElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 QueryFactory.eINSTANCE.createSelectedPrinciplesSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 QueryFactory.eINSTANCE.createPrioritizedDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 QueryFactory.eINSTANCE.createSelectedGoalsPriorities()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 PackagesFactory.eINSTANCE.createToolbox()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createArchitectureKnowledgeModel()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createTechnologySolutionCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createTechnologyFeatureCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createRelationCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createASTACatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createTechnologySolutions()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createTechnologySolution()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createTechnologyFeature()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createFeatureBasedBenefit()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createConcernBasedBenefit()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createFeatureBasedDrawback()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createConcernBasedDrawback()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createRelations()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createTechnologySolutionRelation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createASTARelation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ArchitectureKnowledgeCatalogPackageFactory.eINSTANCE.createArchitectureKnowledgeCatalogPackage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ChangeModelFactory.eINSTANCE.createAtomicChangeType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ChangeModelFactory.eINSTANCE.createCompositeChangeType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ChangeModelFactory.eINSTANCE.createAtomicChangeInstance()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ChangeModelFactory.eINSTANCE.createCompositeChangeInstance()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 ChangeModelFactory.eINSTANCE.createChangeTypeCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EcoreFactory.eINSTANCE.createEEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EcoreFactory.eINSTANCE.createEFactory()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EcoreFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EcoreFactory.eINSTANCE.createEPackage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EcoreFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EcoreFactory.eINSTANCE.createEGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script(),
				 EcoreFactory.eINSTANCE.createETypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ScriptTask(),
				 BPMN2ModelFactory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SendTask(),
				 BPMN2ModelFactory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SequenceFlow(),
				 BPMN2ModelFactory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ServiceTask(),
				 BPMN2ModelFactory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Signal(),
				 BPMN2ModelFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SignalEventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createSignalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_StandardLoopCharacteristics(),
				 BPMN2ModelFactory.eINSTANCE.createStandardLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_StartEvent(),
				 BPMN2ModelFactory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SubChoreography(),
				 BPMN2ModelFactory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SubConversation(),
				 BPMN2ModelFactory.eINSTANCE.createSubConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SubProcess(),
				 BPMN2ModelFactory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SubProcess(),
				 BPMN2ModelFactory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SubProcess(),
				 BPMN2ModelFactory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Task(),
				 BPMN2ModelFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Task(),
				 BPMN2ModelFactory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Task(),
				 BPMN2ModelFactory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Task(),
				 BPMN2ModelFactory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Task(),
				 BPMN2ModelFactory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Task(),
				 BPMN2ModelFactory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Task(),
				 BPMN2ModelFactory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Task(),
				 BPMN2ModelFactory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_TerminateEventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createTerminateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createDocumentRoot()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createBaseElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createAuditing()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createConversationNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createCallConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createRootElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createCallableElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createCancelEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createCategoryValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createCompensateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createComplexBehaviorDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createConditionalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createConversationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createConversationLink()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationKey()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationPropertyBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationPropertyRetrievalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createCorrelationSubscription()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createDataAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createItemAwareElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createDataInput()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createDataInputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createDataObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createDataOutput()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createDataOutputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createDataState()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createDataStore()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createDataStoreReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createError()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createErrorEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createEscalation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createEscalationEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createExtensionAttributeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createExtensionAttributeValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createExtensionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createFormalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createResourceRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createImport()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createInputOutputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createInputOutputSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createInputSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createInteractionNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createItemDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createLane()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createLaneSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createLinkEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createMessageEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createMessageFlowAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createMonitoring()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createMultiInstanceLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createOutputSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createParticipantAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createParticipantMultiplicity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createPartnerEntity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createPartnerRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createResourceAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createResourceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createResourceParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createSignalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createStandardLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createSubConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createTerminateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createTextAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createTimerEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 BPMN2ModelFactory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 LinkModelFactory.eINSTANCE.createDesignAlternatives()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 LinkModelFactory.eINSTANCE.createDesignDecision()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 LinkModelFactory.eINSTANCE.createTraceLink()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 LinkModelFactory.eINSTANCE.createTrace()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 LinkModelFactory.eINSTANCE.createLinkType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 LinkModelFactory.eINSTANCE.createLinkTypeCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 LinkModelFactory.eINSTANCE.createLinkContainer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 RuleModelFactory.eINSTANCE.createRuleCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 RuleModelFactory.eINSTANCE.createRule()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 RuleModelFactory.eINSTANCE.createElementDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 RuleModelFactory.eINSTANCE.createActionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 RuleModelFactory.eINSTANCE.createLogicCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 RuleModelFactory.eINSTANCE.createBaseCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ReportModelFactory.eINSTANCE.createViolationType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ReportModelFactory.eINSTANCE.createViolationTypeCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ReportModelFactory.eINSTANCE.createReportContainer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ReportModelFactory.eINSTANCE.createImpactReport()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ReportModelFactory.eINSTANCE.createConsistenceReport()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 FeatureModelFactory.eINSTANCE.createConsulModel()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 FeatureModelFactory.eINSTANCE.createHead()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 FeatureModelFactory.eINSTANCE.createProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 FeatureModelFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 FeatureModelFactory.eINSTANCE.createRestrictions()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 FeatureModelFactory.eINSTANCE.createRestSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 FeatureModelFactory.eINSTANCE.createRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 FeatureModelFactory.eINSTANCE.createElements()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 FeatureModelFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 FeatureModelFactory.eINSTANCE.createDesc()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 FeatureModelFactory.eINSTANCE.createVName()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 FeatureModelFactory.eINSTANCE.createRelations()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 FeatureModelFactory.eINSTANCE.createRelation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 FeatureModelFactory.eINSTANCE.createTarget()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 FeatureModelFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 FeatureModelFactory.eINSTANCE.createCalculate()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 FeatureModelFactory.eINSTANCE.createScript()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createAbbreviatedIRI()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createAnnotationAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createAnnotationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createAnnotationPropertyDomain()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createAnnotationPropertyRange()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createAnonymousIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createAsymmetricObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createClassAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDataAllValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDataComplementOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDataExactCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDataHasValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDataIntersectionOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDataMaxCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDataMinCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDataOneOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDataPropertyAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDataPropertyDomain()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDataPropertyRange()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDataSomeValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDatatypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDatatypeRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDataUnionOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDifferentIndividuals()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDisjointClasses()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDisjointDataProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDisjointObjectProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createDisjointUnion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createEquivalentClasses()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createEquivalentDataProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createEquivalentObjectProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createFacetRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createFunctionalDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createFunctionalObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createHasKey()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createImport()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createInverseFunctionalObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createInverseObjectProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createIRI()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createIrreflexiveObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createNamedIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createNegativeDataPropertyAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createNegativeObjectPropertyAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createObjectAllValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createObjectComplementOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createObjectExactCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createObjectHasSelf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createObjectHasValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createObjectIntersectionOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createObjectInverseOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createObjectMaxCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createObjectMinCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createObjectOneOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createObjectPropertyAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createObjectPropertyChain()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createObjectPropertyDomain()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createObjectPropertyRange()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createObjectSomeValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createObjectUnionOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createOntology()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createPrefix()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createReflexiveObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createSameIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createSubAnnotationPropertyOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createSubClassOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createSubDataPropertyOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createSubObjectPropertyOf()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createSymmetricObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 OWLModelFactory.eINSTANCE.createTransitiveObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createURNmodelElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createUCMmodelElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createGeneralResource()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createActiveResource()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createGRLmodelElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createGRLLinkableElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createActorRef()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createPathNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createAndFork()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createAndJoin()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createWorkload()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createClosedWorkload()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createGRLNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createCollapsedActorRef()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createComment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createComponentBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createComponentRef()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createConcern()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createConcreteCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createConcreteGRLspec()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createConcreteStyle()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createConcreteURNspec()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createConnect()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createElementLink()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createContribution()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createDemand()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createDirectionArrow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createDocumentRoot()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createEmptyPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createEnumerationType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createEvaluation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createEvaluationStrategy()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createExternalOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createGRLGraph()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createGRLspec()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createInBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createInitialization()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createIntentionalElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createIntentionalElementRef()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createLinkRef()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createLinkRefBendpoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createMetadata()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createNodeConnection()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createOpenWorkload()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createOrFork()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createOrJoin()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createOutBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createOWPeriodic()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createOWPhaseType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createOWPoisson()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createOWUniform()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createPassiveResource()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createPluginBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createProcessingResource()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createResponsibility()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createRespRef()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createScenarioDef()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createScenarioGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createSize()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createStartPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createStrategiesGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createStub()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createWaitingPlace()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createTimer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createUCMmap()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createUCMspec()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createURNlink()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createURNspec()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 URNModelFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createAcceptCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createActionExecutionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createPin()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createActionInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createActivityFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createActivityPartition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createActivityParameterNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createAddVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createBehaviorExecutionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createBroadcastSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createCallBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createTemplateParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createClassifierTemplateParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createClause()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createClearVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createClearAssociationAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createClearStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createCollaborationUse()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createComment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createCombinedFragment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createConsiderIgnoreFragment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createContinuation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createConnectableElementTemplateParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createConnectorEnd()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createConnectionPointReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createCreationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createCreateLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createCreateLinkObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createCreateObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createCentralBufferNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createDataStoreNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createDecisionNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createDestroyLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createDestroyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createDestructionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createElementImport()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createExceptionHandler()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createExecutionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createExecutionOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createExpansionNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createExtend()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createExtensionPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createForkNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createFlowFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createGate()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createGeneralOrdering()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createInclude()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createInterruptibleActivityRegion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createInitialNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createInteractionUse()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createInteractionOperand()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createJoinNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createLifeline()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createLinkEndData()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createLinkEndCreationData()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createLinkEndDestructionData()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createMessageOccurrenceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createMergeNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createOperationTemplateParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createOpaqueAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createObjectFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createOutputPin()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createPackageImport()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createPackageMerge()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createParameterSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createPartDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createProtocolTransition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createProfileApplication()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createProtocolConformance()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createPseudostate()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createQualifierValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createRaiseExceptionAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createReceiveOperationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createReceiveSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createReclassifyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createReadExtentAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createReadLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createReadLinkObjectEndAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createReadSelfAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createReadStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createReadVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createRedefinableTemplateSignature()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createReduceAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createReplyAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createRemoveVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createReception()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createRegion()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createSendSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createSlot()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createStateInvariant()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createStartClassifierBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createSendObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createTemplateBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createTemplateSignature()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createTemplateParameterSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createTestIdentityAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createTimeObservation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createUnmarshallAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createValuePin()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createValueSpecificationAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 UMLModelFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EMFfitModelFactory.eINSTANCE.createHypertext()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EMFfitModelFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EMFfitModelFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EMFfitModelFactory.eINSTANCE.createFactorTable()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EMFfitModelFactory.eINSTANCE.createFactorCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EMFfitModelFactory.eINSTANCE.createFactor()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EMFfitModelFactory.eINSTANCE.createIssueCard()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EMFfitModelFactory.eINSTANCE.createStrategy()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EMFfitModelFactory.eINSTANCE.createInfluencingFactor()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EMFfitModelFactory.eINSTANCE.createRelatedIssue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EMFfitModelFactory.eINSTANCE.createFTICPackage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ConstraintsFactory.eINSTANCE.createLogicCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ConstraintsFactory.eINSTANCE.createBaseCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ConstraintsFactory.eINSTANCE.createPredefinedConstraintSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ConstraintsFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ConstraintsFactory.eINSTANCE.createPrecondition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ConstraintsFactory.eINSTANCE.createStringTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ConstraintsFactory.eINSTANCE.createIntegerTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ConstraintsFactory.eINSTANCE.createBooleanTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ConstraintsFactory.eINSTANCE.createFloatTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ConstraintsFactory.eINSTANCE.createRegularExpressionTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ConstraintsFactory.eINSTANCE.createEnumTechnicalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ConstraintsFactory.eINSTANCE.createTechnicalPropertiesCatalogue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ConstraintsFactory.eINSTANCE.createPredefinedConstraintSetCatalogue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ConstraintsFactory.eINSTANCE.createTechnicalPropertyCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 GSSFactory.eINSTANCE.createDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 GSSFactory.eINSTANCE.createImpact()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 GSSFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 GSSFactory.eINSTANCE.createPrinciple()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 GSSFactory.eINSTANCE.createPattern()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 GSSFactory.eINSTANCE.createRefactoring()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 GSSFactory.eINSTANCE.createOffset()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 GSSFactory.eINSTANCE.createFlaw()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 GSSFactory.eINSTANCE.createGSS()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 GSSFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 GSSFactory.eINSTANCE.createTagsCatalogue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 GSSFactory.eINSTANCE.createisA()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 QueryFactory.eINSTANCE.createGSSQuery()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 QueryFactory.eINSTANCE.createGSSQueryContainment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 QueryFactory.eINSTANCE.createQueryResultSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 QueryFactory.eINSTANCE.createApplicableElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 QueryFactory.eINSTANCE.createRating()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 QueryFactory.eINSTANCE.createSelectedGoalsSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 QueryFactory.eINSTANCE.createAssignedConstraintsSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 QueryFactory.eINSTANCE.createPrioritizedElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 QueryFactory.eINSTANCE.createSelectedPrinciplesSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 QueryFactory.eINSTANCE.createPrioritizedDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 QueryFactory.eINSTANCE.createSelectedGoalsPriorities()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 PackagesFactory.eINSTANCE.createToolbox()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createArchitectureKnowledgeModel()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createTechnologySolutionCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createTechnologyFeatureCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createRelationCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createASTACatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createTechnologySolutions()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createTechnologySolution()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createTechnologyFeature()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createFeatureBasedBenefit()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createConcernBasedBenefit()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createFeatureBasedDrawback()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createConcernBasedDrawback()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createRelations()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createTechnologySolutionRelation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ArchitectureKnowledgeModelFactory.eINSTANCE.createASTARelation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ArchitectureKnowledgeCatalogPackageFactory.eINSTANCE.createArchitectureKnowledgeCatalogPackage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ChangeModelFactory.eINSTANCE.createAtomicChangeType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ChangeModelFactory.eINSTANCE.createCompositeChangeType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ChangeModelFactory.eINSTANCE.createAtomicChangeInstance()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ChangeModelFactory.eINSTANCE.createCompositeChangeInstance()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 ChangeModelFactory.eINSTANCE.createChangeTypeCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EcoreFactory.eINSTANCE.createEEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EcoreFactory.eINSTANCE.createEFactory()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EcoreFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EcoreFactory.eINSTANCE.createEPackage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EcoreFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EcoreFactory.eINSTANCE.createEGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text(),
				 EcoreFactory.eINSTANCE.createETypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_TextAnnotation(),
				 BPMN2ModelFactory.eINSTANCE.createTextAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ThrowEvent(),
				 BPMN2ModelFactory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ThrowEvent(),
				 BPMN2ModelFactory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ThrowEvent(),
				 BPMN2ModelFactory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_TimerEventDefinition(),
				 BPMN2ModelFactory.eINSTANCE.createTimerEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Transaction(),
				 BPMN2ModelFactory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN2ModelPackage.eINSTANCE.getDocumentRoot_UserTask(),
				 BPMN2ModelFactory.eINSTANCE.createUserTask()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Activity() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowElement() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElement() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FlowNode() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Script() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Text() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SubProcess() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_AdHocSubProcess() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Task() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BusinessRuleTask() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallActivity() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ManualTask() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ReceiveTask() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ScriptTask() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SendTask() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ServiceTask() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Transaction() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_UserTask() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_BoundaryEvent() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CatchEvent() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Event() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallChoreography() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ChoreographyActivity() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ChoreographyTask() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ComplexGateway() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataObject() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataObjectReference() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataStoreReference() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EndEvent() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ThrowEvent() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventBasedGateway() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ExclusiveGateway() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ImplicitThrowEvent() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_InclusiveGateway() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_IntermediateCatchEvent() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_IntermediateThrowEvent() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ParallelGateway() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SequenceFlow() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_StartEvent() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SubChoreography() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Artifact() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Association() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Group() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_TextAnnotation() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Assignment() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Auditing() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConversationNode() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallConversation() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_RootElement() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CallableElement() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EventDefinition() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CancelEventDefinition() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Category() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CategoryValue() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Collaboration() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Choreography() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CompensateEventDefinition() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ComplexBehaviorDefinition() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConditionalEventDefinition() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Conversation() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConversationAssociation() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ConversationLink() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationKey() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationProperty() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationPropertyBinding() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationPropertyRetrievalExpression() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_CorrelationSubscription() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataAssociation() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataInput() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataInputAssociation() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataOutput() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataOutputAssociation() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataState() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_DataStore() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Definitions() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Documentation() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EndPoint() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Error() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ErrorEventDefinition() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_EscalationEventDefinition() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Expression() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_FormalExpression() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalTask() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalBusinessRuleTask() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalChoreographyTask() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalConversation() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalManualTask() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalScriptTask() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_GlobalUserTask() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceRole() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Performer() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_HumanPerformer() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_IoSpecification() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_InputSet() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Interface() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ItemDefinition() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Lane() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_LaneSet() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_LinkEventDefinition() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Message() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_MessageEventDefinition() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_MessageFlow() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_MessageFlowAssociation() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Monitoring() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_LoopCharacteristics() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_MultiInstanceLoopCharacteristics() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Operation() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_OutputSet() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Participant() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ParticipantAssociation() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_PartnerEntity() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_PartnerRole() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_PotentialOwner() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Process() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Property() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Relationship() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Rendering() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Resource() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceParameter() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Signal() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SignalEventDefinition() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_StandardLoopCharacteristics() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_SubConversation() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_TerminateEventDefinition() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_TimerEventDefinition() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Escalation() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Extension() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ExtensionElements() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_Import() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_IoBinding() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ParticipantMultiplicity() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceAssignmentExpression() ||
			childFeature == BPMN2ModelPackage.eINSTANCE.getDocumentRoot_ResourceParameterBinding();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
