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
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ModelElementCache implements IModelElementCache
{
    /**
     * A list of all classes of models, which are stored in the cache
     */
    protected ArrayList<ArrayList<String>> modelCacheHeader;
    
    /**
     * A list of all {@link EObject models} which are stored in the cache
     */
    protected ArrayList<ArrayList<ArrayList<EObject>>> modelCacheTable;
     
    /**
     * A {@link ArrayList list} containing all {@link ECPProject projects} EMFTrace is working with 
     */
    protected ArrayList<ECPProject> projects;
    
    /**
     * Constructor
     */
    public ModelElementCache()
    {
    	projects         = new ArrayList<ECPProject>();
    	modelCacheTable  = new ArrayList<ArrayList<ArrayList<EObject>>>();
        modelCacheHeader = new ArrayList<ArrayList<String>>();
    }
    
	@Override
	public List<EObject> get(ECPProject project, String name) 
	{
		int projectIdx = projects.indexOf(project);
		
		if( projectIdx == -1 ) return null;
		
		int idx = modelCacheHeader.get(projectIdx).indexOf(name);
		
		if( idx == -1 ) return null;
		
		return modelCacheTable.get(projectIdx).get(idx);
	}

	@Override
	public void insert(ECPProject project, EObject model) 
	{
		if( project == null || model == null ) return;
		
		int projectIdx = projects.indexOf(project);
		String name = model.getClass().getName();		
		int idx = modelCacheHeader.get(projectIdx).indexOf(name); 
		
		if( idx == -1  )
		{
			modelCacheHeader.get(projectIdx).add(name);
			modelCacheTable.get(projectIdx).add(new ArrayList<EObject>());
			modelCacheTable.get(projectIdx).get(modelCacheHeader.get(projectIdx).size()-1).add(model);
		}
		else
		{
			modelCacheTable.get(projectIdx).get(idx).add(model);
		}
	}

	@Override
	public void remove(ECPProject project, EObject model)
	{
		if( project == null || model == null ) return;
		
		int projectIdx = projects.indexOf(project);
		
		if( projectIdx == -1 ) return;
		
		String name = model.getClass().getName();
		
		int idx = modelCacheHeader.get(projectIdx).indexOf(name);
		
		if( idx == -1 ) return;
		
		modelCacheTable.get(projectIdx).get(idx).remove(model);		
	}

	@Override
	public void clear(ECPProject project) 
	{
        int projectIdx = projects.indexOf(project);
        if( projectIdx < 0 ) return;
        if( projectIdx < modelCacheTable.size() ) modelCacheTable.get(projectIdx).clear();
        if( projectIdx < modelCacheHeader.size() ) modelCacheHeader.get(projectIdx).clear();   	
	}
	
	@Override
	public void clearEntireCache()
	{
		projects.clear();
		modelCacheHeader.clear();
		modelCacheTable.clear();
	}
	
	@Override
	public boolean containsProject(ECPProject project)
	{
		return projects.contains(project);
	}
	
	@Override
	public void addProject(ECPProject project)
	{
		projects.add(project);
        modelCacheTable.add(new ArrayList<ArrayList<EObject>>());
        modelCacheHeader.add(new ArrayList<String>());
	}
	
	@Override
	public List<ECPProject> getProjects()
	{
		return projects;
	}
}