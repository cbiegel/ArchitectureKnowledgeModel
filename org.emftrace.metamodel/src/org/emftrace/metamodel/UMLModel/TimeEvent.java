/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.TimeEvent#isIsRelative <em>Is Relative</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.TimeEvent#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTimeEvent()
 * @model
 * @generated
 */
public interface TimeEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Is Relative</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Relative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Relative</em>' attribute.
	 * @see #setIsRelative(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTimeEvent_IsRelative()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsRelative();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.TimeEvent#isIsRelative <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Relative</em>' attribute.
	 * @see #isIsRelative()
	 * @generated
	 */
	void setIsRelative(boolean value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(ValueSpecification)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTimeEvent_When()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getWhen();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.TimeEvent#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(ValueSpecification value);

} // TimeEvent
