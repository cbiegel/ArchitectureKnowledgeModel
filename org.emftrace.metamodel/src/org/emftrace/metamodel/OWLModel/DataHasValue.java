/**
 */
package org.emftrace.metamodel.OWLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Has Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DataHasValue#getDataProperty <em>Data Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DataHasValue#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataHasValue()
 * @model
 * @generated
 */
public interface DataHasValue extends ClassExpression {
	/**
	 * Returns the value of the '<em><b>Data Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Property</em>' containment reference.
	 * @see #setDataProperty(DataProperty)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataHasValue_DataProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataProperty getDataProperty();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.DataHasValue#getDataProperty <em>Data Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Property</em>' containment reference.
	 * @see #getDataProperty()
	 * @generated
	 */
	void setDataProperty(DataProperty value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference.
	 * @see #setLiteral(Literal)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataHasValue_Literal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Literal getLiteral();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.DataHasValue#getLiteral <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' containment reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(Literal value);

} // DataHasValue
