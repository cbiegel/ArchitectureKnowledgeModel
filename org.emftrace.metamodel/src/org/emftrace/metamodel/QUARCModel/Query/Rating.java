/**
 */
package org.emftrace.metamodel.QUARCModel.Query;

import org.emftrace.metamodel.QUARCModel.GSS.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rating</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Rating relation represents the final aggregated impact between a SolutionInstrument and a Goal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.Rating#getWeight <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.QUARCModel.Query.QueryPackage#getRating()
 * @model
 * @generated
 */
public interface Rating extends Relation {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The calculated weight for the Rating relation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(String)
	 * @see org.emftrace.metamodel.QUARCModel.Query.QueryPackage#getRating_Weight()
	 * @model
	 * @generated
	 */
	String getWeight();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.QUARCModel.Query.Rating#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(String value);

} // Rating
