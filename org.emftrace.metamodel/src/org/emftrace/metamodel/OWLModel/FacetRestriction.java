/**
 */
package org.emftrace.metamodel.OWLModel;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.FacetRestriction#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.FacetRestriction#getBase <em>Base</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.FacetRestriction#getFacet <em>Facet</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.FacetRestriction#getId <em>Id</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.FacetRestriction#getLang <em>Lang</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.FacetRestriction#getSpace <em>Space</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getFacetRestriction()
 * @model
 * @generated
 */
public interface FacetRestriction extends OWLBase {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference.
	 * @see #setLiteral(Literal)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getFacetRestriction_Literal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Literal getLiteral();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.FacetRestriction#getLiteral <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' containment reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(Literal value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(String)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getFacetRestriction_Base()
	 * @model
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.FacetRestriction#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Facet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facet</em>' attribute.
	 * @see #setFacet(String)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getFacetRestriction_Facet()
	 * @model required="true"
	 * @generated
	 */
	String getFacet();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.FacetRestriction#getFacet <em>Facet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facet</em>' attribute.
	 * @see #getFacet()
	 * @generated
	 */
	void setFacet(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getFacetRestriction_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.FacetRestriction#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getFacetRestriction_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.FacetRestriction#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Space</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.ecore.xml.namespace.SpaceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' attribute.
	 * @see org.eclipse.emf.ecore.xml.namespace.SpaceType
	 * @see #isSetSpace()
	 * @see #unsetSpace()
	 * @see #setSpace(SpaceType)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getFacetRestriction_Space()
	 * @model unsettable="true"
	 * @generated
	 */
	SpaceType getSpace();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.FacetRestriction#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' attribute.
	 * @see org.eclipse.emf.ecore.xml.namespace.SpaceType
	 * @see #isSetSpace()
	 * @see #unsetSpace()
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(SpaceType value);

	/**
	 * Unsets the value of the '{@link org.emftrace.metamodel.OWLModel.FacetRestriction#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpace()
	 * @see #getSpace()
	 * @see #setSpace(SpaceType)
	 * @generated
	 */
	void unsetSpace();

	/**
	 * Returns whether the value of the '{@link org.emftrace.metamodel.OWLModel.FacetRestriction#getSpace <em>Space</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Space</em>' attribute is set.
	 * @see #unsetSpace()
	 * @see #getSpace()
	 * @see #setSpace(SpaceType)
	 * @generated
	 */
	boolean isSetSpace();

} // FacetRestriction
