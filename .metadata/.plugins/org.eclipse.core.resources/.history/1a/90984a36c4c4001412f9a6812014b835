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

import org.emftrace.metamodel.UMLModel.Slot;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;
import org.emftrace.metamodel.UMLModel.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.SlotImpl#getDefiningFeature <em>Defining Feature</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.SlotImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.SlotImpl#getOwningInstance <em>Owning Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlotImpl extends ElementImpl implements Slot {
	/**
	 * The default value of the '{@link #getDefiningFeature() <em>Defining Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningFeature()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINING_FEATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefiningFeature() <em>Defining Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningFeature()
	 * @generated
	 * @ordered
	 */
	protected String definingFeature = DEFINING_FEATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> value;

	/**
	 * The default value of the '{@link #getOwningInstance() <em>Owning Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningInstance()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNING_INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwningInstance() <em>Owning Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningInstance()
	 * @generated
	 * @ordered
	 */
	protected String owningInstance = OWNING_INSTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getSlot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefiningFeature() {
		return definingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningFeature(String newDefiningFeature) {
		String oldDefiningFeature = definingFeature;
		definingFeature = newDefiningFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.SLOT__DEFINING_FEATURE, oldDefiningFeature, definingFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<ValueSpecification>(ValueSpecification.class, this, UMLModelPackage.SLOT__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwningInstance() {
		return owningInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningInstance(String newOwningInstance) {
		String oldOwningInstance = owningInstance;
		owningInstance = newOwningInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.SLOT__OWNING_INSTANCE, oldOwningInstance, owningInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.SLOT__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
			case UMLModelPackage.SLOT__DEFINING_FEATURE:
				return getDefiningFeature();
			case UMLModelPackage.SLOT__VALUE:
				return getValue();
			case UMLModelPackage.SLOT__OWNING_INSTANCE:
				return getOwningInstance();
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
			case UMLModelPackage.SLOT__DEFINING_FEATURE:
				setDefiningFeature((String)newValue);
				return;
			case UMLModelPackage.SLOT__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UMLModelPackage.SLOT__OWNING_INSTANCE:
				setOwningInstance((String)newValue);
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
			case UMLModelPackage.SLOT__DEFINING_FEATURE:
				setDefiningFeature(DEFINING_FEATURE_EDEFAULT);
				return;
			case UMLModelPackage.SLOT__VALUE:
				getValue().clear();
				return;
			case UMLModelPackage.SLOT__OWNING_INSTANCE:
				setOwningInstance(OWNING_INSTANCE_EDEFAULT);
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
			case UMLModelPackage.SLOT__DEFINING_FEATURE:
				return DEFINING_FEATURE_EDEFAULT == null ? definingFeature != null : !DEFINING_FEATURE_EDEFAULT.equals(definingFeature);
			case UMLModelPackage.SLOT__VALUE:
				return value != null && !value.isEmpty();
			case UMLModelPackage.SLOT__OWNING_INSTANCE:
				return OWNING_INSTANCE_EDEFAULT == null ? owningInstance != null : !OWNING_INSTANCE_EDEFAULT.equals(owningInstance);
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
		result.append(" (definingFeature: ");
		result.append(definingFeature);
		result.append(", owningInstance: ");
		result.append(owningInstance);
		result.append(')');
		return result.toString();
	}

} //SlotImpl
