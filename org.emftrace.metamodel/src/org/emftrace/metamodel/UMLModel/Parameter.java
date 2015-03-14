/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Parameter#getParameterSet <em>Parameter Set</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Parameter#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Parameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Parameter#getDefault <em>Default</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Parameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Parameter#isIsException <em>Is Exception</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Parameter#isIsStream <em>Is Stream</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Parameter#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends ConnectableElement, MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Parameter Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Set</em>' attribute.
	 * @see #setParameterSet(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getParameter_ParameterSet()
	 * @model
	 * @generated
	 */
	String getParameterSet();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Parameter#getParameterSet <em>Parameter Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Set</em>' attribute.
	 * @see #getParameterSet()
	 * @generated
	 */
	void setParameterSet(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see #setOperation(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getParameter_Operation()
	 * @model
	 * @generated
	 */
	String getOperation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Parameter#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"in"</code>.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.UMLModel.ParameterDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.ParameterDirectionKind
	 * @see #setDirection(ParameterDirectionKind)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getParameter_Direction()
	 * @model default="in" required="true" ordered="false"
	 * @generated
	 */
	ParameterDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.ParameterDirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParameterDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #isSetDefault()
	 * @see #unsetDefault()
	 * @see #setDefault(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getParameter_Default()
	 * @model unsettable="true" dataType="org.emftrace.metamodel.UMLModel.String" transient="true" derived="true" ordered="false"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Parameter#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isSetDefault()
	 * @see #unsetDefault()
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Unsets the value of the '{@link org.emftrace.metamodel.UMLModel.Parameter#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefault()
	 * @see #getDefault()
	 * @see #setDefault(String)
	 * @generated
	 */
	void unsetDefault();

	/**
	 * Returns whether the value of the '{@link org.emftrace.metamodel.UMLModel.Parameter#getDefault <em>Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default</em>' attribute is set.
	 * @see #unsetDefault()
	 * @see #getDefault()
	 * @see #setDefault(String)
	 * @generated
	 */
	boolean isSetDefault();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(ValueSpecification)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getParameter_DefaultValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getDefaultValue();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Parameter#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Is Exception</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Exception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Exception</em>' attribute.
	 * @see #setIsException(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getParameter_IsException()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsException();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Parameter#isIsException <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exception</em>' attribute.
	 * @see #isIsException()
	 * @generated
	 */
	void setIsException(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Stream</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Stream</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Stream</em>' attribute.
	 * @see #setIsStream(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getParameter_IsStream()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsStream();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Parameter#isIsStream <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Stream</em>' attribute.
	 * @see #isIsStream()
	 * @generated
	 */
	void setIsStream(boolean value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.UMLModel.ParameterEffectKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.ParameterEffectKind
	 * @see #isSetEffect()
	 * @see #unsetEffect()
	 * @see #setEffect(ParameterEffectKind)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getParameter_Effect()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	ParameterEffectKind getEffect();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Parameter#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.ParameterEffectKind
	 * @see #isSetEffect()
	 * @see #unsetEffect()
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(ParameterEffectKind value);

	/**
	 * Unsets the value of the '{@link org.emftrace.metamodel.UMLModel.Parameter#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffect()
	 * @see #getEffect()
	 * @see #setEffect(ParameterEffectKind)
	 * @generated
	 */
	void unsetEffect();

	/**
	 * Returns whether the value of the '{@link org.emftrace.metamodel.UMLModel.Parameter#getEffect <em>Effect</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effect</em>' attribute is set.
	 * @see #unsetEffect()
	 * @see #getEffect()
	 * @see #setEffect(ParameterEffectKind)
	 * @generated
	 */
	boolean isSetEffect();

} // Parameter
