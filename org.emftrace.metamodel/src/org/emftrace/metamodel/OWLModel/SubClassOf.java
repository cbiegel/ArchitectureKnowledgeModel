/**
 */
package org.emftrace.metamodel.OWLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Class Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getObjectIntersectionOf <em>Object Intersection Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getObjectUnionOf <em>Object Union Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getObjectComplementOf <em>Object Complement Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getObjectOneOf <em>Object One Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getObjectSomeValuesFrom <em>Object Some Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getObjectAllValuesFrom <em>Object All Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getObjectHasValue <em>Object Has Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getObjectHasSelf <em>Object Has Self</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getObjectMinCardinality <em>Object Min Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getObjectMaxCardinality <em>Object Max Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getObjectExactCardinality <em>Object Exact Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getDataSomeValuesFrom <em>Data Some Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getDataAllValuesFrom <em>Data All Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getDataHasValue <em>Data Has Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getDataMinCardinality <em>Data Min Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getDataMaxCardinality <em>Data Max Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubClassOf#getDataExactCardinality <em>Data Exact Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf()
 * @model
 * @generated
 */
public interface SubClassOf extends ClassAxiom {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.emftrace.metamodel.OWLModel.Class> getClass_();

	/**
	 * Returns the value of the '<em><b>Object Intersection Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.ObjectIntersectionOf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Intersection Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Intersection Of</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_ObjectIntersectionOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectIntersectionOf> getObjectIntersectionOf();

	/**
	 * Returns the value of the '<em><b>Object Union Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.ObjectUnionOf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Union Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Union Of</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_ObjectUnionOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectUnionOf> getObjectUnionOf();

	/**
	 * Returns the value of the '<em><b>Object Complement Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.ObjectComplementOf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Complement Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Complement Of</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_ObjectComplementOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectComplementOf> getObjectComplementOf();

	/**
	 * Returns the value of the '<em><b>Object One Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.ObjectOneOf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object One Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object One Of</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_ObjectOneOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectOneOf> getObjectOneOf();

	/**
	 * Returns the value of the '<em><b>Object Some Values From</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.ObjectSomeValuesFrom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Some Values From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Some Values From</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_ObjectSomeValuesFrom()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectSomeValuesFrom> getObjectSomeValuesFrom();

	/**
	 * Returns the value of the '<em><b>Object All Values From</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.ObjectAllValuesFrom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object All Values From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object All Values From</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_ObjectAllValuesFrom()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectAllValuesFrom> getObjectAllValuesFrom();

	/**
	 * Returns the value of the '<em><b>Object Has Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.ObjectHasValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Has Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Has Value</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_ObjectHasValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectHasValue> getObjectHasValue();

	/**
	 * Returns the value of the '<em><b>Object Has Self</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.ObjectHasSelf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Has Self</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Has Self</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_ObjectHasSelf()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectHasSelf> getObjectHasSelf();

	/**
	 * Returns the value of the '<em><b>Object Min Cardinality</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.ObjectMinCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Min Cardinality</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Min Cardinality</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_ObjectMinCardinality()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectMinCardinality> getObjectMinCardinality();

	/**
	 * Returns the value of the '<em><b>Object Max Cardinality</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.ObjectMaxCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Max Cardinality</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Max Cardinality</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_ObjectMaxCardinality()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectMaxCardinality> getObjectMaxCardinality();

	/**
	 * Returns the value of the '<em><b>Object Exact Cardinality</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Exact Cardinality</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Exact Cardinality</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_ObjectExactCardinality()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectExactCardinality> getObjectExactCardinality();

	/**
	 * Returns the value of the '<em><b>Data Some Values From</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.DataSomeValuesFrom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Some Values From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Some Values From</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_DataSomeValuesFrom()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSomeValuesFrom> getDataSomeValuesFrom();

	/**
	 * Returns the value of the '<em><b>Data All Values From</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.DataAllValuesFrom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data All Values From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data All Values From</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_DataAllValuesFrom()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataAllValuesFrom> getDataAllValuesFrom();

	/**
	 * Returns the value of the '<em><b>Data Has Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.DataHasValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Has Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Has Value</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_DataHasValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataHasValue> getDataHasValue();

	/**
	 * Returns the value of the '<em><b>Data Min Cardinality</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.DataMinCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Min Cardinality</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Min Cardinality</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_DataMinCardinality()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataMinCardinality> getDataMinCardinality();

	/**
	 * Returns the value of the '<em><b>Data Max Cardinality</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.DataMaxCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Max Cardinality</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Max Cardinality</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_DataMaxCardinality()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataMaxCardinality> getDataMaxCardinality();

	/**
	 * Returns the value of the '<em><b>Data Exact Cardinality</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.DataExactCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Exact Cardinality</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Exact Cardinality</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubClassOf_DataExactCardinality()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataExactCardinality> getDataExactCardinality();

} // SubClassOf
