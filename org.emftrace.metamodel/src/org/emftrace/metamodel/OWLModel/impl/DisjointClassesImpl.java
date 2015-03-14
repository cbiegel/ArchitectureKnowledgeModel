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

import org.emftrace.metamodel.OWLModel.DataAllValuesFrom;
import org.emftrace.metamodel.OWLModel.DataExactCardinality;
import org.emftrace.metamodel.OWLModel.DataHasValue;
import org.emftrace.metamodel.OWLModel.DataMaxCardinality;
import org.emftrace.metamodel.OWLModel.DataMinCardinality;
import org.emftrace.metamodel.OWLModel.DataSomeValuesFrom;
import org.emftrace.metamodel.OWLModel.DisjointClasses;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;
import org.emftrace.metamodel.OWLModel.ObjectAllValuesFrom;
import org.emftrace.metamodel.OWLModel.ObjectComplementOf;
import org.emftrace.metamodel.OWLModel.ObjectExactCardinality;
import org.emftrace.metamodel.OWLModel.ObjectHasSelf;
import org.emftrace.metamodel.OWLModel.ObjectHasValue;
import org.emftrace.metamodel.OWLModel.ObjectIntersectionOf;
import org.emftrace.metamodel.OWLModel.ObjectMaxCardinality;
import org.emftrace.metamodel.OWLModel.ObjectMinCardinality;
import org.emftrace.metamodel.OWLModel.ObjectOneOf;
import org.emftrace.metamodel.OWLModel.ObjectSomeValuesFrom;
import org.emftrace.metamodel.OWLModel.ObjectUnionOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disjoint Classes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getObjectIntersectionOf <em>Object Intersection Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getObjectUnionOf <em>Object Union Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getObjectComplementOf <em>Object Complement Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getObjectOneOf <em>Object One Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getObjectSomeValuesFrom <em>Object Some Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getObjectAllValuesFrom <em>Object All Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getObjectHasValue <em>Object Has Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getObjectHasSelf <em>Object Has Self</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getObjectMinCardinality <em>Object Min Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getObjectMaxCardinality <em>Object Max Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getObjectExactCardinality <em>Object Exact Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getDataSomeValuesFrom <em>Data Some Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getDataAllValuesFrom <em>Data All Values From</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getDataHasValue <em>Data Has Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getDataMinCardinality <em>Data Min Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getDataMaxCardinality <em>Data Max Cardinality</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DisjointClassesImpl#getDataExactCardinality <em>Data Exact Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisjointClassesImpl extends ClassAxiomImpl implements DisjointClasses {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<org.emftrace.metamodel.OWLModel.Class> class_;

	/**
	 * The cached value of the '{@link #getObjectIntersectionOf() <em>Object Intersection Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectIntersectionOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectIntersectionOf> objectIntersectionOf;

	/**
	 * The cached value of the '{@link #getObjectUnionOf() <em>Object Union Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectUnionOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectUnionOf> objectUnionOf;

	/**
	 * The cached value of the '{@link #getObjectComplementOf() <em>Object Complement Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectComplementOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectComplementOf> objectComplementOf;

	/**
	 * The cached value of the '{@link #getObjectOneOf() <em>Object One Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectOneOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectOneOf> objectOneOf;

	/**
	 * The cached value of the '{@link #getObjectSomeValuesFrom() <em>Object Some Values From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectSomeValuesFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectSomeValuesFrom> objectSomeValuesFrom;

	/**
	 * The cached value of the '{@link #getObjectAllValuesFrom() <em>Object All Values From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectAllValuesFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectAllValuesFrom> objectAllValuesFrom;

	/**
	 * The cached value of the '{@link #getObjectHasValue() <em>Object Has Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectHasValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectHasValue> objectHasValue;

	/**
	 * The cached value of the '{@link #getObjectHasSelf() <em>Object Has Self</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectHasSelf()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectHasSelf> objectHasSelf;

	/**
	 * The cached value of the '{@link #getObjectMinCardinality() <em>Object Min Cardinality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectMinCardinality()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectMinCardinality> objectMinCardinality;

	/**
	 * The cached value of the '{@link #getObjectMaxCardinality() <em>Object Max Cardinality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectMaxCardinality()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectMaxCardinality> objectMaxCardinality;

	/**
	 * The cached value of the '{@link #getObjectExactCardinality() <em>Object Exact Cardinality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectExactCardinality()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectExactCardinality> objectExactCardinality;

	/**
	 * The cached value of the '{@link #getDataSomeValuesFrom() <em>Data Some Values From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSomeValuesFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSomeValuesFrom> dataSomeValuesFrom;

	/**
	 * The cached value of the '{@link #getDataAllValuesFrom() <em>Data All Values From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAllValuesFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<DataAllValuesFrom> dataAllValuesFrom;

	/**
	 * The cached value of the '{@link #getDataHasValue() <em>Data Has Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataHasValue()
	 * @generated
	 * @ordered
	 */
	protected EList<DataHasValue> dataHasValue;

	/**
	 * The cached value of the '{@link #getDataMinCardinality() <em>Data Min Cardinality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMinCardinality()
	 * @generated
	 * @ordered
	 */
	protected EList<DataMinCardinality> dataMinCardinality;

	/**
	 * The cached value of the '{@link #getDataMaxCardinality() <em>Data Max Cardinality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMaxCardinality()
	 * @generated
	 * @ordered
	 */
	protected EList<DataMaxCardinality> dataMaxCardinality;

	/**
	 * The cached value of the '{@link #getDataExactCardinality() <em>Data Exact Cardinality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataExactCardinality()
	 * @generated
	 * @ordered
	 */
	protected EList<DataExactCardinality> dataExactCardinality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisjointClassesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getDisjointClasses();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.emftrace.metamodel.OWLModel.Class> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<org.emftrace.metamodel.OWLModel.Class>(org.emftrace.metamodel.OWLModel.Class.class, this, OWLModelPackage.DISJOINT_CLASSES__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectIntersectionOf> getObjectIntersectionOf() {
		if (objectIntersectionOf == null) {
			objectIntersectionOf = new EObjectContainmentEList<ObjectIntersectionOf>(ObjectIntersectionOf.class, this, OWLModelPackage.DISJOINT_CLASSES__OBJECT_INTERSECTION_OF);
		}
		return objectIntersectionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectUnionOf> getObjectUnionOf() {
		if (objectUnionOf == null) {
			objectUnionOf = new EObjectContainmentEList<ObjectUnionOf>(ObjectUnionOf.class, this, OWLModelPackage.DISJOINT_CLASSES__OBJECT_UNION_OF);
		}
		return objectUnionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectComplementOf> getObjectComplementOf() {
		if (objectComplementOf == null) {
			objectComplementOf = new EObjectContainmentEList<ObjectComplementOf>(ObjectComplementOf.class, this, OWLModelPackage.DISJOINT_CLASSES__OBJECT_COMPLEMENT_OF);
		}
		return objectComplementOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectOneOf> getObjectOneOf() {
		if (objectOneOf == null) {
			objectOneOf = new EObjectContainmentEList<ObjectOneOf>(ObjectOneOf.class, this, OWLModelPackage.DISJOINT_CLASSES__OBJECT_ONE_OF);
		}
		return objectOneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectSomeValuesFrom> getObjectSomeValuesFrom() {
		if (objectSomeValuesFrom == null) {
			objectSomeValuesFrom = new EObjectContainmentEList<ObjectSomeValuesFrom>(ObjectSomeValuesFrom.class, this, OWLModelPackage.DISJOINT_CLASSES__OBJECT_SOME_VALUES_FROM);
		}
		return objectSomeValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectAllValuesFrom> getObjectAllValuesFrom() {
		if (objectAllValuesFrom == null) {
			objectAllValuesFrom = new EObjectContainmentEList<ObjectAllValuesFrom>(ObjectAllValuesFrom.class, this, OWLModelPackage.DISJOINT_CLASSES__OBJECT_ALL_VALUES_FROM);
		}
		return objectAllValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectHasValue> getObjectHasValue() {
		if (objectHasValue == null) {
			objectHasValue = new EObjectContainmentEList<ObjectHasValue>(ObjectHasValue.class, this, OWLModelPackage.DISJOINT_CLASSES__OBJECT_HAS_VALUE);
		}
		return objectHasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectHasSelf> getObjectHasSelf() {
		if (objectHasSelf == null) {
			objectHasSelf = new EObjectContainmentEList<ObjectHasSelf>(ObjectHasSelf.class, this, OWLModelPackage.DISJOINT_CLASSES__OBJECT_HAS_SELF);
		}
		return objectHasSelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectMinCardinality> getObjectMinCardinality() {
		if (objectMinCardinality == null) {
			objectMinCardinality = new EObjectContainmentEList<ObjectMinCardinality>(ObjectMinCardinality.class, this, OWLModelPackage.DISJOINT_CLASSES__OBJECT_MIN_CARDINALITY);
		}
		return objectMinCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectMaxCardinality> getObjectMaxCardinality() {
		if (objectMaxCardinality == null) {
			objectMaxCardinality = new EObjectContainmentEList<ObjectMaxCardinality>(ObjectMaxCardinality.class, this, OWLModelPackage.DISJOINT_CLASSES__OBJECT_MAX_CARDINALITY);
		}
		return objectMaxCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectExactCardinality> getObjectExactCardinality() {
		if (objectExactCardinality == null) {
			objectExactCardinality = new EObjectContainmentEList<ObjectExactCardinality>(ObjectExactCardinality.class, this, OWLModelPackage.DISJOINT_CLASSES__OBJECT_EXACT_CARDINALITY);
		}
		return objectExactCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSomeValuesFrom> getDataSomeValuesFrom() {
		if (dataSomeValuesFrom == null) {
			dataSomeValuesFrom = new EObjectContainmentEList<DataSomeValuesFrom>(DataSomeValuesFrom.class, this, OWLModelPackage.DISJOINT_CLASSES__DATA_SOME_VALUES_FROM);
		}
		return dataSomeValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataAllValuesFrom> getDataAllValuesFrom() {
		if (dataAllValuesFrom == null) {
			dataAllValuesFrom = new EObjectContainmentEList<DataAllValuesFrom>(DataAllValuesFrom.class, this, OWLModelPackage.DISJOINT_CLASSES__DATA_ALL_VALUES_FROM);
		}
		return dataAllValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataHasValue> getDataHasValue() {
		if (dataHasValue == null) {
			dataHasValue = new EObjectContainmentEList<DataHasValue>(DataHasValue.class, this, OWLModelPackage.DISJOINT_CLASSES__DATA_HAS_VALUE);
		}
		return dataHasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataMinCardinality> getDataMinCardinality() {
		if (dataMinCardinality == null) {
			dataMinCardinality = new EObjectContainmentEList<DataMinCardinality>(DataMinCardinality.class, this, OWLModelPackage.DISJOINT_CLASSES__DATA_MIN_CARDINALITY);
		}
		return dataMinCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataMaxCardinality> getDataMaxCardinality() {
		if (dataMaxCardinality == null) {
			dataMaxCardinality = new EObjectContainmentEList<DataMaxCardinality>(DataMaxCardinality.class, this, OWLModelPackage.DISJOINT_CLASSES__DATA_MAX_CARDINALITY);
		}
		return dataMaxCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataExactCardinality> getDataExactCardinality() {
		if (dataExactCardinality == null) {
			dataExactCardinality = new EObjectContainmentEList<DataExactCardinality>(DataExactCardinality.class, this, OWLModelPackage.DISJOINT_CLASSES__DATA_EXACT_CARDINALITY);
		}
		return dataExactCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.DISJOINT_CLASSES__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_INTERSECTION_OF:
				return ((InternalEList<?>)getObjectIntersectionOf()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_UNION_OF:
				return ((InternalEList<?>)getObjectUnionOf()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_COMPLEMENT_OF:
				return ((InternalEList<?>)getObjectComplementOf()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_ONE_OF:
				return ((InternalEList<?>)getObjectOneOf()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_SOME_VALUES_FROM:
				return ((InternalEList<?>)getObjectSomeValuesFrom()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_ALL_VALUES_FROM:
				return ((InternalEList<?>)getObjectAllValuesFrom()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_HAS_VALUE:
				return ((InternalEList<?>)getObjectHasValue()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_HAS_SELF:
				return ((InternalEList<?>)getObjectHasSelf()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_MIN_CARDINALITY:
				return ((InternalEList<?>)getObjectMinCardinality()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_MAX_CARDINALITY:
				return ((InternalEList<?>)getObjectMaxCardinality()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_EXACT_CARDINALITY:
				return ((InternalEList<?>)getObjectExactCardinality()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DISJOINT_CLASSES__DATA_SOME_VALUES_FROM:
				return ((InternalEList<?>)getDataSomeValuesFrom()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DISJOINT_CLASSES__DATA_ALL_VALUES_FROM:
				return ((InternalEList<?>)getDataAllValuesFrom()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DISJOINT_CLASSES__DATA_HAS_VALUE:
				return ((InternalEList<?>)getDataHasValue()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DISJOINT_CLASSES__DATA_MIN_CARDINALITY:
				return ((InternalEList<?>)getDataMinCardinality()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DISJOINT_CLASSES__DATA_MAX_CARDINALITY:
				return ((InternalEList<?>)getDataMaxCardinality()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DISJOINT_CLASSES__DATA_EXACT_CARDINALITY:
				return ((InternalEList<?>)getDataExactCardinality()).basicRemove(otherEnd, msgs);
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
			case OWLModelPackage.DISJOINT_CLASSES__CLASS:
				return getClass_();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_INTERSECTION_OF:
				return getObjectIntersectionOf();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_UNION_OF:
				return getObjectUnionOf();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_COMPLEMENT_OF:
				return getObjectComplementOf();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_ONE_OF:
				return getObjectOneOf();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_SOME_VALUES_FROM:
				return getObjectSomeValuesFrom();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_ALL_VALUES_FROM:
				return getObjectAllValuesFrom();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_HAS_VALUE:
				return getObjectHasValue();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_HAS_SELF:
				return getObjectHasSelf();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_MIN_CARDINALITY:
				return getObjectMinCardinality();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_MAX_CARDINALITY:
				return getObjectMaxCardinality();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_EXACT_CARDINALITY:
				return getObjectExactCardinality();
			case OWLModelPackage.DISJOINT_CLASSES__DATA_SOME_VALUES_FROM:
				return getDataSomeValuesFrom();
			case OWLModelPackage.DISJOINT_CLASSES__DATA_ALL_VALUES_FROM:
				return getDataAllValuesFrom();
			case OWLModelPackage.DISJOINT_CLASSES__DATA_HAS_VALUE:
				return getDataHasValue();
			case OWLModelPackage.DISJOINT_CLASSES__DATA_MIN_CARDINALITY:
				return getDataMinCardinality();
			case OWLModelPackage.DISJOINT_CLASSES__DATA_MAX_CARDINALITY:
				return getDataMaxCardinality();
			case OWLModelPackage.DISJOINT_CLASSES__DATA_EXACT_CARDINALITY:
				return getDataExactCardinality();
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
			case OWLModelPackage.DISJOINT_CLASSES__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends org.emftrace.metamodel.OWLModel.Class>)newValue);
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_INTERSECTION_OF:
				getObjectIntersectionOf().clear();
				getObjectIntersectionOf().addAll((Collection<? extends ObjectIntersectionOf>)newValue);
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_UNION_OF:
				getObjectUnionOf().clear();
				getObjectUnionOf().addAll((Collection<? extends ObjectUnionOf>)newValue);
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_COMPLEMENT_OF:
				getObjectComplementOf().clear();
				getObjectComplementOf().addAll((Collection<? extends ObjectComplementOf>)newValue);
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_ONE_OF:
				getObjectOneOf().clear();
				getObjectOneOf().addAll((Collection<? extends ObjectOneOf>)newValue);
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_SOME_VALUES_FROM:
				getObjectSomeValuesFrom().clear();
				getObjectSomeValuesFrom().addAll((Collection<? extends ObjectSomeValuesFrom>)newValue);
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_ALL_VALUES_FROM:
				getObjectAllValuesFrom().clear();
				getObjectAllValuesFrom().addAll((Collection<? extends ObjectAllValuesFrom>)newValue);
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_HAS_VALUE:
				getObjectHasValue().clear();
				getObjectHasValue().addAll((Collection<? extends ObjectHasValue>)newValue);
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_HAS_SELF:
				getObjectHasSelf().clear();
				getObjectHasSelf().addAll((Collection<? extends ObjectHasSelf>)newValue);
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_MIN_CARDINALITY:
				getObjectMinCardinality().clear();
				getObjectMinCardinality().addAll((Collection<? extends ObjectMinCardinality>)newValue);
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_MAX_CARDINALITY:
				getObjectMaxCardinality().clear();
				getObjectMaxCardinality().addAll((Collection<? extends ObjectMaxCardinality>)newValue);
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_EXACT_CARDINALITY:
				getObjectExactCardinality().clear();
				getObjectExactCardinality().addAll((Collection<? extends ObjectExactCardinality>)newValue);
				return;
			case OWLModelPackage.DISJOINT_CLASSES__DATA_SOME_VALUES_FROM:
				getDataSomeValuesFrom().clear();
				getDataSomeValuesFrom().addAll((Collection<? extends DataSomeValuesFrom>)newValue);
				return;
			case OWLModelPackage.DISJOINT_CLASSES__DATA_ALL_VALUES_FROM:
				getDataAllValuesFrom().clear();
				getDataAllValuesFrom().addAll((Collection<? extends DataAllValuesFrom>)newValue);
				return;
			case OWLModelPackage.DISJOINT_CLASSES__DATA_HAS_VALUE:
				getDataHasValue().clear();
				getDataHasValue().addAll((Collection<? extends DataHasValue>)newValue);
				return;
			case OWLModelPackage.DISJOINT_CLASSES__DATA_MIN_CARDINALITY:
				getDataMinCardinality().clear();
				getDataMinCardinality().addAll((Collection<? extends DataMinCardinality>)newValue);
				return;
			case OWLModelPackage.DISJOINT_CLASSES__DATA_MAX_CARDINALITY:
				getDataMaxCardinality().clear();
				getDataMaxCardinality().addAll((Collection<? extends DataMaxCardinality>)newValue);
				return;
			case OWLModelPackage.DISJOINT_CLASSES__DATA_EXACT_CARDINALITY:
				getDataExactCardinality().clear();
				getDataExactCardinality().addAll((Collection<? extends DataExactCardinality>)newValue);
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
			case OWLModelPackage.DISJOINT_CLASSES__CLASS:
				getClass_().clear();
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_INTERSECTION_OF:
				getObjectIntersectionOf().clear();
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_UNION_OF:
				getObjectUnionOf().clear();
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_COMPLEMENT_OF:
				getObjectComplementOf().clear();
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_ONE_OF:
				getObjectOneOf().clear();
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_SOME_VALUES_FROM:
				getObjectSomeValuesFrom().clear();
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_ALL_VALUES_FROM:
				getObjectAllValuesFrom().clear();
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_HAS_VALUE:
				getObjectHasValue().clear();
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_HAS_SELF:
				getObjectHasSelf().clear();
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_MIN_CARDINALITY:
				getObjectMinCardinality().clear();
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_MAX_CARDINALITY:
				getObjectMaxCardinality().clear();
				return;
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_EXACT_CARDINALITY:
				getObjectExactCardinality().clear();
				return;
			case OWLModelPackage.DISJOINT_CLASSES__DATA_SOME_VALUES_FROM:
				getDataSomeValuesFrom().clear();
				return;
			case OWLModelPackage.DISJOINT_CLASSES__DATA_ALL_VALUES_FROM:
				getDataAllValuesFrom().clear();
				return;
			case OWLModelPackage.DISJOINT_CLASSES__DATA_HAS_VALUE:
				getDataHasValue().clear();
				return;
			case OWLModelPackage.DISJOINT_CLASSES__DATA_MIN_CARDINALITY:
				getDataMinCardinality().clear();
				return;
			case OWLModelPackage.DISJOINT_CLASSES__DATA_MAX_CARDINALITY:
				getDataMaxCardinality().clear();
				return;
			case OWLModelPackage.DISJOINT_CLASSES__DATA_EXACT_CARDINALITY:
				getDataExactCardinality().clear();
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
			case OWLModelPackage.DISJOINT_CLASSES__CLASS:
				return class_ != null && !class_.isEmpty();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_INTERSECTION_OF:
				return objectIntersectionOf != null && !objectIntersectionOf.isEmpty();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_UNION_OF:
				return objectUnionOf != null && !objectUnionOf.isEmpty();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_COMPLEMENT_OF:
				return objectComplementOf != null && !objectComplementOf.isEmpty();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_ONE_OF:
				return objectOneOf != null && !objectOneOf.isEmpty();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_SOME_VALUES_FROM:
				return objectSomeValuesFrom != null && !objectSomeValuesFrom.isEmpty();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_ALL_VALUES_FROM:
				return objectAllValuesFrom != null && !objectAllValuesFrom.isEmpty();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_HAS_VALUE:
				return objectHasValue != null && !objectHasValue.isEmpty();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_HAS_SELF:
				return objectHasSelf != null && !objectHasSelf.isEmpty();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_MIN_CARDINALITY:
				return objectMinCardinality != null && !objectMinCardinality.isEmpty();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_MAX_CARDINALITY:
				return objectMaxCardinality != null && !objectMaxCardinality.isEmpty();
			case OWLModelPackage.DISJOINT_CLASSES__OBJECT_EXACT_CARDINALITY:
				return objectExactCardinality != null && !objectExactCardinality.isEmpty();
			case OWLModelPackage.DISJOINT_CLASSES__DATA_SOME_VALUES_FROM:
				return dataSomeValuesFrom != null && !dataSomeValuesFrom.isEmpty();
			case OWLModelPackage.DISJOINT_CLASSES__DATA_ALL_VALUES_FROM:
				return dataAllValuesFrom != null && !dataAllValuesFrom.isEmpty();
			case OWLModelPackage.DISJOINT_CLASSES__DATA_HAS_VALUE:
				return dataHasValue != null && !dataHasValue.isEmpty();
			case OWLModelPackage.DISJOINT_CLASSES__DATA_MIN_CARDINALITY:
				return dataMinCardinality != null && !dataMinCardinality.isEmpty();
			case OWLModelPackage.DISJOINT_CLASSES__DATA_MAX_CARDINALITY:
				return dataMaxCardinality != null && !dataMaxCardinality.isEmpty();
			case OWLModelPackage.DISJOINT_CLASSES__DATA_EXACT_CARDINALITY:
				return dataExactCardinality != null && !dataExactCardinality.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DisjointClassesImpl
