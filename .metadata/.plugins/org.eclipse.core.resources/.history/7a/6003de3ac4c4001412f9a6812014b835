/**
 */
package org.emftrace.metamodel.LinkModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.LinkModel.LinkModelPackage;
import org.emftrace.metamodel.LinkModel.LinkType;
import org.emftrace.metamodel.LinkModel.LinkTypeCatalog;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Type Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.LinkModel.impl.LinkTypeCatalogImpl#getLinkTypes <em>Link Types</em>}</li>
 *   <li>{@link org.emftrace.metamodel.LinkModel.impl.LinkTypeCatalogImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.LinkModel.impl.LinkTypeCatalogImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkTypeCatalogImpl extends LinkBaseImpl implements LinkTypeCatalog {
	/**
	 * The cached value of the '{@link #getLinkTypes() <em>Link Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkType> linkTypes;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkTypeCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinkModelPackage.Literals.LINK_TYPE_CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkType> getLinkTypes() {
		if (linkTypes == null) {
			linkTypes = new EObjectContainmentEList<LinkType>(LinkType.class, this, LinkModelPackage.LINK_TYPE_CATALOG__LINK_TYPES);
		}
		return linkTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkModelPackage.LINK_TYPE_CATALOG__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LinkModelPackage.LINK_TYPE_CATALOG__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LinkModelPackage.LINK_TYPE_CATALOG__LINK_TYPES:
				return ((InternalEList<?>)getLinkTypes()).basicRemove(otherEnd, msgs);
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
			case LinkModelPackage.LINK_TYPE_CATALOG__LINK_TYPES:
				return getLinkTypes();
			case LinkModelPackage.LINK_TYPE_CATALOG__NAME:
				return getName();
			case LinkModelPackage.LINK_TYPE_CATALOG__DESCRIPTION:
				return getDescription();
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
			case LinkModelPackage.LINK_TYPE_CATALOG__LINK_TYPES:
				getLinkTypes().clear();
				getLinkTypes().addAll((Collection<? extends LinkType>)newValue);
				return;
			case LinkModelPackage.LINK_TYPE_CATALOG__NAME:
				setName((String)newValue);
				return;
			case LinkModelPackage.LINK_TYPE_CATALOG__DESCRIPTION:
				setDescription((String)newValue);
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
			case LinkModelPackage.LINK_TYPE_CATALOG__LINK_TYPES:
				getLinkTypes().clear();
				return;
			case LinkModelPackage.LINK_TYPE_CATALOG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LinkModelPackage.LINK_TYPE_CATALOG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case LinkModelPackage.LINK_TYPE_CATALOG__LINK_TYPES:
				return linkTypes != null && !linkTypes.isEmpty();
			case LinkModelPackage.LINK_TYPE_CATALOG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LinkModelPackage.LINK_TYPE_CATALOG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //LinkTypeCatalogImpl
