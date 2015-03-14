/**
 */
package org.emftrace.metamodel.BPMN2Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.CategoryValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.CategoryValue#getCategorizedFlowElements <em>Categorized Flow Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getCategoryValue()
 * @model
 * @generated
 */
public interface CategoryValue extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getCategoryValue_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.CategoryValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Categorized Flow Elements</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.BPMN2Model.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorized Flow Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorized Flow Elements</em>' reference list.
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getCategoryValue_CategorizedFlowElements()
	 * @model changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList<FlowElement> getCategorizedFlowElements();

} // CategoryValue
