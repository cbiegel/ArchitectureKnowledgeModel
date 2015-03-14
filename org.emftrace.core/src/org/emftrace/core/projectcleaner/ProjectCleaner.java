/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.projectcleaner;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.core.tracecomponent.TraceComponent;
import org.emftrace.metamodel.ChangeModel.AbstractChangeType;
import org.emftrace.metamodel.ChangeModel.ChangeModelFactory;
import org.emftrace.metamodel.ChangeModel.ChangeTypeCatalog;
import org.emftrace.metamodel.LinkModel.LinkModelFactory;
import org.emftrace.metamodel.LinkModel.LinkContainer;
import org.emftrace.metamodel.LinkModel.LinkType;
import org.emftrace.metamodel.LinkModel.LinkTypeCatalog;
import org.emftrace.metamodel.LinkModel.Trace;
import org.emftrace.metamodel.LinkModel.TraceLink;
import org.emftrace.metamodel.ReportModel.Report;
import org.emftrace.metamodel.ReportModel.ReportContainer;
import org.emftrace.metamodel.ReportModel.ReportModelFactory;
import org.emftrace.metamodel.ReportModel.ViolationType;
import org.emftrace.metamodel.ReportModel.ViolationTypeCatalog;
import org.emftrace.metamodel.RuleModel.RuleModelFactory;
import org.emftrace.metamodel.RuleModel.Rule;
import org.emftrace.metamodel.RuleModel.RuleCatalog;

/**
 * @author Steffen Lehnert
 * @version 1.0
 */
public class ProjectCleaner extends TraceComponent implements IProjectCleaner
{
    /**
     * Constructor
     */
    public ProjectCleaner()
    {
        super("ProjectCleaner");
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void cleanUpProject(ECPProject project)
    {
        if( isLoggingEnabled ) printToLog("cleanUpProject", "start clean-up...");
        cleanUpRuleOrphans(project);
        cleanUpLinkTypeOrphans(project);
        cleanUpViolationTypeOrphans(project);
        cleanUpChangeTypeOrphans(project);
        updateLinkTypeCatalogs(project);
        updateViolationTypeCatalogs(project);
        updateRuleCatalogs(project);
        updateChangeTypeCatalogs(project);
        updateLinkContainer(project);
        updateReportContainer(project);
        if( isLoggingEnabled ) printToLog("cleanUpProject", "clean-up finished!");
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void cleanUpRuleOrphans(ECPProject project)
    {
        List<EObject> rules    = accessLayer.getElements(project, "Rule");
        List<EObject> catalogs = accessLayer.getElements(project, "RuleCatalog");
        
        int ruleCount = 0;
        for(int i = 0; i < catalogs.size(); i++)
            ruleCount +=  accessLayer.getAllChildren(catalogs.get(i)).size();
        
        if( ruleCount < rules.size() )
        {
            RuleCatalog orphans = null;
            
            for(int i = 0; i < rules.size(); i++)
            {
                boolean isOrphan = true;
                
                for(int j = 0; j < catalogs.size(); j++)
                {
                    if( accessLayer.getAllChildren(catalogs.get(j)).contains(rules.get(i)) )
                    {
                        isOrphan = false;
                        break;
                    }
                }
                
                if( isOrphan )
                {
                    if( orphans == null )
                    {
                        // search for an existing orphan catalog:
                        for(int j = 0; j < catalogs.size(); j++)
                        {
                            String name = ((RuleCatalog)catalogs.get(j)).getName();
                            if( name != null && name.contains("Orphans"))
                            {
                                orphans = (RuleCatalog)catalogs.get(j);
                                break;
                            }
                        }
                        
                        // create a new one, if none exists:
                        if( orphans == null )
                        {
                            orphans = RuleModelFactory.eINSTANCE.createRuleCatalog();
                            accessLayer.addElement(project, orphans);
                            orphans.setName("Orphans");
                        }
                    }
                    
                    orphans.getRules().add((Rule)rules.get(i));
                }
            }            
        }
        
        if( isLoggingEnabled ) printToLog("cleanUpRuleOrphans", "1. checked for rule-orphans");
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void cleanUpLinkTypeOrphans(ECPProject project)
    {
        List<EObject> types    = accessLayer.getElements(project, "LinkType");
        List<EObject> catalogs = accessLayer.getElements(project, "LinkTypeCatalog");
        
        int typeCount = 0;
        for(int i = 0; i < catalogs.size(); i++)
            typeCount +=  accessLayer.getAllChildren(catalogs.get(i)).size();
        
        if( typeCount < types.size() )
        {
            LinkTypeCatalog orphans = null;
            
            for(int i = 0; i < types.size(); i++)
            {
                boolean isOrphan = true;
                
                for(int j = 0; j < catalogs.size(); j++)
                {
                    if( accessLayer.getAllChildren(catalogs.get(j)).contains(types.get(i)) )
                    {
                        isOrphan = false;
                        break;
                    }
                }
                
                if( isOrphan )
                {
                    if( orphans == null )
                    {
                        // search for an existing orphan catalog:
                        for(int j = 0; j < catalogs.size(); j++)
                        {
                            String name = ((LinkTypeCatalog)catalogs.get(j)).getName();
                            if( name != null && name.contains("Orphans"))
                            {
                                orphans = (LinkTypeCatalog)catalogs.get(j);
                                break;
                            }
                        }
                        
                        // create a new one, if none exists:
                        if( orphans == null )
                        {
                            orphans = LinkModelFactory.eINSTANCE.createLinkTypeCatalog();
                            accessLayer.addElement(project, orphans);
                            orphans.setName("Orphans");
                        }
                    }
                    
                    orphans.getLinkTypes().add((LinkType)types.get(i));
                }
            }            
        }
            
        if( isLoggingEnabled ) printToLog("cleanUpLinkTypeOrphans", "2. checked for linktype-orphans");
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void cleanUpViolationTypeOrphans(ECPProject project)
    {
        List<EObject> types    = accessLayer.getElements(project, "ViolationType");
        List<EObject> catalogs = accessLayer.getElements(project, "ViolationTypeCatalog");
        
        int typeCount = 0;
        for(int i = 0; i < catalogs.size(); i++)
            typeCount += accessLayer.getAllChildren(catalogs.get(i)).size();
        
        if( typeCount < types.size() )
        {
            ViolationTypeCatalog orphans = null;
            
            for(int i = 0; i < types.size(); i++)
            {
                boolean isOrphan = true;
                
                for(int j = 0; j < catalogs.size(); j++)
                {
                    if( accessLayer.getAllChildren(catalogs.get(j)).contains(types.get(i)) )
                    {
                        isOrphan = false;
                        break;
                    }
                }
                
                if( isOrphan )
                {
                    if( orphans == null )
                    {
                        // search for an existing orphan catalog:
                        for(int j = 0; j < catalogs.size(); j++)
                        {
                            String name = ((ViolationTypeCatalog)catalogs.get(j)).getName();
                            if( name != null && name.contains("Orphans"))
                            {
                                orphans = (ViolationTypeCatalog)catalogs.get(j);
                                break;
                            }
                        }
                        
                        // create a new one, if none exists:
                        if( orphans == null )
                        {
                            orphans = ReportModelFactory.eINSTANCE.createViolationTypeCatalog();
                            accessLayer.addElement(project, orphans);
                            orphans.setName("Orphans");
                        }
                    }
                    
                    orphans.getViolationTypes().add((ViolationType)types.get(i));
                }
            }            
        }

        if( isLoggingEnabled ) printToLog("cleanUpViolationTypeOrphans", "3. checked for violationtype-orphans");
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void cleanUpChangeTypeOrphans(ECPProject project)
    {
    	List<EObject> changes  = accessLayer.getElements(project, "AtomicChangeType");
    	changes.addAll(accessLayer.getElements(project, "CompositeChangeType"));
    	List<EObject> catalogs = accessLayer.getElements(project, "ChangeTypeCatalog");
        
        int changeTypeCount = 0;
        for(int i = 0; i < catalogs.size(); i++)
            changeTypeCount +=  accessLayer.getAllChildren(catalogs.get(i)).size();
        
        if( changeTypeCount < changes.size() )
        {
            ChangeTypeCatalog orphans = null;
            
            for(int i = 0; i < changes.size(); i++)
            {
                boolean isOrphan = true;
                
                for(int j = 0; j < catalogs.size(); j++)
                {
                    if( accessLayer.getAllChildren(catalogs.get(j)).contains(changes.get(i)) )
                    {
                        isOrphan = false;
                        break;
                    }
                }
                
                if( isOrphan )
                {
                    if( orphans == null )
                    {
                        // search for an existing orphan catalog:
                        for(int j = 0; j < catalogs.size(); j++)
                        {
                            String name = ((ChangeTypeCatalog)catalogs.get(j)).getName();
                            if( name != null && name.contains("Orphans"))
                            {
                                orphans = (ChangeTypeCatalog)catalogs.get(j);
                                break;
                            }
                        }
                        
                        // create a new one, if none exists:
                        if( orphans == null )
                        {
                            orphans = ChangeModelFactory.eINSTANCE.createChangeTypeCatalog();
                            accessLayer.addElement(project, orphans);
                            orphans.setName("Orphans");
                        }
                    }
                    
                    orphans.getChangeTypes().add((AbstractChangeType)changes.get(i));
                }
            }            
        }
        
        if( isLoggingEnabled ) printToLog("cleanUpChangeTypeOrphans", "4. checked for change-type-orphans");
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void updateLinkTypeCatalogs(ECPProject project)
    {
        List<EObject> catalogs = accessLayer.getElements(project, "LinkTypeCatalog");
        
        for(int i = 0; i < catalogs.size(); i++)
        {
            String name   = ((LinkTypeCatalog)catalogs.get(i)).getName();
            int    number = accessLayer.getAllChildren(catalogs.get(i)).size();
            
            // remove the empty orphan catalog:
            if( name != null && name.contains("Orphans") && number == 0 )
            {
                accessLayer.removeElement(project, catalogs.get(i));
                continue;
            }          
            
            String typeText = " link type";
            if( number == 0 || number > 1 ) typeText += "s";
            
            // update the name:
            if( name != null && !name.equals("") && !name.startsWith("[") )
            {
                int idx = name.indexOf('[');
                if( idx > 0 ) name = name.substring(0, idx-1);
                name = name + " [" + number + typeText + "]";
            }
            else name = "[" + number + typeText + "]";
                
            ((LinkTypeCatalog)catalogs.get(i)).setName(name);
        }     
        
        if( isLoggingEnabled ) printToLog("updateLinkTypeCatalogs", "5. link-type catalogs have been updated");
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void updateViolationTypeCatalogs(ECPProject project)
    {
        List<EObject> catalogs = accessLayer.getElements(project, "ViolationTypeCatalog");
        
        for(int i = 0; i < catalogs.size(); i++)
        {
            String name   = ((ViolationTypeCatalog)catalogs.get(i)).getName();
            int    number = accessLayer.getAllChildren(catalogs.get(i)).size();
            
            // remove the empty orphan catalog:
            if( name != null && name.contains("Orphans") && number == 0 )
            {
                accessLayer.removeElement(project, catalogs.get(i));
                continue;
            }  
            
            String typeText = " violation type";
            if( number == 0 || number > 1 ) typeText += "s";
            
            // update the name:
            if( name != null && !name.equals("") && !name.startsWith("[") )
            {
                int idx = name.indexOf('[');
                if( idx > 0 ) name = name.substring(0, idx-1);
                name = name + " [" + number + typeText + "]";
            }
            else name = "[" + number + typeText + "]";
                
            ((ViolationTypeCatalog)catalogs.get(i)).setName(name);
        }
        
        if( isLoggingEnabled ) printToLog("updateViolationTypeCatalogs", "6. violation-type catalogs have been updated");
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void updateRuleCatalogs(ECPProject project)
    {
        List<EObject> catalogs = accessLayer.getElements(project, "RuleCatalog");
        
        for(int i = 0; i < catalogs.size(); i++)
        {
            String name   = ((RuleCatalog)catalogs.get(i)).getName();
            int    number = ((RuleCatalog)catalogs.get(i)).getRules().size();
            
            // remove the empty orphan catalog:
            if( name != null && name.contains("Orphans") && number == 0 )
            {
                accessLayer.removeElement(project, catalogs.get(i));
                continue;
            }  
            
            String ruleText = " rule";
            if( number == 0 || number > 1 ) ruleText += "s";
            
            // update the name:
            if( name != null && !name.equals("") && !name.startsWith("[") )
            {
                int idx = name.indexOf('[');
                if( idx > 0 ) name = name.substring(0, idx-1);
                name = name + " [" + number + ruleText + "]";
            }
            else name = "[" + number + ruleText + "]";
                
            ((RuleCatalog)catalogs.get(i)).setName(name);
        }
        
        if( isLoggingEnabled ) printToLog("updateRuleCatalogs", "7. rule catalogs have been updated");
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void updateChangeTypeCatalogs(ECPProject project)
    {
        List<EObject> catalogs = accessLayer.getElements(project, "ChangeTypeCatalog");
        
        for(int i = 0; i < catalogs.size(); i++)
        {
            String name = ((ChangeTypeCatalog)catalogs.get(i)).getName();
            int typeCount = 0;
            int clusterCount = 0;
            
            List<EObject> elements = accessLayer.getAllChildren(catalogs.get(i));
            
            for(int j = 0; j < elements.size(); j++)
            {
            	if( elements.get(j) instanceof AbstractChangeType  ) typeCount++;
            	if( elements.get(j) instanceof ChangeTypeCatalog ) clusterCount++;            	
            }
            
            // remove the empty orphan catalog:
            if( name != null && name.contains("Orphans") && typeCount == 0 )
            {
                accessLayer.removeElement(project, catalogs.get(i));
                continue;
            }           
            
            String clusterText = " cluster";
            if( clusterCount == 0 || clusterCount > 1 ) clusterText += "s";
            
            String typeText = " type";
            if( typeCount == 0 || typeCount > 1 ) typeText += "s";
            
            // update the name:
            if( name != null && !name.equals("") && !name.startsWith("[") )
            {
                int idx = name.indexOf('[');
                if( idx > 0 ) name = name.substring(0, idx-1);
                
                if( clusterCount > 0 ) 
                	name = name + " [" + clusterCount + clusterText + ", " + typeCount + typeText + "]";
                else
                	name = name + " [" + typeCount + typeText + "]";
            }
            else 
            {
                if( clusterCount > 0 ) 
                	name = " [" + clusterCount + clusterText + ", " + typeCount + typeText + "]";
                else
                	name = " [" + typeCount + typeText + "]";
            }
                
            ((ChangeTypeCatalog)catalogs.get(i)).setName(name);
        }
        
    	if( isLoggingEnabled ) printToLog("updateChangeTypeCatalogs", "8. change type container has been updated");
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void updateLinkContainer(ECPProject project)
    {
        if( project == null ) return;
        
        LinkContainer container = null;        
        List<EObject> helper    = accessLayer.getElements(project, "LinkContainer");
        if( helper.isEmpty() )          
        {
            container = LinkModelFactory.eINSTANCE.createLinkContainer();
            accessLayer.addElement(project, container);
        }
        else
        {
            // merge containers:
            container = (LinkContainer)helper.get(0);
            for(int i = 0; i < helper.size(); i++)
            {         
                if( i == 0 ) continue;

                container.getLinks().addAll(((LinkContainer)helper.get(i)).getLinks());
                ((LinkContainer)helper.get(i)).getLinks().clear();
                container.getTraces().addAll(((LinkContainer)helper.get(i)).getTraces());                
                ((LinkContainer)helper.get(i)).getTraces().clear();
                
                accessLayer.removeElement(project, helper.get(i));
                helper.remove(i);
                i--;
            }
        }
        
        // move all links & traces into the container:
        List<EObject> links = accessLayer.getElements(project, "TraceLink");
        List<EObject> traces = accessLayer.getElements(project, "Trace");
        
        int numLinks = links.size();
        int numTraces = traces.size();
        
        if( container.getLinks().size() != numLinks )
            for(int i = 0; i < numLinks; i++)
                if( !container.getLinks().contains(links.get(i)))
                    container.getLinks().add((TraceLink)links.get(i));
        
        if( container.getTraces().size() != numTraces )
            for(int i = 0; i < numTraces; i++)
                if( !container.getTraces().contains(traces.get(i)))
                    container.getTraces().add((Trace)traces.get(i));
        
        // update the names of traces:
        for(int i = 0; i < numTraces; i++)
        {
            ((Trace) traces.get(i)).setName("Trace" + "#" + i + " [spanning " + ((Trace)traces.get(i)).getTraceabilityLinks().size() + " links]");
        }
        
        String linkText = " link";
        if( numLinks == 0 || numLinks > 1 ) linkText += "s";
        
        String traceText = " trace";
        if( numTraces == 0 || numTraces > 1 ) traceText += "s";
        
        container.setName("[" + numLinks + linkText +  ", " + numTraces + traceText + "]");
        
        if( isLoggingEnabled ) printToLog("updateLinkContainer", "9. link container has been updated");
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void updateReportContainer(ECPProject project)
    {
        if( project == null ) return;
        
        ReportContainer container = null;        
        List<EObject>   helper    = accessLayer.getElements(project, "ReportContainer");
        if( helper.isEmpty() )          
        {
            container = ReportModelFactory.eINSTANCE.createReportContainer();
            accessLayer.addElement(project, container);
        }
        else
        {
            // merge containers:
            container = (ReportContainer)helper.get(0);
            for(int i = 0; i < helper.size(); i++)
            {         
                if( i == 0 ) continue;

                container.getReports().addAll(((ReportContainer)helper.get(i)).getReports());
                ((ReportContainer)helper.get(i)).getReports().clear();
                
                accessLayer.removeElement(project, helper.get(i));
                helper.remove(i);
                i--;
            }
        }
        
        // move all reports into the container:
        List<EObject> reports = accessLayer.getElements(project, "ImpactReport");
        reports.addAll(accessLayer.getElements(project, "ConsistenceReport"));
        
        int violations = 0;
        int badSmells  = 0;
        int impacts    = 0;
        
        if( container.getReports().size() != reports.size() )
            for(int i = 0; i < reports.size(); i++)
                if( !container.getReports().contains(reports.get(i)))
                    container.getReports().add((Report)reports.get(i));    
        
        for(int i = 0; i < container.getReports().size(); i++)
        {
            if( container.getReports().get(i).getType() == org.emftrace.metamodel.ReportModel.ReportType.VIOLATION ) violations++;
            if( container.getReports().get(i).getType() == org.emftrace.metamodel.ReportModel.ReportType.BAD_SMELL ) badSmells++;
            if( container.getReports().get(i).getType() == org.emftrace.metamodel.ReportModel.ReportType.IMPACT ) impacts++;
        }
        
        String impactText = " impact";
        if( impacts > 1 ) impactText += "s";
        
        String violationText = " violation";
        if( violations > 1 ) violationText += "s";
        
        String badsmellText = " bad smell";
        if( badSmells > 1 ) badsmellText += "s";
        
        container.setName("[" + impacts + impactText + ", " + violations + violationText + ", " + badSmells + badsmellText + "]");
        
        if( isLoggingEnabled ) printToLog("updateReportContainer", "10. report container has been updated");
    }
}