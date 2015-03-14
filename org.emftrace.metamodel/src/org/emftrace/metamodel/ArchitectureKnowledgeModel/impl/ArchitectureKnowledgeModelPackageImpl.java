/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTACatalog;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelBase;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelFactory;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.Benefit;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.CapabilityType;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolution;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutionCatalog;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ConceptualSolutions;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedBenefit;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedDrawback;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironment;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironmentCatalog;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.DevelopmentEnvironments;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.Drawback;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.FeatureBasedBenefit;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.FeatureBasedDrawback;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.Relation;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationCatalog;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationSourceType;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationTargetType;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationType;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.Relations;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeatureCatalog;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolution;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionCatalog;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackagePackage;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionCatalogPackage.impl.TechnologySolutionCatalogPackagePackageImpl;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutions;

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

import org.emftrace.metamodel.URNModel.URNModelPackage;

import org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureKnowledgeModelPackageImpl extends EPackageImpl implements ArchitectureKnowledgeModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureKnowledgeModelBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureKnowledgeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologySolutionCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologyFeatureCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astaCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptualSolutionCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass developmentEnvironmentCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologySolutionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologySolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologyFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass benefitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureBasedBenefitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concernBasedBenefitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drawbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureBasedDrawbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concernBasedDrawbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptualSolutionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptualSolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass developmentEnvironmentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass developmentEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationSourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationTargetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum capabilityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idEDataType = null;

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
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArchitectureKnowledgeModelPackageImpl() {
		super(eNS_URI, ArchitectureKnowledgeModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArchitectureKnowledgeModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArchitectureKnowledgeModelPackage init() {
		if (isInited) return (ArchitectureKnowledgeModelPackage)EPackage.Registry.INSTANCE.getEPackage(ArchitectureKnowledgeModelPackage.eNS_URI);

		// Obtain or create and register package
		ArchitectureKnowledgeModelPackageImpl theArchitectureKnowledgeModelPackage = (ArchitectureKnowledgeModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArchitectureKnowledgeModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArchitectureKnowledgeModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		LinkModelPackageImpl theLinkModelPackage = (LinkModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LinkModelPackage.eNS_URI) instanceof LinkModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LinkModelPackage.eNS_URI) : LinkModelPackage.eINSTANCE);
		RuleModelPackageImpl theRuleModelPackage = (RuleModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RuleModelPackage.eNS_URI) instanceof RuleModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RuleModelPackage.eNS_URI) : RuleModelPackage.eINSTANCE);
		ReportModelPackageImpl theReportModelPackage = (ReportModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReportModelPackage.eNS_URI) instanceof ReportModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReportModelPackage.eNS_URI) : ReportModelPackage.eINSTANCE);
		FeatureModelPackageImpl theFeatureModelPackage = (FeatureModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeatureModelPackage.eNS_URI) instanceof FeatureModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeatureModelPackage.eNS_URI) : FeatureModelPackage.eINSTANCE);
		OWLModelPackageImpl theOWLModelPackage = (OWLModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI) instanceof OWLModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI) : OWLModelPackage.eINSTANCE);
		URNModelPackageImpl theURNModelPackage = (URNModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(URNModelPackage.eNS_URI) instanceof URNModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(URNModelPackage.eNS_URI) : URNModelPackage.eINSTANCE);
		UMLModelPackageImpl theUMLModelPackage = (UMLModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI) instanceof UMLModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI) : UMLModelPackage.eINSTANCE);
		BPMN2ModelPackageImpl theBPMN2ModelPackage = (BPMN2ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPMN2ModelPackage.eNS_URI) instanceof BPMN2ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPMN2ModelPackage.eNS_URI) : BPMN2ModelPackage.eINSTANCE);
		EMFfitModelPackageImpl theEMFfitModelPackage = (EMFfitModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EMFfitModelPackage.eNS_URI) instanceof EMFfitModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EMFfitModelPackage.eNS_URI) : EMFfitModelPackage.eINSTANCE);
		ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI) instanceof ConstraintsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI) : ConstraintsPackage.eINSTANCE);
		GSSPackageImpl theGSSPackage = (GSSPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI) instanceof GSSPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI) : GSSPackage.eINSTANCE);
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI) instanceof QueryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI) : QueryPackage.eINSTANCE);
		PackagesPackageImpl thePackagesPackage = (PackagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) instanceof PackagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) : PackagesPackage.eINSTANCE);
		TechnologySolutionCatalogPackagePackageImpl theTechnologySolutionCatalogPackagePackage = (TechnologySolutionCatalogPackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TechnologySolutionCatalogPackagePackage.eNS_URI) instanceof TechnologySolutionCatalogPackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TechnologySolutionCatalogPackagePackage.eNS_URI) : TechnologySolutionCatalogPackagePackage.eINSTANCE);
		ChangeModelPackageImpl theChangeModelPackage = (ChangeModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChangeModelPackage.eNS_URI) instanceof ChangeModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChangeModelPackage.eNS_URI) : ChangeModelPackage.eINSTANCE);

		// Load packages
		theOWLModelPackage.loadPackage();
		theUMLModelPackage.loadPackage();
		theBPMN2ModelPackage.loadPackage();

		// Create package meta-data objects
		theArchitectureKnowledgeModelPackage.createPackageContents();
		theLinkModelPackage.createPackageContents();
		theRuleModelPackage.createPackageContents();
		theReportModelPackage.createPackageContents();
		theFeatureModelPackage.createPackageContents();
		theURNModelPackage.createPackageContents();
		theEMFfitModelPackage.createPackageContents();
		theConstraintsPackage.createPackageContents();
		theGSSPackage.createPackageContents();
		theQueryPackage.createPackageContents();
		thePackagesPackage.createPackageContents();
		theTechnologySolutionCatalogPackagePackage.createPackageContents();
		theChangeModelPackage.createPackageContents();

		// Initialize created meta-data
		theArchitectureKnowledgeModelPackage.initializePackageContents();
		theLinkModelPackage.initializePackageContents();
		theRuleModelPackage.initializePackageContents();
		theReportModelPackage.initializePackageContents();
		theFeatureModelPackage.initializePackageContents();
		theURNModelPackage.initializePackageContents();
		theEMFfitModelPackage.initializePackageContents();
		theConstraintsPackage.initializePackageContents();
		theGSSPackage.initializePackageContents();
		theQueryPackage.initializePackageContents();
		thePackagesPackage.initializePackageContents();
		theTechnologySolutionCatalogPackagePackage.initializePackageContents();
		theChangeModelPackage.initializePackageContents();

		// Fix loaded packages
		theOWLModelPackage.fixPackageContents();
		theUMLModelPackage.fixPackageContents();
		theBPMN2ModelPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theArchitectureKnowledgeModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArchitectureKnowledgeModelPackage.eNS_URI, theArchitectureKnowledgeModelPackage);
		return theArchitectureKnowledgeModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitectureKnowledgeModelBase() {
		return architectureKnowledgeModelBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitectureKnowledgeModelBase_ID() {
		return (EAttribute)architectureKnowledgeModelBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitectureKnowledgeModelBase_Name() {
		return (EAttribute)architectureKnowledgeModelBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitectureKnowledgeModel() {
		return architectureKnowledgeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitectureKnowledgeModel_Version() {
		return (EAttribute)architectureKnowledgeModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureKnowledgeModel_TechnologySolutions() {
		return (EReference)architectureKnowledgeModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureKnowledgeModel_ConceptualSolutions() {
		return (EReference)architectureKnowledgeModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureKnowledgeModel_DevelopmentEnvironments() {
		return (EReference)architectureKnowledgeModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureKnowledgeModel_Relations() {
		return (EReference)architectureKnowledgeModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnologySolutionCatalog() {
		return technologySolutionCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnologySolutionCatalog_Description() {
		return (EAttribute)technologySolutionCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnologySolutionCatalog_TechnologySolution() {
		return (EReference)technologySolutionCatalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnologyFeatureCatalog() {
		return technologyFeatureCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnologyFeatureCatalog_Description() {
		return (EAttribute)technologyFeatureCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnologyFeatureCatalog_TechnologyFeature() {
		return (EReference)technologyFeatureCatalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationCatalog() {
		return relationCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationCatalog_Description() {
		return (EAttribute)relationCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationCatalog_Relation() {
		return (EReference)relationCatalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASTACatalog() {
		return astaCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASTACatalog_Description() {
		return (EAttribute)astaCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASTACatalog_ASTA() {
		return (EReference)astaCatalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptualSolutionCatalog() {
		return conceptualSolutionCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptualSolutionCatalog_Description() {
		return (EAttribute)conceptualSolutionCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptualSolutionCatalog_ConceptualSolution() {
		return (EReference)conceptualSolutionCatalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevelopmentEnvironmentCatalog() {
		return developmentEnvironmentCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevelopmentEnvironmentCatalog_Description() {
		return (EAttribute)developmentEnvironmentCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentEnvironmentCatalog_DevelopmentEnvironment() {
		return (EReference)developmentEnvironmentCatalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnologySolutions() {
		return technologySolutionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnologySolutions_TechnologySolution() {
		return (EReference)technologySolutionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnologySolution() {
		return technologySolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnologySolution_Description() {
		return (EAttribute)technologySolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnologySolution_Features() {
		return (EReference)technologySolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnologySolution_Relations() {
		return (EReference)technologySolutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnologyFeature() {
		return technologyFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnologyFeature_Description() {
		return (EAttribute)technologyFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnologyFeature_CapabilityType() {
		return (EAttribute)technologyFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnologyFeature_ASTA() {
		return (EReference)technologyFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnologyFeature_Relations() {
		return (EReference)technologyFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASTA() {
		return astaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASTA_Description() {
		return (EAttribute)astaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASTA_Condition() {
		return (EAttribute)astaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASTA_CapabilityType() {
		return (EAttribute)astaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBenefit() {
		return benefitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureBasedBenefit() {
		return featureBasedBenefitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcernBasedBenefit() {
		return concernBasedBenefitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcernBasedBenefit_Concern() {
		return (EAttribute)concernBasedBenefitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrawback() {
		return drawbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureBasedDrawback() {
		return featureBasedDrawbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcernBasedDrawback() {
		return concernBasedDrawbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcernBasedDrawback_Concern() {
		return (EAttribute)concernBasedDrawbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptualSolutions() {
		return conceptualSolutionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptualSolutions_ConceptualSolutions() {
		return (EReference)conceptualSolutionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptualSolution() {
		return conceptualSolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptualSolution_Description() {
		return (EAttribute)conceptualSolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptualSolution_Variation() {
		return (EAttribute)conceptualSolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevelopmentEnvironments() {
		return developmentEnvironmentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentEnvironments_DevelopmentEnvironments() {
		return (EReference)developmentEnvironmentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevelopmentEnvironment() {
		return developmentEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevelopmentEnvironment_Description() {
		return (EAttribute)developmentEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevelopmentEnvironment_ProgrammingLanguage() {
		return (EAttribute)developmentEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelations() {
		return relationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelations_Relations() {
		return (EReference)relationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Description() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_SourceElement() {
		return (EReference)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_TargetElement() {
		return (EReference)relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Type() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationSourceType() {
		return relationSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationTargetType() {
		return relationTargetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCapabilityType() {
		return capabilityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationType() {
		return relationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getID() {
		return idEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureKnowledgeModelFactory getArchitectureKnowledgeModelFactory() {
		return (ArchitectureKnowledgeModelFactory)getEFactoryInstance();
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
		architectureKnowledgeModelBaseEClass = createEClass(ARCHITECTURE_KNOWLEDGE_MODEL_BASE);
		createEAttribute(architectureKnowledgeModelBaseEClass, ARCHITECTURE_KNOWLEDGE_MODEL_BASE__ID);
		createEAttribute(architectureKnowledgeModelBaseEClass, ARCHITECTURE_KNOWLEDGE_MODEL_BASE__NAME);

		architectureKnowledgeModelEClass = createEClass(ARCHITECTURE_KNOWLEDGE_MODEL);
		createEAttribute(architectureKnowledgeModelEClass, ARCHITECTURE_KNOWLEDGE_MODEL__VERSION);
		createEReference(architectureKnowledgeModelEClass, ARCHITECTURE_KNOWLEDGE_MODEL__TECHNOLOGY_SOLUTIONS);
		createEReference(architectureKnowledgeModelEClass, ARCHITECTURE_KNOWLEDGE_MODEL__CONCEPTUAL_SOLUTIONS);
		createEReference(architectureKnowledgeModelEClass, ARCHITECTURE_KNOWLEDGE_MODEL__DEVELOPMENT_ENVIRONMENTS);
		createEReference(architectureKnowledgeModelEClass, ARCHITECTURE_KNOWLEDGE_MODEL__RELATIONS);

		technologySolutionCatalogEClass = createEClass(TECHNOLOGY_SOLUTION_CATALOG);
		createEAttribute(technologySolutionCatalogEClass, TECHNOLOGY_SOLUTION_CATALOG__DESCRIPTION);
		createEReference(technologySolutionCatalogEClass, TECHNOLOGY_SOLUTION_CATALOG__TECHNOLOGY_SOLUTION);

		technologyFeatureCatalogEClass = createEClass(TECHNOLOGY_FEATURE_CATALOG);
		createEAttribute(technologyFeatureCatalogEClass, TECHNOLOGY_FEATURE_CATALOG__DESCRIPTION);
		createEReference(technologyFeatureCatalogEClass, TECHNOLOGY_FEATURE_CATALOG__TECHNOLOGY_FEATURE);

		relationCatalogEClass = createEClass(RELATION_CATALOG);
		createEAttribute(relationCatalogEClass, RELATION_CATALOG__DESCRIPTION);
		createEReference(relationCatalogEClass, RELATION_CATALOG__RELATION);

		astaCatalogEClass = createEClass(ASTA_CATALOG);
		createEAttribute(astaCatalogEClass, ASTA_CATALOG__DESCRIPTION);
		createEReference(astaCatalogEClass, ASTA_CATALOG__ASTA);

		conceptualSolutionCatalogEClass = createEClass(CONCEPTUAL_SOLUTION_CATALOG);
		createEAttribute(conceptualSolutionCatalogEClass, CONCEPTUAL_SOLUTION_CATALOG__DESCRIPTION);
		createEReference(conceptualSolutionCatalogEClass, CONCEPTUAL_SOLUTION_CATALOG__CONCEPTUAL_SOLUTION);

		developmentEnvironmentCatalogEClass = createEClass(DEVELOPMENT_ENVIRONMENT_CATALOG);
		createEAttribute(developmentEnvironmentCatalogEClass, DEVELOPMENT_ENVIRONMENT_CATALOG__DESCRIPTION);
		createEReference(developmentEnvironmentCatalogEClass, DEVELOPMENT_ENVIRONMENT_CATALOG__DEVELOPMENT_ENVIRONMENT);

		technologySolutionsEClass = createEClass(TECHNOLOGY_SOLUTIONS);
		createEReference(technologySolutionsEClass, TECHNOLOGY_SOLUTIONS__TECHNOLOGY_SOLUTION);

		technologySolutionEClass = createEClass(TECHNOLOGY_SOLUTION);
		createEAttribute(technologySolutionEClass, TECHNOLOGY_SOLUTION__DESCRIPTION);
		createEReference(technologySolutionEClass, TECHNOLOGY_SOLUTION__FEATURES);
		createEReference(technologySolutionEClass, TECHNOLOGY_SOLUTION__RELATIONS);

		technologyFeatureEClass = createEClass(TECHNOLOGY_FEATURE);
		createEAttribute(technologyFeatureEClass, TECHNOLOGY_FEATURE__DESCRIPTION);
		createEAttribute(technologyFeatureEClass, TECHNOLOGY_FEATURE__CAPABILITY_TYPE);
		createEReference(technologyFeatureEClass, TECHNOLOGY_FEATURE__ASTA);
		createEReference(technologyFeatureEClass, TECHNOLOGY_FEATURE__RELATIONS);

		astaEClass = createEClass(ASTA);
		createEAttribute(astaEClass, ASTA__DESCRIPTION);
		createEAttribute(astaEClass, ASTA__CONDITION);
		createEAttribute(astaEClass, ASTA__CAPABILITY_TYPE);

		benefitEClass = createEClass(BENEFIT);

		featureBasedBenefitEClass = createEClass(FEATURE_BASED_BENEFIT);

		concernBasedBenefitEClass = createEClass(CONCERN_BASED_BENEFIT);
		createEAttribute(concernBasedBenefitEClass, CONCERN_BASED_BENEFIT__CONCERN);

		drawbackEClass = createEClass(DRAWBACK);

		featureBasedDrawbackEClass = createEClass(FEATURE_BASED_DRAWBACK);

		concernBasedDrawbackEClass = createEClass(CONCERN_BASED_DRAWBACK);
		createEAttribute(concernBasedDrawbackEClass, CONCERN_BASED_DRAWBACK__CONCERN);

		conceptualSolutionsEClass = createEClass(CONCEPTUAL_SOLUTIONS);
		createEReference(conceptualSolutionsEClass, CONCEPTUAL_SOLUTIONS__CONCEPTUAL_SOLUTIONS);

		conceptualSolutionEClass = createEClass(CONCEPTUAL_SOLUTION);
		createEAttribute(conceptualSolutionEClass, CONCEPTUAL_SOLUTION__DESCRIPTION);
		createEAttribute(conceptualSolutionEClass, CONCEPTUAL_SOLUTION__VARIATION);

		developmentEnvironmentsEClass = createEClass(DEVELOPMENT_ENVIRONMENTS);
		createEReference(developmentEnvironmentsEClass, DEVELOPMENT_ENVIRONMENTS__DEVELOPMENT_ENVIRONMENTS);

		developmentEnvironmentEClass = createEClass(DEVELOPMENT_ENVIRONMENT);
		createEAttribute(developmentEnvironmentEClass, DEVELOPMENT_ENVIRONMENT__DESCRIPTION);
		createEAttribute(developmentEnvironmentEClass, DEVELOPMENT_ENVIRONMENT__PROGRAMMING_LANGUAGE);

		relationsEClass = createEClass(RELATIONS);
		createEReference(relationsEClass, RELATIONS__RELATIONS);

		relationEClass = createEClass(RELATION);
		createEAttribute(relationEClass, RELATION__DESCRIPTION);
		createEReference(relationEClass, RELATION__SOURCE_ELEMENT);
		createEReference(relationEClass, RELATION__TARGET_ELEMENT);
		createEAttribute(relationEClass, RELATION__TYPE);

		relationSourceTypeEClass = createEClass(RELATION_SOURCE_TYPE);

		relationTargetTypeEClass = createEClass(RELATION_TARGET_TYPE);

		// Create enums
		capabilityTypeEEnum = createEEnum(CAPABILITY_TYPE);
		relationTypeEEnum = createEEnum(RELATION_TYPE);

		// Create data types
		idEDataType = createEDataType(ID);
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
		TechnologySolutionCatalogPackagePackage theTechnologySolutionCatalogPackagePackage = (TechnologySolutionCatalogPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TechnologySolutionCatalogPackagePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTechnologySolutionCatalogPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		architectureKnowledgeModelBaseEClass.getESuperTypes().add(ecorePackage.getEObject());
		architectureKnowledgeModelEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		technologySolutionCatalogEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		technologyFeatureCatalogEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		relationCatalogEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		astaCatalogEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		conceptualSolutionCatalogEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		developmentEnvironmentCatalogEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		technologySolutionsEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		technologySolutionEClass.getESuperTypes().add(this.getRelationSourceType());
		technologySolutionEClass.getESuperTypes().add(this.getRelationTargetType());
		technologyFeatureEClass.getESuperTypes().add(this.getRelationSourceType());
		technologyFeatureEClass.getESuperTypes().add(this.getRelationTargetType());
		astaEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		benefitEClass.getESuperTypes().add(this.getASTA());
		featureBasedBenefitEClass.getESuperTypes().add(this.getBenefit());
		concernBasedBenefitEClass.getESuperTypes().add(this.getBenefit());
		drawbackEClass.getESuperTypes().add(this.getASTA());
		featureBasedDrawbackEClass.getESuperTypes().add(this.getDrawback());
		concernBasedDrawbackEClass.getESuperTypes().add(this.getDrawback());
		conceptualSolutionsEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		conceptualSolutionEClass.getESuperTypes().add(this.getRelationSourceType());
		conceptualSolutionEClass.getESuperTypes().add(this.getRelationTargetType());
		developmentEnvironmentsEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		developmentEnvironmentEClass.getESuperTypes().add(this.getRelationSourceType());
		developmentEnvironmentEClass.getESuperTypes().add(this.getRelationTargetType());
		relationsEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		relationEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		relationSourceTypeEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		relationTargetTypeEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());

		// Initialize classes and features; add operations and parameters
		initEClass(architectureKnowledgeModelBaseEClass, ArchitectureKnowledgeModelBase.class, "ArchitectureKnowledgeModelBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchitectureKnowledgeModelBase_ID(), this.getID(), "ID", null, 1, 1, ArchitectureKnowledgeModelBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchitectureKnowledgeModelBase_Name(), theEcorePackage.getEString(), "Name", null, 1, 1, ArchitectureKnowledgeModelBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureKnowledgeModelEClass, ArchitectureKnowledgeModel.class, "ArchitectureKnowledgeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchitectureKnowledgeModel_Version(), theEcorePackage.getEString(), "Version", "1.0", 0, 1, ArchitectureKnowledgeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureKnowledgeModel_TechnologySolutions(), this.getTechnologySolutions(), null, "TechnologySolutions", null, 0, 1, ArchitectureKnowledgeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureKnowledgeModel_ConceptualSolutions(), this.getConceptualSolutions(), null, "ConceptualSolutions", null, 0, 1, ArchitectureKnowledgeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureKnowledgeModel_DevelopmentEnvironments(), this.getDevelopmentEnvironments(), null, "DevelopmentEnvironments", null, 0, 1, ArchitectureKnowledgeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureKnowledgeModel_Relations(), this.getRelations(), null, "Relations", null, 0, 1, ArchitectureKnowledgeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologySolutionCatalogEClass, TechnologySolutionCatalog.class, "TechnologySolutionCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnologySolutionCatalog_Description(), theEcorePackage.getEString(), "Description", null, 0, 1, TechnologySolutionCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnologySolutionCatalog_TechnologySolution(), this.getTechnologySolution(), null, "TechnologySolution", null, 0, -1, TechnologySolutionCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologyFeatureCatalogEClass, TechnologyFeatureCatalog.class, "TechnologyFeatureCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnologyFeatureCatalog_Description(), theEcorePackage.getEString(), "Description", null, 0, 1, TechnologyFeatureCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnologyFeatureCatalog_TechnologyFeature(), this.getTechnologyFeature(), null, "TechnologyFeature", null, 0, -1, TechnologyFeatureCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationCatalogEClass, RelationCatalog.class, "RelationCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationCatalog_Description(), theEcorePackage.getEString(), "Description", null, 0, 1, RelationCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationCatalog_Relation(), this.getRelation(), null, "Relation", null, 0, -1, RelationCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(astaCatalogEClass, ASTACatalog.class, "ASTACatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getASTACatalog_Description(), theEcorePackage.getEString(), "Description", null, 0, 1, ASTACatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getASTACatalog_ASTA(), this.getASTA(), null, "ASTA", null, 0, -1, ASTACatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptualSolutionCatalogEClass, ConceptualSolutionCatalog.class, "ConceptualSolutionCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConceptualSolutionCatalog_Description(), theEcorePackage.getEString(), "Description", null, 0, 1, ConceptualSolutionCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConceptualSolutionCatalog_ConceptualSolution(), this.getConceptualSolution(), null, "ConceptualSolution", null, 0, -1, ConceptualSolutionCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(developmentEnvironmentCatalogEClass, DevelopmentEnvironmentCatalog.class, "DevelopmentEnvironmentCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevelopmentEnvironmentCatalog_Description(), theEcorePackage.getEString(), "Description", null, 0, 1, DevelopmentEnvironmentCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevelopmentEnvironmentCatalog_DevelopmentEnvironment(), this.getDevelopmentEnvironment(), null, "DevelopmentEnvironment", null, 0, -1, DevelopmentEnvironmentCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologySolutionsEClass, TechnologySolutions.class, "TechnologySolutions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnologySolutions_TechnologySolution(), this.getTechnologySolution(), null, "TechnologySolution", null, 0, -1, TechnologySolutions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologySolutionEClass, TechnologySolution.class, "TechnologySolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnologySolution_Description(), theEcorePackage.getEString(), "Description", null, 0, 1, TechnologySolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnologySolution_Features(), this.getTechnologyFeature(), null, "Features", null, 0, -1, TechnologySolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnologySolution_Relations(), this.getRelation(), null, "Relations", null, 0, -1, TechnologySolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologyFeatureEClass, TechnologyFeature.class, "TechnologyFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnologyFeature_Description(), theEcorePackage.getEString(), "Description", null, 1, 1, TechnologyFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTechnologyFeature_CapabilityType(), this.getCapabilityType(), "CapabilityType", null, 1, 1, TechnologyFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnologyFeature_ASTA(), this.getASTA(), null, "ASTA", null, 0, -1, TechnologyFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnologyFeature_Relations(), this.getRelation(), null, "Relations", null, 0, -1, TechnologyFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(astaEClass, org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA.class, "ASTA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getASTA_Description(), theEcorePackage.getEString(), "Description", null, 1, 1, org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getASTA_Condition(), theEcorePackage.getEString(), "Condition", null, 1, 1, org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getASTA_CapabilityType(), this.getCapabilityType(), "CapabilityType", null, 1, 1, org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(benefitEClass, Benefit.class, "Benefit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureBasedBenefitEClass, FeatureBasedBenefit.class, "FeatureBasedBenefit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concernBasedBenefitEClass, ConcernBasedBenefit.class, "ConcernBasedBenefit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcernBasedBenefit_Concern(), theEcorePackage.getEString(), "Concern", null, 1, 1, ConcernBasedBenefit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(drawbackEClass, Drawback.class, "Drawback", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureBasedDrawbackEClass, FeatureBasedDrawback.class, "FeatureBasedDrawback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concernBasedDrawbackEClass, ConcernBasedDrawback.class, "ConcernBasedDrawback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcernBasedDrawback_Concern(), theEcorePackage.getEString(), "Concern", null, 1, 1, ConcernBasedDrawback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptualSolutionsEClass, ConceptualSolutions.class, "ConceptualSolutions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptualSolutions_ConceptualSolutions(), this.getConceptualSolution(), null, "ConceptualSolutions", null, 0, -1, ConceptualSolutions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptualSolutionEClass, ConceptualSolution.class, "ConceptualSolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConceptualSolution_Description(), theEcorePackage.getEString(), "Description", null, 0, 1, ConceptualSolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConceptualSolution_Variation(), theEcorePackage.getEString(), "Variation", null, 0, -1, ConceptualSolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(developmentEnvironmentsEClass, DevelopmentEnvironments.class, "DevelopmentEnvironments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevelopmentEnvironments_DevelopmentEnvironments(), this.getDevelopmentEnvironment(), null, "DevelopmentEnvironments", null, 0, -1, DevelopmentEnvironments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(developmentEnvironmentEClass, DevelopmentEnvironment.class, "DevelopmentEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevelopmentEnvironment_Description(), theEcorePackage.getEString(), "Description", null, 0, 1, DevelopmentEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevelopmentEnvironment_ProgrammingLanguage(), theEcorePackage.getEString(), "ProgrammingLanguage", null, 0, -1, DevelopmentEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationsEClass, Relations.class, "Relations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelations_Relations(), this.getRelation(), null, "Relations", null, 0, -1, Relations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelation_Description(), theEcorePackage.getEString(), "Description", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_SourceElement(), this.getRelationSourceType(), null, "SourceElement", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_TargetElement(), this.getRelationTargetType(), null, "TargetElement", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Type(), this.getRelationType(), "Type", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationSourceTypeEClass, RelationSourceType.class, "RelationSourceType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationTargetTypeEClass, RelationTargetType.class, "RelationTargetType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(capabilityTypeEEnum, CapabilityType.class, "CapabilityType");
		addEEnumLiteral(capabilityTypeEEnum, CapabilityType.DEVELOPMENT_CAPABILITY);
		addEEnumLiteral(capabilityTypeEEnum, CapabilityType.CONFIGURATION_CAPABILITY);
		addEEnumLiteral(capabilityTypeEEnum, CapabilityType.BEHAVIOR_CAPABILITY);
		addEEnumLiteral(capabilityTypeEEnum, CapabilityType.USABILITY_CAPABILITY);
		addEEnumLiteral(capabilityTypeEEnum, CapabilityType.INTEROPERABILITY_CAPABILITY);
		addEEnumLiteral(capabilityTypeEEnum, CapabilityType.STORAGE_CAPABILITY);
		addEEnumLiteral(capabilityTypeEEnum, CapabilityType.OPERATIONAL_CAPABILITY);
		addEEnumLiteral(capabilityTypeEEnum, CapabilityType.COMMERCIAL_CAPABILITY);

		initEEnum(relationTypeEEnum, RelationType.class, "RelationType");
		addEEnumLiteral(relationTypeEEnum, RelationType.CONTAINS);
		addEEnumLiteral(relationTypeEEnum, RelationType.BASED_ON);
		addEEnumLiteral(relationTypeEEnum, RelationType.SUB_FEATURE);
		addEEnumLiteral(relationTypeEEnum, RelationType.DEVELOPMENT_FEATURE_ENVIRONMENT);
		addEEnumLiteral(relationTypeEEnum, RelationType.USING);
		addEEnumLiteral(relationTypeEEnum, RelationType.EMBODIES);
		addEEnumLiteral(relationTypeEEnum, RelationType.INTEGRATES);
		addEEnumLiteral(relationTypeEEnum, RelationType.IMPLEMENTED_BY);

		// Initialize data types
		initEDataType(idEDataType, String.class, "ID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ArchitectureKnowledgeModelPackageImpl