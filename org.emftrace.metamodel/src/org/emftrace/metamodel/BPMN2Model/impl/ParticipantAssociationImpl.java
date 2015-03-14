/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.Participant;
import org.emftrace.metamodel.BPMN2Model.ParticipantAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ParticipantAssociationImpl#getInnerParticipantRef <em>Inner Participant Ref</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ParticipantAssociationImpl#getOuterParticipantRef <em>Outer Participant Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantAssociationImpl extends BaseElementImpl implements ParticipantAssociation {
	/**
	 * The cached value of the '{@link #getInnerParticipantRef() <em>Inner Participant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerParticipantRef()
	 * @generated
	 * @ordered
	 */
	protected Participant innerParticipantRef;

	/**
	 * The cached value of the '{@link #getOuterParticipantRef() <em>Outer Participant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterParticipantRef()
	 * @generated
	 * @ordered
	 */
	protected Participant outerParticipantRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getParticipantAssociation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getInnerParticipantRef() {
		if (innerParticipantRef != null && innerParticipantRef.eIsProxy()) {
			InternalEObject oldInnerParticipantRef = (InternalEObject)innerParticipantRef;
			innerParticipantRef = (Participant)eResolveProxy(oldInnerParticipantRef);
			if (innerParticipantRef != oldInnerParticipantRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF, oldInnerParticipantRef, innerParticipantRef));
			}
		}
		return innerParticipantRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetInnerParticipantRef() {
		return innerParticipantRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerParticipantRef(Participant newInnerParticipantRef) {
		Participant oldInnerParticipantRef = innerParticipantRef;
		innerParticipantRef = newInnerParticipantRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF, oldInnerParticipantRef, innerParticipantRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getOuterParticipantRef() {
		if (outerParticipantRef != null && outerParticipantRef.eIsProxy()) {
			InternalEObject oldOuterParticipantRef = (InternalEObject)outerParticipantRef;
			outerParticipantRef = (Participant)eResolveProxy(oldOuterParticipantRef);
			if (outerParticipantRef != oldOuterParticipantRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF, oldOuterParticipantRef, outerParticipantRef));
			}
		}
		return outerParticipantRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetOuterParticipantRef() {
		return outerParticipantRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterParticipantRef(Participant newOuterParticipantRef) {
		Participant oldOuterParticipantRef = outerParticipantRef;
		outerParticipantRef = newOuterParticipantRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF, oldOuterParticipantRef, outerParticipantRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN2ModelPackage.PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF:
				if (resolve) return getInnerParticipantRef();
				return basicGetInnerParticipantRef();
			case BPMN2ModelPackage.PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF:
				if (resolve) return getOuterParticipantRef();
				return basicGetOuterParticipantRef();
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
			case BPMN2ModelPackage.PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF:
				setInnerParticipantRef((Participant)newValue);
				return;
			case BPMN2ModelPackage.PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF:
				setOuterParticipantRef((Participant)newValue);
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
			case BPMN2ModelPackage.PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF:
				setInnerParticipantRef((Participant)null);
				return;
			case BPMN2ModelPackage.PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF:
				setOuterParticipantRef((Participant)null);
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
			case BPMN2ModelPackage.PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF:
				return innerParticipantRef != null;
			case BPMN2ModelPackage.PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF:
				return outerParticipantRef != null;
		}
		return super.eIsSet(featureID);
	}

} //ParticipantAssociationImpl
