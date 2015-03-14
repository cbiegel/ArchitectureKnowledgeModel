/**
 */
package org.emftrace.metamodel.URNModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftrace.metamodel.URNModel.*;

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
 * @see org.emftrace.metamodel.URNModel.URNModelPackage
 * @generated
 */
public class URNModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static URNModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URNModelSwitch() {
		if (modelPackage == null) {
			modelPackage = URNModelPackage.eINSTANCE;
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
			case URNModelPackage.ACTIVE_RESOURCE: {
				ActiveResource activeResource = (ActiveResource)theEObject;
				T result = caseActiveResource(activeResource);
				if (result == null) result = caseGeneralResource(activeResource);
				if (result == null) result = caseUCMmodelElement(activeResource);
				if (result == null) result = caseURNmodelElement(activeResource);
				if (result == null) result = caseURNBase(activeResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseGRLLinkableElement(actor);
				if (result == null) result = caseGRLmodelElement(actor);
				if (result == null) result = caseURNmodelElement(actor);
				if (result == null) result = caseURNBase(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.ACTOR_REF: {
				ActorRef actorRef = (ActorRef)theEObject;
				T result = caseActorRef(actorRef);
				if (result == null) result = caseGRLmodelElement(actorRef);
				if (result == null) result = caseURNmodelElement(actorRef);
				if (result == null) result = caseURNBase(actorRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.AND_FORK: {
				AndFork andFork = (AndFork)theEObject;
				T result = caseAndFork(andFork);
				if (result == null) result = casePathNode(andFork);
				if (result == null) result = caseUCMmodelElement(andFork);
				if (result == null) result = caseURNmodelElement(andFork);
				if (result == null) result = caseURNBase(andFork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.AND_JOIN: {
				AndJoin andJoin = (AndJoin)theEObject;
				T result = caseAndJoin(andJoin);
				if (result == null) result = casePathNode(andJoin);
				if (result == null) result = caseUCMmodelElement(andJoin);
				if (result == null) result = caseURNmodelElement(andJoin);
				if (result == null) result = caseURNBase(andJoin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.CLOSED_WORKLOAD: {
				ClosedWorkload closedWorkload = (ClosedWorkload)theEObject;
				T result = caseClosedWorkload(closedWorkload);
				if (result == null) result = caseWorkload(closedWorkload);
				if (result == null) result = caseUCMmodelElement(closedWorkload);
				if (result == null) result = caseURNmodelElement(closedWorkload);
				if (result == null) result = caseURNBase(closedWorkload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.COLLAPSED_ACTOR_REF: {
				CollapsedActorRef collapsedActorRef = (CollapsedActorRef)theEObject;
				T result = caseCollapsedActorRef(collapsedActorRef);
				if (result == null) result = caseGRLNode(collapsedActorRef);
				if (result == null) result = caseGRLmodelElement(collapsedActorRef);
				if (result == null) result = caseURNmodelElement(collapsedActorRef);
				if (result == null) result = caseURNBase(collapsedActorRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseURNBase(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseUCMmodelElement(component);
				if (result == null) result = caseURNmodelElement(component);
				if (result == null) result = caseURNBase(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.COMPONENT_BINDING: {
				ComponentBinding componentBinding = (ComponentBinding)theEObject;
				T result = caseComponentBinding(componentBinding);
				if (result == null) result = caseURNBase(componentBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.COMPONENT_REF: {
				ComponentRef componentRef = (ComponentRef)theEObject;
				T result = caseComponentRef(componentRef);
				if (result == null) result = caseUCMmodelElement(componentRef);
				if (result == null) result = caseURNmodelElement(componentRef);
				if (result == null) result = caseURNBase(componentRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.COMPONENT_TYPE: {
				ComponentType componentType = (ComponentType)theEObject;
				T result = caseComponentType(componentType);
				if (result == null) result = caseUCMmodelElement(componentType);
				if (result == null) result = caseURNmodelElement(componentType);
				if (result == null) result = caseURNBase(componentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.CONCERN: {
				Concern concern = (Concern)theEObject;
				T result = caseConcern(concern);
				if (result == null) result = caseURNmodelElement(concern);
				if (result == null) result = caseURNBase(concern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.CONCRETE_CONDITION: {
				ConcreteCondition concreteCondition = (ConcreteCondition)theEObject;
				T result = caseConcreteCondition(concreteCondition);
				if (result == null) result = caseURNBase(concreteCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.CONCRETE_GR_LSPEC: {
				ConcreteGRLspec concreteGRLspec = (ConcreteGRLspec)theEObject;
				T result = caseConcreteGRLspec(concreteGRLspec);
				if (result == null) result = caseURNBase(concreteGRLspec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.CONCRETE_STYLE: {
				ConcreteStyle concreteStyle = (ConcreteStyle)theEObject;
				T result = caseConcreteStyle(concreteStyle);
				if (result == null) result = caseURNBase(concreteStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.CONCRETE_UR_NSPEC: {
				ConcreteURNspec concreteURNspec = (ConcreteURNspec)theEObject;
				T result = caseConcreteURNspec(concreteURNspec);
				if (result == null) result = caseURNBase(concreteURNspec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseURNBase(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.CONNECT: {
				Connect connect = (Connect)theEObject;
				T result = caseConnect(connect);
				if (result == null) result = casePathNode(connect);
				if (result == null) result = caseUCMmodelElement(connect);
				if (result == null) result = caseURNmodelElement(connect);
				if (result == null) result = caseURNBase(connect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.CONTRIBUTION: {
				Contribution contribution = (Contribution)theEObject;
				T result = caseContribution(contribution);
				if (result == null) result = caseElementLink(contribution);
				if (result == null) result = caseGRLmodelElement(contribution);
				if (result == null) result = caseURNmodelElement(contribution);
				if (result == null) result = caseURNBase(contribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.DECOMPOSITION: {
				Decomposition decomposition = (Decomposition)theEObject;
				T result = caseDecomposition(decomposition);
				if (result == null) result = caseElementLink(decomposition);
				if (result == null) result = caseGRLmodelElement(decomposition);
				if (result == null) result = caseURNmodelElement(decomposition);
				if (result == null) result = caseURNBase(decomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.DEMAND: {
				Demand demand = (Demand)theEObject;
				T result = caseDemand(demand);
				if (result == null) result = caseURNBase(demand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = caseElementLink(dependency);
				if (result == null) result = caseGRLmodelElement(dependency);
				if (result == null) result = caseURNmodelElement(dependency);
				if (result == null) result = caseURNBase(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.DESCRIPTION: {
				Description description = (Description)theEObject;
				T result = caseDescription(description);
				if (result == null) result = caseURNBase(description);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.DIRECTION_ARROW: {
				DirectionArrow directionArrow = (DirectionArrow)theEObject;
				T result = caseDirectionArrow(directionArrow);
				if (result == null) result = casePathNode(directionArrow);
				if (result == null) result = caseUCMmodelElement(directionArrow);
				if (result == null) result = caseURNmodelElement(directionArrow);
				if (result == null) result = caseURNBase(directionArrow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = caseURNBase(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.ELEMENT_LINK: {
				ElementLink elementLink = (ElementLink)theEObject;
				T result = caseElementLink(elementLink);
				if (result == null) result = caseGRLmodelElement(elementLink);
				if (result == null) result = caseURNmodelElement(elementLink);
				if (result == null) result = caseURNBase(elementLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.EMPTY_POINT: {
				EmptyPoint emptyPoint = (EmptyPoint)theEObject;
				T result = caseEmptyPoint(emptyPoint);
				if (result == null) result = casePathNode(emptyPoint);
				if (result == null) result = caseUCMmodelElement(emptyPoint);
				if (result == null) result = caseURNmodelElement(emptyPoint);
				if (result == null) result = caseURNBase(emptyPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.END_POINT: {
				EndPoint endPoint = (EndPoint)theEObject;
				T result = caseEndPoint(endPoint);
				if (result == null) result = casePathNode(endPoint);
				if (result == null) result = caseUCMmodelElement(endPoint);
				if (result == null) result = caseURNmodelElement(endPoint);
				if (result == null) result = caseURNBase(endPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.ENUMERATION_TYPE: {
				EnumerationType enumerationType = (EnumerationType)theEObject;
				T result = caseEnumerationType(enumerationType);
				if (result == null) result = caseUCMmodelElement(enumerationType);
				if (result == null) result = caseURNmodelElement(enumerationType);
				if (result == null) result = caseURNBase(enumerationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.EVALUATION: {
				Evaluation evaluation = (Evaluation)theEObject;
				T result = caseEvaluation(evaluation);
				if (result == null) result = caseURNBase(evaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.EVALUATION_STRATEGY: {
				EvaluationStrategy evaluationStrategy = (EvaluationStrategy)theEObject;
				T result = caseEvaluationStrategy(evaluationStrategy);
				if (result == null) result = caseGRLmodelElement(evaluationStrategy);
				if (result == null) result = caseURNmodelElement(evaluationStrategy);
				if (result == null) result = caseURNBase(evaluationStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.EXTERNAL_OPERATION: {
				ExternalOperation externalOperation = (ExternalOperation)theEObject;
				T result = caseExternalOperation(externalOperation);
				if (result == null) result = caseActiveResource(externalOperation);
				if (result == null) result = caseGeneralResource(externalOperation);
				if (result == null) result = caseUCMmodelElement(externalOperation);
				if (result == null) result = caseURNmodelElement(externalOperation);
				if (result == null) result = caseURNBase(externalOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.GENERAL_RESOURCE: {
				GeneralResource generalResource = (GeneralResource)theEObject;
				T result = caseGeneralResource(generalResource);
				if (result == null) result = caseUCMmodelElement(generalResource);
				if (result == null) result = caseURNmodelElement(generalResource);
				if (result == null) result = caseURNBase(generalResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.GRL_GRAPH: {
				GRLGraph grlGraph = (GRLGraph)theEObject;
				T result = caseGRLGraph(grlGraph);
				if (result == null) result = caseGRLmodelElement(grlGraph);
				if (result == null) result = caseURNmodelElement(grlGraph);
				if (result == null) result = caseURNBase(grlGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.GRL_LINKABLE_ELEMENT: {
				GRLLinkableElement grlLinkableElement = (GRLLinkableElement)theEObject;
				T result = caseGRLLinkableElement(grlLinkableElement);
				if (result == null) result = caseGRLmodelElement(grlLinkableElement);
				if (result == null) result = caseURNmodelElement(grlLinkableElement);
				if (result == null) result = caseURNBase(grlLinkableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.GR_LMODEL_ELEMENT: {
				GRLmodelElement grLmodelElement = (GRLmodelElement)theEObject;
				T result = caseGRLmodelElement(grLmodelElement);
				if (result == null) result = caseURNmodelElement(grLmodelElement);
				if (result == null) result = caseURNBase(grLmodelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.GRL_NODE: {
				GRLNode grlNode = (GRLNode)theEObject;
				T result = caseGRLNode(grlNode);
				if (result == null) result = caseGRLmodelElement(grlNode);
				if (result == null) result = caseURNmodelElement(grlNode);
				if (result == null) result = caseURNBase(grlNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.GR_LSPEC: {
				GRLspec grLspec = (GRLspec)theEObject;
				T result = caseGRLspec(grLspec);
				if (result == null) result = caseURNBase(grLspec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.IN_BINDING: {
				InBinding inBinding = (InBinding)theEObject;
				T result = caseInBinding(inBinding);
				if (result == null) result = caseURNBase(inBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.INITIALIZATION: {
				Initialization initialization = (Initialization)theEObject;
				T result = caseInitialization(initialization);
				if (result == null) result = caseURNBase(initialization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.INTENTIONAL_ELEMENT: {
				IntentionalElement intentionalElement = (IntentionalElement)theEObject;
				T result = caseIntentionalElement(intentionalElement);
				if (result == null) result = caseGRLLinkableElement(intentionalElement);
				if (result == null) result = caseGRLmodelElement(intentionalElement);
				if (result == null) result = caseURNmodelElement(intentionalElement);
				if (result == null) result = caseURNBase(intentionalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.INTENTIONAL_ELEMENT_REF: {
				IntentionalElementRef intentionalElementRef = (IntentionalElementRef)theEObject;
				T result = caseIntentionalElementRef(intentionalElementRef);
				if (result == null) result = caseGRLNode(intentionalElementRef);
				if (result == null) result = caseGRLmodelElement(intentionalElementRef);
				if (result == null) result = caseURNmodelElement(intentionalElementRef);
				if (result == null) result = caseURNBase(intentionalElementRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseURNBase(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.LINK_REF: {
				LinkRef linkRef = (LinkRef)theEObject;
				T result = caseLinkRef(linkRef);
				if (result == null) result = caseGRLmodelElement(linkRef);
				if (result == null) result = caseURNmodelElement(linkRef);
				if (result == null) result = caseURNBase(linkRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.LINK_REF_BENDPOINT: {
				LinkRefBendpoint linkRefBendpoint = (LinkRefBendpoint)theEObject;
				T result = caseLinkRefBendpoint(linkRefBendpoint);
				if (result == null) result = caseURNBase(linkRefBendpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.METADATA: {
				Metadata metadata = (Metadata)theEObject;
				T result = caseMetadata(metadata);
				if (result == null) result = caseURNBase(metadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.NODE_CONNECTION: {
				NodeConnection nodeConnection = (NodeConnection)theEObject;
				T result = caseNodeConnection(nodeConnection);
				if (result == null) result = caseURNBase(nodeConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.OPEN_WORKLOAD: {
				OpenWorkload openWorkload = (OpenWorkload)theEObject;
				T result = caseOpenWorkload(openWorkload);
				if (result == null) result = caseWorkload(openWorkload);
				if (result == null) result = caseUCMmodelElement(openWorkload);
				if (result == null) result = caseURNmodelElement(openWorkload);
				if (result == null) result = caseURNBase(openWorkload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.OR_FORK: {
				OrFork orFork = (OrFork)theEObject;
				T result = caseOrFork(orFork);
				if (result == null) result = casePathNode(orFork);
				if (result == null) result = caseUCMmodelElement(orFork);
				if (result == null) result = caseURNmodelElement(orFork);
				if (result == null) result = caseURNBase(orFork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.OR_JOIN: {
				OrJoin orJoin = (OrJoin)theEObject;
				T result = caseOrJoin(orJoin);
				if (result == null) result = casePathNode(orJoin);
				if (result == null) result = caseUCMmodelElement(orJoin);
				if (result == null) result = caseURNmodelElement(orJoin);
				if (result == null) result = caseURNBase(orJoin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.OUT_BINDING: {
				OutBinding outBinding = (OutBinding)theEObject;
				T result = caseOutBinding(outBinding);
				if (result == null) result = caseURNBase(outBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.OW_PERIODIC: {
				OWPeriodic owPeriodic = (OWPeriodic)theEObject;
				T result = caseOWPeriodic(owPeriodic);
				if (result == null) result = caseOpenWorkload(owPeriodic);
				if (result == null) result = caseWorkload(owPeriodic);
				if (result == null) result = caseUCMmodelElement(owPeriodic);
				if (result == null) result = caseURNmodelElement(owPeriodic);
				if (result == null) result = caseURNBase(owPeriodic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.OW_PHASE_TYPE: {
				OWPhaseType owPhaseType = (OWPhaseType)theEObject;
				T result = caseOWPhaseType(owPhaseType);
				if (result == null) result = caseOpenWorkload(owPhaseType);
				if (result == null) result = caseWorkload(owPhaseType);
				if (result == null) result = caseUCMmodelElement(owPhaseType);
				if (result == null) result = caseURNmodelElement(owPhaseType);
				if (result == null) result = caseURNBase(owPhaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.OW_POISSON: {
				OWPoisson owPoisson = (OWPoisson)theEObject;
				T result = caseOWPoisson(owPoisson);
				if (result == null) result = caseOpenWorkload(owPoisson);
				if (result == null) result = caseWorkload(owPoisson);
				if (result == null) result = caseUCMmodelElement(owPoisson);
				if (result == null) result = caseURNmodelElement(owPoisson);
				if (result == null) result = caseURNBase(owPoisson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.OW_UNIFORM: {
				OWUniform owUniform = (OWUniform)theEObject;
				T result = caseOWUniform(owUniform);
				if (result == null) result = caseOpenWorkload(owUniform);
				if (result == null) result = caseWorkload(owUniform);
				if (result == null) result = caseUCMmodelElement(owUniform);
				if (result == null) result = caseURNmodelElement(owUniform);
				if (result == null) result = caseURNBase(owUniform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.PASSIVE_RESOURCE: {
				PassiveResource passiveResource = (PassiveResource)theEObject;
				T result = casePassiveResource(passiveResource);
				if (result == null) result = caseGeneralResource(passiveResource);
				if (result == null) result = caseUCMmodelElement(passiveResource);
				if (result == null) result = caseURNmodelElement(passiveResource);
				if (result == null) result = caseURNBase(passiveResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.PATH_NODE: {
				PathNode pathNode = (PathNode)theEObject;
				T result = casePathNode(pathNode);
				if (result == null) result = caseUCMmodelElement(pathNode);
				if (result == null) result = caseURNmodelElement(pathNode);
				if (result == null) result = caseURNBase(pathNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.PLUGIN_BINDING: {
				PluginBinding pluginBinding = (PluginBinding)theEObject;
				T result = casePluginBinding(pluginBinding);
				if (result == null) result = caseURNBase(pluginBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.POSITION: {
				Position position = (Position)theEObject;
				T result = casePosition(position);
				if (result == null) result = caseURNBase(position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.PROCESSING_RESOURCE: {
				ProcessingResource processingResource = (ProcessingResource)theEObject;
				T result = caseProcessingResource(processingResource);
				if (result == null) result = caseActiveResource(processingResource);
				if (result == null) result = caseGeneralResource(processingResource);
				if (result == null) result = caseUCMmodelElement(processingResource);
				if (result == null) result = caseURNmodelElement(processingResource);
				if (result == null) result = caseURNBase(processingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.RESPONSIBILITY: {
				Responsibility responsibility = (Responsibility)theEObject;
				T result = caseResponsibility(responsibility);
				if (result == null) result = caseUCMmodelElement(responsibility);
				if (result == null) result = caseURNmodelElement(responsibility);
				if (result == null) result = caseURNBase(responsibility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.RESP_REF: {
				RespRef respRef = (RespRef)theEObject;
				T result = caseRespRef(respRef);
				if (result == null) result = casePathNode(respRef);
				if (result == null) result = caseUCMmodelElement(respRef);
				if (result == null) result = caseURNmodelElement(respRef);
				if (result == null) result = caseURNBase(respRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.SCENARIO_DEF: {
				ScenarioDef scenarioDef = (ScenarioDef)theEObject;
				T result = caseScenarioDef(scenarioDef);
				if (result == null) result = caseUCMmodelElement(scenarioDef);
				if (result == null) result = caseURNmodelElement(scenarioDef);
				if (result == null) result = caseURNBase(scenarioDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.SCENARIO_GROUP: {
				ScenarioGroup scenarioGroup = (ScenarioGroup)theEObject;
				T result = caseScenarioGroup(scenarioGroup);
				if (result == null) result = caseUCMmodelElement(scenarioGroup);
				if (result == null) result = caseURNmodelElement(scenarioGroup);
				if (result == null) result = caseURNBase(scenarioGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.SIZE: {
				Size size = (Size)theEObject;
				T result = caseSize(size);
				if (result == null) result = caseURNBase(size);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.START_POINT: {
				StartPoint startPoint = (StartPoint)theEObject;
				T result = caseStartPoint(startPoint);
				if (result == null) result = casePathNode(startPoint);
				if (result == null) result = caseUCMmodelElement(startPoint);
				if (result == null) result = caseURNmodelElement(startPoint);
				if (result == null) result = caseURNBase(startPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.STRATEGIES_GROUP: {
				StrategiesGroup strategiesGroup = (StrategiesGroup)theEObject;
				T result = caseStrategiesGroup(strategiesGroup);
				if (result == null) result = caseGRLmodelElement(strategiesGroup);
				if (result == null) result = caseURNmodelElement(strategiesGroup);
				if (result == null) result = caseURNBase(strategiesGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.STUB: {
				Stub stub = (Stub)theEObject;
				T result = caseStub(stub);
				if (result == null) result = casePathNode(stub);
				if (result == null) result = caseUCMmodelElement(stub);
				if (result == null) result = caseURNmodelElement(stub);
				if (result == null) result = caseURNBase(stub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.TIMER: {
				Timer timer = (Timer)theEObject;
				T result = caseTimer(timer);
				if (result == null) result = caseWaitingPlace(timer);
				if (result == null) result = casePathNode(timer);
				if (result == null) result = caseUCMmodelElement(timer);
				if (result == null) result = caseURNmodelElement(timer);
				if (result == null) result = caseURNBase(timer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.UC_MMAP: {
				UCMmap ucMmap = (UCMmap)theEObject;
				T result = caseUCMmap(ucMmap);
				if (result == null) result = caseUCMmodelElement(ucMmap);
				if (result == null) result = caseURNmodelElement(ucMmap);
				if (result == null) result = caseURNBase(ucMmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.UC_MMODEL_ELEMENT: {
				UCMmodelElement ucMmodelElement = (UCMmodelElement)theEObject;
				T result = caseUCMmodelElement(ucMmodelElement);
				if (result == null) result = caseURNmodelElement(ucMmodelElement);
				if (result == null) result = caseURNBase(ucMmodelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.UC_MSPEC: {
				UCMspec ucMspec = (UCMspec)theEObject;
				T result = caseUCMspec(ucMspec);
				if (result == null) result = caseURNBase(ucMspec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.UR_NLINK: {
				URNlink urNlink = (URNlink)theEObject;
				T result = caseURNlink(urNlink);
				if (result == null) result = caseURNmodelElement(urNlink);
				if (result == null) result = caseURNBase(urNlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.UR_NMODEL_ELEMENT: {
				URNmodelElement urNmodelElement = (URNmodelElement)theEObject;
				T result = caseURNmodelElement(urNmodelElement);
				if (result == null) result = caseURNBase(urNmodelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.UR_NSPEC: {
				URNspec urNspec = (URNspec)theEObject;
				T result = caseURNspec(urNspec);
				if (result == null) result = caseURNBase(urNspec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseUCMmodelElement(variable);
				if (result == null) result = caseURNmodelElement(variable);
				if (result == null) result = caseURNBase(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.WAITING_PLACE: {
				WaitingPlace waitingPlace = (WaitingPlace)theEObject;
				T result = caseWaitingPlace(waitingPlace);
				if (result == null) result = casePathNode(waitingPlace);
				if (result == null) result = caseUCMmodelElement(waitingPlace);
				if (result == null) result = caseURNmodelElement(waitingPlace);
				if (result == null) result = caseURNBase(waitingPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.WORKLOAD: {
				Workload workload = (Workload)theEObject;
				T result = caseWorkload(workload);
				if (result == null) result = caseUCMmodelElement(workload);
				if (result == null) result = caseURNmodelElement(workload);
				if (result == null) result = caseURNBase(workload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case URNModelPackage.URN_BASE: {
				URNBase urnBase = (URNBase)theEObject;
				T result = caseURNBase(urnBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiveResource(ActiveResource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Actor Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorRef(ActorRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndFork(AndFork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndJoin(AndJoin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Closed Workload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Closed Workload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClosedWorkload(ClosedWorkload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collapsed Actor Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collapsed Actor Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollapsedActorRef(CollapsedActorRef object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Component Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentBinding(ComponentBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentRef(ComponentRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentType(ComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcern(Concern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteCondition(ConcreteCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete GR Lspec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete GR Lspec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteGRLspec(ConcreteGRLspec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteStyle(ConcreteStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete UR Nspec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete UR Nspec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteURNspec(ConcreteURNspec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnect(Connect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContribution(Contribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecomposition(Decomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Demand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Demand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemand(Demand object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription(Description object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direction Arrow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direction Arrow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectionArrow(DirectionArrow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementLink(ElementLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyPoint(EmptyPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPoint(EndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationType(EnumerationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluation(Evaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationStrategy(EvaluationStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalOperation(ExternalOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralResource(GeneralResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRL Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRL Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRLGraph(GRLGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRL Linkable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRL Linkable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRLLinkableElement(GRLLinkableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GR Lmodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GR Lmodel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRLmodelElement(GRLmodelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRL Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRL Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRLNode(GRLNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GR Lspec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GR Lspec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRLspec(GRLspec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInBinding(InBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialization(Initialization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intentional Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intentional Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentionalElement(IntentionalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intentional Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intentional Element Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentionalElementRef(IntentionalElementRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkRef(LinkRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Ref Bendpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Ref Bendpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkRefBendpoint(LinkRefBendpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadata(Metadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeConnection(NodeConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Workload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Workload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenWorkload(OpenWorkload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrFork(OrFork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrJoin(OrJoin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutBinding(OutBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OW Periodic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OW Periodic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWPeriodic(OWPeriodic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OW Phase Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OW Phase Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWPhaseType(OWPhaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OW Poisson</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OW Poisson</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWPoisson(OWPoisson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OW Uniform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OW Uniform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWUniform(OWUniform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passive Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passive Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassiveResource(PassiveResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathNode(PathNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugin Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugin Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePluginBinding(PluginBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingResource(ProcessingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsibility(Responsibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resp Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resp Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRespRef(RespRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioDef(ScenarioDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioGroup(ScenarioGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSize(Size object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartPoint(StartPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategies Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategies Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategiesGroup(StrategiesGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStub(Stub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimer(Timer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Mmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Mmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUCMmap(UCMmap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Mmodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Mmodel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUCMmodelElement(UCMmodelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Mspec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Mspec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUCMspec(UCMspec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UR Nlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UR Nlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURNlink(URNlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UR Nmodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UR Nmodel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURNmodelElement(URNmodelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UR Nspec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UR Nspec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURNspec(URNspec object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Waiting Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Waiting Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaitingPlace(WaitingPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkload(Workload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URN Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URN Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURNBase(URNBase object) {
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

} //URNModelSwitch
