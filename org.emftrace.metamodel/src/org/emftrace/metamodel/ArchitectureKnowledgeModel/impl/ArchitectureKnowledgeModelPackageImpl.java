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
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTARelation;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTARelationType;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.ArchitectureKnowledgeCatalogPackagePackage;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.impl.ArchitectureKnowledgeCatalogPackagePackageImpl;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelBase;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelFactory;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.Benefit;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.CapabilityType;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedBenefit;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedDrawback;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.Drawback;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.FeatureBasedBenefit;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.FeatureBasedDrawback;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationCatalog;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationSourceType;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.RelationTargetType;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.Relations;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.SolutionAndFeatureRelationType;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeatureCatalog;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolution;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionCatalog;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionRelation;
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
	private EClass relationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologySolutionRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astaRelationEClass = null;

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
	private EEnum solutionAndFeatureRelationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum astaRelationTypeEEnum = null;

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
		ArchitectureKnowledgeCatalogPackagePackageImpl theArchitectureKnowledgeCatalogPackagePackage = (ArchitectureKnowledgeCatalogPackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitectureKnowledgeCatalogPackagePackage.eNS_URI) instanceof ArchitectureKnowledgeCatalogPackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitectureKnowledgeCatalogPackagePackage.eNS_URI) : ArchitectureKnowledgeCatalogPackagePackage.eINSTANCE);
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
		theArchitectureKnowledgeCatalogPackagePackage.createPackageContents();
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
		theArchitectureKnowledgeCatalogPackagePackage.initializePackageContents();
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
	public EReference getArchitectureKnowledgeModel_Relations() {
		return (EReference)architectureKnowledgeModelEClass.getEStructuralFeatures().get(2);
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
	public EClass getRelations() {
		return relationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelations_SolutionAndFeatureRelation() {
		return (EReference)relationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelations_ASTARelation() {
		return (EReference)relationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnologySolutionRelation() {
		return technologySolutionRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnologySolutionRelation_Description() {
		return (EAttribute)technologySolutionRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnologySolutionRelation_SourceElement() {
		return (EReference)technologySolutionRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnologySolutionRelation_TargetElement() {
		return (EReference)technologySolutionRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnologySolutionRelation_Type() {
		return (EAttribute)technologySolutionRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASTARelation() {
		return astaRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASTARelation_Description() {
		return (EAttribute)astaRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASTARelation_SourceElement() {
		return (EReference)astaRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASTARelation_TargetElement() {
		return (EReference)astaRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASTARelation_Type() {
		return (EAttribute)astaRelationEClass.getEStructuralFeatures().get(3);
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
	public EEnum getSolutionAndFeatureRelationType() {
		return solutionAndFeatureRelationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getASTARelationType() {
		return astaRelationTypeEEnum;
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

		relationsEClass = createEClass(RELATIONS);
		createEReference(relationsEClass, RELATIONS__SOLUTION_AND_FEATURE_RELATION);
		createEReference(relationsEClass, RELATIONS__ASTA_RELATION);

		technologySolutionRelationEClass = createEClass(TECHNOLOGY_SOLUTION_RELATION);
		createEAttribute(technologySolutionRelationEClass, TECHNOLOGY_SOLUTION_RELATION__DESCRIPTION);
		createEReference(technologySolutionRelationEClass, TECHNOLOGY_SOLUTION_RELATION__SOURCE_ELEMENT);
		createEReference(technologySolutionRelationEClass, TECHNOLOGY_SOLUTION_RELATION__TARGET_ELEMENT);
		createEAttribute(technologySolutionRelationEClass, TECHNOLOGY_SOLUTION_RELATION__TYPE);

		astaRelationEClass = createEClass(ASTA_RELATION);
		createEAttribute(astaRelationEClass, ASTA_RELATION__DESCRIPTION);
		createEReference(astaRelationEClass, ASTA_RELATION__SOURCE_ELEMENT);
		createEReference(astaRelationEClass, ASTA_RELATION__TARGET_ELEMENT);
		createEAttribute(astaRelationEClass, ASTA_RELATION__TYPE);

		relationSourceTypeEClass = createEClass(RELATION_SOURCE_TYPE);

		relationTargetTypeEClass = createEClass(RELATION_TARGET_TYPE);

		// Create enums
		capabilityTypeEEnum = createEEnum(CAPABILITY_TYPE);
		solutionAndFeatureRelationTypeEEnum = createEEnum(SOLUTION_AND_FEATURE_RELATION_TYPE);
		astaRelationTypeEEnum = createEEnum(ASTA_RELATION_TYPE);

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
		ArchitectureKnowledgeCatalogPackagePackage theArchitectureKnowledgeCatalogPackagePackage = (ArchitectureKnowledgeCatalogPackagePackage)EPackage.Registry.INSTANCE.getEPackage(ArchitectureKnowledgeCatalogPackagePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theArchitectureKnowledgeCatalogPackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		architectureKnowledgeModelBaseEClass.getESuperTypes().add(ecorePackage.getEObject());
		architectureKnowledgeModelEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		technologySolutionCatalogEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		technologyFeatureCatalogEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		relationCatalogEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		astaCatalogEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
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
		relationsEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		technologySolutionRelationEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		astaRelationEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		relationSourceTypeEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());
		relationTargetTypeEClass.getESuperTypes().add(this.getArchitectureKnowledgeModelBase());

		// Initialize classes and features; add operations and parameters
		initEClass(architectureKnowledgeModelBaseEClass, ArchitectureKnowledgeModelBase.class, "ArchitectureKnowledgeModelBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchitectureKnowledgeModelBase_ID(), this.getID(), "ID", null, 1, 1, ArchitectureKnowledgeModelBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchitectureKnowledgeModelBase_Name(), theEcorePackage.getEString(), "Name", null, 1, 1, ArchitectureKnowledgeModelBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureKnowledgeModelEClass, ArchitectureKnowledgeModel.class, "ArchitectureKnowledgeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchitectureKnowledgeModel_Version(), theEcorePackage.getEString(), "Version", "1.0", 0, 1, ArchitectureKnowledgeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureKnowledgeModel_TechnologySolutions(), this.getTechnologySolutions(), null, "TechnologySolutions", null, 0, 1, ArchitectureKnowledgeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureKnowledgeModel_Relations(), this.getRelations(), null, "Relations", null, 0, 1, ArchitectureKnowledgeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologySolutionCatalogEClass, TechnologySolutionCatalog.class, "TechnologySolutionCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnologySolutionCatalog_Description(), theEcorePackage.getEString(), "Description", null, 0, 1, TechnologySolutionCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnologySolutionCatalog_TechnologySolution(), this.getTechnologySolution(), null, "TechnologySolution", null, 0, -1, TechnologySolutionCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologyFeatureCatalogEClass, TechnologyFeatureCatalog.class, "TechnologyFeatureCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnologyFeatureCatalog_Description(), theEcorePackage.getEString(), "Description", null, 0, 1, TechnologyFeatureCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnologyFeatureCatalog_TechnologyFeature(), this.getTechnologyFeature(), null, "TechnologyFeature", null, 0, -1, TechnologyFeatureCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationCatalogEClass, RelationCatalog.class, "RelationCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationCatalog_Description(), theEcorePackage.getEString(), "Description", null, 0, 1, RelationCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationCatalog_Relation(), this.getTechnologySolutionRelation(), null, "Relation", null, 0, -1, RelationCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(astaCatalogEClass, ASTACatalog.class, "ASTACatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getASTACatalog_Description(), theEcorePackage.getEString(), "Description", null, 0, 1, ASTACatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getASTACatalog_ASTA(), this.getASTA(), null, "ASTA", null, 0, -1, ASTACatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologySolutionsEClass, TechnologySolutions.class, "TechnologySolutions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnologySolutions_TechnologySolution(), this.getTechnologySolution(), null, "TechnologySolution", null, 0, -1, TechnologySolutions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologySolutionEClass, TechnologySolution.class, "TechnologySolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnologySolution_Description(), theEcorePackage.getEString(), "Description", null, 0, 1, TechnologySolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnologySolution_Features(), this.getTechnologyFeature(), null, "Features", null, 0, -1, TechnologySolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnologySolution_Relations(), this.getTechnologySolutionRelation(), null, "Relations", null, 0, -1, TechnologySolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologyFeatureEClass, TechnologyFeature.class, "TechnologyFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnologyFeature_Description(), theEcorePackage.getEString(), "Description", null, 1, 1, TechnologyFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTechnologyFeature_CapabilityType(), this.getCapabilityType(), "CapabilityType", null, 1, 1, TechnologyFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnologyFeature_ASTA(), this.getASTA(), null, "ASTA", null, 0, -1, TechnologyFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnologyFeature_Relations(), this.getTechnologySolutionRelation(), null, "Relations", null, 0, -1, TechnologyFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(relationsEClass, Relations.class, "Relations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelations_SolutionAndFeatureRelation(), this.getTechnologySolutionRelation(), null, "SolutionAndFeatureRelation", null, 0, -1, Relations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelations_ASTARelation(), this.getASTARelation(), null, "ASTARelation", null, 0, -1, Relations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologySolutionRelationEClass, TechnologySolutionRelation.class, "TechnologySolutionRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnologySolutionRelation_Description(), theEcorePackage.getEString(), "Description", null, 0, 1, TechnologySolutionRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnologySolutionRelation_SourceElement(), this.getRelationSourceType(), null, "SourceElement", null, 1, 1, TechnologySolutionRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnologySolutionRelation_TargetElement(), this.getRelationTargetType(), null, "TargetElement", null, 1, 1, TechnologySolutionRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTechnologySolutionRelation_Type(), this.getSolutionAndFeatureRelationType(), "Type", null, 1, 1, TechnologySolutionRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(astaRelationEClass, ASTARelation.class, "ASTARelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getASTARelation_Description(), theEcorePackage.getEString(), "Description", null, 0, 1, ASTARelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getASTARelation_SourceElement(), this.getASTA(), null, "SourceElement", null, 1, 1, ASTARelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getASTARelation_TargetElement(), this.getTechnologyFeature(), null, "TargetElement", null, 1, 1, ASTARelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getASTARelation_Type(), this.getASTARelationType(), "Type", null, 1, 1, ASTARelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEEnum(solutionAndFeatureRelationTypeEEnum, SolutionAndFeatureRelationType.class, "SolutionAndFeatureRelationType");
		addEEnumLiteral(solutionAndFeatureRelationTypeEEnum, SolutionAndFeatureRelationType.CONTAINS);
		addEEnumLiteral(solutionAndFeatureRelationTypeEEnum, SolutionAndFeatureRelationType.BASED_ON);
		addEEnumLiteral(solutionAndFeatureRelationTypeEEnum, SolutionAndFeatureRelationType.SUB_FEATURE);
		addEEnumLiteral(solutionAndFeatureRelationTypeEEnum, SolutionAndFeatureRelationType.DEVELOPMENT_FEATURE_ENVIRONMENT);
		addEEnumLiteral(solutionAndFeatureRelationTypeEEnum, SolutionAndFeatureRelationType.USING);
		addEEnumLiteral(solutionAndFeatureRelationTypeEEnum, SolutionAndFeatureRelationType.EMBODIES);
		addEEnumLiteral(solutionAndFeatureRelationTypeEEnum, SolutionAndFeatureRelationType.INTEGRATES);
		addEEnumLiteral(solutionAndFeatureRelationTypeEEnum, SolutionAndFeatureRelationType.IMPLEMENTED_BY);

		initEEnum(astaRelationTypeEEnum, ASTARelationType.class, "ASTARelationType");
		addEEnumLiteral(astaRelationTypeEEnum, ASTARelationType.SOLVED_BY);
		addEEnumLiteral(astaRelationTypeEEnum, ASTARelationType.IMPROVED_BY);

		// Initialize data types
		initEDataType(idEDataType, String.class, "ID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ArchitectureKnowledgeModelPackageImpl
