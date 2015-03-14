/**
 */
package org.emftrace.metamodel.URNModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.URNModel.URNModelPackage;
import org.emftrace.metamodel.URNModel.URNlink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UR Nlink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.URNlinkImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.URNlinkImpl#getToElem <em>To Elem</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.URNlinkImpl#getFromElem <em>From Elem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class URNlinkImpl extends URNmodelElementImpl implements URNlink {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToElem() <em>To Elem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElem()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_ELEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToElem() <em>To Elem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElem()
	 * @generated
	 * @ordered
	 */
	protected String toElem = TO_ELEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromElem() <em>From Elem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromElem()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_ELEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromElem() <em>From Elem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromElem()
	 * @generated
	 * @ordered
	 */
	protected String fromElem = FROM_ELEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URNlinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.UR_NLINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.UR_NLINK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToElem() {
		return toElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToElem(String newToElem) {
		String oldToElem = toElem;
		toElem = newToElem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.UR_NLINK__TO_ELEM, oldToElem, toElem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromElem() {
		return fromElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromElem(String newFromElem) {
		String oldFromElem = fromElem;
		fromElem = newFromElem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.UR_NLINK__FROM_ELEM, oldFromElem, fromElem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case URNModelPackage.UR_NLINK__TYPE:
				return getType();
			case URNModelPackage.UR_NLINK__TO_ELEM:
				return getToElem();
			case URNModelPackage.UR_NLINK__FROM_ELEM:
				return getFromElem();
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
			case URNModelPackage.UR_NLINK__TYPE:
				setType((String)newValue);
				return;
			case URNModelPackage.UR_NLINK__TO_ELEM:
				setToElem((String)newValue);
				return;
			case URNModelPackage.UR_NLINK__FROM_ELEM:
				setFromElem((String)newValue);
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
			case URNModelPackage.UR_NLINK__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case URNModelPackage.UR_NLINK__TO_ELEM:
				setToElem(TO_ELEM_EDEFAULT);
				return;
			case URNModelPackage.UR_NLINK__FROM_ELEM:
				setFromElem(FROM_ELEM_EDEFAULT);
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
			case URNModelPackage.UR_NLINK__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case URNModelPackage.UR_NLINK__TO_ELEM:
				return TO_ELEM_EDEFAULT == null ? toElem != null : !TO_ELEM_EDEFAULT.equals(toElem);
			case URNModelPackage.UR_NLINK__FROM_ELEM:
				return FROM_ELEM_EDEFAULT == null ? fromElem != null : !FROM_ELEM_EDEFAULT.equals(fromElem);
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
		result.append(", toElem: ");
		result.append(toElem);
		result.append(", fromElem: ");
		result.append(fromElem);
		result.append(')');
		return result.toString();
	}

} //URNlinkImpl
