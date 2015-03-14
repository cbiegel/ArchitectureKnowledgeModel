/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.linkmanager;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.core.tracecomponent.TraceComponent;
import org.emftrace.metamodel.LinkModel.LinkContainer;
import org.emftrace.metamodel.LinkModel.LinkModelFactory;
import org.emftrace.metamodel.LinkModel.LinkType;
import org.emftrace.metamodel.LinkModel.Trace;
import org.emftrace.metamodel.LinkModel.TraceElement;
import org.emftrace.metamodel.LinkModel.TraceLink;

/**
 * @author Steffen Lehnert
 * @version 1.0
 */
public class LinkManager extends TraceComponent implements ILinkManager
{       
	LinkContainer container;
	
    /**
     * Constructor
     */
    public LinkManager()
    {
        super("LinkManager");
        
    	container = null;
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void addToTrace(ECPProject project, Trace trace, TraceLink link)
    {
        if( project == null || trace == null || link == null ) return;
        
        trace.getTraceabilityLinks().add(link);
        accessLayer.notifyProject(project);
        
        if( isLoggingEnabled ) 
        {
            StringBuffer msg = new StringBuffer("from \"");
            msg.append(accessLayer.getNameOfModel(link));
            msg.append("\" to \"");
            msg.append(accessLayer.getNameOfModel(trace));
            msg.append("\"");
            printToLog("addToTrace", msg);
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public TraceLink checkIfLinkExists(ECPProject project, List<EObject> sources, List<EObject> targets, String rule, LinkType type)
    {
        if( container == null )
        {
        	List<EObject> tmp = accessLayer.getElements(project, "LinkContainer");
        	
        	if( tmp.isEmpty() )
        	{
	        	container = LinkModelFactory.eINSTANCE.createLinkContainer();
	        	accessLayer.addElement(project, container);
        	} else container = (LinkContainer)tmp.get(0);
        }
        
        for(TraceLink e : container.getLinks())
        {           
            if( e.getType() == type && e.getCreatedByRule() != null )
            {
            	int srcSize = sources.size();
            	int dstSize = targets.size();
                int dstCnt = 0;
                int srcCnt = 0;
                
                for(int i = 0; i < srcSize; i++)
                	if( e.getSource() == sources.get(i) )
                		srcCnt++;
                
                for(int i = 0; i < dstSize; i++)
                	if( e.getTarget() == targets.get(i) )
                		dstCnt++;
                
                if( dstCnt == dstSize && srcCnt == srcSize ) return e;
            }
        }
        
        return null;
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public TraceLink createLink(ECPProject project, EObject source, EObject target, String creator, LinkType type, String rule)
    {
        if( project == null ) return null;
        if( source  == null ) return null;
        if( target  == null ) return null;
        if( type    == null ) return null;
        if( creator == null ) return null;
            
        if( container == null )
        {
        	List<EObject> tmp = accessLayer.getElements(project, "LinkContainer");
        	
        	if( tmp.isEmpty() )
        	{
	        	container = LinkModelFactory.eINSTANCE.createLinkContainer();
	        	accessLayer.addElement(project, container);
        	} else container = (LinkContainer)tmp.get(0);
        }
        
        TraceLink link = LinkModelFactory.eINSTANCE.createTraceLink();     
          
        link.setSource(source);
        link.setTarget(target);
               
        link.setType(type);
        
        String sourceName = accessLayer.getNameOfModel(source);
        String targetName = accessLayer.getNameOfModel(target);
        String linkName = "\"" + sourceName + "\" -> " + type.getName() + " -> \"" + targetName + "\"";
        link.setName(linkName);        
        
        String tmp = Calendar.getInstance().getTime().toString();
        link.setLastModified(tmp);
        link.setLastVisited(tmp);
                
        if( rule != null ) link.setCreatedByRule(rule);
        
        accessLayer.addElement(project, link);
        container.getLinks().add(link);        
                             
        if( isLoggingEnabled ) 
        {
            StringBuffer msg = new StringBuffer("from \"");
            msg.append(accessLayer.getNameOfModel(source));
            msg.append("\" to \"");
            msg.append(accessLayer.getNameOfModel(target));
            msg.append("\" of type \"");
            msg.append(type.getName());
            msg.append("\"");
            printToLog("createLink", msg);
        }
        
        return link;
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public Trace createTrace(ECPProject project, List<TraceLink> traceLinks, String creator)
    {
        if( project == null || creator == null ) return null;
        
        if( container == null )
        {
        	List<EObject> tmp = accessLayer.getElements(project, "LinkContainer");
        	
        	if( tmp.isEmpty() )
        	{
	        	container = LinkModelFactory.eINSTANCE.createLinkContainer();
	        	accessLayer.addElement(project, container);
        	} else container = (LinkContainer)tmp.get(0);
        }
        
        Trace trace = LinkModelFactory.eINSTANCE.createTrace();
        
        accessLayer.addElement(project, trace);
        container.getTraces().add(trace);
        
        if( traceLinks != null ) 
            for(int i = 0; i < traceLinks.size(); i++)
                trace.getTraceabilityLinks().add(traceLinks.get(i));      
            
        if( isLoggingEnabled ) 
        {
            StringBuffer msg = new StringBuffer("containing ");
            if( traceLinks == null ) msg.append("no links");
            else
            {
                msg.append(traceLinks.size());
                msg.append(" links: [");
                for(int i = 0; i < traceLinks.size(); i++)
                {
                    msg.append(accessLayer.getNameOfModel(traceLinks.get(i)));
                    if( i < traceLinks.size()-1 ) msg.append(", ");
                }
                msg.append("]");
            }
            printToLog("createTrace", msg);
        }
        
        return trace;
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void deleteLink(ECPProject project, TraceLink link)
    {
        if( project == null || link == null ) return;
        
        accessLayer.removeElement(project, link);
        
        List<EObject> traces = accessLayer.getElements(project, "Trace");
        
        for(int i = 0; i < traces.size(); i++) 
            if( !((TraceElement) traces.get(i)).isCreatedByUser() )
                validateTrace(project, (Trace)traces.get(i));
        
        if( isLoggingEnabled ) 
        {
            StringBuffer msg = new StringBuffer("\"");
            msg.append(accessLayer.getNameOfModel(link));
            msg.append("\"");
            printToLog("deleteLink", msg);
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void deleteTrace(ECPProject project, Trace trace)
    {       
        accessLayer.removeElement(project, trace);
        if( isLoggingEnabled ) 
        {
            StringBuffer msg = new StringBuffer("\"");
            msg.append(accessLayer.getNameOfModel(trace));
            msg.append("\"");
            printToLog("deleteTrace",  msg);
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void removeFromTrace(ECPProject project, Trace trace, TraceLink link, boolean validate)
    {
        if( project == null || trace == null || link == null || !trace.getTraceabilityLinks().contains(link) ) return;
        
        trace.getTraceabilityLinks().remove(link);
        accessLayer.notifyProject(project);
        
        if( isLoggingEnabled ) 
        {
            StringBuffer msg = new StringBuffer("\"");
            msg.append(accessLayer.getNameOfModel(link));
            msg.append("\" from \"");
            msg.append(accessLayer.getNameOfModel(trace));
            printToLog("removeFromTrace", msg);
        }
        
        if( validate && !trace.isCreatedByUser() ) validateTrace(project, trace);
    }


    ///////////////////////////////////////////////////////////////////////////
    
    public boolean validateLink(ECPProject project, TraceLink link)
    {
        if( project == null || link == null ) return false;
        
        String id = link.getName();
        
        if( id == null ) id = "UNNAMED";
                       
        List<EObject> traces = accessLayer.getElements(project, "Trace");
        
        // a link without ends doesn't make much sense:
        if( link.getSource() == null || link.getTarget() == null )
        {
            // remove the link from any trace:
            for(int i = 0; i < traces.size(); i++)            
                removeFromTrace(project, (Trace)traces.get(i), link, false);
            
            accessLayer.removeElement(project, link);

            if( isLoggingEnabled )
            {
                StringBuffer msg = new StringBuffer("removed broken TraceLink ");
                msg.append(id);
                msg.append(" without source or target model.");
                printToLog("validateLink", msg);
            }
            
            return false;
        }
                
        if( isLoggingEnabled ) 
        {
            StringBuffer msg = new StringBuffer("TraceLink ");
            msg.append(id);
            msg.append(" seems to be ok.");
            printToLog("validateLink", msg);
        }
        
        link.setLastVisited(Calendar.getInstance().getTime().toString());
        
        return true;
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public boolean validateTrace(ECPProject project, Trace trace)
    {
        if( project == null || trace == null ) return false;
        
        String id = accessLayer.getNameOfModel(trace);
        
        // only automatic created Trace-objects need checking, since they are pure transitive-links:
        if( !trace.isCreatedByUser() )
        {
            List<TraceLink> traceLinks = trace.getTraceabilityLinks();
                       
            // a transitive link consisting of less than 2 links doesn't make any sense:
            if( traceLinks == null || traceLinks.size() < 2 )
            {
                accessLayer.removeElement(project, trace);
                
                if( isLoggingEnabled ) 
                {
                    StringBuffer msg = new StringBuffer("removed bad Trace \"");
                    msg.append(id);
                    msg.append("\" containing less than 2 links");
                    printToLog("validateTrace", msg);
                }
                return false;
            }
            
            // check whether the links still have something in common:
            List<List<TraceLink>> result = new ArrayList<List<TraceLink>>();
            result = checkForIndirectRelationships(traceLinks);
            
            int removeCount = 0;
            
            for(int i = 0; i < result.size(); i++)
            {
                if( result.get(i).size() == 0 ) continue;
                if( result.get(i).size() == 1 ) 
                {
                    // remove single TraceLinks with no relation to other links from this Trace:
                    trace.getTraceabilityLinks().remove(result.get(i).get(0));
                    removeCount++;
                    continue;
                }
                else
                {     
                    int splitCount = 0;
                    
                    // elements in list-i will remain in this Trace, the rest will establish 
                    // separate Traces if their lists contain more than 1 element:
                    for(int j = i+1; j < result.size(); j++)
                    {
                        if( result.get(j).size() == 0 ) continue;
                        if( result.get(j).size() == 1 ) 
                        {
                            trace.getTraceabilityLinks().remove(result.get(i).get(0));
                            removeCount++;
                            continue;
                        }
                        // create a new Trace, containing all TraceLinks from list-j:
                        createTrace(project, result.get(j), this.getName());
                        
                        splitCount++;
                        
                        // ...and remove those Links from this Trace:
                        trace.getTraceabilityLinks().removeAll(result.get(j));
                    }
                    
                    if( removeCount != 0 || splitCount != 0 )
                    {
                        if( isLoggingEnabled )  
                        {   
                            StringBuffer msg = new StringBuffer("fixed bad Trace \"");
                            msg.append(id);
                            msg.append("\" through removing (");
                            msg.append(removeCount);
                            msg.append(") unrelated TraceLink(s)");
                            msg.append("\" and moving related parts to (");
                            msg.append(splitCount);
                            msg.append(") new Trace(s)");
                            printToLog("validateTrace", msg);
                        } 
                        
                        return false;
                    }
                }
            }
            
            // remove this Trace since it doesn't contain any links anymore:
            if( trace.getTraceabilityLinks().isEmpty() )
            {
                accessLayer.removeElement(project, trace);
                
                if( isLoggingEnabled )
                {
                    StringBuffer msg = new StringBuffer("removed empty Trace \"");
                    msg.append(id);
                    msg.append("\"");
                    printToLog("validateTrace", msg);
                }
               
                return false;
            }
                     
            // everything was OK:
            if( isLoggingEnabled ) 
            {
                StringBuffer msg = new StringBuffer("Trace \"");
                msg.append(id);
                msg.append("\" seems to be ok");
                printToLog("validateTrace", msg);
            }
        }
        
        return true;
    }
        
    ///////////////////////////////////////////////////////////////////////////
    
    public void performTransitivityAnalysis(ECPProject project)
    {
        if( project == null ) return;
            
        // remove old Traces generated by the LinkManager:
        List<EObject>  helper = accessLayer.getElements(project, "TraceLink");
        List<EObject>  traces = accessLayer.getElements(project, "Trace");
        List<TraceLink> links = new ArrayList<TraceLink>();
        
        for(int i = 0; i < helper.size(); i++)
            links.add((TraceLink)helper.get(i));
        
        for(int i = 0; i < traces.size(); i++)
        {
            if( !((Trace) traces.get(i)).isCreatedByUser() )
            {
                accessLayer.removeElement(project, traces.get(i));
                i--;
            }
        }        
        
        // find possible relationships:
        List<List<TraceLink>> result = new ArrayList<List<TraceLink>>();
        result = checkForIndirectRelationships(links);

        if( result == null ) return;        
        
        // create transitive Traces:
        int count = 0;
        for(int i = 0; i < result.size(); i++)
        {
            Trace trace = null;
            if( result.get(i).size() > 1 )
            {
                trace = createTrace(project, result.get(i), this.getName());               
                trace.setName("#" + count + " [spanning " + result.get(i).size() + " Links]");
                count++;
            }
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////
        
    public boolean checkForDirectRelationship(TraceLink link1, TraceLink link2)
    {   
        if( link1 == null || link2 == null ) return false;
        else
        {         
        	EObject s1 = link1.getSource();
        	EObject s2 = link2.getSource();
        	EObject t1 = link1.getTarget();
        	EObject t2 = link2.getTarget();
        	
            if( s1 == s2 ) return true;
            if( s1 == t2 ) return true;
            if( t1 == s2 ) return true;            
            if( t1 == t2 ) return true;
            
            return false;
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public List<List<TraceLink>> checkForIndirectRelationships(List<TraceLink> links)
    {
        if( links == null ) return null;
        
        List<List<TraceLink>> result = new ArrayList<List<TraceLink>>();
        int size = links.size();
        
        /**
         * create a new list of lists, each sublist represents
         * a collection of related links, first it looks like:
         * 
         * result(0) -> (links(0))
         * result(1) -> (links(1))
         * ...
         */
        for(int i = 0; i < size; i++)
        {   
            result.add(new ArrayList<TraceLink>());
            result.get(i).add(links.get(i));
        }
        
        /**
         * merge lists with common elements, e.g. result(1) & result(2):
         * 
         * result(0) -> (links(0))
         * result(1) -> (links(1), links(2), links(4))
         * result(2) -> (empty)
         * ...
         */
        for(int i = 0; i < size; i++)
        {
        	for(int j = 0; j < size; j++)
        	{
        		if( i == j ) continue;
        		
        		for(int k = 0; k < result.get(i).size(); k++)
        		{
        			for(int l = 0; l < result.get(j).size(); l++)
        			{
                        if( checkForDirectRelationship(result.get(i).get(k), result.get(j).get(l)) )
                        {
                            result.get(i).add(result.get(j).get(l));
                            result.get(j).remove(l);
                            l--;
                        }
        			}
        		}
        	}
        }
                
        return result;
    }
}