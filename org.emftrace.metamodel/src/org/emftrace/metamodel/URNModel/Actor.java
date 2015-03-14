/**
 */
package org.emftrace.metamodel.URNModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.Actor#getCollapsedRefs <em>Collapsed Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.Actor#getActorRefs <em>Actor Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.Actor#getStyle <em>Style</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.Actor#getElems <em>Elems</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends GRLLinkableElement {
	/**
	 * Returns the value of the '<em><b>Collapsed Refs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collapsed Refs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collapsed Refs</em>' attribute list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getActor_CollapsedRefs()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 * @generated
	 */
	EList<String> getCollapsedRefs();

	/**
	 * Returns the value of the '<em><b>Actor Refs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Refs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Refs</em>' attribute list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getActor_ActorRefs()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 * @generated
	 */
	EList<String> getActorRefs();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(ConcreteStyle)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getActor_Style()
	 * @model containment="true"
	 * @generated
	 */
	ConcreteStyle getStyle();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.Actor#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(ConcreteStyle value);

	/**
	 * Returns the value of the '<em><b>Elems</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elems</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elems</em>' attribute list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getActor_Elems()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 * @generated
	 */
	EList<String> getElems();

} // Actor
