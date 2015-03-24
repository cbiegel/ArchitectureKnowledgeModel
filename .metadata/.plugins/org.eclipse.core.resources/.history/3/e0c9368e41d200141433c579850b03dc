/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.OWLModel.DataProperty;
import org.emftrace.metamodel.OWLModel.FunctionalDataProperty;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Data Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.FunctionalDataPropertyImpl#getDataProperty <em>Data Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalDataPropertyImpl extends DataPropertyAxiomImpl implements FunctionalDataProperty {
	/**
	 * The cached value of the '{@link #getDataProperty() <em>Data Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProperty()
	 * @generated
	 * @ordered
	 */
	protected DataProperty dataProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalDataPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getFunctionalDataProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProperty getDataProperty() {
		return dataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataProperty(DataProperty newDataProperty, NotificationChain msgs) {
		DataProperty oldDataProperty = dataProperty;
		dataProperty = newDataProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY, oldDataProperty, newDataProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataProperty(DataProperty newDataProperty) {
		if (newDataProperty != dataProperty) {
			NotificationChain msgs = null;
			if (dataProperty != null)
				msgs = ((InternalEObject)dataProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY, null, msgs);
			if (newDataProperty != null)
				msgs = ((InternalEObject)newDataProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY, null, msgs);
			msgs = basicSetDataProperty(newDataProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY, newDataProperty, newDataProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY:
				return basicSetDataProperty(null, msgs);
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
			case OWLModelPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY:
				return getDataProperty();
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
			case OWLModelPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY:
				setDataProperty((DataProperty)newValue);
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
			case OWLModelPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY:
				setDataProperty((DataProperty)null);
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
			case OWLModelPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY:
				return dataProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalDataPropertyImpl
