/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.TimeConstraint#isFirstEvent <em>First Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTimeConstraint()
 * @model
 * @generated
 */
public interface TimeConstraint extends IntervalConstraint {
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
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTimeConstraint_FirstEvent()
	 * @model default="true" dataType="org.emftrace.metamodel.UMLModel.Boolean" ordered="false"
	 * @generated
	 */
	boolean isFirstEvent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.TimeConstraint#isFirstEvent <em>First Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Event</em>' attribute.
	 * @see #isFirstEvent()
	 * @generated
	 */
	void setFirstEvent(boolean value);

} // TimeConstraint
