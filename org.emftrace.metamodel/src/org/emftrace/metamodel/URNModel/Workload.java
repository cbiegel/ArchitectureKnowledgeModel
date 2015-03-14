/**
 */
package org.emftrace.metamodel.URNModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.URNModel.Workload#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getWorkload()
 * @model
 * @generated
 */
public interface Workload extends UCMmodelElement {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>"ms"</code>.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.URNModel.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.emftrace.metamodel.URNModel.TimeUnit
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(TimeUnit)
	 * @see org.emftrace.metamodel.URNModel.URNModelPackage#getWorkload_Unit()
	 * @model default="ms" unsettable="true" required="true"
	 * @generated
	 */
	TimeUnit getUnit();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.URNModel.Workload#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.emftrace.metamodel.URNModel.TimeUnit
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnit value);

	/**
	 * Unsets the value of the '{@link org.emftrace.metamodel.URNModel.Workload#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(TimeUnit)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link org.emftrace.metamodel.URNModel.Workload#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(TimeUnit)
	 * @generated
	 */
	boolean isSetUnit();

} // Workload
