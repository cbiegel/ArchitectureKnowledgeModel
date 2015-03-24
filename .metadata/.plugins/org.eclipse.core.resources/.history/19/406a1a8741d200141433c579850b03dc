/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.PackageImport;
import org.emftrace.metamodel.UMLModel.PackageableElement;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;
import org.emftrace.metamodel.UMLModel.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.PackageImportImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.PackageImportImpl#getImportingNamespace <em>Importing Namespace</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.PackageImportImpl#getImportedPackage <em>Imported Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImportImpl extends DirectedRelationshipImpl implements PackageImport {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportingNamespace() <em>Importing Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportingNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTING_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportingNamespace() <em>Importing Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportingNamespace()
	 * @generated
	 * @ordered
	 */
	protected String importingNamespace = IMPORTING_NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImportedPackage() <em>Imported Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPackage()
	 * @generated
	 * @ordered
	 */
	protected PackageableElement importedPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getPackageImport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PACKAGE_IMPORT__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportingNamespace() {
		return importingNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportingNamespace(String newImportingNamespace) {
		String oldImportingNamespace = importingNamespace;
		importingNamespace = newImportingNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE, oldImportingNamespace, importingNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getImportedPackage() {
		return importedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedPackage(PackageableElement newImportedPackage, NotificationChain msgs) {
		PackageableElement oldImportedPackage = importedPackage;
		importedPackage = newImportedPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE, oldImportedPackage, newImportedPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedPackage(PackageableElement newImportedPackage) {
		if (newImportedPackage != importedPackage) {
			NotificationChain msgs = null;
			if (importedPackage != null)
				msgs = ((InternalEObject)importedPackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE, null, msgs);
			if (newImportedPackage != null)
				msgs = ((InternalEObject)newImportedPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE, null, msgs);
			msgs = basicSetImportedPackage(newImportedPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE, newImportedPackage, newImportedPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				return basicSetImportedPackage(null, msgs);
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
			case UMLModelPackage.PACKAGE_IMPORT__VISIBILITY:
				return getVisibility();
			case UMLModelPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
				return getImportingNamespace();
			case UMLModelPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				return getImportedPackage();
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
			case UMLModelPackage.PACKAGE_IMPORT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UMLModelPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
				setImportingNamespace((String)newValue);
				return;
			case UMLModelPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				setImportedPackage((PackageableElement)newValue);
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
			case UMLModelPackage.PACKAGE_IMPORT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLModelPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
				setImportingNamespace(IMPORTING_NAMESPACE_EDEFAULT);
				return;
			case UMLModelPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				setImportedPackage((PackageableElement)null);
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
			case UMLModelPackage.PACKAGE_IMPORT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UMLModelPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
				return IMPORTING_NAMESPACE_EDEFAULT == null ? importingNamespace != null : !IMPORTING_NAMESPACE_EDEFAULT.equals(importingNamespace);
			case UMLModelPackage.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				return importedPackage != null;
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", importingNamespace: ");
		result.append(importingNamespace);
		result.append(')');
		return result.toString();
	}

} //PackageImportImpl
