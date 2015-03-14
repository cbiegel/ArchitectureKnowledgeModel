/**
 */
package org.emftrace.metamodel.URNModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.URNModel.InBinding;
import org.emftrace.metamodel.URNModel.URNModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.InBindingImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.InBindingImpl#getStartPoint <em>Start Point</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.InBindingImpl#getStubEntry <em>Stub Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InBindingImpl extends URNBaseImpl implements InBinding {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartPoint() <em>Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String START_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartPoint() <em>Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPoint()
	 * @generated
	 * @ordered
	 */
	protected String startPoint = START_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStubEntry() <em>Stub Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubEntry()
	 * @generated
	 * @ordered
	 */
	protected static final String STUB_ENTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStubEntry() <em>Stub Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubEntry()
	 * @generated
	 * @ordered
	 */
	protected String stubEntry = STUB_ENTRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.IN_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.IN_BINDING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartPoint() {
		return startPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPoint(String newStartPoint) {
		String oldStartPoint = startPoint;
		startPoint = newStartPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.IN_BINDING__START_POINT, oldStartPoint, startPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStubEntry() {
		return stubEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStubEntry(String newStubEntry) {
		String oldStubEntry = stubEntry;
		stubEntry = newStubEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.IN_BINDING__STUB_ENTRY, oldStubEntry, stubEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case URNModelPackage.IN_BINDING__ID:
				return getId();
			case URNModelPackage.IN_BINDING__START_POINT:
				return getStartPoint();
			case URNModelPackage.IN_BINDING__STUB_ENTRY:
				return getStubEntry();
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
			case URNModelPackage.IN_BINDING__ID:
				setId((String)newValue);
				return;
			case URNModelPackage.IN_BINDING__START_POINT:
				setStartPoint((String)newValue);
				return;
			case URNModelPackage.IN_BINDING__STUB_ENTRY:
				setStubEntry((String)newValue);
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
			case URNModelPackage.IN_BINDING__ID:
				setId(ID_EDEFAULT);
				return;
			case URNModelPackage.IN_BINDING__START_POINT:
				setStartPoint(START_POINT_EDEFAULT);
				return;
			case URNModelPackage.IN_BINDING__STUB_ENTRY:
				setStubEntry(STUB_ENTRY_EDEFAULT);
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
			case URNModelPackage.IN_BINDING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case URNModelPackage.IN_BINDING__START_POINT:
				return START_POINT_EDEFAULT == null ? startPoint != null : !START_POINT_EDEFAULT.equals(startPoint);
			case URNModelPackage.IN_BINDING__STUB_ENTRY:
				return STUB_ENTRY_EDEFAULT == null ? stubEntry != null : !STUB_ENTRY_EDEFAULT.equals(stubEntry);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", startPoint: ");
		result.append(startPoint);
		result.append(", stubEntry: ");
		result.append(stubEntry);
		result.append(')');
		return result.toString();
	}

} //InBindingImpl
