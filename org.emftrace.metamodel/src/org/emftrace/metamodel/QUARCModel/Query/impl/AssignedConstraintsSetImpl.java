/**
 */
package org.emftrace.metamodel.QUARCModel.Query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;

import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;
import org.emftrace.metamodel.QUARCModel.Query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assigned Constraints Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.AssignedConstraintsSetImpl#getAssignedConstraints <em>Assigned Constraints</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.AssignedConstraintsSetImpl#isChanged <em>Changed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignedConstraintsSetImpl extends GSSQueryModelBaseImpl implements AssignedConstraintsSet {
	/**
	 * The cached value of the '{@link #getAssignedConstraints() <em>Assigned Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> assignedConstraints;

	/**
	 * The default value of the '{@link #isChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChanged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChanged()
	 * @generated
	 * @ordered
	 */
	protected boolean changed = CHANGED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignedConstraintsSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.ASSIGNED_CONSTRAINTS_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getAssignedConstraints() {
		if (assignedConstraints == null) {
			assignedConstraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, QueryPackage.ASSIGNED_CONSTRAINTS_SET__ASSIGNED_CONSTRAINTS);
		}
		return assignedConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChanged() {
		return changed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChanged(boolean newChanged) {
		boolean oldChanged = changed;
		changed = newChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ASSIGNED_CONSTRAINTS_SET__CHANGED, oldChanged, changed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.ASSIGNED_CONSTRAINTS_SET__ASSIGNED_CONSTRAINTS:
				return ((InternalEList<?>)getAssignedConstraints()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.ASSIGNED_CONSTRAINTS_SET__ASSIGNED_CONSTRAINTS:
				return getAssignedConstraints();
			case QueryPackage.ASSIGNED_CONSTRAINTS_SET__CHANGED:
				return isChanged();
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
			case QueryPackage.ASSIGNED_CONSTRAINTS_SET__ASSIGNED_CONSTRAINTS:
				getAssignedConstraints().clear();
				getAssignedConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case QueryPackage.ASSIGNED_CONSTRAINTS_SET__CHANGED:
				setChanged((Boolean)newValue);
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
			case QueryPackage.ASSIGNED_CONSTRAINTS_SET__ASSIGNED_CONSTRAINTS:
				getAssignedConstraints().clear();
				return;
			case QueryPackage.ASSIGNED_CONSTRAINTS_SET__CHANGED:
				setChanged(CHANGED_EDEFAULT);
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
			case QueryPackage.ASSIGNED_CONSTRAINTS_SET__ASSIGNED_CONSTRAINTS:
				return assignedConstraints != null && !assignedConstraints.isEmpty();
			case QueryPackage.ASSIGNED_CONSTRAINTS_SET__CHANGED:
				return changed != CHANGED_EDEFAULT;
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
		result.append(" (changed: ");
		result.append(changed);
		result.append(')');
		return result.toString();
	}

} //AssignedConstraintsSetImpl
