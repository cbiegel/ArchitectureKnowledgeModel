/**
 */
package org.emftrace.metamodel.UMLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Action#getLocalPrecondition <em>Local Precondition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Action#getLocalPostcondition <em>Local Postcondition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Action#getOutput <em>Output</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Action#getInput <em>Input</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Action#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends ExecutableNode {
	/**
	 * Returns the value of the '<em><b>Local Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Precondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Precondition</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getAction_LocalPrecondition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getLocalPrecondition();

	/**
	 * Returns the value of the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Postcondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Postcondition</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getAction_LocalPostcondition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getLocalPostcondition();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getAction_Output()
	 * @model
	 * @generated
	 */
	EList<String> getOutput();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getAction_Input()
	 * @model
	 * @generated
	 */
	EList<String> getInput();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getAction_Context()
	 * @model
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Action#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

} // Action
