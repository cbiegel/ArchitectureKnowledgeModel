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

import org.emftrace.metamodel.UMLModel.StringExpression;
import org.emftrace.metamodel.UMLModel.TemplateBinding;
import org.emftrace.metamodel.UMLModel.TemplateSignature;
import org.emftrace.metamodel.UMLModel.TemplateableElement;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StringExpressionImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StringExpressionImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StringExpressionImpl#getSubExpression <em>Sub Expression</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.StringExpressionImpl#getOwningExpression <em>Owning Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringExpressionImpl extends ExpressionImpl implements StringExpression {
	/**
	 * The cached value of the '{@link #getTemplateBinding() <em>Template Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateBinding> templateBinding;

	/**
	 * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature ownedTemplateSignature;

	/**
	 * The cached value of the '{@link #getSubExpression() <em>Sub Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<StringExpression> subExpression;

	/**
	 * The default value of the '{@link #getOwningExpression() <em>Owning Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNING_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwningExpression() <em>Owning Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningExpression()
	 * @generated
	 * @ordered
	 */
	protected String owningExpression = OWNING_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getStringExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getTemplateBinding() {
		if (templateBinding == null) {
			templateBinding = new EObjectContainmentEList<TemplateBinding>(TemplateBinding.class, this, UMLModelPackage.STRING_EXPRESSION__TEMPLATE_BINDING);
		}
		return templateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature, NotificationChain msgs) {
		TemplateSignature oldOwnedTemplateSignature = ownedTemplateSignature;
		ownedTemplateSignature = newOwnedTemplateSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature) {
		if (newOwnedTemplateSignature != ownedTemplateSignature) {
			NotificationChain msgs = null;
			if (ownedTemplateSignature != null)
				msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
			if (newOwnedTemplateSignature != null)
				msgs = ((InternalEObject)newOwnedTemplateSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
			msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringExpression> getSubExpression() {
		if (subExpression == null) {
			subExpression = new EObjectContainmentEList<StringExpression>(StringExpression.class, this, UMLModelPackage.STRING_EXPRESSION__SUB_EXPRESSION);
		}
		return subExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwningExpression() {
		return owningExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningExpression(String newOwningExpression) {
		String oldOwningExpression = owningExpression;
		owningExpression = newOwningExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.STRING_EXPRESSION__OWNING_EXPRESSION, oldOwningExpression, owningExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.STRING_EXPRESSION__TEMPLATE_BINDING:
				return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLModelPackage.STRING_EXPRESSION__SUB_EXPRESSION:
				return ((InternalEList<?>)getSubExpression()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.STRING_EXPRESSION__TEMPLATE_BINDING:
				return getTemplateBinding();
			case UMLModelPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UMLModelPackage.STRING_EXPRESSION__SUB_EXPRESSION:
				return getSubExpression();
			case UMLModelPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				return getOwningExpression();
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
			case UMLModelPackage.STRING_EXPRESSION__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case UMLModelPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UMLModelPackage.STRING_EXPRESSION__SUB_EXPRESSION:
				getSubExpression().clear();
				getSubExpression().addAll((Collection<? extends StringExpression>)newValue);
				return;
			case UMLModelPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				setOwningExpression((String)newValue);
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
			case UMLModelPackage.STRING_EXPRESSION__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				return;
			case UMLModelPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UMLModelPackage.STRING_EXPRESSION__SUB_EXPRESSION:
				getSubExpression().clear();
				return;
			case UMLModelPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				setOwningExpression(OWNING_EXPRESSION_EDEFAULT);
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
			case UMLModelPackage.STRING_EXPRESSION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLModelPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UMLModelPackage.STRING_EXPRESSION__SUB_EXPRESSION:
				return subExpression != null && !subExpression.isEmpty();
			case UMLModelPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				return OWNING_EXPRESSION_EDEFAULT == null ? owningExpression != null : !OWNING_EXPRESSION_EDEFAULT.equals(owningExpression);
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
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.STRING_EXPRESSION__TEMPLATE_BINDING: return UMLModelPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
				case UMLModelPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE: return UMLModelPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING: return UMLModelPackage.STRING_EXPRESSION__TEMPLATE_BINDING;
				case UMLModelPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE: return UMLModelPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE;
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
		result.append(" (owningExpression: ");
		result.append(owningExpression);
		result.append(')');
		return result.toString();
	}

} //StringExpressionImpl
