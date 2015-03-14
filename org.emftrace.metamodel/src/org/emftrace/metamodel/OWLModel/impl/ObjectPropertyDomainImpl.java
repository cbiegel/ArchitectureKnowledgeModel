/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.OWLModel.DataAllValuesFrom;
import org.emftrace.metamodel.OWLModel.DataExactCardinality;
import org.emftrace.metamodel.OWLModel.DataHasValue;
import org.emftrace.metamodel.OWLModel.DataMaxCardinality;
import org.emftrace.metamodel.OWLModel.DataMinCardinality;
import org.emftrace.metamodel.OWLModel.DataSomeValuesFrom;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;
import org.emftrace.metamodel.OWLModel.ObjectAllValuesFrom;
import org.emftrace.metamodel.OWLModel.ObjectComplementOf;
import org.emftrace.metamodel.OWLModel.ObjectExactCardinality;
import org.emftrace.metamodel.OWLModel.ObjectHasSelf;
import org.emftrace.metamodel.OWLModel.ObjectHasValue;
import org.emftrace.metamodel.OWLModel.ObjectIntersectionOf;
import org.emftrace.metamodel.OWLModel.ObjectInverseOf;
import org.emftrace.metamodel.OWLModel.ObjectMaxCardinality;
import org.emftrace.metamodel.OWLModel.ObjectMinCardinality;
import org.emftrace.metamodel.OWLModel.ObjectOneOf;
import org.emftrace.metamodel.OWLModel.ObjectProperty;
import org.emftrace.metamodel.OWLModel.ObjectPropertyDomain;
import org.emftrace.metamodel.OWLModel.ObjectSomeValuesFrom;
import org.emftrace.metamodel.OWLModel.ObjectUnionOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Property Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getObjectProperty <em>Object Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getObjectInverseOf <em>Object Inverse Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getObjectIntersectionOf <em>Object Intersection Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getObjectUnionOf <em>Object Union Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getObjectComplementOf <em>Object Complement Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getObjectOneOf <em>Object One Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getObjectSomeValuesFrom <em>Object Some Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getObjectAllValuesFrom <em>Object All Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getObjectHasValue <em>Object Has Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getObjectHasSelf <em>Object Has Self</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getObjectMinCardinality <em>Object Min Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getObjectMaxCardinality <em>Object Max Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getObjectExactCardinality <em>Object Exact Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getDataSomeValuesFrom <em>Data Some Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getDataAllValuesFrom <em>Data All Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getDataHasValue <em>Data Has Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getDataMinCardinality <em>Data Min Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getDataMaxCardinality <em>Data Max Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.ObjectPropertyDomainImpl#getDataExactCardinality <em>Data Exact Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectPropertyDomainImpl extends ObjectPropertyAxiomImpl implements ObjectPropertyDomain {
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
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected org.emftrace.metamodel.OWLModel.Class class_;

	/**
	 * The cached value of the '{@link #getObjectIntersectionOf() <em>Object Intersection Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectIntersectionOf()
	 * @generated
	 * @ordered
	 */
	protected ObjectIntersectionOf objectIntersectionOf;

	/**
	 * The cached value of the '{@link #getObjectUnionOf() <em>Object Union Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectUnionOf()
	 * @generated
	 * @ordered
	 */
	protected ObjectUnionOf objectUnionOf;

	/**
	 * The cached value of the '{@link #getObjectComplementOf() <em>Object Complement Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectComplementOf()
	 * @generated
	 * @ordered
	 */
	protected ObjectComplementOf objectComplementOf;

	/**
	 * The cached value of the '{@link #getObjectOneOf() <em>Object One Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectOneOf()
	 * @generated
	 * @ordered
	 */
	protected ObjectOneOf objectOneOf;

	/**
	 * The cached value of the '{@link #getObjectSomeValuesFrom() <em>Object Some Values From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectSomeValuesFrom()
	 * @generated
	 * @ordered
	 */
	protected ObjectSomeValuesFrom objectSomeValuesFrom;

	/**
	 * The cached value of the '{@link #getObjectAllValuesFrom() <em>Object All Values From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectAllValuesFrom()
	 * @generated
	 * @ordered
	 */
	protected ObjectAllValuesFrom objectAllValuesFrom;

	/**
	 * The cached value of the '{@link #getObjectHasValue() <em>Object Has Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectHasValue()
	 * @generated
	 * @ordered
	 */
	protected ObjectHasValue objectHasValue;

	/**
	 * The cached value of the '{@link #getObjectHasSelf() <em>Object Has Self</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectHasSelf()
	 * @generated
	 * @ordered
	 */
	protected ObjectHasSelf objectHasSelf;

	/**
	 * The cached value of the '{@link #getObjectMinCardinality() <em>Object Min Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectMinCardinality()
	 * @generated
	 * @ordered
	 */
	protected ObjectMinCardinality objectMinCardinality;

	/**
	 * The cached value of the '{@link #getObjectMaxCardinality() <em>Object Max Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectMaxCardinality()
	 * @generated
	 * @ordered
	 */
	protected ObjectMaxCardinality objectMaxCardinality;

	/**
	 * The cached value of the '{@link #getObjectExactCardinality() <em>Object Exact Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectExactCardinality()
	 * @generated
	 * @ordered
	 */
	protected ObjectExactCardinality objectExactCardinality;

	/**
	 * The cached value of the '{@link #getDataSomeValuesFrom() <em>Data Some Values From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSomeValuesFrom()
	 * @generated
	 * @ordered
	 */
	protected DataSomeValuesFrom dataSomeValuesFrom;

	/**
	 * The cached value of the '{@link #getDataAllValuesFrom() <em>Data All Values From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAllValuesFrom()
	 * @generated
	 * @ordered
	 */
	protected DataAllValuesFrom dataAllValuesFrom;

	/**
	 * The cached value of the '{@link #getDataHasValue() <em>Data Has Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataHasValue()
	 * @generated
	 * @ordered
	 */
	protected DataHasValue dataHasValue;

	/**
	 * The cached value of the '{@link #getDataMinCardinality() <em>Data Min Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMinCardinality()
	 * @generated
	 * @ordered
	 */
	protected DataMinCardinality dataMinCardinality;

	/**
	 * The cached value of the '{@link #getDataMaxCardinality() <em>Data Max Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMaxCardinality()
	 * @generated
	 * @ordered
	 */
	protected DataMaxCardinality dataMaxCardinality;

	/**
	 * The cached value of the '{@link #getDataExactCardinality() <em>Data Exact Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataExactCardinality()
	 * @generated
	 * @ordered
	 */
	protected DataExactCardinality dataExactCardinality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectPropertyDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getObjectPropertyDomain();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY, oldObjectProperty, newObjectProperty);
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
				msgs = ((InternalEObject)objectProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY, null, msgs);
			if (newObjectProperty != null)
				msgs = ((InternalEObject)newObjectProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY, null, msgs);
			msgs = basicSetObjectProperty(newObjectProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY, newObjectProperty, newObjectProperty));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INVERSE_OF, oldObjectInverseOf, newObjectInverseOf);
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
				msgs = ((InternalEObject)objectInverseOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INVERSE_OF, null, msgs);
			if (newObjectInverseOf != null)
				msgs = ((InternalEObject)newObjectInverseOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INVERSE_OF, null, msgs);
			msgs = basicSetObjectInverseOf(newObjectInverseOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INVERSE_OF, newObjectInverseOf, newObjectInverseOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.emftrace.metamodel.OWLModel.Class getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(org.emftrace.metamodel.OWLModel.Class newClass, NotificationChain msgs) {
		org.emftrace.metamodel.OWLModel.Class oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__CLASS, oldClass, newClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(org.emftrace.metamodel.OWLModel.Class newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__CLASS, null, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectIntersectionOf getObjectIntersectionOf() {
		return objectIntersectionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectIntersectionOf(ObjectIntersectionOf newObjectIntersectionOf, NotificationChain msgs) {
		ObjectIntersectionOf oldObjectIntersectionOf = objectIntersectionOf;
		objectIntersectionOf = newObjectIntersectionOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INTERSECTION_OF, oldObjectIntersectionOf, newObjectIntersectionOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectIntersectionOf(ObjectIntersectionOf newObjectIntersectionOf) {
		if (newObjectIntersectionOf != objectIntersectionOf) {
			NotificationChain msgs = null;
			if (objectIntersectionOf != null)
				msgs = ((InternalEObject)objectIntersectionOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INTERSECTION_OF, null, msgs);
			if (newObjectIntersectionOf != null)
				msgs = ((InternalEObject)newObjectIntersectionOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INTERSECTION_OF, null, msgs);
			msgs = basicSetObjectIntersectionOf(newObjectIntersectionOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INTERSECTION_OF, newObjectIntersectionOf, newObjectIntersectionOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectUnionOf getObjectUnionOf() {
		return objectUnionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectUnionOf(ObjectUnionOf newObjectUnionOf, NotificationChain msgs) {
		ObjectUnionOf oldObjectUnionOf = objectUnionOf;
		objectUnionOf = newObjectUnionOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_UNION_OF, oldObjectUnionOf, newObjectUnionOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectUnionOf(ObjectUnionOf newObjectUnionOf) {
		if (newObjectUnionOf != objectUnionOf) {
			NotificationChain msgs = null;
			if (objectUnionOf != null)
				msgs = ((InternalEObject)objectUnionOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_UNION_OF, null, msgs);
			if (newObjectUnionOf != null)
				msgs = ((InternalEObject)newObjectUnionOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_UNION_OF, null, msgs);
			msgs = basicSetObjectUnionOf(newObjectUnionOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_UNION_OF, newObjectUnionOf, newObjectUnionOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectComplementOf getObjectComplementOf() {
		return objectComplementOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectComplementOf(ObjectComplementOf newObjectComplementOf, NotificationChain msgs) {
		ObjectComplementOf oldObjectComplementOf = objectComplementOf;
		objectComplementOf = newObjectComplementOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_COMPLEMENT_OF, oldObjectComplementOf, newObjectComplementOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectComplementOf(ObjectComplementOf newObjectComplementOf) {
		if (newObjectComplementOf != objectComplementOf) {
			NotificationChain msgs = null;
			if (objectComplementOf != null)
				msgs = ((InternalEObject)objectComplementOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_COMPLEMENT_OF, null, msgs);
			if (newObjectComplementOf != null)
				msgs = ((InternalEObject)newObjectComplementOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_COMPLEMENT_OF, null, msgs);
			msgs = basicSetObjectComplementOf(newObjectComplementOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_COMPLEMENT_OF, newObjectComplementOf, newObjectComplementOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOneOf getObjectOneOf() {
		return objectOneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectOneOf(ObjectOneOf newObjectOneOf, NotificationChain msgs) {
		ObjectOneOf oldObjectOneOf = objectOneOf;
		objectOneOf = newObjectOneOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ONE_OF, oldObjectOneOf, newObjectOneOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectOneOf(ObjectOneOf newObjectOneOf) {
		if (newObjectOneOf != objectOneOf) {
			NotificationChain msgs = null;
			if (objectOneOf != null)
				msgs = ((InternalEObject)objectOneOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ONE_OF, null, msgs);
			if (newObjectOneOf != null)
				msgs = ((InternalEObject)newObjectOneOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ONE_OF, null, msgs);
			msgs = basicSetObjectOneOf(newObjectOneOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ONE_OF, newObjectOneOf, newObjectOneOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSomeValuesFrom getObjectSomeValuesFrom() {
		return objectSomeValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectSomeValuesFrom(ObjectSomeValuesFrom newObjectSomeValuesFrom, NotificationChain msgs) {
		ObjectSomeValuesFrom oldObjectSomeValuesFrom = objectSomeValuesFrom;
		objectSomeValuesFrom = newObjectSomeValuesFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_SOME_VALUES_FROM, oldObjectSomeValuesFrom, newObjectSomeValuesFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectSomeValuesFrom(ObjectSomeValuesFrom newObjectSomeValuesFrom) {
		if (newObjectSomeValuesFrom != objectSomeValuesFrom) {
			NotificationChain msgs = null;
			if (objectSomeValuesFrom != null)
				msgs = ((InternalEObject)objectSomeValuesFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_SOME_VALUES_FROM, null, msgs);
			if (newObjectSomeValuesFrom != null)
				msgs = ((InternalEObject)newObjectSomeValuesFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_SOME_VALUES_FROM, null, msgs);
			msgs = basicSetObjectSomeValuesFrom(newObjectSomeValuesFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_SOME_VALUES_FROM, newObjectSomeValuesFrom, newObjectSomeValuesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectAllValuesFrom getObjectAllValuesFrom() {
		return objectAllValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectAllValuesFrom(ObjectAllValuesFrom newObjectAllValuesFrom, NotificationChain msgs) {
		ObjectAllValuesFrom oldObjectAllValuesFrom = objectAllValuesFrom;
		objectAllValuesFrom = newObjectAllValuesFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ALL_VALUES_FROM, oldObjectAllValuesFrom, newObjectAllValuesFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectAllValuesFrom(ObjectAllValuesFrom newObjectAllValuesFrom) {
		if (newObjectAllValuesFrom != objectAllValuesFrom) {
			NotificationChain msgs = null;
			if (objectAllValuesFrom != null)
				msgs = ((InternalEObject)objectAllValuesFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ALL_VALUES_FROM, null, msgs);
			if (newObjectAllValuesFrom != null)
				msgs = ((InternalEObject)newObjectAllValuesFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ALL_VALUES_FROM, null, msgs);
			msgs = basicSetObjectAllValuesFrom(newObjectAllValuesFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ALL_VALUES_FROM, newObjectAllValuesFrom, newObjectAllValuesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectHasValue getObjectHasValue() {
		return objectHasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectHasValue(ObjectHasValue newObjectHasValue, NotificationChain msgs) {
		ObjectHasValue oldObjectHasValue = objectHasValue;
		objectHasValue = newObjectHasValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_VALUE, oldObjectHasValue, newObjectHasValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectHasValue(ObjectHasValue newObjectHasValue) {
		if (newObjectHasValue != objectHasValue) {
			NotificationChain msgs = null;
			if (objectHasValue != null)
				msgs = ((InternalEObject)objectHasValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_VALUE, null, msgs);
			if (newObjectHasValue != null)
				msgs = ((InternalEObject)newObjectHasValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_VALUE, null, msgs);
			msgs = basicSetObjectHasValue(newObjectHasValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_VALUE, newObjectHasValue, newObjectHasValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectHasSelf getObjectHasSelf() {
		return objectHasSelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectHasSelf(ObjectHasSelf newObjectHasSelf, NotificationChain msgs) {
		ObjectHasSelf oldObjectHasSelf = objectHasSelf;
		objectHasSelf = newObjectHasSelf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_SELF, oldObjectHasSelf, newObjectHasSelf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectHasSelf(ObjectHasSelf newObjectHasSelf) {
		if (newObjectHasSelf != objectHasSelf) {
			NotificationChain msgs = null;
			if (objectHasSelf != null)
				msgs = ((InternalEObject)objectHasSelf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_SELF, null, msgs);
			if (newObjectHasSelf != null)
				msgs = ((InternalEObject)newObjectHasSelf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_SELF, null, msgs);
			msgs = basicSetObjectHasSelf(newObjectHasSelf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_SELF, newObjectHasSelf, newObjectHasSelf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMinCardinality getObjectMinCardinality() {
		return objectMinCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectMinCardinality(ObjectMinCardinality newObjectMinCardinality, NotificationChain msgs) {
		ObjectMinCardinality oldObjectMinCardinality = objectMinCardinality;
		objectMinCardinality = newObjectMinCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MIN_CARDINALITY, oldObjectMinCardinality, newObjectMinCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectMinCardinality(ObjectMinCardinality newObjectMinCardinality) {
		if (newObjectMinCardinality != objectMinCardinality) {
			NotificationChain msgs = null;
			if (objectMinCardinality != null)
				msgs = ((InternalEObject)objectMinCardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MIN_CARDINALITY, null, msgs);
			if (newObjectMinCardinality != null)
				msgs = ((InternalEObject)newObjectMinCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MIN_CARDINALITY, null, msgs);
			msgs = basicSetObjectMinCardinality(newObjectMinCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MIN_CARDINALITY, newObjectMinCardinality, newObjectMinCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMaxCardinality getObjectMaxCardinality() {
		return objectMaxCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectMaxCardinality(ObjectMaxCardinality newObjectMaxCardinality, NotificationChain msgs) {
		ObjectMaxCardinality oldObjectMaxCardinality = objectMaxCardinality;
		objectMaxCardinality = newObjectMaxCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MAX_CARDINALITY, oldObjectMaxCardinality, newObjectMaxCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectMaxCardinality(ObjectMaxCardinality newObjectMaxCardinality) {
		if (newObjectMaxCardinality != objectMaxCardinality) {
			NotificationChain msgs = null;
			if (objectMaxCardinality != null)
				msgs = ((InternalEObject)objectMaxCardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MAX_CARDINALITY, null, msgs);
			if (newObjectMaxCardinality != null)
				msgs = ((InternalEObject)newObjectMaxCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MAX_CARDINALITY, null, msgs);
			msgs = basicSetObjectMaxCardinality(newObjectMaxCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MAX_CARDINALITY, newObjectMaxCardinality, newObjectMaxCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectExactCardinality getObjectExactCardinality() {
		return objectExactCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectExactCardinality(ObjectExactCardinality newObjectExactCardinality, NotificationChain msgs) {
		ObjectExactCardinality oldObjectExactCardinality = objectExactCardinality;
		objectExactCardinality = newObjectExactCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_EXACT_CARDINALITY, oldObjectExactCardinality, newObjectExactCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectExactCardinality(ObjectExactCardinality newObjectExactCardinality) {
		if (newObjectExactCardinality != objectExactCardinality) {
			NotificationChain msgs = null;
			if (objectExactCardinality != null)
				msgs = ((InternalEObject)objectExactCardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_EXACT_CARDINALITY, null, msgs);
			if (newObjectExactCardinality != null)
				msgs = ((InternalEObject)newObjectExactCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_EXACT_CARDINALITY, null, msgs);
			msgs = basicSetObjectExactCardinality(newObjectExactCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_EXACT_CARDINALITY, newObjectExactCardinality, newObjectExactCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSomeValuesFrom getDataSomeValuesFrom() {
		return dataSomeValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSomeValuesFrom(DataSomeValuesFrom newDataSomeValuesFrom, NotificationChain msgs) {
		DataSomeValuesFrom oldDataSomeValuesFrom = dataSomeValuesFrom;
		dataSomeValuesFrom = newDataSomeValuesFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_SOME_VALUES_FROM, oldDataSomeValuesFrom, newDataSomeValuesFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSomeValuesFrom(DataSomeValuesFrom newDataSomeValuesFrom) {
		if (newDataSomeValuesFrom != dataSomeValuesFrom) {
			NotificationChain msgs = null;
			if (dataSomeValuesFrom != null)
				msgs = ((InternalEObject)dataSomeValuesFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_SOME_VALUES_FROM, null, msgs);
			if (newDataSomeValuesFrom != null)
				msgs = ((InternalEObject)newDataSomeValuesFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_SOME_VALUES_FROM, null, msgs);
			msgs = basicSetDataSomeValuesFrom(newDataSomeValuesFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_SOME_VALUES_FROM, newDataSomeValuesFrom, newDataSomeValuesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAllValuesFrom getDataAllValuesFrom() {
		return dataAllValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataAllValuesFrom(DataAllValuesFrom newDataAllValuesFrom, NotificationChain msgs) {
		DataAllValuesFrom oldDataAllValuesFrom = dataAllValuesFrom;
		dataAllValuesFrom = newDataAllValuesFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_ALL_VALUES_FROM, oldDataAllValuesFrom, newDataAllValuesFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataAllValuesFrom(DataAllValuesFrom newDataAllValuesFrom) {
		if (newDataAllValuesFrom != dataAllValuesFrom) {
			NotificationChain msgs = null;
			if (dataAllValuesFrom != null)
				msgs = ((InternalEObject)dataAllValuesFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_ALL_VALUES_FROM, null, msgs);
			if (newDataAllValuesFrom != null)
				msgs = ((InternalEObject)newDataAllValuesFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_ALL_VALUES_FROM, null, msgs);
			msgs = basicSetDataAllValuesFrom(newDataAllValuesFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_ALL_VALUES_FROM, newDataAllValuesFrom, newDataAllValuesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataHasValue getDataHasValue() {
		return dataHasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataHasValue(DataHasValue newDataHasValue, NotificationChain msgs) {
		DataHasValue oldDataHasValue = dataHasValue;
		dataHasValue = newDataHasValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_HAS_VALUE, oldDataHasValue, newDataHasValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataHasValue(DataHasValue newDataHasValue) {
		if (newDataHasValue != dataHasValue) {
			NotificationChain msgs = null;
			if (dataHasValue != null)
				msgs = ((InternalEObject)dataHasValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_HAS_VALUE, null, msgs);
			if (newDataHasValue != null)
				msgs = ((InternalEObject)newDataHasValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_HAS_VALUE, null, msgs);
			msgs = basicSetDataHasValue(newDataHasValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_HAS_VALUE, newDataHasValue, newDataHasValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMinCardinality getDataMinCardinality() {
		return dataMinCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataMinCardinality(DataMinCardinality newDataMinCardinality, NotificationChain msgs) {
		DataMinCardinality oldDataMinCardinality = dataMinCardinality;
		dataMinCardinality = newDataMinCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MIN_CARDINALITY, oldDataMinCardinality, newDataMinCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataMinCardinality(DataMinCardinality newDataMinCardinality) {
		if (newDataMinCardinality != dataMinCardinality) {
			NotificationChain msgs = null;
			if (dataMinCardinality != null)
				msgs = ((InternalEObject)dataMinCardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MIN_CARDINALITY, null, msgs);
			if (newDataMinCardinality != null)
				msgs = ((InternalEObject)newDataMinCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MIN_CARDINALITY, null, msgs);
			msgs = basicSetDataMinCardinality(newDataMinCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MIN_CARDINALITY, newDataMinCardinality, newDataMinCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMaxCardinality getDataMaxCardinality() {
		return dataMaxCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataMaxCardinality(DataMaxCardinality newDataMaxCardinality, NotificationChain msgs) {
		DataMaxCardinality oldDataMaxCardinality = dataMaxCardinality;
		dataMaxCardinality = newDataMaxCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MAX_CARDINALITY, oldDataMaxCardinality, newDataMaxCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataMaxCardinality(DataMaxCardinality newDataMaxCardinality) {
		if (newDataMaxCardinality != dataMaxCardinality) {
			NotificationChain msgs = null;
			if (dataMaxCardinality != null)
				msgs = ((InternalEObject)dataMaxCardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MAX_CARDINALITY, null, msgs);
			if (newDataMaxCardinality != null)
				msgs = ((InternalEObject)newDataMaxCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MAX_CARDINALITY, null, msgs);
			msgs = basicSetDataMaxCardinality(newDataMaxCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MAX_CARDINALITY, newDataMaxCardinality, newDataMaxCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExactCardinality getDataExactCardinality() {
		return dataExactCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataExactCardinality(DataExactCardinality newDataExactCardinality, NotificationChain msgs) {
		DataExactCardinality oldDataExactCardinality = dataExactCardinality;
		dataExactCardinality = newDataExactCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_EXACT_CARDINALITY, oldDataExactCardinality, newDataExactCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataExactCardinality(DataExactCardinality newDataExactCardinality) {
		if (newDataExactCardinality != dataExactCardinality) {
			NotificationChain msgs = null;
			if (dataExactCardinality != null)
				msgs = ((InternalEObject)dataExactCardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_EXACT_CARDINALITY, null, msgs);
			if (newDataExactCardinality != null)
				msgs = ((InternalEObject)newDataExactCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_EXACT_CARDINALITY, null, msgs);
			msgs = basicSetDataExactCardinality(newDataExactCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_EXACT_CARDINALITY, newDataExactCardinality, newDataExactCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY:
				return basicSetObjectProperty(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INVERSE_OF:
				return basicSetObjectInverseOf(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__CLASS:
				return basicSetClass(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INTERSECTION_OF:
				return basicSetObjectIntersectionOf(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_UNION_OF:
				return basicSetObjectUnionOf(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_COMPLEMENT_OF:
				return basicSetObjectComplementOf(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ONE_OF:
				return basicSetObjectOneOf(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_SOME_VALUES_FROM:
				return basicSetObjectSomeValuesFrom(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ALL_VALUES_FROM:
				return basicSetObjectAllValuesFrom(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_VALUE:
				return basicSetObjectHasValue(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_SELF:
				return basicSetObjectHasSelf(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MIN_CARDINALITY:
				return basicSetObjectMinCardinality(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MAX_CARDINALITY:
				return basicSetObjectMaxCardinality(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_EXACT_CARDINALITY:
				return basicSetObjectExactCardinality(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_SOME_VALUES_FROM:
				return basicSetDataSomeValuesFrom(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_ALL_VALUES_FROM:
				return basicSetDataAllValuesFrom(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_HAS_VALUE:
				return basicSetDataHasValue(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MIN_CARDINALITY:
				return basicSetDataMinCardinality(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MAX_CARDINALITY:
				return basicSetDataMaxCardinality(null, msgs);
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_EXACT_CARDINALITY:
				return basicSetDataExactCardinality(null, msgs);
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
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY:
				return getObjectProperty();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INVERSE_OF:
				return getObjectInverseOf();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__CLASS:
				return getClass_();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INTERSECTION_OF:
				return getObjectIntersectionOf();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_UNION_OF:
				return getObjectUnionOf();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_COMPLEMENT_OF:
				return getObjectComplementOf();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ONE_OF:
				return getObjectOneOf();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_SOME_VALUES_FROM:
				return getObjectSomeValuesFrom();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ALL_VALUES_FROM:
				return getObjectAllValuesFrom();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_VALUE:
				return getObjectHasValue();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_SELF:
				return getObjectHasSelf();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MIN_CARDINALITY:
				return getObjectMinCardinality();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MAX_CARDINALITY:
				return getObjectMaxCardinality();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_EXACT_CARDINALITY:
				return getObjectExactCardinality();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_SOME_VALUES_FROM:
				return getDataSomeValuesFrom();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_ALL_VALUES_FROM:
				return getDataAllValuesFrom();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_HAS_VALUE:
				return getDataHasValue();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MIN_CARDINALITY:
				return getDataMinCardinality();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MAX_CARDINALITY:
				return getDataMaxCardinality();
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_EXACT_CARDINALITY:
				return getDataExactCardinality();
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
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY:
				setObjectProperty((ObjectProperty)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INVERSE_OF:
				setObjectInverseOf((ObjectInverseOf)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__CLASS:
				setClass((org.emftrace.metamodel.OWLModel.Class)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INTERSECTION_OF:
				setObjectIntersectionOf((ObjectIntersectionOf)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_UNION_OF:
				setObjectUnionOf((ObjectUnionOf)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_COMPLEMENT_OF:
				setObjectComplementOf((ObjectComplementOf)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ONE_OF:
				setObjectOneOf((ObjectOneOf)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_SOME_VALUES_FROM:
				setObjectSomeValuesFrom((ObjectSomeValuesFrom)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ALL_VALUES_FROM:
				setObjectAllValuesFrom((ObjectAllValuesFrom)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_VALUE:
				setObjectHasValue((ObjectHasValue)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_SELF:
				setObjectHasSelf((ObjectHasSelf)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MIN_CARDINALITY:
				setObjectMinCardinality((ObjectMinCardinality)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MAX_CARDINALITY:
				setObjectMaxCardinality((ObjectMaxCardinality)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_EXACT_CARDINALITY:
				setObjectExactCardinality((ObjectExactCardinality)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_SOME_VALUES_FROM:
				setDataSomeValuesFrom((DataSomeValuesFrom)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_ALL_VALUES_FROM:
				setDataAllValuesFrom((DataAllValuesFrom)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_HAS_VALUE:
				setDataHasValue((DataHasValue)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MIN_CARDINALITY:
				setDataMinCardinality((DataMinCardinality)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MAX_CARDINALITY:
				setDataMaxCardinality((DataMaxCardinality)newValue);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_EXACT_CARDINALITY:
				setDataExactCardinality((DataExactCardinality)newValue);
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
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY:
				setObjectProperty((ObjectProperty)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INVERSE_OF:
				setObjectInverseOf((ObjectInverseOf)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__CLASS:
				setClass((org.emftrace.metamodel.OWLModel.Class)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INTERSECTION_OF:
				setObjectIntersectionOf((ObjectIntersectionOf)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_UNION_OF:
				setObjectUnionOf((ObjectUnionOf)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_COMPLEMENT_OF:
				setObjectComplementOf((ObjectComplementOf)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ONE_OF:
				setObjectOneOf((ObjectOneOf)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_SOME_VALUES_FROM:
				setObjectSomeValuesFrom((ObjectSomeValuesFrom)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ALL_VALUES_FROM:
				setObjectAllValuesFrom((ObjectAllValuesFrom)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_VALUE:
				setObjectHasValue((ObjectHasValue)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_SELF:
				setObjectHasSelf((ObjectHasSelf)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MIN_CARDINALITY:
				setObjectMinCardinality((ObjectMinCardinality)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MAX_CARDINALITY:
				setObjectMaxCardinality((ObjectMaxCardinality)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_EXACT_CARDINALITY:
				setObjectExactCardinality((ObjectExactCardinality)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_SOME_VALUES_FROM:
				setDataSomeValuesFrom((DataSomeValuesFrom)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_ALL_VALUES_FROM:
				setDataAllValuesFrom((DataAllValuesFrom)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_HAS_VALUE:
				setDataHasValue((DataHasValue)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MIN_CARDINALITY:
				setDataMinCardinality((DataMinCardinality)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MAX_CARDINALITY:
				setDataMaxCardinality((DataMaxCardinality)null);
				return;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_EXACT_CARDINALITY:
				setDataExactCardinality((DataExactCardinality)null);
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
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY:
				return objectProperty != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INVERSE_OF:
				return objectInverseOf != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__CLASS:
				return class_ != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_INTERSECTION_OF:
				return objectIntersectionOf != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_UNION_OF:
				return objectUnionOf != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_COMPLEMENT_OF:
				return objectComplementOf != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ONE_OF:
				return objectOneOf != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_SOME_VALUES_FROM:
				return objectSomeValuesFrom != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_ALL_VALUES_FROM:
				return objectAllValuesFrom != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_VALUE:
				return objectHasValue != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_HAS_SELF:
				return objectHasSelf != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MIN_CARDINALITY:
				return objectMinCardinality != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_MAX_CARDINALITY:
				return objectMaxCardinality != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_EXACT_CARDINALITY:
				return objectExactCardinality != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_SOME_VALUES_FROM:
				return dataSomeValuesFrom != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_ALL_VALUES_FROM:
				return dataAllValuesFrom != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_HAS_VALUE:
				return dataHasValue != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MIN_CARDINALITY:
				return dataMinCardinality != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_MAX_CARDINALITY:
				return dataMaxCardinality != null;
			case OWLModelPackage.OBJECT_PROPERTY_DOMAIN__DATA_EXACT_CARDINALITY:
				return dataExactCardinality != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectPropertyDomainImpl
