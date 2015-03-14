/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.Extension;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExtensionImpl#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExtensionImpl#getMetaClass <em>Meta Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionImpl extends AssociationImpl implements Extension {
	/**
	 * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean isRequired = IS_REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaClass() <em>Meta Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaClass()
	 * @generated
	 * @ordered
	 */
	protected static final String META_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaClass() <em>Meta Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaClass()
	 * @generated
	 * @ordered
	 */
	protected String metaClass = META_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getExtension();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRequired() {
		return isRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaClass() {
		return metaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaClass(String newMetaClass) {
		String oldMetaClass = metaClass;
		metaClass = newMetaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXTENSION__META_CLASS, oldMetaClass, metaClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.EXTENSION__IS_REQUIRED:
				return isIsRequired();
			case UMLModelPackage.EXTENSION__META_CLASS:
				return getMetaClass();
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
			case UMLModelPackage.EXTENSION__META_CLASS:
				setMetaClass((String)newValue);
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
			case UMLModelPackage.EXTENSION__META_CLASS:
				setMetaClass(META_CLASS_EDEFAULT);
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
			case UMLModelPackage.EXTENSION__IS_REQUIRED:
				return isRequired != IS_REQUIRED_EDEFAULT;
			case UMLModelPackage.EXTENSION__META_CLASS:
				return META_CLASS_EDEFAULT == null ? metaClass != null : !META_CLASS_EDEFAULT.equals(metaClass);
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
		result.append(" (isRequired: ");
		result.append(isRequired);
		result.append(", metaClass: ");
		result.append(metaClass);
		result.append(')');
		return result.toString();
	}

} //ExtensionImpl
