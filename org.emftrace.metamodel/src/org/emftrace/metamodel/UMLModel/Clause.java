/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Clause#getPredecessorClause <em>Predecessor Clause</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Clause#getSuccessorClause <em>Successor Clause</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Clause#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Clause#getBodyOutput <em>Body Output</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Clause#getTest <em>Test</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Clause#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getClause()
 * @model
 * @generated
 */
public interface Clause extends Element {
	/**
	 * Returns the value of the '<em><b>Predecessor Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor Clause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor Clause</em>' attribute.
	 * @see #setPredecessorClause(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getClause_PredecessorClause()
	 * @model
	 * @generated
	 */
	String getPredecessorClause();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Clause#getPredecessorClause <em>Predecessor Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor Clause</em>' attribute.
	 * @see #getPredecessorClause()
	 * @generated
	 */
	void setPredecessorClause(String value);

	/**
	 * Returns the value of the '<em><b>Successor Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor Clause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor Clause</em>' attribute.
	 * @see #setSuccessorClause(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getClause_SuccessorClause()
	 * @model
	 * @generated
	 */
	String getSuccessorClause();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Clause#getSuccessorClause <em>Successor Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor Clause</em>' attribute.
	 * @see #getSuccessorClause()
	 * @generated
	 */
	void setSuccessorClause(String value);

	/**
	 * Returns the value of the '<em><b>Decider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decider</em>' attribute.
	 * @see #setDecider(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getClause_Decider()
	 * @model
	 * @generated
	 */
	String getDecider();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Clause#getDecider <em>Decider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decider</em>' attribute.
	 * @see #getDecider()
	 * @generated
	 */
	void setDecider(String value);

	/**
	 * Returns the value of the '<em><b>Body Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Output</em>' attribute.
	 * @see #setBodyOutput(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getClause_BodyOutput()
	 * @model
	 * @generated
	 */
	String getBodyOutput();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Clause#getBodyOutput <em>Body Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Output</em>' attribute.
	 * @see #getBodyOutput()
	 * @generated
	 */
	void setBodyOutput(String value);

	/**
	 * Returns the value of the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' attribute.
	 * @see #setTest(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getClause_Test()
	 * @model
	 * @generated
	 */
	String getTest();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Clause#getTest <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' attribute.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getClause_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Clause#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // Clause
