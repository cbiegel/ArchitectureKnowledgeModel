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

import org.emftrace.metamodel.UMLModel.Pseudostate;
import org.emftrace.metamodel.UMLModel.Region;
import org.emftrace.metamodel.UMLModel.StateMachine;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateMachineImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateMachineImpl#getSubmachineState <em>Submachine State</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateMachineImpl#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StateMachineImpl#getExtendedStateMachine <em>Extended State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends BehaviorImpl implements StateMachine {
	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> region;

	/**
	 * The default value of the '{@link #getSubmachineState() <em>Submachine State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmachineState()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBMACHINE_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmachineState() <em>Submachine State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmachineState()
	 * @generated
	 * @ordered
	 */
	protected String submachineState = SUBMACHINE_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectionPoint() <em>Connection Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Pseudostate> connectionPoint;

	/**
	 * The default value of the '{@link #getExtendedStateMachine() <em>Extended State Machine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedStateMachine()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDED_STATE_MACHINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendedStateMachine() <em>Extended State Machine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedStateMachine()
	 * @generated
	 * @ordered
	 */
	protected String extendedStateMachine = EXTENDED_STATE_MACHINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getStateMachine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getRegion() {
		if (region == null) {
			region = new EObjectContainmentEList<Region>(Region.class, this, UMLModelPackage.STATE_MACHINE__REGION);
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubmachineState() {
		return submachineState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmachineState(String newSubmachineState) {
		String oldSubmachineState = submachineState;
		submachineState = newSubmachineState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE_MACHINE__SUBMACHINE_STATE, oldSubmachineState, submachineState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pseudostate> getConnectionPoint() {
		if (connectionPoint == null) {
			connectionPoint = new EObjectContainmentEList<Pseudostate>(Pseudostate.class, this, UMLModelPackage.STATE_MACHINE__CONNECTION_POINT);
		}
		return connectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtendedStateMachine() {
		return extendedStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedStateMachine(String newExtendedStateMachine) {
		String oldExtendedStateMachine = extendedStateMachine;
		extendedStateMachine = newExtendedStateMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE, oldExtendedStateMachine, extendedStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.STATE_MACHINE__REGION:
				return ((InternalEList<?>)getRegion()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.STATE_MACHINE__CONNECTION_POINT:
				return ((InternalEList<?>)getConnectionPoint()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.STATE_MACHINE__REGION:
				return getRegion();
			case UMLModelPackage.STATE_MACHINE__SUBMACHINE_STATE:
				return getSubmachineState();
			case UMLModelPackage.STATE_MACHINE__CONNECTION_POINT:
				return getConnectionPoint();
			case UMLModelPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				return getExtendedStateMachine();
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
			case UMLModelPackage.STATE_MACHINE__REGION:
				getRegion().clear();
				getRegion().addAll((Collection<? extends Region>)newValue);
				return;
			case UMLModelPackage.STATE_MACHINE__SUBMACHINE_STATE:
				setSubmachineState((String)newValue);
				return;
			case UMLModelPackage.STATE_MACHINE__CONNECTION_POINT:
				getConnectionPoint().clear();
				getConnectionPoint().addAll((Collection<? extends Pseudostate>)newValue);
				return;
			case UMLModelPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				setExtendedStateMachine((String)newValue);
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
			case UMLModelPackage.STATE_MACHINE__REGION:
				getRegion().clear();
				return;
			case UMLModelPackage.STATE_MACHINE__SUBMACHINE_STATE:
				setSubmachineState(SUBMACHINE_STATE_EDEFAULT);
				return;
			case UMLModelPackage.STATE_MACHINE__CONNECTION_POINT:
				getConnectionPoint().clear();
				return;
			case UMLModelPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				setExtendedStateMachine(EXTENDED_STATE_MACHINE_EDEFAULT);
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
			case UMLModelPackage.STATE_MACHINE__REGION:
				return region != null && !region.isEmpty();
			case UMLModelPackage.STATE_MACHINE__SUBMACHINE_STATE:
				return SUBMACHINE_STATE_EDEFAULT == null ? submachineState != null : !SUBMACHINE_STATE_EDEFAULT.equals(submachineState);
			case UMLModelPackage.STATE_MACHINE__CONNECTION_POINT:
				return connectionPoint != null && !connectionPoint.isEmpty();
			case UMLModelPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				return EXTENDED_STATE_MACHINE_EDEFAULT == null ? extendedStateMachine != null : !EXTENDED_STATE_MACHINE_EDEFAULT.equals(extendedStateMachine);
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
		result.append(" (submachineState: ");
		result.append(submachineState);
		result.append(", extendedStateMachine: ");
		result.append(extendedStateMachine);
		result.append(')');
		return result.toString();
	}

} //StateMachineImpl
