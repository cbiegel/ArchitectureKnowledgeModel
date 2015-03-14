/**
 */
package org.emftrace.metamodel.QUARCModel.Query.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

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

import org.emftrace.metamodel.QUARCModel.Query.ApplicableElement;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.GSSQueryContainment;
import org.emftrace.metamodel.QUARCModel.Query.GSSQueryModelBase;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedDecomposition;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElementSet;
import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;
import org.emftrace.metamodel.QUARCModel.Query.QueryPackage;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.metamodel.QUARCModel.Query.Rating;
import org.emftrace.metamodel.QUARCModel.Query.SelectedGoalsPriorities;
import org.emftrace.metamodel.QUARCModel.Query.SelectedGoalsSet;
import org.emftrace.metamodel.QUARCModel.Query.SelectedPrinciplesSet;

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
public class QueryPackageImpl extends EPackageImpl implements QueryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssQueryModelBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssQueryContainmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryResultSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectedGoalsSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignedConstraintsSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prioritizedElementSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prioritizedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectedPrinciplesSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prioritizedDecompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectedGoalsPrioritiesEClass = null;

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
	 * @see org.emftrace.metamodel.QUARCModel.Query.QueryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QueryPackageImpl() {
		super(eNS_URI, QueryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QueryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QueryPackage init() {
		if (isInited) return (QueryPackage)EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);

		// Obtain or create and register package
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QueryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QueryPackageImpl());

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
		PackagesPackageImpl thePackagesPackage = (PackagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) instanceof PackagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) : PackagesPackage.eINSTANCE);
		ChangeModelPackageImpl theChangeModelPackage = (ChangeModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChangeModelPackage.eNS_URI) instanceof ChangeModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChangeModelPackage.eNS_URI) : ChangeModelPackage.eINSTANCE);

		// Load packages
		theOWLModelPackage.loadPackage();
		theUMLModelPackage.loadPackage();
		theBPMN2ModelPackage.loadPackage();

		// Create package meta-data objects
		theQueryPackage.createPackageContents();
		theLinkModelPackage.createPackageContents();
		theRuleModelPackage.createPackageContents();
		theReportModelPackage.createPackageContents();
		theFeatureModelPackage.createPackageContents();
		theURNModelPackage.createPackageContents();
		theEMFfitModelPackage.createPackageContents();
		theConstraintsPackage.createPackageContents();
		theGSSPackage.createPackageContents();
		thePackagesPackage.createPackageContents();
		theChangeModelPackage.createPackageContents();

		// Initialize created meta-data
		theQueryPackage.initializePackageContents();
		theLinkModelPackage.initializePackageContents();
		theRuleModelPackage.initializePackageContents();
		theReportModelPackage.initializePackageContents();
		theFeatureModelPackage.initializePackageContents();
		theURNModelPackage.initializePackageContents();
		theEMFfitModelPackage.initializePackageContents();
		theConstraintsPackage.initializePackageContents();
		theGSSPackage.initializePackageContents();
		thePackagesPackage.initializePackageContents();
		theChangeModelPackage.initializePackageContents();

		// Fix loaded packages
		theOWLModelPackage.fixPackageContents();
		theUMLModelPackage.fixPackageContents();
		theBPMN2ModelPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theQueryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QueryPackage.eNS_URI, theQueryPackage);
		return theQueryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSQueryModelBase() {
		return gssQueryModelBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSQuery() {
		return gssQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSQuery_Name() {
		return (EAttribute)gssQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSQuery_Description() {
		return (EAttribute)gssQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSQuery_Uuid() {
		return (EAttribute)gssQueryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSQuery_Username() {
		return (EAttribute)gssQueryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSQuery_Timestamp() {
		return (EAttribute)gssQueryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSQuery_IncludeAll() {
		return (EAttribute)gssQueryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSQuery_IncludePattern() {
		return (EAttribute)gssQueryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSQuery_IncludeRefactorings() {
		return (EAttribute)gssQueryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSQuery_IncludePrinciples() {
		return (EAttribute)gssQueryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSQuery_IncludeFlaws() {
		return (EAttribute)gssQueryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSQuery_QueryResultSet() {
		return (EReference)gssQueryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSQuery_SelectedGoalsSet() {
		return (EReference)gssQueryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSQuery_AssignedConstraintsSet() {
		return (EReference)gssQueryEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSQuery_SelectedPrinciplesSet() {
		return (EReference)gssQueryEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSQuery_SelectedGoalsPriorities() {
		return (EReference)gssQueryEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSQuery_Changed() {
		return (EAttribute)gssQueryEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSQueryContainment() {
		return gssQueryContainmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSQueryContainment_GssQueries() {
		return (EReference)gssQueryContainmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryResultSet() {
		return queryResultSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryResultSet_ApplicableElements() {
		return (EReference)queryResultSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryResultSet_Ratings() {
		return (EReference)queryResultSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicableElement() {
		return applicableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicableElement_Element() {
		return (EReference)applicableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicableElement_OutgoingImpactRelations() {
		return (EReference)applicableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicableElement_IncomingImpactRelations() {
		return (EReference)applicableElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicableElement_IncomingOffsetRelations() {
		return (EReference)applicableElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicableElement_OutgoingOffsetRelations() {
		return (EReference)applicableElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicableElement_IncomingDecompositionRelations() {
		return (EReference)applicableElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicableElement_OutgoingDecompositionRelations() {
		return (EReference)applicableElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicableElement_IncomingIsARelations() {
		return (EReference)applicableElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicableElement_OutgoingIsARelations() {
		return (EReference)applicableElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicableElement_IncomingRelationsFromElementsWithUndefinedProperties() {
		return (EReference)applicableElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRating() {
		return ratingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRating_Weight() {
		return (EAttribute)ratingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectedGoalsSet() {
		return selectedGoalsSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignedConstraintsSet() {
		return assignedConstraintsSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignedConstraintsSet_AssignedConstraints() {
		return (EReference)assignedConstraintsSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignedConstraintsSet_Changed() {
		return (EAttribute)assignedConstraintsSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrioritizedElementSet() {
		return prioritizedElementSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrioritizedElementSet_PrioritizedElements() {
		return (EReference)prioritizedElementSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrioritizedElementSet_PriorizedDecompositionRelations() {
		return (EReference)prioritizedElementSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrioritizedElementSet_Changed() {
		return (EAttribute)prioritizedElementSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrioritizedElement() {
		return prioritizedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrioritizedElement_Element() {
		return (EReference)prioritizedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrioritizedElement_GlobalPriority() {
		return (EAttribute)prioritizedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectedPrinciplesSet() {
		return selectedPrinciplesSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrioritizedDecomposition() {
		return prioritizedDecompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrioritizedDecomposition_Weight() {
		return (EAttribute)prioritizedDecompositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrioritizedDecomposition_Decompostion() {
		return (EReference)prioritizedDecompositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectedGoalsPriorities() {
		return selectedGoalsPrioritiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFactory getQueryFactory() {
		return (QueryFactory)getEFactoryInstance();
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
		gssQueryModelBaseEClass = createEClass(GSS_QUERY_MODEL_BASE);

		gssQueryEClass = createEClass(GSS_QUERY);
		createEAttribute(gssQueryEClass, GSS_QUERY__NAME);
		createEAttribute(gssQueryEClass, GSS_QUERY__DESCRIPTION);
		createEAttribute(gssQueryEClass, GSS_QUERY__UUID);
		createEAttribute(gssQueryEClass, GSS_QUERY__USERNAME);
		createEAttribute(gssQueryEClass, GSS_QUERY__TIMESTAMP);
		createEAttribute(gssQueryEClass, GSS_QUERY__INCLUDE_ALL);
		createEAttribute(gssQueryEClass, GSS_QUERY__INCLUDE_PATTERN);
		createEAttribute(gssQueryEClass, GSS_QUERY__INCLUDE_REFACTORINGS);
		createEAttribute(gssQueryEClass, GSS_QUERY__INCLUDE_PRINCIPLES);
		createEAttribute(gssQueryEClass, GSS_QUERY__INCLUDE_FLAWS);
		createEReference(gssQueryEClass, GSS_QUERY__QUERY_RESULT_SET);
		createEReference(gssQueryEClass, GSS_QUERY__SELECTED_GOALS_SET);
		createEReference(gssQueryEClass, GSS_QUERY__ASSIGNED_CONSTRAINTS_SET);
		createEReference(gssQueryEClass, GSS_QUERY__SELECTED_PRINCIPLES_SET);
		createEReference(gssQueryEClass, GSS_QUERY__SELECTED_GOALS_PRIORITIES);
		createEAttribute(gssQueryEClass, GSS_QUERY__CHANGED);

		gssQueryContainmentEClass = createEClass(GSS_QUERY_CONTAINMENT);
		createEReference(gssQueryContainmentEClass, GSS_QUERY_CONTAINMENT__GSS_QUERIES);

		queryResultSetEClass = createEClass(QUERY_RESULT_SET);
		createEReference(queryResultSetEClass, QUERY_RESULT_SET__APPLICABLE_ELEMENTS);
		createEReference(queryResultSetEClass, QUERY_RESULT_SET__RATINGS);

		applicableElementEClass = createEClass(APPLICABLE_ELEMENT);
		createEReference(applicableElementEClass, APPLICABLE_ELEMENT__ELEMENT);
		createEReference(applicableElementEClass, APPLICABLE_ELEMENT__OUTGOING_IMPACT_RELATIONS);
		createEReference(applicableElementEClass, APPLICABLE_ELEMENT__INCOMING_IMPACT_RELATIONS);
		createEReference(applicableElementEClass, APPLICABLE_ELEMENT__INCOMING_OFFSET_RELATIONS);
		createEReference(applicableElementEClass, APPLICABLE_ELEMENT__OUTGOING_OFFSET_RELATIONS);
		createEReference(applicableElementEClass, APPLICABLE_ELEMENT__INCOMING_DECOMPOSITION_RELATIONS);
		createEReference(applicableElementEClass, APPLICABLE_ELEMENT__OUTGOING_DECOMPOSITION_RELATIONS);
		createEReference(applicableElementEClass, APPLICABLE_ELEMENT__INCOMING_IS_ARELATIONS);
		createEReference(applicableElementEClass, APPLICABLE_ELEMENT__OUTGOING_IS_ARELATIONS);
		createEReference(applicableElementEClass, APPLICABLE_ELEMENT__INCOMING_RELATIONS_FROM_ELEMENTS_WITH_UNDEFINED_PROPERTIES);

		ratingEClass = createEClass(RATING);
		createEAttribute(ratingEClass, RATING__WEIGHT);

		selectedGoalsSetEClass = createEClass(SELECTED_GOALS_SET);

		assignedConstraintsSetEClass = createEClass(ASSIGNED_CONSTRAINTS_SET);
		createEReference(assignedConstraintsSetEClass, ASSIGNED_CONSTRAINTS_SET__ASSIGNED_CONSTRAINTS);
		createEAttribute(assignedConstraintsSetEClass, ASSIGNED_CONSTRAINTS_SET__CHANGED);

		prioritizedElementSetEClass = createEClass(PRIORITIZED_ELEMENT_SET);
		createEReference(prioritizedElementSetEClass, PRIORITIZED_ELEMENT_SET__PRIORITIZED_ELEMENTS);
		createEReference(prioritizedElementSetEClass, PRIORITIZED_ELEMENT_SET__PRIORIZED_DECOMPOSITION_RELATIONS);
		createEAttribute(prioritizedElementSetEClass, PRIORITIZED_ELEMENT_SET__CHANGED);

		prioritizedElementEClass = createEClass(PRIORITIZED_ELEMENT);
		createEReference(prioritizedElementEClass, PRIORITIZED_ELEMENT__ELEMENT);
		createEAttribute(prioritizedElementEClass, PRIORITIZED_ELEMENT__GLOBAL_PRIORITY);

		selectedPrinciplesSetEClass = createEClass(SELECTED_PRINCIPLES_SET);

		prioritizedDecompositionEClass = createEClass(PRIORITIZED_DECOMPOSITION);
		createEAttribute(prioritizedDecompositionEClass, PRIORITIZED_DECOMPOSITION__WEIGHT);
		createEReference(prioritizedDecompositionEClass, PRIORITIZED_DECOMPOSITION__DECOMPOSTION);

		selectedGoalsPrioritiesEClass = createEClass(SELECTED_GOALS_PRIORITIES);
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
		GSSPackage theGSSPackage = (GSSPackage)EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI);
		ConstraintsPackage theConstraintsPackage = (ConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gssQueryEClass.getESuperTypes().add(this.getGSSQueryModelBase());
		gssQueryContainmentEClass.getESuperTypes().add(this.getGSSQueryModelBase());
		queryResultSetEClass.getESuperTypes().add(this.getGSSQueryModelBase());
		applicableElementEClass.getESuperTypes().add(this.getGSSQueryModelBase());
		ratingEClass.getESuperTypes().add(theGSSPackage.getRelation());
		selectedGoalsSetEClass.getESuperTypes().add(this.getPrioritizedElementSet());
		assignedConstraintsSetEClass.getESuperTypes().add(this.getGSSQueryModelBase());
		prioritizedElementSetEClass.getESuperTypes().add(this.getGSSQueryModelBase());
		prioritizedElementEClass.getESuperTypes().add(this.getGSSQueryModelBase());
		selectedPrinciplesSetEClass.getESuperTypes().add(this.getPrioritizedElementSet());
		prioritizedDecompositionEClass.getESuperTypes().add(this.getGSSQueryModelBase());
		selectedGoalsPrioritiesEClass.getESuperTypes().add(this.getGSSQueryModelBase());

		// Initialize classes and features; add operations and parameters
		initEClass(gssQueryModelBaseEClass, GSSQueryModelBase.class, "GSSQueryModelBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gssQueryEClass, GSSQuery.class, "GSSQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSQuery_Name(), ecorePackage.getEString(), "name", null, 0, 1, GSSQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSQuery_Description(), ecorePackage.getEString(), "description", null, 0, 1, GSSQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSQuery_Uuid(), ecorePackage.getEString(), "uuid", null, 0, 1, GSSQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSQuery_Username(), ecorePackage.getEString(), "username", null, 0, 1, GSSQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSQuery_Timestamp(), ecorePackage.getEString(), "timestamp", null, 0, 1, GSSQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSQuery_IncludeAll(), ecorePackage.getEBoolean(), "includeAll", null, 0, 1, GSSQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSQuery_IncludePattern(), ecorePackage.getEBoolean(), "includePattern", null, 0, 1, GSSQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSQuery_IncludeRefactorings(), ecorePackage.getEBoolean(), "includeRefactorings", null, 0, 1, GSSQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSQuery_IncludePrinciples(), ecorePackage.getEBoolean(), "includePrinciples", null, 0, 1, GSSQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSQuery_IncludeFlaws(), ecorePackage.getEBoolean(), "includeFlaws", null, 0, 1, GSSQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSQuery_QueryResultSet(), this.getQueryResultSet(), null, "queryResultSet", null, 1, 1, GSSQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSQuery_SelectedGoalsSet(), this.getSelectedGoalsSet(), null, "selectedGoalsSet", null, 1, 1, GSSQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSQuery_AssignedConstraintsSet(), this.getAssignedConstraintsSet(), null, "assignedConstraintsSet", null, 1, 1, GSSQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSQuery_SelectedPrinciplesSet(), this.getSelectedPrinciplesSet(), null, "selectedPrinciplesSet", null, 1, 1, GSSQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSQuery_SelectedGoalsPriorities(), this.getSelectedGoalsPriorities(), null, "selectedGoalsPriorities", null, 1, 1, GSSQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSQuery_Changed(), theEcorePackage.getEBoolean(), "changed", null, 0, 1, GSSQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssQueryContainmentEClass, GSSQueryContainment.class, "GSSQueryContainment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSQueryContainment_GssQueries(), this.getGSSQuery(), null, "gssQueries", null, 0, -1, GSSQueryContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryResultSetEClass, QueryResultSet.class, "QueryResultSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryResultSet_ApplicableElements(), this.getApplicableElement(), null, "applicableElements", null, 0, -1, QueryResultSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryResultSet_Ratings(), this.getRating(), null, "ratings", null, 0, -1, QueryResultSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicableElementEClass, ApplicableElement.class, "ApplicableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicableElement_Element(), theGSSPackage.getElement(), null, "element", null, 1, 1, ApplicableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicableElement_OutgoingImpactRelations(), theGSSPackage.getImpact(), null, "outgoingImpactRelations", null, 0, -1, ApplicableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicableElement_IncomingImpactRelations(), theGSSPackage.getImpact(), null, "incomingImpactRelations", null, 0, -1, ApplicableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicableElement_IncomingOffsetRelations(), theGSSPackage.getOffset(), null, "incomingOffsetRelations", null, 0, -1, ApplicableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicableElement_OutgoingOffsetRelations(), theGSSPackage.getOffset(), null, "outgoingOffsetRelations", null, 0, -1, ApplicableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicableElement_IncomingDecompositionRelations(), theGSSPackage.getDecomposition(), null, "incomingDecompositionRelations", null, 0, -1, ApplicableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicableElement_OutgoingDecompositionRelations(), theGSSPackage.getDecomposition(), null, "outgoingDecompositionRelations", null, 0, -1, ApplicableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicableElement_IncomingIsARelations(), theGSSPackage.getisA(), null, "incomingIsARelations", null, 0, -1, ApplicableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicableElement_OutgoingIsARelations(), theGSSPackage.getisA(), null, "outgoingIsARelations", null, 0, 1, ApplicableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicableElement_IncomingRelationsFromElementsWithUndefinedProperties(), theGSSPackage.getRelation(), null, "incomingRelationsFromElementsWithUndefinedProperties", null, 0, -1, ApplicableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ratingEClass, Rating.class, "Rating", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRating_Weight(), ecorePackage.getEString(), "weight", null, 0, 1, Rating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectedGoalsSetEClass, SelectedGoalsSet.class, "SelectedGoalsSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignedConstraintsSetEClass, AssignedConstraintsSet.class, "AssignedConstraintsSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignedConstraintsSet_AssignedConstraints(), theConstraintsPackage.getConstraint(), null, "assignedConstraints", null, 0, -1, AssignedConstraintsSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignedConstraintsSet_Changed(), theEcorePackage.getEBoolean(), "changed", null, 0, 1, AssignedConstraintsSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prioritizedElementSetEClass, PrioritizedElementSet.class, "PrioritizedElementSet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrioritizedElementSet_PrioritizedElements(), this.getPrioritizedElement(), null, "prioritizedElements", null, 0, -1, PrioritizedElementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrioritizedElementSet_PriorizedDecompositionRelations(), this.getPrioritizedDecomposition(), null, "priorizedDecompositionRelations", null, 0, -1, PrioritizedElementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrioritizedElementSet_Changed(), theEcorePackage.getEBoolean(), "changed", null, 0, 1, PrioritizedElementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prioritizedElementEClass, PrioritizedElement.class, "PrioritizedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrioritizedElement_Element(), theGSSPackage.getElement(), null, "element", null, 1, 1, PrioritizedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrioritizedElement_GlobalPriority(), ecorePackage.getEString(), "globalPriority", null, 0, 1, PrioritizedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectedPrinciplesSetEClass, SelectedPrinciplesSet.class, "SelectedPrinciplesSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prioritizedDecompositionEClass, PrioritizedDecomposition.class, "PrioritizedDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrioritizedDecomposition_Weight(), ecorePackage.getEString(), "weight", null, 0, 1, PrioritizedDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrioritizedDecomposition_Decompostion(), theGSSPackage.getDecomposition(), null, "decompostion", null, 1, 1, PrioritizedDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectedGoalsPrioritiesEClass, SelectedGoalsPriorities.class, "SelectedGoalsPriorities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //QueryPackageImpl
