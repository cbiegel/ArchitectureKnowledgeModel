/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.LiteralInteger#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getLiteralInteger()
 * @model
 * @generated
 */
public interface LiteralInteger extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getLiteralInteger_Value()
	 * @model default="0" dataType="org.emftrace.metamodel.UMLModel.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.LiteralInteger#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // LiteralInteger
