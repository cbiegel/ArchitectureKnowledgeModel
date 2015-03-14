/**
 */
package org.emftrace.metamodel.UMLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.InteractionUse#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.InteractionUse#getActualGate <em>Actual Gate</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.InteractionUse#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getInteractionUse()
 * @model
 * @generated
 */
public interface InteractionUse extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' attribute.
	 * @see #setRefersTo(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getInteractionUse_RefersTo()
	 * @model required="true"
	 * @generated
	 */
	String getRefersTo();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.InteractionUse#getRefersTo <em>Refers To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' attribute.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(String value);

	/**
	 * Returns the value of the '<em><b>Actual Gate</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Gate</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getInteractionUse_ActualGate()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Gate> getActualGate();

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getInteractionUse_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getArgument();

} // InteractionUse
