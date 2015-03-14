/**
 */
package org.emftrace.metamodel.URNModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.URNModel.Evaluation;
import org.emftrace.metamodel.URNModel.EvaluationStrategy;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.EvaluationStrategyImpl#getEvaluations <em>Evaluations</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.EvaluationStrategyImpl#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaluationStrategyImpl extends GRLmodelElementImpl implements EvaluationStrategy {
	/**
	 * The cached value of the '{@link #getEvaluations() <em>Evaluations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluations()
	 * @generated
	 * @ordered
	 */
	protected EList<Evaluation> evaluations;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<String> group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.EVALUATION_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evaluation> getEvaluations() {
		if (evaluations == null) {
			evaluations = new EObjectContainmentEList<Evaluation>(Evaluation.class, this, URNModelPackage.EVALUATION_STRATEGY__EVALUATIONS);
		}
		return evaluations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGroup() {
		if (group == null) {
			group = new EDataTypeEList<String>(String.class, this, URNModelPackage.EVALUATION_STRATEGY__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case URNModelPackage.EVALUATION_STRATEGY__EVALUATIONS:
				return ((InternalEList<?>)getEvaluations()).basicRemove(otherEnd, msgs);
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
			case URNModelPackage.EVALUATION_STRATEGY__EVALUATIONS:
				return getEvaluations();
			case URNModelPackage.EVALUATION_STRATEGY__GROUP:
				return getGroup();
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
			case URNModelPackage.EVALUATION_STRATEGY__EVALUATIONS:
				getEvaluations().clear();
				getEvaluations().addAll((Collection<? extends Evaluation>)newValue);
				return;
			case URNModelPackage.EVALUATION_STRATEGY__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends String>)newValue);
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
			case URNModelPackage.EVALUATION_STRATEGY__EVALUATIONS:
				getEvaluations().clear();
				return;
			case URNModelPackage.EVALUATION_STRATEGY__GROUP:
				getGroup().clear();
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
			case URNModelPackage.EVALUATION_STRATEGY__EVALUATIONS:
				return evaluations != null && !evaluations.isEmpty();
			case URNModelPackage.EVALUATION_STRATEGY__GROUP:
				return group != null && !group.isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //EvaluationStrategyImpl
