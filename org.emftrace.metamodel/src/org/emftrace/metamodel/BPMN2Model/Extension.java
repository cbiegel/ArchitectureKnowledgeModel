/**
 */
package org.emftrace.metamodel.BPMN2Model;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.Extension#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.Extension#isMustUnderstand <em>Must Understand</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.Extension#getXsdDefinition <em>Xsd Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getExtension()
 * @model
 * @generated
 */
public interface Extension extends BPMNBase {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(ExtensionDefinition)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getExtension_Definition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ExtensionDefinition getDefinition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.Extension#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(ExtensionDefinition value);

	/**
	 * Returns the value of the '<em><b>Must Understand</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Understand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Understand</em>' attribute.
	 * @see #setMustUnderstand(boolean)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getExtension_MustUnderstand()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isMustUnderstand();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.Extension#isMustUnderstand <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Understand</em>' attribute.
	 * @see #isMustUnderstand()
	 * @generated
	 */
	void setMustUnderstand(boolean value);

	/**
	 * Returns the value of the '<em><b>Xsd Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xsd Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xsd Definition</em>' attribute.
	 * @see #setXsdDefinition(QName)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getExtension_XsdDefinition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 * @generated
	 */
	QName getXsdDefinition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.Extension#getXsdDefinition <em>Xsd Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsd Definition</em>' attribute.
	 * @see #getXsdDefinition()
	 * @generated
	 */
	void setXsdDefinition(QName value);

} // Extension
