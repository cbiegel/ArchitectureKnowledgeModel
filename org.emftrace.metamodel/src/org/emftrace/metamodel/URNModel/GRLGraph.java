/**
 */
package org.emftrace.metamodel.URNModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GRL Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.GRLGraph#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.GRLGraph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.GRLGraph#getContRefs <em>Cont Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.GRLGraph#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getGRLGraph()
 * @model
 * @generated
 */
public interface GRLGraph extends GRLmodelElement {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.URNModel.LinkRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getGRLGraph_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkRef> getConnections();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.URNModel.GRLNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getGRLGraph_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GRLNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Cont Refs</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.URNModel.ActorRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cont Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cont Refs</em>' containment reference list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getGRLGraph_ContRefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActorRef> getContRefs();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.URNModel.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getGRLGraph_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComments();

} // GRLGraph
