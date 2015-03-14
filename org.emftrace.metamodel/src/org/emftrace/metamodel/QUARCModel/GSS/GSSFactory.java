/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftrace.metamodel.QUARCModel.GSS;

import org.eclipse.emf.ecore.EFactory;

import org.emftrace.metamodel.QUARCModel.GSS.impl.GSSFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSPackage
 * @generated
 */
public interface GSSFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	GSSFactory eINSTANCE = GSSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decomposition</em>'.
	 * @generated
	 */
	Decomposition createDecomposition();

	/**
	 * Returns a new object of class '<em>Impact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Impact</em>'.
	 * @generated
	 */
	Impact createImpact();

	/**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
	Goal createGoal();

	/**
	 * Returns a new object of class '<em>Principle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Principle</em>'.
	 * @generated
	 */
	Principle createPrinciple();

	/**
	 * Returns a new object of class '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern</em>'.
	 * @generated
	 */
	Pattern createPattern();

	/**
	 * Returns a new object of class '<em>Refactoring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refactoring</em>'.
	 * @generated
	 */
	Refactoring createRefactoring();

	/**
	 * Returns a new object of class '<em>Offset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offset</em>'.
	 * @generated
	 */
	Offset createOffset();

	/**
	 * Returns a new object of class '<em>Flaw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flaw</em>'.
	 * @generated
	 */
	Flaw createFlaw();

	/**
	 * Returns a new object of class '<em>GSS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS</em>'.
	 * @generated
	 */
	GSS createGSS();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Tags Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tags Catalogue</em>'.
	 * @generated
	 */
	TagsCatalogue createTagsCatalogue();

	/**
	 * Returns a new object of class '<em>is A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>is A</em>'.
	 * @generated
	 */
	isA createisA();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GSSPackage getGSSPackage();


} //GSSFactory
