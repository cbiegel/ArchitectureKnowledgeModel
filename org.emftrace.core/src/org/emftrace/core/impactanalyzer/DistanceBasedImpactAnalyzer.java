/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.impactanalyzer;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.metamodel.LinkModel.TraceLink;

/**
 * Implements a distance-based impact analysis approach which propagates impacts across any
 * dependency relation, regardless of their type and the change type.
 * 
 * @author Steffen Lehnert
 * @version 1.0 
 */
public class DistanceBasedImpactAnalyzer extends AbstractImpactAnalyzer
{
	/**
	 * The maximum propagation distance for changes
	 */
	private int distance;
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Constructor
	 */
	public DistanceBasedImpactAnalyzer()
	{
		super("DistanceBasedImpactAnalyzer");
		
		distance = 2;
		reportManager = null;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Sets the propagation distance
	 * 
	 * @param d the new propagation distance
	 */
	public void setPropagationDistance(int d)
	{
		distance = d;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Returns the current propagation distance
	 * 
	 * @return the current propagation distance
	 */
	public int getPropagationDistance()
	{
		return distance;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Searches the global dependency graph for all models directly related to a given model
	 * 
	 * @param object          the current model
	 * @param dependencyGraph the global dependency graph
	 * @return a list of all directly related models
	 */
	private List<EObject> getDirectRelatedObjects(EObject object, List<EObject> dependencyGraph)
	{
		List<EObject> relatedObjects = new ArrayList<EObject>();
		
		for(int i = 0; i < dependencyGraph.size(); i++)
		{
			TraceLink link = (TraceLink) dependencyGraph.get(i);
			if( link.getSource() == object && !relatedObjects.contains(link.getTarget()) ) relatedObjects.add(link.getTarget());
			if( link.getTarget() == object && !relatedObjects.contains(link.getSource()) ) relatedObjects.add(link.getSource());
		}
		
		return relatedObjects;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Checks whether a certain object is already contained within the estimated impact set
	 * 
	 * @param impactSet the current estimated impact set (EIS)
	 * @param object    the current object
	 * @return true if the object is already contained within the impact set
	 */
	private boolean containedByImpactSet(List<List<EObject>> impactSet, EObject object)
	{
		for(int i = 0; i < impactSet.size(); i++)
			if( impactSet.get(i).contains(object) )
				return true;

		return false;
	}
	
	///////////////////////////////////////////////////////////////////////////

	@Override
	public int performImpactAnalysis(ECPProject project, List<EObject> startingImpactSet, boolean createIndividualReports, boolean createComprehensiveReport) 
	{
		if( project == null             ) return -1;
		if( startingImpactSet == null   ) return -2;
		if( startingImpactSet.isEmpty() ) return -3;
		if( distance < 1                ) return -4;
		if( reportManager == null       ) return -5;
		
		List<EObject> dependencyGraph = accessLayer.getElements(project, "TraceLink");
		List<List<EObject>> impactSet = new ArrayList<List<EObject>>();
		
		for(int i = 0; i < distance; i++) impactSet.add(new ArrayList<EObject>());
		
		impactSet.get(0).addAll(getDirectRelatedObjects(startingImpactSet.get(0), dependencyGraph));
		
		int sizeOfImpactSet = 0;
		
		for(int i = 0; i < distance-1; i++)
		{
			for(int j = 0; j < impactSet.get(i).size(); j++)
			{
				List<EObject> tmp = getDirectRelatedObjects(impactSet.get(i).get(j), dependencyGraph);
			
				for(int k = 0; k < tmp.size(); k++)
					if( !containedByImpactSet(impactSet, tmp.get(k)) && tmp.get(k) != startingImpactSet.get(0) )
						impactSet.get(i+1).add(tmp.get(k));
			}
			
			sizeOfImpactSet += impactSet.get(i).size();
		}
		
		sizeOfImpactSet += impactSet.get(distance-1).size();
		
		// in this case ignore report-flags and only create one comprehensive report, might change that later:
		List<EObject> helper = new ArrayList<EObject>();
		
		for(int i = 0; i < distance; i++) helper.addAll(impactSet.get(i));
		
		reportManager.createImpactReport(project, startingImpactSet, helper, null, getName(), "", "", true);
		
		return sizeOfImpactSet;
	}
}