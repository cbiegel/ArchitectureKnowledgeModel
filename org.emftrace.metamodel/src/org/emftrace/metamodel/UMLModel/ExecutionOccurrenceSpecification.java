/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ExecutionOccurrenceSpecification#getExecution <em>Execution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExecutionOccurrenceSpecification()
 * @model
 * @generated
 */
public interface ExecutionOccurrenceSpecification extends OccurrenceSpecification {
	/**
	 * Returns the value of the '<em><b>Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution</em>' attribute.
	 * @see #setExecution(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExecutionOccurrenceSpecification_Execution()
	 * @model required="true"
	 * @generated
	 */
	String getExecution();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ExecutionOccurrenceSpecification#getExecution <em>Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution</em>' attribute.
	 * @see #getExecution()
	 * @generated
	 */
	void setExecution(String value);

} // ExecutionOccurrenceSpecification
