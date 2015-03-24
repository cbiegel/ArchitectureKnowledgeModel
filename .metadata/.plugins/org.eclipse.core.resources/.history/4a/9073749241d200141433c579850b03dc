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
import org.emftrace.metamodel.BPMN2Model.CallChoreography;
import org.emftrace.metamodel.BPMN2Model.Choreography;
import org.emftrace.metamodel.BPMN2Model.ParticipantAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Choreography</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.CallChoreographyImpl#getParticipantAssociations <em>Participant Associations</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.CallChoreographyImpl#getCalledChoreographyRef <em>Called Choreography Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallChoreographyImpl extends ChoreographyActivityImpl implements CallChoreography {
	/**
	 * The cached value of the '{@link #getParticipantAssociations() <em>Participant Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<ParticipantAssociation> participantAssociations;

	/**
	 * The cached value of the '{@link #getCalledChoreographyRef() <em>Called Choreography Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledChoreographyRef()
	 * @generated
	 * @ordered
	 */
	protected Choreography calledChoreographyRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallChoreographyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getCallChoreography();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParticipantAssociation> getParticipantAssociations() {
		if (participantAssociations == null) {
			participantAssociations = new EObjectContainmentEList<ParticipantAssociation>(ParticipantAssociation.class, this, BPMN2ModelPackage.CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS);
		}
		return participantAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choreography getCalledChoreographyRef() {
		if (calledChoreographyRef != null && calledChoreographyRef.eIsProxy()) {
			InternalEObject oldCalledChoreographyRef = (InternalEObject)calledChoreographyRef;
			calledChoreographyRef = (Choreography)eResolveProxy(oldCalledChoreographyRef);
			if (calledChoreographyRef != oldCalledChoreographyRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF, oldCalledChoreographyRef, calledChoreographyRef));
			}
		}
		return calledChoreographyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choreography basicGetCalledChoreographyRef() {
		return calledChoreographyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledChoreographyRef(Choreography newCalledChoreographyRef) {
		Choreography oldCalledChoreographyRef = calledChoreographyRef;
		calledChoreographyRef = newCalledChoreographyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF, oldCalledChoreographyRef, calledChoreographyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
				return ((InternalEList<?>)getParticipantAssociations()).basicRemove(otherEnd, msgs);
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
			case BPMN2ModelPackage.CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
				return getParticipantAssociations();
			case BPMN2ModelPackage.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF:
				if (resolve) return getCalledChoreographyRef();
				return basicGetCalledChoreographyRef();
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
			case BPMN2ModelPackage.CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
				getParticipantAssociations().clear();
				getParticipantAssociations().addAll((Collection<? extends ParticipantAssociation>)newValue);
				return;
			case BPMN2ModelPackage.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF:
				setCalledChoreographyRef((Choreography)newValue);
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
			case BPMN2ModelPackage.CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
				getParticipantAssociations().clear();
				return;
			case BPMN2ModelPackage.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF:
				setCalledChoreographyRef((Choreography)null);
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
			case BPMN2ModelPackage.CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
				return participantAssociations != null && !participantAssociations.isEmpty();
			case BPMN2ModelPackage.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF:
				return calledChoreographyRef != null;
		}
		return super.eIsSet(featureID);
	}

} //CallChoreographyImpl
