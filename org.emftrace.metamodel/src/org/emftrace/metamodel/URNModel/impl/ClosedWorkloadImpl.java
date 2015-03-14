/**
 */
package org.emftrace.metamodel.URNModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.URNModel.ClosedWorkload;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Closed Workload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ClosedWorkloadImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ClosedWorkloadImpl#getExternalDelay <em>External Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClosedWorkloadImpl extends WorkloadImpl implements ClosedWorkload {
	/**
	 * The default value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected static final String POPULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected String population = POPULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalDelay() <em>External Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalDelay() <em>External Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDelay()
	 * @generated
	 * @ordered
	 */
	protected String externalDelay = EXTERNAL_DELAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClosedWorkloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.CLOSED_WORKLOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulation(String newPopulation) {
		String oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.CLOSED_WORKLOAD__POPULATION, oldPopulation, population));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalDelay() {
		return externalDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalDelay(String newExternalDelay) {
		String oldExternalDelay = externalDelay;
		externalDelay = newExternalDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.CLOSED_WORKLOAD__EXTERNAL_DELAY, oldExternalDelay, externalDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case URNModelPackage.CLOSED_WORKLOAD__POPULATION:
				return getPopulation();
			case URNModelPackage.CLOSED_WORKLOAD__EXTERNAL_DELAY:
				return getExternalDelay();
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
			case URNModelPackage.CLOSED_WORKLOAD__POPULATION:
				setPopulation((String)newValue);
				return;
			case URNModelPackage.CLOSED_WORKLOAD__EXTERNAL_DELAY:
				setExternalDelay((String)newValue);
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
			case URNModelPackage.CLOSED_WORKLOAD__POPULATION:
				setPopulation(POPULATION_EDEFAULT);
				return;
			case URNModelPackage.CLOSED_WORKLOAD__EXTERNAL_DELAY:
				setExternalDelay(EXTERNAL_DELAY_EDEFAULT);
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
			case URNModelPackage.CLOSED_WORKLOAD__POPULATION:
				return POPULATION_EDEFAULT == null ? population != null : !POPULATION_EDEFAULT.equals(population);
			case URNModelPackage.CLOSED_WORKLOAD__EXTERNAL_DELAY:
				return EXTERNAL_DELAY_EDEFAULT == null ? externalDelay != null : !EXTERNAL_DELAY_EDEFAULT.equals(externalDelay);
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
		result.append(" (population: ");
		result.append(population);
		result.append(", externalDelay: ");
		result.append(externalDelay);
		result.append(')');
		return result.toString();
	}

} //ClosedWorkloadImpl
