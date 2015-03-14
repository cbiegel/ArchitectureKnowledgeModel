/**
 */
package org.emftrace.metamodel.OWLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.Class#getAbbreviatedIRI <em>Abbreviated IRI</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.Class#getIRI <em>IRI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends ClassExpression {
	/**
	 * Returns the value of the '<em><b>Abbreviated IRI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbreviated IRI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviated IRI</em>' attribute.
	 * @see #setAbbreviatedIRI(String)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClass_AbbreviatedIRI()
	 * @model
	 * @generated
	 */
	String getAbbreviatedIRI();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.Class#getAbbreviatedIRI <em>Abbreviated IRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbreviated IRI</em>' attribute.
	 * @see #getAbbreviatedIRI()
	 * @generated
	 */
	void setAbbreviatedIRI(String value);

	/**
	 * Returns the value of the '<em><b>IRI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IRI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IRI</em>' attribute.
	 * @see #setIRI(String)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getClass_IRI()
	 * @model
	 * @generated
	 */
	String getIRI();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.Class#getIRI <em>IRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IRI</em>' attribute.
	 * @see #getIRI()
	 * @generated
	 */
	void setIRI(String value);

} // Class
