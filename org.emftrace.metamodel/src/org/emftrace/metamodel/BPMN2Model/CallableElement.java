/**
 */
package org.emftrace.metamodel.BPMN2Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.CallableElement#getSupportedInterfaceRefs <em>Supported Interface Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.CallableElement#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.CallableElement#getIoBinding <em>Io Binding</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.CallableElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getCallableElement()
 * @model
 * @generated
 */
public interface CallableElement extends RootElement {
	/**
	 * Returns the value of the '<em><b>Supported Interface Refs</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.BPMN2Model.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Interface Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Interface Refs</em>' reference list.
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getCallableElement_SupportedInterfaceRefs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> getSupportedInterfaceRefs();

	/**
	 * Returns the value of the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Specification</em>' containment reference.
	 * @see #setIoSpecification(InputOutputSpecification)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getCallableElement_IoSpecification()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	InputOutputSpecification getIoSpecification();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.CallableElement#getIoSpecification <em>Io Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io Specification</em>' containment reference.
	 * @see #getIoSpecification()
	 * @generated
	 */
	void setIoSpecification(InputOutputSpecification value);

	/**
	 * Returns the value of the '<em><b>Io Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.BPMN2Model.InputOutputBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Binding</em>' containment reference list.
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getCallableElement_IoBinding()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<InputOutputBinding> getIoBinding();

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
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getCallableElement_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.CallableElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CallableElement
