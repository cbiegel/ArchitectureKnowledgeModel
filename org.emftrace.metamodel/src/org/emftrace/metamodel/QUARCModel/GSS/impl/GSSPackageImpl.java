/**
 */
package org.emftrace.metamodel.QUARCModel.GSS.impl;

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

import org.emftrace.metamodel.QUARCModel.GSS.ConstrainedElement;
import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Flaw;
import org.emftrace.metamodel.QUARCModel.GSS.GSSBase;
import org.emftrace.metamodel.QUARCModel.GSS.GSSFactory;
import org.emftrace.metamodel.QUARCModel.GSS.GSSPackage;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Impact;
import org.emftrace.metamodel.QUARCModel.GSS.Offset;
import org.emftrace.metamodel.QUARCModel.GSS.Pattern;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.metamodel.QUARCModel.GSS.Refactoring;
import org.emftrace.metamodel.QUARCModel.GSS.Refinement;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument;
import org.emftrace.metamodel.QUARCModel.GSS.Tag;
import org.emftrace.metamodel.QUARCModel.GSS.TagsCatalogue;
import org.emftrace.metamodel.QUARCModel.GSS.isA;

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
public class GSSPackageImpl extends EPackageImpl implements GSSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

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
	private EClass decompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constrainedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass principleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionInstrumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refactoringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagsCatalogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinementEClass = null;

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
	 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GSSPackageImpl() {
		super(eNS_URI, GSSFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GSSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GSSPackage init() {
		if (isInited) return (GSSPackage)EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI);

		// Obtain or create and register package
		GSSPackageImpl theGSSPackage = (GSSPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GSSPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GSSPackageImpl());

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
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI) instanceof QueryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI) : QueryPackage.eINSTANCE);
		PackagesPackageImpl thePackagesPackage = (PackagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) instanceof PackagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) : PackagesPackage.eINSTANCE);
		ChangeModelPackageImpl theChangeModelPackage = (ChangeModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChangeModelPackage.eNS_URI) instanceof ChangeModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChangeModelPackage.eNS_URI) : ChangeModelPackage.eINSTANCE);

		// Load packages
		theOWLModelPackage.loadPackage();
		theUMLModelPackage.loadPackage();
		theBPMN2ModelPackage.loadPackage();

		// Create package meta-data objects
		theGSSPackage.createPackageContents();
		theLinkModelPackage.createPackageContents();
		theRuleModelPackage.createPackageContents();
		theReportModelPackage.createPackageContents();
		theFeatureModelPackage.createPackageContents();
		theURNModelPackage.createPackageContents();
		theEMFfitModelPackage.createPackageContents();
		theConstraintsPackage.createPackageContents();
		theQueryPackage.createPackageContents();
		thePackagesPackage.createPackageContents();
		theChangeModelPackage.createPackageContents();

		// Initialize created meta-data
		theGSSPackage.initializePackageContents();
		theLinkModelPackage.initializePackageContents();
		theRuleModelPackage.initializePackageContents();
		theReportModelPackage.initializePackageContents();
		theFeatureModelPackage.initializePackageContents();
		theURNModelPackage.initializePackageContents();
		theEMFfitModelPackage.initializePackageContents();
		theConstraintsPackage.initializePackageContents();
		theQueryPackage.initializePackageContents();
		thePackagesPackage.initializePackageContents();
		theChangeModelPackage.initializePackageContents();

		// Fix loaded packages
		theOWLModelPackage.fixPackageContents();
		theUMLModelPackage.fixPackageContents();
		theBPMN2ModelPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theGSSPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GSSPackage.eNS_URI, theGSSPackage);
		return theGSSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Description() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Alias() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Tags() {
		return (EReference)elementEClass.getEStructuralFeatures().get(3);
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
	public EReference getRelation_Source() {
		return (EReference)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Target() {
		return (EReference)relationEClass.getEStructuralFeatures().get(1);
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
	public EClass getImpact() {
		return impactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImpact_Weight() {
		return (EAttribute)impactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstrainedElement() {
		return constrainedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstrainedElement_Precondition() {
		return (EReference)constrainedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrinciple() {
		return principleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionInstrument() {
		return solutionInstrumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionInstrument_RelatedInstruments() {
		return (EReference)solutionInstrumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolutionInstrument_Link() {
		return (EAttribute)solutionInstrumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Structure() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Consequences() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Example() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefactoring() {
		return refactoringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefactoring_Actions() {
		return (EAttribute)refactoringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefactoring_Consequences() {
		return (EAttribute)refactoringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffset() {
		return offsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffset_Value() {
		return (EAttribute)offsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlaw() {
		return flawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlaw_Metrics() {
		return (EAttribute)flawEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlaw_InterpretationRule() {
		return (EAttribute)flawEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSBase() {
		return gssBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSS() {
		return gssEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSS_Elements() {
		return (EReference)gssEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSS_Relations() {
		return (EReference)gssEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Name() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagsCatalogue() {
		return tagsCatalogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagsCatalogue_Tags() {
		return (EReference)tagsCatalogueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getisA() {
		return isAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinement() {
		return refinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFactory getGSSFactory() {
		return (GSSFactory)getEFactoryInstance();
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
		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEAttribute(elementEClass, ELEMENT__DESCRIPTION);
		createEAttribute(elementEClass, ELEMENT__ALIAS);
		createEReference(elementEClass, ELEMENT__TAGS);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__SOURCE);
		createEReference(relationEClass, RELATION__TARGET);

		decompositionEClass = createEClass(DECOMPOSITION);

		impactEClass = createEClass(IMPACT);
		createEAttribute(impactEClass, IMPACT__WEIGHT);

		goalEClass = createEClass(GOAL);

		constrainedElementEClass = createEClass(CONSTRAINED_ELEMENT);
		createEReference(constrainedElementEClass, CONSTRAINED_ELEMENT__PRECONDITION);

		principleEClass = createEClass(PRINCIPLE);

		solutionInstrumentEClass = createEClass(SOLUTION_INSTRUMENT);
		createEReference(solutionInstrumentEClass, SOLUTION_INSTRUMENT__RELATED_INSTRUMENTS);
		createEAttribute(solutionInstrumentEClass, SOLUTION_INSTRUMENT__LINK);

		patternEClass = createEClass(PATTERN);
		createEAttribute(patternEClass, PATTERN__STRUCTURE);
		createEAttribute(patternEClass, PATTERN__CONSEQUENCES);
		createEAttribute(patternEClass, PATTERN__EXAMPLE);

		refactoringEClass = createEClass(REFACTORING);
		createEAttribute(refactoringEClass, REFACTORING__ACTIONS);
		createEAttribute(refactoringEClass, REFACTORING__CONSEQUENCES);

		offsetEClass = createEClass(OFFSET);
		createEAttribute(offsetEClass, OFFSET__VALUE);

		flawEClass = createEClass(FLAW);
		createEAttribute(flawEClass, FLAW__METRICS);
		createEAttribute(flawEClass, FLAW__INTERPRETATION_RULE);

		gssBaseEClass = createEClass(GSS_BASE);

		gssEClass = createEClass(GSS);
		createEReference(gssEClass, GSS__ELEMENTS);
		createEReference(gssEClass, GSS__RELATIONS);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__NAME);

		tagsCatalogueEClass = createEClass(TAGS_CATALOGUE);
		createEReference(tagsCatalogueEClass, TAGS_CATALOGUE__TAGS);

		isAEClass = createEClass(IS_A);

		refinementEClass = createEClass(REFINEMENT);
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
		ConstraintsPackage theConstraintsPackage = (ConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementEClass.getESuperTypes().add(this.getGSSBase());
		relationEClass.getESuperTypes().add(this.getGSSBase());
		decompositionEClass.getESuperTypes().add(this.getRefinement());
		impactEClass.getESuperTypes().add(this.getRelation());
		goalEClass.getESuperTypes().add(this.getElement());
		constrainedElementEClass.getESuperTypes().add(this.getElement());
		principleEClass.getESuperTypes().add(this.getConstrainedElement());
		solutionInstrumentEClass.getESuperTypes().add(this.getConstrainedElement());
		patternEClass.getESuperTypes().add(this.getSolutionInstrument());
		refactoringEClass.getESuperTypes().add(this.getSolutionInstrument());
		offsetEClass.getESuperTypes().add(this.getRelation());
		flawEClass.getESuperTypes().add(this.getPrinciple());
		gssEClass.getESuperTypes().add(this.getGSSBase());
		tagEClass.getESuperTypes().add(this.getGSSBase());
		tagsCatalogueEClass.getESuperTypes().add(this.getGSSBase());
		isAEClass.getESuperTypes().add(this.getRefinement());
		refinementEClass.getESuperTypes().add(this.getRelation());

		// Initialize classes and features; add operations and parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Description(), ecorePackage.getEString(), "description", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Alias(), ecorePackage.getEString(), "alias", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Tags(), this.getTag(), null, "tags", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_Source(), this.getElement(), null, "source", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Target(), this.getElement(), null, "target", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decompositionEClass, Decomposition.class, "Decomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(impactEClass, Impact.class, "Impact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImpact_Weight(), ecorePackage.getEString(), "weight", "0.0", 1, 1, Impact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constrainedElementEClass, ConstrainedElement.class, "ConstrainedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstrainedElement_Precondition(), theConstraintsPackage.getPrecondition(), null, "precondition", null, 0, 1, ConstrainedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(principleEClass, Principle.class, "Principle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solutionInstrumentEClass, SolutionInstrument.class, "SolutionInstrument", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionInstrument_RelatedInstruments(), this.getSolutionInstrument(), null, "relatedInstruments", null, 0, -1, SolutionInstrument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionInstrument_Link(), ecorePackage.getEString(), "link", null, 0, 1, SolutionInstrument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Structure(), ecorePackage.getEString(), "structure", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Consequences(), ecorePackage.getEString(), "consequences", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Example(), ecorePackage.getEString(), "example", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refactoringEClass, Refactoring.class, "Refactoring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefactoring_Actions(), ecorePackage.getEString(), "actions", null, 0, 1, Refactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefactoring_Consequences(), ecorePackage.getEString(), "consequences", null, 0, 1, Refactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offsetEClass, Offset.class, "Offset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOffset_Value(), ecorePackage.getEString(), "value", "0.0", 1, 1, Offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flawEClass, Flaw.class, "Flaw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlaw_Metrics(), ecorePackage.getEString(), "metrics", null, 0, 1, Flaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlaw_InterpretationRule(), ecorePackage.getEString(), "interpretationRule", null, 0, 1, Flaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssBaseEClass, GSSBase.class, "GSSBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gssEClass, org.emftrace.metamodel.QUARCModel.GSS.GSS.class, "GSS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSS_Elements(), this.getElement(), null, "elements", null, 0, -1, org.emftrace.metamodel.QUARCModel.GSS.GSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSS_Relations(), this.getRelation(), null, "relations", null, 0, -1, org.emftrace.metamodel.QUARCModel.GSS.GSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagsCatalogueEClass, TagsCatalogue.class, "TagsCatalogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTagsCatalogue_Tags(), this.getTag(), null, "tags", null, 0, -1, TagsCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isAEClass, isA.class, "isA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(refinementEClass, Refinement.class, "Refinement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";																		
		addAnnotation
		  (getSolutionInstrument_Link(), 
		   source, 
		   new String[] {
			 "name", "Decomposition"
		   });											
		addAnnotation
		  (getOffset_Value(), 
		   source, 
		   new String[] {
			 "name", "Decomposition"
		   });										
		addAnnotation
		  (getTag_Name(), 
		   source, 
		   new String[] {
			 "name", "Decomposition"
		   });					
	}

} //GSSPackageImpl
