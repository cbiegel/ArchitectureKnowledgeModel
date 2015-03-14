/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.TimeExpression;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TimeExpressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TimeExpressionImpl#getObservation <em>Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeExpressionImpl extends ValueSpecificationImpl implements TimeExpression {
	/**
	 * The default value of the '{@link #getExpr() <em>Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected String expr = EXPR_EDEFAULT;

	/**
	 * The default value of the '{@link #getObservation() <em>Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservation() <em>Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected String observation = OBSERVATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getTimeExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpr(String newExpr) {
		String oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TIME_EXPRESSION__EXPR, oldExpr, expr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObservation() {
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservation(String newObservation) {
		String oldObservation = observation;
		observation = newObservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TIME_EXPRESSION__OBSERVATION, oldObservation, observation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.TIME_EXPRESSION__EXPR:
				return getExpr();
			case UMLModelPackage.TIME_EXPRESSION__OBSERVATION:
				return getObservation();
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
			case UMLModelPackage.TIME_EXPRESSION__EXPR:
				setExpr((String)newValue);
				return;
			case UMLModelPackage.TIME_EXPRESSION__OBSERVATION:
				setObservation((String)newValue);
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
			case UMLModelPackage.TIME_EXPRESSION__EXPR:
				setExpr(EXPR_EDEFAULT);
				return;
			case UMLModelPackage.TIME_EXPRESSION__OBSERVATION:
				setObservation(OBSERVATION_EDEFAULT);
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
			case UMLModelPackage.TIME_EXPRESSION__EXPR:
				return EXPR_EDEFAULT == null ? expr != null : !EXPR_EDEFAULT.equals(expr);
			case UMLModelPackage.TIME_EXPRESSION__OBSERVATION:
				return OBSERVATION_EDEFAULT == null ? observation != null : !OBSERVATION_EDEFAULT.equals(observation);
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
		result.append(" (expr: ");
		result.append(expr);
		result.append(", observation: ");
		result.append(observation);
		result.append(')');
		return result.toString();
	}

} //TimeExpressionImpl
