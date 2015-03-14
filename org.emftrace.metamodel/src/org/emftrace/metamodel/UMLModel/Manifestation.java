/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifestation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Manifestation#getUtilizedElement <em>Utilized Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getManifestation()
 * @model
 * @generated
 */
public interface Manifestation extends Abstraction {
	/**
	 * Returns the value of the '<em><b>Utilized Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilized Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilized Element</em>' attribute.
	 * @see #setUtilizedElement(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getManifestation_UtilizedElement()
	 * @model required="true"
	 * @generated
	 */
	String getUtilizedElement();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Manifestation#getUtilizedElement <em>Utilized Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilized Element</em>' attribute.
	 * @see #getUtilizedElement()
	 * @generated
	 */
	void setUtilizedElement(String value);

} // Manifestation
