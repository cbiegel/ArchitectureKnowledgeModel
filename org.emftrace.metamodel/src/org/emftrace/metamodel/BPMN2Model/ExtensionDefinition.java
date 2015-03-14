/**
 */
package org.emftrace.metamodel.BPMN2Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.ExtensionDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.ExtensionDefinition#getExtensionAttributeDefinitions <em>Extension Attribute Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getExtensionDefinition()
 * @model
 * @generated
 */
public interface ExtensionDefinition extends BPMNBase {
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
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getExtensionDefinition_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.ExtensionDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Extension Attribute Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.BPMN2Model.ExtensionAttributeDefinition}.
	 * It is bidirectional and its opposite is '{@link org.emftrace.metamodel.BPMN2Model.ExtensionAttributeDefinition#getExtensionDefinition <em>Extension Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Attribute Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Attribute Definitions</em>' containment reference list.
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getExtensionDefinition_ExtensionAttributeDefinitions()
	 * @see org.emftrace.metamodel.BPMN2Model.ExtensionAttributeDefinition#getExtensionDefinition
	 * @model opposite="extensionDefinition" containment="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ExtensionAttributeDefinition> getExtensionAttributeDefinitions();

} // ExtensionDefinition
