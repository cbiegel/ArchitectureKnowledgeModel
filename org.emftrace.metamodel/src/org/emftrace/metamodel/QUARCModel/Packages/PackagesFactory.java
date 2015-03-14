/**
 */
package org.emftrace.metamodel.QUARCModel.Packages;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.QUARCModel.Packages.PackagesPackage
 * @generated
 */
public interface PackagesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PackagesFactory eINSTANCE = org.emftrace.metamodel.QUARCModel.Packages.impl.PackagesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Toolbox</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toolbox</em>'.
	 * @generated
	 */
	Toolbox createToolbox();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PackagesPackage getPackagesPackage();

} //PackagesFactory
