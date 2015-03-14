/**
 */
package org.emftrace.metamodel.URNModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emftrace.metamodel.URNModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.URNModel.URNModelPackage
 * @generated
 */
public class URNModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static URNModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URNModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = URNModelPackage.eINSTANCE;
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
	protected URNModelSwitch<Adapter> modelSwitch =
		new URNModelSwitch<Adapter>() {
			@Override
			public Adapter caseActiveResource(ActiveResource object) {
				return createActiveResourceAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseActorRef(ActorRef object) {
				return createActorRefAdapter();
			}
			@Override
			public Adapter caseAndFork(AndFork object) {
				return createAndForkAdapter();
			}
			@Override
			public Adapter caseAndJoin(AndJoin object) {
				return createAndJoinAdapter();
			}
			@Override
			public Adapter caseClosedWorkload(ClosedWorkload object) {
				return createClosedWorkloadAdapter();
			}
			@Override
			public Adapter caseCollapsedActorRef(CollapsedActorRef object) {
				return createCollapsedActorRefAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseComponentBinding(ComponentBinding object) {
				return createComponentBindingAdapter();
			}
			@Override
			public Adapter caseComponentRef(ComponentRef object) {
				return createComponentRefAdapter();
			}
			@Override
			public Adapter caseComponentType(ComponentType object) {
				return createComponentTypeAdapter();
			}
			@Override
			public Adapter caseConcern(Concern object) {
				return createConcernAdapter();
			}
			@Override
			public Adapter caseConcreteCondition(ConcreteCondition object) {
				return createConcreteConditionAdapter();
			}
			@Override
			public Adapter caseConcreteGRLspec(ConcreteGRLspec object) {
				return createConcreteGRLspecAdapter();
			}
			@Override
			public Adapter caseConcreteStyle(ConcreteStyle object) {
				return createConcreteStyleAdapter();
			}
			@Override
			public Adapter caseConcreteURNspec(ConcreteURNspec object) {
				return createConcreteURNspecAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseConnect(Connect object) {
				return createConnectAdapter();
			}
			@Override
			public Adapter caseContribution(Contribution object) {
				return createContributionAdapter();
			}
			@Override
			public Adapter caseDecomposition(Decomposition object) {
				return createDecompositionAdapter();
			}
			@Override
			public Adapter caseDemand(Demand object) {
				return createDemandAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseDescription(Description object) {
				return createDescriptionAdapter();
			}
			@Override
			public Adapter caseDirectionArrow(DirectionArrow object) {
				return createDirectionArrowAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseElementLink(ElementLink object) {
				return createElementLinkAdapter();
			}
			@Override
			public Adapter caseEmptyPoint(EmptyPoint object) {
				return createEmptyPointAdapter();
			}
			@Override
			public Adapter caseEndPoint(EndPoint object) {
				return createEndPointAdapter();
			}
			@Override
			public Adapter caseEnumerationType(EnumerationType object) {
				return createEnumerationTypeAdapter();
			}
			@Override
			public Adapter caseEvaluation(Evaluation object) {
				return createEvaluationAdapter();
			}
			@Override
			public Adapter caseEvaluationStrategy(EvaluationStrategy object) {
				return createEvaluationStrategyAdapter();
			}
			@Override
			public Adapter caseExternalOperation(ExternalOperation object) {
				return createExternalOperationAdapter();
			}
			@Override
			public Adapter caseGeneralResource(GeneralResource object) {
				return createGeneralResourceAdapter();
			}
			@Override
			public Adapter caseGRLGraph(GRLGraph object) {
				return createGRLGraphAdapter();
			}
			@Override
			public Adapter caseGRLLinkableElement(GRLLinkableElement object) {
				return createGRLLinkableElementAdapter();
			}
			@Override
			public Adapter caseGRLmodelElement(GRLmodelElement object) {
				return createGRLmodelElementAdapter();
			}
			@Override
			public Adapter caseGRLNode(GRLNode object) {
				return createGRLNodeAdapter();
			}
			@Override
			public Adapter caseGRLspec(GRLspec object) {
				return createGRLspecAdapter();
			}
			@Override
			public Adapter caseInBinding(InBinding object) {
				return createInBindingAdapter();
			}
			@Override
			public Adapter caseInitialization(Initialization object) {
				return createInitializationAdapter();
			}
			@Override
			public Adapter caseIntentionalElement(IntentionalElement object) {
				return createIntentionalElementAdapter();
			}
			@Override
			public Adapter caseIntentionalElementRef(IntentionalElementRef object) {
				return createIntentionalElementRefAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseLinkRef(LinkRef object) {
				return createLinkRefAdapter();
			}
			@Override
			public Adapter caseLinkRefBendpoint(LinkRefBendpoint object) {
				return createLinkRefBendpointAdapter();
			}
			@Override
			public Adapter caseMetadata(Metadata object) {
				return createMetadataAdapter();
			}
			@Override
			public Adapter caseNodeConnection(NodeConnection object) {
				return createNodeConnectionAdapter();
			}
			@Override
			public Adapter caseOpenWorkload(OpenWorkload object) {
				return createOpenWorkloadAdapter();
			}
			@Override
			public Adapter caseOrFork(OrFork object) {
				return createOrForkAdapter();
			}
			@Override
			public Adapter caseOrJoin(OrJoin object) {
				return createOrJoinAdapter();
			}
			@Override
			public Adapter caseOutBinding(OutBinding object) {
				return createOutBindingAdapter();
			}
			@Override
			public Adapter caseOWPeriodic(OWPeriodic object) {
				return createOWPeriodicAdapter();
			}
			@Override
			public Adapter caseOWPhaseType(OWPhaseType object) {
				return createOWPhaseTypeAdapter();
			}
			@Override
			public Adapter caseOWPoisson(OWPoisson object) {
				return createOWPoissonAdapter();
			}
			@Override
			public Adapter caseOWUniform(OWUniform object) {
				return createOWUniformAdapter();
			}
			@Override
			public Adapter casePassiveResource(PassiveResource object) {
				return createPassiveResourceAdapter();
			}
			@Override
			public Adapter casePathNode(PathNode object) {
				return createPathNodeAdapter();
			}
			@Override
			public Adapter casePluginBinding(PluginBinding object) {
				return createPluginBindingAdapter();
			}
			@Override
			public Adapter casePosition(Position object) {
				return createPositionAdapter();
			}
			@Override
			public Adapter caseProcessingResource(ProcessingResource object) {
				return createProcessingResourceAdapter();
			}
			@Override
			public Adapter caseResponsibility(Responsibility object) {
				return createResponsibilityAdapter();
			}
			@Override
			public Adapter caseRespRef(RespRef object) {
				return createRespRefAdapter();
			}
			@Override
			public Adapter caseScenarioDef(ScenarioDef object) {
				return createScenarioDefAdapter();
			}
			@Override
			public Adapter caseScenarioGroup(ScenarioGroup object) {
				return createScenarioGroupAdapter();
			}
			@Override
			public Adapter caseSize(Size object) {
				return createSizeAdapter();
			}
			@Override
			public Adapter caseStartPoint(StartPoint object) {
				return createStartPointAdapter();
			}
			@Override
			public Adapter caseStrategiesGroup(StrategiesGroup object) {
				return createStrategiesGroupAdapter();
			}
			@Override
			public Adapter caseStub(Stub object) {
				return createStubAdapter();
			}
			@Override
			public Adapter caseTimer(Timer object) {
				return createTimerAdapter();
			}
			@Override
			public Adapter caseUCMmap(UCMmap object) {
				return createUCMmapAdapter();
			}
			@Override
			public Adapter caseUCMmodelElement(UCMmodelElement object) {
				return createUCMmodelElementAdapter();
			}
			@Override
			public Adapter caseUCMspec(UCMspec object) {
				return createUCMspecAdapter();
			}
			@Override
			public Adapter caseURNlink(URNlink object) {
				return createURNlinkAdapter();
			}
			@Override
			public Adapter caseURNmodelElement(URNmodelElement object) {
				return createURNmodelElementAdapter();
			}
			@Override
			public Adapter caseURNspec(URNspec object) {
				return createURNspecAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseWaitingPlace(WaitingPlace object) {
				return createWaitingPlaceAdapter();
			}
			@Override
			public Adapter caseWorkload(Workload object) {
				return createWorkloadAdapter();
			}
			@Override
			public Adapter caseURNBase(URNBase object) {
				return createURNBaseAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.ActiveResource <em>Active Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.ActiveResource
	 * @generated
	 */
	public Adapter createActiveResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.ActorRef <em>Actor Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.ActorRef
	 * @generated
	 */
	public Adapter createActorRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.AndFork <em>And Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.AndFork
	 * @generated
	 */
	public Adapter createAndForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.AndJoin <em>And Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.AndJoin
	 * @generated
	 */
	public Adapter createAndJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.ClosedWorkload <em>Closed Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.ClosedWorkload
	 * @generated
	 */
	public Adapter createClosedWorkloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.CollapsedActorRef <em>Collapsed Actor Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.CollapsedActorRef
	 * @generated
	 */
	public Adapter createCollapsedActorRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.ComponentBinding <em>Component Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.ComponentBinding
	 * @generated
	 */
	public Adapter createComponentBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.ComponentRef <em>Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.ComponentRef
	 * @generated
	 */
	public Adapter createComponentRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Concern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Concern
	 * @generated
	 */
	public Adapter createConcernAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.ConcreteCondition <em>Concrete Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.ConcreteCondition
	 * @generated
	 */
	public Adapter createConcreteConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.ConcreteGRLspec <em>Concrete GR Lspec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.ConcreteGRLspec
	 * @generated
	 */
	public Adapter createConcreteGRLspecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.ConcreteStyle <em>Concrete Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.ConcreteStyle
	 * @generated
	 */
	public Adapter createConcreteStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.ConcreteURNspec <em>Concrete UR Nspec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.ConcreteURNspec
	 * @generated
	 */
	public Adapter createConcreteURNspecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Connect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Connect
	 * @generated
	 */
	public Adapter createConnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Contribution
	 * @generated
	 */
	public Adapter createContributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Decomposition
	 * @generated
	 */
	public Adapter createDecompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Demand <em>Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Demand
	 * @generated
	 */
	public Adapter createDemandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Description
	 * @generated
	 */
	public Adapter createDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.DirectionArrow <em>Direction Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.DirectionArrow
	 * @generated
	 */
	public Adapter createDirectionArrowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.ElementLink <em>Element Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.ElementLink
	 * @generated
	 */
	public Adapter createElementLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.EmptyPoint <em>Empty Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.EmptyPoint
	 * @generated
	 */
	public Adapter createEmptyPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.EndPoint
	 * @generated
	 */
	public Adapter createEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.EnumerationType
	 * @generated
	 */
	public Adapter createEnumerationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Evaluation
	 * @generated
	 */
	public Adapter createEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.EvaluationStrategy <em>Evaluation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.EvaluationStrategy
	 * @generated
	 */
	public Adapter createEvaluationStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.ExternalOperation <em>External Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.ExternalOperation
	 * @generated
	 */
	public Adapter createExternalOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.GeneralResource <em>General Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.GeneralResource
	 * @generated
	 */
	public Adapter createGeneralResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.GRLGraph <em>GRL Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.GRLGraph
	 * @generated
	 */
	public Adapter createGRLGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.GRLLinkableElement <em>GRL Linkable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.GRLLinkableElement
	 * @generated
	 */
	public Adapter createGRLLinkableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.GRLmodelElement <em>GR Lmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.GRLmodelElement
	 * @generated
	 */
	public Adapter createGRLmodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.GRLNode <em>GRL Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.GRLNode
	 * @generated
	 */
	public Adapter createGRLNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.GRLspec <em>GR Lspec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.GRLspec
	 * @generated
	 */
	public Adapter createGRLspecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.InBinding <em>In Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.InBinding
	 * @generated
	 */
	public Adapter createInBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Initialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Initialization
	 * @generated
	 */
	public Adapter createInitializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.IntentionalElement <em>Intentional Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.IntentionalElement
	 * @generated
	 */
	public Adapter createIntentionalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.IntentionalElementRef <em>Intentional Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.IntentionalElementRef
	 * @generated
	 */
	public Adapter createIntentionalElementRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.LinkRef <em>Link Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.LinkRef
	 * @generated
	 */
	public Adapter createLinkRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.LinkRefBendpoint <em>Link Ref Bendpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.LinkRefBendpoint
	 * @generated
	 */
	public Adapter createLinkRefBendpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.NodeConnection <em>Node Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.NodeConnection
	 * @generated
	 */
	public Adapter createNodeConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.OpenWorkload <em>Open Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.OpenWorkload
	 * @generated
	 */
	public Adapter createOpenWorkloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.OrFork <em>Or Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.OrFork
	 * @generated
	 */
	public Adapter createOrForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.OrJoin <em>Or Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.OrJoin
	 * @generated
	 */
	public Adapter createOrJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.OutBinding <em>Out Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.OutBinding
	 * @generated
	 */
	public Adapter createOutBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.OWPeriodic <em>OW Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.OWPeriodic
	 * @generated
	 */
	public Adapter createOWPeriodicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.OWPhaseType <em>OW Phase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.OWPhaseType
	 * @generated
	 */
	public Adapter createOWPhaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.OWPoisson <em>OW Poisson</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.OWPoisson
	 * @generated
	 */
	public Adapter createOWPoissonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.OWUniform <em>OW Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.OWUniform
	 * @generated
	 */
	public Adapter createOWUniformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.PassiveResource <em>Passive Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.PassiveResource
	 * @generated
	 */
	public Adapter createPassiveResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.PathNode <em>Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.PathNode
	 * @generated
	 */
	public Adapter createPathNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.PluginBinding <em>Plugin Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.PluginBinding
	 * @generated
	 */
	public Adapter createPluginBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.ProcessingResource <em>Processing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.ProcessingResource
	 * @generated
	 */
	public Adapter createProcessingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Responsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Responsibility
	 * @generated
	 */
	public Adapter createResponsibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.RespRef <em>Resp Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.RespRef
	 * @generated
	 */
	public Adapter createRespRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.ScenarioDef <em>Scenario Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.ScenarioDef
	 * @generated
	 */
	public Adapter createScenarioDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.ScenarioGroup <em>Scenario Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.ScenarioGroup
	 * @generated
	 */
	public Adapter createScenarioGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Size
	 * @generated
	 */
	public Adapter createSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.StartPoint <em>Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.StartPoint
	 * @generated
	 */
	public Adapter createStartPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.StrategiesGroup <em>Strategies Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.StrategiesGroup
	 * @generated
	 */
	public Adapter createStrategiesGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Stub <em>Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Stub
	 * @generated
	 */
	public Adapter createStubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Timer
	 * @generated
	 */
	public Adapter createTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.UCMmap <em>UC Mmap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.UCMmap
	 * @generated
	 */
	public Adapter createUCMmapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.UCMmodelElement <em>UC Mmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.UCMmodelElement
	 * @generated
	 */
	public Adapter createUCMmodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.UCMspec <em>UC Mspec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.UCMspec
	 * @generated
	 */
	public Adapter createUCMspecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.URNlink <em>UR Nlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.URNlink
	 * @generated
	 */
	public Adapter createURNlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.URNmodelElement <em>UR Nmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.URNmodelElement
	 * @generated
	 */
	public Adapter createURNmodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.URNspec <em>UR Nspec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.URNspec
	 * @generated
	 */
	public Adapter createURNspecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.WaitingPlace <em>Waiting Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.WaitingPlace
	 * @generated
	 */
	public Adapter createWaitingPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.Workload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.Workload
	 * @generated
	 */
	public Adapter createWorkloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.URNModel.URNBase <em>URN Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.URNModel.URNBase
	 * @generated
	 */
	public Adapter createURNBaseAdapter() {
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

} //URNModelAdapterFactory
