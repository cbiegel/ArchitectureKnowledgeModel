/**
 */
package org.emftrace.metamodel.ReportModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftrace.metamodel.ReportModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportModelFactoryImpl extends EFactoryImpl implements ReportModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReportModelFactory init() {
		try {
			ReportModelFactory theReportModelFactory = (ReportModelFactory)EPackage.Registry.INSTANCE.getEFactory(ReportModelPackage.eNS_URI);
			if (theReportModelFactory != null) {
				return theReportModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReportModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ReportModelPackage.VIOLATION_TYPE: return createViolationType();
			case ReportModelPackage.VIOLATION_TYPE_CATALOG: return createViolationTypeCatalog();
			case ReportModelPackage.REPORT_CONTAINER: return createReportContainer();
			case ReportModelPackage.IMPACT_REPORT: return createImpactReport();
			case ReportModelPackage.CONSISTENCE_REPORT: return createConsistenceReport();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ReportModelPackage.REPORT_TYPE:
				return createReportTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ReportModelPackage.REPORT_TYPE:
				return convertReportTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViolationType createViolationType() {
		ViolationTypeImpl violationType = new ViolationTypeImpl();
		return violationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViolationTypeCatalog createViolationTypeCatalog() {
		ViolationTypeCatalogImpl violationTypeCatalog = new ViolationTypeCatalogImpl();
		return violationTypeCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportContainer createReportContainer() {
		ReportContainerImpl reportContainer = new ReportContainerImpl();
		return reportContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactReport createImpactReport() {
		ImpactReportImpl impactReport = new ImpactReportImpl();
		return impactReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsistenceReport createConsistenceReport() {
		ConsistenceReportImpl consistenceReport = new ConsistenceReportImpl();
		return consistenceReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportType createReportTypeFromString(EDataType eDataType, String initialValue) {
		ReportType result = ReportType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReportTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportModelPackage getReportModelPackage() {
		return (ReportModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReportModelPackage getPackage() {
		return ReportModelPackage.eINSTANCE;
	}

} //ReportModelFactoryImpl
