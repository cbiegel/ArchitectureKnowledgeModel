/**
 */
package org.emftrace.metamodel.URNModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.URNModel.OWPoisson;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OW Poisson</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.OWPoissonImpl#getMean <em>Mean</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OWPoissonImpl extends OpenWorkloadImpl implements OWPoisson {
	/**
	 * The default value of the '{@link #getMean() <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected static final String MEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMean() <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected String mean = MEAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OWPoissonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.OW_POISSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMean() {
		return mean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMean(String newMean) {
		String oldMean = mean;
		mean = newMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.OW_POISSON__MEAN, oldMean, mean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case URNModelPackage.OW_POISSON__MEAN:
				return getMean();
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
			case URNModelPackage.OW_POISSON__MEAN:
				setMean((String)newValue);
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
			case URNModelPackage.OW_POISSON__MEAN:
				setMean(MEAN_EDEFAULT);
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
			case URNModelPackage.OW_POISSON__MEAN:
				return MEAN_EDEFAULT == null ? mean != null : !MEAN_EDEFAULT.equals(mean);
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
		result.append(" (mean: ");
		result.append(mean);
		result.append(')');
		return result.toString();
	}

} //OWPoissonImpl
