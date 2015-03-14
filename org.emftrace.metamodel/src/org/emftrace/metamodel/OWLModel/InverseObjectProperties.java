/**
 */
package org.emftrace.metamodel.OWLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inverse Object Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.InverseObjectProperties#getObjectProperty <em>Object Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.InverseObjectProperties#getObjectInverseOf <em>Object Inverse Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getInverseObjectProperties()
 * @model
 * @generated
 */
public interface InverseObjectProperties extends ObjectPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>Object Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.ObjectProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Property</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getInverseObjectProperties_ObjectProperty()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<ObjectProperty> getObjectProperty();

	/**
	 * Returns the value of the '<em><b>Object Inverse Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.ObjectInverseOf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Inverse Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Inverse Of</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getInverseObjectProperties_ObjectInverseOf()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<ObjectInverseOf> getObjectInverseOf();

} // InverseObjectProperties
