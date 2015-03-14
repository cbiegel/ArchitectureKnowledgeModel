/**
 */
package org.emftrace.metamodel.URNModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.URNModel.Timer;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.TimerImpl#getTimeoutPath <em>Timeout Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimerImpl extends WaitingPlaceImpl implements Timer {
	/**
	 * The default value of the '{@link #getTimeoutPath() <em>Timeout Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutPath()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeoutPath() <em>Timeout Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutPath()
	 * @generated
	 * @ordered
	 */
	protected String timeoutPath = TIMEOUT_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.TIMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeoutPath() {
		return timeoutPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeoutPath(String newTimeoutPath) {
		String oldTimeoutPath = timeoutPath;
		timeoutPath = newTimeoutPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.TIMER__TIMEOUT_PATH, oldTimeoutPath, timeoutPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case URNModelPackage.TIMER__TIMEOUT_PATH:
				return getTimeoutPath();
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
			case URNModelPackage.TIMER__TIMEOUT_PATH:
				setTimeoutPath((String)newValue);
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
			case URNModelPackage.TIMER__TIMEOUT_PATH:
				setTimeoutPath(TIMEOUT_PATH_EDEFAULT);
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
			case URNModelPackage.TIMER__TIMEOUT_PATH:
				return TIMEOUT_PATH_EDEFAULT == null ? timeoutPath != null : !TIMEOUT_PATH_EDEFAULT.equals(timeoutPath);
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
		result.append(" (timeoutPath: ");
		result.append(timeoutPath);
		result.append(')');
		return result.toString();
	}

} //TimerImpl
