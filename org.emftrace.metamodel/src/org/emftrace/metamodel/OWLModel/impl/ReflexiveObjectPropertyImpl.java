/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.OWLModel.OWLModelPackage;
import org.emftrace.metamodel.OWLModel.ObjectInverseOf;
import org.emftrace.metamodel.OWLModel.ObjectProperty;
import org.emftrace.metamodel.OWLModel.ReflexiveObjectProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reflexive Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ReflexiveObjectPropertyImpl#getObjectProperty <em>Object Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ReflexiveObjectPropertyImpl#getObjectInverseOf <em>Object Inverse Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReflexiveObjectPropertyImpl extends ObjectPropertyAxiomImpl implements ReflexiveObjectProperty {
	/**
	 * The cached value of the '{@link #getObjectProperty() <em>Object Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectProperty> objectProperty;

	/**
	 * The cached value of the '{@link #getObjectInverseOf() <em>Object Inverse Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectInverseOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectInverseOf> objectInverseOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReflexiveObjectPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getReflexiveObjectProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectProperty> getObjectProperty() {
		if (objectProperty == null) {
			objectProperty = new EObjectContainmentEList<ObjectProperty>(ObjectProperty.class, this, OWLModelPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY);
		}
		return objectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectInverseOf> getObjectInverseOf() {
		if (objectInverseOf == null) {
			objectInverseOf = new EObjectContainmentEList<ObjectInverseOf>(ObjectInverseOf.class, this, OWLModelPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_INVERSE_OF);
		}
		return objectInverseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY:
				return ((InternalEList<?>)getObjectProperty()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_INVERSE_OF:
				return ((InternalEList<?>)getObjectInverseOf()).basicRemove(otherEnd, msgs);
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
			case OWLModelPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY:
				return getObjectProperty();
			case OWLModelPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_INVERSE_OF:
				return getObjectInverseOf();
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
			case OWLModelPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY:
				getObjectProperty().clear();
				getObjectProperty().addAll((Collection<? extends ObjectProperty>)newValue);
				return;
			case OWLModelPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_INVERSE_OF:
				getObjectInverseOf().clear();
				getObjectInverseOf().addAll((Collection<? extends ObjectInverseOf>)newValue);
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
			case OWLModelPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY:
				getObjectProperty().clear();
				return;
			case OWLModelPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_INVERSE_OF:
				getObjectInverseOf().clear();
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
			case OWLModelPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY:
				return objectProperty != null && !objectProperty.isEmpty();
			case OWLModelPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_INVERSE_OF:
				return objectInverseOf != null && !objectInverseOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReflexiveObjectPropertyImpl
