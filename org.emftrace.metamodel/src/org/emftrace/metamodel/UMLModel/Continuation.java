/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Continuation#isSetting <em>Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getContinuation()
 * @model
 * @generated
 */
public interface Continuation extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Setting</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting</em>' attribute.
	 * @see #setSetting(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getContinuation_Setting()
	 * @model default="true" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isSetting();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Continuation#isSetting <em>Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting</em>' attribute.
	 * @see #isSetting()
	 * @generated
	 */
	void setSetting(boolean value);

} // Continuation
