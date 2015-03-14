/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.EncapsulatedClassifier;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encapsulated Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.EncapsulatedClassifierImpl#getOwnedPort <em>Owned Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EncapsulatedClassifierImpl extends StructuredClassifierImpl implements EncapsulatedClassifier {
	/**
	 * The default value of the '{@link #getOwnedPort() <em>Owned Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPort()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNED_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwnedPort() <em>Owned Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPort()
	 * @generated
	 * @ordered
	 */
	protected String ownedPort = OWNED_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncapsulatedClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getEncapsulatedClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwnedPort() {
		return ownedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPort(String newOwnedPort) {
		String oldOwnedPort = ownedPort;
		ownedPort = newOwnedPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT, oldOwnedPort, ownedPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				return getOwnedPort();
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
			case UMLModelPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				setOwnedPort((String)newValue);
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
			case UMLModelPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				setOwnedPort(OWNED_PORT_EDEFAULT);
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
			case UMLModelPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				return OWNED_PORT_EDEFAULT == null ? ownedPort != null : !OWNED_PORT_EDEFAULT.equals(ownedPort);
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
		result.append(" (ownedPort: ");
		result.append(ownedPort);
		result.append(')');
		return result.toString();
	}

} //EncapsulatedClassifierImpl
