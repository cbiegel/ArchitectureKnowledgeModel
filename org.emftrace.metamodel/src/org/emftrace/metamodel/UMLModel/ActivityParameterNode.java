/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Parameter Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ActivityParameterNode#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getActivityParameterNode()
 * @model
 * @generated
 */
public interface ActivityParameterNode extends ObjectNode {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getActivityParameterNode_Parameter()
	 * @model required="true"
	 * @generated
	 */
	String getParameter();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ActivityParameterNode#getParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(String value);

} // ActivityParameterNode
