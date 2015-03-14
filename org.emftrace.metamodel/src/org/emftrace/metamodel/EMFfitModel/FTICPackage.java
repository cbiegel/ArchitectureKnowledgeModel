/**
 */
package org.emftrace.metamodel.EMFfitModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FTIC Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.FTICPackage#getTables <em>Tables</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.FTICPackage#getIssueCards <em>Issue Cards</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.FTICPackage#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getFTICPackage()
 * @model
 * @generated
 */
public interface FTICPackage extends FTICBase {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.EMFfitModel.FactorTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getFTICPackage_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<FactorTable> getTables();

	/**
	 * Returns the value of the '<em><b>Issue Cards</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.EMFfitModel.IssueCard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Cards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Cards</em>' containment reference list.
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getFTICPackage_IssueCards()
	 * @model containment="true"
	 * @generated
	 */
	EList<IssueCard> getIssueCards();

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
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getFTICPackage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.EMFfitModel.FTICPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FTICPackage
