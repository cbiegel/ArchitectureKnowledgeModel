/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.CorrelationPropertyRetrievalExpression;
import org.emftrace.metamodel.BPMN2Model.FormalExpression;
import org.emftrace.metamodel.BPMN2Model.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Property Retrieval Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.CorrelationPropertyRetrievalExpressionImpl#getMessagePath <em>Message Path</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.CorrelationPropertyRetrievalExpressionImpl#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrelationPropertyRetrievalExpressionImpl extends BaseElementImpl implements CorrelationPropertyRetrievalExpression {
	/**
	 * The cached value of the '{@link #getMessagePath() <em>Message Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagePath()
	 * @generated
	 * @ordered
	 */
	protected FormalExpression messagePath;

	/**
	 * The cached value of the '{@link #getMessageRef() <em>Message Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRef()
	 * @generated
	 * @ordered
	 */
	protected Message messageRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationPropertyRetrievalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getCorrelationPropertyRetrievalExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression getMessagePath() {
		return messagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessagePath(FormalExpression newMessagePath, NotificationChain msgs) {
		FormalExpression oldMessagePath = messagePath;
		messagePath = newMessagePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, oldMessagePath, newMessagePath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessagePath(FormalExpression newMessagePath) {
		if (newMessagePath != messagePath) {
			NotificationChain msgs = null;
			if (messagePath != null)
				msgs = ((InternalEObject)messagePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, null, msgs);
			if (newMessagePath != null)
				msgs = ((InternalEObject)newMessagePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, null, msgs);
			msgs = basicSetMessagePath(newMessagePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, newMessagePath, newMessagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessageRef() {
		if (messageRef != null && messageRef.eIsProxy()) {
			InternalEObject oldMessageRef = (InternalEObject)messageRef;
			messageRef = (Message)eResolveProxy(oldMessageRef);
			if (messageRef != oldMessageRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF, oldMessageRef, messageRef));
			}
		}
		return messageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetMessageRef() {
		return messageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageRef(Message newMessageRef) {
		Message oldMessageRef = messageRef;
		messageRef = newMessageRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF, oldMessageRef, messageRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
				return basicSetMessagePath(null, msgs);
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
			case BPMN2ModelPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
				return getMessagePath();
			case BPMN2ModelPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
				if (resolve) return getMessageRef();
				return basicGetMessageRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BPMN2ModelPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
				setMessagePath((FormalExpression)newValue);
				return;
			case BPMN2ModelPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
				setMessageRef((Message)newValue);
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
			case BPMN2ModelPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
				setMessagePath((FormalExpression)null);
				return;
			case BPMN2ModelPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
				setMessageRef((Message)null);
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
			case BPMN2ModelPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
				return messagePath != null;
			case BPMN2ModelPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
				return messageRef != null;
		}
		return super.eIsSet(featureID);
	}

} //CorrelationPropertyRetrievalExpressionImpl
