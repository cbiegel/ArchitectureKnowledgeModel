/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.TimeEvent;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;
import org.emftrace.metamodel.UMLModel.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TimeEventImpl#isIsRelative <em>Is Relative</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TimeEventImpl#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeEventImpl extends EventImpl implements TimeEvent {
	/**
	 * The default value of the '{@link #isIsRelative() <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRelative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RELATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRelative() <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRelative()
	 * @generated
	 * @ordered
	 */
	protected boolean isRelative = IS_RELATIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification when;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getTimeEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRelative() {
		return isRelative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRelative(boolean newIsRelative) {
		boolean oldIsRelative = isRelative;
		isRelative = newIsRelative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TIME_EVENT__IS_RELATIVE, oldIsRelative, isRelative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(ValueSpecification newWhen, NotificationChain msgs) {
		ValueSpecification oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.TIME_EVENT__WHEN, oldWhen, newWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(ValueSpecification newWhen) {
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.TIME_EVENT__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.TIME_EVENT__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TIME_EVENT__WHEN, newWhen, newWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.TIME_EVENT__WHEN:
				return basicSetWhen(null, msgs);
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
			case UMLModelPackage.TIME_EVENT__IS_RELATIVE:
				return isIsRelative();
			case UMLModelPackage.TIME_EVENT__WHEN:
				return getWhen();
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
			case UMLModelPackage.TIME_EVENT__IS_RELATIVE:
				setIsRelative((Boolean)newValue);
				return;
			case UMLModelPackage.TIME_EVENT__WHEN:
				setWhen((ValueSpecification)newValue);
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
			case UMLModelPackage.TIME_EVENT__IS_RELATIVE:
				setIsRelative(IS_RELATIVE_EDEFAULT);
				return;
			case UMLModelPackage.TIME_EVENT__WHEN:
				setWhen((ValueSpecification)null);
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
			case UMLModelPackage.TIME_EVENT__IS_RELATIVE:
				return isRelative != IS_RELATIVE_EDEFAULT;
			case UMLModelPackage.TIME_EVENT__WHEN:
				return when != null;
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
		result.append(" (isRelative: ");
		result.append(isRelative);
		result.append(')');
		return result.toString();
	}

} //TimeEventImpl
