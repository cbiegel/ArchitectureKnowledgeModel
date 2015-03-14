/**
 */
package org.emftrace.metamodel.ReportModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

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

import org.emftrace.metamodel.ReportModel.ConsistenceReport;
import org.emftrace.metamodel.ReportModel.ImpactReport;
import org.emftrace.metamodel.ReportModel.Report;
import org.emftrace.metamodel.ReportModel.ReportBase;
import org.emftrace.metamodel.ReportModel.ReportContainer;
import org.emftrace.metamodel.ReportModel.ReportModelFactory;
import org.emftrace.metamodel.ReportModel.ReportModelPackage;
import org.emftrace.metamodel.ReportModel.ReportType;
import org.emftrace.metamodel.ReportModel.ViolationType;
import org.emftrace.metamodel.ReportModel.ViolationTypeCatalog;

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
public class ReportModelPackageImpl extends EPackageImpl implements ReportModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass violationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass violationTypeCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impactReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consistenceReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reportTypeEEnum = null;

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
	 * @see org.emftrace.metamodel.ReportModel.ReportModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReportModelPackageImpl() {
		super(eNS_URI, ReportModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReportModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReportModelPackage init() {
		if (isInited) return (ReportModelPackage)EPackage.Registry.INSTANCE.getEPackage(ReportModelPackage.eNS_URI);

		// Obtain or create and register package
		ReportModelPackageImpl theReportModelPackage = (ReportModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReportModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReportModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		LinkModelPackageImpl theLinkModelPackage = (LinkModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LinkModelPackage.eNS_URI) instanceof LinkModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LinkModelPackage.eNS_URI) : LinkModelPackage.eINSTANCE);
		RuleModelPackageImpl theRuleModelPackage = (RuleModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RuleModelPackage.eNS_URI) instanceof RuleModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RuleModelPackage.eNS_URI) : RuleModelPackage.eINSTANCE);
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
		ArchitectureKnowledgeModelPackageImpl theArchitectureKnowledgeModelPackage = (ArchitectureKnowledgeModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitectureKnowledgeModelPackage.eNS_URI) instanceof ArchitectureKnowledgeModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitectureKnowledgeModelPackage.eNS_URI) : ArchitectureKnowledgeModelPackage.eINSTANCE);
		TechnologySolutionCatalogPackagePackageImpl theTechnologySolutionCatalogPackagePackage = (TechnologySolutionCatalogPackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TechnologySolutionCatalogPackagePackage.eNS_URI) instanceof TechnologySolutionCatalogPackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TechnologySolutionCatalogPackagePackage.eNS_URI) : TechnologySolutionCatalogPackagePackage.eINSTANCE);
		ChangeModelPackageImpl theChangeModelPackage = (ChangeModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChangeModelPackage.eNS_URI) instanceof ChangeModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChangeModelPackage.eNS_URI) : ChangeModelPackage.eINSTANCE);

		// Load packages
		theOWLModelPackage.loadPackage();
		theUMLModelPackage.loadPackage();
		theBPMN2ModelPackage.loadPackage();

		// Create package meta-data objects
		theReportModelPackage.createPackageContents();
		theLinkModelPackage.createPackageContents();
		theRuleModelPackage.createPackageContents();
		theFeatureModelPackage.createPackageContents();
		theURNModelPackage.createPackageContents();
		theEMFfitModelPackage.createPackageContents();
		theConstraintsPackage.createPackageContents();
		theGSSPackage.createPackageContents();
		theQueryPackage.createPackageContents();
		thePackagesPackage.createPackageContents();
		theArchitectureKnowledgeModelPackage.createPackageContents();
		theTechnologySolutionCatalogPackagePackage.createPackageContents();
		theChangeModelPackage.createPackageContents();

		// Initialize created meta-data
		theReportModelPackage.initializePackageContents();
		theLinkModelPackage.initializePackageContents();
		theRuleModelPackage.initializePackageContents();
		theFeatureModelPackage.initializePackageContents();
		theURNModelPackage.initializePackageContents();
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
		theReportModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReportModelPackage.eNS_URI, theReportModelPackage);
		return theReportModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportBase() {
		return reportBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViolationType() {
		return violationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViolationType_Name() {
		return (EAttribute)violationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViolationType_Refinement() {
		return (EReference)violationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViolationTypeCatalog() {
		return violationTypeCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViolationTypeCatalog_Name() {
		return (EAttribute)violationTypeCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViolationTypeCatalog_Description() {
		return (EAttribute)violationTypeCatalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViolationTypeCatalog_ViolationTypes() {
		return (EReference)violationTypeCatalogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReport() {
		return reportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReport_DetectedBy() {
		return (EAttribute)reportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReport_Type() {
		return (EAttribute)reportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReport_Solution() {
		return (EAttribute)reportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReport_Description() {
		return (EAttribute)reportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportContainer() {
		return reportContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportContainer_Name() {
		return (EAttribute)reportContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportContainer_Reports() {
		return (EReference)reportContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImpactReport() {
		return impactReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpactReport_AffectedElements() {
		return (EReference)impactReportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpactReport_ImpactSources() {
		return (EReference)impactReportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpactReport_ChangeType() {
		return (EReference)impactReportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsistenceReport() {
		return consistenceReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsistenceReport_TypeOfViolation() {
		return (EReference)consistenceReportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsistenceReport_Element() {
		return (EReference)consistenceReportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReportType() {
		return reportTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportModelFactory getReportModelFactory() {
		return (ReportModelFactory)getEFactoryInstance();
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
		reportBaseEClass = createEClass(REPORT_BASE);

		violationTypeEClass = createEClass(VIOLATION_TYPE);
		createEAttribute(violationTypeEClass, VIOLATION_TYPE__NAME);
		createEReference(violationTypeEClass, VIOLATION_TYPE__REFINEMENT);

		violationTypeCatalogEClass = createEClass(VIOLATION_TYPE_CATALOG);
		createEAttribute(violationTypeCatalogEClass, VIOLATION_TYPE_CATALOG__NAME);
		createEAttribute(violationTypeCatalogEClass, VIOLATION_TYPE_CATALOG__DESCRIPTION);
		createEReference(violationTypeCatalogEClass, VIOLATION_TYPE_CATALOG__VIOLATION_TYPES);

		reportEClass = createEClass(REPORT);
		createEAttribute(reportEClass, REPORT__DETECTED_BY);
		createEAttribute(reportEClass, REPORT__TYPE);
		createEAttribute(reportEClass, REPORT__SOLUTION);
		createEAttribute(reportEClass, REPORT__DESCRIPTION);

		reportContainerEClass = createEClass(REPORT_CONTAINER);
		createEAttribute(reportContainerEClass, REPORT_CONTAINER__NAME);
		createEReference(reportContainerEClass, REPORT_CONTAINER__REPORTS);

		impactReportEClass = createEClass(IMPACT_REPORT);
		createEReference(impactReportEClass, IMPACT_REPORT__AFFECTED_ELEMENTS);
		createEReference(impactReportEClass, IMPACT_REPORT__IMPACT_SOURCES);
		createEReference(impactReportEClass, IMPACT_REPORT__CHANGE_TYPE);

		consistenceReportEClass = createEClass(CONSISTENCE_REPORT);
		createEReference(consistenceReportEClass, CONSISTENCE_REPORT__TYPE_OF_VIOLATION);
		createEReference(consistenceReportEClass, CONSISTENCE_REPORT__ELEMENT);

		// Create enums
		reportTypeEEnum = createEEnum(REPORT_TYPE);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ChangeModelPackage theChangeModelPackage = (ChangeModelPackage)EPackage.Registry.INSTANCE.getEPackage(ChangeModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reportBaseEClass.getESuperTypes().add(ecorePackage.getEObject());
		violationTypeEClass.getESuperTypes().add(this.getReportBase());
		violationTypeCatalogEClass.getESuperTypes().add(this.getReportBase());
		reportEClass.getESuperTypes().add(this.getReportBase());
		reportContainerEClass.getESuperTypes().add(this.getReportBase());
		impactReportEClass.getESuperTypes().add(this.getReport());
		consistenceReportEClass.getESuperTypes().add(this.getReport());

		// Initialize classes and features; add operations and parameters
		initEClass(reportBaseEClass, ReportBase.class, "ReportBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(violationTypeEClass, ViolationType.class, "ViolationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViolationType_Name(), ecorePackage.getEString(), "Name", null, 1, 1, ViolationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViolationType_Refinement(), this.getViolationType(), null, "Refinement", null, 0, -1, ViolationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(violationTypeCatalogEClass, ViolationTypeCatalog.class, "ViolationTypeCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViolationTypeCatalog_Name(), ecorePackage.getEString(), "Name", null, 1, 1, ViolationTypeCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViolationTypeCatalog_Description(), ecorePackage.getEString(), "Description", null, 1, 1, ViolationTypeCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViolationTypeCatalog_ViolationTypes(), this.getViolationType(), null, "ViolationTypes", null, 0, -1, ViolationTypeCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reportEClass, Report.class, "Report", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReport_DetectedBy(), ecorePackage.getEString(), "DetectedBy", null, 1, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReport_Type(), this.getReportType(), "Type", null, 1, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReport_Solution(), ecorePackage.getEString(), "Solution", null, 0, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReport_Description(), theEcorePackage.getEString(), "Description", null, 1, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reportContainerEClass, ReportContainer.class, "ReportContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReportContainer_Name(), ecorePackage.getEString(), "Name", null, 1, 1, ReportContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReportContainer_Reports(), this.getReport(), null, "Reports", null, 0, -1, ReportContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(impactReportEClass, ImpactReport.class, "ImpactReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImpactReport_AffectedElements(), ecorePackage.getEObject(), null, "AffectedElements", null, 1, -1, ImpactReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImpactReport_ImpactSources(), theEcorePackage.getEObject(), null, "ImpactSources", null, 1, -1, ImpactReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImpactReport_ChangeType(), theChangeModelPackage.getAbstractChangeType(), null, "ChangeType", null, 1, 1, ImpactReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consistenceReportEClass, ConsistenceReport.class, "ConsistenceReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsistenceReport_TypeOfViolation(), this.getViolationType(), null, "TypeOfViolation", null, 0, 1, ConsistenceReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsistenceReport_Element(), theEcorePackage.getEObject(), null, "Element", null, 1, 1, ConsistenceReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(reportTypeEEnum, ReportType.class, "ReportType");
		addEEnumLiteral(reportTypeEEnum, ReportType.VIOLATION);
		addEEnumLiteral(reportTypeEEnum, ReportType.BAD_SMELL);
		addEEnumLiteral(reportTypeEEnum, ReportType.IMPACT);

		// Create resource
		createResource(eNS_URI);
	}

} //ReportModelPackageImpl
