/**
 */
package org.emftrace.metamodel.OWLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DataPropertyRange#getDataProperty <em>Data Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DataPropertyRange#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DataPropertyRange#getDataIntersectionOf <em>Data Intersection Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DataPropertyRange#getDataUnionOf <em>Data Union Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DataPropertyRange#getDataComplementOf <em>Data Complement Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DataPropertyRange#getDataOneOf <em>Data One Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DataPropertyRange#getDatatypeRestriction <em>Datatype Restriction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataPropertyRange()
 * @model
 * @generated
 */
public interface DataPropertyRange extends DataPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>Data Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Property</em>' containment reference.
	 * @see #setDataProperty(DataProperty)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataPropertyRange_DataProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataProperty getDataProperty();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.DataPropertyRange#getDataProperty <em>Data Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Property</em>' containment reference.
	 * @see #getDataProperty()
	 * @generated
	 */
	void setDataProperty(DataProperty value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' containment reference.
	 * @see #setDatatype(Datatype)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataPropertyRange_Datatype()
	 * @model containment="true"
	 * @generated
	 */
	Datatype getDatatype();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.DataPropertyRange#getDatatype <em>Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' containment reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(Datatype value);

	/**
	 * Returns the value of the '<em><b>Data Intersection Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Intersection Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Intersection Of</em>' containment reference.
	 * @see #setDataIntersectionOf(DataIntersectionOf)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataPropertyRange_DataIntersectionOf()
	 * @model containment="true"
	 * @generated
	 */
	DataIntersectionOf getDataIntersectionOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.DataPropertyRange#getDataIntersectionOf <em>Data Intersection Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Intersection Of</em>' containment reference.
	 * @see #getDataIntersectionOf()
	 * @generated
	 */
	void setDataIntersectionOf(DataIntersectionOf value);

	/**
	 * Returns the value of the '<em><b>Data Union Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Union Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Union Of</em>' containment reference.
	 * @see #setDataUnionOf(DataUnionOf)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataPropertyRange_DataUnionOf()
	 * @model containment="true"
	 * @generated
	 */
	DataUnionOf getDataUnionOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.DataPropertyRange#getDataUnionOf <em>Data Union Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Union Of</em>' containment reference.
	 * @see #getDataUnionOf()
	 * @generated
	 */
	void setDataUnionOf(DataUnionOf value);

	/**
	 * Returns the value of the '<em><b>Data Complement Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Complement Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Complement Of</em>' containment reference.
	 * @see #setDataComplementOf(DataComplementOf)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataPropertyRange_DataComplementOf()
	 * @model containment="true"
	 * @generated
	 */
	DataComplementOf getDataComplementOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.DataPropertyRange#getDataComplementOf <em>Data Complement Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Complement Of</em>' containment reference.
	 * @see #getDataComplementOf()
	 * @generated
	 */
	void setDataComplementOf(DataComplementOf value);

	/**
	 * Returns the value of the '<em><b>Data One Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data One Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data One Of</em>' containment reference.
	 * @see #setDataOneOf(DataOneOf)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataPropertyRange_DataOneOf()
	 * @model containment="true"
	 * @generated
	 */
	DataOneOf getDataOneOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.DataPropertyRange#getDataOneOf <em>Data One Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data One Of</em>' containment reference.
	 * @see #getDataOneOf()
	 * @generated
	 */
	void setDataOneOf(DataOneOf value);

	/**
	 * Returns the value of the '<em><b>Datatype Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype Restriction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype Restriction</em>' containment reference.
	 * @see #setDatatypeRestriction(DatatypeRestriction)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDataPropertyRange_DatatypeRestriction()
	 * @model containment="true"
	 * @generated
	 */
	DatatypeRestriction getDatatypeRestriction();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.DataPropertyRange#getDatatypeRestriction <em>Datatype Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype Restriction</em>' containment reference.
	 * @see #getDatatypeRestriction()
	 * @generated
	 */
	void setDatatypeRestriction(DatatypeRestriction value);

} // DataPropertyRange
