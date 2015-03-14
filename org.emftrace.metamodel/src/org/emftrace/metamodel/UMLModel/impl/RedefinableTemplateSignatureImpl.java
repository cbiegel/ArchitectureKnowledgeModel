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

import org.emftrace.metamodel.UMLModel.RedefinableTemplateSignature;
import org.emftrace.metamodel.UMLModel.TemplateParameter;
import org.emftrace.metamodel.UMLModel.TemplateSignature;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redefinable Template Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.RedefinableTemplateSignatureImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.RedefinableTemplateSignatureImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.RedefinableTemplateSignatureImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.RedefinableTemplateSignatureImpl#getExtendedSignature <em>Extended Signature</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.RedefinableTemplateSignatureImpl#getInheritedParameter <em>Inherited Parameter</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.RedefinableTemplateSignatureImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RedefinableTemplateSignatureImpl extends RedefinableElementImpl implements RedefinableTemplateSignature {
	/**
	 * The default value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected String parameter = PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateParameter> ownedParameter;

	/**
	 * The default value of the '{@link #getTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected String template = TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtendedSignature() <em>Extended Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDED_SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendedSignature() <em>Extended Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedSignature()
	 * @generated
	 * @ordered
	 */
	protected String extendedSignature = EXTENDED_SIGNATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInheritedParameter() <em>Inherited Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String INHERITED_PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInheritedParameter() <em>Inherited Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedParameter()
	 * @generated
	 * @ordered
	 */
	protected String inheritedParameter = INHERITED_PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected String classifier = CLASSIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedefinableTemplateSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getRedefinableTemplateSignature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(String newParameter) {
		String oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentEList<TemplateParameter>(TemplateParameter.class, this, UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(String newTemplate) {
		String oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE, oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtendedSignature() {
		return extendedSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedSignature(String newExtendedSignature) {
		String oldExtendedSignature = extendedSignature;
		extendedSignature = newExtendedSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE, oldExtendedSignature, extendedSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInheritedParameter() {
		return inheritedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritedParameter(String newInheritedParameter) {
		String oldInheritedParameter = inheritedParameter;
		inheritedParameter = newInheritedParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER, oldInheritedParameter, inheritedParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(String newClassifier) {
		String oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER, oldClassifier, classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				return getParameter();
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return getOwnedParameter();
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				return getTemplate();
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE:
				return getExtendedSignature();
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER:
				return getInheritedParameter();
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER:
				return getClassifier();
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
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				setParameter((String)newValue);
				return;
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends TemplateParameter>)newValue);
				return;
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				setTemplate((String)newValue);
				return;
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE:
				setExtendedSignature((String)newValue);
				return;
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER:
				setInheritedParameter((String)newValue);
				return;
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER:
				setClassifier((String)newValue);
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
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				setParameter(PARAMETER_EDEFAULT);
				return;
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				setTemplate(TEMPLATE_EDEFAULT);
				return;
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE:
				setExtendedSignature(EXTENDED_SIGNATURE_EDEFAULT);
				return;
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER:
				setInheritedParameter(INHERITED_PARAMETER_EDEFAULT);
				return;
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER:
				setClassifier(CLASSIFIER_EDEFAULT);
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
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				return PARAMETER_EDEFAULT == null ? parameter != null : !PARAMETER_EDEFAULT.equals(parameter);
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				return TEMPLATE_EDEFAULT == null ? template != null : !TEMPLATE_EDEFAULT.equals(template);
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE:
				return EXTENDED_SIGNATURE_EDEFAULT == null ? extendedSignature != null : !EXTENDED_SIGNATURE_EDEFAULT.equals(extendedSignature);
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER:
				return INHERITED_PARAMETER_EDEFAULT == null ? inheritedParameter != null : !INHERITED_PARAMETER_EDEFAULT.equals(inheritedParameter);
			case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER:
				return CLASSIFIER_EDEFAULT == null ? classifier != null : !CLASSIFIER_EDEFAULT.equals(classifier);
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
		if (baseClass == TemplateSignature.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER: return UMLModelPackage.TEMPLATE_SIGNATURE__PARAMETER;
				case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER: return UMLModelPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER;
				case UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE: return UMLModelPackage.TEMPLATE_SIGNATURE__TEMPLATE;
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
		if (baseClass == TemplateSignature.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.TEMPLATE_SIGNATURE__PARAMETER: return UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER;
				case UMLModelPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER: return UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER;
				case UMLModelPackage.TEMPLATE_SIGNATURE__TEMPLATE: return UMLModelPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE;
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
		result.append(" (parameter: ");
		result.append(parameter);
		result.append(", template: ");
		result.append(template);
		result.append(", extendedSignature: ");
		result.append(extendedSignature);
		result.append(", inheritedParameter: ");
		result.append(inheritedParameter);
		result.append(", classifier: ");
		result.append(classifier);
		result.append(')');
		return result.toString();
	}

} //RedefinableTemplateSignatureImpl
