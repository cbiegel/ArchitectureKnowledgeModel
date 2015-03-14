/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.InstanceValue#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getInstanceValue()
 * @model
 * @generated
 */
public interface InstanceValue extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' attribute.
	 * @see #setInstance(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getInstanceValue_Instance()
	 * @model required="true"
	 * @generated
	 */
	String getInstance();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.InstanceValue#getInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' attribute.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(String value);

} // InstanceValue
