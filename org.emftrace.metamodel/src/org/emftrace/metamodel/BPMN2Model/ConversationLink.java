/**
 */
package org.emftrace.metamodel.BPMN2Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversation Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.ConversationLink#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.ConversationLink#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.ConversationLink#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getConversationLink()
 * @model
 * @generated
 */
public interface ConversationLink extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getConversationLink_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.ConversationLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' reference.
	 * @see #setSourceRef(InteractionNode)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getConversationLink_SourceRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InteractionNode getSourceRef();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.ConversationLink#getSourceRef <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' reference.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(InteractionNode value);

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' reference.
	 * @see #setTargetRef(InteractionNode)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getConversationLink_TargetRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InteractionNode getTargetRef();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.ConversationLink#getTargetRef <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' reference.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(InteractionNode value);

} // ConversationLink
