package org.emftrace.quarc.core.tests.basetestcase;

//import org.eclipse.emf.emfstore.server.model.versioning.PrimaryVersionSpec;
//import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.emfstore.internal.common.model.Project;
import org.eclipse.emf.emfstore.internal.server.model.versioning.PrimaryVersionSpec;
import org.eclipse.emf.emfstore.internal.server.model.versioning.VersioningFactory;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Flaw;
import org.emftrace.metamodel.QUARCModel.GSS.GSS;
import org.emftrace.metamodel.QUARCModel.GSS.GSSFactory;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Impact;
import org.emftrace.metamodel.QUARCModel.GSS.Offset;
import org.emftrace.metamodel.QUARCModel.GSS.Pattern;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.metamodel.QUARCModel.GSS.isA;
import org.emftrace.metamodel.QUARCModel.Query.ApplicableElement;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedDecomposition;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.metamodel.QUARCModel.Query.Rating;
import org.emftrace.quarc.core.cache.CacheManager;
import org.junit.Before;


public abstract class QUARCCoreTestCase extends TestCase {
	
	
	protected GSS gss;
	
	
	protected Project project;
	

	protected AccessLayer accessLayer;
	
	protected CacheManager cacheManager;
	protected QueryResultSet queryResultSet;
	
	protected GSSQuery gssQuery;
	/*
	protected Tag goalTag;
	protected Tag flawTag;
	protected Tag principleTag;
	protected Tag patternTag;
	protected Tag refactoringTag;
	*/
	protected List<Element> targetsOfDecompositions;
	protected List<Element> sourcesOfDecompositions;
	

	protected List<Element> targetsOfImpacts;
	protected List<Element> sourcesOfImpacts;
	

	protected List<Element> targetsOfOffsets;
	protected List<Element> sourcesOfOffsets;
	protected ArrayList<Element> sourcesOfIsAs;
	protected ArrayList<Element> targetsOfIsAs;


		/* (non-Javadoc)
		 * @see junit.framework.TestCase#setUp()
		 */
	@Before // this is important, otherwise setUp() would not be called
    @Override
	public void setUp() throws Exception {
		super.setUp();
			
		targetsOfDecompositions = new ArrayList<Element>();
		sourcesOfDecompositions = new ArrayList<Element>();
		
		targetsOfImpacts = new ArrayList<Element>();
		sourcesOfImpacts = new ArrayList<Element>();

		targetsOfOffsets  = new ArrayList<Element>();
		sourcesOfOffsets = new ArrayList<Element>();
		
		targetsOfIsAs  = new ArrayList<Element>();
		sourcesOfIsAs  = new ArrayList<Element>();

			String name = "test";
			String TEMP_PATH = System.getProperty("user.dir");

			PrimaryVersionSpec versionSpec = VersioningFactory.eINSTANCE
					.createPrimaryVersionSpec();
			versionSpec.setIdentifier(0);

			File file = new File(TEMP_PATH);
			if (!file.exists()) {
				new File(TEMP_PATH).mkdir();
			}

			project = org.eclipse.emf.emfstore.internal.common.model.ModelFactory.eINSTANCE.createProject();

			// this is important, otherwise all methods which try to access a model's id
	        // will throw a NullPointer-Exception:
		    // project.initCaches();
	        			
			accessLayer = new AccessLayer(false);
			
			gss = GSSFactory.eINSTANCE.createGSS();

			project.addModelElement(gss);
			
			queryResultSet = QueryFactory.eINSTANCE.createQueryResultSet();
			
	        gssQuery = QueryFactory.eINSTANCE.createGSSQuery();
	    	gssQuery.setUuid("foo query ID");
	    	gssQuery.setTimestamp("01.01.1970 00:01");
	    	gssQuery.setUsername("foo user");
	    	
	    	gssQuery.setAssignedConstraintsSet(QueryFactory.eINSTANCE.createAssignedConstraintsSet());
	    	/*
	    	 goalTag = GSSFactory.eINSTANCE.createTag();
	    	goalTag.setName("goal");
	    	
	    	flawTag = GSSFactory.eINSTANCE.createTag();
	    	 
	    	flawTag.setName("flaw");
	    	
	    	 principleTag = GSSFactory.eINSTANCE.createTag();
	    	 
	    	 principleTag.setName("principle");
	    	
	    	patternTag = GSSFactory.eINSTANCE.createTag();
	    	patternTag.setName("pattern");
	    	
	    	refactoringTag = GSSFactory.eINSTANCE.createTag();
	    	refactoringTag.setName("refactoring");
			*/
			
		}

		/* (non-Javadoc)
		 * @see junit.framework.TestCase#tearDown()
		 */
		protected void tearDown() throws Exception {
			super.tearDown();
		}
		
		protected void assertContaintsApplicableElement(Element element, List<Element> targetsOfDecompositions,List<Element> sourcesOfDecompositions, List<Element> targetsOfImpacts,  List<Element> sourcesOfImpacts, List<Element>targetsOfOffsets, List<Element> sourcesOfOffsets, List<Element>targetsOfIsAs, List<Element> sourcesOfIsAs  ){
			boolean found = false;
			for (ApplicableElement ae : queryResultSet.getApplicableElements()){
				if (ae.getElement() == element){
					found = true;
					boolean relationFound = false;
					for (Element target : targetsOfDecompositions){
						relationFound = false;
						for (Relation relation : ae.getOutgoingDecompositionRelations()){
							if (relation.getTarget() == target){
								relationFound = true;
								break;
							}
						
						}
						if (!relationFound){
							System.out.println("existing otgoing Decomposition relations:");
							for (Relation existingRelation :  ae.getOutgoingDecompositionRelations())
								System.out.println(existingRelation+": " + existingRelation.getSource() +"->"+ existingRelation.getTarget());
							
									System.out.println("Decomposition relation to "+ target + " not found");
							fail("Decomposition relation to "+ target + " not found");
							
						
						}
							
					}
					
					assertEquals(targetsOfDecompositions.size(), ae.getOutgoingDecompositionRelations().size());
					
		
				
					for (Element source : sourcesOfDecompositions){
						relationFound = false;
						for (Relation relation : ae.getIncomingDecompositionRelations()){
							if (relation.getSource() == source){
								relationFound = true;
								break;
							}
						
						}
						if (!relationFound){
							System.out.println("existing incoming Decomposition relations:");
							for (Relation existingRelation :  ae.getIncomingDecompositionRelations())
								System.out.println(existingRelation+": " + existingRelation.getSource() +"->"+ existingRelation.getTarget());
									
									System.out.println("Decomposition relation form "+ source + " not found");
							fail("Decomposition relation form "+ source + " not found");
						
						}
							
					}
					
					assertEquals(sourcesOfDecompositions.size(), ae.getIncomingDecompositionRelations().size());
		
					
			
					for (Element target : targetsOfImpacts){
						relationFound = false;
						for (Relation relation : ae.getOutgoingImpactRelations()){
							if (relation.getTarget() == target){
								relationFound = true;
								break;
							
						}
						}
						if (!relationFound){
							System.out.println("existing outgoing Impact relations:");
							for (Relation existingRelation :  ae.getOutgoingImpactRelations())
								System.out.println(existingRelation+": " + existingRelation.getSource() +"->"+ existingRelation.getTarget() + " ("+((Impact)existingRelation).getWeight()+")");
									
									System.out.println("Impact relation to "+ target + " not found");
							fail("Impact relation to "+ target + " not found");
						
					}
							
					}
					
					assertEquals(targetsOfImpacts.size(), ae.getOutgoingImpactRelations().size());
					
			
			
					for (Element source : sourcesOfImpacts){
						relationFound = false;
						for (Relation relation : ae.getIncomingImpactRelations()){
							if (relation.getSource() == source){
								relationFound = true;
								break;
							}
						
						}
						if (!relationFound){
							
							System.out.println("existing incoming Impact relations:");
							for (Relation existingRelation :  ae.getIncomingImpactRelations())
								System.out.println(existingRelation+": " + existingRelation.getSource() +"->"+ existingRelation.getTarget() + " ("+((Impact)existingRelation).getWeight()+")");
								
									System.out.println("Impact relation from "+ source + " not found");
							fail("Impact relation from "+ source + " not found");
						
						}
					}
					
					assertEquals(sourcesOfImpacts.size(), ae.getIncomingImpactRelations().size());
					
				
						
						
					
					for (Element target : targetsOfOffsets){
						relationFound = false;
						for (Relation relation : ae.getOutgoingOffsetRelations()){
							if (relation.getTarget() == target){
								relationFound = true;
								break;
							}
						
						}
						if (!relationFound){
				
							
							System.out.println("existing outgoing Offset relations:");
							for (Relation existingRelation :  ae.getOutgoingOffsetRelations())
								System.out.println(existingRelation+": " + existingRelation.getSource() +"->"+ existingRelation.getTarget() + " ("+((Offset)existingRelation).getValue()+")");
									System.out.println("Offset relation to "+ target + " not found");
									fail("Offset relation to "+ target + " not found");
						
							
						}
					}
						
						assertEquals(targetsOfOffsets.size(), ae.getOutgoingOffsetRelations().size());
						
						
										for (Element source : sourcesOfOffsets){
											relationFound = false;
											for (Relation relation : ae.getIncomingOffsetRelations()){
												if (relation.getSource() == source){
													relationFound = true;
													break;
												}
											
											
											}
											if (!relationFound){
												
												System.out.println("existing incoming Offset relations:");
												for (Relation existingRelation :  ae.getIncomingOffsetRelations())
													System.out.println(existingRelation+": " + existingRelation.getSource() +"->"+ existingRelation.getTarget() + " ("+((Offset)existingRelation).getValue()+")");
													
														System.out.println("Offset relation form "+ source + " not found");
												fail("Offset relation form "+ source + " not found");
											
											}
											
									}
									assertEquals(sourcesOfOffsets.size(), ae.getIncomingOffsetRelations().size());
									
									
									for (Element source : sourcesOfIsAs){
										relationFound = false;
										for (Relation relation : ae.getIncomingIsARelations()){
											if (relation.getSource() == source){
												relationFound = true;
												break;
											}
										
										
										}
										if (!relationFound){
											
											System.out.println("existing incoming IsA relations:");
											for (Relation existingRelation :  ae.getIncomingIsARelations())
												System.out.println(existingRelation+": " + existingRelation.getSource() +"->"+ existingRelation.getTarget());
												
													System.out.println("IsA relation form "+ source + " not found");
											fail("IsA relation form "+ source + " not found");
										
										}
										
								}
									assertEquals(sourcesOfIsAs.size(), ae.getIncomingIsARelations().size());
								
						
					
							//		assertTrue(ae.getOutgoingIsARelations().size() <=1); //only one target allowed
									assertTrue(targetsOfIsAs.size() <=1); //invalid test only one target allowed
								
									if (targetsOfIsAs.isEmpty()){
										assertNull(ae.getOutgoingIsARelations());
									} else {
										assertEquals(targetsOfIsAs.get(0), ae.getOutgoingIsARelations().getTarget());
									}

					
					break;
				}
			}
			
			if (!found){
				System.out.println("existing ApplicableElements for:");
				for (ApplicableElement ae : queryResultSet.getApplicableElements()){
					System.out.println(ae.getElement());
				}
				System.out.println("ApplicableElement for " +element + " does not exist");
			
				fail("ApplicableElement for " +element + " does not exist");
			}
		}
		
		protected void assertNotContaintsApplicableElement(Element element){
			boolean found = false;
			for (ApplicableElement ae : queryResultSet.getApplicableElements()){
				if (ae.getElement() == element){
					found = true;
					break;
				}
			}
			
			if (found)
				fail("ApplicableElement for " +element + " does exist");
		}
		
		protected void assertContaintsApplicableElement(Element element){
			boolean found = false;
			for (ApplicableElement ae : queryResultSet.getApplicableElements()){
				if (ae.getElement() == element){
					found = true;
					break;
				}
			}
			
			if (!found)
				fail("ApplicableElement for " +element + " does not exist");
		}

		
		
		protected void createApplicableElementsForEachElement(List<Element> elements, QueryResultSet resultSet){
			for (Element element : elements){
				ApplicableElement ae = QueryFactory.eINSTANCE.createApplicableElement();
				ae.setElement(element);
				resultSet.getApplicableElements().add(ae);
			}
		}
		
		protected Goal createGoal(GSS gss, int id){
			Goal goal = GSSFactory.eINSTANCE.createGoal();
			goal.setName("Goal "+id);
		//7	goal.getTags().add(goalTag);
			gss.getElements().add(goal);
			return goal;
		}
		
		
		protected Pattern createPattern(GSS gss, int id){
			Pattern pattern = GSSFactory.eINSTANCE.createPattern();
			pattern.setName("Pattern "+id);
		//	pattern.getTags().add(patternTag);
			gss.getElements().add(pattern);
			return pattern;
		}

		
		protected Principle createPrinciple(GSS gss, int id){
			Principle principle = GSSFactory.eINSTANCE.createPrinciple();
			principle.setName("Principle "+id);
	//		principle.getTags().add(principleTag);
			gss.getElements().add(principle);
			return principle;
		}
		
		protected Flaw createFlaw(GSS gss, int id){
			Flaw flaw = GSSFactory.eINSTANCE.createFlaw();
			flaw.setName("Flaw "+id);
	//		flaw.getTags().add(flawTag);
			gss.getElements().add(flaw);
			return flaw;
		}
		
		protected Impact createImpact(GSS gss, Element source, Element target, float weight){
			Impact impact = GSSFactory.eINSTANCE.createImpact();
			impact.setSource(source);
			impact.setTarget(target);
			impact.setWeight(String.valueOf(weight));
			gss.getRelations().add(impact);
			return impact;
		}
		

		
		protected isA createIsA(GSS gss, Element source, Element target){
			isA isa = GSSFactory.eINSTANCE.createisA();
			isa.setSource(source);
			isa.setTarget(target);
			gss.getRelations().add(isa);
			return isa;
		}
		
		protected Decomposition createDecomposition(GSS gss, Element source, Element target){
			Decomposition decomposition = GSSFactory.eINSTANCE.createDecomposition();
			decomposition.setSource(source);
			decomposition.setTarget(target);
			gss.getRelations().add(decomposition);
			return decomposition;
		}
		
		protected Offset createOffset(GSS gss, Element source, Element target, float value){
			Offset offset = GSSFactory.eINSTANCE.createOffset();
			offset.setSource(source);
			offset.setTarget(target);
			offset.setValue(String.valueOf(value));
			gss.getRelations().add(offset);
			return offset;
		}
		
		protected Rating createRating(QueryResultSet queryResultSet, Element source, Element target, float weight){
			Rating rating = QueryFactory.eINSTANCE.createRating();
			rating.setSource(source);
			rating.setTarget(target);
			rating.setWeight(String.valueOf(weight));
			queryResultSet.getRatings().add(rating);
			return rating;
		}
		
		protected PrioritizedDecomposition createPriorizedDecomposition(GSSQuery query, Decomposition decomposition, int weight ){
			PrioritizedDecomposition newPriorizedDecomposition = QueryFactory.eINSTANCE.createPrioritizedDecomposition();
			newPriorizedDecomposition.setDecompostion(decomposition);
			newPriorizedDecomposition.setWeight(String.valueOf(weight));
			if (query.getSelectedGoalsSet() == null)
				query.setSelectedGoalsSet(QueryFactory.eINSTANCE.createSelectedGoalsSet());
			query.getSelectedGoalsSet().getPriorizedDecompositionRelations().add(newPriorizedDecomposition);
			return newPriorizedDecomposition;
		}
		
		protected PrioritizedElement createSelectedGoal(GSSQuery query, Goal goal, int globalPriority){
			PrioritizedElement selectedGoal = QueryFactory.eINSTANCE.createPrioritizedElement();
			selectedGoal.setElement(goal);
			selectedGoal.setGlobalPriority(String.valueOf(globalPriority));
			
			if (query.getSelectedGoalsSet() == null)
				query.setSelectedGoalsSet(QueryFactory.eINSTANCE.createSelectedGoalsSet());
			query.getSelectedGoalsSet().getPrioritizedElements().add(selectedGoal);
			return selectedGoal;
		}
		
		protected PrioritizedElement createSelectedPrinciple(GSSQuery query, Principle principle, int globalPriority){
			PrioritizedElement selectedPrinciple = QueryFactory.eINSTANCE.createPrioritizedElement();
			selectedPrinciple.setElement(principle);
			selectedPrinciple.setGlobalPriority(String.valueOf(globalPriority));
			
			if (query.getSelectedPrinciplesSet() == null)
				query.setSelectedPrinciplesSet(QueryFactory.eINSTANCE.createSelectedPrinciplesSet());
			query.getSelectedPrinciplesSet().getPrioritizedElements().add(selectedPrinciple);
			return selectedPrinciple;
		}

		protected void clearLists() {
			targetsOfDecompositions.clear();
			sourcesOfDecompositions.clear();

			targetsOfImpacts.clear();
			sourcesOfImpacts.clear();

			targetsOfOffsets.clear();
			sourcesOfOffsets.clear();
			
			sourcesOfIsAs.clear();
			targetsOfIsAs.clear();
		}
		

	}

