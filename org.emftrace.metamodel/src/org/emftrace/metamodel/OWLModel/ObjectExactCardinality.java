/**
 */
package org.emftrace.metamodel.OWLModel;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Exact Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectProperty <em>Object Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectInverseOf <em>Object Inverse Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectIntersectionOf <em>Object Intersection Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectUnionOf <em>Object Union Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectComplementOf <em>Object Complement Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectOneOf <em>Object One Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectSomeValuesFrom <em>Object Some Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectAllValuesFrom <em>Object All Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectHasValue <em>Object Has Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectHasSelf <em>Object Has Self</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectMinCardinality <em>Object Min Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectMaxCardinality <em>Object Max Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectExactCardinality <em>Object Exact Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getDataSomeValuesFrom <em>Data Some Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getDataAllValuesFrom <em>Data All Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getDataHasValue <em>Data Has Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getDataMinCardinality <em>Data Min Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getDataMaxCardinality <em>Data Max Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getDataExactCardinality <em>Data Exact Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality()
 * @model
 * @generated
 */
public interface ObjectExactCardinality extends ClassExpression {
	/**
	 * Returns the value of the '<em><b>Object Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Property</em>' containment reference.
	 * @see #setObjectProperty(ObjectProperty)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_ObjectProperty()
	 * @model containment="true"
	 * @generated
	 */
	ObjectProperty getObjectProperty();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectProperty <em>Object Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Property</em>' containment reference.
	 * @see #getObjectProperty()
	 * @generated
	 */
	void setObjectProperty(ObjectProperty value);

	/**
	 * Returns the value of the '<em><b>Object Inverse Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Inverse Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Inverse Of</em>' containment reference.
	 * @see #setObjectInverseOf(ObjectInverseOf)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_ObjectInverseOf()
	 * @model containment="true"
	 * @generated
	 */
	ObjectInverseOf getObjectInverseOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectInverseOf <em>Object Inverse Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Inverse Of</em>' containment reference.
	 * @see #getObjectInverseOf()
	 * @generated
	 */
	void setObjectInverseOf(ObjectInverseOf value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass(org.emftrace.metamodel.OWLModel.Class)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_Class()
	 * @model containment="true"
	 * @generated
	 */
	org.emftrace.metamodel.OWLModel.Class getClass_();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(org.emftrace.metamodel.OWLModel.Class value);

	/**
	 * Returns the value of the '<em><b>Object Intersection Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Intersection Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Intersection Of</em>' containment reference.
	 * @see #setObjectIntersectionOf(ObjectIntersectionOf)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_ObjectIntersectionOf()
	 * @model containment="true"
	 * @generated
	 */
	ObjectIntersectionOf getObjectIntersectionOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectIntersectionOf <em>Object Intersection Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Intersection Of</em>' containment reference.
	 * @see #getObjectIntersectionOf()
	 * @generated
	 */
	void setObjectIntersectionOf(ObjectIntersectionOf value);

	/**
	 * Returns the value of the '<em><b>Object Union Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Union Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Union Of</em>' containment reference.
	 * @see #setObjectUnionOf(ObjectUnionOf)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_ObjectUnionOf()
	 * @model containment="true"
	 * @generated
	 */
	ObjectUnionOf getObjectUnionOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectUnionOf <em>Object Union Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Union Of</em>' containment reference.
	 * @see #getObjectUnionOf()
	 * @generated
	 */
	void setObjectUnionOf(ObjectUnionOf value);

	/**
	 * Returns the value of the '<em><b>Object Complement Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Complement Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Complement Of</em>' containment reference.
	 * @see #setObjectComplementOf(ObjectComplementOf)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_ObjectComplementOf()
	 * @model containment="true"
	 * @generated
	 */
	ObjectComplementOf getObjectComplementOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectComplementOf <em>Object Complement Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Complement Of</em>' containment reference.
	 * @see #getObjectComplementOf()
	 * @generated
	 */
	void setObjectComplementOf(ObjectComplementOf value);

	/**
	 * Returns the value of the '<em><b>Object One Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object One Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object One Of</em>' containment reference.
	 * @see #setObjectOneOf(ObjectOneOf)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_ObjectOneOf()
	 * @model containment="true"
	 * @generated
	 */
	ObjectOneOf getObjectOneOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectOneOf <em>Object One Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object One Of</em>' containment reference.
	 * @see #getObjectOneOf()
	 * @generated
	 */
	void setObjectOneOf(ObjectOneOf value);

	/**
	 * Returns the value of the '<em><b>Object Some Values From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Some Values From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Some Values From</em>' containment reference.
	 * @see #setObjectSomeValuesFrom(ObjectSomeValuesFrom)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_ObjectSomeValuesFrom()
	 * @model containment="true"
	 * @generated
	 */
	ObjectSomeValuesFrom getObjectSomeValuesFrom();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectSomeValuesFrom <em>Object Some Values From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Some Values From</em>' containment reference.
	 * @see #getObjectSomeValuesFrom()
	 * @generated
	 */
	void setObjectSomeValuesFrom(ObjectSomeValuesFrom value);

	/**
	 * Returns the value of the '<em><b>Object All Values From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object All Values From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object All Values From</em>' containment reference.
	 * @see #setObjectAllValuesFrom(ObjectAllValuesFrom)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_ObjectAllValuesFrom()
	 * @model containment="true"
	 * @generated
	 */
	ObjectAllValuesFrom getObjectAllValuesFrom();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectAllValuesFrom <em>Object All Values From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object All Values From</em>' containment reference.
	 * @see #getObjectAllValuesFrom()
	 * @generated
	 */
	void setObjectAllValuesFrom(ObjectAllValuesFrom value);

	/**
	 * Returns the value of the '<em><b>Object Has Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Has Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Has Value</em>' containment reference.
	 * @see #setObjectHasValue(ObjectHasValue)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_ObjectHasValue()
	 * @model containment="true"
	 * @generated
	 */
	ObjectHasValue getObjectHasValue();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectHasValue <em>Object Has Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Has Value</em>' containment reference.
	 * @see #getObjectHasValue()
	 * @generated
	 */
	void setObjectHasValue(ObjectHasValue value);

	/**
	 * Returns the value of the '<em><b>Object Has Self</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Has Self</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Has Self</em>' containment reference.
	 * @see #setObjectHasSelf(ObjectHasSelf)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_ObjectHasSelf()
	 * @model containment="true"
	 * @generated
	 */
	ObjectHasSelf getObjectHasSelf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectHasSelf <em>Object Has Self</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Has Self</em>' containment reference.
	 * @see #getObjectHasSelf()
	 * @generated
	 */
	void setObjectHasSelf(ObjectHasSelf value);

	/**
	 * Returns the value of the '<em><b>Object Min Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Min Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Min Cardinality</em>' containment reference.
	 * @see #setObjectMinCardinality(ObjectMinCardinality)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_ObjectMinCardinality()
	 * @model containment="true"
	 * @generated
	 */
	ObjectMinCardinality getObjectMinCardinality();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectMinCardinality <em>Object Min Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Min Cardinality</em>' containment reference.
	 * @see #getObjectMinCardinality()
	 * @generated
	 */
	void setObjectMinCardinality(ObjectMinCardinality value);

	/**
	 * Returns the value of the '<em><b>Object Max Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Max Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Max Cardinality</em>' containment reference.
	 * @see #setObjectMaxCardinality(ObjectMaxCardinality)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_ObjectMaxCardinality()
	 * @model containment="true"
	 * @generated
	 */
	ObjectMaxCardinality getObjectMaxCardinality();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectMaxCardinality <em>Object Max Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Max Cardinality</em>' containment reference.
	 * @see #getObjectMaxCardinality()
	 * @generated
	 */
	void setObjectMaxCardinality(ObjectMaxCardinality value);

	/**
	 * Returns the value of the '<em><b>Object Exact Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Exact Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Exact Cardinality</em>' containment reference.
	 * @see #setObjectExactCardinality(ObjectExactCardinality)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_ObjectExactCardinality()
	 * @model containment="true"
	 * @generated
	 */
	ObjectExactCardinality getObjectExactCardinality();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getObjectExactCardinality <em>Object Exact Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Exact Cardinality</em>' containment reference.
	 * @see #getObjectExactCardinality()
	 * @generated
	 */
	void setObjectExactCardinality(ObjectExactCardinality value);

	/**
	 * Returns the value of the '<em><b>Data Some Values From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Some Values From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Some Values From</em>' containment reference.
	 * @see #setDataSomeValuesFrom(DataSomeValuesFrom)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_DataSomeValuesFrom()
	 * @model containment="true"
	 * @generated
	 */
	DataSomeValuesFrom getDataSomeValuesFrom();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getDataSomeValuesFrom <em>Data Some Values From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Some Values From</em>' containment reference.
	 * @see #getDataSomeValuesFrom()
	 * @generated
	 */
	void setDataSomeValuesFrom(DataSomeValuesFrom value);

	/**
	 * Returns the value of the '<em><b>Data All Values From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data All Values From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data All Values From</em>' containment reference.
	 * @see #setDataAllValuesFrom(DataAllValuesFrom)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_DataAllValuesFrom()
	 * @model containment="true"
	 * @generated
	 */
	DataAllValuesFrom getDataAllValuesFrom();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getDataAllValuesFrom <em>Data All Values From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data All Values From</em>' containment reference.
	 * @see #getDataAllValuesFrom()
	 * @generated
	 */
	void setDataAllValuesFrom(DataAllValuesFrom value);

	/**
	 * Returns the value of the '<em><b>Data Has Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Has Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Has Value</em>' containment reference.
	 * @see #setDataHasValue(DataHasValue)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_DataHasValue()
	 * @model containment="true"
	 * @generated
	 */
	DataHasValue getDataHasValue();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getDataHasValue <em>Data Has Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Has Value</em>' containment reference.
	 * @see #getDataHasValue()
	 * @generated
	 */
	void setDataHasValue(DataHasValue value);

	/**
	 * Returns the value of the '<em><b>Data Min Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Min Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Min Cardinality</em>' containment reference.
	 * @see #setDataMinCardinality(DataMinCardinality)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_DataMinCardinality()
	 * @model containment="true"
	 * @generated
	 */
	DataMinCardinality getDataMinCardinality();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getDataMinCardinality <em>Data Min Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Min Cardinality</em>' containment reference.
	 * @see #getDataMinCardinality()
	 * @generated
	 */
	void setDataMinCardinality(DataMinCardinality value);

	/**
	 * Returns the value of the '<em><b>Data Max Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Max Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Max Cardinality</em>' containment reference.
	 * @see #setDataMaxCardinality(DataMaxCardinality)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_DataMaxCardinality()
	 * @model containment="true"
	 * @generated
	 */
	DataMaxCardinality getDataMaxCardinality();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getDataMaxCardinality <em>Data Max Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Max Cardinality</em>' containment reference.
	 * @see #getDataMaxCardinality()
	 * @generated
	 */
	void setDataMaxCardinality(DataMaxCardinality value);

	/**
	 * Returns the value of the '<em><b>Data Exact Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Exact Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Exact Cardinality</em>' containment reference.
	 * @see #setDataExactCardinality(DataExactCardinality)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_DataExactCardinality()
	 * @model containment="true"
	 * @generated
	 */
	DataExactCardinality getDataExactCardinality();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getDataExactCardinality <em>Data Exact Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Exact Cardinality</em>' containment reference.
	 * @see #getDataExactCardinality()
	 * @generated
	 */
	void setDataExactCardinality(DataExactCardinality value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(BigInteger)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectExactCardinality_Cardinality()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 * @generated
	 */
	BigInteger getCardinality();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectExactCardinality#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(BigInteger value);

} // ObjectExactCardinality
