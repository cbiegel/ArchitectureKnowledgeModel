/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.ExpansionKind;
import org.emftrace.metamodel.UMLModel.ExpansionRegion;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExpansionRegionImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExpansionRegionImpl#getInputElement <em>Input Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExpansionRegionImpl#getOutputElement <em>Output Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpansionRegionImpl extends StructuredActivityNodeImpl implements ExpansionRegion {
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final ExpansionKind MODE_EDEFAULT = ExpansionKind.ITERATIVE;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ExpansionKind mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputElement() <em>Input Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputElement()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputElement() <em>Input Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputElement()
	 * @generated
	 * @ordered
	 */
	protected String inputElement = INPUT_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputElement() <em>Output Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputElement()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputElement() <em>Output Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputElement()
	 * @generated
	 * @ordered
	 */
	protected String outputElement = OUTPUT_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getExpansionRegion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionKind getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(ExpansionKind newMode) {
		ExpansionKind oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXPANSION_REGION__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputElement() {
		return inputElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputElement(String newInputElement) {
		String oldInputElement = inputElement;
		inputElement = newInputElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXPANSION_REGION__INPUT_ELEMENT, oldInputElement, inputElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputElement() {
		return outputElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputElement(String newOutputElement) {
		String oldOutputElement = outputElement;
		outputElement = newOutputElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXPANSION_REGION__OUTPUT_ELEMENT, oldOutputElement, outputElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.EXPANSION_REGION__MODE:
				return getMode();
			case UMLModelPackage.EXPANSION_REGION__INPUT_ELEMENT:
				return getInputElement();
			case UMLModelPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
				return getOutputElement();
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
			case UMLModelPackage.EXPANSION_REGION__MODE:
				setMode((ExpansionKind)newValue);
				return;
			case UMLModelPackage.EXPANSION_REGION__INPUT_ELEMENT:
				setInputElement((String)newValue);
				return;
			case UMLModelPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
				setOutputElement((String)newValue);
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
			case UMLModelPackage.EXPANSION_REGION__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case UMLModelPackage.EXPANSION_REGION__INPUT_ELEMENT:
				setInputElement(INPUT_ELEMENT_EDEFAULT);
				return;
			case UMLModelPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
				setOutputElement(OUTPUT_ELEMENT_EDEFAULT);
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
			case UMLModelPackage.EXPANSION_REGION__MODE:
				return mode != MODE_EDEFAULT;
			case UMLModelPackage.EXPANSION_REGION__INPUT_ELEMENT:
				return INPUT_ELEMENT_EDEFAULT == null ? inputElement != null : !INPUT_ELEMENT_EDEFAULT.equals(inputElement);
			case UMLModelPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
				return OUTPUT_ELEMENT_EDEFAULT == null ? outputElement != null : !OUTPUT_ELEMENT_EDEFAULT.equals(outputElement);
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
		result.append(" (mode: ");
		result.append(mode);
		result.append(", inputElement: ");
		result.append(inputElement);
		result.append(", outputElement: ");
		result.append(outputElement);
		result.append(')');
		return result.toString();
	}

} //ExpansionRegionImpl
