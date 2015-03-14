/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.projectcleaner;

import java.util.concurrent.Callable;

import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.emftrace.core.factory.EMFTraceCoreFactory;
import org.emftrace.core.test.EMFTraceBaseTest;
import org.emftrace.metamodel.ChangeModel.AtomicChangeType;
import org.emftrace.metamodel.ChangeModel.ChangeModelFactory;
import org.emftrace.metamodel.ChangeModel.ChangeTypeCatalog;
import org.emftrace.metamodel.LinkModel.LinkContainer;
import org.emftrace.metamodel.LinkModel.LinkModelFactory;
import org.emftrace.metamodel.LinkModel.LinkType;
import org.emftrace.metamodel.LinkModel.LinkTypeCatalog;
import org.emftrace.metamodel.LinkModel.TraceLink;
import org.emftrace.metamodel.ReportModel.ConsistenceReport;
import org.emftrace.metamodel.ReportModel.ReportContainer;
import org.emftrace.metamodel.ReportModel.ReportModelFactory;
import org.emftrace.metamodel.ReportModel.ViolationType;
import org.emftrace.metamodel.ReportModel.ViolationTypeCatalog;
import org.emftrace.metamodel.RuleModel.Rule;
import org.emftrace.metamodel.RuleModel.RuleCatalog;
import org.emftrace.metamodel.RuleModel.RuleModelFactory;
import org.junit.Test;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class ProjectCleanerTest extends EMFTraceBaseTest
{
    private ProjectCleaner projectCleaner;
    
    @Override
    public void setUp() throws Exception
    {
        super.setUp();
        
        projectCleaner = EMFTraceCoreFactory.createProjectCleaner();
        projectCleaner.enableLogging(false);
        projectCleaner.registerAccessLayer(accessLayer);
    }
    
    @Test
    public void testCleanUpProjectProject()
    {
    }
    
    @Test
    public void testCleanUpRuleOrphansProject()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        Rule r1 = RuleModelFactory.eINSTANCE.createRule();
		        Rule r2 = RuleModelFactory.eINSTANCE.createRule();
		        
		        accessLayer.addElement(project, r1);
		        accessLayer.addElement(project, r2);
		        
		        RuleCatalog c1 = RuleModelFactory.eINSTANCE.createRuleCatalog();
		        
		        accessLayer.addElement(project, c1);
		        
		        c1.getRules().add(r1);
		        
		        assertEquals(1, c1.getRules().size());
		        assertEquals(1, accessLayer.getElements(project, "RuleCatalog").size());
		        assertEquals(2, accessLayer.getElements(project, "Rule").size());
		        projectCleaner.cleanUpRuleOrphans(project);
		        assertEquals(1, c1.getRules().size());
		        assertEquals(2, accessLayer.getElements(project, "Rule").size());
		        assertEquals(2, accessLayer.getElements(project, "RuleCatalog").size());
		        
		        Rule r3 = RuleModelFactory.eINSTANCE.createRule();
		        accessLayer.addElement(project, r3);
		        
		        assertEquals(3, accessLayer.getElements(project, "Rule").size());
		        projectCleaner.cleanUpLinkTypeOrphans(project);
		        assertEquals(3, accessLayer.getElements(project, "Rule").size());
		        assertEquals(2, accessLayer.getElements(project, "RuleCatalog").size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testCleanUpLinkTypeOrphansProject()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        LinkType t1 = LinkModelFactory.eINSTANCE.createLinkType();
		        LinkType t2 = LinkModelFactory.eINSTANCE.createLinkType();
		        
		        accessLayer.addElement(project, t1);
		        accessLayer.addElement(project, t2);
		        
		        LinkTypeCatalog c1 = LinkModelFactory.eINSTANCE.createLinkTypeCatalog();
		        
		        accessLayer.addElement(project, c1);
		        
		        c1.getLinkTypes().add(t1);
		        
		        assertEquals(1, c1.getLinkTypes().size());
		        assertEquals(1, accessLayer.getElements(project, "LinkTypeCatalog").size());
		        assertEquals(2, accessLayer.getElements(project, "LinkType").size());
		        projectCleaner.cleanUpLinkTypeOrphans(project);
		        assertEquals(1, c1.getLinkTypes().size());
		        assertEquals(2, accessLayer.getElements(project, "LinkType").size());
		        assertEquals(2, accessLayer.getElements(project, "LinkTypeCatalog").size());
		        
		        LinkType t3 = LinkModelFactory.eINSTANCE.createLinkType();
		        accessLayer.addElement(project, t3);
		        
		        assertEquals(3, accessLayer.getElements(project, "LinkType").size());
		        projectCleaner.cleanUpLinkTypeOrphans(project);
		        assertEquals(3, accessLayer.getElements(project, "LinkType").size());
		        assertEquals(2, accessLayer.getElements(project, "LinkTypeCatalog").size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }

    @Test
    public void testCleanUpViolationTypeOrphansProject()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        ViolationType t1 = ReportModelFactory.eINSTANCE.createViolationType();
		        ViolationType t2 = ReportModelFactory.eINSTANCE.createViolationType();
		        
		        accessLayer.addElement(project, t1);
		        accessLayer.addElement(project, t2);
		        
		        ViolationTypeCatalog c1 = ReportModelFactory.eINSTANCE.createViolationTypeCatalog();
		        
		        accessLayer.addElement(project, c1);
		        
		        c1.getViolationTypes().add(t1);
		        
		        assertEquals(1, c1.getViolationTypes().size());
		        assertEquals(1, accessLayer.getElements(project, "ViolationTypeCatalog").size());
		        assertEquals(2, accessLayer.getElements(project, "ViolationType").size());
		        projectCleaner.cleanUpViolationTypeOrphans(project);
		        assertEquals(1, c1.getViolationTypes().size());
		        assertEquals(2, accessLayer.getElements(project, "ViolationType").size());
		        assertEquals(2, accessLayer.getElements(project, "ViolationTypeCatalog").size());
		        
		        ViolationType t3 = ReportModelFactory.eINSTANCE.createViolationType();
		        accessLayer.addElement(project, t3);
		        
		        assertEquals(3, accessLayer.getElements(project, "ViolationType").size());
		        projectCleaner.cleanUpViolationTypeOrphans(project);
		        assertEquals(3, accessLayer.getElements(project, "ViolationType").size());
		        assertEquals(2, accessLayer.getElements(project, "ViolationTypeCatalog").size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testCleanUpChangeTypeOrphans()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        AtomicChangeType t1 = ChangeModelFactory.eINSTANCE.createAtomicChangeType();
		        AtomicChangeType t2 = ChangeModelFactory.eINSTANCE.createAtomicChangeType();
		        
		        accessLayer.addElement(project, t1);
		        accessLayer.addElement(project, t2);
		        
		        ChangeTypeCatalog c1 = ChangeModelFactory.eINSTANCE.createChangeTypeCatalog();
		        
		        accessLayer.addElement(project, c1);
		        
		        c1.getChangeTypes().add(t1);
		        
		        assertEquals(1, c1.getChangeTypes().size());
		        assertEquals(1, accessLayer.getElements(project, "ChangeTypeCatalog").size());
		        assertEquals(2, accessLayer.getElements(project, "AtomicChangeType").size());
		        projectCleaner.cleanUpChangeTypeOrphans(project);
		        assertEquals(1, c1.getChangeTypes().size());
		        assertEquals(2, accessLayer.getElements(project, "AtomicChangeType").size());
		        assertEquals(2, accessLayer.getElements(project, "ChangeTypeCatalog").size());
		        
		        AtomicChangeType t3 = ChangeModelFactory.eINSTANCE.createAtomicChangeType();
		        accessLayer.addElement(project, t3);
		        
		        assertEquals(3, accessLayer.getElements(project, "AtomicChangeType").size());
		        projectCleaner.cleanUpChangeTypeOrphans(project);
		        assertEquals(3, accessLayer.getElements(project, "AtomicChangeType").size());
		        assertEquals(2, accessLayer.getElements(project, "ChangeTypeCatalog").size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testUpdateLinkTypeCatalogsProject()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
			    LinkType t1 = LinkModelFactory.eINSTANCE.createLinkType();
		        LinkType t2 = LinkModelFactory.eINSTANCE.createLinkType();
		        
		        project.deleteElements(project.getContents());
		        
		        accessLayer.addElement(project, t1);
		        accessLayer.addElement(project, t2);
		        
		        LinkTypeCatalog c1 = LinkModelFactory.eINSTANCE.createLinkTypeCatalog();
		        
		        accessLayer.addElement(project, c1);
		        
		        c1.getLinkTypes().add(t1);
		        
		        assertEquals(1, c1.getLinkTypes().size());
		        assertEquals(1, accessLayer.getElements(project, "LinkTypeCatalog").size());
		        assertEquals(2, accessLayer.getElements(project, "LinkType").size());
		        projectCleaner.cleanUpLinkTypeOrphans(project);
		        assertEquals(1, c1.getLinkTypes().size());
		        assertEquals(2, accessLayer.getElements(project, "LinkType").size());
		        assertEquals(2, accessLayer.getElements(project, "LinkTypeCatalog").size());
		        
		        accessLayer.removeElement(project, t2);
		        assertEquals(1, accessLayer.getElements(project, "LinkType").size());
		        assertEquals(2, accessLayer.getElements(project, "LinkTypeCatalog").size());
		        projectCleaner.updateLinkTypeCatalogs(project);
		        assertEquals(1, accessLayer.getElements(project, "LinkType").size());
		        assertEquals(1, accessLayer.getElements(project, "LinkTypeCatalog").size());
		        projectCleaner.updateLinkTypeCatalogs(project);
		        assertEquals(1, accessLayer.getElements(project, "LinkType").size());
		        assertEquals(1, accessLayer.getElements(project, "LinkTypeCatalog").size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testUpdateViolationTypeCatalogsProject()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        ViolationType t1 = ReportModelFactory.eINSTANCE.createViolationType();
		        ViolationType t2 = ReportModelFactory.eINSTANCE.createViolationType();
		        
		        project.getContents().clear();
		        
		        accessLayer.addElement(project, t1);
		        accessLayer.addElement(project, t2);
		        
		        ViolationTypeCatalog c1 = ReportModelFactory.eINSTANCE.createViolationTypeCatalog();
		        
		        accessLayer.addElement(project, c1);
		        
		        c1.getViolationTypes().add(t1);
		        
		        assertEquals(1, c1.getViolationTypes().size());
		        assertEquals(1, accessLayer.getElements(project, "ViolationTypeCatalog").size());
		        assertEquals(2, accessLayer.getElements(project, "ViolationType").size());
		        projectCleaner.cleanUpViolationTypeOrphans(project);
		        assertEquals(1, c1.getViolationTypes().size());
		        assertEquals(2, accessLayer.getElements(project, "ViolationType").size());
		        assertEquals(2, accessLayer.getElements(project, "ViolationTypeCatalog").size());
		        
		        accessLayer.removeElement(project, t2);
		        assertEquals(1, accessLayer.getElements(project, "ViolationType").size());
		        assertEquals(2, accessLayer.getElements(project, "ViolationTypeCatalog").size());
		        projectCleaner.updateViolationTypeCatalogs(project);
		        assertEquals(1, accessLayer.getElements(project, "ViolationType").size());
		        assertEquals(1, accessLayer.getElements(project, "ViolationTypeCatalog").size());
		        projectCleaner.updateViolationTypeCatalogs(project);
		        assertEquals(1, accessLayer.getElements(project, "ViolationType").size());
		        assertEquals(1, accessLayer.getElements(project, "ViolationTypeCatalog").size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testUpdateRuleCatalogsProject()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		        Rule r1 = RuleModelFactory.eINSTANCE.createRule();
		        Rule r2 = RuleModelFactory.eINSTANCE.createRule();
		        
		        project.deleteElements(project.getContents());
		        
		        accessLayer.addElement(project, r1);
		        accessLayer.addElement(project, r2);
		        
		        RuleCatalog c1 = RuleModelFactory.eINSTANCE.createRuleCatalog();
		        
		        accessLayer.addElement(project, c1);
		        
		        c1.getRules().add(r1);
		        
		        assertEquals(1, c1.getRules().size());
		        assertEquals(1, accessLayer.getElements(project, "RuleCatalog").size());
		        assertEquals(2, accessLayer.getElements(project, "Rule").size());
		        projectCleaner.cleanUpRuleOrphans(project);
		        assertEquals(1, c1.getRules().size());
		        assertEquals(2, accessLayer.getElements(project, "Rule").size());
		        assertEquals(2, accessLayer.getElements(project, "RuleCatalog").size());
		        
		        accessLayer.removeElement(project, r2);
		        assertEquals(1, accessLayer.getElements(project, "Rule").size());
		        assertEquals(2, accessLayer.getElements(project, "RuleCatalog").size());
		        projectCleaner.updateRuleCatalogs(project);
		        assertEquals(1, accessLayer.getElements(project, "Rule").size());
		        assertEquals(1, accessLayer.getElements(project, "RuleCatalog").size());
		        projectCleaner.updateRuleCatalogs(project);
		        assertEquals(1, accessLayer.getElements(project, "Rule").size());
		        assertEquals(1, accessLayer.getElements(project, "RuleCatalog").size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testUpdateLinkContainerProject()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	project.getContents().clear();
		    	
		        assertEquals(0, accessLayer.getElements(project, "LinkContainer").size());
		        projectCleaner.updateLinkContainer(project);
		        assertEquals(1, accessLayer.getElements(project, "LinkContainer").size());
		        
		        LinkContainer c1 = LinkModelFactory.eINSTANCE.createLinkContainer();
		        LinkContainer c2 = LinkModelFactory.eINSTANCE.createLinkContainer();
		        
		        accessLayer.addElement(project, c1);
		        accessLayer.addElement(project, c2);
		        
		        TraceLink l1 = LinkModelFactory.eINSTANCE.createTraceLink();
		        TraceLink l2 = LinkModelFactory.eINSTANCE.createTraceLink();
		        TraceLink l3 = LinkModelFactory.eINSTANCE.createTraceLink();
		        
		        accessLayer.addElement(project, l1);
		        accessLayer.addElement(project, l2);
		        accessLayer.addElement(project, l3);
		        
		        c1.getLinks().add(l1);
		        c2.getLinks().add(l2);
		        c2.getLinks().add(l3);
		        
		        assertEquals(3, accessLayer.getElements(project, "LinkContainer").size());
		        assertEquals(3, accessLayer.getElements(project, "TraceLink").size());
		        projectCleaner.updateLinkContainer(project);
		        assertEquals(1, accessLayer.getElements(project, "LinkContainer").size());
		        assertEquals(3, accessLayer.getElements(project, "TraceLink").size());
		        
		        TraceLink l4 = LinkModelFactory.eINSTANCE.createTraceLink();
		        accessLayer.addElement(project, l4);
		        
		        assertEquals(4, accessLayer.getElements(project, "TraceLink").size());
		        assertEquals(3, ((LinkContainer)accessLayer.getElements(project, "LinkContainer").get(0)).getLinks().size());
		        projectCleaner.updateLinkContainer(project);
		        assertEquals(1, accessLayer.getElements(project, "LinkContainer").size());
		        assertEquals(4, ((LinkContainer)accessLayer.getElements(project, "LinkContainer").get(0)).getLinks().size());
		        assertEquals(4, accessLayer.getElements(project, "TraceLink").size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testUpdateReportContainerProject()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	project.getContents().clear();
		    	
		        assertEquals(0, accessLayer.getElements(project, "ReportContainer").size());
		        projectCleaner.updateReportContainer(project);
		        assertEquals(1, accessLayer.getElements(project, "ReportContainer").size());
		        
		        ReportContainer c1 = ReportModelFactory.eINSTANCE.createReportContainer();
		        ReportContainer c2 = ReportModelFactory.eINSTANCE.createReportContainer();
		        
		        accessLayer.addElement(project, c1);
		        accessLayer.addElement(project, c2);
		        
		        ConsistenceReport r1 = ReportModelFactory.eINSTANCE.createConsistenceReport();
		        ConsistenceReport r2 = ReportModelFactory.eINSTANCE.createConsistenceReport();
		        ConsistenceReport r3 = ReportModelFactory.eINSTANCE.createConsistenceReport();
		        
		        accessLayer.addElement(project, r1);
		        accessLayer.addElement(project, r2);
		        accessLayer.addElement(project, r3);
		        
		        c1.getReports().add(r1);
		        c1.getReports().add(r2);
		        c1.getReports().add(r3);
		        
		        assertEquals(3, accessLayer.getElements(project, "ReportContainer").size());
		        assertEquals(3, accessLayer.getElements(project, "ConsistenceReport").size());
		        projectCleaner.updateReportContainer(project);
		        assertEquals(1, accessLayer.getElements(project, "ReportContainer").size());
		        assertEquals(3, accessLayer.getElements(project, "ConsistenceReport").size());
		        
		        ConsistenceReport r4 = ReportModelFactory.eINSTANCE.createConsistenceReport();
		        accessLayer.addElement(project, r4);
		        
		        assertEquals(4, accessLayer.getElements(project, "ConsistenceReport").size());
		        assertEquals(3, ((ReportContainer)accessLayer.getElements(project, "ReportContainer").get(0)).getReports().size());
		        projectCleaner.updateReportContainer(project);
		        assertEquals(1, accessLayer.getElements(project, "ReportContainer").size());
		        assertEquals(4, ((ReportContainer)accessLayer.getElements(project, "ReportContainer").get(0)).getReports().size());
		        assertEquals(4, accessLayer.getElements(project, "ConsistenceReport").size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
    
    @Test
    public void testUpdateChangeTypeContainerProject()
    {
    	Callable<Void> call = new Callable<Void>()
    	{
			@Override
			public Void call() throws Exception
			{
		    	AtomicChangeType t1 = ChangeModelFactory.eINSTANCE.createAtomicChangeType();
		    	AtomicChangeType t2 = ChangeModelFactory.eINSTANCE.createAtomicChangeType();
		    	
		    	project.getContents().clear();
		        
		        accessLayer.addElement(project, t1);
		        accessLayer.addElement(project, t2);
		        
		        ChangeTypeCatalog c1 = ChangeModelFactory.eINSTANCE.createChangeTypeCatalog();
		        
		        accessLayer.addElement(project, c1);
		        
		        c1.getChangeTypes().add(t1);
		        
		        assertEquals(1, c1.getChangeTypes().size());
		        assertEquals(1, accessLayer.getElements(project, "ChangeTypeCatalog").size());
		        assertEquals(2, accessLayer.getElements(project, "AtomicChangeType").size());
		        projectCleaner.cleanUpChangeTypeOrphans(project);
		        assertEquals(1, c1.getChangeTypes().size());
		        assertEquals(2, accessLayer.getElements(project, "AtomicChangeType").size());
		        assertEquals(2, accessLayer.getElements(project, "ChangeTypeCatalog").size());
		        
		        accessLayer.removeElement(project, t2);
		        assertEquals(1, accessLayer.getElements(project, "AtomicChangeType").size());
		        assertEquals(2, accessLayer.getElements(project, "ChangeTypeCatalog").size());
		        projectCleaner.updateChangeTypeCatalogs(project);
		        assertEquals(1, accessLayer.getElements(project, "AtomicChangeType").size());
		        assertEquals(1, accessLayer.getElements(project, "ChangeTypeCatalog").size());
		        projectCleaner.updateChangeTypeCatalogs(project);
		        assertEquals(1, accessLayer.getElements(project, "AtomicChangeType").size());
		        assertEquals(1, accessLayer.getElements(project, "ChangeTypeCatalog").size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
}