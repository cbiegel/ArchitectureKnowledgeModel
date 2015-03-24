/**
 */
package org.emftrace.metamodel.ChangeModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.ChangeModel.AbstractChangeInstance;
import org.emftrace.metamodel.ChangeModel.AbstractionLevel;
import org.emftrace.metamodel.ChangeModel.ChangeModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Change Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ChangeModel.impl.AbstractChangeInstanceImpl#getAbstractionLevel <em>Abstraction Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractChangeInstanceImpl extends ChangeModelBaseImpl implements AbstractChangeInstance {
	/**
	 * The default value of the '{@link #getAbstractionLevel() <em>Abstraction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final AbstractionLevel ABSTRACTION_LEVEL_EDEFAULT = AbstractionLevel.CONCRETE;

	/**
	 * The cached value of the '{@link #getAbstractionLevel() <em>Abstraction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractionLevel()
	 * @generated
	 * @ordered
	 */
	protected AbstractionLevel abstractionLevel = ABSTRACTION_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractChangeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChangeModelPackage.Literals.ABSTRACT_CHANGE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionLevel getAbstractionLevel() {
		return abstractionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractionLevel(AbstractionLevel newAbstractionLevel) {
		AbstractionLevel oldAbstractionLevel = abstractionLevel;
		abstractionLevel = newAbstractionLevel == null ? ABSTRACTION_LEVEL_EDEFAULT : newAbstractionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChangeModelPackage.ABSTRACT_CHANGE_INSTANCE__ABSTRACTION_LEVEL, oldAbstractionLevel, abstractionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChangeModelPackage.ABSTRACT_CHANGE_INSTANCE__ABSTRACTION_LEVEL:
				return getAbstractionLevel();
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
			case ChangeModelPackage.ABSTRACT_CHANGE_INSTANCE__ABSTRACTION_LEVEL:
				setAbstractionLevel((AbstractionLevel)newValue);
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
			case ChangeModelPackage.ABSTRACT_CHANGE_INSTANCE__ABSTRACTION_LEVEL:
				setAbstractionLevel(ABSTRACTION_LEVEL_EDEFAULT);
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
			case ChangeModelPackage.ABSTRACT_CHANGE_INSTANCE__ABSTRACTION_LEVEL:
				return abstractionLevel != ABSTRACTION_LEVEL_EDEFAULT;
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
		result.append(" (AbstractionLevel: ");
		result.append(abstractionLevel);
		result.append(')');
		return result.toString();
	}

} //AbstractChangeInstanceImpl
