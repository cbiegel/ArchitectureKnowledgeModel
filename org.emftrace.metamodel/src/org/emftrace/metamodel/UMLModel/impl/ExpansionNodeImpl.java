/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.ExpansionNode;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExpansionNodeImpl#getRegionAsOutput <em>Region As Output</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ExpansionNodeImpl#getRegionAsInput <em>Region As Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpansionNodeImpl extends ObjectNodeImpl implements ExpansionNode {
	/**
	 * The default value of the '{@link #getRegionAsOutput() <em>Region As Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionAsOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_AS_OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegionAsOutput() <em>Region As Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionAsOutput()
	 * @generated
	 * @ordered
	 */
	protected String regionAsOutput = REGION_AS_OUTPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegionAsInput() <em>Region As Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionAsInput()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_AS_INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegionAsInput() <em>Region As Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionAsInput()
	 * @generated
	 * @ordered
	 */
	protected String regionAsInput = REGION_AS_INPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getExpansionNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegionAsOutput() {
		return regionAsOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionAsOutput(String newRegionAsOutput) {
		String oldRegionAsOutput = regionAsOutput;
		regionAsOutput = newRegionAsOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXPANSION_NODE__REGION_AS_OUTPUT, oldRegionAsOutput, regionAsOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegionAsInput() {
		return regionAsInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionAsInput(String newRegionAsInput) {
		String oldRegionAsInput = regionAsInput;
		regionAsInput = newRegionAsInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.EXPANSION_NODE__REGION_AS_INPUT, oldRegionAsInput, regionAsInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
				return getRegionAsOutput();
			case UMLModelPackage.EXPANSION_NODE__REGION_AS_INPUT:
				return getRegionAsInput();
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
			case UMLModelPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
				setRegionAsOutput((String)newValue);
				return;
			case UMLModelPackage.EXPANSION_NODE__REGION_AS_INPUT:
				setRegionAsInput((String)newValue);
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
			case UMLModelPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
				setRegionAsOutput(REGION_AS_OUTPUT_EDEFAULT);
				return;
			case UMLModelPackage.EXPANSION_NODE__REGION_AS_INPUT:
				setRegionAsInput(REGION_AS_INPUT_EDEFAULT);
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
			case UMLModelPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
				return REGION_AS_OUTPUT_EDEFAULT == null ? regionAsOutput != null : !REGION_AS_OUTPUT_EDEFAULT.equals(regionAsOutput);
			case UMLModelPackage.EXPANSION_NODE__REGION_AS_INPUT:
				return REGION_AS_INPUT_EDEFAULT == null ? regionAsInput != null : !REGION_AS_INPUT_EDEFAULT.equals(regionAsInput);
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
		result.append(" (regionAsOutput: ");
		result.append(regionAsOutput);
		result.append(", regionAsInput: ");
		result.append(regionAsInput);
		result.append(')');
		return result.toString();
	}

} //ExpansionNodeImpl
