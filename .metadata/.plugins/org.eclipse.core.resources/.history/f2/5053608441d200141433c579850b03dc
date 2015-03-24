/**
 */
package org.emftrace.metamodel.URNModel.impl;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackagePackage;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionCatalogPackage.impl.TechnologySolutionCatalogPackagePackageImpl;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.ArchitectureKnowledgeModelPackageImpl;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;

import org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl;

import org.emftrace.metamodel.ChangeModel.ChangeModelPackage;

import org.emftrace.metamodel.ChangeModel.impl.ChangeModelPackageImpl;

import org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage;

import org.emftrace.metamodel.EMFfitModel.impl.EMFfitModelPackageImpl;

import org.emftrace.metamodel.FeatureModel.FeatureModelPackage;

import org.emftrace.metamodel.FeatureModel.impl.FeatureModelPackageImpl;

import org.emftrace.metamodel.LinkModel.LinkModelPackage;

import org.emftrace.metamodel.LinkModel.impl.LinkModelPackageImpl;

import org.emftrace.metamodel.OWLModel.OWLModelPackage;

import org.emftrace.metamodel.OWLModel.impl.OWLModelPackageImpl;

import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage;

import org.emftrace.metamodel.QUARCModel.Constraints.impl.ConstraintsPackageImpl;

import org.emftrace.metamodel.QUARCModel.GSS.GSSPackage;

import org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl;

import org.emftrace.metamodel.QUARCModel.Packages.PackagesPackage;

import org.emftrace.metamodel.QUARCModel.Packages.impl.PackagesPackageImpl;

import org.emftrace.metamodel.QUARCModel.Query.QueryPackage;

import org.emftrace.metamodel.QUARCModel.Query.impl.QueryPackageImpl;

import org.emftrace.metamodel.ReportModel.ReportModelPackage;

import org.emftrace.metamodel.ReportModel.impl.ReportModelPackageImpl;

import org.emftrace.metamodel.RuleModel.RuleModelPackage;

import org.emftrace.metamodel.RuleModel.impl.RuleModelPackageImpl;

import org.emftrace.metamodel.UMLModel.UMLModelPackage;

import org.emftrace.metamodel.UMLModel.impl.UMLModelPackageImpl;

import org.emftrace.metamodel.URNModel.ActiveResource;
import org.emftrace.metamodel.URNModel.Actor;
import org.emftrace.metamodel.URNModel.ActorRef;
import org.emftrace.metamodel.URNModel.AndFork;
import org.emftrace.metamodel.URNModel.AndJoin;
import org.emftrace.metamodel.URNModel.ClosedWorkload;
import org.emftrace.metamodel.URNModel.CollapsedActorRef;
import org.emftrace.metamodel.URNModel.Comment;
import org.emftrace.metamodel.URNModel.Component;
import org.emftrace.metamodel.URNModel.ComponentBinding;
import org.emftrace.metamodel.URNModel.ComponentKind;
import org.emftrace.metamodel.URNModel.ComponentRef;
import org.emftrace.metamodel.URNModel.ComponentType;
import org.emftrace.metamodel.URNModel.Concern;
import org.emftrace.metamodel.URNModel.ConcreteCondition;
import org.emftrace.metamodel.URNModel.ConcreteGRLspec;
import org.emftrace.metamodel.URNModel.ConcreteStyle;
import org.emftrace.metamodel.URNModel.ConcreteURNspec;
import org.emftrace.metamodel.URNModel.Condition;
import org.emftrace.metamodel.URNModel.Connect;
import org.emftrace.metamodel.URNModel.Contribution;
import org.emftrace.metamodel.URNModel.ContributionType;
import org.emftrace.metamodel.URNModel.DatatypeKind;
import org.emftrace.metamodel.URNModel.Decomposition;
import org.emftrace.metamodel.URNModel.DecompositionType;
import org.emftrace.metamodel.URNModel.Demand;
import org.emftrace.metamodel.URNModel.Dependency;
import org.emftrace.metamodel.URNModel.Description;
import org.emftrace.metamodel.URNModel.DeviceKind;
import org.emftrace.metamodel.URNModel.DirectionArrow;
import org.emftrace.metamodel.URNModel.DocumentRoot;
import org.emftrace.metamodel.URNModel.ElementLink;
import org.emftrace.metamodel.URNModel.EmptyPoint;
import org.emftrace.metamodel.URNModel.EndPoint;
import org.emftrace.metamodel.URNModel.EnumerationType;
import org.emftrace.metamodel.URNModel.Evaluation;
import org.emftrace.metamodel.URNModel.EvaluationStrategy;
import org.emftrace.metamodel.URNModel.ExternalOperation;
import org.emftrace.metamodel.URNModel.GRLGraph;
import org.emftrace.metamodel.URNModel.GRLLinkableElement;
import org.emftrace.metamodel.URNModel.GRLNode;
import org.emftrace.metamodel.URNModel.GRLmodelElement;
import org.emftrace.metamodel.URNModel.GRLspec;
import org.emftrace.metamodel.URNModel.GeneralResource;
import org.emftrace.metamodel.URNModel.ImportanceType;
import org.emftrace.metamodel.URNModel.InBinding;
import org.emftrace.metamodel.URNModel.Initialization;
import org.emftrace.metamodel.URNModel.IntentionalElement;
import org.emftrace.metamodel.URNModel.IntentionalElementRef;
import org.emftrace.metamodel.URNModel.IntentionalElementType;
import org.emftrace.metamodel.URNModel.Label;
import org.emftrace.metamodel.URNModel.LinkRef;
import org.emftrace.metamodel.URNModel.LinkRefBendpoint;
import org.emftrace.metamodel.URNModel.Metadata;
import org.emftrace.metamodel.URNModel.NodeConnection;
import org.emftrace.metamodel.URNModel.OWPeriodic;
import org.emftrace.metamodel.URNModel.OWPhaseType;
import org.emftrace.metamodel.URNModel.OWPoisson;
import org.emftrace.metamodel.URNModel.OWUniform;
import org.emftrace.metamodel.URNModel.OpenWorkload;
import org.emftrace.metamodel.URNModel.OrFork;
import org.emftrace.metamodel.URNModel.OrJoin;
import org.emftrace.metamodel.URNModel.OutBinding;
import org.emftrace.metamodel.URNModel.PassiveResource;
import org.emftrace.metamodel.URNModel.PathNode;
import org.emftrace.metamodel.URNModel.PluginBinding;
import org.emftrace.metamodel.URNModel.Position;
import org.emftrace.metamodel.URNModel.ProcessingResource;
import org.emftrace.metamodel.URNModel.QualitativeLabel;
import org.emftrace.metamodel.URNModel.RespRef;
import org.emftrace.metamodel.URNModel.Responsibility;
import org.emftrace.metamodel.URNModel.ScenarioDef;
import org.emftrace.metamodel.URNModel.ScenarioGroup;
import org.emftrace.metamodel.URNModel.Size;
import org.emftrace.metamodel.URNModel.StartPoint;
import org.emftrace.metamodel.URNModel.StrategiesGroup;
import org.emftrace.metamodel.URNModel.Stub;
import org.emftrace.metamodel.URNModel.TimeUnit;
import org.emftrace.metamodel.URNModel.Timer;
import org.emftrace.metamodel.URNModel.UCMmap;
import org.emftrace.metamodel.URNModel.UCMmodelElement;
import org.emftrace.metamodel.URNModel.UCMspec;
import org.emftrace.metamodel.URNModel.URNBase;
import org.emftrace.metamodel.URNModel.URNModelFactory;
import org.emftrace.metamodel.URNModel.URNModelPackage;
import org.emftrace.metamodel.URNModel.URNlink;
import org.emftrace.metamodel.URNModel.URNmodelElement;
import org.emftrace.metamodel.URNModel.URNspec;
import org.emftrace.metamodel.URNModel.Variable;
import org.emftrace.metamodel.URNModel.WaitKind;
import org.emftrace.metamodel.URNModel.WaitingPlace;
import org.emftrace.metamodel.URNModel.Workload;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class URNModelPackageImpl extends EPackageImpl implements URNModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activeResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andForkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andJoinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closedWorkloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collapsedActorRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concernEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteGRLspecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteURNspecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directionArrowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grlGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grlLinkableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grLmodelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grLspecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentionalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentionalElementRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkRefBendpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openWorkloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orForkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orJoinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owPeriodicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owPhaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owPoissonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owUniformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passiveResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsibilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass respRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategiesGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucMmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucMmodelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucMspecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urNlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urNmodelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urNspecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitingPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urnBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contributionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datatypeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum decompositionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum importanceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum intentionalElementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qualitativeLabelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum waitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType componentKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contributionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datatypeKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType decompositionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType importanceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intentionalElementTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType qualitativeLabelObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeUnitObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType waitKindObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private URNModelPackageImpl() {
		super(eNS_URI, URNModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link URNModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static URNModelPackage init() {
		if (isInited) return (URNModelPackage)EPackage.Registry.INSTANCE.getEPackage(URNModelPackage.eNS_URI);

		// Obtain or create and register package
		URNModelPackageImpl theURNModelPackage = (URNModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof URNModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new URNModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		LinkModelPackageImpl theLinkModelPackage = (LinkModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LinkModelPackage.eNS_URI) instanceof LinkModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LinkModelPackage.eNS_URI) : LinkModelPackage.eINSTANCE);
		RuleModelPackageImpl theRuleModelPackage = (RuleModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RuleModelPackage.eNS_URI) instanceof RuleModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RuleModelPackage.eNS_URI) : RuleModelPackage.eINSTANCE);
		ReportModelPackageImpl theReportModelPackage = (ReportModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReportModelPackage.eNS_URI) instanceof ReportModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReportModelPackage.eNS_URI) : ReportModelPackage.eINSTANCE);
		FeatureModelPackageImpl theFeatureModelPackage = (FeatureModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeatureModelPackage.eNS_URI) instanceof FeatureModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeatureModelPackage.eNS_URI) : FeatureModelPackage.eINSTANCE);
		OWLModelPackageImpl theOWLModelPackage = (OWLModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI) instanceof OWLModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI) : OWLModelPackage.eINSTANCE);
		UMLModelPackageImpl theUMLModelPackage = (UMLModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI) instanceof UMLModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI) : UMLModelPackage.eINSTANCE);
		BPMN2ModelPackageImpl theBPMN2ModelPackage = (BPMN2ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPMN2ModelPackage.eNS_URI) instanceof BPMN2ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPMN2ModelPackage.eNS_URI) : BPMN2ModelPackage.eINSTANCE);
		EMFfitModelPackageImpl theEMFfitModelPackage = (EMFfitModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EMFfitModelPackage.eNS_URI) instanceof EMFfitModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EMFfitModelPackage.eNS_URI) : EMFfitModelPackage.eINSTANCE);
		ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI) instanceof ConstraintsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI) : ConstraintsPackage.eINSTANCE);
		GSSPackageImpl theGSSPackage = (GSSPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI) instanceof GSSPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI) : GSSPackage.eINSTANCE);
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI) instanceof QueryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI) : QueryPackage.eINSTANCE);
		PackagesPackageImpl thePackagesPackage = (PackagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) instanceof PackagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) : PackagesPackage.eINSTANCE);
		ArchitectureKnowledgeModelPackageImpl theArchitectureKnowledgeModelPackage = (ArchitectureKnowledgeModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitectureKnowledgeModelPackage.eNS_URI) instanceof ArchitectureKnowledgeModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitectureKnowledgeModelPackage.eNS_URI) : ArchitectureKnowledgeModelPackage.eINSTANCE);
		TechnologySolutionCatalogPackagePackageImpl theTechnologySolutionCatalogPackagePackage = (TechnologySolutionCatalogPackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TechnologySolutionCatalogPackagePackage.eNS_URI) instanceof TechnologySolutionCatalogPackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TechnologySolutionCatalogPackagePackage.eNS_URI) : TechnologySolutionCatalogPackagePackage.eINSTANCE);
		ChangeModelPackageImpl theChangeModelPackage = (ChangeModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChangeModelPackage.eNS_URI) instanceof ChangeModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChangeModelPackage.eNS_URI) : ChangeModelPackage.eINSTANCE);

		// Load packages
		theOWLModelPackage.loadPackage();
		theUMLModelPackage.loadPackage();
		theBPMN2ModelPackage.loadPackage();

		// Create package meta-data objects
		theURNModelPackage.createPackageContents();
		theLinkModelPackage.createPackageContents();
		theRuleModelPackage.createPackageContents();
		theReportModelPackage.createPackageContents();
		theFeatureModelPackage.createPackageContents();
		theEMFfitModelPackage.createPackageContents();
		theConstraintsPackage.createPackageContents();
		theGSSPackage.createPackageContents();
		theQueryPackage.createPackageContents();
		thePackagesPackage.createPackageContents();
		theArchitectureKnowledgeModelPackage.createPackageContents();
		theTechnologySolutionCatalogPackagePackage.createPackageContents();
		theChangeModelPackage.createPackageContents();

		// Initialize created meta-data
		theURNModelPackage.initializePackageContents();
		theLinkModelPackage.initializePackageContents();
		theRuleModelPackage.initializePackageContents();
		theReportModelPackage.initializePackageContents();
		theFeatureModelPackage.initializePackageContents();
		theEMFfitModelPackage.initializePackageContents();
		theConstraintsPackage.initializePackageContents();
		theGSSPackage.initializePackageContents();
		theQueryPackage.initializePackageContents();
		thePackagesPackage.initializePackageContents();
		theArchitectureKnowledgeModelPackage.initializePackageContents();
		theTechnologySolutionCatalogPackagePackage.initializePackageContents();
		theChangeModelPackage.initializePackageContents();

		// Fix loaded packages
		theOWLModelPackage.fixPackageContents();
		theUMLModelPackage.fixPackageContents();
		theBPMN2ModelPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theURNModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(URNModelPackage.eNS_URI, theURNModelPackage);
		return theURNModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActiveResource() {
		return activeResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiveResource_OpTime() {
		return (EAttribute)activeResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiveResource_Unit() {
		return (EAttribute)activeResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_CollapsedRefs() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_ActorRefs() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Style() {
		return (EReference)actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Elems() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorRef() {
		return actorRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorRef_Label() {
		return (EReference)actorRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActorRef_ActorDef() {
		return (EAttribute)actorRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActorRef_Nodes() {
		return (EAttribute)actorRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorRef_Pos() {
		return (EReference)actorRefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorRef_Size() {
		return (EReference)actorRefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndFork() {
		return andForkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndJoin() {
		return andJoinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClosedWorkload() {
		return closedWorkloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClosedWorkload_Population() {
		return (EAttribute)closedWorkloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClosedWorkload_ExternalDelay() {
		return (EAttribute)closedWorkloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollapsedActorRef() {
		return collapsedActorRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollapsedActorRef_Actor() {
		return (EAttribute)collapsedActorRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Description() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_X() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Y() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Width() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Height() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_FillColor() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Kind() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Protected() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Context() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Type() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_IncludedComponents() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_IncludingComponents() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Host() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Resource() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_CompRefs() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Style() {
		return (EReference)componentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentBinding() {
		return componentBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentBinding_Id() {
		return (EAttribute)componentBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentBinding_ParentComponent() {
		return (EAttribute)componentBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentBinding_PluginComponent() {
		return (EAttribute)componentBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentRef() {
		return componentRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRef_ParentBindings() {
		return (EAttribute)componentRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRef_PluginBindings() {
		return (EAttribute)componentRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRef_CompDef() {
		return (EAttribute)componentRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentRef_Label() {
		return (EReference)componentRefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRef_Children() {
		return (EAttribute)componentRefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRef_Parent() {
		return (EAttribute)componentRefEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRef_Nodes() {
		return (EAttribute)componentRefEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentRef_Pos() {
		return (EReference)componentRefEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentRef_Size() {
		return (EReference)componentRefEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentType() {
		return componentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentType_Instances() {
		return (EAttribute)componentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcern() {
		return concernEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcern_Condition() {
		return (EReference)concernEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcern_Elements() {
		return (EAttribute)concernEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteCondition() {
		return concreteConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteCondition_Label() {
		return (EAttribute)concreteConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteCondition_Description() {
		return (EAttribute)concreteConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteGRLspec() {
		return concreteGRLspecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteGRLspec_ShowAsMeansEnd() {
		return (EAttribute)concreteGRLspecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteStyle() {
		return concreteStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteStyle_LineColor() {
		return (EAttribute)concreteStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteStyle_FillColor() {
		return (EAttribute)concreteStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteStyle_Filled() {
		return (EAttribute)concreteStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteURNspec() {
		return concreteURNspecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteURNspec_Description() {
		return (EAttribute)concreteURNspecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteURNspec_Author() {
		return (EAttribute)concreteURNspecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteURNspec_Created() {
		return (EAttribute)concreteURNspecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteURNspec_Modified() {
		return (EAttribute)concreteURNspecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteURNspec_SpecVersion() {
		return (EAttribute)concreteURNspecEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteURNspec_UrnVersion() {
		return (EAttribute)concreteURNspecEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Expression() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Desc() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Label() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnect() {
		return connectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContribution() {
		return contributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContribution_Contribution() {
		return (EAttribute)contributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContribution_QuantitativeContribution() {
		return (EAttribute)contributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContribution_Correlation() {
		return (EAttribute)contributionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecomposition() {
		return decompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDemand() {
		return demandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDemand_Quantity() {
		return (EAttribute)demandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDemand_Resource() {
		return (EAttribute)demandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_Description() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectionArrow() {
		return directionArrowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_URNspec() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementLink() {
		return elementLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementLink_Refs() {
		return (EAttribute)elementLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementLink_Dest() {
		return (EAttribute)elementLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementLink_Src() {
		return (EAttribute)elementLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyPoint() {
		return emptyPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndPoint() {
		return endPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndPoint_OutBindings() {
		return (EAttribute)endPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndPoint_Postcondition() {
		return (EReference)endPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationType() {
		return enumerationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType_Values() {
		return (EAttribute)enumerationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType_Instances() {
		return (EAttribute)enumerationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluation() {
		return evaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluation_Evaluation() {
		return (EAttribute)evaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluation_QualitativeEvaluation() {
		return (EAttribute)evaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluation_IntElement() {
		return (EAttribute)evaluationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationStrategy() {
		return evaluationStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationStrategy_Evaluations() {
		return (EReference)evaluationStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluationStrategy_Group() {
		return (EAttribute)evaluationStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalOperation() {
		return externalOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalOperation_Demands() {
		return (EAttribute)externalOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralResource() {
		return generalResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralResource_Multiplicity() {
		return (EAttribute)generalResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralResource_SchedPolicy() {
		return (EAttribute)generalResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGRLGraph() {
		return grlGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGRLGraph_Connections() {
		return (EReference)grlGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGRLGraph_Nodes() {
		return (EReference)grlGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGRLGraph_ContRefs() {
		return (EReference)grlGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGRLGraph_Comments() {
		return (EReference)grlGraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGRLLinkableElement() {
		return grlLinkableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGRLLinkableElement_LinksDest() {
		return (EAttribute)grlLinkableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGRLLinkableElement_LinksSrc() {
		return (EAttribute)grlLinkableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGRLmodelElement() {
		return grLmodelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGRLNode() {
		return grlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGRLNode_Pred() {
		return (EAttribute)grlNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGRLNode_Succ() {
		return (EAttribute)grlNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGRLNode_ContRef() {
		return (EAttribute)grlNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGRLNode_Pos() {
		return (EReference)grlNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGRLNode_Size() {
		return (EReference)grlNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGRLspec() {
		return grLspecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGRLspec_IntElements() {
		return (EReference)grLspecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGRLspec_Actors() {
		return (EReference)grLspecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGRLspec_Links() {
		return (EReference)grLspecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGRLspec_Groups() {
		return (EReference)grLspecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGRLspec_Strategies() {
		return (EReference)grLspecEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGRLspec_GrlGraphs() {
		return (EReference)grLspecEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGRLspec_Info() {
		return (EReference)grLspecEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInBinding() {
		return inBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInBinding_Id() {
		return (EAttribute)inBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInBinding_StartPoint() {
		return (EAttribute)inBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInBinding_StubEntry() {
		return (EAttribute)inBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialization() {
		return initializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitialization_Value() {
		return (EAttribute)initializationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitialization_Variable() {
		return (EAttribute)initializationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentionalElement() {
		return intentionalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentionalElement_Type() {
		return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentionalElement_DecompositionType() {
		return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentionalElement_Importance() {
		return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentionalElement_ImportanceQuantitative() {
		return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentionalElement_Refs() {
		return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentionalElement_Style() {
		return (EReference)intentionalElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentionalElement_Actor() {
		return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentionalElementRef() {
		return intentionalElementRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentionalElementRef_Def() {
		return (EAttribute)intentionalElementRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_DeltaX() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_DeltaY() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkRef() {
		return linkRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkRef_Curve() {
		return (EAttribute)linkRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkRef_Link() {
		return (EAttribute)linkRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkRef_Bendpoints() {
		return (EReference)linkRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkRef_Label() {
		return (EReference)linkRefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkRef_Target() {
		return (EAttribute)linkRefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkRef_Source() {
		return (EAttribute)linkRefEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkRefBendpoint() {
		return linkRefBendpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkRefBendpoint_X() {
		return (EAttribute)linkRefBendpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkRefBendpoint_Y() {
		return (EAttribute)linkRefBendpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadata() {
		return metadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadata_Name() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadata_Value() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeConnection() {
		return nodeConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeConnection_Id() {
		return (EAttribute)nodeConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeConnection_Probability() {
		return (EAttribute)nodeConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeConnection_Threshold() {
		return (EAttribute)nodeConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeConnection_InBindings() {
		return (EAttribute)nodeConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeConnection_OutBindings() {
		return (EAttribute)nodeConnectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeConnection_Condition() {
		return (EReference)nodeConnectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeConnection_Timer() {
		return (EAttribute)nodeConnectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeConnection_Label() {
		return (EReference)nodeConnectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeConnection_Target() {
		return (EAttribute)nodeConnectionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeConnection_Source() {
		return (EAttribute)nodeConnectionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenWorkload() {
		return openWorkloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrFork() {
		return orForkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrJoin() {
		return orJoinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutBinding() {
		return outBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutBinding_Id() {
		return (EAttribute)outBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutBinding_EndPoint() {
		return (EAttribute)outBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutBinding_StubExit() {
		return (EAttribute)outBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWPeriodic() {
		return owPeriodicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOWPeriodic_Period() {
		return (EAttribute)owPeriodicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOWPeriodic_Deviation() {
		return (EAttribute)owPeriodicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWPhaseType() {
		return owPhaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOWPhaseType_Alpha() {
		return (EAttribute)owPhaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOWPhaseType_S() {
		return (EAttribute)owPhaseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWPoisson() {
		return owPoissonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOWPoisson_Mean() {
		return (EAttribute)owPoissonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWUniform() {
		return owUniformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOWUniform_Start() {
		return (EAttribute)owUniformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOWUniform_End() {
		return (EAttribute)owUniformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassiveResource() {
		return passiveResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassiveResource_Component() {
		return (EAttribute)passiveResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathNode() {
		return pathNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathNode_Label() {
		return (EReference)pathNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathNode_Pred() {
		return (EAttribute)pathNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathNode_Succ() {
		return (EAttribute)pathNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathNode_ContRef() {
		return (EAttribute)pathNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathNode_Pos() {
		return (EReference)pathNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginBinding() {
		return pluginBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginBinding_Id() {
		return (EAttribute)pluginBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginBinding_Probability() {
		return (EAttribute)pluginBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginBinding_ReplicationFactor() {
		return (EAttribute)pluginBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginBinding_In() {
		return (EReference)pluginBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginBinding_Out() {
		return (EReference)pluginBindingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginBinding_Plugin() {
		return (EAttribute)pluginBindingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginBinding_Precondition() {
		return (EReference)pluginBindingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginBinding_Components() {
		return (EReference)pluginBindingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_X() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Y() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingResource() {
		return processingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingResource_Kind() {
		return (EAttribute)processingResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingResource_Components() {
		return (EAttribute)processingResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsibility() {
		return responsibilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponsibility_Expression() {
		return (EAttribute)responsibilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsibility_Demands() {
		return (EReference)responsibilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponsibility_RespRefs() {
		return (EAttribute)responsibilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRespRef() {
		return respRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespRef_RepetitionCount() {
		return (EAttribute)respRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespRef_HostDemand() {
		return (EAttribute)respRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespRef_RespDef() {
		return (EAttribute)respRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenarioDef() {
		return scenarioDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioDef_Initializations() {
		return (EReference)scenarioDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioDef_Postconditions() {
		return (EReference)scenarioDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioDef_Preconditions() {
		return (EReference)scenarioDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenarioDef_ParentScenarios() {
		return (EAttribute)scenarioDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenarioDef_IncludedScenarios() {
		return (EAttribute)scenarioDefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenarioDef_Groups() {
		return (EAttribute)scenarioDefEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenarioDef_StartPoints() {
		return (EAttribute)scenarioDefEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenarioDef_EndPoints() {
		return (EAttribute)scenarioDefEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenarioGroup() {
		return scenarioGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenarioGroup_Scenarios() {
		return (EAttribute)scenarioGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSize() {
		return sizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Width() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Height() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartPoint() {
		return startPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartPoint_Workload() {
		return (EReference)startPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartPoint_InBindings() {
		return (EAttribute)startPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartPoint_Precondition() {
		return (EReference)startPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategiesGroup() {
		return strategiesGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategiesGroup_Strategies() {
		return (EAttribute)strategiesGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStub() {
		return stubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStub_Dynamic() {
		return (EAttribute)stubEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStub_Synchronizing() {
		return (EAttribute)stubEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStub_Blocking() {
		return (EAttribute)stubEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStub_Bindings() {
		return (EReference)stubEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimer() {
		return timerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimer_TimeoutPath() {
		return (EAttribute)timerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCMmap() {
		return ucMmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUCMmap_Singleton() {
		return (EAttribute)ucMmapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUCMmap_ParentStub() {
		return (EAttribute)ucMmapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCMmap_ContRefs() {
		return (EReference)ucMmapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCMmap_Connections() {
		return (EReference)ucMmapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCMmap_Nodes() {
		return (EReference)ucMmapEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCMmap_Comments() {
		return (EReference)ucMmapEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCMmodelElement() {
		return ucMmodelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCMspec() {
		return ucMspecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCMspec_EnumerationTypes() {
		return (EReference)ucMspecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCMspec_Variables() {
		return (EReference)ucMspecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCMspec_ScenarioGroups() {
		return (EReference)ucMspecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCMspec_Resources() {
		return (EReference)ucMspecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCMspec_UcmMaps() {
		return (EReference)ucMspecEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCMspec_Components() {
		return (EReference)ucMspecEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCMspec_ComponentTypes() {
		return (EReference)ucMspecEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCMspec_Responsibilities() {
		return (EReference)ucMspecEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCMspec_ScenarioDefs() {
		return (EReference)ucMspecEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURNlink() {
		return urNlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURNlink_Type() {
		return (EAttribute)urNlinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURNlink_ToElem() {
		return (EAttribute)urNlinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURNlink_FromElem() {
		return (EAttribute)urNlinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURNmodelElement() {
		return urNmodelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURNmodelElement_Id() {
		return (EAttribute)urNmodelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURNmodelElement_Name() {
		return (EAttribute)urNmodelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getURNmodelElement_Metadata() {
		return (EReference)urNmodelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURNmodelElement_ToLinks() {
		return (EAttribute)urNmodelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURNmodelElement_FromLinks() {
		return (EAttribute)urNmodelElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getURNmodelElement_Desc() {
		return (EReference)urNmodelElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURNmodelElement_Concern() {
		return (EAttribute)urNmodelElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURNspec() {
		return urNspecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURNspec_Name() {
		return (EAttribute)urNspecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getURNspec_Ucmspec() {
		return (EReference)urNspecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getURNspec_Metadata() {
		return (EReference)urNspecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getURNspec_UrnLinks() {
		return (EReference)urNspecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getURNspec_Grlspec() {
		return (EReference)urNspecEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getURNspec_Info() {
		return (EReference)urNspecEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getURNspec_Concerns() {
		return (EReference)urNspecEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_EnumerationType() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaitingPlace() {
		return waitingPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitingPlace_WaitType() {
		return (EAttribute)waitingPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkload() {
		return workloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkload_Unit() {
		return (EAttribute)workloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURNBase() {
		return urnBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentKind() {
		return componentKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContributionType() {
		return contributionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatatypeKind() {
		return datatypeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDecompositionType() {
		return decompositionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceKind() {
		return deviceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImportanceType() {
		return importanceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntentionalElementType() {
		return intentionalElementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQualitativeLabel() {
		return qualitativeLabelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnit() {
		return timeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWaitKind() {
		return waitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getComponentKindObject() {
		return componentKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContributionTypeObject() {
		return contributionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatatypeKindObject() {
		return datatypeKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDecompositionTypeObject() {
		return decompositionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeviceKindObject() {
		return deviceKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getImportanceTypeObject() {
		return importanceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntentionalElementTypeObject() {
		return intentionalElementTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getQualitativeLabelObject() {
		return qualitativeLabelObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeUnitObject() {
		return timeUnitObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWaitKindObject() {
		return waitKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URNModelFactory getURNModelFactory() {
		return (URNModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		activeResourceEClass = createEClass(ACTIVE_RESOURCE);
		createEAttribute(activeResourceEClass, ACTIVE_RESOURCE__OP_TIME);
		createEAttribute(activeResourceEClass, ACTIVE_RESOURCE__UNIT);

		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__COLLAPSED_REFS);
		createEAttribute(actorEClass, ACTOR__ACTOR_REFS);
		createEReference(actorEClass, ACTOR__STYLE);
		createEAttribute(actorEClass, ACTOR__ELEMS);

		actorRefEClass = createEClass(ACTOR_REF);
		createEReference(actorRefEClass, ACTOR_REF__LABEL);
		createEAttribute(actorRefEClass, ACTOR_REF__ACTOR_DEF);
		createEAttribute(actorRefEClass, ACTOR_REF__NODES);
		createEReference(actorRefEClass, ACTOR_REF__POS);
		createEReference(actorRefEClass, ACTOR_REF__SIZE);

		andForkEClass = createEClass(AND_FORK);

		andJoinEClass = createEClass(AND_JOIN);

		closedWorkloadEClass = createEClass(CLOSED_WORKLOAD);
		createEAttribute(closedWorkloadEClass, CLOSED_WORKLOAD__POPULATION);
		createEAttribute(closedWorkloadEClass, CLOSED_WORKLOAD__EXTERNAL_DELAY);

		collapsedActorRefEClass = createEClass(COLLAPSED_ACTOR_REF);
		createEAttribute(collapsedActorRefEClass, COLLAPSED_ACTOR_REF__ACTOR);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__DESCRIPTION);
		createEAttribute(commentEClass, COMMENT__X);
		createEAttribute(commentEClass, COMMENT__Y);
		createEAttribute(commentEClass, COMMENT__WIDTH);
		createEAttribute(commentEClass, COMMENT__HEIGHT);
		createEAttribute(commentEClass, COMMENT__FILL_COLOR);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__KIND);
		createEAttribute(componentEClass, COMPONENT__PROTECTED);
		createEAttribute(componentEClass, COMPONENT__CONTEXT);
		createEAttribute(componentEClass, COMPONENT__TYPE);
		createEAttribute(componentEClass, COMPONENT__INCLUDED_COMPONENTS);
		createEAttribute(componentEClass, COMPONENT__INCLUDING_COMPONENTS);
		createEAttribute(componentEClass, COMPONENT__HOST);
		createEAttribute(componentEClass, COMPONENT__RESOURCE);
		createEAttribute(componentEClass, COMPONENT__COMP_REFS);
		createEReference(componentEClass, COMPONENT__STYLE);

		componentBindingEClass = createEClass(COMPONENT_BINDING);
		createEAttribute(componentBindingEClass, COMPONENT_BINDING__ID);
		createEAttribute(componentBindingEClass, COMPONENT_BINDING__PARENT_COMPONENT);
		createEAttribute(componentBindingEClass, COMPONENT_BINDING__PLUGIN_COMPONENT);

		componentRefEClass = createEClass(COMPONENT_REF);
		createEAttribute(componentRefEClass, COMPONENT_REF__PARENT_BINDINGS);
		createEAttribute(componentRefEClass, COMPONENT_REF__PLUGIN_BINDINGS);
		createEAttribute(componentRefEClass, COMPONENT_REF__COMP_DEF);
		createEReference(componentRefEClass, COMPONENT_REF__LABEL);
		createEAttribute(componentRefEClass, COMPONENT_REF__CHILDREN);
		createEAttribute(componentRefEClass, COMPONENT_REF__PARENT);
		createEAttribute(componentRefEClass, COMPONENT_REF__NODES);
		createEReference(componentRefEClass, COMPONENT_REF__POS);
		createEReference(componentRefEClass, COMPONENT_REF__SIZE);

		componentTypeEClass = createEClass(COMPONENT_TYPE);
		createEAttribute(componentTypeEClass, COMPONENT_TYPE__INSTANCES);

		concernEClass = createEClass(CONCERN);
		createEReference(concernEClass, CONCERN__CONDITION);
		createEAttribute(concernEClass, CONCERN__ELEMENTS);

		concreteConditionEClass = createEClass(CONCRETE_CONDITION);
		createEAttribute(concreteConditionEClass, CONCRETE_CONDITION__LABEL);
		createEAttribute(concreteConditionEClass, CONCRETE_CONDITION__DESCRIPTION);

		concreteGRLspecEClass = createEClass(CONCRETE_GR_LSPEC);
		createEAttribute(concreteGRLspecEClass, CONCRETE_GR_LSPEC__SHOW_AS_MEANS_END);

		concreteStyleEClass = createEClass(CONCRETE_STYLE);
		createEAttribute(concreteStyleEClass, CONCRETE_STYLE__LINE_COLOR);
		createEAttribute(concreteStyleEClass, CONCRETE_STYLE__FILL_COLOR);
		createEAttribute(concreteStyleEClass, CONCRETE_STYLE__FILLED);

		concreteURNspecEClass = createEClass(CONCRETE_UR_NSPEC);
		createEAttribute(concreteURNspecEClass, CONCRETE_UR_NSPEC__DESCRIPTION);
		createEAttribute(concreteURNspecEClass, CONCRETE_UR_NSPEC__AUTHOR);
		createEAttribute(concreteURNspecEClass, CONCRETE_UR_NSPEC__CREATED);
		createEAttribute(concreteURNspecEClass, CONCRETE_UR_NSPEC__MODIFIED);
		createEAttribute(concreteURNspecEClass, CONCRETE_UR_NSPEC__SPEC_VERSION);
		createEAttribute(concreteURNspecEClass, CONCRETE_UR_NSPEC__URN_VERSION);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__EXPRESSION);
		createEReference(conditionEClass, CONDITION__DESC);
		createEReference(conditionEClass, CONDITION__LABEL);

		connectEClass = createEClass(CONNECT);

		contributionEClass = createEClass(CONTRIBUTION);
		createEAttribute(contributionEClass, CONTRIBUTION__CONTRIBUTION);
		createEAttribute(contributionEClass, CONTRIBUTION__QUANTITATIVE_CONTRIBUTION);
		createEAttribute(contributionEClass, CONTRIBUTION__CORRELATION);

		decompositionEClass = createEClass(DECOMPOSITION);

		demandEClass = createEClass(DEMAND);
		createEAttribute(demandEClass, DEMAND__QUANTITY);
		createEAttribute(demandEClass, DEMAND__RESOURCE);

		dependencyEClass = createEClass(DEPENDENCY);

		descriptionEClass = createEClass(DESCRIPTION);
		createEAttribute(descriptionEClass, DESCRIPTION__DESCRIPTION);

		directionArrowEClass = createEClass(DIRECTION_ARROW);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UR_NSPEC);

		elementLinkEClass = createEClass(ELEMENT_LINK);
		createEAttribute(elementLinkEClass, ELEMENT_LINK__REFS);
		createEAttribute(elementLinkEClass, ELEMENT_LINK__DEST);
		createEAttribute(elementLinkEClass, ELEMENT_LINK__SRC);

		emptyPointEClass = createEClass(EMPTY_POINT);

		endPointEClass = createEClass(END_POINT);
		createEAttribute(endPointEClass, END_POINT__OUT_BINDINGS);
		createEReference(endPointEClass, END_POINT__POSTCONDITION);

		enumerationTypeEClass = createEClass(ENUMERATION_TYPE);
		createEAttribute(enumerationTypeEClass, ENUMERATION_TYPE__VALUES);
		createEAttribute(enumerationTypeEClass, ENUMERATION_TYPE__INSTANCES);

		evaluationEClass = createEClass(EVALUATION);
		createEAttribute(evaluationEClass, EVALUATION__EVALUATION);
		createEAttribute(evaluationEClass, EVALUATION__QUALITATIVE_EVALUATION);
		createEAttribute(evaluationEClass, EVALUATION__INT_ELEMENT);

		evaluationStrategyEClass = createEClass(EVALUATION_STRATEGY);
		createEReference(evaluationStrategyEClass, EVALUATION_STRATEGY__EVALUATIONS);
		createEAttribute(evaluationStrategyEClass, EVALUATION_STRATEGY__GROUP);

		externalOperationEClass = createEClass(EXTERNAL_OPERATION);
		createEAttribute(externalOperationEClass, EXTERNAL_OPERATION__DEMANDS);

		generalResourceEClass = createEClass(GENERAL_RESOURCE);
		createEAttribute(generalResourceEClass, GENERAL_RESOURCE__MULTIPLICITY);
		createEAttribute(generalResourceEClass, GENERAL_RESOURCE__SCHED_POLICY);

		grlGraphEClass = createEClass(GRL_GRAPH);
		createEReference(grlGraphEClass, GRL_GRAPH__CONNECTIONS);
		createEReference(grlGraphEClass, GRL_GRAPH__NODES);
		createEReference(grlGraphEClass, GRL_GRAPH__CONT_REFS);
		createEReference(grlGraphEClass, GRL_GRAPH__COMMENTS);

		grlLinkableElementEClass = createEClass(GRL_LINKABLE_ELEMENT);
		createEAttribute(grlLinkableElementEClass, GRL_LINKABLE_ELEMENT__LINKS_DEST);
		createEAttribute(grlLinkableElementEClass, GRL_LINKABLE_ELEMENT__LINKS_SRC);

		grLmodelElementEClass = createEClass(GR_LMODEL_ELEMENT);

		grlNodeEClass = createEClass(GRL_NODE);
		createEAttribute(grlNodeEClass, GRL_NODE__PRED);
		createEAttribute(grlNodeEClass, GRL_NODE__SUCC);
		createEAttribute(grlNodeEClass, GRL_NODE__CONT_REF);
		createEReference(grlNodeEClass, GRL_NODE__POS);
		createEReference(grlNodeEClass, GRL_NODE__SIZE);

		grLspecEClass = createEClass(GR_LSPEC);
		createEReference(grLspecEClass, GR_LSPEC__INT_ELEMENTS);
		createEReference(grLspecEClass, GR_LSPEC__ACTORS);
		createEReference(grLspecEClass, GR_LSPEC__LINKS);
		createEReference(grLspecEClass, GR_LSPEC__GROUPS);
		createEReference(grLspecEClass, GR_LSPEC__STRATEGIES);
		createEReference(grLspecEClass, GR_LSPEC__GRL_GRAPHS);
		createEReference(grLspecEClass, GR_LSPEC__INFO);

		inBindingEClass = createEClass(IN_BINDING);
		createEAttribute(inBindingEClass, IN_BINDING__ID);
		createEAttribute(inBindingEClass, IN_BINDING__START_POINT);
		createEAttribute(inBindingEClass, IN_BINDING__STUB_ENTRY);

		initializationEClass = createEClass(INITIALIZATION);
		createEAttribute(initializationEClass, INITIALIZATION__VALUE);
		createEAttribute(initializationEClass, INITIALIZATION__VARIABLE);

		intentionalElementEClass = createEClass(INTENTIONAL_ELEMENT);
		createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__TYPE);
		createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE);
		createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__IMPORTANCE);
		createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE);
		createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__REFS);
		createEReference(intentionalElementEClass, INTENTIONAL_ELEMENT__STYLE);
		createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__ACTOR);

		intentionalElementRefEClass = createEClass(INTENTIONAL_ELEMENT_REF);
		createEAttribute(intentionalElementRefEClass, INTENTIONAL_ELEMENT_REF__DEF);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__DELTA_X);
		createEAttribute(labelEClass, LABEL__DELTA_Y);

		linkRefEClass = createEClass(LINK_REF);
		createEAttribute(linkRefEClass, LINK_REF__CURVE);
		createEAttribute(linkRefEClass, LINK_REF__LINK);
		createEReference(linkRefEClass, LINK_REF__BENDPOINTS);
		createEReference(linkRefEClass, LINK_REF__LABEL);
		createEAttribute(linkRefEClass, LINK_REF__TARGET);
		createEAttribute(linkRefEClass, LINK_REF__SOURCE);

		linkRefBendpointEClass = createEClass(LINK_REF_BENDPOINT);
		createEAttribute(linkRefBendpointEClass, LINK_REF_BENDPOINT__X);
		createEAttribute(linkRefBendpointEClass, LINK_REF_BENDPOINT__Y);

		metadataEClass = createEClass(METADATA);
		createEAttribute(metadataEClass, METADATA__NAME);
		createEAttribute(metadataEClass, METADATA__VALUE);

		nodeConnectionEClass = createEClass(NODE_CONNECTION);
		createEAttribute(nodeConnectionEClass, NODE_CONNECTION__ID);
		createEAttribute(nodeConnectionEClass, NODE_CONNECTION__PROBABILITY);
		createEAttribute(nodeConnectionEClass, NODE_CONNECTION__THRESHOLD);
		createEAttribute(nodeConnectionEClass, NODE_CONNECTION__IN_BINDINGS);
		createEAttribute(nodeConnectionEClass, NODE_CONNECTION__OUT_BINDINGS);
		createEReference(nodeConnectionEClass, NODE_CONNECTION__CONDITION);
		createEAttribute(nodeConnectionEClass, NODE_CONNECTION__TIMER);
		createEReference(nodeConnectionEClass, NODE_CONNECTION__LABEL);
		createEAttribute(nodeConnectionEClass, NODE_CONNECTION__TARGET);
		createEAttribute(nodeConnectionEClass, NODE_CONNECTION__SOURCE);

		openWorkloadEClass = createEClass(OPEN_WORKLOAD);

		orForkEClass = createEClass(OR_FORK);

		orJoinEClass = createEClass(OR_JOIN);

		outBindingEClass = createEClass(OUT_BINDING);
		createEAttribute(outBindingEClass, OUT_BINDING__ID);
		createEAttribute(outBindingEClass, OUT_BINDING__END_POINT);
		createEAttribute(outBindingEClass, OUT_BINDING__STUB_EXIT);

		owPeriodicEClass = createEClass(OW_PERIODIC);
		createEAttribute(owPeriodicEClass, OW_PERIODIC__PERIOD);
		createEAttribute(owPeriodicEClass, OW_PERIODIC__DEVIATION);

		owPhaseTypeEClass = createEClass(OW_PHASE_TYPE);
		createEAttribute(owPhaseTypeEClass, OW_PHASE_TYPE__ALPHA);
		createEAttribute(owPhaseTypeEClass, OW_PHASE_TYPE__S);

		owPoissonEClass = createEClass(OW_POISSON);
		createEAttribute(owPoissonEClass, OW_POISSON__MEAN);

		owUniformEClass = createEClass(OW_UNIFORM);
		createEAttribute(owUniformEClass, OW_UNIFORM__START);
		createEAttribute(owUniformEClass, OW_UNIFORM__END);

		passiveResourceEClass = createEClass(PASSIVE_RESOURCE);
		createEAttribute(passiveResourceEClass, PASSIVE_RESOURCE__COMPONENT);

		pathNodeEClass = createEClass(PATH_NODE);
		createEReference(pathNodeEClass, PATH_NODE__LABEL);
		createEAttribute(pathNodeEClass, PATH_NODE__PRED);
		createEAttribute(pathNodeEClass, PATH_NODE__SUCC);
		createEAttribute(pathNodeEClass, PATH_NODE__CONT_REF);
		createEReference(pathNodeEClass, PATH_NODE__POS);

		pluginBindingEClass = createEClass(PLUGIN_BINDING);
		createEAttribute(pluginBindingEClass, PLUGIN_BINDING__ID);
		createEAttribute(pluginBindingEClass, PLUGIN_BINDING__PROBABILITY);
		createEAttribute(pluginBindingEClass, PLUGIN_BINDING__REPLICATION_FACTOR);
		createEReference(pluginBindingEClass, PLUGIN_BINDING__IN);
		createEReference(pluginBindingEClass, PLUGIN_BINDING__OUT);
		createEAttribute(pluginBindingEClass, PLUGIN_BINDING__PLUGIN);
		createEReference(pluginBindingEClass, PLUGIN_BINDING__PRECONDITION);
		createEReference(pluginBindingEClass, PLUGIN_BINDING__COMPONENTS);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__X);
		createEAttribute(positionEClass, POSITION__Y);

		processingResourceEClass = createEClass(PROCESSING_RESOURCE);
		createEAttribute(processingResourceEClass, PROCESSING_RESOURCE__KIND);
		createEAttribute(processingResourceEClass, PROCESSING_RESOURCE__COMPONENTS);

		responsibilityEClass = createEClass(RESPONSIBILITY);
		createEAttribute(responsibilityEClass, RESPONSIBILITY__EXPRESSION);
		createEReference(responsibilityEClass, RESPONSIBILITY__DEMANDS);
		createEAttribute(responsibilityEClass, RESPONSIBILITY__RESP_REFS);

		respRefEClass = createEClass(RESP_REF);
		createEAttribute(respRefEClass, RESP_REF__REPETITION_COUNT);
		createEAttribute(respRefEClass, RESP_REF__HOST_DEMAND);
		createEAttribute(respRefEClass, RESP_REF__RESP_DEF);

		scenarioDefEClass = createEClass(SCENARIO_DEF);
		createEReference(scenarioDefEClass, SCENARIO_DEF__INITIALIZATIONS);
		createEReference(scenarioDefEClass, SCENARIO_DEF__POSTCONDITIONS);
		createEReference(scenarioDefEClass, SCENARIO_DEF__PRECONDITIONS);
		createEAttribute(scenarioDefEClass, SCENARIO_DEF__PARENT_SCENARIOS);
		createEAttribute(scenarioDefEClass, SCENARIO_DEF__INCLUDED_SCENARIOS);
		createEAttribute(scenarioDefEClass, SCENARIO_DEF__GROUPS);
		createEAttribute(scenarioDefEClass, SCENARIO_DEF__START_POINTS);
		createEAttribute(scenarioDefEClass, SCENARIO_DEF__END_POINTS);

		scenarioGroupEClass = createEClass(SCENARIO_GROUP);
		createEAttribute(scenarioGroupEClass, SCENARIO_GROUP__SCENARIOS);

		sizeEClass = createEClass(SIZE);
		createEAttribute(sizeEClass, SIZE__WIDTH);
		createEAttribute(sizeEClass, SIZE__HEIGHT);

		startPointEClass = createEClass(START_POINT);
		createEReference(startPointEClass, START_POINT__WORKLOAD);
		createEAttribute(startPointEClass, START_POINT__IN_BINDINGS);
		createEReference(startPointEClass, START_POINT__PRECONDITION);

		strategiesGroupEClass = createEClass(STRATEGIES_GROUP);
		createEAttribute(strategiesGroupEClass, STRATEGIES_GROUP__STRATEGIES);

		stubEClass = createEClass(STUB);
		createEAttribute(stubEClass, STUB__DYNAMIC);
		createEAttribute(stubEClass, STUB__SYNCHRONIZING);
		createEAttribute(stubEClass, STUB__BLOCKING);
		createEReference(stubEClass, STUB__BINDINGS);

		timerEClass = createEClass(TIMER);
		createEAttribute(timerEClass, TIMER__TIMEOUT_PATH);

		ucMmapEClass = createEClass(UC_MMAP);
		createEAttribute(ucMmapEClass, UC_MMAP__SINGLETON);
		createEAttribute(ucMmapEClass, UC_MMAP__PARENT_STUB);
		createEReference(ucMmapEClass, UC_MMAP__CONT_REFS);
		createEReference(ucMmapEClass, UC_MMAP__CONNECTIONS);
		createEReference(ucMmapEClass, UC_MMAP__NODES);
		createEReference(ucMmapEClass, UC_MMAP__COMMENTS);

		ucMmodelElementEClass = createEClass(UC_MMODEL_ELEMENT);

		ucMspecEClass = createEClass(UC_MSPEC);
		createEReference(ucMspecEClass, UC_MSPEC__ENUMERATION_TYPES);
		createEReference(ucMspecEClass, UC_MSPEC__VARIABLES);
		createEReference(ucMspecEClass, UC_MSPEC__SCENARIO_GROUPS);
		createEReference(ucMspecEClass, UC_MSPEC__RESOURCES);
		createEReference(ucMspecEClass, UC_MSPEC__UCM_MAPS);
		createEReference(ucMspecEClass, UC_MSPEC__COMPONENTS);
		createEReference(ucMspecEClass, UC_MSPEC__COMPONENT_TYPES);
		createEReference(ucMspecEClass, UC_MSPEC__RESPONSIBILITIES);
		createEReference(ucMspecEClass, UC_MSPEC__SCENARIO_DEFS);

		urNlinkEClass = createEClass(UR_NLINK);
		createEAttribute(urNlinkEClass, UR_NLINK__TYPE);
		createEAttribute(urNlinkEClass, UR_NLINK__TO_ELEM);
		createEAttribute(urNlinkEClass, UR_NLINK__FROM_ELEM);

		urNmodelElementEClass = createEClass(UR_NMODEL_ELEMENT);
		createEAttribute(urNmodelElementEClass, UR_NMODEL_ELEMENT__ID);
		createEAttribute(urNmodelElementEClass, UR_NMODEL_ELEMENT__NAME);
		createEReference(urNmodelElementEClass, UR_NMODEL_ELEMENT__METADATA);
		createEAttribute(urNmodelElementEClass, UR_NMODEL_ELEMENT__TO_LINKS);
		createEAttribute(urNmodelElementEClass, UR_NMODEL_ELEMENT__FROM_LINKS);
		createEReference(urNmodelElementEClass, UR_NMODEL_ELEMENT__DESC);
		createEAttribute(urNmodelElementEClass, UR_NMODEL_ELEMENT__CONCERN);

		urNspecEClass = createEClass(UR_NSPEC);
		createEAttribute(urNspecEClass, UR_NSPEC__NAME);
		createEReference(urNspecEClass, UR_NSPEC__UCMSPEC);
		createEReference(urNspecEClass, UR_NSPEC__METADATA);
		createEReference(urNspecEClass, UR_NSPEC__URN_LINKS);
		createEReference(urNspecEClass, UR_NSPEC__GRLSPEC);
		createEReference(urNspecEClass, UR_NSPEC__INFO);
		createEReference(urNspecEClass, UR_NSPEC__CONCERNS);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__TYPE);
		createEAttribute(variableEClass, VARIABLE__ENUMERATION_TYPE);

		waitingPlaceEClass = createEClass(WAITING_PLACE);
		createEAttribute(waitingPlaceEClass, WAITING_PLACE__WAIT_TYPE);

		workloadEClass = createEClass(WORKLOAD);
		createEAttribute(workloadEClass, WORKLOAD__UNIT);

		urnBaseEClass = createEClass(URN_BASE);

		// Create enums
		componentKindEEnum = createEEnum(COMPONENT_KIND);
		contributionTypeEEnum = createEEnum(CONTRIBUTION_TYPE);
		datatypeKindEEnum = createEEnum(DATATYPE_KIND);
		decompositionTypeEEnum = createEEnum(DECOMPOSITION_TYPE);
		deviceKindEEnum = createEEnum(DEVICE_KIND);
		importanceTypeEEnum = createEEnum(IMPORTANCE_TYPE);
		intentionalElementTypeEEnum = createEEnum(INTENTIONAL_ELEMENT_TYPE);
		qualitativeLabelEEnum = createEEnum(QUALITATIVE_LABEL);
		timeUnitEEnum = createEEnum(TIME_UNIT);
		waitKindEEnum = createEEnum(WAIT_KIND);

		// Create data types
		componentKindObjectEDataType = createEDataType(COMPONENT_KIND_OBJECT);
		contributionTypeObjectEDataType = createEDataType(CONTRIBUTION_TYPE_OBJECT);
		datatypeKindObjectEDataType = createEDataType(DATATYPE_KIND_OBJECT);
		decompositionTypeObjectEDataType = createEDataType(DECOMPOSITION_TYPE_OBJECT);
		deviceKindObjectEDataType = createEDataType(DEVICE_KIND_OBJECT);
		importanceTypeObjectEDataType = createEDataType(IMPORTANCE_TYPE_OBJECT);
		intentionalElementTypeObjectEDataType = createEDataType(INTENTIONAL_ELEMENT_TYPE_OBJECT);
		qualitativeLabelObjectEDataType = createEDataType(QUALITATIVE_LABEL_OBJECT);
		timeUnitObjectEDataType = createEDataType(TIME_UNIT_OBJECT);
		waitKindObjectEDataType = createEDataType(WAIT_KIND_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activeResourceEClass.getESuperTypes().add(this.getGeneralResource());
		actorEClass.getESuperTypes().add(this.getGRLLinkableElement());
		actorRefEClass.getESuperTypes().add(this.getGRLmodelElement());
		andForkEClass.getESuperTypes().add(this.getPathNode());
		andJoinEClass.getESuperTypes().add(this.getPathNode());
		closedWorkloadEClass.getESuperTypes().add(this.getWorkload());
		collapsedActorRefEClass.getESuperTypes().add(this.getGRLNode());
		commentEClass.getESuperTypes().add(this.getURNBase());
		componentEClass.getESuperTypes().add(this.getUCMmodelElement());
		componentBindingEClass.getESuperTypes().add(this.getURNBase());
		componentRefEClass.getESuperTypes().add(this.getUCMmodelElement());
		componentTypeEClass.getESuperTypes().add(this.getUCMmodelElement());
		concernEClass.getESuperTypes().add(this.getURNmodelElement());
		concreteConditionEClass.getESuperTypes().add(this.getURNBase());
		concreteGRLspecEClass.getESuperTypes().add(this.getURNBase());
		concreteStyleEClass.getESuperTypes().add(this.getURNBase());
		concreteURNspecEClass.getESuperTypes().add(this.getURNBase());
		conditionEClass.getESuperTypes().add(this.getURNBase());
		connectEClass.getESuperTypes().add(this.getPathNode());
		contributionEClass.getESuperTypes().add(this.getElementLink());
		decompositionEClass.getESuperTypes().add(this.getElementLink());
		demandEClass.getESuperTypes().add(this.getURNBase());
		dependencyEClass.getESuperTypes().add(this.getElementLink());
		descriptionEClass.getESuperTypes().add(this.getURNBase());
		directionArrowEClass.getESuperTypes().add(this.getPathNode());
		documentRootEClass.getESuperTypes().add(this.getURNBase());
		elementLinkEClass.getESuperTypes().add(this.getGRLmodelElement());
		emptyPointEClass.getESuperTypes().add(this.getPathNode());
		endPointEClass.getESuperTypes().add(this.getPathNode());
		enumerationTypeEClass.getESuperTypes().add(this.getUCMmodelElement());
		evaluationEClass.getESuperTypes().add(this.getURNBase());
		evaluationStrategyEClass.getESuperTypes().add(this.getGRLmodelElement());
		externalOperationEClass.getESuperTypes().add(this.getActiveResource());
		generalResourceEClass.getESuperTypes().add(this.getUCMmodelElement());
		grlGraphEClass.getESuperTypes().add(this.getGRLmodelElement());
		grlLinkableElementEClass.getESuperTypes().add(this.getGRLmodelElement());
		grLmodelElementEClass.getESuperTypes().add(this.getURNmodelElement());
		grlNodeEClass.getESuperTypes().add(this.getGRLmodelElement());
		grLspecEClass.getESuperTypes().add(this.getURNBase());
		inBindingEClass.getESuperTypes().add(this.getURNBase());
		initializationEClass.getESuperTypes().add(this.getURNBase());
		intentionalElementEClass.getESuperTypes().add(this.getGRLLinkableElement());
		intentionalElementRefEClass.getESuperTypes().add(this.getGRLNode());
		labelEClass.getESuperTypes().add(this.getURNBase());
		linkRefEClass.getESuperTypes().add(this.getGRLmodelElement());
		linkRefBendpointEClass.getESuperTypes().add(this.getURNBase());
		metadataEClass.getESuperTypes().add(this.getURNBase());
		nodeConnectionEClass.getESuperTypes().add(this.getURNBase());
		openWorkloadEClass.getESuperTypes().add(this.getWorkload());
		orForkEClass.getESuperTypes().add(this.getPathNode());
		orJoinEClass.getESuperTypes().add(this.getPathNode());
		outBindingEClass.getESuperTypes().add(this.getURNBase());
		owPeriodicEClass.getESuperTypes().add(this.getOpenWorkload());
		owPhaseTypeEClass.getESuperTypes().add(this.getOpenWorkload());
		owPoissonEClass.getESuperTypes().add(this.getOpenWorkload());
		owUniformEClass.getESuperTypes().add(this.getOpenWorkload());
		passiveResourceEClass.getESuperTypes().add(this.getGeneralResource());
		pathNodeEClass.getESuperTypes().add(this.getUCMmodelElement());
		pluginBindingEClass.getESuperTypes().add(this.getURNBase());
		positionEClass.getESuperTypes().add(this.getURNBase());
		processingResourceEClass.getESuperTypes().add(this.getActiveResource());
		responsibilityEClass.getESuperTypes().add(this.getUCMmodelElement());
		respRefEClass.getESuperTypes().add(this.getPathNode());
		scenarioDefEClass.getESuperTypes().add(this.getUCMmodelElement());
		scenarioGroupEClass.getESuperTypes().add(this.getUCMmodelElement());
		sizeEClass.getESuperTypes().add(this.getURNBase());
		startPointEClass.getESuperTypes().add(this.getPathNode());
		strategiesGroupEClass.getESuperTypes().add(this.getGRLmodelElement());
		stubEClass.getESuperTypes().add(this.getPathNode());
		timerEClass.getESuperTypes().add(this.getWaitingPlace());
		ucMmapEClass.getESuperTypes().add(this.getUCMmodelElement());
		ucMmodelElementEClass.getESuperTypes().add(this.getURNmodelElement());
		ucMspecEClass.getESuperTypes().add(this.getURNBase());
		urNlinkEClass.getESuperTypes().add(this.getURNmodelElement());
		urNmodelElementEClass.getESuperTypes().add(this.getURNBase());
		urNspecEClass.getESuperTypes().add(this.getURNBase());
		variableEClass.getESuperTypes().add(this.getUCMmodelElement());
		waitingPlaceEClass.getESuperTypes().add(this.getPathNode());
		workloadEClass.getESuperTypes().add(this.getUCMmodelElement());
		urnBaseEClass.getESuperTypes().add(ecorePackage.getEObject());

		// Initialize classes and features; add operations and parameters
		initEClass(activeResourceEClass, ActiveResource.class, "ActiveResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActiveResource_OpTime(), theXMLTypePackage.getString(), "opTime", null, 1, 1, ActiveResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActiveResource_Unit(), this.getTimeUnit(), "unit", "ms", 1, 1, ActiveResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_CollapsedRefs(), theXMLTypePackage.getIDREF(), "collapsedRefs", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_ActorRefs(), theXMLTypePackage.getIDREF(), "actorRefs", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Style(), this.getConcreteStyle(), null, "style", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_Elems(), theXMLTypePackage.getIDREF(), "elems", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorRefEClass, ActorRef.class, "ActorRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActorRef_Label(), this.getLabel(), null, "label", null, 1, 1, ActorRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActorRef_ActorDef(), theXMLTypePackage.getIDREF(), "actorDef", null, 1, 1, ActorRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActorRef_Nodes(), theXMLTypePackage.getIDREF(), "nodes", null, 0, -1, ActorRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActorRef_Pos(), this.getPosition(), null, "pos", null, 1, 1, ActorRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActorRef_Size(), this.getSize(), null, "size", null, 1, 1, ActorRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andForkEClass, AndFork.class, "AndFork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andJoinEClass, AndJoin.class, "AndJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(closedWorkloadEClass, ClosedWorkload.class, "ClosedWorkload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClosedWorkload_Population(), theXMLTypePackage.getString(), "population", null, 1, 1, ClosedWorkload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClosedWorkload_ExternalDelay(), theXMLTypePackage.getString(), "externalDelay", null, 1, 1, ClosedWorkload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collapsedActorRefEClass, CollapsedActorRef.class, "CollapsedActorRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollapsedActorRef_Actor(), theXMLTypePackage.getIDREF(), "actor", null, 1, 1, CollapsedActorRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_X(), theXMLTypePackage.getInteger(), "x", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Y(), theXMLTypePackage.getInteger(), "y", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Width(), theXMLTypePackage.getInteger(), "width", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Height(), theXMLTypePackage.getInteger(), "height", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_FillColor(), theXMLTypePackage.getString(), "fillColor", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Kind(), this.getComponentKind(), "kind", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Protected(), theXMLTypePackage.getBoolean(), "protected", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Context(), theXMLTypePackage.getBoolean(), "context", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Type(), theXMLTypePackage.getIDREF(), "type", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_IncludedComponents(), theXMLTypePackage.getIDREF(), "includedComponents", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_IncludingComponents(), theXMLTypePackage.getIDREF(), "includingComponents", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Host(), theXMLTypePackage.getIDREF(), "host", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Resource(), theXMLTypePackage.getIDREF(), "resource", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_CompRefs(), theXMLTypePackage.getIDREF(), "compRefs", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Style(), this.getConcreteStyle(), null, "style", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentBindingEClass, ComponentBinding.class, "ComponentBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentBinding_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, ComponentBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentBinding_ParentComponent(), theXMLTypePackage.getIDREF(), "parentComponent", null, 1, 1, ComponentBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentBinding_PluginComponent(), theXMLTypePackage.getIDREF(), "pluginComponent", null, 1, 1, ComponentBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentRefEClass, ComponentRef.class, "ComponentRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentRef_ParentBindings(), theXMLTypePackage.getIDREF(), "parentBindings", null, 0, -1, ComponentRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentRef_PluginBindings(), theXMLTypePackage.getIDREF(), "pluginBindings", null, 0, -1, ComponentRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentRef_CompDef(), theXMLTypePackage.getIDREF(), "compDef", null, 1, 1, ComponentRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentRef_Label(), this.getLabel(), null, "label", null, 0, 1, ComponentRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentRef_Children(), theXMLTypePackage.getIDREF(), "children", null, 0, -1, ComponentRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentRef_Parent(), theXMLTypePackage.getIDREF(), "parent", null, 0, 1, ComponentRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentRef_Nodes(), theXMLTypePackage.getIDREF(), "nodes", null, 0, -1, ComponentRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentRef_Pos(), this.getPosition(), null, "pos", null, 0, 1, ComponentRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentRef_Size(), this.getSize(), null, "size", null, 0, 1, ComponentRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentTypeEClass, ComponentType.class, "ComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentType_Instances(), theXMLTypePackage.getIDREF(), "instances", null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concernEClass, Concern.class, "Concern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcern_Condition(), this.getCondition(), null, "condition", null, 0, 1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcern_Elements(), theXMLTypePackage.getIDREF(), "elements", null, 0, -1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteConditionEClass, ConcreteCondition.class, "ConcreteCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcreteCondition_Label(), theXMLTypePackage.getString(), "label", null, 1, 1, ConcreteCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteCondition_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, ConcreteCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteGRLspecEClass, ConcreteGRLspec.class, "ConcreteGRLspec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcreteGRLspec_ShowAsMeansEnd(), theXMLTypePackage.getBoolean(), "showAsMeansEnd", null, 1, 1, ConcreteGRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteStyleEClass, ConcreteStyle.class, "ConcreteStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcreteStyle_LineColor(), theXMLTypePackage.getString(), "lineColor", null, 1, 1, ConcreteStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteStyle_FillColor(), theXMLTypePackage.getString(), "fillColor", null, 1, 1, ConcreteStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteStyle_Filled(), theXMLTypePackage.getBoolean(), "filled", null, 1, 1, ConcreteStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteURNspecEClass, ConcreteURNspec.class, "ConcreteURNspec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcreteURNspec_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, ConcreteURNspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteURNspec_Author(), theXMLTypePackage.getString(), "author", null, 1, 1, ConcreteURNspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteURNspec_Created(), theXMLTypePackage.getString(), "created", null, 1, 1, ConcreteURNspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteURNspec_Modified(), theXMLTypePackage.getString(), "modified", null, 1, 1, ConcreteURNspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteURNspec_SpecVersion(), theXMLTypePackage.getString(), "specVersion", null, 1, 1, ConcreteURNspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteURNspec_UrnVersion(), theXMLTypePackage.getString(), "urnVersion", null, 1, 1, ConcreteURNspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Expression(), theXMLTypePackage.getString(), "expression", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Desc(), this.getConcreteCondition(), null, "desc", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Label(), this.getLabel(), null, "label", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectEClass, Connect.class, "Connect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contributionEClass, Contribution.class, "Contribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContribution_Contribution(), this.getContributionType(), "contribution", "Unknown", 1, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContribution_QuantitativeContribution(), theXMLTypePackage.getInteger(), "quantitativeContribution", null, 1, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContribution_Correlation(), theXMLTypePackage.getBoolean(), "correlation", null, 1, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decompositionEClass, Decomposition.class, "Decomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(demandEClass, Demand.class, "Demand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDemand_Quantity(), theXMLTypePackage.getString(), "quantity", null, 1, 1, Demand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDemand_Resource(), theXMLTypePackage.getIDREF(), "resource", null, 1, 1, Demand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescription_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directionArrowEClass, DirectionArrow.class, "DirectionArrow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, DocumentRoot.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, DocumentRoot.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_URNspec(), this.getURNspec(), null, "uRNspec", null, 0, -2, DocumentRoot.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(elementLinkEClass, ElementLink.class, "ElementLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementLink_Refs(), theXMLTypePackage.getIDREF(), "refs", null, 0, -1, ElementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementLink_Dest(), theXMLTypePackage.getIDREF(), "dest", null, 1, 1, ElementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementLink_Src(), theXMLTypePackage.getIDREF(), "src", null, 1, 1, ElementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emptyPointEClass, EmptyPoint.class, "EmptyPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endPointEClass, EndPoint.class, "EndPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndPoint_OutBindings(), theXMLTypePackage.getIDREF(), "outBindings", null, 0, -1, EndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndPoint_Postcondition(), this.getCondition(), null, "postcondition", null, 0, 1, EndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationTypeEClass, EnumerationType.class, "EnumerationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationType_Values(), theXMLTypePackage.getString(), "values", null, 1, 1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationType_Instances(), theXMLTypePackage.getIDREF(), "instances", null, 0, -1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluationEClass, Evaluation.class, "Evaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluation_Evaluation(), theXMLTypePackage.getInteger(), "evaluation", null, 1, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluation_QualitativeEvaluation(), this.getQualitativeLabel(), "qualitativeEvaluation", "None", 1, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluation_IntElement(), theXMLTypePackage.getIDREF(), "intElement", null, 1, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluationStrategyEClass, EvaluationStrategy.class, "EvaluationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluationStrategy_Evaluations(), this.getEvaluation(), null, "evaluations", null, 0, -1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationStrategy_Group(), theXMLTypePackage.getIDREF(), "group", null, 1, -1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalOperationEClass, ExternalOperation.class, "ExternalOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalOperation_Demands(), theXMLTypePackage.getIDREF(), "demands", null, 0, -1, ExternalOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalResourceEClass, GeneralResource.class, "GeneralResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralResource_Multiplicity(), theXMLTypePackage.getNonNegativeInteger(), "multiplicity", "1", 1, 1, GeneralResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralResource_SchedPolicy(), theXMLTypePackage.getString(), "schedPolicy", null, 1, 1, GeneralResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grlGraphEClass, GRLGraph.class, "GRLGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGRLGraph_Connections(), this.getLinkRef(), null, "connections", null, 0, -1, GRLGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGRLGraph_Nodes(), this.getGRLNode(), null, "nodes", null, 0, -1, GRLGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGRLGraph_ContRefs(), this.getActorRef(), null, "contRefs", null, 0, -1, GRLGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGRLGraph_Comments(), this.getComment(), null, "comments", null, 0, -1, GRLGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grlLinkableElementEClass, GRLLinkableElement.class, "GRLLinkableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGRLLinkableElement_LinksDest(), theXMLTypePackage.getIDREF(), "linksDest", null, 0, -1, GRLLinkableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGRLLinkableElement_LinksSrc(), theXMLTypePackage.getIDREF(), "linksSrc", null, 0, -1, GRLLinkableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grLmodelElementEClass, GRLmodelElement.class, "GRLmodelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(grlNodeEClass, GRLNode.class, "GRLNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGRLNode_Pred(), theXMLTypePackage.getIDREF(), "pred", null, 0, -1, GRLNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGRLNode_Succ(), theXMLTypePackage.getIDREF(), "succ", null, 0, -1, GRLNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGRLNode_ContRef(), theXMLTypePackage.getIDREF(), "contRef", null, 0, 1, GRLNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGRLNode_Pos(), this.getPosition(), null, "pos", null, 1, 1, GRLNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGRLNode_Size(), this.getSize(), null, "size", null, 1, 1, GRLNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grLspecEClass, GRLspec.class, "GRLspec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGRLspec_IntElements(), this.getIntentionalElement(), null, "intElements", null, 0, -1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGRLspec_Actors(), this.getActor(), null, "actors", null, 0, -1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGRLspec_Links(), this.getElementLink(), null, "links", null, 0, -1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGRLspec_Groups(), this.getStrategiesGroup(), null, "groups", null, 0, -1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGRLspec_Strategies(), this.getEvaluationStrategy(), null, "strategies", null, 0, -1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGRLspec_GrlGraphs(), this.getGRLGraph(), null, "grlGraphs", null, 0, -1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGRLspec_Info(), this.getConcreteGRLspec(), null, "info", null, 0, 1, GRLspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inBindingEClass, InBinding.class, "InBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInBinding_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, InBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInBinding_StartPoint(), theXMLTypePackage.getIDREF(), "startPoint", null, 1, 1, InBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInBinding_StubEntry(), theXMLTypePackage.getIDREF(), "stubEntry", null, 1, 1, InBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initializationEClass, Initialization.class, "Initialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitialization_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, Initialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitialization_Variable(), theXMLTypePackage.getIDREF(), "variable", null, 1, 1, Initialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intentionalElementEClass, IntentionalElement.class, "IntentionalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntentionalElement_Type(), this.getIntentionalElementType(), "type", null, 1, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntentionalElement_DecompositionType(), this.getDecompositionType(), "decompositionType", "AND", 1, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntentionalElement_Importance(), this.getImportanceType(), "importance", "None", 1, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntentionalElement_ImportanceQuantitative(), theXMLTypePackage.getInteger(), "importanceQuantitative", null, 1, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntentionalElement_Refs(), theXMLTypePackage.getIDREF(), "refs", null, 0, -1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntentionalElement_Style(), this.getConcreteStyle(), null, "style", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntentionalElement_Actor(), theXMLTypePackage.getIDREF(), "actor", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intentionalElementRefEClass, IntentionalElementRef.class, "IntentionalElementRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntentionalElementRef_Def(), theXMLTypePackage.getIDREF(), "def", null, 1, 1, IntentionalElementRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_DeltaX(), ecorePackage.getEString(), "deltaX", null, 1, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_DeltaY(), ecorePackage.getEString(), "deltaY", null, 1, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkRefEClass, LinkRef.class, "LinkRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkRef_Curve(), theXMLTypePackage.getBoolean(), "curve", null, 1, 1, LinkRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkRef_Link(), theXMLTypePackage.getIDREF(), "link", null, 1, 1, LinkRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkRef_Bendpoints(), this.getLinkRefBendpoint(), null, "bendpoints", null, 0, -1, LinkRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkRef_Label(), this.getLabel(), null, "label", null, 0, 1, LinkRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkRef_Target(), theXMLTypePackage.getIDREF(), "target", null, 1, 1, LinkRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkRef_Source(), theXMLTypePackage.getIDREF(), "source", null, 1, 1, LinkRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkRefBendpointEClass, LinkRefBendpoint.class, "LinkRefBendpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkRefBendpoint_X(), theXMLTypePackage.getInteger(), "x", null, 1, 1, LinkRefBendpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkRefBendpoint_Y(), theXMLTypePackage.getInteger(), "y", null, 1, 1, LinkRefBendpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadata_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadata_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeConnectionEClass, NodeConnection.class, "NodeConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeConnection_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, NodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeConnection_Probability(), theXMLTypePackage.getNonNegativeInteger(), "probability", "100", 1, 1, NodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeConnection_Threshold(), theXMLTypePackage.getString(), "threshold", null, 1, 1, NodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeConnection_InBindings(), theXMLTypePackage.getIDREF(), "inBindings", null, 0, -1, NodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeConnection_OutBindings(), theXMLTypePackage.getIDREF(), "outBindings", null, 0, -1, NodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeConnection_Condition(), this.getCondition(), null, "condition", null, 0, 1, NodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeConnection_Timer(), theXMLTypePackage.getIDREF(), "timer", null, 0, 1, NodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeConnection_Label(), this.getLabel(), null, "label", null, 0, 1, NodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeConnection_Target(), theXMLTypePackage.getIDREF(), "target", null, 1, 1, NodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeConnection_Source(), theXMLTypePackage.getIDREF(), "source", null, 1, 1, NodeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openWorkloadEClass, OpenWorkload.class, "OpenWorkload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orForkEClass, OrFork.class, "OrFork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orJoinEClass, OrJoin.class, "OrJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outBindingEClass, OutBinding.class, "OutBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutBinding_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, OutBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutBinding_EndPoint(), theXMLTypePackage.getIDREF(), "endPoint", null, 1, 1, OutBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutBinding_StubExit(), theXMLTypePackage.getIDREF(), "stubExit", null, 1, 1, OutBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owPeriodicEClass, OWPeriodic.class, "OWPeriodic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOWPeriodic_Period(), theXMLTypePackage.getString(), "period", null, 1, 1, OWPeriodic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOWPeriodic_Deviation(), theXMLTypePackage.getString(), "deviation", null, 1, 1, OWPeriodic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owPhaseTypeEClass, OWPhaseType.class, "OWPhaseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOWPhaseType_Alpha(), theXMLTypePackage.getString(), "alpha", null, 1, 1, OWPhaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOWPhaseType_S(), theXMLTypePackage.getString(), "s", null, 1, 1, OWPhaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owPoissonEClass, OWPoisson.class, "OWPoisson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOWPoisson_Mean(), theXMLTypePackage.getString(), "mean", null, 1, 1, OWPoisson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owUniformEClass, OWUniform.class, "OWUniform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOWUniform_Start(), theXMLTypePackage.getString(), "start", null, 1, 1, OWUniform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOWUniform_End(), theXMLTypePackage.getString(), "end", null, 1, 1, OWUniform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passiveResourceEClass, PassiveResource.class, "PassiveResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassiveResource_Component(), theXMLTypePackage.getIDREF(), "component", null, 0, 1, PassiveResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathNodeEClass, PathNode.class, "PathNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathNode_Label(), this.getLabel(), null, "label", null, 0, 1, PathNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathNode_Pred(), theXMLTypePackage.getIDREF(), "pred", null, 0, -1, PathNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathNode_Succ(), theXMLTypePackage.getIDREF(), "succ", null, 0, -1, PathNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathNode_ContRef(), theXMLTypePackage.getIDREF(), "contRef", null, 0, 1, PathNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathNode_Pos(), this.getPosition(), null, "pos", null, 0, 1, PathNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginBindingEClass, PluginBinding.class, "PluginBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPluginBinding_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, PluginBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginBinding_Probability(), theXMLTypePackage.getNonNegativeInteger(), "probability", "100", 1, 1, PluginBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginBinding_ReplicationFactor(), theXMLTypePackage.getString(), "replicationFactor", null, 1, 1, PluginBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginBinding_In(), this.getInBinding(), null, "in", null, 0, -1, PluginBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginBinding_Out(), this.getOutBinding(), null, "out", null, 0, -1, PluginBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginBinding_Plugin(), theXMLTypePackage.getIDREF(), "plugin", null, 1, 1, PluginBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginBinding_Precondition(), this.getCondition(), null, "precondition", null, 0, 1, PluginBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginBinding_Components(), this.getComponentBinding(), null, "components", null, 0, -1, PluginBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_X(), ecorePackage.getEString(), "x", "", 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Y(), ecorePackage.getEString(), "y", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingResourceEClass, ProcessingResource.class, "ProcessingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessingResource_Kind(), this.getDeviceKind(), "kind", "Processor", 1, 1, ProcessingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingResource_Components(), theXMLTypePackage.getIDREF(), "components", null, 0, -1, ProcessingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responsibilityEClass, Responsibility.class, "Responsibility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponsibility_Expression(), theXMLTypePackage.getString(), "expression", null, 1, 1, Responsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponsibility_Demands(), this.getDemand(), null, "demands", null, 0, -1, Responsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponsibility_RespRefs(), theXMLTypePackage.getIDREF(), "respRefs", null, 1, -1, Responsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(respRefEClass, RespRef.class, "RespRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRespRef_RepetitionCount(), theXMLTypePackage.getString(), "repetitionCount", null, 1, 1, RespRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRespRef_HostDemand(), theXMLTypePackage.getString(), "hostDemand", null, 1, 1, RespRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRespRef_RespDef(), theXMLTypePackage.getIDREF(), "respDef", null, 1, 1, RespRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioDefEClass, ScenarioDef.class, "ScenarioDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenarioDef_Initializations(), this.getInitialization(), null, "initializations", null, 0, -1, ScenarioDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioDef_Postconditions(), this.getCondition(), null, "postconditions", null, 0, -1, ScenarioDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioDef_Preconditions(), this.getCondition(), null, "preconditions", null, 0, -1, ScenarioDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenarioDef_ParentScenarios(), theXMLTypePackage.getIDREF(), "parentScenarios", null, 0, -1, ScenarioDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenarioDef_IncludedScenarios(), ecorePackage.getEString(), "includedScenarios", null, 0, 1, ScenarioDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenarioDef_Groups(), theXMLTypePackage.getIDREF(), "groups", null, 1, -1, ScenarioDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenarioDef_StartPoints(), ecorePackage.getEString(), "startPoints", null, 0, 1, ScenarioDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenarioDef_EndPoints(), theXMLTypePackage.getIDREF(), "endPoints", null, 0, -1, ScenarioDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioGroupEClass, ScenarioGroup.class, "ScenarioGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScenarioGroup_Scenarios(), theXMLTypePackage.getIDREF(), "scenarios", null, 0, -1, ScenarioGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sizeEClass, Size.class, "Size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSize_Width(), ecorePackage.getEString(), "width", null, 1, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSize_Height(), ecorePackage.getEString(), "height", null, 1, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startPointEClass, StartPoint.class, "StartPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartPoint_Workload(), this.getWorkload(), null, "workload", null, 0, 1, StartPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStartPoint_InBindings(), theXMLTypePackage.getIDREF(), "inBindings", null, 0, -1, StartPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStartPoint_Precondition(), this.getCondition(), null, "precondition", null, 0, 1, StartPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strategiesGroupEClass, StrategiesGroup.class, "StrategiesGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrategiesGroup_Strategies(), theXMLTypePackage.getIDREF(), "strategies", null, 0, -1, StrategiesGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stubEClass, Stub.class, "Stub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStub_Dynamic(), theXMLTypePackage.getBoolean(), "dynamic", null, 1, 1, Stub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStub_Synchronizing(), theXMLTypePackage.getBoolean(), "synchronizing", null, 1, 1, Stub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStub_Blocking(), theXMLTypePackage.getBoolean(), "blocking", null, 1, 1, Stub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStub_Bindings(), this.getPluginBinding(), null, "bindings", null, 0, -1, Stub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timerEClass, Timer.class, "Timer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimer_TimeoutPath(), theXMLTypePackage.getIDREF(), "timeoutPath", null, 0, 1, Timer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ucMmapEClass, UCMmap.class, "UCMmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUCMmap_Singleton(), theXMLTypePackage.getBoolean(), "singleton", null, 1, 1, UCMmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUCMmap_ParentStub(), theXMLTypePackage.getIDREF(), "parentStub", null, 0, -1, UCMmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCMmap_ContRefs(), this.getComponentRef(), null, "contRefs", null, 0, -1, UCMmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCMmap_Connections(), this.getNodeConnection(), null, "connections", null, 0, -1, UCMmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCMmap_Nodes(), this.getPathNode(), null, "nodes", null, 0, -1, UCMmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCMmap_Comments(), this.getComment(), null, "comments", null, 0, -1, UCMmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ucMmodelElementEClass, UCMmodelElement.class, "UCMmodelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ucMspecEClass, UCMspec.class, "UCMspec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUCMspec_EnumerationTypes(), this.getEnumerationType(), null, "enumerationTypes", null, 0, -1, UCMspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCMspec_Variables(), this.getVariable(), null, "variables", null, 0, -1, UCMspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCMspec_ScenarioGroups(), this.getScenarioGroup(), null, "scenarioGroups", null, 0, -1, UCMspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCMspec_Resources(), this.getGeneralResource(), null, "resources", null, 0, -1, UCMspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCMspec_UcmMaps(), this.getUCMmap(), null, "ucmMaps", null, 0, -1, UCMspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCMspec_Components(), this.getComponent(), null, "components", null, 0, -1, UCMspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCMspec_ComponentTypes(), this.getComponentType(), null, "componentTypes", null, 0, -1, UCMspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCMspec_Responsibilities(), this.getResponsibility(), null, "responsibilities", null, 0, -1, UCMspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCMspec_ScenarioDefs(), this.getScenarioDef(), null, "scenarioDefs", null, 0, -1, UCMspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urNlinkEClass, URNlink.class, "URNlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURNlink_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, URNlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getURNlink_ToElem(), theXMLTypePackage.getIDREF(), "toElem", null, 1, 1, URNlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getURNlink_FromElem(), theXMLTypePackage.getIDREF(), "fromElem", null, 1, 1, URNlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urNmodelElementEClass, URNmodelElement.class, "URNmodelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURNmodelElement_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, URNmodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getURNmodelElement_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, URNmodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getURNmodelElement_Metadata(), this.getMetadata(), null, "metadata", null, 0, -1, URNmodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getURNmodelElement_ToLinks(), theXMLTypePackage.getIDREF(), "toLinks", null, 0, -1, URNmodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getURNmodelElement_FromLinks(), theXMLTypePackage.getIDREF(), "fromLinks", null, 0, -1, URNmodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getURNmodelElement_Desc(), this.getDescription(), null, "desc", null, 0, 1, URNmodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getURNmodelElement_Concern(), theXMLTypePackage.getIDREF(), "concern", null, 0, 1, URNmodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urNspecEClass, URNspec.class, "URNspec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURNspec_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, URNspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getURNspec_Ucmspec(), this.getUCMspec(), null, "ucmspec", null, 0, 1, URNspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getURNspec_Metadata(), this.getMetadata(), null, "metadata", null, 0, -1, URNspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getURNspec_UrnLinks(), this.getURNlink(), null, "urnLinks", null, 0, -1, URNspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getURNspec_Grlspec(), this.getGRLspec(), null, "grlspec", null, 0, 1, URNspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getURNspec_Info(), this.getConcreteURNspec(), null, "info", null, 0, 1, URNspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getURNspec_Concerns(), this.getConcern(), null, "concerns", null, 0, -1, URNspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Type(), this.getDatatypeKind(), "type", "Boolean", 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_EnumerationType(), theXMLTypePackage.getIDREF(), "enumerationType", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitingPlaceEClass, WaitingPlace.class, "WaitingPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWaitingPlace_WaitType(), this.getWaitKind(), "waitType", null, 1, 1, WaitingPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workloadEClass, Workload.class, "Workload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkload_Unit(), this.getTimeUnit(), "unit", "ms", 1, 1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urnBaseEClass, URNBase.class, "URNBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(componentKindEEnum, ComponentKind.class, "ComponentKind");
		addEEnumLiteral(componentKindEEnum, ComponentKind.TEAM);
		addEEnumLiteral(componentKindEEnum, ComponentKind.OBJECT);
		addEEnumLiteral(componentKindEEnum, ComponentKind.PROCESS);
		addEEnumLiteral(componentKindEEnum, ComponentKind.AGENT);
		addEEnumLiteral(componentKindEEnum, ComponentKind.ACTOR);

		initEEnum(contributionTypeEEnum, ContributionType.class, "ContributionType");
		addEEnumLiteral(contributionTypeEEnum, ContributionType.MAKE);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.HELP);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.SOME_POSITIVE);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.UNKNOWN);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.SOME_NEGATIVE);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.HURT);
		addEEnumLiteral(contributionTypeEEnum, ContributionType.BREAK);

		initEEnum(datatypeKindEEnum, DatatypeKind.class, "DatatypeKind");
		addEEnumLiteral(datatypeKindEEnum, DatatypeKind.BOOLEAN);
		addEEnumLiteral(datatypeKindEEnum, DatatypeKind.INTEGER);
		addEEnumLiteral(datatypeKindEEnum, DatatypeKind.ENUMERATION);

		initEEnum(decompositionTypeEEnum, DecompositionType.class, "DecompositionType");
		addEEnumLiteral(decompositionTypeEEnum, DecompositionType.AND);
		addEEnumLiteral(decompositionTypeEEnum, DecompositionType.XOR);
		addEEnumLiteral(decompositionTypeEEnum, DecompositionType.IOR);

		initEEnum(deviceKindEEnum, DeviceKind.class, "DeviceKind");
		addEEnumLiteral(deviceKindEEnum, DeviceKind.PROCESSOR);
		addEEnumLiteral(deviceKindEEnum, DeviceKind.DISK);
		addEEnumLiteral(deviceKindEEnum, DeviceKind.DSP);

		initEEnum(importanceTypeEEnum, ImportanceType.class, "ImportanceType");
		addEEnumLiteral(importanceTypeEEnum, ImportanceType.HIGH);
		addEEnumLiteral(importanceTypeEEnum, ImportanceType.MEDIUM);
		addEEnumLiteral(importanceTypeEEnum, ImportanceType.LOW);
		addEEnumLiteral(importanceTypeEEnum, ImportanceType.NONE);

		initEEnum(intentionalElementTypeEEnum, IntentionalElementType.class, "IntentionalElementType");
		addEEnumLiteral(intentionalElementTypeEEnum, IntentionalElementType.SOFTGOAL);
		addEEnumLiteral(intentionalElementTypeEEnum, IntentionalElementType.GOAL);
		addEEnumLiteral(intentionalElementTypeEEnum, IntentionalElementType.TASK);
		addEEnumLiteral(intentionalElementTypeEEnum, IntentionalElementType.RESOURCE);
		addEEnumLiteral(intentionalElementTypeEEnum, IntentionalElementType.BELIEF);

		initEEnum(qualitativeLabelEEnum, QualitativeLabel.class, "QualitativeLabel");
		addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.DENIED);
		addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.WEAKLY_DENIED);
		addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.WEAKLY_SATISFIED);
		addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.SATISFIED);
		addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.CONFLICT);
		addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.UNKNOWN);
		addEEnumLiteral(qualitativeLabelEEnum, QualitativeLabel.NONE);

		initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
		addEEnumLiteral(timeUnitEEnum, TimeUnit.YEAR);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.DAY);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.H);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.S);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MS);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.US);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.NS);

		initEEnum(waitKindEEnum, WaitKind.class, "WaitKind");
		addEEnumLiteral(waitKindEEnum, WaitKind.TRANSIENT);
		addEEnumLiteral(waitKindEEnum, WaitKind.PERSISTENT);

		// Initialize data types
		initEDataType(componentKindObjectEDataType, Enumerator.class, "ComponentKindObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(contributionTypeObjectEDataType, Enumerator.class, "ContributionTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(datatypeKindObjectEDataType, Enumerator.class, "DatatypeKindObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(decompositionTypeObjectEDataType, Enumerator.class, "DecompositionTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(deviceKindObjectEDataType, Enumerator.class, "DeviceKindObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(importanceTypeObjectEDataType, Enumerator.class, "ImportanceTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(intentionalElementTypeObjectEDataType, Enumerator.class, "IntentionalElementTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(qualitativeLabelObjectEDataType, Enumerator.class, "QualitativeLabelObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeUnitObjectEDataType, Enumerator.class, "TimeUnitObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(waitKindObjectEDataType, Enumerator.class, "WaitKindObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //URNModelPackageImpl
