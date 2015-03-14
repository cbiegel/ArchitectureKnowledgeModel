/**
 */
package org.emftrace.metamodel.URNModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.Position#getX <em>X</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.Position#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends URNBase {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getPosition_X()
	 * @model default="" required="true"
	 * @generated
	 */
	String getX();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.Position#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(String value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getPosition_Y()
	 * @model required="true"
	 * @generated
	 */
	String getY();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.Position#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(String value);

} // Position
