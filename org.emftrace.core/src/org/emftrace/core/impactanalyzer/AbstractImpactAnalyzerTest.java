/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.impactanalyzer;

import org.emftrace.core.factory.EMFTraceCoreFactory;
import org.emftrace.core.reportmanager.ReportManager;
import org.emftrace.core.test.EMFTraceBaseTest;
import org.junit.Test;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class AbstractImpactAnalyzerTest extends EMFTraceBaseTest
{
    protected AbstractImpactAnalyzer impactAnalyzer;
    protected ReportManager reportManager;
    
    @Override
    public void setUp() throws Exception
    {
        super.setUp();
        
        impactAnalyzer = EMFTraceCoreFactory.createDistanceBasedImpactAnalyzer();
        impactAnalyzer.enableLogging(false);
        impactAnalyzer.registerAccessLayer(accessLayer);
        
        reportManager = EMFTraceCoreFactory.createReportManager();
        reportManager.enableLogging(false);
        reportManager.registerAccessLayer(accessLayer);
    }
    
    @Test
    public void testRegisterReportManager()
    {
    	impactAnalyzer.registerReportManager(reportManager);
    }
    
    @Test
    public void testDisconnectReportManager()
    {
    	impactAnalyzer.disconnectReportManager();
    }
}
