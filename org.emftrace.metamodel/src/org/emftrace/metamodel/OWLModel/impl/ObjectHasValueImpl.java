/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.OWLModel.AnonymousIndividual;
import org.emftrace.metamodel.OWLModel.NamedIndividual;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;
import org.emftrace.metamodel.OWLModel.ObjectHasValue;
import org.emftrace.metamodel.OWLModel.ObjectInverseOf;
import org.emftrace.metamodel.OWLModel.ObjectProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Has Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectHasValueImpl#getObjectProperty <em>Object Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectHasValueImpl#getObjectInverseOf <em>Object Inverse Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectHasValueImpl#getNamedIndividual <em>Named Individual</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectHasValueImpl#getAnonymousIndividual <em>Anonymous Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectHasValueImpl extends ClassExpressionImpl implements ObjectHasValue {
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
	 * The cached value of the '{@link #getNamedIndividual() <em>Named Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedIndividual()
	 * @generated
	 * @ordered
	 */
	protected NamedIndividual namedIndividual;

	/**
	 * The cached value of the '{@link #getAnonymousIndividual() <em>Anonymous Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousIndividual()
	 * @generated
	 * @ordered
	 */
	protected AnonymousIndividual anonymousIndividual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectHasValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getObjectHasValue();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY, oldObjectProperty, newObjectProperty);
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
				msgs = ((InternalEObject)objectProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY, null, msgs);
			if (newObjectProperty != null)
				msgs = ((InternalEObject)newObjectProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY, null, msgs);
			msgs = basicSetObjectProperty(newObjectProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY, newObjectProperty, newObjectProperty));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_INVERSE_OF, oldObjectInverseOf, newObjectInverseOf);
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
				msgs = ((InternalEObject)objectInverseOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_INVERSE_OF, null, msgs);
			if (newObjectInverseOf != null)
				msgs = ((InternalEObject)newObjectInverseOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_INVERSE_OF, null, msgs);
			msgs = basicSetObjectInverseOf(newObjectInverseOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_INVERSE_OF, newObjectInverseOf, newObjectInverseOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedIndividual getNamedIndividual() {
		return namedIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamedIndividual(NamedIndividual newNamedIndividual, NotificationChain msgs) {
		NamedIndividual oldNamedIndividual = namedIndividual;
		namedIndividual = newNamedIndividual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_HAS_VALUE__NAMED_INDIVIDUAL, oldNamedIndividual, newNamedIndividual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamedIndividual(NamedIndividual newNamedIndividual) {
		if (newNamedIndividual != namedIndividual) {
			NotificationChain msgs = null;
			if (namedIndividual != null)
				msgs = ((InternalEObject)namedIndividual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_HAS_VALUE__NAMED_INDIVIDUAL, null, msgs);
			if (newNamedIndividual != null)
				msgs = ((InternalEObject)newNamedIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_HAS_VALUE__NAMED_INDIVIDUAL, null, msgs);
			msgs = basicSetNamedIndividual(newNamedIndividual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_HAS_VALUE__NAMED_INDIVIDUAL, newNamedIndividual, newNamedIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousIndividual getAnonymousIndividual() {
		return anonymousIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnonymousIndividual(AnonymousIndividual newAnonymousIndividual, NotificationChain msgs) {
		AnonymousIndividual oldAnonymousIndividual = anonymousIndividual;
		anonymousIndividual = newAnonymousIndividual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_HAS_VALUE__ANONYMOUS_INDIVIDUAL, oldAnonymousIndividual, newAnonymousIndividual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymousIndividual(AnonymousIndividual newAnonymousIndividual) {
		if (newAnonymousIndividual != anonymousIndividual) {
			NotificationChain msgs = null;
			if (anonymousIndividual != null)
				msgs = ((InternalEObject)anonymousIndividual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_HAS_VALUE__ANONYMOUS_INDIVIDUAL, null, msgs);
			if (newAnonymousIndividual != null)
				msgs = ((InternalEObject)newAnonymousIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_HAS_VALUE__ANONYMOUS_INDIVIDUAL, null, msgs);
			msgs = basicSetAnonymousIndividual(newAnonymousIndividual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_HAS_VALUE__ANONYMOUS_INDIVIDUAL, newAnonymousIndividual, newAnonymousIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY:
				return basicSetObjectProperty(null, msgs);
			case OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_INVERSE_OF:
				return basicSetObjectInverseOf(null, msgs);
			case OWLModelPackage.OBJECT_HAS_VALUE__NAMED_INDIVIDUAL:
				return basicSetNamedIndividual(null, msgs);
			case OWLModelPackage.OBJECT_HAS_VALUE__ANONYMOUS_INDIVIDUAL:
				return basicSetAnonymousIndividual(null, msgs);
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
			case OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY:
				return getObjectProperty();
			case OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_INVERSE_OF:
				return getObjectInverseOf();
			case OWLModelPackage.OBJECT_HAS_VALUE__NAMED_INDIVIDUAL:
				return getNamedIndividual();
			case OWLModelPackage.OBJECT_HAS_VALUE__ANONYMOUS_INDIVIDUAL:
				return getAnonymousIndividual();
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
			case OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY:
				setObjectProperty((ObjectProperty)newValue);
				return;
			case OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_INVERSE_OF:
				setObjectInverseOf((ObjectInverseOf)newValue);
				return;
			case OWLModelPackage.OBJECT_HAS_VALUE__NAMED_INDIVIDUAL:
				setNamedIndividual((NamedIndividual)newValue);
				return;
			case OWLModelPackage.OBJECT_HAS_VALUE__ANONYMOUS_INDIVIDUAL:
				setAnonymousIndividual((AnonymousIndividual)newValue);
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
			case OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY:
				setObjectProperty((ObjectProperty)null);
				return;
			case OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_INVERSE_OF:
				setObjectInverseOf((ObjectInverseOf)null);
				return;
			case OWLModelPackage.OBJECT_HAS_VALUE__NAMED_INDIVIDUAL:
				setNamedIndividual((NamedIndividual)null);
				return;
			case OWLModelPackage.OBJECT_HAS_VALUE__ANONYMOUS_INDIVIDUAL:
				setAnonymousIndividual((AnonymousIndividual)null);
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
			case OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY:
				return objectProperty != null;
			case OWLModelPackage.OBJECT_HAS_VALUE__OBJECT_INVERSE_OF:
				return objectInverseOf != null;
			case OWLModelPackage.OBJECT_HAS_VALUE__NAMED_INDIVIDUAL:
				return namedIndividual != null;
			case OWLModelPackage.OBJECT_HAS_VALUE__ANONYMOUS_INDIVIDUAL:
				return anonymousIndividual != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectHasValueImpl
