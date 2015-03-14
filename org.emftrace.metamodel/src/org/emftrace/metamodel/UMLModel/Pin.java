/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Pin#isIsControl <em>Is Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getPin()
 * @model
 * @generated
 */
public interface Pin extends ObjectNode, MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Is Control</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Control</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Control</em>' attribute.
	 * @see #setIsControl(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getPin_IsControl()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsControl();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Pin#isIsControl <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Control</em>' attribute.
	 * @see #isIsControl()
	 * @generated
	 */
	void setIsControl(boolean value);

} // Pin
