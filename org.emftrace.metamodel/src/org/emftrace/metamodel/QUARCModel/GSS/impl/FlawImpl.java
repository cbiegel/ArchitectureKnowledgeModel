/**
 */
package org.emftrace.metamodel.QUARCModel.GSS.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.QUARCModel.GSS.Flaw;
import org.emftrace.metamodel.QUARCModel.GSS.GSSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flaw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.GSS.impl.FlawImpl#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.GSS.impl.FlawImpl#getInterpretationRule <em>Interpretation Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlawImpl extends PrincipleImpl implements Flaw {
	/**
	 * The default value of the '{@link #getMetrics() <em>Metrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected static final String METRICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected String metrics = METRICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterpretationRule() <em>Interpretation Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretationRule()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERPRETATION_RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterpretationRule() <em>Interpretation Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretationRule()
	 * @generated
	 * @ordered
	 */
	protected String interpretationRule = INTERPRETATION_RULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlawImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GSSPackage.Literals.FLAW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetrics() {
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetrics(String newMetrics) {
		String oldMetrics = metrics;
		metrics = newMetrics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSSPackage.FLAW__METRICS, oldMetrics, metrics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterpretationRule() {
		return interpretationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpretationRule(String newInterpretationRule) {
		String oldInterpretationRule = interpretationRule;
		interpretationRule = newInterpretationRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSSPackage.FLAW__INTERPRETATION_RULE, oldInterpretationRule, interpretationRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GSSPackage.FLAW__METRICS:
				return getMetrics();
			case GSSPackage.FLAW__INTERPRETATION_RULE:
				return getInterpretationRule();
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
			case GSSPackage.FLAW__METRICS:
				setMetrics((String)newValue);
				return;
			case GSSPackage.FLAW__INTERPRETATION_RULE:
				setInterpretationRule((String)newValue);
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
			case GSSPackage.FLAW__METRICS:
				setMetrics(METRICS_EDEFAULT);
				return;
			case GSSPackage.FLAW__INTERPRETATION_RULE:
				setInterpretationRule(INTERPRETATION_RULE_EDEFAULT);
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
			case GSSPackage.FLAW__METRICS:
				return METRICS_EDEFAULT == null ? metrics != null : !METRICS_EDEFAULT.equals(metrics);
			case GSSPackage.FLAW__INTERPRETATION_RULE:
				return INTERPRETATION_RULE_EDEFAULT == null ? interpretationRule != null : !INTERPRETATION_RULE_EDEFAULT.equals(interpretationRule);
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
		result.append(" (metrics: ");
		result.append(metrics);
		result.append(", interpretationRule: ");
		result.append(interpretationRule);
		result.append(')');
		return result.toString();
	}

} //FlawImpl
