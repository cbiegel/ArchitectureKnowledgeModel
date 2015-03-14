/**
 */
package org.emftrace.metamodel.OWLModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage
 * @generated
 */
public class OWLModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OWLModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLModelSwitch() {
		if (modelPackage == null) {
			modelPackage = OWLModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OWLModelPackage.ABBREVIATED_IRI: {
				AbbreviatedIRI abbreviatedIRI = (AbbreviatedIRI)theEObject;
				T result = caseAbbreviatedIRI(abbreviatedIRI);
				if (result == null) result = caseOWLBase(abbreviatedIRI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseOWLBase(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.ANNOTATION_ASSERTION: {
				AnnotationAssertion annotationAssertion = (AnnotationAssertion)theEObject;
				T result = caseAnnotationAssertion(annotationAssertion);
				if (result == null) result = caseAnnotationAxiom(annotationAssertion);
				if (result == null) result = caseAxiom(annotationAssertion);
				if (result == null) result = caseOWLBase(annotationAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.ANNOTATION_AXIOM: {
				AnnotationAxiom annotationAxiom = (AnnotationAxiom)theEObject;
				T result = caseAnnotationAxiom(annotationAxiom);
				if (result == null) result = caseAxiom(annotationAxiom);
				if (result == null) result = caseOWLBase(annotationAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.ANNOTATION_PROPERTY: {
				AnnotationProperty annotationProperty = (AnnotationProperty)theEObject;
				T result = caseAnnotationProperty(annotationProperty);
				if (result == null) result = caseOWLBase(annotationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.ANNOTATION_PROPERTY_DOMAIN: {
				AnnotationPropertyDomain annotationPropertyDomain = (AnnotationPropertyDomain)theEObject;
				T result = caseAnnotationPropertyDomain(annotationPropertyDomain);
				if (result == null) result = caseAnnotationAxiom(annotationPropertyDomain);
				if (result == null) result = caseAxiom(annotationPropertyDomain);
				if (result == null) result = caseOWLBase(annotationPropertyDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.ANNOTATION_PROPERTY_RANGE: {
				AnnotationPropertyRange annotationPropertyRange = (AnnotationPropertyRange)theEObject;
				T result = caseAnnotationPropertyRange(annotationPropertyRange);
				if (result == null) result = caseAnnotationAxiom(annotationPropertyRange);
				if (result == null) result = caseAxiom(annotationPropertyRange);
				if (result == null) result = caseOWLBase(annotationPropertyRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.ANONYMOUS_INDIVIDUAL: {
				AnonymousIndividual anonymousIndividual = (AnonymousIndividual)theEObject;
				T result = caseAnonymousIndividual(anonymousIndividual);
				if (result == null) result = caseIndividual(anonymousIndividual);
				if (result == null) result = caseOWLBase(anonymousIndividual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.ASSERTION: {
				Assertion assertion = (Assertion)theEObject;
				T result = caseAssertion(assertion);
				if (result == null) result = caseAxiom(assertion);
				if (result == null) result = caseOWLBase(assertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.ASYMMETRIC_OBJECT_PROPERTY: {
				AsymmetricObjectProperty asymmetricObjectProperty = (AsymmetricObjectProperty)theEObject;
				T result = caseAsymmetricObjectProperty(asymmetricObjectProperty);
				if (result == null) result = caseObjectPropertyAxiom(asymmetricObjectProperty);
				if (result == null) result = caseAxiom(asymmetricObjectProperty);
				if (result == null) result = caseOWLBase(asymmetricObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.AXIOM: {
				Axiom axiom = (Axiom)theEObject;
				T result = caseAxiom(axiom);
				if (result == null) result = caseOWLBase(axiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.CLASS: {
				org.emftrace.metamodel.OWLModel.Class class_ = (org.emftrace.metamodel.OWLModel.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseClassExpression(class_);
				if (result == null) result = caseOWLBase(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.CLASS_ASSERTION: {
				ClassAssertion classAssertion = (ClassAssertion)theEObject;
				T result = caseClassAssertion(classAssertion);
				if (result == null) result = caseAssertion(classAssertion);
				if (result == null) result = caseAxiom(classAssertion);
				if (result == null) result = caseOWLBase(classAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.CLASS_AXIOM: {
				ClassAxiom classAxiom = (ClassAxiom)theEObject;
				T result = caseClassAxiom(classAxiom);
				if (result == null) result = caseAxiom(classAxiom);
				if (result == null) result = caseOWLBase(classAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.CLASS_EXPRESSION: {
				ClassExpression classExpression = (ClassExpression)theEObject;
				T result = caseClassExpression(classExpression);
				if (result == null) result = caseOWLBase(classExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATA_ALL_VALUES_FROM: {
				DataAllValuesFrom dataAllValuesFrom = (DataAllValuesFrom)theEObject;
				T result = caseDataAllValuesFrom(dataAllValuesFrom);
				if (result == null) result = caseClassExpression(dataAllValuesFrom);
				if (result == null) result = caseOWLBase(dataAllValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATA_COMPLEMENT_OF: {
				DataComplementOf dataComplementOf = (DataComplementOf)theEObject;
				T result = caseDataComplementOf(dataComplementOf);
				if (result == null) result = caseDataRange(dataComplementOf);
				if (result == null) result = caseOWLBase(dataComplementOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATA_EXACT_CARDINALITY: {
				DataExactCardinality dataExactCardinality = (DataExactCardinality)theEObject;
				T result = caseDataExactCardinality(dataExactCardinality);
				if (result == null) result = caseClassExpression(dataExactCardinality);
				if (result == null) result = caseOWLBase(dataExactCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATA_HAS_VALUE: {
				DataHasValue dataHasValue = (DataHasValue)theEObject;
				T result = caseDataHasValue(dataHasValue);
				if (result == null) result = caseClassExpression(dataHasValue);
				if (result == null) result = caseOWLBase(dataHasValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATA_INTERSECTION_OF: {
				DataIntersectionOf dataIntersectionOf = (DataIntersectionOf)theEObject;
				T result = caseDataIntersectionOf(dataIntersectionOf);
				if (result == null) result = caseDataRange(dataIntersectionOf);
				if (result == null) result = caseOWLBase(dataIntersectionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATA_MAX_CARDINALITY: {
				DataMaxCardinality dataMaxCardinality = (DataMaxCardinality)theEObject;
				T result = caseDataMaxCardinality(dataMaxCardinality);
				if (result == null) result = caseClassExpression(dataMaxCardinality);
				if (result == null) result = caseOWLBase(dataMaxCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATA_MIN_CARDINALITY: {
				DataMinCardinality dataMinCardinality = (DataMinCardinality)theEObject;
				T result = caseDataMinCardinality(dataMinCardinality);
				if (result == null) result = caseClassExpression(dataMinCardinality);
				if (result == null) result = caseOWLBase(dataMinCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATA_ONE_OF: {
				DataOneOf dataOneOf = (DataOneOf)theEObject;
				T result = caseDataOneOf(dataOneOf);
				if (result == null) result = caseDataRange(dataOneOf);
				if (result == null) result = caseOWLBase(dataOneOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATA_PROPERTY: {
				DataProperty dataProperty = (DataProperty)theEObject;
				T result = caseDataProperty(dataProperty);
				if (result == null) result = caseDataPropertyExpression(dataProperty);
				if (result == null) result = caseOWLBase(dataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATA_PROPERTY_ASSERTION: {
				DataPropertyAssertion dataPropertyAssertion = (DataPropertyAssertion)theEObject;
				T result = caseDataPropertyAssertion(dataPropertyAssertion);
				if (result == null) result = caseAssertion(dataPropertyAssertion);
				if (result == null) result = caseAxiom(dataPropertyAssertion);
				if (result == null) result = caseOWLBase(dataPropertyAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATA_PROPERTY_AXIOM: {
				DataPropertyAxiom dataPropertyAxiom = (DataPropertyAxiom)theEObject;
				T result = caseDataPropertyAxiom(dataPropertyAxiom);
				if (result == null) result = caseAxiom(dataPropertyAxiom);
				if (result == null) result = caseOWLBase(dataPropertyAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATA_PROPERTY_DOMAIN: {
				DataPropertyDomain dataPropertyDomain = (DataPropertyDomain)theEObject;
				T result = caseDataPropertyDomain(dataPropertyDomain);
				if (result == null) result = caseDataPropertyAxiom(dataPropertyDomain);
				if (result == null) result = caseAxiom(dataPropertyDomain);
				if (result == null) result = caseOWLBase(dataPropertyDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATA_PROPERTY_EXPRESSION: {
				DataPropertyExpression dataPropertyExpression = (DataPropertyExpression)theEObject;
				T result = caseDataPropertyExpression(dataPropertyExpression);
				if (result == null) result = caseOWLBase(dataPropertyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATA_PROPERTY_RANGE: {
				DataPropertyRange dataPropertyRange = (DataPropertyRange)theEObject;
				T result = caseDataPropertyRange(dataPropertyRange);
				if (result == null) result = caseDataPropertyAxiom(dataPropertyRange);
				if (result == null) result = caseAxiom(dataPropertyRange);
				if (result == null) result = caseOWLBase(dataPropertyRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATA_RANGE: {
				DataRange dataRange = (DataRange)theEObject;
				T result = caseDataRange(dataRange);
				if (result == null) result = caseOWLBase(dataRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATA_SOME_VALUES_FROM: {
				DataSomeValuesFrom dataSomeValuesFrom = (DataSomeValuesFrom)theEObject;
				T result = caseDataSomeValuesFrom(dataSomeValuesFrom);
				if (result == null) result = caseClassExpression(dataSomeValuesFrom);
				if (result == null) result = caseOWLBase(dataSomeValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATATYPE: {
				Datatype datatype = (Datatype)theEObject;
				T result = caseDatatype(datatype);
				if (result == null) result = caseDataRange(datatype);
				if (result == null) result = caseOWLBase(datatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATATYPE_DEFINITION: {
				DatatypeDefinition datatypeDefinition = (DatatypeDefinition)theEObject;
				T result = caseDatatypeDefinition(datatypeDefinition);
				if (result == null) result = caseAxiom(datatypeDefinition);
				if (result == null) result = caseOWLBase(datatypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATATYPE_RESTRICTION: {
				DatatypeRestriction datatypeRestriction = (DatatypeRestriction)theEObject;
				T result = caseDatatypeRestriction(datatypeRestriction);
				if (result == null) result = caseDataRange(datatypeRestriction);
				if (result == null) result = caseOWLBase(datatypeRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DATA_UNION_OF: {
				DataUnionOf dataUnionOf = (DataUnionOf)theEObject;
				T result = caseDataUnionOf(dataUnionOf);
				if (result == null) result = caseDataRange(dataUnionOf);
				if (result == null) result = caseOWLBase(dataUnionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DECLARATION: {
				Declaration declaration = (Declaration)theEObject;
				T result = caseDeclaration(declaration);
				if (result == null) result = caseAxiom(declaration);
				if (result == null) result = caseOWLBase(declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DIFFERENT_INDIVIDUALS: {
				DifferentIndividuals differentIndividuals = (DifferentIndividuals)theEObject;
				T result = caseDifferentIndividuals(differentIndividuals);
				if (result == null) result = caseAssertion(differentIndividuals);
				if (result == null) result = caseAxiom(differentIndividuals);
				if (result == null) result = caseOWLBase(differentIndividuals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DISJOINT_CLASSES: {
				DisjointClasses disjointClasses = (DisjointClasses)theEObject;
				T result = caseDisjointClasses(disjointClasses);
				if (result == null) result = caseClassAxiom(disjointClasses);
				if (result == null) result = caseAxiom(disjointClasses);
				if (result == null) result = caseOWLBase(disjointClasses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DISJOINT_DATA_PROPERTIES: {
				DisjointDataProperties disjointDataProperties = (DisjointDataProperties)theEObject;
				T result = caseDisjointDataProperties(disjointDataProperties);
				if (result == null) result = caseDataPropertyAxiom(disjointDataProperties);
				if (result == null) result = caseAxiom(disjointDataProperties);
				if (result == null) result = caseOWLBase(disjointDataProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DISJOINT_OBJECT_PROPERTIES: {
				DisjointObjectProperties disjointObjectProperties = (DisjointObjectProperties)theEObject;
				T result = caseDisjointObjectProperties(disjointObjectProperties);
				if (result == null) result = caseObjectPropertyAxiom(disjointObjectProperties);
				if (result == null) result = caseAxiom(disjointObjectProperties);
				if (result == null) result = caseOWLBase(disjointObjectProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.DISJOINT_UNION: {
				DisjointUnion disjointUnion = (DisjointUnion)theEObject;
				T result = caseDisjointUnion(disjointUnion);
				if (result == null) result = caseClassAxiom(disjointUnion);
				if (result == null) result = caseAxiom(disjointUnion);
				if (result == null) result = caseOWLBase(disjointUnion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.EQUIVALENT_CLASSES: {
				EquivalentClasses equivalentClasses = (EquivalentClasses)theEObject;
				T result = caseEquivalentClasses(equivalentClasses);
				if (result == null) result = caseClassAxiom(equivalentClasses);
				if (result == null) result = caseAxiom(equivalentClasses);
				if (result == null) result = caseOWLBase(equivalentClasses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.EQUIVALENT_DATA_PROPERTIES: {
				EquivalentDataProperties equivalentDataProperties = (EquivalentDataProperties)theEObject;
				T result = caseEquivalentDataProperties(equivalentDataProperties);
				if (result == null) result = caseDataPropertyAxiom(equivalentDataProperties);
				if (result == null) result = caseAxiom(equivalentDataProperties);
				if (result == null) result = caseOWLBase(equivalentDataProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.EQUIVALENT_OBJECT_PROPERTIES: {
				EquivalentObjectProperties equivalentObjectProperties = (EquivalentObjectProperties)theEObject;
				T result = caseEquivalentObjectProperties(equivalentObjectProperties);
				if (result == null) result = caseObjectPropertyAxiom(equivalentObjectProperties);
				if (result == null) result = caseAxiom(equivalentObjectProperties);
				if (result == null) result = caseOWLBase(equivalentObjectProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.FACET_RESTRICTION: {
				FacetRestriction facetRestriction = (FacetRestriction)theEObject;
				T result = caseFacetRestriction(facetRestriction);
				if (result == null) result = caseOWLBase(facetRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.FUNCTIONAL_DATA_PROPERTY: {
				FunctionalDataProperty functionalDataProperty = (FunctionalDataProperty)theEObject;
				T result = caseFunctionalDataProperty(functionalDataProperty);
				if (result == null) result = caseDataPropertyAxiom(functionalDataProperty);
				if (result == null) result = caseAxiom(functionalDataProperty);
				if (result == null) result = caseOWLBase(functionalDataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY: {
				FunctionalObjectProperty functionalObjectProperty = (FunctionalObjectProperty)theEObject;
				T result = caseFunctionalObjectProperty(functionalObjectProperty);
				if (result == null) result = caseObjectPropertyAxiom(functionalObjectProperty);
				if (result == null) result = caseAxiom(functionalObjectProperty);
				if (result == null) result = caseOWLBase(functionalObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.HAS_KEY: {
				HasKey hasKey = (HasKey)theEObject;
				T result = caseHasKey(hasKey);
				if (result == null) result = caseAxiom(hasKey);
				if (result == null) result = caseOWLBase(hasKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = caseOWLBase(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.INDIVIDUAL: {
				Individual individual = (Individual)theEObject;
				T result = caseIndividual(individual);
				if (result == null) result = caseOWLBase(individual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY: {
				InverseFunctionalObjectProperty inverseFunctionalObjectProperty = (InverseFunctionalObjectProperty)theEObject;
				T result = caseInverseFunctionalObjectProperty(inverseFunctionalObjectProperty);
				if (result == null) result = caseObjectPropertyAxiom(inverseFunctionalObjectProperty);
				if (result == null) result = caseAxiom(inverseFunctionalObjectProperty);
				if (result == null) result = caseOWLBase(inverseFunctionalObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.INVERSE_OBJECT_PROPERTIES: {
				InverseObjectProperties inverseObjectProperties = (InverseObjectProperties)theEObject;
				T result = caseInverseObjectProperties(inverseObjectProperties);
				if (result == null) result = caseObjectPropertyAxiom(inverseObjectProperties);
				if (result == null) result = caseAxiom(inverseObjectProperties);
				if (result == null) result = caseOWLBase(inverseObjectProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.IRI: {
				IRI iri = (IRI)theEObject;
				T result = caseIRI(iri);
				if (result == null) result = caseOWLBase(iri);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.IRREFLEXIVE_OBJECT_PROPERTY: {
				IrreflexiveObjectProperty irreflexiveObjectProperty = (IrreflexiveObjectProperty)theEObject;
				T result = caseIrreflexiveObjectProperty(irreflexiveObjectProperty);
				if (result == null) result = caseObjectPropertyAxiom(irreflexiveObjectProperty);
				if (result == null) result = caseAxiom(irreflexiveObjectProperty);
				if (result == null) result = caseOWLBase(irreflexiveObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseOWLBase(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.NAMED_INDIVIDUAL: {
				NamedIndividual namedIndividual = (NamedIndividual)theEObject;
				T result = caseNamedIndividual(namedIndividual);
				if (result == null) result = caseIndividual(namedIndividual);
				if (result == null) result = caseOWLBase(namedIndividual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.NEGATIVE_DATA_PROPERTY_ASSERTION: {
				NegativeDataPropertyAssertion negativeDataPropertyAssertion = (NegativeDataPropertyAssertion)theEObject;
				T result = caseNegativeDataPropertyAssertion(negativeDataPropertyAssertion);
				if (result == null) result = caseAssertion(negativeDataPropertyAssertion);
				if (result == null) result = caseAxiom(negativeDataPropertyAssertion);
				if (result == null) result = caseOWLBase(negativeDataPropertyAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION: {
				NegativeObjectPropertyAssertion negativeObjectPropertyAssertion = (NegativeObjectPropertyAssertion)theEObject;
				T result = caseNegativeObjectPropertyAssertion(negativeObjectPropertyAssertion);
				if (result == null) result = caseAssertion(negativeObjectPropertyAssertion);
				if (result == null) result = caseAxiom(negativeObjectPropertyAssertion);
				if (result == null) result = caseOWLBase(negativeObjectPropertyAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_ALL_VALUES_FROM: {
				ObjectAllValuesFrom objectAllValuesFrom = (ObjectAllValuesFrom)theEObject;
				T result = caseObjectAllValuesFrom(objectAllValuesFrom);
				if (result == null) result = caseClassExpression(objectAllValuesFrom);
				if (result == null) result = caseOWLBase(objectAllValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_COMPLEMENT_OF: {
				ObjectComplementOf objectComplementOf = (ObjectComplementOf)theEObject;
				T result = caseObjectComplementOf(objectComplementOf);
				if (result == null) result = caseClassExpression(objectComplementOf);
				if (result == null) result = caseOWLBase(objectComplementOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_EXACT_CARDINALITY: {
				ObjectExactCardinality objectExactCardinality = (ObjectExactCardinality)theEObject;
				T result = caseObjectExactCardinality(objectExactCardinality);
				if (result == null) result = caseClassExpression(objectExactCardinality);
				if (result == null) result = caseOWLBase(objectExactCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_HAS_SELF: {
				ObjectHasSelf objectHasSelf = (ObjectHasSelf)theEObject;
				T result = caseObjectHasSelf(objectHasSelf);
				if (result == null) result = caseClassExpression(objectHasSelf);
				if (result == null) result = caseOWLBase(objectHasSelf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_HAS_VALUE: {
				ObjectHasValue objectHasValue = (ObjectHasValue)theEObject;
				T result = caseObjectHasValue(objectHasValue);
				if (result == null) result = caseClassExpression(objectHasValue);
				if (result == null) result = caseOWLBase(objectHasValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_INTERSECTION_OF: {
				ObjectIntersectionOf objectIntersectionOf = (ObjectIntersectionOf)theEObject;
				T result = caseObjectIntersectionOf(objectIntersectionOf);
				if (result == null) result = caseClassExpression(objectIntersectionOf);
				if (result == null) result = caseOWLBase(objectIntersectionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_INVERSE_OF: {
				ObjectInverseOf objectInverseOf = (ObjectInverseOf)theEObject;
				T result = caseObjectInverseOf(objectInverseOf);
				if (result == null) result = caseObjectPropertyExpression(objectInverseOf);
				if (result == null) result = caseOWLBase(objectInverseOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_MAX_CARDINALITY: {
				ObjectMaxCardinality objectMaxCardinality = (ObjectMaxCardinality)theEObject;
				T result = caseObjectMaxCardinality(objectMaxCardinality);
				if (result == null) result = caseClassExpression(objectMaxCardinality);
				if (result == null) result = caseOWLBase(objectMaxCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_MIN_CARDINALITY: {
				ObjectMinCardinality objectMinCardinality = (ObjectMinCardinality)theEObject;
				T result = caseObjectMinCardinality(objectMinCardinality);
				if (result == null) result = caseClassExpression(objectMinCardinality);
				if (result == null) result = caseOWLBase(objectMinCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_ONE_OF: {
				ObjectOneOf objectOneOf = (ObjectOneOf)theEObject;
				T result = caseObjectOneOf(objectOneOf);
				if (result == null) result = caseClassExpression(objectOneOf);
				if (result == null) result = caseOWLBase(objectOneOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_PROPERTY: {
				ObjectProperty objectProperty = (ObjectProperty)theEObject;
				T result = caseObjectProperty(objectProperty);
				if (result == null) result = caseObjectPropertyExpression(objectProperty);
				if (result == null) result = caseOWLBase(objectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_PROPERTY_ASSERTION: {
				ObjectPropertyAssertion objectPropertyAssertion = (ObjectPropertyAssertion)theEObject;
				T result = caseObjectPropertyAssertion(objectPropertyAssertion);
				if (result == null) result = caseAssertion(objectPropertyAssertion);
				if (result == null) result = caseAxiom(objectPropertyAssertion);
				if (result == null) result = caseOWLBase(objectPropertyAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_PROPERTY_AXIOM: {
				ObjectPropertyAxiom objectPropertyAxiom = (ObjectPropertyAxiom)theEObject;
				T result = caseObjectPropertyAxiom(objectPropertyAxiom);
				if (result == null) result = caseAxiom(objectPropertyAxiom);
				if (result == null) result = caseOWLBase(objectPropertyAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_PROPERTY_CHAIN: {
				ObjectPropertyChain objectPropertyChain = (ObjectPropertyChain)theEObject;
				T result = caseObjectPropertyChain(objectPropertyChain);
				if (result == null) result = caseOWLBase(objectPropertyChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN: {
				ObjectPropertyDomain objectPropertyDomain = (ObjectPropertyDomain)theEObject;
				T result = caseObjectPropertyDomain(objectPropertyDomain);
				if (result == null) result = caseObjectPropertyAxiom(objectPropertyDomain);
				if (result == null) result = caseAxiom(objectPropertyDomain);
				if (result == null) result = caseOWLBase(objectPropertyDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_PROPERTY_EXPRESSION: {
				ObjectPropertyExpression objectPropertyExpression = (ObjectPropertyExpression)theEObject;
				T result = caseObjectPropertyExpression(objectPropertyExpression);
				if (result == null) result = caseOWLBase(objectPropertyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_PROPERTY_RANGE: {
				ObjectPropertyRange objectPropertyRange = (ObjectPropertyRange)theEObject;
				T result = caseObjectPropertyRange(objectPropertyRange);
				if (result == null) result = caseObjectPropertyAxiom(objectPropertyRange);
				if (result == null) result = caseAxiom(objectPropertyRange);
				if (result == null) result = caseOWLBase(objectPropertyRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_SOME_VALUES_FROM: {
				ObjectSomeValuesFrom objectSomeValuesFrom = (ObjectSomeValuesFrom)theEObject;
				T result = caseObjectSomeValuesFrom(objectSomeValuesFrom);
				if (result == null) result = caseClassExpression(objectSomeValuesFrom);
				if (result == null) result = caseOWLBase(objectSomeValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OBJECT_UNION_OF: {
				ObjectUnionOf objectUnionOf = (ObjectUnionOf)theEObject;
				T result = caseObjectUnionOf(objectUnionOf);
				if (result == null) result = caseClassExpression(objectUnionOf);
				if (result == null) result = caseOWLBase(objectUnionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.ONTOLOGY: {
				Ontology ontology = (Ontology)theEObject;
				T result = caseOntology(ontology);
				if (result == null) result = caseOWLBase(ontology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.PREFIX: {
				Prefix prefix = (Prefix)theEObject;
				T result = casePrefix(prefix);
				if (result == null) result = caseOWLBase(prefix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.REFLEXIVE_OBJECT_PROPERTY: {
				ReflexiveObjectProperty reflexiveObjectProperty = (ReflexiveObjectProperty)theEObject;
				T result = caseReflexiveObjectProperty(reflexiveObjectProperty);
				if (result == null) result = caseObjectPropertyAxiom(reflexiveObjectProperty);
				if (result == null) result = caseAxiom(reflexiveObjectProperty);
				if (result == null) result = caseOWLBase(reflexiveObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.SAME_INDIVIDUAL: {
				SameIndividual sameIndividual = (SameIndividual)theEObject;
				T result = caseSameIndividual(sameIndividual);
				if (result == null) result = caseAssertion(sameIndividual);
				if (result == null) result = caseAxiom(sameIndividual);
				if (result == null) result = caseOWLBase(sameIndividual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.SUB_ANNOTATION_PROPERTY_OF: {
				SubAnnotationPropertyOf subAnnotationPropertyOf = (SubAnnotationPropertyOf)theEObject;
				T result = caseSubAnnotationPropertyOf(subAnnotationPropertyOf);
				if (result == null) result = caseAnnotationAxiom(subAnnotationPropertyOf);
				if (result == null) result = caseAxiom(subAnnotationPropertyOf);
				if (result == null) result = caseOWLBase(subAnnotationPropertyOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.SUB_CLASS_OF: {
				SubClassOf subClassOf = (SubClassOf)theEObject;
				T result = caseSubClassOf(subClassOf);
				if (result == null) result = caseClassAxiom(subClassOf);
				if (result == null) result = caseAxiom(subClassOf);
				if (result == null) result = caseOWLBase(subClassOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.SUB_DATA_PROPERTY_OF: {
				SubDataPropertyOf subDataPropertyOf = (SubDataPropertyOf)theEObject;
				T result = caseSubDataPropertyOf(subDataPropertyOf);
				if (result == null) result = caseDataPropertyAxiom(subDataPropertyOf);
				if (result == null) result = caseAxiom(subDataPropertyOf);
				if (result == null) result = caseOWLBase(subDataPropertyOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.SUB_OBJECT_PROPERTY_OF: {
				SubObjectPropertyOf subObjectPropertyOf = (SubObjectPropertyOf)theEObject;
				T result = caseSubObjectPropertyOf(subObjectPropertyOf);
				if (result == null) result = caseObjectPropertyAxiom(subObjectPropertyOf);
				if (result == null) result = caseAxiom(subObjectPropertyOf);
				if (result == null) result = caseOWLBase(subObjectPropertyOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.SYMMETRIC_OBJECT_PROPERTY: {
				SymmetricObjectProperty symmetricObjectProperty = (SymmetricObjectProperty)theEObject;
				T result = caseSymmetricObjectProperty(symmetricObjectProperty);
				if (result == null) result = caseObjectPropertyAxiom(symmetricObjectProperty);
				if (result == null) result = caseAxiom(symmetricObjectProperty);
				if (result == null) result = caseOWLBase(symmetricObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.TRANSITIVE_OBJECT_PROPERTY: {
				TransitiveObjectProperty transitiveObjectProperty = (TransitiveObjectProperty)theEObject;
				T result = caseTransitiveObjectProperty(transitiveObjectProperty);
				if (result == null) result = caseObjectPropertyAxiom(transitiveObjectProperty);
				if (result == null) result = caseAxiom(transitiveObjectProperty);
				if (result == null) result = caseOWLBase(transitiveObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLModelPackage.OWL_BASE: {
				OWLBase owlBase = (OWLBase)theEObject;
				T result = caseOWLBase(owlBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abbreviated IRI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abbreviated IRI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbbreviatedIRI(AbbreviatedIRI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationAssertion(AnnotationAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationAxiom(AnnotationAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationProperty(AnnotationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Property Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationPropertyDomain(AnnotationPropertyDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Property Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationPropertyRange(AnnotationPropertyRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousIndividual(AnonymousIndividual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertion(Assertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asymmetric Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asymmetric Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsymmetricObjectProperty(AsymmetricObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxiom(Axiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.emftrace.metamodel.OWLModel.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassAssertion(ClassAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassAxiom(ClassAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassExpression(ClassExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data All Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data All Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAllValuesFrom(DataAllValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Complement Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Complement Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataComplementOf(DataComplementOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Exact Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Exact Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataExactCardinality(DataExactCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Has Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataHasValue(DataHasValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Intersection Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Intersection Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataIntersectionOf(DataIntersectionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Max Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Max Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataMaxCardinality(DataMaxCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Min Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Min Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataMinCardinality(DataMinCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data One Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data One Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataOneOf(DataOneOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataProperty(DataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyAssertion(DataPropertyAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyAxiom(DataPropertyAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyDomain(DataPropertyDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyExpression(DataPropertyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyRange(DataPropertyRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRange(DataRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Some Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Some Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSomeValuesFrom(DataSomeValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatype(Datatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDefinition(DatatypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeRestriction(DatatypeRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Union Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Union Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataUnionOf(DataUnionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Different Individuals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Different Individuals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifferentIndividuals(DifferentIndividuals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjoint Classes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjoint Classes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjointClasses(DisjointClasses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjoint Data Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjoint Data Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjointDataProperties(DisjointDataProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjoint Object Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjoint Object Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjointObjectProperties(DisjointObjectProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjoint Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjointUnion(DisjointUnion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalent Classes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalent Classes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalentClasses(EquivalentClasses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalent Data Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalent Data Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalentDataProperties(EquivalentDataProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalent Object Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalent Object Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalentObjectProperties(EquivalentObjectProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facet Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facet Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacetRestriction(FacetRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalDataProperty(FunctionalDataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalObjectProperty(FunctionalObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasKey(HasKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividual(Individual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverse Functional Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverse Functional Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverseFunctionalObjectProperty(InverseFunctionalObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverse Object Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverse Object Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverseObjectProperties(InverseObjectProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRI(IRI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Irreflexive Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Irreflexive Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIrreflexiveObjectProperty(IrreflexiveObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedIndividual(NamedIndividual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Data Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Data Property Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeDataPropertyAssertion(NegativeDataPropertyAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Object Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Object Property Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeObjectPropertyAssertion(NegativeObjectPropertyAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object All Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object All Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectAllValuesFrom(ObjectAllValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Complement Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Complement Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectComplementOf(ObjectComplementOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Exact Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Exact Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectExactCardinality(ObjectExactCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Has Self</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Has Self</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectHasSelf(ObjectHasSelf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Has Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectHasValue(ObjectHasValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Intersection Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Intersection Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectIntersectionOf(ObjectIntersectionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Inverse Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Inverse Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectInverseOf(ObjectInverseOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Max Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Max Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectMaxCardinality(ObjectMaxCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Min Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Min Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectMinCardinality(ObjectMinCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object One Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object One Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectOneOf(ObjectOneOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectProperty(ObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyAssertion(ObjectPropertyAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyAxiom(ObjectPropertyAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyChain(ObjectPropertyChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyDomain(ObjectPropertyDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyExpression(ObjectPropertyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyRange(ObjectPropertyRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Some Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Some Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectSomeValuesFrom(ObjectSomeValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Union Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Union Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectUnionOf(ObjectUnionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntology(Ontology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrefix(Prefix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflexive Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflexive Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflexiveObjectProperty(ReflexiveObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Same Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Same Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSameIndividual(SameIndividual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Annotation Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Annotation Property Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubAnnotationPropertyOf(SubAnnotationPropertyOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Class Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubClassOf(SubClassOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Data Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Data Property Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubDataPropertyOf(SubDataPropertyOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Object Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Object Property Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubObjectPropertyOf(SubObjectPropertyOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symmetric Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symmetric Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymmetricObjectProperty(SymmetricObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transitive Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transitive Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitiveObjectProperty(TransitiveObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OWL Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OWL Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWLBase(OWLBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OWLModelSwitch
