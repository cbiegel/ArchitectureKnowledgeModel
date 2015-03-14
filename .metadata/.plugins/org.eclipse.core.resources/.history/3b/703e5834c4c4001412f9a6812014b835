/**
 */
package org.emftrace.metamodel.URNModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.emftrace.metamodel.URNModel.ScenarioGroup;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ScenarioGroupImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioGroupImpl extends UCMmodelElementImpl implements ScenarioGroup {
	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<String> scenarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.SCENARIO_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getScenarios() {
		if (scenarios == null) {
			scenarios = new EDataTypeEList<String>(String.class, this, URNModelPackage.SCENARIO_GROUP__SCENARIOS);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case URNModelPackage.SCENARIO_GROUP__SCENARIOS:
				return getScenarios();
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
			case URNModelPackage.SCENARIO_GROUP__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends String>)newValue);
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
			case URNModelPackage.SCENARIO_GROUP__SCENARIOS:
				getScenarios().clear();
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
			case URNModelPackage.SCENARIO_GROUP__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
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
		result.append(" (scenarios: ");
		result.append(scenarios);
		result.append(')');
		return result.toString();
	}

} //ScenarioGroupImpl
