/**
 */
package org.emftrace.metamodel.QUARCModel.GSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract Element of the GSS.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.GSS.Element#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.GSS.Element#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.GSS.Element#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.GSS.Element#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends GSSBase {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name for the Element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSPackage#getElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.QUARCModel.GSS.Element#getName <em>Name</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of the Element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSPackage#getElement_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.QUARCModel.GSS.Element#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of alias (alternative names) for the Element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' attribute list.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSPackage#getElement_Alias()
	 * @model
	 * @generated
	 */
	EList<String> getAlias();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.QUARCModel.GSS.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tags for the Element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSPackage#getElement_Tags()
	 * @model
	 * @generated
	 */
	EList<Tag> getTags();

} // Element
