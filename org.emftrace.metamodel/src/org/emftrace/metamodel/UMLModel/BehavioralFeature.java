/**
 */
package org.emftrace.metamodel.UMLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.BehavioralFeature#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.BehavioralFeature#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.BehavioralFeature#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.BehavioralFeature#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.BehavioralFeature#getOwnedParameterSet <em>Owned Parameter Set</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.BehavioralFeature#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBehavioralFeature()
 * @model abstract="true"
 * @generated
 */
public interface BehavioralFeature extends Namespace, Feature {
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
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBehavioralFeature_OwnedParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBehavioralFeature_IsAbstract()
	 * @model default="false" dataType="org.emftrace.metamodel.UMLModel.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.BehavioralFeature#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
	 * The default value is <code>"sequential"</code>.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.UMLModel.CallConcurrencyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.CallConcurrencyKind
	 * @see #setConcurrency(CallConcurrencyKind)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBehavioralFeature_Concurrency()
	 * @model default="sequential" required="true" ordered="false"
	 * @generated
	 */
	CallConcurrencyKind getConcurrency();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.BehavioralFeature#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' attribute.
	 * @see org.emftrace.metamodel.UMLModel.CallConcurrencyKind
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(CallConcurrencyKind value);

	/**
	 * Returns the value of the '<em><b>Raised Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raised Exception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raised Exception</em>' attribute.
	 * @see #setRaisedException(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBehavioralFeature_RaisedException()
	 * @model
	 * @generated
	 */
	String getRaisedException();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.BehavioralFeature#getRaisedException <em>Raised Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raised Exception</em>' attribute.
	 * @see #getRaisedException()
	 * @generated
	 */
	void setRaisedException(String value);

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
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBehavioralFeature_OwnedParameterSet()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ParameterSet> getOwnedParameterSet();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getBehavioralFeature_Method()
	 * @model
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.BehavioralFeature#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

} // BehavioralFeature
