/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.emftrace.metamodel.UMLModel.UMLBase;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.UMLBaseImpl#getUmlID <em>Uml ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UMLBaseImpl extends EObjectImpl implements UMLBase {
	/**
	 * The default value of the '{@link #getUmlID() <em>Uml ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlID()
	 * @generated
	 * @ordered
	 */
	protected static final String UML_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUmlID() <em>Uml ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlID()
	 * @generated
	 * @ordered
	 */
	protected String umlID = UML_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getUMLBase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUmlID() {
		return umlID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlID(String newUmlID) {
		String oldUmlID = umlID;
		umlID = newUmlID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.UML_BASE__UML_ID, oldUmlID, umlID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.UML_BASE__UML_ID:
				return getUmlID();
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
			case UMLModelPackage.UML_BASE__UML_ID:
				setUmlID((String)newValue);
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
			case UMLModelPackage.UML_BASE__UML_ID:
				setUmlID(UML_ID_EDEFAULT);
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
			case UMLModelPackage.UML_BASE__UML_ID:
				return UML_ID_EDEFAULT == null ? umlID != null : !UML_ID_EDEFAULT.equals(umlID);
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
		result.append(" (umlID: ");
		result.append(umlID);
		result.append(')');
		return result.toString();
	}

} //UMLBaseImpl
