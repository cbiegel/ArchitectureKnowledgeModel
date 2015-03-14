package org.emftrace.quarc.core.tests.conditions;

import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalPropertiesCatalogue;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalProperty;
import org.emftrace.quarc.core.conditions.NGramCheckCondition;
import org.emftrace.quarc.core.conditions.NGramCheckEObjectCondition;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;



public class NGramCheckEObjectConditionTest extends QUARCCoreTestCase{

	@Test
	public void testForName() {
		TechnicalPropertiesCatalogue catalogue = ConstraintsFactory.eINSTANCE.createTechnicalPropertiesCatalogue();
		TechnicalProperty tp1 = ConstraintsFactory.eINSTANCE.createBooleanTechnicalProperty();
		tp1.setName("foo");
		TechnicalProperty tp2 = ConstraintsFactory.eINSTANCE.createBooleanTechnicalProperty();
		tp2.setName("bar");
		
		catalogue.getCatalogueProperties().add(tp1);
		catalogue.getCatalogueProperties().add(tp2);
		
		NGramCheckCondition nGramCheckCondition = new NGramCheckCondition(
				3, "foo", 0.8f, true, true);

		NGramCheckEObjectCondition condition1 = new NGramCheckEObjectCondition(
				ConstraintsPackage.eINSTANCE.getTechnicalProperty_Name(),
				nGramCheckCondition,catalogue );


		SELECT statement = new SELECT(new FROM(catalogue
				.getCatalogueProperties()), new WHERE(condition1));
		
		IQueryResult result = statement.execute();
		

		
		assertTrue( result.contains(tp1));
		assertFalse( result.contains(tp2));
		
		assertEquals(1, result.size());
	}
	
	
	

}
