/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature#getCapabilityType <em>Capability Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature#getASTA <em>ASTA</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getTechnologyFeature()
 * @model
 * @generated
 */
public interface TechnologyFeature extends RelationSourceType, RelationTargetType {
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
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getTechnologyFeature_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Capability Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.CapabilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Type</em>' attribute.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.CapabilityType
	 * @see #setCapabilityType(CapabilityType)
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getTechnologyFeature_CapabilityType()
	 * @model required="true"
	 * @generated
	 */
	CapabilityType getCapabilityType();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature#getCapabilityType <em>Capability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Type</em>' attribute.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.CapabilityType
	 * @see #getCapabilityType()
	 * @generated
	 */
	void setCapabilityType(CapabilityType value);

	/**
	 * Returns the value of the '<em><b>ASTA</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ASTA</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ASTA</em>' reference list.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getTechnologyFeature_ASTA()
	 * @model
	 * @generated
	 */
	EList<ASTA> getASTA();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' reference list.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getTechnologyFeature_Relations()
	 * @model
	 * @generated
	 */
	EList<Relation> getRelations();

} // TechnologyFeature
