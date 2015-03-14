/**
 */
package org.emftrace.metamodel.URNModel;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Ref Bendpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.LinkRefBendpoint#getX <em>X</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.LinkRefBendpoint#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getLinkRefBendpoint()
 * @model
 * @generated
 */
public interface LinkRefBendpoint extends URNBase {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(BigInteger)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getLinkRefBendpoint_X()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 * @generated
	 */
	BigInteger getX();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.LinkRefBendpoint#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(BigInteger)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getLinkRefBendpoint_Y()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 * @generated
	 */
	BigInteger getY();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.LinkRefBendpoint#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(BigInteger value);

} // LinkRefBendpoint
