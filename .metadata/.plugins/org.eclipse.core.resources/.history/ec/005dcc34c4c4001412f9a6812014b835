/**
 */
package org.emftrace.metamodel.UMLModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftrace.metamodel.UMLModel.Abstraction;
import org.emftrace.metamodel.UMLModel.AcceptCallAction;
import org.emftrace.metamodel.UMLModel.AcceptEventAction;
import org.emftrace.metamodel.UMLModel.Action;
import org.emftrace.metamodel.UMLModel.ActionExecutionSpecification;
import org.emftrace.metamodel.UMLModel.ActionInputPin;
import org.emftrace.metamodel.UMLModel.Activity;
import org.emftrace.metamodel.UMLModel.ActivityEdge;
import org.emftrace.metamodel.UMLModel.ActivityFinalNode;
import org.emftrace.metamodel.UMLModel.ActivityGroup;
import org.emftrace.metamodel.UMLModel.ActivityNode;
import org.emftrace.metamodel.UMLModel.ActivityParameterNode;
import org.emftrace.metamodel.UMLModel.ActivityPartition;
import org.emftrace.metamodel.UMLModel.Actor;
import org.emftrace.metamodel.UMLModel.AddStructuralFeatureValueAction;
import org.emftrace.metamodel.UMLModel.AddVariableValueAction;
import org.emftrace.metamodel.UMLModel.AnyReceiveEvent;
import org.emftrace.metamodel.UMLModel.Artifact;
import org.emftrace.metamodel.UMLModel.Association;
import org.emftrace.metamodel.UMLModel.AssociationClass;
import org.emftrace.metamodel.UMLModel.Behavior;
import org.emftrace.metamodel.UMLModel.BehaviorExecutionSpecification;
import org.emftrace.metamodel.UMLModel.BehavioralFeature;
import org.emftrace.metamodel.UMLModel.BehavioredClassifier;
import org.emftrace.metamodel.UMLModel.BroadcastSignalAction;
import org.emftrace.metamodel.UMLModel.CallAction;
import org.emftrace.metamodel.UMLModel.CallBehaviorAction;
import org.emftrace.metamodel.UMLModel.CallEvent;
import org.emftrace.metamodel.UMLModel.CallOperationAction;
import org.emftrace.metamodel.UMLModel.CentralBufferNode;
import org.emftrace.metamodel.UMLModel.ChangeEvent;
import org.emftrace.metamodel.UMLModel.Classifier;
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
import org.emftrace.metamodel.UMLModel.ConnectableElement;
import org.emftrace.metamodel.UMLModel.ConnectableElementTemplateParameter;
import org.emftrace.metamodel.UMLModel.ConnectionPointReference;
import org.emftrace.metamodel.UMLModel.Connector;
import org.emftrace.metamodel.UMLModel.ConnectorEnd;
import org.emftrace.metamodel.UMLModel.ConsiderIgnoreFragment;
import org.emftrace.metamodel.UMLModel.Constraint;
import org.emftrace.metamodel.UMLModel.Continuation;
import org.emftrace.metamodel.UMLModel.ControlFlow;
import org.emftrace.metamodel.UMLModel.ControlNode;
import org.emftrace.metamodel.UMLModel.CreateLinkAction;
import org.emftrace.metamodel.UMLModel.CreateLinkObjectAction;
import org.emftrace.metamodel.UMLModel.CreateObjectAction;
import org.emftrace.metamodel.UMLModel.CreationEvent;
import org.emftrace.metamodel.UMLModel.DataStoreNode;
import org.emftrace.metamodel.UMLModel.DataType;
import org.emftrace.metamodel.UMLModel.DecisionNode;
import org.emftrace.metamodel.UMLModel.Dependency;
import org.emftrace.metamodel.UMLModel.DeployedArtifact;
import org.emftrace.metamodel.UMLModel.Deployment;
import org.emftrace.metamodel.UMLModel.DeploymentSpecification;
import org.emftrace.metamodel.UMLModel.DeploymentTarget;
import org.emftrace.metamodel.UMLModel.DestroyLinkAction;
import org.emftrace.metamodel.UMLModel.DestroyObjectAction;
import org.emftrace.metamodel.UMLModel.DestructionEvent;
import org.emftrace.metamodel.UMLModel.Device;
import org.emftrace.metamodel.UMLModel.DirectedRelationship;
import org.emftrace.metamodel.UMLModel.Duration;
import org.emftrace.metamodel.UMLModel.DurationConstraint;
import org.emftrace.metamodel.UMLModel.DurationInterval;
import org.emftrace.metamodel.UMLModel.DurationObservation;
import org.emftrace.metamodel.UMLModel.Element;
import org.emftrace.metamodel.UMLModel.ElementImport;
import org.emftrace.metamodel.UMLModel.EncapsulatedClassifier;
import org.emftrace.metamodel.UMLModel.Enumeration;
import org.emftrace.metamodel.UMLModel.EnumerationLiteral;
import org.emftrace.metamodel.UMLModel.Event;
import org.emftrace.metamodel.UMLModel.ExceptionHandler;
import org.emftrace.metamodel.UMLModel.ExecutableNode;
import org.emftrace.metamodel.UMLModel.ExecutionEnvironment;
import org.emftrace.metamodel.UMLModel.ExecutionEvent;
import org.emftrace.metamodel.UMLModel.ExecutionOccurrenceSpecification;
import org.emftrace.metamodel.UMLModel.ExecutionSpecification;
import org.emftrace.metamodel.UMLModel.ExpansionNode;
import org.emftrace.metamodel.UMLModel.ExpansionRegion;
import org.emftrace.metamodel.UMLModel.Expression;
import org.emftrace.metamodel.UMLModel.Extend;
import org.emftrace.metamodel.UMLModel.Extension;
import org.emftrace.metamodel.UMLModel.ExtensionEnd;
import org.emftrace.metamodel.UMLModel.ExtensionPoint;
import org.emftrace.metamodel.UMLModel.Feature;
import org.emftrace.metamodel.UMLModel.FinalNode;
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
import org.emftrace.metamodel.UMLModel.InteractionFragment;
import org.emftrace.metamodel.UMLModel.InteractionOperand;
import org.emftrace.metamodel.UMLModel.InteractionUse;
import org.emftrace.metamodel.UMLModel.Interface;
import org.emftrace.metamodel.UMLModel.InterfaceRealization;
import org.emftrace.metamodel.UMLModel.InterruptibleActivityRegion;
import org.emftrace.metamodel.UMLModel.Interval;
import org.emftrace.metamodel.UMLModel.IntervalConstraint;
import org.emftrace.metamodel.UMLModel.InvocationAction;
import org.emftrace.metamodel.UMLModel.JoinNode;
import org.emftrace.metamodel.UMLModel.Lifeline;
import org.emftrace.metamodel.UMLModel.LinkAction;
import org.emftrace.metamodel.UMLModel.LinkEndCreationData;
import org.emftrace.metamodel.UMLModel.LinkEndData;
import org.emftrace.metamodel.UMLModel.LinkEndDestructionData;
import org.emftrace.metamodel.UMLModel.LiteralBoolean;
import org.emftrace.metamodel.UMLModel.LiteralInteger;
import org.emftrace.metamodel.UMLModel.LiteralNull;
import org.emftrace.metamodel.UMLModel.LiteralSpecification;
import org.emftrace.metamodel.UMLModel.LiteralString;
import org.emftrace.metamodel.UMLModel.LiteralUnlimitedNatural;
import org.emftrace.metamodel.UMLModel.LoopNode;
import org.emftrace.metamodel.UMLModel.Manifestation;
import org.emftrace.metamodel.UMLModel.MergeNode;
import org.emftrace.metamodel.UMLModel.Message;
import org.emftrace.metamodel.UMLModel.MessageEnd;
import org.emftrace.metamodel.UMLModel.MessageEvent;
import org.emftrace.metamodel.UMLModel.MessageOccurrenceSpecification;
import org.emftrace.metamodel.UMLModel.Model;
import org.emftrace.metamodel.UMLModel.MultiplicityElement;
import org.emftrace.metamodel.UMLModel.NamedElement;
import org.emftrace.metamodel.UMLModel.Namespace;
import org.emftrace.metamodel.UMLModel.Node;
import org.emftrace.metamodel.UMLModel.ObjectFlow;
import org.emftrace.metamodel.UMLModel.ObjectNode;
import org.emftrace.metamodel.UMLModel.Observation;
import org.emftrace.metamodel.UMLModel.OccurrenceSpecification;
import org.emftrace.metamodel.UMLModel.OpaqueAction;
import org.emftrace.metamodel.UMLModel.OpaqueBehavior;
import org.emftrace.metamodel.UMLModel.OpaqueExpression;
import org.emftrace.metamodel.UMLModel.Operation;
import org.emftrace.metamodel.UMLModel.OperationTemplateParameter;
import org.emftrace.metamodel.UMLModel.OutputPin;
import org.emftrace.metamodel.UMLModel.PackageImport;
import org.emftrace.metamodel.UMLModel.PackageMerge;
import org.emftrace.metamodel.UMLModel.PackageableElement;
import org.emftrace.metamodel.UMLModel.Parameter;
import org.emftrace.metamodel.UMLModel.ParameterSet;
import org.emftrace.metamodel.UMLModel.ParameterableElement;
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
import org.emftrace.metamodel.UMLModel.RedefinableElement;
import org.emftrace.metamodel.UMLModel.RedefinableTemplateSignature;
import org.emftrace.metamodel.UMLModel.ReduceAction;
import org.emftrace.metamodel.UMLModel.Region;
import org.emftrace.metamodel.UMLModel.Relationship;
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
import org.emftrace.metamodel.UMLModel.StructuralFeature;
import org.emftrace.metamodel.UMLModel.StructuralFeatureAction;
import org.emftrace.metamodel.UMLModel.StructuredActivityNode;
import org.emftrace.metamodel.UMLModel.StructuredClassifier;
import org.emftrace.metamodel.UMLModel.Substitution;
import org.emftrace.metamodel.UMLModel.TemplateBinding;
import org.emftrace.metamodel.UMLModel.TemplateParameter;
import org.emftrace.metamodel.UMLModel.TemplateParameterSubstitution;
import org.emftrace.metamodel.UMLModel.TemplateSignature;
import org.emftrace.metamodel.UMLModel.TemplateableElement;
import org.emftrace.metamodel.UMLModel.TestIdentityAction;
import org.emftrace.metamodel.UMLModel.TimeConstraint;
import org.emftrace.metamodel.UMLModel.TimeEvent;
import org.emftrace.metamodel.UMLModel.TimeExpression;
import org.emftrace.metamodel.UMLModel.TimeInterval;
import org.emftrace.metamodel.UMLModel.TimeObservation;
import org.emftrace.metamodel.UMLModel.Transition;
import org.emftrace.metamodel.UMLModel.Trigger;
import org.emftrace.metamodel.UMLModel.Type;
import org.emftrace.metamodel.UMLModel.TypedElement;
import org.emftrace.metamodel.UMLModel.UMLBase;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;
import org.emftrace.metamodel.UMLModel.UnmarshallAction;
import org.emftrace.metamodel.UMLModel.Usage;
import org.emftrace.metamodel.UMLModel.UseCase;
import org.emftrace.metamodel.UMLModel.ValuePin;
import org.emftrace.metamodel.UMLModel.ValueSpecification;
import org.emftrace.metamodel.UMLModel.ValueSpecificationAction;
import org.emftrace.metamodel.UMLModel.Variable;
import org.emftrace.metamodel.UMLModel.VariableAction;
import org.emftrace.metamodel.UMLModel.Vertex;
import org.emftrace.metamodel.UMLModel.WriteLinkAction;
import org.emftrace.metamodel.UMLModel.WriteStructuralFeatureAction;
import org.emftrace.metamodel.UMLModel.WriteVariableAction;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage
 * @generated
 */
public class UMLModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UMLModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLModelSwitch() {
		if (modelPackage == null) {
			modelPackage = UMLModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UMLModelPackage.ABSTRACTION: {
				Abstraction abstraction = (Abstraction)theEObject;
				T result = caseAbstraction(abstraction);
				if (result == null) result = caseDependency(abstraction);
				if (result == null) result = casePackageableElement(abstraction);
				if (result == null) result = caseDirectedRelationship(abstraction);
				if (result == null) result = caseNamedElement(abstraction);
				if (result == null) result = caseParameterableElement(abstraction);
				if (result == null) result = caseRelationship(abstraction);
				if (result == null) result = caseElement(abstraction);
				if (result == null) result = caseUMLBase(abstraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ACCEPT_CALL_ACTION: {
				AcceptCallAction acceptCallAction = (AcceptCallAction)theEObject;
				T result = caseAcceptCallAction(acceptCallAction);
				if (result == null) result = caseAcceptEventAction(acceptCallAction);
				if (result == null) result = caseAction(acceptCallAction);
				if (result == null) result = caseExecutableNode(acceptCallAction);
				if (result == null) result = caseActivityNode(acceptCallAction);
				if (result == null) result = caseRedefinableElement(acceptCallAction);
				if (result == null) result = caseNamedElement(acceptCallAction);
				if (result == null) result = caseElement(acceptCallAction);
				if (result == null) result = caseUMLBase(acceptCallAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ACCEPT_EVENT_ACTION: {
				AcceptEventAction acceptEventAction = (AcceptEventAction)theEObject;
				T result = caseAcceptEventAction(acceptEventAction);
				if (result == null) result = caseAction(acceptEventAction);
				if (result == null) result = caseExecutableNode(acceptEventAction);
				if (result == null) result = caseActivityNode(acceptEventAction);
				if (result == null) result = caseRedefinableElement(acceptEventAction);
				if (result == null) result = caseNamedElement(acceptEventAction);
				if (result == null) result = caseElement(acceptEventAction);
				if (result == null) result = caseUMLBase(acceptEventAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseExecutableNode(action);
				if (result == null) result = caseActivityNode(action);
				if (result == null) result = caseRedefinableElement(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = caseElement(action);
				if (result == null) result = caseUMLBase(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ACTION_EXECUTION_SPECIFICATION: {
				ActionExecutionSpecification actionExecutionSpecification = (ActionExecutionSpecification)theEObject;
				T result = caseActionExecutionSpecification(actionExecutionSpecification);
				if (result == null) result = caseExecutionSpecification(actionExecutionSpecification);
				if (result == null) result = caseInteractionFragment(actionExecutionSpecification);
				if (result == null) result = caseNamedElement(actionExecutionSpecification);
				if (result == null) result = caseElement(actionExecutionSpecification);
				if (result == null) result = caseUMLBase(actionExecutionSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ACTION_INPUT_PIN: {
				ActionInputPin actionInputPin = (ActionInputPin)theEObject;
				T result = caseActionInputPin(actionInputPin);
				if (result == null) result = caseInputPin(actionInputPin);
				if (result == null) result = casePin(actionInputPin);
				if (result == null) result = caseObjectNode(actionInputPin);
				if (result == null) result = caseMultiplicityElement(actionInputPin);
				if (result == null) result = caseActivityNode(actionInputPin);
				if (result == null) result = caseTypedElement(actionInputPin);
				if (result == null) result = caseRedefinableElement(actionInputPin);
				if (result == null) result = caseNamedElement(actionInputPin);
				if (result == null) result = caseElement(actionInputPin);
				if (result == null) result = caseUMLBase(actionInputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseBehavior(activity);
				if (result == null) result = caseClass(activity);
				if (result == null) result = caseEncapsulatedClassifier(activity);
				if (result == null) result = caseBehavioredClassifier(activity);
				if (result == null) result = caseStructuredClassifier(activity);
				if (result == null) result = caseClassifier(activity);
				if (result == null) result = caseNamespace(activity);
				if (result == null) result = caseRedefinableElement(activity);
				if (result == null) result = caseType(activity);
				if (result == null) result = caseTemplateableElement(activity);
				if (result == null) result = casePackageableElement(activity);
				if (result == null) result = caseNamedElement(activity);
				if (result == null) result = caseParameterableElement(activity);
				if (result == null) result = caseElement(activity);
				if (result == null) result = caseUMLBase(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ACTIVITY_EDGE: {
				ActivityEdge activityEdge = (ActivityEdge)theEObject;
				T result = caseActivityEdge(activityEdge);
				if (result == null) result = caseRedefinableElement(activityEdge);
				if (result == null) result = caseNamedElement(activityEdge);
				if (result == null) result = caseElement(activityEdge);
				if (result == null) result = caseUMLBase(activityEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ACTIVITY_FINAL_NODE: {
				ActivityFinalNode activityFinalNode = (ActivityFinalNode)theEObject;
				T result = caseActivityFinalNode(activityFinalNode);
				if (result == null) result = caseFinalNode(activityFinalNode);
				if (result == null) result = caseControlNode(activityFinalNode);
				if (result == null) result = caseActivityNode(activityFinalNode);
				if (result == null) result = caseRedefinableElement(activityFinalNode);
				if (result == null) result = caseNamedElement(activityFinalNode);
				if (result == null) result = caseElement(activityFinalNode);
				if (result == null) result = caseUMLBase(activityFinalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ACTIVITY_NODE: {
				ActivityNode activityNode = (ActivityNode)theEObject;
				T result = caseActivityNode(activityNode);
				if (result == null) result = caseRedefinableElement(activityNode);
				if (result == null) result = caseNamedElement(activityNode);
				if (result == null) result = caseElement(activityNode);
				if (result == null) result = caseUMLBase(activityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ACTIVITY_GROUP: {
				ActivityGroup activityGroup = (ActivityGroup)theEObject;
				T result = caseActivityGroup(activityGroup);
				if (result == null) result = caseElement(activityGroup);
				if (result == null) result = caseUMLBase(activityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ACTIVITY_PARTITION: {
				ActivityPartition activityPartition = (ActivityPartition)theEObject;
				T result = caseActivityPartition(activityPartition);
				if (result == null) result = caseNamedElement(activityPartition);
				if (result == null) result = caseActivityGroup(activityPartition);
				if (result == null) result = caseElement(activityPartition);
				if (result == null) result = caseUMLBase(activityPartition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ACTIVITY_PARAMETER_NODE: {
				ActivityParameterNode activityParameterNode = (ActivityParameterNode)theEObject;
				T result = caseActivityParameterNode(activityParameterNode);
				if (result == null) result = caseObjectNode(activityParameterNode);
				if (result == null) result = caseActivityNode(activityParameterNode);
				if (result == null) result = caseTypedElement(activityParameterNode);
				if (result == null) result = caseRedefinableElement(activityParameterNode);
				if (result == null) result = caseNamedElement(activityParameterNode);
				if (result == null) result = caseElement(activityParameterNode);
				if (result == null) result = caseUMLBase(activityParameterNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseBehavioredClassifier(actor);
				if (result == null) result = caseClassifier(actor);
				if (result == null) result = caseNamespace(actor);
				if (result == null) result = caseRedefinableElement(actor);
				if (result == null) result = caseType(actor);
				if (result == null) result = caseTemplateableElement(actor);
				if (result == null) result = casePackageableElement(actor);
				if (result == null) result = caseNamedElement(actor);
				if (result == null) result = caseParameterableElement(actor);
				if (result == null) result = caseElement(actor);
				if (result == null) result = caseUMLBase(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION: {
				AddStructuralFeatureValueAction addStructuralFeatureValueAction = (AddStructuralFeatureValueAction)theEObject;
				T result = caseAddStructuralFeatureValueAction(addStructuralFeatureValueAction);
				if (result == null) result = caseWriteStructuralFeatureAction(addStructuralFeatureValueAction);
				if (result == null) result = caseStructuralFeatureAction(addStructuralFeatureValueAction);
				if (result == null) result = caseAction(addStructuralFeatureValueAction);
				if (result == null) result = caseExecutableNode(addStructuralFeatureValueAction);
				if (result == null) result = caseActivityNode(addStructuralFeatureValueAction);
				if (result == null) result = caseRedefinableElement(addStructuralFeatureValueAction);
				if (result == null) result = caseNamedElement(addStructuralFeatureValueAction);
				if (result == null) result = caseElement(addStructuralFeatureValueAction);
				if (result == null) result = caseUMLBase(addStructuralFeatureValueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ADD_VARIABLE_VALUE_ACTION: {
				AddVariableValueAction addVariableValueAction = (AddVariableValueAction)theEObject;
				T result = caseAddVariableValueAction(addVariableValueAction);
				if (result == null) result = caseWriteVariableAction(addVariableValueAction);
				if (result == null) result = caseVariableAction(addVariableValueAction);
				if (result == null) result = caseAction(addVariableValueAction);
				if (result == null) result = caseExecutableNode(addVariableValueAction);
				if (result == null) result = caseActivityNode(addVariableValueAction);
				if (result == null) result = caseRedefinableElement(addVariableValueAction);
				if (result == null) result = caseNamedElement(addVariableValueAction);
				if (result == null) result = caseElement(addVariableValueAction);
				if (result == null) result = caseUMLBase(addVariableValueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ANY_RECEIVE_EVENT: {
				AnyReceiveEvent anyReceiveEvent = (AnyReceiveEvent)theEObject;
				T result = caseAnyReceiveEvent(anyReceiveEvent);
				if (result == null) result = caseMessageEvent(anyReceiveEvent);
				if (result == null) result = caseEvent(anyReceiveEvent);
				if (result == null) result = casePackageableElement(anyReceiveEvent);
				if (result == null) result = caseNamedElement(anyReceiveEvent);
				if (result == null) result = caseParameterableElement(anyReceiveEvent);
				if (result == null) result = caseElement(anyReceiveEvent);
				if (result == null) result = caseUMLBase(anyReceiveEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				T result = caseArtifact(artifact);
				if (result == null) result = caseClassifier(artifact);
				if (result == null) result = caseDeployedArtifact(artifact);
				if (result == null) result = caseNamespace(artifact);
				if (result == null) result = caseRedefinableElement(artifact);
				if (result == null) result = caseType(artifact);
				if (result == null) result = caseTemplateableElement(artifact);
				if (result == null) result = casePackageableElement(artifact);
				if (result == null) result = caseNamedElement(artifact);
				if (result == null) result = caseParameterableElement(artifact);
				if (result == null) result = caseElement(artifact);
				if (result == null) result = caseUMLBase(artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseClassifier(association);
				if (result == null) result = caseRelationship(association);
				if (result == null) result = caseNamespace(association);
				if (result == null) result = caseRedefinableElement(association);
				if (result == null) result = caseType(association);
				if (result == null) result = caseTemplateableElement(association);
				if (result == null) result = casePackageableElement(association);
				if (result == null) result = caseNamedElement(association);
				if (result == null) result = caseParameterableElement(association);
				if (result == null) result = caseElement(association);
				if (result == null) result = caseUMLBase(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ASSOCIATION_CLASS: {
				AssociationClass associationClass = (AssociationClass)theEObject;
				T result = caseAssociationClass(associationClass);
				if (result == null) result = caseClass(associationClass);
				if (result == null) result = caseAssociation(associationClass);
				if (result == null) result = caseEncapsulatedClassifier(associationClass);
				if (result == null) result = caseBehavioredClassifier(associationClass);
				if (result == null) result = caseRelationship(associationClass);
				if (result == null) result = caseStructuredClassifier(associationClass);
				if (result == null) result = caseClassifier(associationClass);
				if (result == null) result = caseNamespace(associationClass);
				if (result == null) result = caseRedefinableElement(associationClass);
				if (result == null) result = caseType(associationClass);
				if (result == null) result = caseTemplateableElement(associationClass);
				if (result == null) result = casePackageableElement(associationClass);
				if (result == null) result = caseNamedElement(associationClass);
				if (result == null) result = caseParameterableElement(associationClass);
				if (result == null) result = caseElement(associationClass);
				if (result == null) result = caseUMLBase(associationClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.BEHAVIOR: {
				Behavior behavior = (Behavior)theEObject;
				T result = caseBehavior(behavior);
				if (result == null) result = caseClass(behavior);
				if (result == null) result = caseEncapsulatedClassifier(behavior);
				if (result == null) result = caseBehavioredClassifier(behavior);
				if (result == null) result = caseStructuredClassifier(behavior);
				if (result == null) result = caseClassifier(behavior);
				if (result == null) result = caseNamespace(behavior);
				if (result == null) result = caseRedefinableElement(behavior);
				if (result == null) result = caseType(behavior);
				if (result == null) result = caseTemplateableElement(behavior);
				if (result == null) result = casePackageableElement(behavior);
				if (result == null) result = caseNamedElement(behavior);
				if (result == null) result = caseParameterableElement(behavior);
				if (result == null) result = caseElement(behavior);
				if (result == null) result = caseUMLBase(behavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.BEHAVIOR_EXECUTION_SPECIFICATION: {
				BehaviorExecutionSpecification behaviorExecutionSpecification = (BehaviorExecutionSpecification)theEObject;
				T result = caseBehaviorExecutionSpecification(behaviorExecutionSpecification);
				if (result == null) result = caseExecutionSpecification(behaviorExecutionSpecification);
				if (result == null) result = caseInteractionFragment(behaviorExecutionSpecification);
				if (result == null) result = caseNamedElement(behaviorExecutionSpecification);
				if (result == null) result = caseElement(behaviorExecutionSpecification);
				if (result == null) result = caseUMLBase(behaviorExecutionSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.BEHAVIORAL_FEATURE: {
				BehavioralFeature behavioralFeature = (BehavioralFeature)theEObject;
				T result = caseBehavioralFeature(behavioralFeature);
				if (result == null) result = caseNamespace(behavioralFeature);
				if (result == null) result = caseFeature(behavioralFeature);
				if (result == null) result = caseRedefinableElement(behavioralFeature);
				if (result == null) result = caseNamedElement(behavioralFeature);
				if (result == null) result = caseElement(behavioralFeature);
				if (result == null) result = caseUMLBase(behavioralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.BEHAVIORED_CLASSIFIER: {
				BehavioredClassifier behavioredClassifier = (BehavioredClassifier)theEObject;
				T result = caseBehavioredClassifier(behavioredClassifier);
				if (result == null) result = caseClassifier(behavioredClassifier);
				if (result == null) result = caseNamespace(behavioredClassifier);
				if (result == null) result = caseRedefinableElement(behavioredClassifier);
				if (result == null) result = caseType(behavioredClassifier);
				if (result == null) result = caseTemplateableElement(behavioredClassifier);
				if (result == null) result = casePackageableElement(behavioredClassifier);
				if (result == null) result = caseNamedElement(behavioredClassifier);
				if (result == null) result = caseParameterableElement(behavioredClassifier);
				if (result == null) result = caseElement(behavioredClassifier);
				if (result == null) result = caseUMLBase(behavioredClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.BROADCAST_SIGNAL_ACTION: {
				BroadcastSignalAction broadcastSignalAction = (BroadcastSignalAction)theEObject;
				T result = caseBroadcastSignalAction(broadcastSignalAction);
				if (result == null) result = caseInvocationAction(broadcastSignalAction);
				if (result == null) result = caseAction(broadcastSignalAction);
				if (result == null) result = caseExecutableNode(broadcastSignalAction);
				if (result == null) result = caseActivityNode(broadcastSignalAction);
				if (result == null) result = caseRedefinableElement(broadcastSignalAction);
				if (result == null) result = caseNamedElement(broadcastSignalAction);
				if (result == null) result = caseElement(broadcastSignalAction);
				if (result == null) result = caseUMLBase(broadcastSignalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CALL_ACTION: {
				CallAction callAction = (CallAction)theEObject;
				T result = caseCallAction(callAction);
				if (result == null) result = caseInvocationAction(callAction);
				if (result == null) result = caseAction(callAction);
				if (result == null) result = caseExecutableNode(callAction);
				if (result == null) result = caseActivityNode(callAction);
				if (result == null) result = caseRedefinableElement(callAction);
				if (result == null) result = caseNamedElement(callAction);
				if (result == null) result = caseElement(callAction);
				if (result == null) result = caseUMLBase(callAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CALL_BEHAVIOR_ACTION: {
				CallBehaviorAction callBehaviorAction = (CallBehaviorAction)theEObject;
				T result = caseCallBehaviorAction(callBehaviorAction);
				if (result == null) result = caseCallAction(callBehaviorAction);
				if (result == null) result = caseInvocationAction(callBehaviorAction);
				if (result == null) result = caseAction(callBehaviorAction);
				if (result == null) result = caseExecutableNode(callBehaviorAction);
				if (result == null) result = caseActivityNode(callBehaviorAction);
				if (result == null) result = caseRedefinableElement(callBehaviorAction);
				if (result == null) result = caseNamedElement(callBehaviorAction);
				if (result == null) result = caseElement(callBehaviorAction);
				if (result == null) result = caseUMLBase(callBehaviorAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CALL_EVENT: {
				CallEvent callEvent = (CallEvent)theEObject;
				T result = caseCallEvent(callEvent);
				if (result == null) result = caseMessageEvent(callEvent);
				if (result == null) result = caseEvent(callEvent);
				if (result == null) result = casePackageableElement(callEvent);
				if (result == null) result = caseNamedElement(callEvent);
				if (result == null) result = caseParameterableElement(callEvent);
				if (result == null) result = caseElement(callEvent);
				if (result == null) result = caseUMLBase(callEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CALL_OPERATION_ACTION: {
				CallOperationAction callOperationAction = (CallOperationAction)theEObject;
				T result = caseCallOperationAction(callOperationAction);
				if (result == null) result = caseCallAction(callOperationAction);
				if (result == null) result = caseInvocationAction(callOperationAction);
				if (result == null) result = caseAction(callOperationAction);
				if (result == null) result = caseExecutableNode(callOperationAction);
				if (result == null) result = caseActivityNode(callOperationAction);
				if (result == null) result = caseRedefinableElement(callOperationAction);
				if (result == null) result = caseNamedElement(callOperationAction);
				if (result == null) result = caseElement(callOperationAction);
				if (result == null) result = caseUMLBase(callOperationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CHANGE_EVENT: {
				ChangeEvent changeEvent = (ChangeEvent)theEObject;
				T result = caseChangeEvent(changeEvent);
				if (result == null) result = caseEvent(changeEvent);
				if (result == null) result = casePackageableElement(changeEvent);
				if (result == null) result = caseNamedElement(changeEvent);
				if (result == null) result = caseParameterableElement(changeEvent);
				if (result == null) result = caseElement(changeEvent);
				if (result == null) result = caseUMLBase(changeEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CLASS: {
				org.emftrace.metamodel.UMLModel.Class class_ = (org.emftrace.metamodel.UMLModel.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseEncapsulatedClassifier(class_);
				if (result == null) result = caseBehavioredClassifier(class_);
				if (result == null) result = caseStructuredClassifier(class_);
				if (result == null) result = caseClassifier(class_);
				if (result == null) result = caseNamespace(class_);
				if (result == null) result = caseRedefinableElement(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = caseTemplateableElement(class_);
				if (result == null) result = casePackageableElement(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = caseParameterableElement(class_);
				if (result == null) result = caseElement(class_);
				if (result == null) result = caseUMLBase(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseNamespace(classifier);
				if (result == null) result = caseRedefinableElement(classifier);
				if (result == null) result = caseType(classifier);
				if (result == null) result = caseTemplateableElement(classifier);
				if (result == null) result = casePackageableElement(classifier);
				if (result == null) result = caseNamedElement(classifier);
				if (result == null) result = caseParameterableElement(classifier);
				if (result == null) result = caseElement(classifier);
				if (result == null) result = caseUMLBase(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CLASSIFIER_TEMPLATE_PARAMETER: {
				ClassifierTemplateParameter classifierTemplateParameter = (ClassifierTemplateParameter)theEObject;
				T result = caseClassifierTemplateParameter(classifierTemplateParameter);
				if (result == null) result = caseTemplateParameter(classifierTemplateParameter);
				if (result == null) result = caseElement(classifierTemplateParameter);
				if (result == null) result = caseUMLBase(classifierTemplateParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CLAUSE: {
				Clause clause = (Clause)theEObject;
				T result = caseClause(clause);
				if (result == null) result = caseElement(clause);
				if (result == null) result = caseUMLBase(clause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CLEAR_VARIABLE_ACTION: {
				ClearVariableAction clearVariableAction = (ClearVariableAction)theEObject;
				T result = caseClearVariableAction(clearVariableAction);
				if (result == null) result = caseVariableAction(clearVariableAction);
				if (result == null) result = caseAction(clearVariableAction);
				if (result == null) result = caseExecutableNode(clearVariableAction);
				if (result == null) result = caseActivityNode(clearVariableAction);
				if (result == null) result = caseRedefinableElement(clearVariableAction);
				if (result == null) result = caseNamedElement(clearVariableAction);
				if (result == null) result = caseElement(clearVariableAction);
				if (result == null) result = caseUMLBase(clearVariableAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CLEAR_ASSOCIATION_ACTION: {
				ClearAssociationAction clearAssociationAction = (ClearAssociationAction)theEObject;
				T result = caseClearAssociationAction(clearAssociationAction);
				if (result == null) result = caseAction(clearAssociationAction);
				if (result == null) result = caseExecutableNode(clearAssociationAction);
				if (result == null) result = caseActivityNode(clearAssociationAction);
				if (result == null) result = caseRedefinableElement(clearAssociationAction);
				if (result == null) result = caseNamedElement(clearAssociationAction);
				if (result == null) result = caseElement(clearAssociationAction);
				if (result == null) result = caseUMLBase(clearAssociationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CLEAR_STRUCTURAL_FEATURE_ACTION: {
				ClearStructuralFeatureAction clearStructuralFeatureAction = (ClearStructuralFeatureAction)theEObject;
				T result = caseClearStructuralFeatureAction(clearStructuralFeatureAction);
				if (result == null) result = caseStructuralFeatureAction(clearStructuralFeatureAction);
				if (result == null) result = caseAction(clearStructuralFeatureAction);
				if (result == null) result = caseExecutableNode(clearStructuralFeatureAction);
				if (result == null) result = caseActivityNode(clearStructuralFeatureAction);
				if (result == null) result = caseRedefinableElement(clearStructuralFeatureAction);
				if (result == null) result = caseNamedElement(clearStructuralFeatureAction);
				if (result == null) result = caseElement(clearStructuralFeatureAction);
				if (result == null) result = caseUMLBase(clearStructuralFeatureAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.COLLABORATION: {
				Collaboration collaboration = (Collaboration)theEObject;
				T result = caseCollaboration(collaboration);
				if (result == null) result = caseBehavioredClassifier(collaboration);
				if (result == null) result = caseStructuredClassifier(collaboration);
				if (result == null) result = caseClassifier(collaboration);
				if (result == null) result = caseNamespace(collaboration);
				if (result == null) result = caseRedefinableElement(collaboration);
				if (result == null) result = caseType(collaboration);
				if (result == null) result = caseTemplateableElement(collaboration);
				if (result == null) result = casePackageableElement(collaboration);
				if (result == null) result = caseNamedElement(collaboration);
				if (result == null) result = caseParameterableElement(collaboration);
				if (result == null) result = caseElement(collaboration);
				if (result == null) result = caseUMLBase(collaboration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.COLLABORATION_USE: {
				CollaborationUse collaborationUse = (CollaborationUse)theEObject;
				T result = caseCollaborationUse(collaborationUse);
				if (result == null) result = caseNamedElement(collaborationUse);
				if (result == null) result = caseElement(collaborationUse);
				if (result == null) result = caseUMLBase(collaborationUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseElement(comment);
				if (result == null) result = caseUMLBase(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.COMMUNICATION_PATH: {
				CommunicationPath communicationPath = (CommunicationPath)theEObject;
				T result = caseCommunicationPath(communicationPath);
				if (result == null) result = caseAssociation(communicationPath);
				if (result == null) result = caseClassifier(communicationPath);
				if (result == null) result = caseRelationship(communicationPath);
				if (result == null) result = caseNamespace(communicationPath);
				if (result == null) result = caseRedefinableElement(communicationPath);
				if (result == null) result = caseType(communicationPath);
				if (result == null) result = caseTemplateableElement(communicationPath);
				if (result == null) result = casePackageableElement(communicationPath);
				if (result == null) result = caseNamedElement(communicationPath);
				if (result == null) result = caseParameterableElement(communicationPath);
				if (result == null) result = caseElement(communicationPath);
				if (result == null) result = caseUMLBase(communicationPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseClass(component);
				if (result == null) result = caseEncapsulatedClassifier(component);
				if (result == null) result = caseBehavioredClassifier(component);
				if (result == null) result = caseStructuredClassifier(component);
				if (result == null) result = caseClassifier(component);
				if (result == null) result = caseNamespace(component);
				if (result == null) result = caseRedefinableElement(component);
				if (result == null) result = caseType(component);
				if (result == null) result = caseTemplateableElement(component);
				if (result == null) result = casePackageableElement(component);
				if (result == null) result = caseNamedElement(component);
				if (result == null) result = caseParameterableElement(component);
				if (result == null) result = caseElement(component);
				if (result == null) result = caseUMLBase(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.COMPONENT_REALIZATION: {
				ComponentRealization componentRealization = (ComponentRealization)theEObject;
				T result = caseComponentRealization(componentRealization);
				if (result == null) result = caseRealization(componentRealization);
				if (result == null) result = caseAbstraction(componentRealization);
				if (result == null) result = caseDependency(componentRealization);
				if (result == null) result = casePackageableElement(componentRealization);
				if (result == null) result = caseDirectedRelationship(componentRealization);
				if (result == null) result = caseNamedElement(componentRealization);
				if (result == null) result = caseParameterableElement(componentRealization);
				if (result == null) result = caseRelationship(componentRealization);
				if (result == null) result = caseElement(componentRealization);
				if (result == null) result = caseUMLBase(componentRealization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.COMBINED_FRAGMENT: {
				CombinedFragment combinedFragment = (CombinedFragment)theEObject;
				T result = caseCombinedFragment(combinedFragment);
				if (result == null) result = caseInteractionFragment(combinedFragment);
				if (result == null) result = caseNamedElement(combinedFragment);
				if (result == null) result = caseElement(combinedFragment);
				if (result == null) result = caseUMLBase(combinedFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CONDITIONAL_NODE: {
				ConditionalNode conditionalNode = (ConditionalNode)theEObject;
				T result = caseConditionalNode(conditionalNode);
				if (result == null) result = caseStructuredActivityNode(conditionalNode);
				if (result == null) result = caseAction(conditionalNode);
				if (result == null) result = caseNamespace(conditionalNode);
				if (result == null) result = caseActivityGroup(conditionalNode);
				if (result == null) result = caseExecutableNode(conditionalNode);
				if (result == null) result = caseActivityNode(conditionalNode);
				if (result == null) result = caseRedefinableElement(conditionalNode);
				if (result == null) result = caseNamedElement(conditionalNode);
				if (result == null) result = caseElement(conditionalNode);
				if (result == null) result = caseUMLBase(conditionalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = casePackageableElement(constraint);
				if (result == null) result = caseNamedElement(constraint);
				if (result == null) result = caseParameterableElement(constraint);
				if (result == null) result = caseElement(constraint);
				if (result == null) result = caseUMLBase(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CONSIDER_IGNORE_FRAGMENT: {
				ConsiderIgnoreFragment considerIgnoreFragment = (ConsiderIgnoreFragment)theEObject;
				T result = caseConsiderIgnoreFragment(considerIgnoreFragment);
				if (result == null) result = caseCombinedFragment(considerIgnoreFragment);
				if (result == null) result = caseInteractionFragment(considerIgnoreFragment);
				if (result == null) result = caseNamedElement(considerIgnoreFragment);
				if (result == null) result = caseElement(considerIgnoreFragment);
				if (result == null) result = caseUMLBase(considerIgnoreFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CONTINUATION: {
				Continuation continuation = (Continuation)theEObject;
				T result = caseContinuation(continuation);
				if (result == null) result = caseInteractionFragment(continuation);
				if (result == null) result = caseNamedElement(continuation);
				if (result == null) result = caseElement(continuation);
				if (result == null) result = caseUMLBase(continuation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CONNECTABLE_ELEMENT: {
				ConnectableElement connectableElement = (ConnectableElement)theEObject;
				T result = caseConnectableElement(connectableElement);
				if (result == null) result = caseTypedElement(connectableElement);
				if (result == null) result = caseParameterableElement(connectableElement);
				if (result == null) result = caseNamedElement(connectableElement);
				if (result == null) result = caseElement(connectableElement);
				if (result == null) result = caseUMLBase(connectableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER: {
				ConnectableElementTemplateParameter connectableElementTemplateParameter = (ConnectableElementTemplateParameter)theEObject;
				T result = caseConnectableElementTemplateParameter(connectableElementTemplateParameter);
				if (result == null) result = caseTemplateParameter(connectableElementTemplateParameter);
				if (result == null) result = caseElement(connectableElementTemplateParameter);
				if (result == null) result = caseUMLBase(connectableElementTemplateParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CONNECTOR_END: {
				ConnectorEnd connectorEnd = (ConnectorEnd)theEObject;
				T result = caseConnectorEnd(connectorEnd);
				if (result == null) result = caseMultiplicityElement(connectorEnd);
				if (result == null) result = caseElement(connectorEnd);
				if (result == null) result = caseUMLBase(connectorEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CONNECTION_POINT_REFERENCE: {
				ConnectionPointReference connectionPointReference = (ConnectionPointReference)theEObject;
				T result = caseConnectionPointReference(connectionPointReference);
				if (result == null) result = caseVertex(connectionPointReference);
				if (result == null) result = caseNamedElement(connectionPointReference);
				if (result == null) result = caseElement(connectionPointReference);
				if (result == null) result = caseUMLBase(connectionPointReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseFeature(connector);
				if (result == null) result = caseRedefinableElement(connector);
				if (result == null) result = caseNamedElement(connector);
				if (result == null) result = caseElement(connector);
				if (result == null) result = caseUMLBase(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CONTROL_FLOW: {
				ControlFlow controlFlow = (ControlFlow)theEObject;
				T result = caseControlFlow(controlFlow);
				if (result == null) result = caseActivityEdge(controlFlow);
				if (result == null) result = caseRedefinableElement(controlFlow);
				if (result == null) result = caseNamedElement(controlFlow);
				if (result == null) result = caseElement(controlFlow);
				if (result == null) result = caseUMLBase(controlFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CONTROL_NODE: {
				ControlNode controlNode = (ControlNode)theEObject;
				T result = caseControlNode(controlNode);
				if (result == null) result = caseActivityNode(controlNode);
				if (result == null) result = caseRedefinableElement(controlNode);
				if (result == null) result = caseNamedElement(controlNode);
				if (result == null) result = caseElement(controlNode);
				if (result == null) result = caseUMLBase(controlNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CREATION_EVENT: {
				CreationEvent creationEvent = (CreationEvent)theEObject;
				T result = caseCreationEvent(creationEvent);
				if (result == null) result = caseEvent(creationEvent);
				if (result == null) result = casePackageableElement(creationEvent);
				if (result == null) result = caseNamedElement(creationEvent);
				if (result == null) result = caseParameterableElement(creationEvent);
				if (result == null) result = caseElement(creationEvent);
				if (result == null) result = caseUMLBase(creationEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CREATE_LINK_OBJECT_ACTION: {
				CreateLinkObjectAction createLinkObjectAction = (CreateLinkObjectAction)theEObject;
				T result = caseCreateLinkObjectAction(createLinkObjectAction);
				if (result == null) result = caseCreateLinkAction(createLinkObjectAction);
				if (result == null) result = caseWriteLinkAction(createLinkObjectAction);
				if (result == null) result = caseLinkAction(createLinkObjectAction);
				if (result == null) result = caseAction(createLinkObjectAction);
				if (result == null) result = caseExecutableNode(createLinkObjectAction);
				if (result == null) result = caseActivityNode(createLinkObjectAction);
				if (result == null) result = caseRedefinableElement(createLinkObjectAction);
				if (result == null) result = caseNamedElement(createLinkObjectAction);
				if (result == null) result = caseElement(createLinkObjectAction);
				if (result == null) result = caseUMLBase(createLinkObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CREATE_OBJECT_ACTION: {
				CreateObjectAction createObjectAction = (CreateObjectAction)theEObject;
				T result = caseCreateObjectAction(createObjectAction);
				if (result == null) result = caseAction(createObjectAction);
				if (result == null) result = caseExecutableNode(createObjectAction);
				if (result == null) result = caseActivityNode(createObjectAction);
				if (result == null) result = caseRedefinableElement(createObjectAction);
				if (result == null) result = caseNamedElement(createObjectAction);
				if (result == null) result = caseElement(createObjectAction);
				if (result == null) result = caseUMLBase(createObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CREATE_LINK_ACTION: {
				CreateLinkAction createLinkAction = (CreateLinkAction)theEObject;
				T result = caseCreateLinkAction(createLinkAction);
				if (result == null) result = caseWriteLinkAction(createLinkAction);
				if (result == null) result = caseLinkAction(createLinkAction);
				if (result == null) result = caseAction(createLinkAction);
				if (result == null) result = caseExecutableNode(createLinkAction);
				if (result == null) result = caseActivityNode(createLinkAction);
				if (result == null) result = caseRedefinableElement(createLinkAction);
				if (result == null) result = caseNamedElement(createLinkAction);
				if (result == null) result = caseElement(createLinkAction);
				if (result == null) result = caseUMLBase(createLinkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.CENTRAL_BUFFER_NODE: {
				CentralBufferNode centralBufferNode = (CentralBufferNode)theEObject;
				T result = caseCentralBufferNode(centralBufferNode);
				if (result == null) result = caseObjectNode(centralBufferNode);
				if (result == null) result = caseActivityNode(centralBufferNode);
				if (result == null) result = caseTypedElement(centralBufferNode);
				if (result == null) result = caseRedefinableElement(centralBufferNode);
				if (result == null) result = caseNamedElement(centralBufferNode);
				if (result == null) result = caseElement(centralBufferNode);
				if (result == null) result = caseUMLBase(centralBufferNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.DATA_STORE_NODE: {
				DataStoreNode dataStoreNode = (DataStoreNode)theEObject;
				T result = caseDataStoreNode(dataStoreNode);
				if (result == null) result = caseCentralBufferNode(dataStoreNode);
				if (result == null) result = caseObjectNode(dataStoreNode);
				if (result == null) result = caseActivityNode(dataStoreNode);
				if (result == null) result = caseTypedElement(dataStoreNode);
				if (result == null) result = caseRedefinableElement(dataStoreNode);
				if (result == null) result = caseNamedElement(dataStoreNode);
				if (result == null) result = caseElement(dataStoreNode);
				if (result == null) result = caseUMLBase(dataStoreNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseClassifier(dataType);
				if (result == null) result = caseNamespace(dataType);
				if (result == null) result = caseRedefinableElement(dataType);
				if (result == null) result = caseType(dataType);
				if (result == null) result = caseTemplateableElement(dataType);
				if (result == null) result = casePackageableElement(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = caseParameterableElement(dataType);
				if (result == null) result = caseElement(dataType);
				if (result == null) result = caseUMLBase(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.DECISION_NODE: {
				DecisionNode decisionNode = (DecisionNode)theEObject;
				T result = caseDecisionNode(decisionNode);
				if (result == null) result = caseControlNode(decisionNode);
				if (result == null) result = caseActivityNode(decisionNode);
				if (result == null) result = caseRedefinableElement(decisionNode);
				if (result == null) result = caseNamedElement(decisionNode);
				if (result == null) result = caseElement(decisionNode);
				if (result == null) result = caseUMLBase(decisionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = casePackageableElement(dependency);
				if (result == null) result = caseDirectedRelationship(dependency);
				if (result == null) result = caseNamedElement(dependency);
				if (result == null) result = caseParameterableElement(dependency);
				if (result == null) result = caseRelationship(dependency);
				if (result == null) result = caseElement(dependency);
				if (result == null) result = caseUMLBase(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.DEPLOYMENT_TARGET: {
				DeploymentTarget deploymentTarget = (DeploymentTarget)theEObject;
				T result = caseDeploymentTarget(deploymentTarget);
				if (result == null) result = caseNamedElement(deploymentTarget);
				if (result == null) result = caseElement(deploymentTarget);
				if (result == null) result = caseUMLBase(deploymentTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.DEPLOYMENT: {
				Deployment deployment = (Deployment)theEObject;
				T result = caseDeployment(deployment);
				if (result == null) result = caseDependency(deployment);
				if (result == null) result = casePackageableElement(deployment);
				if (result == null) result = caseDirectedRelationship(deployment);
				if (result == null) result = caseNamedElement(deployment);
				if (result == null) result = caseParameterableElement(deployment);
				if (result == null) result = caseRelationship(deployment);
				if (result == null) result = caseElement(deployment);
				if (result == null) result = caseUMLBase(deployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.DEPLOYED_ARTIFACT: {
				DeployedArtifact deployedArtifact = (DeployedArtifact)theEObject;
				T result = caseDeployedArtifact(deployedArtifact);
				if (result == null) result = caseNamedElement(deployedArtifact);
				if (result == null) result = caseElement(deployedArtifact);
				if (result == null) result = caseUMLBase(deployedArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.DEPLOYMENT_SPECIFICATION: {
				DeploymentSpecification deploymentSpecification = (DeploymentSpecification)theEObject;
				T result = caseDeploymentSpecification(deploymentSpecification);
				if (result == null) result = caseArtifact(deploymentSpecification);
				if (result == null) result = caseClassifier(deploymentSpecification);
				if (result == null) result = caseDeployedArtifact(deploymentSpecification);
				if (result == null) result = caseNamespace(deploymentSpecification);
				if (result == null) result = caseRedefinableElement(deploymentSpecification);
				if (result == null) result = caseType(deploymentSpecification);
				if (result == null) result = caseTemplateableElement(deploymentSpecification);
				if (result == null) result = casePackageableElement(deploymentSpecification);
				if (result == null) result = caseNamedElement(deploymentSpecification);
				if (result == null) result = caseParameterableElement(deploymentSpecification);
				if (result == null) result = caseElement(deploymentSpecification);
				if (result == null) result = caseUMLBase(deploymentSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.DIRECTED_RELATIONSHIP: {
				DirectedRelationship directedRelationship = (DirectedRelationship)theEObject;
				T result = caseDirectedRelationship(directedRelationship);
				if (result == null) result = caseRelationship(directedRelationship);
				if (result == null) result = caseElement(directedRelationship);
				if (result == null) result = caseUMLBase(directedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseNode(device);
				if (result == null) result = caseClass(device);
				if (result == null) result = caseDeploymentTarget(device);
				if (result == null) result = caseEncapsulatedClassifier(device);
				if (result == null) result = caseBehavioredClassifier(device);
				if (result == null) result = caseStructuredClassifier(device);
				if (result == null) result = caseClassifier(device);
				if (result == null) result = caseNamespace(device);
				if (result == null) result = caseRedefinableElement(device);
				if (result == null) result = caseType(device);
				if (result == null) result = caseTemplateableElement(device);
				if (result == null) result = casePackageableElement(device);
				if (result == null) result = caseNamedElement(device);
				if (result == null) result = caseParameterableElement(device);
				if (result == null) result = caseElement(device);
				if (result == null) result = caseUMLBase(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.DESTROY_LINK_ACTION: {
				DestroyLinkAction destroyLinkAction = (DestroyLinkAction)theEObject;
				T result = caseDestroyLinkAction(destroyLinkAction);
				if (result == null) result = caseWriteLinkAction(destroyLinkAction);
				if (result == null) result = caseLinkAction(destroyLinkAction);
				if (result == null) result = caseAction(destroyLinkAction);
				if (result == null) result = caseExecutableNode(destroyLinkAction);
				if (result == null) result = caseActivityNode(destroyLinkAction);
				if (result == null) result = caseRedefinableElement(destroyLinkAction);
				if (result == null) result = caseNamedElement(destroyLinkAction);
				if (result == null) result = caseElement(destroyLinkAction);
				if (result == null) result = caseUMLBase(destroyLinkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.DESTROY_OBJECT_ACTION: {
				DestroyObjectAction destroyObjectAction = (DestroyObjectAction)theEObject;
				T result = caseDestroyObjectAction(destroyObjectAction);
				if (result == null) result = caseAction(destroyObjectAction);
				if (result == null) result = caseExecutableNode(destroyObjectAction);
				if (result == null) result = caseActivityNode(destroyObjectAction);
				if (result == null) result = caseRedefinableElement(destroyObjectAction);
				if (result == null) result = caseNamedElement(destroyObjectAction);
				if (result == null) result = caseElement(destroyObjectAction);
				if (result == null) result = caseUMLBase(destroyObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.DESTRUCTION_EVENT: {
				DestructionEvent destructionEvent = (DestructionEvent)theEObject;
				T result = caseDestructionEvent(destructionEvent);
				if (result == null) result = caseEvent(destructionEvent);
				if (result == null) result = casePackageableElement(destructionEvent);
				if (result == null) result = caseNamedElement(destructionEvent);
				if (result == null) result = caseParameterableElement(destructionEvent);
				if (result == null) result = caseElement(destructionEvent);
				if (result == null) result = caseUMLBase(destructionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.DURATION: {
				Duration duration = (Duration)theEObject;
				T result = caseDuration(duration);
				if (result == null) result = caseValueSpecification(duration);
				if (result == null) result = casePackageableElement(duration);
				if (result == null) result = caseTypedElement(duration);
				if (result == null) result = caseNamedElement(duration);
				if (result == null) result = caseParameterableElement(duration);
				if (result == null) result = caseElement(duration);
				if (result == null) result = caseUMLBase(duration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.DURATION_CONSTRAINT: {
				DurationConstraint durationConstraint = (DurationConstraint)theEObject;
				T result = caseDurationConstraint(durationConstraint);
				if (result == null) result = caseIntervalConstraint(durationConstraint);
				if (result == null) result = caseConstraint(durationConstraint);
				if (result == null) result = casePackageableElement(durationConstraint);
				if (result == null) result = caseNamedElement(durationConstraint);
				if (result == null) result = caseParameterableElement(durationConstraint);
				if (result == null) result = caseElement(durationConstraint);
				if (result == null) result = caseUMLBase(durationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.DURATION_INTERVAL: {
				DurationInterval durationInterval = (DurationInterval)theEObject;
				T result = caseDurationInterval(durationInterval);
				if (result == null) result = caseInterval(durationInterval);
				if (result == null) result = caseValueSpecification(durationInterval);
				if (result == null) result = casePackageableElement(durationInterval);
				if (result == null) result = caseTypedElement(durationInterval);
				if (result == null) result = caseNamedElement(durationInterval);
				if (result == null) result = caseParameterableElement(durationInterval);
				if (result == null) result = caseElement(durationInterval);
				if (result == null) result = caseUMLBase(durationInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.DURATION_OBSERVATION: {
				DurationObservation durationObservation = (DurationObservation)theEObject;
				T result = caseDurationObservation(durationObservation);
				if (result == null) result = caseObservation(durationObservation);
				if (result == null) result = casePackageableElement(durationObservation);
				if (result == null) result = caseNamedElement(durationObservation);
				if (result == null) result = caseParameterableElement(durationObservation);
				if (result == null) result = caseElement(durationObservation);
				if (result == null) result = caseUMLBase(durationObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseUMLBase(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ELEMENT_IMPORT: {
				ElementImport elementImport = (ElementImport)theEObject;
				T result = caseElementImport(elementImport);
				if (result == null) result = caseDirectedRelationship(elementImport);
				if (result == null) result = caseRelationship(elementImport);
				if (result == null) result = caseElement(elementImport);
				if (result == null) result = caseUMLBase(elementImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ENCAPSULATED_CLASSIFIER: {
				EncapsulatedClassifier encapsulatedClassifier = (EncapsulatedClassifier)theEObject;
				T result = caseEncapsulatedClassifier(encapsulatedClassifier);
				if (result == null) result = caseStructuredClassifier(encapsulatedClassifier);
				if (result == null) result = caseClassifier(encapsulatedClassifier);
				if (result == null) result = caseNamespace(encapsulatedClassifier);
				if (result == null) result = caseRedefinableElement(encapsulatedClassifier);
				if (result == null) result = caseType(encapsulatedClassifier);
				if (result == null) result = caseTemplateableElement(encapsulatedClassifier);
				if (result == null) result = casePackageableElement(encapsulatedClassifier);
				if (result == null) result = caseNamedElement(encapsulatedClassifier);
				if (result == null) result = caseParameterableElement(encapsulatedClassifier);
				if (result == null) result = caseElement(encapsulatedClassifier);
				if (result == null) result = caseUMLBase(encapsulatedClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseDataType(enumeration);
				if (result == null) result = caseClassifier(enumeration);
				if (result == null) result = caseNamespace(enumeration);
				if (result == null) result = caseRedefinableElement(enumeration);
				if (result == null) result = caseType(enumeration);
				if (result == null) result = caseTemplateableElement(enumeration);
				if (result == null) result = casePackageableElement(enumeration);
				if (result == null) result = caseNamedElement(enumeration);
				if (result == null) result = caseParameterableElement(enumeration);
				if (result == null) result = caseElement(enumeration);
				if (result == null) result = caseUMLBase(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.ENUMERATION_LITERAL: {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
				T result = caseEnumerationLiteral(enumerationLiteral);
				if (result == null) result = caseInstanceSpecification(enumerationLiteral);
				if (result == null) result = caseDeploymentTarget(enumerationLiteral);
				if (result == null) result = casePackageableElement(enumerationLiteral);
				if (result == null) result = caseDeployedArtifact(enumerationLiteral);
				if (result == null) result = caseNamedElement(enumerationLiteral);
				if (result == null) result = caseParameterableElement(enumerationLiteral);
				if (result == null) result = caseElement(enumerationLiteral);
				if (result == null) result = caseUMLBase(enumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.EXCEPTION_HANDLER: {
				ExceptionHandler exceptionHandler = (ExceptionHandler)theEObject;
				T result = caseExceptionHandler(exceptionHandler);
				if (result == null) result = caseElement(exceptionHandler);
				if (result == null) result = caseUMLBase(exceptionHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.EXECUTABLE_NODE: {
				ExecutableNode executableNode = (ExecutableNode)theEObject;
				T result = caseExecutableNode(executableNode);
				if (result == null) result = caseActivityNode(executableNode);
				if (result == null) result = caseRedefinableElement(executableNode);
				if (result == null) result = caseNamedElement(executableNode);
				if (result == null) result = caseElement(executableNode);
				if (result == null) result = caseUMLBase(executableNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.EXECUTION_ENVIRONMENT: {
				ExecutionEnvironment executionEnvironment = (ExecutionEnvironment)theEObject;
				T result = caseExecutionEnvironment(executionEnvironment);
				if (result == null) result = caseNode(executionEnvironment);
				if (result == null) result = caseClass(executionEnvironment);
				if (result == null) result = caseDeploymentTarget(executionEnvironment);
				if (result == null) result = caseEncapsulatedClassifier(executionEnvironment);
				if (result == null) result = caseBehavioredClassifier(executionEnvironment);
				if (result == null) result = caseStructuredClassifier(executionEnvironment);
				if (result == null) result = caseClassifier(executionEnvironment);
				if (result == null) result = caseNamespace(executionEnvironment);
				if (result == null) result = caseRedefinableElement(executionEnvironment);
				if (result == null) result = caseType(executionEnvironment);
				if (result == null) result = caseTemplateableElement(executionEnvironment);
				if (result == null) result = casePackageableElement(executionEnvironment);
				if (result == null) result = caseNamedElement(executionEnvironment);
				if (result == null) result = caseParameterableElement(executionEnvironment);
				if (result == null) result = caseElement(executionEnvironment);
				if (result == null) result = caseUMLBase(executionEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.EXECUTION_EVENT: {
				ExecutionEvent executionEvent = (ExecutionEvent)theEObject;
				T result = caseExecutionEvent(executionEvent);
				if (result == null) result = caseEvent(executionEvent);
				if (result == null) result = casePackageableElement(executionEvent);
				if (result == null) result = caseNamedElement(executionEvent);
				if (result == null) result = caseParameterableElement(executionEvent);
				if (result == null) result = caseElement(executionEvent);
				if (result == null) result = caseUMLBase(executionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.EXECUTION_OCCURRENCE_SPECIFICATION: {
				ExecutionOccurrenceSpecification executionOccurrenceSpecification = (ExecutionOccurrenceSpecification)theEObject;
				T result = caseExecutionOccurrenceSpecification(executionOccurrenceSpecification);
				if (result == null) result = caseOccurrenceSpecification(executionOccurrenceSpecification);
				if (result == null) result = caseInteractionFragment(executionOccurrenceSpecification);
				if (result == null) result = caseNamedElement(executionOccurrenceSpecification);
				if (result == null) result = caseElement(executionOccurrenceSpecification);
				if (result == null) result = caseUMLBase(executionOccurrenceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.EXECUTION_SPECIFICATION: {
				ExecutionSpecification executionSpecification = (ExecutionSpecification)theEObject;
				T result = caseExecutionSpecification(executionSpecification);
				if (result == null) result = caseInteractionFragment(executionSpecification);
				if (result == null) result = caseNamedElement(executionSpecification);
				if (result == null) result = caseElement(executionSpecification);
				if (result == null) result = caseUMLBase(executionSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.EXPANSION_NODE: {
				ExpansionNode expansionNode = (ExpansionNode)theEObject;
				T result = caseExpansionNode(expansionNode);
				if (result == null) result = caseObjectNode(expansionNode);
				if (result == null) result = caseActivityNode(expansionNode);
				if (result == null) result = caseTypedElement(expansionNode);
				if (result == null) result = caseRedefinableElement(expansionNode);
				if (result == null) result = caseNamedElement(expansionNode);
				if (result == null) result = caseElement(expansionNode);
				if (result == null) result = caseUMLBase(expansionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.EXPANSION_REGION: {
				ExpansionRegion expansionRegion = (ExpansionRegion)theEObject;
				T result = caseExpansionRegion(expansionRegion);
				if (result == null) result = caseStructuredActivityNode(expansionRegion);
				if (result == null) result = caseAction(expansionRegion);
				if (result == null) result = caseNamespace(expansionRegion);
				if (result == null) result = caseActivityGroup(expansionRegion);
				if (result == null) result = caseExecutableNode(expansionRegion);
				if (result == null) result = caseActivityNode(expansionRegion);
				if (result == null) result = caseRedefinableElement(expansionRegion);
				if (result == null) result = caseNamedElement(expansionRegion);
				if (result == null) result = caseElement(expansionRegion);
				if (result == null) result = caseUMLBase(expansionRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.EXTEND: {
				Extend extend = (Extend)theEObject;
				T result = caseExtend(extend);
				if (result == null) result = caseNamedElement(extend);
				if (result == null) result = caseDirectedRelationship(extend);
				if (result == null) result = caseRelationship(extend);
				if (result == null) result = caseElement(extend);
				if (result == null) result = caseUMLBase(extend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = caseAssociation(extension);
				if (result == null) result = caseClassifier(extension);
				if (result == null) result = caseRelationship(extension);
				if (result == null) result = caseNamespace(extension);
				if (result == null) result = caseRedefinableElement(extension);
				if (result == null) result = caseType(extension);
				if (result == null) result = caseTemplateableElement(extension);
				if (result == null) result = casePackageableElement(extension);
				if (result == null) result = caseNamedElement(extension);
				if (result == null) result = caseParameterableElement(extension);
				if (result == null) result = caseElement(extension);
				if (result == null) result = caseUMLBase(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.EXTENSION_END: {
				ExtensionEnd extensionEnd = (ExtensionEnd)theEObject;
				T result = caseExtensionEnd(extensionEnd);
				if (result == null) result = caseProperty(extensionEnd);
				if (result == null) result = caseStructuralFeature(extensionEnd);
				if (result == null) result = caseConnectableElement(extensionEnd);
				if (result == null) result = caseDeploymentTarget(extensionEnd);
				if (result == null) result = caseTemplateableElement(extensionEnd);
				if (result == null) result = caseFeature(extensionEnd);
				if (result == null) result = caseTypedElement(extensionEnd);
				if (result == null) result = caseMultiplicityElement(extensionEnd);
				if (result == null) result = caseParameterableElement(extensionEnd);
				if (result == null) result = caseRedefinableElement(extensionEnd);
				if (result == null) result = caseNamedElement(extensionEnd);
				if (result == null) result = caseElement(extensionEnd);
				if (result == null) result = caseUMLBase(extensionEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.EXTENSION_POINT: {
				ExtensionPoint extensionPoint = (ExtensionPoint)theEObject;
				T result = caseExtensionPoint(extensionPoint);
				if (result == null) result = caseRedefinableElement(extensionPoint);
				if (result == null) result = caseNamedElement(extensionPoint);
				if (result == null) result = caseElement(extensionPoint);
				if (result == null) result = caseUMLBase(extensionPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseValueSpecification(expression);
				if (result == null) result = casePackageableElement(expression);
				if (result == null) result = caseTypedElement(expression);
				if (result == null) result = caseNamedElement(expression);
				if (result == null) result = caseParameterableElement(expression);
				if (result == null) result = caseElement(expression);
				if (result == null) result = caseUMLBase(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = casePackageableElement(event);
				if (result == null) result = caseNamedElement(event);
				if (result == null) result = caseParameterableElement(event);
				if (result == null) result = caseElement(event);
				if (result == null) result = caseUMLBase(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseRedefinableElement(feature);
				if (result == null) result = caseNamedElement(feature);
				if (result == null) result = caseElement(feature);
				if (result == null) result = caseUMLBase(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.FINAL_STATE: {
				FinalState finalState = (FinalState)theEObject;
				T result = caseFinalState(finalState);
				if (result == null) result = caseState(finalState);
				if (result == null) result = caseNamespace(finalState);
				if (result == null) result = caseRedefinableElement(finalState);
				if (result == null) result = caseVertex(finalState);
				if (result == null) result = caseNamedElement(finalState);
				if (result == null) result = caseElement(finalState);
				if (result == null) result = caseUMLBase(finalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.FORK_NODE: {
				ForkNode forkNode = (ForkNode)theEObject;
				T result = caseForkNode(forkNode);
				if (result == null) result = caseControlNode(forkNode);
				if (result == null) result = caseActivityNode(forkNode);
				if (result == null) result = caseRedefinableElement(forkNode);
				if (result == null) result = caseNamedElement(forkNode);
				if (result == null) result = caseElement(forkNode);
				if (result == null) result = caseUMLBase(forkNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.FLOW_FINAL_NODE: {
				FlowFinalNode flowFinalNode = (FlowFinalNode)theEObject;
				T result = caseFlowFinalNode(flowFinalNode);
				if (result == null) result = caseFinalNode(flowFinalNode);
				if (result == null) result = caseControlNode(flowFinalNode);
				if (result == null) result = caseActivityNode(flowFinalNode);
				if (result == null) result = caseRedefinableElement(flowFinalNode);
				if (result == null) result = caseNamedElement(flowFinalNode);
				if (result == null) result = caseElement(flowFinalNode);
				if (result == null) result = caseUMLBase(flowFinalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.FINAL_NODE: {
				FinalNode finalNode = (FinalNode)theEObject;
				T result = caseFinalNode(finalNode);
				if (result == null) result = caseControlNode(finalNode);
				if (result == null) result = caseActivityNode(finalNode);
				if (result == null) result = caseRedefinableElement(finalNode);
				if (result == null) result = caseNamedElement(finalNode);
				if (result == null) result = caseElement(finalNode);
				if (result == null) result = caseUMLBase(finalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.FUNCTION_BEHAVIOR: {
				FunctionBehavior functionBehavior = (FunctionBehavior)theEObject;
				T result = caseFunctionBehavior(functionBehavior);
				if (result == null) result = caseOpaqueBehavior(functionBehavior);
				if (result == null) result = caseBehavior(functionBehavior);
				if (result == null) result = caseClass(functionBehavior);
				if (result == null) result = caseEncapsulatedClassifier(functionBehavior);
				if (result == null) result = caseBehavioredClassifier(functionBehavior);
				if (result == null) result = caseStructuredClassifier(functionBehavior);
				if (result == null) result = caseClassifier(functionBehavior);
				if (result == null) result = caseNamespace(functionBehavior);
				if (result == null) result = caseRedefinableElement(functionBehavior);
				if (result == null) result = caseType(functionBehavior);
				if (result == null) result = caseTemplateableElement(functionBehavior);
				if (result == null) result = casePackageableElement(functionBehavior);
				if (result == null) result = caseNamedElement(functionBehavior);
				if (result == null) result = caseParameterableElement(functionBehavior);
				if (result == null) result = caseElement(functionBehavior);
				if (result == null) result = caseUMLBase(functionBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.GATE: {
				Gate gate = (Gate)theEObject;
				T result = caseGate(gate);
				if (result == null) result = caseMessageEnd(gate);
				if (result == null) result = caseNamedElement(gate);
				if (result == null) result = caseElement(gate);
				if (result == null) result = caseUMLBase(gate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.GENERAL_ORDERING: {
				GeneralOrdering generalOrdering = (GeneralOrdering)theEObject;
				T result = caseGeneralOrdering(generalOrdering);
				if (result == null) result = caseNamedElement(generalOrdering);
				if (result == null) result = caseElement(generalOrdering);
				if (result == null) result = caseUMLBase(generalOrdering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.GENERALIZATION: {
				Generalization generalization = (Generalization)theEObject;
				T result = caseGeneralization(generalization);
				if (result == null) result = caseDirectedRelationship(generalization);
				if (result == null) result = caseRelationship(generalization);
				if (result == null) result = caseElement(generalization);
				if (result == null) result = caseUMLBase(generalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.GENERALIZATION_SET: {
				GeneralizationSet generalizationSet = (GeneralizationSet)theEObject;
				T result = caseGeneralizationSet(generalizationSet);
				if (result == null) result = casePackageableElement(generalizationSet);
				if (result == null) result = caseNamedElement(generalizationSet);
				if (result == null) result = caseParameterableElement(generalizationSet);
				if (result == null) result = caseElement(generalizationSet);
				if (result == null) result = caseUMLBase(generalizationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseElement(image);
				if (result == null) result = caseUMLBase(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INTERFACE_REALIZATION: {
				InterfaceRealization interfaceRealization = (InterfaceRealization)theEObject;
				T result = caseInterfaceRealization(interfaceRealization);
				if (result == null) result = caseRealization(interfaceRealization);
				if (result == null) result = caseAbstraction(interfaceRealization);
				if (result == null) result = caseDependency(interfaceRealization);
				if (result == null) result = casePackageableElement(interfaceRealization);
				if (result == null) result = caseDirectedRelationship(interfaceRealization);
				if (result == null) result = caseNamedElement(interfaceRealization);
				if (result == null) result = caseParameterableElement(interfaceRealization);
				if (result == null) result = caseRelationship(interfaceRealization);
				if (result == null) result = caseElement(interfaceRealization);
				if (result == null) result = caseUMLBase(interfaceRealization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = caseClassifier(interface_);
				if (result == null) result = caseNamespace(interface_);
				if (result == null) result = caseRedefinableElement(interface_);
				if (result == null) result = caseType(interface_);
				if (result == null) result = caseTemplateableElement(interface_);
				if (result == null) result = casePackageableElement(interface_);
				if (result == null) result = caseNamedElement(interface_);
				if (result == null) result = caseParameterableElement(interface_);
				if (result == null) result = caseElement(interface_);
				if (result == null) result = caseUMLBase(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INCLUDE: {
				Include include = (Include)theEObject;
				T result = caseInclude(include);
				if (result == null) result = caseNamedElement(include);
				if (result == null) result = caseDirectedRelationship(include);
				if (result == null) result = caseRelationship(include);
				if (result == null) result = caseElement(include);
				if (result == null) result = caseUMLBase(include);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INSTANCE_SPECIFICATION: {
				InstanceSpecification instanceSpecification = (InstanceSpecification)theEObject;
				T result = caseInstanceSpecification(instanceSpecification);
				if (result == null) result = caseDeploymentTarget(instanceSpecification);
				if (result == null) result = casePackageableElement(instanceSpecification);
				if (result == null) result = caseDeployedArtifact(instanceSpecification);
				if (result == null) result = caseNamedElement(instanceSpecification);
				if (result == null) result = caseParameterableElement(instanceSpecification);
				if (result == null) result = caseElement(instanceSpecification);
				if (result == null) result = caseUMLBase(instanceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INSTANCE_VALUE: {
				InstanceValue instanceValue = (InstanceValue)theEObject;
				T result = caseInstanceValue(instanceValue);
				if (result == null) result = caseValueSpecification(instanceValue);
				if (result == null) result = casePackageableElement(instanceValue);
				if (result == null) result = caseTypedElement(instanceValue);
				if (result == null) result = caseNamedElement(instanceValue);
				if (result == null) result = caseParameterableElement(instanceValue);
				if (result == null) result = caseElement(instanceValue);
				if (result == null) result = caseUMLBase(instanceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INTERRUPTIBLE_ACTIVITY_REGION: {
				InterruptibleActivityRegion interruptibleActivityRegion = (InterruptibleActivityRegion)theEObject;
				T result = caseInterruptibleActivityRegion(interruptibleActivityRegion);
				if (result == null) result = caseActivityGroup(interruptibleActivityRegion);
				if (result == null) result = caseElement(interruptibleActivityRegion);
				if (result == null) result = caseUMLBase(interruptibleActivityRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INPUT_PIN: {
				InputPin inputPin = (InputPin)theEObject;
				T result = caseInputPin(inputPin);
				if (result == null) result = casePin(inputPin);
				if (result == null) result = caseObjectNode(inputPin);
				if (result == null) result = caseMultiplicityElement(inputPin);
				if (result == null) result = caseActivityNode(inputPin);
				if (result == null) result = caseTypedElement(inputPin);
				if (result == null) result = caseRedefinableElement(inputPin);
				if (result == null) result = caseNamedElement(inputPin);
				if (result == null) result = caseElement(inputPin);
				if (result == null) result = caseUMLBase(inputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INVOCATION_ACTION: {
				InvocationAction invocationAction = (InvocationAction)theEObject;
				T result = caseInvocationAction(invocationAction);
				if (result == null) result = caseAction(invocationAction);
				if (result == null) result = caseExecutableNode(invocationAction);
				if (result == null) result = caseActivityNode(invocationAction);
				if (result == null) result = caseRedefinableElement(invocationAction);
				if (result == null) result = caseNamedElement(invocationAction);
				if (result == null) result = caseElement(invocationAction);
				if (result == null) result = caseUMLBase(invocationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INITIAL_NODE: {
				InitialNode initialNode = (InitialNode)theEObject;
				T result = caseInitialNode(initialNode);
				if (result == null) result = caseControlNode(initialNode);
				if (result == null) result = caseActivityNode(initialNode);
				if (result == null) result = caseRedefinableElement(initialNode);
				if (result == null) result = caseNamedElement(initialNode);
				if (result == null) result = caseElement(initialNode);
				if (result == null) result = caseUMLBase(initialNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INTERACTION: {
				Interaction interaction = (Interaction)theEObject;
				T result = caseInteraction(interaction);
				if (result == null) result = caseBehavior(interaction);
				if (result == null) result = caseInteractionFragment(interaction);
				if (result == null) result = caseClass(interaction);
				if (result == null) result = caseEncapsulatedClassifier(interaction);
				if (result == null) result = caseBehavioredClassifier(interaction);
				if (result == null) result = caseStructuredClassifier(interaction);
				if (result == null) result = caseClassifier(interaction);
				if (result == null) result = caseNamespace(interaction);
				if (result == null) result = caseRedefinableElement(interaction);
				if (result == null) result = caseType(interaction);
				if (result == null) result = caseTemplateableElement(interaction);
				if (result == null) result = casePackageableElement(interaction);
				if (result == null) result = caseNamedElement(interaction);
				if (result == null) result = caseParameterableElement(interaction);
				if (result == null) result = caseElement(interaction);
				if (result == null) result = caseUMLBase(interaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INTERACTION_FRAGMENT: {
				InteractionFragment interactionFragment = (InteractionFragment)theEObject;
				T result = caseInteractionFragment(interactionFragment);
				if (result == null) result = caseNamedElement(interactionFragment);
				if (result == null) result = caseElement(interactionFragment);
				if (result == null) result = caseUMLBase(interactionFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INTERACTION_USE: {
				InteractionUse interactionUse = (InteractionUse)theEObject;
				T result = caseInteractionUse(interactionUse);
				if (result == null) result = caseInteractionFragment(interactionUse);
				if (result == null) result = caseNamedElement(interactionUse);
				if (result == null) result = caseElement(interactionUse);
				if (result == null) result = caseUMLBase(interactionUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INTERACTION_OPERAND: {
				InteractionOperand interactionOperand = (InteractionOperand)theEObject;
				T result = caseInteractionOperand(interactionOperand);
				if (result == null) result = caseNamespace(interactionOperand);
				if (result == null) result = caseInteractionFragment(interactionOperand);
				if (result == null) result = caseNamedElement(interactionOperand);
				if (result == null) result = caseElement(interactionOperand);
				if (result == null) result = caseUMLBase(interactionOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INTERACTION_CONSTRAINT: {
				InteractionConstraint interactionConstraint = (InteractionConstraint)theEObject;
				T result = caseInteractionConstraint(interactionConstraint);
				if (result == null) result = caseConstraint(interactionConstraint);
				if (result == null) result = casePackageableElement(interactionConstraint);
				if (result == null) result = caseNamedElement(interactionConstraint);
				if (result == null) result = caseParameterableElement(interactionConstraint);
				if (result == null) result = caseElement(interactionConstraint);
				if (result == null) result = caseUMLBase(interactionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INTERVAL: {
				Interval interval = (Interval)theEObject;
				T result = caseInterval(interval);
				if (result == null) result = caseValueSpecification(interval);
				if (result == null) result = casePackageableElement(interval);
				if (result == null) result = caseTypedElement(interval);
				if (result == null) result = caseNamedElement(interval);
				if (result == null) result = caseParameterableElement(interval);
				if (result == null) result = caseElement(interval);
				if (result == null) result = caseUMLBase(interval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INTERVAL_CONSTRAINT: {
				IntervalConstraint intervalConstraint = (IntervalConstraint)theEObject;
				T result = caseIntervalConstraint(intervalConstraint);
				if (result == null) result = caseConstraint(intervalConstraint);
				if (result == null) result = casePackageableElement(intervalConstraint);
				if (result == null) result = caseNamedElement(intervalConstraint);
				if (result == null) result = caseParameterableElement(intervalConstraint);
				if (result == null) result = caseElement(intervalConstraint);
				if (result == null) result = caseUMLBase(intervalConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INFORMATION_ITEM: {
				InformationItem informationItem = (InformationItem)theEObject;
				T result = caseInformationItem(informationItem);
				if (result == null) result = caseClassifier(informationItem);
				if (result == null) result = caseNamespace(informationItem);
				if (result == null) result = caseRedefinableElement(informationItem);
				if (result == null) result = caseType(informationItem);
				if (result == null) result = caseTemplateableElement(informationItem);
				if (result == null) result = casePackageableElement(informationItem);
				if (result == null) result = caseNamedElement(informationItem);
				if (result == null) result = caseParameterableElement(informationItem);
				if (result == null) result = caseElement(informationItem);
				if (result == null) result = caseUMLBase(informationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.INFORMATION_FLOW: {
				InformationFlow informationFlow = (InformationFlow)theEObject;
				T result = caseInformationFlow(informationFlow);
				if (result == null) result = casePackageableElement(informationFlow);
				if (result == null) result = caseDirectedRelationship(informationFlow);
				if (result == null) result = caseNamedElement(informationFlow);
				if (result == null) result = caseParameterableElement(informationFlow);
				if (result == null) result = caseRelationship(informationFlow);
				if (result == null) result = caseElement(informationFlow);
				if (result == null) result = caseUMLBase(informationFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.JOIN_NODE: {
				JoinNode joinNode = (JoinNode)theEObject;
				T result = caseJoinNode(joinNode);
				if (result == null) result = caseControlNode(joinNode);
				if (result == null) result = caseActivityNode(joinNode);
				if (result == null) result = caseRedefinableElement(joinNode);
				if (result == null) result = caseNamedElement(joinNode);
				if (result == null) result = caseElement(joinNode);
				if (result == null) result = caseUMLBase(joinNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.LITERAL_SPECIFICATION: {
				LiteralSpecification literalSpecification = (LiteralSpecification)theEObject;
				T result = caseLiteralSpecification(literalSpecification);
				if (result == null) result = caseValueSpecification(literalSpecification);
				if (result == null) result = casePackageableElement(literalSpecification);
				if (result == null) result = caseTypedElement(literalSpecification);
				if (result == null) result = caseNamedElement(literalSpecification);
				if (result == null) result = caseParameterableElement(literalSpecification);
				if (result == null) result = caseElement(literalSpecification);
				if (result == null) result = caseUMLBase(literalSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.LITERAL_INTEGER: {
				LiteralInteger literalInteger = (LiteralInteger)theEObject;
				T result = caseLiteralInteger(literalInteger);
				if (result == null) result = caseLiteralSpecification(literalInteger);
				if (result == null) result = caseValueSpecification(literalInteger);
				if (result == null) result = casePackageableElement(literalInteger);
				if (result == null) result = caseTypedElement(literalInteger);
				if (result == null) result = caseNamedElement(literalInteger);
				if (result == null) result = caseParameterableElement(literalInteger);
				if (result == null) result = caseElement(literalInteger);
				if (result == null) result = caseUMLBase(literalInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.LITERAL_STRING: {
				LiteralString literalString = (LiteralString)theEObject;
				T result = caseLiteralString(literalString);
				if (result == null) result = caseLiteralSpecification(literalString);
				if (result == null) result = caseValueSpecification(literalString);
				if (result == null) result = casePackageableElement(literalString);
				if (result == null) result = caseTypedElement(literalString);
				if (result == null) result = caseNamedElement(literalString);
				if (result == null) result = caseParameterableElement(literalString);
				if (result == null) result = caseElement(literalString);
				if (result == null) result = caseUMLBase(literalString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.LITERAL_BOOLEAN: {
				LiteralBoolean literalBoolean = (LiteralBoolean)theEObject;
				T result = caseLiteralBoolean(literalBoolean);
				if (result == null) result = caseLiteralSpecification(literalBoolean);
				if (result == null) result = caseValueSpecification(literalBoolean);
				if (result == null) result = casePackageableElement(literalBoolean);
				if (result == null) result = caseTypedElement(literalBoolean);
				if (result == null) result = caseNamedElement(literalBoolean);
				if (result == null) result = caseParameterableElement(literalBoolean);
				if (result == null) result = caseElement(literalBoolean);
				if (result == null) result = caseUMLBase(literalBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.LITERAL_NULL: {
				LiteralNull literalNull = (LiteralNull)theEObject;
				T result = caseLiteralNull(literalNull);
				if (result == null) result = caseLiteralSpecification(literalNull);
				if (result == null) result = caseValueSpecification(literalNull);
				if (result == null) result = casePackageableElement(literalNull);
				if (result == null) result = caseTypedElement(literalNull);
				if (result == null) result = caseNamedElement(literalNull);
				if (result == null) result = caseParameterableElement(literalNull);
				if (result == null) result = caseElement(literalNull);
				if (result == null) result = caseUMLBase(literalNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.LITERAL_UNLIMITED_NATURAL: {
				LiteralUnlimitedNatural literalUnlimitedNatural = (LiteralUnlimitedNatural)theEObject;
				T result = caseLiteralUnlimitedNatural(literalUnlimitedNatural);
				if (result == null) result = caseLiteralSpecification(literalUnlimitedNatural);
				if (result == null) result = caseValueSpecification(literalUnlimitedNatural);
				if (result == null) result = casePackageableElement(literalUnlimitedNatural);
				if (result == null) result = caseTypedElement(literalUnlimitedNatural);
				if (result == null) result = caseNamedElement(literalUnlimitedNatural);
				if (result == null) result = caseParameterableElement(literalUnlimitedNatural);
				if (result == null) result = caseElement(literalUnlimitedNatural);
				if (result == null) result = caseUMLBase(literalUnlimitedNatural);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.LIFELINE: {
				Lifeline lifeline = (Lifeline)theEObject;
				T result = caseLifeline(lifeline);
				if (result == null) result = caseNamedElement(lifeline);
				if (result == null) result = caseElement(lifeline);
				if (result == null) result = caseUMLBase(lifeline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.LINK_ACTION: {
				LinkAction linkAction = (LinkAction)theEObject;
				T result = caseLinkAction(linkAction);
				if (result == null) result = caseAction(linkAction);
				if (result == null) result = caseExecutableNode(linkAction);
				if (result == null) result = caseActivityNode(linkAction);
				if (result == null) result = caseRedefinableElement(linkAction);
				if (result == null) result = caseNamedElement(linkAction);
				if (result == null) result = caseElement(linkAction);
				if (result == null) result = caseUMLBase(linkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.LINK_END_DATA: {
				LinkEndData linkEndData = (LinkEndData)theEObject;
				T result = caseLinkEndData(linkEndData);
				if (result == null) result = caseElement(linkEndData);
				if (result == null) result = caseUMLBase(linkEndData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.LINK_END_CREATION_DATA: {
				LinkEndCreationData linkEndCreationData = (LinkEndCreationData)theEObject;
				T result = caseLinkEndCreationData(linkEndCreationData);
				if (result == null) result = caseLinkEndData(linkEndCreationData);
				if (result == null) result = caseElement(linkEndCreationData);
				if (result == null) result = caseUMLBase(linkEndCreationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.LINK_END_DESTRUCTION_DATA: {
				LinkEndDestructionData linkEndDestructionData = (LinkEndDestructionData)theEObject;
				T result = caseLinkEndDestructionData(linkEndDestructionData);
				if (result == null) result = caseLinkEndData(linkEndDestructionData);
				if (result == null) result = caseElement(linkEndDestructionData);
				if (result == null) result = caseUMLBase(linkEndDestructionData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.LOOP_NODE: {
				LoopNode loopNode = (LoopNode)theEObject;
				T result = caseLoopNode(loopNode);
				if (result == null) result = caseStructuredActivityNode(loopNode);
				if (result == null) result = caseAction(loopNode);
				if (result == null) result = caseNamespace(loopNode);
				if (result == null) result = caseActivityGroup(loopNode);
				if (result == null) result = caseExecutableNode(loopNode);
				if (result == null) result = caseActivityNode(loopNode);
				if (result == null) result = caseRedefinableElement(loopNode);
				if (result == null) result = caseNamedElement(loopNode);
				if (result == null) result = caseElement(loopNode);
				if (result == null) result = caseUMLBase(loopNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.MANIFESTATION: {
				Manifestation manifestation = (Manifestation)theEObject;
				T result = caseManifestation(manifestation);
				if (result == null) result = caseAbstraction(manifestation);
				if (result == null) result = caseDependency(manifestation);
				if (result == null) result = casePackageableElement(manifestation);
				if (result == null) result = caseDirectedRelationship(manifestation);
				if (result == null) result = caseNamedElement(manifestation);
				if (result == null) result = caseParameterableElement(manifestation);
				if (result == null) result = caseRelationship(manifestation);
				if (result == null) result = caseElement(manifestation);
				if (result == null) result = caseUMLBase(manifestation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseNamedElement(message);
				if (result == null) result = caseElement(message);
				if (result == null) result = caseUMLBase(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.MESSAGE_END: {
				MessageEnd messageEnd = (MessageEnd)theEObject;
				T result = caseMessageEnd(messageEnd);
				if (result == null) result = caseNamedElement(messageEnd);
				if (result == null) result = caseElement(messageEnd);
				if (result == null) result = caseUMLBase(messageEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.MESSAGE_EVENT: {
				MessageEvent messageEvent = (MessageEvent)theEObject;
				T result = caseMessageEvent(messageEvent);
				if (result == null) result = caseEvent(messageEvent);
				if (result == null) result = casePackageableElement(messageEvent);
				if (result == null) result = caseNamedElement(messageEvent);
				if (result == null) result = caseParameterableElement(messageEvent);
				if (result == null) result = caseElement(messageEvent);
				if (result == null) result = caseUMLBase(messageEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.MESSAGE_OCCURRENCE_SPECIFICATION: {
				MessageOccurrenceSpecification messageOccurrenceSpecification = (MessageOccurrenceSpecification)theEObject;
				T result = caseMessageOccurrenceSpecification(messageOccurrenceSpecification);
				if (result == null) result = caseOccurrenceSpecification(messageOccurrenceSpecification);
				if (result == null) result = caseMessageEnd(messageOccurrenceSpecification);
				if (result == null) result = caseInteractionFragment(messageOccurrenceSpecification);
				if (result == null) result = caseNamedElement(messageOccurrenceSpecification);
				if (result == null) result = caseElement(messageOccurrenceSpecification);
				if (result == null) result = caseUMLBase(messageOccurrenceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.MERGE_NODE: {
				MergeNode mergeNode = (MergeNode)theEObject;
				T result = caseMergeNode(mergeNode);
				if (result == null) result = caseControlNode(mergeNode);
				if (result == null) result = caseActivityNode(mergeNode);
				if (result == null) result = caseRedefinableElement(mergeNode);
				if (result == null) result = caseNamedElement(mergeNode);
				if (result == null) result = caseElement(mergeNode);
				if (result == null) result = caseUMLBase(mergeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = casePackage(model);
				if (result == null) result = caseNamespace(model);
				if (result == null) result = casePackageableElement(model);
				if (result == null) result = caseTemplateableElement(model);
				if (result == null) result = caseNamedElement(model);
				if (result == null) result = caseParameterableElement(model);
				if (result == null) result = caseElement(model);
				if (result == null) result = caseUMLBase(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.MULTIPLICITY_ELEMENT: {
				MultiplicityElement multiplicityElement = (MultiplicityElement)theEObject;
				T result = caseMultiplicityElement(multiplicityElement);
				if (result == null) result = caseElement(multiplicityElement);
				if (result == null) result = caseUMLBase(multiplicityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseElement(namedElement);
				if (result == null) result = caseUMLBase(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.NAMESPACE: {
				Namespace namespace = (Namespace)theEObject;
				T result = caseNamespace(namespace);
				if (result == null) result = caseNamedElement(namespace);
				if (result == null) result = caseElement(namespace);
				if (result == null) result = caseUMLBase(namespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseClass(node);
				if (result == null) result = caseDeploymentTarget(node);
				if (result == null) result = caseEncapsulatedClassifier(node);
				if (result == null) result = caseBehavioredClassifier(node);
				if (result == null) result = caseStructuredClassifier(node);
				if (result == null) result = caseClassifier(node);
				if (result == null) result = caseNamespace(node);
				if (result == null) result = caseRedefinableElement(node);
				if (result == null) result = caseType(node);
				if (result == null) result = caseTemplateableElement(node);
				if (result == null) result = casePackageableElement(node);
				if (result == null) result = caseNamedElement(node);
				if (result == null) result = caseParameterableElement(node);
				if (result == null) result = caseElement(node);
				if (result == null) result = caseUMLBase(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseBehavioralFeature(operation);
				if (result == null) result = caseParameterableElement(operation);
				if (result == null) result = caseTemplateableElement(operation);
				if (result == null) result = caseNamespace(operation);
				if (result == null) result = caseFeature(operation);
				if (result == null) result = caseRedefinableElement(operation);
				if (result == null) result = caseNamedElement(operation);
				if (result == null) result = caseElement(operation);
				if (result == null) result = caseUMLBase(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.OPERATION_TEMPLATE_PARAMETER: {
				OperationTemplateParameter operationTemplateParameter = (OperationTemplateParameter)theEObject;
				T result = caseOperationTemplateParameter(operationTemplateParameter);
				if (result == null) result = caseTemplateParameter(operationTemplateParameter);
				if (result == null) result = caseElement(operationTemplateParameter);
				if (result == null) result = caseUMLBase(operationTemplateParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.OPAQUE_ACTION: {
				OpaqueAction opaqueAction = (OpaqueAction)theEObject;
				T result = caseOpaqueAction(opaqueAction);
				if (result == null) result = caseAction(opaqueAction);
				if (result == null) result = caseExecutableNode(opaqueAction);
				if (result == null) result = caseActivityNode(opaqueAction);
				if (result == null) result = caseRedefinableElement(opaqueAction);
				if (result == null) result = caseNamedElement(opaqueAction);
				if (result == null) result = caseElement(opaqueAction);
				if (result == null) result = caseUMLBase(opaqueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.OPAQUE_BEHAVIOR: {
				OpaqueBehavior opaqueBehavior = (OpaqueBehavior)theEObject;
				T result = caseOpaqueBehavior(opaqueBehavior);
				if (result == null) result = caseBehavior(opaqueBehavior);
				if (result == null) result = caseClass(opaqueBehavior);
				if (result == null) result = caseEncapsulatedClassifier(opaqueBehavior);
				if (result == null) result = caseBehavioredClassifier(opaqueBehavior);
				if (result == null) result = caseStructuredClassifier(opaqueBehavior);
				if (result == null) result = caseClassifier(opaqueBehavior);
				if (result == null) result = caseNamespace(opaqueBehavior);
				if (result == null) result = caseRedefinableElement(opaqueBehavior);
				if (result == null) result = caseType(opaqueBehavior);
				if (result == null) result = caseTemplateableElement(opaqueBehavior);
				if (result == null) result = casePackageableElement(opaqueBehavior);
				if (result == null) result = caseNamedElement(opaqueBehavior);
				if (result == null) result = caseParameterableElement(opaqueBehavior);
				if (result == null) result = caseElement(opaqueBehavior);
				if (result == null) result = caseUMLBase(opaqueBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.OPAQUE_EXPRESSION: {
				OpaqueExpression opaqueExpression = (OpaqueExpression)theEObject;
				T result = caseOpaqueExpression(opaqueExpression);
				if (result == null) result = caseValueSpecification(opaqueExpression);
				if (result == null) result = casePackageableElement(opaqueExpression);
				if (result == null) result = caseTypedElement(opaqueExpression);
				if (result == null) result = caseNamedElement(opaqueExpression);
				if (result == null) result = caseParameterableElement(opaqueExpression);
				if (result == null) result = caseElement(opaqueExpression);
				if (result == null) result = caseUMLBase(opaqueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.OCCURRENCE_SPECIFICATION: {
				OccurrenceSpecification occurrenceSpecification = (OccurrenceSpecification)theEObject;
				T result = caseOccurrenceSpecification(occurrenceSpecification);
				if (result == null) result = caseInteractionFragment(occurrenceSpecification);
				if (result == null) result = caseNamedElement(occurrenceSpecification);
				if (result == null) result = caseElement(occurrenceSpecification);
				if (result == null) result = caseUMLBase(occurrenceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.OBJECT_FLOW: {
				ObjectFlow objectFlow = (ObjectFlow)theEObject;
				T result = caseObjectFlow(objectFlow);
				if (result == null) result = caseActivityEdge(objectFlow);
				if (result == null) result = caseRedefinableElement(objectFlow);
				if (result == null) result = caseNamedElement(objectFlow);
				if (result == null) result = caseElement(objectFlow);
				if (result == null) result = caseUMLBase(objectFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.OBSERVATION: {
				Observation observation = (Observation)theEObject;
				T result = caseObservation(observation);
				if (result == null) result = casePackageableElement(observation);
				if (result == null) result = caseNamedElement(observation);
				if (result == null) result = caseParameterableElement(observation);
				if (result == null) result = caseElement(observation);
				if (result == null) result = caseUMLBase(observation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.OBJECT_NODE: {
				ObjectNode objectNode = (ObjectNode)theEObject;
				T result = caseObjectNode(objectNode);
				if (result == null) result = caseActivityNode(objectNode);
				if (result == null) result = caseTypedElement(objectNode);
				if (result == null) result = caseRedefinableElement(objectNode);
				if (result == null) result = caseNamedElement(objectNode);
				if (result == null) result = caseElement(objectNode);
				if (result == null) result = caseUMLBase(objectNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.OUTPUT_PIN: {
				OutputPin outputPin = (OutputPin)theEObject;
				T result = caseOutputPin(outputPin);
				if (result == null) result = casePin(outputPin);
				if (result == null) result = caseObjectNode(outputPin);
				if (result == null) result = caseMultiplicityElement(outputPin);
				if (result == null) result = caseActivityNode(outputPin);
				if (result == null) result = caseTypedElement(outputPin);
				if (result == null) result = caseRedefinableElement(outputPin);
				if (result == null) result = caseNamedElement(outputPin);
				if (result == null) result = caseElement(outputPin);
				if (result == null) result = caseUMLBase(outputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseConnectableElement(parameter);
				if (result == null) result = caseMultiplicityElement(parameter);
				if (result == null) result = caseTypedElement(parameter);
				if (result == null) result = caseParameterableElement(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = caseElement(parameter);
				if (result == null) result = caseUMLBase(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PARAMETERABLE_ELEMENT: {
				ParameterableElement parameterableElement = (ParameterableElement)theEObject;
				T result = caseParameterableElement(parameterableElement);
				if (result == null) result = caseElement(parameterableElement);
				if (result == null) result = caseUMLBase(parameterableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PACKAGE: {
				org.emftrace.metamodel.UMLModel.Package package_ = (org.emftrace.metamodel.UMLModel.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseNamespace(package_);
				if (result == null) result = casePackageableElement(package_);
				if (result == null) result = caseTemplateableElement(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = caseParameterableElement(package_);
				if (result == null) result = caseElement(package_);
				if (result == null) result = caseUMLBase(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PACKAGEABLE_ELEMENT: {
				PackageableElement packageableElement = (PackageableElement)theEObject;
				T result = casePackageableElement(packageableElement);
				if (result == null) result = caseNamedElement(packageableElement);
				if (result == null) result = caseParameterableElement(packageableElement);
				if (result == null) result = caseElement(packageableElement);
				if (result == null) result = caseUMLBase(packageableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PACKAGE_IMPORT: {
				PackageImport packageImport = (PackageImport)theEObject;
				T result = casePackageImport(packageImport);
				if (result == null) result = caseDirectedRelationship(packageImport);
				if (result == null) result = caseRelationship(packageImport);
				if (result == null) result = caseElement(packageImport);
				if (result == null) result = caseUMLBase(packageImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PACKAGE_MERGE: {
				PackageMerge packageMerge = (PackageMerge)theEObject;
				T result = casePackageMerge(packageMerge);
				if (result == null) result = caseDirectedRelationship(packageMerge);
				if (result == null) result = caseRelationship(packageMerge);
				if (result == null) result = caseElement(packageMerge);
				if (result == null) result = caseUMLBase(packageMerge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PARAMETER_SET: {
				ParameterSet parameterSet = (ParameterSet)theEObject;
				T result = caseParameterSet(parameterSet);
				if (result == null) result = caseNamedElement(parameterSet);
				if (result == null) result = caseElement(parameterSet);
				if (result == null) result = caseUMLBase(parameterSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PART_DECOMPOSITION: {
				PartDecomposition partDecomposition = (PartDecomposition)theEObject;
				T result = casePartDecomposition(partDecomposition);
				if (result == null) result = caseInteractionUse(partDecomposition);
				if (result == null) result = caseInteractionFragment(partDecomposition);
				if (result == null) result = caseNamedElement(partDecomposition);
				if (result == null) result = caseElement(partDecomposition);
				if (result == null) result = caseUMLBase(partDecomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PIN: {
				Pin pin = (Pin)theEObject;
				T result = casePin(pin);
				if (result == null) result = caseObjectNode(pin);
				if (result == null) result = caseMultiplicityElement(pin);
				if (result == null) result = caseActivityNode(pin);
				if (result == null) result = caseTypedElement(pin);
				if (result == null) result = caseRedefinableElement(pin);
				if (result == null) result = caseNamedElement(pin);
				if (result == null) result = caseElement(pin);
				if (result == null) result = caseUMLBase(pin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseDataType(primitiveType);
				if (result == null) result = caseClassifier(primitiveType);
				if (result == null) result = caseNamespace(primitiveType);
				if (result == null) result = caseRedefinableElement(primitiveType);
				if (result == null) result = caseType(primitiveType);
				if (result == null) result = caseTemplateableElement(primitiveType);
				if (result == null) result = casePackageableElement(primitiveType);
				if (result == null) result = caseNamedElement(primitiveType);
				if (result == null) result = caseParameterableElement(primitiveType);
				if (result == null) result = caseElement(primitiveType);
				if (result == null) result = caseUMLBase(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PROTOCOL_TRANSITION: {
				ProtocolTransition protocolTransition = (ProtocolTransition)theEObject;
				T result = caseProtocolTransition(protocolTransition);
				if (result == null) result = caseTransition(protocolTransition);
				if (result == null) result = caseNamespace(protocolTransition);
				if (result == null) result = caseRedefinableElement(protocolTransition);
				if (result == null) result = caseNamedElement(protocolTransition);
				if (result == null) result = caseElement(protocolTransition);
				if (result == null) result = caseUMLBase(protocolTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PROFILE: {
				Profile profile = (Profile)theEObject;
				T result = caseProfile(profile);
				if (result == null) result = casePackage(profile);
				if (result == null) result = caseNamespace(profile);
				if (result == null) result = casePackageableElement(profile);
				if (result == null) result = caseTemplateableElement(profile);
				if (result == null) result = caseNamedElement(profile);
				if (result == null) result = caseParameterableElement(profile);
				if (result == null) result = caseElement(profile);
				if (result == null) result = caseUMLBase(profile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PROFILE_APPLICATION: {
				ProfileApplication profileApplication = (ProfileApplication)theEObject;
				T result = caseProfileApplication(profileApplication);
				if (result == null) result = caseDirectedRelationship(profileApplication);
				if (result == null) result = caseRelationship(profileApplication);
				if (result == null) result = caseElement(profileApplication);
				if (result == null) result = caseUMLBase(profileApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseStructuralFeature(property);
				if (result == null) result = caseConnectableElement(property);
				if (result == null) result = caseDeploymentTarget(property);
				if (result == null) result = caseTemplateableElement(property);
				if (result == null) result = caseFeature(property);
				if (result == null) result = caseTypedElement(property);
				if (result == null) result = caseMultiplicityElement(property);
				if (result == null) result = caseParameterableElement(property);
				if (result == null) result = caseRedefinableElement(property);
				if (result == null) result = caseNamedElement(property);
				if (result == null) result = caseElement(property);
				if (result == null) result = caseUMLBase(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PROTOCOL_STATE_MACHINE: {
				ProtocolStateMachine protocolStateMachine = (ProtocolStateMachine)theEObject;
				T result = caseProtocolStateMachine(protocolStateMachine);
				if (result == null) result = caseStateMachine(protocolStateMachine);
				if (result == null) result = caseBehavior(protocolStateMachine);
				if (result == null) result = caseClass(protocolStateMachine);
				if (result == null) result = caseEncapsulatedClassifier(protocolStateMachine);
				if (result == null) result = caseBehavioredClassifier(protocolStateMachine);
				if (result == null) result = caseStructuredClassifier(protocolStateMachine);
				if (result == null) result = caseClassifier(protocolStateMachine);
				if (result == null) result = caseNamespace(protocolStateMachine);
				if (result == null) result = caseRedefinableElement(protocolStateMachine);
				if (result == null) result = caseType(protocolStateMachine);
				if (result == null) result = caseTemplateableElement(protocolStateMachine);
				if (result == null) result = casePackageableElement(protocolStateMachine);
				if (result == null) result = caseNamedElement(protocolStateMachine);
				if (result == null) result = caseParameterableElement(protocolStateMachine);
				if (result == null) result = caseElement(protocolStateMachine);
				if (result == null) result = caseUMLBase(protocolStateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PROTOCOL_CONFORMANCE: {
				ProtocolConformance protocolConformance = (ProtocolConformance)theEObject;
				T result = caseProtocolConformance(protocolConformance);
				if (result == null) result = caseDirectedRelationship(protocolConformance);
				if (result == null) result = caseRelationship(protocolConformance);
				if (result == null) result = caseElement(protocolConformance);
				if (result == null) result = caseUMLBase(protocolConformance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseProperty(port);
				if (result == null) result = caseStructuralFeature(port);
				if (result == null) result = caseConnectableElement(port);
				if (result == null) result = caseDeploymentTarget(port);
				if (result == null) result = caseTemplateableElement(port);
				if (result == null) result = caseFeature(port);
				if (result == null) result = caseTypedElement(port);
				if (result == null) result = caseMultiplicityElement(port);
				if (result == null) result = caseParameterableElement(port);
				if (result == null) result = caseRedefinableElement(port);
				if (result == null) result = caseNamedElement(port);
				if (result == null) result = caseElement(port);
				if (result == null) result = caseUMLBase(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.PSEUDOSTATE: {
				Pseudostate pseudostate = (Pseudostate)theEObject;
				T result = casePseudostate(pseudostate);
				if (result == null) result = caseVertex(pseudostate);
				if (result == null) result = caseNamedElement(pseudostate);
				if (result == null) result = caseElement(pseudostate);
				if (result == null) result = caseUMLBase(pseudostate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.QUALIFIER_VALUE: {
				QualifierValue qualifierValue = (QualifierValue)theEObject;
				T result = caseQualifierValue(qualifierValue);
				if (result == null) result = caseElement(qualifierValue);
				if (result == null) result = caseUMLBase(qualifierValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.RAISE_EXCEPTION_ACTION: {
				RaiseExceptionAction raiseExceptionAction = (RaiseExceptionAction)theEObject;
				T result = caseRaiseExceptionAction(raiseExceptionAction);
				if (result == null) result = caseAction(raiseExceptionAction);
				if (result == null) result = caseExecutableNode(raiseExceptionAction);
				if (result == null) result = caseActivityNode(raiseExceptionAction);
				if (result == null) result = caseRedefinableElement(raiseExceptionAction);
				if (result == null) result = caseNamedElement(raiseExceptionAction);
				if (result == null) result = caseElement(raiseExceptionAction);
				if (result == null) result = caseUMLBase(raiseExceptionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.RECEIVE_OPERATION_EVENT: {
				ReceiveOperationEvent receiveOperationEvent = (ReceiveOperationEvent)theEObject;
				T result = caseReceiveOperationEvent(receiveOperationEvent);
				if (result == null) result = caseMessageEvent(receiveOperationEvent);
				if (result == null) result = caseEvent(receiveOperationEvent);
				if (result == null) result = casePackageableElement(receiveOperationEvent);
				if (result == null) result = caseNamedElement(receiveOperationEvent);
				if (result == null) result = caseParameterableElement(receiveOperationEvent);
				if (result == null) result = caseElement(receiveOperationEvent);
				if (result == null) result = caseUMLBase(receiveOperationEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.RECEIVE_SIGNAL_EVENT: {
				ReceiveSignalEvent receiveSignalEvent = (ReceiveSignalEvent)theEObject;
				T result = caseReceiveSignalEvent(receiveSignalEvent);
				if (result == null) result = caseMessageEvent(receiveSignalEvent);
				if (result == null) result = caseEvent(receiveSignalEvent);
				if (result == null) result = casePackageableElement(receiveSignalEvent);
				if (result == null) result = caseNamedElement(receiveSignalEvent);
				if (result == null) result = caseParameterableElement(receiveSignalEvent);
				if (result == null) result = caseElement(receiveSignalEvent);
				if (result == null) result = caseUMLBase(receiveSignalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.RECLASSIFY_OBJECT_ACTION: {
				ReclassifyObjectAction reclassifyObjectAction = (ReclassifyObjectAction)theEObject;
				T result = caseReclassifyObjectAction(reclassifyObjectAction);
				if (result == null) result = caseAction(reclassifyObjectAction);
				if (result == null) result = caseExecutableNode(reclassifyObjectAction);
				if (result == null) result = caseActivityNode(reclassifyObjectAction);
				if (result == null) result = caseRedefinableElement(reclassifyObjectAction);
				if (result == null) result = caseNamedElement(reclassifyObjectAction);
				if (result == null) result = caseElement(reclassifyObjectAction);
				if (result == null) result = caseUMLBase(reclassifyObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION: {
				ReadIsClassifiedObjectAction readIsClassifiedObjectAction = (ReadIsClassifiedObjectAction)theEObject;
				T result = caseReadIsClassifiedObjectAction(readIsClassifiedObjectAction);
				if (result == null) result = caseAction(readIsClassifiedObjectAction);
				if (result == null) result = caseExecutableNode(readIsClassifiedObjectAction);
				if (result == null) result = caseActivityNode(readIsClassifiedObjectAction);
				if (result == null) result = caseRedefinableElement(readIsClassifiedObjectAction);
				if (result == null) result = caseNamedElement(readIsClassifiedObjectAction);
				if (result == null) result = caseElement(readIsClassifiedObjectAction);
				if (result == null) result = caseUMLBase(readIsClassifiedObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.READ_EXTENT_ACTION: {
				ReadExtentAction readExtentAction = (ReadExtentAction)theEObject;
				T result = caseReadExtentAction(readExtentAction);
				if (result == null) result = caseAction(readExtentAction);
				if (result == null) result = caseExecutableNode(readExtentAction);
				if (result == null) result = caseActivityNode(readExtentAction);
				if (result == null) result = caseRedefinableElement(readExtentAction);
				if (result == null) result = caseNamedElement(readExtentAction);
				if (result == null) result = caseElement(readExtentAction);
				if (result == null) result = caseUMLBase(readExtentAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.READ_LINK_ACTION: {
				ReadLinkAction readLinkAction = (ReadLinkAction)theEObject;
				T result = caseReadLinkAction(readLinkAction);
				if (result == null) result = caseLinkAction(readLinkAction);
				if (result == null) result = caseAction(readLinkAction);
				if (result == null) result = caseExecutableNode(readLinkAction);
				if (result == null) result = caseActivityNode(readLinkAction);
				if (result == null) result = caseRedefinableElement(readLinkAction);
				if (result == null) result = caseNamedElement(readLinkAction);
				if (result == null) result = caseElement(readLinkAction);
				if (result == null) result = caseUMLBase(readLinkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.READ_LINK_OBJECT_END_ACTION: {
				ReadLinkObjectEndAction readLinkObjectEndAction = (ReadLinkObjectEndAction)theEObject;
				T result = caseReadLinkObjectEndAction(readLinkObjectEndAction);
				if (result == null) result = caseAction(readLinkObjectEndAction);
				if (result == null) result = caseExecutableNode(readLinkObjectEndAction);
				if (result == null) result = caseActivityNode(readLinkObjectEndAction);
				if (result == null) result = caseRedefinableElement(readLinkObjectEndAction);
				if (result == null) result = caseNamedElement(readLinkObjectEndAction);
				if (result == null) result = caseElement(readLinkObjectEndAction);
				if (result == null) result = caseUMLBase(readLinkObjectEndAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION: {
				ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction = (ReadLinkObjectEndQualifierAction)theEObject;
				T result = caseReadLinkObjectEndQualifierAction(readLinkObjectEndQualifierAction);
				if (result == null) result = caseAction(readLinkObjectEndQualifierAction);
				if (result == null) result = caseExecutableNode(readLinkObjectEndQualifierAction);
				if (result == null) result = caseActivityNode(readLinkObjectEndQualifierAction);
				if (result == null) result = caseRedefinableElement(readLinkObjectEndQualifierAction);
				if (result == null) result = caseNamedElement(readLinkObjectEndQualifierAction);
				if (result == null) result = caseElement(readLinkObjectEndQualifierAction);
				if (result == null) result = caseUMLBase(readLinkObjectEndQualifierAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.READ_SELF_ACTION: {
				ReadSelfAction readSelfAction = (ReadSelfAction)theEObject;
				T result = caseReadSelfAction(readSelfAction);
				if (result == null) result = caseAction(readSelfAction);
				if (result == null) result = caseExecutableNode(readSelfAction);
				if (result == null) result = caseActivityNode(readSelfAction);
				if (result == null) result = caseRedefinableElement(readSelfAction);
				if (result == null) result = caseNamedElement(readSelfAction);
				if (result == null) result = caseElement(readSelfAction);
				if (result == null) result = caseUMLBase(readSelfAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.READ_STRUCTURAL_FEATURE_ACTION: {
				ReadStructuralFeatureAction readStructuralFeatureAction = (ReadStructuralFeatureAction)theEObject;
				T result = caseReadStructuralFeatureAction(readStructuralFeatureAction);
				if (result == null) result = caseStructuralFeatureAction(readStructuralFeatureAction);
				if (result == null) result = caseAction(readStructuralFeatureAction);
				if (result == null) result = caseExecutableNode(readStructuralFeatureAction);
				if (result == null) result = caseActivityNode(readStructuralFeatureAction);
				if (result == null) result = caseRedefinableElement(readStructuralFeatureAction);
				if (result == null) result = caseNamedElement(readStructuralFeatureAction);
				if (result == null) result = caseElement(readStructuralFeatureAction);
				if (result == null) result = caseUMLBase(readStructuralFeatureAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.READ_VARIABLE_ACTION: {
				ReadVariableAction readVariableAction = (ReadVariableAction)theEObject;
				T result = caseReadVariableAction(readVariableAction);
				if (result == null) result = caseVariableAction(readVariableAction);
				if (result == null) result = caseAction(readVariableAction);
				if (result == null) result = caseExecutableNode(readVariableAction);
				if (result == null) result = caseActivityNode(readVariableAction);
				if (result == null) result = caseRedefinableElement(readVariableAction);
				if (result == null) result = caseNamedElement(readVariableAction);
				if (result == null) result = caseElement(readVariableAction);
				if (result == null) result = caseUMLBase(readVariableAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE: {
				RedefinableTemplateSignature redefinableTemplateSignature = (RedefinableTemplateSignature)theEObject;
				T result = caseRedefinableTemplateSignature(redefinableTemplateSignature);
				if (result == null) result = caseRedefinableElement(redefinableTemplateSignature);
				if (result == null) result = caseTemplateSignature(redefinableTemplateSignature);
				if (result == null) result = caseNamedElement(redefinableTemplateSignature);
				if (result == null) result = caseElement(redefinableTemplateSignature);
				if (result == null) result = caseUMLBase(redefinableTemplateSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.REDUCE_ACTION: {
				ReduceAction reduceAction = (ReduceAction)theEObject;
				T result = caseReduceAction(reduceAction);
				if (result == null) result = caseAction(reduceAction);
				if (result == null) result = caseExecutableNode(reduceAction);
				if (result == null) result = caseActivityNode(reduceAction);
				if (result == null) result = caseRedefinableElement(reduceAction);
				if (result == null) result = caseNamedElement(reduceAction);
				if (result == null) result = caseElement(reduceAction);
				if (result == null) result = caseUMLBase(reduceAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.REPLY_ACTION: {
				ReplyAction replyAction = (ReplyAction)theEObject;
				T result = caseReplyAction(replyAction);
				if (result == null) result = caseAction(replyAction);
				if (result == null) result = caseExecutableNode(replyAction);
				if (result == null) result = caseActivityNode(replyAction);
				if (result == null) result = caseRedefinableElement(replyAction);
				if (result == null) result = caseNamedElement(replyAction);
				if (result == null) result = caseElement(replyAction);
				if (result == null) result = caseUMLBase(replyAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.REMOVE_VARIABLE_VALUE_ACTION: {
				RemoveVariableValueAction removeVariableValueAction = (RemoveVariableValueAction)theEObject;
				T result = caseRemoveVariableValueAction(removeVariableValueAction);
				if (result == null) result = caseWriteVariableAction(removeVariableValueAction);
				if (result == null) result = caseVariableAction(removeVariableValueAction);
				if (result == null) result = caseAction(removeVariableValueAction);
				if (result == null) result = caseExecutableNode(removeVariableValueAction);
				if (result == null) result = caseActivityNode(removeVariableValueAction);
				if (result == null) result = caseRedefinableElement(removeVariableValueAction);
				if (result == null) result = caseNamedElement(removeVariableValueAction);
				if (result == null) result = caseElement(removeVariableValueAction);
				if (result == null) result = caseUMLBase(removeVariableValueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION: {
				RemoveStructuralFeatureValueAction removeStructuralFeatureValueAction = (RemoveStructuralFeatureValueAction)theEObject;
				T result = caseRemoveStructuralFeatureValueAction(removeStructuralFeatureValueAction);
				if (result == null) result = caseWriteStructuralFeatureAction(removeStructuralFeatureValueAction);
				if (result == null) result = caseStructuralFeatureAction(removeStructuralFeatureValueAction);
				if (result == null) result = caseAction(removeStructuralFeatureValueAction);
				if (result == null) result = caseExecutableNode(removeStructuralFeatureValueAction);
				if (result == null) result = caseActivityNode(removeStructuralFeatureValueAction);
				if (result == null) result = caseRedefinableElement(removeStructuralFeatureValueAction);
				if (result == null) result = caseNamedElement(removeStructuralFeatureValueAction);
				if (result == null) result = caseElement(removeStructuralFeatureValueAction);
				if (result == null) result = caseUMLBase(removeStructuralFeatureValueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.REDEFINABLE_ELEMENT: {
				RedefinableElement redefinableElement = (RedefinableElement)theEObject;
				T result = caseRedefinableElement(redefinableElement);
				if (result == null) result = caseNamedElement(redefinableElement);
				if (result == null) result = caseElement(redefinableElement);
				if (result == null) result = caseUMLBase(redefinableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseElement(relationship);
				if (result == null) result = caseUMLBase(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.REALIZATION: {
				Realization realization = (Realization)theEObject;
				T result = caseRealization(realization);
				if (result == null) result = caseAbstraction(realization);
				if (result == null) result = caseDependency(realization);
				if (result == null) result = casePackageableElement(realization);
				if (result == null) result = caseDirectedRelationship(realization);
				if (result == null) result = caseNamedElement(realization);
				if (result == null) result = caseParameterableElement(realization);
				if (result == null) result = caseRelationship(realization);
				if (result == null) result = caseElement(realization);
				if (result == null) result = caseUMLBase(realization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.RECEPTION: {
				Reception reception = (Reception)theEObject;
				T result = caseReception(reception);
				if (result == null) result = caseBehavioralFeature(reception);
				if (result == null) result = caseNamespace(reception);
				if (result == null) result = caseFeature(reception);
				if (result == null) result = caseRedefinableElement(reception);
				if (result == null) result = caseNamedElement(reception);
				if (result == null) result = caseElement(reception);
				if (result == null) result = caseUMLBase(reception);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.REGION: {
				Region region = (Region)theEObject;
				T result = caseRegion(region);
				if (result == null) result = caseNamespace(region);
				if (result == null) result = caseRedefinableElement(region);
				if (result == null) result = caseNamedElement(region);
				if (result == null) result = caseElement(region);
				if (result == null) result = caseUMLBase(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.SEND_SIGNAL_ACTION: {
				SendSignalAction sendSignalAction = (SendSignalAction)theEObject;
				T result = caseSendSignalAction(sendSignalAction);
				if (result == null) result = caseInvocationAction(sendSignalAction);
				if (result == null) result = caseAction(sendSignalAction);
				if (result == null) result = caseExecutableNode(sendSignalAction);
				if (result == null) result = caseActivityNode(sendSignalAction);
				if (result == null) result = caseRedefinableElement(sendSignalAction);
				if (result == null) result = caseNamedElement(sendSignalAction);
				if (result == null) result = caseElement(sendSignalAction);
				if (result == null) result = caseUMLBase(sendSignalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.SEND_SIGNAL_EVENT: {
				SendSignalEvent sendSignalEvent = (SendSignalEvent)theEObject;
				T result = caseSendSignalEvent(sendSignalEvent);
				if (result == null) result = caseMessageEvent(sendSignalEvent);
				if (result == null) result = caseEvent(sendSignalEvent);
				if (result == null) result = casePackageableElement(sendSignalEvent);
				if (result == null) result = caseNamedElement(sendSignalEvent);
				if (result == null) result = caseParameterableElement(sendSignalEvent);
				if (result == null) result = caseElement(sendSignalEvent);
				if (result == null) result = caseUMLBase(sendSignalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.SEQUENCE_NODE: {
				SequenceNode sequenceNode = (SequenceNode)theEObject;
				T result = caseSequenceNode(sequenceNode);
				if (result == null) result = caseStructuredActivityNode(sequenceNode);
				if (result == null) result = caseAction(sequenceNode);
				if (result == null) result = caseNamespace(sequenceNode);
				if (result == null) result = caseActivityGroup(sequenceNode);
				if (result == null) result = caseExecutableNode(sequenceNode);
				if (result == null) result = caseActivityNode(sequenceNode);
				if (result == null) result = caseRedefinableElement(sequenceNode);
				if (result == null) result = caseNamedElement(sequenceNode);
				if (result == null) result = caseElement(sequenceNode);
				if (result == null) result = caseUMLBase(sequenceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.SIGNAL_EVENT: {
				SignalEvent signalEvent = (SignalEvent)theEObject;
				T result = caseSignalEvent(signalEvent);
				if (result == null) result = caseMessageEvent(signalEvent);
				if (result == null) result = caseEvent(signalEvent);
				if (result == null) result = casePackageableElement(signalEvent);
				if (result == null) result = caseNamedElement(signalEvent);
				if (result == null) result = caseParameterableElement(signalEvent);
				if (result == null) result = caseElement(signalEvent);
				if (result == null) result = caseUMLBase(signalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.SLOT: {
				Slot slot = (Slot)theEObject;
				T result = caseSlot(slot);
				if (result == null) result = caseElement(slot);
				if (result == null) result = caseUMLBase(slot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.STATE_INVARIANT: {
				StateInvariant stateInvariant = (StateInvariant)theEObject;
				T result = caseStateInvariant(stateInvariant);
				if (result == null) result = caseInteractionFragment(stateInvariant);
				if (result == null) result = caseNamedElement(stateInvariant);
				if (result == null) result = caseElement(stateInvariant);
				if (result == null) result = caseUMLBase(stateInvariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.START_CLASSIFIER_BEHAVIOR_ACTION: {
				StartClassifierBehaviorAction startClassifierBehaviorAction = (StartClassifierBehaviorAction)theEObject;
				T result = caseStartClassifierBehaviorAction(startClassifierBehaviorAction);
				if (result == null) result = caseAction(startClassifierBehaviorAction);
				if (result == null) result = caseExecutableNode(startClassifierBehaviorAction);
				if (result == null) result = caseActivityNode(startClassifierBehaviorAction);
				if (result == null) result = caseRedefinableElement(startClassifierBehaviorAction);
				if (result == null) result = caseNamedElement(startClassifierBehaviorAction);
				if (result == null) result = caseElement(startClassifierBehaviorAction);
				if (result == null) result = caseUMLBase(startClassifierBehaviorAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.SEND_OBJECT_ACTION: {
				SendObjectAction sendObjectAction = (SendObjectAction)theEObject;
				T result = caseSendObjectAction(sendObjectAction);
				if (result == null) result = caseInvocationAction(sendObjectAction);
				if (result == null) result = caseAction(sendObjectAction);
				if (result == null) result = caseExecutableNode(sendObjectAction);
				if (result == null) result = caseActivityNode(sendObjectAction);
				if (result == null) result = caseRedefinableElement(sendObjectAction);
				if (result == null) result = caseNamedElement(sendObjectAction);
				if (result == null) result = caseElement(sendObjectAction);
				if (result == null) result = caseUMLBase(sendObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.STRING_EXPRESSION: {
				StringExpression stringExpression = (StringExpression)theEObject;
				T result = caseStringExpression(stringExpression);
				if (result == null) result = caseExpression(stringExpression);
				if (result == null) result = caseTemplateableElement(stringExpression);
				if (result == null) result = caseValueSpecification(stringExpression);
				if (result == null) result = casePackageableElement(stringExpression);
				if (result == null) result = caseTypedElement(stringExpression);
				if (result == null) result = caseNamedElement(stringExpression);
				if (result == null) result = caseParameterableElement(stringExpression);
				if (result == null) result = caseElement(stringExpression);
				if (result == null) result = caseUMLBase(stringExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.STRUCTURED_ACTIVITY_NODE: {
				StructuredActivityNode structuredActivityNode = (StructuredActivityNode)theEObject;
				T result = caseStructuredActivityNode(structuredActivityNode);
				if (result == null) result = caseAction(structuredActivityNode);
				if (result == null) result = caseNamespace(structuredActivityNode);
				if (result == null) result = caseActivityGroup(structuredActivityNode);
				if (result == null) result = caseExecutableNode(structuredActivityNode);
				if (result == null) result = caseActivityNode(structuredActivityNode);
				if (result == null) result = caseRedefinableElement(structuredActivityNode);
				if (result == null) result = caseNamedElement(structuredActivityNode);
				if (result == null) result = caseElement(structuredActivityNode);
				if (result == null) result = caseUMLBase(structuredActivityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.STRUCTURAL_FEATURE: {
				StructuralFeature structuralFeature = (StructuralFeature)theEObject;
				T result = caseStructuralFeature(structuralFeature);
				if (result == null) result = caseFeature(structuralFeature);
				if (result == null) result = caseTypedElement(structuralFeature);
				if (result == null) result = caseMultiplicityElement(structuralFeature);
				if (result == null) result = caseRedefinableElement(structuralFeature);
				if (result == null) result = caseNamedElement(structuralFeature);
				if (result == null) result = caseElement(structuralFeature);
				if (result == null) result = caseUMLBase(structuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.STRUCTURAL_FEATURE_ACTION: {
				StructuralFeatureAction structuralFeatureAction = (StructuralFeatureAction)theEObject;
				T result = caseStructuralFeatureAction(structuralFeatureAction);
				if (result == null) result = caseAction(structuralFeatureAction);
				if (result == null) result = caseExecutableNode(structuralFeatureAction);
				if (result == null) result = caseActivityNode(structuralFeatureAction);
				if (result == null) result = caseRedefinableElement(structuralFeatureAction);
				if (result == null) result = caseNamedElement(structuralFeatureAction);
				if (result == null) result = caseElement(structuralFeatureAction);
				if (result == null) result = caseUMLBase(structuralFeatureAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.SUBSTITUTION: {
				Substitution substitution = (Substitution)theEObject;
				T result = caseSubstitution(substitution);
				if (result == null) result = caseRealization(substitution);
				if (result == null) result = caseAbstraction(substitution);
				if (result == null) result = caseDependency(substitution);
				if (result == null) result = casePackageableElement(substitution);
				if (result == null) result = caseDirectedRelationship(substitution);
				if (result == null) result = caseNamedElement(substitution);
				if (result == null) result = caseParameterableElement(substitution);
				if (result == null) result = caseRelationship(substitution);
				if (result == null) result = caseElement(substitution);
				if (result == null) result = caseUMLBase(substitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.SIGNAL: {
				Signal signal = (Signal)theEObject;
				T result = caseSignal(signal);
				if (result == null) result = caseClassifier(signal);
				if (result == null) result = caseNamespace(signal);
				if (result == null) result = caseRedefinableElement(signal);
				if (result == null) result = caseType(signal);
				if (result == null) result = caseTemplateableElement(signal);
				if (result == null) result = casePackageableElement(signal);
				if (result == null) result = caseNamedElement(signal);
				if (result == null) result = caseParameterableElement(signal);
				if (result == null) result = caseElement(signal);
				if (result == null) result = caseUMLBase(signal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseNamespace(state);
				if (result == null) result = caseRedefinableElement(state);
				if (result == null) result = caseVertex(state);
				if (result == null) result = caseNamedElement(state);
				if (result == null) result = caseElement(state);
				if (result == null) result = caseUMLBase(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.STATE_MACHINE: {
				StateMachine stateMachine = (StateMachine)theEObject;
				T result = caseStateMachine(stateMachine);
				if (result == null) result = caseBehavior(stateMachine);
				if (result == null) result = caseClass(stateMachine);
				if (result == null) result = caseEncapsulatedClassifier(stateMachine);
				if (result == null) result = caseBehavioredClassifier(stateMachine);
				if (result == null) result = caseStructuredClassifier(stateMachine);
				if (result == null) result = caseClassifier(stateMachine);
				if (result == null) result = caseNamespace(stateMachine);
				if (result == null) result = caseRedefinableElement(stateMachine);
				if (result == null) result = caseType(stateMachine);
				if (result == null) result = caseTemplateableElement(stateMachine);
				if (result == null) result = casePackageableElement(stateMachine);
				if (result == null) result = caseNamedElement(stateMachine);
				if (result == null) result = caseParameterableElement(stateMachine);
				if (result == null) result = caseElement(stateMachine);
				if (result == null) result = caseUMLBase(stateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.STRUCTURED_CLASSIFIER: {
				StructuredClassifier structuredClassifier = (StructuredClassifier)theEObject;
				T result = caseStructuredClassifier(structuredClassifier);
				if (result == null) result = caseClassifier(structuredClassifier);
				if (result == null) result = caseNamespace(structuredClassifier);
				if (result == null) result = caseRedefinableElement(structuredClassifier);
				if (result == null) result = caseType(structuredClassifier);
				if (result == null) result = caseTemplateableElement(structuredClassifier);
				if (result == null) result = casePackageableElement(structuredClassifier);
				if (result == null) result = caseNamedElement(structuredClassifier);
				if (result == null) result = caseParameterableElement(structuredClassifier);
				if (result == null) result = caseElement(structuredClassifier);
				if (result == null) result = caseUMLBase(structuredClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.STEREOTYPE: {
				Stereotype stereotype = (Stereotype)theEObject;
				T result = caseStereotype(stereotype);
				if (result == null) result = caseClass(stereotype);
				if (result == null) result = caseEncapsulatedClassifier(stereotype);
				if (result == null) result = caseBehavioredClassifier(stereotype);
				if (result == null) result = caseStructuredClassifier(stereotype);
				if (result == null) result = caseClassifier(stereotype);
				if (result == null) result = caseNamespace(stereotype);
				if (result == null) result = caseRedefinableElement(stereotype);
				if (result == null) result = caseType(stereotype);
				if (result == null) result = caseTemplateableElement(stereotype);
				if (result == null) result = casePackageableElement(stereotype);
				if (result == null) result = caseNamedElement(stereotype);
				if (result == null) result = caseParameterableElement(stereotype);
				if (result == null) result = caseElement(stereotype);
				if (result == null) result = caseUMLBase(stereotype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.TEMPLATEABLE_ELEMENT: {
				TemplateableElement templateableElement = (TemplateableElement)theEObject;
				T result = caseTemplateableElement(templateableElement);
				if (result == null) result = caseElement(templateableElement);
				if (result == null) result = caseUMLBase(templateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.TEMPLATE_BINDING: {
				TemplateBinding templateBinding = (TemplateBinding)theEObject;
				T result = caseTemplateBinding(templateBinding);
				if (result == null) result = caseDirectedRelationship(templateBinding);
				if (result == null) result = caseRelationship(templateBinding);
				if (result == null) result = caseElement(templateBinding);
				if (result == null) result = caseUMLBase(templateBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.TEMPLATE_SIGNATURE: {
				TemplateSignature templateSignature = (TemplateSignature)theEObject;
				T result = caseTemplateSignature(templateSignature);
				if (result == null) result = caseElement(templateSignature);
				if (result == null) result = caseUMLBase(templateSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.TEMPLATE_PARAMETER: {
				TemplateParameter templateParameter = (TemplateParameter)theEObject;
				T result = caseTemplateParameter(templateParameter);
				if (result == null) result = caseElement(templateParameter);
				if (result == null) result = caseUMLBase(templateParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.TEMPLATE_PARAMETER_SUBSTITUTION: {
				TemplateParameterSubstitution templateParameterSubstitution = (TemplateParameterSubstitution)theEObject;
				T result = caseTemplateParameterSubstitution(templateParameterSubstitution);
				if (result == null) result = caseElement(templateParameterSubstitution);
				if (result == null) result = caseUMLBase(templateParameterSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.TEST_IDENTITY_ACTION: {
				TestIdentityAction testIdentityAction = (TestIdentityAction)theEObject;
				T result = caseTestIdentityAction(testIdentityAction);
				if (result == null) result = caseAction(testIdentityAction);
				if (result == null) result = caseExecutableNode(testIdentityAction);
				if (result == null) result = caseActivityNode(testIdentityAction);
				if (result == null) result = caseRedefinableElement(testIdentityAction);
				if (result == null) result = caseNamedElement(testIdentityAction);
				if (result == null) result = caseElement(testIdentityAction);
				if (result == null) result = caseUMLBase(testIdentityAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.TIME_CONSTRAINT: {
				TimeConstraint timeConstraint = (TimeConstraint)theEObject;
				T result = caseTimeConstraint(timeConstraint);
				if (result == null) result = caseIntervalConstraint(timeConstraint);
				if (result == null) result = caseConstraint(timeConstraint);
				if (result == null) result = casePackageableElement(timeConstraint);
				if (result == null) result = caseNamedElement(timeConstraint);
				if (result == null) result = caseParameterableElement(timeConstraint);
				if (result == null) result = caseElement(timeConstraint);
				if (result == null) result = caseUMLBase(timeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.TIME_EVENT: {
				TimeEvent timeEvent = (TimeEvent)theEObject;
				T result = caseTimeEvent(timeEvent);
				if (result == null) result = caseEvent(timeEvent);
				if (result == null) result = casePackageableElement(timeEvent);
				if (result == null) result = caseNamedElement(timeEvent);
				if (result == null) result = caseParameterableElement(timeEvent);
				if (result == null) result = caseElement(timeEvent);
				if (result == null) result = caseUMLBase(timeEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.TIME_EXPRESSION: {
				TimeExpression timeExpression = (TimeExpression)theEObject;
				T result = caseTimeExpression(timeExpression);
				if (result == null) result = caseValueSpecification(timeExpression);
				if (result == null) result = casePackageableElement(timeExpression);
				if (result == null) result = caseTypedElement(timeExpression);
				if (result == null) result = caseNamedElement(timeExpression);
				if (result == null) result = caseParameterableElement(timeExpression);
				if (result == null) result = caseElement(timeExpression);
				if (result == null) result = caseUMLBase(timeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.TIME_INTERVAL: {
				TimeInterval timeInterval = (TimeInterval)theEObject;
				T result = caseTimeInterval(timeInterval);
				if (result == null) result = caseInterval(timeInterval);
				if (result == null) result = caseValueSpecification(timeInterval);
				if (result == null) result = casePackageableElement(timeInterval);
				if (result == null) result = caseTypedElement(timeInterval);
				if (result == null) result = caseNamedElement(timeInterval);
				if (result == null) result = caseParameterableElement(timeInterval);
				if (result == null) result = caseElement(timeInterval);
				if (result == null) result = caseUMLBase(timeInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.TIME_OBSERVATION: {
				TimeObservation timeObservation = (TimeObservation)theEObject;
				T result = caseTimeObservation(timeObservation);
				if (result == null) result = caseObservation(timeObservation);
				if (result == null) result = casePackageableElement(timeObservation);
				if (result == null) result = caseNamedElement(timeObservation);
				if (result == null) result = caseParameterableElement(timeObservation);
				if (result == null) result = caseElement(timeObservation);
				if (result == null) result = caseUMLBase(timeObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNamespace(transition);
				if (result == null) result = caseRedefinableElement(transition);
				if (result == null) result = caseNamedElement(transition);
				if (result == null) result = caseElement(transition);
				if (result == null) result = caseUMLBase(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = caseNamedElement(trigger);
				if (result == null) result = caseElement(trigger);
				if (result == null) result = caseUMLBase(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T result = caseTypedElement(typedElement);
				if (result == null) result = caseNamedElement(typedElement);
				if (result == null) result = caseElement(typedElement);
				if (result == null) result = caseUMLBase(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = casePackageableElement(type);
				if (result == null) result = caseNamedElement(type);
				if (result == null) result = caseParameterableElement(type);
				if (result == null) result = caseElement(type);
				if (result == null) result = caseUMLBase(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.UNMARSHALL_ACTION: {
				UnmarshallAction unmarshallAction = (UnmarshallAction)theEObject;
				T result = caseUnmarshallAction(unmarshallAction);
				if (result == null) result = caseAction(unmarshallAction);
				if (result == null) result = caseExecutableNode(unmarshallAction);
				if (result == null) result = caseActivityNode(unmarshallAction);
				if (result == null) result = caseRedefinableElement(unmarshallAction);
				if (result == null) result = caseNamedElement(unmarshallAction);
				if (result == null) result = caseElement(unmarshallAction);
				if (result == null) result = caseUMLBase(unmarshallAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.UML_BASE: {
				UMLBase umlBase = (UMLBase)theEObject;
				T result = caseUMLBase(umlBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.USAGE: {
				Usage usage = (Usage)theEObject;
				T result = caseUsage(usage);
				if (result == null) result = caseDependency(usage);
				if (result == null) result = casePackageableElement(usage);
				if (result == null) result = caseDirectedRelationship(usage);
				if (result == null) result = caseNamedElement(usage);
				if (result == null) result = caseParameterableElement(usage);
				if (result == null) result = caseRelationship(usage);
				if (result == null) result = caseElement(usage);
				if (result == null) result = caseUMLBase(usage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.USE_CASE: {
				UseCase useCase = (UseCase)theEObject;
				T result = caseUseCase(useCase);
				if (result == null) result = caseBehavioredClassifier(useCase);
				if (result == null) result = caseClassifier(useCase);
				if (result == null) result = caseNamespace(useCase);
				if (result == null) result = caseRedefinableElement(useCase);
				if (result == null) result = caseType(useCase);
				if (result == null) result = caseTemplateableElement(useCase);
				if (result == null) result = casePackageableElement(useCase);
				if (result == null) result = caseNamedElement(useCase);
				if (result == null) result = caseParameterableElement(useCase);
				if (result == null) result = caseElement(useCase);
				if (result == null) result = caseUMLBase(useCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.VALUE_PIN: {
				ValuePin valuePin = (ValuePin)theEObject;
				T result = caseValuePin(valuePin);
				if (result == null) result = caseInputPin(valuePin);
				if (result == null) result = casePin(valuePin);
				if (result == null) result = caseObjectNode(valuePin);
				if (result == null) result = caseMultiplicityElement(valuePin);
				if (result == null) result = caseActivityNode(valuePin);
				if (result == null) result = caseTypedElement(valuePin);
				if (result == null) result = caseRedefinableElement(valuePin);
				if (result == null) result = caseNamedElement(valuePin);
				if (result == null) result = caseElement(valuePin);
				if (result == null) result = caseUMLBase(valuePin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.VALUE_SPECIFICATION_ACTION: {
				ValueSpecificationAction valueSpecificationAction = (ValueSpecificationAction)theEObject;
				T result = caseValueSpecificationAction(valueSpecificationAction);
				if (result == null) result = caseAction(valueSpecificationAction);
				if (result == null) result = caseExecutableNode(valueSpecificationAction);
				if (result == null) result = caseActivityNode(valueSpecificationAction);
				if (result == null) result = caseRedefinableElement(valueSpecificationAction);
				if (result == null) result = caseNamedElement(valueSpecificationAction);
				if (result == null) result = caseElement(valueSpecificationAction);
				if (result == null) result = caseUMLBase(valueSpecificationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.VALUE_SPECIFICATION: {
				ValueSpecification valueSpecification = (ValueSpecification)theEObject;
				T result = caseValueSpecification(valueSpecification);
				if (result == null) result = casePackageableElement(valueSpecification);
				if (result == null) result = caseTypedElement(valueSpecification);
				if (result == null) result = caseNamedElement(valueSpecification);
				if (result == null) result = caseParameterableElement(valueSpecification);
				if (result == null) result = caseElement(valueSpecification);
				if (result == null) result = caseUMLBase(valueSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseConnectableElement(variable);
				if (result == null) result = caseMultiplicityElement(variable);
				if (result == null) result = caseTypedElement(variable);
				if (result == null) result = caseParameterableElement(variable);
				if (result == null) result = caseNamedElement(variable);
				if (result == null) result = caseElement(variable);
				if (result == null) result = caseUMLBase(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.VARIABLE_ACTION: {
				VariableAction variableAction = (VariableAction)theEObject;
				T result = caseVariableAction(variableAction);
				if (result == null) result = caseAction(variableAction);
				if (result == null) result = caseExecutableNode(variableAction);
				if (result == null) result = caseActivityNode(variableAction);
				if (result == null) result = caseRedefinableElement(variableAction);
				if (result == null) result = caseNamedElement(variableAction);
				if (result == null) result = caseElement(variableAction);
				if (result == null) result = caseUMLBase(variableAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.VERTEX: {
				Vertex vertex = (Vertex)theEObject;
				T result = caseVertex(vertex);
				if (result == null) result = caseNamedElement(vertex);
				if (result == null) result = caseElement(vertex);
				if (result == null) result = caseUMLBase(vertex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.WRITE_LINK_ACTION: {
				WriteLinkAction writeLinkAction = (WriteLinkAction)theEObject;
				T result = caseWriteLinkAction(writeLinkAction);
				if (result == null) result = caseLinkAction(writeLinkAction);
				if (result == null) result = caseAction(writeLinkAction);
				if (result == null) result = caseExecutableNode(writeLinkAction);
				if (result == null) result = caseActivityNode(writeLinkAction);
				if (result == null) result = caseRedefinableElement(writeLinkAction);
				if (result == null) result = caseNamedElement(writeLinkAction);
				if (result == null) result = caseElement(writeLinkAction);
				if (result == null) result = caseUMLBase(writeLinkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.WRITE_VARIABLE_ACTION: {
				WriteVariableAction writeVariableAction = (WriteVariableAction)theEObject;
				T result = caseWriteVariableAction(writeVariableAction);
				if (result == null) result = caseVariableAction(writeVariableAction);
				if (result == null) result = caseAction(writeVariableAction);
				if (result == null) result = caseExecutableNode(writeVariableAction);
				if (result == null) result = caseActivityNode(writeVariableAction);
				if (result == null) result = caseRedefinableElement(writeVariableAction);
				if (result == null) result = caseNamedElement(writeVariableAction);
				if (result == null) result = caseElement(writeVariableAction);
				if (result == null) result = caseUMLBase(writeVariableAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLModelPackage.WRITE_STRUCTURAL_FEATURE_ACTION: {
				WriteStructuralFeatureAction writeStructuralFeatureAction = (WriteStructuralFeatureAction)theEObject;
				T result = caseWriteStructuralFeatureAction(writeStructuralFeatureAction);
				if (result == null) result = caseStructuralFeatureAction(writeStructuralFeatureAction);
				if (result == null) result = caseAction(writeStructuralFeatureAction);
				if (result == null) result = caseExecutableNode(writeStructuralFeatureAction);
				if (result == null) result = caseActivityNode(writeStructuralFeatureAction);
				if (result == null) result = caseRedefinableElement(writeStructuralFeatureAction);
				if (result == null) result = caseNamedElement(writeStructuralFeatureAction);
				if (result == null) result = caseElement(writeStructuralFeatureAction);
				if (result == null) result = caseUMLBase(writeStructuralFeatureAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstraction(Abstraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptCallAction(AcceptCallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptEventAction(AcceptEventAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionExecutionSpecification(ActionExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Input Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionInputPin(ActionInputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdge(ActivityEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityFinalNode(ActivityFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode(ActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityGroup(ActivityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityPartition(ActivityPartition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Parameter Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityParameterNode(ActivityParameterNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Structural Feature Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddStructuralFeatureValueAction(AddStructuralFeatureValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Variable Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddVariableValueAction(AddVariableValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Receive Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Receive Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyReceiveEvent(AnyReceiveEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationClass(AssociationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorExecutionSpecification(BehaviorExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioralFeature(BehavioralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioredClassifier(BehavioredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broadcast Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broadcast Signal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBroadcastSignalAction(BroadcastSignalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallAction(CallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Behavior Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallBehaviorAction(CallBehaviorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallEvent(CallEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Operation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallOperationAction(CallOperationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeEvent(ChangeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.emftrace.metamodel.UMLModel.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierTemplateParameter(ClassifierTemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClause(Clause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearVariableAction(ClearVariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Association Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Association Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearAssociationAction(ClearAssociationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearStructuralFeatureAction(ClearStructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaboration(Collaboration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboration Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboration Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborationUse(CollaborationUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationPath(CommunicationPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentRealization(ComponentRealization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedFragment(CombinedFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalNode(ConditionalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consider Ignore Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consider Ignore Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsiderIgnoreFragment(ConsiderIgnoreFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuation(Continuation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectableElement(ConnectableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable Element Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable Element Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectableElementTemplateParameter(ConnectableElementTemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorEnd(ConnectorEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPointReference(ConnectionPointReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlNode(ControlNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creation Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creation Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreationEvent(CreationEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Link Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Link Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateLinkObjectAction(CreateLinkObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateObjectAction(CreateObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateLinkAction(CreateLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Central Buffer Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Central Buffer Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCentralBufferNode(CentralBufferNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Store Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Store Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStoreNode(DataStoreNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionNode(DecisionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentTarget(DeploymentTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployment(Deployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployed Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployed Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployedArtifact(DeployedArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentSpecification(DeploymentSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedRelationship(DirectedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroyLinkAction(DestroyLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroyObjectAction(DestroyObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destruction Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destruction Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestructionEvent(DestructionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuration(Duration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationConstraint(DurationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationInterval(DurationInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationObservation(DurationObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementImport(ElementImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncapsulatedClassifier(EncapsulatedClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteral(EnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionHandler(ExceptionHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableNode(ExecutableNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionEnvironment(ExecutionEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionEvent(ExecutionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionOccurrenceSpecification(ExecutionOccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionSpecification(ExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionNode(ExpansionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionRegion(ExpansionRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtend(Extend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionEnd(ExtensionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionPoint(ExtensionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalState(FinalState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkNode(ForkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowFinalNode(FlowFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalNode(FinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionBehavior(FunctionBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Ordering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Ordering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralOrdering(GeneralOrdering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizationSet(GeneralizationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceRealization(InterfaceRealization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclude(Include object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceSpecification(InstanceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceValue(InstanceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interruptible Activity Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interruptible Activity Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterruptibleActivityRegion(InterruptibleActivityRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPin(InputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocationAction(InvocationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialNode(InitialNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFragment(InteractionFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionUse(InteractionUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionOperand(InteractionOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionConstraint(InteractionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterval(Interval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalConstraint(IntervalConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationItem(InformationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationFlow(InformationFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinNode(JoinNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralSpecification(LiteralSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralInteger(LiteralInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralString(LiteralString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralBoolean(LiteralBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralNull(LiteralNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Unlimited Natural</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Unlimited Natural</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralUnlimitedNatural(LiteralUnlimitedNatural object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifeline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifeline(Lifeline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkAction(LinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link End Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkEndData(LinkEndData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link End Creation Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link End Creation Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkEndCreationData(LinkEndCreationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link End Destruction Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link End Destruction Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkEndDestructionData(LinkEndDestructionData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopNode(LoopNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifestation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifestation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestation(Manifestation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageEnd(MessageEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageEvent(MessageEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageOccurrenceSpecification(MessageOccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeNode(MergeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityElement(MultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationTemplateParameter(OperationTemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueAction(OpaqueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueBehavior(OpaqueBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueExpression(OpaqueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccurrenceSpecification(OccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectFlow(ObjectFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectNode(ObjectNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPin(OutputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterableElement(ParameterableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(org.emftrace.metamodel.UMLModel.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageableElement(PackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageImport(PackageImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageMerge(PackageMerge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterSet(ParameterSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartDecomposition(PartDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePin(Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolTransition(ProtocolTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfile(Profile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfileApplication(ProfileApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolStateMachine(ProtocolStateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Conformance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Conformance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolConformance(ProtocolConformance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pseudostate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePseudostate(Pseudostate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifier Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifier Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifierValue(QualifierValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raise Exception Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raise Exception Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaiseExceptionAction(RaiseExceptionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Operation Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Operation Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveOperationEvent(ReceiveOperationEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Signal Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Signal Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveSignalEvent(ReceiveSignalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reclassify Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReclassifyObjectAction(ReclassifyObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Is Classified Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadIsClassifiedObjectAction(ReadIsClassifiedObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Extent Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Extent Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadExtentAction(ReadExtentAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLinkAction(ReadLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Link Object End Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLinkObjectEndAction(ReadLinkObjectEndAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Link Object End Qualifier Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLinkObjectEndQualifierAction(ReadLinkObjectEndQualifierAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Self Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadSelfAction(ReadSelfAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadStructuralFeatureAction(ReadStructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadVariableAction(ReadVariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinable Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinable Template Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinableTemplateSignature(RedefinableTemplateSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduce Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReduceAction(ReduceAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reply Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reply Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplyAction(ReplyAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Variable Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveVariableValueAction(RemoveVariableValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Structural Feature Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveStructuralFeatureValueAction(RemoveStructuralFeatureValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinableElement(RedefinableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealization(Realization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReception(Reception object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegion(Region object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Signal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendSignalAction(SendSignalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Signal Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Signal Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendSignalEvent(SendSignalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceNode(SequenceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalEvent(SignalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlot(Slot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Invariant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateInvariant(StateInvariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Classifier Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Classifier Behavior Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartClassifierBehaviorAction(StartClassifierBehaviorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendObjectAction(SendObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringExpression(StringExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredActivityNode(StructuredActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeature(StructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeatureAction(StructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstitution(Substitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal(Signal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachine(StateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredClassifier(StructuredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotype(Stereotype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateableElement(TemplateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateBinding(TemplateBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateSignature(TemplateSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateParameter(TemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Parameter Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Parameter Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateParameterSubstitution(TemplateParameterSubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Identity Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Identity Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestIdentityAction(TestIdentityAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeConstraint(TimeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeEvent(TimeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeExpression(TimeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeInterval(TimeInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeObservation(TimeObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unmarshall Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnmarshallAction(UnmarshallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLBase(UMLBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsage(Usage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseCase(UseCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuePin(ValuePin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecificationAction(ValueSpecificationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecification(ValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableAction(VariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertex(Vertex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteLinkAction(WriteLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteVariableAction(WriteVariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteStructuralFeatureAction(WriteStructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UMLModelSwitch
