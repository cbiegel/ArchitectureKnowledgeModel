/**
 */
package org.emftrace.metamodel.EMFfitModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.EMFfitModel.CategoryType;
import org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage;
import org.emftrace.metamodel.EMFfitModel.FTEntry;
import org.emftrace.metamodel.EMFfitModel.FactorTable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factor Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.FactorTableImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.FactorTableImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FactorTableImpl extends FTICBaseImpl implements FactorTable {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CategoryType TYPE_EDEFAULT = CategoryType.ORGANIZATIONAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CategoryType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<FTEntry> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactorTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFfitModelPackage.Literals.FACTOR_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CategoryType newType) {
		CategoryType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.FACTOR_TABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FTEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<FTEntry>(FTEntry.class, this, EMFfitModelPackage.FACTOR_TABLE__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFfitModelPackage.FACTOR_TABLE__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
			case EMFfitModelPackage.FACTOR_TABLE__TYPE:
				return getType();
			case EMFfitModelPackage.FACTOR_TABLE__ENTRIES:
				return getEntries();
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
			case EMFfitModelPackage.FACTOR_TABLE__TYPE:
				setType((CategoryType)newValue);
				return;
			case EMFfitModelPackage.FACTOR_TABLE__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends FTEntry>)newValue);
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
			case EMFfitModelPackage.FACTOR_TABLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EMFfitModelPackage.FACTOR_TABLE__ENTRIES:
				getEntries().clear();
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
			case EMFfitModelPackage.FACTOR_TABLE__TYPE:
				return type != TYPE_EDEFAULT;
			case EMFfitModelPackage.FACTOR_TABLE__ENTRIES:
				return entries != null && !entries.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //FactorTableImpl
