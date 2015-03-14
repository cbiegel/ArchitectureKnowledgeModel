/**
 */
package org.emftrace.metamodel.FeatureModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.Relations#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.Relations#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.FeatureModel.FeatureModelPackage#getRelations()
 * @model
 * @generated
 */
public interface Relations extends FeatureModelBase {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.emftrace.metamodel.FeatureModel.FeatureModelPackage#getRelations_Class()
	 * @model unique="false" dataType="org.emftrace.metamodel.FeatureModel.PooledString" required="true"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.FeatureModel.Relations#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.FeatureModel.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see org.emftrace.metamodel.FeatureModel.FeatureModelPackage#getRelations_Relation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelation();

} // Relations
