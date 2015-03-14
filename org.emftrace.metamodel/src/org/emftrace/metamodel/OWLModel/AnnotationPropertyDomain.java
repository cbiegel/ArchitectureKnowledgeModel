/**
 */
package org.emftrace.metamodel.OWLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Property Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.AnnotationPropertyDomain#getAnnotationProperty <em>Annotation Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.AnnotationPropertyDomain#getIRI <em>IRI</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.AnnotationPropertyDomain#getAbbreviatedIRI <em>Abbreviated IRI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getAnnotationPropertyDomain()
 * @model
 * @generated
 */
public interface AnnotationPropertyDomain extends AnnotationAxiom {
	/**
	 * Returns the value of the '<em><b>Annotation Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Property</em>' containment reference.
	 * @see #setAnnotationProperty(AnnotationProperty)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getAnnotationPropertyDomain_AnnotationProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AnnotationProperty getAnnotationProperty();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.AnnotationPropertyDomain#getAnnotationProperty <em>Annotation Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Property</em>' containment reference.
	 * @see #getAnnotationProperty()
	 * @generated
	 */
	void setAnnotationProperty(AnnotationProperty value);

	/**
	 * Returns the value of the '<em><b>IRI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IRI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IRI</em>' containment reference.
	 * @see #setIRI(IRI)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getAnnotationPropertyDomain_IRI()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IRI getIRI();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.AnnotationPropertyDomain#getIRI <em>IRI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IRI</em>' containment reference.
	 * @see #getIRI()
	 * @generated
	 */
	void setIRI(IRI value);

	/**
	 * Returns the value of the '<em><b>Abbreviated IRI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbreviated IRI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviated IRI</em>' containment reference.
	 * @see #setAbbreviatedIRI(AbbreviatedIRI)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getAnnotationPropertyDomain_AbbreviatedIRI()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbbreviatedIRI getAbbreviatedIRI();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.AnnotationPropertyDomain#getAbbreviatedIRI <em>Abbreviated IRI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbreviated IRI</em>' containment reference.
	 * @see #getAbbreviatedIRI()
	 * @generated
	 */
	void setAbbreviatedIRI(AbbreviatedIRI value);

} // AnnotationPropertyDomain
