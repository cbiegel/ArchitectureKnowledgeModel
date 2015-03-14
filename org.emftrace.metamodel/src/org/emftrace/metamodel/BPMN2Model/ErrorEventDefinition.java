/**
 */
package org.emftrace.metamodel.BPMN2Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.ErrorEventDefinition#getErrorRef <em>Error Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getErrorEventDefinition()
 * @model
 * @generated
 */
public interface ErrorEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Error Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Ref</em>' reference.
	 * @see #setErrorRef(org.emftrace.metamodel.BPMN2Model.Error)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getErrorEventDefinition_ErrorRef()
	 * @model ordered="false"
	 * @generated
	 */
	org.emftrace.metamodel.BPMN2Model.Error getErrorRef();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.ErrorEventDefinition#getErrorRef <em>Error Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Ref</em>' reference.
	 * @see #getErrorRef()
	 * @generated
	 */
	void setErrorRef(org.emftrace.metamodel.BPMN2Model.Error value);

} // ErrorEventDefinition
