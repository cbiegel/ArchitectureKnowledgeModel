/**
 */
package org.emftrace.metamodel.URNModel;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intentional Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.IntentionalElement#getType <em>Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.IntentionalElement#getDecompositionType <em>Decomposition Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.IntentionalElement#getImportance <em>Importance</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.IntentionalElement#getImportanceQuantitative <em>Importance Quantitative</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.IntentionalElement#getRefs <em>Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.IntentionalElement#getStyle <em>Style</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.IntentionalElement#getActor <em>Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getIntentionalElement()
 * @model
 * @generated
 */
public interface IntentionalElement extends GRLLinkableElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.URNModel.IntentionalElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.emftrace.metamodel.URNModel.IntentionalElementType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(IntentionalElementType)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getIntentionalElement_Type()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IntentionalElementType getType();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.emftrace.metamodel.URNModel.IntentionalElementType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(IntentionalElementType value);

	/**
	 * Unsets the value of the '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(IntentionalElementType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(IntentionalElementType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Decomposition Type</b></em>' attribute.
	 * The default value is <code>"AND"</code>.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.URNModel.DecompositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposition Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposition Type</em>' attribute.
	 * @see org.emftrace.metamodel.URNModel.DecompositionType
	 * @see #isSetDecompositionType()
	 * @see #unsetDecompositionType()
	 * @see #setDecompositionType(DecompositionType)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getIntentionalElement_DecompositionType()
	 * @model default="AND" unsettable="true" required="true"
	 * @generated
	 */
	DecompositionType getDecompositionType();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getDecompositionType <em>Decomposition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposition Type</em>' attribute.
	 * @see org.emftrace.metamodel.URNModel.DecompositionType
	 * @see #isSetDecompositionType()
	 * @see #unsetDecompositionType()
	 * @see #getDecompositionType()
	 * @generated
	 */
	void setDecompositionType(DecompositionType value);

	/**
	 * Unsets the value of the '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getDecompositionType <em>Decomposition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDecompositionType()
	 * @see #getDecompositionType()
	 * @see #setDecompositionType(DecompositionType)
	 * @generated
	 */
	void unsetDecompositionType();

	/**
	 * Returns whether the value of the '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getDecompositionType <em>Decomposition Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Decomposition Type</em>' attribute is set.
	 * @see #unsetDecompositionType()
	 * @see #getDecompositionType()
	 * @see #setDecompositionType(DecompositionType)
	 * @generated
	 */
	boolean isSetDecompositionType();

	/**
	 * Returns the value of the '<em><b>Importance</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.URNModel.ImportanceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importance</em>' attribute.
	 * @see org.emftrace.metamodel.URNModel.ImportanceType
	 * @see #isSetImportance()
	 * @see #unsetImportance()
	 * @see #setImportance(ImportanceType)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getIntentionalElement_Importance()
	 * @model default="None" unsettable="true" required="true"
	 * @generated
	 */
	ImportanceType getImportance();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getImportance <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importance</em>' attribute.
	 * @see org.emftrace.metamodel.URNModel.ImportanceType
	 * @see #isSetImportance()
	 * @see #unsetImportance()
	 * @see #getImportance()
	 * @generated
	 */
	void setImportance(ImportanceType value);

	/**
	 * Unsets the value of the '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getImportance <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImportance()
	 * @see #getImportance()
	 * @see #setImportance(ImportanceType)
	 * @generated
	 */
	void unsetImportance();

	/**
	 * Returns whether the value of the '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getImportance <em>Importance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Importance</em>' attribute is set.
	 * @see #unsetImportance()
	 * @see #getImportance()
	 * @see #setImportance(ImportanceType)
	 * @generated
	 */
	boolean isSetImportance();

	/**
	 * Returns the value of the '<em><b>Importance Quantitative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importance Quantitative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importance Quantitative</em>' attribute.
	 * @see #setImportanceQuantitative(BigInteger)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getIntentionalElement_ImportanceQuantitative()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 * @generated
	 */
	BigInteger getImportanceQuantitative();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getImportanceQuantitative <em>Importance Quantitative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importance Quantitative</em>' attribute.
	 * @see #getImportanceQuantitative()
	 * @generated
	 */
	void setImportanceQuantitative(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Refs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs</em>' attribute list.
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getIntentionalElement_Refs()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 * @generated
	 */
	EList<String> getRefs();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(ConcreteStyle)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getIntentionalElement_Style()
	 * @model containment="true"
	 * @generated
	 */
	ConcreteStyle getStyle();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(ConcreteStyle value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' attribute.
	 * @see #setActor(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getIntentionalElement_Actor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 * @generated
	 */
	String getActor();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getActor <em>Actor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' attribute.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(String value);

} // IntentionalElement
