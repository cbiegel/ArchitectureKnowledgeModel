/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.OWLModel.DataProperty;
import org.emftrace.metamodel.OWLModel.EquivalentDataProperties;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Data Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.EquivalentDataPropertiesImpl#getDataProperty <em>Data Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EquivalentDataPropertiesImpl extends DataPropertyAxiomImpl implements EquivalentDataProperties {
	/**
	 * The cached value of the '{@link #getDataProperty() <em>Data Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<DataProperty> dataProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalentDataPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getEquivalentDataProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataProperty> getDataProperty() {
		if (dataProperty == null) {
			dataProperty = new EObjectContainmentEList<DataProperty>(DataProperty.class, this, OWLModelPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY);
		}
		return dataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY:
				return ((InternalEList<?>)getDataProperty()).basicRemove(otherEnd, msgs);
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
			case OWLModelPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY:
				return getDataProperty();
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
			case OWLModelPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY:
				getDataProperty().clear();
				getDataProperty().addAll((Collection<? extends DataProperty>)newValue);
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
			case OWLModelPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY:
				getDataProperty().clear();
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
			case OWLModelPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY:
				return dataProperty != null && !dataProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EquivalentDataPropertiesImpl
