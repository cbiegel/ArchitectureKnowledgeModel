/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.impactanalyzer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.emftrace.core.factory.EMFTraceCoreFactory;
import org.emftrace.core.reportmanager.ReportManager;
import org.emftrace.core.test.EMFTraceBaseTest;
import org.emftrace.metamodel.LinkModel.LinkModelFactory;
import org.emftrace.metamodel.LinkModel.TraceLink;
import org.emftrace.metamodel.URNModel.Concern;
import org.emftrace.metamodel.URNModel.URNModelFactory;
import org.junit.Test;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class DistanceBasedImpactAnalyzerTest extends EMFTraceBaseTest
{
    protected DistanceBasedImpactAnalyzer impactAnalyzer;
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
        
        impactAnalyzer.registerReportManager(reportManager);
    }
       
    @Test
    public void testPerformImpactAnalysis()
    {   	
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{  
		    	/* create the following test scenario:
		    	 * 
		    	 *   A6----A7----A8
		    	 *  /
		    	 * A1----A2----A3---A9
		    	 *  \     \__A4
		    	 *   \__A5
		    	 * 
		    	 */
		    	
		    	Concern a1 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern a2 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern a3 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern a4 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern a5 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern a6 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern a7 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern a8 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern a9 = URNModelFactory.eINSTANCE.createConcern();
		    	
		    	TraceLink linkA1_A2 = LinkModelFactory.eINSTANCE.createTraceLink();
		    	TraceLink linkA1_A6 = LinkModelFactory.eINSTANCE.createTraceLink();
		    	TraceLink linkA1_A5 = LinkModelFactory.eINSTANCE.createTraceLink();
		    	TraceLink linkA2_A3 = LinkModelFactory.eINSTANCE.createTraceLink();
		    	TraceLink linkA2_A4 = LinkModelFactory.eINSTANCE.createTraceLink();
		    	TraceLink linkA3_A9 = LinkModelFactory.eINSTANCE.createTraceLink();
		    	TraceLink linkA6_A7 = LinkModelFactory.eINSTANCE.createTraceLink();
		    	TraceLink linkA7_A8 = LinkModelFactory.eINSTANCE.createTraceLink();
		    	
		    	linkA1_A2.setSource(a1);
		    	linkA1_A2.setTarget(a2);
		    	linkA1_A6.setSource(a1);
		    	linkA1_A6.setTarget(a6);
		    	linkA1_A5.setSource(a1);
		    	linkA1_A5.setTarget(a5);
		    	linkA2_A3.setSource(a2);
		    	linkA2_A3.setTarget(a3);
		    	linkA2_A4.setSource(a2);
		    	linkA2_A4.setTarget(a4);
		    	linkA3_A9.setSource(a3);
		    	linkA3_A9.setTarget(a9);
		    	linkA6_A7.setSource(a6);
		    	linkA6_A7.setTarget(a7);
		    	linkA7_A8.setSource(a7);
		    	linkA7_A8.setTarget(a8);
		    	
		    	accessLayer.addElement(project, a1);
		    	accessLayer.addElement(project, a2);
		    	accessLayer.addElement(project, a3);
		    	accessLayer.addElement(project, a4);
		    	accessLayer.addElement(project, a5);
		    	accessLayer.addElement(project, a6);
		    	accessLayer.addElement(project, a7);
		    	accessLayer.addElement(project, a8);
		    	accessLayer.addElement(project, a9);
		    	
		    	accessLayer.addElement(project, linkA1_A2);
		    	accessLayer.addElement(project, linkA1_A6);
		    	accessLayer.addElement(project, linkA1_A5);
		    	accessLayer.addElement(project, linkA2_A3);
		    	accessLayer.addElement(project, linkA2_A4);
		    	accessLayer.addElement(project, linkA3_A9);
		    	accessLayer.addElement(project, linkA6_A7);
		    	accessLayer.addElement(project, linkA7_A8);
		    	
		    	List<EObject> sis = new ArrayList<EObject>();
		    	sis.add(a1);
		    	
		    	assertEquals(0, accessLayer.getElements(project, "ReportContainer").size());
		    	assertEquals(0, accessLayer.getElements(project, "ImpactReport").size());
		    	impactAnalyzer.setPropagationDistance(1);
		    	assertEquals(3, impactAnalyzer.performImpactAnalysis(project, sis, false, false));
		    	assertEquals(1, accessLayer.getElements(project, "ReportContainer").size());
		    	assertEquals(1, accessLayer.getElements(project, "ImpactReport").size());
		    	
		    	impactAnalyzer.setPropagationDistance(2);
		    	assertEquals(6, impactAnalyzer.performImpactAnalysis(project, sis, false, false));
		    	assertEquals(1, accessLayer.getElements(project, "ReportContainer").size());
		    	assertEquals(2, accessLayer.getElements(project, "ImpactReport").size());
		    	
		    	impactAnalyzer.setPropagationDistance(3);
		    	assertEquals(8, impactAnalyzer.performImpactAnalysis(project, sis, false, false));
		    	assertEquals(1, accessLayer.getElements(project, "ReportContainer").size());
		    	assertEquals(3, accessLayer.getElements(project, "ImpactReport").size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
}