/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftrace.metamodel.QUARCModel.Constraints;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.edit.spi.util.ECPModelElementChangeListener;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstact base eclass for all elements.
 * <!-- end-model-doc -->
 *
 *
 * @see org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage#getConstraintsBase()
 * @model abstract="true"
 * @generated
 */
public interface ConstraintsBase extends EObject {
	
	 /**
     * deletes the model element instance
     * @generated NOT
     */
    public void delete();
    
    /**
     * gets the ID of model element instance
     * @return the ID of model element instance
     * @generated NOT
     */
    public String getIdentifier();
    
    /**
     * adds the specified ModelElementChangeListener to the model element instance
     * @param listener a ModelElementChangeListener
     * @generated NOT
     */
    public void addModelElementChangeListener(ECPModelElementChangeListener listener);
    
    /**
     * removes the specified ModelElementChangeListener to the model element instance
     * @param listener a ModelElementChangeListener
     * @generated NOT
     */
    public void removeModelElementChangeListener(ECPModelElementChangeListener listener);
    
    
} // ConstraintsBase
