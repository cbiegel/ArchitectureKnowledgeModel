/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.InterfaceRealization;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InterfaceRealizationImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.InterfaceRealizationImpl#getRealizingClassifier <em>Realizing Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceRealizationImpl extends RealizationImpl implements InterfaceRealization {
	/**
	 * The default value of the '{@link #getContract() <em>Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected String contract = CONTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRealizingClassifier() <em>Realizing Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final String REALIZING_CLASSIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRealizingClassifier() <em>Realizing Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingClassifier()
	 * @generated
	 * @ordered
	 */
	protected String realizingClassifier = REALIZING_CLASSIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getInterfaceRealization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContract() {
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract(String newContract) {
		String oldContract = contract;
		contract = newContract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INTERFACE_REALIZATION__CONTRACT, oldContract, contract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRealizingClassifier() {
		return realizingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizingClassifier(String newRealizingClassifier) {
		String oldRealizingClassifier = realizingClassifier;
		realizingClassifier = newRealizingClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.INTERFACE_REALIZATION__REALIZING_CLASSIFIER, oldRealizingClassifier, realizingClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.INTERFACE_REALIZATION__CONTRACT:
				return getContract();
			case UMLModelPackage.INTERFACE_REALIZATION__REALIZING_CLASSIFIER:
				return getRealizingClassifier();
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
			case UMLModelPackage.INTERFACE_REALIZATION__CONTRACT:
				setContract((String)newValue);
				return;
			case UMLModelPackage.INTERFACE_REALIZATION__REALIZING_CLASSIFIER:
				setRealizingClassifier((String)newValue);
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
			case UMLModelPackage.INTERFACE_REALIZATION__CONTRACT:
				setContract(CONTRACT_EDEFAULT);
				return;
			case UMLModelPackage.INTERFACE_REALIZATION__REALIZING_CLASSIFIER:
				setRealizingClassifier(REALIZING_CLASSIFIER_EDEFAULT);
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
			case UMLModelPackage.INTERFACE_REALIZATION__CONTRACT:
				return CONTRACT_EDEFAULT == null ? contract != null : !CONTRACT_EDEFAULT.equals(contract);
			case UMLModelPackage.INTERFACE_REALIZATION__REALIZING_CLASSIFIER:
				return REALIZING_CLASSIFIER_EDEFAULT == null ? realizingClassifier != null : !REALIZING_CLASSIFIER_EDEFAULT.equals(realizingClassifier);
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
		result.append(" (contract: ");
		result.append(contract);
		result.append(", realizingClassifier: ");
		result.append(realizingClassifier);
		result.append(')');
		return result.toString();
	}

} //InterfaceRealizationImpl
