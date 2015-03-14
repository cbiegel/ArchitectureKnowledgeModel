/**
 */
package org.emftrace.metamodel.QUARCModel.GSS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Pattern
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.GSS.Pattern#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.GSS.Pattern#getConsequences <em>Consequences</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.GSS.Pattern#getExample <em>Example</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends SolutionInstrument {
	/**
	 * Returns the value of the '<em><b>Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the structure of the Pattern
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structure</em>' attribute.
	 * @see #setStructure(String)
	 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSPackage#getPattern_Structure()
	 * @model
	 * @generated
	 */
	String getStructure();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.QUARCModel.GSS.Pattern#getStructure <em>Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' attribute.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(String value);

	/**
	 * Returns the value of the '<em><b>Consequences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Conseqences of the Pattern
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consequences</em>' attribute.
	 * @see #setConsequences(String)
	 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSPackage#getPattern_Consequences()
	 * @model
	 * @generated
	 */
	String getConsequences();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.QUARCModel.GSS.Pattern#getConsequences <em>Consequences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequences</em>' attribute.
	 * @see #getConsequences()
	 * @generated
	 */
	void setConsequences(String value);

	/**
	 * Returns the value of the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An example.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example</em>' attribute.
	 * @see #setExample(String)
	 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSPackage#getPattern_Example()
	 * @model
	 * @generated
	 */
	String getExample();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.QUARCModel.GSS.Pattern#getExample <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example</em>' attribute.
	 * @see #getExample()
	 * @generated
	 */
	void setExample(String value);

} // Pattern
