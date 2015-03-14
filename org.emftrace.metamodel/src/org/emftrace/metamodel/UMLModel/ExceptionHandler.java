/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ExceptionHandler#getHandlerBody <em>Handler Body</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ExceptionHandler#getExceptionInput <em>Exception Input</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ExceptionHandler#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ExceptionHandler#getProtectedNode <em>Protected Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExceptionHandler()
 * @model
 * @generated
 */
public interface ExceptionHandler extends Element {
	/**
	 * Returns the value of the '<em><b>Handler Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler Body</em>' attribute.
	 * @see #setHandlerBody(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExceptionHandler_HandlerBody()
	 * @model required="true"
	 * @generated
	 */
	String getHandlerBody();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ExceptionHandler#getHandlerBody <em>Handler Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Body</em>' attribute.
	 * @see #getHandlerBody()
	 * @generated
	 */
	void setHandlerBody(String value);

	/**
	 * Returns the value of the '<em><b>Exception Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Input</em>' attribute.
	 * @see #setExceptionInput(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExceptionHandler_ExceptionInput()
	 * @model required="true"
	 * @generated
	 */
	String getExceptionInput();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ExceptionHandler#getExceptionInput <em>Exception Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Input</em>' attribute.
	 * @see #getExceptionInput()
	 * @generated
	 */
	void setExceptionInput(String value);

	/**
	 * Returns the value of the '<em><b>Exception Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Type</em>' attribute.
	 * @see #setExceptionType(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExceptionHandler_ExceptionType()
	 * @model required="true"
	 * @generated
	 */
	String getExceptionType();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ExceptionHandler#getExceptionType <em>Exception Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Type</em>' attribute.
	 * @see #getExceptionType()
	 * @generated
	 */
	void setExceptionType(String value);

	/**
	 * Returns the value of the '<em><b>Protected Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protected Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protected Node</em>' attribute.
	 * @see #setProtectedNode(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExceptionHandler_ProtectedNode()
	 * @model required="true"
	 * @generated
	 */
	String getProtectedNode();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ExceptionHandler#getProtectedNode <em>Protected Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protected Node</em>' attribute.
	 * @see #getProtectedNode()
	 * @generated
	 */
	void setProtectedNode(String value);

} // ExceptionHandler
