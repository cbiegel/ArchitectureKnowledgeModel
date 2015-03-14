/**
 */
package org.emftrace.metamodel.QUARCModel.GSS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An impact relation between Elements of two neighbouring layers. 
 * An Element can have multiple outgoing and incoming impact relations to or from different Elements.
 * 
 * Allowed relations (source -> target):
 * SolutionInstrument (any) -> Principle (leafs only)
 * Principle (any) -> Goal  (leafs only)
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.GSS.Impact#getWeight <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSPackage#getImpact()
 * @model
 * @generated
 */
public interface Impact extends Relation {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The weight of the impact relation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(String)
	 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSPackage#getImpact_Weight()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	String getWeight();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.QUARCModel.GSS.Impact#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(String value);

} // Impact
