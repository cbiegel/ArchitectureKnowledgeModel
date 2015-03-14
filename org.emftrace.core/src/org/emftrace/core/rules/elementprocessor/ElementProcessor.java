/*******************************************************************************
 * Copyright (c) 2010-2012 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.elementprocessor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.core.rules.processingcomponent.ProcessingComponent;
import org.emftrace.core.rules.util.ConditionProcessorHelper;
import org.emftrace.metamodel.ChangeModel.AbstractChangeType;
import org.emftrace.metamodel.RuleModel.Rule;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ElementProcessor extends ProcessingComponent implements IElementProcessor
{        
    /**
     * Constructor
     */
    public ElementProcessor()
    {
        super("ElementProcessor");
    } 
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void retrieveElements(ECPProject project, String name, List<EObject> result)
    {    
        List<EObject> list = null;
        
        if( name.equals(allClasses) ) list = new ArrayList<EObject>(accessLayer.getAllElements(project));
        else
        {
            String[] classes = name.split(seperator);
            
            if( classes.length < 2 ) list = accessLayer.getElements(project, name);
            else
            {
                list = new ArrayList<EObject>();
                for(int i = 0; i < classes.length; i++)
                    list.addAll(accessLayer.getElements(project, classes[i]));
            }
        }
        
        for(int i = 0; i < list.size(); i++) result.add(list.get(i));
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void retrieveElements(ECPProject project, Rule rule, List<EObject> models, List<List<EObject>> results)
    {
    	// handle special case for impact rules, i.e. the models list contains 2-3 elements:
    	// the change type, the actual changed element, and the cause for the change (optional)
    	if( models.size() >= 2 && models.get(0) instanceof AbstractChangeType )
    	{            
    		boolean changeTypeSet = false;
    		boolean sourceSet = false;
    		boolean targetSet = false;
    		
            for(int i = 0; i < rule.getElements().size(); i++)
            {           	
            	String type = rule.getElements().get(i).getType();
            	
            	if( !changeTypeSet && (type.equalsIgnoreCase("AtomicChangeType") || type.equalsIgnoreCase("CompositeChangeType")) )
            	{
            		results.get(i).add(models.get(0));
            		changeTypeSet = true;
            		continue;
            	}
            	
            	String source = rule.getActions().get(0).getSourceElement();
            	
            	if( !sourceSet && source.equalsIgnoreCase(rule.getElements().get(i).getAlias()) )
            	{
            		results.get(i).add(models.get(1));
            		sourceSet = true;
            		continue;
            	}
            	
            	if( !targetSet && models.size() == 3 )
            	{
		            String target = rule.getActions().get(0).getTargetElement();
		            	
		            if( target != null && target.equalsIgnoreCase(rule.getElements().get(i).getAlias()) )
		            {
		            	results.get(i).add(models.get(2));
		            	targetSet = true;
		            	continue;
		            }
            	}
            	
            	retrieveElements(project, rule.getElements().get(i).getType(), results.get(i));
            }
            
            return;
    	}
    	
        for(int i = 0; i < models.size(); i++)
        {
            for(int j = 0; j < rule.getElements().size(); j++)
            {
                if( rule.getElements().get(j).getType().equals(allClasses) ) results.get(j).add(models.get(i));
                else
                {
                    String[] classes = rule.getElements().get(j).getType().split(seperator);
                    for(int k = 0; k < classes.length; k++)
                        if( models.get(i).eClass().getName().equalsIgnoreCase(classes[k]) )
                            results.get(j).add(models.get(i));                        
                }
            }
        }
    }    
    
    ///////////////////////////////////////////////////////////////////////////
    
    @Override
    public void run(ECPProject project, Rule rule, List<List<EObject>> results, List<EObject> models, List<List<EObject[]>> tuples)
    {
        if( project == null || rule == null || results == null || accessLayer == null ) return;
        
        if( tuples != null ) ConditionProcessorHelper.prepareTupleLists(accessLayer, rule, tuples);
            
        if( models == null || models.isEmpty() )
        {                
            for(int i = 0; i < rule.getElements().size(); i++)
            {
            	results.add(new ArrayList<EObject>());                   
                retrieveElements(project, rule.getElements().get(i).getType(), results.get(i));
                    
                printToLog("run", "all elements with alias \""+rule.getElements().get(i).getAlias()+"\" of type \""+rule.getElements().get(i).getType()+"\" have been retrieved for rule \""+rule.getRuleID()+"\"");
            }
        }
        else
        {
            for(int i = 0; i < rule.getElements().size(); i++)
                results.add(new ArrayList<EObject>());
             
            retrieveElements(project, rule, models, results);
            
            printToLog("run", "all elements specified in a list have been retrieved for rule \""+rule.getRuleID()+"\""); 
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public void run(ECPProject project, Rule rule, List<List<EObject>> results, List<List<EObject[]>> tuples)
    {        
        run(project, rule, results, null, tuples);
    }
}