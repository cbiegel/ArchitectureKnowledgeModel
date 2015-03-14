/**
 */
package org.emftrace.metamodel.URNModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.PathNode#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.PathNode#getPred <em>Pred</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.PathNode#getSucc <em>Succ</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.PathNode#getContRef <em>Cont Ref</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.PathNode#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getPathNode()
 * @model
 * @generated
 */
public interface PathNode extends UCMmodelElement {
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
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getPathNode_Label()
	 * @model containment="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.PathNode#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Pred</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pred</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pred</em>' attribute list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getPathNode_Pred()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 * @generated
	 */
	EList<String> getPred();

	/**
	 * Returns the value of the '<em><b>Succ</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Succ</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succ</em>' attribute list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getPathNode_Succ()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 * @generated
	 */
	EList<String> getSucc();

	/**
	 * Returns the value of the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cont Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cont Ref</em>' attribute.
	 * @see #setContRef(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getPathNode_ContRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 * @generated
	 */
	String getContRef();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.PathNode#getContRef <em>Cont Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cont Ref</em>' attribute.
	 * @see #getContRef()
	 * @generated
	 */
	void setContRef(String value);

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' containment reference.
	 * @see #setPos(Position)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getPathNode_Pos()
	 * @model containment="true"
	 * @generated
	 */
	Position getPos();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.PathNode#getPos <em>Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' containment reference.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(Position value);

} // PathNode
