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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;

/**
 * Provides the interface for a model-element cache that can be used by the {@link AccessLayer} to speedup the processing of rules etc.
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public interface IModelElementCache
{
	/**
	 * Retrieves elements of a certain class from the cache
	 * 
	 * @param project the current project
	 * @param name    the classname of the elements
	 * @return        a list of models
	 */
	public List<EObject> get(ECPProject project, String name);
	
	/**
	 * Adds a new model to the cache
	 * 
	 * @param project the current project
	 * @param model   the new element
	 */
	public void insert(ECPProject project, EObject model);
	
	/**
	 * Removes an element from the cache
	 * 
	 * @param project the current project
	 * @param model   the element to be deleted
	 */
	public void remove(ECPProject project, EObject model);
	
	/**
	 * Clears the cache of a certain project
	 * 
	 * @param project the current project
	 */
	public void clear(ECPProject project);
	
	/**
	 * Clears the entire cache
	 */
	public void clearEntireCache();
	
	/**
	 * Checks whether a certain project is already known to the cache
	 * 
	 * @param project the current project
	 * @return true if the project is register, false if not
	 */
	public boolean containsProject(ECPProject project);
	
	/**
	 * Registers a project to the cache
	 * 
	 * @param project the current project
	 */
	public void addProject(ECPProject project);
	
	/**
	 * Returns all registered projects
	 * 
	 * @return a list of all registered projects
	 */
	public List<ECPProject> getProjects();
}
