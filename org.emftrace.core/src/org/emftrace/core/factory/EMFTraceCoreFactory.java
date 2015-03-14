/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.factory;

import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.core.impactanalyzer.DistanceBasedImpactAnalyzer;
import org.emftrace.core.impactanalyzer.TypeBasedImpactAnalyzer;
import org.emftrace.core.linkmanager.LinkManager;
import org.emftrace.core.projectcleaner.ProjectCleaner;
import org.emftrace.core.reportmanager.ReportManager;
import org.emftrace.core.rules.conditionprocessor.ConditionProcessor;
import org.emftrace.core.rules.elementprocessor.ElementProcessor;
import org.emftrace.core.rules.joinprocessor.JoinProcessor;
import org.emftrace.core.rules.resultprocessor.ResultProcessor;
import org.emftrace.core.rules.ruleengine.RuleEngine;
import org.emftrace.core.rules.validator.RuleValidator;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class EMFTraceCoreFactory
{
	/**
	 * Creates an instance of the {@link RuleValidator}-component
	 * 
	 * @return new RuleValidator-component
	 */
	public static RuleValidator createRuleValidator()
	{
		return new RuleValidator();
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Creates an instance of the {@link ElementProcessor}-component
	 * 
	 * @return new ElementProcessor-component
	 */
	public static ElementProcessor createElementProcessor() 
	{
		return new ElementProcessor();
	}
	
    ///////////////////////////////////////////////////////////////////////////

	/**
	 * Creates an instance of the {@link ConditionProcessor}-component
	 * 
	 * @return new ConditionProcessor-component
	 */
	public static ConditionProcessor createConditionProcessor() 
	{
		return new ConditionProcessor();
	}
		
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Creates an instance of the {@link JoinProcessor}-component
	 * 
	 * @return new JoinProcessor-component
	 */
	public static JoinProcessor createJoinProcessor()
	{
		return new JoinProcessor();
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Creates an instance of the {@link ResultProcessor}-component
	 * 
	 * @return new ResultProcessor-component
	 */
	public static ResultProcessor createResultProcessor() 
	{
		return new ResultProcessor();
	}
	
    ///////////////////////////////////////////////////////////////////////////

	/**
	 * Creates an instance of the {@link RuleEngine}-component
	 * 
	 * @return new RuleEngine-component
	 */
	public static RuleEngine createRuleEngine()
	{
		return new RuleEngine();
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Creates an instance of the {@link AccessLayer}-component
	 * 
	 * @return new AccessLayer-component
	 */
	public static AccessLayer createAccessLayer()
	{
		return new AccessLayer();
	}
	
    ///////////////////////////////////////////////////////////////////////////

	/**
	 * Creates an instance of the {@link LinkManager}-component
	 * 
	 * @return new LinkManager-component
	 */
	public static LinkManager createLinkManager()
	{
		return new LinkManager();
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Creates an instance of the {@link ReportManager}-component
	 * 
	 * @return new ReportManager-component
	 */
	public static ReportManager createReportManager()
	{
		return new ReportManager();
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Creates an instance of the {@link ProjectCleaner}-component
	 * 
	 * @return new ProjectCleaner-component
	 */
	public static ProjectCleaner createProjectCleaner()
	{
		return new ProjectCleaner();
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Creates an instance of the {@link DistanceBasedImpactAnalyzer}-component
	 * @return new DistanceBasedImpactAnalyzer-component
	 */
	public static DistanceBasedImpactAnalyzer createDistanceBasedImpactAnalyzer()
	{
		return new DistanceBasedImpactAnalyzer();
	}
	
    ///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Creates an instance of the {@link TypeBasedImpactAnalyzer}-component
	 * @return new TypeBasedImpactAnalyzer-component
	 */
	public static TypeBasedImpactAnalyzer createTypeBasedImpactAnalyzer()
	{
		return new TypeBasedImpactAnalyzer();
	}
}