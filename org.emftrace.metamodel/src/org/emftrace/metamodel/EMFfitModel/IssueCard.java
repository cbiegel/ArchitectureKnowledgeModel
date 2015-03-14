/**
 */
package org.emftrace.metamodel.EMFfitModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.IssueCard#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.IssueCard#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.IssueCard#getSolution <em>Solution</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.IssueCard#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.IssueCard#getInfluencingFactors <em>Influencing Factors</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.IssueCard#getRelatedIssues <em>Related Issues</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getIssueCard()
 * @model
 * @generated
 */
public interface IssueCard extends Item {
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
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getIssueCard_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.EMFfitModel.IssueCard#getName <em>Name</em>}' attribute.
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
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getIssueCard_Description()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Hypertext getDescription();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.EMFfitModel.IssueCard#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Hypertext value);

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' containment reference.
	 * @see #setSolution(Hypertext)
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getIssueCard_Solution()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Hypertext getSolution();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.EMFfitModel.IssueCard#getSolution <em>Solution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' containment reference.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(Hypertext value);

	/**
	 * Returns the value of the '<em><b>Strategies</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.EMFfitModel.Strategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategies</em>' containment reference list.
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getIssueCard_Strategies()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Strategy> getStrategies();

	/**
	 * Returns the value of the '<em><b>Influencing Factors</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.EMFfitModel.InfluencingFactor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Influencing Factors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Influencing Factors</em>' containment reference list.
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getIssueCard_InfluencingFactors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InfluencingFactor> getInfluencingFactors();

	/**
	 * Returns the value of the '<em><b>Related Issues</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.EMFfitModel.RelatedIssue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Issues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Issues</em>' containment reference list.
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getIssueCard_RelatedIssues()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelatedIssue> getRelatedIssues();

} // IssueCard
