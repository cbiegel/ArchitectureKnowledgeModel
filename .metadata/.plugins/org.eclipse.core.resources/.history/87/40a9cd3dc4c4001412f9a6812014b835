/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.Documentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentationImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentationImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.DocumentationImpl#getTextFormat <em>Text Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentationImpl extends BaseElementImpl implements Documentation {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextFormat() <em>Text Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_FORMAT_EDEFAULT = "text/plain";

	/**
	 * The cached value of the '{@link #getTextFormat() <em>Text Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFormat()
	 * @generated
	 * @ordered
	 */
	protected String textFormat = TEXT_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getDocumentation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, BPMN2ModelPackage.DOCUMENTATION__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENTATION__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextFormat() {
		return textFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextFormat(String newTextFormat) {
		String oldTextFormat = textFormat;
		textFormat = newTextFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.DOCUMENTATION__TEXT_FORMAT, oldTextFormat, textFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.DOCUMENTATION__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
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
			case BPMN2ModelPackage.DOCUMENTATION__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case BPMN2ModelPackage.DOCUMENTATION__TEXT:
				return getText();
			case BPMN2ModelPackage.DOCUMENTATION__TEXT_FORMAT:
				return getTextFormat();
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
			case BPMN2ModelPackage.DOCUMENTATION__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case BPMN2ModelPackage.DOCUMENTATION__TEXT:
				setText((String)newValue);
				return;
			case BPMN2ModelPackage.DOCUMENTATION__TEXT_FORMAT:
				setTextFormat((String)newValue);
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
			case BPMN2ModelPackage.DOCUMENTATION__MIXED:
				getMixed().clear();
				return;
			case BPMN2ModelPackage.DOCUMENTATION__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case BPMN2ModelPackage.DOCUMENTATION__TEXT_FORMAT:
				setTextFormat(TEXT_FORMAT_EDEFAULT);
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
			case BPMN2ModelPackage.DOCUMENTATION__MIXED:
				return mixed != null && !mixed.isEmpty();
			case BPMN2ModelPackage.DOCUMENTATION__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case BPMN2ModelPackage.DOCUMENTATION__TEXT_FORMAT:
				return TEXT_FORMAT_EDEFAULT == null ? textFormat != null : !TEXT_FORMAT_EDEFAULT.equals(textFormat);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", text: ");
		result.append(text);
		result.append(", textFormat: ");
		result.append(textFormat);
		result.append(')');
		return result.toString();
	}

} //DocumentationImpl
