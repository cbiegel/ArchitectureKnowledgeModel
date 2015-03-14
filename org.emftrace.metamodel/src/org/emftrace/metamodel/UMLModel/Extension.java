/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Extension#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Extension#getMetaClass <em>Meta Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExtension()
 * @model
 * @generated
 */
public interface Extension extends Association {
	/**
	 * Returns the value of the '<em><b>Is Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Required</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExtension_IsRequired()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsRequired();

	/**
	 * Returns the value of the '<em><b>Meta Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Class</em>' attribute.
	 * @see #setMetaClass(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getExtension_MetaClass()
	 * @model required="true"
	 * @generated
	 */
	String getMetaClass();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Extension#getMetaClass <em>Meta Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Class</em>' attribute.
	 * @see #getMetaClass()
	 * @generated
	 */
	void setMetaClass(String value);

} // Extension
