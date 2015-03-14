/**
 */
package org.emftrace.metamodel.UMLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.StringExpression#getSubExpression <em>Sub Expression</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.StringExpression#getOwningExpression <em>Owning Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getStringExpression()
 * @model
 * @generated
 */
public interface StringExpression extends Expression, TemplateableElement {
	/**
	 * Returns the value of the '<em><b>Sub Expression</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.StringExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Expression</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getStringExpression_SubExpression()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<StringExpression> getSubExpression();

	/**
	 * Returns the value of the '<em><b>Owning Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Expression</em>' attribute.
	 * @see #setOwningExpression(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getStringExpression_OwningExpression()
	 * @model
	 * @generated
	 */
	String getOwningExpression();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.StringExpression#getOwningExpression <em>Owning Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Expression</em>' attribute.
	 * @see #getOwningExpression()
	 * @generated
	 */
	void setOwningExpression(String value);

} // StringExpression
