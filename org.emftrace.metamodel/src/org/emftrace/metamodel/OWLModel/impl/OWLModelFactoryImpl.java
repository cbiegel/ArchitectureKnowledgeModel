/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftrace.metamodel.OWLModel.AbbreviatedIRI;
import org.emftrace.metamodel.OWLModel.Annotation;
import org.emftrace.metamodel.OWLModel.AnnotationAssertion;
import org.emftrace.metamodel.OWLModel.AnnotationProperty;
import org.emftrace.metamodel.OWLModel.AnnotationPropertyDomain;
import org.emftrace.metamodel.OWLModel.AnnotationPropertyRange;
import org.emftrace.metamodel.OWLModel.AnonymousIndividual;
import org.emftrace.metamodel.OWLModel.AsymmetricObjectProperty;
import org.emftrace.metamodel.OWLModel.ClassAssertion;
import org.emftrace.metamodel.OWLModel.DataAllValuesFrom;
import org.emftrace.metamodel.OWLModel.DataComplementOf;
import org.emftrace.metamodel.OWLModel.DataExactCardinality;
import org.emftrace.metamodel.OWLModel.DataHasValue;
import org.emftrace.metamodel.OWLModel.DataIntersectionOf;
import org.emftrace.metamodel.OWLModel.DataMaxCardinality;
import org.emftrace.metamodel.OWLModel.DataMinCardinality;
import org.emftrace.metamodel.OWLModel.DataOneOf;
import org.emftrace.metamodel.OWLModel.DataProperty;
import org.emftrace.metamodel.OWLModel.DataPropertyAssertion;
import org.emftrace.metamodel.OWLModel.DataPropertyDomain;
import org.emftrace.metamodel.OWLModel.DataPropertyRange;
import org.emftrace.metamodel.OWLModel.DataSomeValuesFrom;
import org.emftrace.metamodel.OWLModel.DataUnionOf;
import org.emftrace.metamodel.OWLModel.Datatype;
import org.emftrace.metamodel.OWLModel.DatatypeDefinition;
import org.emftrace.metamodel.OWLModel.DatatypeRestriction;
import org.emftrace.metamodel.OWLModel.Declaration;
import org.emftrace.metamodel.OWLModel.DifferentIndividuals;
import org.emftrace.metamodel.OWLModel.DisjointClasses;
import org.emftrace.metamodel.OWLModel.DisjointDataProperties;
import org.emftrace.metamodel.OWLModel.DisjointObjectProperties;
import org.emftrace.metamodel.OWLModel.DisjointUnion;
import org.emftrace.metamodel.OWLModel.EquivalentClasses;
import org.emftrace.metamodel.OWLModel.EquivalentDataProperties;
import org.emftrace.metamodel.OWLModel.EquivalentObjectProperties;
import org.emftrace.metamodel.OWLModel.FacetRestriction;
import org.emftrace.metamodel.OWLModel.FunctionalDataProperty;
import org.emftrace.metamodel.OWLModel.FunctionalObjectProperty;
import org.emftrace.metamodel.OWLModel.HasKey;
import org.emftrace.metamodel.OWLModel.IRI;
import org.emftrace.metamodel.OWLModel.Import;
import org.emftrace.metamodel.OWLModel.InverseFunctionalObjectProperty;
import org.emftrace.metamodel.OWLModel.InverseObjectProperties;
import org.emftrace.metamodel.OWLModel.IrreflexiveObjectProperty;
import org.emftrace.metamodel.OWLModel.Literal;
import org.emftrace.metamodel.OWLModel.NamedIndividual;
import org.emftrace.metamodel.OWLModel.NegativeDataPropertyAssertion;
import org.emftrace.metamodel.OWLModel.NegativeObjectPropertyAssertion;
import org.emftrace.metamodel.OWLModel.OWLModelFactory;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;
import org.emftrace.metamodel.OWLModel.ObjectAllValuesFrom;
import org.emftrace.metamodel.OWLModel.ObjectComplementOf;
import org.emftrace.metamodel.OWLModel.ObjectExactCardinality;
import org.emftrace.metamodel.OWLModel.ObjectHasSelf;
import org.emftrace.metamodel.OWLModel.ObjectHasValue;
import org.emftrace.metamodel.OWLModel.ObjectIntersectionOf;
import org.emftrace.metamodel.OWLModel.ObjectInverseOf;
import org.emftrace.metamodel.OWLModel.ObjectMaxCardinality;
import org.emftrace.metamodel.OWLModel.ObjectMinCardinality;
import org.emftrace.metamodel.OWLModel.ObjectOneOf;
import org.emftrace.metamodel.OWLModel.ObjectProperty;
import org.emftrace.metamodel.OWLModel.ObjectPropertyAssertion;
import org.emftrace.metamodel.OWLModel.ObjectPropertyChain;
import org.emftrace.metamodel.OWLModel.ObjectPropertyDomain;
import org.emftrace.metamodel.OWLModel.ObjectPropertyRange;
import org.emftrace.metamodel.OWLModel.ObjectSomeValuesFrom;
import org.emftrace.metamodel.OWLModel.ObjectUnionOf;
import org.emftrace.metamodel.OWLModel.Ontology;
import org.emftrace.metamodel.OWLModel.Prefix;
import org.emftrace.metamodel.OWLModel.ReflexiveObjectProperty;
import org.emftrace.metamodel.OWLModel.SameIndividual;
import org.emftrace.metamodel.OWLModel.SubAnnotationPropertyOf;
import org.emftrace.metamodel.OWLModel.SubClassOf;
import org.emftrace.metamodel.OWLModel.SubDataPropertyOf;
import org.emftrace.metamodel.OWLModel.SubObjectPropertyOf;
import org.emftrace.metamodel.OWLModel.SymmetricObjectProperty;
import org.emftrace.metamodel.OWLModel.TransitiveObjectProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OWLModelFactoryImpl extends EFactoryImpl implements OWLModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OWLModelFactory init() {
		try {
			OWLModelFactory theOWLModelFactory = (OWLModelFactory)EPackage.Registry.INSTANCE.getEFactory(OWLModelPackage.eNS_URI);
			if (theOWLModelFactory != null) {
				return theOWLModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OWLModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OWLModelPackage.ABBREVIATED_IRI: return createAbbreviatedIRI();
			case OWLModelPackage.ANNOTATION: return createAnnotation();
			case OWLModelPackage.ANNOTATION_ASSERTION: return createAnnotationAssertion();
			case OWLModelPackage.ANNOTATION_PROPERTY: return createAnnotationProperty();
			case OWLModelPackage.ANNOTATION_PROPERTY_DOMAIN: return createAnnotationPropertyDomain();
			case OWLModelPackage.ANNOTATION_PROPERTY_RANGE: return createAnnotationPropertyRange();
			case OWLModelPackage.ANONYMOUS_INDIVIDUAL: return createAnonymousIndividual();
			case OWLModelPackage.ASYMMETRIC_OBJECT_PROPERTY: return createAsymmetricObjectProperty();
			case OWLModelPackage.CLASS: return createClass();
			case OWLModelPackage.CLASS_ASSERTION: return createClassAssertion();
			case OWLModelPackage.DATA_ALL_VALUES_FROM: return createDataAllValuesFrom();
			case OWLModelPackage.DATA_COMPLEMENT_OF: return createDataComplementOf();
			case OWLModelPackage.DATA_EXACT_CARDINALITY: return createDataExactCardinality();
			case OWLModelPackage.DATA_HAS_VALUE: return createDataHasValue();
			case OWLModelPackage.DATA_INTERSECTION_OF: return createDataIntersectionOf();
			case OWLModelPackage.DATA_MAX_CARDINALITY: return createDataMaxCardinality();
			case OWLModelPackage.DATA_MIN_CARDINALITY: return createDataMinCardinality();
			case OWLModelPackage.DATA_ONE_OF: return createDataOneOf();
			case OWLModelPackage.DATA_PROPERTY: return createDataProperty();
			case OWLModelPackage.DATA_PROPERTY_ASSERTION: return createDataPropertyAssertion();
			case OWLModelPackage.DATA_PROPERTY_DOMAIN: return createDataPropertyDomain();
			case OWLModelPackage.DATA_PROPERTY_RANGE: return createDataPropertyRange();
			case OWLModelPackage.DATA_SOME_VALUES_FROM: return createDataSomeValuesFrom();
			case OWLModelPackage.DATATYPE: return createDatatype();
			case OWLModelPackage.DATATYPE_DEFINITION: return createDatatypeDefinition();
			case OWLModelPackage.DATATYPE_RESTRICTION: return createDatatypeRestriction();
			case OWLModelPackage.DATA_UNION_OF: return createDataUnionOf();
			case OWLModelPackage.DECLARATION: return createDeclaration();
			case OWLModelPackage.DIFFERENT_INDIVIDUALS: return createDifferentIndividuals();
			case OWLModelPackage.DISJOINT_CLASSES: return createDisjointClasses();
			case OWLModelPackage.DISJOINT_DATA_PROPERTIES: return createDisjointDataProperties();
			case OWLModelPackage.DISJOINT_OBJECT_PROPERTIES: return createDisjointObjectProperties();
			case OWLModelPackage.DISJOINT_UNION: return createDisjointUnion();
			case OWLModelPackage.EQUIVALENT_CLASSES: return createEquivalentClasses();
			case OWLModelPackage.EQUIVALENT_DATA_PROPERTIES: return createEquivalentDataProperties();
			case OWLModelPackage.EQUIVALENT_OBJECT_PROPERTIES: return createEquivalentObjectProperties();
			case OWLModelPackage.FACET_RESTRICTION: return createFacetRestriction();
			case OWLModelPackage.FUNCTIONAL_DATA_PROPERTY: return createFunctionalDataProperty();
			case OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY: return createFunctionalObjectProperty();
			case OWLModelPackage.HAS_KEY: return createHasKey();
			case OWLModelPackage.IMPORT: return createImport();
			case OWLModelPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY: return createInverseFunctionalObjectProperty();
			case OWLModelPackage.INVERSE_OBJECT_PROPERTIES: return createInverseObjectProperties();
			case OWLModelPackage.IRI: return createIRI();
			case OWLModelPackage.IRREFLEXIVE_OBJECT_PROPERTY: return createIrreflexiveObjectProperty();
			case OWLModelPackage.LITERAL: return createLiteral();
			case OWLModelPackage.NAMED_INDIVIDUAL: return createNamedIndividual();
			case OWLModelPackage.NEGATIVE_DATA_PROPERTY_ASSERTION: return createNegativeDataPropertyAssertion();
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION: return createNegativeObjectPropertyAssertion();
			case OWLModelPackage.OBJECT_ALL_VALUES_FROM: return createObjectAllValuesFrom();
			case OWLModelPackage.OBJECT_COMPLEMENT_OF: return createObjectComplementOf();
			case OWLModelPackage.OBJECT_EXACT_CARDINALITY: return createObjectExactCardinality();
			case OWLModelPackage.OBJECT_HAS_SELF: return createObjectHasSelf();
			case OWLModelPackage.OBJECT_HAS_VALUE: return createObjectHasValue();
			case OWLModelPackage.OBJECT_INTERSECTION_OF: return createObjectIntersectionOf();
			case OWLModelPackage.OBJECT_INVERSE_OF: return createObjectInverseOf();
			case OWLModelPackage.OBJECT_MAX_CARDINALITY: return createObjectMaxCardinality();
			case OWLModelPackage.OBJECT_MIN_CARDINALITY: return createObjectMinCardinality();
			case OWLModelPackage.OBJECT_ONE_OF: return createObjectOneOf();
			case OWLModelPackage.OBJECT_PROPERTY: return createObjectProperty();
			case OWLModelPackage.OBJECT_PROPERTY_ASSERTION: return createObjectPropertyAssertion();
			case OWLModelPackage.OBJECT_PROPERTY_CHAIN: return createObjectPropertyChain();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN: return createObjectPropertyDomain();
			case OWLModelPackage.OBJECT_PROPERTY_RANGE: return createObjectPropertyRange();
			case OWLModelPackage.OBJECT_SOME_VALUES_FROM: return createObjectSomeValuesFrom();
			case OWLModelPackage.OBJECT_UNION_OF: return createObjectUnionOf();
			case OWLModelPackage.ONTOLOGY: return createOntology();
			case OWLModelPackage.PREFIX: return createPrefix();
			case OWLModelPackage.REFLEXIVE_OBJECT_PROPERTY: return createReflexiveObjectProperty();
			case OWLModelPackage.SAME_INDIVIDUAL: return createSameIndividual();
			case OWLModelPackage.SUB_ANNOTATION_PROPERTY_OF: return createSubAnnotationPropertyOf();
			case OWLModelPackage.SUB_CLASS_OF: return createSubClassOf();
			case OWLModelPackage.SUB_DATA_PROPERTY_OF: return createSubDataPropertyOf();
			case OWLModelPackage.SUB_OBJECT_PROPERTY_OF: return createSubObjectPropertyOf();
			case OWLModelPackage.SYMMETRIC_OBJECT_PROPERTY: return createSymmetricObjectProperty();
			case OWLModelPackage.TRANSITIVE_OBJECT_PROPERTY: return createTransitiveObjectProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OWLModelPackage.NAME_TYPE:
				return createNameTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OWLModelPackage.NAME_TYPE:
				return convertNameTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbbreviatedIRI createAbbreviatedIRI() {
		AbbreviatedIRIImpl abbreviatedIRI = new AbbreviatedIRIImpl();
		return abbreviatedIRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationAssertion createAnnotationAssertion() {
		AnnotationAssertionImpl annotationAssertion = new AnnotationAssertionImpl();
		return annotationAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationProperty createAnnotationProperty() {
		AnnotationPropertyImpl annotationProperty = new AnnotationPropertyImpl();
		return annotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationPropertyDomain createAnnotationPropertyDomain() {
		AnnotationPropertyDomainImpl annotationPropertyDomain = new AnnotationPropertyDomainImpl();
		return annotationPropertyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationPropertyRange createAnnotationPropertyRange() {
		AnnotationPropertyRangeImpl annotationPropertyRange = new AnnotationPropertyRangeImpl();
		return annotationPropertyRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousIndividual createAnonymousIndividual() {
		AnonymousIndividualImpl anonymousIndividual = new AnonymousIndividualImpl();
		return anonymousIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsymmetricObjectProperty createAsymmetricObjectProperty() {
		AsymmetricObjectPropertyImpl asymmetricObjectProperty = new AsymmetricObjectPropertyImpl();
		return asymmetricObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.emftrace.metamodel.OWLModel.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAssertion createClassAssertion() {
		ClassAssertionImpl classAssertion = new ClassAssertionImpl();
		return classAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAllValuesFrom createDataAllValuesFrom() {
		DataAllValuesFromImpl dataAllValuesFrom = new DataAllValuesFromImpl();
		return dataAllValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataComplementOf createDataComplementOf() {
		DataComplementOfImpl dataComplementOf = new DataComplementOfImpl();
		return dataComplementOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExactCardinality createDataExactCardinality() {
		DataExactCardinalityImpl dataExactCardinality = new DataExactCardinalityImpl();
		return dataExactCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataHasValue createDataHasValue() {
		DataHasValueImpl dataHasValue = new DataHasValueImpl();
		return dataHasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataIntersectionOf createDataIntersectionOf() {
		DataIntersectionOfImpl dataIntersectionOf = new DataIntersectionOfImpl();
		return dataIntersectionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMaxCardinality createDataMaxCardinality() {
		DataMaxCardinalityImpl dataMaxCardinality = new DataMaxCardinalityImpl();
		return dataMaxCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMinCardinality createDataMinCardinality() {
		DataMinCardinalityImpl dataMinCardinality = new DataMinCardinalityImpl();
		return dataMinCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOneOf createDataOneOf() {
		DataOneOfImpl dataOneOf = new DataOneOfImpl();
		return dataOneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProperty createDataProperty() {
		DataPropertyImpl dataProperty = new DataPropertyImpl();
		return dataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyAssertion createDataPropertyAssertion() {
		DataPropertyAssertionImpl dataPropertyAssertion = new DataPropertyAssertionImpl();
		return dataPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyDomain createDataPropertyDomain() {
		DataPropertyDomainImpl dataPropertyDomain = new DataPropertyDomainImpl();
		return dataPropertyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyRange createDataPropertyRange() {
		DataPropertyRangeImpl dataPropertyRange = new DataPropertyRangeImpl();
		return dataPropertyRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSomeValuesFrom createDataSomeValuesFrom() {
		DataSomeValuesFromImpl dataSomeValuesFrom = new DataSomeValuesFromImpl();
		return dataSomeValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype createDatatype() {
		DatatypeImpl datatype = new DatatypeImpl();
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinition createDatatypeDefinition() {
		DatatypeDefinitionImpl datatypeDefinition = new DatatypeDefinitionImpl();
		return datatypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeRestriction createDatatypeRestriction() {
		DatatypeRestrictionImpl datatypeRestriction = new DatatypeRestrictionImpl();
		return datatypeRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataUnionOf createDataUnionOf() {
		DataUnionOfImpl dataUnionOf = new DataUnionOfImpl();
		return dataUnionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declaration createDeclaration() {
		DeclarationImpl declaration = new DeclarationImpl();
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifferentIndividuals createDifferentIndividuals() {
		DifferentIndividualsImpl differentIndividuals = new DifferentIndividualsImpl();
		return differentIndividuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointClasses createDisjointClasses() {
		DisjointClassesImpl disjointClasses = new DisjointClassesImpl();
		return disjointClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointDataProperties createDisjointDataProperties() {
		DisjointDataPropertiesImpl disjointDataProperties = new DisjointDataPropertiesImpl();
		return disjointDataProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointObjectProperties createDisjointObjectProperties() {
		DisjointObjectPropertiesImpl disjointObjectProperties = new DisjointObjectPropertiesImpl();
		return disjointObjectProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointUnion createDisjointUnion() {
		DisjointUnionImpl disjointUnion = new DisjointUnionImpl();
		return disjointUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentClasses createEquivalentClasses() {
		EquivalentClassesImpl equivalentClasses = new EquivalentClassesImpl();
		return equivalentClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentDataProperties createEquivalentDataProperties() {
		EquivalentDataPropertiesImpl equivalentDataProperties = new EquivalentDataPropertiesImpl();
		return equivalentDataProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentObjectProperties createEquivalentObjectProperties() {
		EquivalentObjectPropertiesImpl equivalentObjectProperties = new EquivalentObjectPropertiesImpl();
		return equivalentObjectProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetRestriction createFacetRestriction() {
		FacetRestrictionImpl facetRestriction = new FacetRestrictionImpl();
		return facetRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDataProperty createFunctionalDataProperty() {
		FunctionalDataPropertyImpl functionalDataProperty = new FunctionalDataPropertyImpl();
		return functionalDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalObjectProperty createFunctionalObjectProperty() {
		FunctionalObjectPropertyImpl functionalObjectProperty = new FunctionalObjectPropertyImpl();
		return functionalObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasKey createHasKey() {
		HasKeyImpl hasKey = new HasKeyImpl();
		return hasKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InverseFunctionalObjectProperty createInverseFunctionalObjectProperty() {
		InverseFunctionalObjectPropertyImpl inverseFunctionalObjectProperty = new InverseFunctionalObjectPropertyImpl();
		return inverseFunctionalObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InverseObjectProperties createInverseObjectProperties() {
		InverseObjectPropertiesImpl inverseObjectProperties = new InverseObjectPropertiesImpl();
		return inverseObjectProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRI createIRI() {
		IRIImpl iri = new IRIImpl();
		return iri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrreflexiveObjectProperty createIrreflexiveObjectProperty() {
		IrreflexiveObjectPropertyImpl irreflexiveObjectProperty = new IrreflexiveObjectPropertyImpl();
		return irreflexiveObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedIndividual createNamedIndividual() {
		NamedIndividualImpl namedIndividual = new NamedIndividualImpl();
		return namedIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeDataPropertyAssertion createNegativeDataPropertyAssertion() {
		NegativeDataPropertyAssertionImpl negativeDataPropertyAssertion = new NegativeDataPropertyAssertionImpl();
		return negativeDataPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeObjectPropertyAssertion createNegativeObjectPropertyAssertion() {
		NegativeObjectPropertyAssertionImpl negativeObjectPropertyAssertion = new NegativeObjectPropertyAssertionImpl();
		return negativeObjectPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectAllValuesFrom createObjectAllValuesFrom() {
		ObjectAllValuesFromImpl objectAllValuesFrom = new ObjectAllValuesFromImpl();
		return objectAllValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectComplementOf createObjectComplementOf() {
		ObjectComplementOfImpl objectComplementOf = new ObjectComplementOfImpl();
		return objectComplementOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectExactCardinality createObjectExactCardinality() {
		ObjectExactCardinalityImpl objectExactCardinality = new ObjectExactCardinalityImpl();
		return objectExactCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectHasSelf createObjectHasSelf() {
		ObjectHasSelfImpl objectHasSelf = new ObjectHasSelfImpl();
		return objectHasSelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectHasValue createObjectHasValue() {
		ObjectHasValueImpl objectHasValue = new ObjectHasValueImpl();
		return objectHasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectIntersectionOf createObjectIntersectionOf() {
		ObjectIntersectionOfImpl objectIntersectionOf = new ObjectIntersectionOfImpl();
		return objectIntersectionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectInverseOf createObjectInverseOf() {
		ObjectInverseOfImpl objectInverseOf = new ObjectInverseOfImpl();
		return objectInverseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMaxCardinality createObjectMaxCardinality() {
		ObjectMaxCardinalityImpl objectMaxCardinality = new ObjectMaxCardinalityImpl();
		return objectMaxCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMinCardinality createObjectMinCardinality() {
		ObjectMinCardinalityImpl objectMinCardinality = new ObjectMinCardinalityImpl();
		return objectMinCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOneOf createObjectOneOf() {
		ObjectOneOfImpl objectOneOf = new ObjectOneOfImpl();
		return objectOneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectProperty createObjectProperty() {
		ObjectPropertyImpl objectProperty = new ObjectPropertyImpl();
		return objectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyAssertion createObjectPropertyAssertion() {
		ObjectPropertyAssertionImpl objectPropertyAssertion = new ObjectPropertyAssertionImpl();
		return objectPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyChain createObjectPropertyChain() {
		ObjectPropertyChainImpl objectPropertyChain = new ObjectPropertyChainImpl();
		return objectPropertyChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyDomain createObjectPropertyDomain() {
		ObjectPropertyDomainImpl objectPropertyDomain = new ObjectPropertyDomainImpl();
		return objectPropertyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyRange createObjectPropertyRange() {
		ObjectPropertyRangeImpl objectPropertyRange = new ObjectPropertyRangeImpl();
		return objectPropertyRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSomeValuesFrom createObjectSomeValuesFrom() {
		ObjectSomeValuesFromImpl objectSomeValuesFrom = new ObjectSomeValuesFromImpl();
		return objectSomeValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectUnionOf createObjectUnionOf() {
		ObjectUnionOfImpl objectUnionOf = new ObjectUnionOfImpl();
		return objectUnionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology createOntology() {
		OntologyImpl ontology = new OntologyImpl();
		return ontology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prefix createPrefix() {
		PrefixImpl prefix = new PrefixImpl();
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflexiveObjectProperty createReflexiveObjectProperty() {
		ReflexiveObjectPropertyImpl reflexiveObjectProperty = new ReflexiveObjectPropertyImpl();
		return reflexiveObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SameIndividual createSameIndividual() {
		SameIndividualImpl sameIndividual = new SameIndividualImpl();
		return sameIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubAnnotationPropertyOf createSubAnnotationPropertyOf() {
		SubAnnotationPropertyOfImpl subAnnotationPropertyOf = new SubAnnotationPropertyOfImpl();
		return subAnnotationPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubClassOf createSubClassOf() {
		SubClassOfImpl subClassOf = new SubClassOfImpl();
		return subClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubDataPropertyOf createSubDataPropertyOf() {
		SubDataPropertyOfImpl subDataPropertyOf = new SubDataPropertyOfImpl();
		return subDataPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubObjectPropertyOf createSubObjectPropertyOf() {
		SubObjectPropertyOfImpl subObjectPropertyOf = new SubObjectPropertyOfImpl();
		return subObjectPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricObjectProperty createSymmetricObjectProperty() {
		SymmetricObjectPropertyImpl symmetricObjectProperty = new SymmetricObjectPropertyImpl();
		return symmetricObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitiveObjectProperty createTransitiveObjectProperty() {
		TransitiveObjectPropertyImpl transitiveObjectProperty = new TransitiveObjectPropertyImpl();
		return transitiveObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLModelPackage getOWLModelPackage() {
		return (OWLModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OWLModelPackage getPackage() {
		return OWLModelPackage.eINSTANCE;
	}

} //OWLModelFactoryImpl
