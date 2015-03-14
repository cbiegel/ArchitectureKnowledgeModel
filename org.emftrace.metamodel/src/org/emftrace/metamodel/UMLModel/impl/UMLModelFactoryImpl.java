/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftrace.metamodel.UMLModel.Abstraction;
import org.emftrace.metamodel.UMLModel.AcceptCallAction;
import org.emftrace.metamodel.UMLModel.AcceptEventAction;
import org.emftrace.metamodel.UMLModel.ActionExecutionSpecification;
import org.emftrace.metamodel.UMLModel.ActionInputPin;
import org.emftrace.metamodel.UMLModel.Activity;
import org.emftrace.metamodel.UMLModel.ActivityFinalNode;
import org.emftrace.metamodel.UMLModel.ActivityParameterNode;
import org.emftrace.metamodel.UMLModel.ActivityPartition;
import org.emftrace.metamodel.UMLModel.Actor;
import org.emftrace.metamodel.UMLModel.AddStructuralFeatureValueAction;
import org.emftrace.metamodel.UMLModel.AddVariableValueAction;
import org.emftrace.metamodel.UMLModel.AggregationKind;
import org.emftrace.metamodel.UMLModel.AnyReceiveEvent;
import org.emftrace.metamodel.UMLModel.Artifact;
import org.emftrace.metamodel.UMLModel.Association;
import org.emftrace.metamodel.UMLModel.AssociationClass;
import org.emftrace.metamodel.UMLModel.BehaviorExecutionSpecification;
import org.emftrace.metamodel.UMLModel.BroadcastSignalAction;
import org.emftrace.metamodel.UMLModel.CallBehaviorAction;
import org.emftrace.metamodel.UMLModel.CallConcurrencyKind;
import org.emftrace.metamodel.UMLModel.CallEvent;
import org.emftrace.metamodel.UMLModel.CallOperationAction;
import org.emftrace.metamodel.UMLModel.CentralBufferNode;
import org.emftrace.metamodel.UMLModel.ChangeEvent;
import org.emftrace.metamodel.UMLModel.ClassifierTemplateParameter;
import org.emftrace.metamodel.UMLModel.Clause;
import org.emftrace.metamodel.UMLModel.ClearAssociationAction;
import org.emftrace.metamodel.UMLModel.ClearStructuralFeatureAction;
import org.emftrace.metamodel.UMLModel.ClearVariableAction;
import org.emftrace.metamodel.UMLModel.Collaboration;
import org.emftrace.metamodel.UMLModel.CollaborationUse;
import org.emftrace.metamodel.UMLModel.CombinedFragment;
import org.emftrace.metamodel.UMLModel.Comment;
import org.emftrace.metamodel.UMLModel.CommunicationPath;
import org.emftrace.metamodel.UMLModel.Component;
import org.emftrace.metamodel.UMLModel.ComponentRealization;
import org.emftrace.metamodel.UMLModel.ConditionalNode;
import org.emftrace.metamodel.UMLModel.ConnectableElementTemplateParameter;
import org.emftrace.metamodel.UMLModel.ConnectionPointReference;
import org.emftrace.metamodel.UMLModel.Connector;
import org.emftrace.metamodel.UMLModel.ConnectorEnd;
import org.emftrace.metamodel.UMLModel.ConnectorKind;
import org.emftrace.metamodel.UMLModel.ConsiderIgnoreFragment;
import org.emftrace.metamodel.UMLModel.Constraint;
import org.emftrace.metamodel.UMLModel.Continuation;
import org.emftrace.metamodel.UMLModel.ControlFlow;
import org.emftrace.metamodel.UMLModel.CreateLinkAction;
import org.emftrace.metamodel.UMLModel.CreateLinkObjectAction;
import org.emftrace.metamodel.UMLModel.CreateObjectAction;
import org.emftrace.metamodel.UMLModel.CreationEvent;
import org.emftrace.metamodel.UMLModel.DataStoreNode;
import org.emftrace.metamodel.UMLModel.DataType;
import org.emftrace.metamodel.UMLModel.DecisionNode;
import org.emftrace.metamodel.UMLModel.Dependency;
import org.emftrace.metamodel.UMLModel.Deployment;
import org.emftrace.metamodel.UMLModel.DeploymentSpecification;
import org.emftrace.metamodel.UMLModel.DestroyLinkAction;
import org.emftrace.metamodel.UMLModel.DestroyObjectAction;
import org.emftrace.metamodel.UMLModel.DestructionEvent;
import org.emftrace.metamodel.UMLModel.Device;
import org.emftrace.metamodel.UMLModel.Duration;
import org.emftrace.metamodel.UMLModel.DurationConstraint;
import org.emftrace.metamodel.UMLModel.DurationInterval;
import org.emftrace.metamodel.UMLModel.DurationObservation;
import org.emftrace.metamodel.UMLModel.ElementImport;
import org.emftrace.metamodel.UMLModel.Enumeration;
import org.emftrace.metamodel.UMLModel.EnumerationLiteral;
import org.emftrace.metamodel.UMLModel.ExceptionHandler;
import org.emftrace.metamodel.UMLModel.ExecutionEnvironment;
import org.emftrace.metamodel.UMLModel.ExecutionEvent;
import org.emftrace.metamodel.UMLModel.ExecutionOccurrenceSpecification;
import org.emftrace.metamodel.UMLModel.ExpansionKind;
import org.emftrace.metamodel.UMLModel.ExpansionNode;
import org.emftrace.metamodel.UMLModel.ExpansionRegion;
import org.emftrace.metamodel.UMLModel.Expression;
import org.emftrace.metamodel.UMLModel.Extend;
import org.emftrace.metamodel.UMLModel.Extension;
import org.emftrace.metamodel.UMLModel.ExtensionEnd;
import org.emftrace.metamodel.UMLModel.ExtensionPoint;
import org.emftrace.metamodel.UMLModel.FinalState;
import org.emftrace.metamodel.UMLModel.FlowFinalNode;
import org.emftrace.metamodel.UMLModel.ForkNode;
import org.emftrace.metamodel.UMLModel.FunctionBehavior;
import org.emftrace.metamodel.UMLModel.Gate;
import org.emftrace.metamodel.UMLModel.GeneralOrdering;
import org.emftrace.metamodel.UMLModel.Generalization;
import org.emftrace.metamodel.UMLModel.GeneralizationSet;
import org.emftrace.metamodel.UMLModel.Image;
import org.emftrace.metamodel.UMLModel.Include;
import org.emftrace.metamodel.UMLModel.InformationFlow;
import org.emftrace.metamodel.UMLModel.InformationItem;
import org.emftrace.metamodel.UMLModel.InitialNode;
import org.emftrace.metamodel.UMLModel.InputPin;
import org.emftrace.metamodel.UMLModel.InstanceSpecification;
import org.emftrace.metamodel.UMLModel.InstanceValue;
import org.emftrace.metamodel.UMLModel.Interaction;
import org.emftrace.metamodel.UMLModel.InteractionConstraint;
import org.emftrace.metamodel.UMLModel.InteractionOperand;
import org.emftrace.metamodel.UMLModel.InteractionOperatorKind;
import org.emftrace.metamodel.UMLModel.InteractionUse;
import org.emftrace.metamodel.UMLModel.Interface;
import org.emftrace.metamodel.UMLModel.InterfaceRealization;
import org.emftrace.metamodel.UMLModel.InterruptibleActivityRegion;
import org.emftrace.metamodel.UMLModel.Interval;
import org.emftrace.metamodel.UMLModel.IntervalConstraint;
import org.emftrace.metamodel.UMLModel.JoinNode;
import org.emftrace.metamodel.UMLModel.Lifeline;
import org.emftrace.metamodel.UMLModel.LinkEndCreationData;
import org.emftrace.metamodel.UMLModel.LinkEndData;
import org.emftrace.metamodel.UMLModel.LinkEndDestructionData;
import org.emftrace.metamodel.UMLModel.LiteralBoolean;
import org.emftrace.metamodel.UMLModel.LiteralInteger;
import org.emftrace.metamodel.UMLModel.LiteralNull;
import org.emftrace.metamodel.UMLModel.LiteralString;
import org.emftrace.metamodel.UMLModel.LiteralUnlimitedNatural;
import org.emftrace.metamodel.UMLModel.LoopNode;
import org.emftrace.metamodel.UMLModel.Manifestation;
import org.emftrace.metamodel.UMLModel.MergeNode;
import org.emftrace.metamodel.UMLModel.Message;
import org.emftrace.metamodel.UMLModel.MessageKind;
import org.emftrace.metamodel.UMLModel.MessageOccurrenceSpecification;
import org.emftrace.metamodel.UMLModel.MessageSort;
import org.emftrace.metamodel.UMLModel.Model;
import org.emftrace.metamodel.UMLModel.Node;
import org.emftrace.metamodel.UMLModel.ObjectFlow;
import org.emftrace.metamodel.UMLModel.ObjectNodeOrderingKind;
import org.emftrace.metamodel.UMLModel.OccurrenceSpecification;
import org.emftrace.metamodel.UMLModel.OpaqueAction;
import org.emftrace.metamodel.UMLModel.OpaqueBehavior;
import org.emftrace.metamodel.UMLModel.OpaqueExpression;
import org.emftrace.metamodel.UMLModel.Operation;
import org.emftrace.metamodel.UMLModel.OperationTemplateParameter;
import org.emftrace.metamodel.UMLModel.OutputPin;
import org.emftrace.metamodel.UMLModel.PackageImport;
import org.emftrace.metamodel.UMLModel.PackageMerge;
import org.emftrace.metamodel.UMLModel.Parameter;
import org.emftrace.metamodel.UMLModel.ParameterDirectionKind;
import org.emftrace.metamodel.UMLModel.ParameterEffectKind;
import org.emftrace.metamodel.UMLModel.ParameterSet;
import org.emftrace.metamodel.UMLModel.PartDecomposition;
import org.emftrace.metamodel.UMLModel.Pin;
import org.emftrace.metamodel.UMLModel.Port;
import org.emftrace.metamodel.UMLModel.PrimitiveType;
import org.emftrace.metamodel.UMLModel.Profile;
import org.emftrace.metamodel.UMLModel.ProfileApplication;
import org.emftrace.metamodel.UMLModel.Property;
import org.emftrace.metamodel.UMLModel.ProtocolConformance;
import org.emftrace.metamodel.UMLModel.ProtocolStateMachine;
import org.emftrace.metamodel.UMLModel.ProtocolTransition;
import org.emftrace.metamodel.UMLModel.Pseudostate;
import org.emftrace.metamodel.UMLModel.PseudostateKind;
import org.emftrace.metamodel.UMLModel.QualifierValue;
import org.emftrace.metamodel.UMLModel.RaiseExceptionAction;
import org.emftrace.metamodel.UMLModel.ReadExtentAction;
import org.emftrace.metamodel.UMLModel.ReadIsClassifiedObjectAction;
import org.emftrace.metamodel.UMLModel.ReadLinkAction;
import org.emftrace.metamodel.UMLModel.ReadLinkObjectEndAction;
import org.emftrace.metamodel.UMLModel.ReadLinkObjectEndQualifierAction;
import org.emftrace.metamodel.UMLModel.ReadSelfAction;
import org.emftrace.metamodel.UMLModel.ReadStructuralFeatureAction;
import org.emftrace.metamodel.UMLModel.ReadVariableAction;
import org.emftrace.metamodel.UMLModel.Realization;
import org.emftrace.metamodel.UMLModel.ReceiveOperationEvent;
import org.emftrace.metamodel.UMLModel.ReceiveSignalEvent;
import org.emftrace.metamodel.UMLModel.Reception;
import org.emftrace.metamodel.UMLModel.ReclassifyObjectAction;
import org.emftrace.metamodel.UMLModel.RedefinableTemplateSignature;
import org.emftrace.metamodel.UMLModel.ReduceAction;
import org.emftrace.metamodel.UMLModel.Region;
import org.emftrace.metamodel.UMLModel.RemoveStructuralFeatureValueAction;
import org.emftrace.metamodel.UMLModel.RemoveVariableValueAction;
import org.emftrace.metamodel.UMLModel.ReplyAction;
import org.emftrace.metamodel.UMLModel.SendObjectAction;
import org.emftrace.metamodel.UMLModel.SendSignalAction;
import org.emftrace.metamodel.UMLModel.SendSignalEvent;
import org.emftrace.metamodel.UMLModel.SequenceNode;
import org.emftrace.metamodel.UMLModel.Signal;
import org.emftrace.metamodel.UMLModel.SignalEvent;
import org.emftrace.metamodel.UMLModel.Slot;
import org.emftrace.metamodel.UMLModel.StartClassifierBehaviorAction;
import org.emftrace.metamodel.UMLModel.State;
import org.emftrace.metamodel.UMLModel.StateInvariant;
import org.emftrace.metamodel.UMLModel.StateMachine;
import org.emftrace.metamodel.UMLModel.Stereotype;
import org.emftrace.metamodel.UMLModel.StringExpression;
import org.emftrace.metamodel.UMLModel.StructuredActivityNode;
import org.emftrace.metamodel.UMLModel.Substitution;
import org.emftrace.metamodel.UMLModel.TemplateBinding;
import org.emftrace.metamodel.UMLModel.TemplateParameter;
import org.emftrace.metamodel.UMLModel.TemplateParameterSubstitution;
import org.emftrace.metamodel.UMLModel.TemplateSignature;
import org.emftrace.metamodel.UMLModel.TestIdentityAction;
import org.emftrace.metamodel.UMLModel.TimeConstraint;
import org.emftrace.metamodel.UMLModel.TimeEvent;
import org.emftrace.metamodel.UMLModel.TimeExpression;
import org.emftrace.metamodel.UMLModel.TimeInterval;
import org.emftrace.metamodel.UMLModel.TimeObservation;
import org.emftrace.metamodel.UMLModel.Transition;
import org.emftrace.metamodel.UMLModel.TransitionKind;
import org.emftrace.metamodel.UMLModel.Trigger;
import org.emftrace.metamodel.UMLModel.UMLModelFactory;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;
import org.emftrace.metamodel.UMLModel.UnmarshallAction;
import org.emftrace.metamodel.UMLModel.Usage;
import org.emftrace.metamodel.UMLModel.UseCase;
import org.emftrace.metamodel.UMLModel.ValuePin;
import org.emftrace.metamodel.UMLModel.ValueSpecificationAction;
import org.emftrace.metamodel.UMLModel.Variable;
import org.emftrace.metamodel.UMLModel.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLModelFactoryImpl extends EFactoryImpl implements UMLModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UMLModelFactory init() {
		try {
			UMLModelFactory theUMLModelFactory = (UMLModelFactory)EPackage.Registry.INSTANCE.getEFactory(UMLModelPackage.eNS_URI);
			if (theUMLModelFactory != null) {
				return theUMLModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UMLModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLModelFactoryImpl() {
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
			case UMLModelPackage.ABSTRACTION: return createAbstraction();
			case UMLModelPackage.ACCEPT_CALL_ACTION: return createAcceptCallAction();
			case UMLModelPackage.ACCEPT_EVENT_ACTION: return createAcceptEventAction();
			case UMLModelPackage.ACTION_EXECUTION_SPECIFICATION: return createActionExecutionSpecification();
			case UMLModelPackage.ACTION_INPUT_PIN: return createActionInputPin();
			case UMLModelPackage.ACTIVITY: return createActivity();
			case UMLModelPackage.ACTIVITY_FINAL_NODE: return createActivityFinalNode();
			case UMLModelPackage.ACTIVITY_PARTITION: return createActivityPartition();
			case UMLModelPackage.ACTIVITY_PARAMETER_NODE: return createActivityParameterNode();
			case UMLModelPackage.ACTOR: return createActor();
			case UMLModelPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION: return createAddStructuralFeatureValueAction();
			case UMLModelPackage.ADD_VARIABLE_VALUE_ACTION: return createAddVariableValueAction();
			case UMLModelPackage.ANY_RECEIVE_EVENT: return createAnyReceiveEvent();
			case UMLModelPackage.ARTIFACT: return createArtifact();
			case UMLModelPackage.ASSOCIATION: return createAssociation();
			case UMLModelPackage.ASSOCIATION_CLASS: return createAssociationClass();
			case UMLModelPackage.BEHAVIOR_EXECUTION_SPECIFICATION: return createBehaviorExecutionSpecification();
			case UMLModelPackage.BROADCAST_SIGNAL_ACTION: return createBroadcastSignalAction();
			case UMLModelPackage.CALL_BEHAVIOR_ACTION: return createCallBehaviorAction();
			case UMLModelPackage.CALL_EVENT: return createCallEvent();
			case UMLModelPackage.CALL_OPERATION_ACTION: return createCallOperationAction();
			case UMLModelPackage.CHANGE_EVENT: return createChangeEvent();
			case UMLModelPackage.CLASS: return createClass();
			case UMLModelPackage.CLASSIFIER_TEMPLATE_PARAMETER: return createClassifierTemplateParameter();
			case UMLModelPackage.CLAUSE: return createClause();
			case UMLModelPackage.CLEAR_VARIABLE_ACTION: return createClearVariableAction();
			case UMLModelPackage.CLEAR_ASSOCIATION_ACTION: return createClearAssociationAction();
			case UMLModelPackage.CLEAR_STRUCTURAL_FEATURE_ACTION: return createClearStructuralFeatureAction();
			case UMLModelPackage.COLLABORATION: return createCollaboration();
			case UMLModelPackage.COLLABORATION_USE: return createCollaborationUse();
			case UMLModelPackage.COMMENT: return createComment();
			case UMLModelPackage.COMMUNICATION_PATH: return createCommunicationPath();
			case UMLModelPackage.COMPONENT: return createComponent();
			case UMLModelPackage.COMPONENT_REALIZATION: return createComponentRealization();
			case UMLModelPackage.COMBINED_FRAGMENT: return createCombinedFragment();
			case UMLModelPackage.CONDITIONAL_NODE: return createConditionalNode();
			case UMLModelPackage.CONSTRAINT: return createConstraint();
			case UMLModelPackage.CONSIDER_IGNORE_FRAGMENT: return createConsiderIgnoreFragment();
			case UMLModelPackage.CONTINUATION: return createContinuation();
			case UMLModelPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER: return createConnectableElementTemplateParameter();
			case UMLModelPackage.CONNECTOR_END: return createConnectorEnd();
			case UMLModelPackage.CONNECTION_POINT_REFERENCE: return createConnectionPointReference();
			case UMLModelPackage.CONNECTOR: return createConnector();
			case UMLModelPackage.CONTROL_FLOW: return createControlFlow();
			case UMLModelPackage.CREATION_EVENT: return createCreationEvent();
			case UMLModelPackage.CREATE_LINK_OBJECT_ACTION: return createCreateLinkObjectAction();
			case UMLModelPackage.CREATE_OBJECT_ACTION: return createCreateObjectAction();
			case UMLModelPackage.CREATE_LINK_ACTION: return createCreateLinkAction();
			case UMLModelPackage.CENTRAL_BUFFER_NODE: return createCentralBufferNode();
			case UMLModelPackage.DATA_STORE_NODE: return createDataStoreNode();
			case UMLModelPackage.DATA_TYPE: return createDataType();
			case UMLModelPackage.DECISION_NODE: return createDecisionNode();
			case UMLModelPackage.DEPENDENCY: return createDependency();
			case UMLModelPackage.DEPLOYMENT: return createDeployment();
			case UMLModelPackage.DEPLOYMENT_SPECIFICATION: return createDeploymentSpecification();
			case UMLModelPackage.DEVICE: return createDevice();
			case UMLModelPackage.DESTROY_LINK_ACTION: return createDestroyLinkAction();
			case UMLModelPackage.DESTROY_OBJECT_ACTION: return createDestroyObjectAction();
			case UMLModelPackage.DESTRUCTION_EVENT: return createDestructionEvent();
			case UMLModelPackage.DURATION: return createDuration();
			case UMLModelPackage.DURATION_CONSTRAINT: return createDurationConstraint();
			case UMLModelPackage.DURATION_INTERVAL: return createDurationInterval();
			case UMLModelPackage.DURATION_OBSERVATION: return createDurationObservation();
			case UMLModelPackage.ELEMENT_IMPORT: return createElementImport();
			case UMLModelPackage.ENUMERATION: return createEnumeration();
			case UMLModelPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case UMLModelPackage.EXCEPTION_HANDLER: return createExceptionHandler();
			case UMLModelPackage.EXECUTION_ENVIRONMENT: return createExecutionEnvironment();
			case UMLModelPackage.EXECUTION_EVENT: return createExecutionEvent();
			case UMLModelPackage.EXECUTION_OCCURRENCE_SPECIFICATION: return createExecutionOccurrenceSpecification();
			case UMLModelPackage.EXPANSION_NODE: return createExpansionNode();
			case UMLModelPackage.EXPANSION_REGION: return createExpansionRegion();
			case UMLModelPackage.EXTEND: return createExtend();
			case UMLModelPackage.EXTENSION: return createExtension();
			case UMLModelPackage.EXTENSION_END: return createExtensionEnd();
			case UMLModelPackage.EXTENSION_POINT: return createExtensionPoint();
			case UMLModelPackage.EXPRESSION: return createExpression();
			case UMLModelPackage.FINAL_STATE: return createFinalState();
			case UMLModelPackage.FORK_NODE: return createForkNode();
			case UMLModelPackage.FLOW_FINAL_NODE: return createFlowFinalNode();
			case UMLModelPackage.FUNCTION_BEHAVIOR: return createFunctionBehavior();
			case UMLModelPackage.GATE: return createGate();
			case UMLModelPackage.GENERAL_ORDERING: return createGeneralOrdering();
			case UMLModelPackage.GENERALIZATION: return createGeneralization();
			case UMLModelPackage.GENERALIZATION_SET: return createGeneralizationSet();
			case UMLModelPackage.IMAGE: return createImage();
			case UMLModelPackage.INTERFACE_REALIZATION: return createInterfaceRealization();
			case UMLModelPackage.INTERFACE: return createInterface();
			case UMLModelPackage.INCLUDE: return createInclude();
			case UMLModelPackage.INSTANCE_SPECIFICATION: return createInstanceSpecification();
			case UMLModelPackage.INSTANCE_VALUE: return createInstanceValue();
			case UMLModelPackage.INTERRUPTIBLE_ACTIVITY_REGION: return createInterruptibleActivityRegion();
			case UMLModelPackage.INPUT_PIN: return createInputPin();
			case UMLModelPackage.INITIAL_NODE: return createInitialNode();
			case UMLModelPackage.INTERACTION: return createInteraction();
			case UMLModelPackage.INTERACTION_USE: return createInteractionUse();
			case UMLModelPackage.INTERACTION_OPERAND: return createInteractionOperand();
			case UMLModelPackage.INTERACTION_CONSTRAINT: return createInteractionConstraint();
			case UMLModelPackage.INTERVAL: return createInterval();
			case UMLModelPackage.INTERVAL_CONSTRAINT: return createIntervalConstraint();
			case UMLModelPackage.INFORMATION_ITEM: return createInformationItem();
			case UMLModelPackage.INFORMATION_FLOW: return createInformationFlow();
			case UMLModelPackage.JOIN_NODE: return createJoinNode();
			case UMLModelPackage.LITERAL_INTEGER: return createLiteralInteger();
			case UMLModelPackage.LITERAL_STRING: return createLiteralString();
			case UMLModelPackage.LITERAL_BOOLEAN: return createLiteralBoolean();
			case UMLModelPackage.LITERAL_NULL: return createLiteralNull();
			case UMLModelPackage.LITERAL_UNLIMITED_NATURAL: return createLiteralUnlimitedNatural();
			case UMLModelPackage.LIFELINE: return createLifeline();
			case UMLModelPackage.LINK_END_DATA: return createLinkEndData();
			case UMLModelPackage.LINK_END_CREATION_DATA: return createLinkEndCreationData();
			case UMLModelPackage.LINK_END_DESTRUCTION_DATA: return createLinkEndDestructionData();
			case UMLModelPackage.LOOP_NODE: return createLoopNode();
			case UMLModelPackage.MANIFESTATION: return createManifestation();
			case UMLModelPackage.MESSAGE: return createMessage();
			case UMLModelPackage.MESSAGE_OCCURRENCE_SPECIFICATION: return createMessageOccurrenceSpecification();
			case UMLModelPackage.MERGE_NODE: return createMergeNode();
			case UMLModelPackage.MODEL: return createModel();
			case UMLModelPackage.NODE: return createNode();
			case UMLModelPackage.OPERATION: return createOperation();
			case UMLModelPackage.OPERATION_TEMPLATE_PARAMETER: return createOperationTemplateParameter();
			case UMLModelPackage.OPAQUE_ACTION: return createOpaqueAction();
			case UMLModelPackage.OPAQUE_BEHAVIOR: return createOpaqueBehavior();
			case UMLModelPackage.OPAQUE_EXPRESSION: return createOpaqueExpression();
			case UMLModelPackage.OCCURRENCE_SPECIFICATION: return createOccurrenceSpecification();
			case UMLModelPackage.OBJECT_FLOW: return createObjectFlow();
			case UMLModelPackage.OUTPUT_PIN: return createOutputPin();
			case UMLModelPackage.PARAMETER: return createParameter();
			case UMLModelPackage.PACKAGE: return createPackage();
			case UMLModelPackage.PACKAGE_IMPORT: return createPackageImport();
			case UMLModelPackage.PACKAGE_MERGE: return createPackageMerge();
			case UMLModelPackage.PARAMETER_SET: return createParameterSet();
			case UMLModelPackage.PART_DECOMPOSITION: return createPartDecomposition();
			case UMLModelPackage.PIN: return createPin();
			case UMLModelPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case UMLModelPackage.PROTOCOL_TRANSITION: return createProtocolTransition();
			case UMLModelPackage.PROFILE: return createProfile();
			case UMLModelPackage.PROFILE_APPLICATION: return createProfileApplication();
			case UMLModelPackage.PROPERTY: return createProperty();
			case UMLModelPackage.PROTOCOL_STATE_MACHINE: return createProtocolStateMachine();
			case UMLModelPackage.PROTOCOL_CONFORMANCE: return createProtocolConformance();
			case UMLModelPackage.PORT: return createPort();
			case UMLModelPackage.PSEUDOSTATE: return createPseudostate();
			case UMLModelPackage.QUALIFIER_VALUE: return createQualifierValue();
			case UMLModelPackage.RAISE_EXCEPTION_ACTION: return createRaiseExceptionAction();
			case UMLModelPackage.RECEIVE_OPERATION_EVENT: return createReceiveOperationEvent();
			case UMLModelPackage.RECEIVE_SIGNAL_EVENT: return createReceiveSignalEvent();
			case UMLModelPackage.RECLASSIFY_OBJECT_ACTION: return createReclassifyObjectAction();
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION: return createReadIsClassifiedObjectAction();
			case UMLModelPackage.READ_EXTENT_ACTION: return createReadExtentAction();
			case UMLModelPackage.READ_LINK_ACTION: return createReadLinkAction();
			case UMLModelPackage.READ_LINK_OBJECT_END_ACTION: return createReadLinkObjectEndAction();
			case UMLModelPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION: return createReadLinkObjectEndQualifierAction();
			case UMLModelPackage.READ_SELF_ACTION: return createReadSelfAction();
			case UMLModelPackage.READ_STRUCTURAL_FEATURE_ACTION: return createReadStructuralFeatureAction();
			case UMLModelPackage.READ_VARIABLE_ACTION: return createReadVariableAction();
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE: return createRedefinableTemplateSignature();
			case UMLModelPackage.REDUCE_ACTION: return createReduceAction();
			case UMLModelPackage.REPLY_ACTION: return createReplyAction();
			case UMLModelPackage.REMOVE_VARIABLE_VALUE_ACTION: return createRemoveVariableValueAction();
			case UMLModelPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION: return createRemoveStructuralFeatureValueAction();
			case UMLModelPackage.REALIZATION: return createRealization();
			case UMLModelPackage.RECEPTION: return createReception();
			case UMLModelPackage.REGION: return createRegion();
			case UMLModelPackage.SEND_SIGNAL_ACTION: return createSendSignalAction();
			case UMLModelPackage.SEND_SIGNAL_EVENT: return createSendSignalEvent();
			case UMLModelPackage.SEQUENCE_NODE: return createSequenceNode();
			case UMLModelPackage.SIGNAL_EVENT: return createSignalEvent();
			case UMLModelPackage.SLOT: return createSlot();
			case UMLModelPackage.STATE_INVARIANT: return createStateInvariant();
			case UMLModelPackage.START_CLASSIFIER_BEHAVIOR_ACTION: return createStartClassifierBehaviorAction();
			case UMLModelPackage.SEND_OBJECT_ACTION: return createSendObjectAction();
			case UMLModelPackage.STRING_EXPRESSION: return createStringExpression();
			case UMLModelPackage.STRUCTURED_ACTIVITY_NODE: return createStructuredActivityNode();
			case UMLModelPackage.SUBSTITUTION: return createSubstitution();
			case UMLModelPackage.SIGNAL: return createSignal();
			case UMLModelPackage.STATE: return createState();
			case UMLModelPackage.STATE_MACHINE: return createStateMachine();
			case UMLModelPackage.STEREOTYPE: return createStereotype();
			case UMLModelPackage.TEMPLATE_BINDING: return createTemplateBinding();
			case UMLModelPackage.TEMPLATE_SIGNATURE: return createTemplateSignature();
			case UMLModelPackage.TEMPLATE_PARAMETER: return createTemplateParameter();
			case UMLModelPackage.TEMPLATE_PARAMETER_SUBSTITUTION: return createTemplateParameterSubstitution();
			case UMLModelPackage.TEST_IDENTITY_ACTION: return createTestIdentityAction();
			case UMLModelPackage.TIME_CONSTRAINT: return createTimeConstraint();
			case UMLModelPackage.TIME_EVENT: return createTimeEvent();
			case UMLModelPackage.TIME_EXPRESSION: return createTimeExpression();
			case UMLModelPackage.TIME_INTERVAL: return createTimeInterval();
			case UMLModelPackage.TIME_OBSERVATION: return createTimeObservation();
			case UMLModelPackage.TRANSITION: return createTransition();
			case UMLModelPackage.TRIGGER: return createTrigger();
			case UMLModelPackage.UNMARSHALL_ACTION: return createUnmarshallAction();
			case UMLModelPackage.USAGE: return createUsage();
			case UMLModelPackage.USE_CASE: return createUseCase();
			case UMLModelPackage.VALUE_PIN: return createValuePin();
			case UMLModelPackage.VALUE_SPECIFICATION_ACTION: return createValueSpecificationAction();
			case UMLModelPackage.VARIABLE: return createVariable();
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
			case UMLModelPackage.AGGREGATION_KIND:
				return createAggregationKindFromString(eDataType, initialValue);
			case UMLModelPackage.CALL_CONCURRENCY_KIND:
				return createCallConcurrencyKindFromString(eDataType, initialValue);
			case UMLModelPackage.CONNECTOR_KIND:
				return createConnectorKindFromString(eDataType, initialValue);
			case UMLModelPackage.EXPANSION_KIND:
				return createExpansionKindFromString(eDataType, initialValue);
			case UMLModelPackage.INTERACTION_OPERATOR_KIND:
				return createInteractionOperatorKindFromString(eDataType, initialValue);
			case UMLModelPackage.MESSAGE_KIND:
				return createMessageKindFromString(eDataType, initialValue);
			case UMLModelPackage.MESSAGE_SORT:
				return createMessageSortFromString(eDataType, initialValue);
			case UMLModelPackage.OBJECT_NODE_ORDERING_KIND:
				return createObjectNodeOrderingKindFromString(eDataType, initialValue);
			case UMLModelPackage.PARAMETER_DIRECTION_KIND:
				return createParameterDirectionKindFromString(eDataType, initialValue);
			case UMLModelPackage.PARAMETER_EFFECT_KIND:
				return createParameterEffectKindFromString(eDataType, initialValue);
			case UMLModelPackage.PSEUDOSTATE_KIND:
				return createPseudostateKindFromString(eDataType, initialValue);
			case UMLModelPackage.TRANSITION_KIND:
				return createTransitionKindFromString(eDataType, initialValue);
			case UMLModelPackage.VISIBILITY_KIND:
				return createVisibilityKindFromString(eDataType, initialValue);
			case UMLModelPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case UMLModelPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case UMLModelPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case UMLModelPackage.UNLIMITED_NATURAL:
				return createUnlimitedNaturalFromString(eDataType, initialValue);
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
			case UMLModelPackage.AGGREGATION_KIND:
				return convertAggregationKindToString(eDataType, instanceValue);
			case UMLModelPackage.CALL_CONCURRENCY_KIND:
				return convertCallConcurrencyKindToString(eDataType, instanceValue);
			case UMLModelPackage.CONNECTOR_KIND:
				return convertConnectorKindToString(eDataType, instanceValue);
			case UMLModelPackage.EXPANSION_KIND:
				return convertExpansionKindToString(eDataType, instanceValue);
			case UMLModelPackage.INTERACTION_OPERATOR_KIND:
				return convertInteractionOperatorKindToString(eDataType, instanceValue);
			case UMLModelPackage.MESSAGE_KIND:
				return convertMessageKindToString(eDataType, instanceValue);
			case UMLModelPackage.MESSAGE_SORT:
				return convertMessageSortToString(eDataType, instanceValue);
			case UMLModelPackage.OBJECT_NODE_ORDERING_KIND:
				return convertObjectNodeOrderingKindToString(eDataType, instanceValue);
			case UMLModelPackage.PARAMETER_DIRECTION_KIND:
				return convertParameterDirectionKindToString(eDataType, instanceValue);
			case UMLModelPackage.PARAMETER_EFFECT_KIND:
				return convertParameterEffectKindToString(eDataType, instanceValue);
			case UMLModelPackage.PSEUDOSTATE_KIND:
				return convertPseudostateKindToString(eDataType, instanceValue);
			case UMLModelPackage.TRANSITION_KIND:
				return convertTransitionKindToString(eDataType, instanceValue);
			case UMLModelPackage.VISIBILITY_KIND:
				return convertVisibilityKindToString(eDataType, instanceValue);
			case UMLModelPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case UMLModelPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case UMLModelPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case UMLModelPackage.UNLIMITED_NATURAL:
				return convertUnlimitedNaturalToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abstraction createAbstraction() {
		AbstractionImpl abstraction = new AbstractionImpl();
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptCallAction createAcceptCallAction() {
		AcceptCallActionImpl acceptCallAction = new AcceptCallActionImpl();
		return acceptCallAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventAction createAcceptEventAction() {
		AcceptEventActionImpl acceptEventAction = new AcceptEventActionImpl();
		return acceptEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionExecutionSpecification createActionExecutionSpecification() {
		ActionExecutionSpecificationImpl actionExecutionSpecification = new ActionExecutionSpecificationImpl();
		return actionExecutionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionInputPin createActionInputPin() {
		ActionInputPinImpl actionInputPin = new ActionInputPinImpl();
		return actionInputPin;
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
	public ActivityFinalNode createActivityFinalNode() {
		ActivityFinalNodeImpl activityFinalNode = new ActivityFinalNodeImpl();
		return activityFinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition createActivityPartition() {
		ActivityPartitionImpl activityPartition = new ActivityPartitionImpl();
		return activityPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityParameterNode createActivityParameterNode() {
		ActivityParameterNodeImpl activityParameterNode = new ActivityParameterNodeImpl();
		return activityParameterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddStructuralFeatureValueAction createAddStructuralFeatureValueAction() {
		AddStructuralFeatureValueActionImpl addStructuralFeatureValueAction = new AddStructuralFeatureValueActionImpl();
		return addStructuralFeatureValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddVariableValueAction createAddVariableValueAction() {
		AddVariableValueActionImpl addVariableValueAction = new AddVariableValueActionImpl();
		return addVariableValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyReceiveEvent createAnyReceiveEvent() {
		AnyReceiveEventImpl anyReceiveEvent = new AnyReceiveEventImpl();
		return anyReceiveEvent;
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
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationClass createAssociationClass() {
		AssociationClassImpl associationClass = new AssociationClassImpl();
		return associationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorExecutionSpecification createBehaviorExecutionSpecification() {
		BehaviorExecutionSpecificationImpl behaviorExecutionSpecification = new BehaviorExecutionSpecificationImpl();
		return behaviorExecutionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastSignalAction createBroadcastSignalAction() {
		BroadcastSignalActionImpl broadcastSignalAction = new BroadcastSignalActionImpl();
		return broadcastSignalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallBehaviorAction createCallBehaviorAction() {
		CallBehaviorActionImpl callBehaviorAction = new CallBehaviorActionImpl();
		return callBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallEvent createCallEvent() {
		CallEventImpl callEvent = new CallEventImpl();
		return callEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperationAction createCallOperationAction() {
		CallOperationActionImpl callOperationAction = new CallOperationActionImpl();
		return callOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEvent createChangeEvent() {
		ChangeEventImpl changeEvent = new ChangeEventImpl();
		return changeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.emftrace.metamodel.UMLModel.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierTemplateParameter createClassifierTemplateParameter() {
		ClassifierTemplateParameterImpl classifierTemplateParameter = new ClassifierTemplateParameterImpl();
		return classifierTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clause createClause() {
		ClauseImpl clause = new ClauseImpl();
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearVariableAction createClearVariableAction() {
		ClearVariableActionImpl clearVariableAction = new ClearVariableActionImpl();
		return clearVariableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearAssociationAction createClearAssociationAction() {
		ClearAssociationActionImpl clearAssociationAction = new ClearAssociationActionImpl();
		return clearAssociationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearStructuralFeatureAction createClearStructuralFeatureAction() {
		ClearStructuralFeatureActionImpl clearStructuralFeatureAction = new ClearStructuralFeatureActionImpl();
		return clearStructuralFeatureAction;
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
	public CollaborationUse createCollaborationUse() {
		CollaborationUseImpl collaborationUse = new CollaborationUseImpl();
		return collaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPath createCommunicationPath() {
		CommunicationPathImpl communicationPath = new CommunicationPathImpl();
		return communicationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRealization createComponentRealization() {
		ComponentRealizationImpl componentRealization = new ComponentRealizationImpl();
		return componentRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragment createCombinedFragment() {
		CombinedFragmentImpl combinedFragment = new CombinedFragmentImpl();
		return combinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalNode createConditionalNode() {
		ConditionalNodeImpl conditionalNode = new ConditionalNodeImpl();
		return conditionalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsiderIgnoreFragment createConsiderIgnoreFragment() {
		ConsiderIgnoreFragmentImpl considerIgnoreFragment = new ConsiderIgnoreFragmentImpl();
		return considerIgnoreFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Continuation createContinuation() {
		ContinuationImpl continuation = new ContinuationImpl();
		return continuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElementTemplateParameter createConnectableElementTemplateParameter() {
		ConnectableElementTemplateParameterImpl connectableElementTemplateParameter = new ConnectableElementTemplateParameterImpl();
		return connectableElementTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd createConnectorEnd() {
		ConnectorEndImpl connectorEnd = new ConnectorEndImpl();
		return connectorEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointReference createConnectionPointReference() {
		ConnectionPointReferenceImpl connectionPointReference = new ConnectionPointReferenceImpl();
		return connectionPointReference;
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
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationEvent createCreationEvent() {
		CreationEventImpl creationEvent = new CreationEventImpl();
		return creationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateLinkObjectAction createCreateLinkObjectAction() {
		CreateLinkObjectActionImpl createLinkObjectAction = new CreateLinkObjectActionImpl();
		return createLinkObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateObjectAction createCreateObjectAction() {
		CreateObjectActionImpl createObjectAction = new CreateObjectActionImpl();
		return createObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateLinkAction createCreateLinkAction() {
		CreateLinkActionImpl createLinkAction = new CreateLinkActionImpl();
		return createLinkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentralBufferNode createCentralBufferNode() {
		CentralBufferNodeImpl centralBufferNode = new CentralBufferNodeImpl();
		return centralBufferNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStoreNode createDataStoreNode() {
		DataStoreNodeImpl dataStoreNode = new DataStoreNodeImpl();
		return dataStoreNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNode createDecisionNode() {
		DecisionNodeImpl decisionNode = new DecisionNodeImpl();
		return decisionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSpecification createDeploymentSpecification() {
		DeploymentSpecificationImpl deploymentSpecification = new DeploymentSpecificationImpl();
		return deploymentSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestroyLinkAction createDestroyLinkAction() {
		DestroyLinkActionImpl destroyLinkAction = new DestroyLinkActionImpl();
		return destroyLinkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestroyObjectAction createDestroyObjectAction() {
		DestroyObjectActionImpl destroyObjectAction = new DestroyObjectActionImpl();
		return destroyObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestructionEvent createDestructionEvent() {
		DestructionEventImpl destructionEvent = new DestructionEventImpl();
		return destructionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationConstraint createDurationConstraint() {
		DurationConstraintImpl durationConstraint = new DurationConstraintImpl();
		return durationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationInterval createDurationInterval() {
		DurationIntervalImpl durationInterval = new DurationIntervalImpl();
		return durationInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationObservation createDurationObservation() {
		DurationObservationImpl durationObservation = new DurationObservationImpl();
		return durationObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport createElementImport() {
		ElementImportImpl elementImport = new ElementImportImpl();
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionHandler createExceptionHandler() {
		ExceptionHandlerImpl exceptionHandler = new ExceptionHandlerImpl();
		return exceptionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment createExecutionEnvironment() {
		ExecutionEnvironmentImpl executionEnvironment = new ExecutionEnvironmentImpl();
		return executionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEvent createExecutionEvent() {
		ExecutionEventImpl executionEvent = new ExecutionEventImpl();
		return executionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOccurrenceSpecification createExecutionOccurrenceSpecification() {
		ExecutionOccurrenceSpecificationImpl executionOccurrenceSpecification = new ExecutionOccurrenceSpecificationImpl();
		return executionOccurrenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionNode createExpansionNode() {
		ExpansionNodeImpl expansionNode = new ExpansionNodeImpl();
		return expansionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion createExpansionRegion() {
		ExpansionRegionImpl expansionRegion = new ExpansionRegionImpl();
		return expansionRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extend createExtend() {
		ExtendImpl extend = new ExtendImpl();
		return extend;
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
	public ExtensionEnd createExtensionEnd() {
		ExtensionEndImpl extensionEnd = new ExtensionEndImpl();
		return extensionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint createExtensionPoint() {
		ExtensionPointImpl extensionPoint = new ExtensionPointImpl();
		return extensionPoint;
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
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode createForkNode() {
		ForkNodeImpl forkNode = new ForkNodeImpl();
		return forkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFinalNode createFlowFinalNode() {
		FlowFinalNodeImpl flowFinalNode = new FlowFinalNodeImpl();
		return flowFinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBehavior createFunctionBehavior() {
		FunctionBehaviorImpl functionBehavior = new FunctionBehaviorImpl();
		return functionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering createGeneralOrdering() {
		GeneralOrderingImpl generalOrdering = new GeneralOrderingImpl();
		return generalOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet createGeneralizationSet() {
		GeneralizationSetImpl generalizationSet = new GeneralizationSetImpl();
		return generalizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization createInterfaceRealization() {
		InterfaceRealizationImpl interfaceRealization = new InterfaceRealizationImpl();
		return interfaceRealization;
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
	public Include createInclude() {
		IncludeImpl include = new IncludeImpl();
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification createInstanceSpecification() {
		InstanceSpecificationImpl instanceSpecification = new InstanceSpecificationImpl();
		return instanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceValue createInstanceValue() {
		InstanceValueImpl instanceValue = new InstanceValueImpl();
		return instanceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion createInterruptibleActivityRegion() {
		InterruptibleActivityRegionImpl interruptibleActivityRegion = new InterruptibleActivityRegionImpl();
		return interruptibleActivityRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createInputPin() {
		InputPinImpl inputPin = new InputPinImpl();
		return inputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode createInitialNode() {
		InitialNodeImpl initialNode = new InitialNodeImpl();
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionUse createInteractionUse() {
		InteractionUseImpl interactionUse = new InteractionUseImpl();
		return interactionUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand createInteractionOperand() {
		InteractionOperandImpl interactionOperand = new InteractionOperandImpl();
		return interactionOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionConstraint createInteractionConstraint() {
		InteractionConstraintImpl interactionConstraint = new InteractionConstraintImpl();
		return interactionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalConstraint createIntervalConstraint() {
		IntervalConstraintImpl intervalConstraint = new IntervalConstraintImpl();
		return intervalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationItem createInformationItem() {
		InformationItemImpl informationItem = new InformationItemImpl();
		return informationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlow createInformationFlow() {
		InformationFlowImpl informationFlow = new InformationFlowImpl();
		return informationFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode createJoinNode() {
		JoinNodeImpl joinNode = new JoinNodeImpl();
		return joinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralInteger createLiteralInteger() {
		LiteralIntegerImpl literalInteger = new LiteralIntegerImpl();
		return literalInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralString createLiteralString() {
		LiteralStringImpl literalString = new LiteralStringImpl();
		return literalString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralBoolean createLiteralBoolean() {
		LiteralBooleanImpl literalBoolean = new LiteralBooleanImpl();
		return literalBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNull createLiteralNull() {
		LiteralNullImpl literalNull = new LiteralNullImpl();
		return literalNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralUnlimitedNatural createLiteralUnlimitedNatural() {
		LiteralUnlimitedNaturalImpl literalUnlimitedNatural = new LiteralUnlimitedNaturalImpl();
		return literalUnlimitedNatural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline createLifeline() {
		LifelineImpl lifeline = new LifelineImpl();
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndData createLinkEndData() {
		LinkEndDataImpl linkEndData = new LinkEndDataImpl();
		return linkEndData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndCreationData createLinkEndCreationData() {
		LinkEndCreationDataImpl linkEndCreationData = new LinkEndCreationDataImpl();
		return linkEndCreationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndDestructionData createLinkEndDestructionData() {
		LinkEndDestructionDataImpl linkEndDestructionData = new LinkEndDestructionDataImpl();
		return linkEndDestructionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopNode createLoopNode() {
		LoopNodeImpl loopNode = new LoopNodeImpl();
		return loopNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifestation createManifestation() {
		ManifestationImpl manifestation = new ManifestationImpl();
		return manifestation;
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
	public MessageOccurrenceSpecification createMessageOccurrenceSpecification() {
		MessageOccurrenceSpecificationImpl messageOccurrenceSpecification = new MessageOccurrenceSpecificationImpl();
		return messageOccurrenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNode createMergeNode() {
		MergeNodeImpl mergeNode = new MergeNodeImpl();
		return mergeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
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
	public OperationTemplateParameter createOperationTemplateParameter() {
		OperationTemplateParameterImpl operationTemplateParameter = new OperationTemplateParameterImpl();
		return operationTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueAction createOpaqueAction() {
		OpaqueActionImpl opaqueAction = new OpaqueActionImpl();
		return opaqueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueBehavior createOpaqueBehavior() {
		OpaqueBehaviorImpl opaqueBehavior = new OpaqueBehaviorImpl();
		return opaqueBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression createOpaqueExpression() {
		OpaqueExpressionImpl opaqueExpression = new OpaqueExpressionImpl();
		return opaqueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification createOccurrenceSpecification() {
		OccurrenceSpecificationImpl occurrenceSpecification = new OccurrenceSpecificationImpl();
		return occurrenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFlow createObjectFlow() {
		ObjectFlowImpl objectFlow = new ObjectFlowImpl();
		return objectFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createOutputPin() {
		OutputPinImpl outputPin = new OutputPinImpl();
		return outputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.emftrace.metamodel.UMLModel.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport() {
		PackageImportImpl packageImport = new PackageImportImpl();
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMerge createPackageMerge() {
		PackageMergeImpl packageMerge = new PackageMergeImpl();
		return packageMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet createParameterSet() {
		ParameterSetImpl parameterSet = new ParameterSetImpl();
		return parameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecomposition createPartDecomposition() {
		PartDecompositionImpl partDecomposition = new PartDecompositionImpl();
		return partDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin createPin() {
		PinImpl pin = new PinImpl();
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolTransition createProtocolTransition() {
		ProtocolTransitionImpl protocolTransition = new ProtocolTransitionImpl();
		return protocolTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile createProfile() {
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileApplication createProfileApplication() {
		ProfileApplicationImpl profileApplication = new ProfileApplicationImpl();
		return profileApplication;
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
	public ProtocolStateMachine createProtocolStateMachine() {
		ProtocolStateMachineImpl protocolStateMachine = new ProtocolStateMachineImpl();
		return protocolStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolConformance createProtocolConformance() {
		ProtocolConformanceImpl protocolConformance = new ProtocolConformanceImpl();
		return protocolConformance;
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
	public Pseudostate createPseudostate() {
		PseudostateImpl pseudostate = new PseudostateImpl();
		return pseudostate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierValue createQualifierValue() {
		QualifierValueImpl qualifierValue = new QualifierValueImpl();
		return qualifierValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaiseExceptionAction createRaiseExceptionAction() {
		RaiseExceptionActionImpl raiseExceptionAction = new RaiseExceptionActionImpl();
		return raiseExceptionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveOperationEvent createReceiveOperationEvent() {
		ReceiveOperationEventImpl receiveOperationEvent = new ReceiveOperationEventImpl();
		return receiveOperationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveSignalEvent createReceiveSignalEvent() {
		ReceiveSignalEventImpl receiveSignalEvent = new ReceiveSignalEventImpl();
		return receiveSignalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReclassifyObjectAction createReclassifyObjectAction() {
		ReclassifyObjectActionImpl reclassifyObjectAction = new ReclassifyObjectActionImpl();
		return reclassifyObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadIsClassifiedObjectAction createReadIsClassifiedObjectAction() {
		ReadIsClassifiedObjectActionImpl readIsClassifiedObjectAction = new ReadIsClassifiedObjectActionImpl();
		return readIsClassifiedObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadExtentAction createReadExtentAction() {
		ReadExtentActionImpl readExtentAction = new ReadExtentActionImpl();
		return readExtentAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkAction createReadLinkAction() {
		ReadLinkActionImpl readLinkAction = new ReadLinkActionImpl();
		return readLinkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkObjectEndAction createReadLinkObjectEndAction() {
		ReadLinkObjectEndActionImpl readLinkObjectEndAction = new ReadLinkObjectEndActionImpl();
		return readLinkObjectEndAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkObjectEndQualifierAction createReadLinkObjectEndQualifierAction() {
		ReadLinkObjectEndQualifierActionImpl readLinkObjectEndQualifierAction = new ReadLinkObjectEndQualifierActionImpl();
		return readLinkObjectEndQualifierAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadSelfAction createReadSelfAction() {
		ReadSelfActionImpl readSelfAction = new ReadSelfActionImpl();
		return readSelfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadStructuralFeatureAction createReadStructuralFeatureAction() {
		ReadStructuralFeatureActionImpl readStructuralFeatureAction = new ReadStructuralFeatureActionImpl();
		return readStructuralFeatureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadVariableAction createReadVariableAction() {
		ReadVariableActionImpl readVariableAction = new ReadVariableActionImpl();
		return readVariableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableTemplateSignature createRedefinableTemplateSignature() {
		RedefinableTemplateSignatureImpl redefinableTemplateSignature = new RedefinableTemplateSignatureImpl();
		return redefinableTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReduceAction createReduceAction() {
		ReduceActionImpl reduceAction = new ReduceActionImpl();
		return reduceAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyAction createReplyAction() {
		ReplyActionImpl replyAction = new ReplyActionImpl();
		return replyAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveVariableValueAction createRemoveVariableValueAction() {
		RemoveVariableValueActionImpl removeVariableValueAction = new RemoveVariableValueActionImpl();
		return removeVariableValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveStructuralFeatureValueAction createRemoveStructuralFeatureValueAction() {
		RemoveStructuralFeatureValueActionImpl removeStructuralFeatureValueAction = new RemoveStructuralFeatureValueActionImpl();
		return removeStructuralFeatureValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization createRealization() {
		RealizationImpl realization = new RealizationImpl();
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception createReception() {
		ReceptionImpl reception = new ReceptionImpl();
		return reception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendSignalAction createSendSignalAction() {
		SendSignalActionImpl sendSignalAction = new SendSignalActionImpl();
		return sendSignalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendSignalEvent createSendSignalEvent() {
		SendSignalEventImpl sendSignalEvent = new SendSignalEventImpl();
		return sendSignalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceNode createSequenceNode() {
		SequenceNodeImpl sequenceNode = new SequenceNodeImpl();
		return sequenceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalEvent createSignalEvent() {
		SignalEventImpl signalEvent = new SignalEventImpl();
		return signalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot createSlot() {
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateInvariant createStateInvariant() {
		StateInvariantImpl stateInvariant = new StateInvariantImpl();
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartClassifierBehaviorAction createStartClassifierBehaviorAction() {
		StartClassifierBehaviorActionImpl startClassifierBehaviorAction = new StartClassifierBehaviorActionImpl();
		return startClassifierBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendObjectAction createSendObjectAction() {
		SendObjectActionImpl sendObjectAction = new SendObjectActionImpl();
		return sendObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression createStringExpression() {
		StringExpressionImpl stringExpression = new StringExpressionImpl();
		return stringExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode createStructuredActivityNode() {
		StructuredActivityNodeImpl structuredActivityNode = new StructuredActivityNodeImpl();
		return structuredActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution createSubstitution() {
		SubstitutionImpl substitution = new SubstitutionImpl();
		return substitution;
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
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype createStereotype() {
		StereotypeImpl stereotype = new StereotypeImpl();
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding createTemplateBinding() {
		TemplateBindingImpl templateBinding = new TemplateBindingImpl();
		return templateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createTemplateSignature() {
		TemplateSignatureImpl templateSignature = new TemplateSignatureImpl();
		return templateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter createTemplateParameter() {
		TemplateParameterImpl templateParameter = new TemplateParameterImpl();
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterSubstitution createTemplateParameterSubstitution() {
		TemplateParameterSubstitutionImpl templateParameterSubstitution = new TemplateParameterSubstitutionImpl();
		return templateParameterSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestIdentityAction createTestIdentityAction() {
		TestIdentityActionImpl testIdentityAction = new TestIdentityActionImpl();
		return testIdentityAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConstraint createTimeConstraint() {
		TimeConstraintImpl timeConstraint = new TimeConstraintImpl();
		return timeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEvent createTimeEvent() {
		TimeEventImpl timeEvent = new TimeEventImpl();
		return timeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeExpression createTimeExpression() {
		TimeExpressionImpl timeExpression = new TimeExpressionImpl();
		return timeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval createTimeInterval() {
		TimeIntervalImpl timeInterval = new TimeIntervalImpl();
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeObservation createTimeObservation() {
		TimeObservationImpl timeObservation = new TimeObservationImpl();
		return timeObservation;
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
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnmarshallAction createUnmarshallAction() {
		UnmarshallActionImpl unmarshallAction = new UnmarshallActionImpl();
		return unmarshallAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage createUsage() {
		UsageImpl usage = new UsageImpl();
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase createUseCase() {
		UseCaseImpl useCase = new UseCaseImpl();
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePin createValuePin() {
		ValuePinImpl valuePin = new ValuePinImpl();
		return valuePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecificationAction createValueSpecificationAction() {
		ValueSpecificationActionImpl valueSpecificationAction = new ValueSpecificationActionImpl();
		return valueSpecificationAction;
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
	public AggregationKind createAggregationKindFromString(EDataType eDataType, String initialValue) {
		AggregationKind result = AggregationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyKind createCallConcurrencyKindFromString(EDataType eDataType, String initialValue) {
		CallConcurrencyKind result = CallConcurrencyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallConcurrencyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorKind createConnectorKindFromString(EDataType eDataType, String initialValue) {
		ConnectorKind result = ConnectorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionKind createExpansionKindFromString(EDataType eDataType, String initialValue) {
		ExpansionKind result = ExpansionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpansionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperatorKind createInteractionOperatorKindFromString(EDataType eDataType, String initialValue) {
		InteractionOperatorKind result = InteractionOperatorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageKind createMessageKindFromString(EDataType eDataType, String initialValue) {
		MessageKind result = MessageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSort createMessageSortFromString(EDataType eDataType, String initialValue) {
		MessageSort result = MessageSort.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSortToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind createObjectNodeOrderingKindFromString(EDataType eDataType, String initialValue) {
		ObjectNodeOrderingKind result = ObjectNodeOrderingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectNodeOrderingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind createParameterDirectionKindFromString(EDataType eDataType, String initialValue) {
		ParameterDirectionKind result = ParameterDirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterEffectKind createParameterEffectKindFromString(EDataType eDataType, String initialValue) {
		ParameterEffectKind result = ParameterEffectKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterEffectKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudostateKind createPseudostateKindFromString(EDataType eDataType, String initialValue) {
		PseudostateKind result = PseudostateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPseudostateKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionKind createTransitionKindFromString(EDataType eDataType, String initialValue) {
		TransitionKind result = TransitionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue) {
		VisibilityKind result = VisibilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createUnlimitedNaturalFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnlimitedNaturalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLModelPackage getUMLModelPackage() {
		return (UMLModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UMLModelPackage getPackage() {
		return UMLModelPackage.eINSTANCE;
	}

} //UMLModelFactoryImpl
