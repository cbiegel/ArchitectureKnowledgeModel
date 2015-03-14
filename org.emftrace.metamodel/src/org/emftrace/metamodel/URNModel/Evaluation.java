/**
 */
package org.emftrace.metamodel.URNModel;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.Evaluation#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.Evaluation#getQualitativeEvaluation <em>Qualitative Evaluation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.Evaluation#getIntElement <em>Int Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getEvaluation()
 * @model
 * @generated
 */
public interface Evaluation extends URNBase {
	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation</em>' attribute.
	 * @see #setEvaluation(BigInteger)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getEvaluation_Evaluation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 * @generated
	 */
	BigInteger getEvaluation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.Evaluation#getEvaluation <em>Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation</em>' attribute.
	 * @see #getEvaluation()
	 * @generated
	 */
	void setEvaluation(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Qualitative Evaluation</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.URNModel.QualitativeLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualitative Evaluation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualitative Evaluation</em>' attribute.
	 * @see org.emftrace.metamodel.URNModel.QualitativeLabel
	 * @see #isSetQualitativeEvaluation()
	 * @see #unsetQualitativeEvaluation()
	 * @see #setQualitativeEvaluation(QualitativeLabel)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getEvaluation_QualitativeEvaluation()
	 * @model default="None" unsettable="true" required="true"
	 * @generated
	 */
	QualitativeLabel getQualitativeEvaluation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.Evaluation#getQualitativeEvaluation <em>Qualitative Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualitative Evaluation</em>' attribute.
	 * @see org.emftrace.metamodel.URNModel.QualitativeLabel
	 * @see #isSetQualitativeEvaluation()
	 * @see #unsetQualitativeEvaluation()
	 * @see #getQualitativeEvaluation()
	 * @generated
	 */
	void setQualitativeEvaluation(QualitativeLabel value);

	/**
	 * Unsets the value of the '{@link org.emftrace.metamodel.URNModel.Evaluation#getQualitativeEvaluation <em>Qualitative Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualitativeEvaluation()
	 * @see #getQualitativeEvaluation()
	 * @see #setQualitativeEvaluation(QualitativeLabel)
	 * @generated
	 */
	void unsetQualitativeEvaluation();

	/**
	 * Returns whether the value of the '{@link org.emftrace.metamodel.URNModel.Evaluation#getQualitativeEvaluation <em>Qualitative Evaluation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualitative Evaluation</em>' attribute is set.
	 * @see #unsetQualitativeEvaluation()
	 * @see #getQualitativeEvaluation()
	 * @see #setQualitativeEvaluation(QualitativeLabel)
	 * @generated
	 */
	boolean isSetQualitativeEvaluation();

	/**
	 * Returns the value of the '<em><b>Int Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Element</em>' attribute.
	 * @see #setIntElement(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getEvaluation_IntElement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 * @generated
	 */
	String getIntElement();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.Evaluation#getIntElement <em>Int Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Element</em>' attribute.
	 * @see #getIntElement()
	 * @generated
	 */
	void setIntElement(String value);

} // Evaluation
