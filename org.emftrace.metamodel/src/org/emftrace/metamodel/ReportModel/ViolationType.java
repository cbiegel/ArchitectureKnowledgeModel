/**
 */
package org.emftrace.metamodel.ReportModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Violation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ReportModel.ViolationType#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ReportModel.ViolationType#getRefinement <em>Refinement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.ReportModel.ReportModelPackage#getViolationType()
 * @model
 * @generated
 */
public interface ViolationType extends ReportBase {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.emftrace.metamodel.ReportModel.ReportModelPackage#getViolationType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ReportModel.ViolationType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Refinement</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.ReportModel.ViolationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement</em>' containment reference list.
	 * @see org.emftrace.metamodel.ReportModel.ReportModelPackage#getViolationType_Refinement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViolationType> getRefinement();

} // ViolationType
