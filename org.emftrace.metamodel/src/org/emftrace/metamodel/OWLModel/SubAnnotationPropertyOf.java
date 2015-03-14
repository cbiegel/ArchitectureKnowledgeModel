/**
 */
package org.emftrace.metamodel.OWLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Annotation Property Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubAnnotationPropertyOf#getAnnotationProperty <em>Annotation Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubAnnotationPropertyOf()
 * @model
 * @generated
 */
public interface SubAnnotationPropertyOf extends AnnotationAxiom {
	/**
	 * Returns the value of the '<em><b>Annotation Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.AnnotationProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Property</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubAnnotationPropertyOf_AnnotationProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AnnotationProperty> getAnnotationProperty();

} // SubAnnotationPropertyOf
