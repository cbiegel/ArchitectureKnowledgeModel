/**
 */
package org.emftrace.metamodel.ChangeModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.ChangeModel.ChangeModelPackage
 * @generated
 */
public interface ChangeModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChangeModelFactory eINSTANCE = org.emftrace.metamodel.ChangeModel.impl.ChangeModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Atomic Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Change Type</em>'.
	 * @generated
	 */
	AtomicChangeType createAtomicChangeType();

	/**
	 * Returns a new object of class '<em>Composite Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Change Type</em>'.
	 * @generated
	 */
	CompositeChangeType createCompositeChangeType();

	/**
	 * Returns a new object of class '<em>Atomic Change Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Change Instance</em>'.
	 * @generated
	 */
	AtomicChangeInstance createAtomicChangeInstance();

	/**
	 * Returns a new object of class '<em>Composite Change Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Change Instance</em>'.
	 * @generated
	 */
	CompositeChangeInstance createCompositeChangeInstance();

	/**
	 * Returns a new object of class '<em>Change Type Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Type Catalog</em>'.
	 * @generated
	 */
	ChangeTypeCatalog createChangeTypeCatalog();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ChangeModelPackage getChangeModelPackage();

} //ChangeModelFactory
