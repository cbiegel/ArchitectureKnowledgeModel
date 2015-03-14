/**
 */
package org.emftrace.metamodel.FeatureModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.Element#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.Element#getType <em>Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.Element#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.Element#getDefault <em>Default</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.Element#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.Element#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.Element#getVname <em>Vname</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.Element#getDesc <em>Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.FeatureModel.FeatureModelPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends FeatureModelBase {
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
	 * @see org.emftrace.metamodel.FeatureModel.FeatureModelPackage#getElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.FeatureModel.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.emftrace.metamodel.FeatureModel.FeatureModelPackage#getElement_Type()
	 * @model unique="false" dataType="org.emftrace.metamodel.FeatureModel.PooledString"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.FeatureModel.Element#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.emftrace.metamodel.FeatureModel.FeatureModelPackage#getElement_Class()
	 * @model unique="false" dataType="org.emftrace.metamodel.FeatureModel.PooledString" required="true"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.FeatureModel.Element#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see org.emftrace.metamodel.FeatureModel.FeatureModelPackage#getElement_Default()
	 * @model dataType="org.emftrace.metamodel.FeatureModel.PooledString"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.FeatureModel.Element#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.FeatureModel.Relations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see org.emftrace.metamodel.FeatureModel.FeatureModelPackage#getElement_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relations> getRelations();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.FeatureModel.Properties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.emftrace.metamodel.FeatureModel.FeatureModelPackage#getElement_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Properties> getProperties();

	/**
	 * Returns the value of the '<em><b>Vname</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.FeatureModel.VName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vname</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vname</em>' containment reference list.
	 * @see org.emftrace.metamodel.FeatureModel.FeatureModelPackage#getElement_Vname()
	 * @model containment="true"
	 * @generated
	 */
	EList<VName> getVname();

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.FeatureModel.Desc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' containment reference list.
	 * @see org.emftrace.metamodel.FeatureModel.FeatureModelPackage#getElement_Desc()
	 * @model containment="true"
	 * @generated
	 */
	EList<Desc> getDesc();

} // Element
