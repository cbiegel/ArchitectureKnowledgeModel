/**
 */
package org.emftrace.metamodel.UMLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Component#isIndirectlyInstantiated <em>Indirectly Instantiated</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Component#getRequired <em>Required</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Component#getProvided <em>Provided</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Component#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Component#getRealization <em>Realization</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends org.emftrace.metamodel.UMLModel.Class {
	/**
	 * Returns the value of the '<em><b>Indirectly Instantiated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indirectly Instantiated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indirectly Instantiated</em>' attribute.
	 * @see #setIndirectlyInstantiated(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getComponent_IndirectlyInstantiated()
	 * @model default="true" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIndirectlyInstantiated();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Component#isIndirectlyInstantiated <em>Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indirectly Instantiated</em>' attribute.
	 * @see #isIndirectlyInstantiated()
	 * @generated
	 */
	void setIndirectlyInstantiated(boolean value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getComponent_Required()
	 * @model
	 * @generated
	 */
	String getRequired();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Component#getRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(String value);

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' attribute.
	 * @see #setProvided(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getComponent_Provided()
	 * @model
	 * @generated
	 */
	String getProvided();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Component#getProvided <em>Provided</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided</em>' attribute.
	 * @see #getProvided()
	 * @generated
	 */
	void setProvided(String value);

	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaged Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaged Element</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getComponent_PackagedElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PackageableElement> getPackagedElement();

	/**
	 * Returns the value of the '<em><b>Realization</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.ComponentRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realization</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getComponent_Realization()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ComponentRealization> getRealization();

} // Component
