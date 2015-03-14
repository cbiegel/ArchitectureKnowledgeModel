/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.rules.ruleengine;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.emftrace.core.linkmanager.LinkManager;
import org.emftrace.core.reportmanager.ReportManager;
import org.emftrace.core.rules.processingcomponent.IProcessingComponent;
import org.emftrace.core.rules.resultprocessor.ResultProcessor;
import org.emftrace.metamodel.RuleModel.Rule;

/**
 * The interface for the RuleEngine-component. This component is responsible
 * for executing the rules and preparing the results.
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public interface IRuleEngine extends IProcessingComponent
{
    /**
     * Registers a new {@link LinkManager} for all {@link TraceComponent components}
     *
     * @param linkManager the current used LinkManager-instance
     */
    public void registerLinkManager(LinkManager linkManager);
    
    /**
     * Registers a new {@link ReportManager} for all {@link TraceComponent components}
     *
     * @param linkManager the current used ReportManager-instance
     */
    public void registerReportManager(ReportManager reportManager);
    
    /**
     * De-registers the current used {@link LinkManager} from all {@link TraceComponent components}
     */
    public void disconnectLinkManager();

    /**
     * De-registers the current used {@link ReportManager} from all {@link TraceComponent components}
     */
    public void disconnectReportManager();
    
    /**
     * Applies a {@link Rule rules} upon a list of
     * chosen {@link EObject models}. If the list of models is null
     * or doesn't contain any entries, the rules will be applied upon all models
     * contained by the {@link ECPProject} 
     * 
     * @param project  the current ECPProject
     * @param elements a list of elements, can be null
     * @param rule     a rule
     */
    public void applyRule(ECPProject project, List<EObject> elements, Rule rule);
    
    /**
     * Return the current used {@link ResultProcessor}-instance
     * 
     * @return the current ResultProcessor
     */
    public ResultProcessor getResultProcessor();
}