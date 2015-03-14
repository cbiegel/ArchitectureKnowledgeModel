/**
 */
package org.emftrace.metamodel.EMFfitModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.Factor#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.Factor#getFlexibility <em>Flexibility</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.Factor#getChangeability <em>Changeability</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.Factor#getInfluence <em>Influence</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.Factor#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getFactor()
 * @model
 * @generated
 */
public interface Factor extends FTEntry {
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
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getFactor_Description()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Hypertext getDescription();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.EMFfitModel.Factor#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Hypertext value);

	/**
	 * Returns the value of the '<em><b>Flexibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flexibility</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flexibility</em>' containment reference.
	 * @see #setFlexibility(Hypertext)
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getFactor_Flexibility()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Hypertext getFlexibility();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.EMFfitModel.Factor#getFlexibility <em>Flexibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flexibility</em>' containment reference.
	 * @see #getFlexibility()
	 * @generated
	 */
	void setFlexibility(Hypertext value);

	/**
	 * Returns the value of the '<em><b>Changeability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeability</em>' containment reference.
	 * @see #setChangeability(Hypertext)
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getFactor_Changeability()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Hypertext getChangeability();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.EMFfitModel.Factor#getChangeability <em>Changeability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeability</em>' containment reference.
	 * @see #getChangeability()
	 * @generated
	 */
	void setChangeability(Hypertext value);

	/**
	 * Returns the value of the '<em><b>Influence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Influence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Influence</em>' containment reference.
	 * @see #setInfluence(Hypertext)
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getFactor_Influence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Hypertext getInfluence();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.EMFfitModel.Factor#getInfluence <em>Influence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Influence</em>' containment reference.
	 * @see #getInfluence()
	 * @generated
	 */
	void setInfluence(Hypertext value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getFactor_Priority()
	 * @model required="true"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.EMFfitModel.Factor#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

} // Factor
