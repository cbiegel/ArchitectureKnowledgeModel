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

import org.emftrace.metamodel.RuleModel.ActionDefinition;
import org.emftrace.metamodel.RuleModel.ElementDefinition;
import org.emftrace.metamodel.RuleModel.LogicCondition;
import org.emftrace.metamodel.RuleModel.Rule;
import org.emftrace.metamodel.RuleModel.RuleModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.RuleModel.impl.RuleImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.emftrace.metamodel.RuleModel.impl.RuleImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.emftrace.metamodel.RuleModel.impl.RuleImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.emftrace.metamodel.RuleModel.impl.RuleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.RuleModel.impl.RuleImpl#getRuleID <em>Rule ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends RuleBaseImpl implements Rule {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinition> elements;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionDefinition> actions;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected LogicCondition conditions;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuleID() <em>Rule ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleID()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleID() <em>Rule ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleID()
	 * @generated
	 * @ordered
	 */
	protected String ruleID = RULE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuleModelPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementDefinition> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ElementDefinition>(ElementDefinition.class, this, RuleModelPackage.RULE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionDefinition> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<ActionDefinition>(ActionDefinition.class, this, RuleModelPackage.RULE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicCondition getConditions() {
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditions(LogicCondition newConditions, NotificationChain msgs) {
		LogicCondition oldConditions = conditions;
		conditions = newConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuleModelPackage.RULE__CONDITIONS, oldConditions, newConditions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditions(LogicCondition newConditions) {
		if (newConditions != conditions) {
			NotificationChain msgs = null;
			if (conditions != null)
				msgs = ((InternalEObject)conditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuleModelPackage.RULE__CONDITIONS, null, msgs);
			if (newConditions != null)
				msgs = ((InternalEObject)newConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuleModelPackage.RULE__CONDITIONS, null, msgs);
			msgs = basicSetConditions(newConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuleModelPackage.RULE__CONDITIONS, newConditions, newConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuleModelPackage.RULE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuleID() {
		return ruleID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleID(String newRuleID) {
		String oldRuleID = ruleID;
		ruleID = newRuleID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuleModelPackage.RULE__RULE_ID, oldRuleID, ruleID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuleModelPackage.RULE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case RuleModelPackage.RULE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case RuleModelPackage.RULE__CONDITIONS:
				return basicSetConditions(null, msgs);
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
			case RuleModelPackage.RULE__ELEMENTS:
				return getElements();
			case RuleModelPackage.RULE__ACTIONS:
				return getActions();
			case RuleModelPackage.RULE__CONDITIONS:
				return getConditions();
			case RuleModelPackage.RULE__DESCRIPTION:
				return getDescription();
			case RuleModelPackage.RULE__RULE_ID:
				return getRuleID();
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
			case RuleModelPackage.RULE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ElementDefinition>)newValue);
				return;
			case RuleModelPackage.RULE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends ActionDefinition>)newValue);
				return;
			case RuleModelPackage.RULE__CONDITIONS:
				setConditions((LogicCondition)newValue);
				return;
			case RuleModelPackage.RULE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RuleModelPackage.RULE__RULE_ID:
				setRuleID((String)newValue);
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
			case RuleModelPackage.RULE__ELEMENTS:
				getElements().clear();
				return;
			case RuleModelPackage.RULE__ACTIONS:
				getActions().clear();
				return;
			case RuleModelPackage.RULE__CONDITIONS:
				setConditions((LogicCondition)null);
				return;
			case RuleModelPackage.RULE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RuleModelPackage.RULE__RULE_ID:
				setRuleID(RULE_ID_EDEFAULT);
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
			case RuleModelPackage.RULE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case RuleModelPackage.RULE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case RuleModelPackage.RULE__CONDITIONS:
				return conditions != null;
			case RuleModelPackage.RULE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RuleModelPackage.RULE__RULE_ID:
				return RULE_ID_EDEFAULT == null ? ruleID != null : !RULE_ID_EDEFAULT.equals(ruleID);
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
		result.append(" (Description: ");
		result.append(description);
		result.append(", RuleID: ");
		result.append(ruleID);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
