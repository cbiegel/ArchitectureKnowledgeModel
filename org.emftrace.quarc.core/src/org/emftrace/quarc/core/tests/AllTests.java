package org.emftrace.quarc.core.tests;

import org.emftrace.quarc.core.tests.aggregations.AvgCalculatorTest;
import org.emftrace.quarc.core.tests.aggregations.MaxCalculatorTest;
import org.emftrace.quarc.core.tests.aggregations.MinCalculatorTest;
import org.emftrace.quarc.core.tests.aggregations.WeightedAvgCalculatorTest;
import org.emftrace.quarc.core.tests.aggregations.WeightedMaxCalculatorTest;
import org.emftrace.quarc.core.tests.aggregations.WeightedMinCalculatorTest;
import org.emftrace.quarc.core.tests.cache.ApplicableElementCacheTest;
import org.emftrace.quarc.core.tests.cache.GSSCacheTest;
import org.emftrace.quarc.core.tests.cache.PrioritizedElementsCacheTest;
import org.emftrace.quarc.core.tests.commands.assignedconstraintsset.AddConstraintToAssignedConstraintsSetCommandTest;
import org.emftrace.quarc.core.tests.commands.assignedconstraintsset.AddConstraintsCommandTest;
import org.emftrace.quarc.core.tests.commands.assignedconstraintsset.ClearAssignedConstraintSetCommandTest;
import org.emftrace.quarc.core.tests.commands.assignedconstraintsset.InsertConstraintToAssignedConstraintsSetCommandTest;
import org.emftrace.quarc.core.tests.commands.constraints.SetConstraintPropertyCommandTest;
import org.emftrace.quarc.core.tests.commands.constraints.SetConstraintValueCommandTest;
import org.emftrace.quarc.core.tests.commands.predefinedcontraintsets.CreatePredefinedConstraintSetCommandTest;
import org.emftrace.quarc.core.tests.commands.prioritizedelementsset.AddPrioritizedElementCommandTest;
import org.emftrace.quarc.core.tests.commands.prioritizedelementsset.RemovePrioritizedElementCommandTest;
import org.emftrace.quarc.core.tests.commands.prioritizedelementsset.RepairPrioritizedElemenetsPrioritiesCommandTest;
import org.emftrace.quarc.core.tests.commands.prioritizedelementsset.UpdatePrioritizedDecompositionWeightCommandTest;
import org.emftrace.quarc.core.tests.commands.prioritizedelementsset.UpdatePrioritizedElementPriorityCommandTest;
import org.emftrace.quarc.core.tests.commands.query.AddGSSQueryTest;
import org.emftrace.quarc.core.tests.conditions.ExcludeEObjectConditionTest;
import org.emftrace.quarc.core.tests.conditions.NGramCheckConditionTest;
import org.emftrace.quarc.core.tests.conditions.NGramCheckEObjectConditionTest;
import org.emftrace.quarc.core.tests.gssquery.GSSQueryProcessorTest;
import org.emftrace.quarc.core.tests.helpers.ConstraintValueValidatorTest;
import org.emftrace.quarc.core.tests.helpers.PreconditionFinderTest;
import org.emftrace.quarc.core.tests.preselector.ApplicabilityTesterTest;
import org.emftrace.quarc.core.tests.preselector.ApplicableElementsSelectorTest;
import org.emftrace.quarc.core.tests.preselector.GSSGraphPrunerTest;
import org.emftrace.quarc.core.tests.preselector.LogicConditionEvaluatorTest;
import org.emftrace.quarc.core.tests.ratingscalculator.AdjustmentMatrixCreatorTest;
import org.emftrace.quarc.core.tests.ratingscalculator.AdjustmentProcessorTest;
import org.emftrace.quarc.core.tests.ratingscalculator.GoalRatingsCalculatorTest;
import org.emftrace.quarc.core.tests.ratingscalculator.MappingMatrixCreatorTest;
import org.emftrace.quarc.core.tests.ratingscalculator.MatrixTest;
import org.emftrace.quarc.core.tests.ratingscalculator.PrincipleRatingsCalculatorTest;
import org.emftrace.quarc.core.tests.ratingscalculator.RatingsCalculatorTest;
import org.emftrace.quarc.core.tests.ratingscalculator.RatingsRelationCreatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({// GSSQueryProcessorTest.class,

		// caches
		ApplicableElementCacheTest.class,
		GSSCacheTest.class,
		PrioritizedElementsCacheTest.class,

		// preselecor

		ApplicabilityTesterTest.class,
		LogicConditionEvaluatorTest.class,
		ApplicableElementsSelectorTest.class,
		GSSGraphPrunerTest.class,

		// ratingscalculator
		AdjustmentMatrixCreatorTest.class,
		AdjustmentProcessorTest.class,
		GoalRatingsCalculatorTest.class,
		MappingMatrixCreatorTest.class,
		MatrixTest.class,
		PrincipleRatingsCalculatorTest.class,
		RatingsRelationCreatorTest.class,
		RatingsCalculatorTest.class,
		
		
		//GSSQueryProcessor
		GSSQueryProcessorTest.class,

		//helpers
		ConstraintValueValidatorTest.class,
		PreconditionFinderTest.class,
		
		
		//aggregations
		AvgCalculatorTest.class,
		MinCalculatorTest.class,
		MaxCalculatorTest.class,
		WeightedAvgCalculatorTest.class,
		WeightedMinCalculatorTest.class,
		WeightedMaxCalculatorTest.class,
		
		
		//commands
		
		//constraints
		AddConstraintsCommandTest.class,
		AddConstraintToAssignedConstraintsSetCommandTest.class,
		ClearAssignedConstraintSetCommandTest.class,
		InsertConstraintToAssignedConstraintsSetCommandTest.class,
		
		SetConstraintPropertyCommandTest.class,
		SetConstraintValueCommandTest.class,
		
		CreatePredefinedConstraintSetCommandTest.class,
		

		
		//PrioritizedElementC
		AddPrioritizedElementCommandTest.class,
		RemovePrioritizedElementCommandTest.class,
		RepairPrioritizedElemenetsPrioritiesCommandTest.class,
		UpdatePrioritizedDecompositionWeightCommandTest.class,
		UpdatePrioritizedElementPriorityCommandTest.class,

		
		
		//gssquery
		AddGSSQueryTest.class,
		
		//conditions
		ExcludeEObjectConditionTest.class,
		NGramCheckConditionTest.class,
		NGramCheckEObjectConditionTest.class
})
public class AllTests {

}
