/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.OWLModel.AnonymousIndividual;
import org.emftrace.metamodel.OWLModel.NamedIndividual;
import org.emftrace.metamodel.OWLModel.NegativeObjectPropertyAssertion;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;
import org.emftrace.metamodel.OWLModel.ObjectInverseOf;
import org.emftrace.metamodel.OWLModel.ObjectProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negative Object Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.NegativeObjectPropertyAssertionImpl#getObjectProperty <em>Object Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.NegativeObjectPropertyAssertionImpl#getObjectInverseOf <em>Object Inverse Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.NegativeObjectPropertyAssertionImpl#getNamedIndividual <em>Named Individual</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.NegativeObjectPropertyAssertionImpl#getAnonymousIndividual <em>Anonymous Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NegativeObjectPropertyAssertionImpl extends AssertionImpl implements NegativeObjectPropertyAssertion {
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
	 * The cached value of the '{@link #getNamedIndividual() <em>Named Individual</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedIndividual()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedIndividual> namedIndividual;

	/**
	 * The cached value of the '{@link #getAnonymousIndividual() <em>Anonymous Individual</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousIndividual()
	 * @generated
	 * @ordered
	 */
	protected EList<AnonymousIndividual> anonymousIndividual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegativeObjectPropertyAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getNegativeObjectPropertyAssertion();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY, oldObjectProperty, newObjectProperty);
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
				msgs = ((InternalEObject)objectProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY, null, msgs);
			if (newObjectProperty != null)
				msgs = ((InternalEObject)newObjectProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY, null, msgs);
			msgs = basicSetObjectProperty(newObjectProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY, newObjectProperty, newObjectProperty));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_INVERSE_OF, oldObjectInverseOf, newObjectInverseOf);
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
				msgs = ((InternalEObject)objectInverseOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_INVERSE_OF, null, msgs);
			if (newObjectInverseOf != null)
				msgs = ((InternalEObject)newObjectInverseOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_INVERSE_OF, null, msgs);
			msgs = basicSetObjectInverseOf(newObjectInverseOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_INVERSE_OF, newObjectInverseOf, newObjectInverseOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedIndividual> getNamedIndividual() {
		if (namedIndividual == null) {
			namedIndividual = new EObjectContainmentEList<NamedIndividual>(NamedIndividual.class, this, OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__NAMED_INDIVIDUAL);
		}
		return namedIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnonymousIndividual> getAnonymousIndividual() {
		if (anonymousIndividual == null) {
			anonymousIndividual = new EObjectContainmentEList<AnonymousIndividual>(AnonymousIndividual.class, this, OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__ANONYMOUS_INDIVIDUAL);
		}
		return anonymousIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY:
				return basicSetObjectProperty(null, msgs);
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_INVERSE_OF:
				return basicSetObjectInverseOf(null, msgs);
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__NAMED_INDIVIDUAL:
				return ((InternalEList<?>)getNamedIndividual()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__ANONYMOUS_INDIVIDUAL:
				return ((InternalEList<?>)getAnonymousIndividual()).basicRemove(otherEnd, msgs);
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
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY:
				return getObjectProperty();
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_INVERSE_OF:
				return getObjectInverseOf();
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__NAMED_INDIVIDUAL:
				return getNamedIndividual();
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__ANONYMOUS_INDIVIDUAL:
				return getAnonymousIndividual();
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
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY:
				setObjectProperty((ObjectProperty)newValue);
				return;
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_INVERSE_OF:
				setObjectInverseOf((ObjectInverseOf)newValue);
				return;
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__NAMED_INDIVIDUAL:
				getNamedIndividual().clear();
				getNamedIndividual().addAll((Collection<? extends NamedIndividual>)newValue);
				return;
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__ANONYMOUS_INDIVIDUAL:
				getAnonymousIndividual().clear();
				getAnonymousIndividual().addAll((Collection<? extends AnonymousIndividual>)newValue);
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
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY:
				setObjectProperty((ObjectProperty)null);
				return;
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_INVERSE_OF:
				setObjectInverseOf((ObjectInverseOf)null);
				return;
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__NAMED_INDIVIDUAL:
				getNamedIndividual().clear();
				return;
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__ANONYMOUS_INDIVIDUAL:
				getAnonymousIndividual().clear();
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
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY:
				return objectProperty != null;
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_INVERSE_OF:
				return objectInverseOf != null;
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__NAMED_INDIVIDUAL:
				return namedIndividual != null && !namedIndividual.isEmpty();
			case OWLModelPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__ANONYMOUS_INDIVIDUAL:
				return anonymousIndividual != null && !anonymousIndividual.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NegativeObjectPropertyAssertionImpl
