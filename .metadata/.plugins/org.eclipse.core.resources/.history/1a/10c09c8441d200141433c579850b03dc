/**
 */
package org.emftrace.metamodel.URNModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.URNModel.URNModelPackage;
import org.emftrace.metamodel.URNModel.WaitKind;
import org.emftrace.metamodel.URNModel.WaitingPlace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Waiting Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.WaitingPlaceImpl#getWaitType <em>Wait Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WaitingPlaceImpl extends PathNodeImpl implements WaitingPlace {
	/**
	 * The default value of the '{@link #getWaitType() <em>Wait Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitType()
	 * @generated
	 * @ordered
	 */
	protected static final WaitKind WAIT_TYPE_EDEFAULT = WaitKind.TRANSIENT;

	/**
	 * The cached value of the '{@link #getWaitType() <em>Wait Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitType()
	 * @generated
	 * @ordered
	 */
	protected WaitKind waitType = WAIT_TYPE_EDEFAULT;

	/**
	 * This is true if the Wait Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean waitTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaitingPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.WAITING_PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitKind getWaitType() {
		return waitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitType(WaitKind newWaitType) {
		WaitKind oldWaitType = waitType;
		waitType = newWaitType == null ? WAIT_TYPE_EDEFAULT : newWaitType;
		boolean oldWaitTypeESet = waitTypeESet;
		waitTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.WAITING_PLACE__WAIT_TYPE, oldWaitType, waitType, !oldWaitTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWaitType() {
		WaitKind oldWaitType = waitType;
		boolean oldWaitTypeESet = waitTypeESet;
		waitType = WAIT_TYPE_EDEFAULT;
		waitTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, URNModelPackage.WAITING_PLACE__WAIT_TYPE, oldWaitType, WAIT_TYPE_EDEFAULT, oldWaitTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWaitType() {
		return waitTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case URNModelPackage.WAITING_PLACE__WAIT_TYPE:
				return getWaitType();
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
			case URNModelPackage.WAITING_PLACE__WAIT_TYPE:
				setWaitType((WaitKind)newValue);
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
			case URNModelPackage.WAITING_PLACE__WAIT_TYPE:
				unsetWaitType();
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
			case URNModelPackage.WAITING_PLACE__WAIT_TYPE:
				return isSetWaitType();
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
		result.append(" (waitType: ");
		if (waitTypeESet) result.append(waitType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //WaitingPlaceImpl
