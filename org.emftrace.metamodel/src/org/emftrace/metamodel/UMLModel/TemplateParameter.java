/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.TemplateParameter#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.TemplateParameter#getParameteredElement <em>Parametered Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.TemplateParameter#getDefault <em>Default</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.TemplateParameter#getOwnedDefault <em>Owned Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTemplateParameter()
 * @model
 * @generated
 */
public interface TemplateParameter extends Element {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTemplateParameter_Signature()
	 * @model required="true"
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.TemplateParameter#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Parametered Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametered Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametered Element</em>' attribute.
	 * @see #setParameteredElement(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTemplateParameter_ParameteredElement()
	 * @model required="true"
	 * @generated
	 */
	String getParameteredElement();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.TemplateParameter#getParameteredElement <em>Parametered Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametered Element</em>' attribute.
	 * @see #getParameteredElement()
	 * @generated
	 */
	void setParameteredElement(String value);

	/**
	 * Returns the value of the '<em><b>Owned Parametered Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parametered Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parametered Element</em>' containment reference.
	 * @see #setOwnedParameteredElement(ParameterableElement)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTemplateParameter_OwnedParameteredElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ParameterableElement getOwnedParameteredElement();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Parametered Element</em>' containment reference.
	 * @see #getOwnedParameteredElement()
	 * @generated
	 */
	void setOwnedParameteredElement(ParameterableElement value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTemplateParameter_Default()
	 * @model
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.TemplateParameter#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Owned Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Default</em>' containment reference.
	 * @see #setOwnedDefault(ParameterableElement)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getTemplateParameter_OwnedDefault()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ParameterableElement getOwnedDefault();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.TemplateParameter#getOwnedDefault <em>Owned Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Default</em>' containment reference.
	 * @see #getOwnedDefault()
	 * @generated
	 */
	void setOwnedDefault(ParameterableElement value);

} // TemplateParameter
