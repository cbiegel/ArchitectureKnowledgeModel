/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.UMLModel.OpaqueExpression;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.OpaqueExpressionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.OpaqueExpressionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.OpaqueExpressionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.OpaqueExpressionImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpaqueExpressionImpl extends ValueSpecificationImpl implements OpaqueExpression {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<String> body;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> language;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected String result = RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final String BEHAVIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected String behavior = BEHAVIOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getOpaqueExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBody() {
		if (body == null) {
			body = new EDataTypeEList.Unsettable<String>(String.class, this, UMLModelPackage.OPAQUE_EXPRESSION__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBody() {
		if (body != null) ((InternalEList.Unsettable<?>)body).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBody() {
		return body != null && ((InternalEList.Unsettable<?>)body).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLanguage() {
		if (language == null) {
			language = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, UMLModelPackage.OPAQUE_EXPRESSION__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLanguage() {
		if (language != null) ((InternalEList.Unsettable<?>)language).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLanguage() {
		return language != null && ((InternalEList.Unsettable<?>)language).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(String newResult) {
		String oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.OPAQUE_EXPRESSION__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(String newBehavior) {
		String oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.OPAQUE_EXPRESSION__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.OPAQUE_EXPRESSION__BODY:
				return getBody();
			case UMLModelPackage.OPAQUE_EXPRESSION__LANGUAGE:
				return getLanguage();
			case UMLModelPackage.OPAQUE_EXPRESSION__RESULT:
				return getResult();
			case UMLModelPackage.OPAQUE_EXPRESSION__BEHAVIOR:
				return getBehavior();
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
			case UMLModelPackage.OPAQUE_EXPRESSION__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends String>)newValue);
				return;
			case UMLModelPackage.OPAQUE_EXPRESSION__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends String>)newValue);
				return;
			case UMLModelPackage.OPAQUE_EXPRESSION__RESULT:
				setResult((String)newValue);
				return;
			case UMLModelPackage.OPAQUE_EXPRESSION__BEHAVIOR:
				setBehavior((String)newValue);
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
			case UMLModelPackage.OPAQUE_EXPRESSION__BODY:
				unsetBody();
				return;
			case UMLModelPackage.OPAQUE_EXPRESSION__LANGUAGE:
				unsetLanguage();
				return;
			case UMLModelPackage.OPAQUE_EXPRESSION__RESULT:
				setResult(RESULT_EDEFAULT);
				return;
			case UMLModelPackage.OPAQUE_EXPRESSION__BEHAVIOR:
				setBehavior(BEHAVIOR_EDEFAULT);
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
			case UMLModelPackage.OPAQUE_EXPRESSION__BODY:
				return isSetBody();
			case UMLModelPackage.OPAQUE_EXPRESSION__LANGUAGE:
				return isSetLanguage();
			case UMLModelPackage.OPAQUE_EXPRESSION__RESULT:
				return RESULT_EDEFAULT == null ? result != null : !RESULT_EDEFAULT.equals(result);
			case UMLModelPackage.OPAQUE_EXPRESSION__BEHAVIOR:
				return BEHAVIOR_EDEFAULT == null ? behavior != null : !BEHAVIOR_EDEFAULT.equals(behavior);
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
		result.append(" (body: ");
		result.append(body);
		result.append(", language: ");
		result.append(language);
		result.append(", result: ");
		result.append(result);
		result.append(", behavior: ");
		result.append(behavior);
		result.append(')');
		return result.toString();
	}

} //OpaqueExpressionImpl
