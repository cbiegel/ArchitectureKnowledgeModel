/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.OWLModel.FunctionalObjectProperty;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;
import org.emftrace.metamodel.OWLModel.ObjectInverseOf;
import org.emftrace.metamodel.OWLModel.ObjectProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.FunctionalObjectPropertyImpl#getObjectProperty <em>Object Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.FunctionalObjectPropertyImpl#getObjectInverseOf <em>Object Inverse Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalObjectPropertyImpl extends ObjectPropertyAxiomImpl implements FunctionalObjectProperty {
	/**
	 * The cached value of the '{@link #getObjectProperty() <em>Object Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectProperty()
	 * @generated
	 * @ordered
	 */
	protected ObjectProperty objectProperty;

	/**
	 * The cached value of the '{@link #getObjectInverseOf() <em>Object Inverse Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectInverseOf()
	 * @generated
	 * @ordered
	 */
	protected ObjectInverseOf objectInverseOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalObjectPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getFunctionalObjectProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectProperty getObjectProperty() {
		return objectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectProperty(ObjectProperty newObjectProperty, NotificationChain msgs) {
		ObjectProperty oldObjectProperty = objectProperty;
		objectProperty = newObjectProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY, oldObjectProperty, newObjectProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectProperty(ObjectProperty newObjectProperty) {
		if (newObjectProperty != objectProperty) {
			NotificationChain msgs = null;
			if (objectProperty != null)
				msgs = ((InternalEObject)objectProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY, null, msgs);
			if (newObjectProperty != null)
				msgs = ((InternalEObject)newObjectProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY, null, msgs);
			msgs = basicSetObjectProperty(newObjectProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY, newObjectProperty, newObjectProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectInverseOf getObjectInverseOf() {
		return objectInverseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectInverseOf(ObjectInverseOf newObjectInverseOf, NotificationChain msgs) {
		ObjectInverseOf oldObjectInverseOf = objectInverseOf;
		objectInverseOf = newObjectInverseOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_INVERSE_OF, oldObjectInverseOf, newObjectInverseOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectInverseOf(ObjectInverseOf newObjectInverseOf) {
		if (newObjectInverseOf != objectInverseOf) {
			NotificationChain msgs = null;
			if (objectInverseOf != null)
				msgs = ((InternalEObject)objectInverseOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_INVERSE_OF, null, msgs);
			if (newObjectInverseOf != null)
				msgs = ((InternalEObject)newObjectInverseOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_INVERSE_OF, null, msgs);
			msgs = basicSetObjectInverseOf(newObjectInverseOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_INVERSE_OF, newObjectInverseOf, newObjectInverseOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY:
				return basicSetObjectProperty(null, msgs);
			case OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_INVERSE_OF:
				return basicSetObjectInverseOf(null, msgs);
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
			case OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY:
				return getObjectProperty();
			case OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_INVERSE_OF:
				return getObjectInverseOf();
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
			case OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY:
				setObjectProperty((ObjectProperty)newValue);
				return;
			case OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_INVERSE_OF:
				setObjectInverseOf((ObjectInverseOf)newValue);
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
			case OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY:
				setObjectProperty((ObjectProperty)null);
				return;
			case OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_INVERSE_OF:
				setObjectInverseOf((ObjectInverseOf)null);
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
			case OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY:
				return objectProperty != null;
			case OWLModelPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_INVERSE_OF:
				return objectInverseOf != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalObjectPropertyImpl
