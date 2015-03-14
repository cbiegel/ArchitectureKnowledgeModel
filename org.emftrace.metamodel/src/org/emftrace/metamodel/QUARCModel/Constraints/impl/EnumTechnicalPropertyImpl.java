/**
 */
package org.emftrace.metamodel.QUARCModel.Constraints.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage;
import org.emftrace.metamodel.QUARCModel.Constraints.EnumTechnicalProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Technical Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Constraints.impl.EnumTechnicalPropertyImpl#getPossibleValues <em>Possible Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumTechnicalPropertyImpl extends TechnicalPropertyImpl implements EnumTechnicalProperty {
	/**
	 * The cached value of the '{@link #getPossibleValues() <em>Possible Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> possibleValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumTechnicalPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.ENUM_TECHNICAL_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPossibleValues() {
		if (possibleValues == null) {
			possibleValues = new EDataTypeUniqueEList<String>(String.class, this, ConstraintsPackage.ENUM_TECHNICAL_PROPERTY__POSSIBLE_VALUES);
		}
		return possibleValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintsPackage.ENUM_TECHNICAL_PROPERTY__POSSIBLE_VALUES:
				return getPossibleValues();
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
			case ConstraintsPackage.ENUM_TECHNICAL_PROPERTY__POSSIBLE_VALUES:
				getPossibleValues().clear();
				getPossibleValues().addAll((Collection<? extends String>)newValue);
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
			case ConstraintsPackage.ENUM_TECHNICAL_PROPERTY__POSSIBLE_VALUES:
				getPossibleValues().clear();
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
			case ConstraintsPackage.ENUM_TECHNICAL_PROPERTY__POSSIBLE_VALUES:
				return possibleValues != null && !possibleValues.isEmpty();
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
		result.append(" (possibleValues: ");
		result.append(possibleValues);
		result.append(')');
		return result.toString();
	}

} //EnumTechnicalPropertyImpl
