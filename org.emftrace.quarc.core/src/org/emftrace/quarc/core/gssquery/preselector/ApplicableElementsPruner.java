/*******************************************************************************
 * Copyright (c) 2010-2012 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor: Daniel Motschmann
 ******************************************************************************/ 

package org.emftrace.quarc.core.gssquery.preselector;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Flaw;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Impact;
import org.emftrace.metamodel.QUARCModel.GSS.Offset;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.metamodel.QUARCModel.GSS.isA;
import org.emftrace.metamodel.QUARCModel.Query.ApplicableElement;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.cache.GSSLayer;
import org.emftrace.quarc.core.gssquery.AbstractProcessor;




/**
 * The GSSGraphPruner prunes the GSS graph (represented by the List of ApplicableElements at GSSQuery.QueryResult) by tringing out the GSS graph by removing all principles and solution instruments without a transitive relation to a goal
 * <br>
 * 
 * @author Daniel Motschmann
 * @version 1.0
 * 
 * 
 */

public class ApplicableElementsPruner extends AbstractProcessor{


	private Map<Element, Boolean> hasIndirectRelationToAnInstrument;
	
	private boolean prunePrinciplesWithoutRelationsFormSolutionInstruments;

	/**
	 * 
	 *  the constructor
	 *  
	 * @param gssQuery a GSSQuery
	 * @param queryResult a QueryResultSet
	 * @param accessLayer an AccessLayer
	 * @param cacheManager a CacheManager
	 * @param prunePrinciplesWithoutRelationsFormSolutionInstruments principles without relations form solution instruments should be prunded
	 */
	public ApplicableElementsPruner(GSSQuery gssQuery, QueryResultSet queryResult, AccessLayer accessLayer, CacheManager cacheManager, boolean prunePrinciplesWithoutRelationsFormSolutionInstruments) {
		super(gssQuery, queryResult, accessLayer, cacheManager);
		this.prunePrinciplesWithoutRelationsFormSolutionInstruments = prunePrinciplesWithoutRelationsFormSolutionInstruments;
	}

	/* (non-Javadoc)
	 * @see quarc_gsscore.gssquery.GSSPhase#execute()
	 */
	@Override
	public void doRun() {
		hasIndirectRelationToAnInstrument = new LinkedHashMap<Element, Boolean>();
		for (Element solutionInstrument : cacheManager.getLeafApplicableElementElements(GSSLayer.layer4)){
			if (cacheManager.isLeaf(solutionInstrument))
			checkNodeForIndirectRelationToSolutionInstrument(solutionInstrument);
		}
	
		pruneApplicableElements(cacheManager.getApplicableElementsSet());
		
	}
	
	/**
	 * fills the Map hasIndirectRelationToAnInstrument 
	 * 
	 * @param element the element to start from
	 */
	private void checkNodeForIndirectRelationToSolutionInstrument(
			Element element) {
		if (!hasIndirectRelationToAnInstrument.containsKey(element)) {
			//if node not visited already
			hasIndirectRelationToAnInstrument.put(element, true);
			List <Relation> outgoingRelationList = new ArrayList<Relation>();
			outgoingRelationList.addAll(cacheManager.getApplicableOutgoingDecompositionRelations(element));
			if (cacheManager.getApplicableOutgoingIsARelations(element)!= null)
				outgoingRelationList.add(cacheManager.getApplicableOutgoingIsARelations(element));
			outgoingRelationList.addAll(cacheManager.getApplicableOutgoingImpactRelations(element));
			
			for ( Relation outgoingRelation: (outgoingRelationList)){

				Element target = cacheManager.getTargetOfRelation(outgoingRelation);
				checkNodeForIndirectRelationToSolutionInstrument(target);
			}	
		}
	}

	/**
	 * do pruning with the specifed Set of ApplicableElements
	 * @param applicableElementsSet a Set of ApplicableElement/ Elements
	 */
	private void pruneApplicableElements(
			Set<Entry<ApplicableElement, Element>> applicableElementsSet) {
		for (Entry<ApplicableElement, Element> entry : applicableElementsSet){
			Element element = entry.getValue();
			ApplicableElement applicableElement = entry.getKey();
			if (elementIsToPrune(element)){
				pruneApplicableElement(applicableElement);
			}
		}
		
	}

	/**
	 * Calculates Element is to prune or not
	 * @param element an Element 
	 * @return Element is to prune or not
	 */
	private boolean elementIsToPrune(Element element) {
		return (! (element instanceof Goal || (prunePrinciplesWithoutRelationsFormSolutionInstruments == false && (element instanceof Principle || element instanceof Flaw)))) && ( ! hasIndirectRelationToAnInstrument.containsKey(element) ||hasIndirectRelationToAnInstrument.get(element) == false);
	}	

	/**
	 * prune the specified ApplicableElement
	 * @param applicableElement an ApplicableElement
	 */
	private void pruneApplicableElement(ApplicableElement applicableElement) {

		for (Relation relation : cacheManager.getAllApplicableOutgoingRelations(applicableElement)){
			Element target = cacheManager.getTargetOfRelation(relation);
			if (!elementIsToPrune(target)){
			 ApplicableElement applicableTargetElement = cacheManager.getApplicableElementForElement(target);
			 if (relation instanceof Impact)
				 applicableTargetElement.getIncomingImpactRelations().remove(relation);
			 else
			 if (relation instanceof Offset)
				 applicableTargetElement.getIncomingOffsetRelations().remove(relation);
			 else
			 if (relation instanceof Decomposition)
				 applicableTargetElement.getIncomingDecompositionRelations().remove(relation);
			 else
			 if (relation instanceof isA)
				 applicableTargetElement.getIncomingIsARelations().remove(relation);
			} //else no required due to Element is removed already or will be removed in future
		}
		queryResultSet.getApplicableElements().remove(applicableElement);
		
	}


}
