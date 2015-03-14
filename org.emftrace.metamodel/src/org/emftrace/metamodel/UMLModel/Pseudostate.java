/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Pseudostate#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Pseudostate#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Pseudostate#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getPseudostate()
 * @model
 * @generated
 */
public interface Pseudostate extends Vertex {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"initial"</code>.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.UMLModel.PseudostateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.PseudostateKind
	 * @see #setKind(PseudostateKind)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getPseudostate_Kind()
	 * @model default="initial" required="true" ordered="false"
	 * @generated
	 */
	PseudostateKind getKind();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Pseudostate#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.PseudostateKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PseudostateKind value);

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' attribute.
	 * @see #setStateMachine(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getPseudostate_StateMachine()
	 * @model
	 * @generated
	 */
	String getStateMachine();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Pseudostate#getStateMachine <em>State Machine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' attribute.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getPseudostate_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Pseudostate#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

} // Pseudostate
