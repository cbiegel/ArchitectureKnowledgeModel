/**
 */
package org.emftrace.metamodel.BPMN2Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.SequenceFlow#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.SequenceFlow#isIsImmediate <em>Is Immediate</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.SequenceFlow#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.SequenceFlow#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getSequenceFlow()
 * @model
 * @generated
 */
public interface SequenceFlow extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Expression</em>' containment reference.
	 * @see #setConditionExpression(Expression)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getSequenceFlow_ConditionExpression()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getConditionExpression();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.SequenceFlow#getConditionExpression <em>Condition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Expression</em>' containment reference.
	 * @see #getConditionExpression()
	 * @generated
	 */
	void setConditionExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Is Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Immediate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Immediate</em>' attribute.
	 * @see #setIsImmediate(boolean)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getSequenceFlow_IsImmediate()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isIsImmediate();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.SequenceFlow#isIsImmediate <em>Is Immediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Immediate</em>' attribute.
	 * @see #isIsImmediate()
	 * @generated
	 */
	void setIsImmediate(boolean value);

	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.emftrace.metamodel.BPMN2Model.FlowNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' reference.
	 * @see #setSourceRef(FlowNode)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getSequenceFlow_SourceRef()
	 * @see org.emftrace.metamodel.BPMN2Model.FlowNode#getOutgoing
	 * @model opposite="outgoing" required="true" ordered="false"
	 * @generated
	 */
	FlowNode getSourceRef();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.SequenceFlow#getSourceRef <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' reference.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(FlowNode value);

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.emftrace.metamodel.BPMN2Model.FlowNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' reference.
	 * @see #setTargetRef(FlowNode)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getSequenceFlow_TargetRef()
	 * @see org.emftrace.metamodel.BPMN2Model.FlowNode#getIncoming
	 * @model opposite="incoming" required="true" ordered="false"
	 * @generated
	 */
	FlowNode getTargetRef();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.SequenceFlow#getTargetRef <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' reference.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(FlowNode value);

} // SequenceFlow
