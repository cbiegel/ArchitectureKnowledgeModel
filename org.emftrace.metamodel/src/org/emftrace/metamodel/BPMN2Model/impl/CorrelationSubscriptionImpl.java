/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.CorrelationKey;
import org.emftrace.metamodel.BPMN2Model.CorrelationPropertyBinding;
import org.emftrace.metamodel.BPMN2Model.CorrelationSubscription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.CorrelationSubscriptionImpl#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.CorrelationSubscriptionImpl#getCorrelationKeyRef <em>Correlation Key Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrelationSubscriptionImpl extends BaseElementImpl implements CorrelationSubscription {
	/**
	 * The cached value of the '{@link #getCorrelationPropertyBinding() <em>Correlation Property Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationPropertyBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<CorrelationPropertyBinding> correlationPropertyBinding;

	/**
	 * The cached value of the '{@link #getCorrelationKeyRef() <em>Correlation Key Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationKeyRef()
	 * @generated
	 * @ordered
	 */
	protected CorrelationKey correlationKeyRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationSubscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getCorrelationSubscription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CorrelationPropertyBinding> getCorrelationPropertyBinding() {
		if (correlationPropertyBinding == null) {
			correlationPropertyBinding = new EObjectContainmentEList<CorrelationPropertyBinding>(CorrelationPropertyBinding.class, this, BPMN2ModelPackage.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING);
		}
		return correlationPropertyBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationKey getCorrelationKeyRef() {
		if (correlationKeyRef != null && correlationKeyRef.eIsProxy()) {
			InternalEObject oldCorrelationKeyRef = (InternalEObject)correlationKeyRef;
			correlationKeyRef = (CorrelationKey)eResolveProxy(oldCorrelationKeyRef);
			if (correlationKeyRef != oldCorrelationKeyRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF, oldCorrelationKeyRef, correlationKeyRef));
			}
		}
		return correlationKeyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationKey basicGetCorrelationKeyRef() {
		return correlationKeyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationKeyRef(CorrelationKey newCorrelationKeyRef) {
		CorrelationKey oldCorrelationKeyRef = correlationKeyRef;
		correlationKeyRef = newCorrelationKeyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF, oldCorrelationKeyRef, correlationKeyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				return ((InternalEList<?>)getCorrelationPropertyBinding()).basicRemove(otherEnd, msgs);
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
			case BPMN2ModelPackage.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				return getCorrelationPropertyBinding();
			case BPMN2ModelPackage.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
				if (resolve) return getCorrelationKeyRef();
				return basicGetCorrelationKeyRef();
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
			case BPMN2ModelPackage.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				getCorrelationPropertyBinding().clear();
				getCorrelationPropertyBinding().addAll((Collection<? extends CorrelationPropertyBinding>)newValue);
				return;
			case BPMN2ModelPackage.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
				setCorrelationKeyRef((CorrelationKey)newValue);
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
			case BPMN2ModelPackage.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				getCorrelationPropertyBinding().clear();
				return;
			case BPMN2ModelPackage.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
				setCorrelationKeyRef((CorrelationKey)null);
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
			case BPMN2ModelPackage.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				return correlationPropertyBinding != null && !correlationPropertyBinding.isEmpty();
			case BPMN2ModelPackage.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
				return correlationKeyRef != null;
		}
		return super.eIsSet(featureID);
	}

} //CorrelationSubscriptionImpl
