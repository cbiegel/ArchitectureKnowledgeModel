/**
 */
package org.emftrace.metamodel.OWLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Has Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectHasValue#getObjectProperty <em>Object Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectHasValue#getObjectInverseOf <em>Object Inverse Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectHasValue#getNamedIndividual <em>Named Individual</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectHasValue#getAnonymousIndividual <em>Anonymous Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectHasValue()
 * @model
 * @generated
 */
public interface ObjectHasValue extends ClassExpression {
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectHasValue_ObjectProperty()
	 * @model containment="true"
	 * @generated
	 */
	ObjectProperty getObjectProperty();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectHasValue#getObjectProperty <em>Object Property</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectHasValue_ObjectInverseOf()
	 * @model containment="true"
	 * @generated
	 */
	ObjectInverseOf getObjectInverseOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectHasValue#getObjectInverseOf <em>Object Inverse Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Inverse Of</em>' containment reference.
	 * @see #getObjectInverseOf()
	 * @generated
	 */
	void setObjectInverseOf(ObjectInverseOf value);

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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectHasValue_NamedIndividual()
	 * @model containment="true"
	 * @generated
	 */
	NamedIndividual getNamedIndividual();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectHasValue#getNamedIndividual <em>Named Individual</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectHasValue_AnonymousIndividual()
	 * @model containment="true"
	 * @generated
	 */
	AnonymousIndividual getAnonymousIndividual();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectHasValue#getAnonymousIndividual <em>Anonymous Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous Individual</em>' containment reference.
	 * @see #getAnonymousIndividual()
	 * @generated
	 */
	void setAnonymousIndividual(AnonymousIndividual value);

} // ObjectHasValue
