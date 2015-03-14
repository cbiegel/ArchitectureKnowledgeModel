/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.Escalation;
import org.emftrace.metamodel.BPMN2Model.EscalationEventDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Escalation Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.EscalationEventDefinitionImpl#getEscalationRef <em>Escalation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EscalationEventDefinitionImpl extends EventDefinitionImpl implements EscalationEventDefinition {
	/**
	 * The cached value of the '{@link #getEscalationRef() <em>Escalation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscalationRef()
	 * @generated
	 * @ordered
	 */
	protected Escalation escalationRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EscalationEventDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getEscalationEventDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Escalation getEscalationRef() {
		if (escalationRef != null && escalationRef.eIsProxy()) {
			InternalEObject oldEscalationRef = (InternalEObject)escalationRef;
			escalationRef = (Escalation)eResolveProxy(oldEscalationRef);
			if (escalationRef != oldEscalationRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.ESCALATION_EVENT_DEFINITION__ESCALATION_REF, oldEscalationRef, escalationRef));
			}
		}
		return escalationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Escalation basicGetEscalationRef() {
		return escalationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscalationRef(Escalation newEscalationRef) {
		Escalation oldEscalationRef = escalationRef;
		escalationRef = newEscalationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.ESCALATION_EVENT_DEFINITION__ESCALATION_REF, oldEscalationRef, escalationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN2ModelPackage.ESCALATION_EVENT_DEFINITION__ESCALATION_REF:
				if (resolve) return getEscalationRef();
				return basicGetEscalationRef();
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
			case BPMN2ModelPackage.ESCALATION_EVENT_DEFINITION__ESCALATION_REF:
				setEscalationRef((Escalation)newValue);
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
			case BPMN2ModelPackage.ESCALATION_EVENT_DEFINITION__ESCALATION_REF:
				setEscalationRef((Escalation)null);
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
			case BPMN2ModelPackage.ESCALATION_EVENT_DEFINITION__ESCALATION_REF:
				return escalationRef != null;
		}
		return super.eIsSet(featureID);
	}

} //EscalationEventDefinitionImpl
