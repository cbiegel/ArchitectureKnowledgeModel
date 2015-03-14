/**
 */
package org.emftrace.metamodel.BPMN2Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Choreography Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.GlobalChoreographyTask#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getGlobalChoreographyTask()
 * @model
 * @generated
 */
public interface GlobalChoreographyTask extends Choreography {
	/**
	 * Returns the value of the '<em><b>Initiating Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiating Participant Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiating Participant Ref</em>' reference.
	 * @see #setInitiatingParticipantRef(Participant)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getGlobalChoreographyTask_InitiatingParticipantRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Participant getInitiatingParticipantRef();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.GlobalChoreographyTask#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiating Participant Ref</em>' reference.
	 * @see #getInitiatingParticipantRef()
	 * @generated
	 */
	void setInitiatingParticipantRef(Participant value);

} // GlobalChoreographyTask
