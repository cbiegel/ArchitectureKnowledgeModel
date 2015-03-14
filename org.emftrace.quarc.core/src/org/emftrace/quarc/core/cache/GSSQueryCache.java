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

package org.emftrace.quarc.core.cache;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Impact;
import org.emftrace.metamodel.QUARCModel.GSS.Offset;
import org.emftrace.metamodel.QUARCModel.GSS.Refinement;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument;
import org.emftrace.metamodel.QUARCModel.GSS.isA;
import org.emftrace.metamodel.QUARCModel.Query.ApplicableElement;
import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.metamodel.QUARCModel.Query.Rating;

/**
 * A Cache for ApplicableElements. Provides various helpers for
 * ApplicableElements.
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class GSSQueryCache extends AbstractCache {

	/**
	 * a Map to cache ApplicableElements and their referenced Element
	 */
	private Map<ApplicableElement, Element> applicableElementsCache;

	/**
	 * a Map to cache Ratings relations between two Elements
	 */
	private Map<Element, LinkedHashMap<Element, Rating>> ratingsCache;

	/**
	 * a Map to cache the weights of Rating relations
	 */
	private Map<Rating, Float> ratingsWeightCache;

	/**
	 * a Map to cache Element and their corresponding ApplicableElement
	 */
	private Map<Element, ApplicableElement> elementsCache;

	/**
	 * a Map to cache root Elements
	 */
	private Map<Element, Boolean> rootElements;

	/**
	 * a Map to cache leaf Elements
	 */
	private Map<Element, Boolean> leafElements;

	/**
	 * the constructor
	 * 
	 * @param queryResultSet
	 *            a QueryResultSet which contains the ApplicableElements
	 * @param accessLayer
	 *            an AccessLayer
	 */
	public GSSQueryCache(QueryResultSet queryResultSet, AccessLayer accessLayer) {
		super(queryResultSet, accessLayer);
	}

	/**
	 * getter for root Elements
	 * 
	 * @return a List with all applicable root Elements
	 */
	public List<Element> getRootElements() {
		List<Element> result = new ArrayList<Element>();
		for (Entry<Element, Boolean> entry : rootElements.entrySet()) {
			if (entry.getValue() == true) {
				result.add(entry.getKey());
			}
		}
		return result;
	}

	/**
	 * 
	 * @param element
	 *            an applicable Element
	 * @return true if the specified Element is a root Element else false
	 */
	public boolean isRootElement(Element element) {
		return rootElements.containsKey(element) && rootElements.get(element);
	}

	/**
	 * 
	 * @param element
	 *            an Element
	 * @return true if the specified Element is applicable else false
	 */
	public boolean isApplicableElement(Element element) {
		return elementsCache.containsKey(element);
	}

	/**
	 * 
	 * @param element
	 *            an applicable Element
	 * @return true if the specified Element is a leaf Element else false
	 */
	public boolean isLeafElement(Element element) {
		return leafElements.containsKey(element) && leafElements.get(element);
	}

	/**
	 * @return a List with all cached root ApplicableElements
	 */
	public List<ApplicableElement> getRootApplicableElements() {
		List<ApplicableElement> result = new ArrayList<ApplicableElement>();
		for (Element element : getRootElements()) {
			result.add(elementsCache.get(element));
		}
		return result;
	}

	/**
	 * @return a Set of all ApplicableElement with the referenced Element
	 */
	public Set<Entry<ApplicableElement, Element>> getApplicableElementsSet() {
		Set<Entry<ApplicableElement, Element>> result = new HashSet<Entry<ApplicableElement, Element>>();
		for (Entry<ApplicableElement, Element> entry : applicableElementsCache
				.entrySet()) {

			result.add(entry);

		}
		return result;
	}

	/**
	 * @return a Set of all Elements with their ApplicableElements
	 */
	public Set<Entry<Element, ApplicableElement>> getElementsSet() {
		Set<Entry<Element, ApplicableElement>> result = new HashSet<Entry<Element, ApplicableElement>>();
		for (Entry<Element, ApplicableElement> entry : elementsCache.entrySet()) {

			result.add(entry);

		}
		return result;
	}

	/**
	 * @param className
	 *            the name of the EClass of an Element
	 * @return a Set of all ApplicableElement with the referenced Element with
	 *         the specified class name
	 */
	public Set<Entry<ApplicableElement, Element>> getApplicableElementsSet(
			String className) {
		Set<Entry<ApplicableElement, Element>> result = new HashSet<Entry<ApplicableElement, Element>>();
		for (Entry<ApplicableElement, Element> entry : applicableElementsCache
				.entrySet()) {
			if (entry.getValue().eClass().getName().equals(className))
				result.add(entry);

		}
		return result;
	}

	/**
	 * @param className
	 *            the name of the EClass of an Element
	 * @return a Set of all Element with the specified class name and their
	 *         ApplicableElements
	 */
	public Set<Entry<Element, ApplicableElement>> getElementsSet(
			String className) {
		Set<Entry<Element, ApplicableElement>> result = new HashSet<Entry<Element, ApplicableElement>>();
		for (Entry<Element, ApplicableElement> entry : elementsCache.entrySet()) {
			if (entry.getKey().eClass().getName().equals(className))
				result.add(entry);

		}
		return result;
	}

	/**
	 * @param applicableElement
	 *            an ApplicableElement
	 * @return a List with all incoming Impact relations to the specified
	 *         ApplicableElement
	 */
	public List<Impact> getIncomingImpactRelations(
			ApplicableElement applicableElement) {
		return applicableElement.getIncomingImpactRelations();
	}

	/**
	 * @param element
	 *            an applicable Element
	 * @return a List with all incoming Impact relations to the specified
	 *         applicable Element
	 */
	public List<Impact> getIncomingImpactRelations(Element element) {
		return getApplicableElement(element).getIncomingImpactRelations();
	}

	/**
	 * @param element
	 *            an applicable Element
	 * @return the ApplicableElement for the specified applicable Element
	 */
	public ApplicableElement getApplicableElement(Element element) {
		return elementsCache.get(element);
	}

	/**
	 * @param applicableElement
	 *            an ApplicableElement
	 * @return the referenced applicable Element for the specified
	 *         ApplicableElement
	 */
	public Element getElement(ApplicableElement applicableElement) {
		return applicableElementsCache.get(applicableElement);
	}

	/**
	 * @param applicableElement
	 *            an ApplicableElement
	 * @return a List with all outgoing Impact relations from the specified
	 *         ApplicableElement
	 */
	public List<Impact> getOutgoingImpactRelations(
			ApplicableElement applicableElement) {
		return applicableElement.getOutgoingImpactRelations();
	}

	/**
	 * @param element
	 *            an applicable Element
	 * @return a List with all outgoing Impact relations from the specified
	 *         applicable Element
	 */
	public List<Impact> getOutgoingImpactRelations(Element element) {
		return getApplicableElement(element).getOutgoingImpactRelations();
	}

	/**
	 * @param applicableElement
	 *            an ApplicableElement
	 * @return a List with all outgoing Offset relations from the specified
	 *         ApplicableElement
	 */
	public List<Offset> getOutgoingOffsetRelations(
			ApplicableElement applicableElement) {
		return applicableElement.getOutgoingOffsetRelations();
	}

	/**
	 * @param element
	 *            an applicable Element
	 * @return a List with all outgoing Offset relations from the specified
	 *         applicable Element
	 */
	public List<Offset> getOutgoingOffsetRelations(Element element) {
		return getApplicableElement(element).getOutgoingOffsetRelations();
	}

	/**
	 * @param applicableElement
	 *            an ApplicableElement
	 * @return a List with all incoming Offset relations to the specified
	 *         ApplicableElement
	 */
	public List<Offset> getIncomingOffsetRelations(
			ApplicableElement applicableElement) {
		return applicableElement.getIncomingOffsetRelations();
	}

	/**
	 * @param element
	 *            an applicable Element
	 * @return a List with all incoming Offset relations to the specified
	 *         applicable Element
	 */
	public List<Offset> getIncomingOffsetRelations(Element element) {
		return getApplicableElement(element).getIncomingOffsetRelations();
	}

	/**
	 * @param applicableElement
	 *            an ApplicableElement
	 * @return a List with all incoming Decomposition relations to the specified
	 *         ApplicableElement
	 */
	public List<Decomposition> getIncomingDecompositionRelations(
			ApplicableElement applicableElement) {
		return applicableElement.getIncomingDecompositionRelations();
	}

	/**
	 * @param element
	 *            an applicable Element
	 * @return a List with all incoming Decomposition relations to the specified
	 *         applicable Element
	 */
	public List<Decomposition> getIncomingDecompositionRelations(Element element) {
		return getApplicableElement(element)
				.getIncomingDecompositionRelations();
	}

	/**
	 * @param applicableElement
	 *            an ApplicableElement
	 * @return a List with all outgoing Decomposition relations from the
	 *         specified ApplicableElement
	 */
	public List<Decomposition> getOutgoingDecompositionRelations(
			ApplicableElement applicableElement) {
		return applicableElement.getOutgoingDecompositionRelations();
	}

	/**
	 * @param element
	 *            an applicable Element
	 * @return a List with all outgoing Decomposition relations from the
	 *         specified applicable Element
	 */
	public List<Decomposition> getOutgoingDecompositionRelations(Element element) {
		return getApplicableElement(element)
				.getOutgoingDecompositionRelations();
	}

	/**
	 * @param element
	 *            an applicable Element
	 * @return the outgoing IsA relation from the specified applicable Element
	 */
	public isA getOutgoingIsARelation(Element element) {
		return getApplicableElement(element).getOutgoingIsARelations();
	}

	/**
	 * @param element
	 *            an applicable Element
	 * @return a List with all incoming IsA relations to the specified
	 *         applicable Element
	 */
	public List<isA> getIncomingIsARelations(Element element) {
		return getApplicableElement(element).getIncomingIsARelations();
	}

	/**
	 * @param applicableElement
	 *            an ApplicableElement
	 * @return the outgoing IsA relation from the specified ApplicableElement
	 */
	public isA getOutgoingIsARelations(ApplicableElement applicableElement) {
		return applicableElement.getOutgoingIsARelations();
	}

	/**
	 * @param applicableElement
	 *            an ApplicableElement
	 * @return a List with all incoming IsA relations to the specified
	 *         ApplicableElement
	 */
	public List<isA> getIncomingIsARelations(ApplicableElement applicableElement) {
		return applicableElement.getIncomingIsARelations();
	}

	/**
	 * Initializes the cache
	 */
	public void initCache() {
		rootElements = new LinkedHashMap<Element, Boolean>();
		leafElements = new LinkedHashMap<Element, Boolean>();
		applicableElementsCache = new LinkedHashMap<ApplicableElement, Element>();
		elementsCache = new LinkedHashMap<Element, ApplicableElement>();

		ratingsCache = new LinkedHashMap<Element, LinkedHashMap<Element, Rating>>();
		ratingsWeightCache = new LinkedHashMap<Rating, Float>();
		for (ApplicableElement applicableElement : getQueryResultSet()
				.getApplicableElements()) {
			addApplicableElementToCache(applicableElement);
		}

		for (Rating rating : getQueryResultSet().getRatings()) {
			addRatingToCache(rating, rating.getSource(), rating.getTarget(),
					Float.valueOf(rating.getWeight()));
		}

	}

	/**
	 * adds the specified ApplicableElement to the cache
	 * 
	 * @param applicableElement
	 *            an ApplicableElement
	 */
	private void addApplicableElementToCache(ApplicableElement applicableElement) {
		Element element = applicableElement.getElement();
		addApplicableElementToCache(applicableElement, element);
	}

	/**
	 * adds the specified ApplicableElement to the cache
	 * 
	 * @param applicableElement
	 *            an ApplicableElement
	 * @param element
	 *            the Element referenced by the specified ApplicableElement
	 */
	private void addApplicableElementToCache(
			ApplicableElement applicableElement, Element element) {
		applicableElementsCache.put(applicableElement, element);
		elementsCache.put(element, applicableElement);
		rootElements.put(element, isRoot(element));
		leafElements.put(element, isLeaf(element));
	}

	/**
	 * @param applicableElement
	 *            an ApplicableElement
	 * @return a List with all incoming Relations to the specified
	 *         ApplicableElement
	 */
	public List<Relation> getAllIncomingRelations(
			ApplicableElement applicableElement) {
		List<Relation> incomingRelationList = new ArrayList<Relation>();
		incomingRelationList
				.addAll(getIncomingDecompositionRelations(applicableElement));
		incomingRelationList
				.addAll(getIncomingImpactRelations(applicableElement));
		incomingRelationList
				.addAll(getIncomingOffsetRelations(applicableElement));
		incomingRelationList.addAll(getIncomingIsARelations(applicableElement));
		return incomingRelationList;
	}

	/**
	 * @param applicableElement
	 *            an ApplicableElement
	 * @return a List with all outgoing Relations from the specified
	 *         ApplicableElement
	 */
	public List<Relation> getAllOutgoingRelations(
			ApplicableElement applicableElement) {
		List<Relation> incomingRelationList = new ArrayList<Relation>();
		incomingRelationList
				.addAll(getOutgoingDecompositionRelations(applicableElement));
		incomingRelationList
				.addAll(getOutgoingImpactRelations(applicableElement));
		if (getOutgoingIsARelations(applicableElement) != null)
			incomingRelationList
					.add(getOutgoingIsARelations(applicableElement));
		incomingRelationList
				.addAll(getOutgoingOffsetRelations(applicableElement));
		return incomingRelationList;
	}

	/**
	 * @param element
	 *            an applicable Element
	 * @return a List with all incoming Relations to the specified applicable
	 *         Element
	 */
	public List<Relation> getAllIncomingRelations(Element element) {
		return getAllIncomingRelations(getApplicableElement(element));
	}

	/**
	 * @param element
	 *            an applicable Element
	 * @return a List with all outgoing Relations from the specified applicable
	 *         Element
	 */
	public List<Relation> getAllOutgoingRelations(Element element) {
		return getAllOutgoingRelations(getApplicableElement(element));
	}

	/**
	 * @return a List with all cached applicable Elements
	 */
	public List<Element> getAllElements() {
		List<Element> result = new ArrayList<Element>();
		for (Entry<Element, ApplicableElement> entry : getElementsSet()) {
			result.add(entry.getKey());
		}
		return result;
	}

	/**
	 * @return a List with all cached ApplicableElements
	 */
	public List<ApplicableElement> getAllApplicableElements() {
		List<ApplicableElement> result = new ArrayList<ApplicableElement>();
		for (Entry<ApplicableElement, Element> entry : getApplicableElementsSet()) {
			result.add(entry.getKey());
		}
		return result;
	}

	/**
	 * @param layer
	 *            a GSSLayer (GSSLayer.layer1..GSSLayer.layer4) note: layer1
	 *            equals layer 2
	 * @return a List with all cached applicable Elements
	 */
	public List<Element> getAllElements(int layer) {
		List<Element> result = new ArrayList<Element>();
		for (Element element : getAllElements()) {
			if (GSSCache.getGSSLayer(element) == layer)
				result.add(element);
		}
		return result;
	}

	/**
	 * @param layer
	 *            a GSSLayer (GSSLayer.layer1..GSSLayer.layer4) note: layer1
	 *            equals layer 2
	 * @return a List with all cached applicable root Elements
	 */
	public List<Element> getRootElements(int layer) {
		List<Element> result = new ArrayList<Element>();
		for (Element element : getAllElements(layer)) {
			if (isRoot(element))
				result.add(element);
		}
		return result;
	}

	/**
	 * @param layer
	 *            an GSSLayer (GSSLayer.layer1..GSSLayer.layer4) note: layer1
	 *            equals layer 2
	 * @return a List with all cached applicable leaf Elements
	 */
	public List<Element> getLeafElements(int layer) {
		List<Element> result = new ArrayList<Element>();
		for (Element element : getAllElements(layer)) {
			if (isLeaf(element))
				result.add(element);
		}
		return result;
	}

	/**
	 * @param element
	 *            an Element
	 * @return true if the specified applicable Element isn't a root or leaf
	 */
	public boolean isInnerNodeElement(Element element) {
		return !isRootElement(element) && !isLeafElement(element);
	}

	/**
	 * @param element
	 *            an Element
	 * @return true if Element is a leaf Element
	 */
	private boolean isLeaf(Element element) {
		if (!(element instanceof SolutionInstrument))
			return getIncomingDecompositionRelations(element).isEmpty();
		else
			return getIncomingIsARelations(element).isEmpty();
	}

	/**
	 * @param element
	 *            an Element
	 * @return true if Element is a root Element
	 */
	private boolean isRoot(Element element) {
		if (!(element instanceof SolutionInstrument))
			return getOutgoingDecompositionRelations(element).isEmpty();
		else
			return getOutgoingIsARelation(element) == null;
	}

	/**
	 * adds the specified relation as an applicable relation to the specified
	 * ApplicableElements and caches the relation
	 * 
	 * @param sourceApplicableElement
	 *            the ApplicableElement for the source of the Relation
	 * @param targetApplicableElement
	 *            the ApplicableElement for the target of the Relation
	 * @param relation
	 *            a Relation between two applicable Elements
	 */
	public void addRelation(ApplicableElement sourceApplicableElement,
			ApplicableElement targetApplicableElement, Relation relation) {
		if (relation instanceof Decomposition) {
			targetApplicableElement.getIncomingDecompositionRelations().add(
					(Decomposition) relation);
			sourceApplicableElement.getOutgoingDecompositionRelations().add(
					(Decomposition) relation);

		} else if (relation instanceof isA) {

			targetApplicableElement.getIncomingIsARelations().add(
					(isA) relation);
			sourceApplicableElement.setOutgoingIsARelations((isA) relation);

		} else if (relation instanceof Impact) {

			targetApplicableElement.getIncomingImpactRelations().add(
					(Impact) relation);
			sourceApplicableElement.getOutgoingImpactRelations().add(
					(Impact) relation);

		} else if (relation instanceof Offset) {

			targetApplicableElement.getIncomingOffsetRelations().add(
					(Offset) relation);
			sourceApplicableElement.getOutgoingOffsetRelations().add(
					(Offset) relation);
		}
		if (relation instanceof Refinement) {
			Element targetElement = getElement(targetApplicableElement);
			if (isLeafElement(targetElement)) {
				// remove leaf element from cache
				if (!isLeaf(targetElement)) {
					leafElements.remove(targetElement);
				}
			}

			Element sourceElement = getElement(sourceApplicableElement);
			if (isRootElement(sourceElement)) {
				// remove leaf element from cache

				if (!isRoot(sourceElement)) {
					rootElements.remove(sourceElement);
				}
			}
		}

	}

	/**
	 * adds the specified relation from an Element with undefined satisfaction
	 * of the Precondition to the specified ApplicableElement and caches the
	 * relation
	 * 
	 * @param sourceApplicableElement
	 *            the ApplicableElement for the source of the Relation
	 * @param relation
	 *            a relation from an Element with undefined satisfaction
	 */
	public void addRelationForUndefinedApplicableness(
			ApplicableElement targetApplicableElement, Relation relation) {
		targetApplicableElement
				.getIncomingRelationsFromElementsWithUndefinedProperties().add(
						relation);

	}

	/**
	 * Creates an ApplicableElement for the specified Element and caches the
	 * ApplicableElement
	 * 
	 * @param element
	 *            an Element
	 * @return the created ApplicableElement
	 */
	public ApplicableElement createApplicableElement(Element element) {
		ApplicableElement newApplicableElement = QueryFactory.eINSTANCE
				.createApplicableElement();
		newApplicableElement.setElement(element);
		getQueryResultSet().getApplicableElements().add(newApplicableElement);
		addApplicableElementToCache(newApplicableElement, element);
		return newApplicableElement;
	}

	/**
	 * Creates a Rating relation between the specified Elements and caches the
	 * Rating relation
	 * 
	 * @param sourceElement
	 *            the source Element of the Rating relation
	 * @param targetElement
	 *            the target Element of the Rating relation
	 * @param weight
	 *            the weight of the Rating relation
	 * @return the created ApplicableElement
	 */
	public Rating createRatingRelation(Element sourceElement,
			Element targetElement, float weight) {
		Rating rating = QueryFactory.eINSTANCE.createRating();
		rating.setSource(sourceElement);
		rating.setTarget(targetElement);
		rating.setWeight(String.valueOf(weight));
		getQueryResultSet().getRatings().add(rating);
		addRatingToCache(rating, sourceElement, targetElement, weight);
		return rating;
	}

	/**
	 * add the specified Rating relation to the cache
	 * 
	 * @param rating
	 *            a Rating relation
	 * @param sourceElement
	 *            the source Element of the Rating relation
	 * @param targetElement
	 *            the target Element of the Rating relation
	 * @param weight
	 *            the weight of the Rating relation
	 */
	private void addRatingToCache(Rating rating, Element sourceElement,
			Element targetElement, float weight) {
		if (ratingsCache.containsKey(targetElement)) {
			ratingsCache.get(targetElement).put(sourceElement, rating);
		} else {
			LinkedHashMap<Element, Rating> newEntry = new LinkedHashMap<Element, Rating>();
			newEntry.put(sourceElement, rating);
			ratingsCache.put(targetElement, newEntry);
		}
		ratingsWeightCache.put(rating, weight);

	}

	/**
	 * @param sourceElement
	 *            the source Element of a Rating relation
	 * @param targetElement
	 *            the target Element of a Rating relation
	 * @return the weight of the found Rating relation between the specified
	 *         Elements
	 */
	public float getRatingWeight(Element sourceElement, Element targetElement) {
		Rating rating = getRatingRelation(sourceElement, targetElement);
		if (rating != null)
			return ratingsWeightCache.get(rating);
		else
			return 0.0f;
	}

	/**
	 * @param sourceElement
	 *            the source Element of a Rating relation
	 * @param targetElement
	 *            the target Element of a Rating relation
	 * @return the weight of the found Rating relation between the specified
	 *         Elements
	 */
	public float getIndirectRatingWeight(Element sourceElement,
			Element targetElement) {
		Rating rating = getRatingRelation(sourceElement, targetElement);
		if (rating != null)
			return ratingsWeightCache.get(rating);
		float ratingSum = 0.0f;
		int count = 0;

		if (sourceElement instanceof SolutionInstrument) {
			for (isA incomingIsA : getIncomingIsARelations(sourceElement)) {
				count++;
				ratingSum += getIndirectRatingWeight(incomingIsA.getSource(),
						targetElement);
			}
		} else
			for (Decomposition outgoingDecomposition : getOutgoingDecompositionRelations(sourceElement)) {
				count++;
				ratingSum += getIndirectRatingWeight(
						outgoingDecomposition.getTarget(), targetElement);
			}

		return count > 0 ? ratingSum / count : 0.0f;
	}

	/**
	 * @param sourceElement
	 *            the source Element of a Rating relation
	 * @param targetElement
	 *            the target Element of a Rating relation
	 * @return the found Rating relation between the specified Elements
	 */
	public Rating getRatingRelation(Element sourceElement, Element targetElement) {
		if (ratingsCache.containsKey(targetElement))
			return ratingsCache.get(targetElement).get(sourceElement);
		else
			return null;

	}

	/**
	 * @param selectedGoal
	 *            a Goal
	 * @return a List with all Rating relations to the specified Goal
	 */
	public List<Rating> getRatingRelationsTo(Goal selectedGoal) {
		if (ratingsCache.containsKey(selectedGoal))
			return new ArrayList<Rating>(ratingsCache.get(selectedGoal)
					.values());
		else
			return new ArrayList<Rating>(); // an empty list
	}

	/**
	 * @return the input of the cache
	 */
	public QueryResultSet getQueryResultSet() {
		return (QueryResultSet) getInput();
	}

}
