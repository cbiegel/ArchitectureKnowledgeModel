/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.ConnectableElement;
import org.emftrace.metamodel.UMLModel.ParameterableElement;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ConnectableElementImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ConnectableElementImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ConnectableElementImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConnectableElementImpl extends TypedElementImpl implements ConnectableElement {
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
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected String end = END_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getConnectableElement();
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER, oldOwningTemplateParameter, owningTemplateParameter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(String newEnd) {
		String oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CONNECTABLE_ELEMENT__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter();
			case UMLModelPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER:
				return getTemplateParameter();
			case UMLModelPackage.CONNECTABLE_ELEMENT__END:
				return getEnd();
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
			case UMLModelPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((String)newValue);
				return;
			case UMLModelPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER:
				setTemplateParameter((String)newValue);
				return;
			case UMLModelPackage.CONNECTABLE_ELEMENT__END:
				setEnd((String)newValue);
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
			case UMLModelPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter(OWNING_TEMPLATE_PARAMETER_EDEFAULT);
				return;
			case UMLModelPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER:
				setTemplateParameter(TEMPLATE_PARAMETER_EDEFAULT);
				return;
			case UMLModelPackage.CONNECTABLE_ELEMENT__END:
				setEnd(END_EDEFAULT);
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
			case UMLModelPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
				return OWNING_TEMPLATE_PARAMETER_EDEFAULT == null ? owningTemplateParameter != null : !OWNING_TEMPLATE_PARAMETER_EDEFAULT.equals(owningTemplateParameter);
			case UMLModelPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER:
				return TEMPLATE_PARAMETER_EDEFAULT == null ? templateParameter != null : !TEMPLATE_PARAMETER_EDEFAULT.equals(templateParameter);
			case UMLModelPackage.CONNECTABLE_ELEMENT__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
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
				case UMLModelPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return UMLModelPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case UMLModelPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER: return UMLModelPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
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
				case UMLModelPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return UMLModelPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case UMLModelPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return UMLModelPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER;
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
		result.append(", end: ");
		result.append(end);
		result.append(')');
		return result.toString();
	}

} //ConnectableElementImpl
