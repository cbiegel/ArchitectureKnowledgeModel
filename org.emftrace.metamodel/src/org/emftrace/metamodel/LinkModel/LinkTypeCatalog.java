/**
 */
package org.emftrace.metamodel.LinkModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Type Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.LinkModel.LinkTypeCatalog#getLinkTypes <em>Link Types</em>}</li>
 *   <li>{@link org.emftrace.metamodel.LinkModel.LinkTypeCatalog#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.LinkModel.LinkTypeCatalog#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.LinkModel.LinkModelPackage#getLinkTypeCatalog()
 * @model
 * @generated
 */
public interface LinkTypeCatalog extends LinkBase {
	/**
	 * Returns the value of the '<em><b>Link Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.LinkModel.LinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Types</em>' containment reference list.
	 * @see org.emftrace.metamodel.LinkModel.LinkModelPackage#getLinkTypeCatalog_LinkTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkType> getLinkTypes();

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
	 * @see org.emftrace.metamodel.LinkModel.LinkModelPackage#getLinkTypeCatalog_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.LinkModel.LinkTypeCatalog#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.emftrace.metamodel.LinkModel.LinkModelPackage#getLinkTypeCatalog_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.LinkModel.LinkTypeCatalog#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // LinkTypeCatalog
