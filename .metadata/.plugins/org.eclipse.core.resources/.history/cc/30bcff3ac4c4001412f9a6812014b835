/**
 */
package org.emftrace.metamodel.FeatureModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.FeatureModel.FeatureModelPackage;
import org.emftrace.metamodel.FeatureModel.RestSet;
import org.emftrace.metamodel.FeatureModel.Restrictions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restrictions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.impl.RestrictionsImpl#getRestset <em>Restset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestrictionsImpl extends FeatureModelBaseImpl implements Restrictions {
	/**
	 * The cached value of the '{@link #getRestset() <em>Restset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestset()
	 * @generated
	 * @ordered
	 */
	protected EList<RestSet> restset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureModelPackage.Literals.RESTRICTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RestSet> getRestset() {
		if (restset == null) {
			restset = new EObjectContainmentEList<RestSet>(RestSet.class, this, FeatureModelPackage.RESTRICTIONS__RESTSET);
		}
		return restset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureModelPackage.RESTRICTIONS__RESTSET:
				return ((InternalEList<?>)getRestset()).basicRemove(otherEnd, msgs);
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
			case FeatureModelPackage.RESTRICTIONS__RESTSET:
				return getRestset();
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
			case FeatureModelPackage.RESTRICTIONS__RESTSET:
				getRestset().clear();
				getRestset().addAll((Collection<? extends RestSet>)newValue);
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
			case FeatureModelPackage.RESTRICTIONS__RESTSET:
				getRestset().clear();
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
			case FeatureModelPackage.RESTRICTIONS__RESTSET:
				return restset != null && !restset.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RestrictionsImpl
