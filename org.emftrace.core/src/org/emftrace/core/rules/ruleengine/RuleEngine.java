/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.ruleengine;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.core.factory.EMFTraceCoreFactory;
import org.emftrace.core.linkmanager.LinkManager;
import org.emftrace.core.reportmanager.ReportManager;
import org.emftrace.core.rules.conditionprocessor.ConditionProcessor;
import org.emftrace.core.rules.elementprocessor.ElementProcessor;
import org.emftrace.core.rules.joinprocessor.JoinProcessor;
import org.emftrace.core.rules.processingcomponent.ProcessingComponent;
import org.emftrace.core.rules.resultprocessor.ResultProcessor;
import org.emftrace.core.rules.validator.RuleValidator;
import org.emftrace.metamodel.RuleModel.Rule;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class RuleEngine extends ProcessingComponent implements IRuleEngine
{
    /**
     * The instance of the {@link ElementProcessor} component
     */
    private ElementProcessor elementProcessor;
    
    /**
     * The instance of the {@link ResultProcessor} component
     */
    private ResultProcessor resultProcessor;
    
    /**
     * The instance of the {@link JoinProcessor} component
     */
    private JoinProcessor joinProcessor;
    
    /**
     * The instance of the {@link RuleValidator} component
     */
    private RuleValidator ruleValidator;
    
    /**
     * The instance of the {@link ConditionProcessor} component
     */
    private ConditionProcessor conditionProcessor;
        
    /**
     * The local list of all results. Results will be stored as {@link EObject}
     */
    private List<List<EObject>> resultList;
    
    /**
     * The list of all tuples
     */
    private List<List<EObject[]>> tupleList;
        
    /**
     * Constructor
     */
    public RuleEngine()
    {
        super("RuleEngine");
  
        ruleValidator      = EMFTraceCoreFactory.createRuleValidator();
        elementProcessor   = EMFTraceCoreFactory.createElementProcessor();
        conditionProcessor = EMFTraceCoreFactory.createConditionProcessor();
        joinProcessor      = EMFTraceCoreFactory.createJoinProcessor();
        resultProcessor    = EMFTraceCoreFactory.createResultProcessor();
        
        resultProcessor.registerJoinProcessor(joinProcessor);
        
        resultList    = new ArrayList<List<EObject>>();        
        tupleList     = new ArrayList<List<EObject[]>>();    
    }   
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void applyRule(ECPProject project, List<EObject> elements, Rule rule)
    {
        if( project == null || rule == null ) return;
        
        printToLog("applyRules", "start processing rule " + rule.getRuleID());    
        
        if( ruleValidator.validateRule(project, rule) )
        {
        	// execute the rule:
            elementProcessor.run(project, rule, resultList, elements, tupleList);                           	
            conditionProcessor.run(project, rule, resultList, tupleList);  
            joinProcessor.run(project, rule, resultList, tupleList);
            resultProcessor.run(project, rule, resultList, tupleList);
            
            // clean up after execution:
            resultList.clear();
            tupleList.clear();
        }
        
        printToLog("applyRules", "finished rule " + rule.getRuleID());
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void registerLinkManager(LinkManager linkManager)
    {
        resultProcessor.registerLinkManager(linkManager);
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void registerReportManager(ReportManager reportManager)
    {
        resultProcessor.registerReportManager(reportManager);
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void disconnectLinkManager()
    {
        resultProcessor.disconnectLinkManager();
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public void disconnectReportManager()
    {
        resultProcessor.disconnectReportManager();
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    @Override
    public void registerAccessLayer(AccessLayer accesslayer)
    {
        accessLayer = accesslayer;

        ruleValidator.registerAccessLayer(accesslayer);
        elementProcessor.registerAccessLayer(accesslayer);
        conditionProcessor.registerAccessLayer(accesslayer);
        joinProcessor.registerAccessLayer(accesslayer);
        resultProcessor.registerAccessLayer(accesslayer);
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    @Override
    public void disconnectAccessLayer()
    {
        accessLayer = null;
        
        ruleValidator.disconnectAccessLayer();
        elementProcessor.disconnectAccessLayer();
        conditionProcessor.disconnectAccessLayer();
        joinProcessor.disconnectAccessLayer();
        resultProcessor.disconnectAccessLayer();
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    @Override
    public void enableLogging(boolean status)
    {
        isLoggingEnabled = status;
        
        ruleValidator.enableLogging(status);
        elementProcessor.enableLogging(status);
        conditionProcessor.enableLogging(status);
        joinProcessor.enableLogging(status);
        resultProcessor.enableLogging(status);
    }
    
    ///////////////////////////////////////////////////////////////////////////
        
    public void setN(int newN)
    {
        n = newN;
        elementProcessor.setN(n);
        conditionProcessor.setN(n);
        resultProcessor.setN(n);        
    }

    ///////////////////////////////////////////////////////////////////////////
    
    public void setCorrelation(float newCorrelation)
    {
        correlation = newCorrelation;
        elementProcessor.setCorrelation(newCorrelation);
        conditionProcessor.setCorrelation(newCorrelation);
        resultProcessor.setCorrelation(newCorrelation);
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public ResultProcessor getResultProcessor()
    {
    	return resultProcessor;
    }
}