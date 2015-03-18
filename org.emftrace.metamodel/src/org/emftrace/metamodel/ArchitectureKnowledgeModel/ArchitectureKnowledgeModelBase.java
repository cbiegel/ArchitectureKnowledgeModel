/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.edit.spi.util.ECPModelElementChangeListener;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Base</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelBase#getID
 * <em>ID</em>}</li>
 * <li>
 * {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelBase#getName
 * <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getArchitectureKnowledgeModelBase()
 * @model abstract="true"
 * @generated
 */
public interface ArchitectureKnowledgeModelBase extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getArchitectureKnowledgeModelBase_ID()
	 * @model dataType="org.emftrace.metamodel.ArchitectureKnowledgeModel.ID" required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '
	 * {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelBase#getID
	 * <em>ID</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getArchitectureKnowledgeModelBase_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelBase#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * deletes the model element instance
	 * 
	 * @generated NOT
	 */
	public void delete();

	/**
	 * gets the ID of model element instance
	 * 
	 * @return the ID of model element instance
	 * @generated NOT
	 */
	public String getIdentifier();

	/**
	 * adds the specified ModelElementChangeListener to the model element instance
	 * 
	 * @param listener
	 *            a ModelElementChangeListener
	 * @generated NOT
	 */
	public void addModelElementChangeListener(ECPModelElementChangeListener listener);

	/**
	 * removes the specified ModelElementChangeListener to the model element instance
	 * 
	 * @param listener
	 *            a ModelElementChangeListener
	 * @generated NOT
	 */
	public void removeModelElementChangeListener(ECPModelElementChangeListener listener);

} // ArchitectureKnowledgeModelBase
