/**
 */
package org.emftrace.metamodel.OWLModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emftrace.metamodel.OWLModel.AbbreviatedIRI;
import org.emftrace.metamodel.OWLModel.Annotation;
import org.emftrace.metamodel.OWLModel.AnnotationAssertion;
import org.emftrace.metamodel.OWLModel.AnnotationAxiom;
import org.emftrace.metamodel.OWLModel.AnnotationProperty;
import org.emftrace.metamodel.OWLModel.AnnotationPropertyDomain;
import org.emftrace.metamodel.OWLModel.AnnotationPropertyRange;
import org.emftrace.metamodel.OWLModel.AnonymousIndividual;
import org.emftrace.metamodel.OWLModel.Assertion;
import org.emftrace.metamodel.OWLModel.AsymmetricObjectProperty;
import org.emftrace.metamodel.OWLModel.Axiom;
import org.emftrace.metamodel.OWLModel.ClassAssertion;
import org.emftrace.metamodel.OWLModel.ClassAxiom;
import org.emftrace.metamodel.OWLModel.ClassExpression;
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
import org.emftrace.metamodel.OWLModel.DataPropertyAxiom;
import org.emftrace.metamodel.OWLModel.DataPropertyDomain;
import org.emftrace.metamodel.OWLModel.DataPropertyExpression;
import org.emftrace.metamodel.OWLModel.DataPropertyRange;
import org.emftrace.metamodel.OWLModel.DataRange;
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
import org.emftrace.metamodel.OWLModel.Individual;
import org.emftrace.metamodel.OWLModel.InverseFunctionalObjectProperty;
import org.emftrace.metamodel.OWLModel.InverseObjectProperties;
import org.emftrace.metamodel.OWLModel.IrreflexiveObjectProperty;
import org.emftrace.metamodel.OWLModel.Literal;
import org.emftrace.metamodel.OWLModel.NamedIndividual;
import org.emftrace.metamodel.OWLModel.NegativeDataPropertyAssertion;
import org.emftrace.metamodel.OWLModel.NegativeObjectPropertyAssertion;
import org.emftrace.metamodel.OWLModel.OWLBase;
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
import org.emftrace.metamodel.OWLModel.ObjectPropertyAxiom;
import org.emftrace.metamodel.OWLModel.ObjectPropertyChain;
import org.emftrace.metamodel.OWLModel.ObjectPropertyDomain;
import org.emftrace.metamodel.OWLModel.ObjectPropertyExpression;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage
 * @generated
 */
public class OWLModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OWLModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OWLModelPackage.eINSTANCE;
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
	protected OWLModelSwitch<Adapter> modelSwitch =
		new OWLModelSwitch<Adapter>() {
			@Override
			public Adapter caseAbbreviatedIRI(AbbreviatedIRI object) {
				return createAbbreviatedIRIAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAnnotationAssertion(AnnotationAssertion object) {
				return createAnnotationAssertionAdapter();
			}
			@Override
			public Adapter caseAnnotationAxiom(AnnotationAxiom object) {
				return createAnnotationAxiomAdapter();
			}
			@Override
			public Adapter caseAnnotationProperty(AnnotationProperty object) {
				return createAnnotationPropertyAdapter();
			}
			@Override
			public Adapter caseAnnotationPropertyDomain(AnnotationPropertyDomain object) {
				return createAnnotationPropertyDomainAdapter();
			}
			@Override
			public Adapter caseAnnotationPropertyRange(AnnotationPropertyRange object) {
				return createAnnotationPropertyRangeAdapter();
			}
			@Override
			public Adapter caseAnonymousIndividual(AnonymousIndividual object) {
				return createAnonymousIndividualAdapter();
			}
			@Override
			public Adapter caseAssertion(Assertion object) {
				return createAssertionAdapter();
			}
			@Override
			public Adapter caseAsymmetricObjectProperty(AsymmetricObjectProperty object) {
				return createAsymmetricObjectPropertyAdapter();
			}
			@Override
			public Adapter caseAxiom(Axiom object) {
				return createAxiomAdapter();
			}
			@Override
			public Adapter caseClass(org.emftrace.metamodel.OWLModel.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseClassAssertion(ClassAssertion object) {
				return createClassAssertionAdapter();
			}
			@Override
			public Adapter caseClassAxiom(ClassAxiom object) {
				return createClassAxiomAdapter();
			}
			@Override
			public Adapter caseClassExpression(ClassExpression object) {
				return createClassExpressionAdapter();
			}
			@Override
			public Adapter caseDataAllValuesFrom(DataAllValuesFrom object) {
				return createDataAllValuesFromAdapter();
			}
			@Override
			public Adapter caseDataComplementOf(DataComplementOf object) {
				return createDataComplementOfAdapter();
			}
			@Override
			public Adapter caseDataExactCardinality(DataExactCardinality object) {
				return createDataExactCardinalityAdapter();
			}
			@Override
			public Adapter caseDataHasValue(DataHasValue object) {
				return createDataHasValueAdapter();
			}
			@Override
			public Adapter caseDataIntersectionOf(DataIntersectionOf object) {
				return createDataIntersectionOfAdapter();
			}
			@Override
			public Adapter caseDataMaxCardinality(DataMaxCardinality object) {
				return createDataMaxCardinalityAdapter();
			}
			@Override
			public Adapter caseDataMinCardinality(DataMinCardinality object) {
				return createDataMinCardinalityAdapter();
			}
			@Override
			public Adapter caseDataOneOf(DataOneOf object) {
				return createDataOneOfAdapter();
			}
			@Override
			public Adapter caseDataProperty(DataProperty object) {
				return createDataPropertyAdapter();
			}
			@Override
			public Adapter caseDataPropertyAssertion(DataPropertyAssertion object) {
				return createDataPropertyAssertionAdapter();
			}
			@Override
			public Adapter caseDataPropertyAxiom(DataPropertyAxiom object) {
				return createDataPropertyAxiomAdapter();
			}
			@Override
			public Adapter caseDataPropertyDomain(DataPropertyDomain object) {
				return createDataPropertyDomainAdapter();
			}
			@Override
			public Adapter caseDataPropertyExpression(DataPropertyExpression object) {
				return createDataPropertyExpressionAdapter();
			}
			@Override
			public Adapter caseDataPropertyRange(DataPropertyRange object) {
				return createDataPropertyRangeAdapter();
			}
			@Override
			public Adapter caseDataRange(DataRange object) {
				return createDataRangeAdapter();
			}
			@Override
			public Adapter caseDataSomeValuesFrom(DataSomeValuesFrom object) {
				return createDataSomeValuesFromAdapter();
			}
			@Override
			public Adapter caseDatatype(Datatype object) {
				return createDatatypeAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinition(DatatypeDefinition object) {
				return createDatatypeDefinitionAdapter();
			}
			@Override
			public Adapter caseDatatypeRestriction(DatatypeRestriction object) {
				return createDatatypeRestrictionAdapter();
			}
			@Override
			public Adapter caseDataUnionOf(DataUnionOf object) {
				return createDataUnionOfAdapter();
			}
			@Override
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseDifferentIndividuals(DifferentIndividuals object) {
				return createDifferentIndividualsAdapter();
			}
			@Override
			public Adapter caseDisjointClasses(DisjointClasses object) {
				return createDisjointClassesAdapter();
			}
			@Override
			public Adapter caseDisjointDataProperties(DisjointDataProperties object) {
				return createDisjointDataPropertiesAdapter();
			}
			@Override
			public Adapter caseDisjointObjectProperties(DisjointObjectProperties object) {
				return createDisjointObjectPropertiesAdapter();
			}
			@Override
			public Adapter caseDisjointUnion(DisjointUnion object) {
				return createDisjointUnionAdapter();
			}
			@Override
			public Adapter caseEquivalentClasses(EquivalentClasses object) {
				return createEquivalentClassesAdapter();
			}
			@Override
			public Adapter caseEquivalentDataProperties(EquivalentDataProperties object) {
				return createEquivalentDataPropertiesAdapter();
			}
			@Override
			public Adapter caseEquivalentObjectProperties(EquivalentObjectProperties object) {
				return createEquivalentObjectPropertiesAdapter();
			}
			@Override
			public Adapter caseFacetRestriction(FacetRestriction object) {
				return createFacetRestrictionAdapter();
			}
			@Override
			public Adapter caseFunctionalDataProperty(FunctionalDataProperty object) {
				return createFunctionalDataPropertyAdapter();
			}
			@Override
			public Adapter caseFunctionalObjectProperty(FunctionalObjectProperty object) {
				return createFunctionalObjectPropertyAdapter();
			}
			@Override
			public Adapter caseHasKey(HasKey object) {
				return createHasKeyAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseIndividual(Individual object) {
				return createIndividualAdapter();
			}
			@Override
			public Adapter caseInverseFunctionalObjectProperty(InverseFunctionalObjectProperty object) {
				return createInverseFunctionalObjectPropertyAdapter();
			}
			@Override
			public Adapter caseInverseObjectProperties(InverseObjectProperties object) {
				return createInverseObjectPropertiesAdapter();
			}
			@Override
			public Adapter caseIRI(IRI object) {
				return createIRIAdapter();
			}
			@Override
			public Adapter caseIrreflexiveObjectProperty(IrreflexiveObjectProperty object) {
				return createIrreflexiveObjectPropertyAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseNamedIndividual(NamedIndividual object) {
				return createNamedIndividualAdapter();
			}
			@Override
			public Adapter caseNegativeDataPropertyAssertion(NegativeDataPropertyAssertion object) {
				return createNegativeDataPropertyAssertionAdapter();
			}
			@Override
			public Adapter caseNegativeObjectPropertyAssertion(NegativeObjectPropertyAssertion object) {
				return createNegativeObjectPropertyAssertionAdapter();
			}
			@Override
			public Adapter caseObjectAllValuesFrom(ObjectAllValuesFrom object) {
				return createObjectAllValuesFromAdapter();
			}
			@Override
			public Adapter caseObjectComplementOf(ObjectComplementOf object) {
				return createObjectComplementOfAdapter();
			}
			@Override
			public Adapter caseObjectExactCardinality(ObjectExactCardinality object) {
				return createObjectExactCardinalityAdapter();
			}
			@Override
			public Adapter caseObjectHasSelf(ObjectHasSelf object) {
				return createObjectHasSelfAdapter();
			}
			@Override
			public Adapter caseObjectHasValue(ObjectHasValue object) {
				return createObjectHasValueAdapter();
			}
			@Override
			public Adapter caseObjectIntersectionOf(ObjectIntersectionOf object) {
				return createObjectIntersectionOfAdapter();
			}
			@Override
			public Adapter caseObjectInverseOf(ObjectInverseOf object) {
				return createObjectInverseOfAdapter();
			}
			@Override
			public Adapter caseObjectMaxCardinality(ObjectMaxCardinality object) {
				return createObjectMaxCardinalityAdapter();
			}
			@Override
			public Adapter caseObjectMinCardinality(ObjectMinCardinality object) {
				return createObjectMinCardinalityAdapter();
			}
			@Override
			public Adapter caseObjectOneOf(ObjectOneOf object) {
				return createObjectOneOfAdapter();
			}
			@Override
			public Adapter caseObjectProperty(ObjectProperty object) {
				return createObjectPropertyAdapter();
			}
			@Override
			public Adapter caseObjectPropertyAssertion(ObjectPropertyAssertion object) {
				return createObjectPropertyAssertionAdapter();
			}
			@Override
			public Adapter caseObjectPropertyAxiom(ObjectPropertyAxiom object) {
				return createObjectPropertyAxiomAdapter();
			}
			@Override
			public Adapter caseObjectPropertyChain(ObjectPropertyChain object) {
				return createObjectPropertyChainAdapter();
			}
			@Override
			public Adapter caseObjectPropertyDomain(ObjectPropertyDomain object) {
				return createObjectPropertyDomainAdapter();
			}
			@Override
			public Adapter caseObjectPropertyExpression(ObjectPropertyExpression object) {
				return createObjectPropertyExpressionAdapter();
			}
			@Override
			public Adapter caseObjectPropertyRange(ObjectPropertyRange object) {
				return createObjectPropertyRangeAdapter();
			}
			@Override
			public Adapter caseObjectSomeValuesFrom(ObjectSomeValuesFrom object) {
				return createObjectSomeValuesFromAdapter();
			}
			@Override
			public Adapter caseObjectUnionOf(ObjectUnionOf object) {
				return createObjectUnionOfAdapter();
			}
			@Override
			public Adapter caseOntology(Ontology object) {
				return createOntologyAdapter();
			}
			@Override
			public Adapter casePrefix(Prefix object) {
				return createPrefixAdapter();
			}
			@Override
			public Adapter caseReflexiveObjectProperty(ReflexiveObjectProperty object) {
				return createReflexiveObjectPropertyAdapter();
			}
			@Override
			public Adapter caseSameIndividual(SameIndividual object) {
				return createSameIndividualAdapter();
			}
			@Override
			public Adapter caseSubAnnotationPropertyOf(SubAnnotationPropertyOf object) {
				return createSubAnnotationPropertyOfAdapter();
			}
			@Override
			public Adapter caseSubClassOf(SubClassOf object) {
				return createSubClassOfAdapter();
			}
			@Override
			public Adapter caseSubDataPropertyOf(SubDataPropertyOf object) {
				return createSubDataPropertyOfAdapter();
			}
			@Override
			public Adapter caseSubObjectPropertyOf(SubObjectPropertyOf object) {
				return createSubObjectPropertyOfAdapter();
			}
			@Override
			public Adapter caseSymmetricObjectProperty(SymmetricObjectProperty object) {
				return createSymmetricObjectPropertyAdapter();
			}
			@Override
			public Adapter caseTransitiveObjectProperty(TransitiveObjectProperty object) {
				return createTransitiveObjectPropertyAdapter();
			}
			@Override
			public Adapter caseOWLBase(OWLBase object) {
				return createOWLBaseAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.AbbreviatedIRI <em>Abbreviated IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.AbbreviatedIRI
	 * @generated
	 */
	public Adapter createAbbreviatedIRIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.AnnotationAssertion <em>Annotation Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.AnnotationAssertion
	 * @generated
	 */
	public Adapter createAnnotationAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.AnnotationAxiom <em>Annotation Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.AnnotationAxiom
	 * @generated
	 */
	public Adapter createAnnotationAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.AnnotationProperty <em>Annotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.AnnotationProperty
	 * @generated
	 */
	public Adapter createAnnotationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.AnnotationPropertyDomain <em>Annotation Property Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.AnnotationPropertyDomain
	 * @generated
	 */
	public Adapter createAnnotationPropertyDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.AnnotationPropertyRange <em>Annotation Property Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.AnnotationPropertyRange
	 * @generated
	 */
	public Adapter createAnnotationPropertyRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.AnonymousIndividual <em>Anonymous Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.AnonymousIndividual
	 * @generated
	 */
	public Adapter createAnonymousIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.Assertion
	 * @generated
	 */
	public Adapter createAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.AsymmetricObjectProperty <em>Asymmetric Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.AsymmetricObjectProperty
	 * @generated
	 */
	public Adapter createAsymmetricObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.Axiom <em>Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.Axiom
	 * @generated
	 */
	public Adapter createAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ClassAssertion <em>Class Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ClassAssertion
	 * @generated
	 */
	public Adapter createClassAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ClassAxiom <em>Class Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ClassAxiom
	 * @generated
	 */
	public Adapter createClassAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ClassExpression <em>Class Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ClassExpression
	 * @generated
	 */
	public Adapter createClassExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DataAllValuesFrom <em>Data All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DataAllValuesFrom
	 * @generated
	 */
	public Adapter createDataAllValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DataComplementOf <em>Data Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DataComplementOf
	 * @generated
	 */
	public Adapter createDataComplementOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DataExactCardinality <em>Data Exact Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DataExactCardinality
	 * @generated
	 */
	public Adapter createDataExactCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DataHasValue <em>Data Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DataHasValue
	 * @generated
	 */
	public Adapter createDataHasValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DataIntersectionOf <em>Data Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DataIntersectionOf
	 * @generated
	 */
	public Adapter createDataIntersectionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DataMaxCardinality <em>Data Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DataMaxCardinality
	 * @generated
	 */
	public Adapter createDataMaxCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DataMinCardinality <em>Data Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DataMinCardinality
	 * @generated
	 */
	public Adapter createDataMinCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DataOneOf <em>Data One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DataOneOf
	 * @generated
	 */
	public Adapter createDataOneOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DataProperty
	 * @generated
	 */
	public Adapter createDataPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DataPropertyAssertion <em>Data Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DataPropertyAssertion
	 * @generated
	 */
	public Adapter createDataPropertyAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DataPropertyAxiom <em>Data Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DataPropertyAxiom
	 * @generated
	 */
	public Adapter createDataPropertyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DataPropertyDomain <em>Data Property Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DataPropertyDomain
	 * @generated
	 */
	public Adapter createDataPropertyDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DataPropertyExpression <em>Data Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DataPropertyExpression
	 * @generated
	 */
	public Adapter createDataPropertyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DataPropertyRange <em>Data Property Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DataPropertyRange
	 * @generated
	 */
	public Adapter createDataPropertyRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DataRange
	 * @generated
	 */
	public Adapter createDataRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DataSomeValuesFrom <em>Data Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DataSomeValuesFrom
	 * @generated
	 */
	public Adapter createDataSomeValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.Datatype
	 * @generated
	 */
	public Adapter createDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DatatypeDefinition <em>Datatype Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DatatypeDefinition
	 * @generated
	 */
	public Adapter createDatatypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DatatypeRestriction <em>Datatype Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DatatypeRestriction
	 * @generated
	 */
	public Adapter createDatatypeRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DataUnionOf <em>Data Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DataUnionOf
	 * @generated
	 */
	public Adapter createDataUnionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DifferentIndividuals <em>Different Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DifferentIndividuals
	 * @generated
	 */
	public Adapter createDifferentIndividualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DisjointClasses <em>Disjoint Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DisjointClasses
	 * @generated
	 */
	public Adapter createDisjointClassesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DisjointDataProperties <em>Disjoint Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DisjointDataProperties
	 * @generated
	 */
	public Adapter createDisjointDataPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DisjointObjectProperties <em>Disjoint Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DisjointObjectProperties
	 * @generated
	 */
	public Adapter createDisjointObjectPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.DisjointUnion <em>Disjoint Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.DisjointUnion
	 * @generated
	 */
	public Adapter createDisjointUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.EquivalentClasses <em>Equivalent Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.EquivalentClasses
	 * @generated
	 */
	public Adapter createEquivalentClassesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.EquivalentDataProperties <em>Equivalent Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.EquivalentDataProperties
	 * @generated
	 */
	public Adapter createEquivalentDataPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.EquivalentObjectProperties <em>Equivalent Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.EquivalentObjectProperties
	 * @generated
	 */
	public Adapter createEquivalentObjectPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.FacetRestriction <em>Facet Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.FacetRestriction
	 * @generated
	 */
	public Adapter createFacetRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.FunctionalDataProperty <em>Functional Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.FunctionalDataProperty
	 * @generated
	 */
	public Adapter createFunctionalDataPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.FunctionalObjectProperty <em>Functional Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.FunctionalObjectProperty
	 * @generated
	 */
	public Adapter createFunctionalObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.HasKey <em>Has Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.HasKey
	 * @generated
	 */
	public Adapter createHasKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.Individual
	 * @generated
	 */
	public Adapter createIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.InverseFunctionalObjectProperty <em>Inverse Functional Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.InverseFunctionalObjectProperty
	 * @generated
	 */
	public Adapter createInverseFunctionalObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.InverseObjectProperties <em>Inverse Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.InverseObjectProperties
	 * @generated
	 */
	public Adapter createInverseObjectPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.IRI <em>IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.IRI
	 * @generated
	 */
	public Adapter createIRIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.IrreflexiveObjectProperty <em>Irreflexive Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.IrreflexiveObjectProperty
	 * @generated
	 */
	public Adapter createIrreflexiveObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.NamedIndividual <em>Named Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.NamedIndividual
	 * @generated
	 */
	public Adapter createNamedIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.NegativeDataPropertyAssertion <em>Negative Data Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.NegativeDataPropertyAssertion
	 * @generated
	 */
	public Adapter createNegativeDataPropertyAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.NegativeObjectPropertyAssertion <em>Negative Object Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.NegativeObjectPropertyAssertion
	 * @generated
	 */
	public Adapter createNegativeObjectPropertyAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectAllValuesFrom <em>Object All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectAllValuesFrom
	 * @generated
	 */
	public Adapter createObjectAllValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectComplementOf <em>Object Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectComplementOf
	 * @generated
	 */
	public Adapter createObjectComplementOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality <em>Object Exact Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectExactCardinality
	 * @generated
	 */
	public Adapter createObjectExactCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectHasSelf <em>Object Has Self</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectHasSelf
	 * @generated
	 */
	public Adapter createObjectHasSelfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectHasValue <em>Object Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectHasValue
	 * @generated
	 */
	public Adapter createObjectHasValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectIntersectionOf <em>Object Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectIntersectionOf
	 * @generated
	 */
	public Adapter createObjectIntersectionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectInverseOf <em>Object Inverse Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectInverseOf
	 * @generated
	 */
	public Adapter createObjectInverseOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectMaxCardinality <em>Object Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectMaxCardinality
	 * @generated
	 */
	public Adapter createObjectMaxCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectMinCardinality <em>Object Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectMinCardinality
	 * @generated
	 */
	public Adapter createObjectMinCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectOneOf <em>Object One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectOneOf
	 * @generated
	 */
	public Adapter createObjectOneOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectProperty <em>Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectProperty
	 * @generated
	 */
	public Adapter createObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectPropertyAssertion <em>Object Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectPropertyAssertion
	 * @generated
	 */
	public Adapter createObjectPropertyAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectPropertyAxiom <em>Object Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectPropertyAxiom
	 * @generated
	 */
	public Adapter createObjectPropertyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectPropertyChain <em>Object Property Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectPropertyChain
	 * @generated
	 */
	public Adapter createObjectPropertyChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectPropertyDomain <em>Object Property Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectPropertyDomain
	 * @generated
	 */
	public Adapter createObjectPropertyDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectPropertyExpression <em>Object Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectPropertyExpression
	 * @generated
	 */
	public Adapter createObjectPropertyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectPropertyRange <em>Object Property Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectPropertyRange
	 * @generated
	 */
	public Adapter createObjectPropertyRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectSomeValuesFrom <em>Object Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectSomeValuesFrom
	 * @generated
	 */
	public Adapter createObjectSomeValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ObjectUnionOf <em>Object Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ObjectUnionOf
	 * @generated
	 */
	public Adapter createObjectUnionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.Ontology
	 * @generated
	 */
	public Adapter createOntologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.Prefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.Prefix
	 * @generated
	 */
	public Adapter createPrefixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.ReflexiveObjectProperty <em>Reflexive Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.ReflexiveObjectProperty
	 * @generated
	 */
	public Adapter createReflexiveObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.SameIndividual <em>Same Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.SameIndividual
	 * @generated
	 */
	public Adapter createSameIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.SubAnnotationPropertyOf <em>Sub Annotation Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.SubAnnotationPropertyOf
	 * @generated
	 */
	public Adapter createSubAnnotationPropertyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.SubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.SubClassOf
	 * @generated
	 */
	public Adapter createSubClassOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.SubDataPropertyOf <em>Sub Data Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.SubDataPropertyOf
	 * @generated
	 */
	public Adapter createSubDataPropertyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.SubObjectPropertyOf <em>Sub Object Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.SubObjectPropertyOf
	 * @generated
	 */
	public Adapter createSubObjectPropertyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.SymmetricObjectProperty <em>Symmetric Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.SymmetricObjectProperty
	 * @generated
	 */
	public Adapter createSymmetricObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.TransitiveObjectProperty <em>Transitive Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.TransitiveObjectProperty
	 * @generated
	 */
	public Adapter createTransitiveObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.OWLModel.OWLBase <em>OWL Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.OWLModel.OWLBase
	 * @generated
	 */
	public Adapter createOWLBaseAdapter() {
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

} //OWLModelAdapterFactory
