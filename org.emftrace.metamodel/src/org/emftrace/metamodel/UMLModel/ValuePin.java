/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ValuePin#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getValuePin()
 * @model
 * @generated
 */
public interface ValuePin extends InputPin {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueSpecification)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getValuePin_Value()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getValue();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ValuePin#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueSpecification value);

} // ValuePin
