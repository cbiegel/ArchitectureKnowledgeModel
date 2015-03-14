/**
 */
package org.emftrace.metamodel.URNModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resp Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.RespRef#getRepetitionCount <em>Repetition Count</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.RespRef#getHostDemand <em>Host Demand</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.RespRef#getRespDef <em>Resp Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getRespRef()
 * @model
 * @generated
 */
public interface RespRef extends PathNode {
	/**
	 * Returns the value of the '<em><b>Repetition Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetition Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetition Count</em>' attribute.
	 * @see #setRepetitionCount(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getRespRef_RepetitionCount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getRepetitionCount();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.RespRef#getRepetitionCount <em>Repetition Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetition Count</em>' attribute.
	 * @see #getRepetitionCount()
	 * @generated
	 */
	void setRepetitionCount(String value);

	/**
	 * Returns the value of the '<em><b>Host Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Demand</em>' attribute.
	 * @see #setHostDemand(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getRespRef_HostDemand()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getHostDemand();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.RespRef#getHostDemand <em>Host Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Demand</em>' attribute.
	 * @see #getHostDemand()
	 * @generated
	 */
	void setHostDemand(String value);

	/**
	 * Returns the value of the '<em><b>Resp Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resp Def</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resp Def</em>' attribute.
	 * @see #setRespDef(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getRespRef_RespDef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 * @generated
	 */
	String getRespDef();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.RespRef#getRespDef <em>Resp Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resp Def</em>' attribute.
	 * @see #getRespDef()
	 * @generated
	 */
	void setRespDef(String value);

} // RespRef
