/**
 */
package org.emftrace.metamodel.ReportModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.ReportModel.ReportModelPackage
 * @generated
 */
public interface ReportModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReportModelFactory eINSTANCE = org.emftrace.metamodel.ReportModel.impl.ReportModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Violation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Violation Type</em>'.
	 * @generated
	 */
	ViolationType createViolationType();

	/**
	 * Returns a new object of class '<em>Violation Type Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Violation Type Catalog</em>'.
	 * @generated
	 */
	ViolationTypeCatalog createViolationTypeCatalog();

	/**
	 * Returns a new object of class '<em>Report Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Report Container</em>'.
	 * @generated
	 */
	ReportContainer createReportContainer();

	/**
	 * Returns a new object of class '<em>Impact Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Impact Report</em>'.
	 * @generated
	 */
	ImpactReport createImpactReport();

	/**
	 * Returns a new object of class '<em>Consistence Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consistence Report</em>'.
	 * @generated
	 */
	ConsistenceReport createConsistenceReport();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReportModelPackage getReportModelPackage();

} //ReportModelFactory
