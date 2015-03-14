/**
 */
package org.emftrace.metamodel.ChangeModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.emftrace.metamodel.ChangeModel.AbstractChangeInstance;
import org.emftrace.metamodel.ChangeModel.ChangeModelPackage;
import org.emftrace.metamodel.ChangeModel.CompositeChangeInstance;
import org.emftrace.metamodel.ChangeModel.CompositeChangeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Change Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ChangeModel.impl.CompositeChangeInstanceImpl#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ChangeModel.impl.CompositeChangeInstanceImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeChangeInstanceImpl extends AbstractChangeInstanceImpl implements CompositeChangeInstance {
	/**
	 * The cached value of the '{@link #getSubTypes() <em>Sub Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractChangeInstance> subTypes;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CompositeChangeType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeChangeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChangeModelPackage.Literals.COMPOSITE_CHANGE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractChangeInstance> getSubTypes() {
		if (subTypes == null) {
			subTypes = new EObjectResolvingEList<AbstractChangeInstance>(AbstractChangeInstance.class, this, ChangeModelPackage.COMPOSITE_CHANGE_INSTANCE__SUB_TYPES);
		}
		return subTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeChangeType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CompositeChangeType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChangeModelPackage.COMPOSITE_CHANGE_INSTANCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeChangeType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CompositeChangeType newType) {
		CompositeChangeType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChangeModelPackage.COMPOSITE_CHANGE_INSTANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChangeModelPackage.COMPOSITE_CHANGE_INSTANCE__SUB_TYPES:
				return getSubTypes();
			case ChangeModelPackage.COMPOSITE_CHANGE_INSTANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case ChangeModelPackage.COMPOSITE_CHANGE_INSTANCE__SUB_TYPES:
				getSubTypes().clear();
				getSubTypes().addAll((Collection<? extends AbstractChangeInstance>)newValue);
				return;
			case ChangeModelPackage.COMPOSITE_CHANGE_INSTANCE__TYPE:
				setType((CompositeChangeType)newValue);
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
			case ChangeModelPackage.COMPOSITE_CHANGE_INSTANCE__SUB_TYPES:
				getSubTypes().clear();
				return;
			case ChangeModelPackage.COMPOSITE_CHANGE_INSTANCE__TYPE:
				setType((CompositeChangeType)null);
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
			case ChangeModelPackage.COMPOSITE_CHANGE_INSTANCE__SUB_TYPES:
				return subTypes != null && !subTypes.isEmpty();
			case ChangeModelPackage.COMPOSITE_CHANGE_INSTANCE__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeChangeInstanceImpl
