/**
 */
package org.emftrace.metamodel.BPMN2Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.OutputSet#getDataOutputRefs <em>Data Output Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.OutputSet#getOptionalOutputRefs <em>Optional Output Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.OutputSet#getWhileExecutingOutputRefs <em>While Executing Output Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.OutputSet#getInputSetRefs <em>Input Set Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.OutputSet#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getOutputSet()
 * @model
 * @generated
 */
public interface OutputSet extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Data Output Refs</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.BPMN2Model.DataOutput}.
	 * It is bidirectional and its opposite is '{@link org.emftrace.metamodel.BPMN2Model.DataOutput#getOutputSetRefs <em>Output Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Output Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Output Refs</em>' reference list.
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getOutputSet_DataOutputRefs()
	 * @see org.emftrace.metamodel.BPMN2Model.DataOutput#getOutputSetRefs
	 * @model opposite="outputSetRefs" ordered="false"
	 * @generated
	 */
	EList<DataOutput> getDataOutputRefs();

	/**
	 * Returns the value of the '<em><b>Optional Output Refs</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.BPMN2Model.DataOutput}.
	 * It is bidirectional and its opposite is '{@link org.emftrace.metamodel.BPMN2Model.DataOutput#getOutputSetWithOptional <em>Output Set With Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Output Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Output Refs</em>' reference list.
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getOutputSet_OptionalOutputRefs()
	 * @see org.emftrace.metamodel.BPMN2Model.DataOutput#getOutputSetWithOptional
	 * @model opposite="outputSetWithOptional" ordered="false"
	 * @generated
	 */
	EList<DataOutput> getOptionalOutputRefs();

	/**
	 * Returns the value of the '<em><b>While Executing Output Refs</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.BPMN2Model.DataOutput}.
	 * It is bidirectional and its opposite is '{@link org.emftrace.metamodel.BPMN2Model.DataOutput#getOutputSetWithWhileExecuting <em>Output Set With While Executing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Executing Output Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Executing Output Refs</em>' reference list.
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getOutputSet_WhileExecutingOutputRefs()
	 * @see org.emftrace.metamodel.BPMN2Model.DataOutput#getOutputSetWithWhileExecuting
	 * @model opposite="outputSetWithWhileExecuting" ordered="false"
	 * @generated
	 */
	EList<DataOutput> getWhileExecutingOutputRefs();

	/**
	 * Returns the value of the '<em><b>Input Set Refs</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.BPMN2Model.InputSet}.
	 * It is bidirectional and its opposite is '{@link org.emftrace.metamodel.BPMN2Model.InputSet#getOutputSetRefs <em>Output Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Set Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set Refs</em>' reference list.
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getOutputSet_InputSetRefs()
	 * @see org.emftrace.metamodel.BPMN2Model.InputSet#getOutputSetRefs
	 * @model opposite="outputSetRefs" ordered="false"
	 * @generated
	 */
	EList<InputSet> getInputSetRefs();

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
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getOutputSet_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.OutputSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OutputSet
