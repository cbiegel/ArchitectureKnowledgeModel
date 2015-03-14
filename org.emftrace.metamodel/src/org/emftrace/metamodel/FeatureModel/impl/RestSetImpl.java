/**
 */
package org.emftrace.metamodel.FeatureModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.FeatureModel.FeatureModelPackage;
import org.emftrace.metamodel.FeatureModel.RestSet;
import org.emftrace.metamodel.FeatureModel.Restriction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rest Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.impl.RestSetImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.impl.RestSetImpl#isConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestSetImpl extends FeatureModelBaseImpl implements RestSet {
	/**
	 * The cached value of the '{@link #getRestriction() <em>Restriction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestriction()
	 * @generated
	 * @ordered
	 */
	protected EList<Restriction> restriction;

	/**
	 * The default value of the '{@link #isConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTRAINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstraint()
	 * @generated
	 * @ordered
	 */
	protected boolean constraint = CONSTRAINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureModelPackage.Literals.REST_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Restriction> getRestriction() {
		if (restriction == null) {
			restriction = new EObjectContainmentEList<Restriction>(Restriction.class, this, FeatureModelPackage.REST_SET__RESTRICTION);
		}
		return restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(boolean newConstraint) {
		boolean oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.REST_SET__CONSTRAINT, oldConstraint, constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureModelPackage.REST_SET__RESTRICTION:
				return ((InternalEList<?>)getRestriction()).basicRemove(otherEnd, msgs);
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
			case FeatureModelPackage.REST_SET__RESTRICTION:
				return getRestriction();
			case FeatureModelPackage.REST_SET__CONSTRAINT:
				return isConstraint();
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
			case FeatureModelPackage.REST_SET__RESTRICTION:
				getRestriction().clear();
				getRestriction().addAll((Collection<? extends Restriction>)newValue);
				return;
			case FeatureModelPackage.REST_SET__CONSTRAINT:
				setConstraint((Boolean)newValue);
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
			case FeatureModelPackage.REST_SET__RESTRICTION:
				getRestriction().clear();
				return;
			case FeatureModelPackage.REST_SET__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
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
			case FeatureModelPackage.REST_SET__RESTRICTION:
				return restriction != null && !restriction.isEmpty();
			case FeatureModelPackage.REST_SET__CONSTRAINT:
				return constraint != CONSTRAINT_EDEFAULT;
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
		result.append(" (constraint: ");
		result.append(constraint);
		result.append(')');
		return result.toString();
	}

} //RestSetImpl
