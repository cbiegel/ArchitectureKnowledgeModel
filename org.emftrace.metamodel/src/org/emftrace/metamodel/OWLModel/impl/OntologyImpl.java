/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

import org.emftrace.metamodel.OWLModel.Annotation;
import org.emftrace.metamodel.OWLModel.AnnotationAssertion;
import org.emftrace.metamodel.OWLModel.AnnotationPropertyDomain;
import org.emftrace.metamodel.OWLModel.AnnotationPropertyRange;
import org.emftrace.metamodel.OWLModel.AsymmetricObjectProperty;
import org.emftrace.metamodel.OWLModel.ClassAssertion;
import org.emftrace.metamodel.OWLModel.DataPropertyAssertion;
import org.emftrace.metamodel.OWLModel.DataPropertyDomain;
import org.emftrace.metamodel.OWLModel.DataPropertyRange;
import org.emftrace.metamodel.OWLModel.DatatypeDefinition;
import org.emftrace.metamodel.OWLModel.Declaration;
import org.emftrace.metamodel.OWLModel.DifferentIndividuals;
import org.emftrace.metamodel.OWLModel.DisjointClasses;
import org.emftrace.metamodel.OWLModel.DisjointDataProperties;
import org.emftrace.metamodel.OWLModel.DisjointObjectProperties;
import org.emftrace.metamodel.OWLModel.DisjointUnion;
import org.emftrace.metamodel.OWLModel.EquivalentClasses;
import org.emftrace.metamodel.OWLModel.EquivalentDataProperties;
import org.emftrace.metamodel.OWLModel.EquivalentObjectProperties;
import org.emftrace.metamodel.OWLModel.FunctionalDataProperty;
import org.emftrace.metamodel.OWLModel.FunctionalObjectProperty;
import org.emftrace.metamodel.OWLModel.HasKey;
import org.emftrace.metamodel.OWLModel.Import;
import org.emftrace.metamodel.OWLModel.InverseFunctionalObjectProperty;
import org.emftrace.metamodel.OWLModel.InverseObjectProperties;
import org.emftrace.metamodel.OWLModel.IrreflexiveObjectProperty;
import org.emftrace.metamodel.OWLModel.NegativeDataPropertyAssertion;
import org.emftrace.metamodel.OWLModel.NegativeObjectPropertyAssertion;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;
import org.emftrace.metamodel.OWLModel.ObjectPropertyAssertion;
import org.emftrace.metamodel.OWLModel.ObjectPropertyDomain;
import org.emftrace.metamodel.OWLModel.ObjectPropertyRange;
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
 * An implementation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getSubClassOf <em>Sub Class Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getEquivalentClasses <em>Equivalent Classes</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getDisjointClasses <em>Disjoint Classes</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getDisjointUnion <em>Disjoint Union</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getSubObjectPropertyOf <em>Sub Object Property Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getEquivalentObjectProperties <em>Equivalent Object Properties</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getDisjointObjectProperties <em>Disjoint Object Properties</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getInverseObjectProperties <em>Inverse Object Properties</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getObjectPropertyDomain <em>Object Property Domain</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getObjectPropertyRange <em>Object Property Range</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getFunctionalObjectProperty <em>Functional Object Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getInverseFunctionalObjectProperty <em>Inverse Functional Object Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getReflexiveObjectProperty <em>Reflexive Object Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getIrreflexiveObjectProperty <em>Irreflexive Object Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getSymmetricObjectProperty <em>Symmetric Object Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getAsymmetricObjectProperty <em>Asymmetric Object Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getTransitiveObjectProperty <em>Transitive Object Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getSubDataPropertyOf <em>Sub Data Property Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getEquivalentDataProperties <em>Equivalent Data Properties</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getDisjointDataProperties <em>Disjoint Data Properties</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getDataPropertyDomain <em>Data Property Domain</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getDataPropertyRange <em>Data Property Range</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getFunctionalDataProperty <em>Functional Data Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getDatatypeDefinition <em>Datatype Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getHasKey <em>Has Key</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getSameIndividual <em>Same Individual</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getDifferentIndividuals <em>Different Individuals</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getClassAssertion <em>Class Assertion</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getObjectPropertyAssertion <em>Object Property Assertion</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getNegativeObjectPropertyAssertion <em>Negative Object Property Assertion</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getDataPropertyAssertion <em>Data Property Assertion</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getNegativeDataPropertyAssertion <em>Negative Data Property Assertion</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getAnnotationAssertion <em>Annotation Assertion</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getSubAnnotationPropertyOf <em>Sub Annotation Property Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getAnnotationPropertyDomain <em>Annotation Property Domain</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getAnnotationPropertyRange <em>Annotation Property Range</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getOntologyIRI <em>Ontology IRI</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.OntologyImpl#getVersionIRI <em>Version IRI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OntologyImpl extends OWLBaseImpl implements Ontology {
	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected EList<Prefix> prefix;

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> import_;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotation;

	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declaration;

	/**
	 * The cached value of the '{@link #getSubClassOf() <em>Sub Class Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClassOf()
	 * @generated
	 * @ordered
	 */
	protected EList<SubClassOf> subClassOf;

	/**
	 * The cached value of the '{@link #getEquivalentClasses() <em>Equivalent Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<EquivalentClasses> equivalentClasses;

	/**
	 * The cached value of the '{@link #getDisjointClasses() <em>Disjoint Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<DisjointClasses> disjointClasses;

	/**
	 * The cached value of the '{@link #getDisjointUnion() <em>Disjoint Union</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointUnion()
	 * @generated
	 * @ordered
	 */
	protected EList<DisjointUnion> disjointUnion;

	/**
	 * The cached value of the '{@link #getSubObjectPropertyOf() <em>Sub Object Property Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubObjectPropertyOf()
	 * @generated
	 * @ordered
	 */
	protected EList<SubObjectPropertyOf> subObjectPropertyOf;

	/**
	 * The cached value of the '{@link #getEquivalentObjectProperties() <em>Equivalent Object Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentObjectProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<EquivalentObjectProperties> equivalentObjectProperties;

	/**
	 * The cached value of the '{@link #getDisjointObjectProperties() <em>Disjoint Object Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointObjectProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DisjointObjectProperties> disjointObjectProperties;

	/**
	 * The cached value of the '{@link #getInverseObjectProperties() <em>Inverse Object Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseObjectProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<InverseObjectProperties> inverseObjectProperties;

	/**
	 * The cached value of the '{@link #getObjectPropertyDomain() <em>Object Property Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectPropertyDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectPropertyDomain> objectPropertyDomain;

	/**
	 * The cached value of the '{@link #getObjectPropertyRange() <em>Object Property Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectPropertyRange()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectPropertyRange> objectPropertyRange;

	/**
	 * The cached value of the '{@link #getFunctionalObjectProperty() <em>Functional Object Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalObjectProperty> functionalObjectProperty;

	/**
	 * The cached value of the '{@link #getInverseFunctionalObjectProperty() <em>Inverse Functional Object Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseFunctionalObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<InverseFunctionalObjectProperty> inverseFunctionalObjectProperty;

	/**
	 * The cached value of the '{@link #getReflexiveObjectProperty() <em>Reflexive Object Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflexiveObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ReflexiveObjectProperty> reflexiveObjectProperty;

	/**
	 * The cached value of the '{@link #getIrreflexiveObjectProperty() <em>Irreflexive Object Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrreflexiveObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<IrreflexiveObjectProperty> irreflexiveObjectProperty;

	/**
	 * The cached value of the '{@link #getSymmetricObjectProperty() <em>Symmetric Object Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetricObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<SymmetricObjectProperty> symmetricObjectProperty;

	/**
	 * The cached value of the '{@link #getAsymmetricObjectProperty() <em>Asymmetric Object Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsymmetricObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<AsymmetricObjectProperty> asymmetricObjectProperty;

	/**
	 * The cached value of the '{@link #getTransitiveObjectProperty() <em>Transitive Object Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitiveObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<TransitiveObjectProperty> transitiveObjectProperty;

	/**
	 * The cached value of the '{@link #getSubDataPropertyOf() <em>Sub Data Property Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDataPropertyOf()
	 * @generated
	 * @ordered
	 */
	protected EList<SubDataPropertyOf> subDataPropertyOf;

	/**
	 * The cached value of the '{@link #getEquivalentDataProperties() <em>Equivalent Data Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentDataProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<EquivalentDataProperties> equivalentDataProperties;

	/**
	 * The cached value of the '{@link #getDisjointDataProperties() <em>Disjoint Data Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointDataProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DisjointDataProperties> disjointDataProperties;

	/**
	 * The cached value of the '{@link #getDataPropertyDomain() <em>Data Property Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPropertyDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPropertyDomain> dataPropertyDomain;

	/**
	 * The cached value of the '{@link #getDataPropertyRange() <em>Data Property Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPropertyRange()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPropertyRange> dataPropertyRange;

	/**
	 * The cached value of the '{@link #getFunctionalDataProperty() <em>Functional Data Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalDataProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalDataProperty> functionalDataProperty;

	/**
	 * The cached value of the '{@link #getDatatypeDefinition() <em>Datatype Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeDefinition> datatypeDefinition;

	/**
	 * The cached value of the '{@link #getHasKey() <em>Has Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasKey()
	 * @generated
	 * @ordered
	 */
	protected EList<HasKey> hasKey;

	/**
	 * The cached value of the '{@link #getSameIndividual() <em>Same Individual</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameIndividual()
	 * @generated
	 * @ordered
	 */
	protected EList<SameIndividual> sameIndividual;

	/**
	 * The cached value of the '{@link #getDifferentIndividuals() <em>Different Individuals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifferentIndividuals()
	 * @generated
	 * @ordered
	 */
	protected EList<DifferentIndividuals> differentIndividuals;

	/**
	 * The cached value of the '{@link #getClassAssertion() <em>Class Assertion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassAssertion()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassAssertion> classAssertion;

	/**
	 * The cached value of the '{@link #getObjectPropertyAssertion() <em>Object Property Assertion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectPropertyAssertion()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectPropertyAssertion> objectPropertyAssertion;

	/**
	 * The cached value of the '{@link #getNegativeObjectPropertyAssertion() <em>Negative Object Property Assertion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeObjectPropertyAssertion()
	 * @generated
	 * @ordered
	 */
	protected EList<NegativeObjectPropertyAssertion> negativeObjectPropertyAssertion;

	/**
	 * The cached value of the '{@link #getDataPropertyAssertion() <em>Data Property Assertion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPropertyAssertion()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPropertyAssertion> dataPropertyAssertion;

	/**
	 * The cached value of the '{@link #getNegativeDataPropertyAssertion() <em>Negative Data Property Assertion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeDataPropertyAssertion()
	 * @generated
	 * @ordered
	 */
	protected EList<NegativeDataPropertyAssertion> negativeDataPropertyAssertion;

	/**
	 * The cached value of the '{@link #getAnnotationAssertion() <em>Annotation Assertion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationAssertion()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationAssertion> annotationAssertion;

	/**
	 * The cached value of the '{@link #getSubAnnotationPropertyOf() <em>Sub Annotation Property Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubAnnotationPropertyOf()
	 * @generated
	 * @ordered
	 */
	protected EList<SubAnnotationPropertyOf> subAnnotationPropertyOf;

	/**
	 * The cached value of the '{@link #getAnnotationPropertyDomain() <em>Annotation Property Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationPropertyDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationPropertyDomain> annotationPropertyDomain;

	/**
	 * The cached value of the '{@link #getAnnotationPropertyRange() <em>Annotation Property Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationPropertyRange()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationPropertyRange> annotationPropertyRange;

	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected String base = BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getOntologyIRI() <em>Ontology IRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologyIRI()
	 * @generated
	 * @ordered
	 */
	protected static final String ONTOLOGY_IRI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOntologyIRI() <em>Ontology IRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologyIRI()
	 * @generated
	 * @ordered
	 */
	protected String ontologyIRI = ONTOLOGY_IRI_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected static final SpaceType SPACE_EDEFAULT = SpaceType.DEFAULT_LITERAL;

	/**
	 * The cached value of the '{@link #getSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected SpaceType space = SPACE_EDEFAULT;

	/**
	 * This is true if the Space attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spaceESet;

	/**
	 * The default value of the '{@link #getVersionIRI() <em>Version IRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionIRI()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_IRI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionIRI() <em>Version IRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionIRI()
	 * @generated
	 * @ordered
	 */
	protected String versionIRI = VERSION_IRI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getOntology();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Prefix> getPrefix() {
		if (prefix == null) {
			prefix = new EObjectContainmentEList<Prefix>(Prefix.class, this, OWLModelPackage.ONTOLOGY__PREFIX);
		}
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<Import>(Import.class, this, OWLModelPackage.ONTOLOGY__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, OWLModelPackage.ONTOLOGY__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclaration() {
		if (declaration == null) {
			declaration = new EObjectContainmentEList<Declaration>(Declaration.class, this, OWLModelPackage.ONTOLOGY__DECLARATION);
		}
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubClassOf> getSubClassOf() {
		if (subClassOf == null) {
			subClassOf = new EObjectContainmentEList<SubClassOf>(SubClassOf.class, this, OWLModelPackage.ONTOLOGY__SUB_CLASS_OF);
		}
		return subClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquivalentClasses> getEquivalentClasses() {
		if (equivalentClasses == null) {
			equivalentClasses = new EObjectContainmentEList<EquivalentClasses>(EquivalentClasses.class, this, OWLModelPackage.ONTOLOGY__EQUIVALENT_CLASSES);
		}
		return equivalentClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisjointClasses> getDisjointClasses() {
		if (disjointClasses == null) {
			disjointClasses = new EObjectContainmentEList<DisjointClasses>(DisjointClasses.class, this, OWLModelPackage.ONTOLOGY__DISJOINT_CLASSES);
		}
		return disjointClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisjointUnion> getDisjointUnion() {
		if (disjointUnion == null) {
			disjointUnion = new EObjectContainmentEList<DisjointUnion>(DisjointUnion.class, this, OWLModelPackage.ONTOLOGY__DISJOINT_UNION);
		}
		return disjointUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubObjectPropertyOf> getSubObjectPropertyOf() {
		if (subObjectPropertyOf == null) {
			subObjectPropertyOf = new EObjectContainmentEList<SubObjectPropertyOf>(SubObjectPropertyOf.class, this, OWLModelPackage.ONTOLOGY__SUB_OBJECT_PROPERTY_OF);
		}
		return subObjectPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquivalentObjectProperties> getEquivalentObjectProperties() {
		if (equivalentObjectProperties == null) {
			equivalentObjectProperties = new EObjectContainmentEList<EquivalentObjectProperties>(EquivalentObjectProperties.class, this, OWLModelPackage.ONTOLOGY__EQUIVALENT_OBJECT_PROPERTIES);
		}
		return equivalentObjectProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisjointObjectProperties> getDisjointObjectProperties() {
		if (disjointObjectProperties == null) {
			disjointObjectProperties = new EObjectContainmentEList<DisjointObjectProperties>(DisjointObjectProperties.class, this, OWLModelPackage.ONTOLOGY__DISJOINT_OBJECT_PROPERTIES);
		}
		return disjointObjectProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InverseObjectProperties> getInverseObjectProperties() {
		if (inverseObjectProperties == null) {
			inverseObjectProperties = new EObjectContainmentEList<InverseObjectProperties>(InverseObjectProperties.class, this, OWLModelPackage.ONTOLOGY__INVERSE_OBJECT_PROPERTIES);
		}
		return inverseObjectProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectPropertyDomain> getObjectPropertyDomain() {
		if (objectPropertyDomain == null) {
			objectPropertyDomain = new EObjectContainmentEList<ObjectPropertyDomain>(ObjectPropertyDomain.class, this, OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_DOMAIN);
		}
		return objectPropertyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectPropertyRange> getObjectPropertyRange() {
		if (objectPropertyRange == null) {
			objectPropertyRange = new EObjectContainmentEList<ObjectPropertyRange>(ObjectPropertyRange.class, this, OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_RANGE);
		}
		return objectPropertyRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalObjectProperty> getFunctionalObjectProperty() {
		if (functionalObjectProperty == null) {
			functionalObjectProperty = new EObjectContainmentEList<FunctionalObjectProperty>(FunctionalObjectProperty.class, this, OWLModelPackage.ONTOLOGY__FUNCTIONAL_OBJECT_PROPERTY);
		}
		return functionalObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InverseFunctionalObjectProperty> getInverseFunctionalObjectProperty() {
		if (inverseFunctionalObjectProperty == null) {
			inverseFunctionalObjectProperty = new EObjectContainmentEList<InverseFunctionalObjectProperty>(InverseFunctionalObjectProperty.class, this, OWLModelPackage.ONTOLOGY__INVERSE_FUNCTIONAL_OBJECT_PROPERTY);
		}
		return inverseFunctionalObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReflexiveObjectProperty> getReflexiveObjectProperty() {
		if (reflexiveObjectProperty == null) {
			reflexiveObjectProperty = new EObjectContainmentEList<ReflexiveObjectProperty>(ReflexiveObjectProperty.class, this, OWLModelPackage.ONTOLOGY__REFLEXIVE_OBJECT_PROPERTY);
		}
		return reflexiveObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IrreflexiveObjectProperty> getIrreflexiveObjectProperty() {
		if (irreflexiveObjectProperty == null) {
			irreflexiveObjectProperty = new EObjectContainmentEList<IrreflexiveObjectProperty>(IrreflexiveObjectProperty.class, this, OWLModelPackage.ONTOLOGY__IRREFLEXIVE_OBJECT_PROPERTY);
		}
		return irreflexiveObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SymmetricObjectProperty> getSymmetricObjectProperty() {
		if (symmetricObjectProperty == null) {
			symmetricObjectProperty = new EObjectContainmentEList<SymmetricObjectProperty>(SymmetricObjectProperty.class, this, OWLModelPackage.ONTOLOGY__SYMMETRIC_OBJECT_PROPERTY);
		}
		return symmetricObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AsymmetricObjectProperty> getAsymmetricObjectProperty() {
		if (asymmetricObjectProperty == null) {
			asymmetricObjectProperty = new EObjectContainmentEList<AsymmetricObjectProperty>(AsymmetricObjectProperty.class, this, OWLModelPackage.ONTOLOGY__ASYMMETRIC_OBJECT_PROPERTY);
		}
		return asymmetricObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransitiveObjectProperty> getTransitiveObjectProperty() {
		if (transitiveObjectProperty == null) {
			transitiveObjectProperty = new EObjectContainmentEList<TransitiveObjectProperty>(TransitiveObjectProperty.class, this, OWLModelPackage.ONTOLOGY__TRANSITIVE_OBJECT_PROPERTY);
		}
		return transitiveObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubDataPropertyOf> getSubDataPropertyOf() {
		if (subDataPropertyOf == null) {
			subDataPropertyOf = new EObjectContainmentEList<SubDataPropertyOf>(SubDataPropertyOf.class, this, OWLModelPackage.ONTOLOGY__SUB_DATA_PROPERTY_OF);
		}
		return subDataPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquivalentDataProperties> getEquivalentDataProperties() {
		if (equivalentDataProperties == null) {
			equivalentDataProperties = new EObjectContainmentEList<EquivalentDataProperties>(EquivalentDataProperties.class, this, OWLModelPackage.ONTOLOGY__EQUIVALENT_DATA_PROPERTIES);
		}
		return equivalentDataProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisjointDataProperties> getDisjointDataProperties() {
		if (disjointDataProperties == null) {
			disjointDataProperties = new EObjectContainmentEList<DisjointDataProperties>(DisjointDataProperties.class, this, OWLModelPackage.ONTOLOGY__DISJOINT_DATA_PROPERTIES);
		}
		return disjointDataProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPropertyDomain> getDataPropertyDomain() {
		if (dataPropertyDomain == null) {
			dataPropertyDomain = new EObjectContainmentEList<DataPropertyDomain>(DataPropertyDomain.class, this, OWLModelPackage.ONTOLOGY__DATA_PROPERTY_DOMAIN);
		}
		return dataPropertyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPropertyRange> getDataPropertyRange() {
		if (dataPropertyRange == null) {
			dataPropertyRange = new EObjectContainmentEList<DataPropertyRange>(DataPropertyRange.class, this, OWLModelPackage.ONTOLOGY__DATA_PROPERTY_RANGE);
		}
		return dataPropertyRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalDataProperty> getFunctionalDataProperty() {
		if (functionalDataProperty == null) {
			functionalDataProperty = new EObjectContainmentEList<FunctionalDataProperty>(FunctionalDataProperty.class, this, OWLModelPackage.ONTOLOGY__FUNCTIONAL_DATA_PROPERTY);
		}
		return functionalDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDefinition> getDatatypeDefinition() {
		if (datatypeDefinition == null) {
			datatypeDefinition = new EObjectContainmentEList<DatatypeDefinition>(DatatypeDefinition.class, this, OWLModelPackage.ONTOLOGY__DATATYPE_DEFINITION);
		}
		return datatypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HasKey> getHasKey() {
		if (hasKey == null) {
			hasKey = new EObjectContainmentEList<HasKey>(HasKey.class, this, OWLModelPackage.ONTOLOGY__HAS_KEY);
		}
		return hasKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SameIndividual> getSameIndividual() {
		if (sameIndividual == null) {
			sameIndividual = new EObjectContainmentEList<SameIndividual>(SameIndividual.class, this, OWLModelPackage.ONTOLOGY__SAME_INDIVIDUAL);
		}
		return sameIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DifferentIndividuals> getDifferentIndividuals() {
		if (differentIndividuals == null) {
			differentIndividuals = new EObjectContainmentEList<DifferentIndividuals>(DifferentIndividuals.class, this, OWLModelPackage.ONTOLOGY__DIFFERENT_INDIVIDUALS);
		}
		return differentIndividuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassAssertion> getClassAssertion() {
		if (classAssertion == null) {
			classAssertion = new EObjectContainmentEList<ClassAssertion>(ClassAssertion.class, this, OWLModelPackage.ONTOLOGY__CLASS_ASSERTION);
		}
		return classAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectPropertyAssertion> getObjectPropertyAssertion() {
		if (objectPropertyAssertion == null) {
			objectPropertyAssertion = new EObjectContainmentEList<ObjectPropertyAssertion>(ObjectPropertyAssertion.class, this, OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_ASSERTION);
		}
		return objectPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NegativeObjectPropertyAssertion> getNegativeObjectPropertyAssertion() {
		if (negativeObjectPropertyAssertion == null) {
			negativeObjectPropertyAssertion = new EObjectContainmentEList<NegativeObjectPropertyAssertion>(NegativeObjectPropertyAssertion.class, this, OWLModelPackage.ONTOLOGY__NEGATIVE_OBJECT_PROPERTY_ASSERTION);
		}
		return negativeObjectPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPropertyAssertion> getDataPropertyAssertion() {
		if (dataPropertyAssertion == null) {
			dataPropertyAssertion = new EObjectContainmentEList<DataPropertyAssertion>(DataPropertyAssertion.class, this, OWLModelPackage.ONTOLOGY__DATA_PROPERTY_ASSERTION);
		}
		return dataPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NegativeDataPropertyAssertion> getNegativeDataPropertyAssertion() {
		if (negativeDataPropertyAssertion == null) {
			negativeDataPropertyAssertion = new EObjectContainmentEList<NegativeDataPropertyAssertion>(NegativeDataPropertyAssertion.class, this, OWLModelPackage.ONTOLOGY__NEGATIVE_DATA_PROPERTY_ASSERTION);
		}
		return negativeDataPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationAssertion> getAnnotationAssertion() {
		if (annotationAssertion == null) {
			annotationAssertion = new EObjectContainmentEList<AnnotationAssertion>(AnnotationAssertion.class, this, OWLModelPackage.ONTOLOGY__ANNOTATION_ASSERTION);
		}
		return annotationAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubAnnotationPropertyOf> getSubAnnotationPropertyOf() {
		if (subAnnotationPropertyOf == null) {
			subAnnotationPropertyOf = new EObjectContainmentEList<SubAnnotationPropertyOf>(SubAnnotationPropertyOf.class, this, OWLModelPackage.ONTOLOGY__SUB_ANNOTATION_PROPERTY_OF);
		}
		return subAnnotationPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationPropertyDomain> getAnnotationPropertyDomain() {
		if (annotationPropertyDomain == null) {
			annotationPropertyDomain = new EObjectContainmentEList<AnnotationPropertyDomain>(AnnotationPropertyDomain.class, this, OWLModelPackage.ONTOLOGY__ANNOTATION_PROPERTY_DOMAIN);
		}
		return annotationPropertyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationPropertyRange> getAnnotationPropertyRange() {
		if (annotationPropertyRange == null) {
			annotationPropertyRange = new EObjectContainmentEList<AnnotationPropertyRange>(AnnotationPropertyRange.class, this, OWLModelPackage.ONTOLOGY__ANNOTATION_PROPERTY_RANGE);
		}
		return annotationPropertyRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(String newBase) {
		String oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.ONTOLOGY__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.ONTOLOGY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.ONTOLOGY__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOntologyIRI() {
		return ontologyIRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntologyIRI(String newOntologyIRI) {
		String oldOntologyIRI = ontologyIRI;
		ontologyIRI = newOntologyIRI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.ONTOLOGY__ONTOLOGY_IRI, oldOntologyIRI, ontologyIRI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceType getSpace() {
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpace(SpaceType newSpace) {
		SpaceType oldSpace = space;
		space = newSpace == null ? SPACE_EDEFAULT : newSpace;
		boolean oldSpaceESet = spaceESet;
		spaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.ONTOLOGY__SPACE, oldSpace, space, !oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpace() {
		SpaceType oldSpace = space;
		boolean oldSpaceESet = spaceESet;
		space = SPACE_EDEFAULT;
		spaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OWLModelPackage.ONTOLOGY__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpace() {
		return spaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionIRI() {
		return versionIRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionIRI(String newVersionIRI) {
		String oldVersionIRI = versionIRI;
		versionIRI = newVersionIRI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.ONTOLOGY__VERSION_IRI, oldVersionIRI, versionIRI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.ONTOLOGY__PREFIX:
				return ((InternalEList<?>)getPrefix()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__DECLARATION:
				return ((InternalEList<?>)getDeclaration()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__SUB_CLASS_OF:
				return ((InternalEList<?>)getSubClassOf()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_CLASSES:
				return ((InternalEList<?>)getEquivalentClasses()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__DISJOINT_CLASSES:
				return ((InternalEList<?>)getDisjointClasses()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__DISJOINT_UNION:
				return ((InternalEList<?>)getDisjointUnion()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__SUB_OBJECT_PROPERTY_OF:
				return ((InternalEList<?>)getSubObjectPropertyOf()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_OBJECT_PROPERTIES:
				return ((InternalEList<?>)getEquivalentObjectProperties()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__DISJOINT_OBJECT_PROPERTIES:
				return ((InternalEList<?>)getDisjointObjectProperties()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__INVERSE_OBJECT_PROPERTIES:
				return ((InternalEList<?>)getInverseObjectProperties()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_DOMAIN:
				return ((InternalEList<?>)getObjectPropertyDomain()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_RANGE:
				return ((InternalEList<?>)getObjectPropertyRange()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__FUNCTIONAL_OBJECT_PROPERTY:
				return ((InternalEList<?>)getFunctionalObjectProperty()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__INVERSE_FUNCTIONAL_OBJECT_PROPERTY:
				return ((InternalEList<?>)getInverseFunctionalObjectProperty()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__REFLEXIVE_OBJECT_PROPERTY:
				return ((InternalEList<?>)getReflexiveObjectProperty()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__IRREFLEXIVE_OBJECT_PROPERTY:
				return ((InternalEList<?>)getIrreflexiveObjectProperty()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__SYMMETRIC_OBJECT_PROPERTY:
				return ((InternalEList<?>)getSymmetricObjectProperty()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__ASYMMETRIC_OBJECT_PROPERTY:
				return ((InternalEList<?>)getAsymmetricObjectProperty()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__TRANSITIVE_OBJECT_PROPERTY:
				return ((InternalEList<?>)getTransitiveObjectProperty()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__SUB_DATA_PROPERTY_OF:
				return ((InternalEList<?>)getSubDataPropertyOf()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_DATA_PROPERTIES:
				return ((InternalEList<?>)getEquivalentDataProperties()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__DISJOINT_DATA_PROPERTIES:
				return ((InternalEList<?>)getDisjointDataProperties()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_DOMAIN:
				return ((InternalEList<?>)getDataPropertyDomain()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_RANGE:
				return ((InternalEList<?>)getDataPropertyRange()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__FUNCTIONAL_DATA_PROPERTY:
				return ((InternalEList<?>)getFunctionalDataProperty()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__DATATYPE_DEFINITION:
				return ((InternalEList<?>)getDatatypeDefinition()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__HAS_KEY:
				return ((InternalEList<?>)getHasKey()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__SAME_INDIVIDUAL:
				return ((InternalEList<?>)getSameIndividual()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__DIFFERENT_INDIVIDUALS:
				return ((InternalEList<?>)getDifferentIndividuals()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__CLASS_ASSERTION:
				return ((InternalEList<?>)getClassAssertion()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_ASSERTION:
				return ((InternalEList<?>)getObjectPropertyAssertion()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__NEGATIVE_OBJECT_PROPERTY_ASSERTION:
				return ((InternalEList<?>)getNegativeObjectPropertyAssertion()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_ASSERTION:
				return ((InternalEList<?>)getDataPropertyAssertion()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__NEGATIVE_DATA_PROPERTY_ASSERTION:
				return ((InternalEList<?>)getNegativeDataPropertyAssertion()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__ANNOTATION_ASSERTION:
				return ((InternalEList<?>)getAnnotationAssertion()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__SUB_ANNOTATION_PROPERTY_OF:
				return ((InternalEList<?>)getSubAnnotationPropertyOf()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__ANNOTATION_PROPERTY_DOMAIN:
				return ((InternalEList<?>)getAnnotationPropertyDomain()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.ONTOLOGY__ANNOTATION_PROPERTY_RANGE:
				return ((InternalEList<?>)getAnnotationPropertyRange()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OWLModelPackage.ONTOLOGY__PREFIX:
				return getPrefix();
			case OWLModelPackage.ONTOLOGY__IMPORT:
				return getImport();
			case OWLModelPackage.ONTOLOGY__ANNOTATION:
				return getAnnotation();
			case OWLModelPackage.ONTOLOGY__DECLARATION:
				return getDeclaration();
			case OWLModelPackage.ONTOLOGY__SUB_CLASS_OF:
				return getSubClassOf();
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_CLASSES:
				return getEquivalentClasses();
			case OWLModelPackage.ONTOLOGY__DISJOINT_CLASSES:
				return getDisjointClasses();
			case OWLModelPackage.ONTOLOGY__DISJOINT_UNION:
				return getDisjointUnion();
			case OWLModelPackage.ONTOLOGY__SUB_OBJECT_PROPERTY_OF:
				return getSubObjectPropertyOf();
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_OBJECT_PROPERTIES:
				return getEquivalentObjectProperties();
			case OWLModelPackage.ONTOLOGY__DISJOINT_OBJECT_PROPERTIES:
				return getDisjointObjectProperties();
			case OWLModelPackage.ONTOLOGY__INVERSE_OBJECT_PROPERTIES:
				return getInverseObjectProperties();
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_DOMAIN:
				return getObjectPropertyDomain();
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_RANGE:
				return getObjectPropertyRange();
			case OWLModelPackage.ONTOLOGY__FUNCTIONAL_OBJECT_PROPERTY:
				return getFunctionalObjectProperty();
			case OWLModelPackage.ONTOLOGY__INVERSE_FUNCTIONAL_OBJECT_PROPERTY:
				return getInverseFunctionalObjectProperty();
			case OWLModelPackage.ONTOLOGY__REFLEXIVE_OBJECT_PROPERTY:
				return getReflexiveObjectProperty();
			case OWLModelPackage.ONTOLOGY__IRREFLEXIVE_OBJECT_PROPERTY:
				return getIrreflexiveObjectProperty();
			case OWLModelPackage.ONTOLOGY__SYMMETRIC_OBJECT_PROPERTY:
				return getSymmetricObjectProperty();
			case OWLModelPackage.ONTOLOGY__ASYMMETRIC_OBJECT_PROPERTY:
				return getAsymmetricObjectProperty();
			case OWLModelPackage.ONTOLOGY__TRANSITIVE_OBJECT_PROPERTY:
				return getTransitiveObjectProperty();
			case OWLModelPackage.ONTOLOGY__SUB_DATA_PROPERTY_OF:
				return getSubDataPropertyOf();
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_DATA_PROPERTIES:
				return getEquivalentDataProperties();
			case OWLModelPackage.ONTOLOGY__DISJOINT_DATA_PROPERTIES:
				return getDisjointDataProperties();
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_DOMAIN:
				return getDataPropertyDomain();
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_RANGE:
				return getDataPropertyRange();
			case OWLModelPackage.ONTOLOGY__FUNCTIONAL_DATA_PROPERTY:
				return getFunctionalDataProperty();
			case OWLModelPackage.ONTOLOGY__DATATYPE_DEFINITION:
				return getDatatypeDefinition();
			case OWLModelPackage.ONTOLOGY__HAS_KEY:
				return getHasKey();
			case OWLModelPackage.ONTOLOGY__SAME_INDIVIDUAL:
				return getSameIndividual();
			case OWLModelPackage.ONTOLOGY__DIFFERENT_INDIVIDUALS:
				return getDifferentIndividuals();
			case OWLModelPackage.ONTOLOGY__CLASS_ASSERTION:
				return getClassAssertion();
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_ASSERTION:
				return getObjectPropertyAssertion();
			case OWLModelPackage.ONTOLOGY__NEGATIVE_OBJECT_PROPERTY_ASSERTION:
				return getNegativeObjectPropertyAssertion();
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_ASSERTION:
				return getDataPropertyAssertion();
			case OWLModelPackage.ONTOLOGY__NEGATIVE_DATA_PROPERTY_ASSERTION:
				return getNegativeDataPropertyAssertion();
			case OWLModelPackage.ONTOLOGY__ANNOTATION_ASSERTION:
				return getAnnotationAssertion();
			case OWLModelPackage.ONTOLOGY__SUB_ANNOTATION_PROPERTY_OF:
				return getSubAnnotationPropertyOf();
			case OWLModelPackage.ONTOLOGY__ANNOTATION_PROPERTY_DOMAIN:
				return getAnnotationPropertyDomain();
			case OWLModelPackage.ONTOLOGY__ANNOTATION_PROPERTY_RANGE:
				return getAnnotationPropertyRange();
			case OWLModelPackage.ONTOLOGY__BASE:
				return getBase();
			case OWLModelPackage.ONTOLOGY__ID:
				return getId();
			case OWLModelPackage.ONTOLOGY__LANG:
				return getLang();
			case OWLModelPackage.ONTOLOGY__ONTOLOGY_IRI:
				return getOntologyIRI();
			case OWLModelPackage.ONTOLOGY__SPACE:
				return getSpace();
			case OWLModelPackage.ONTOLOGY__VERSION_IRI:
				return getVersionIRI();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OWLModelPackage.ONTOLOGY__PREFIX:
				getPrefix().clear();
				getPrefix().addAll((Collection<? extends Prefix>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends Import>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__DECLARATION:
				getDeclaration().clear();
				getDeclaration().addAll((Collection<? extends Declaration>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__SUB_CLASS_OF:
				getSubClassOf().clear();
				getSubClassOf().addAll((Collection<? extends SubClassOf>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_CLASSES:
				getEquivalentClasses().clear();
				getEquivalentClasses().addAll((Collection<? extends EquivalentClasses>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__DISJOINT_CLASSES:
				getDisjointClasses().clear();
				getDisjointClasses().addAll((Collection<? extends DisjointClasses>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__DISJOINT_UNION:
				getDisjointUnion().clear();
				getDisjointUnion().addAll((Collection<? extends DisjointUnion>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__SUB_OBJECT_PROPERTY_OF:
				getSubObjectPropertyOf().clear();
				getSubObjectPropertyOf().addAll((Collection<? extends SubObjectPropertyOf>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_OBJECT_PROPERTIES:
				getEquivalentObjectProperties().clear();
				getEquivalentObjectProperties().addAll((Collection<? extends EquivalentObjectProperties>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__DISJOINT_OBJECT_PROPERTIES:
				getDisjointObjectProperties().clear();
				getDisjointObjectProperties().addAll((Collection<? extends DisjointObjectProperties>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__INVERSE_OBJECT_PROPERTIES:
				getInverseObjectProperties().clear();
				getInverseObjectProperties().addAll((Collection<? extends InverseObjectProperties>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_DOMAIN:
				getObjectPropertyDomain().clear();
				getObjectPropertyDomain().addAll((Collection<? extends ObjectPropertyDomain>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_RANGE:
				getObjectPropertyRange().clear();
				getObjectPropertyRange().addAll((Collection<? extends ObjectPropertyRange>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__FUNCTIONAL_OBJECT_PROPERTY:
				getFunctionalObjectProperty().clear();
				getFunctionalObjectProperty().addAll((Collection<? extends FunctionalObjectProperty>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__INVERSE_FUNCTIONAL_OBJECT_PROPERTY:
				getInverseFunctionalObjectProperty().clear();
				getInverseFunctionalObjectProperty().addAll((Collection<? extends InverseFunctionalObjectProperty>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__REFLEXIVE_OBJECT_PROPERTY:
				getReflexiveObjectProperty().clear();
				getReflexiveObjectProperty().addAll((Collection<? extends ReflexiveObjectProperty>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__IRREFLEXIVE_OBJECT_PROPERTY:
				getIrreflexiveObjectProperty().clear();
				getIrreflexiveObjectProperty().addAll((Collection<? extends IrreflexiveObjectProperty>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__SYMMETRIC_OBJECT_PROPERTY:
				getSymmetricObjectProperty().clear();
				getSymmetricObjectProperty().addAll((Collection<? extends SymmetricObjectProperty>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__ASYMMETRIC_OBJECT_PROPERTY:
				getAsymmetricObjectProperty().clear();
				getAsymmetricObjectProperty().addAll((Collection<? extends AsymmetricObjectProperty>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__TRANSITIVE_OBJECT_PROPERTY:
				getTransitiveObjectProperty().clear();
				getTransitiveObjectProperty().addAll((Collection<? extends TransitiveObjectProperty>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__SUB_DATA_PROPERTY_OF:
				getSubDataPropertyOf().clear();
				getSubDataPropertyOf().addAll((Collection<? extends SubDataPropertyOf>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_DATA_PROPERTIES:
				getEquivalentDataProperties().clear();
				getEquivalentDataProperties().addAll((Collection<? extends EquivalentDataProperties>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__DISJOINT_DATA_PROPERTIES:
				getDisjointDataProperties().clear();
				getDisjointDataProperties().addAll((Collection<? extends DisjointDataProperties>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_DOMAIN:
				getDataPropertyDomain().clear();
				getDataPropertyDomain().addAll((Collection<? extends DataPropertyDomain>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_RANGE:
				getDataPropertyRange().clear();
				getDataPropertyRange().addAll((Collection<? extends DataPropertyRange>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__FUNCTIONAL_DATA_PROPERTY:
				getFunctionalDataProperty().clear();
				getFunctionalDataProperty().addAll((Collection<? extends FunctionalDataProperty>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__DATATYPE_DEFINITION:
				getDatatypeDefinition().clear();
				getDatatypeDefinition().addAll((Collection<? extends DatatypeDefinition>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__HAS_KEY:
				getHasKey().clear();
				getHasKey().addAll((Collection<? extends HasKey>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__SAME_INDIVIDUAL:
				getSameIndividual().clear();
				getSameIndividual().addAll((Collection<? extends SameIndividual>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__DIFFERENT_INDIVIDUALS:
				getDifferentIndividuals().clear();
				getDifferentIndividuals().addAll((Collection<? extends DifferentIndividuals>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__CLASS_ASSERTION:
				getClassAssertion().clear();
				getClassAssertion().addAll((Collection<? extends ClassAssertion>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_ASSERTION:
				getObjectPropertyAssertion().clear();
				getObjectPropertyAssertion().addAll((Collection<? extends ObjectPropertyAssertion>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__NEGATIVE_OBJECT_PROPERTY_ASSERTION:
				getNegativeObjectPropertyAssertion().clear();
				getNegativeObjectPropertyAssertion().addAll((Collection<? extends NegativeObjectPropertyAssertion>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_ASSERTION:
				getDataPropertyAssertion().clear();
				getDataPropertyAssertion().addAll((Collection<? extends DataPropertyAssertion>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__NEGATIVE_DATA_PROPERTY_ASSERTION:
				getNegativeDataPropertyAssertion().clear();
				getNegativeDataPropertyAssertion().addAll((Collection<? extends NegativeDataPropertyAssertion>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__ANNOTATION_ASSERTION:
				getAnnotationAssertion().clear();
				getAnnotationAssertion().addAll((Collection<? extends AnnotationAssertion>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__SUB_ANNOTATION_PROPERTY_OF:
				getSubAnnotationPropertyOf().clear();
				getSubAnnotationPropertyOf().addAll((Collection<? extends SubAnnotationPropertyOf>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__ANNOTATION_PROPERTY_DOMAIN:
				getAnnotationPropertyDomain().clear();
				getAnnotationPropertyDomain().addAll((Collection<? extends AnnotationPropertyDomain>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__ANNOTATION_PROPERTY_RANGE:
				getAnnotationPropertyRange().clear();
				getAnnotationPropertyRange().addAll((Collection<? extends AnnotationPropertyRange>)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__BASE:
				setBase((String)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__ID:
				setId((String)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__LANG:
				setLang((String)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__ONTOLOGY_IRI:
				setOntologyIRI((String)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__SPACE:
				setSpace((SpaceType)newValue);
				return;
			case OWLModelPackage.ONTOLOGY__VERSION_IRI:
				setVersionIRI((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OWLModelPackage.ONTOLOGY__PREFIX:
				getPrefix().clear();
				return;
			case OWLModelPackage.ONTOLOGY__IMPORT:
				getImport().clear();
				return;
			case OWLModelPackage.ONTOLOGY__ANNOTATION:
				getAnnotation().clear();
				return;
			case OWLModelPackage.ONTOLOGY__DECLARATION:
				getDeclaration().clear();
				return;
			case OWLModelPackage.ONTOLOGY__SUB_CLASS_OF:
				getSubClassOf().clear();
				return;
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_CLASSES:
				getEquivalentClasses().clear();
				return;
			case OWLModelPackage.ONTOLOGY__DISJOINT_CLASSES:
				getDisjointClasses().clear();
				return;
			case OWLModelPackage.ONTOLOGY__DISJOINT_UNION:
				getDisjointUnion().clear();
				return;
			case OWLModelPackage.ONTOLOGY__SUB_OBJECT_PROPERTY_OF:
				getSubObjectPropertyOf().clear();
				return;
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_OBJECT_PROPERTIES:
				getEquivalentObjectProperties().clear();
				return;
			case OWLModelPackage.ONTOLOGY__DISJOINT_OBJECT_PROPERTIES:
				getDisjointObjectProperties().clear();
				return;
			case OWLModelPackage.ONTOLOGY__INVERSE_OBJECT_PROPERTIES:
				getInverseObjectProperties().clear();
				return;
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_DOMAIN:
				getObjectPropertyDomain().clear();
				return;
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_RANGE:
				getObjectPropertyRange().clear();
				return;
			case OWLModelPackage.ONTOLOGY__FUNCTIONAL_OBJECT_PROPERTY:
				getFunctionalObjectProperty().clear();
				return;
			case OWLModelPackage.ONTOLOGY__INVERSE_FUNCTIONAL_OBJECT_PROPERTY:
				getInverseFunctionalObjectProperty().clear();
				return;
			case OWLModelPackage.ONTOLOGY__REFLEXIVE_OBJECT_PROPERTY:
				getReflexiveObjectProperty().clear();
				return;
			case OWLModelPackage.ONTOLOGY__IRREFLEXIVE_OBJECT_PROPERTY:
				getIrreflexiveObjectProperty().clear();
				return;
			case OWLModelPackage.ONTOLOGY__SYMMETRIC_OBJECT_PROPERTY:
				getSymmetricObjectProperty().clear();
				return;
			case OWLModelPackage.ONTOLOGY__ASYMMETRIC_OBJECT_PROPERTY:
				getAsymmetricObjectProperty().clear();
				return;
			case OWLModelPackage.ONTOLOGY__TRANSITIVE_OBJECT_PROPERTY:
				getTransitiveObjectProperty().clear();
				return;
			case OWLModelPackage.ONTOLOGY__SUB_DATA_PROPERTY_OF:
				getSubDataPropertyOf().clear();
				return;
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_DATA_PROPERTIES:
				getEquivalentDataProperties().clear();
				return;
			case OWLModelPackage.ONTOLOGY__DISJOINT_DATA_PROPERTIES:
				getDisjointDataProperties().clear();
				return;
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_DOMAIN:
				getDataPropertyDomain().clear();
				return;
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_RANGE:
				getDataPropertyRange().clear();
				return;
			case OWLModelPackage.ONTOLOGY__FUNCTIONAL_DATA_PROPERTY:
				getFunctionalDataProperty().clear();
				return;
			case OWLModelPackage.ONTOLOGY__DATATYPE_DEFINITION:
				getDatatypeDefinition().clear();
				return;
			case OWLModelPackage.ONTOLOGY__HAS_KEY:
				getHasKey().clear();
				return;
			case OWLModelPackage.ONTOLOGY__SAME_INDIVIDUAL:
				getSameIndividual().clear();
				return;
			case OWLModelPackage.ONTOLOGY__DIFFERENT_INDIVIDUALS:
				getDifferentIndividuals().clear();
				return;
			case OWLModelPackage.ONTOLOGY__CLASS_ASSERTION:
				getClassAssertion().clear();
				return;
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_ASSERTION:
				getObjectPropertyAssertion().clear();
				return;
			case OWLModelPackage.ONTOLOGY__NEGATIVE_OBJECT_PROPERTY_ASSERTION:
				getNegativeObjectPropertyAssertion().clear();
				return;
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_ASSERTION:
				getDataPropertyAssertion().clear();
				return;
			case OWLModelPackage.ONTOLOGY__NEGATIVE_DATA_PROPERTY_ASSERTION:
				getNegativeDataPropertyAssertion().clear();
				return;
			case OWLModelPackage.ONTOLOGY__ANNOTATION_ASSERTION:
				getAnnotationAssertion().clear();
				return;
			case OWLModelPackage.ONTOLOGY__SUB_ANNOTATION_PROPERTY_OF:
				getSubAnnotationPropertyOf().clear();
				return;
			case OWLModelPackage.ONTOLOGY__ANNOTATION_PROPERTY_DOMAIN:
				getAnnotationPropertyDomain().clear();
				return;
			case OWLModelPackage.ONTOLOGY__ANNOTATION_PROPERTY_RANGE:
				getAnnotationPropertyRange().clear();
				return;
			case OWLModelPackage.ONTOLOGY__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case OWLModelPackage.ONTOLOGY__ID:
				setId(ID_EDEFAULT);
				return;
			case OWLModelPackage.ONTOLOGY__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case OWLModelPackage.ONTOLOGY__ONTOLOGY_IRI:
				setOntologyIRI(ONTOLOGY_IRI_EDEFAULT);
				return;
			case OWLModelPackage.ONTOLOGY__SPACE:
				unsetSpace();
				return;
			case OWLModelPackage.ONTOLOGY__VERSION_IRI:
				setVersionIRI(VERSION_IRI_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OWLModelPackage.ONTOLOGY__PREFIX:
				return prefix != null && !prefix.isEmpty();
			case OWLModelPackage.ONTOLOGY__IMPORT:
				return import_ != null && !import_.isEmpty();
			case OWLModelPackage.ONTOLOGY__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case OWLModelPackage.ONTOLOGY__DECLARATION:
				return declaration != null && !declaration.isEmpty();
			case OWLModelPackage.ONTOLOGY__SUB_CLASS_OF:
				return subClassOf != null && !subClassOf.isEmpty();
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_CLASSES:
				return equivalentClasses != null && !equivalentClasses.isEmpty();
			case OWLModelPackage.ONTOLOGY__DISJOINT_CLASSES:
				return disjointClasses != null && !disjointClasses.isEmpty();
			case OWLModelPackage.ONTOLOGY__DISJOINT_UNION:
				return disjointUnion != null && !disjointUnion.isEmpty();
			case OWLModelPackage.ONTOLOGY__SUB_OBJECT_PROPERTY_OF:
				return subObjectPropertyOf != null && !subObjectPropertyOf.isEmpty();
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_OBJECT_PROPERTIES:
				return equivalentObjectProperties != null && !equivalentObjectProperties.isEmpty();
			case OWLModelPackage.ONTOLOGY__DISJOINT_OBJECT_PROPERTIES:
				return disjointObjectProperties != null && !disjointObjectProperties.isEmpty();
			case OWLModelPackage.ONTOLOGY__INVERSE_OBJECT_PROPERTIES:
				return inverseObjectProperties != null && !inverseObjectProperties.isEmpty();
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_DOMAIN:
				return objectPropertyDomain != null && !objectPropertyDomain.isEmpty();
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_RANGE:
				return objectPropertyRange != null && !objectPropertyRange.isEmpty();
			case OWLModelPackage.ONTOLOGY__FUNCTIONAL_OBJECT_PROPERTY:
				return functionalObjectProperty != null && !functionalObjectProperty.isEmpty();
			case OWLModelPackage.ONTOLOGY__INVERSE_FUNCTIONAL_OBJECT_PROPERTY:
				return inverseFunctionalObjectProperty != null && !inverseFunctionalObjectProperty.isEmpty();
			case OWLModelPackage.ONTOLOGY__REFLEXIVE_OBJECT_PROPERTY:
				return reflexiveObjectProperty != null && !reflexiveObjectProperty.isEmpty();
			case OWLModelPackage.ONTOLOGY__IRREFLEXIVE_OBJECT_PROPERTY:
				return irreflexiveObjectProperty != null && !irreflexiveObjectProperty.isEmpty();
			case OWLModelPackage.ONTOLOGY__SYMMETRIC_OBJECT_PROPERTY:
				return symmetricObjectProperty != null && !symmetricObjectProperty.isEmpty();
			case OWLModelPackage.ONTOLOGY__ASYMMETRIC_OBJECT_PROPERTY:
				return asymmetricObjectProperty != null && !asymmetricObjectProperty.isEmpty();
			case OWLModelPackage.ONTOLOGY__TRANSITIVE_OBJECT_PROPERTY:
				return transitiveObjectProperty != null && !transitiveObjectProperty.isEmpty();
			case OWLModelPackage.ONTOLOGY__SUB_DATA_PROPERTY_OF:
				return subDataPropertyOf != null && !subDataPropertyOf.isEmpty();
			case OWLModelPackage.ONTOLOGY__EQUIVALENT_DATA_PROPERTIES:
				return equivalentDataProperties != null && !equivalentDataProperties.isEmpty();
			case OWLModelPackage.ONTOLOGY__DISJOINT_DATA_PROPERTIES:
				return disjointDataProperties != null && !disjointDataProperties.isEmpty();
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_DOMAIN:
				return dataPropertyDomain != null && !dataPropertyDomain.isEmpty();
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_RANGE:
				return dataPropertyRange != null && !dataPropertyRange.isEmpty();
			case OWLModelPackage.ONTOLOGY__FUNCTIONAL_DATA_PROPERTY:
				return functionalDataProperty != null && !functionalDataProperty.isEmpty();
			case OWLModelPackage.ONTOLOGY__DATATYPE_DEFINITION:
				return datatypeDefinition != null && !datatypeDefinition.isEmpty();
			case OWLModelPackage.ONTOLOGY__HAS_KEY:
				return hasKey != null && !hasKey.isEmpty();
			case OWLModelPackage.ONTOLOGY__SAME_INDIVIDUAL:
				return sameIndividual != null && !sameIndividual.isEmpty();
			case OWLModelPackage.ONTOLOGY__DIFFERENT_INDIVIDUALS:
				return differentIndividuals != null && !differentIndividuals.isEmpty();
			case OWLModelPackage.ONTOLOGY__CLASS_ASSERTION:
				return classAssertion != null && !classAssertion.isEmpty();
			case OWLModelPackage.ONTOLOGY__OBJECT_PROPERTY_ASSERTION:
				return objectPropertyAssertion != null && !objectPropertyAssertion.isEmpty();
			case OWLModelPackage.ONTOLOGY__NEGATIVE_OBJECT_PROPERTY_ASSERTION:
				return negativeObjectPropertyAssertion != null && !negativeObjectPropertyAssertion.isEmpty();
			case OWLModelPackage.ONTOLOGY__DATA_PROPERTY_ASSERTION:
				return dataPropertyAssertion != null && !dataPropertyAssertion.isEmpty();
			case OWLModelPackage.ONTOLOGY__NEGATIVE_DATA_PROPERTY_ASSERTION:
				return negativeDataPropertyAssertion != null && !negativeDataPropertyAssertion.isEmpty();
			case OWLModelPackage.ONTOLOGY__ANNOTATION_ASSERTION:
				return annotationAssertion != null && !annotationAssertion.isEmpty();
			case OWLModelPackage.ONTOLOGY__SUB_ANNOTATION_PROPERTY_OF:
				return subAnnotationPropertyOf != null && !subAnnotationPropertyOf.isEmpty();
			case OWLModelPackage.ONTOLOGY__ANNOTATION_PROPERTY_DOMAIN:
				return annotationPropertyDomain != null && !annotationPropertyDomain.isEmpty();
			case OWLModelPackage.ONTOLOGY__ANNOTATION_PROPERTY_RANGE:
				return annotationPropertyRange != null && !annotationPropertyRange.isEmpty();
			case OWLModelPackage.ONTOLOGY__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case OWLModelPackage.ONTOLOGY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OWLModelPackage.ONTOLOGY__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case OWLModelPackage.ONTOLOGY__ONTOLOGY_IRI:
				return ONTOLOGY_IRI_EDEFAULT == null ? ontologyIRI != null : !ONTOLOGY_IRI_EDEFAULT.equals(ontologyIRI);
			case OWLModelPackage.ONTOLOGY__SPACE:
				return isSetSpace();
			case OWLModelPackage.ONTOLOGY__VERSION_IRI:
				return VERSION_IRI_EDEFAULT == null ? versionIRI != null : !VERSION_IRI_EDEFAULT.equals(versionIRI);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", ontologyIRI: ");
		result.append(ontologyIRI);
		result.append(", space: ");
		if (spaceESet) result.append(space); else result.append("<unset>");
		result.append(", versionIRI: ");
		result.append(versionIRI);
		result.append(')');
		return result.toString();
	}

} //OntologyImpl
