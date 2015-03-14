/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.Manifestation;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifestation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ManifestationImpl#getUtilizedElement <em>Utilized Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManifestationImpl extends AbstractionImpl implements Manifestation {
	/**
	 * The default value of the '{@link #getUtilizedElement() <em>Utilized Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilizedElement()
	 * @generated
	 * @ordered
	 */
	protected static final String UTILIZED_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUtilizedElement() <em>Utilized Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilizedElement()
	 * @generated
	 * @ordered
	 */
	protected String utilizedElement = UTILIZED_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManifestationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getManifestation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUtilizedElement() {
		return utilizedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilizedElement(String newUtilizedElement) {
		String oldUtilizedElement = utilizedElement;
		utilizedElement = newUtilizedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.MANIFESTATION__UTILIZED_ELEMENT, oldUtilizedElement, utilizedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.MANIFESTATION__UTILIZED_ELEMENT:
				return getUtilizedElement();
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
			case UMLModelPackage.MANIFESTATION__UTILIZED_ELEMENT:
				setUtilizedElement((String)newValue);
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
			case UMLModelPackage.MANIFESTATION__UTILIZED_ELEMENT:
				setUtilizedElement(UTILIZED_ELEMENT_EDEFAULT);
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
			case UMLModelPackage.MANIFESTATION__UTILIZED_ELEMENT:
				return UTILIZED_ELEMENT_EDEFAULT == null ? utilizedElement != null : !UTILIZED_ELEMENT_EDEFAULT.equals(utilizedElement);
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
		result.append(" (utilizedElement: ");
		result.append(utilizedElement);
		result.append(')');
		return result.toString();
	}

} //ManifestationImpl
