/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broadcast Signal Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.BroadcastSignalAction#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBroadcastSignalAction()
 * @model
 * @generated
 */
public interface BroadcastSignalAction extends InvocationAction {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' attribute.
	 * @see #setSignal(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBroadcastSignalAction_Signal()
	 * @model required="true"
	 * @generated
	 */
	String getSignal();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.BroadcastSignalAction#getSignal <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' attribute.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(String value);

} // BroadcastSignalAction
