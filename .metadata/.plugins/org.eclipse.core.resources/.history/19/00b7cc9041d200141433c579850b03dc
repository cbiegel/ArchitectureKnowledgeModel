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

import org.emftrace.metamodel.FeatureModel.Desc;
import org.emftrace.metamodel.FeatureModel.FeatureModelPackage;
import org.emftrace.metamodel.FeatureModel.Head;
import org.emftrace.metamodel.FeatureModel.Properties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.impl.HeadImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.impl.HeadImpl#getDesc <em>Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeadImpl extends FeatureModelBaseImpl implements Head {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Properties> properties;

	/**
	 * The cached value of the '{@link #getDesc() <em>Desc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected EList<Desc> desc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureModelPackage.Literals.HEAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Properties> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Properties>(Properties.class, this, FeatureModelPackage.HEAD__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Desc> getDesc() {
		if (desc == null) {
			desc = new EObjectContainmentEList<Desc>(Desc.class, this, FeatureModelPackage.HEAD__DESC);
		}
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureModelPackage.HEAD__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case FeatureModelPackage.HEAD__DESC:
				return ((InternalEList<?>)getDesc()).basicRemove(otherEnd, msgs);
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
			case FeatureModelPackage.HEAD__PROPERTIES:
				return getProperties();
			case FeatureModelPackage.HEAD__DESC:
				return getDesc();
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
			case FeatureModelPackage.HEAD__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Properties>)newValue);
				return;
			case FeatureModelPackage.HEAD__DESC:
				getDesc().clear();
				getDesc().addAll((Collection<? extends Desc>)newValue);
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
			case FeatureModelPackage.HEAD__PROPERTIES:
				getProperties().clear();
				return;
			case FeatureModelPackage.HEAD__DESC:
				getDesc().clear();
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
			case FeatureModelPackage.HEAD__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case FeatureModelPackage.HEAD__DESC:
				return desc != null && !desc.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HeadImpl
