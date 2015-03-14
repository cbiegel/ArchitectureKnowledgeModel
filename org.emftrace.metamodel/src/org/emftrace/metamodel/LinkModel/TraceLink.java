/**
 */
package org.emftrace.metamodel.LinkModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.LinkModel.TraceLink#getDesignDecision <em>Design Decision</em>}</li>
 *   <li>{@link org.emftrace.metamodel.LinkModel.TraceLink#getType <em>Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.LinkModel.TraceLink#getCreatedByRule <em>Created By Rule</em>}</li>
 *   <li>{@link org.emftrace.metamodel.LinkModel.TraceLink#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.emftrace.metamodel.LinkModel.TraceLink#getLastVisited <em>Last Visited</em>}</li>
 *   <li>{@link org.emftrace.metamodel.LinkModel.TraceLink#getSource <em>Source</em>}</li>
 *   <li>{@link org.emftrace.metamodel.LinkModel.TraceLink#getTarget <em>Target</em>}</li>
 *   <li>{@link org.emftrace.metamodel.LinkModel.TraceLink#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.LinkModel.LinkModelPackage#getTraceLink()
 * @model
 * @generated
 */
public interface TraceLink extends TraceElement {
	/**
	 * Returns the value of the '<em><b>Design Decision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Decision</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Decision</em>' containment reference.
	 * @see #setDesignDecision(DesignDecision)
	 * @see org.emftrace.metamodel.LinkModel.LinkModelPackage#getTraceLink_DesignDecision()
	 * @model containment="true"
	 * @generated
	 */
	DesignDecision getDesignDecision();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.LinkModel.TraceLink#getDesignDecision <em>Design Decision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Decision</em>' containment reference.
	 * @see #getDesignDecision()
	 * @generated
	 */
	void setDesignDecision(DesignDecision value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(LinkType)
	 * @see org.emftrace.metamodel.LinkModel.LinkModelPackage#getTraceLink_Type()
	 * @model required="true"
	 * @generated
	 */
	LinkType getType();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.LinkModel.TraceLink#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(LinkType value);

	/**
	 * Returns the value of the '<em><b>Created By Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By Rule</em>' attribute.
	 * @see #setCreatedByRule(String)
	 * @see org.emftrace.metamodel.LinkModel.LinkModelPackage#getTraceLink_CreatedByRule()
	 * @model
	 * @generated
	 */
	String getCreatedByRule();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.LinkModel.TraceLink#getCreatedByRule <em>Created By Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By Rule</em>' attribute.
	 * @see #getCreatedByRule()
	 * @generated
	 */
	void setCreatedByRule(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified</em>' attribute.
	 * @see #setLastModified(String)
	 * @see org.emftrace.metamodel.LinkModel.LinkModelPackage#getTraceLink_LastModified()
	 * @model required="true"
	 * @generated
	 */
	String getLastModified();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.LinkModel.TraceLink#getLastModified <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(String value);

	/**
	 * Returns the value of the '<em><b>Last Visited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Visited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Visited</em>' attribute.
	 * @see #setLastVisited(String)
	 * @see org.emftrace.metamodel.LinkModel.LinkModelPackage#getTraceLink_LastVisited()
	 * @model required="true"
	 * @generated
	 */
	String getLastVisited();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.LinkModel.TraceLink#getLastVisited <em>Last Visited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Visited</em>' attribute.
	 * @see #getLastVisited()
	 * @generated
	 */
	void setLastVisited(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EObject)
	 * @see org.emftrace.metamodel.LinkModel.LinkModelPackage#getTraceLink_Source()
	 * @model required="true"
	 * @generated
	 */
	EObject getSource();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.LinkModel.TraceLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EObject value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EObject)
	 * @see org.emftrace.metamodel.LinkModel.LinkModelPackage#getTraceLink_Target()
	 * @model required="true"
	 * @generated
	 */
	EObject getTarget();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.LinkModel.TraceLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EObject value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.emftrace.metamodel.LinkModel.LinkModelPackage#getTraceLink_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.LinkModel.TraceLink#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // TraceLink
