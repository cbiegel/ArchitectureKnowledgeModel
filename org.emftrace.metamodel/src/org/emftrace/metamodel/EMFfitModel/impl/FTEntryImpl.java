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

import org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage;
import org.emftrace.metamodel.EMFfitModel.FTEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FT Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.FTEntryImpl#getNumbering <em>Numbering</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.FTEntryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.impl.FTEntryImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FTEntryImpl extends ItemImpl implements FTEntry {
	/**
	 * The default value of the '{@link #getNumbering() <em>Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumbering()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBERING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumbering() <em>Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumbering()
	 * @generated
	 * @ordered
	 */
	protected String numbering = NUMBERING_EDEFAULT;

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
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<FTEntry> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFfitModelPackage.Literals.FT_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumbering() {
		return numbering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumbering(String newNumbering) {
		String oldNumbering = numbering;
		numbering = newNumbering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.FT_ENTRY__NUMBERING, oldNumbering, numbering));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFfitModelPackage.FT_ENTRY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FTEntry> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<FTEntry>(FTEntry.class, this, EMFfitModelPackage.FT_ENTRY__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFfitModelPackage.FT_ENTRY__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case EMFfitModelPackage.FT_ENTRY__NUMBERING:
				return getNumbering();
			case EMFfitModelPackage.FT_ENTRY__NAME:
				return getName();
			case EMFfitModelPackage.FT_ENTRY__CHILDREN:
				return getChildren();
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
			case EMFfitModelPackage.FT_ENTRY__NUMBERING:
				setNumbering((String)newValue);
				return;
			case EMFfitModelPackage.FT_ENTRY__NAME:
				setName((String)newValue);
				return;
			case EMFfitModelPackage.FT_ENTRY__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends FTEntry>)newValue);
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
			case EMFfitModelPackage.FT_ENTRY__NUMBERING:
				setNumbering(NUMBERING_EDEFAULT);
				return;
			case EMFfitModelPackage.FT_ENTRY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EMFfitModelPackage.FT_ENTRY__CHILDREN:
				getChildren().clear();
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
			case EMFfitModelPackage.FT_ENTRY__NUMBERING:
				return NUMBERING_EDEFAULT == null ? numbering != null : !NUMBERING_EDEFAULT.equals(numbering);
			case EMFfitModelPackage.FT_ENTRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EMFfitModelPackage.FT_ENTRY__CHILDREN:
				return children != null && !children.isEmpty();
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
		result.append(" (numbering: ");
		result.append(numbering);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FTEntryImpl
