/**
 */
package org.emftrace.metamodel.OWLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectIntersectionOf <em>Object Intersection Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectUnionOf <em>Object Union Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectComplementOf <em>Object Complement Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectOneOf <em>Object One Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectSomeValuesFrom <em>Object Some Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectAllValuesFrom <em>Object All Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectHasValue <em>Object Has Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectHasSelf <em>Object Has Self</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectMinCardinality <em>Object Min Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectMaxCardinality <em>Object Max Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectExactCardinality <em>Object Exact Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getDataSomeValuesFrom <em>Data Some Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getDataAllValuesFrom <em>Data All Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getDataHasValue <em>Data Has Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getDataMinCardinality <em>Data Min Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getDataMaxCardinality <em>Data Max Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getDataExactCardinality <em>Data Exact Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getNamedIndividual <em>Named Individual</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getAnonymousIndividual <em>Anonymous Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion()
 * @model
 * @generated
 */
public interface ClassAssertion extends Assertion {
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_Class()
	 * @model containment="true"
	 * @generated
	 */
	org.emftrace.metamodel.OWLModel.Class getClass_();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getClass_ <em>Class</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_ObjectIntersectionOf()
	 * @model containment="true"
	 * @generated
	 */
	ObjectIntersectionOf getObjectIntersectionOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectIntersectionOf <em>Object Intersection Of</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_ObjectUnionOf()
	 * @model containment="true"
	 * @generated
	 */
	ObjectUnionOf getObjectUnionOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectUnionOf <em>Object Union Of</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_ObjectComplementOf()
	 * @model containment="true"
	 * @generated
	 */
	ObjectComplementOf getObjectComplementOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectComplementOf <em>Object Complement Of</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_ObjectOneOf()
	 * @model containment="true"
	 * @generated
	 */
	ObjectOneOf getObjectOneOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectOneOf <em>Object One Of</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_ObjectSomeValuesFrom()
	 * @model containment="true"
	 * @generated
	 */
	ObjectSomeValuesFrom getObjectSomeValuesFrom();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectSomeValuesFrom <em>Object Some Values From</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_ObjectAllValuesFrom()
	 * @model containment="true"
	 * @generated
	 */
	ObjectAllValuesFrom getObjectAllValuesFrom();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectAllValuesFrom <em>Object All Values From</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_ObjectHasValue()
	 * @model containment="true"
	 * @generated
	 */
	ObjectHasValue getObjectHasValue();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectHasValue <em>Object Has Value</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_ObjectHasSelf()
	 * @model containment="true"
	 * @generated
	 */
	ObjectHasSelf getObjectHasSelf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectHasSelf <em>Object Has Self</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_ObjectMinCardinality()
	 * @model containment="true"
	 * @generated
	 */
	ObjectMinCardinality getObjectMinCardinality();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectMinCardinality <em>Object Min Cardinality</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_ObjectMaxCardinality()
	 * @model containment="true"
	 * @generated
	 */
	ObjectMaxCardinality getObjectMaxCardinality();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectMaxCardinality <em>Object Max Cardinality</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_ObjectExactCardinality()
	 * @model containment="true"
	 * @generated
	 */
	ObjectExactCardinality getObjectExactCardinality();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getObjectExactCardinality <em>Object Exact Cardinality</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_DataSomeValuesFrom()
	 * @model containment="true"
	 * @generated
	 */
	DataSomeValuesFrom getDataSomeValuesFrom();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getDataSomeValuesFrom <em>Data Some Values From</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_DataAllValuesFrom()
	 * @model containment="true"
	 * @generated
	 */
	DataAllValuesFrom getDataAllValuesFrom();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getDataAllValuesFrom <em>Data All Values From</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_DataHasValue()
	 * @model containment="true"
	 * @generated
	 */
	DataHasValue getDataHasValue();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getDataHasValue <em>Data Has Value</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_DataMinCardinality()
	 * @model containment="true"
	 * @generated
	 */
	DataMinCardinality getDataMinCardinality();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getDataMinCardinality <em>Data Min Cardinality</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_DataMaxCardinality()
	 * @model containment="true"
	 * @generated
	 */
	DataMaxCardinality getDataMaxCardinality();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getDataMaxCardinality <em>Data Max Cardinality</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_DataExactCardinality()
	 * @model containment="true"
	 * @generated
	 */
	DataExactCardinality getDataExactCardinality();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getDataExactCardinality <em>Data Exact Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Exact Cardinality</em>' containment reference.
	 * @see #getDataExactCardinality()
	 * @generated
	 */
	void setDataExactCardinality(DataExactCardinality value);

	/**
	 * Returns the value of the '<em><b>Named Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Individual</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Individual</em>' containment reference.
	 * @see #setNamedIndividual(NamedIndividual)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_NamedIndividual()
	 * @model containment="true"
	 * @generated
	 */
	NamedIndividual getNamedIndividual();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getNamedIndividual <em>Named Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named Individual</em>' containment reference.
	 * @see #getNamedIndividual()
	 * @generated
	 */
	void setNamedIndividual(NamedIndividual value);

	/**
	 * Returns the value of the '<em><b>Anonymous Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous Individual</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Individual</em>' containment reference.
	 * @see #setAnonymousIndividual(AnonymousIndividual)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClassAssertion_AnonymousIndividual()
	 * @model containment="true"
	 * @generated
	 */
	AnonymousIndividual getAnonymousIndividual();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ClassAssertion#getAnonymousIndividual <em>Anonymous Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous Individual</em>' containment reference.
	 * @see #getAnonymousIndividual()
	 * @generated
	 */
	void setAnonymousIndividual(AnonymousIndividual value);

} // ClassAssertion
