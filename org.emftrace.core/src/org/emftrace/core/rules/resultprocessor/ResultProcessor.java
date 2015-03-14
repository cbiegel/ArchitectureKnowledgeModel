/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.resultprocessor;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.core.linkmanager.LinkManager;
import org.emftrace.core.reportmanager.ReportManager;
import org.emftrace.core.rules.joinprocessor.JoinProcessor;
import org.emftrace.core.rules.processingcomponent.ProcessingComponent;
import org.emftrace.core.rules.util.ElementResolver;
import org.emftrace.metamodel.ChangeModel.AbstractChangeType;
import org.emftrace.metamodel.LinkModel.LinkType;
import org.emftrace.metamodel.LinkModel.TraceLink;
import org.emftrace.metamodel.ReportModel.ImpactReport;
import org.emftrace.metamodel.RuleModel.Rule;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ResultProcessor extends ProcessingComponent implements IResultProcessor
{
    /**
     * The current {@link LinkManager}
     */
    private LinkManager linkManager;
    
    /**
     * The current  {@link ReportManager}
     */
    private ReportManager reportManager;
    
    /**
     * The current {@link JoinProcessor}
     */
    private JoinProcessor joinProcessor;
    
    /**
     * The current estimated impact set (EIS)
     */
    private List<ImpactReport> impactSet;
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Constructor
     */
    public ResultProcessor()
    {
        super("ResultProcessor");
        
        linkManager   = null;
        reportManager = null;
        
        impactSet = new ArrayList<ImpactReport>();
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Returns the current impact set
     * 
     * @return the current impact set
     */
    public List<ImpactReport> getImpactSet()
    {
    	return impactSet;
    }
    
    ///////////////////////////////////////////////////////////////////////////
        
    public void run(ECPProject project, Rule rule, List<List<EObject>> results, List<List<EObject[]>> tuples)
    {    	
    	if( reportManager == null ) return;
        if( linkManager   == null ) return; 
        if( accessLayer   == null ) return;
        if( joinProcessor == null ) return;
        
        if( project == null   ) return;
        if( rule    == null   ) return;
        if( results == null   ) return;       
        if( results.isEmpty() ) return;
        
        if( joinProcessor.getFinalTuples() == null   ) return;
        if( joinProcessor.getFinalTuples().isEmpty() ) return;
                
        printToLog("run", "start processing results for rule \""+rule.getRuleID()+"\" ...");
        
        // execute actions:
        for(int i = 0; i < rule.getActions().size(); i++)
        {
            switch(rule.getActions().get(i).getActionType())
            {
                case CREATE_LINK :
                {                                                           
                	processCreateLinkResult(project, rule, results, joinProcessor.getFinalTuples(), i);                                        
                    break;
                }

                case REPORT_CONSISTENCY_VIOLATION :
                {
                	processReportViolationResult(project, rule, results, joinProcessor.getFinalTuples(), i);     
                	break;
                }
                
                case REPORT_IMPACT :
                {
                	processReportImpactResult(project, rule, results, joinProcessor.getFinalTuples(), i);     
                	break;
                }
                
                default : break;
            }
        }
        
        printToLog("run", "... finished processing results for rule \""+rule.getRuleID()+"\"");
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void disconnectLinkManager()
    {
        linkManager = null;        
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void registerLinkManager(LinkManager newLinkManager)
    {
        linkManager = newLinkManager;        
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void disconnectReportManager()
    {
        reportManager = null;        
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void registerReportManager(ReportManager newReportManager)
    {
        reportManager = newReportManager;        
    }
    
    ///////////////////////////////////////////////////////////////////////////

	public void processCreateLinkResult(ECPProject project, Rule rule, List<List<EObject>> results, List<EObject[]> tuples, int index) 
	{
		 int srcIdx = ElementResolver.getIndexForElement(rule, rule.getActions().get(index).getSourceElement());
         int dstIdx = ElementResolver.getIndexForElement(rule, rule.getActions().get(index).getTargetElement());
         
         if( results.get(srcIdx).isEmpty() || results.get(dstIdx).isEmpty()) return;
         
         // get the appropriate LinkType:
         LinkType      type = null;
         List<EObject> list = accessLayer.getElements(project, "LinkType");
         for(int j = 0; j < list.size(); j++)
         {
             if( (((LinkType) (list.get(j))).getName()).equals(rule.getActions().get(index).getResultType()) )
             {
                 type = (LinkType) list.get(j);
                 break;                            
             }
         }
         
         if( type == null ) return;
                             
         // link the results:
         for(int j = 0; j < tuples.size(); j++)
         {             
             EObject src = tuples.get(j)[srcIdx];
             EObject dst = tuples.get(j)[dstIdx];
             
             if( src == null || dst == null || src == dst ) continue;
             
             List<EObject> sources = new ArrayList<EObject>();
             List<EObject> targets = new ArrayList<EObject>();
             sources.add(src);
             targets.add(dst);

             TraceLink          link = linkManager.checkIfLinkExists(project, sources, targets, rule.getRuleID(), type);
             if( link == null ) link = linkManager.checkIfLinkExists(project, targets, sources, rule.getRuleID(), type);                             
             if( link == null ) link = linkManager.createLink(project, src, dst, linkManager.getName(), type, rule.getRuleID());

             if( link != null )
             {
                 link.setLastVisited(Calendar.getInstance().getTime().toString());
                     
                 if( link.getDescription() == null || link.getDescription().equals("") )
                 {
                     String description = "";
                     if( !rule.getRuleID().contains("rule") && !rule.getRuleID().contains("Rule") ) description = "[Rule ";
                     else description = "["; 
                         
                     description = description + rule.getRuleID() + ", " + Calendar.getInstance().getTime().toString() + "]: ";
                         
                     if( rule.getDescription() != null ) description = description + rule.getDescription();
                         
                     link.setDescription(description);                                    
                     link.setLastModified(Calendar.getInstance().getTime().toString());
                 }                     
             }                            
         }	
	}
	
	///////////////////////////////////////////////////////////////////////////

	public void processReportViolationResult(ECPProject project, Rule rule, List<List<EObject>> results, List<EObject[]> tuples, int index)
	{
		// TODO
	}
	
	///////////////////////////////////////////////////////////////////////////

	public void processReportImpactResult(ECPProject project, Rule rule, List<List<EObject>> results, List<EObject[]> tuples, int index)
	{
		impactSet.clear();
		
		String[] sources = rule.getActions().get(index).getSourceElement().split("\\|");
		String[] targets = rule.getActions().get(index).getImpactedElement().split("\\|");
		
		if( sources.length == 0 || targets.length == 0 ) return;
		
		int[] srcIdx = new int[sources.length];
		int[] dstIdx = new int[targets.length];
		
		for(int i = 0; i < srcIdx.length; i++)	srcIdx[i] = ElementResolver.getIndexForElement(rule, sources[i]);
		for(int i = 0; i < dstIdx.length; i++)	dstIdx[i] = ElementResolver.getIndexForElement(rule, targets[i]);
                  
        String changeAlias = "";
         
        for(int i = 0; i < rule.getElements().size(); i++)
        {
        	String type = rule.getElements().get(i).getType();
         
        	if( type.equalsIgnoreCase("AtomicChangeType") || type.equalsIgnoreCase("CompositeChangeType") )
        	{
        		changeAlias = rule.getElements().get(i).getAlias();
        		continue;
        	}
        }
         
        if( changeAlias.equalsIgnoreCase("") ) return;
         
        int changeIdx = ElementResolver.getIndexForElement(rule, changeAlias);
        
        // create the impact reports:
        for(int i = 0; i < tuples.size(); i++)
        {
        	boolean nextTuple = false;
        	
        	// check if sources are empty:
        	for(int j = 0; j < srcIdx.length; j++)
        	{
        		if( tuples.get(i)[srcIdx[j]] == null )
        		{
        			nextTuple = true;
        			break;
        		}
        	}
        	
        	// check if targets are empty: 
        	for(int j = 0; j < dstIdx.length; j++)
        	{
        		if( tuples.get(i)[dstIdx[j]] == null )
        		{
        			nextTuple = true;
        			break;
        		}
        	}
        	
        	// check if change type is empty:
        	if( tuples.get(i)[changeIdx] == null )
        		nextTuple = true;
        	
        	if( nextTuple ) continue;
        	
            AbstractChangeType change = (AbstractChangeType) tuples.get(i)[changeIdx];
            
            List<EObject> src = new ArrayList<EObject>();
            List<EObject> dst = new ArrayList<EObject>();
             
            for(int j = 0; j < srcIdx.length; j++) src.add(tuples.get(i)[srcIdx[j]]);            
            for(int j = 0; j < dstIdx.length; j++) dst.add(tuples.get(i)[dstIdx[j]]);
            	 
            if( src.isEmpty() || dst.isEmpty() ) continue;
             
            impactSet.add(reportManager.createImpactReport(project, src, dst, change, rule.getRuleID(), rule.getDescription(), rule.getActions().get(index).getResultType(), false));
        }
	}
	
	///////////////////////////////////////////////////////////////////////////

	public void registerJoinProcessor(JoinProcessor processor)
	{
		joinProcessor = processor;		
	}
	
	///////////////////////////////////////////////////////////////////////////

	public void disconnectJoinProcessor() 
	{
		joinProcessor = null;	
	}
}