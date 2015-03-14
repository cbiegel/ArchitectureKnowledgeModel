/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ActivityPartition#isIsDimension <em>Is Dimension</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ActivityPartition#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ActivityPartition#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ActivityPartition#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ActivityPartition#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ActivityPartition#getNode <em>Node</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.ActivityPartition#getSubpartition <em>Subpartition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getActivityPartition()
 * @model
 * @generated
 */
public interface ActivityPartition extends NamedElement, ActivityGroup {
	/**
	 * Returns the value of the '<em><b>Is Dimension</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Dimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Dimension</em>' attribute.
	 * @see #setIsDimension(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getActivityPartition_IsDimension()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDimension();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ActivityPartition#isIsDimension <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Dimension</em>' attribute.
	 * @see #isIsDimension()
	 * @generated
	 */
	void setIsDimension(boolean value);

	/**
	 * Returns the value of the '<em><b>Is External</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is External</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is External</em>' attribute.
	 * @see #setIsExternal(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getActivityPartition_IsExternal()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsExternal();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ActivityPartition#isIsExternal <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is External</em>' attribute.
	 * @see #isIsExternal()
	 * @generated
	 */
	void setIsExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' attribute.
	 * @see #setEdge(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getActivityPartition_Edge()
	 * @model
	 * @generated
	 */
	String getEdge();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ActivityPartition#getEdge <em>Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge</em>' attribute.
	 * @see #getEdge()
	 * @generated
	 */
	void setEdge(String value);

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' attribute.
	 * @see #setRepresents(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getActivityPartition_Represents()
	 * @model
	 * @generated
	 */
	String getRepresents();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ActivityPartition#getRepresents <em>Represents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' attribute.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(String value);

	/**
	 * Returns the value of the '<em><b>Super Partition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Partition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Partition</em>' attribute.
	 * @see #setSuperPartition(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getActivityPartition_SuperPartition()
	 * @model
	 * @generated
	 */
	String getSuperPartition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ActivityPartition#getSuperPartition <em>Super Partition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Partition</em>' attribute.
	 * @see #getSuperPartition()
	 * @generated
	 */
	void setSuperPartition(String value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getActivityPartition_Node()
	 * @model
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ActivityPartition#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

	/**
	 * Returns the value of the '<em><b>Subpartition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subpartition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpartition</em>' attribute.
	 * @see #setSubpartition(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getActivityPartition_Subpartition()
	 * @model
	 * @generated
	 */
	String getSubpartition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.ActivityPartition#getSubpartition <em>Subpartition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subpartition</em>' attribute.
	 * @see #getSubpartition()
	 * @generated
	 */
	void setSubpartition(String value);

} // ActivityPartition
