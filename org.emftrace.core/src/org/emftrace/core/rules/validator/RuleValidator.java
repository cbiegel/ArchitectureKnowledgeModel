/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.validator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.core.rules.elementprocessor.IElementProcessor;
import org.emftrace.core.tracecomponent.TraceComponent;
import org.emftrace.metamodel.LinkModel.LinkType;
import org.emftrace.metamodel.ReportModel.ViolationType;
import org.emftrace.metamodel.RuleModel.ActionDefinition;
import org.emftrace.metamodel.RuleModel.ActionType;
import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.BaseConditionType;
import org.emftrace.metamodel.RuleModel.ElementDefinition;
import org.emftrace.metamodel.RuleModel.LogicCondition;
import org.emftrace.metamodel.RuleModel.Rule;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class RuleValidator extends TraceComponent implements IRuleValidator
{   
    /**
     * Constructor
     */
    public RuleValidator()
    {
        super("RuleValidator");        
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public boolean checkActionDefinition(ECPProject project, ActionDefinition actionDefinition, List<String> elements)
    {
        if( actionDefinition.getActionType() == ActionType.CREATE_LINK )
        {
            String source = actionDefinition.getSourceElement();
            if( source == null )
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "linksource is NULL");
                return false;
            }
            
            if( source.equalsIgnoreCase("") )
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "linksource is empty String");
                return false;   
            }
            
            if( !elements.contains(source) )
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "linksource \""+source+"\" is not defined in this rule"); 
                return false;  
            }
            
            String target = actionDefinition.getTargetElement();
            if( target == null )
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "linktarget is NULL");
                return false;
            }
            
            if( target.equalsIgnoreCase("") )
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "linktarget is empty String");
                return false;   
            }
            
            if( !elements.contains(target) )
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "linktarget \""+target+"\" is not defined in this rule");
                return false;  
            }
            
            String type = actionDefinition.getResultType();
            if( type == null )
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "linktype is NULL");
                return false;
            }
            
            if( type.equalsIgnoreCase("") )
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "linktype is empty String");
                return false;   
            }
            
            LinkType linktype = null;
            List<EObject> list = accessLayer.getElements(project, "LinkType");
            for(int i = 0; i < list.size(); i++)
            {
                if( (((LinkType) (list.get(i))).getName()).equals(type) )
                {
                    linktype = (LinkType) list.get(i);
                    break;                            
                }
            }
            
            if( linktype == null ) 
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "linktype \""+type+"\" does not exist in this project"); 
                return false;   
            }
        }
        
        if( actionDefinition.getActionType() == ActionType.REPORT_CONSISTENCY_VIOLATION )
        {
            String tmp = actionDefinition.getTargetElement();
            if( tmp == null )
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "list of inconsistent models is NULL");
                return false;
            }
            
            if( tmp.equalsIgnoreCase("") )
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "list of inconsistent models is empty String");
                return false;   
            }
            
            String[] bad_elements = tmp.split(IElementProcessor.seperator);
            for(int i = 0; i < bad_elements.length; i++)
            {
                if( !elements.contains(bad_elements[i]) )
                {
                    if( isLoggingEnabled ) printToLog("checkActionDefinition", "element \""+bad_elements[i]+"\" is not defined in this rule"); 
                    return false;  
                }
            }
            
            tmp = actionDefinition.getResultType();            
            if( tmp == null )
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "violation-type is NULL");
                return false;
            }
            
            if( tmp.equalsIgnoreCase("") )
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "violation-type is empty String");
                return false;   
            }
            
            ViolationType violationType = null;
            List<EObject> list = accessLayer.getElements(project, "ViolationType");
            for(int i = 0; i < list.size(); i++)
            {
                if( (((ViolationType) (list.get(i))).getName()).equals(tmp) )
                {
                	violationType = (ViolationType) list.get(i);
                    break;                            
                }
            }
            
            if( violationType == null ) 
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "linktype \""+tmp+"\" does not exist in this project"); 
                return false;   
            }
        }
        
        if( actionDefinition.getActionType() == ActionType.REPORT_IMPACT )
        {
        	String source = actionDefinition.getSourceElement();
            if( source == null )
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "changed element is NULL");
                return false;
            }
            
            if( source.equalsIgnoreCase("") )
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "changed element is empty String");
                return false;   
            }
            
            String[] sources = source.split("\\|");
            for(int i = 0; i < sources.length; i++)
            {
	            if( !elements.contains(sources[i]) )
	            {
	                if( isLoggingEnabled ) printToLog("checkActionDefinition", "changed element \""+sources[i]+"\" is not defined in this rule"); 
	                return false;  
	            }
	        }
            
            String target = actionDefinition.getImpactedElement();
            if( target == null )
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "impacted element is NULL");
                return false;
            }
            
            if( target.equalsIgnoreCase("") )
            {
                if( isLoggingEnabled ) printToLog("checkActionDefinition", "impacted element is empty String");
                return false;   
            }
            
            String[] targets = target.split("\\|");
            for(int i = 0; i < targets.length; i++)
            {
	            if( !elements.contains(targets[i]) )
	            {
	                if( isLoggingEnabled ) printToLog("checkActionDefinition", "impacted element \""+targets[i]+"\" is not defined in this rule");
	                return false;  
	            }
            }
        }
        
        return true;
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public boolean checkBaseCondition(BaseCondition baseCondition, List<String> elements)
    {    	
        String source = baseCondition.getSource();
        String target = baseCondition.getTarget();
        String value  = baseCondition.getValue();
        
        if( source == null || source.equalsIgnoreCase("") || !elements.contains(source.split("::")[0]) )
        {
        	 if( isLoggingEnabled ) printToLog("checkBaseCondition", "SOURCE is either NULL, empty or not define in this rule");
        	return false;
        }
        
        boolean noValue = false;
        boolean noTarget = false;
        
        if( value == null && baseCondition.getType() != BaseConditionType.VALUE_NOT_NULL ) noValue = true;
        if( target == null || target.equalsIgnoreCase("") || !elements.contains(target.split("::")[0]) ) noTarget = true;
        
        if( noValue && noTarget )
        {
        	if( isLoggingEnabled ) printToLog("checkBaseCondition", "TARGET and COMPARE_VALUE are either NULL, empty or not define in this rule");
        	return false;
        }
                                 
        if( baseCondition.getType() != BaseConditionType.MODEL_DIRECT_PARENT_OF && 
            baseCondition.getType() != BaseConditionType.MODEL_PARENT_OF        &&
            baseCondition.getType() != BaseConditionType.MODEL_EQUALS           &&
            baseCondition.getType() != BaseConditionType.MODEL_RELATED_TO       &&
            baseCondition.getType() != BaseConditionType.MODEL_UNDIRECTED_RELATED_TO &&
            baseCondition.getType() != BaseConditionType.MODEL_INDIRECTLY_RELATED_TO )
        {
            if( source.split("::").length == 1 )
            {
                if( isLoggingEnabled ) printToLog("checkBaseCondition", "source \""+source+"\" is missing an attribute-declaration like \"source::attribute\""); 
                return false;           
            }
            if( noValue && !noTarget && target.split("::").length == 1 )
            {
                if( isLoggingEnabled ) printToLog("checkBaseCondition", "target \""+target+"\" is missing an attribute-declaration like \"target::attribute\""); 
                return false;           
            }
        }
        else
        {
        	if( noTarget )
        	{
                if( isLoggingEnabled ) printToLog("checkBaseCondition", "target \""+target+"\" is missing"); 
                return false; 
        	}
        }
        
        return true;
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public boolean checkElementDefinition(ElementDefinition elementDefinition, List<String> elements)
    {
        String alias = elementDefinition.getAlias();
        
        if( alias == null )
        {
            if( isLoggingEnabled ) printToLog("checkElementDefinition", "alias is NULL");
            return false;
        }
        
        if( alias.equalsIgnoreCase(""))
        {
            if( isLoggingEnabled ) printToLog("checkElementDefinition", "alias is empty String");
            return false;            
        }
        
        if( elements.contains(alias) )
        {
            if( isLoggingEnabled ) printToLog("checkElementDefinition", "alias \""+alias+"\" is not unique"); 
            return false;  
        }
               
        String type = elementDefinition.getType();
        
        if( type == null )
        {
            if( isLoggingEnabled ) printToLog("checkElementDefinition", "type is NULL");
            return false;
        }
        
        if( type.equalsIgnoreCase(""))
        {
            if( isLoggingEnabled ) printToLog("checkElementDefinition", "type is empty String");
            return false;            
        }
        
        elements.add(alias);
        
        return true;
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public boolean checkLogicCondition(LogicCondition logicCondition, List<String> elements)
    {
        if( logicCondition.getBaseConditions().isEmpty() && logicCondition.getLogicConditions().isEmpty() )
        {
            if( isLoggingEnabled ) printToLog("checkLogicCondition", "empty LogicCondition");
            return false;
        }
        
        for(int i = 0; i < logicCondition.getBaseConditions().size(); i++)
            if( !checkBaseCondition(logicCondition.getBaseConditions().get(i), elements) )
                return false;
        
        for(int i = 0; i < logicCondition.getLogicConditions().size(); i++)
            if( !checkLogicCondition(logicCondition.getLogicConditions().get(i), elements) )
                return false;
        
        return true;
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public boolean validateRule(ECPProject project, Rule rule)
    {
        if( isLoggingEnabled ) printToLog("validateRule", "start validating rule \""+rule.getRuleID()+"\" ...");
        
        List<String> elements = new ArrayList<String>();
                
        if( rule.getElements().isEmpty() )            
        {
            if( isLoggingEnabled ) printToLog("validateRule", "rule contains no elements");
            return false;
        }
        
        for(int i = 0; i < rule.getElements().size(); i++)
            if( !checkElementDefinition(rule.getElements().get(i), elements) ) 
                return false;
        
        if( rule.getActions().isEmpty() )
        {
            if( isLoggingEnabled ) printToLog("validateRule", "rule contains no actions");
            return false;
        }
        
        for(int i = 0; i < rule.getActions().size(); i++)
            if( !checkActionDefinition(project, rule.getActions().get(i), elements) ) 
                return false;
        
        if( rule.getConditions() == null )
        {
            if( isLoggingEnabled ) printToLog("validateRule", "rule contains no conditions");
            return false;
        }
        
        if( !checkLogicCondition(rule.getConditions(), elements) ) return false;
        
        if( isLoggingEnabled ) printToLog("validateRule", "rule \""+rule.getRuleID()+"\" seems to be OK ...");

        return true;
    }
}