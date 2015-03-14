/**
 */
package org.emftrace.metamodel.EMFfitModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypertext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.EMFfitModel.Hypertext#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getHypertext()
 * @model
 * @generated
 */
public interface Hypertext extends FTICBase {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.EMFfitModel.TextElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage#getHypertext_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElement> getContent();

} // Hypertext
