/**
 */
package org.emftrace.metamodel.FeatureModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.FeatureModel.FeatureModelPackage
 * @generated
 */
public interface FeatureModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeatureModelFactory eINSTANCE = org.emftrace.metamodel.FeatureModel.impl.FeatureModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Consul Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consul Model</em>'.
	 * @generated
	 */
	ConsulModel createConsulModel();

	/**
	 * Returns a new object of class '<em>Head</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Head</em>'.
	 * @generated
	 */
	Head createHead();

	/**
	 * Returns a new object of class '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties</em>'.
	 * @generated
	 */
	Properties createProperties();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Restrictions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restrictions</em>'.
	 * @generated
	 */
	Restrictions createRestrictions();

	/**
	 * Returns a new object of class '<em>Rest Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rest Set</em>'.
	 * @generated
	 */
	RestSet createRestSet();

	/**
	 * Returns a new object of class '<em>Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restriction</em>'.
	 * @generated
	 */
	Restriction createRestriction();

	/**
	 * Returns a new object of class '<em>Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elements</em>'.
	 * @generated
	 */
	Elements createElements();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>VName</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VName</em>'.
	 * @generated
	 */
	VName createVName();

	/**
	 * Returns a new object of class '<em>Relations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relations</em>'.
	 * @generated
	 */
	Relations createRelations();

	/**
	 * Returns a new object of class '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation</em>'.
	 * @generated
	 */
	Relation createRelation();

	/**
	 * Returns a new object of class '<em>Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target</em>'.
	 * @generated
	 */
	Target createTarget();

	/**
	 * Returns a new object of class '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
	Constant createConstant();

	/**
	 * Returns a new object of class '<em>Calculate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calculate</em>'.
	 * @generated
	 */
	Calculate createCalculate();

	/**
	 * Returns a new object of class '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script</em>'.
	 * @generated
	 */
	Script createScript();

	/**
	 * Returns a new object of class '<em>Desc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Desc</em>'.
	 * @generated
	 */
	Desc createDesc();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FeatureModelPackage getFeatureModelPackage();

} //FeatureModelFactory
