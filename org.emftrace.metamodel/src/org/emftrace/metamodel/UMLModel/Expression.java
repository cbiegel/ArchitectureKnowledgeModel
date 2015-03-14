/**
 */
package org.emftrace.metamodel.UMLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Expression#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Expression#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #isSetSymbol()
	 * @see #unsetSymbol()
	 * @see #setSymbol(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExpression_Symbol()
	 * @model unsettable="true" dataType="org.emftrace.metamodel.UMLModel.String" ordered="false"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Expression#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #isSetSymbol()
	 * @see #unsetSymbol()
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Unsets the value of the '{@link org.emftrace.metamodel.UMLModel.Expression#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymbol()
	 * @see #getSymbol()
	 * @see #setSymbol(String)
	 * @generated
	 */
	void unsetSymbol();

	/**
	 * Returns whether the value of the '{@link org.emftrace.metamodel.UMLModel.Expression#getSymbol <em>Symbol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symbol</em>' attribute is set.
	 * @see #unsetSymbol()
	 * @see #getSymbol()
	 * @see #setSymbol(String)
	 * @generated
	 */
	boolean isSetSymbol();

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExpression_Operand()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSpecification> getOperand();

} // Expression
