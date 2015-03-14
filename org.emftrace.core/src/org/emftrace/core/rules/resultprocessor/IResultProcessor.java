/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.resultprocessor;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.core.linkmanager.LinkManager;
import org.emftrace.core.reportmanager.ReportManager;
import org.emftrace.core.rules.joinprocessor.JoinProcessor;
import org.emftrace.core.rules.processingcomponent.IProcessingComponent;
import org.emftrace.metamodel.RuleModel.ActionDefinition;
import org.emftrace.metamodel.RuleModel.Rule;

/**
 * Provides the interface for the results-processing component which is
 * responsible for removing unused results and executing the actions
 * specified in the Rules
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public interface IResultProcessor extends IProcessingComponent
{                        
    /**
     * Registers the instance of {@link LinkManager} at this component, allowing faster & easier access
     * to its methods. This is required for executing the {@link ActionDefinition actions} specified by
     * the {@link Rule Rules}
     * 
     * @param newLinkManager the current LinkManager
     */
    public void registerLinkManager(LinkManager newLinkManager);
    
    /**
     * Registers a new {@link ReportManager} for this component
     *
     * @param linkManager the current used ReportManager-instance
     */
    public void registerReportManager(ReportManager reportManager);
    
    /**
     * Registers a new {@link JoinProcessor} for this component
     * @param processor
     */
    public void registerJoinProcessor(JoinProcessor processor);
    
    /**
     * De-registers the currently used {@link LinkManager} again
     */
    public void disconnectLinkManager();
    
    /**
     * De-registers the currently used {@link ReportManager}
     */
    public void disconnectReportManager();
    
    /**
     * De-registers the currently used {@link JoinProcessor}
     */
    public void disconnectJoinProcessor();
    
    /**
     * Process the creation of {@link TraceLink traceability links}. 
     * 
     * @param project the current project
     * @param rule    the current rule
     * @param results the list of results for this rule
     * @param tuples  the list of all created tuples
     * @param index   the index of the current action
     */
    public void processCreateLinkResult(ECPProject project, Rule rule, List<List<EObject>> results, List<EObject[]> tuples, int index);
    
    /**
     * Process the creation of {@ Report consistency reports}. 
     * 
     * @param project the current project
     * @param rule    the current rule
     * @param results the list of results for this rule
     * @param tuples  the list of all created tuples
     * @param index   the index of the current action
     */
    public void processReportViolationResult(ECPProject project, Rule rule, List<List<EObject>> results, List<EObject[]> tuples, int index);
    
    /**
     * Process the creation of {@ Report impact reports}. 
     * 
     * @param project the current project
     * @param rule    the current rule
     * @param results the list of results for this rule
     * @param tuples  the list of all created tuples
     * @param index   the index of the current action
     */
    public void processReportImpactResult(ECPProject project, Rule rule, List<List<EObject>> results, List<EObject[]> tuples, int index);
}