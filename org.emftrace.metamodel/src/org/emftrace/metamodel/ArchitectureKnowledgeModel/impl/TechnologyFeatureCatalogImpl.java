/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeatureCatalog;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology Feature Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologyFeatureCatalogImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.impl.TechnologyFeatureCatalogImpl#getTechnologyFeature <em>Technology Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechnologyFeatureCatalogImpl extends ArchitectureKnowledgeModelBaseImpl implements TechnologyFeatureCatalog {
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
	 * The cached value of the '{@link #getTechnologyFeature() <em>Technology Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologyFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<TechnologyFeature> technologyFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologyFeatureCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitectureKnowledgeModelPackage.Literals.TECHNOLOGY_FEATURE_CATALOG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureKnowledgeModelPackage.TECHNOLOGY_FEATURE_CATALOG__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TechnologyFeature> getTechnologyFeature() {
		if (technologyFeature == null) {
			technologyFeature = new EObjectContainmentEList<TechnologyFeature>(TechnologyFeature.class, this, ArchitectureKnowledgeModelPackage.TECHNOLOGY_FEATURE_CATALOG__TECHNOLOGY_FEATURE);
		}
		return technologyFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitectureKnowledgeModelPackage.TECHNOLOGY_FEATURE_CATALOG__TECHNOLOGY_FEATURE:
				return ((InternalEList<?>)getTechnologyFeature()).basicRemove(otherEnd, msgs);
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
			case ArchitectureKnowledgeModelPackage.TECHNOLOGY_FEATURE_CATALOG__DESCRIPTION:
				return getDescription();
			case ArchitectureKnowledgeModelPackage.TECHNOLOGY_FEATURE_CATALOG__TECHNOLOGY_FEATURE:
				return getTechnologyFeature();
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
			case ArchitectureKnowledgeModelPackage.TECHNOLOGY_FEATURE_CATALOG__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ArchitectureKnowledgeModelPackage.TECHNOLOGY_FEATURE_CATALOG__TECHNOLOGY_FEATURE:
				getTechnologyFeature().clear();
				getTechnologyFeature().addAll((Collection<? extends TechnologyFeature>)newValue);
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
			case ArchitectureKnowledgeModelPackage.TECHNOLOGY_FEATURE_CATALOG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ArchitectureKnowledgeModelPackage.TECHNOLOGY_FEATURE_CATALOG__TECHNOLOGY_FEATURE:
				getTechnologyFeature().clear();
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
			case ArchitectureKnowledgeModelPackage.TECHNOLOGY_FEATURE_CATALOG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ArchitectureKnowledgeModelPackage.TECHNOLOGY_FEATURE_CATALOG__TECHNOLOGY_FEATURE:
				return technologyFeature != null && !technologyFeature.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //TechnologyFeatureCatalogImpl
