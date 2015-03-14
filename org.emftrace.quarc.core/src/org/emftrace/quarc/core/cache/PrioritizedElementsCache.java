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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedDecomposition;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElementSet;
import org.emftrace.quarc.core.commands.prioritizedelementsset.RemovePrioritizedElementCommand;
import org.emftrace.quarc.core.commands.prioritizedelementsset.UpdatePrioritizedDecompositionWeightCommand;
import org.emftrace.quarc.core.commands.prioritizedelementsset.UpdatePrioritizedElementPriorityCommand;


/**
 * A Cache for PrioritizedElements. e.g. selected goals
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class PrioritizedElementsCache extends AbstractCache {

	
	private Map<PrioritizedDecomposition, Integer> prioritizedDecompositionWeightsMap;
	private Map<Decomposition, PrioritizedDecomposition> prioritizedDecompositionsMap;
	private Map<PrioritizedDecomposition, Decomposition> decompositionsMap;
	
	private Map<Element, PrioritizedElement> prioritizedElementMap;
	private Map<PrioritizedElement, Element> elementMap;
	
	private Map<PrioritizedElement, Float> prioritizedElementWeightsMap;
	private Map<Element, ArrayList<PrioritizedDecomposition>> targetsMap;
	private Map<Element, ArrayList<PrioritizedDecomposition>> sourcesMap;
	
	private Map<Element, HashMap<Element, PrioritizedDecomposition>> prioritizedDecompositionsSourceTargetMap;

	/**
	 * @return the cached PrioritizedElementSet
	 */
	public PrioritizedElementSet getPrioritizedElementSet(){
		return (PrioritizedElementSet) getInput();
	}
	

	/**
	 * the constructor
	 * 
	 * @param prioritizedElementSet a PrioritizedElementSet
	 * @param accessLayer an AccessLayer
	 */
	public PrioritizedElementsCache(PrioritizedElementSet prioritizedElementSet, AccessLayer accessLayer){
		super(prioritizedElementSet, accessLayer);
	}
	
	/* (non-Javadoc)
	 * @see org.emftrace.quarc.core.cache.AbstractCache#initCache()
	 */
	@Override
	public void initCache(){
		
		decompositionsToRemove = new HashSet<Decomposition>();
		elementsToRemove = new HashSet<Element>();
		
		prioritizedDecompositionWeightsMap = new HashMap<PrioritizedDecomposition, Integer>();
		prioritizedDecompositionsMap = new HashMap<Decomposition, PrioritizedDecomposition>();
		decompositionsMap = new HashMap<PrioritizedDecomposition, Decomposition>();
		
		prioritizedElementMap = new HashMap<Element, PrioritizedElement>();
		elementMap = new HashMap<PrioritizedElement, Element>();
		prioritizedElementWeightsMap = new HashMap<PrioritizedElement, Float>();
		
		sourcesMap = new HashMap<Element, ArrayList<PrioritizedDecomposition>>();
		targetsMap = new HashMap<Element, ArrayList<PrioritizedDecomposition>>();
		
		prioritizedDecompositionsSourceTargetMap = new HashMap<Element, HashMap<Element, PrioritizedDecomposition>>() ;
		
		if (getInput()== null) return;
		System.out.println("VOR FOR LOOP");
		for (PrioritizedDecomposition prioritizedDecomposition : getPrioritizedElementSet().getPriorizedDecompositionRelations()) {
			System.out.println("IN LOOP NOW");
			Decomposition decomposition = prioritizedDecomposition.getDecompostion();
			System.out.println(prioritizedDecomposition);
			System.out.println(decomposition);
			
			decompositionsMap.put(prioritizedDecomposition,decomposition);
			prioritizedDecompositionsMap.put(decomposition, prioritizedDecomposition);
			String prioritizedDecompositionWeightString = getAccessLayer().getAttributeValue(prioritizedDecomposition, "weight");
			
			int prioprioritizedDecompositionWeight = prioritizedDecompositionWeightString!= null?Integer.parseInt(prioritizedDecompositionWeightString ):0;
			
			
			prioritizedDecompositionWeightsMap.put(prioritizedDecomposition, prioprioritizedDecompositionWeight);	
			
			Element source = decomposition.getSource();
			Element target = decomposition.getTarget();
			
			if (!sourcesMap.containsKey(source)){	
				sourcesMap.put(source, new ArrayList<PrioritizedDecomposition>());
			}
			sourcesMap.get(source).add(prioritizedDecomposition);
			
			if (!targetsMap.containsKey(target)){	
				targetsMap.put(target, new ArrayList<PrioritizedDecomposition>());
			}
			targetsMap.get(target).add(prioritizedDecomposition);
			
			HashMap<Element,PrioritizedDecomposition > entry = prioritizedDecompositionsSourceTargetMap.get(source);
			if (entry== null)
			 entry = new HashMap<Element,PrioritizedDecomposition>() ;
			entry.put(target, prioritizedDecomposition);
			
			prioritizedDecompositionsSourceTargetMap.put(source, entry);
		}
		
		for (PrioritizedElement prioritizedElement : getPrioritizedElementSet().getPrioritizedElements()) {
			prioritizedElementMap.put(prioritizedElement.getElement(), prioritizedElement);
			elementMap.put(prioritizedElement, prioritizedElement.getElement());
			String prioritizedElementGlobalPriorityString = getAccessLayer().getAttributeValue(prioritizedElement, "globalPriority");
			float prioritizedElementGlobalPriority =prioritizedElementGlobalPriorityString!= null? Float.parseFloat(prioritizedElementGlobalPriorityString):0;
			prioritizedElementWeightsMap.put(prioritizedElement,prioritizedElementGlobalPriority );	
		}
	}
	

	
	/**
	 * @param decomposition a Decomposition
	 * @return the PrioritizedDecomposition for the specified Decomposition
	 */
	public PrioritizedDecomposition getPrioritizedDecomposition(Decomposition decomposition){
		return prioritizedDecompositionsMap.get(decomposition);
	}
	
	/**
	 * @param prioritizedDecomposition a PrioritizedDecomposition
	 * @return the Decomposition for the specified PrioritizedDecomposition
	 */
	public Decomposition getDecomposition(PrioritizedDecomposition prioritizedDecomposition){
		return decompositionsMap.get(prioritizedDecomposition);
	}
	
	/**
	 * @param source a source Element
	 * @return a List with PrioritizedDecomposition containing the specified Element as source
	 */
	public List<PrioritizedDecomposition> getPrioritizedDecompositionsForSource(Element source){
		List<PrioritizedDecomposition>  result = sourcesMap.get(source);
		if (result == null)
				result = new ArrayList<PrioritizedDecomposition>();
		return result;
	}
	
	/**
	 * @param target a target Element
	 * @return a List with PrioritizedDecomposition containing the specified Element as target
	 */
	public List<PrioritizedDecomposition> getPrioritizedDecompositionsForTarget(Element target){
		
		List<PrioritizedDecomposition>  result = targetsMap.get(target);
		if (result == null)
			result = new ArrayList<PrioritizedDecomposition>();
		return result;
	}
	
	/**
	 * @param source a source Element
	 * @param target a target Element
	 * @return the PrioritizedDecomposition between the specified Elements
	 */
	public PrioritizedDecomposition getPrioritizedDecompositionsBetween(Element source, Element target){
		Map<Element, PrioritizedDecomposition> entry = prioritizedDecompositionsSourceTargetMap.get(source);
		if (entry == null)
			return null;
		else
	return	entry.get(target);
	}
	
	/**
	 * @param element an Element
	 * @return the PrioritizedElement of the specified Element
	 */
	public PrioritizedElement getPrioritizedElement(Element element){
		return prioritizedElementMap.get(element);
	}
	
	/**
	 * @param prioritizedElement a PrioritizedElement
	 * @return the Element of the specified PrioritizedElement
	 */
	public Element getElement(PrioritizedElement prioritizedElement){
		return elementMap.get(prioritizedElement);
	}
	
	/**
	 * setter for the priority for a prioritized Decomposition between the specified Elements
	 * @param source the source of a prioritized Decomposition
	 * @param target the target of a prioritized Decomposition
	 * @param newPriority the new priority for the PrioritizedDecomposition
	 */
	public void setWeight(Element source, Element target, Integer newPriority){
		PrioritizedDecomposition prioritizedDecomposition = getPrioritizedDecompositionsBetween(source, target);
		prioritizedDecompositionWeightsMap.put(prioritizedDecomposition, newPriority);
		recalculatePriority(source);
	}

	/**
	 * @param source the source of a prioritized Decomposition
	 * @param target the target of a prioritized Decomposition
	 * @return the cached priority for the PrioritizedDecomposition
	 */
	public Integer getWeight(Element source, Element target){
		PrioritizedDecomposition prioritizedDecomposition = getPrioritizedDecompositionsBetween(source, target);
		return  prioritizedDecompositionWeightsMap.get(prioritizedDecomposition);
	}

	/**
	 * setter for the Priority of prioritized Element
	 * @param element a prioritized Element
	 * @param newPriority the new Priority the prioritized Element
	 */
	public void setPriority(Element element, Integer newPriority){
		setPrioritizedElementPriority(element, Float.valueOf(newPriority));
		repairSubElements(element);
	}
	
	public Element getTarget(PrioritizedDecomposition prioritizedDecomposition){
		return prioritizedDecomposition.getDecompostion().getTarget();
	}
	
	public Element getSource(PrioritizedDecomposition prioritizedDecomposition){
		return prioritizedDecomposition.getDecompostion().getSource();
	}
	
	private void repairSubElements(Element element) {
		 for (PrioritizedDecomposition prioritizedDecomposition : getPrioritizedDecompositionsForTarget(element)){
		 Element subElement = getSource(prioritizedDecomposition);
		 recalculatePriority(subElement);
		 repairSubElements(subElement);
	 }
	}


	private void recalculatePriority(Element element) {
		Float sum = 0.0f; 
		 for (PrioritizedDecomposition prioritizedDecomposition : getPrioritizedDecompositionsForSource(element)){
			 Element parentElement = getTarget(prioritizedDecomposition);
			Integer weight = getPrioritizedDecompositionWeight(prioritizedDecomposition);
			
			sum += weight/100.0f * getPrioritizedElementPriority(parentElement);
		 }
		
		 setPrioritizedElementPriority(element, sum);
			 
	}
	
	public Float getPrioritizedElementPriority(Element element){
		PrioritizedElement prioritizedElement = getPrioritizedElement(element);
		return prioritizedElementWeightsMap.get(prioritizedElement);
	}
	
	private void setPrioritizedElementPriority(Element element, Float newPriority){
		PrioritizedElement prioritizedElement = getPrioritizedElement(element);
		prioritizedElementWeightsMap.put(prioritizedElement, newPriority);
	}

	public Integer getPrioritizedDecompositionWeight(PrioritizedDecomposition prioritizedDecomposition){
		return prioritizedDecompositionWeightsMap.get(prioritizedDecomposition);
	}
	
	
	public Set<PrioritizedDecomposition> getPrioritizedDecompositions(){
		return decompositionsMap.keySet();
	}
	
	public Set<PrioritizedElement> getPrioritizedElements(){
		return elementMap.keySet();
	}
	





/**
 * save all changes stored by the cache to the containment model element instance
	*/
	public void flush(){
		 for (Entry<PrioritizedDecomposition, Integer> entry : prioritizedDecompositionWeightsMap.entrySet()){
			 String oldValue = entry.getKey().getWeight(); 
			 String formatedNewValue = String.valueOf(entry.getValue());
			 if (oldValue == null || !oldValue.equals(formatedNewValue))
				 new UpdatePrioritizedDecompositionWeightCommand((PrioritizedElementSet) entry.getKey().eContainer(),entry.getKey(), formatedNewValue ).run();
			// entry.getKey().setWeight(formatedNewValue);
		 }
		 
		 for (Entry<PrioritizedElement, Float> entry : prioritizedElementWeightsMap.entrySet()){
			 String oldValue = entry.getKey().getGlobalPriority(); 
			 String formatedNewValue = String.valueOf(entry.getValue());
			 if (oldValue== null ||!oldValue.equals(formatedNewValue))
				 new UpdatePrioritizedElementPriorityCommand((PrioritizedElementSet) entry.getKey().eContainer(),entry.getKey(), formatedNewValue ).run();
				// entry.getKey().setGlobalPriority(formatedNewValue);
		 }
	}
	
	public boolean isRoot(Element element){
		return	getPrioritizedDecompositionsForSource(element).isEmpty();
	}

	
	public boolean isLeaf(Element element){
		return	getPrioritizedDecompositionsForTarget(element).isEmpty();
	}


public List<Element> getRootPrioritizedElements() {
	List<Element> result = new ArrayList<Element>();
	for (Element element : elementMap.values()){
		if (isRoot(element))
			result.add(element);
	}
	return result;
}


public void repairPrioritiesAndWeights(HashMap<Element, Boolean> lockedMap){

	 repairElements( getRootPrioritizedElements());

}

private void repairElements(List<Element> elements ){
	int assignedPrioritySum = 0;
	for (Element element : elements){
		assignedPrioritySum += getPrioritizedElementPriority(element);
	}
	
	int numberOfElements = elements.size();
	
	int notAssignedPriority = 100 - assignedPrioritySum;
	
	int diffForEach = numberOfElements != 0 ? notAssignedPriority/numberOfElements : 0;
	int mod = numberOfElements != 0 ? notAssignedPriority%numberOfElements : 0;
	
	int i = 0;
	for (Element element : elements){
		i++;
		int oldPriority = getPrioritizedElementPriority(element).intValue();
		
		int newPriority = oldPriority + diffForEach;
		if (i<=mod )
			newPriority++;
	
		setPriority(element, newPriority);
	}
	for (Element element : elements){
		repairDecompositionsWeights(getPrioritizedDecompositionsForTarget(element));
	}
	
	
	
}

private void repairDecompositionsWeights(
		List<PrioritizedDecomposition> prioritizedDecompositions) {
	int assignedWeightSum = 0;
	for (PrioritizedDecomposition prioritizedDecomposition : prioritizedDecompositions){
		assignedWeightSum += getPrioritizedDecompositionWeight(prioritizedDecomposition);
		
	}

	int numberOfDecompositions = prioritizedDecompositions.size();
	
	int notAssignedWeight = 100 - assignedWeightSum;
	
	int diffForEach = numberOfDecompositions != 0 ? notAssignedWeight/numberOfDecompositions : 0;
	int mod = numberOfDecompositions != 0 ? notAssignedWeight%numberOfDecompositions : 0;
	
	int i = 0;
	for (PrioritizedDecomposition prioritizedDecomposition : prioritizedDecompositions){
		i++;
		int oldWeight = getPrioritizedDecompositionWeight(prioritizedDecomposition);

		int newWeight = oldWeight + diffForEach;
		if (i<=mod )
			newWeight++;
		setWeight(getSource(prioritizedDecomposition),getTarget(prioritizedDecomposition),  newWeight);
	}
	for (PrioritizedDecomposition prioritizedDecomposition : prioritizedDecompositions){
		repairDecompositionsWeights(getPrioritizedDecompositionsForTarget(getSource(prioritizedDecomposition)));
	}
}


public void repairPrioritiesAndWeights(){
	repairPrioritiesAndWeights(new HashMap<Element, Boolean>());
}


public PrioritizedDecomposition getPrioritizedDecompositionForDecomposition(
		Decomposition decomposition) {
	return prioritizedDecompositionsMap.get(decomposition);
}

private Set<Decomposition> decompositionsToRemove;
private Set<Element> elementsToRemove;


public void markDecompositionAsToRemove(
		Decomposition decomposition) {
	decompositionsToRemove.add(decomposition);
}

/**
 * @param element a Element
 */
public void markElementAsToRemove(
		Element element) {
	elementsToRemove.add(element);
}

public void removeMarkedElementsAndDecompositions( ) {
	/* for (Decomposition decomposition : decompositionsToRemove){
		 PrioritizedDecomposition prioritizedDecomposition = getPrioritizedDecomposition(decomposition);
		 
			prioritizedDecompositionWeightsMap.remove(prioritizedDecomposition);
			prioritizedDecompositionsMap.remove(decomposition);
			decompositionsMap.remove(prioritizedDecomposition);
			
			Element source = decomposition.getSource();
			Element target = decomposition.getTarget();

			sourcesMap.get(source).remove(prioritizedDecomposition);
			targetsMap.get(target).remove(prioritizedDecomposition);
						
			prioritizedDecompositionsSourceTargetMap.get(source).remove(target);
			
		//	getPrioritizedElementSet().getPrioritizedDecompositionRelations().remove(prioritizedDecomposition);
			
		//	new RemovePrioritizedElementCommand(getPrioritizedElementSet(), source).run();
			
	 }*/
	 
	 for (Element element : elementsToRemove){
		 
		 PrioritizedElement prioritizedElement = prioritizedElementMap.get(element);
		 prioritizedElementMap.remove(element);
		 elementMap.remove(prioritizedElement);
		 prioritizedElementWeightsMap.remove(prioritizedElement);
		 sourcesMap.remove(element);
		 targetsMap.remove(element);
	
		 prioritizedDecompositionsSourceTargetMap.remove(element);
	 
		for ( Entry<Element, HashMap<Element, PrioritizedDecomposition>> entry: prioritizedDecompositionsSourceTargetMap.entrySet()){
			entry.getValue().remove(element);
		}
			
		new RemovePrioritizedElementCommand(getPrioritizedElementSet(), prioritizedElement).run();

	 }
	 decompositionsToRemove.clear();
	 elementsToRemove.clear();
}

/**
 * @param decomposition a prioritized Decomposition
 * @return the Decomposition is marked as to remove from 
 */
public boolean isMarkedAsToRemove(Decomposition decomposition) {
	return decompositionsToRemove.contains(decomposition);
}



/**
 * @param element a prioritized Element
 * @return the Element is marked as to remove from 
 */
public boolean isMarkedAsToRemove(Element element) {
	return elementsToRemove.contains(element);
}

/**
 * demarks form "to remove from cache" the specified prioritized Element
 * 
 * @param element an Element
 */
public void demarkDecompositionAsToRemove(Decomposition decomposition) {
	decompositionsToRemove.remove(decomposition);
}


/**
 * demarks form "to remove from cache" the specified prioritized Element
 * 
 * @param element an Element
 */
public void demarkElementAsToRemove(Element element) {
	elementsToRemove.remove(element);
}


}
