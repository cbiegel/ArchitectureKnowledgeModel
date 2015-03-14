/**
 */
package org.emftrace.metamodel.URNModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.Condition#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.Condition#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.Condition#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends URNBase {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getCondition_Expression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.Condition#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' containment reference.
	 * @see #setDesc(ConcreteCondition)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getCondition_Desc()
	 * @model containment="true"
	 * @generated
	 */
	ConcreteCondition getDesc();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.Condition#getDesc <em>Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' containment reference.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(ConcreteCondition value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Label)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getCondition_Label()
	 * @model containment="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.Condition#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

} // Condition
