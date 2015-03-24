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

import org.emftrace.metamodel.OWLModel.Datatype;
import org.emftrace.metamodel.OWLModel.DatatypeRestriction;
import org.emftrace.metamodel.OWLModel.FacetRestriction;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DatatypeRestrictionImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DatatypeRestrictionImpl#getFacetRestriction <em>Facet Restriction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeRestrictionImpl extends DataRangeImpl implements DatatypeRestriction {
	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected Datatype datatype;

	/**
	 * The cached value of the '{@link #getFacetRestriction() <em>Facet Restriction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacetRestriction()
	 * @generated
	 * @ordered
	 */
	protected EList<FacetRestriction> facetRestriction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getDatatypeRestriction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype getDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatype(Datatype newDatatype, NotificationChain msgs) {
		Datatype oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATATYPE_RESTRICTION__DATATYPE, oldDatatype, newDatatype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(Datatype newDatatype) {
		if (newDatatype != datatype) {
			NotificationChain msgs = null;
			if (datatype != null)
				msgs = ((InternalEObject)datatype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATATYPE_RESTRICTION__DATATYPE, null, msgs);
			if (newDatatype != null)
				msgs = ((InternalEObject)newDatatype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATATYPE_RESTRICTION__DATATYPE, null, msgs);
			msgs = basicSetDatatype(newDatatype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATATYPE_RESTRICTION__DATATYPE, newDatatype, newDatatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacetRestriction> getFacetRestriction() {
		if (facetRestriction == null) {
			facetRestriction = new EObjectContainmentEList<FacetRestriction>(FacetRestriction.class, this, OWLModelPackage.DATATYPE_RESTRICTION__FACET_RESTRICTION);
		}
		return facetRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.DATATYPE_RESTRICTION__DATATYPE:
				return basicSetDatatype(null, msgs);
			case OWLModelPackage.DATATYPE_RESTRICTION__FACET_RESTRICTION:
				return ((InternalEList<?>)getFacetRestriction()).basicRemove(otherEnd, msgs);
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
			case OWLModelPackage.DATATYPE_RESTRICTION__DATATYPE:
				return getDatatype();
			case OWLModelPackage.DATATYPE_RESTRICTION__FACET_RESTRICTION:
				return getFacetRestriction();
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
			case OWLModelPackage.DATATYPE_RESTRICTION__DATATYPE:
				setDatatype((Datatype)newValue);
				return;
			case OWLModelPackage.DATATYPE_RESTRICTION__FACET_RESTRICTION:
				getFacetRestriction().clear();
				getFacetRestriction().addAll((Collection<? extends FacetRestriction>)newValue);
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
			case OWLModelPackage.DATATYPE_RESTRICTION__DATATYPE:
				setDatatype((Datatype)null);
				return;
			case OWLModelPackage.DATATYPE_RESTRICTION__FACET_RESTRICTION:
				getFacetRestriction().clear();
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
			case OWLModelPackage.DATATYPE_RESTRICTION__DATATYPE:
				return datatype != null;
			case OWLModelPackage.DATATYPE_RESTRICTION__FACET_RESTRICTION:
				return facetRestriction != null && !facetRestriction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatatypeRestrictionImpl
