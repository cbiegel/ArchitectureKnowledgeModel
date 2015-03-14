/**
 */
package org.emftrace.metamodel.QUARCModel.Query.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;

import org.emftrace.metamodel.QUARCModel.Query.PrioritizedDecomposition;
import org.emftrace.metamodel.QUARCModel.Query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prioritized Decomposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.PrioritizedDecompositionImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.PrioritizedDecompositionImpl#getDecompostion <em>Decompostion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrioritizedDecompositionImpl extends GSSQueryModelBaseImpl implements PrioritizedDecomposition {
	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final String WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected String weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDecompostion() <em>Decompostion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecompostion()
	 * @generated
	 * @ordered
	 */
	protected Decomposition decompostion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrioritizedDecompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.PRIORITIZED_DECOMPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(String newWeight) {
		String oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.PRIORITIZED_DECOMPOSITION__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decomposition getDecompostion() {
		if (decompostion != null && decompostion.eIsProxy()) {
			InternalEObject oldDecompostion = (InternalEObject)decompostion;
			decompostion = (Decomposition)eResolveProxy(oldDecompostion);
			if (decompostion != oldDecompostion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QueryPackage.PRIORITIZED_DECOMPOSITION__DECOMPOSTION, oldDecompostion, decompostion));
			}
		}
		return decompostion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decomposition basicGetDecompostion() {
		return decompostion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecompostion(Decomposition newDecompostion) {
		Decomposition oldDecompostion = decompostion;
		decompostion = newDecompostion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.PRIORITIZED_DECOMPOSITION__DECOMPOSTION, oldDecompostion, decompostion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.PRIORITIZED_DECOMPOSITION__WEIGHT:
				return getWeight();
			case QueryPackage.PRIORITIZED_DECOMPOSITION__DECOMPOSTION:
				if (resolve) return getDecompostion();
				return basicGetDecompostion();
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
			case QueryPackage.PRIORITIZED_DECOMPOSITION__WEIGHT:
				setWeight((String)newValue);
				return;
			case QueryPackage.PRIORITIZED_DECOMPOSITION__DECOMPOSTION:
				setDecompostion((Decomposition)newValue);
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
			case QueryPackage.PRIORITIZED_DECOMPOSITION__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case QueryPackage.PRIORITIZED_DECOMPOSITION__DECOMPOSTION:
				setDecompostion((Decomposition)null);
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
			case QueryPackage.PRIORITIZED_DECOMPOSITION__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
			case QueryPackage.PRIORITIZED_DECOMPOSITION__DECOMPOSTION:
				return decompostion != null;
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
		result.append(" (weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //PrioritizedDecompositionImpl
