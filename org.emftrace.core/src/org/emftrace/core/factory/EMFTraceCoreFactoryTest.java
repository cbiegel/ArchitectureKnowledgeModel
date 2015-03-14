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
import org.emftrace.core.test.EMFTraceBaseTest;
import org.junit.Test;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class EMFTraceCoreFactoryTest extends EMFTraceBaseTest
{
    @Test
    public void testCreateRuleValidator()
    {
    	RuleValidator tmp = null;
    	assertNull(tmp);
    	tmp = EMFTraceCoreFactory.createRuleValidator();
    	assertNotNull(tmp);
    }
    
    @Test
    public void testCreateElementProcessor()
    {
    	ElementProcessor tmp = null;
    	assertNull(tmp);
    	tmp = EMFTraceCoreFactory.createElementProcessor();
    	assertNotNull(tmp);
    }
    
    @Test
    public void testCreateConditionProcessor()
    {
    	ConditionProcessor tmp = null;
    	assertNull(tmp);
    	tmp = EMFTraceCoreFactory.createConditionProcessor();
    	assertNotNull(tmp);
    }
    
    @Test
    public void testCreateJoinProcessor()
    {
    	JoinProcessor tmp = null;
    	assertNull(tmp);
    	tmp = EMFTraceCoreFactory.createJoinProcessor();
    	assertNotNull(tmp);
    }
    
    @Test
    public void testCreateResultProcessor()
    {
    	ResultProcessor tmp = null;
    	assertNull(tmp);
    	tmp = EMFTraceCoreFactory.createResultProcessor();
    	assertNotNull(tmp);
    }
    
    @Test
    public void testCreateRuleEngine()
    {
    	RuleEngine tmp = null;
    	assertNull(tmp);
    	tmp = EMFTraceCoreFactory.createRuleEngine();
    	assertNotNull(tmp);
    }
    
    @Test
    public void testCreateProjectCleaner()
    {
    	ProjectCleaner tmp = null;
    	assertNull(tmp);
    	tmp = EMFTraceCoreFactory.createProjectCleaner();
    	assertNotNull(tmp);
    }
    
    @Test
    public void testCreateAccessLayer()
    {
    	AccessLayer tmp = null;
    	assertNull(tmp);
    	tmp = EMFTraceCoreFactory.createAccessLayer();
    	assertNotNull(tmp);
    }
    
    @Test
    public void testCreateLinkManager()
    {
    	LinkManager tmp = null;
    	assertNull(tmp);
    	tmp = EMFTraceCoreFactory.createLinkManager();
    	assertNotNull(tmp);
    }
    
    @Test
    public void testCreateReportManager()
    {
    	ReportManager tmp = null;
    	assertNull(tmp);
    	tmp = EMFTraceCoreFactory.createReportManager();
    	assertNotNull(tmp);
    }
    
    @Test
    public void testCreateDistanceBasedImpactAnalyzer()
    {
    	DistanceBasedImpactAnalyzer tmp = null;
    	assertNull(tmp);
    	tmp = EMFTraceCoreFactory.createDistanceBasedImpactAnalyzer();
    	assertNotNull(tmp);
    }
    
    @Test
    public void testCreateTypeBasedImpactAnalyzer()
    {
    	TypeBasedImpactAnalyzer tmp = null;
    	assertNull(tmp);
    	tmp = EMFTraceCoreFactory.createTypeBasedImpactAnalyzer();
    	assertNotNull(tmp);
    }
}