/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.core.test;

import org.emftrace.core.accesslayer.AccessLayerTest;
import org.emftrace.core.accesslayer.ModelElementCacheTest;
import org.emftrace.core.factory.EMFTraceCoreFactoryTest;
import org.emftrace.core.impactanalyzer.AbstractImpactAnalyzerTest;
import org.emftrace.core.impactanalyzer.DistanceBasedImpactAnalyzerTest;
import org.emftrace.core.impactanalyzer.TypeBasedImpactAnalyzerTest;
import org.emftrace.core.linkmanager.LinkManagerTest;
import org.emftrace.core.projectcleaner.ProjectCleanerTest;
import org.emftrace.core.reportmanager.ReportManagerTest;
import org.emftrace.core.rules.conditionprocessor.ConditionProcessorTest;
import org.emftrace.core.rules.elementprocessor.ElementProcessorTest;
import org.emftrace.core.rules.joinprocessor.JoinProcessorTest;
import org.emftrace.core.rules.processingcomponent.ProcessingComponentTest;
import org.emftrace.core.rules.resultprocessor.ResultProcessorTest;
import org.emftrace.core.rules.ruleengine.RuleEngineTest;
import org.emftrace.core.rules.util.InputValidatorTest;
import org.emftrace.core.rules.util.ElementResolverTest;
import org.emftrace.core.rules.util.NGramCheckTest;
import org.emftrace.core.rules.util.ConditionProcessorHelperTest;
import org.emftrace.core.rules.validator.RuleValidatorTest;
import org.emftrace.core.tracecomponent.TraceComponentTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses
( 
    { 
         AccessLayerTest.class,
         ModelElementCacheTest.class,
         ElementResolverTest.class,
         ConditionProcessorHelperTest.class,
         NGramCheckTest.class,
         LinkManagerTest.class,
         ReportManagerTest.class,
         ProjectCleanerTest.class,
         RuleValidatorTest.class,
         ElementProcessorTest.class,
         ConditionProcessorTest.class,
         JoinProcessorTest.class,
         ResultProcessorTest.class,
         RuleEngineTest.class,
         TraceComponentTest.class,
         ProcessingComponentTest.class,
         InputValidatorTest.class,
         EMFTraceCoreFactoryTest.class,
         AbstractImpactAnalyzerTest.class,
         DistanceBasedImpactAnalyzerTest.class,
         TypeBasedImpactAnalyzerTest.class
    }
)
public class AllTests
{
}