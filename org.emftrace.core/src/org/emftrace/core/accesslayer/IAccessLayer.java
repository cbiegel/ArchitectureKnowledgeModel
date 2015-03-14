/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.accesslayer;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.core.ECPProject;

/**
 * This is the interface for the AccessLayer-component of EMFTrace. Instances of this component 
 * will be used to access the models stored in EMFStore.
 * 
 * @author Steffen Lehnert
 * @version 1.0
 */
public interface IAccessLayer
{   
    /**
     * Adds a {@link EObject model} to a {@link ECPProject project}
     *  
     * @param project the current project
     * @param element the newly created element
     */
    public void addElement(ECPProject project, EObject element);
        
    /**
     * Removes a {@link EObject model} from a {@link ECPProject project}
     * 
     * @param project the current project
     * @param element the model to be deleted
     */
    public void removeElement(ECPProject project, EObject element);
    
    /**
     * Returns a {@link List list} of {@link EObject models} specified by their {@link EClass class}
     * 
     * @param project the current project
     * @param eclass  the class of the models that should be retrieved
     * @return A {@link List} of {@link EObject}-objects
     */
    public List<EObject> getElements(ECPProject project, EClass eclass);
    
    /**
     * Returns a {@link List list} of {@link EObject models} specified by the name of their class
     * 
     * @param project   the current project
     * @param classname the classname of the models that should be retrieved
     * @return A {@link List} of {@link EObject}-objects
     */
    public List<EObject> getElements(ECPProject project, String classname);
    
    /**
     * Returns a {@link List list} of all {@link EObject models} contained by a {@link ECPProject project}
     * 
     * @param project the current project
     * @return A {@link List} of {@link EObject}-objects
     */
    public List<EObject> getAllElements(ECPProject project);
    
    /**
     * Returns an {@link EAttribute attribute} from a {@link EObject model}, specified by its name or null
     * 
     * @param element       the {@link EObject} where the attribute should be retrieved from
     * @param attributeName the name of the {@link EAttribute} 
     * @return A {@link EAttribute} specified by its name or null
     */
    public EAttribute getAttribute(EObject element, String attributeName);
    
    /**
     * Returns a {@link List list} containing all the elements {@link EAttribute attributes}
     * 
     * @param element the model 
     * @return A {@link List} of {@link EAttribute}-objects
     */
    public List<EAttribute> getAttributes(EObject element);
    
    /**
     * Returns an {@link EReference reference} from a {@link EObject model}, specified by its name or null
     * 
     * @param element       the model
     * @param referenceName the name of the {@link EReference} 
     * @return  A {@link EReference} specified by its name or null
     */
    public EReference getReference(EObject element, String referenceName);
    
    /**
     * Returns a {@link List list} containing all the elements {@link EReference references}
     * 
     * @param element the model 
     * @return A {@link List} of {@link EReference}-objects
     */
    public List<EReference> getReferences(EObject element);
    
    /**
     * Returns the value of the {@link EAttribute attribute} or null if the attribute doesn't exist
     * 
     * @param element   the element containing the attribute
     * @param attribute the name of the attribute
     * @return A {@link String} representing the value of the attribute
     */
    public String getAttributeValue(EObject element, String attribute);
    
    /**
     * Returns the value of the {@link EAttribute attribute} or null if the attribute doesn't exist
     * 
     * @param element         the element containing the attribute
     * @param attribute       the name of the attribute
     * @param referencedModel the name of the model stored as reference
     * @return A {@link String} representing the value of the attribute
     */
    public String getAttributeValue(EObject element, String referencedModel, String attribute);
        
    /**
     * Returns a {@link List list} containing all direct and indirect {@link EObject children} of the model
     * 
     * @param element the model
     * @return A {@link List} of {@link EObject}-objects
     */
    public List<EObject> getAllChildren(EObject element);
    
    /**
     * Returns a {@link List list} containing only the direct {@link EObject children} of the model
     * 
     * @param element the model 
     * @return A {@link List} of {@link EObject}-objects
     */
    public List<EObject> getDirectChildren(EObject element);
    
    /**
     * Returns the parent element of a {@link EObject model}
     * 
     * @param element the model
     * @return the model's parent or null
     */
    public EObject getParent(EObject element);
    
    /**
     * Invalidates the cache and removes all elements from it
     * 
     * @param project the project whose data should be removed 
     */
    public void invalidateCache(ECPProject project);
    
    /**
     * Adjust the commit-behavior of this manager, i.e. if changes should be committed immediately or as a bulk
     * 
     * @param commitStyle the new commit-state
     */
    public void setCommitImmediately(boolean commitStyle);
    
    /**
     * Notifies the specified {@link ECPProject project} of a change and flags the project as dirty
     * and adds / removes the {@link EObject element} to the cache
     * 
     * @param project the project that has been altered
     * @param element the element that should be added / removed
     * @param delete  indicates whether a deletion or an insertion are reported
     */
    public void notifyProject(ECPProject project, EObject element, boolean delete);
    
    /**
     * Notifies the specified {@link ECPProject project} of a change and flags the project as dirty
     * 
     * @param project the project that has been altered
     */
    public void notifyProject(ECPProject project);
    
    /**
     * Performs the commit-operation for the specified {@link ECPProject project}
     * 
     * @param project the project that should be committed
     */
    public void commitProject(ECPProject project);
    
    /**
     * Performs the commit-operation for each {@link ECPProject project} observed by this manager
     */
    public void commitProjects();

    /**
     * Returns whether the AccessLayer commits right after a change has been
     * recognized
     * 
     * @return true if the AccessLayer commits right after a change took place
     */
    public boolean commitsImmediately();
    
    /**
     * Returns the name of the model, if no name is available, it will return the
     * name of its class
     * 
     * @param model the model
     * @return a name for the model 
     */
    public String getNameOfModel(EObject model);
}
