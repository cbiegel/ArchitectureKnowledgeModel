/**
 */
package org.emftrace.metamodel.QUARCModel.Constraints.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.QUARCModel.Constraints.BaseCondition;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage;
import org.emftrace.metamodel.QUARCModel.Constraints.LogicCondition;
import org.emftrace.metamodel.QUARCModel.Constraints.LogicalConnectiveTypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Constraints.impl.LogicConditionImpl#getLogicalConnectiveType <em>Logical Connective Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Constraints.impl.LogicConditionImpl#getLogicConditions <em>Logic Conditions</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Constraints.impl.LogicConditionImpl#getBaseConditions <em>Base Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicConditionImpl extends ConstraintsBaseImpl implements LogicCondition {
	/**
	 * The default value of the '{@link #getLogicalConnectiveType() <em>Logical Connective Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalConnectiveType()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalConnectiveTypes LOGICAL_CONNECTIVE_TYPE_EDEFAULT = LogicalConnectiveTypes.NOT;

	/**
	 * The cached value of the '{@link #getLogicalConnectiveType() <em>Logical Connective Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalConnectiveType()
	 * @generated
	 * @ordered
	 */
	protected LogicalConnectiveTypes logicalConnectiveType = LOGICAL_CONNECTIVE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogicConditions() <em>Logic Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicCondition> logicConditions;

	/**
	 * The cached value of the '{@link #getBaseConditions() <em>Base Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseCondition> baseConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.LOGIC_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalConnectiveTypes getLogicalConnectiveType() {
		return logicalConnectiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalConnectiveType(LogicalConnectiveTypes newLogicalConnectiveType) {
		LogicalConnectiveTypes oldLogicalConnectiveType = logicalConnectiveType;
		logicalConnectiveType = newLogicalConnectiveType == null ? LOGICAL_CONNECTIVE_TYPE_EDEFAULT : newLogicalConnectiveType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.LOGIC_CONDITION__LOGICAL_CONNECTIVE_TYPE, oldLogicalConnectiveType, logicalConnectiveType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicCondition> getLogicConditions() {
		if (logicConditions == null) {
			logicConditions = new EObjectContainmentEList<LogicCondition>(LogicCondition.class, this, ConstraintsPackage.LOGIC_CONDITION__LOGIC_CONDITIONS);
		}
		return logicConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseCondition> getBaseConditions() {
		if (baseConditions == null) {
			baseConditions = new EObjectContainmentEList<BaseCondition>(BaseCondition.class, this, ConstraintsPackage.LOGIC_CONDITION__BASE_CONDITIONS);
		}
		return baseConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConstraintsPackage.LOGIC_CONDITION__LOGIC_CONDITIONS:
				return ((InternalEList<?>)getLogicConditions()).basicRemove(otherEnd, msgs);
			case ConstraintsPackage.LOGIC_CONDITION__BASE_CONDITIONS:
				return ((InternalEList<?>)getBaseConditions()).basicRemove(otherEnd, msgs);
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
			case ConstraintsPackage.LOGIC_CONDITION__LOGICAL_CONNECTIVE_TYPE:
				return getLogicalConnectiveType();
			case ConstraintsPackage.LOGIC_CONDITION__LOGIC_CONDITIONS:
				return getLogicConditions();
			case ConstraintsPackage.LOGIC_CONDITION__BASE_CONDITIONS:
				return getBaseConditions();
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
			case ConstraintsPackage.LOGIC_CONDITION__LOGICAL_CONNECTIVE_TYPE:
				setLogicalConnectiveType((LogicalConnectiveTypes)newValue);
				return;
			case ConstraintsPackage.LOGIC_CONDITION__LOGIC_CONDITIONS:
				getLogicConditions().clear();
				getLogicConditions().addAll((Collection<? extends LogicCondition>)newValue);
				return;
			case ConstraintsPackage.LOGIC_CONDITION__BASE_CONDITIONS:
				getBaseConditions().clear();
				getBaseConditions().addAll((Collection<? extends BaseCondition>)newValue);
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
			case ConstraintsPackage.LOGIC_CONDITION__LOGICAL_CONNECTIVE_TYPE:
				setLogicalConnectiveType(LOGICAL_CONNECTIVE_TYPE_EDEFAULT);
				return;
			case ConstraintsPackage.LOGIC_CONDITION__LOGIC_CONDITIONS:
				getLogicConditions().clear();
				return;
			case ConstraintsPackage.LOGIC_CONDITION__BASE_CONDITIONS:
				getBaseConditions().clear();
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
			case ConstraintsPackage.LOGIC_CONDITION__LOGICAL_CONNECTIVE_TYPE:
				return logicalConnectiveType != LOGICAL_CONNECTIVE_TYPE_EDEFAULT;
			case ConstraintsPackage.LOGIC_CONDITION__LOGIC_CONDITIONS:
				return logicConditions != null && !logicConditions.isEmpty();
			case ConstraintsPackage.LOGIC_CONDITION__BASE_CONDITIONS:
				return baseConditions != null && !baseConditions.isEmpty();
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
		result.append(" (logicalConnectiveType: ");
		result.append(logicalConnectiveType);
		result.append(')');
		return result.toString();
	}

} //LogicConditionImpl
