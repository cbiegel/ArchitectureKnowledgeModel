/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.BPMN2Model.Activity;
import org.emftrace.metamodel.BPMN2Model.AdHocSubProcess;
import org.emftrace.metamodel.BPMN2Model.Artifact;
import org.emftrace.metamodel.BPMN2Model.Assignment;
import org.emftrace.metamodel.BPMN2Model.Association;
import org.emftrace.metamodel.BPMN2Model.Auditing;
import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
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
import org.emftrace.metamodel.BPMN2Model.ExtensionAttributeValue;
import org.emftrace.metamodel.BPMN2Model.FlowElement;
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
import org.emftrace.metamodel.BPMN2Model.Interface;
import org.emftrace.metamodel.BPMN2Model.IntermediateCatchEvent;
import org.emftrace.metamodel.BPMN2Model.IntermediateThrowEvent;
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
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getAdHocSubProcess <em>Ad Hoc Sub Process</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getBaseElement <em>Base Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getBaseElementWithMixedContent <em>Base Element With Mixed Content</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getBoundaryEvent <em>Boundary Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getBusinessRuleTask <em>Business Rule Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getCallableElement <em>Callable Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getCallActivity <em>Call Activity</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getCallChoreography <em>Call Choreography</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getCallConversation <em>Call Conversation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getConversationNode <em>Conversation Node</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getCancelEventDefinition <em>Cancel Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getCatchEvent <em>Catch Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getCategoryValue <em>Category Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getChoreography <em>Choreography</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getCollaboration <em>Collaboration</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getChoreographyActivity <em>Choreography Activity</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getChoreographyTask <em>Choreography Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getCompensateEventDefinition <em>Compensate Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getComplexGateway <em>Complex Gateway</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getConditionalEventDefinition <em>Conditional Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getConversation <em>Conversation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getConversationAssociation <em>Conversation Association</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getConversationLink <em>Conversation Link</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getCorrelationKey <em>Correlation Key</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getCorrelationProperty <em>Correlation Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getCorrelationSubscription <em>Correlation Subscription</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getDataAssociation <em>Data Association</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getDataInput <em>Data Input</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getDataInputAssociation <em>Data Input Association</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getDataObject <em>Data Object</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getDataObjectReference <em>Data Object Reference</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getDataOutput <em>Data Output</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getDataOutputAssociation <em>Data Output Association</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getDataStore <em>Data Store</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getDataStoreReference <em>Data Store Reference</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getEndEvent <em>End Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getErrorEventDefinition <em>Error Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getEscalation <em>Escalation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getEscalationEventDefinition <em>Escalation Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getEventBasedGateway <em>Event Based Gateway</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getExclusiveGateway <em>Exclusive Gateway</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getExtensionElements <em>Extension Elements</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getFlowNode <em>Flow Node</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getFormalExpression <em>Formal Expression</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getGlobalBusinessRuleTask <em>Global Business Rule Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getGlobalChoreographyTask <em>Global Choreography Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getGlobalConversation <em>Global Conversation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getGlobalManualTask <em>Global Manual Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getGlobalScriptTask <em>Global Script Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getGlobalTask <em>Global Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getGlobalUserTask <em>Global User Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getHumanPerformer <em>Human Performer</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getResourceRole <em>Resource Role</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getImplicitThrowEvent <em>Implicit Throw Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getInclusiveGateway <em>Inclusive Gateway</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getIntermediateCatchEvent <em>Intermediate Catch Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getIntermediateThrowEvent <em>Intermediate Throw Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getIoBinding <em>Io Binding</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getItemDefinition <em>Item Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getLane <em>Lane</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getLaneSet <em>Lane Set</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getLinkEventDefinition <em>Link Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getLoopCharacteristics <em>Loop Characteristics</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getManualTask <em>Manual Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getMessageEventDefinition <em>Message Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getMessageFlow <em>Message Flow</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getMessageFlowAssociation <em>Message Flow Association</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getMultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getParallelGateway <em>Parallel Gateway</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getParticipantAssociation <em>Participant Association</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getParticipantMultiplicity <em>Participant Multiplicity</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getPartnerEntity <em>Partner Entity</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getPartnerRole <em>Partner Role</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getPotentialOwner <em>Potential Owner</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getReceiveTask <em>Receive Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getResourceParameter <em>Resource Parameter</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getResourceParameterBinding <em>Resource Parameter Binding</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getScriptTask <em>Script Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getSendTask <em>Send Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getSequenceFlow <em>Sequence Flow</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getServiceTask <em>Service Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getSignalEventDefinition <em>Signal Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getStandardLoopCharacteristics <em>Standard Loop Characteristics</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getStartEvent <em>Start Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getSubChoreography <em>Sub Choreography</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getSubConversation <em>Sub Conversation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getSubProcess <em>Sub Process</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getTerminateEventDefinition <em>Terminate Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getTextAnnotation <em>Text Annotation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getThrowEvent <em>Throw Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getTimerEventDefinition <em>Timer Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentRootImpl#getUserTask <em>User Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends BPMNBaseImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

	/**
	 * The cached value of the '{@link #getAdHocSubProcess() <em>Ad Hoc Sub Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdHocSubProcess()
	 * @generated
	 * @ordered
	 */
	protected AdHocSubProcess adHocSubProcess;

	/**
	 * The cached value of the '{@link #getFlowElement() <em>Flow Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowElement()
	 * @generated
	 * @ordered
	 */
	protected FlowElement flowElement;

	/**
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected Artifact artifact;

	/**
	 * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected Assignment assignment;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association association;

	/**
	 * The cached value of the '{@link #getAuditing() <em>Auditing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditing()
	 * @generated
	 * @ordered
	 */
	protected Auditing auditing;

	/**
	 * The cached value of the '{@link #getBaseElement() <em>Base Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseElement()
	 * @generated
	 * @ordered
	 */
	protected BaseElement baseElement;

	/**
	 * The cached value of the '{@link #getBaseElementWithMixedContent() <em>Base Element With Mixed Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseElementWithMixedContent()
	 * @generated
	 * @ordered
	 */
	protected BaseElement baseElementWithMixedContent;

	/**
	 * The cached value of the '{@link #getBoundaryEvent() <em>Boundary Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryEvent()
	 * @generated
	 * @ordered
	 */
	protected BoundaryEvent boundaryEvent;

	/**
	 * The cached value of the '{@link #getBusinessRuleTask() <em>Business Rule Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessRuleTask()
	 * @generated
	 * @ordered
	 */
	protected BusinessRuleTask businessRuleTask;

	/**
	 * The cached value of the '{@link #getCallableElement() <em>Callable Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallableElement()
	 * @generated
	 * @ordered
	 */
	protected CallableElement callableElement;

	/**
	 * The cached value of the '{@link #getCallActivity() <em>Call Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallActivity()
	 * @generated
	 * @ordered
	 */
	protected CallActivity callActivity;

	/**
	 * The cached value of the '{@link #getCallChoreography() <em>Call Choreography</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallChoreography()
	 * @generated
	 * @ordered
	 */
	protected CallChoreography callChoreography;

	/**
	 * The cached value of the '{@link #getCallConversation() <em>Call Conversation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallConversation()
	 * @generated
	 * @ordered
	 */
	protected CallConversation callConversation;

	/**
	 * The cached value of the '{@link #getConversationNode() <em>Conversation Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversationNode()
	 * @generated
	 * @ordered
	 */
	protected ConversationNode conversationNode;

	/**
	 * The cached value of the '{@link #getCancelEventDefinition() <em>Cancel Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelEventDefinition()
	 * @generated
	 * @ordered
	 */
	protected CancelEventDefinition cancelEventDefinition;

	/**
	 * The cached value of the '{@link #getEventDefinition() <em>Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDefinition()
	 * @generated
	 * @ordered
	 */
	protected EventDefinition eventDefinition;

	/**
	 * The cached value of the '{@link #getRootElement() <em>Root Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElement()
	 * @generated
	 * @ordered
	 */
	protected RootElement rootElement;

	/**
	 * The cached value of the '{@link #getCatchEvent() <em>Catch Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchEvent()
	 * @generated
	 * @ordered
	 */
	protected CatchEvent catchEvent;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Category category;

	/**
	 * The cached value of the '{@link #getCategoryValue() <em>Category Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryValue()
	 * @generated
	 * @ordered
	 */
	protected CategoryValue categoryValue;

	/**
	 * The cached value of the '{@link #getChoreography() <em>Choreography</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreography()
	 * @generated
	 * @ordered
	 */
	protected Choreography choreography;

	/**
	 * The cached value of the '{@link #getCollaboration() <em>Collaboration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaboration()
	 * @generated
	 * @ordered
	 */
	protected Collaboration collaboration;

	/**
	 * The cached value of the '{@link #getChoreographyActivity() <em>Choreography Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographyActivity()
	 * @generated
	 * @ordered
	 */
	protected ChoreographyActivity choreographyActivity;

	/**
	 * The cached value of the '{@link #getChoreographyTask() <em>Choreography Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographyTask()
	 * @generated
	 * @ordered
	 */
	protected ChoreographyTask choreographyTask;

	/**
	 * The cached value of the '{@link #getCompensateEventDefinition() <em>Compensate Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensateEventDefinition()
	 * @generated
	 * @ordered
	 */
	protected CompensateEventDefinition compensateEventDefinition;

	/**
	 * The cached value of the '{@link #getComplexBehaviorDefinition() <em>Complex Behavior Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexBehaviorDefinition()
	 * @generated
	 * @ordered
	 */
	protected ComplexBehaviorDefinition complexBehaviorDefinition;

	/**
	 * The cached value of the '{@link #getComplexGateway() <em>Complex Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexGateway()
	 * @generated
	 * @ordered
	 */
	protected ComplexGateway complexGateway;

	/**
	 * The cached value of the '{@link #getConditionalEventDefinition() <em>Conditional Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalEventDefinition()
	 * @generated
	 * @ordered
	 */
	protected ConditionalEventDefinition conditionalEventDefinition;

	/**
	 * The cached value of the '{@link #getConversation() <em>Conversation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversation()
	 * @generated
	 * @ordered
	 */
	protected Conversation conversation;

	/**
	 * The cached value of the '{@link #getConversationAssociation() <em>Conversation Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversationAssociation()
	 * @generated
	 * @ordered
	 */
	protected ConversationAssociation conversationAssociation;

	/**
	 * The cached value of the '{@link #getConversationLink() <em>Conversation Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversationLink()
	 * @generated
	 * @ordered
	 */
	protected ConversationLink conversationLink;

	/**
	 * The cached value of the '{@link #getCorrelationKey() <em>Correlation Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationKey()
	 * @generated
	 * @ordered
	 */
	protected CorrelationKey correlationKey;

	/**
	 * The cached value of the '{@link #getCorrelationProperty() <em>Correlation Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationProperty()
	 * @generated
	 * @ordered
	 */
	protected CorrelationProperty correlationProperty;

	/**
	 * The cached value of the '{@link #getCorrelationPropertyBinding() <em>Correlation Property Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationPropertyBinding()
	 * @generated
	 * @ordered
	 */
	protected CorrelationPropertyBinding correlationPropertyBinding;

	/**
	 * The cached value of the '{@link #getCorrelationPropertyRetrievalExpression() <em>Correlation Property Retrieval Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationPropertyRetrievalExpression()
	 * @generated
	 * @ordered
	 */
	protected CorrelationPropertyRetrievalExpression correlationPropertyRetrievalExpression;

	/**
	 * The cached value of the '{@link #getCorrelationSubscription() <em>Correlation Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationSubscription()
	 * @generated
	 * @ordered
	 */
	protected CorrelationSubscription correlationSubscription;

	/**
	 * The cached value of the '{@link #getDataAssociation() <em>Data Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAssociation()
	 * @generated
	 * @ordered
	 */
	protected DataAssociation dataAssociation;

	/**
	 * The cached value of the '{@link #getDataInput() <em>Data Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataInput()
	 * @generated
	 * @ordered
	 */
	protected DataInput dataInput;

	/**
	 * The cached value of the '{@link #getDataInputAssociation() <em>Data Input Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataInputAssociation()
	 * @generated
	 * @ordered
	 */
	protected DataInputAssociation dataInputAssociation;

	/**
	 * The cached value of the '{@link #getDataObject() <em>Data Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataObject()
	 * @generated
	 * @ordered
	 */
	protected DataObject dataObject;

	/**
	 * The cached value of the '{@link #getDataObjectReference() <em>Data Object Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataObjectReference()
	 * @generated
	 * @ordered
	 */
	protected DataObjectReference dataObjectReference;

	/**
	 * The cached value of the '{@link #getDataOutput() <em>Data Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOutput()
	 * @generated
	 * @ordered
	 */
	protected DataOutput dataOutput;

	/**
	 * The cached value of the '{@link #getDataOutputAssociation() <em>Data Output Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOutputAssociation()
	 * @generated
	 * @ordered
	 */
	protected DataOutputAssociation dataOutputAssociation;

	/**
	 * The cached value of the '{@link #getDataState() <em>Data State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataState()
	 * @generated
	 * @ordered
	 */
	protected DataState dataState;

	/**
	 * The cached value of the '{@link #getDataStore() <em>Data Store</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStore()
	 * @generated
	 * @ordered
	 */
	protected DataStore dataStore;

	/**
	 * The cached value of the '{@link #getDataStoreReference() <em>Data Store Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStoreReference()
	 * @generated
	 * @ordered
	 */
	protected DataStoreReference dataStoreReference;

	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected Definitions definitions;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected Documentation documentation;

	/**
	 * The cached value of the '{@link #getEndEvent() <em>End Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndEvent()
	 * @generated
	 * @ordered
	 */
	protected EndEvent endEvent;

	/**
	 * The cached value of the '{@link #getEndPoint() <em>End Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoint()
	 * @generated
	 * @ordered
	 */
	protected EndPoint endPoint;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected org.emftrace.metamodel.BPMN2Model.Error error;

	/**
	 * The cached value of the '{@link #getErrorEventDefinition() <em>Error Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorEventDefinition()
	 * @generated
	 * @ordered
	 */
	protected ErrorEventDefinition errorEventDefinition;

	/**
	 * The cached value of the '{@link #getEscalation() <em>Escalation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscalation()
	 * @generated
	 * @ordered
	 */
	protected Escalation escalation;

	/**
	 * The cached value of the '{@link #getEscalationEventDefinition() <em>Escalation Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscalationEventDefinition()
	 * @generated
	 * @ordered
	 */
	protected EscalationEventDefinition escalationEventDefinition;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Event event;

	/**
	 * The cached value of the '{@link #getEventBasedGateway() <em>Event Based Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventBasedGateway()
	 * @generated
	 * @ordered
	 */
	protected EventBasedGateway eventBasedGateway;

	/**
	 * The cached value of the '{@link #getExclusiveGateway() <em>Exclusive Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveGateway()
	 * @generated
	 * @ordered
	 */
	protected ExclusiveGateway exclusiveGateway;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected Extension extension;

	/**
	 * The cached value of the '{@link #getExtensionElements() <em>Extension Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionElements()
	 * @generated
	 * @ordered
	 */
	protected ExtensionAttributeValue extensionElements;

	/**
	 * The cached value of the '{@link #getFlowNode() <em>Flow Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowNode()
	 * @generated
	 * @ordered
	 */
	protected FlowNode flowNode;

	/**
	 * The cached value of the '{@link #getFormalExpression() <em>Formal Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalExpression()
	 * @generated
	 * @ordered
	 */
	protected FormalExpression formalExpression;

	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected Gateway gateway;

	/**
	 * The cached value of the '{@link #getGlobalBusinessRuleTask() <em>Global Business Rule Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalBusinessRuleTask()
	 * @generated
	 * @ordered
	 */
	protected GlobalBusinessRuleTask globalBusinessRuleTask;

	/**
	 * The cached value of the '{@link #getGlobalChoreographyTask() <em>Global Choreography Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalChoreographyTask()
	 * @generated
	 * @ordered
	 */
	protected GlobalChoreographyTask globalChoreographyTask;

	/**
	 * The cached value of the '{@link #getGlobalConversation() <em>Global Conversation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalConversation()
	 * @generated
	 * @ordered
	 */
	protected GlobalConversation globalConversation;

	/**
	 * The cached value of the '{@link #getGlobalManualTask() <em>Global Manual Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalManualTask()
	 * @generated
	 * @ordered
	 */
	protected GlobalManualTask globalManualTask;

	/**
	 * The cached value of the '{@link #getGlobalScriptTask() <em>Global Script Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalScriptTask()
	 * @generated
	 * @ordered
	 */
	protected GlobalScriptTask globalScriptTask;

	/**
	 * The cached value of the '{@link #getGlobalTask() <em>Global Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalTask()
	 * @generated
	 * @ordered
	 */
	protected GlobalTask globalTask;

	/**
	 * The cached value of the '{@link #getGlobalUserTask() <em>Global User Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalUserTask()
	 * @generated
	 * @ordered
	 */
	protected GlobalUserTask globalUserTask;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected Group group;

	/**
	 * The cached value of the '{@link #getHumanPerformer() <em>Human Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanPerformer()
	 * @generated
	 * @ordered
	 */
	protected HumanPerformer humanPerformer;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Performer performer;

	/**
	 * The cached value of the '{@link #getResourceRole() <em>Resource Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRole()
	 * @generated
	 * @ordered
	 */
	protected ResourceRole resourceRole;

	/**
	 * The cached value of the '{@link #getImplicitThrowEvent() <em>Implicit Throw Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitThrowEvent()
	 * @generated
	 * @ordered
	 */
	protected ImplicitThrowEvent implicitThrowEvent;

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected Import import_;

	/**
	 * The cached value of the '{@link #getInclusiveGateway() <em>Inclusive Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclusiveGateway()
	 * @generated
	 * @ordered
	 */
	protected InclusiveGateway inclusiveGateway;

	/**
	 * The cached value of the '{@link #getInputSet() <em>Input Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSet()
	 * @generated
	 * @ordered
	 */
	protected InputSet inputSet;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface interface_;

	/**
	 * The cached value of the '{@link #getIntermediateCatchEvent() <em>Intermediate Catch Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateCatchEvent()
	 * @generated
	 * @ordered
	 */
	protected IntermediateCatchEvent intermediateCatchEvent;

	/**
	 * The cached value of the '{@link #getIntermediateThrowEvent() <em>Intermediate Throw Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateThrowEvent()
	 * @generated
	 * @ordered
	 */
	protected IntermediateThrowEvent intermediateThrowEvent;

	/**
	 * The cached value of the '{@link #getIoBinding() <em>Io Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoBinding()
	 * @generated
	 * @ordered
	 */
	protected InputOutputBinding ioBinding;

	/**
	 * The cached value of the '{@link #getIoSpecification() <em>Io Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoSpecification()
	 * @generated
	 * @ordered
	 */
	protected InputOutputSpecification ioSpecification;

	/**
	 * The cached value of the '{@link #getItemDefinition() <em>Item Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemDefinition()
	 * @generated
	 * @ordered
	 */
	protected ItemDefinition itemDefinition;

	/**
	 * The cached value of the '{@link #getLane() <em>Lane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLane()
	 * @generated
	 * @ordered
	 */
	protected Lane lane;

	/**
	 * The cached value of the '{@link #getLaneSet() <em>Lane Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaneSet()
	 * @generated
	 * @ordered
	 */
	protected LaneSet laneSet;

	/**
	 * The cached value of the '{@link #getLinkEventDefinition() <em>Link Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkEventDefinition()
	 * @generated
	 * @ordered
	 */
	protected LinkEventDefinition linkEventDefinition;

	/**
	 * The cached value of the '{@link #getLoopCharacteristics() <em>Loop Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected LoopCharacteristics loopCharacteristics;

	/**
	 * The cached value of the '{@link #getManualTask() <em>Manual Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualTask()
	 * @generated
	 * @ordered
	 */
	protected ManualTask manualTask;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Message message;

	/**
	 * The cached value of the '{@link #getMessageEventDefinition() <em>Message Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageEventDefinition()
	 * @generated
	 * @ordered
	 */
	protected MessageEventDefinition messageEventDefinition;

	/**
	 * The cached value of the '{@link #getMessageFlow() <em>Message Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageFlow()
	 * @generated
	 * @ordered
	 */
	protected MessageFlow messageFlow;

	/**
	 * The cached value of the '{@link #getMessageFlowAssociation() <em>Message Flow Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageFlowAssociation()
	 * @generated
	 * @ordered
	 */
	protected MessageFlowAssociation messageFlowAssociation;

	/**
	 * The cached value of the '{@link #getMonitoring() <em>Monitoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoring()
	 * @generated
	 * @ordered
	 */
	protected Monitoring monitoring;

	/**
	 * The cached value of the '{@link #getMultiInstanceLoopCharacteristics() <em>Multi Instance Loop Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected MultiInstanceLoopCharacteristics multiInstanceLoopCharacteristics;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

	/**
	 * The cached value of the '{@link #getOutputSet() <em>Output Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSet()
	 * @generated
	 * @ordered
	 */
	protected OutputSet outputSet;

	/**
	 * The cached value of the '{@link #getParallelGateway() <em>Parallel Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelGateway()
	 * @generated
	 * @ordered
	 */
	protected ParallelGateway parallelGateway;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected Participant participant;

	/**
	 * The cached value of the '{@link #getParticipantAssociation() <em>Participant Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantAssociation()
	 * @generated
	 * @ordered
	 */
	protected ParticipantAssociation participantAssociation;

	/**
	 * The cached value of the '{@link #getParticipantMultiplicity() <em>Participant Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected ParticipantMultiplicity participantMultiplicity;

	/**
	 * The cached value of the '{@link #getPartnerEntity() <em>Partner Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerEntity()
	 * @generated
	 * @ordered
	 */
	protected PartnerEntity partnerEntity;

	/**
	 * The cached value of the '{@link #getPartnerRole() <em>Partner Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerRole()
	 * @generated
	 * @ordered
	 */
	protected PartnerRole partnerRole;

	/**
	 * The cached value of the '{@link #getPotentialOwner() <em>Potential Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotentialOwner()
	 * @generated
	 * @ordered
	 */
	protected PotentialOwner potentialOwner;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected org.emftrace.metamodel.BPMN2Model.Process process;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Property property;

	/**
	 * The cached value of the '{@link #getReceiveTask() <em>Receive Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveTask()
	 * @generated
	 * @ordered
	 */
	protected ReceiveTask receiveTask;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected Relationship relationship;

	/**
	 * The cached value of the '{@link #getRendering() <em>Rendering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendering()
	 * @generated
	 * @ordered
	 */
	protected Rendering rendering;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * The cached value of the '{@link #getResourceAssignmentExpression() <em>Resource Assignment Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAssignmentExpression()
	 * @generated
	 * @ordered
	 */
	protected ResourceAssignmentExpression resourceAssignmentExpression;

	/**
	 * The cached value of the '{@link #getResourceParameter() <em>Resource Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceParameter()
	 * @generated
	 * @ordered
	 */
	protected ResourceParameter resourceParameter;

	/**
	 * The cached value of the '{@link #getResourceParameterBinding() <em>Resource Parameter Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceParameterBinding()
	 * @generated
	 * @ordered
	 */
	protected ResourceParameterBinding resourceParameterBinding;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected EObject script;

	/**
	 * The cached value of the '{@link #getScriptTask() <em>Script Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptTask()
	 * @generated
	 * @ordered
	 */
	protected ScriptTask scriptTask;

	/**
	 * The cached value of the '{@link #getSendTask() <em>Send Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendTask()
	 * @generated
	 * @ordered
	 */
	protected SendTask sendTask;

	/**
	 * The cached value of the '{@link #getSequenceFlow() <em>Sequence Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceFlow()
	 * @generated
	 * @ordered
	 */
	protected SequenceFlow sequenceFlow;

	/**
	 * The cached value of the '{@link #getServiceTask() <em>Service Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTask()
	 * @generated
	 * @ordered
	 */
	protected ServiceTask serviceTask;

	/**
	 * The cached value of the '{@link #getSignal() <em>Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal signal;

	/**
	 * The cached value of the '{@link #getSignalEventDefinition() <em>Signal Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalEventDefinition()
	 * @generated
	 * @ordered
	 */
	protected SignalEventDefinition signalEventDefinition;

	/**
	 * The cached value of the '{@link #getStandardLoopCharacteristics() <em>Standard Loop Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardLoopCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected StandardLoopCharacteristics standardLoopCharacteristics;

	/**
	 * The cached value of the '{@link #getStartEvent() <em>Start Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartEvent()
	 * @generated
	 * @ordered
	 */
	protected StartEvent startEvent;

	/**
	 * The cached value of the '{@link #getSubChoreography() <em>Sub Choreography</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubChoreography()
	 * @generated
	 * @ordered
	 */
	protected SubChoreography subChoreography;

	/**
	 * The cached value of the '{@link #getSubConversation() <em>Sub Conversation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubConversation()
	 * @generated
	 * @ordered
	 */
	protected SubConversation subConversation;

	/**
	 * The cached value of the '{@link #getSubProcess() <em>Sub Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubProcess()
	 * @generated
	 * @ordered
	 */
	protected SubProcess subProcess;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

	/**
	 * The cached value of the '{@link #getTerminateEventDefinition() <em>Terminate Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminateEventDefinition()
	 * @generated
	 * @ordered
	 */
	protected TerminateEventDefinition terminateEventDefinition;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EObject text;

	/**
	 * The cached value of the '{@link #getTextAnnotation() <em>Text Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAnnotation()
	 * @generated
	 * @ordered
	 */
	protected TextAnnotation textAnnotation;

	/**
	 * The cached value of the '{@link #getThrowEvent() <em>Throw Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrowEvent()
	 * @generated
	 * @ordered
	 */
	protected ThrowEvent throwEvent;

	/**
	 * The cached value of the '{@link #getTimerEventDefinition() <em>Timer Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerEventDefinition()
	 * @generated
	 * @ordered
	 */
	protected TimerEventDefinition timerEventDefinition;

	/**
	 * The cached value of the '{@link #getTransaction() <em>Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransaction()
	 * @generated
	 * @ordered
	 */
	protected Transaction transaction;

	/**
	 * The cached value of the '{@link #getUserTask() <em>User Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTask()
	 * @generated
	 * @ordered
	 */
	protected UserTask userTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, BPMN2ModelPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BPMN2ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BPMN2ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ACTIVITY, oldActivity, newActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		if (newActivity != activity) {
			NotificationChain msgs = null;
			if (activity != null)
				msgs = ((InternalEObject)activity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ACTIVITY, null, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ACTIVITY, null, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocSubProcess getAdHocSubProcess() {
		return adHocSubProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdHocSubProcess(AdHocSubProcess newAdHocSubProcess, NotificationChain msgs) {
		AdHocSubProcess oldAdHocSubProcess = adHocSubProcess;
		adHocSubProcess = newAdHocSubProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS, oldAdHocSubProcess, newAdHocSubProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdHocSubProcess(AdHocSubProcess newAdHocSubProcess) {
		if (newAdHocSubProcess != adHocSubProcess) {
			NotificationChain msgs = null;
			if (adHocSubProcess != null)
				msgs = ((InternalEObject)adHocSubProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS, null, msgs);
			if (newAdHocSubProcess != null)
				msgs = ((InternalEObject)newAdHocSubProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS, null, msgs);
			msgs = basicSetAdHocSubProcess(newAdHocSubProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS, newAdHocSubProcess, newAdHocSubProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowElement getFlowElement() {
		return flowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowElement(FlowElement newFlowElement, NotificationChain msgs) {
		FlowElement oldFlowElement = flowElement;
		flowElement = newFlowElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_ELEMENT, oldFlowElement, newFlowElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowElement(FlowElement newFlowElement) {
		if (newFlowElement != flowElement) {
			NotificationChain msgs = null;
			if (flowElement != null)
				msgs = ((InternalEObject)flowElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_ELEMENT, null, msgs);
			if (newFlowElement != null)
				msgs = ((InternalEObject)newFlowElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_ELEMENT, null, msgs);
			msgs = basicSetFlowElement(newFlowElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_ELEMENT, newFlowElement, newFlowElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact getArtifact() {
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifact(Artifact newArtifact, NotificationChain msgs) {
		Artifact oldArtifact = artifact;
		artifact = newArtifact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ARTIFACT, oldArtifact, newArtifact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifact(Artifact newArtifact) {
		if (newArtifact != artifact) {
			NotificationChain msgs = null;
			if (artifact != null)
				msgs = ((InternalEObject)artifact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ARTIFACT, null, msgs);
			if (newArtifact != null)
				msgs = ((InternalEObject)newArtifact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ARTIFACT, null, msgs);
			msgs = basicSetArtifact(newArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ARTIFACT, newArtifact, newArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment getAssignment() {
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignment(Assignment newAssignment, NotificationChain msgs) {
		Assignment oldAssignment = assignment;
		assignment = newAssignment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ASSIGNMENT, oldAssignment, newAssignment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignment(Assignment newAssignment) {
		if (newAssignment != assignment) {
			NotificationChain msgs = null;
			if (assignment != null)
				msgs = ((InternalEObject)assignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ASSIGNMENT, null, msgs);
			if (newAssignment != null)
				msgs = ((InternalEObject)newAssignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ASSIGNMENT, null, msgs);
			msgs = basicSetAssignment(newAssignment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ASSIGNMENT, newAssignment, newAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociation() {
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociation(Association newAssociation, NotificationChain msgs) {
		Association oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ASSOCIATION, oldAssociation, newAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(Association newAssociation) {
		if (newAssociation != association) {
			NotificationChain msgs = null;
			if (association != null)
				msgs = ((InternalEObject)association).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ASSOCIATION, null, msgs);
			if (newAssociation != null)
				msgs = ((InternalEObject)newAssociation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ASSOCIATION, null, msgs);
			msgs = basicSetAssociation(newAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ASSOCIATION, newAssociation, newAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auditing getAuditing() {
		return auditing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditing(Auditing newAuditing, NotificationChain msgs) {
		Auditing oldAuditing = auditing;
		auditing = newAuditing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__AUDITING, oldAuditing, newAuditing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditing(Auditing newAuditing) {
		if (newAuditing != auditing) {
			NotificationChain msgs = null;
			if (auditing != null)
				msgs = ((InternalEObject)auditing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__AUDITING, null, msgs);
			if (newAuditing != null)
				msgs = ((InternalEObject)newAuditing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__AUDITING, null, msgs);
			msgs = basicSetAuditing(newAuditing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__AUDITING, newAuditing, newAuditing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getBaseElement() {
		return baseElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseElement(BaseElement newBaseElement, NotificationChain msgs) {
		BaseElement oldBaseElement = baseElement;
		baseElement = newBaseElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT, oldBaseElement, newBaseElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseElement(BaseElement newBaseElement) {
		if (newBaseElement != baseElement) {
			NotificationChain msgs = null;
			if (baseElement != null)
				msgs = ((InternalEObject)baseElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT, null, msgs);
			if (newBaseElement != null)
				msgs = ((InternalEObject)newBaseElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT, null, msgs);
			msgs = basicSetBaseElement(newBaseElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT, newBaseElement, newBaseElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getBaseElementWithMixedContent() {
		return baseElementWithMixedContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseElementWithMixedContent(BaseElement newBaseElementWithMixedContent, NotificationChain msgs) {
		BaseElement oldBaseElementWithMixedContent = baseElementWithMixedContent;
		baseElementWithMixedContent = newBaseElementWithMixedContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT, oldBaseElementWithMixedContent, newBaseElementWithMixedContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseElementWithMixedContent(BaseElement newBaseElementWithMixedContent) {
		if (newBaseElementWithMixedContent != baseElementWithMixedContent) {
			NotificationChain msgs = null;
			if (baseElementWithMixedContent != null)
				msgs = ((InternalEObject)baseElementWithMixedContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT, null, msgs);
			if (newBaseElementWithMixedContent != null)
				msgs = ((InternalEObject)newBaseElementWithMixedContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT, null, msgs);
			msgs = basicSetBaseElementWithMixedContent(newBaseElementWithMixedContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT, newBaseElementWithMixedContent, newBaseElementWithMixedContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryEvent getBoundaryEvent() {
		return boundaryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundaryEvent(BoundaryEvent newBoundaryEvent, NotificationChain msgs) {
		BoundaryEvent oldBoundaryEvent = boundaryEvent;
		boundaryEvent = newBoundaryEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__BOUNDARY_EVENT, oldBoundaryEvent, newBoundaryEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundaryEvent(BoundaryEvent newBoundaryEvent) {
		if (newBoundaryEvent != boundaryEvent) {
			NotificationChain msgs = null;
			if (boundaryEvent != null)
				msgs = ((InternalEObject)boundaryEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__BOUNDARY_EVENT, null, msgs);
			if (newBoundaryEvent != null)
				msgs = ((InternalEObject)newBoundaryEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__BOUNDARY_EVENT, null, msgs);
			msgs = basicSetBoundaryEvent(newBoundaryEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__BOUNDARY_EVENT, newBoundaryEvent, newBoundaryEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRuleTask getBusinessRuleTask() {
		return businessRuleTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessRuleTask(BusinessRuleTask newBusinessRuleTask, NotificationChain msgs) {
		BusinessRuleTask oldBusinessRuleTask = businessRuleTask;
		businessRuleTask = newBusinessRuleTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__BUSINESS_RULE_TASK, oldBusinessRuleTask, newBusinessRuleTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessRuleTask(BusinessRuleTask newBusinessRuleTask) {
		if (newBusinessRuleTask != businessRuleTask) {
			NotificationChain msgs = null;
			if (businessRuleTask != null)
				msgs = ((InternalEObject)businessRuleTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__BUSINESS_RULE_TASK, null, msgs);
			if (newBusinessRuleTask != null)
				msgs = ((InternalEObject)newBusinessRuleTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__BUSINESS_RULE_TASK, null, msgs);
			msgs = basicSetBusinessRuleTask(newBusinessRuleTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__BUSINESS_RULE_TASK, newBusinessRuleTask, newBusinessRuleTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallableElement getCallableElement() {
		return callableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallableElement(CallableElement newCallableElement, NotificationChain msgs) {
		CallableElement oldCallableElement = callableElement;
		callableElement = newCallableElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT, oldCallableElement, newCallableElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallableElement(CallableElement newCallableElement) {
		if (newCallableElement != callableElement) {
			NotificationChain msgs = null;
			if (callableElement != null)
				msgs = ((InternalEObject)callableElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT, null, msgs);
			if (newCallableElement != null)
				msgs = ((InternalEObject)newCallableElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT, null, msgs);
			msgs = basicSetCallableElement(newCallableElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT, newCallableElement, newCallableElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallActivity getCallActivity() {
		return callActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallActivity(CallActivity newCallActivity, NotificationChain msgs) {
		CallActivity oldCallActivity = callActivity;
		callActivity = newCallActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CALL_ACTIVITY, oldCallActivity, newCallActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallActivity(CallActivity newCallActivity) {
		if (newCallActivity != callActivity) {
			NotificationChain msgs = null;
			if (callActivity != null)
				msgs = ((InternalEObject)callActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CALL_ACTIVITY, null, msgs);
			if (newCallActivity != null)
				msgs = ((InternalEObject)newCallActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CALL_ACTIVITY, null, msgs);
			msgs = basicSetCallActivity(newCallActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CALL_ACTIVITY, newCallActivity, newCallActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallChoreography getCallChoreography() {
		return callChoreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallChoreography(CallChoreography newCallChoreography, NotificationChain msgs) {
		CallChoreography oldCallChoreography = callChoreography;
		callChoreography = newCallChoreography;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CHOREOGRAPHY, oldCallChoreography, newCallChoreography);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallChoreography(CallChoreography newCallChoreography) {
		if (newCallChoreography != callChoreography) {
			NotificationChain msgs = null;
			if (callChoreography != null)
				msgs = ((InternalEObject)callChoreography).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CHOREOGRAPHY, null, msgs);
			if (newCallChoreography != null)
				msgs = ((InternalEObject)newCallChoreography).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CHOREOGRAPHY, null, msgs);
			msgs = basicSetCallChoreography(newCallChoreography, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CHOREOGRAPHY, newCallChoreography, newCallChoreography));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConversation getCallConversation() {
		return callConversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallConversation(CallConversation newCallConversation, NotificationChain msgs) {
		CallConversation oldCallConversation = callConversation;
		callConversation = newCallConversation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CONVERSATION, oldCallConversation, newCallConversation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallConversation(CallConversation newCallConversation) {
		if (newCallConversation != callConversation) {
			NotificationChain msgs = null;
			if (callConversation != null)
				msgs = ((InternalEObject)callConversation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CONVERSATION, null, msgs);
			if (newCallConversation != null)
				msgs = ((InternalEObject)newCallConversation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CONVERSATION, null, msgs);
			msgs = basicSetCallConversation(newCallConversation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CONVERSATION, newCallConversation, newCallConversation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationNode getConversationNode() {
		return conversationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversationNode(ConversationNode newConversationNode, NotificationChain msgs) {
		ConversationNode oldConversationNode = conversationNode;
		conversationNode = newConversationNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_NODE, oldConversationNode, newConversationNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversationNode(ConversationNode newConversationNode) {
		if (newConversationNode != conversationNode) {
			NotificationChain msgs = null;
			if (conversationNode != null)
				msgs = ((InternalEObject)conversationNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_NODE, null, msgs);
			if (newConversationNode != null)
				msgs = ((InternalEObject)newConversationNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_NODE, null, msgs);
			msgs = basicSetConversationNode(newConversationNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_NODE, newConversationNode, newConversationNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelEventDefinition getCancelEventDefinition() {
		return cancelEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancelEventDefinition(CancelEventDefinition newCancelEventDefinition, NotificationChain msgs) {
		CancelEventDefinition oldCancelEventDefinition = cancelEventDefinition;
		cancelEventDefinition = newCancelEventDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION, oldCancelEventDefinition, newCancelEventDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelEventDefinition(CancelEventDefinition newCancelEventDefinition) {
		if (newCancelEventDefinition != cancelEventDefinition) {
			NotificationChain msgs = null;
			if (cancelEventDefinition != null)
				msgs = ((InternalEObject)cancelEventDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION, null, msgs);
			if (newCancelEventDefinition != null)
				msgs = ((InternalEObject)newCancelEventDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION, null, msgs);
			msgs = basicSetCancelEventDefinition(newCancelEventDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION, newCancelEventDefinition, newCancelEventDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefinition getEventDefinition() {
		return eventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventDefinition(EventDefinition newEventDefinition, NotificationChain msgs) {
		EventDefinition oldEventDefinition = eventDefinition;
		eventDefinition = newEventDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_DEFINITION, oldEventDefinition, newEventDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventDefinition(EventDefinition newEventDefinition) {
		if (newEventDefinition != eventDefinition) {
			NotificationChain msgs = null;
			if (eventDefinition != null)
				msgs = ((InternalEObject)eventDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_DEFINITION, null, msgs);
			if (newEventDefinition != null)
				msgs = ((InternalEObject)newEventDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_DEFINITION, null, msgs);
			msgs = basicSetEventDefinition(newEventDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_DEFINITION, newEventDefinition, newEventDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElement getRootElement() {
		return rootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootElement(RootElement newRootElement, NotificationChain msgs) {
		RootElement oldRootElement = rootElement;
		rootElement = newRootElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ROOT_ELEMENT, oldRootElement, newRootElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootElement(RootElement newRootElement) {
		if (newRootElement != rootElement) {
			NotificationChain msgs = null;
			if (rootElement != null)
				msgs = ((InternalEObject)rootElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ROOT_ELEMENT, null, msgs);
			if (newRootElement != null)
				msgs = ((InternalEObject)newRootElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ROOT_ELEMENT, null, msgs);
			msgs = basicSetRootElement(newRootElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ROOT_ELEMENT, newRootElement, newRootElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchEvent getCatchEvent() {
		return catchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatchEvent(CatchEvent newCatchEvent, NotificationChain msgs) {
		CatchEvent oldCatchEvent = catchEvent;
		catchEvent = newCatchEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CATCH_EVENT, oldCatchEvent, newCatchEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatchEvent(CatchEvent newCatchEvent) {
		if (newCatchEvent != catchEvent) {
			NotificationChain msgs = null;
			if (catchEvent != null)
				msgs = ((InternalEObject)catchEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CATCH_EVENT, null, msgs);
			if (newCatchEvent != null)
				msgs = ((InternalEObject)newCatchEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CATCH_EVENT, null, msgs);
			msgs = basicSetCatchEvent(newCatchEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CATCH_EVENT, newCatchEvent, newCatchEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(Category newCategory, NotificationChain msgs) {
		Category oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryValue getCategoryValue() {
		return categoryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategoryValue(CategoryValue newCategoryValue, NotificationChain msgs) {
		CategoryValue oldCategoryValue = categoryValue;
		categoryValue = newCategoryValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY_VALUE, oldCategoryValue, newCategoryValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoryValue(CategoryValue newCategoryValue) {
		if (newCategoryValue != categoryValue) {
			NotificationChain msgs = null;
			if (categoryValue != null)
				msgs = ((InternalEObject)categoryValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY_VALUE, null, msgs);
			if (newCategoryValue != null)
				msgs = ((InternalEObject)newCategoryValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY_VALUE, null, msgs);
			msgs = basicSetCategoryValue(newCategoryValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY_VALUE, newCategoryValue, newCategoryValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choreography getChoreography() {
		return choreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChoreography(Choreography newChoreography, NotificationChain msgs) {
		Choreography oldChoreography = choreography;
		choreography = newChoreography;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY, oldChoreography, newChoreography);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoreography(Choreography newChoreography) {
		if (newChoreography != choreography) {
			NotificationChain msgs = null;
			if (choreography != null)
				msgs = ((InternalEObject)choreography).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY, null, msgs);
			if (newChoreography != null)
				msgs = ((InternalEObject)newChoreography).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY, null, msgs);
			msgs = basicSetChoreography(newChoreography, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY, newChoreography, newChoreography));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration getCollaboration() {
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollaboration(Collaboration newCollaboration, NotificationChain msgs) {
		Collaboration oldCollaboration = collaboration;
		collaboration = newCollaboration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__COLLABORATION, oldCollaboration, newCollaboration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollaboration(Collaboration newCollaboration) {
		if (newCollaboration != collaboration) {
			NotificationChain msgs = null;
			if (collaboration != null)
				msgs = ((InternalEObject)collaboration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__COLLABORATION, null, msgs);
			if (newCollaboration != null)
				msgs = ((InternalEObject)newCollaboration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__COLLABORATION, null, msgs);
			msgs = basicSetCollaboration(newCollaboration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__COLLABORATION, newCollaboration, newCollaboration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyActivity getChoreographyActivity() {
		return choreographyActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChoreographyActivity(ChoreographyActivity newChoreographyActivity, NotificationChain msgs) {
		ChoreographyActivity oldChoreographyActivity = choreographyActivity;
		choreographyActivity = newChoreographyActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY, oldChoreographyActivity, newChoreographyActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoreographyActivity(ChoreographyActivity newChoreographyActivity) {
		if (newChoreographyActivity != choreographyActivity) {
			NotificationChain msgs = null;
			if (choreographyActivity != null)
				msgs = ((InternalEObject)choreographyActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY, null, msgs);
			if (newChoreographyActivity != null)
				msgs = ((InternalEObject)newChoreographyActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY, null, msgs);
			msgs = basicSetChoreographyActivity(newChoreographyActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY, newChoreographyActivity, newChoreographyActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyTask getChoreographyTask() {
		return choreographyTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChoreographyTask(ChoreographyTask newChoreographyTask, NotificationChain msgs) {
		ChoreographyTask oldChoreographyTask = choreographyTask;
		choreographyTask = newChoreographyTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_TASK, oldChoreographyTask, newChoreographyTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoreographyTask(ChoreographyTask newChoreographyTask) {
		if (newChoreographyTask != choreographyTask) {
			NotificationChain msgs = null;
			if (choreographyTask != null)
				msgs = ((InternalEObject)choreographyTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_TASK, null, msgs);
			if (newChoreographyTask != null)
				msgs = ((InternalEObject)newChoreographyTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_TASK, null, msgs);
			msgs = basicSetChoreographyTask(newChoreographyTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_TASK, newChoreographyTask, newChoreographyTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensateEventDefinition getCompensateEventDefinition() {
		return compensateEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompensateEventDefinition(CompensateEventDefinition newCompensateEventDefinition, NotificationChain msgs) {
		CompensateEventDefinition oldCompensateEventDefinition = compensateEventDefinition;
		compensateEventDefinition = newCompensateEventDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION, oldCompensateEventDefinition, newCompensateEventDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensateEventDefinition(CompensateEventDefinition newCompensateEventDefinition) {
		if (newCompensateEventDefinition != compensateEventDefinition) {
			NotificationChain msgs = null;
			if (compensateEventDefinition != null)
				msgs = ((InternalEObject)compensateEventDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION, null, msgs);
			if (newCompensateEventDefinition != null)
				msgs = ((InternalEObject)newCompensateEventDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION, null, msgs);
			msgs = basicSetCompensateEventDefinition(newCompensateEventDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION, newCompensateEventDefinition, newCompensateEventDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexBehaviorDefinition getComplexBehaviorDefinition() {
		return complexBehaviorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexBehaviorDefinition(ComplexBehaviorDefinition newComplexBehaviorDefinition, NotificationChain msgs) {
		ComplexBehaviorDefinition oldComplexBehaviorDefinition = complexBehaviorDefinition;
		complexBehaviorDefinition = newComplexBehaviorDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION, oldComplexBehaviorDefinition, newComplexBehaviorDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexBehaviorDefinition(ComplexBehaviorDefinition newComplexBehaviorDefinition) {
		if (newComplexBehaviorDefinition != complexBehaviorDefinition) {
			NotificationChain msgs = null;
			if (complexBehaviorDefinition != null)
				msgs = ((InternalEObject)complexBehaviorDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION, null, msgs);
			if (newComplexBehaviorDefinition != null)
				msgs = ((InternalEObject)newComplexBehaviorDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION, null, msgs);
			msgs = basicSetComplexBehaviorDefinition(newComplexBehaviorDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION, newComplexBehaviorDefinition, newComplexBehaviorDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexGateway getComplexGateway() {
		return complexGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexGateway(ComplexGateway newComplexGateway, NotificationChain msgs) {
		ComplexGateway oldComplexGateway = complexGateway;
		complexGateway = newComplexGateway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_GATEWAY, oldComplexGateway, newComplexGateway);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexGateway(ComplexGateway newComplexGateway) {
		if (newComplexGateway != complexGateway) {
			NotificationChain msgs = null;
			if (complexGateway != null)
				msgs = ((InternalEObject)complexGateway).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_GATEWAY, null, msgs);
			if (newComplexGateway != null)
				msgs = ((InternalEObject)newComplexGateway).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_GATEWAY, null, msgs);
			msgs = basicSetComplexGateway(newComplexGateway, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_GATEWAY, newComplexGateway, newComplexGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalEventDefinition getConditionalEventDefinition() {
		return conditionalEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalEventDefinition(ConditionalEventDefinition newConditionalEventDefinition, NotificationChain msgs) {
		ConditionalEventDefinition oldConditionalEventDefinition = conditionalEventDefinition;
		conditionalEventDefinition = newConditionalEventDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION, oldConditionalEventDefinition, newConditionalEventDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalEventDefinition(ConditionalEventDefinition newConditionalEventDefinition) {
		if (newConditionalEventDefinition != conditionalEventDefinition) {
			NotificationChain msgs = null;
			if (conditionalEventDefinition != null)
				msgs = ((InternalEObject)conditionalEventDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION, null, msgs);
			if (newConditionalEventDefinition != null)
				msgs = ((InternalEObject)newConditionalEventDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION, null, msgs);
			msgs = basicSetConditionalEventDefinition(newConditionalEventDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION, newConditionalEventDefinition, newConditionalEventDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conversation getConversation() {
		return conversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversation(Conversation newConversation, NotificationChain msgs) {
		Conversation oldConversation = conversation;
		conversation = newConversation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION, oldConversation, newConversation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversation(Conversation newConversation) {
		if (newConversation != conversation) {
			NotificationChain msgs = null;
			if (conversation != null)
				msgs = ((InternalEObject)conversation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION, null, msgs);
			if (newConversation != null)
				msgs = ((InternalEObject)newConversation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION, null, msgs);
			msgs = basicSetConversation(newConversation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION, newConversation, newConversation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationAssociation getConversationAssociation() {
		return conversationAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversationAssociation(ConversationAssociation newConversationAssociation, NotificationChain msgs) {
		ConversationAssociation oldConversationAssociation = conversationAssociation;
		conversationAssociation = newConversationAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION, oldConversationAssociation, newConversationAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversationAssociation(ConversationAssociation newConversationAssociation) {
		if (newConversationAssociation != conversationAssociation) {
			NotificationChain msgs = null;
			if (conversationAssociation != null)
				msgs = ((InternalEObject)conversationAssociation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION, null, msgs);
			if (newConversationAssociation != null)
				msgs = ((InternalEObject)newConversationAssociation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION, null, msgs);
			msgs = basicSetConversationAssociation(newConversationAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION, newConversationAssociation, newConversationAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationLink getConversationLink() {
		return conversationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversationLink(ConversationLink newConversationLink, NotificationChain msgs) {
		ConversationLink oldConversationLink = conversationLink;
		conversationLink = newConversationLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_LINK, oldConversationLink, newConversationLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversationLink(ConversationLink newConversationLink) {
		if (newConversationLink != conversationLink) {
			NotificationChain msgs = null;
			if (conversationLink != null)
				msgs = ((InternalEObject)conversationLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_LINK, null, msgs);
			if (newConversationLink != null)
				msgs = ((InternalEObject)newConversationLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_LINK, null, msgs);
			msgs = basicSetConversationLink(newConversationLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_LINK, newConversationLink, newConversationLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationKey getCorrelationKey() {
		return correlationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationKey(CorrelationKey newCorrelationKey, NotificationChain msgs) {
		CorrelationKey oldCorrelationKey = correlationKey;
		correlationKey = newCorrelationKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_KEY, oldCorrelationKey, newCorrelationKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationKey(CorrelationKey newCorrelationKey) {
		if (newCorrelationKey != correlationKey) {
			NotificationChain msgs = null;
			if (correlationKey != null)
				msgs = ((InternalEObject)correlationKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_KEY, null, msgs);
			if (newCorrelationKey != null)
				msgs = ((InternalEObject)newCorrelationKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_KEY, null, msgs);
			msgs = basicSetCorrelationKey(newCorrelationKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_KEY, newCorrelationKey, newCorrelationKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationProperty getCorrelationProperty() {
		return correlationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationProperty(CorrelationProperty newCorrelationProperty, NotificationChain msgs) {
		CorrelationProperty oldCorrelationProperty = correlationProperty;
		correlationProperty = newCorrelationProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY, oldCorrelationProperty, newCorrelationProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationProperty(CorrelationProperty newCorrelationProperty) {
		if (newCorrelationProperty != correlationProperty) {
			NotificationChain msgs = null;
			if (correlationProperty != null)
				msgs = ((InternalEObject)correlationProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY, null, msgs);
			if (newCorrelationProperty != null)
				msgs = ((InternalEObject)newCorrelationProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY, null, msgs);
			msgs = basicSetCorrelationProperty(newCorrelationProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY, newCorrelationProperty, newCorrelationProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationPropertyBinding getCorrelationPropertyBinding() {
		return correlationPropertyBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationPropertyBinding(CorrelationPropertyBinding newCorrelationPropertyBinding, NotificationChain msgs) {
		CorrelationPropertyBinding oldCorrelationPropertyBinding = correlationPropertyBinding;
		correlationPropertyBinding = newCorrelationPropertyBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING, oldCorrelationPropertyBinding, newCorrelationPropertyBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationPropertyBinding(CorrelationPropertyBinding newCorrelationPropertyBinding) {
		if (newCorrelationPropertyBinding != correlationPropertyBinding) {
			NotificationChain msgs = null;
			if (correlationPropertyBinding != null)
				msgs = ((InternalEObject)correlationPropertyBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING, null, msgs);
			if (newCorrelationPropertyBinding != null)
				msgs = ((InternalEObject)newCorrelationPropertyBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING, null, msgs);
			msgs = basicSetCorrelationPropertyBinding(newCorrelationPropertyBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING, newCorrelationPropertyBinding, newCorrelationPropertyBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationPropertyRetrievalExpression getCorrelationPropertyRetrievalExpression() {
		return correlationPropertyRetrievalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationPropertyRetrievalExpression(CorrelationPropertyRetrievalExpression newCorrelationPropertyRetrievalExpression, NotificationChain msgs) {
		CorrelationPropertyRetrievalExpression oldCorrelationPropertyRetrievalExpression = correlationPropertyRetrievalExpression;
		correlationPropertyRetrievalExpression = newCorrelationPropertyRetrievalExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION, oldCorrelationPropertyRetrievalExpression, newCorrelationPropertyRetrievalExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationPropertyRetrievalExpression(CorrelationPropertyRetrievalExpression newCorrelationPropertyRetrievalExpression) {
		if (newCorrelationPropertyRetrievalExpression != correlationPropertyRetrievalExpression) {
			NotificationChain msgs = null;
			if (correlationPropertyRetrievalExpression != null)
				msgs = ((InternalEObject)correlationPropertyRetrievalExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION, null, msgs);
			if (newCorrelationPropertyRetrievalExpression != null)
				msgs = ((InternalEObject)newCorrelationPropertyRetrievalExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION, null, msgs);
			msgs = basicSetCorrelationPropertyRetrievalExpression(newCorrelationPropertyRetrievalExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION, newCorrelationPropertyRetrievalExpression, newCorrelationPropertyRetrievalExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationSubscription getCorrelationSubscription() {
		return correlationSubscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationSubscription(CorrelationSubscription newCorrelationSubscription, NotificationChain msgs) {
		CorrelationSubscription oldCorrelationSubscription = correlationSubscription;
		correlationSubscription = newCorrelationSubscription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION, oldCorrelationSubscription, newCorrelationSubscription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationSubscription(CorrelationSubscription newCorrelationSubscription) {
		if (newCorrelationSubscription != correlationSubscription) {
			NotificationChain msgs = null;
			if (correlationSubscription != null)
				msgs = ((InternalEObject)correlationSubscription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION, null, msgs);
			if (newCorrelationSubscription != null)
				msgs = ((InternalEObject)newCorrelationSubscription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION, null, msgs);
			msgs = basicSetCorrelationSubscription(newCorrelationSubscription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION, newCorrelationSubscription, newCorrelationSubscription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAssociation getDataAssociation() {
		return dataAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataAssociation(DataAssociation newDataAssociation, NotificationChain msgs) {
		DataAssociation oldDataAssociation = dataAssociation;
		dataAssociation = newDataAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_ASSOCIATION, oldDataAssociation, newDataAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataAssociation(DataAssociation newDataAssociation) {
		if (newDataAssociation != dataAssociation) {
			NotificationChain msgs = null;
			if (dataAssociation != null)
				msgs = ((InternalEObject)dataAssociation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_ASSOCIATION, null, msgs);
			if (newDataAssociation != null)
				msgs = ((InternalEObject)newDataAssociation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_ASSOCIATION, null, msgs);
			msgs = basicSetDataAssociation(newDataAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_ASSOCIATION, newDataAssociation, newDataAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInput getDataInput() {
		return dataInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataInput(DataInput newDataInput, NotificationChain msgs) {
		DataInput oldDataInput = dataInput;
		dataInput = newDataInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT, oldDataInput, newDataInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataInput(DataInput newDataInput) {
		if (newDataInput != dataInput) {
			NotificationChain msgs = null;
			if (dataInput != null)
				msgs = ((InternalEObject)dataInput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT, null, msgs);
			if (newDataInput != null)
				msgs = ((InternalEObject)newDataInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT, null, msgs);
			msgs = basicSetDataInput(newDataInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT, newDataInput, newDataInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInputAssociation getDataInputAssociation() {
		return dataInputAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataInputAssociation(DataInputAssociation newDataInputAssociation, NotificationChain msgs) {
		DataInputAssociation oldDataInputAssociation = dataInputAssociation;
		dataInputAssociation = newDataInputAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION, oldDataInputAssociation, newDataInputAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataInputAssociation(DataInputAssociation newDataInputAssociation) {
		if (newDataInputAssociation != dataInputAssociation) {
			NotificationChain msgs = null;
			if (dataInputAssociation != null)
				msgs = ((InternalEObject)dataInputAssociation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION, null, msgs);
			if (newDataInputAssociation != null)
				msgs = ((InternalEObject)newDataInputAssociation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION, null, msgs);
			msgs = basicSetDataInputAssociation(newDataInputAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION, newDataInputAssociation, newDataInputAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject getDataObject() {
		return dataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataObject(DataObject newDataObject, NotificationChain msgs) {
		DataObject oldDataObject = dataObject;
		dataObject = newDataObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT, oldDataObject, newDataObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataObject(DataObject newDataObject) {
		if (newDataObject != dataObject) {
			NotificationChain msgs = null;
			if (dataObject != null)
				msgs = ((InternalEObject)dataObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT, null, msgs);
			if (newDataObject != null)
				msgs = ((InternalEObject)newDataObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT, null, msgs);
			msgs = basicSetDataObject(newDataObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT, newDataObject, newDataObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectReference getDataObjectReference() {
		return dataObjectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataObjectReference(DataObjectReference newDataObjectReference, NotificationChain msgs) {
		DataObjectReference oldDataObjectReference = dataObjectReference;
		dataObjectReference = newDataObjectReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT_REFERENCE, oldDataObjectReference, newDataObjectReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataObjectReference(DataObjectReference newDataObjectReference) {
		if (newDataObjectReference != dataObjectReference) {
			NotificationChain msgs = null;
			if (dataObjectReference != null)
				msgs = ((InternalEObject)dataObjectReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT_REFERENCE, null, msgs);
			if (newDataObjectReference != null)
				msgs = ((InternalEObject)newDataObjectReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT_REFERENCE, null, msgs);
			msgs = basicSetDataObjectReference(newDataObjectReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT_REFERENCE, newDataObjectReference, newDataObjectReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutput getDataOutput() {
		return dataOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataOutput(DataOutput newDataOutput, NotificationChain msgs) {
		DataOutput oldDataOutput = dataOutput;
		dataOutput = newDataOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT, oldDataOutput, newDataOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataOutput(DataOutput newDataOutput) {
		if (newDataOutput != dataOutput) {
			NotificationChain msgs = null;
			if (dataOutput != null)
				msgs = ((InternalEObject)dataOutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT, null, msgs);
			if (newDataOutput != null)
				msgs = ((InternalEObject)newDataOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT, null, msgs);
			msgs = basicSetDataOutput(newDataOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT, newDataOutput, newDataOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutputAssociation getDataOutputAssociation() {
		return dataOutputAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataOutputAssociation(DataOutputAssociation newDataOutputAssociation, NotificationChain msgs) {
		DataOutputAssociation oldDataOutputAssociation = dataOutputAssociation;
		dataOutputAssociation = newDataOutputAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION, oldDataOutputAssociation, newDataOutputAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataOutputAssociation(DataOutputAssociation newDataOutputAssociation) {
		if (newDataOutputAssociation != dataOutputAssociation) {
			NotificationChain msgs = null;
			if (dataOutputAssociation != null)
				msgs = ((InternalEObject)dataOutputAssociation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION, null, msgs);
			if (newDataOutputAssociation != null)
				msgs = ((InternalEObject)newDataOutputAssociation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION, null, msgs);
			msgs = basicSetDataOutputAssociation(newDataOutputAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION, newDataOutputAssociation, newDataOutputAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataState getDataState() {
		return dataState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataState(DataState newDataState, NotificationChain msgs) {
		DataState oldDataState = dataState;
		dataState = newDataState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STATE, oldDataState, newDataState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataState(DataState newDataState) {
		if (newDataState != dataState) {
			NotificationChain msgs = null;
			if (dataState != null)
				msgs = ((InternalEObject)dataState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STATE, null, msgs);
			if (newDataState != null)
				msgs = ((InternalEObject)newDataState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STATE, null, msgs);
			msgs = basicSetDataState(newDataState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STATE, newDataState, newDataState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStore getDataStore() {
		return dataStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataStore(DataStore newDataStore, NotificationChain msgs) {
		DataStore oldDataStore = dataStore;
		dataStore = newDataStore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE, oldDataStore, newDataStore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStore(DataStore newDataStore) {
		if (newDataStore != dataStore) {
			NotificationChain msgs = null;
			if (dataStore != null)
				msgs = ((InternalEObject)dataStore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE, null, msgs);
			if (newDataStore != null)
				msgs = ((InternalEObject)newDataStore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE, null, msgs);
			msgs = basicSetDataStore(newDataStore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE, newDataStore, newDataStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStoreReference getDataStoreReference() {
		return dataStoreReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataStoreReference(DataStoreReference newDataStoreReference, NotificationChain msgs) {
		DataStoreReference oldDataStoreReference = dataStoreReference;
		dataStoreReference = newDataStoreReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE_REFERENCE, oldDataStoreReference, newDataStoreReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStoreReference(DataStoreReference newDataStoreReference) {
		if (newDataStoreReference != dataStoreReference) {
			NotificationChain msgs = null;
			if (dataStoreReference != null)
				msgs = ((InternalEObject)dataStoreReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE_REFERENCE, null, msgs);
			if (newDataStoreReference != null)
				msgs = ((InternalEObject)newDataStoreReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE_REFERENCE, null, msgs);
			msgs = basicSetDataStoreReference(newDataStoreReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE_REFERENCE, newDataStoreReference, newDataStoreReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definitions getDefinitions() {
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitions(Definitions newDefinitions, NotificationChain msgs) {
		Definitions oldDefinitions = definitions;
		definitions = newDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DEFINITIONS, oldDefinitions, newDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitions(Definitions newDefinitions) {
		if (newDefinitions != definitions) {
			NotificationChain msgs = null;
			if (definitions != null)
				msgs = ((InternalEObject)definitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DEFINITIONS, null, msgs);
			if (newDefinitions != null)
				msgs = ((InternalEObject)newDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DEFINITIONS, null, msgs);
			msgs = basicSetDefinitions(newDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DEFINITIONS, newDefinitions, newDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(Documentation newDocumentation, NotificationChain msgs) {
		Documentation oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(Documentation newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent getEndEvent() {
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndEvent(EndEvent newEndEvent, NotificationChain msgs) {
		EndEvent oldEndEvent = endEvent;
		endEvent = newEndEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__END_EVENT, oldEndEvent, newEndEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndEvent(EndEvent newEndEvent) {
		if (newEndEvent != endEvent) {
			NotificationChain msgs = null;
			if (endEvent != null)
				msgs = ((InternalEObject)endEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__END_EVENT, null, msgs);
			if (newEndEvent != null)
				msgs = ((InternalEObject)newEndEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__END_EVENT, null, msgs);
			msgs = basicSetEndEvent(newEndEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__END_EVENT, newEndEvent, newEndEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPoint getEndPoint() {
		return endPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndPoint(EndPoint newEndPoint, NotificationChain msgs) {
		EndPoint oldEndPoint = endPoint;
		endPoint = newEndPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__END_POINT, oldEndPoint, newEndPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPoint(EndPoint newEndPoint) {
		if (newEndPoint != endPoint) {
			NotificationChain msgs = null;
			if (endPoint != null)
				msgs = ((InternalEObject)endPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__END_POINT, null, msgs);
			if (newEndPoint != null)
				msgs = ((InternalEObject)newEndPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__END_POINT, null, msgs);
			msgs = basicSetEndPoint(newEndPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__END_POINT, newEndPoint, newEndPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.emftrace.metamodel.BPMN2Model.Error getError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetError(org.emftrace.metamodel.BPMN2Model.Error newError, NotificationChain msgs) {
		org.emftrace.metamodel.BPMN2Model.Error oldError = error;
		error = newError;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ERROR, oldError, newError);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(org.emftrace.metamodel.BPMN2Model.Error newError) {
		if (newError != error) {
			NotificationChain msgs = null;
			if (error != null)
				msgs = ((InternalEObject)error).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ERROR, null, msgs);
			if (newError != null)
				msgs = ((InternalEObject)newError).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ERROR, null, msgs);
			msgs = basicSetError(newError, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ERROR, newError, newError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorEventDefinition getErrorEventDefinition() {
		return errorEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorEventDefinition(ErrorEventDefinition newErrorEventDefinition, NotificationChain msgs) {
		ErrorEventDefinition oldErrorEventDefinition = errorEventDefinition;
		errorEventDefinition = newErrorEventDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION, oldErrorEventDefinition, newErrorEventDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorEventDefinition(ErrorEventDefinition newErrorEventDefinition) {
		if (newErrorEventDefinition != errorEventDefinition) {
			NotificationChain msgs = null;
			if (errorEventDefinition != null)
				msgs = ((InternalEObject)errorEventDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION, null, msgs);
			if (newErrorEventDefinition != null)
				msgs = ((InternalEObject)newErrorEventDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION, null, msgs);
			msgs = basicSetErrorEventDefinition(newErrorEventDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION, newErrorEventDefinition, newErrorEventDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Escalation getEscalation() {
		return escalation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEscalation(Escalation newEscalation, NotificationChain msgs) {
		Escalation oldEscalation = escalation;
		escalation = newEscalation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION, oldEscalation, newEscalation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscalation(Escalation newEscalation) {
		if (newEscalation != escalation) {
			NotificationChain msgs = null;
			if (escalation != null)
				msgs = ((InternalEObject)escalation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION, null, msgs);
			if (newEscalation != null)
				msgs = ((InternalEObject)newEscalation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION, null, msgs);
			msgs = basicSetEscalation(newEscalation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION, newEscalation, newEscalation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EscalationEventDefinition getEscalationEventDefinition() {
		return escalationEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEscalationEventDefinition(EscalationEventDefinition newEscalationEventDefinition, NotificationChain msgs) {
		EscalationEventDefinition oldEscalationEventDefinition = escalationEventDefinition;
		escalationEventDefinition = newEscalationEventDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION, oldEscalationEventDefinition, newEscalationEventDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscalationEventDefinition(EscalationEventDefinition newEscalationEventDefinition) {
		if (newEscalationEventDefinition != escalationEventDefinition) {
			NotificationChain msgs = null;
			if (escalationEventDefinition != null)
				msgs = ((InternalEObject)escalationEventDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION, null, msgs);
			if (newEscalationEventDefinition != null)
				msgs = ((InternalEObject)newEscalationEventDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION, null, msgs);
			msgs = basicSetEscalationEventDefinition(newEscalationEventDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION, newEscalationEventDefinition, newEscalationEventDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(Event newEvent, NotificationChain msgs) {
		Event oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__EVENT, oldEvent, newEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(Event newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__EVENT, null, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__EVENT, null, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__EVENT, newEvent, newEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedGateway getEventBasedGateway() {
		return eventBasedGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventBasedGateway(EventBasedGateway newEventBasedGateway, NotificationChain msgs) {
		EventBasedGateway oldEventBasedGateway = eventBasedGateway;
		eventBasedGateway = newEventBasedGateway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_BASED_GATEWAY, oldEventBasedGateway, newEventBasedGateway);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventBasedGateway(EventBasedGateway newEventBasedGateway) {
		if (newEventBasedGateway != eventBasedGateway) {
			NotificationChain msgs = null;
			if (eventBasedGateway != null)
				msgs = ((InternalEObject)eventBasedGateway).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_BASED_GATEWAY, null, msgs);
			if (newEventBasedGateway != null)
				msgs = ((InternalEObject)newEventBasedGateway).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_BASED_GATEWAY, null, msgs);
			msgs = basicSetEventBasedGateway(newEventBasedGateway, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_BASED_GATEWAY, newEventBasedGateway, newEventBasedGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveGateway getExclusiveGateway() {
		return exclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExclusiveGateway(ExclusiveGateway newExclusiveGateway, NotificationChain msgs) {
		ExclusiveGateway oldExclusiveGateway = exclusiveGateway;
		exclusiveGateway = newExclusiveGateway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY, oldExclusiveGateway, newExclusiveGateway);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveGateway(ExclusiveGateway newExclusiveGateway) {
		if (newExclusiveGateway != exclusiveGateway) {
			NotificationChain msgs = null;
			if (exclusiveGateway != null)
				msgs = ((InternalEObject)exclusiveGateway).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY, null, msgs);
			if (newExclusiveGateway != null)
				msgs = ((InternalEObject)newExclusiveGateway).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY, null, msgs);
			msgs = basicSetExclusiveGateway(newExclusiveGateway, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY, newExclusiveGateway, newExclusiveGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtension(Extension newExtension, NotificationChain msgs) {
		Extension oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION, oldExtension, newExtension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(Extension newExtension) {
		if (newExtension != extension) {
			NotificationChain msgs = null;
			if (extension != null)
				msgs = ((InternalEObject)extension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION, null, msgs);
			if (newExtension != null)
				msgs = ((InternalEObject)newExtension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION, null, msgs);
			msgs = basicSetExtension(newExtension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION, newExtension, newExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAttributeValue getExtensionElements() {
		return extensionElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionElements(ExtensionAttributeValue newExtensionElements, NotificationChain msgs) {
		ExtensionAttributeValue oldExtensionElements = extensionElements;
		extensionElements = newExtensionElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION_ELEMENTS, oldExtensionElements, newExtensionElements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionElements(ExtensionAttributeValue newExtensionElements) {
		if (newExtensionElements != extensionElements) {
			NotificationChain msgs = null;
			if (extensionElements != null)
				msgs = ((InternalEObject)extensionElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION_ELEMENTS, null, msgs);
			if (newExtensionElements != null)
				msgs = ((InternalEObject)newExtensionElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION_ELEMENTS, null, msgs);
			msgs = basicSetExtensionElements(newExtensionElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION_ELEMENTS, newExtensionElements, newExtensionElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode getFlowNode() {
		return flowNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowNode(FlowNode newFlowNode, NotificationChain msgs) {
		FlowNode oldFlowNode = flowNode;
		flowNode = newFlowNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_NODE, oldFlowNode, newFlowNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowNode(FlowNode newFlowNode) {
		if (newFlowNode != flowNode) {
			NotificationChain msgs = null;
			if (flowNode != null)
				msgs = ((InternalEObject)flowNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_NODE, null, msgs);
			if (newFlowNode != null)
				msgs = ((InternalEObject)newFlowNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_NODE, null, msgs);
			msgs = basicSetFlowNode(newFlowNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_NODE, newFlowNode, newFlowNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression getFormalExpression() {
		return formalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormalExpression(FormalExpression newFormalExpression, NotificationChain msgs) {
		FormalExpression oldFormalExpression = formalExpression;
		formalExpression = newFormalExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__FORMAL_EXPRESSION, oldFormalExpression, newFormalExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormalExpression(FormalExpression newFormalExpression) {
		if (newFormalExpression != formalExpression) {
			NotificationChain msgs = null;
			if (formalExpression != null)
				msgs = ((InternalEObject)formalExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__FORMAL_EXPRESSION, null, msgs);
			if (newFormalExpression != null)
				msgs = ((InternalEObject)newFormalExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__FORMAL_EXPRESSION, null, msgs);
			msgs = basicSetFormalExpression(newFormalExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__FORMAL_EXPRESSION, newFormalExpression, newFormalExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway getGateway() {
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGateway(Gateway newGateway, NotificationChain msgs) {
		Gateway oldGateway = gateway;
		gateway = newGateway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__GATEWAY, oldGateway, newGateway);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalBusinessRuleTask getGlobalBusinessRuleTask() {
		return globalBusinessRuleTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalBusinessRuleTask(GlobalBusinessRuleTask newGlobalBusinessRuleTask, NotificationChain msgs) {
		GlobalBusinessRuleTask oldGlobalBusinessRuleTask = globalBusinessRuleTask;
		globalBusinessRuleTask = newGlobalBusinessRuleTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK, oldGlobalBusinessRuleTask, newGlobalBusinessRuleTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalBusinessRuleTask(GlobalBusinessRuleTask newGlobalBusinessRuleTask) {
		if (newGlobalBusinessRuleTask != globalBusinessRuleTask) {
			NotificationChain msgs = null;
			if (globalBusinessRuleTask != null)
				msgs = ((InternalEObject)globalBusinessRuleTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK, null, msgs);
			if (newGlobalBusinessRuleTask != null)
				msgs = ((InternalEObject)newGlobalBusinessRuleTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK, null, msgs);
			msgs = basicSetGlobalBusinessRuleTask(newGlobalBusinessRuleTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK, newGlobalBusinessRuleTask, newGlobalBusinessRuleTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalChoreographyTask getGlobalChoreographyTask() {
		return globalChoreographyTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalChoreographyTask(GlobalChoreographyTask newGlobalChoreographyTask, NotificationChain msgs) {
		GlobalChoreographyTask oldGlobalChoreographyTask = globalChoreographyTask;
		globalChoreographyTask = newGlobalChoreographyTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK, oldGlobalChoreographyTask, newGlobalChoreographyTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalChoreographyTask(GlobalChoreographyTask newGlobalChoreographyTask) {
		if (newGlobalChoreographyTask != globalChoreographyTask) {
			NotificationChain msgs = null;
			if (globalChoreographyTask != null)
				msgs = ((InternalEObject)globalChoreographyTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK, null, msgs);
			if (newGlobalChoreographyTask != null)
				msgs = ((InternalEObject)newGlobalChoreographyTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK, null, msgs);
			msgs = basicSetGlobalChoreographyTask(newGlobalChoreographyTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK, newGlobalChoreographyTask, newGlobalChoreographyTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalConversation getGlobalConversation() {
		return globalConversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalConversation(GlobalConversation newGlobalConversation, NotificationChain msgs) {
		GlobalConversation oldGlobalConversation = globalConversation;
		globalConversation = newGlobalConversation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CONVERSATION, oldGlobalConversation, newGlobalConversation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalConversation(GlobalConversation newGlobalConversation) {
		if (newGlobalConversation != globalConversation) {
			NotificationChain msgs = null;
			if (globalConversation != null)
				msgs = ((InternalEObject)globalConversation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CONVERSATION, null, msgs);
			if (newGlobalConversation != null)
				msgs = ((InternalEObject)newGlobalConversation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CONVERSATION, null, msgs);
			msgs = basicSetGlobalConversation(newGlobalConversation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CONVERSATION, newGlobalConversation, newGlobalConversation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalManualTask getGlobalManualTask() {
		return globalManualTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalManualTask(GlobalManualTask newGlobalManualTask, NotificationChain msgs) {
		GlobalManualTask oldGlobalManualTask = globalManualTask;
		globalManualTask = newGlobalManualTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK, oldGlobalManualTask, newGlobalManualTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalManualTask(GlobalManualTask newGlobalManualTask) {
		if (newGlobalManualTask != globalManualTask) {
			NotificationChain msgs = null;
			if (globalManualTask != null)
				msgs = ((InternalEObject)globalManualTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK, null, msgs);
			if (newGlobalManualTask != null)
				msgs = ((InternalEObject)newGlobalManualTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK, null, msgs);
			msgs = basicSetGlobalManualTask(newGlobalManualTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK, newGlobalManualTask, newGlobalManualTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalScriptTask getGlobalScriptTask() {
		return globalScriptTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalScriptTask(GlobalScriptTask newGlobalScriptTask, NotificationChain msgs) {
		GlobalScriptTask oldGlobalScriptTask = globalScriptTask;
		globalScriptTask = newGlobalScriptTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK, oldGlobalScriptTask, newGlobalScriptTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalScriptTask(GlobalScriptTask newGlobalScriptTask) {
		if (newGlobalScriptTask != globalScriptTask) {
			NotificationChain msgs = null;
			if (globalScriptTask != null)
				msgs = ((InternalEObject)globalScriptTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK, null, msgs);
			if (newGlobalScriptTask != null)
				msgs = ((InternalEObject)newGlobalScriptTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK, null, msgs);
			msgs = basicSetGlobalScriptTask(newGlobalScriptTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK, newGlobalScriptTask, newGlobalScriptTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalTask getGlobalTask() {
		return globalTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalTask(GlobalTask newGlobalTask, NotificationChain msgs) {
		GlobalTask oldGlobalTask = globalTask;
		globalTask = newGlobalTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_TASK, oldGlobalTask, newGlobalTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalTask(GlobalTask newGlobalTask) {
		if (newGlobalTask != globalTask) {
			NotificationChain msgs = null;
			if (globalTask != null)
				msgs = ((InternalEObject)globalTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_TASK, null, msgs);
			if (newGlobalTask != null)
				msgs = ((InternalEObject)newGlobalTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_TASK, null, msgs);
			msgs = basicSetGlobalTask(newGlobalTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_TASK, newGlobalTask, newGlobalTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalUserTask getGlobalUserTask() {
		return globalUserTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalUserTask(GlobalUserTask newGlobalUserTask, NotificationChain msgs) {
		GlobalUserTask oldGlobalUserTask = globalUserTask;
		globalUserTask = newGlobalUserTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_USER_TASK, oldGlobalUserTask, newGlobalUserTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalUserTask(GlobalUserTask newGlobalUserTask) {
		if (newGlobalUserTask != globalUserTask) {
			NotificationChain msgs = null;
			if (globalUserTask != null)
				msgs = ((InternalEObject)globalUserTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_USER_TASK, null, msgs);
			if (newGlobalUserTask != null)
				msgs = ((InternalEObject)newGlobalUserTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_USER_TASK, null, msgs);
			msgs = basicSetGlobalUserTask(newGlobalUserTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_USER_TASK, newGlobalUserTask, newGlobalUserTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		Group oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__GROUP, oldGroup, newGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanPerformer getHumanPerformer() {
		return humanPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHumanPerformer(HumanPerformer newHumanPerformer, NotificationChain msgs) {
		HumanPerformer oldHumanPerformer = humanPerformer;
		humanPerformer = newHumanPerformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__HUMAN_PERFORMER, oldHumanPerformer, newHumanPerformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHumanPerformer(HumanPerformer newHumanPerformer) {
		if (newHumanPerformer != humanPerformer) {
			NotificationChain msgs = null;
			if (humanPerformer != null)
				msgs = ((InternalEObject)humanPerformer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__HUMAN_PERFORMER, null, msgs);
			if (newHumanPerformer != null)
				msgs = ((InternalEObject)newHumanPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__HUMAN_PERFORMER, null, msgs);
			msgs = basicSetHumanPerformer(newHumanPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__HUMAN_PERFORMER, newHumanPerformer, newHumanPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performer getPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformer(Performer newPerformer, NotificationChain msgs) {
		Performer oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PERFORMER, oldPerformer, newPerformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Performer newPerformer) {
		if (newPerformer != performer) {
			NotificationChain msgs = null;
			if (performer != null)
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRole getResourceRole() {
		return resourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceRole(ResourceRole newResourceRole, NotificationChain msgs) {
		ResourceRole oldResourceRole = resourceRole;
		resourceRole = newResourceRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ROLE, oldResourceRole, newResourceRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceRole(ResourceRole newResourceRole) {
		if (newResourceRole != resourceRole) {
			NotificationChain msgs = null;
			if (resourceRole != null)
				msgs = ((InternalEObject)resourceRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ROLE, null, msgs);
			if (newResourceRole != null)
				msgs = ((InternalEObject)newResourceRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ROLE, null, msgs);
			msgs = basicSetResourceRole(newResourceRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ROLE, newResourceRole, newResourceRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitThrowEvent getImplicitThrowEvent() {
		return implicitThrowEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplicitThrowEvent(ImplicitThrowEvent newImplicitThrowEvent, NotificationChain msgs) {
		ImplicitThrowEvent oldImplicitThrowEvent = implicitThrowEvent;
		implicitThrowEvent = newImplicitThrowEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT, oldImplicitThrowEvent, newImplicitThrowEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplicitThrowEvent(ImplicitThrowEvent newImplicitThrowEvent) {
		if (newImplicitThrowEvent != implicitThrowEvent) {
			NotificationChain msgs = null;
			if (implicitThrowEvent != null)
				msgs = ((InternalEObject)implicitThrowEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT, null, msgs);
			if (newImplicitThrowEvent != null)
				msgs = ((InternalEObject)newImplicitThrowEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT, null, msgs);
			msgs = basicSetImplicitThrowEvent(newImplicitThrowEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT, newImplicitThrowEvent, newImplicitThrowEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import getImport() {
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImport(Import newImport, NotificationChain msgs) {
		Import oldImport = import_;
		import_ = newImport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__IMPORT, oldImport, newImport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImport(Import newImport) {
		if (newImport != import_) {
			NotificationChain msgs = null;
			if (import_ != null)
				msgs = ((InternalEObject)import_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__IMPORT, null, msgs);
			if (newImport != null)
				msgs = ((InternalEObject)newImport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__IMPORT, null, msgs);
			msgs = basicSetImport(newImport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__IMPORT, newImport, newImport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusiveGateway getInclusiveGateway() {
		return inclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInclusiveGateway(InclusiveGateway newInclusiveGateway, NotificationChain msgs) {
		InclusiveGateway oldInclusiveGateway = inclusiveGateway;
		inclusiveGateway = newInclusiveGateway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__INCLUSIVE_GATEWAY, oldInclusiveGateway, newInclusiveGateway);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclusiveGateway(InclusiveGateway newInclusiveGateway) {
		if (newInclusiveGateway != inclusiveGateway) {
			NotificationChain msgs = null;
			if (inclusiveGateway != null)
				msgs = ((InternalEObject)inclusiveGateway).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__INCLUSIVE_GATEWAY, null, msgs);
			if (newInclusiveGateway != null)
				msgs = ((InternalEObject)newInclusiveGateway).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__INCLUSIVE_GATEWAY, null, msgs);
			msgs = basicSetInclusiveGateway(newInclusiveGateway, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__INCLUSIVE_GATEWAY, newInclusiveGateway, newInclusiveGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSet getInputSet() {
		return inputSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputSet(InputSet newInputSet, NotificationChain msgs) {
		InputSet oldInputSet = inputSet;
		inputSet = newInputSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__INPUT_SET, oldInputSet, newInputSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputSet(InputSet newInputSet) {
		if (newInputSet != inputSet) {
			NotificationChain msgs = null;
			if (inputSet != null)
				msgs = ((InternalEObject)inputSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__INPUT_SET, null, msgs);
			if (newInputSet != null)
				msgs = ((InternalEObject)newInputSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__INPUT_SET, null, msgs);
			msgs = basicSetInputSet(newInputSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__INPUT_SET, newInputSet, newInputSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs) {
		Interface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__INTERFACE, oldInterface, newInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Interface newInterface) {
		if (newInterface != interface_) {
			NotificationChain msgs = null;
			if (interface_ != null)
				msgs = ((InternalEObject)interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__INTERFACE, null, msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__INTERFACE, null, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateCatchEvent getIntermediateCatchEvent() {
		return intermediateCatchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntermediateCatchEvent(IntermediateCatchEvent newIntermediateCatchEvent, NotificationChain msgs) {
		IntermediateCatchEvent oldIntermediateCatchEvent = intermediateCatchEvent;
		intermediateCatchEvent = newIntermediateCatchEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT, oldIntermediateCatchEvent, newIntermediateCatchEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntermediateCatchEvent(IntermediateCatchEvent newIntermediateCatchEvent) {
		if (newIntermediateCatchEvent != intermediateCatchEvent) {
			NotificationChain msgs = null;
			if (intermediateCatchEvent != null)
				msgs = ((InternalEObject)intermediateCatchEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT, null, msgs);
			if (newIntermediateCatchEvent != null)
				msgs = ((InternalEObject)newIntermediateCatchEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT, null, msgs);
			msgs = basicSetIntermediateCatchEvent(newIntermediateCatchEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT, newIntermediateCatchEvent, newIntermediateCatchEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateThrowEvent getIntermediateThrowEvent() {
		return intermediateThrowEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntermediateThrowEvent(IntermediateThrowEvent newIntermediateThrowEvent, NotificationChain msgs) {
		IntermediateThrowEvent oldIntermediateThrowEvent = intermediateThrowEvent;
		intermediateThrowEvent = newIntermediateThrowEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT, oldIntermediateThrowEvent, newIntermediateThrowEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntermediateThrowEvent(IntermediateThrowEvent newIntermediateThrowEvent) {
		if (newIntermediateThrowEvent != intermediateThrowEvent) {
			NotificationChain msgs = null;
			if (intermediateThrowEvent != null)
				msgs = ((InternalEObject)intermediateThrowEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT, null, msgs);
			if (newIntermediateThrowEvent != null)
				msgs = ((InternalEObject)newIntermediateThrowEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT, null, msgs);
			msgs = basicSetIntermediateThrowEvent(newIntermediateThrowEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT, newIntermediateThrowEvent, newIntermediateThrowEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputBinding getIoBinding() {
		return ioBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIoBinding(InputOutputBinding newIoBinding, NotificationChain msgs) {
		InputOutputBinding oldIoBinding = ioBinding;
		ioBinding = newIoBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__IO_BINDING, oldIoBinding, newIoBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoBinding(InputOutputBinding newIoBinding) {
		if (newIoBinding != ioBinding) {
			NotificationChain msgs = null;
			if (ioBinding != null)
				msgs = ((InternalEObject)ioBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__IO_BINDING, null, msgs);
			if (newIoBinding != null)
				msgs = ((InternalEObject)newIoBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__IO_BINDING, null, msgs);
			msgs = basicSetIoBinding(newIoBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__IO_BINDING, newIoBinding, newIoBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputSpecification getIoSpecification() {
		return ioSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIoSpecification(InputOutputSpecification newIoSpecification, NotificationChain msgs) {
		InputOutputSpecification oldIoSpecification = ioSpecification;
		ioSpecification = newIoSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__IO_SPECIFICATION, oldIoSpecification, newIoSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoSpecification(InputOutputSpecification newIoSpecification) {
		if (newIoSpecification != ioSpecification) {
			NotificationChain msgs = null;
			if (ioSpecification != null)
				msgs = ((InternalEObject)ioSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__IO_SPECIFICATION, null, msgs);
			if (newIoSpecification != null)
				msgs = ((InternalEObject)newIoSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__IO_SPECIFICATION, null, msgs);
			msgs = basicSetIoSpecification(newIoSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__IO_SPECIFICATION, newIoSpecification, newIoSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition getItemDefinition() {
		return itemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemDefinition(ItemDefinition newItemDefinition, NotificationChain msgs) {
		ItemDefinition oldItemDefinition = itemDefinition;
		itemDefinition = newItemDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ITEM_DEFINITION, oldItemDefinition, newItemDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemDefinition(ItemDefinition newItemDefinition) {
		if (newItemDefinition != itemDefinition) {
			NotificationChain msgs = null;
			if (itemDefinition != null)
				msgs = ((InternalEObject)itemDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ITEM_DEFINITION, null, msgs);
			if (newItemDefinition != null)
				msgs = ((InternalEObject)newItemDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__ITEM_DEFINITION, null, msgs);
			msgs = basicSetItemDefinition(newItemDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__ITEM_DEFINITION, newItemDefinition, newItemDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane getLane() {
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLane(Lane newLane, NotificationChain msgs) {
		Lane oldLane = lane;
		lane = newLane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__LANE, oldLane, newLane);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLane(Lane newLane) {
		if (newLane != lane) {
			NotificationChain msgs = null;
			if (lane != null)
				msgs = ((InternalEObject)lane).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__LANE, null, msgs);
			if (newLane != null)
				msgs = ((InternalEObject)newLane).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__LANE, null, msgs);
			msgs = basicSetLane(newLane, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__LANE, newLane, newLane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneSet getLaneSet() {
		return laneSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaneSet(LaneSet newLaneSet, NotificationChain msgs) {
		LaneSet oldLaneSet = laneSet;
		laneSet = newLaneSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__LANE_SET, oldLaneSet, newLaneSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaneSet(LaneSet newLaneSet) {
		if (newLaneSet != laneSet) {
			NotificationChain msgs = null;
			if (laneSet != null)
				msgs = ((InternalEObject)laneSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__LANE_SET, null, msgs);
			if (newLaneSet != null)
				msgs = ((InternalEObject)newLaneSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__LANE_SET, null, msgs);
			msgs = basicSetLaneSet(newLaneSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__LANE_SET, newLaneSet, newLaneSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEventDefinition getLinkEventDefinition() {
		return linkEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkEventDefinition(LinkEventDefinition newLinkEventDefinition, NotificationChain msgs) {
		LinkEventDefinition oldLinkEventDefinition = linkEventDefinition;
		linkEventDefinition = newLinkEventDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__LINK_EVENT_DEFINITION, oldLinkEventDefinition, newLinkEventDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkEventDefinition(LinkEventDefinition newLinkEventDefinition) {
		if (newLinkEventDefinition != linkEventDefinition) {
			NotificationChain msgs = null;
			if (linkEventDefinition != null)
				msgs = ((InternalEObject)linkEventDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__LINK_EVENT_DEFINITION, null, msgs);
			if (newLinkEventDefinition != null)
				msgs = ((InternalEObject)newLinkEventDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__LINK_EVENT_DEFINITION, null, msgs);
			msgs = basicSetLinkEventDefinition(newLinkEventDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__LINK_EVENT_DEFINITION, newLinkEventDefinition, newLinkEventDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopCharacteristics getLoopCharacteristics() {
		return loopCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopCharacteristics(LoopCharacteristics newLoopCharacteristics, NotificationChain msgs) {
		LoopCharacteristics oldLoopCharacteristics = loopCharacteristics;
		loopCharacteristics = newLoopCharacteristics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__LOOP_CHARACTERISTICS, oldLoopCharacteristics, newLoopCharacteristics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopCharacteristics(LoopCharacteristics newLoopCharacteristics) {
		if (newLoopCharacteristics != loopCharacteristics) {
			NotificationChain msgs = null;
			if (loopCharacteristics != null)
				msgs = ((InternalEObject)loopCharacteristics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__LOOP_CHARACTERISTICS, null, msgs);
			if (newLoopCharacteristics != null)
				msgs = ((InternalEObject)newLoopCharacteristics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__LOOP_CHARACTERISTICS, null, msgs);
			msgs = basicSetLoopCharacteristics(newLoopCharacteristics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__LOOP_CHARACTERISTICS, newLoopCharacteristics, newLoopCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManualTask getManualTask() {
		return manualTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManualTask(ManualTask newManualTask, NotificationChain msgs) {
		ManualTask oldManualTask = manualTask;
		manualTask = newManualTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__MANUAL_TASK, oldManualTask, newManualTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManualTask(ManualTask newManualTask) {
		if (newManualTask != manualTask) {
			NotificationChain msgs = null;
			if (manualTask != null)
				msgs = ((InternalEObject)manualTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__MANUAL_TASK, null, msgs);
			if (newManualTask != null)
				msgs = ((InternalEObject)newManualTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__MANUAL_TASK, null, msgs);
			msgs = basicSetManualTask(newManualTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__MANUAL_TASK, newManualTask, newManualTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(Message newMessage, NotificationChain msgs) {
		Message oldMessage = message;
		message = newMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE, oldMessage, newMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Message newMessage) {
		if (newMessage != message) {
			NotificationChain msgs = null;
			if (message != null)
				msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE, null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE, null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE, newMessage, newMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEventDefinition getMessageEventDefinition() {
		return messageEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageEventDefinition(MessageEventDefinition newMessageEventDefinition, NotificationChain msgs) {
		MessageEventDefinition oldMessageEventDefinition = messageEventDefinition;
		messageEventDefinition = newMessageEventDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION, oldMessageEventDefinition, newMessageEventDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageEventDefinition(MessageEventDefinition newMessageEventDefinition) {
		if (newMessageEventDefinition != messageEventDefinition) {
			NotificationChain msgs = null;
			if (messageEventDefinition != null)
				msgs = ((InternalEObject)messageEventDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION, null, msgs);
			if (newMessageEventDefinition != null)
				msgs = ((InternalEObject)newMessageEventDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION, null, msgs);
			msgs = basicSetMessageEventDefinition(newMessageEventDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION, newMessageEventDefinition, newMessageEventDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlow getMessageFlow() {
		return messageFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageFlow(MessageFlow newMessageFlow, NotificationChain msgs) {
		MessageFlow oldMessageFlow = messageFlow;
		messageFlow = newMessageFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW, oldMessageFlow, newMessageFlow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageFlow(MessageFlow newMessageFlow) {
		if (newMessageFlow != messageFlow) {
			NotificationChain msgs = null;
			if (messageFlow != null)
				msgs = ((InternalEObject)messageFlow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW, null, msgs);
			if (newMessageFlow != null)
				msgs = ((InternalEObject)newMessageFlow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW, null, msgs);
			msgs = basicSetMessageFlow(newMessageFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW, newMessageFlow, newMessageFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlowAssociation getMessageFlowAssociation() {
		return messageFlowAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageFlowAssociation(MessageFlowAssociation newMessageFlowAssociation, NotificationChain msgs) {
		MessageFlowAssociation oldMessageFlowAssociation = messageFlowAssociation;
		messageFlowAssociation = newMessageFlowAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION, oldMessageFlowAssociation, newMessageFlowAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageFlowAssociation(MessageFlowAssociation newMessageFlowAssociation) {
		if (newMessageFlowAssociation != messageFlowAssociation) {
			NotificationChain msgs = null;
			if (messageFlowAssociation != null)
				msgs = ((InternalEObject)messageFlowAssociation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION, null, msgs);
			if (newMessageFlowAssociation != null)
				msgs = ((InternalEObject)newMessageFlowAssociation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION, null, msgs);
			msgs = basicSetMessageFlowAssociation(newMessageFlowAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION, newMessageFlowAssociation, newMessageFlowAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitoring getMonitoring() {
		return monitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoring(Monitoring newMonitoring, NotificationChain msgs) {
		Monitoring oldMonitoring = monitoring;
		monitoring = newMonitoring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__MONITORING, oldMonitoring, newMonitoring);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoring(Monitoring newMonitoring) {
		if (newMonitoring != monitoring) {
			NotificationChain msgs = null;
			if (monitoring != null)
				msgs = ((InternalEObject)monitoring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__MONITORING, null, msgs);
			if (newMonitoring != null)
				msgs = ((InternalEObject)newMonitoring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__MONITORING, null, msgs);
			msgs = basicSetMonitoring(newMonitoring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__MONITORING, newMonitoring, newMonitoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiInstanceLoopCharacteristics getMultiInstanceLoopCharacteristics() {
		return multiInstanceLoopCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiInstanceLoopCharacteristics(MultiInstanceLoopCharacteristics newMultiInstanceLoopCharacteristics, NotificationChain msgs) {
		MultiInstanceLoopCharacteristics oldMultiInstanceLoopCharacteristics = multiInstanceLoopCharacteristics;
		multiInstanceLoopCharacteristics = newMultiInstanceLoopCharacteristics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS, oldMultiInstanceLoopCharacteristics, newMultiInstanceLoopCharacteristics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiInstanceLoopCharacteristics(MultiInstanceLoopCharacteristics newMultiInstanceLoopCharacteristics) {
		if (newMultiInstanceLoopCharacteristics != multiInstanceLoopCharacteristics) {
			NotificationChain msgs = null;
			if (multiInstanceLoopCharacteristics != null)
				msgs = ((InternalEObject)multiInstanceLoopCharacteristics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS, null, msgs);
			if (newMultiInstanceLoopCharacteristics != null)
				msgs = ((InternalEObject)newMultiInstanceLoopCharacteristics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS, null, msgs);
			msgs = basicSetMultiInstanceLoopCharacteristics(newMultiInstanceLoopCharacteristics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS, newMultiInstanceLoopCharacteristics, newMultiInstanceLoopCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__OPERATION, oldOperation, newOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSet getOutputSet() {
		return outputSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputSet(OutputSet newOutputSet, NotificationChain msgs) {
		OutputSet oldOutputSet = outputSet;
		outputSet = newOutputSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__OUTPUT_SET, oldOutputSet, newOutputSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputSet(OutputSet newOutputSet) {
		if (newOutputSet != outputSet) {
			NotificationChain msgs = null;
			if (outputSet != null)
				msgs = ((InternalEObject)outputSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__OUTPUT_SET, null, msgs);
			if (newOutputSet != null)
				msgs = ((InternalEObject)newOutputSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__OUTPUT_SET, null, msgs);
			msgs = basicSetOutputSet(newOutputSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__OUTPUT_SET, newOutputSet, newOutputSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelGateway getParallelGateway() {
		return parallelGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParallelGateway(ParallelGateway newParallelGateway, NotificationChain msgs) {
		ParallelGateway oldParallelGateway = parallelGateway;
		parallelGateway = newParallelGateway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PARALLEL_GATEWAY, oldParallelGateway, newParallelGateway);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallelGateway(ParallelGateway newParallelGateway) {
		if (newParallelGateway != parallelGateway) {
			NotificationChain msgs = null;
			if (parallelGateway != null)
				msgs = ((InternalEObject)parallelGateway).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PARALLEL_GATEWAY, null, msgs);
			if (newParallelGateway != null)
				msgs = ((InternalEObject)newParallelGateway).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PARALLEL_GATEWAY, null, msgs);
			msgs = basicSetParallelGateway(newParallelGateway, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PARALLEL_GATEWAY, newParallelGateway, newParallelGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getParticipant() {
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipant(Participant newParticipant, NotificationChain msgs) {
		Participant oldParticipant = participant;
		participant = newParticipant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT, oldParticipant, newParticipant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipant(Participant newParticipant) {
		if (newParticipant != participant) {
			NotificationChain msgs = null;
			if (participant != null)
				msgs = ((InternalEObject)participant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT, null, msgs);
			if (newParticipant != null)
				msgs = ((InternalEObject)newParticipant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT, null, msgs);
			msgs = basicSetParticipant(newParticipant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT, newParticipant, newParticipant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantAssociation getParticipantAssociation() {
		return participantAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantAssociation(ParticipantAssociation newParticipantAssociation, NotificationChain msgs) {
		ParticipantAssociation oldParticipantAssociation = participantAssociation;
		participantAssociation = newParticipantAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION, oldParticipantAssociation, newParticipantAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantAssociation(ParticipantAssociation newParticipantAssociation) {
		if (newParticipantAssociation != participantAssociation) {
			NotificationChain msgs = null;
			if (participantAssociation != null)
				msgs = ((InternalEObject)participantAssociation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION, null, msgs);
			if (newParticipantAssociation != null)
				msgs = ((InternalEObject)newParticipantAssociation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION, null, msgs);
			msgs = basicSetParticipantAssociation(newParticipantAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION, newParticipantAssociation, newParticipantAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantMultiplicity getParticipantMultiplicity() {
		return participantMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantMultiplicity(ParticipantMultiplicity newParticipantMultiplicity, NotificationChain msgs) {
		ParticipantMultiplicity oldParticipantMultiplicity = participantMultiplicity;
		participantMultiplicity = newParticipantMultiplicity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY, oldParticipantMultiplicity, newParticipantMultiplicity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantMultiplicity(ParticipantMultiplicity newParticipantMultiplicity) {
		if (newParticipantMultiplicity != participantMultiplicity) {
			NotificationChain msgs = null;
			if (participantMultiplicity != null)
				msgs = ((InternalEObject)participantMultiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY, null, msgs);
			if (newParticipantMultiplicity != null)
				msgs = ((InternalEObject)newParticipantMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY, null, msgs);
			msgs = basicSetParticipantMultiplicity(newParticipantMultiplicity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY, newParticipantMultiplicity, newParticipantMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerEntity getPartnerEntity() {
		return partnerEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartnerEntity(PartnerEntity newPartnerEntity, NotificationChain msgs) {
		PartnerEntity oldPartnerEntity = partnerEntity;
		partnerEntity = newPartnerEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ENTITY, oldPartnerEntity, newPartnerEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerEntity(PartnerEntity newPartnerEntity) {
		if (newPartnerEntity != partnerEntity) {
			NotificationChain msgs = null;
			if (partnerEntity != null)
				msgs = ((InternalEObject)partnerEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ENTITY, null, msgs);
			if (newPartnerEntity != null)
				msgs = ((InternalEObject)newPartnerEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ENTITY, null, msgs);
			msgs = basicSetPartnerEntity(newPartnerEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ENTITY, newPartnerEntity, newPartnerEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerRole getPartnerRole() {
		return partnerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartnerRole(PartnerRole newPartnerRole, NotificationChain msgs) {
		PartnerRole oldPartnerRole = partnerRole;
		partnerRole = newPartnerRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ROLE, oldPartnerRole, newPartnerRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerRole(PartnerRole newPartnerRole) {
		if (newPartnerRole != partnerRole) {
			NotificationChain msgs = null;
			if (partnerRole != null)
				msgs = ((InternalEObject)partnerRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ROLE, null, msgs);
			if (newPartnerRole != null)
				msgs = ((InternalEObject)newPartnerRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ROLE, null, msgs);
			msgs = basicSetPartnerRole(newPartnerRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ROLE, newPartnerRole, newPartnerRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotentialOwner getPotentialOwner() {
		return potentialOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPotentialOwner(PotentialOwner newPotentialOwner, NotificationChain msgs) {
		PotentialOwner oldPotentialOwner = potentialOwner;
		potentialOwner = newPotentialOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__POTENTIAL_OWNER, oldPotentialOwner, newPotentialOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPotentialOwner(PotentialOwner newPotentialOwner) {
		if (newPotentialOwner != potentialOwner) {
			NotificationChain msgs = null;
			if (potentialOwner != null)
				msgs = ((InternalEObject)potentialOwner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__POTENTIAL_OWNER, null, msgs);
			if (newPotentialOwner != null)
				msgs = ((InternalEObject)newPotentialOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__POTENTIAL_OWNER, null, msgs);
			msgs = basicSetPotentialOwner(newPotentialOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__POTENTIAL_OWNER, newPotentialOwner, newPotentialOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.emftrace.metamodel.BPMN2Model.Process getProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(org.emftrace.metamodel.BPMN2Model.Process newProcess, NotificationChain msgs) {
		org.emftrace.metamodel.BPMN2Model.Process oldProcess = process;
		process = newProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PROCESS, oldProcess, newProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(org.emftrace.metamodel.BPMN2Model.Process newProcess) {
		if (newProcess != process) {
			NotificationChain msgs = null;
			if (process != null)
				msgs = ((InternalEObject)process).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PROCESS, null, msgs);
			if (newProcess != null)
				msgs = ((InternalEObject)newProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PROCESS, null, msgs);
			msgs = basicSetProcess(newProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PROCESS, newProcess, newProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(Property newProperty, NotificationChain msgs) {
		Property oldProperty = property;
		property = newProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PROPERTY, oldProperty, newProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(Property newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PROPERTY, null, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__PROPERTY, null, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveTask getReceiveTask() {
		return receiveTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiveTask(ReceiveTask newReceiveTask, NotificationChain msgs) {
		ReceiveTask oldReceiveTask = receiveTask;
		receiveTask = newReceiveTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__RECEIVE_TASK, oldReceiveTask, newReceiveTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveTask(ReceiveTask newReceiveTask) {
		if (newReceiveTask != receiveTask) {
			NotificationChain msgs = null;
			if (receiveTask != null)
				msgs = ((InternalEObject)receiveTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__RECEIVE_TASK, null, msgs);
			if (newReceiveTask != null)
				msgs = ((InternalEObject)newReceiveTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__RECEIVE_TASK, null, msgs);
			msgs = basicSetReceiveTask(newReceiveTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__RECEIVE_TASK, newReceiveTask, newReceiveTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(Relationship newRelationship, NotificationChain msgs) {
		Relationship oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__RELATIONSHIP, oldRelationship, newRelationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(Relationship newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rendering getRendering() {
		return rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRendering(Rendering newRendering, NotificationChain msgs) {
		Rendering oldRendering = rendering;
		rendering = newRendering;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__RENDERING, oldRendering, newRendering);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRendering(Rendering newRendering) {
		if (newRendering != rendering) {
			NotificationChain msgs = null;
			if (rendering != null)
				msgs = ((InternalEObject)rendering).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__RENDERING, null, msgs);
			if (newRendering != null)
				msgs = ((InternalEObject)newRendering).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__RENDERING, null, msgs);
			msgs = basicSetRendering(newRendering, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__RENDERING, newRendering, newRendering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAssignmentExpression getResourceAssignmentExpression() {
		return resourceAssignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceAssignmentExpression(ResourceAssignmentExpression newResourceAssignmentExpression, NotificationChain msgs) {
		ResourceAssignmentExpression oldResourceAssignmentExpression = resourceAssignmentExpression;
		resourceAssignmentExpression = newResourceAssignmentExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION, oldResourceAssignmentExpression, newResourceAssignmentExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceAssignmentExpression(ResourceAssignmentExpression newResourceAssignmentExpression) {
		if (newResourceAssignmentExpression != resourceAssignmentExpression) {
			NotificationChain msgs = null;
			if (resourceAssignmentExpression != null)
				msgs = ((InternalEObject)resourceAssignmentExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION, null, msgs);
			if (newResourceAssignmentExpression != null)
				msgs = ((InternalEObject)newResourceAssignmentExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION, null, msgs);
			msgs = basicSetResourceAssignmentExpression(newResourceAssignmentExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION, newResourceAssignmentExpression, newResourceAssignmentExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceParameter getResourceParameter() {
		return resourceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceParameter(ResourceParameter newResourceParameter, NotificationChain msgs) {
		ResourceParameter oldResourceParameter = resourceParameter;
		resourceParameter = newResourceParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER, oldResourceParameter, newResourceParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceParameter(ResourceParameter newResourceParameter) {
		if (newResourceParameter != resourceParameter) {
			NotificationChain msgs = null;
			if (resourceParameter != null)
				msgs = ((InternalEObject)resourceParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER, null, msgs);
			if (newResourceParameter != null)
				msgs = ((InternalEObject)newResourceParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER, null, msgs);
			msgs = basicSetResourceParameter(newResourceParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER, newResourceParameter, newResourceParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceParameterBinding getResourceParameterBinding() {
		return resourceParameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceParameterBinding(ResourceParameterBinding newResourceParameterBinding, NotificationChain msgs) {
		ResourceParameterBinding oldResourceParameterBinding = resourceParameterBinding;
		resourceParameterBinding = newResourceParameterBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING, oldResourceParameterBinding, newResourceParameterBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceParameterBinding(ResourceParameterBinding newResourceParameterBinding) {
		if (newResourceParameterBinding != resourceParameterBinding) {
			NotificationChain msgs = null;
			if (resourceParameterBinding != null)
				msgs = ((InternalEObject)resourceParameterBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING, null, msgs);
			if (newResourceParameterBinding != null)
				msgs = ((InternalEObject)newResourceParameterBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING, null, msgs);
			msgs = basicSetResourceParameterBinding(newResourceParameterBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING, newResourceParameterBinding, newResourceParameterBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(EObject newScript, NotificationChain msgs) {
		EObject oldScript = script;
		script = newScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT, oldScript, newScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(EObject newScript) {
		if (newScript != script) {
			NotificationChain msgs = null;
			if (script != null)
				msgs = ((InternalEObject)script).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT, null, msgs);
			if (newScript != null)
				msgs = ((InternalEObject)newScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT, null, msgs);
			msgs = basicSetScript(newScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT, newScript, newScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptTask getScriptTask() {
		return scriptTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScriptTask(ScriptTask newScriptTask, NotificationChain msgs) {
		ScriptTask oldScriptTask = scriptTask;
		scriptTask = newScriptTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT_TASK, oldScriptTask, newScriptTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptTask(ScriptTask newScriptTask) {
		if (newScriptTask != scriptTask) {
			NotificationChain msgs = null;
			if (scriptTask != null)
				msgs = ((InternalEObject)scriptTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT_TASK, null, msgs);
			if (newScriptTask != null)
				msgs = ((InternalEObject)newScriptTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT_TASK, null, msgs);
			msgs = basicSetScriptTask(newScriptTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT_TASK, newScriptTask, newScriptTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendTask getSendTask() {
		return sendTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendTask(SendTask newSendTask, NotificationChain msgs) {
		SendTask oldSendTask = sendTask;
		sendTask = newSendTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SEND_TASK, oldSendTask, newSendTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendTask(SendTask newSendTask) {
		if (newSendTask != sendTask) {
			NotificationChain msgs = null;
			if (sendTask != null)
				msgs = ((InternalEObject)sendTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SEND_TASK, null, msgs);
			if (newSendTask != null)
				msgs = ((InternalEObject)newSendTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SEND_TASK, null, msgs);
			msgs = basicSetSendTask(newSendTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SEND_TASK, newSendTask, newSendTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlow getSequenceFlow() {
		return sequenceFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceFlow(SequenceFlow newSequenceFlow, NotificationChain msgs) {
		SequenceFlow oldSequenceFlow = sequenceFlow;
		sequenceFlow = newSequenceFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SEQUENCE_FLOW, oldSequenceFlow, newSequenceFlow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceFlow(SequenceFlow newSequenceFlow) {
		if (newSequenceFlow != sequenceFlow) {
			NotificationChain msgs = null;
			if (sequenceFlow != null)
				msgs = ((InternalEObject)sequenceFlow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SEQUENCE_FLOW, null, msgs);
			if (newSequenceFlow != null)
				msgs = ((InternalEObject)newSequenceFlow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SEQUENCE_FLOW, null, msgs);
			msgs = basicSetSequenceFlow(newSequenceFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SEQUENCE_FLOW, newSequenceFlow, newSequenceFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTask getServiceTask() {
		return serviceTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceTask(ServiceTask newServiceTask, NotificationChain msgs) {
		ServiceTask oldServiceTask = serviceTask;
		serviceTask = newServiceTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SERVICE_TASK, oldServiceTask, newServiceTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceTask(ServiceTask newServiceTask) {
		if (newServiceTask != serviceTask) {
			NotificationChain msgs = null;
			if (serviceTask != null)
				msgs = ((InternalEObject)serviceTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SERVICE_TASK, null, msgs);
			if (newServiceTask != null)
				msgs = ((InternalEObject)newServiceTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SERVICE_TASK, null, msgs);
			msgs = basicSetServiceTask(newServiceTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SERVICE_TASK, newServiceTask, newServiceTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getSignal() {
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignal(Signal newSignal, NotificationChain msgs) {
		Signal oldSignal = signal;
		signal = newSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL, oldSignal, newSignal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(Signal newSignal) {
		if (newSignal != signal) {
			NotificationChain msgs = null;
			if (signal != null)
				msgs = ((InternalEObject)signal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL, null, msgs);
			if (newSignal != null)
				msgs = ((InternalEObject)newSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL, null, msgs);
			msgs = basicSetSignal(newSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL, newSignal, newSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalEventDefinition getSignalEventDefinition() {
		return signalEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalEventDefinition(SignalEventDefinition newSignalEventDefinition, NotificationChain msgs) {
		SignalEventDefinition oldSignalEventDefinition = signalEventDefinition;
		signalEventDefinition = newSignalEventDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION, oldSignalEventDefinition, newSignalEventDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalEventDefinition(SignalEventDefinition newSignalEventDefinition) {
		if (newSignalEventDefinition != signalEventDefinition) {
			NotificationChain msgs = null;
			if (signalEventDefinition != null)
				msgs = ((InternalEObject)signalEventDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION, null, msgs);
			if (newSignalEventDefinition != null)
				msgs = ((InternalEObject)newSignalEventDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION, null, msgs);
			msgs = basicSetSignalEventDefinition(newSignalEventDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION, newSignalEventDefinition, newSignalEventDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardLoopCharacteristics getStandardLoopCharacteristics() {
		return standardLoopCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardLoopCharacteristics(StandardLoopCharacteristics newStandardLoopCharacteristics, NotificationChain msgs) {
		StandardLoopCharacteristics oldStandardLoopCharacteristics = standardLoopCharacteristics;
		standardLoopCharacteristics = newStandardLoopCharacteristics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS, oldStandardLoopCharacteristics, newStandardLoopCharacteristics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardLoopCharacteristics(StandardLoopCharacteristics newStandardLoopCharacteristics) {
		if (newStandardLoopCharacteristics != standardLoopCharacteristics) {
			NotificationChain msgs = null;
			if (standardLoopCharacteristics != null)
				msgs = ((InternalEObject)standardLoopCharacteristics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS, null, msgs);
			if (newStandardLoopCharacteristics != null)
				msgs = ((InternalEObject)newStandardLoopCharacteristics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS, null, msgs);
			msgs = basicSetStandardLoopCharacteristics(newStandardLoopCharacteristics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS, newStandardLoopCharacteristics, newStandardLoopCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEvent getStartEvent() {
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartEvent(StartEvent newStartEvent, NotificationChain msgs) {
		StartEvent oldStartEvent = startEvent;
		startEvent = newStartEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__START_EVENT, oldStartEvent, newStartEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartEvent(StartEvent newStartEvent) {
		if (newStartEvent != startEvent) {
			NotificationChain msgs = null;
			if (startEvent != null)
				msgs = ((InternalEObject)startEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__START_EVENT, null, msgs);
			if (newStartEvent != null)
				msgs = ((InternalEObject)newStartEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__START_EVENT, null, msgs);
			msgs = basicSetStartEvent(newStartEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__START_EVENT, newStartEvent, newStartEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubChoreography getSubChoreography() {
		return subChoreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubChoreography(SubChoreography newSubChoreography, NotificationChain msgs) {
		SubChoreography oldSubChoreography = subChoreography;
		subChoreography = newSubChoreography;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CHOREOGRAPHY, oldSubChoreography, newSubChoreography);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubChoreography(SubChoreography newSubChoreography) {
		if (newSubChoreography != subChoreography) {
			NotificationChain msgs = null;
			if (subChoreography != null)
				msgs = ((InternalEObject)subChoreography).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CHOREOGRAPHY, null, msgs);
			if (newSubChoreography != null)
				msgs = ((InternalEObject)newSubChoreography).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CHOREOGRAPHY, null, msgs);
			msgs = basicSetSubChoreography(newSubChoreography, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CHOREOGRAPHY, newSubChoreography, newSubChoreography));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubConversation getSubConversation() {
		return subConversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubConversation(SubConversation newSubConversation, NotificationChain msgs) {
		SubConversation oldSubConversation = subConversation;
		subConversation = newSubConversation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CONVERSATION, oldSubConversation, newSubConversation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubConversation(SubConversation newSubConversation) {
		if (newSubConversation != subConversation) {
			NotificationChain msgs = null;
			if (subConversation != null)
				msgs = ((InternalEObject)subConversation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CONVERSATION, null, msgs);
			if (newSubConversation != null)
				msgs = ((InternalEObject)newSubConversation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CONVERSATION, null, msgs);
			msgs = basicSetSubConversation(newSubConversation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CONVERSATION, newSubConversation, newSubConversation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubProcess getSubProcess() {
		return subProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubProcess(SubProcess newSubProcess, NotificationChain msgs) {
		SubProcess oldSubProcess = subProcess;
		subProcess = newSubProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SUB_PROCESS, oldSubProcess, newSubProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubProcess(SubProcess newSubProcess) {
		if (newSubProcess != subProcess) {
			NotificationChain msgs = null;
			if (subProcess != null)
				msgs = ((InternalEObject)subProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SUB_PROCESS, null, msgs);
			if (newSubProcess != null)
				msgs = ((InternalEObject)newSubProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__SUB_PROCESS, null, msgs);
			msgs = basicSetSubProcess(newSubProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__SUB_PROCESS, newSubProcess, newSubProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__TASK, oldTask, newTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		if (newTask != task) {
			NotificationChain msgs = null;
			if (task != null)
				msgs = ((InternalEObject)task).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__TASK, null, msgs);
			if (newTask != null)
				msgs = ((InternalEObject)newTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__TASK, null, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__TASK, newTask, newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminateEventDefinition getTerminateEventDefinition() {
		return terminateEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminateEventDefinition(TerminateEventDefinition newTerminateEventDefinition, NotificationChain msgs) {
		TerminateEventDefinition oldTerminateEventDefinition = terminateEventDefinition;
		terminateEventDefinition = newTerminateEventDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION, oldTerminateEventDefinition, newTerminateEventDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminateEventDefinition(TerminateEventDefinition newTerminateEventDefinition) {
		if (newTerminateEventDefinition != terminateEventDefinition) {
			NotificationChain msgs = null;
			if (terminateEventDefinition != null)
				msgs = ((InternalEObject)terminateEventDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION, null, msgs);
			if (newTerminateEventDefinition != null)
				msgs = ((InternalEObject)newTerminateEventDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION, null, msgs);
			msgs = basicSetTerminateEventDefinition(newTerminateEventDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION, newTerminateEventDefinition, newTerminateEventDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(EObject newText, NotificationChain msgs) {
		EObject oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(EObject newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAnnotation getTextAnnotation() {
		return textAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextAnnotation(TextAnnotation newTextAnnotation, NotificationChain msgs) {
		TextAnnotation oldTextAnnotation = textAnnotation;
		textAnnotation = newTextAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__TEXT_ANNOTATION, oldTextAnnotation, newTextAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAnnotation(TextAnnotation newTextAnnotation) {
		if (newTextAnnotation != textAnnotation) {
			NotificationChain msgs = null;
			if (textAnnotation != null)
				msgs = ((InternalEObject)textAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__TEXT_ANNOTATION, null, msgs);
			if (newTextAnnotation != null)
				msgs = ((InternalEObject)newTextAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__TEXT_ANNOTATION, null, msgs);
			msgs = basicSetTextAnnotation(newTextAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__TEXT_ANNOTATION, newTextAnnotation, newTextAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrowEvent getThrowEvent() {
		return throwEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrowEvent(ThrowEvent newThrowEvent, NotificationChain msgs) {
		ThrowEvent oldThrowEvent = throwEvent;
		throwEvent = newThrowEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__THROW_EVENT, oldThrowEvent, newThrowEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrowEvent(ThrowEvent newThrowEvent) {
		if (newThrowEvent != throwEvent) {
			NotificationChain msgs = null;
			if (throwEvent != null)
				msgs = ((InternalEObject)throwEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__THROW_EVENT, null, msgs);
			if (newThrowEvent != null)
				msgs = ((InternalEObject)newThrowEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__THROW_EVENT, null, msgs);
			msgs = basicSetThrowEvent(newThrowEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__THROW_EVENT, newThrowEvent, newThrowEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerEventDefinition getTimerEventDefinition() {
		return timerEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimerEventDefinition(TimerEventDefinition newTimerEventDefinition, NotificationChain msgs) {
		TimerEventDefinition oldTimerEventDefinition = timerEventDefinition;
		timerEventDefinition = newTimerEventDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION, oldTimerEventDefinition, newTimerEventDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimerEventDefinition(TimerEventDefinition newTimerEventDefinition) {
		if (newTimerEventDefinition != timerEventDefinition) {
			NotificationChain msgs = null;
			if (timerEventDefinition != null)
				msgs = ((InternalEObject)timerEventDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION, null, msgs);
			if (newTimerEventDefinition != null)
				msgs = ((InternalEObject)newTimerEventDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION, null, msgs);
			msgs = basicSetTimerEventDefinition(newTimerEventDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION, newTimerEventDefinition, newTimerEventDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction getTransaction() {
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransaction(Transaction newTransaction, NotificationChain msgs) {
		Transaction oldTransaction = transaction;
		transaction = newTransaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__TRANSACTION, oldTransaction, newTransaction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransaction(Transaction newTransaction) {
		if (newTransaction != transaction) {
			NotificationChain msgs = null;
			if (transaction != null)
				msgs = ((InternalEObject)transaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__TRANSACTION, null, msgs);
			if (newTransaction != null)
				msgs = ((InternalEObject)newTransaction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__TRANSACTION, null, msgs);
			msgs = basicSetTransaction(newTransaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__TRANSACTION, newTransaction, newTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTask getUserTask() {
		return userTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserTask(UserTask newUserTask, NotificationChain msgs) {
		UserTask oldUserTask = userTask;
		userTask = newUserTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__USER_TASK, oldUserTask, newUserTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserTask(UserTask newUserTask) {
		if (newUserTask != userTask) {
			NotificationChain msgs = null;
			if (userTask != null)
				msgs = ((InternalEObject)userTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__USER_TASK, null, msgs);
			if (newUserTask != null)
				msgs = ((InternalEObject)newUserTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.DOCUMENT_ROOT__USER_TASK, null, msgs);
			msgs = basicSetUserTask(newUserTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENT_ROOT__USER_TASK, newUserTask, newUserTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__ACTIVITY:
				return basicSetActivity(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS:
				return basicSetAdHocSubProcess(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_ELEMENT:
				return basicSetFlowElement(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__ARTIFACT:
				return basicSetArtifact(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__ASSIGNMENT:
				return basicSetAssignment(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__ASSOCIATION:
				return basicSetAssociation(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__AUDITING:
				return basicSetAuditing(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT:
				return basicSetBaseElement(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
				return basicSetBaseElementWithMixedContent(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__BOUNDARY_EVENT:
				return basicSetBoundaryEvent(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__BUSINESS_RULE_TASK:
				return basicSetBusinessRuleTask(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT:
				return basicSetCallableElement(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_ACTIVITY:
				return basicSetCallActivity(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CHOREOGRAPHY:
				return basicSetCallChoreography(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CONVERSATION:
				return basicSetCallConversation(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_NODE:
				return basicSetConversationNode(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION:
				return basicSetCancelEventDefinition(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_DEFINITION:
				return basicSetEventDefinition(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
				return basicSetRootElement(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATCH_EVENT:
				return basicSetCatchEvent(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY:
				return basicSetCategory(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY_VALUE:
				return basicSetCategoryValue(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY:
				return basicSetChoreography(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__COLLABORATION:
				return basicSetCollaboration(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY:
				return basicSetChoreographyActivity(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_TASK:
				return basicSetChoreographyTask(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION:
				return basicSetCompensateEventDefinition(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
				return basicSetComplexBehaviorDefinition(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_GATEWAY:
				return basicSetComplexGateway(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION:
				return basicSetConditionalEventDefinition(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION:
				return basicSetConversation(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION:
				return basicSetConversationAssociation(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_LINK:
				return basicSetConversationLink(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_KEY:
				return basicSetCorrelationKey(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY:
				return basicSetCorrelationProperty(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING:
				return basicSetCorrelationPropertyBinding(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
				return basicSetCorrelationPropertyRetrievalExpression(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION:
				return basicSetCorrelationSubscription(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_ASSOCIATION:
				return basicSetDataAssociation(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT:
				return basicSetDataInput(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION:
				return basicSetDataInputAssociation(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT:
				return basicSetDataObject(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT_REFERENCE:
				return basicSetDataObjectReference(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT:
				return basicSetDataOutput(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION:
				return basicSetDataOutputAssociation(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STATE:
				return basicSetDataState(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE:
				return basicSetDataStore(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE_REFERENCE:
				return basicSetDataStoreReference(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__DEFINITIONS:
				return basicSetDefinitions(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__END_EVENT:
				return basicSetEndEvent(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__END_POINT:
				return basicSetEndPoint(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__ERROR:
				return basicSetError(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION:
				return basicSetErrorEventDefinition(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION:
				return basicSetEscalation(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION:
				return basicSetEscalationEventDefinition(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT:
				return basicSetEvent(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_BASED_GATEWAY:
				return basicSetEventBasedGateway(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY:
				return basicSetExclusiveGateway(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION:
				return basicSetExtension(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION_ELEMENTS:
				return basicSetExtensionElements(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_NODE:
				return basicSetFlowNode(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__FORMAL_EXPRESSION:
				return basicSetFormalExpression(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__GATEWAY:
				return basicSetGateway(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK:
				return basicSetGlobalBusinessRuleTask(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
				return basicSetGlobalChoreographyTask(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CONVERSATION:
				return basicSetGlobalConversation(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK:
				return basicSetGlobalManualTask(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK:
				return basicSetGlobalScriptTask(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_TASK:
				return basicSetGlobalTask(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_USER_TASK:
				return basicSetGlobalUserTask(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__GROUP:
				return basicSetGroup(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__HUMAN_PERFORMER:
				return basicSetHumanPerformer(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__PERFORMER:
				return basicSetPerformer(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ROLE:
				return basicSetResourceRole(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT:
				return basicSetImplicitThrowEvent(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__IMPORT:
				return basicSetImport(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__INCLUSIVE_GATEWAY:
				return basicSetInclusiveGateway(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__INPUT_SET:
				return basicSetInputSet(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERFACE:
				return basicSetInterface(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT:
				return basicSetIntermediateCatchEvent(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT:
				return basicSetIntermediateThrowEvent(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__IO_BINDING:
				return basicSetIoBinding(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__IO_SPECIFICATION:
				return basicSetIoSpecification(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__ITEM_DEFINITION:
				return basicSetItemDefinition(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__LANE:
				return basicSetLane(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__LANE_SET:
				return basicSetLaneSet(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__LINK_EVENT_DEFINITION:
				return basicSetLinkEventDefinition(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__LOOP_CHARACTERISTICS:
				return basicSetLoopCharacteristics(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__MANUAL_TASK:
				return basicSetManualTask(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE:
				return basicSetMessage(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION:
				return basicSetMessageEventDefinition(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW:
				return basicSetMessageFlow(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION:
				return basicSetMessageFlowAssociation(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__MONITORING:
				return basicSetMonitoring(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
				return basicSetMultiInstanceLoopCharacteristics(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__OPERATION:
				return basicSetOperation(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__OUTPUT_SET:
				return basicSetOutputSet(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARALLEL_GATEWAY:
				return basicSetParallelGateway(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT:
				return basicSetParticipant(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION:
				return basicSetParticipantAssociation(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY:
				return basicSetParticipantMultiplicity(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ENTITY:
				return basicSetPartnerEntity(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ROLE:
				return basicSetPartnerRole(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__POTENTIAL_OWNER:
				return basicSetPotentialOwner(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__PROCESS:
				return basicSetProcess(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__PROPERTY:
				return basicSetProperty(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__RECEIVE_TASK:
				return basicSetReceiveTask(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__RENDERING:
				return basicSetRendering(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE:
				return basicSetResource(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
				return basicSetResourceAssignmentExpression(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER:
				return basicSetResourceParameter(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING:
				return basicSetResourceParameterBinding(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT:
				return basicSetScript(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT_TASK:
				return basicSetScriptTask(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__SEND_TASK:
				return basicSetSendTask(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
				return basicSetSequenceFlow(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__SERVICE_TASK:
				return basicSetServiceTask(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL:
				return basicSetSignal(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION:
				return basicSetSignalEventDefinition(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS:
				return basicSetStandardLoopCharacteristics(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__START_EVENT:
				return basicSetStartEvent(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CHOREOGRAPHY:
				return basicSetSubChoreography(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CONVERSATION:
				return basicSetSubConversation(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_PROCESS:
				return basicSetSubProcess(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__TASK:
				return basicSetTask(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION:
				return basicSetTerminateEventDefinition(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__TEXT:
				return basicSetText(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__TEXT_ANNOTATION:
				return basicSetTextAnnotation(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__THROW_EVENT:
				return basicSetThrowEvent(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION:
				return basicSetTimerEventDefinition(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__TRANSACTION:
				return basicSetTransaction(null, msgs);
			case BPMN2ModelPackage.DOCUMENT_ROOT__USER_TASK:
				return basicSetUserTask(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN2ModelPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case BPMN2ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case BPMN2ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case BPMN2ModelPackage.DOCUMENT_ROOT__ACTIVITY:
				return getActivity();
			case BPMN2ModelPackage.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS:
				return getAdHocSubProcess();
			case BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_ELEMENT:
				return getFlowElement();
			case BPMN2ModelPackage.DOCUMENT_ROOT__ARTIFACT:
				return getArtifact();
			case BPMN2ModelPackage.DOCUMENT_ROOT__ASSIGNMENT:
				return getAssignment();
			case BPMN2ModelPackage.DOCUMENT_ROOT__ASSOCIATION:
				return getAssociation();
			case BPMN2ModelPackage.DOCUMENT_ROOT__AUDITING:
				return getAuditing();
			case BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT:
				return getBaseElement();
			case BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
				return getBaseElementWithMixedContent();
			case BPMN2ModelPackage.DOCUMENT_ROOT__BOUNDARY_EVENT:
				return getBoundaryEvent();
			case BPMN2ModelPackage.DOCUMENT_ROOT__BUSINESS_RULE_TASK:
				return getBusinessRuleTask();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT:
				return getCallableElement();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_ACTIVITY:
				return getCallActivity();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CHOREOGRAPHY:
				return getCallChoreography();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CONVERSATION:
				return getCallConversation();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_NODE:
				return getConversationNode();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION:
				return getCancelEventDefinition();
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_DEFINITION:
				return getEventDefinition();
			case BPMN2ModelPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
				return getRootElement();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATCH_EVENT:
				return getCatchEvent();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY:
				return getCategory();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY_VALUE:
				return getCategoryValue();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY:
				return getChoreography();
			case BPMN2ModelPackage.DOCUMENT_ROOT__COLLABORATION:
				return getCollaboration();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY:
				return getChoreographyActivity();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_TASK:
				return getChoreographyTask();
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION:
				return getCompensateEventDefinition();
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
				return getComplexBehaviorDefinition();
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_GATEWAY:
				return getComplexGateway();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION:
				return getConditionalEventDefinition();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION:
				return getConversation();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION:
				return getConversationAssociation();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_LINK:
				return getConversationLink();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_KEY:
				return getCorrelationKey();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY:
				return getCorrelationProperty();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING:
				return getCorrelationPropertyBinding();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
				return getCorrelationPropertyRetrievalExpression();
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION:
				return getCorrelationSubscription();
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_ASSOCIATION:
				return getDataAssociation();
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT:
				return getDataInput();
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION:
				return getDataInputAssociation();
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT:
				return getDataObject();
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT_REFERENCE:
				return getDataObjectReference();
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT:
				return getDataOutput();
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION:
				return getDataOutputAssociation();
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STATE:
				return getDataState();
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE:
				return getDataStore();
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE_REFERENCE:
				return getDataStoreReference();
			case BPMN2ModelPackage.DOCUMENT_ROOT__DEFINITIONS:
				return getDefinitions();
			case BPMN2ModelPackage.DOCUMENT_ROOT__DOCUMENTATION:
				return getDocumentation();
			case BPMN2ModelPackage.DOCUMENT_ROOT__END_EVENT:
				return getEndEvent();
			case BPMN2ModelPackage.DOCUMENT_ROOT__END_POINT:
				return getEndPoint();
			case BPMN2ModelPackage.DOCUMENT_ROOT__ERROR:
				return getError();
			case BPMN2ModelPackage.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION:
				return getErrorEventDefinition();
			case BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION:
				return getEscalation();
			case BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION:
				return getEscalationEventDefinition();
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT:
				return getEvent();
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_BASED_GATEWAY:
				return getEventBasedGateway();
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY:
				return getExclusiveGateway();
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXPRESSION:
				return getExpression();
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION:
				return getExtension();
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION_ELEMENTS:
				return getExtensionElements();
			case BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_NODE:
				return getFlowNode();
			case BPMN2ModelPackage.DOCUMENT_ROOT__FORMAL_EXPRESSION:
				return getFormalExpression();
			case BPMN2ModelPackage.DOCUMENT_ROOT__GATEWAY:
				return getGateway();
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK:
				return getGlobalBusinessRuleTask();
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
				return getGlobalChoreographyTask();
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CONVERSATION:
				return getGlobalConversation();
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK:
				return getGlobalManualTask();
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK:
				return getGlobalScriptTask();
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_TASK:
				return getGlobalTask();
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_USER_TASK:
				return getGlobalUserTask();
			case BPMN2ModelPackage.DOCUMENT_ROOT__GROUP:
				return getGroup();
			case BPMN2ModelPackage.DOCUMENT_ROOT__HUMAN_PERFORMER:
				return getHumanPerformer();
			case BPMN2ModelPackage.DOCUMENT_ROOT__PERFORMER:
				return getPerformer();
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ROLE:
				return getResourceRole();
			case BPMN2ModelPackage.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT:
				return getImplicitThrowEvent();
			case BPMN2ModelPackage.DOCUMENT_ROOT__IMPORT:
				return getImport();
			case BPMN2ModelPackage.DOCUMENT_ROOT__INCLUSIVE_GATEWAY:
				return getInclusiveGateway();
			case BPMN2ModelPackage.DOCUMENT_ROOT__INPUT_SET:
				return getInputSet();
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERFACE:
				return getInterface();
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT:
				return getIntermediateCatchEvent();
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT:
				return getIntermediateThrowEvent();
			case BPMN2ModelPackage.DOCUMENT_ROOT__IO_BINDING:
				return getIoBinding();
			case BPMN2ModelPackage.DOCUMENT_ROOT__IO_SPECIFICATION:
				return getIoSpecification();
			case BPMN2ModelPackage.DOCUMENT_ROOT__ITEM_DEFINITION:
				return getItemDefinition();
			case BPMN2ModelPackage.DOCUMENT_ROOT__LANE:
				return getLane();
			case BPMN2ModelPackage.DOCUMENT_ROOT__LANE_SET:
				return getLaneSet();
			case BPMN2ModelPackage.DOCUMENT_ROOT__LINK_EVENT_DEFINITION:
				return getLinkEventDefinition();
			case BPMN2ModelPackage.DOCUMENT_ROOT__LOOP_CHARACTERISTICS:
				return getLoopCharacteristics();
			case BPMN2ModelPackage.DOCUMENT_ROOT__MANUAL_TASK:
				return getManualTask();
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE:
				return getMessage();
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION:
				return getMessageEventDefinition();
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW:
				return getMessageFlow();
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION:
				return getMessageFlowAssociation();
			case BPMN2ModelPackage.DOCUMENT_ROOT__MONITORING:
				return getMonitoring();
			case BPMN2ModelPackage.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
				return getMultiInstanceLoopCharacteristics();
			case BPMN2ModelPackage.DOCUMENT_ROOT__OPERATION:
				return getOperation();
			case BPMN2ModelPackage.DOCUMENT_ROOT__OUTPUT_SET:
				return getOutputSet();
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARALLEL_GATEWAY:
				return getParallelGateway();
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT:
				return getParticipant();
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION:
				return getParticipantAssociation();
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY:
				return getParticipantMultiplicity();
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ENTITY:
				return getPartnerEntity();
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ROLE:
				return getPartnerRole();
			case BPMN2ModelPackage.DOCUMENT_ROOT__POTENTIAL_OWNER:
				return getPotentialOwner();
			case BPMN2ModelPackage.DOCUMENT_ROOT__PROCESS:
				return getProcess();
			case BPMN2ModelPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty();
			case BPMN2ModelPackage.DOCUMENT_ROOT__RECEIVE_TASK:
				return getReceiveTask();
			case BPMN2ModelPackage.DOCUMENT_ROOT__RELATIONSHIP:
				return getRelationship();
			case BPMN2ModelPackage.DOCUMENT_ROOT__RENDERING:
				return getRendering();
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE:
				return getResource();
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
				return getResourceAssignmentExpression();
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER:
				return getResourceParameter();
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING:
				return getResourceParameterBinding();
			case BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT:
				return getScript();
			case BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT_TASK:
				return getScriptTask();
			case BPMN2ModelPackage.DOCUMENT_ROOT__SEND_TASK:
				return getSendTask();
			case BPMN2ModelPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
				return getSequenceFlow();
			case BPMN2ModelPackage.DOCUMENT_ROOT__SERVICE_TASK:
				return getServiceTask();
			case BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL:
				return getSignal();
			case BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION:
				return getSignalEventDefinition();
			case BPMN2ModelPackage.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS:
				return getStandardLoopCharacteristics();
			case BPMN2ModelPackage.DOCUMENT_ROOT__START_EVENT:
				return getStartEvent();
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CHOREOGRAPHY:
				return getSubChoreography();
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CONVERSATION:
				return getSubConversation();
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_PROCESS:
				return getSubProcess();
			case BPMN2ModelPackage.DOCUMENT_ROOT__TASK:
				return getTask();
			case BPMN2ModelPackage.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION:
				return getTerminateEventDefinition();
			case BPMN2ModelPackage.DOCUMENT_ROOT__TEXT:
				return getText();
			case BPMN2ModelPackage.DOCUMENT_ROOT__TEXT_ANNOTATION:
				return getTextAnnotation();
			case BPMN2ModelPackage.DOCUMENT_ROOT__THROW_EVENT:
				return getThrowEvent();
			case BPMN2ModelPackage.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION:
				return getTimerEventDefinition();
			case BPMN2ModelPackage.DOCUMENT_ROOT__TRANSACTION:
				return getTransaction();
			case BPMN2ModelPackage.DOCUMENT_ROOT__USER_TASK:
				return getUserTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BPMN2ModelPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS:
				setAdHocSubProcess((AdHocSubProcess)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_ELEMENT:
				setFlowElement((FlowElement)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ARTIFACT:
				setArtifact((Artifact)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ASSIGNMENT:
				setAssignment((Assignment)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__AUDITING:
				setAuditing((Auditing)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT:
				setBaseElement((BaseElement)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
				setBaseElementWithMixedContent((BaseElement)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__BOUNDARY_EVENT:
				setBoundaryEvent((BoundaryEvent)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__BUSINESS_RULE_TASK:
				setBusinessRuleTask((BusinessRuleTask)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT:
				setCallableElement((CallableElement)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_ACTIVITY:
				setCallActivity((CallActivity)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CHOREOGRAPHY:
				setCallChoreography((CallChoreography)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CONVERSATION:
				setCallConversation((CallConversation)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_NODE:
				setConversationNode((ConversationNode)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION:
				setCancelEventDefinition((CancelEventDefinition)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_DEFINITION:
				setEventDefinition((EventDefinition)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
				setRootElement((RootElement)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATCH_EVENT:
				setCatchEvent((CatchEvent)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY:
				setCategory((Category)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY_VALUE:
				setCategoryValue((CategoryValue)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY:
				setChoreography((Choreography)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__COLLABORATION:
				setCollaboration((Collaboration)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY:
				setChoreographyActivity((ChoreographyActivity)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_TASK:
				setChoreographyTask((ChoreographyTask)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION:
				setCompensateEventDefinition((CompensateEventDefinition)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
				setComplexBehaviorDefinition((ComplexBehaviorDefinition)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_GATEWAY:
				setComplexGateway((ComplexGateway)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION:
				setConditionalEventDefinition((ConditionalEventDefinition)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION:
				setConversation((Conversation)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION:
				setConversationAssociation((ConversationAssociation)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_LINK:
				setConversationLink((ConversationLink)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_KEY:
				setCorrelationKey((CorrelationKey)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY:
				setCorrelationProperty((CorrelationProperty)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING:
				setCorrelationPropertyBinding((CorrelationPropertyBinding)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
				setCorrelationPropertyRetrievalExpression((CorrelationPropertyRetrievalExpression)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION:
				setCorrelationSubscription((CorrelationSubscription)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_ASSOCIATION:
				setDataAssociation((DataAssociation)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT:
				setDataInput((DataInput)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION:
				setDataInputAssociation((DataInputAssociation)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT:
				setDataObject((DataObject)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT_REFERENCE:
				setDataObjectReference((DataObjectReference)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT:
				setDataOutput((DataOutput)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION:
				setDataOutputAssociation((DataOutputAssociation)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STATE:
				setDataState((DataState)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE:
				setDataStore((DataStore)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE_REFERENCE:
				setDataStoreReference((DataStoreReference)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DEFINITIONS:
				setDefinitions((Definitions)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DOCUMENTATION:
				setDocumentation((Documentation)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__END_EVENT:
				setEndEvent((EndEvent)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__END_POINT:
				setEndPoint((EndPoint)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ERROR:
				setError((org.emftrace.metamodel.BPMN2Model.Error)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION:
				setErrorEventDefinition((ErrorEventDefinition)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION:
				setEscalation((Escalation)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION:
				setEscalationEventDefinition((EscalationEventDefinition)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT:
				setEvent((Event)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_BASED_GATEWAY:
				setEventBasedGateway((EventBasedGateway)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY:
				setExclusiveGateway((ExclusiveGateway)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION:
				setExtension((Extension)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION_ELEMENTS:
				setExtensionElements((ExtensionAttributeValue)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_NODE:
				setFlowNode((FlowNode)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__FORMAL_EXPRESSION:
				setFormalExpression((FormalExpression)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK:
				setGlobalBusinessRuleTask((GlobalBusinessRuleTask)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
				setGlobalChoreographyTask((GlobalChoreographyTask)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CONVERSATION:
				setGlobalConversation((GlobalConversation)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK:
				setGlobalManualTask((GlobalManualTask)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK:
				setGlobalScriptTask((GlobalScriptTask)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_TASK:
				setGlobalTask((GlobalTask)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_USER_TASK:
				setGlobalUserTask((GlobalUserTask)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GROUP:
				setGroup((Group)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__HUMAN_PERFORMER:
				setHumanPerformer((HumanPerformer)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PERFORMER:
				setPerformer((Performer)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ROLE:
				setResourceRole((ResourceRole)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT:
				setImplicitThrowEvent((ImplicitThrowEvent)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__IMPORT:
				setImport((Import)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__INCLUSIVE_GATEWAY:
				setInclusiveGateway((InclusiveGateway)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__INPUT_SET:
				setInputSet((InputSet)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERFACE:
				setInterface((Interface)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT:
				setIntermediateCatchEvent((IntermediateCatchEvent)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT:
				setIntermediateThrowEvent((IntermediateThrowEvent)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__IO_BINDING:
				setIoBinding((InputOutputBinding)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__IO_SPECIFICATION:
				setIoSpecification((InputOutputSpecification)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ITEM_DEFINITION:
				setItemDefinition((ItemDefinition)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__LANE:
				setLane((Lane)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__LANE_SET:
				setLaneSet((LaneSet)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__LINK_EVENT_DEFINITION:
				setLinkEventDefinition((LinkEventDefinition)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__LOOP_CHARACTERISTICS:
				setLoopCharacteristics((LoopCharacteristics)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MANUAL_TASK:
				setManualTask((ManualTask)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE:
				setMessage((Message)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION:
				setMessageEventDefinition((MessageEventDefinition)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW:
				setMessageFlow((MessageFlow)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION:
				setMessageFlowAssociation((MessageFlowAssociation)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MONITORING:
				setMonitoring((Monitoring)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
				setMultiInstanceLoopCharacteristics((MultiInstanceLoopCharacteristics)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__OPERATION:
				setOperation((Operation)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__OUTPUT_SET:
				setOutputSet((OutputSet)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARALLEL_GATEWAY:
				setParallelGateway((ParallelGateway)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT:
				setParticipant((Participant)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION:
				setParticipantAssociation((ParticipantAssociation)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY:
				setParticipantMultiplicity((ParticipantMultiplicity)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ENTITY:
				setPartnerEntity((PartnerEntity)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ROLE:
				setPartnerRole((PartnerRole)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__POTENTIAL_OWNER:
				setPotentialOwner((PotentialOwner)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PROCESS:
				setProcess((org.emftrace.metamodel.BPMN2Model.Process)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((Property)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RECEIVE_TASK:
				setReceiveTask((ReceiveTask)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RELATIONSHIP:
				setRelationship((Relationship)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RENDERING:
				setRendering((Rendering)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE:
				setResource((Resource)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
				setResourceAssignmentExpression((ResourceAssignmentExpression)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER:
				setResourceParameter((ResourceParameter)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING:
				setResourceParameterBinding((ResourceParameterBinding)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT:
				setScript((EObject)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT_TASK:
				setScriptTask((ScriptTask)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SEND_TASK:
				setSendTask((SendTask)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
				setSequenceFlow((SequenceFlow)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SERVICE_TASK:
				setServiceTask((ServiceTask)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL:
				setSignal((Signal)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION:
				setSignalEventDefinition((SignalEventDefinition)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS:
				setStandardLoopCharacteristics((StandardLoopCharacteristics)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__START_EVENT:
				setStartEvent((StartEvent)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CHOREOGRAPHY:
				setSubChoreography((SubChoreography)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CONVERSATION:
				setSubConversation((SubConversation)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_PROCESS:
				setSubProcess((SubProcess)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TASK:
				setTask((Task)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION:
				setTerminateEventDefinition((TerminateEventDefinition)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TEXT:
				setText((EObject)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TEXT_ANNOTATION:
				setTextAnnotation((TextAnnotation)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__THROW_EVENT:
				setThrowEvent((ThrowEvent)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION:
				setTimerEventDefinition((TimerEventDefinition)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TRANSACTION:
				setTransaction((Transaction)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__USER_TASK:
				setUserTask((UserTask)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BPMN2ModelPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ACTIVITY:
				setActivity((Activity)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS:
				setAdHocSubProcess((AdHocSubProcess)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_ELEMENT:
				setFlowElement((FlowElement)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ARTIFACT:
				setArtifact((Artifact)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ASSIGNMENT:
				setAssignment((Assignment)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__AUDITING:
				setAuditing((Auditing)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT:
				setBaseElement((BaseElement)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
				setBaseElementWithMixedContent((BaseElement)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__BOUNDARY_EVENT:
				setBoundaryEvent((BoundaryEvent)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__BUSINESS_RULE_TASK:
				setBusinessRuleTask((BusinessRuleTask)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT:
				setCallableElement((CallableElement)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_ACTIVITY:
				setCallActivity((CallActivity)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CHOREOGRAPHY:
				setCallChoreography((CallChoreography)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CONVERSATION:
				setCallConversation((CallConversation)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_NODE:
				setConversationNode((ConversationNode)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION:
				setCancelEventDefinition((CancelEventDefinition)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_DEFINITION:
				setEventDefinition((EventDefinition)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
				setRootElement((RootElement)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATCH_EVENT:
				setCatchEvent((CatchEvent)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY:
				setCategory((Category)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY_VALUE:
				setCategoryValue((CategoryValue)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY:
				setChoreography((Choreography)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__COLLABORATION:
				setCollaboration((Collaboration)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY:
				setChoreographyActivity((ChoreographyActivity)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_TASK:
				setChoreographyTask((ChoreographyTask)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION:
				setCompensateEventDefinition((CompensateEventDefinition)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
				setComplexBehaviorDefinition((ComplexBehaviorDefinition)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_GATEWAY:
				setComplexGateway((ComplexGateway)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION:
				setConditionalEventDefinition((ConditionalEventDefinition)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION:
				setConversation((Conversation)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION:
				setConversationAssociation((ConversationAssociation)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_LINK:
				setConversationLink((ConversationLink)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_KEY:
				setCorrelationKey((CorrelationKey)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY:
				setCorrelationProperty((CorrelationProperty)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING:
				setCorrelationPropertyBinding((CorrelationPropertyBinding)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
				setCorrelationPropertyRetrievalExpression((CorrelationPropertyRetrievalExpression)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION:
				setCorrelationSubscription((CorrelationSubscription)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_ASSOCIATION:
				setDataAssociation((DataAssociation)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT:
				setDataInput((DataInput)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION:
				setDataInputAssociation((DataInputAssociation)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT:
				setDataObject((DataObject)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT_REFERENCE:
				setDataObjectReference((DataObjectReference)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT:
				setDataOutput((DataOutput)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION:
				setDataOutputAssociation((DataOutputAssociation)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STATE:
				setDataState((DataState)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE:
				setDataStore((DataStore)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE_REFERENCE:
				setDataStoreReference((DataStoreReference)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DEFINITIONS:
				setDefinitions((Definitions)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DOCUMENTATION:
				setDocumentation((Documentation)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__END_EVENT:
				setEndEvent((EndEvent)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__END_POINT:
				setEndPoint((EndPoint)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ERROR:
				setError((org.emftrace.metamodel.BPMN2Model.Error)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION:
				setErrorEventDefinition((ErrorEventDefinition)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION:
				setEscalation((Escalation)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION:
				setEscalationEventDefinition((EscalationEventDefinition)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT:
				setEvent((Event)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_BASED_GATEWAY:
				setEventBasedGateway((EventBasedGateway)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY:
				setExclusiveGateway((ExclusiveGateway)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXPRESSION:
				setExpression((Expression)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION:
				setExtension((Extension)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION_ELEMENTS:
				setExtensionElements((ExtensionAttributeValue)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_NODE:
				setFlowNode((FlowNode)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__FORMAL_EXPRESSION:
				setFormalExpression((FormalExpression)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK:
				setGlobalBusinessRuleTask((GlobalBusinessRuleTask)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
				setGlobalChoreographyTask((GlobalChoreographyTask)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CONVERSATION:
				setGlobalConversation((GlobalConversation)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK:
				setGlobalManualTask((GlobalManualTask)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK:
				setGlobalScriptTask((GlobalScriptTask)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_TASK:
				setGlobalTask((GlobalTask)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_USER_TASK:
				setGlobalUserTask((GlobalUserTask)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GROUP:
				setGroup((Group)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__HUMAN_PERFORMER:
				setHumanPerformer((HumanPerformer)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PERFORMER:
				setPerformer((Performer)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ROLE:
				setResourceRole((ResourceRole)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT:
				setImplicitThrowEvent((ImplicitThrowEvent)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__IMPORT:
				setImport((Import)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__INCLUSIVE_GATEWAY:
				setInclusiveGateway((InclusiveGateway)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__INPUT_SET:
				setInputSet((InputSet)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERFACE:
				setInterface((Interface)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT:
				setIntermediateCatchEvent((IntermediateCatchEvent)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT:
				setIntermediateThrowEvent((IntermediateThrowEvent)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__IO_BINDING:
				setIoBinding((InputOutputBinding)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__IO_SPECIFICATION:
				setIoSpecification((InputOutputSpecification)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ITEM_DEFINITION:
				setItemDefinition((ItemDefinition)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__LANE:
				setLane((Lane)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__LANE_SET:
				setLaneSet((LaneSet)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__LINK_EVENT_DEFINITION:
				setLinkEventDefinition((LinkEventDefinition)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__LOOP_CHARACTERISTICS:
				setLoopCharacteristics((LoopCharacteristics)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MANUAL_TASK:
				setManualTask((ManualTask)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE:
				setMessage((Message)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION:
				setMessageEventDefinition((MessageEventDefinition)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW:
				setMessageFlow((MessageFlow)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION:
				setMessageFlowAssociation((MessageFlowAssociation)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MONITORING:
				setMonitoring((Monitoring)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
				setMultiInstanceLoopCharacteristics((MultiInstanceLoopCharacteristics)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__OPERATION:
				setOperation((Operation)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__OUTPUT_SET:
				setOutputSet((OutputSet)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARALLEL_GATEWAY:
				setParallelGateway((ParallelGateway)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT:
				setParticipant((Participant)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION:
				setParticipantAssociation((ParticipantAssociation)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY:
				setParticipantMultiplicity((ParticipantMultiplicity)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ENTITY:
				setPartnerEntity((PartnerEntity)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ROLE:
				setPartnerRole((PartnerRole)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__POTENTIAL_OWNER:
				setPotentialOwner((PotentialOwner)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PROCESS:
				setProcess((org.emftrace.metamodel.BPMN2Model.Process)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((Property)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RECEIVE_TASK:
				setReceiveTask((ReceiveTask)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RELATIONSHIP:
				setRelationship((Relationship)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RENDERING:
				setRendering((Rendering)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE:
				setResource((Resource)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
				setResourceAssignmentExpression((ResourceAssignmentExpression)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER:
				setResourceParameter((ResourceParameter)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING:
				setResourceParameterBinding((ResourceParameterBinding)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT:
				setScript((EObject)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT_TASK:
				setScriptTask((ScriptTask)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SEND_TASK:
				setSendTask((SendTask)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
				setSequenceFlow((SequenceFlow)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SERVICE_TASK:
				setServiceTask((ServiceTask)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL:
				setSignal((Signal)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION:
				setSignalEventDefinition((SignalEventDefinition)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS:
				setStandardLoopCharacteristics((StandardLoopCharacteristics)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__START_EVENT:
				setStartEvent((StartEvent)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CHOREOGRAPHY:
				setSubChoreography((SubChoreography)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CONVERSATION:
				setSubConversation((SubConversation)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_PROCESS:
				setSubProcess((SubProcess)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TASK:
				setTask((Task)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION:
				setTerminateEventDefinition((TerminateEventDefinition)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TEXT:
				setText((EObject)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TEXT_ANNOTATION:
				setTextAnnotation((TextAnnotation)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__THROW_EVENT:
				setThrowEvent((ThrowEvent)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION:
				setTimerEventDefinition((TimerEventDefinition)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TRANSACTION:
				setTransaction((Transaction)null);
				return;
			case BPMN2ModelPackage.DOCUMENT_ROOT__USER_TASK:
				setUserTask((UserTask)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BPMN2ModelPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case BPMN2ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case BPMN2ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case BPMN2ModelPackage.DOCUMENT_ROOT__ACTIVITY:
				return activity != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS:
				return adHocSubProcess != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_ELEMENT:
				return flowElement != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ARTIFACT:
				return artifact != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ASSIGNMENT:
				return assignment != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ASSOCIATION:
				return association != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__AUDITING:
				return auditing != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT:
				return baseElement != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
				return baseElementWithMixedContent != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__BOUNDARY_EVENT:
				return boundaryEvent != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__BUSINESS_RULE_TASK:
				return businessRuleTask != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT:
				return callableElement != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_ACTIVITY:
				return callActivity != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CHOREOGRAPHY:
				return callChoreography != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CALL_CONVERSATION:
				return callConversation != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_NODE:
				return conversationNode != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION:
				return cancelEventDefinition != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_DEFINITION:
				return eventDefinition != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
				return rootElement != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATCH_EVENT:
				return catchEvent != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY:
				return category != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CATEGORY_VALUE:
				return categoryValue != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY:
				return choreography != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__COLLABORATION:
				return collaboration != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY:
				return choreographyActivity != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CHOREOGRAPHY_TASK:
				return choreographyTask != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION:
				return compensateEventDefinition != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
				return complexBehaviorDefinition != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__COMPLEX_GATEWAY:
				return complexGateway != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION:
				return conditionalEventDefinition != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION:
				return conversation != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION:
				return conversationAssociation != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CONVERSATION_LINK:
				return conversationLink != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_KEY:
				return correlationKey != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY:
				return correlationProperty != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING:
				return correlationPropertyBinding != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
				return correlationPropertyRetrievalExpression != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION:
				return correlationSubscription != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_ASSOCIATION:
				return dataAssociation != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT:
				return dataInput != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION:
				return dataInputAssociation != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT:
				return dataObject != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OBJECT_REFERENCE:
				return dataObjectReference != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT:
				return dataOutput != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION:
				return dataOutputAssociation != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STATE:
				return dataState != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE:
				return dataStore != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DATA_STORE_REFERENCE:
				return dataStoreReference != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DEFINITIONS:
				return definitions != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__DOCUMENTATION:
				return documentation != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__END_EVENT:
				return endEvent != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__END_POINT:
				return endPoint != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ERROR:
				return error != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION:
				return errorEventDefinition != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION:
				return escalation != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION:
				return escalationEventDefinition != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT:
				return event != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EVENT_BASED_GATEWAY:
				return eventBasedGateway != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY:
				return exclusiveGateway != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXPRESSION:
				return expression != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION:
				return extension != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__EXTENSION_ELEMENTS:
				return extensionElements != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__FLOW_NODE:
				return flowNode != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__FORMAL_EXPRESSION:
				return formalExpression != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GATEWAY:
				return gateway != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK:
				return globalBusinessRuleTask != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
				return globalChoreographyTask != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_CONVERSATION:
				return globalConversation != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK:
				return globalManualTask != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK:
				return globalScriptTask != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_TASK:
				return globalTask != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GLOBAL_USER_TASK:
				return globalUserTask != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__GROUP:
				return group != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__HUMAN_PERFORMER:
				return humanPerformer != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PERFORMER:
				return performer != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ROLE:
				return resourceRole != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT:
				return implicitThrowEvent != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__IMPORT:
				return import_ != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__INCLUSIVE_GATEWAY:
				return inclusiveGateway != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__INPUT_SET:
				return inputSet != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERFACE:
				return interface_ != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT:
				return intermediateCatchEvent != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT:
				return intermediateThrowEvent != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__IO_BINDING:
				return ioBinding != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__IO_SPECIFICATION:
				return ioSpecification != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__ITEM_DEFINITION:
				return itemDefinition != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__LANE:
				return lane != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__LANE_SET:
				return laneSet != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__LINK_EVENT_DEFINITION:
				return linkEventDefinition != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__LOOP_CHARACTERISTICS:
				return loopCharacteristics != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MANUAL_TASK:
				return manualTask != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE:
				return message != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION:
				return messageEventDefinition != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW:
				return messageFlow != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION:
				return messageFlowAssociation != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MONITORING:
				return monitoring != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
				return multiInstanceLoopCharacteristics != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__OPERATION:
				return operation != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__OUTPUT_SET:
				return outputSet != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARALLEL_GATEWAY:
				return parallelGateway != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT:
				return participant != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION:
				return participantAssociation != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY:
				return participantMultiplicity != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ENTITY:
				return partnerEntity != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PARTNER_ROLE:
				return partnerRole != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__POTENTIAL_OWNER:
				return potentialOwner != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PROCESS:
				return process != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__PROPERTY:
				return property != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RECEIVE_TASK:
				return receiveTask != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RELATIONSHIP:
				return relationship != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RENDERING:
				return rendering != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE:
				return resource != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
				return resourceAssignmentExpression != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER:
				return resourceParameter != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING:
				return resourceParameterBinding != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT:
				return script != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SCRIPT_TASK:
				return scriptTask != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SEND_TASK:
				return sendTask != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
				return sequenceFlow != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SERVICE_TASK:
				return serviceTask != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL:
				return signal != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION:
				return signalEventDefinition != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS:
				return standardLoopCharacteristics != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__START_EVENT:
				return startEvent != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CHOREOGRAPHY:
				return subChoreography != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_CONVERSATION:
				return subConversation != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__SUB_PROCESS:
				return subProcess != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TASK:
				return task != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION:
				return terminateEventDefinition != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TEXT:
				return text != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TEXT_ANNOTATION:
				return textAnnotation != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__THROW_EVENT:
				return throwEvent != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION:
				return timerEventDefinition != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__TRANSACTION:
				return transaction != null;
			case BPMN2ModelPackage.DOCUMENT_ROOT__USER_TASK:
				return userTask != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
