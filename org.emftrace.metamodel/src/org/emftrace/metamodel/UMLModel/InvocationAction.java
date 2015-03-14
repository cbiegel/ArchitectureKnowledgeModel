/**
 */
package org.emftrace.metamodel.UMLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.InvocationAction#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.InvocationAction#getOnPort <em>On Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getInvocationAction()
 * @model abstract="true"
 * @generated
 */
public interface InvocationAction extends Action {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getInvocationAction_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPin> getArgument();

	/**
	 * Returns the value of the '<em><b>On Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Port</em>' attribute.
	 * @see #setOnPort(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getInvocationAction_OnPort()
	 * @model
	 * @generated
	 */
	String getOnPort();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.InvocationAction#getOnPort <em>On Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Port</em>' attribute.
	 * @see #getOnPort()
	 * @generated
	 */
	void setOnPort(String value);

} // InvocationAction
