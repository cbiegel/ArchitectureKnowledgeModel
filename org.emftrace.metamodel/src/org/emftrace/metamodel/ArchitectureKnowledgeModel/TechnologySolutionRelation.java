/**
 */
package org.emftrace.metamodel.ArchitectureKnowledgeModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology Solution Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionRelation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionRelation#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionRelation#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionRelation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getTechnologySolutionRelation()
 * @model
 * @generated
 */
public interface TechnologySolutionRelation extends ArchitectureKnowledgeModelBase {
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
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getTechnologySolutionRelation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionRelation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' reference.
	 * @see #setSourceElement(RelationSourceType)
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getTechnologySolutionRelation_SourceElement()
	 * @model required="true"
	 * @generated
	 */
	RelationSourceType getSourceElement();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionRelation#getSourceElement <em>Source Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' reference.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(RelationSourceType value);

	/**
	 * Returns the value of the '<em><b>Target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element</em>' reference.
	 * @see #setTargetElement(RelationTargetType)
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getTechnologySolutionRelation_TargetElement()
	 * @model required="true"
	 * @generated
	 */
	RelationTargetType getTargetElement();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionRelation#getTargetElement <em>Target Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' reference.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(RelationTargetType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.ArchitectureKnowledgeModel.SolutionAndFeatureRelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.SolutionAndFeatureRelationType
	 * @see #setType(SolutionAndFeatureRelationType)
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelPackage#getTechnologySolutionRelation_Type()
	 * @model required="true"
	 * @generated
	 */
	SolutionAndFeatureRelationType getType();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolutionRelation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.emftrace.metamodel.ArchitectureKnowledgeModel.SolutionAndFeatureRelationType
	 * @see #getType()
	 * @generated
	 */
	void setType(SolutionAndFeatureRelationType value);

} // TechnologySolutionRelation
