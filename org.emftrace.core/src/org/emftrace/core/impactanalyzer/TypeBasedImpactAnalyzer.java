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
import org.emftrace.core.rules.ruleengine.RuleEngine;
import org.emftrace.metamodel.ChangeModel.AbstractChangeType;
import org.emftrace.metamodel.ReportModel.ImpactReport;
import org.emftrace.metamodel.ReportModel.ReportContainer;
import org.emftrace.metamodel.ReportModel.ReportModelFactory;
import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.ElementDefinition;
import org.emftrace.metamodel.RuleModel.Rule;
import org.emftrace.metamodel.RuleModel.RuleCatalog;

/**
 * Implements a type-based impact analysis approach which propagates impacts across
 * dependency relation using pre-defined propagation rules.
 * 
 * @author Steffen Lehnert
 * @version 1.0 
 */
public class TypeBasedImpactAnalyzer extends AbstractImpactAnalyzer
{
	/**
	 * Whether the analyzer is properly initialized
	 */
	private boolean initialzed;
	
	/**
	 * The currently used {@link RuleCatalog}
	 */
	private RuleCatalog ruleCatalog;
	
	/**
	 * The currently used {@link RuleEngine}
	 */
	private RuleEngine ruleEngine;
	
	/**
	 * a list of all impacts which require further exploration
	 */
	private List<ImpactReport> openList;
	
	/**
	 * a list of all already inspected impacts
	 */
	private List<ImpactReport> closedList;
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Constructor
	 */
	public TypeBasedImpactAnalyzer()
	{
		super("TypeBasedImpactAnalyzer");
		
		ruleCatalog   = null;
		ruleEngine    = null;
		
		initialzed = false;
		
		openList   = new ArrayList<ImpactReport>();
		closedList = new ArrayList<ImpactReport>();
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Initialize the impact analyzer
	 * 
	 * @param rules the current set of rules
	 */
	public void init(RuleCatalog rules)
	{
		if( rules == null || ruleEngine == null || reportManager == null ) return;
		
		ruleCatalog = rules;		
		initialzed  = true;
		
		ruleEngine.getResultProcessor().getImpactSet().clear();
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	@Override
	public int performImpactAnalysis(ECPProject project, List<EObject> startingImpactSet, boolean createIndividualReports, boolean createComprehensiveReport) 
	{
		if( project == null             ) return -1;
		if( startingImpactSet == null   ) return -2;
		if( startingImpactSet.isEmpty() ) return -3;
		if( reportManager == null       ) return -4;
		if( !initialzed                 ) return -5;
		if( !createIndividualReports && !createComprehensiveReport ) return -6;
				
		// remember the SIS and the change type for later...
		List<EObject> originalSIS = new ArrayList<EObject>();
		for(int i = 1; i < startingImpactSet.size(); i++)
			originalSIS.add(startingImpactSet.get(i));
				
		AbstractChangeType originalChange = (AbstractChangeType) startingImpactSet.get(0);
		
		ruleEngine.enableLogging(false);
				
		// perform the rule-based recursive impact propagation:
		while( !startingImpactSet.isEmpty() )
		{
			for(int i = 0; i < ruleCatalog.getRules().size(); i++)
			{						
				if( isExecutionOfRuleRequired(ruleCatalog.getRules().get(i), startingImpactSet) )
				{
					ruleEngine.applyRule(project, startingImpactSet, ruleCatalog.getRules().get(i));
					addToOpenList(openList, closedList, ruleEngine.getResultProcessor().getImpactSet());
					
					printToLog("performImpactAnalysis", "...\"" + ruleCatalog.getRules().get(i).getRuleID() + "\" openList<" + openList.size() + "> closedList<" + closedList.size() + ">");
				}
		    }
		   
			startingImpactSet.clear();
					   
		    if( !openList.isEmpty() && getChangeType(project, openList.get(0).getSolution()) != null )
		    {
		    	addToClosedListAndPrepareNewSIS(project, startingImpactSet, openList, closedList);
		    }
		}
		
		// finally store all impact reports in EMFStore:		
		ReportContainer container = null;    
        List<EObject>   helper    = accessLayer.getElements(project, "ReportContainer");
        if( helper.isEmpty() )          
        {
        	container = ReportModelFactory.eINSTANCE.createReportContainer();
            accessLayer.addElement(project, container);
        }
        else container = (ReportContainer)helper.get(0);    
        
        int numberOfImpacts = 0;
        
        // create the individual reports:
        if( createIndividualReports )
        {
			for(int i = 0; i < closedList.size(); i++)
			{
				if( !reportManager.checkIfImpactReportAlreadyExists(project, closedList.get(i).getImpactSources(), closedList.get(i).getAffectedElements(), closedList.get(i).getChangeType()) )
				{
					accessLayer.addElement(project, closedList.get(i));
					container.getReports().add(closedList.get(i));
					numberOfImpacts++;
				}
			}
		}
        
        // create one comprehensive report:
        if( createComprehensiveReport )
        {
        	List<EObject> tmp = new ArrayList<EObject>();
        	
        	for(int i = 0; i < closedList.size(); i++)
        	{
        		if( !closedList.get(i).getImpactSources().containsAll(originalSIS) ) 
        			for(int j = 0; j < closedList.get(i).getImpactSources().size(); j++)
        				if( !tmp.contains(closedList.get(i).getImpactSources().get(j)) && !originalSIS.contains(closedList.get(i).getImpactSources().get(j)) )
        					tmp.add(closedList.get(i).getImpactSources().get(j));
        		
        		if( !closedList.get(i).getAffectedElements().containsAll(originalSIS) ) 
        			for(int j = 0; j < closedList.get(i).getAffectedElements().size(); j++)
        				if( !tmp.contains(closedList.get(i).getAffectedElements().get(j)) )
        					tmp.add(closedList.get(i).getAffectedElements().get(j));
        	} 	
        	
        	if( !reportManager.checkIfImpactReportAlreadyExists(project, originalSIS, tmp, originalChange) ) 
        	{
        		reportManager.createImpactReport(project, originalSIS, tmp, originalChange, getName(), "", "", true);
        	}
        	
        	if( numberOfImpacts == 0 && !tmp.isEmpty() ) numberOfImpacts = tmp.size();
        }
		
		// reset the analyzer's data:
		initialzed = false;
		closedList.clear();
		openList.clear();
		
		// return the amount of impacted elements:
		return numberOfImpacts;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Adds the currently explored impact report to the closed list and prepares the new starting impact set
	 * 
	 * @param project    the current project
	 * @param sis        the starting impact set
	 * @param openList   the open list
	 * @param closedList the closed list
	 */
	private void addToClosedListAndPrepareNewSIS(ECPProject project, List<EObject> sis, List<ImpactReport> openList, List<ImpactReport> closedList)
	{
		sis.add(getChangeType(project, openList.get(0).getSolution()));		    
    	sis.addAll(openList.get(0).getAffectedElements());
	    
	    closedList.add(openList.get(0));
	    openList.remove(0);
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Checks whether a certain rule should be executed given the types of objects in the 
	 * starting impact set
	 * 
	 * @param rule              the current rule
	 * @param startingImpactSet the current starting impact set
	 * @return true if the rule should be executed
	 */
	private boolean isExecutionOfRuleRequired(Rule rule, List<EObject> startingImpactSet)
	{			
		// check if the SIS matches the one defined in the rule:
		for(int i = 0; i < rule.getActions().size(); i++)
		{
			String[] sources = rule.getActions().get(i).getSourceElement().split("\\|");
			
			if( !ruleContainsElementFromSIS(rule, sources, startingImpactSet) ) return false;
						
			if( rule.getActions().get(i).getTargetElement() != null && !rule.getActions().get(i).getTargetElement().equalsIgnoreCase("") )
			{
				int numSources = rule.getActions().get(i).getSourceElement().split("\\|").length;
				int numTargets = rule.getActions().get(i).getTargetElement().split("\\|").length;
				
				if( startingImpactSet.size() <= (numSources + numTargets) ) return false;
			}
		}
		
		// check of the change type matches the one defined in the rule:
		for(int i = 0; i < rule.getElements().size(); i++)
		{
			ElementDefinition element = rule.getElements().get(i);
			
			if( element.getType().equalsIgnoreCase("AtomicChangeType") || element.getType().equalsIgnoreCase("CompositeChangeType") )
			{					
				String alias = element.getAlias() + "::name";
				String name  = ((AbstractChangeType) startingImpactSet.get(0)).getName();
								
				List<EObject> conditions = accessLayer.getAllChildren(rule.getConditions());
				
				for(int j = 0; j < conditions.size(); j++)
					if( conditions.get(j) instanceof BaseCondition)
						if( ((BaseCondition) conditions.get(j)).getSource().equalsIgnoreCase(alias) )
							if( ((BaseCondition) conditions.get(j)).getValue().equalsIgnoreCase(name) )
								return true;
			}
		}
		
		return false;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 *  Checks whether a given rule queries certain elements of the starting impact set
	 *  
	 * @param rule              the current rule
	 * @param elements          a list of alias names
	 * @param startingImpactSet the current starting impact set
	 * @return true of the current rule addresses elements from the starting impact set
	 */
	private boolean ruleContainsElementFromSIS(Rule rule, String[] elements, List<EObject> startingImpactSet)
	{
		for(int j = 0; j < rule.getElements().size(); j++)
			for(int k = 0; k < elements.length; k++)
				if( rule.getElements().get(j).getAlias().equalsIgnoreCase(elements[k]) ) 
					for(int l = 1; l < startingImpactSet.size(); l++)
					{
						String[] classes = rule.getElements().get(j).getType().split("\\|");
						
						for(int m = 0; m < classes.length; m++)
							if( classes[m].equalsIgnoreCase(startingImpactSet.get(l).eClass().getName()) )
								return true;
					}
		
		return false;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Returns the object representing a change type
	 * 
	 * @param project the current project
	 * @param type    the name of the change type
	 * @return        the change type object
	 */
	private EObject getChangeType(ECPProject project, String type)
	{
		List<EObject> tmp = accessLayer.getElements(project, "AtomicChangeType");
		tmp.addAll(accessLayer.getElements(project, "CompositeChangeType"));
		
		for(int i = 0; i < tmp.size(); i++)
			if( ((AbstractChangeType)tmp.get(i)).getName().equalsIgnoreCase(type) )
				return tmp.get(i);
		
		return null;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Returns whether a impact report is already contained by a list
	 * 
	 * @param list   the current list
	 * @param report the current impact report
	 * @return true if the report is already contained by the list
	 */
	private boolean containedByList(List<ImpactReport> list, ImpactReport report)
	{
		for(int i = 0; i < list.size(); i++)
		{
			// there are three cases:
			// 1. same report
			// 2. "inverse report", instead of "A -> B" it is "B -> A"
			// 3. only source or target are equal and change type matches change or impact
			
			boolean listSourcesContainReportSources = list.get(i).getImpactSources().containsAll(report.getImpactSources());
			boolean listSourcesContainReportImpacts = list.get(i).getImpactSources().containsAll(report.getAffectedElements());
			boolean listImpactContainReportSources  = list.get(i).getAffectedElements().containsAll(report.getImpactSources());
			boolean listImpactsContainReportImpacts = list.get(i).getAffectedElements().containsAll(report.getAffectedElements());
			boolean reportImpactsContainListSources = report.getAffectedElements().containsAll(list.get(i).getImpactSources());
			boolean reportImpactsContainListImpacts = report.getAffectedElements().containsAll(list.get(i).getAffectedElements());
			boolean reportSourcesContainListSources = report.getImpactSources().containsAll(list.get(i).getImpactSources());
			boolean reportSourcesContainListImpacts = report.getImpactSources().containsAll(list.get(i).getAffectedElements());
			
			boolean changeEqualsSolution = list.get(i).getChangeType().getName().equalsIgnoreCase(report.getSolution());
			boolean sameSolution         = list.get(i).getSolution().equalsIgnoreCase(report.getSolution());
			
			// case 1:
			if( (listSourcesContainReportSources || reportSourcesContainListSources) && (listImpactsContainReportImpacts || reportImpactsContainListImpacts) ) return true;
			
			// case 2:
			if( (listSourcesContainReportImpacts || reportImpactsContainListSources) && (listImpactContainReportSources || reportSourcesContainListImpacts) ) return true;
			
			// case 3:
			if( (listSourcesContainReportImpacts && changeEqualsSolution) || (listImpactsContainReportImpacts && sameSolution) ) return true;
		}
		return false;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Adds a new impact set to the openList. It is checked whether those elements are already contained within the openList and
	 * the closedList
	 * 
	 * @param openList           the current openList
	 * @param closedList         the current closedList
	 * @param estimatedImpactSet the current EIS
	 */
	private void addToOpenList(List<ImpactReport> openList, List<ImpactReport> closedList, List<ImpactReport> estimatedImpactSet)
	{		
		for(int i = 0; i < estimatedImpactSet.size(); i++)
		{
			if( containedByList(openList, estimatedImpactSet.get(i))   ) continue;
			if( containedByList(closedList, estimatedImpactSet.get(i)) ) continue;
			
			openList.add(estimatedImpactSet.get(i));
		}
	}
		
	///////////////////////////////////////////////////////////////////////////

	public void registerRuleEngine(RuleEngine engine)
	{
		ruleEngine = engine;
	}
	
	///////////////////////////////////////////////////////////////////////////

	public void disconnectRuleEngine() 
	{
		ruleEngine = null;
	}
}