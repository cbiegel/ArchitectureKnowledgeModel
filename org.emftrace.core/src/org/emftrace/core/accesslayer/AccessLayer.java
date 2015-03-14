/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.accesslayer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.core.ECPProject;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class AccessLayer implements IAccessLayer
{           
    /**
     * Indicates whether changes are being forwarded directly to the repository
     */
    private boolean commitImmediately;
    
    /**
     * The local cache for model elements
     */
    private ModelElementCache cache;
         
    ///////////////////////////////////////////////////////////////////////////
        
    /**
     * Constructor
     */
    public AccessLayer()
    {
    	init();
        commitImmediately = false;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Constructor
     * 
     * @param commitStyle indicates whether changes will be committed immediately
     */
    public AccessLayer(boolean commitStyle)
    {
    	init();
    	commitImmediately = commitStyle;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Initialize the {@link AccessLayer}
     */
    private void init()
    {
    	cache = new ModelElementCache();
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void addElement(ECPProject project, EObject element)
    {
        if( project == null || element == null ) return;
                
        project.getContents().add(element);
        notifyProject(project, element, false);
    }
        
    ///////////////////////////////////////////////////////////////////////////
    
    public void commitProject(ECPProject project)
    {
        if( project != null && project.hasDirtyContents() )
        {
        	project.saveContents();
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void commitProjects()
    {
    	List<ECPProject> projects = cache.getProjects();
    	
    	for(int i = 0; i< projects.size(); i++)
    		projects.get(i).saveContents();
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public List<EObject> getAllChildren(EObject element)
    {
    	List<EObject> result = new ArrayList<EObject>();
    	
        if( element == null ) return result;
        
        result.addAll(element.eContents());
        
        for(int i = 0; i < element.eContents().size(); i++)
        	result.addAll(getAllChildren(element.eContents().get(i)));
                
        return result;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public List<EObject> getDirectChildren(EObject element)
    {
    	List<EObject> result = new ArrayList<EObject>();
    	
        if( element == null ) return result;
        
        result.addAll(element.eContents());
        
        return result;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public EObject getParent(EObject element)
    {
        if( element == null ) return null;
        else return element.eContainer();
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public EAttribute getAttribute(EObject element, String attribute)
    {
        if( element == null || attribute == null ) return null;
        
        List<EAttribute> attributes = getAttributes(element);
        
        if( attributes == null ) return null;
        
        for( int i = 0; i < attributes.size(); i++ )
            if( (attributes.get(i).getName()).equalsIgnoreCase(attribute) )
                return attributes.get(i);
        
        return null;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public List<EAttribute> getAttributes(EObject element)
    {
        if( element == null ) return null;
        return element.eClass().getEAllAttributes();
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public EReference getReference(EObject element, String referenceName)
    {
        if( element == null || referenceName == null ) return null;
        
        List<EReference> references = getReferences(element);
        
        if( references == null ) return null;
        
        for( int i = 0; i < references.size(); i++ )
            if( (references.get(i).getName()).equalsIgnoreCase(referenceName) )
                return references.get(i);
        
        return null;
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public List<EReference> getReferences(EObject element)
    {
        if( element == null ) return null;
        return element.eClass().getEAllReferences();
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public String getAttributeValue(EObject element, String attributeName)
    {
        if( element == null || attributeName == null ) return null;
        
        String value = null;
                
        if( getAttribute(element, attributeName) != null && element.eGet(getAttribute(element, attributeName)) != null )
            value = element.eGet(getAttribute(element, attributeName)).toString();
        else
            if( getReference(element, attributeName) != null && element.eGet(getReference(element, attributeName)) != null )
                value = element.eGet(getReference(element, attributeName)).toString();
        
        return value;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public String getAttributeValue(EObject element, String referencedModel, String attribute)
    {
        if( element == null || referencedModel == null || attribute == null ) return null;
        
        EReference ref = getReference(element, referencedModel);
                
        if( ref != null && ref.getUpperBound() == 1 )
        {
            EObject model = (EObject) element.eGet(ref);    
            return getAttributeValue(model, attribute);
        }
        
        return null;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public List<EObject> getAllElements(ECPProject project)
    {
        if( project == null ) return null;
        
        List<EObject> result = new ArrayList<EObject>();
        for(int i = 0; i < project.getContents().size(); i++)
        {
        	result.add((EObject) project.getContents().get(i));
        	result.addAll(getAllChildren((EObject) project.getContents().get(i)));
        }
        
        return result;
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public List<EObject> getElements(ECPProject project, EClass eclass)
    {
        if( eclass == null ) return null;
        return getElements(project, eclass.getName());
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public List<EObject> getElements(ECPProject project, String classname)
    {
        if( project == null || classname == null ) return new ArrayList<EObject>();
        else
        {
        	if( !cache.containsProject(project) )
            {
        		cache.addProject(project);
                                
                List<EObject> list = getAllElements(project);
                List<EObject> result = new ArrayList<EObject>();

                // ask the EMFStore and add the result to the cache:
                for(int i = 0; i < list.size(); i++)
                {
                    if( list.get(i).eClass().getName().equalsIgnoreCase(classname) )
                    {
                        result.add(list.get(i));
                        cache.insert(project, list.get(i));
                    }
                } 
                
                return result;
            }
                                    
            List<EObject> result = cache.get(project, classname);
            
            // the elements could not be obtained from the cache:
            if( result == null )
            {
                List<EObject> list = getAllElements(project);
                result = new ArrayList<EObject>();
                
                // ask the EMFStore and add the result to the cache:
                for(int i = 0; i < list.size(); i++)
                {
                    if( list.get(i).eClass().getName().equalsIgnoreCase(classname) )
                    {
                        result.add(list.get(i));
                        cache.insert(project, list.get(i));
                    }
                }                
                
             }  
            
            return result;
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void notifyProject(ECPProject project, EObject element, boolean delete)
    {
        if( project == null || element == null ) return;
        else
        {            
            if( !cache.containsProject(project) && !delete )
            {
            	cache.addProject(project);
            	
            	if( !delete ) cache.insert(project, element);
            }
            else 
            {
                if( delete ) cache.remove(project, element);
                else         cache.insert(project, element);
            }
            
            if( commitImmediately ) commitProject(project);
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void notifyProject(ECPProject project)
    {
        if( project == null ) return;
        else
        {
            if( !cache.containsProject(project) ) cache.addProject(project);
            
            if( commitImmediately ) commitProject(project);
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void removeElement(ECPProject project, EObject element)
    {
        if( project == null || element == null ) return;
        else
        {        	
        	Collection<Object> temp = new ArrayList<Object>();
        	temp.add(element);
        	
        	project.deleteElements(temp);
            notifyProject(project, element, true);
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void setCommitImmediately(boolean commitStyle)
    {
        commitImmediately = commitStyle;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public boolean commitsImmediately()
    {
        return commitImmediately;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void invalidateCache(ECPProject project)
    {
    	cache.clear(project);
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public String getNameOfModel(EObject model)
    {
        if( model == null ) return null;
        
        String name = getAttributeValue(model, "Name");
        
        if( name == null || name.equals("") ) name = getAttributeValue(model, "name");       
        if( name == null || name.equals("") ) name = getAttributeValue(model, "IRI");
        if( name == null || name.equals("") ) name = getAttributeValue(model, "fullIRI");
        if( name == null || name.equals("") ) name = getAttributeValue(model, "abbreviatedIRI");
        if( name == null || name.equals("") ) name = model.eClass().getName();
        
        return name;
    }
}