/**
 */
package org.emftrace.metamodel.EMFfitModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influencing Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.InfluencingFactor#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.InfluencingFactor#getFactor <em>Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getInfluencingFactor()
 * @model
 * @generated
 */
public interface InfluencingFactor extends FTICBase {
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
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getInfluencingFactor_Description()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Hypertext getDescription();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.EMFfitModel.InfluencingFactor#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Hypertext value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' reference.
	 * @see #setFactor(Factor)
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getInfluencingFactor_Factor()
	 * @model required="true"
	 * @generated
	 */
	Factor getFactor();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.EMFfitModel.InfluencingFactor#getFactor <em>Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(Factor value);

} // InfluencingFactor
