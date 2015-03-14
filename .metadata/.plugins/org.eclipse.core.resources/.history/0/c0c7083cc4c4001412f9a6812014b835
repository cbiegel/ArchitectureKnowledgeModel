/**
 */
package org.emftrace.metamodel.ChangeModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.emftrace.metamodel.ChangeModel.AbstractChangeType;
import org.emftrace.metamodel.ChangeModel.ChangeModelPackage;
import org.emftrace.metamodel.ChangeModel.CompositeChangeType;
import org.emftrace.metamodel.ChangeModel.CompositeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Change Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ChangeModel.impl.CompositeChangeTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ChangeModel.impl.CompositeChangeTypeImpl#getSubTypes <em>Sub Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeChangeTypeImpl extends AbstractChangeTypeImpl implements CompositeChangeType {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CompositeType TYPE_EDEFAULT = CompositeType.MOVE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CompositeType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubTypes() <em>Sub Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractChangeType> subTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeChangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChangeModelPackage.Literals.COMPOSITE_CHANGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CompositeType newType) {
		CompositeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChangeModelPackage.COMPOSITE_CHANGE_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractChangeType> getSubTypes() {
		if (subTypes == null) {
			subTypes = new EObjectResolvingEList<AbstractChangeType>(AbstractChangeType.class, this, ChangeModelPackage.COMPOSITE_CHANGE_TYPE__SUB_TYPES);
		}
		return subTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChangeModelPackage.COMPOSITE_CHANGE_TYPE__TYPE:
				return getType();
			case ChangeModelPackage.COMPOSITE_CHANGE_TYPE__SUB_TYPES:
				return getSubTypes();
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
			case ChangeModelPackage.COMPOSITE_CHANGE_TYPE__TYPE:
				setType((CompositeType)newValue);
				return;
			case ChangeModelPackage.COMPOSITE_CHANGE_TYPE__SUB_TYPES:
				getSubTypes().clear();
				getSubTypes().addAll((Collection<? extends AbstractChangeType>)newValue);
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
			case ChangeModelPackage.COMPOSITE_CHANGE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ChangeModelPackage.COMPOSITE_CHANGE_TYPE__SUB_TYPES:
				getSubTypes().clear();
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
			case ChangeModelPackage.COMPOSITE_CHANGE_TYPE__TYPE:
				return type != TYPE_EDEFAULT;
			case ChangeModelPackage.COMPOSITE_CHANGE_TYPE__SUB_TYPES:
				return subTypes != null && !subTypes.isEmpty();
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
		result.append(" (Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CompositeChangeTypeImpl
