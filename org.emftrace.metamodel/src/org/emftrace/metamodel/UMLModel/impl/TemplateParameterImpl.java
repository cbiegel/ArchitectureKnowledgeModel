/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.ParameterableElement;
import org.emftrace.metamodel.UMLModel.TemplateParameter;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TemplateParameterImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TemplateParameterImpl#getParameteredElement <em>Parametered Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TemplateParameterImpl#getOwnedParameteredElement <em>Owned Parametered Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TemplateParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TemplateParameterImpl#getOwnedDefault <em>Owned Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateParameterImpl extends ElementImpl implements TemplateParameter {
	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameteredElement() <em>Parametered Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameteredElement()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETERED_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameteredElement() <em>Parametered Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameteredElement()
	 * @generated
	 * @ordered
	 */
	protected String parameteredElement = PARAMETERED_ELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedParameteredElement() <em>Owned Parametered Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameteredElement()
	 * @generated
	 * @ordered
	 */
	protected ParameterableElement ownedParameteredElement;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedDefault() <em>Owned Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDefault()
	 * @generated
	 * @ordered
	 */
	protected ParameterableElement ownedDefault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getTemplateParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(String newSignature) {
		String oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TEMPLATE_PARAMETER__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameteredElement() {
		return parameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameteredElement(String newParameteredElement) {
		String oldParameteredElement = parameteredElement;
		parameteredElement = newParameteredElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, oldParameteredElement, parameteredElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getOwnedParameteredElement() {
		return ownedParameteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedParameteredElement(ParameterableElement newOwnedParameteredElement, NotificationChain msgs) {
		ParameterableElement oldOwnedParameteredElement = ownedParameteredElement;
		ownedParameteredElement = newOwnedParameteredElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, oldOwnedParameteredElement, newOwnedParameteredElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedParameteredElement(ParameterableElement newOwnedParameteredElement) {
		if (newOwnedParameteredElement != ownedParameteredElement) {
			NotificationChain msgs = null;
			if (ownedParameteredElement != null)
				msgs = ((InternalEObject)ownedParameteredElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, null, msgs);
			if (newOwnedParameteredElement != null)
				msgs = ((InternalEObject)newOwnedParameteredElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, null, msgs);
			msgs = basicSetOwnedParameteredElement(newOwnedParameteredElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, newOwnedParameteredElement, newOwnedParameteredElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TEMPLATE_PARAMETER__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getOwnedDefault() {
		return ownedDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedDefault(ParameterableElement newOwnedDefault, NotificationChain msgs) {
		ParameterableElement oldOwnedDefault = ownedDefault;
		ownedDefault = newOwnedDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT, oldOwnedDefault, newOwnedDefault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedDefault(ParameterableElement newOwnedDefault) {
		if (newOwnedDefault != ownedDefault) {
			NotificationChain msgs = null;
			if (ownedDefault != null)
				msgs = ((InternalEObject)ownedDefault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT, null, msgs);
			if (newOwnedDefault != null)
				msgs = ((InternalEObject)newOwnedDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT, null, msgs);
			msgs = basicSetOwnedDefault(newOwnedDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT, newOwnedDefault, newOwnedDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				return basicSetOwnedParameteredElement(null, msgs);
			case UMLModelPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				return basicSetOwnedDefault(null, msgs);
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
			case UMLModelPackage.TEMPLATE_PARAMETER__SIGNATURE:
				return getSignature();
			case UMLModelPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				return getParameteredElement();
			case UMLModelPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				return getOwnedParameteredElement();
			case UMLModelPackage.TEMPLATE_PARAMETER__DEFAULT:
				return getDefault();
			case UMLModelPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				return getOwnedDefault();
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
			case UMLModelPackage.TEMPLATE_PARAMETER__SIGNATURE:
				setSignature((String)newValue);
				return;
			case UMLModelPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				setParameteredElement((String)newValue);
				return;
			case UMLModelPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				setOwnedParameteredElement((ParameterableElement)newValue);
				return;
			case UMLModelPackage.TEMPLATE_PARAMETER__DEFAULT:
				setDefault((String)newValue);
				return;
			case UMLModelPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				setOwnedDefault((ParameterableElement)newValue);
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
			case UMLModelPackage.TEMPLATE_PARAMETER__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case UMLModelPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				setParameteredElement(PARAMETERED_ELEMENT_EDEFAULT);
				return;
			case UMLModelPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				setOwnedParameteredElement((ParameterableElement)null);
				return;
			case UMLModelPackage.TEMPLATE_PARAMETER__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case UMLModelPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				setOwnedDefault((ParameterableElement)null);
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
			case UMLModelPackage.TEMPLATE_PARAMETER__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case UMLModelPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
				return PARAMETERED_ELEMENT_EDEFAULT == null ? parameteredElement != null : !PARAMETERED_ELEMENT_EDEFAULT.equals(parameteredElement);
			case UMLModelPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
				return ownedParameteredElement != null;
			case UMLModelPackage.TEMPLATE_PARAMETER__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case UMLModelPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				return ownedDefault != null;
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
		result.append(" (signature: ");
		result.append(signature);
		result.append(", parameteredElement: ");
		result.append(parameteredElement);
		result.append(", default: ");
		result.append(default_);
		result.append(')');
		return result.toString();
	}

} //TemplateParameterImpl
