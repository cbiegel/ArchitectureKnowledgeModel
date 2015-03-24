/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.ArchitectureKnowledgeCatalogPackagePackage;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeCatalogPackage.impl.ArchitectureKnowledgeCatalogPackagePackageImpl;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage;

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

import org.emftrace.metamodel.OWLModel.OWLModelFactory;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;

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
public class OWLModelPackageImpl extends EPackageImpl implements OWLModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "OWLModel.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abbreviatedIRIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationPropertyDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationPropertyRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asymmetricObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAllValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataComplementOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataExactCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataHasValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataIntersectionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMaxCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMinCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataOneOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSomeValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataUnionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass differentIndividualsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointClassesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointDataPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointObjectPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointUnionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentClassesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentDataPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentObjectPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalDataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverseFunctionalObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverseObjectPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iriEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irreflexiveObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeDataPropertyAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeObjectPropertyAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectAllValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectComplementOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectExactCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectHasSelfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectHasValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectIntersectionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectInverseOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectMaxCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectMinCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectOneOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectSomeValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectUnionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prefixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflexiveObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sameIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subAnnotationPropertyOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subClassOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subDataPropertyOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subObjectPropertyOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symmetricObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitiveObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameTypeEDataType = null;

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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OWLModelPackageImpl() {
		super(eNS_URI, OWLModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OWLModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static OWLModelPackage init() {
		if (isInited) return (OWLModelPackage)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI);

		// Obtain or create and register package
		OWLModelPackageImpl theOWLModelPackage = (OWLModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OWLModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OWLModelPackageImpl());

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
		URNModelPackageImpl theURNModelPackage = (URNModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(URNModelPackage.eNS_URI) instanceof URNModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(URNModelPackage.eNS_URI) : URNModelPackage.eINSTANCE);
		UMLModelPackageImpl theUMLModelPackage = (UMLModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI) instanceof UMLModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI) : UMLModelPackage.eINSTANCE);
		BPMN2ModelPackageImpl theBPMN2ModelPackage = (BPMN2ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPMN2ModelPackage.eNS_URI) instanceof BPMN2ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPMN2ModelPackage.eNS_URI) : BPMN2ModelPackage.eINSTANCE);
		EMFfitModelPackageImpl theEMFfitModelPackage = (EMFfitModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EMFfitModelPackage.eNS_URI) instanceof EMFfitModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EMFfitModelPackage.eNS_URI) : EMFfitModelPackage.eINSTANCE);
		ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI) instanceof ConstraintsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI) : ConstraintsPackage.eINSTANCE);
		GSSPackageImpl theGSSPackage = (GSSPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI) instanceof GSSPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI) : GSSPackage.eINSTANCE);
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI) instanceof QueryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI) : QueryPackage.eINSTANCE);
		PackagesPackageImpl thePackagesPackage = (PackagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) instanceof PackagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) : PackagesPackage.eINSTANCE);
		ArchitectureKnowledgeModelPackageImpl theArchitectureKnowledgeModelPackage = (ArchitectureKnowledgeModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitectureKnowledgeModelPackage.eNS_URI) instanceof ArchitectureKnowledgeModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitectureKnowledgeModelPackage.eNS_URI) : ArchitectureKnowledgeModelPackage.eINSTANCE);
		ArchitectureKnowledgeCatalogPackagePackageImpl theArchitectureKnowledgeCatalogPackagePackage = (ArchitectureKnowledgeCatalogPackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitectureKnowledgeCatalogPackagePackage.eNS_URI) instanceof ArchitectureKnowledgeCatalogPackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitectureKnowledgeCatalogPackagePackage.eNS_URI) : ArchitectureKnowledgeCatalogPackagePackage.eINSTANCE);
		ChangeModelPackageImpl theChangeModelPackage = (ChangeModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChangeModelPackage.eNS_URI) instanceof ChangeModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChangeModelPackage.eNS_URI) : ChangeModelPackage.eINSTANCE);

		// Load packages
		theOWLModelPackage.loadPackage();
		theUMLModelPackage.loadPackage();
		theBPMN2ModelPackage.loadPackage();

		// Create package meta-data objects
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
		theArchitectureKnowledgeModelPackage.createPackageContents();
		theArchitectureKnowledgeCatalogPackagePackage.createPackageContents();
		theChangeModelPackage.createPackageContents();

		// Initialize created meta-data
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
		theArchitectureKnowledgeModelPackage.initializePackageContents();
		theArchitectureKnowledgeCatalogPackagePackage.initializePackageContents();
		theChangeModelPackage.initializePackageContents();

		// Fix loaded packages
		theOWLModelPackage.fixPackageContents();
		theUMLModelPackage.fixPackageContents();
		theBPMN2ModelPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theOWLModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OWLModelPackage.eNS_URI, theOWLModelPackage);
		return theOWLModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbbreviatedIRI() {
		if (abbreviatedIRIEClass == null) {
			abbreviatedIRIEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(0);
		}
		return abbreviatedIRIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbbreviatedIRI_Value() {
        return (EAttribute)getAbbreviatedIRI().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbbreviatedIRI_Base() {
        return (EAttribute)getAbbreviatedIRI().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbbreviatedIRI_Id() {
        return (EAttribute)getAbbreviatedIRI().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbbreviatedIRI_Lang() {
        return (EAttribute)getAbbreviatedIRI().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbbreviatedIRI_Space() {
        return (EAttribute)getAbbreviatedIRI().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		if (annotationEClass == null) {
			annotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(1);
		}
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Annotation() {
        return (EReference)getAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_AnnotationProperty() {
        return (EReference)getAnnotation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_IRI() {
        return (EReference)getAnnotation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_AbbreviatedIRI() {
        return (EReference)getAnnotation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_AnonymousIndividual() {
        return (EReference)getAnnotation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Literal() {
        return (EReference)getAnnotation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Base() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Id() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Lang() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Space() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationAssertion() {
		if (annotationAssertionEClass == null) {
			annotationAssertionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(2);
		}
		return annotationAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationAssertion_AnnotationProperty() {
        return (EReference)getAnnotationAssertion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationAssertion_IRI() {
        return (EReference)getAnnotationAssertion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationAssertion_AbbreviatedIRI() {
        return (EReference)getAnnotationAssertion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationAssertion_AnonymousIndividual() {
        return (EReference)getAnnotationAssertion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationAssertion_Literal() {
        return (EReference)getAnnotationAssertion().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationAxiom() {
		if (annotationAxiomEClass == null) {
			annotationAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(3);
		}
		return annotationAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationProperty() {
		if (annotationPropertyEClass == null) {
			annotationPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(4);
		}
		return annotationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationProperty_AbbreviatedIRI() {
        return (EAttribute)getAnnotationProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationProperty_Base() {
        return (EAttribute)getAnnotationProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationProperty_Id() {
        return (EAttribute)getAnnotationProperty().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationProperty_IRI() {
        return (EAttribute)getAnnotationProperty().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationProperty_Lang() {
        return (EAttribute)getAnnotationProperty().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationProperty_Space() {
        return (EAttribute)getAnnotationProperty().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationPropertyDomain() {
		if (annotationPropertyDomainEClass == null) {
			annotationPropertyDomainEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(5);
		}
		return annotationPropertyDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationPropertyDomain_AnnotationProperty() {
        return (EReference)getAnnotationPropertyDomain().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationPropertyDomain_IRI() {
        return (EReference)getAnnotationPropertyDomain().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationPropertyDomain_AbbreviatedIRI() {
        return (EReference)getAnnotationPropertyDomain().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationPropertyRange() {
		if (annotationPropertyRangeEClass == null) {
			annotationPropertyRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(6);
		}
		return annotationPropertyRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationPropertyRange_AnnotationProperty() {
        return (EReference)getAnnotationPropertyRange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationPropertyRange_IRI() {
        return (EReference)getAnnotationPropertyRange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationPropertyRange_AbbreviatedIRI() {
        return (EReference)getAnnotationPropertyRange().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnonymousIndividual() {
		if (anonymousIndividualEClass == null) {
			anonymousIndividualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(7);
		}
		return anonymousIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnonymousIndividual_NodeID() {
        return (EAttribute)getAnonymousIndividual().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertion() {
		if (assertionEClass == null) {
			assertionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(8);
		}
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsymmetricObjectProperty() {
		if (asymmetricObjectPropertyEClass == null) {
			asymmetricObjectPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(9);
		}
		return asymmetricObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsymmetricObjectProperty_ObjectProperty() {
        return (EReference)getAsymmetricObjectProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsymmetricObjectProperty_ObjectInverseOf() {
        return (EReference)getAsymmetricObjectProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxiom() {
		if (axiomEClass == null) {
			axiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(10);
		}
		return axiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxiom_Annotation() {
        return (EReference)getAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxiom_Base() {
        return (EAttribute)getAxiom().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxiom_Id() {
        return (EAttribute)getAxiom().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxiom_Lang() {
        return (EAttribute)getAxiom().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxiom_Space() {
        return (EAttribute)getAxiom().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		if (classEClass == null) {
			classEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(11);
		}
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_AbbreviatedIRI() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_IRI() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassAssertion() {
		if (classAssertionEClass == null) {
			classAssertionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(12);
		}
		return classAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_Class() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_ObjectIntersectionOf() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_ObjectUnionOf() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_ObjectComplementOf() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_ObjectOneOf() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_ObjectSomeValuesFrom() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_ObjectAllValuesFrom() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_ObjectHasValue() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_ObjectHasSelf() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_ObjectMinCardinality() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_ObjectMaxCardinality() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_ObjectExactCardinality() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_DataSomeValuesFrom() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_DataAllValuesFrom() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_DataHasValue() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_DataMinCardinality() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_DataMaxCardinality() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_DataExactCardinality() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_NamedIndividual() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_AnonymousIndividual() {
        return (EReference)getClassAssertion().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassAxiom() {
		if (classAxiomEClass == null) {
			classAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(13);
		}
		return classAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassExpression() {
		if (classExpressionEClass == null) {
			classExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(14);
		}
		return classExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassExpression_Base() {
        return (EAttribute)getClassExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassExpression_Id() {
        return (EAttribute)getClassExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassExpression_Lang() {
        return (EAttribute)getClassExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassExpression_Space() {
        return (EAttribute)getClassExpression().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAllValuesFrom() {
		if (dataAllValuesFromEClass == null) {
			dataAllValuesFromEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(15);
		}
		return dataAllValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAllValuesFrom_DataProperty() {
        return (EReference)getDataAllValuesFrom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAllValuesFrom_Datatype() {
        return (EReference)getDataAllValuesFrom().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAllValuesFrom_DataIntersectionOf() {
        return (EReference)getDataAllValuesFrom().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAllValuesFrom_DataUnionOf() {
        return (EReference)getDataAllValuesFrom().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAllValuesFrom_DataComplementOf() {
        return (EReference)getDataAllValuesFrom().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAllValuesFrom_DataOneOf() {
        return (EReference)getDataAllValuesFrom().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAllValuesFrom_DatatypeRestriction() {
        return (EReference)getDataAllValuesFrom().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataComplementOf() {
		if (dataComplementOfEClass == null) {
			dataComplementOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(16);
		}
		return dataComplementOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataComplementOf_Datatype() {
        return (EReference)getDataComplementOf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataComplementOf_DataIntersectionOf() {
        return (EReference)getDataComplementOf().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataComplementOf_DataUnionOf() {
        return (EReference)getDataComplementOf().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataComplementOf_DataComplementOf() {
        return (EReference)getDataComplementOf().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataComplementOf_DataOneOf() {
        return (EReference)getDataComplementOf().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataComplementOf_DatatypeRestriction() {
        return (EReference)getDataComplementOf().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataExactCardinality() {
		if (dataExactCardinalityEClass == null) {
			dataExactCardinalityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(17);
		}
		return dataExactCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExactCardinality_DataProperty() {
        return (EReference)getDataExactCardinality().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExactCardinality_Datatype() {
        return (EReference)getDataExactCardinality().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExactCardinality_DataIntersectionOf() {
        return (EReference)getDataExactCardinality().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExactCardinality_DataUnionOf() {
        return (EReference)getDataExactCardinality().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExactCardinality_DataComplementOf() {
        return (EReference)getDataExactCardinality().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExactCardinality_DataOneOf() {
        return (EReference)getDataExactCardinality().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExactCardinality_DatatypeRestriction() {
        return (EReference)getDataExactCardinality().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataExactCardinality_Cardinality() {
        return (EAttribute)getDataExactCardinality().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataHasValue() {
		if (dataHasValueEClass == null) {
			dataHasValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(18);
		}
		return dataHasValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataHasValue_DataProperty() {
        return (EReference)getDataHasValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataHasValue_Literal() {
        return (EReference)getDataHasValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataIntersectionOf() {
		if (dataIntersectionOfEClass == null) {
			dataIntersectionOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(19);
		}
		return dataIntersectionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataIntersectionOf_Datatype() {
        return (EReference)getDataIntersectionOf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataIntersectionOf_DataIntersectionOf() {
        return (EReference)getDataIntersectionOf().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataIntersectionOf_DataUnionOf() {
        return (EReference)getDataIntersectionOf().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataIntersectionOf_DataComplementOf() {
        return (EReference)getDataIntersectionOf().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataIntersectionOf_DataOneOf() {
        return (EReference)getDataIntersectionOf().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataIntersectionOf_DatatypeRestriction() {
        return (EReference)getDataIntersectionOf().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMaxCardinality() {
		if (dataMaxCardinalityEClass == null) {
			dataMaxCardinalityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(20);
		}
		return dataMaxCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMaxCardinality_DataProperty() {
        return (EReference)getDataMaxCardinality().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMaxCardinality_Datatype() {
        return (EReference)getDataMaxCardinality().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMaxCardinality_DataIntersectionOf() {
        return (EReference)getDataMaxCardinality().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMaxCardinality_DataUnionOf() {
        return (EReference)getDataMaxCardinality().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMaxCardinality_DataComplementOf() {
        return (EReference)getDataMaxCardinality().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMaxCardinality_DataOneOf() {
        return (EReference)getDataMaxCardinality().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMaxCardinality_DatatypeRestriction() {
        return (EReference)getDataMaxCardinality().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMaxCardinality_Cardinality() {
        return (EAttribute)getDataMaxCardinality().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMinCardinality() {
		if (dataMinCardinalityEClass == null) {
			dataMinCardinalityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(21);
		}
		return dataMinCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMinCardinality_DataProperty() {
        return (EReference)getDataMinCardinality().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMinCardinality_Datatype() {
        return (EReference)getDataMinCardinality().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMinCardinality_DataIntersectionOf() {
        return (EReference)getDataMinCardinality().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMinCardinality_DataUnionOf() {
        return (EReference)getDataMinCardinality().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMinCardinality_DataComplementOf() {
        return (EReference)getDataMinCardinality().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMinCardinality_DataOneOf() {
        return (EReference)getDataMinCardinality().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMinCardinality_DatatypeRestriction() {
        return (EReference)getDataMinCardinality().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMinCardinality_Cardinality() {
        return (EAttribute)getDataMinCardinality().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataOneOf() {
		if (dataOneOfEClass == null) {
			dataOneOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(22);
		}
		return dataOneOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataOneOf_Literal() {
        return (EReference)getDataOneOf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataProperty() {
		if (dataPropertyEClass == null) {
			dataPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(23);
		}
		return dataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataProperty_AbbreviatedIRI() {
        return (EAttribute)getDataProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataProperty_IRI() {
        return (EAttribute)getDataProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyAssertion() {
		if (dataPropertyAssertionEClass == null) {
			dataPropertyAssertionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(24);
		}
		return dataPropertyAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyAssertion_DataProperty() {
        return (EReference)getDataPropertyAssertion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyAssertion_NamedIndividual() {
        return (EReference)getDataPropertyAssertion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyAssertion_AnonymousIndividual() {
        return (EReference)getDataPropertyAssertion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyAssertion_Literal() {
        return (EReference)getDataPropertyAssertion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyAxiom() {
		if (dataPropertyAxiomEClass == null) {
			dataPropertyAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(25);
		}
		return dataPropertyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyDomain() {
		if (dataPropertyDomainEClass == null) {
			dataPropertyDomainEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(26);
		}
		return dataPropertyDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_DataProperty() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_Class() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_ObjectIntersectionOf() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_ObjectUnionOf() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_ObjectComplementOf() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_ObjectOneOf() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_ObjectSomeValuesFrom() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_ObjectAllValuesFrom() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_ObjectHasValue() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_ObjectHasSelf() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_ObjectMinCardinality() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_ObjectMaxCardinality() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_ObjectExactCardinality() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_DataSomeValuesFrom() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_DataAllValuesFrom() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_DataHasValue() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_DataMinCardinality() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_DataMaxCardinality() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_DataExactCardinality() {
        return (EReference)getDataPropertyDomain().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyExpression() {
		if (dataPropertyExpressionEClass == null) {
			dataPropertyExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(27);
		}
		return dataPropertyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPropertyExpression_Base() {
        return (EAttribute)getDataPropertyExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPropertyExpression_Id() {
        return (EAttribute)getDataPropertyExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPropertyExpression_Lang() {
        return (EAttribute)getDataPropertyExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPropertyExpression_Space() {
        return (EAttribute)getDataPropertyExpression().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyRange() {
		if (dataPropertyRangeEClass == null) {
			dataPropertyRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(28);
		}
		return dataPropertyRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyRange_DataProperty() {
        return (EReference)getDataPropertyRange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyRange_Datatype() {
        return (EReference)getDataPropertyRange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyRange_DataIntersectionOf() {
        return (EReference)getDataPropertyRange().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyRange_DataUnionOf() {
        return (EReference)getDataPropertyRange().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyRange_DataComplementOf() {
        return (EReference)getDataPropertyRange().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyRange_DataOneOf() {
        return (EReference)getDataPropertyRange().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyRange_DatatypeRestriction() {
        return (EReference)getDataPropertyRange().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRange() {
		if (dataRangeEClass == null) {
			dataRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(29);
		}
		return dataRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataRange_Base() {
        return (EAttribute)getDataRange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataRange_Id() {
        return (EAttribute)getDataRange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataRange_Lang() {
        return (EAttribute)getDataRange().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataRange_Space() {
        return (EAttribute)getDataRange().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSomeValuesFrom() {
		if (dataSomeValuesFromEClass == null) {
			dataSomeValuesFromEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(30);
		}
		return dataSomeValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSomeValuesFrom_DataProperty() {
        return (EReference)getDataSomeValuesFrom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSomeValuesFrom_Datatype() {
        return (EReference)getDataSomeValuesFrom().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSomeValuesFrom_DataIntersectionOf() {
        return (EReference)getDataSomeValuesFrom().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSomeValuesFrom_DataUnionOf() {
        return (EReference)getDataSomeValuesFrom().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSomeValuesFrom_DataComplementOf() {
        return (EReference)getDataSomeValuesFrom().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSomeValuesFrom_DataOneOf() {
        return (EReference)getDataSomeValuesFrom().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSomeValuesFrom_DatatypeRestriction() {
        return (EReference)getDataSomeValuesFrom().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatype() {
		if (datatypeEClass == null) {
			datatypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(31);
		}
		return datatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatype_AbbreviatedIRI() {
        return (EAttribute)getDatatype().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatype_IRI() {
        return (EAttribute)getDatatype().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinition() {
		if (datatypeDefinitionEClass == null) {
			datatypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(32);
		}
		return datatypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeDefinition_Datatype() {
        return (EReference)getDatatypeDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeDefinition_DataIntersectionOf() {
        return (EReference)getDatatypeDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeDefinition_DataUnionOf() {
        return (EReference)getDatatypeDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeDefinition_DataComplementOf() {
        return (EReference)getDatatypeDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeDefinition_DataOneOf() {
        return (EReference)getDatatypeDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeDefinition_DatatypeRestriction() {
        return (EReference)getDatatypeDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeRestriction() {
		if (datatypeRestrictionEClass == null) {
			datatypeRestrictionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(33);
		}
		return datatypeRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeRestriction_Datatype() {
        return (EReference)getDatatypeRestriction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeRestriction_FacetRestriction() {
        return (EReference)getDatatypeRestriction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataUnionOf() {
		if (dataUnionOfEClass == null) {
			dataUnionOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(34);
		}
		return dataUnionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUnionOf_Datatype() {
        return (EReference)getDataUnionOf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUnionOf_DataIntersectionOf() {
        return (EReference)getDataUnionOf().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUnionOf_DataUnionOf() {
        return (EReference)getDataUnionOf().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUnionOf_DataComplementOf() {
        return (EReference)getDataUnionOf().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUnionOf_DataOneOf() {
        return (EReference)getDataUnionOf().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUnionOf_DatatypeRestriction() {
        return (EReference)getDataUnionOf().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaration() {
		if (declarationEClass == null) {
			declarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(35);
		}
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_Class() {
        return (EReference)getDeclaration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_Datatype() {
        return (EReference)getDeclaration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_ObjectProperty() {
        return (EReference)getDeclaration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_DataProperty() {
        return (EReference)getDeclaration().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_AnnotationProperty() {
        return (EReference)getDeclaration().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_NamedIndividual() {
        return (EReference)getDeclaration().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDifferentIndividuals() {
		if (differentIndividualsEClass == null) {
			differentIndividualsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(36);
		}
		return differentIndividualsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifferentIndividuals_NamedIndividual() {
        return (EReference)getDifferentIndividuals().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifferentIndividuals_AnonymousIndividual() {
        return (EReference)getDifferentIndividuals().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointClasses() {
		if (disjointClassesEClass == null) {
			disjointClassesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(37);
		}
		return disjointClassesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_Class() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_ObjectIntersectionOf() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_ObjectUnionOf() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_ObjectComplementOf() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_ObjectOneOf() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_ObjectSomeValuesFrom() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_ObjectAllValuesFrom() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_ObjectHasValue() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_ObjectHasSelf() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_ObjectMinCardinality() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_ObjectMaxCardinality() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_ObjectExactCardinality() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_DataSomeValuesFrom() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_DataAllValuesFrom() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_DataHasValue() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_DataMinCardinality() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_DataMaxCardinality() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_DataExactCardinality() {
        return (EReference)getDisjointClasses().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointDataProperties() {
		if (disjointDataPropertiesEClass == null) {
			disjointDataPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(38);
		}
		return disjointDataPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointDataProperties_DataProperty() {
        return (EReference)getDisjointDataProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointObjectProperties() {
		if (disjointObjectPropertiesEClass == null) {
			disjointObjectPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(39);
		}
		return disjointObjectPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointObjectProperties_ObjectProperty() {
        return (EReference)getDisjointObjectProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointObjectProperties_ObjectInverseOf() {
        return (EReference)getDisjointObjectProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointUnion() {
		if (disjointUnionEClass == null) {
			disjointUnionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(40);
		}
		return disjointUnionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_Class() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_ObjectIntersectionOf() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_ObjectUnionOf() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_ObjectComplementOf() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_ObjectOneOf() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_ObjectSomeValuesFrom() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_ObjectAllValuesFrom() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_ObjectHasValue() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_ObjectHasSelf() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_ObjectMinCardinality() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_ObjectMaxCardinality() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_ObjectExactCardinality() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_DataSomeValuesFrom() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_DataAllValuesFrom() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_DataHasValue() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_DataMinCardinality() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_DataMaxCardinality() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_DataExactCardinality() {
        return (EReference)getDisjointUnion().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentClasses() {
		if (equivalentClassesEClass == null) {
			equivalentClassesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(41);
		}
		return equivalentClassesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_Class() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_ObjectIntersectionOf() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_ObjectUnionOf() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_ObjectComplementOf() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_ObjectOneOf() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_ObjectSomeValuesFrom() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_ObjectAllValuesFrom() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_ObjectHasValue() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_ObjectHasSelf() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_ObjectMinCardinality() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_ObjectMaxCardinality() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_ObjectExactCardinality() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_DataSomeValuesFrom() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_DataAllValuesFrom() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_DataHasValue() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_DataMinCardinality() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_DataMaxCardinality() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_DataExactCardinality() {
        return (EReference)getEquivalentClasses().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentDataProperties() {
		if (equivalentDataPropertiesEClass == null) {
			equivalentDataPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(42);
		}
		return equivalentDataPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentDataProperties_DataProperty() {
        return (EReference)getEquivalentDataProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentObjectProperties() {
		if (equivalentObjectPropertiesEClass == null) {
			equivalentObjectPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(43);
		}
		return equivalentObjectPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentObjectProperties_ObjectProperty() {
        return (EReference)getEquivalentObjectProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentObjectProperties_ObjectInverseOf() {
        return (EReference)getEquivalentObjectProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacetRestriction() {
		if (facetRestrictionEClass == null) {
			facetRestrictionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(44);
		}
		return facetRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetRestriction_Literal() {
        return (EReference)getFacetRestriction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacetRestriction_Base() {
        return (EAttribute)getFacetRestriction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacetRestriction_Facet() {
        return (EAttribute)getFacetRestriction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacetRestriction_Id() {
        return (EAttribute)getFacetRestriction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacetRestriction_Lang() {
        return (EAttribute)getFacetRestriction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacetRestriction_Space() {
        return (EAttribute)getFacetRestriction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalDataProperty() {
		if (functionalDataPropertyEClass == null) {
			functionalDataPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(45);
		}
		return functionalDataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDataProperty_DataProperty() {
        return (EReference)getFunctionalDataProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalObjectProperty() {
		if (functionalObjectPropertyEClass == null) {
			functionalObjectPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(46);
		}
		return functionalObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalObjectProperty_ObjectProperty() {
        return (EReference)getFunctionalObjectProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalObjectProperty_ObjectInverseOf() {
        return (EReference)getFunctionalObjectProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasKey() {
		if (hasKeyEClass == null) {
			hasKeyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(47);
		}
		return hasKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_Class() {
        return (EReference)getHasKey().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_ObjectIntersectionOf() {
        return (EReference)getHasKey().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_ObjectUnionOf() {
        return (EReference)getHasKey().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_ObjectComplementOf() {
        return (EReference)getHasKey().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_ObjectOneOf() {
        return (EReference)getHasKey().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_ObjectSomeValuesFrom() {
        return (EReference)getHasKey().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_ObjectAllValuesFrom() {
        return (EReference)getHasKey().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_ObjectHasValue() {
        return (EReference)getHasKey().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_ObjectHasSelf() {
        return (EReference)getHasKey().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_ObjectMinCardinality() {
        return (EReference)getHasKey().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_ObjectMaxCardinality() {
        return (EReference)getHasKey().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_ObjectExactCardinality() {
        return (EReference)getHasKey().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_DataSomeValuesFrom() {
        return (EReference)getHasKey().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_DataAllValuesFrom() {
        return (EReference)getHasKey().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_DataHasValue() {
        return (EReference)getHasKey().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_DataMinCardinality() {
        return (EReference)getHasKey().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_DataMaxCardinality() {
        return (EReference)getHasKey().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_DataExactCardinality() {
        return (EReference)getHasKey().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_ObjectProperty() {
        return (EReference)getHasKey().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_ObjectInverseOf() {
        return (EReference)getHasKey().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_DataProperty() {
        return (EReference)getHasKey().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		if (importEClass == null) {
			importEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(48);
		}
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_Value() {
        return (EAttribute)getImport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_Base() {
        return (EAttribute)getImport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_Id() {
        return (EAttribute)getImport().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_Lang() {
        return (EAttribute)getImport().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_Space() {
        return (EAttribute)getImport().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividual() {
		if (individualEClass == null) {
			individualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(49);
		}
		return individualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividual_Base() {
        return (EAttribute)getIndividual().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividual_Id() {
        return (EAttribute)getIndividual().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividual_Lang() {
        return (EAttribute)getIndividual().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividual_Space() {
        return (EAttribute)getIndividual().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInverseFunctionalObjectProperty() {
		if (inverseFunctionalObjectPropertyEClass == null) {
			inverseFunctionalObjectPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(50);
		}
		return inverseFunctionalObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInverseFunctionalObjectProperty_ObjectProperty() {
        return (EReference)getInverseFunctionalObjectProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInverseFunctionalObjectProperty_ObjectInverseOf() {
        return (EReference)getInverseFunctionalObjectProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInverseObjectProperties() {
		if (inverseObjectPropertiesEClass == null) {
			inverseObjectPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(51);
		}
		return inverseObjectPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInverseObjectProperties_ObjectProperty() {
        return (EReference)getInverseObjectProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInverseObjectProperties_ObjectInverseOf() {
        return (EReference)getInverseObjectProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRI() {
		if (iriEClass == null) {
			iriEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(52);
		}
		return iriEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIRI_Value() {
        return (EAttribute)getIRI().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIRI_Base() {
        return (EAttribute)getIRI().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIRI_Id() {
        return (EAttribute)getIRI().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIRI_Lang() {
        return (EAttribute)getIRI().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIRI_Space() {
        return (EAttribute)getIRI().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIrreflexiveObjectProperty() {
		if (irreflexiveObjectPropertyEClass == null) {
			irreflexiveObjectPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(53);
		}
		return irreflexiveObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIrreflexiveObjectProperty_ObjectProperty() {
        return (EReference)getIrreflexiveObjectProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIrreflexiveObjectProperty_ObjectInverseOf() {
        return (EReference)getIrreflexiveObjectProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		if (literalEClass == null) {
			literalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(54);
		}
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Value() {
        return (EAttribute)getLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Base() {
        return (EAttribute)getLiteral().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_DatatypeIRI() {
        return (EAttribute)getLiteral().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Id() {
        return (EAttribute)getLiteral().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Lang() {
        return (EAttribute)getLiteral().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Space() {
        return (EAttribute)getLiteral().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedIndividual() {
		if (namedIndividualEClass == null) {
			namedIndividualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(55);
		}
		return namedIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedIndividual_AbbreviatedIRI() {
        return (EAttribute)getNamedIndividual().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedIndividual_IRI() {
        return (EAttribute)getNamedIndividual().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegativeDataPropertyAssertion() {
		if (negativeDataPropertyAssertionEClass == null) {
			negativeDataPropertyAssertionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(57);
		}
		return negativeDataPropertyAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeDataPropertyAssertion_DataProperty() {
        return (EReference)getNegativeDataPropertyAssertion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeDataPropertyAssertion_NamedIndividual() {
        return (EReference)getNegativeDataPropertyAssertion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeDataPropertyAssertion_AnonymousIndividual() {
        return (EReference)getNegativeDataPropertyAssertion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeDataPropertyAssertion_Literal() {
        return (EReference)getNegativeDataPropertyAssertion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegativeObjectPropertyAssertion() {
		if (negativeObjectPropertyAssertionEClass == null) {
			negativeObjectPropertyAssertionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(58);
		}
		return negativeObjectPropertyAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeObjectPropertyAssertion_ObjectProperty() {
        return (EReference)getNegativeObjectPropertyAssertion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeObjectPropertyAssertion_ObjectInverseOf() {
        return (EReference)getNegativeObjectPropertyAssertion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeObjectPropertyAssertion_NamedIndividual() {
        return (EReference)getNegativeObjectPropertyAssertion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeObjectPropertyAssertion_AnonymousIndividual() {
        return (EReference)getNegativeObjectPropertyAssertion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectAllValuesFrom() {
		if (objectAllValuesFromEClass == null) {
			objectAllValuesFromEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(59);
		}
		return objectAllValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_ObjectProperty() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_ObjectInverseOf() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_Class() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_ObjectIntersectionOf() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_ObjectUnionOf() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_ObjectComplementOf() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_ObjectOneOf() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_ObjectSomeValuesFrom() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_ObjectAllValuesFrom() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_ObjectHasValue() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_ObjectHasSelf() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_ObjectMinCardinality() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_ObjectMaxCardinality() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_ObjectExactCardinality() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_DataSomeValuesFrom() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_DataAllValuesFrom() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_DataHasValue() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_DataMinCardinality() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_DataMaxCardinality() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_DataExactCardinality() {
        return (EReference)getObjectAllValuesFrom().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectComplementOf() {
		if (objectComplementOfEClass == null) {
			objectComplementOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(60);
		}
		return objectComplementOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_Class() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_ObjectIntersectionOf() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_ObjectUnionOf() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_ObjectComplementOf() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_ObjectOneOf() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_ObjectSomeValuesFrom() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_ObjectAllValuesFrom() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_ObjectHasValue() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_ObjectHasSelf() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_ObjectMinCardinality() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_ObjectMaxCardinality() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_ObjectExactCardinality() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_DataSomeValuesFrom() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_DataAllValuesFrom() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_DataHasValue() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_DataMinCardinality() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_DataMaxCardinality() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_DataExactCardinality() {
        return (EReference)getObjectComplementOf().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectExactCardinality() {
		if (objectExactCardinalityEClass == null) {
			objectExactCardinalityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(61);
		}
		return objectExactCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_ObjectProperty() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_ObjectInverseOf() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_Class() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_ObjectIntersectionOf() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_ObjectUnionOf() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_ObjectComplementOf() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_ObjectOneOf() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_ObjectSomeValuesFrom() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_ObjectAllValuesFrom() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_ObjectHasValue() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_ObjectHasSelf() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_ObjectMinCardinality() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_ObjectMaxCardinality() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_ObjectExactCardinality() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_DataSomeValuesFrom() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_DataAllValuesFrom() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_DataHasValue() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_DataMinCardinality() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_DataMaxCardinality() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_DataExactCardinality() {
        return (EReference)getObjectExactCardinality().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectExactCardinality_Cardinality() {
        return (EAttribute)getObjectExactCardinality().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectHasSelf() {
		if (objectHasSelfEClass == null) {
			objectHasSelfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(62);
		}
		return objectHasSelfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectHasSelf_ObjectProperty() {
        return (EReference)getObjectHasSelf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectHasSelf_ObjectInverseOf() {
        return (EReference)getObjectHasSelf().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectHasValue() {
		if (objectHasValueEClass == null) {
			objectHasValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(63);
		}
		return objectHasValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectHasValue_ObjectProperty() {
        return (EReference)getObjectHasValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectHasValue_ObjectInverseOf() {
        return (EReference)getObjectHasValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectHasValue_NamedIndividual() {
        return (EReference)getObjectHasValue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectHasValue_AnonymousIndividual() {
        return (EReference)getObjectHasValue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectIntersectionOf() {
		if (objectIntersectionOfEClass == null) {
			objectIntersectionOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(64);
		}
		return objectIntersectionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_Class() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_ObjectIntersectionOf() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_ObjectUnionOf() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_ObjectComplementOf() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_ObjectOneOf() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_ObjectSomeValuesFrom() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_ObjectAllValuesFrom() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_ObjectHasValue() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_ObjectHasSelf() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_ObjectMinCardinality() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_ObjectMaxCardinality() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_ObjectExactCardinality() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_DataSomeValuesFrom() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_DataAllValuesFrom() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_DataHasValue() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_DataMinCardinality() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_DataMaxCardinality() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_DataExactCardinality() {
        return (EReference)getObjectIntersectionOf().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectInverseOf() {
		if (objectInverseOfEClass == null) {
			objectInverseOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(65);
		}
		return objectInverseOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectInverseOf_ObjectProperty() {
        return (EReference)getObjectInverseOf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectMaxCardinality() {
		if (objectMaxCardinalityEClass == null) {
			objectMaxCardinalityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(66);
		}
		return objectMaxCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_ObjectProperty() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_ObjectInverseOf() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_Class() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_ObjectIntersectionOf() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_ObjectUnionOf() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_ObjectComplementOf() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_ObjectOneOf() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_ObjectSomeValuesFrom() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_ObjectAllValuesFrom() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_ObjectHasValue() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_ObjectHasSelf() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_ObjectMinCardinality() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_ObjectMaxCardinality() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_ObjectExactCardinality() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_DataSomeValuesFrom() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_DataAllValuesFrom() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_DataHasValue() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_DataMinCardinality() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_DataMaxCardinality() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_DataExactCardinality() {
        return (EReference)getObjectMaxCardinality().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectMaxCardinality_Cardinality() {
        return (EAttribute)getObjectMaxCardinality().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectMinCardinality() {
		if (objectMinCardinalityEClass == null) {
			objectMinCardinalityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(67);
		}
		return objectMinCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_ObjectProperty() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_ObjectInverseOf() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_Class() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_ObjectIntersectionOf() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_ObjectUnionOf() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_ObjectComplementOf() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_ObjectOneOf() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_ObjectSomeValuesFrom() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_ObjectAllValuesFrom() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_ObjectHasValue() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_ObjectHasSelf() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_ObjectMinCardinality() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_ObjectMaxCardinality() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_ObjectExactCardinality() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_DataSomeValuesFrom() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_DataAllValuesFrom() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_DataHasValue() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_DataMinCardinality() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_DataMaxCardinality() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_DataExactCardinality() {
        return (EReference)getObjectMinCardinality().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectMinCardinality_Cardinality() {
        return (EAttribute)getObjectMinCardinality().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectOneOf() {
		if (objectOneOfEClass == null) {
			objectOneOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(68);
		}
		return objectOneOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectOneOf_NamedIndividual() {
        return (EReference)getObjectOneOf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectOneOf_AnonymousIndividual() {
        return (EReference)getObjectOneOf().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectProperty() {
		if (objectPropertyEClass == null) {
			objectPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(69);
		}
		return objectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectProperty_AbbreviatedIRI() {
        return (EAttribute)getObjectProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectProperty_IRI() {
        return (EAttribute)getObjectProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyAssertion() {
		if (objectPropertyAssertionEClass == null) {
			objectPropertyAssertionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(70);
		}
		return objectPropertyAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyAssertion_ObjectProperty() {
        return (EReference)getObjectPropertyAssertion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyAssertion_ObjectInverseOf() {
        return (EReference)getObjectPropertyAssertion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyAssertion_NamedIndividual() {
        return (EReference)getObjectPropertyAssertion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyAssertion_AnonymousIndividual() {
        return (EReference)getObjectPropertyAssertion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyAxiom() {
		if (objectPropertyAxiomEClass == null) {
			objectPropertyAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(71);
		}
		return objectPropertyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyChain() {
		if (objectPropertyChainEClass == null) {
			objectPropertyChainEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(72);
		}
		return objectPropertyChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyChain_ObjectProperty() {
        return (EReference)getObjectPropertyChain().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyChain_ObjectInverseOf() {
        return (EReference)getObjectPropertyChain().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectPropertyChain_Base() {
        return (EAttribute)getObjectPropertyChain().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectPropertyChain_Id() {
        return (EAttribute)getObjectPropertyChain().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectPropertyChain_Lang() {
        return (EAttribute)getObjectPropertyChain().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectPropertyChain_Space() {
        return (EAttribute)getObjectPropertyChain().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyDomain() {
		if (objectPropertyDomainEClass == null) {
			objectPropertyDomainEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(73);
		}
		return objectPropertyDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_ObjectProperty() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_ObjectInverseOf() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_Class() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_ObjectIntersectionOf() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_ObjectUnionOf() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_ObjectComplementOf() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_ObjectOneOf() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_ObjectSomeValuesFrom() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_ObjectAllValuesFrom() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_ObjectHasValue() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_ObjectHasSelf() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_ObjectMinCardinality() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_ObjectMaxCardinality() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_ObjectExactCardinality() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_DataSomeValuesFrom() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_DataAllValuesFrom() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_DataHasValue() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_DataMinCardinality() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_DataMaxCardinality() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_DataExactCardinality() {
        return (EReference)getObjectPropertyDomain().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyExpression() {
		if (objectPropertyExpressionEClass == null) {
			objectPropertyExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(74);
		}
		return objectPropertyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectPropertyExpression_Base() {
        return (EAttribute)getObjectPropertyExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectPropertyExpression_Id() {
        return (EAttribute)getObjectPropertyExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectPropertyExpression_Lang() {
        return (EAttribute)getObjectPropertyExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectPropertyExpression_Space() {
        return (EAttribute)getObjectPropertyExpression().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyRange() {
		if (objectPropertyRangeEClass == null) {
			objectPropertyRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(75);
		}
		return objectPropertyRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_ObjectProperty() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_ObjectInverseOf() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_Class() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_ObjectIntersectionOf() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_ObjectUnionOf() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_ObjectComplementOf() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_ObjectOneOf() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_ObjectSomeValuesFrom() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_ObjectAllValuesFrom() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_ObjectHasValue() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_ObjectHasSelf() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_ObjectMinCardinality() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_ObjectMaxCardinality() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_ObjectExactCardinality() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_DataSomeValuesFrom() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_DataAllValuesFrom() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_DataHasValue() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_DataMinCardinality() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_DataMaxCardinality() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_DataExactCardinality() {
        return (EReference)getObjectPropertyRange().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectSomeValuesFrom() {
		if (objectSomeValuesFromEClass == null) {
			objectSomeValuesFromEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(76);
		}
		return objectSomeValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_ObjectProperty() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_ObjectInverseOf() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_Class() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_ObjectIntersectionOf() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_ObjectUnionOf() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_ObjectComplementOf() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_ObjectOneOf() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_ObjectSomeValuesFrom() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_ObjectAllValuesFrom() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_ObjectHasValue() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_ObjectHasSelf() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_ObjectMinCardinality() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_ObjectMaxCardinality() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_ObjectExactCardinality() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_DataSomeValuesFrom() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_DataAllValuesFrom() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_DataHasValue() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_DataMinCardinality() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_DataMaxCardinality() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_DataExactCardinality() {
        return (EReference)getObjectSomeValuesFrom().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectUnionOf() {
		if (objectUnionOfEClass == null) {
			objectUnionOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(77);
		}
		return objectUnionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_Class() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_ObjectIntersectionOf() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_ObjectUnionOf() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_ObjectComplementOf() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_ObjectOneOf() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_ObjectSomeValuesFrom() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_ObjectAllValuesFrom() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_ObjectHasValue() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_ObjectHasSelf() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_ObjectMinCardinality() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_ObjectMaxCardinality() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_ObjectExactCardinality() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_DataSomeValuesFrom() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_DataAllValuesFrom() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_DataHasValue() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_DataMinCardinality() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_DataMaxCardinality() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_DataExactCardinality() {
        return (EReference)getObjectUnionOf().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOntology() {
		if (ontologyEClass == null) {
			ontologyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(78);
		}
		return ontologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_Prefix() {
        return (EReference)getOntology().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_Import() {
        return (EReference)getOntology().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_Annotation() {
        return (EReference)getOntology().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_Declaration() {
        return (EReference)getOntology().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_SubClassOf() {
        return (EReference)getOntology().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_EquivalentClasses() {
        return (EReference)getOntology().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_DisjointClasses() {
        return (EReference)getOntology().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_DisjointUnion() {
        return (EReference)getOntology().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_SubObjectPropertyOf() {
        return (EReference)getOntology().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_EquivalentObjectProperties() {
        return (EReference)getOntology().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_DisjointObjectProperties() {
        return (EReference)getOntology().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_InverseObjectProperties() {
        return (EReference)getOntology().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_ObjectPropertyDomain() {
        return (EReference)getOntology().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_ObjectPropertyRange() {
        return (EReference)getOntology().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_FunctionalObjectProperty() {
        return (EReference)getOntology().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_InverseFunctionalObjectProperty() {
        return (EReference)getOntology().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_ReflexiveObjectProperty() {
        return (EReference)getOntology().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_IrreflexiveObjectProperty() {
        return (EReference)getOntology().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_SymmetricObjectProperty() {
        return (EReference)getOntology().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_AsymmetricObjectProperty() {
        return (EReference)getOntology().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_TransitiveObjectProperty() {
        return (EReference)getOntology().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_SubDataPropertyOf() {
        return (EReference)getOntology().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_EquivalentDataProperties() {
        return (EReference)getOntology().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_DisjointDataProperties() {
        return (EReference)getOntology().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_DataPropertyDomain() {
        return (EReference)getOntology().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_DataPropertyRange() {
        return (EReference)getOntology().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_FunctionalDataProperty() {
        return (EReference)getOntology().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_DatatypeDefinition() {
        return (EReference)getOntology().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_HasKey() {
        return (EReference)getOntology().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_SameIndividual() {
        return (EReference)getOntology().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_DifferentIndividuals() {
        return (EReference)getOntology().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_ClassAssertion() {
        return (EReference)getOntology().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_ObjectPropertyAssertion() {
        return (EReference)getOntology().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_NegativeObjectPropertyAssertion() {
        return (EReference)getOntology().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_DataPropertyAssertion() {
        return (EReference)getOntology().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_NegativeDataPropertyAssertion() {
        return (EReference)getOntology().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_AnnotationAssertion() {
        return (EReference)getOntology().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_SubAnnotationPropertyOf() {
        return (EReference)getOntology().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_AnnotationPropertyDomain() {
        return (EReference)getOntology().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_AnnotationPropertyRange() {
        return (EReference)getOntology().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOntology_Base() {
        return (EAttribute)getOntology().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOntology_Id() {
        return (EAttribute)getOntology().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOntology_Lang() {
        return (EAttribute)getOntology().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOntology_OntologyIRI() {
        return (EAttribute)getOntology().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOntology_Space() {
        return (EAttribute)getOntology().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOntology_VersionIRI() {
        return (EAttribute)getOntology().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrefix() {
		if (prefixEClass == null) {
			prefixEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(79);
		}
		return prefixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrefix_IRI() {
        return (EAttribute)getPrefix().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrefix_Name() {
        return (EAttribute)getPrefix().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReflexiveObjectProperty() {
		if (reflexiveObjectPropertyEClass == null) {
			reflexiveObjectPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(80);
		}
		return reflexiveObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReflexiveObjectProperty_ObjectProperty() {
        return (EReference)getReflexiveObjectProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReflexiveObjectProperty_ObjectInverseOf() {
        return (EReference)getReflexiveObjectProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSameIndividual() {
		if (sameIndividualEClass == null) {
			sameIndividualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(81);
		}
		return sameIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSameIndividual_NamedIndividual() {
        return (EReference)getSameIndividual().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSameIndividual_AnonymousIndividual() {
        return (EReference)getSameIndividual().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubAnnotationPropertyOf() {
		if (subAnnotationPropertyOfEClass == null) {
			subAnnotationPropertyOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(82);
		}
		return subAnnotationPropertyOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubAnnotationPropertyOf_AnnotationProperty() {
        return (EReference)getSubAnnotationPropertyOf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubClassOf() {
		if (subClassOfEClass == null) {
			subClassOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(83);
		}
		return subClassOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_Class() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_ObjectIntersectionOf() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_ObjectUnionOf() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_ObjectComplementOf() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_ObjectOneOf() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_ObjectSomeValuesFrom() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_ObjectAllValuesFrom() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_ObjectHasValue() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_ObjectHasSelf() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_ObjectMinCardinality() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_ObjectMaxCardinality() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_ObjectExactCardinality() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_DataSomeValuesFrom() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_DataAllValuesFrom() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_DataHasValue() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_DataMinCardinality() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_DataMaxCardinality() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_DataExactCardinality() {
        return (EReference)getSubClassOf().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubDataPropertyOf() {
		if (subDataPropertyOfEClass == null) {
			subDataPropertyOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(84);
		}
		return subDataPropertyOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubDataPropertyOf_DataProperty() {
        return (EReference)getSubDataPropertyOf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubObjectPropertyOf() {
		if (subObjectPropertyOfEClass == null) {
			subObjectPropertyOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(85);
		}
		return subObjectPropertyOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubObjectPropertyOf_ObjectProperty() {
        return (EReference)getSubObjectPropertyOf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubObjectPropertyOf_ObjectInverseOf() {
        return (EReference)getSubObjectPropertyOf().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubObjectPropertyOf_ObjectPropertyChain() {
        return (EReference)getSubObjectPropertyOf().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymmetricObjectProperty() {
		if (symmetricObjectPropertyEClass == null) {
			symmetricObjectPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(86);
		}
		return symmetricObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymmetricObjectProperty_ObjectProperty() {
        return (EReference)getSymmetricObjectProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymmetricObjectProperty_ObjectInverseOf() {
        return (EReference)getSymmetricObjectProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitiveObjectProperty() {
		if (transitiveObjectPropertyEClass == null) {
			transitiveObjectPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(87);
		}
		return transitiveObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitiveObjectProperty_ObjectProperty() {
        return (EReference)getTransitiveObjectProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitiveObjectProperty_ObjectInverseOf() {
        return (EReference)getTransitiveObjectProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWLBase() {
		if (owlBaseEClass == null) {
			owlBaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(88);
		}
		return owlBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameType() {
		if (nameTypeEDataType == null) {
			nameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI).getEClassifiers().get(56);
		}
		return nameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLModelFactory getOWLModelFactory() {
		return (OWLModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.emftrace.metamodel.OWLModel." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //OWLModelPackageImpl
