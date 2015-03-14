/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.ParameterableElement;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameterable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ParameterableElementImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ParameterableElementImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ParameterableElementImpl extends ElementImpl implements ParameterableElement {
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
	protected ParameterableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getParameterableElement();
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER, oldOwningTemplateParameter, owningTemplateParameter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter();
			case UMLModelPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
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
			case UMLModelPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((String)newValue);
				return;
			case UMLModelPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
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
			case UMLModelPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter(OWNING_TEMPLATE_PARAMETER_EDEFAULT);
				return;
			case UMLModelPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
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
			case UMLModelPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
				return OWNING_TEMPLATE_PARAMETER_EDEFAULT == null ? owningTemplateParameter != null : !OWNING_TEMPLATE_PARAMETER_EDEFAULT.equals(owningTemplateParameter);
			case UMLModelPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
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

} //ParameterableElementImpl
