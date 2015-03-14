/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.OccurrenceSpecification#getToBefore <em>To Before</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.OccurrenceSpecification#getToAfter <em>To After</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.OccurrenceSpecification#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getOccurrenceSpecification()
 * @model
 * @generated
 */
public interface OccurrenceSpecification extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>To Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Before</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Before</em>' attribute.
	 * @see #setToBefore(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getOccurrenceSpecification_ToBefore()
	 * @model
	 * @generated
	 */
	String getToBefore();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.OccurrenceSpecification#getToBefore <em>To Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Before</em>' attribute.
	 * @see #getToBefore()
	 * @generated
	 */
	void setToBefore(String value);

	/**
	 * Returns the value of the '<em><b>To After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To After</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To After</em>' attribute.
	 * @see #setToAfter(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getOccurrenceSpecification_ToAfter()
	 * @model
	 * @generated
	 */
	String getToAfter();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.OccurrenceSpecification#getToAfter <em>To After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To After</em>' attribute.
	 * @see #getToAfter()
	 * @generated
	 */
	void setToAfter(String value);

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
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getOccurrenceSpecification_Event()
	 * @model
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.OccurrenceSpecification#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

} // OccurrenceSpecification
