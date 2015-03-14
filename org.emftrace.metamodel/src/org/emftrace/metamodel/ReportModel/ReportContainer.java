/**
 */
package org.emftrace.metamodel.ReportModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ReportModel.ReportContainer#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ReportModel.ReportContainer#getReports <em>Reports</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.ReportModel.ReportModelPackage#getReportContainer()
 * @model
 * @generated
 */
public interface ReportContainer extends ReportBase {
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
	 * @see org.emftrace.metamodel.ReportModel.ReportModelPackage#getReportContainer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ReportModel.ReportContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reports</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.ReportModel.Report}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reports</em>' containment reference list.
	 * @see org.emftrace.metamodel.ReportModel.ReportModelPackage#getReportContainer_Reports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Report> getReports();

} // ReportContainer
