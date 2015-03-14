/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.reportmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.emftrace.core.factory.EMFTraceCoreFactory;
import org.emftrace.core.test.EMFTraceBaseTest;
import org.emftrace.metamodel.ChangeModel.AtomicChangeType;
import org.emftrace.metamodel.ChangeModel.AtomicType;
import org.emftrace.metamodel.ChangeModel.ChangeModelFactory;
import org.emftrace.metamodel.LinkModel.LinkModelFactory;
import org.emftrace.metamodel.LinkModel.LinkType;
import org.emftrace.metamodel.ReportModel.ConsistenceReport;
import org.emftrace.metamodel.ReportModel.ImpactReport;
import org.emftrace.metamodel.ReportModel.ReportContainer;
import org.emftrace.metamodel.ReportModel.ReportModelFactory;
import org.emftrace.metamodel.ReportModel.ReportType;
import org.emftrace.metamodel.ReportModel.ViolationType;
import org.emftrace.metamodel.URNModel.Actor;
import org.emftrace.metamodel.URNModel.URNModelFactory;
import org.junit.Test;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ReportManagerTest extends EMFTraceBaseTest 
{
    protected ReportManager reportManager;
    
    @Override
    public void setUp() throws Exception
    {
        super.setUp();
        
        reportManager = EMFTraceCoreFactory.createReportManager();
        reportManager.enableLogging(false);
        reportManager.registerAccessLayer(accessLayer);
    }
    
    @Test
    public void testCreateImpactReport()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	Actor a1 = URNModelFactory.eINSTANCE.createActor();
		    	Actor a2 = URNModelFactory.eINSTANCE.createActor();
		    	AtomicChangeType c = ChangeModelFactory.eINSTANCE.createAtomicChangeType();
		    	
		    	List<EObject> l1 = new ArrayList<EObject>();
		    	List<EObject> l2 = new ArrayList<EObject>();
		    	l1.add(a1);
		    	l2.add(a2);
		    	
		        project.deleteElements(project.getContents());
		    	
		    	// test the negative cases:
		    	assertEquals(0, accessLayer.getElements(project, "ImpactReport").size());
		    	reportManager.createImpactReport(null, null, null, null, null, null, null, true);
		    	assertEquals(0, accessLayer.getElements(project, "ImpactReport").size());
		    	reportManager.createImpactReport(project, null, null, null, null, null, null, true);
		    	assertEquals(0, accessLayer.getElements(project, "ImpactReport").size());
		    	reportManager.createImpactReport(null, l1, null, null, null, null, null, true);
		    	assertEquals(0, accessLayer.getElements(project, "ImpactReport").size());
		    	reportManager.createImpactReport(null, null, l2, null, null, null, null, true);
		    	assertEquals(0, accessLayer.getElements(project, "ImpactReport").size());
		    	reportManager.createImpactReport(null, null, null, c, null, null, null, true);
		    	assertEquals(0, accessLayer.getElements(project, "ImpactReport").size());
		    	reportManager.createImpactReport(null, null, null, null, null, null, null, true);
		    	assertEquals(0, accessLayer.getElements(project, "ImpactReport").size());
		    	reportManager.createImpactReport(project, l1, null, null, null, null, null, true);
		    	assertEquals(0, accessLayer.getElements(project, "ImpactReport").size());
		    	reportManager.createImpactReport(project, null, l2, null, null, null, null, true);
		    	assertEquals(0, accessLayer.getElements(project, "ImpactReport").size());
		    	reportManager.createImpactReport(project, null, null, c, null, null, null, true);
		    	assertEquals(0, accessLayer.getElements(project, "ImpactReport").size());
		    	reportManager.createImpactReport(project, null, null, null, null, null, null, true);
		    	assertEquals(0, accessLayer.getElements(project, "ImpactReport").size());
		    	
		    	// ... continue this ...
		    	   	
		    	// test the positive case:
		    	reportManager.createImpactReport(project, l1, l2, c, null, null, null, true);
		    	assertEquals(1, accessLayer.getElements(project, "ImpactReport").size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testCreateConsistenceReport()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	Actor a = URNModelFactory.eINSTANCE.createActor();
		    	ViolationType t = ReportModelFactory.eINSTANCE.createViolationType();
		    	
		    	// test the negative cases:
		    	assertEquals(0, accessLayer.getElements(project, "ConsistenceReport").size());
		    	reportManager.createConsistenceReport(null, null, null, null, null, null);
		    	assertEquals(0, accessLayer.getElements(project, "ConsistenceReport").size());
		    	reportManager.createConsistenceReport(project, null, null, null, null, null);
		    	assertEquals(0, accessLayer.getElements(project, "ConsistenceReport").size());
		    	reportManager.createConsistenceReport(null, a, null, null, null, null);
		    	assertEquals(0, accessLayer.getElements(project, "ConsistenceReport").size());
		    	reportManager.createConsistenceReport(null, null, t, null, null, null);
		    	assertEquals(0, accessLayer.getElements(project, "ConsistenceReport").size());
		    	reportManager.createConsistenceReport(project, a, null, null, null, null);
		    	assertEquals(0, accessLayer.getElements(project, "ConsistenceReport").size());
		    	reportManager.createConsistenceReport(project, null, t, null, null, null);
		    	assertEquals(0, accessLayer.getElements(project, "ConsistenceReport").size());
		    	reportManager.createConsistenceReport(null, a, t, null, null, null);
		    	assertEquals(0, accessLayer.getElements(project, "ConsistenceReport").size());
		    	
		    	// test the positive case:
		    	assertEquals(0, accessLayer.getElements(project, "ConsistenceReport").size());
		    	reportManager.createConsistenceReport(project, a, t, null, null, null);
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testCheckIfImpactReportAlreadyExists()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	ReportContainer container = ReportModelFactory.eINSTANCE.createReportContainer();
		    	ImpactReport r = ReportModelFactory.eINSTANCE.createImpactReport();
		    	Actor a1 = URNModelFactory.eINSTANCE.createActor();
		    	Actor a2 = URNModelFactory.eINSTANCE.createActor();
		    	AtomicChangeType c = ChangeModelFactory.eINSTANCE.createAtomicChangeType();
		    	LinkType t = LinkModelFactory.eINSTANCE.createLinkType();
		    	
		    	List<EObject> l1 = new ArrayList<EObject>();
		    	List<EObject> l2 = new ArrayList<EObject>();
		    	l1.add(a1);
		    	l2.add(a2);
		    	
		    	t.setName("TestRelation");
		    	c.setType(AtomicType.ADD);
		    	r.getImpactSources().add(a1);
		    	r.getAffectedElements().add(a2);
		    	r.setChangeType(c);
		    	r.setType(ReportType.IMPACT);
		    	container.getReports().add(r);
		    	
		    	accessLayer.addElement(project, container);
		    	
		    	assertFalse(reportManager.checkIfImpactReportAlreadyExists(null, null, null, null));
		    	assertFalse(reportManager.checkIfImpactReportAlreadyExists(project, null, null, null));
		    	assertFalse(reportManager.checkIfImpactReportAlreadyExists(null, l1, null, null));
		    	assertFalse(reportManager.checkIfImpactReportAlreadyExists(null, null, l2, null));
		    	assertFalse(reportManager.checkIfImpactReportAlreadyExists(null, null, null, c));
		    	assertFalse(reportManager.checkIfImpactReportAlreadyExists(null, null, null, null));
		    	// ... continue this ...
		    	
		    	Actor a3 = URNModelFactory.eINSTANCE.createActor();
		    	r.getImpactSources().clear();
		    	r.getImpactSources().add(a3);
		    	assertFalse(reportManager.checkIfImpactReportAlreadyExists(project, l1, l2, c));
		    	r.getImpactSources().clear();
		    	r.getImpactSources().add(a1);
		    	assertTrue(reportManager.checkIfImpactReportAlreadyExists(project, l1, l2, c));
		    	r.setType(ReportType.VIOLATION);
		    	assertFalse(reportManager.checkIfImpactReportAlreadyExists(project, l1, l2, c));
		    	r.setType(ReportType.BAD_SMELL);
		    	assertFalse(reportManager.checkIfImpactReportAlreadyExists(project, l1, l2, c));
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testCheckIfConsistenceReportAlreadyExists()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	ReportContainer container = ReportModelFactory.eINSTANCE.createReportContainer();
		    	ConsistenceReport r = ReportModelFactory.eINSTANCE.createConsistenceReport();
		    	Actor a = URNModelFactory.eINSTANCE.createActor();
		    	ViolationType t = ReportModelFactory.eINSTANCE.createViolationType();
		    	
		    	t.setName("TestViolationType");
		    	r.setTypeOfViolation(t);
		    	r.setType(ReportType.VIOLATION);
		    	r.setElement(a);
		    	
		    	container.getReports().add(r);
		    	accessLayer.addElement(project, container);
		    	   	
		    	assertFalse(reportManager.checkIfConsistenceReportAlreadyExists(null, null, null));
		    	assertFalse(reportManager.checkIfConsistenceReportAlreadyExists(project, null, null));
		    	assertFalse(reportManager.checkIfConsistenceReportAlreadyExists(project, a, null));
		    	assertFalse(reportManager.checkIfConsistenceReportAlreadyExists(null, a, t));
		    	assertFalse(reportManager.checkIfConsistenceReportAlreadyExists(project, null, t));
		    	assertFalse(reportManager.checkIfConsistenceReportAlreadyExists(project, a, null));
		    	assertFalse(reportManager.checkIfConsistenceReportAlreadyExists(null, null, t));
		    	assertFalse(reportManager.checkIfConsistenceReportAlreadyExists(null, a, null));
		    	
		    	Actor a2 = URNModelFactory.eINSTANCE.createActor();
		    	assertFalse(reportManager.checkIfConsistenceReportAlreadyExists(project, a2, t));
		    	
		    	r.setType(ReportType.IMPACT);
		    	assertFalse(reportManager.checkIfConsistenceReportAlreadyExists(project, a, t));
		    	
		    	r.setType(ReportType.VIOLATION);
		    	assertTrue(reportManager.checkIfConsistenceReportAlreadyExists(project, a, t));
		    	
		    	r.setType(ReportType.BAD_SMELL);
		    	assertTrue(reportManager.checkIfConsistenceReportAlreadyExists(project, a, t));
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
}
