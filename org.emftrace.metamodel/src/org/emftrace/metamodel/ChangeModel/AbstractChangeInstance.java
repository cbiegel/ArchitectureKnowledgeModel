/**
 */
package org.emftrace.metamodel.ChangeModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Change Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.ChangeModel.AbstractChangeInstance#getAbstractionLevel <em>Abstraction Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.ChangeModel.ChangeModelPackage#getAbstractChangeInstance()
 * @model abstract="true"
 * @generated
 */
public interface AbstractChangeInstance extends ChangeModelBase {
	/**
	 * Returns the value of the '<em><b>Abstraction Level</b></em>' attribute.
	 * The default value is <code>"Concrete"</code>.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.ChangeModel.AbstractionLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstraction Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstraction Level</em>' attribute.
	 * @see org.emftrace.metamodel.ChangeModel.AbstractionLevel
	 * @see #setAbstractionLevel(AbstractionLevel)
	 * @see org.emftrace.metamodel.ChangeModel.ChangeModelPackage#getAbstractChangeInstance_AbstractionLevel()
	 * @model default="Concrete" required="true"
	 * @generated
	 */
	AbstractionLevel getAbstractionLevel();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.ChangeModel.AbstractChangeInstance#getAbstractionLevel <em>Abstraction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstraction Level</em>' attribute.
	 * @see org.emftrace.metamodel.ChangeModel.AbstractionLevel
	 * @see #getAbstractionLevel()
	 * @generated
	 */
	void setAbstractionLevel(AbstractionLevel value);

} // AbstractChangeInstance
