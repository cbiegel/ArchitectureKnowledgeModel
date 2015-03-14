/**
 */
package org.emftrace.metamodel.URNModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.emftrace.metamodel.URNModel.Condition;
import org.emftrace.metamodel.URNModel.StartPoint;
import org.emftrace.metamodel.URNModel.URNModelPackage;
import org.emftrace.metamodel.URNModel.Workload;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.StartPointImpl#getWorkload <em>Workload</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.StartPointImpl#getInBindings <em>In Bindings</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.impl.StartPointImpl#getPrecondition <em>Precondition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartPointImpl extends PathNodeImpl implements StartPoint {
	/**
	 * The cached value of the '{@link #getWorkload() <em>Workload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkload()
	 * @generated
	 * @ordered
	 */
	protected Workload workload;

	/**
	 * The cached value of the '{@link #getInBindings() <em>In Bindings</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<String> inBindings;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected Condition precondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return URNModelPackage.Literals.START_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workload getWorkload() {
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkload(Workload newWorkload, NotificationChain msgs) {
		Workload oldWorkload = workload;
		workload = newWorkload;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URNModelPackage.START_POINT__WORKLOAD, oldWorkload, newWorkload);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkload(Workload newWorkload) {
		if (newWorkload != workload) {
			NotificationChain msgs = null;
			if (workload != null)
				msgs = ((InternalEObject)workload).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.START_POINT__WORKLOAD, null, msgs);
			if (newWorkload != null)
				msgs = ((InternalEObject)newWorkload).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.START_POINT__WORKLOAD, null, msgs);
			msgs = basicSetWorkload(newWorkload, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.START_POINT__WORKLOAD, newWorkload, newWorkload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInBindings() {
		if (inBindings == null) {
			inBindings = new EDataTypeEList<String>(String.class, this, URNModelPackage.START_POINT__IN_BINDINGS);
		}
		return inBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecondition(Condition newPrecondition, NotificationChain msgs) {
		Condition oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, URNModelPackage.START_POINT__PRECONDITION, oldPrecondition, newPrecondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition(Condition newPrecondition) {
		if (newPrecondition != precondition) {
			NotificationChain msgs = null;
			if (precondition != null)
				msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.START_POINT__PRECONDITION, null, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - URNModelPackage.START_POINT__PRECONDITION, null, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, URNModelPackage.START_POINT__PRECONDITION, newPrecondition, newPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case URNModelPackage.START_POINT__WORKLOAD:
				return basicSetWorkload(null, msgs);
			case URNModelPackage.START_POINT__PRECONDITION:
				return basicSetPrecondition(null, msgs);
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
			case URNModelPackage.START_POINT__WORKLOAD:
				return getWorkload();
			case URNModelPackage.START_POINT__IN_BINDINGS:
				return getInBindings();
			case URNModelPackage.START_POINT__PRECONDITION:
				return getPrecondition();
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
			case URNModelPackage.START_POINT__WORKLOAD:
				setWorkload((Workload)newValue);
				return;
			case URNModelPackage.START_POINT__IN_BINDINGS:
				getInBindings().clear();
				getInBindings().addAll((Collection<? extends String>)newValue);
				return;
			case URNModelPackage.START_POINT__PRECONDITION:
				setPrecondition((Condition)newValue);
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
			case URNModelPackage.START_POINT__WORKLOAD:
				setWorkload((Workload)null);
				return;
			case URNModelPackage.START_POINT__IN_BINDINGS:
				getInBindings().clear();
				return;
			case URNModelPackage.START_POINT__PRECONDITION:
				setPrecondition((Condition)null);
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
			case URNModelPackage.START_POINT__WORKLOAD:
				return workload != null;
			case URNModelPackage.START_POINT__IN_BINDINGS:
				return inBindings != null && !inBindings.isEmpty();
			case URNModelPackage.START_POINT__PRECONDITION:
				return precondition != null;
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
		result.append(" (inBindings: ");
		result.append(inBindings);
		result.append(')');
		return result.toString();
	}

} //StartPointImpl
