/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.TimeObservation#getEvent <em>Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.TimeObservation#isFirstEvent <em>First Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTimeObservation()
 * @model
 * @generated
 */
public interface TimeObservation extends Observation {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTimeObservation_Event()
	 * @model required="true"
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.TimeObservation#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

	/**
	 * Returns the value of the '<em><b>First Event</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Event</em>' attribute.
	 * @see #setFirstEvent(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTimeObservation_FirstEvent()
	 * @model default="true" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isFirstEvent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.TimeObservation#isFirstEvent <em>First Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Event</em>' attribute.
	 * @see #isFirstEvent()
	 * @generated
	 */
	void setFirstEvent(boolean value);

} // TimeObservation
