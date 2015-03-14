/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.OWLModel.OWLModelPackage;
import org.emftrace.metamodel.OWLModel.ObjectInverseOf;
import org.emftrace.metamodel.OWLModel.ObjectProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Inverse Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectInverseOfImpl#getObjectProperty <em>Object Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectInverseOfImpl extends ObjectPropertyExpressionImpl implements ObjectInverseOf {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectInverseOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getObjectInverseOf();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_INVERSE_OF__OBJECT_PROPERTY, oldObjectProperty, newObjectProperty);
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
				msgs = ((InternalEObject)objectProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_INVERSE_OF__OBJECT_PROPERTY, null, msgs);
			if (newObjectProperty != null)
				msgs = ((InternalEObject)newObjectProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_INVERSE_OF__OBJECT_PROPERTY, null, msgs);
			msgs = basicSetObjectProperty(newObjectProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_INVERSE_OF__OBJECT_PROPERTY, newObjectProperty, newObjectProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.OBJECT_INVERSE_OF__OBJECT_PROPERTY:
				return basicSetObjectProperty(null, msgs);
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
			case OWLModelPackage.OBJECT_INVERSE_OF__OBJECT_PROPERTY:
				return getObjectProperty();
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
			case OWLModelPackage.OBJECT_INVERSE_OF__OBJECT_PROPERTY:
				setObjectProperty((ObjectProperty)newValue);
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
			case OWLModelPackage.OBJECT_INVERSE_OF__OBJECT_PROPERTY:
				setObjectProperty((ObjectProperty)null);
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
			case OWLModelPackage.OBJECT_INVERSE_OF__OBJECT_PROPERTY:
				return objectProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectInverseOfImpl
