/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Port#isIsBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Port#isIsService <em>Is Service</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Port#getRequired <em>Required</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Port#getRedefinedPort <em>Redefined Port</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Port#getProvided <em>Provided</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Port#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends Property {
	/**
	 * Returns the value of the '<em><b>Is Behavior</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Behavior</em>' attribute.
	 * @see #setIsBehavior(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getPort_IsBehavior()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsBehavior();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Port#isIsBehavior <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Behavior</em>' attribute.
	 * @see #isIsBehavior()
	 * @generated
	 */
	void setIsBehavior(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Service</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Service</em>' attribute.
	 * @see #setIsService(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getPort_IsService()
	 * @model default="true" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsService();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Port#isIsService <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Service</em>' attribute.
	 * @see #isIsService()
	 * @generated
	 */
	void setIsService(boolean value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getPort_Required()
	 * @model
	 * @generated
	 */
	String getRequired();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Port#getRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(String value);

	/**
	 * Returns the value of the '<em><b>Redefined Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Port</em>' attribute.
	 * @see #setRedefinedPort(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getPort_RedefinedPort()
	 * @model
	 * @generated
	 */
	String getRedefinedPort();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Port#getRedefinedPort <em>Redefined Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Port</em>' attribute.
	 * @see #getRedefinedPort()
	 * @generated
	 */
	void setRedefinedPort(String value);

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' attribute.
	 * @see #setProvided(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getPort_Provided()
	 * @model
	 * @generated
	 */
	String getProvided();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Port#getProvided <em>Provided</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided</em>' attribute.
	 * @see #getProvided()
	 * @generated
	 */
	void setProvided(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getPort_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Port#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

} // Port
