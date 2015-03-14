/**
 */
package org.emftrace.metamodel.UMLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.State#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.State#isIsOrthogonal <em>Is Orthogonal</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.State#isIsSimple <em>Is Simple</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.State#isIsSubmachineState <em>Is Submachine State</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.State#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.State#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.State#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.State#getRedefinedState <em>Redefined State</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.State#getStateInvariant <em>State Invariant</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.State#getExit <em>Exit</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.State#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.State#getDeferrableTrigger <em>Deferrable Trigger</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.State#getRegion <em>Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getState()
 * @model
 * @generated
 */
public interface State extends Namespace, RedefinableElement, Vertex {
	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getState_IsComposite()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsComposite();

	/**
	 * Returns the value of the '<em><b>Is Orthogonal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Orthogonal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Orthogonal</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getState_IsOrthogonal()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsOrthogonal();

	/**
	 * Returns the value of the '<em><b>Is Simple</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Simple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Simple</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getState_IsSimple()
	 * @model default="true" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsSimple();

	/**
	 * Returns the value of the '<em><b>Is Submachine State</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Submachine State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Submachine State</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getState_IsSubmachineState()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsSubmachineState();

	/**
	 * Returns the value of the '<em><b>Submachine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submachine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submachine</em>' attribute.
	 * @see #setSubmachine(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getState_Submachine()
	 * @model
	 * @generated
	 */
	String getSubmachine();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.State#getSubmachine <em>Submachine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submachine</em>' attribute.
	 * @see #getSubmachine()
	 * @generated
	 */
	void setSubmachine(String value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.ConnectionPointReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getState_Connection()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ConnectionPointReference> getConnection();

	/**
	 * Returns the value of the '<em><b>Connection Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Point</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getState_ConnectionPoint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pseudostate> getConnectionPoint();

	/**
	 * Returns the value of the '<em><b>Redefined State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined State</em>' attribute.
	 * @see #setRedefinedState(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getState_RedefinedState()
	 * @model
	 * @generated
	 */
	String getRedefinedState();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.State#getRedefinedState <em>Redefined State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined State</em>' attribute.
	 * @see #getRedefinedState()
	 * @generated
	 */
	void setRedefinedState(String value);

	/**
	 * Returns the value of the '<em><b>State Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Invariant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Invariant</em>' containment reference.
	 * @see #setStateInvariant(Constraint)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getState_StateInvariant()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Constraint getStateInvariant();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.State#getStateInvariant <em>State Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Invariant</em>' containment reference.
	 * @see #getStateInvariant()
	 * @generated
	 */
	void setStateInvariant(Constraint value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(Behavior)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getState_Entry()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Behavior getEntry();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.State#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Behavior value);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' containment reference.
	 * @see #setExit(Behavior)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getState_Exit()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Behavior getExit();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.State#getExit <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' containment reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(Behavior value);

	/**
	 * Returns the value of the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Activity</em>' containment reference.
	 * @see #setDoActivity(Behavior)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getState_DoActivity()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Behavior getDoActivity();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.State#getDoActivity <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Activity</em>' containment reference.
	 * @see #getDoActivity()
	 * @generated
	 */
	void setDoActivity(Behavior value);

	/**
	 * Returns the value of the '<em><b>Deferrable Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deferrable Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deferrable Trigger</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getState_DeferrableTrigger()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Trigger> getDeferrableTrigger();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getState_Region()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Region> getRegion();

} // State
