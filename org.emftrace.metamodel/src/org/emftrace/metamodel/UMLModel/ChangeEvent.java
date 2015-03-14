/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ChangeEvent#getChangeExpression <em>Change Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getChangeEvent()
 * @model
 * @generated
 */
public interface ChangeEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Change Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Expression</em>' containment reference.
	 * @see #setChangeExpression(ValueSpecification)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getChangeEvent_ChangeExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getChangeExpression();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ChangeEvent#getChangeExpression <em>Change Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Expression</em>' containment reference.
	 * @see #getChangeExpression()
	 * @generated
	 */
	void setChangeExpression(ValueSpecification value);

} // ChangeEvent
