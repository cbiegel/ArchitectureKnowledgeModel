/**
 */
package org.emftrace.metamodel.EMFfitModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factor Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.FactorTable#getType <em>Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.FactorTable#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getFactorTable()
 * @model
 * @generated
 */
public interface FactorTable extends FTICBase {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.EMFfitModel.CategoryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.emftrace.metamodel.EMFfitModel.CategoryType
	 * @see #setType(CategoryType)
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getFactorTable_Type()
	 * @model
	 * @generated
	 */
	CategoryType getType();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.EMFfitModel.FactorTable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.emftrace.metamodel.EMFfitModel.CategoryType
	 * @see #getType()
	 * @generated
	 */
	void setType(CategoryType value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.EMFfitModel.FTEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getFactorTable_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<FTEntry> getEntries();

} // FactorTable
