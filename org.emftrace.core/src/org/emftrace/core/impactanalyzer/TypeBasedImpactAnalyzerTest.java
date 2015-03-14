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
import org.emftrace.core.linkmanager.LinkManager;
import org.emftrace.core.reportmanager.ReportManager;
import org.emftrace.core.rules.ruleengine.RuleEngine;
import org.emftrace.core.test.EMFTraceBaseTest;
import org.emftrace.metamodel.ChangeModel.AtomicChangeType;
import org.emftrace.metamodel.ChangeModel.ChangeModelFactory;
import org.emftrace.metamodel.ChangeModel.ChangeTypeCatalog;
import org.emftrace.metamodel.LinkModel.LinkModelFactory;
import org.emftrace.metamodel.LinkModel.LinkType;
import org.emftrace.metamodel.LinkModel.LinkTypeCatalog;
import org.emftrace.metamodel.LinkModel.TraceLink;
import org.emftrace.metamodel.RuleModel.ActionDefinition;
import org.emftrace.metamodel.RuleModel.ActionType;
import org.emftrace.metamodel.RuleModel.BaseCondition;
import org.emftrace.metamodel.RuleModel.BaseConditionType;
import org.emftrace.metamodel.RuleModel.ElementDefinition;
import org.emftrace.metamodel.RuleModel.LogicCondition;
import org.emftrace.metamodel.RuleModel.LogicConditionType;
import org.emftrace.metamodel.RuleModel.Rule;
import org.emftrace.metamodel.RuleModel.RuleCatalog;
import org.emftrace.metamodel.RuleModel.RuleModelFactory;
import org.emftrace.metamodel.URNModel.Concern;
import org.emftrace.metamodel.URNModel.URNModelFactory;
import org.junit.Test;

/**
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class TypeBasedImpactAnalyzerTest extends EMFTraceBaseTest 
{
    protected TypeBasedImpactAnalyzer impactAnalyzer;
    protected ReportManager reportManager;
    protected RuleEngine ruleEngine;
    protected LinkManager linkManager;
    
    @Override
    public void setUp() throws Exception
    {
        super.setUp();
        
        impactAnalyzer = EMFTraceCoreFactory.createTypeBasedImpactAnalyzer();
        impactAnalyzer.enableLogging(false);
        impactAnalyzer.registerAccessLayer(accessLayer);
        
        reportManager = EMFTraceCoreFactory.createReportManager();
        reportManager.enableLogging(false);
        reportManager.registerAccessLayer(accessLayer);
        
        linkManager = EMFTraceCoreFactory.createLinkManager();
        linkManager.enableLogging(false);
        linkManager.registerAccessLayer(accessLayer);
        
        ruleEngine = EMFTraceCoreFactory.createRuleEngine();
        ruleEngine.enableLogging(false);
        ruleEngine.registerAccessLayer(accessLayer);
        ruleEngine.registerReportManager(reportManager);
        ruleEngine.registerLinkManager(linkManager);
        
        impactAnalyzer.registerReportManager(reportManager);
        impactAnalyzer.registerRuleEngine(ruleEngine);
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
		    	 * A1----A2----A3
		    	 *        \__A4
		    	 * 
		    	 */
		    	
				project.getContents().clear();
				
		    	Concern a1 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern a2 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern a3 = URNModelFactory.eINSTANCE.createConcern();
		    	Concern a4 = URNModelFactory.eINSTANCE.createConcern();
		    	
		    	accessLayer.addElement(project, a1);
		    	accessLayer.addElement(project, a2);
		    	accessLayer.addElement(project, a3);
		    	accessLayer.addElement(project, a4);
		    	
		    	TraceLink linkA1_A2 = LinkModelFactory.eINSTANCE.createTraceLink();
		    	TraceLink linkA2_A3 = LinkModelFactory.eINSTANCE.createTraceLink();
		    	TraceLink linkA2_A4 = LinkModelFactory.eINSTANCE.createTraceLink();
		    	
		    	accessLayer.addElement(project, linkA1_A2);
		    	accessLayer.addElement(project, linkA2_A3);
		    	accessLayer.addElement(project, linkA2_A4);
		    	
		    	LinkTypeCatalog linkTypes = LinkModelFactory.eINSTANCE.createLinkTypeCatalog();
		    	
		    	accessLayer.addElement(project, linkTypes);
		    	
		    	LinkType linkType1 = LinkModelFactory.eINSTANCE.createLinkType();
		    	LinkType linkType2 = LinkModelFactory.eINSTANCE.createLinkType();
		    	LinkType linkType3 = LinkModelFactory.eINSTANCE.createLinkType();
		    	
		    	accessLayer.addElement(project, linkType1);
		    	accessLayer.addElement(project, linkType2);
		    	accessLayer.addElement(project, linkType3);
		    	
		    	linkType1.setName("refinement");
		    	linkType2.setName("implements");
		    	linkType3.setName("requires");
		    	
		    	linkTypes.getLinkTypes().add(linkType1);
		    	linkTypes.getLinkTypes().add(linkType2);
		    	linkTypes.getLinkTypes().add(linkType3);
		    	
		    	linkA1_A2.setSource(a1);
		    	linkA1_A2.setTarget(a2);
		    	linkA1_A2.setType(linkType1);
		    	
		    	linkA2_A3.setSource(a2);
		    	linkA2_A3.setTarget(a3);
		    	linkA2_A3.setType(linkType1);
		    	
		    	linkA2_A4.setSource(a2);
		    	linkA2_A4.setTarget(a4);
		    	linkA2_A4.setType(linkType2);
		    	
		    	ChangeTypeCatalog changeTypes = ChangeModelFactory.eINSTANCE.createChangeTypeCatalog();
		    	
		    	accessLayer.addElement(project, changeTypes);
		    	
		    	AtomicChangeType changeType1 = ChangeModelFactory.eINSTANCE.createAtomicChangeType();
		    	AtomicChangeType changeType2 = ChangeModelFactory.eINSTANCE.createAtomicChangeType();
		    	
		    	accessLayer.addElement(project, changeType1);
		    	accessLayer.addElement(project, changeType2);
		    	
		    	changeType1.setName("rename");
		    	changeType2.setName("delete");
		    	
		    	changeTypes.getChangeTypes().add(changeType1);
		    	changeTypes.getChangeTypes().add(changeType2);
		    	
		    	Rule impactRule1 = RuleModelFactory.eINSTANCE.createRule();
		    	Rule impactRule2 = RuleModelFactory.eINSTANCE.createRule();
		    	
		    	accessLayer.addElement(project, impactRule1);
		    	accessLayer.addElement(project, impactRule2);
		    	
		    	ElementDefinition rule1ED1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	ElementDefinition rule1ED2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	ElementDefinition rule1ED3 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	ElementDefinition rule2ED1 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	ElementDefinition rule2ED2 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	ElementDefinition rule2ED3 = RuleModelFactory.eINSTANCE.createElementDefinition();
		    	
		    	accessLayer.addElement(project, rule1ED1);
		    	accessLayer.addElement(project, rule1ED2);
		    	accessLayer.addElement(project, rule1ED3);
		    	accessLayer.addElement(project, rule2ED1);
		    	accessLayer.addElement(project, rule2ED2);
		    	accessLayer.addElement(project, rule2ED3);
		    	
		    	rule1ED1.setType("Concern");
		    	rule1ED1.setAlias("e1");
		    	rule1ED2.setType("Concern");
		    	rule1ED2.setAlias("e2");
		    	rule1ED3.setType("AtomicChangeType");
		    	rule1ED3.setAlias("e3");
		    	
		    	rule2ED1.setType("Concern");
		    	rule2ED1.setAlias("e1");
		    	rule2ED2.setType("Concern");
		    	rule2ED2.setAlias("e2");
		    	rule2ED3.setType("AtomicChangeType");
		    	rule2ED3.setAlias("e3");
		    	
		    	impactRule1.getElements().add(rule1ED1);
		    	impactRule1.getElements().add(rule1ED2);
		    	impactRule1.getElements().add(rule1ED3);
		    	
		    	impactRule2.getElements().add(rule2ED1);
		    	impactRule2.getElements().add(rule2ED2);
		    	impactRule2.getElements().add(rule2ED3);
		    	
		    	ActionDefinition rule1Action = RuleModelFactory.eINSTANCE.createActionDefinition();
		    	ActionDefinition rule2Action = RuleModelFactory.eINSTANCE.createActionDefinition();
		    	
		    	accessLayer.addElement(project, rule1Action);
		    	accessLayer.addElement(project, rule2Action);
		    	
		    	rule1Action.setActionType(ActionType.REPORT_IMPACT);
		    	rule1Action.setResultType("rename");
		    	rule1Action.setSourceElement("e1");
		    	rule1Action.setImpactedElement("e2");
		    	
		    	rule2Action.setActionType(ActionType.REPORT_IMPACT);
		    	rule2Action.setResultType("delete");
		    	rule2Action.setSourceElement("e1");
		    	rule2Action.setImpactedElement("e2");
		    	
		    	impactRule1.getActions().add(rule1Action);
		    	impactRule2.getActions().add(rule2Action);
		    	
		    	LogicCondition rule1LC = RuleModelFactory.eINSTANCE.createLogicCondition();
		    	LogicCondition rule2LC = RuleModelFactory.eINSTANCE.createLogicCondition();
		    	
		    	accessLayer.addElement(project, rule1LC);
		    	accessLayer.addElement(project, rule2LC);
		    	
		    	rule1LC.setType(LogicConditionType.AND);
		    	rule2LC.setType(LogicConditionType.AND);
		    	
		    	impactRule1.setConditions(rule1LC);
		    	impactRule2.setConditions(rule2LC);
		    	
		    	BaseCondition rule1BC1 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition rule1BC2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition rule2BC1 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	BaseCondition rule2BC2 = RuleModelFactory.eINSTANCE.createBaseCondition();
		    	
		    	accessLayer.addElement(project, rule1BC1);
		    	accessLayer.addElement(project, rule1BC2);
		    	accessLayer.addElement(project, rule2BC1);
		    	accessLayer.addElement(project, rule2BC2);
		    	
		    	rule1BC1.setType(BaseConditionType.VALUE_EQUALS);
		    	rule1BC1.setSource("e3::name");
		    	rule1BC1.setValue("rename");
		    	
		    	rule1BC2.setType(BaseConditionType.MODEL_RELATED_TO);
		    	rule1BC2.setSource("e1");
		    	rule1BC2.setTarget("e2");
		    	rule1BC2.setValue("refinement");    	
		    	
		    	rule2BC1.setType(BaseConditionType.VALUE_EQUALS);
		    	rule2BC1.setSource("e3::name");
		    	rule2BC1.setValue("delete");
		    	
		    	rule2BC2.setType(BaseConditionType.MODEL_RELATED_TO);
		    	rule2BC2.setSource("e1");
		    	rule2BC2.setTarget("e2");
		    	rule2BC2.setValue("implements");
		    	
		    	rule1LC.getBaseConditions().add(rule1BC1);
		    	rule1LC.getBaseConditions().add(rule1BC2);
		    	rule2LC.getBaseConditions().add(rule2BC1);
		    	rule2LC.getBaseConditions().add(rule2BC2);
		    	
		    	RuleCatalog impactRules = RuleModelFactory.eINSTANCE.createRuleCatalog();
		    	
		    	accessLayer.addElement(project, impactRules);
		    	
		    	impactRules.getRules().add(impactRule1);
		    	impactRules.getRules().add(impactRule2);
		    	
		    	List<EObject> startingImpactSet = new ArrayList<EObject>();
		    	
		    	startingImpactSet.add(changeType1);
		    	startingImpactSet.add(a1);
		    	
		    	assertEquals(0, accessLayer.getElements(project, "ReportContainer").size());
		    	assertEquals(0, accessLayer.getElements(project, "ImpactReport").size());
		    	
		    	impactAnalyzer.init(impactRules);
		    	assertEquals(2, impactAnalyzer.performImpactAnalysis(project, startingImpactSet, true, false));
		    	assertEquals(1, accessLayer.getElements(project, "ReportContainer").size());
		    	assertEquals(2, accessLayer.getElements(project, "ImpactReport").size());
		    	
		    	linkA2_A4.setType(linkType1);
		    	startingImpactSet.add(changeType1);
		    	startingImpactSet.add(a1);
		    	
		    	impactAnalyzer.init(impactRules);
		    	assertEquals(1, impactAnalyzer.performImpactAnalysis(project, startingImpactSet, true, false));
		    	assertEquals(1, accessLayer.getElements(project, "ReportContainer").size());
		    	assertEquals(3, accessLayer.getElements(project, "ImpactReport").size());
		    	
		    	startingImpactSet.add(changeType1);
		    	startingImpactSet.add(a1);
		    	
		    	impactAnalyzer.init(impactRules);
		    	assertEquals(3, impactAnalyzer.performImpactAnalysis(project, startingImpactSet, false, true));
		    	assertEquals(1, accessLayer.getElements(project, "ReportContainer").size());
		    	assertEquals(4, accessLayer.getElements(project, "ImpactReport").size());
		    	
		    	startingImpactSet.add(changeType1);
		    	startingImpactSet.add(a1);
		    	
		    	impactAnalyzer.init(impactRules);
		    	assertEquals(3, impactAnalyzer.performImpactAnalysis(project, startingImpactSet, true, true));
		    	assertEquals(1, accessLayer.getElements(project, "ReportContainer").size());
		    	assertEquals(4, accessLayer.getElements(project, "ImpactReport").size());
		    	
		    	linkA2_A4.setType(linkType2);
		    	startingImpactSet.add(changeType2);
		    	startingImpactSet.add(a2);
		    	
		    	impactAnalyzer.init(impactRules);
		    	assertEquals(1, impactAnalyzer.performImpactAnalysis(project, startingImpactSet, true, false));
		    	assertEquals(1, accessLayer.getElements(project, "ReportContainer").size());
		    	assertEquals(5, accessLayer.getElements(project, "ImpactReport").size());
		    	
		    	startingImpactSet.add(changeType2);
		    	startingImpactSet.add(a2);    	
		    	
		    	impactAnalyzer.init(impactRules);
		    	assertEquals(1, impactAnalyzer.performImpactAnalysis(project, startingImpactSet, false, true));
		    	assertEquals(1, accessLayer.getElements(project, "ReportContainer").size());
		    	assertEquals(5, accessLayer.getElements(project, "ImpactReport").size());
		    	
		    	startingImpactSet.add(changeType2);
		    	startingImpactSet.add(a2);
		    	
		    	impactAnalyzer.init(impactRules);
		    	assertEquals(1, impactAnalyzer.performImpactAnalysis(project, startingImpactSet, true, true));
		    	assertEquals(1, accessLayer.getElements(project, "ReportContainer").size());
		    	assertEquals(5, accessLayer.getElements(project, "ImpactReport").size());
		    	
		    	linkA1_A2.setType(linkType3);
		    	linkA2_A3.setType(linkType3);
		    	linkA2_A4.setType(linkType3);
		    	
		    	startingImpactSet.add(changeType1);
		    	startingImpactSet.add(a1);
		    	
		    	impactAnalyzer.init(impactRules);
		    	assertEquals(0, impactAnalyzer.performImpactAnalysis(project, startingImpactSet, true, true));
		    	assertEquals(1, accessLayer.getElements(project, "ReportContainer").size());
		    	assertEquals(5, accessLayer.getElements(project, "ImpactReport").size());
				return null;
			}
		};
		
		RunESCommand.run(call);
    }
}
