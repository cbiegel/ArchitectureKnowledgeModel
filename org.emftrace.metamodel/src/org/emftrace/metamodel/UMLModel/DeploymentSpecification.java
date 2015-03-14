/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.DeploymentSpecification#getDeploymentLocation <em>Deployment Location</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.DeploymentSpecification#getExecutionLocation <em>Execution Location</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.DeploymentSpecification#getDeployment <em>Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getDeploymentSpecification()
 * @model
 * @generated
 */
public interface DeploymentSpecification extends Artifact {
	/**
	 * Returns the value of the '<em><b>Deployment Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Location</em>' attribute.
	 * @see #isSetDeploymentLocation()
	 * @see #unsetDeploymentLocation()
	 * @see #setDeploymentLocation(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getDeploymentSpecification_DeploymentLocation()
	 * @model unsettable="true" dataType="org.emftrace.metamodel.UMLModel.String" ordered="false"
	 * @generated
	 */
	String getDeploymentLocation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.DeploymentSpecification#getDeploymentLocation <em>Deployment Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Location</em>' attribute.
	 * @see #isSetDeploymentLocation()
	 * @see #unsetDeploymentLocation()
	 * @see #getDeploymentLocation()
	 * @generated
	 */
	void setDeploymentLocation(String value);

	/**
	 * Unsets the value of the '{@link org.emftrace.metamodel.UMLModel.DeploymentSpecification#getDeploymentLocation <em>Deployment Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeploymentLocation()
	 * @see #getDeploymentLocation()
	 * @see #setDeploymentLocation(String)
	 * @generated
	 */
	void unsetDeploymentLocation();

	/**
	 * Returns whether the value of the '{@link org.emftrace.metamodel.UMLModel.DeploymentSpecification#getDeploymentLocation <em>Deployment Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deployment Location</em>' attribute is set.
	 * @see #unsetDeploymentLocation()
	 * @see #getDeploymentLocation()
	 * @see #setDeploymentLocation(String)
	 * @generated
	 */
	boolean isSetDeploymentLocation();

	/**
	 * Returns the value of the '<em><b>Execution Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Location</em>' attribute.
	 * @see #isSetExecutionLocation()
	 * @see #unsetExecutionLocation()
	 * @see #setExecutionLocation(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getDeploymentSpecification_ExecutionLocation()
	 * @model unsettable="true" dataType="org.emftrace.metamodel.UMLModel.String" ordered="false"
	 * @generated
	 */
	String getExecutionLocation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.DeploymentSpecification#getExecutionLocation <em>Execution Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Location</em>' attribute.
	 * @see #isSetExecutionLocation()
	 * @see #unsetExecutionLocation()
	 * @see #getExecutionLocation()
	 * @generated
	 */
	void setExecutionLocation(String value);

	/**
	 * Unsets the value of the '{@link org.emftrace.metamodel.UMLModel.DeploymentSpecification#getExecutionLocation <em>Execution Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExecutionLocation()
	 * @see #getExecutionLocation()
	 * @see #setExecutionLocation(String)
	 * @generated
	 */
	void unsetExecutionLocation();

	/**
	 * Returns whether the value of the '{@link org.emftrace.metamodel.UMLModel.DeploymentSpecification#getExecutionLocation <em>Execution Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Execution Location</em>' attribute is set.
	 * @see #unsetExecutionLocation()
	 * @see #getExecutionLocation()
	 * @see #setExecutionLocation(String)
	 * @generated
	 */
	boolean isSetExecutionLocation();

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' attribute.
	 * @see #setDeployment(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getDeploymentSpecification_Deployment()
	 * @model
	 * @generated
	 */
	String getDeployment();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.DeploymentSpecification#getDeployment <em>Deployment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' attribute.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(String value);

} // DeploymentSpecification
