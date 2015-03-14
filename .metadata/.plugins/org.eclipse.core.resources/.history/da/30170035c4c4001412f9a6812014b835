/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.UMLModel.InputPin;
import org.emftrace.metamodel.UMLModel.OutputPin;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;
import org.emftrace.metamodel.UMLModel.UnmarshallAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unmarshall Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.UnmarshallActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.UnmarshallActionImpl#getUnmarshallType <em>Unmarshall Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.UnmarshallActionImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnmarshallActionImpl extends ActionImpl implements UnmarshallAction {
	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> result;

	/**
	 * The default value of the '{@link #getUnmarshallType() <em>Unmarshall Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmarshallType()
	 * @generated
	 * @ordered
	 */
	protected static final String UNMARSHALL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnmarshallType() <em>Unmarshall Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmarshallType()
	 * @generated
	 * @ordered
	 */
	protected String unmarshallType = UNMARSHALL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected InputPin object;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnmarshallActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getUnmarshallAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, UMLModelPackage.UNMARSHALL_ACTION__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnmarshallType() {
		return unmarshallType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnmarshallType(String newUnmarshallType) {
		String oldUnmarshallType = unmarshallType;
		unmarshallType = newUnmarshallType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE, oldUnmarshallType, unmarshallType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(InputPin newObject, NotificationChain msgs) {
		InputPin oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.UNMARSHALL_ACTION__OBJECT, oldObject, newObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(InputPin newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.UNMARSHALL_ACTION__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.UNMARSHALL_ACTION__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.UNMARSHALL_ACTION__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.UNMARSHALL_ACTION__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.UNMARSHALL_ACTION__OBJECT:
				return basicSetObject(null, msgs);
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
			case UMLModelPackage.UNMARSHALL_ACTION__RESULT:
				return getResult();
			case UMLModelPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE:
				return getUnmarshallType();
			case UMLModelPackage.UNMARSHALL_ACTION__OBJECT:
				return getObject();
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
			case UMLModelPackage.UNMARSHALL_ACTION__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case UMLModelPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE:
				setUnmarshallType((String)newValue);
				return;
			case UMLModelPackage.UNMARSHALL_ACTION__OBJECT:
				setObject((InputPin)newValue);
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
			case UMLModelPackage.UNMARSHALL_ACTION__RESULT:
				getResult().clear();
				return;
			case UMLModelPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE:
				setUnmarshallType(UNMARSHALL_TYPE_EDEFAULT);
				return;
			case UMLModelPackage.UNMARSHALL_ACTION__OBJECT:
				setObject((InputPin)null);
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
			case UMLModelPackage.UNMARSHALL_ACTION__RESULT:
				return result != null && !result.isEmpty();
			case UMLModelPackage.UNMARSHALL_ACTION__UNMARSHALL_TYPE:
				return UNMARSHALL_TYPE_EDEFAULT == null ? unmarshallType != null : !UNMARSHALL_TYPE_EDEFAULT.equals(unmarshallType);
			case UMLModelPackage.UNMARSHALL_ACTION__OBJECT:
				return object != null;
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
		result.append(" (unmarshallType: ");
		result.append(unmarshallType);
		result.append(')');
		return result.toString();
	}

} //UnmarshallActionImpl
