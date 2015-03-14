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
import org.emftrace.metamodel.UMLModel.InvocationAction;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InvocationActionImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InvocationActionImpl#getOnPort <em>On Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InvocationActionImpl extends ActionImpl implements InvocationAction {
	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> argument;

	/**
	 * The default value of the '{@link #getOnPort() <em>On Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPort()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnPort() <em>On Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPort()
	 * @generated
	 * @ordered
	 */
	protected String onPort = ON_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getInvocationAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<InputPin>(InputPin.class, this, UMLModelPackage.INVOCATION_ACTION__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnPort() {
		return onPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnPort(String newOnPort) {
		String oldOnPort = onPort;
		onPort = newOnPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INVOCATION_ACTION__ON_PORT, oldOnPort, onPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.INVOCATION_ACTION__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.INVOCATION_ACTION__ARGUMENT:
				return getArgument();
			case UMLModelPackage.INVOCATION_ACTION__ON_PORT:
				return getOnPort();
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
			case UMLModelPackage.INVOCATION_ACTION__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UMLModelPackage.INVOCATION_ACTION__ON_PORT:
				setOnPort((String)newValue);
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
			case UMLModelPackage.INVOCATION_ACTION__ARGUMENT:
				getArgument().clear();
				return;
			case UMLModelPackage.INVOCATION_ACTION__ON_PORT:
				setOnPort(ON_PORT_EDEFAULT);
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
			case UMLModelPackage.INVOCATION_ACTION__ARGUMENT:
				return argument != null && !argument.isEmpty();
			case UMLModelPackage.INVOCATION_ACTION__ON_PORT:
				return ON_PORT_EDEFAULT == null ? onPort != null : !ON_PORT_EDEFAULT.equals(onPort);
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
		result.append(" (onPort: ");
		result.append(onPort);
		result.append(')');
		return result.toString();
	}

} //InvocationActionImpl
