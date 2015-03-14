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

import org.emftrace.metamodel.OWLModel.DataComplementOf;
import org.emftrace.metamodel.OWLModel.DataIntersectionOf;
import org.emftrace.metamodel.OWLModel.DataOneOf;
import org.emftrace.metamodel.OWLModel.DataUnionOf;
import org.emftrace.metamodel.OWLModel.Datatype;
import org.emftrace.metamodel.OWLModel.DatatypeRestriction;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Union Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataUnionOfImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataUnionOfImpl#getDataIntersectionOf <em>Data Intersection Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataUnionOfImpl#getDataUnionOf <em>Data Union Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataUnionOfImpl#getDataComplementOf <em>Data Complement Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataUnionOfImpl#getDataOneOf <em>Data One Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataUnionOfImpl#getDatatypeRestriction <em>Datatype Restriction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataUnionOfImpl extends DataRangeImpl implements DataUnionOf {
	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected EList<Datatype> datatype;

	/**
	 * The cached value of the '{@link #getDataIntersectionOf() <em>Data Intersection Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataIntersectionOf()
	 * @generated
	 * @ordered
	 */
	protected EList<DataIntersectionOf> dataIntersectionOf;

	/**
	 * The cached value of the '{@link #getDataUnionOf() <em>Data Union Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataUnionOf()
	 * @generated
	 * @ordered
	 */
	protected EList<DataUnionOf> dataUnionOf;

	/**
	 * The cached value of the '{@link #getDataComplementOf() <em>Data Complement Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataComplementOf()
	 * @generated
	 * @ordered
	 */
	protected EList<DataComplementOf> dataComplementOf;

	/**
	 * The cached value of the '{@link #getDataOneOf() <em>Data One Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOneOf()
	 * @generated
	 * @ordered
	 */
	protected EList<DataOneOf> dataOneOf;

	/**
	 * The cached value of the '{@link #getDatatypeRestriction() <em>Datatype Restriction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypeRestriction()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeRestriction> datatypeRestriction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataUnionOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getDataUnionOf();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Datatype> getDatatype() {
		if (datatype == null) {
			datatype = new EObjectContainmentEList<Datatype>(Datatype.class, this, OWLModelPackage.DATA_UNION_OF__DATATYPE);
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataIntersectionOf> getDataIntersectionOf() {
		if (dataIntersectionOf == null) {
			dataIntersectionOf = new EObjectContainmentEList<DataIntersectionOf>(DataIntersectionOf.class, this, OWLModelPackage.DATA_UNION_OF__DATA_INTERSECTION_OF);
		}
		return dataIntersectionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataUnionOf> getDataUnionOf() {
		if (dataUnionOf == null) {
			dataUnionOf = new EObjectContainmentEList<DataUnionOf>(DataUnionOf.class, this, OWLModelPackage.DATA_UNION_OF__DATA_UNION_OF);
		}
		return dataUnionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataComplementOf> getDataComplementOf() {
		if (dataComplementOf == null) {
			dataComplementOf = new EObjectContainmentEList<DataComplementOf>(DataComplementOf.class, this, OWLModelPackage.DATA_UNION_OF__DATA_COMPLEMENT_OF);
		}
		return dataComplementOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataOneOf> getDataOneOf() {
		if (dataOneOf == null) {
			dataOneOf = new EObjectContainmentEList<DataOneOf>(DataOneOf.class, this, OWLModelPackage.DATA_UNION_OF__DATA_ONE_OF);
		}
		return dataOneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeRestriction> getDatatypeRestriction() {
		if (datatypeRestriction == null) {
			datatypeRestriction = new EObjectContainmentEList<DatatypeRestriction>(DatatypeRestriction.class, this, OWLModelPackage.DATA_UNION_OF__DATATYPE_RESTRICTION);
		}
		return datatypeRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.DATA_UNION_OF__DATATYPE:
				return ((InternalEList<?>)getDatatype()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DATA_UNION_OF__DATA_INTERSECTION_OF:
				return ((InternalEList<?>)getDataIntersectionOf()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DATA_UNION_OF__DATA_UNION_OF:
				return ((InternalEList<?>)getDataUnionOf()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DATA_UNION_OF__DATA_COMPLEMENT_OF:
				return ((InternalEList<?>)getDataComplementOf()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DATA_UNION_OF__DATA_ONE_OF:
				return ((InternalEList<?>)getDataOneOf()).basicRemove(otherEnd, msgs);
			case OWLModelPackage.DATA_UNION_OF__DATATYPE_RESTRICTION:
				return ((InternalEList<?>)getDatatypeRestriction()).basicRemove(otherEnd, msgs);
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
			case OWLModelPackage.DATA_UNION_OF__DATATYPE:
				return getDatatype();
			case OWLModelPackage.DATA_UNION_OF__DATA_INTERSECTION_OF:
				return getDataIntersectionOf();
			case OWLModelPackage.DATA_UNION_OF__DATA_UNION_OF:
				return getDataUnionOf();
			case OWLModelPackage.DATA_UNION_OF__DATA_COMPLEMENT_OF:
				return getDataComplementOf();
			case OWLModelPackage.DATA_UNION_OF__DATA_ONE_OF:
				return getDataOneOf();
			case OWLModelPackage.DATA_UNION_OF__DATATYPE_RESTRICTION:
				return getDatatypeRestriction();
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
			case OWLModelPackage.DATA_UNION_OF__DATATYPE:
				getDatatype().clear();
				getDatatype().addAll((Collection<? extends Datatype>)newValue);
				return;
			case OWLModelPackage.DATA_UNION_OF__DATA_INTERSECTION_OF:
				getDataIntersectionOf().clear();
				getDataIntersectionOf().addAll((Collection<? extends DataIntersectionOf>)newValue);
				return;
			case OWLModelPackage.DATA_UNION_OF__DATA_UNION_OF:
				getDataUnionOf().clear();
				getDataUnionOf().addAll((Collection<? extends DataUnionOf>)newValue);
				return;
			case OWLModelPackage.DATA_UNION_OF__DATA_COMPLEMENT_OF:
				getDataComplementOf().clear();
				getDataComplementOf().addAll((Collection<? extends DataComplementOf>)newValue);
				return;
			case OWLModelPackage.DATA_UNION_OF__DATA_ONE_OF:
				getDataOneOf().clear();
				getDataOneOf().addAll((Collection<? extends DataOneOf>)newValue);
				return;
			case OWLModelPackage.DATA_UNION_OF__DATATYPE_RESTRICTION:
				getDatatypeRestriction().clear();
				getDatatypeRestriction().addAll((Collection<? extends DatatypeRestriction>)newValue);
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
			case OWLModelPackage.DATA_UNION_OF__DATATYPE:
				getDatatype().clear();
				return;
			case OWLModelPackage.DATA_UNION_OF__DATA_INTERSECTION_OF:
				getDataIntersectionOf().clear();
				return;
			case OWLModelPackage.DATA_UNION_OF__DATA_UNION_OF:
				getDataUnionOf().clear();
				return;
			case OWLModelPackage.DATA_UNION_OF__DATA_COMPLEMENT_OF:
				getDataComplementOf().clear();
				return;
			case OWLModelPackage.DATA_UNION_OF__DATA_ONE_OF:
				getDataOneOf().clear();
				return;
			case OWLModelPackage.DATA_UNION_OF__DATATYPE_RESTRICTION:
				getDatatypeRestriction().clear();
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
			case OWLModelPackage.DATA_UNION_OF__DATATYPE:
				return datatype != null && !datatype.isEmpty();
			case OWLModelPackage.DATA_UNION_OF__DATA_INTERSECTION_OF:
				return dataIntersectionOf != null && !dataIntersectionOf.isEmpty();
			case OWLModelPackage.DATA_UNION_OF__DATA_UNION_OF:
				return dataUnionOf != null && !dataUnionOf.isEmpty();
			case OWLModelPackage.DATA_UNION_OF__DATA_COMPLEMENT_OF:
				return dataComplementOf != null && !dataComplementOf.isEmpty();
			case OWLModelPackage.DATA_UNION_OF__DATA_ONE_OF:
				return dataOneOf != null && !dataOneOf.isEmpty();
			case OWLModelPackage.DATA_UNION_OF__DATATYPE_RESTRICTION:
				return datatypeRestriction != null && !datatypeRestriction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataUnionOfImpl
