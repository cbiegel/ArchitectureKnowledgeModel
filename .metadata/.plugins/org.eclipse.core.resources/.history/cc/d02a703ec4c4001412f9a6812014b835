/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.Signal;
import org.emftrace.metamodel.BPMN2Model.SignalEventDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.SignalEventDefinitionImpl#getSignalRef <em>Signal Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalEventDefinitionImpl extends EventDefinitionImpl implements SignalEventDefinition {
	/**
	 * The cached value of the '{@link #getSignalRef() <em>Signal Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalRef()
	 * @generated
	 * @ordered
	 */
	protected Signal signalRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalEventDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getSignalEventDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getSignalRef() {
		if (signalRef != null && signalRef.eIsProxy()) {
			InternalEObject oldSignalRef = (InternalEObject)signalRef;
			signalRef = (Signal)eResolveProxy(oldSignalRef);
			if (signalRef != oldSignalRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.SIGNAL_EVENT_DEFINITION__SIGNAL_REF, oldSignalRef, signalRef));
			}
		}
		return signalRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetSignalRef() {
		return signalRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalRef(Signal newSignalRef) {
		Signal oldSignalRef = signalRef;
		signalRef = newSignalRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.SIGNAL_EVENT_DEFINITION__SIGNAL_REF, oldSignalRef, signalRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN2ModelPackage.SIGNAL_EVENT_DEFINITION__SIGNAL_REF:
				if (resolve) return getSignalRef();
				return basicGetSignalRef();
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
			case BPMN2ModelPackage.SIGNAL_EVENT_DEFINITION__SIGNAL_REF:
				setSignalRef((Signal)newValue);
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
			case BPMN2ModelPackage.SIGNAL_EVENT_DEFINITION__SIGNAL_REF:
				setSignalRef((Signal)null);
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
			case BPMN2ModelPackage.SIGNAL_EVENT_DEFINITION__SIGNAL_REF:
				return signalRef != null;
		}
		return super.eIsSet(featureID);
	}

} //SignalEventDefinitionImpl
