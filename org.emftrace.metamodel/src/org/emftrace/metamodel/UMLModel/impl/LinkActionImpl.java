/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.UMLModel.InputPin;
import org.emftrace.metamodel.UMLModel.LinkAction;
import org.emftrace.metamodel.UMLModel.LinkEndData;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.LinkActionImpl#getEndData <em>End Data</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.LinkActionImpl#getInputValue <em>Input Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LinkActionImpl extends ActionImpl implements LinkAction {
	/**
	 * The cached value of the '{@link #getEndData() <em>End Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndData()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkEndData> endData;

	/**
	 * The cached value of the '{@link #getInputValue() <em>Input Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValue()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> inputValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getLinkAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkEndData> getEndData() {
		if (endData == null) {
			endData = new EObjectContainmentEList<LinkEndData>(LinkEndData.class, this, UMLModelPackage.LINK_ACTION__END_DATA);
		}
		return endData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getInputValue() {
		if (inputValue == null) {
			inputValue = new EObjectContainmentEList<InputPin>(InputPin.class, this, UMLModelPackage.LINK_ACTION__INPUT_VALUE);
		}
		return inputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.LINK_ACTION__END_DATA:
				return ((InternalEList<?>)getEndData()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.LINK_ACTION__INPUT_VALUE:
				return ((InternalEList<?>)getInputValue()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.LINK_ACTION__END_DATA:
				return getEndData();
			case UMLModelPackage.LINK_ACTION__INPUT_VALUE:
				return getInputValue();
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
			case UMLModelPackage.LINK_ACTION__END_DATA:
				getEndData().clear();
				getEndData().addAll((Collection<? extends LinkEndData>)newValue);
				return;
			case UMLModelPackage.LINK_ACTION__INPUT_VALUE:
				getInputValue().clear();
				getInputValue().addAll((Collection<? extends InputPin>)newValue);
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
			case UMLModelPackage.LINK_ACTION__END_DATA:
				getEndData().clear();
				return;
			case UMLModelPackage.LINK_ACTION__INPUT_VALUE:
				getInputValue().clear();
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
			case UMLModelPackage.LINK_ACTION__END_DATA:
				return endData != null && !endData.isEmpty();
			case UMLModelPackage.LINK_ACTION__INPUT_VALUE:
				return inputValue != null && !inputValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LinkActionImpl
