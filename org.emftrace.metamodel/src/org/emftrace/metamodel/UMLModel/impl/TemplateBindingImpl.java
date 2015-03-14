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

import org.emftrace.metamodel.UMLModel.TemplateBinding;
import org.emftrace.metamodel.UMLModel.TemplateParameterSubstitution;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TemplateBindingImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TemplateBindingImpl#getParameterSubstitution <em>Parameter Substitution</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.TemplateBindingImpl#getBoundElement <em>Bound Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateBindingImpl extends DirectedRelationshipImpl implements TemplateBinding {
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
	 * The cached value of the '{@link #getParameterSubstitution() <em>Parameter Substitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterSubstitution()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateParameterSubstitution> parameterSubstitution;

	/**
	 * The default value of the '{@link #getBoundElement() <em>Bound Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundElement()
	 * @generated
	 * @ordered
	 */
	protected static final String BOUND_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoundElement() <em>Bound Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundElement()
	 * @generated
	 * @ordered
	 */
	protected String boundElement = BOUND_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getTemplateBinding();
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TEMPLATE_BINDING__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameterSubstitution> getParameterSubstitution() {
		if (parameterSubstitution == null) {
			parameterSubstitution = new EObjectContainmentEList<TemplateParameterSubstitution>(TemplateParameterSubstitution.class, this, UMLModelPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION);
		}
		return parameterSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoundElement() {
		return boundElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundElement(String newBoundElement) {
		String oldBoundElement = boundElement;
		boundElement = newBoundElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.TEMPLATE_BINDING__BOUND_ELEMENT, oldBoundElement, boundElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
				return ((InternalEList<?>)getParameterSubstitution()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.TEMPLATE_BINDING__SIGNATURE:
				return getSignature();
			case UMLModelPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
				return getParameterSubstitution();
			case UMLModelPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
				return getBoundElement();
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
			case UMLModelPackage.TEMPLATE_BINDING__SIGNATURE:
				setSignature((String)newValue);
				return;
			case UMLModelPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
				getParameterSubstitution().clear();
				getParameterSubstitution().addAll((Collection<? extends TemplateParameterSubstitution>)newValue);
				return;
			case UMLModelPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
				setBoundElement((String)newValue);
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
			case UMLModelPackage.TEMPLATE_BINDING__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case UMLModelPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
				getParameterSubstitution().clear();
				return;
			case UMLModelPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
				setBoundElement(BOUND_ELEMENT_EDEFAULT);
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
			case UMLModelPackage.TEMPLATE_BINDING__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case UMLModelPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
				return parameterSubstitution != null && !parameterSubstitution.isEmpty();
			case UMLModelPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
				return BOUND_ELEMENT_EDEFAULT == null ? boundElement != null : !BOUND_ELEMENT_EDEFAULT.equals(boundElement);
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
		result.append(", boundElement: ");
		result.append(boundElement);
		result.append(')');
		return result.toString();
	}

} //TemplateBindingImpl
