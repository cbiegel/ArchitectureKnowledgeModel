/**
 */
package org.emftrace.metamodel.LinkModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.LinkModel.LinkModelPackage;
import org.emftrace.metamodel.LinkModel.TraceElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.LinkModel.impl.TraceElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.LinkModel.impl.TraceElementImpl#isCreatedByUser <em>Created By User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TraceElementImpl extends LinkBaseImpl implements TraceElement {
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
	 * The default value of the '{@link #isCreatedByUser() <em>Created By User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreatedByUser()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATED_BY_USER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCreatedByUser() <em>Created By User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreatedByUser()
	 * @generated
	 * @ordered
	 */
	protected boolean createdByUser = CREATED_BY_USER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinkModelPackage.Literals.TRACE_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LinkModelPackage.TRACE_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCreatedByUser() {
		return createdByUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedByUser(boolean newCreatedByUser) {
		boolean oldCreatedByUser = createdByUser;
		createdByUser = newCreatedByUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkModelPackage.TRACE_ELEMENT__CREATED_BY_USER, oldCreatedByUser, createdByUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LinkModelPackage.TRACE_ELEMENT__NAME:
				return getName();
			case LinkModelPackage.TRACE_ELEMENT__CREATED_BY_USER:
				return isCreatedByUser();
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
			case LinkModelPackage.TRACE_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case LinkModelPackage.TRACE_ELEMENT__CREATED_BY_USER:
				setCreatedByUser((Boolean)newValue);
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
			case LinkModelPackage.TRACE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LinkModelPackage.TRACE_ELEMENT__CREATED_BY_USER:
				setCreatedByUser(CREATED_BY_USER_EDEFAULT);
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
			case LinkModelPackage.TRACE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LinkModelPackage.TRACE_ELEMENT__CREATED_BY_USER:
				return createdByUser != CREATED_BY_USER_EDEFAULT;
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
		result.append(", CreatedByUser: ");
		result.append(createdByUser);
		result.append(')');
		return result.toString();
	}

} //TraceElementImpl
