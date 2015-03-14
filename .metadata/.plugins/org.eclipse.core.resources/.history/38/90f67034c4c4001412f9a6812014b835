/**
 */
package org.emftrace.metamodel.URNModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.URNModel.Demand;
import org.emftrace.metamodel.URNModel.Responsibility;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ResponsibilityImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ResponsibilityImpl#getDemands <em>Demands</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.ResponsibilityImpl#getRespRefs <em>Resp Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponsibilityImpl extends UCMmodelElementImpl implements Responsibility {
	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDemands() <em>Demands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemands()
	 * @generated
	 * @ordered
	 */
	protected EList<Demand> demands;

	/**
	 * The cached value of the '{@link #getRespRefs() <em>Resp Refs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> respRefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.RESPONSIBILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.RESPONSIBILITY__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Demand> getDemands() {
		if (demands == null) {
			demands = new EObjectContainmentEList<Demand>(Demand.class, this, URNModelPackage.RESPONSIBILITY__DEMANDS);
		}
		return demands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRespRefs() {
		if (respRefs == null) {
			respRefs = new EDataTypeEList<String>(String.class, this, URNModelPackage.RESPONSIBILITY__RESP_REFS);
		}
		return respRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case URNModelPackage.RESPONSIBILITY__DEMANDS:
				return ((InternalEList<?>)getDemands()).basicRemove(otherEnd, msgs);
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
			case URNModelPackage.RESPONSIBILITY__EXPRESSION:
				return getExpression();
			case URNModelPackage.RESPONSIBILITY__DEMANDS:
				return getDemands();
			case URNModelPackage.RESPONSIBILITY__RESP_REFS:
				return getRespRefs();
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
			case URNModelPackage.RESPONSIBILITY__EXPRESSION:
				setExpression((String)newValue);
				return;
			case URNModelPackage.RESPONSIBILITY__DEMANDS:
				getDemands().clear();
				getDemands().addAll((Collection<? extends Demand>)newValue);
				return;
			case URNModelPackage.RESPONSIBILITY__RESP_REFS:
				getRespRefs().clear();
				getRespRefs().addAll((Collection<? extends String>)newValue);
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
			case URNModelPackage.RESPONSIBILITY__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case URNModelPackage.RESPONSIBILITY__DEMANDS:
				getDemands().clear();
				return;
			case URNModelPackage.RESPONSIBILITY__RESP_REFS:
				getRespRefs().clear();
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
			case URNModelPackage.RESPONSIBILITY__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case URNModelPackage.RESPONSIBILITY__DEMANDS:
				return demands != null && !demands.isEmpty();
			case URNModelPackage.RESPONSIBILITY__RESP_REFS:
				return respRefs != null && !respRefs.isEmpty();
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
		result.append(" (expression: ");
		result.append(expression);
		result.append(", respRefs: ");
		result.append(respRefs);
		result.append(')');
		return result.toString();
	}

} //ResponsibilityImpl
