/**
 */
package org.emftrace.metamodel.UMLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Message#getMessageKind <em>Message Kind</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Message#getMessageSort <em>Message Sort</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Message#getReceiveEvent <em>Receive Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Message#getSendEvent <em>Send Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Message#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Message#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Message#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Message#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Message Kind</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.UMLModel.MessageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Kind</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.MessageKind
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getMessage_MessageKind()
	 * @model default="unknown" required="true" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	MessageKind getMessageKind();

	/**
	 * Returns the value of the '<em><b>Message Sort</b></em>' attribute.
	 * The default value is <code>"synchCall"</code>.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.UMLModel.MessageSort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Sort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Sort</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.MessageSort
	 * @see #setMessageSort(MessageSort)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getMessage_MessageSort()
	 * @model default="synchCall" required="true" ordered="false"
	 * @generated
	 */
	MessageSort getMessageSort();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Message#getMessageSort <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Sort</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.MessageSort
	 * @see #getMessageSort()
	 * @generated
	 */
	void setMessageSort(MessageSort value);

	/**
	 * Returns the value of the '<em><b>Receive Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Event</em>' attribute.
	 * @see #setReceiveEvent(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getMessage_ReceiveEvent()
	 * @model
	 * @generated
	 */
	String getReceiveEvent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Message#getReceiveEvent <em>Receive Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Event</em>' attribute.
	 * @see #getReceiveEvent()
	 * @generated
	 */
	void setReceiveEvent(String value);

	/**
	 * Returns the value of the '<em><b>Send Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Event</em>' attribute.
	 * @see #setSendEvent(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getMessage_SendEvent()
	 * @model
	 * @generated
	 */
	String getSendEvent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Message#getSendEvent <em>Send Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Event</em>' attribute.
	 * @see #getSendEvent()
	 * @generated
	 */
	void setSendEvent(String value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' attribute.
	 * @see #setConnector(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getMessage_Connector()
	 * @model
	 * @generated
	 */
	String getConnector();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Message#getConnector <em>Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' attribute.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(String value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' attribute.
	 * @see #setInteraction(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getMessage_Interaction()
	 * @model required="true"
	 * @generated
	 */
	String getInteraction();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Message#getInteraction <em>Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' attribute.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(String value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getMessage_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSpecification> getArgument();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getMessage_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Message#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

} // Message
