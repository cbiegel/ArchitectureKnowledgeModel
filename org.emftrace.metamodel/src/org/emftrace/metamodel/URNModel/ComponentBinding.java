/**
 */
package org.emftrace.metamodel.URNModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.ComponentBinding#getId <em>Id</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.ComponentBinding#getParentComponent <em>Parent Component</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.ComponentBinding#getPluginComponent <em>Plugin Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getComponentBinding()
 * @model
 * @generated
 */
public interface ComponentBinding extends URNBase {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getComponentBinding_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.ComponentBinding#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Parent Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Component</em>' attribute.
	 * @see #setParentComponent(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getComponentBinding_ParentComponent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 * @generated
	 */
	String getParentComponent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.ComponentBinding#getParentComponent <em>Parent Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Component</em>' attribute.
	 * @see #getParentComponent()
	 * @generated
	 */
	void setParentComponent(String value);

	/**
	 * Returns the value of the '<em><b>Plugin Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Component</em>' attribute.
	 * @see #setPluginComponent(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getComponentBinding_PluginComponent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 * @generated
	 */
	String getPluginComponent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.ComponentBinding#getPluginComponent <em>Plugin Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Component</em>' attribute.
	 * @see #getPluginComponent()
	 * @generated
	 */
	void setPluginComponent(String value);

} // ComponentBinding
