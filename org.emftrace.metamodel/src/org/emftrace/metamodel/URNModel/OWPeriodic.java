/**
 */
package org.emftrace.metamodel.URNModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OW Periodic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.OWPeriodic#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.emftrace.metamodel.URNModel.OWPeriodic#getDeviation <em>Deviation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getOWPeriodic()
 * @model
 * @generated
 */
public interface OWPeriodic extends OpenWorkload {
	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getOWPeriodic_Period()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getPeriod();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.OWPeriodic#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(String value);

	/**
	 * Returns the value of the '<em><b>Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviation</em>' attribute.
	 * @see #setDeviation(String)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getOWPeriodic_Deviation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getDeviation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.OWPeriodic#getDeviation <em>Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deviation</em>' attribute.
	 * @see #getDeviation()
	 * @generated
	 */
	void setDeviation(String value);

} // OWPeriodic
