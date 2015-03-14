/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Feature Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.StructuralFeatureAction#getStructuralFeature <em>Structural Feature</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.StructuralFeatureAction#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getStructuralFeatureAction()
 * @model abstract="true"
 * @generated
 */
public interface StructuralFeatureAction extends Action {
	/**
	 * Returns the value of the '<em><b>Structural Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structural Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Feature</em>' attribute.
	 * @see #setStructuralFeature(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getStructuralFeatureAction_StructuralFeature()
	 * @model required="true"
	 * @generated
	 */
	String getStructuralFeature();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.StructuralFeatureAction#getStructuralFeature <em>Structural Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Feature</em>' attribute.
	 * @see #getStructuralFeature()
	 * @generated
	 */
	void setStructuralFeature(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getStructuralFeatureAction_Object()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.StructuralFeatureAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

} // StructuralFeatureAction
