package org.emftrace.quarc.core.tests.commands.query;

import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.GSSQueryContainment;
import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;
import org.emftrace.quarc.core.commands.gssquery.AddGSSQuery;
import org.emftrace.quarc.core.tests.basetestcase.QUARCCoreTestCase;
import org.junit.Test;




public class AddGSSQueryTest extends QUARCCoreTestCase {

	@Test
	public void test() {
		String username = System.getProperty("user.name");
		GSSQueryContainment gssQueryContainment = QueryFactory.eINSTANCE.createGSSQueryContainment();
		GSSQuery query = QueryFactory.eINSTANCE.createGSSQuery();
		query.setUsername(username);
		query.setUuid("id");
		query.setTimestamp("now");
		new AddGSSQuery(gssQueryContainment, query).runWithoutUnicaseCommand();
		
	assertEquals(1, gssQueryContainment.getGssQueries().size());
	GSSQuery query_ = (GSSQuery) gssQueryContainment.getGssQueries().get(0);
	assertEquals(query, query_);
	assertEquals(username, query_.getUsername());
	assertEquals("id", query_.getUuid());
	assertEquals("now", query_.getTimestamp());



	}

}
