/**
 */
package org.emftrace.metamodel.LinkModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.LinkModel.LinkContainer#getLinks <em>Links</em>}</li>
 *   <li>{@link org.emftrace.metamodel.LinkModel.LinkContainer#getTraces <em>Traces</em>}</li>
 *   <li>{@link org.emftrace.metamodel.LinkModel.LinkContainer#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.LinkModel.LinkModelPackage#getLinkContainer()
 * @model
 * @generated
 */
public interface LinkContainer extends LinkBase {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.LinkModel.TraceLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.emftrace.metamodel.LinkModel.LinkModelPackage#getLinkContainer_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<TraceLink> getLinks();

	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.LinkModel.Trace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference list.
	 * @see org.emftrace.metamodel.LinkModel.LinkModelPackage#getLinkContainer_Traces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trace> getTraces();

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
	 * @see org.emftrace.metamodel.LinkModel.LinkModelPackage#getLinkContainer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.LinkModel.LinkContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LinkContainer
