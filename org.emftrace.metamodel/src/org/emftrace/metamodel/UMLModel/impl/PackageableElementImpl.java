/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.PackageableElement;
import org.emftrace.metamodel.UMLModel.ParameterableElement;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packageable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.PackageableElementImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.PackageableElementImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PackageableElementImpl extends NamedElementImpl implements PackageableElement {
	/**
	 * The default value of the '{@link #getOwningTemplateParameter() <em>Owning Template Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNING_TEMPLATE_PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwningTemplateParameter() <em>Owning Template Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected String owningTemplateParameter = OWNING_TEMPLATE_PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected String templateParameter = TEMPLATE_PARAMETER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getPackageableElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwningTemplateParameter() {
		return owningTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(String newOwningTemplateParameter) {
		String oldOwningTemplateParameter = owningTemplateParameter;
		owningTemplateParameter = newOwningTemplateParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER, oldOwningTemplateParameter, owningTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateParameter() {
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(String newTemplateParameter) {
		String oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter();
			case UMLModelPackage.PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER:
				return getTemplateParameter();
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
			case UMLModelPackage.PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((String)newValue);
				return;
			case UMLModelPackage.PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER:
				setTemplateParameter((String)newValue);
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
			case UMLModelPackage.PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter(OWNING_TEMPLATE_PARAMETER_EDEFAULT);
				return;
			case UMLModelPackage.PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER:
				setTemplateParameter(TEMPLATE_PARAMETER_EDEFAULT);
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
			case UMLModelPackage.PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
				return OWNING_TEMPLATE_PARAMETER_EDEFAULT == null ? owningTemplateParameter != null : !OWNING_TEMPLATE_PARAMETER_EDEFAULT.equals(owningTemplateParameter);
			case UMLModelPackage.PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER:
				return TEMPLATE_PARAMETER_EDEFAULT == null ? templateParameter != null : !TEMPLATE_PARAMETER_EDEFAULT.equals(templateParameter);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return UMLModelPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case UMLModelPackage.PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER: return UMLModelPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return UMLModelPackage.PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case UMLModelPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return UMLModelPackage.PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (owningTemplateParameter: ");
		result.append(owningTemplateParameter);
		result.append(", templateParameter: ");
		result.append(templateParameter);
		result.append(')');
		return result.toString();
	}

} //PackageableElementImpl
