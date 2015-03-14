/**
 */
package org.emftrace.metamodel.URNModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.ActorRef#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.ActorRef#getActorDef <em>Actor Def</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.ActorRef#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.ActorRef#getPos <em>Pos</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.ActorRef#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getActorRef()
 * @model
 * @generated
 */
public interface ActorRef extends GRLmodelElement {
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
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getActorRef_Label()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.ActorRef#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Actor Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Def</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Def</em>' attribute.
	 * @see #setActorDef(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getActorRef_ActorDef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 * @generated
	 */
	String getActorDef();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.ActorRef#getActorDef <em>Actor Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Def</em>' attribute.
	 * @see #getActorDef()
	 * @generated
	 */
	void setActorDef(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' attribute list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getActorRef_Nodes()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 * @generated
	 */
	EList<String> getNodes();

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
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getActorRef_Pos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Position getPos();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.ActorRef#getPos <em>Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' containment reference.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(Position value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Size)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getActorRef_Size()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.ActorRef#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

} // ActorRef
