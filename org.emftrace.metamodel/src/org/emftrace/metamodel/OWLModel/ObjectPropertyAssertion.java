/**
 */
package org.emftrace.metamodel.OWLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectPropertyAssertion#getObjectProperty <em>Object Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectPropertyAssertion#getObjectInverseOf <em>Object Inverse Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectPropertyAssertion#getNamedIndividual <em>Named Individual</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectPropertyAssertion#getAnonymousIndividual <em>Anonymous Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectPropertyAssertion()
 * @model
 * @generated
 */
public interface ObjectPropertyAssertion extends Assertion {
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectPropertyAssertion_ObjectProperty()
	 * @model containment="true"
	 * @generated
	 */
	ObjectProperty getObjectProperty();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectPropertyAssertion#getObjectProperty <em>Object Property</em>}' containment reference.
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
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectPropertyAssertion_ObjectInverseOf()
	 * @model containment="true"
	 * @generated
	 */
	ObjectInverseOf getObjectInverseOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectPropertyAssertion#getObjectInverseOf <em>Object Inverse Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Inverse Of</em>' containment reference.
	 * @see #getObjectInverseOf()
	 * @generated
	 */
	void setObjectInverseOf(ObjectInverseOf value);

	/**
	 * Returns the value of the '<em><b>Named Individual</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.NamedIndividual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Individual</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Individual</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectPropertyAssertion_NamedIndividual()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedIndividual> getNamedIndividual();

	/**
	 * Returns the value of the '<em><b>Anonymous Individual</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.AnonymousIndividual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous Individual</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Individual</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectPropertyAssertion_AnonymousIndividual()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnonymousIndividual> getAnonymousIndividual();

} // ObjectPropertyAssertion
