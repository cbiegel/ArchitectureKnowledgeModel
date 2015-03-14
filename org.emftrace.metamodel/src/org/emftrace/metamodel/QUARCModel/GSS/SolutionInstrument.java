/**
 */
package org.emftrace.metamodel.QUARCModel.GSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Instrument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A solution instrument
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument#getRelatedInstruments <em>Related Instruments</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSPackage#getSolutionInstrument()
 * @model abstract="true"
 * @generated
 */
public interface SolutionInstrument extends ConstrainedElement {
	/**
	 * Returns the value of the '<em><b>Related Instruments</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a list of related solution instruments
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Instruments</em>' reference list.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSPackage#getSolutionInstrument_RelatedInstruments()
	 * @model
	 * @generated
	 */
	EList<SolutionInstrument> getRelatedInstruments();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to a reference, book or paper etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(String)
	 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSPackage#getSolutionInstrument_Link()
	 * @model extendedMetaData="name='Decomposition'"
	 * @generated
	 */
	String getLink();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(String value);

} // SolutionInstrument
