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

import org.eclipse.emf.ecore.EObject;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Flaw;
import org.emftrace.metamodel.QUARCModel.GSS.GSS;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Impact;
import org.emftrace.metamodel.QUARCModel.GSS.Offset;
import org.emftrace.metamodel.QUARCModel.GSS.Pattern;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.metamodel.QUARCModel.GSS.Refactoring;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument;
import org.emftrace.metamodel.QUARCModel.GSS.isA;


public class GSSCache extends AbstractCache {

	private Map<Relation, Element> relationSourceElementCache;
	private Map<Relation, Element> relationTargetElementCache;

	private Map<Relation, String> relationWeightCache;
	private Map<Element, Integer> levelCache;
	private Map<Element, Integer> sublevelCache;
	
	private List<Element> elementCache;


	/**the constructor
	 * 
	 * @param gss a GSS
	 * @param accessLayer an AccessLayer
	 */
	public GSSCache(GSS gss, AccessLayer accessLayer){
		super(gss, accessLayer);
	}
	
	
	/**
	 * @return the cached GSS
	 */
	public GSS getGss(){
		return (GSS) this.getInput();
	}
	

	/**
	 * calculates the level of the specified Element 
	 *
	 * @param element an Element
	 * @return the calculates level (0..2) for the layout for zest
	 */
	public int getLevel(Element element){
		if (levelCache.containsKey(element)){
			return levelCache.get(element);
		} 
		int result = 0;
			if (element instanceof Goal) {
				result =  0;
			} else if (element instanceof Principle) {
				result =  1;
			} else if (element instanceof Flaw) {
				result =  1;
			} else if (element instanceof Refactoring) {
				result =  2;
			} else if (element instanceof Pattern) {
				result =  2;
			} // else
			
			levelCache.put(element, result);
			
			return result;
	}
	
	
	/**
	 * calculates the GSS layer of the specified Element 
	 *
	 * @param element an Element
	 * @return the calculates layer within the GSS layout (GSSLayer.layer1..GSSLayer.layer4)
	 */
	public static int getGSSLayer(Element element){

			if (element instanceof Goal) {
			//	if (isRoot(element))
					return GSSLayer.layer1;
			//	else return GSSLayer.layer2;
			} else if (element instanceof Principle) {
				return GSSLayer.layer3;
			} else if (element instanceof Flaw) {
				return GSSLayer.layer3;
			} else if (element instanceof Refactoring) {
				return GSSLayer.layer4;
			} else if (element instanceof Pattern) {
				return GSSLayer.layer4;
			} // else
			return 0;
	}
	
	/**
	 * calculates the sub level of the specified Element 
	 *
	 * @param element an Element
	 * @return the calculates sub level (0..*) for the layout for zest
	 */
	public int getSublevel(Element element){
		int result = 0;
		
		if (sublevelCache.containsKey(element)){
			return sublevelCache.get(element);
		} 

		if (element instanceof SolutionInstrument)
			 for (Relation outgoingRelation : getAllOutgoingRelationsForElement(element, "isA")){
					Element target = getTargetOfRelation(outgoingRelation);
					int sublevelOfTarget = getSublevel(target);
					result = result >= sublevelOfTarget ? result+1 : sublevelOfTarget+1;
					
				 }else
			 for (Relation outgoingRelation : getAllOutgoingRelationsForElement(element, "Decomposition")){
					Element target = getTargetOfRelation(outgoingRelation);
					int sublevelOfTarget = getSublevel(target);
					result = result >= sublevelOfTarget ? result+1 : sublevelOfTarget+1;
					
				 }
		sublevelCache.put(element, result);
	 return result;
	}
	
	
	/**
	 * @param element an Element
	 * @return true if Element is not a leaf and not a root Element
	 */
	public boolean isInnerNode(Element element){
		return !isLeaf(element) && !isRoot(element);
	}
	
	/**
	 * @param element an Element
	 * @return true if Element is a leaf Element
	 */
	public boolean isLeaf(Element element){
	
		if (!(element instanceof SolutionInstrument))
			
			return getAllIncomingRelationsForElement(element, "Decomposition").size() == 0;	else
		return	getAllIncomingRelationsForElement(element, "isA").size() == 0;
	
	}
	
	/**
	 * @param element an Element
	 * @return true if Element is a root Element
	 */
	public boolean isRoot(Element element){
		if (!(element instanceof SolutionInstrument))
				return  getAllOutgoingRelationsForElement(element, "Decomposition").size() == 0;
		else 
		return getAllOutgoingRelationsForElement(element, "isA").size() == 0;

	}
	
	/**
	 * @return a List with all cached Elements
	 */
	public List<Element> getAllElements(){
		return elementCache;
	}
	
	/**
	 * @param the layer of the Element (1..4)
	 * @return a List with all cached Elements
	 */
	public List<Element> getAllElements(int layer){
		List<Element> result = new ArrayList<Element>();
		for (Element element : getAllElements()){
			if (getGSSLayer(element) == layer)
				result.add(element);
		}
		return result;
	}
	

	/**
	 * @param layer a GSSLayer 
	 * @return a List with all root Elements of the specified layer
	 */
	public List<Element> getRootElements(int layer){
		List<Element> result = new ArrayList<Element>();
		for (Element element : getAllElements(layer)){
			if (isRoot(element))
				result.add(element);
		}
		return result;
	}
	
	/**
	 * @param layer a GSSLayer 
	 * @return a List with all leaf Elements of the specified layer
	 */
	public List<Element> getLeafElements(int layer){
		List<Element> result = new ArrayList<Element>();
		for (Element element : getAllElements(layer)){
			if (isLeaf(element))
				result.add(element);
		}
		return result;
	}
	
	
	/**
	 * @param relation a Relation
	 * @return the target Element of the specified Relation
	 */
	public Element getTargetOfRelation(Relation relation){
		return relationTargetElementCache.get(relation);
	}
	
	/**
	 * @param relation a Relation
	 * @return the source Element of the specified Relation
	 */
	public Element getSourceOfRelation(Relation relation){
		return relationSourceElementCache.get(relation);
	}
	
	/**
	 * @param element an Element
	 * @return a List with all outgoing Relations for the specified Element
	 */
	public List<Relation> getAllOutgoingRelationsForElement(Element element){
		List<Relation> result = new ArrayList<Relation>();
		for (Entry<Relation, Element> cacheEntrySet : relationSourceElementCache.entrySet()){
			if ( cacheEntrySet.getValue() == element){
				result.add(cacheEntrySet.getKey() );
			}
		}
		return result;
	}
	
	
	/**
	 * @param element an Element
	 * @return a List with all incoming Relations for the specified Element
	 */
	public List<Relation> getAllIncomingRelationsForElement(Element element){
		List<Relation> result = new ArrayList<Relation>();
		for (Entry<Relation, Element> cacheEntrySet : relationTargetElementCache.entrySet()){
			if ( cacheEntrySet.getValue() == element){
				result.add(cacheEntrySet.getKey() );
			}
		}	
		return result;
	}
	
	/**
	 * @param element an Element
	 * @param relationClassName the class name of a Relation
	 * @return a List with all outgoing Relations with the specified class name for the specified Element 
	 */
	public List<Relation> getAllOutgoingRelationsForElement(Element element, String relationClassName){
		List<Relation> result = new ArrayList<Relation>();
		for (Entry<Relation, Element> cacheEntrySet : relationSourceElementCache.entrySet()){
			if ( cacheEntrySet.getValue() == element && cacheEntrySet.getKey().eClass().getName().equals(relationClassName)){
				result.add(cacheEntrySet.getKey() );
			}
		}
		return result;
	}
	
	/**
	 * @param element an Element
	 * @param relationClassName the class name of a Relation
	 * @return a List with all incoming Relations with the specified class name for the specified Element 
	 */
	public List<Relation> getAllIncomingRelationsForElement(Element element, String relationClassName){
		List<Relation> result = new ArrayList<Relation>();
		for (Entry<Relation, Element> cacheEntrySet : relationTargetElementCache.entrySet()){
			if ( cacheEntrySet.getValue() == element && cacheEntrySet.getKey().eClass().getName().equals(relationClassName)){
				result.add(cacheEntrySet.getKey() );
			}
			
		}
			
		
		return result;
	}
	
	
	/**
	 * @return a List with all cached Relations
	 */
	public List<Relation> getAllRelations(){
		List<Relation> result = new ArrayList<Relation>();
		for (Relation relation : relationTargetElementCache.keySet()){
			result.add(relation);
		}
		
		return result;
	}
	
	
	/**
	 * @param relationClassName the class name of a Relation
	 * @return a List with all cached Relations with the specified class name
	 */
	public List<Relation> getAllRelations(String relationClassName){
		List<Relation> result = new ArrayList<Relation>();
		for (Relation relation : relationTargetElementCache.keySet()){
			if (relation.eClass().getName().equals(relationClassName))
				result.add(relation);
		}
		
		return result;
	}
	
	
	
	/**
	 * @param relation a Relation
	 * @return the cached weight for the specified relation as Float
	 */ 
	public Float getRelationWeight(Relation relation){
		String relationWeightStr = relationWeightCache.get(relation);
		if (relationWeightStr != null)
		return Float.parseFloat(relationWeightStr);
		else return null;
	}
	
	/**
	 * @param relation a Relation
	 * @return the cached weight for the specified relation as String
	 */
	public String getRelationWeightString(Relation relation){
		return relationWeightCache.get(relation);
	}
	
	
	/**
	 * @param source an Element
	 * @param target an Element
	 * @return the Decomposition between the two specified Elements
	 */
	public Decomposition getDecompositionBetween(Element source, Element target){
		HashSet<Relation> incomingDecompositions = new HashSet<Relation>(getAllIncomingRelationsForElement(target));
		for (Relation relation : incomingDecompositions){
			if (relation instanceof Decomposition && getSourceOfRelation(relation) == source){
				return (Decomposition) relation;
			}
		}
		return null;
	}
	

	
	/**
	 * inits the cache<br>
	 * 
	 * @param gss
	 *            a GSS set
	 */
	public void initCache() {
		relationSourceElementCache = new LinkedHashMap<Relation, Element>();
		relationTargetElementCache = new LinkedHashMap<Relation, Element>();
		relationWeightCache = new LinkedHashMap<Relation, String>();
		elementCache = new ArrayList<Element>();
		
		sublevelCache =  new LinkedHashMap<Element, Integer>();
		levelCache =  new LinkedHashMap<Element, Integer>();

		for (EObject child : getAccessLayer().getDirectChildren(getGss())) {
			if (child instanceof Relation)
			{
				Relation relation = (Relation) child;
			Element target = relation.getTarget();
			Element source = relation.getSource();
			String weight = null;
			if (relation instanceof Offset) {
				weight = getAccessLayer().getAttributeValue(relation, "value");

			} else if (relation instanceof Impact) {
				weight = getAccessLayer().getAttributeValue(relation, "weight");
						((Impact) relation).getWeight();

			} else if (relation instanceof Decomposition || relation instanceof isA) {
				weight = null;
			}

			relationSourceElementCache.put(relation, source);
			relationTargetElementCache.put(relation, target);

			if (weight != null)
			relationWeightCache.put(relation, weight);
			}				
		}
		elementCache.addAll(getGss().getElements());
	}
}
