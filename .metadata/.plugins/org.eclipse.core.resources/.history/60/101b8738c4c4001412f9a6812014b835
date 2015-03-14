/**
 */
package org.emftrace.metamodel.RuleModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.LogicCondition;
import org.emftrace.metamodel.RuleModel.LogicConditionType;
import org.emftrace.metamodel.RuleModel.RuleModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.RuleModel.impl.LogicConditionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.RuleModel.impl.LogicConditionImpl#getBaseConditions <em>Base Conditions</em>}</li>
 *   <li>{@link org.emftrace.metamodel.RuleModel.impl.LogicConditionImpl#getLogicConditions <em>Logic Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicConditionImpl extends RuleBaseImpl implements LogicCondition {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final LogicConditionType TYPE_EDEFAULT = LogicConditionType.AND;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected LogicConditionType type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getLogicConditions() <em>Logic Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicCondition> logicConditions;

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
		return RuleModelPackage.Literals.LOGIC_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicConditionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(LogicConditionType newType) {
		LogicConditionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuleModelPackage.LOGIC_CONDITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseCondition> getBaseConditions() {
		if (baseConditions == null) {
			baseConditions = new EObjectContainmentEList<BaseCondition>(BaseCondition.class, this, RuleModelPackage.LOGIC_CONDITION__BASE_CONDITIONS);
		}
		return baseConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicCondition> getLogicConditions() {
		if (logicConditions == null) {
			logicConditions = new EObjectContainmentEList<LogicCondition>(LogicCondition.class, this, RuleModelPackage.LOGIC_CONDITION__LOGIC_CONDITIONS);
		}
		return logicConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuleModelPackage.LOGIC_CONDITION__BASE_CONDITIONS:
				return ((InternalEList<?>)getBaseConditions()).basicRemove(otherEnd, msgs);
			case RuleModelPackage.LOGIC_CONDITION__LOGIC_CONDITIONS:
				return ((InternalEList<?>)getLogicConditions()).basicRemove(otherEnd, msgs);
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
			case RuleModelPackage.LOGIC_CONDITION__TYPE:
				return getType();
			case RuleModelPackage.LOGIC_CONDITION__BASE_CONDITIONS:
				return getBaseConditions();
			case RuleModelPackage.LOGIC_CONDITION__LOGIC_CONDITIONS:
				return getLogicConditions();
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
			case RuleModelPackage.LOGIC_CONDITION__TYPE:
				setType((LogicConditionType)newValue);
				return;
			case RuleModelPackage.LOGIC_CONDITION__BASE_CONDITIONS:
				getBaseConditions().clear();
				getBaseConditions().addAll((Collection<? extends BaseCondition>)newValue);
				return;
			case RuleModelPackage.LOGIC_CONDITION__LOGIC_CONDITIONS:
				getLogicConditions().clear();
				getLogicConditions().addAll((Collection<? extends LogicCondition>)newValue);
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
			case RuleModelPackage.LOGIC_CONDITION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RuleModelPackage.LOGIC_CONDITION__BASE_CONDITIONS:
				getBaseConditions().clear();
				return;
			case RuleModelPackage.LOGIC_CONDITION__LOGIC_CONDITIONS:
				getLogicConditions().clear();
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
			case RuleModelPackage.LOGIC_CONDITION__TYPE:
				return type != TYPE_EDEFAULT;
			case RuleModelPackage.LOGIC_CONDITION__BASE_CONDITIONS:
				return baseConditions != null && !baseConditions.isEmpty();
			case RuleModelPackage.LOGIC_CONDITION__LOGIC_CONDITIONS:
				return logicConditions != null && !logicConditions.isEmpty();
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
		result.append(" (Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //LogicConditionImpl
