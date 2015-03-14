/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.GeneralizationSet#isIsCovering <em>Is Covering</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.GeneralizationSet#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.GeneralizationSet#getPowerType <em>Power Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getGeneralizationSet()
 * @model
 * @generated
 */
public interface GeneralizationSet extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Is Covering</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Covering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Covering</em>' attribute.
	 * @see #setIsCovering(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getGeneralizationSet_IsCovering()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsCovering();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.GeneralizationSet#isIsCovering <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Covering</em>' attribute.
	 * @see #isIsCovering()
	 * @generated
	 */
	void setIsCovering(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Disjoint</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Disjoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Disjoint</em>' attribute.
	 * @see #setIsDisjoint(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getGeneralizationSet_IsDisjoint()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDisjoint();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Disjoint</em>' attribute.
	 * @see #isIsDisjoint()
	 * @generated
	 */
	void setIsDisjoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' attribute.
	 * @see #setGeneralization(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getGeneralizationSet_Generalization()
	 * @model
	 * @generated
	 */
	String getGeneralization();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.GeneralizationSet#getGeneralization <em>Generalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalization</em>' attribute.
	 * @see #getGeneralization()
	 * @generated
	 */
	void setGeneralization(String value);

	/**
	 * Returns the value of the '<em><b>Power Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Type</em>' attribute.
	 * @see #setPowerType(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getGeneralizationSet_PowerType()
	 * @model
	 * @generated
	 */
	String getPowerType();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.GeneralizationSet#getPowerType <em>Power Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Type</em>' attribute.
	 * @see #getPowerType()
	 * @generated
	 */
	void setPowerType(String value);

} // GeneralizationSet
