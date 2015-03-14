/**
 */
package org.emftrace.metamodel.UMLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.DeploymentTarget#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.DeploymentTarget#getDeployedElement <em>Deployed Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getDeploymentTarget()
 * @model abstract="true"
 * @generated
 */
public interface DeploymentTarget extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.Deployment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getDeploymentTarget_Deployment()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Deployment> getDeployment();

	/**
	 * Returns the value of the '<em><b>Deployed Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Element</em>' attribute.
	 * @see #setDeployedElement(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getDeploymentTarget_DeployedElement()
	 * @model
	 * @generated
	 */
	String getDeployedElement();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.DeploymentTarget#getDeployedElement <em>Deployed Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployed Element</em>' attribute.
	 * @see #getDeployedElement()
	 * @generated
	 */
	void setDeployedElement(String value);

} // DeploymentTarget
