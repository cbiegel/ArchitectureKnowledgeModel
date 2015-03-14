/**
 */
package org.emftrace.metamodel.BPMN2Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Business Rule Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.GlobalBusinessRuleTask#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getGlobalBusinessRuleTask()
 * @model
 * @generated
 */
public interface GlobalBusinessRuleTask extends GlobalTask {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' attribute.
	 * @see #setImplementation(String)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getGlobalBusinessRuleTask_Implementation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getImplementation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.GlobalBusinessRuleTask#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(String value);

} // GlobalBusinessRuleTask
