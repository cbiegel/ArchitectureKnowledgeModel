/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.AcceptCallAction#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getAcceptCallAction()
 * @model
 * @generated
 */
public interface AcceptCallAction extends AcceptEventAction {
	/**
	 * Returns the value of the '<em><b>Return Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Information</em>' containment reference.
	 * @see #setReturnInformation(OutputPin)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getAcceptCallAction_ReturnInformation()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OutputPin getReturnInformation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.AcceptCallAction#getReturnInformation <em>Return Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Information</em>' containment reference.
	 * @see #getReturnInformation()
	 * @generated
	 */
	void setReturnInformation(OutputPin value);

} // AcceptCallAction
