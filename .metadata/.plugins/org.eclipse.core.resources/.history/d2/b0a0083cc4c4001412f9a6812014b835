/**
 */
package org.emftrace.metamodel.ChangeModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.ChangeModel.AbstractChangeType;
import org.emftrace.metamodel.ChangeModel.ChangeModelPackage;
import org.emftrace.metamodel.ChangeModel.ChangeTypeCatalog;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Type Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ChangeModel.impl.ChangeTypeCatalogImpl#getChangeTypes <em>Change Types</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ChangeModel.impl.ChangeTypeCatalogImpl#getCluster <em>Cluster</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeTypeCatalogImpl extends ChangeModelBaseImpl implements ChangeTypeCatalog {
	/**
	 * The cached value of the '{@link #getChangeTypes() <em>Change Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractChangeType> changeTypes;

	/**
	 * The cached value of the '{@link #getCluster() <em>Cluster</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCluster()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeTypeCatalog> cluster;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeTypeCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChangeModelPackage.Literals.CHANGE_TYPE_CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractChangeType> getChangeTypes() {
		if (changeTypes == null) {
			changeTypes = new EObjectContainmentEList<AbstractChangeType>(AbstractChangeType.class, this, ChangeModelPackage.CHANGE_TYPE_CATALOG__CHANGE_TYPES);
		}
		return changeTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeTypeCatalog> getCluster() {
		if (cluster == null) {
			cluster = new EObjectContainmentEList<ChangeTypeCatalog>(ChangeTypeCatalog.class, this, ChangeModelPackage.CHANGE_TYPE_CATALOG__CLUSTER);
		}
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChangeModelPackage.CHANGE_TYPE_CATALOG__CHANGE_TYPES:
				return ((InternalEList<?>)getChangeTypes()).basicRemove(otherEnd, msgs);
			case ChangeModelPackage.CHANGE_TYPE_CATALOG__CLUSTER:
				return ((InternalEList<?>)getCluster()).basicRemove(otherEnd, msgs);
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
			case ChangeModelPackage.CHANGE_TYPE_CATALOG__CHANGE_TYPES:
				return getChangeTypes();
			case ChangeModelPackage.CHANGE_TYPE_CATALOG__CLUSTER:
				return getCluster();
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
			case ChangeModelPackage.CHANGE_TYPE_CATALOG__CHANGE_TYPES:
				getChangeTypes().clear();
				getChangeTypes().addAll((Collection<? extends AbstractChangeType>)newValue);
				return;
			case ChangeModelPackage.CHANGE_TYPE_CATALOG__CLUSTER:
				getCluster().clear();
				getCluster().addAll((Collection<? extends ChangeTypeCatalog>)newValue);
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
			case ChangeModelPackage.CHANGE_TYPE_CATALOG__CHANGE_TYPES:
				getChangeTypes().clear();
				return;
			case ChangeModelPackage.CHANGE_TYPE_CATALOG__CLUSTER:
				getCluster().clear();
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
			case ChangeModelPackage.CHANGE_TYPE_CATALOG__CHANGE_TYPES:
				return changeTypes != null && !changeTypes.isEmpty();
			case ChangeModelPackage.CHANGE_TYPE_CATALOG__CLUSTER:
				return cluster != null && !cluster.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChangeTypeCatalogImpl
