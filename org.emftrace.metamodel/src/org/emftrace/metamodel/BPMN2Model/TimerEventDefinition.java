/**
 */
package org.emftrace.metamodel.BPMN2Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.TimerEventDefinition#getTimeDate <em>Time Date</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.TimerEventDefinition#getTimeDuration <em>Time Duration</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.TimerEventDefinition#getTimeCycle <em>Time Cycle</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getTimerEventDefinition()
 * @model
 * @generated
 */
public interface TimerEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Time Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Date</em>' containment reference.
	 * @see #setTimeDate(Expression)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getTimerEventDefinition_TimeDate()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getTimeDate();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.TimerEventDefinition#getTimeDate <em>Time Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Date</em>' containment reference.
	 * @see #getTimeDate()
	 * @generated
	 */
	void setTimeDate(Expression value);

	/**
	 * Returns the value of the '<em><b>Time Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Duration</em>' containment reference.
	 * @see #setTimeDuration(Expression)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getTimerEventDefinition_TimeDuration()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getTimeDuration();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.TimerEventDefinition#getTimeDuration <em>Time Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Duration</em>' containment reference.
	 * @see #getTimeDuration()
	 * @generated
	 */
	void setTimeDuration(Expression value);

	/**
	 * Returns the value of the '<em><b>Time Cycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Cycle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Cycle</em>' containment reference.
	 * @see #setTimeCycle(Expression)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getTimerEventDefinition_TimeCycle()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getTimeCycle();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.TimerEventDefinition#getTimeCycle <em>Time Cycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Cycle</em>' containment reference.
	 * @see #getTimeCycle()
	 * @generated
	 */
	void setTimeCycle(Expression value);

} // TimerEventDefinition
