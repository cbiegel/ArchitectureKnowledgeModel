/**
 */
package org.emftrace.metamodel.EMFfitModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.Strategy#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.Strategy#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getStrategy()
 * @model
 * @generated
 */
public interface Strategy extends Item {
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
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getStrategy_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.EMFfitModel.Strategy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Hypertext)
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getStrategy_Description()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Hypertext getDescription();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.EMFfitModel.Strategy#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Hypertext value);

} // Strategy
