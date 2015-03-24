/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.UMLModel.Message;
import org.emftrace.metamodel.UMLModel.MessageKind;
import org.emftrace.metamodel.UMLModel.MessageSort;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;
import org.emftrace.metamodel.UMLModel.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.MessageImpl#getMessageKind <em>Message Kind</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.MessageImpl#getMessageSort <em>Message Sort</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.MessageImpl#getReceiveEvent <em>Receive Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.MessageImpl#getSendEvent <em>Send Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.MessageImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.MessageImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.MessageImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.MessageImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends NamedElementImpl implements Message {
	/**
	 * The default value of the '{@link #getMessageKind() <em>Message Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageKind()
	 * @generated
	 * @ordered
	 */
	protected static final MessageKind MESSAGE_KIND_EDEFAULT = MessageKind.UNKNOWN;

	/**
	 * The cached value of the '{@link #getMessageKind() <em>Message Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageKind()
	 * @generated
	 * @ordered
	 */
	protected MessageKind messageKind = MESSAGE_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageSort() <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSort()
	 * @generated
	 * @ordered
	 */
	protected static final MessageSort MESSAGE_SORT_EDEFAULT = MessageSort.SYNCH_CALL;

	/**
	 * The cached value of the '{@link #getMessageSort() <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSort()
	 * @generated
	 * @ordered
	 */
	protected MessageSort messageSort = MESSAGE_SORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiveEvent() <em>Receive Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVE_EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveEvent() <em>Receive Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveEvent()
	 * @generated
	 * @ordered
	 */
	protected String receiveEvent = RECEIVE_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendEvent() <em>Send Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String SEND_EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendEvent() <em>Send Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendEvent()
	 * @generated
	 * @ordered
	 */
	protected String sendEvent = SEND_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnector() <em>Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected String connector = CONNECTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getInteraction() <em>Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected String interaction = INTERACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> argument;

	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getMessage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageKind getMessageKind() {
		return messageKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSort getMessageSort() {
		return messageSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageSort(MessageSort newMessageSort) {
		MessageSort oldMessageSort = messageSort;
		messageSort = newMessageSort == null ? MESSAGE_SORT_EDEFAULT : newMessageSort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.MESSAGE__MESSAGE_SORT, oldMessageSort, messageSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReceiveEvent() {
		return receiveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveEvent(String newReceiveEvent) {
		String oldReceiveEvent = receiveEvent;
		receiveEvent = newReceiveEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.MESSAGE__RECEIVE_EVENT, oldReceiveEvent, receiveEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSendEvent() {
		return sendEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendEvent(String newSendEvent) {
		String oldSendEvent = sendEvent;
		sendEvent = newSendEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.MESSAGE__SEND_EVENT, oldSendEvent, sendEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnector() {
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(String newConnector) {
		String oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.MESSAGE__CONNECTOR, oldConnector, connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInteraction() {
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(String newInteraction) {
		String oldInteraction = interaction;
		interaction = newInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.MESSAGE__INTERACTION, oldInteraction, interaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<ValueSpecification>(ValueSpecification.class, this, UMLModelPackage.MESSAGE__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(String newSignature) {
		String oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.MESSAGE__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.MESSAGE__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.MESSAGE__MESSAGE_KIND:
				return getMessageKind();
			case UMLModelPackage.MESSAGE__MESSAGE_SORT:
				return getMessageSort();
			case UMLModelPackage.MESSAGE__RECEIVE_EVENT:
				return getReceiveEvent();
			case UMLModelPackage.MESSAGE__SEND_EVENT:
				return getSendEvent();
			case UMLModelPackage.MESSAGE__CONNECTOR:
				return getConnector();
			case UMLModelPackage.MESSAGE__INTERACTION:
				return getInteraction();
			case UMLModelPackage.MESSAGE__ARGUMENT:
				return getArgument();
			case UMLModelPackage.MESSAGE__SIGNATURE:
				return getSignature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLModelPackage.MESSAGE__MESSAGE_SORT:
				setMessageSort((MessageSort)newValue);
				return;
			case UMLModelPackage.MESSAGE__RECEIVE_EVENT:
				setReceiveEvent((String)newValue);
				return;
			case UMLModelPackage.MESSAGE__SEND_EVENT:
				setSendEvent((String)newValue);
				return;
			case UMLModelPackage.MESSAGE__CONNECTOR:
				setConnector((String)newValue);
				return;
			case UMLModelPackage.MESSAGE__INTERACTION:
				setInteraction((String)newValue);
				return;
			case UMLModelPackage.MESSAGE__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UMLModelPackage.MESSAGE__SIGNATURE:
				setSignature((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLModelPackage.MESSAGE__MESSAGE_SORT:
				setMessageSort(MESSAGE_SORT_EDEFAULT);
				return;
			case UMLModelPackage.MESSAGE__RECEIVE_EVENT:
				setReceiveEvent(RECEIVE_EVENT_EDEFAULT);
				return;
			case UMLModelPackage.MESSAGE__SEND_EVENT:
				setSendEvent(SEND_EVENT_EDEFAULT);
				return;
			case UMLModelPackage.MESSAGE__CONNECTOR:
				setConnector(CONNECTOR_EDEFAULT);
				return;
			case UMLModelPackage.MESSAGE__INTERACTION:
				setInteraction(INTERACTION_EDEFAULT);
				return;
			case UMLModelPackage.MESSAGE__ARGUMENT:
				getArgument().clear();
				return;
			case UMLModelPackage.MESSAGE__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLModelPackage.MESSAGE__MESSAGE_KIND:
				return messageKind != MESSAGE_KIND_EDEFAULT;
			case UMLModelPackage.MESSAGE__MESSAGE_SORT:
				return messageSort != MESSAGE_SORT_EDEFAULT;
			case UMLModelPackage.MESSAGE__RECEIVE_EVENT:
				return RECEIVE_EVENT_EDEFAULT == null ? receiveEvent != null : !RECEIVE_EVENT_EDEFAULT.equals(receiveEvent);
			case UMLModelPackage.MESSAGE__SEND_EVENT:
				return SEND_EVENT_EDEFAULT == null ? sendEvent != null : !SEND_EVENT_EDEFAULT.equals(sendEvent);
			case UMLModelPackage.MESSAGE__CONNECTOR:
				return CONNECTOR_EDEFAULT == null ? connector != null : !CONNECTOR_EDEFAULT.equals(connector);
			case UMLModelPackage.MESSAGE__INTERACTION:
				return INTERACTION_EDEFAULT == null ? interaction != null : !INTERACTION_EDEFAULT.equals(interaction);
			case UMLModelPackage.MESSAGE__ARGUMENT:
				return argument != null && !argument.isEmpty();
			case UMLModelPackage.MESSAGE__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (messageKind: ");
		result.append(messageKind);
		result.append(", messageSort: ");
		result.append(messageSort);
		result.append(", receiveEvent: ");
		result.append(receiveEvent);
		result.append(", sendEvent: ");
		result.append(sendEvent);
		result.append(", connector: ");
		result.append(connector);
		result.append(", interaction: ");
		result.append(interaction);
		result.append(", signature: ");
		result.append(signature);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
