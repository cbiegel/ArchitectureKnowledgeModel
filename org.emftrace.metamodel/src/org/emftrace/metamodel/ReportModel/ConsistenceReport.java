/**
 */
package org.emftrace.metamodel.ReportModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consistence Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ReportModel.ConsistenceReport#getTypeOfViolation <em>Type Of Violation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ReportModel.ConsistenceReport#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.ReportModel.ReportModelPackage#getConsistenceReport()
 * @model
 * @generated
 */
public interface ConsistenceReport extends Report {
	/**
	 * Returns the value of the '<em><b>Type Of Violation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of Violation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of Violation</em>' reference.
	 * @see #setTypeOfViolation(ViolationType)
	 * @see org.emftrace.metamodel.ReportModel.ReportModelPackage#getConsistenceReport_TypeOfViolation()
	 * @model
	 * @generated
	 */
	ViolationType getTypeOfViolation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ReportModel.ConsistenceReport#getTypeOfViolation <em>Type Of Violation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Violation</em>' reference.
	 * @see #getTypeOfViolation()
	 * @generated
	 */
	void setTypeOfViolation(ViolationType value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(EObject)
	 * @see org.emftrace.metamodel.ReportModel.ReportModelPackage#getConsistenceReport_Element()
	 * @model required="true"
	 * @generated
	 */
	EObject getElement();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ReportModel.ConsistenceReport#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EObject value);

} // ConsistenceReport
