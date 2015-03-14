/**
 */
package org.emftrace.metamodel.UMLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Behavior#isIsReentrant <em>Is Reentrant</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Behavior#getRedefinedBahavior <em>Redefined Bahavior</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Behavior#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Behavior#getOwnedParameterSet <em>Owned Parameter Set</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Behavior#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Behavior#getContext <em>Context</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Behavior#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.Behavior#getPrecondition <em>Precondition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBehavior()
 * @model abstract="true"
 * @generated
 */
public interface Behavior extends org.emftrace.metamodel.UMLModel.Class {
	/**
	 * Returns the value of the '<em><b>Is Reentrant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reentrant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reentrant</em>' attribute.
	 * @see #setIsReentrant(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBehavior_IsReentrant()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsReentrant();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Behavior#isIsReentrant <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reentrant</em>' attribute.
	 * @see #isIsReentrant()
	 * @generated
	 */
	void setIsReentrant(boolean value);

	/**
	 * Returns the value of the '<em><b>Redefined Bahavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Bahavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Bahavior</em>' attribute.
	 * @see #setRedefinedBahavior(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBehavior_RedefinedBahavior()
	 * @model
	 * @generated
	 */
	String getRedefinedBahavior();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Behavior#getRedefinedBahavior <em>Redefined Bahavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Bahavior</em>' attribute.
	 * @see #getRedefinedBahavior()
	 * @generated
	 */
	void setRedefinedBahavior(String value);

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBehavior_OwnedParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.UMLModel.ParameterSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter Set</em>' containment reference list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBehavior_OwnedParameterSet()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ParameterSet> getOwnedParameterSet();

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' attribute.
	 * @see #setSpecification(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBehavior_Specification()
	 * @model
	 * @generated
	 */
	String getSpecification();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Behavior#getSpecification <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' attribute.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBehavior_Context()
	 * @model
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Behavior#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' attribute.
	 * @see #setPostcondition(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBehavior_Postcondition()
	 * @model
	 * @generated
	 */
	String getPostcondition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Behavior#getPostcondition <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcondition</em>' attribute.
	 * @see #getPostcondition()
	 * @generated
	 */
	void setPostcondition(String value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' attribute.
	 * @see #setPrecondition(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBehavior_Precondition()
	 * @model
	 * @generated
	 */
	String getPrecondition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.Behavior#getPrecondition <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' attribute.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(String value);

} // Behavior
