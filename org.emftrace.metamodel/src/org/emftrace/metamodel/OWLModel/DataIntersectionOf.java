/**
 */
package org.emftrace.metamodel.OWLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Intersection Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DataIntersectionOf#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DataIntersectionOf#getDataIntersectionOf <em>Data Intersection Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DataIntersectionOf#getDataUnionOf <em>Data Union Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DataIntersectionOf#getDataComplementOf <em>Data Complement Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DataIntersectionOf#getDataOneOf <em>Data One Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DataIntersectionOf#getDatatypeRestriction <em>Datatype Restriction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataIntersectionOf()
 * @model
 * @generated
 */
public interface DataIntersectionOf extends DataRange {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.Datatype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataIntersectionOf_Datatype()
	 * @model containment="true"
	 * @generated
	 */
	EList<Datatype> getDatatype();

	/**
	 * Returns the value of the '<em><b>Data Intersection Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.DataIntersectionOf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Intersection Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Intersection Of</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataIntersectionOf_DataIntersectionOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataIntersectionOf> getDataIntersectionOf();

	/**
	 * Returns the value of the '<em><b>Data Union Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.DataUnionOf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Union Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Union Of</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataIntersectionOf_DataUnionOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataUnionOf> getDataUnionOf();

	/**
	 * Returns the value of the '<em><b>Data Complement Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.DataComplementOf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Complement Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Complement Of</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataIntersectionOf_DataComplementOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataComplementOf> getDataComplementOf();

	/**
	 * Returns the value of the '<em><b>Data One Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.DataOneOf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data One Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data One Of</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataIntersectionOf_DataOneOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataOneOf> getDataOneOf();

	/**
	 * Returns the value of the '<em><b>Datatype Restriction</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.DatatypeRestriction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype Restriction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype Restriction</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataIntersectionOf_DatatypeRestriction()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatatypeRestriction> getDatatypeRestriction();

} // DataIntersectionOf
