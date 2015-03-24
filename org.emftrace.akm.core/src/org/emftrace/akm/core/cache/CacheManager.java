package org.emftrace.akm.core.cache;

import java.util.ArrayList;
import java.util.List;

import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel;

/**
 * a manager for the used caches<br>
 * This class was taken from the QUARC project
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */

public class CacheManager {

	/**
	 * The cache for Architecture Knowledge Model
	 */
	private AKMCache mAKMCache;

	/**
	 * The Architecture Knowledge Model object
	 */
	private ArchitectureKnowledgeModel mModel;

	/**
	 * an AccessLayer
	 */
	private AccessLayer mAccessLayer;

	/**
	 * @return the used AccessLayer
	 */
	public AccessLayer getAccessLayer() {
		return mAccessLayer;
	}

	private List<ICacheChangedListener> cacheChangedListeners;

	/**
	 * adds the specified ICacheChangedListener
	 * 
	 * @param listener
	 *            a ICacheChangedListener
	 */
	public void addCacheChangedListener(final ICacheChangedListener listener) {
		cacheChangedListeners.add(listener);
	}

	/**
	 * removes the specified ICacheChangedListener
	 * 
	 * @param listener
	 *            a ICacheChangedListener
	 */
	public void removeCacheChangedListener(final ICacheChangedListener listener) {
		cacheChangedListeners.remove(listener);
	}

	/**
	 * notifies all listening ICacheChangedListener about changes
	 */
	private void notifyCacheChangeListeners() {
		for (ICacheChangedListener listener : cacheChangedListeners) {
			try {
				listener.changed();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	/**
	 * the default constructor
	 * 
	 * @param gss
	 *            a GSS which contains all Elements (including non applicable Elements)
	 * @param queryResultSet
	 *            a QueryResultSet which contains the ApplicableElements
	 * @param pAccessLayer
	 *            an AccessLayer
	 */
	public CacheManager(final ArchitectureKnowledgeModel pModel, final AccessLayer pAccessLayer) {

		mModel = pModel;
		mAccessLayer = pAccessLayer;

		cacheChangedListeners = new ArrayList<ICacheChangedListener>();
		mAKMCache = new AKMCache(pModel, pAccessLayer);
	}

	public ArchitectureKnowledgeModel getModel() {
		return mAKMCache.getModel();
	}

	// /**
	// * getter for applicable root Elements
	// *
	// * @return a List with all applicable root Elements
	// */
	// public List<Element> getRootApplicableElementElements() {
	// return applicableElementCache.getRootElements();
	// }
	//
	// /**
	// * @param element
	// * an applicable Element
	// * @return true if the specified Element is a root Element else false
	// */
	// public boolean isRootApplicableElement(final Element element) {
	// return applicableElementCache.isRootElement(element);
	// }
	//
	// /**
	// *
	// * @param element
	// * an Element
	// * @return true if the specified Element is applicable else false
	// */
	// public boolean isApplicableElement(final Element element) {
	// return applicableElementCache.isApplicableElement(element);
	// }
	//
	// /**
	// *
	// * @param element
	// * an applicable Element
	// * @return true if the specified Element is a leaf Element else false
	// */
	// public boolean isLeafAppicableElement(final Element element) {
	// return applicableElementCache.isLeafElement(element);
	// }
	//
	// /**
	// * @return a List with all cached root ApplicableElements
	// */
	// public List<ApplicableElement> getRootApplicableElements() {
	// return applicableElementCache.getRootApplicableElements();
	// }
	//
	// /**
	// * @return a Set of all ApplicableElement with the referenced Element
	// */
	// public Set<Entry<ApplicableElement, Element>> getApplicableElementsSet() {
	// return applicableElementCache.getApplicableElementsSet();
	// }
	//
	// /**
	// * @return a Set of all Elements with their ApplicableElements
	// */
	// public Set<Entry<Element, ApplicableElement>> getElementApplicableElementsSet() {
	// return applicableElementCache.getElementsSet();
	// }
	//
	// /**
	// * @param className
	// * the name of the EClass of an Element
	// * @return a Set of all ApplicableElement with the referenced Element with the specified class
	// * name
	// */
	// public Set<Entry<ApplicableElement, Element>> getApplicableElementElementsSet(
	// final String className) {
	// return applicableElementCache.getApplicableElementsSet(className);
	// }
	//
	// /**
	// * @param className
	// * the name of the EClass of an Element
	// * @return a Set of all Element with the specified class name and their ApplicableElements
	// */
	// public Set<Entry<Element, ApplicableElement>> getElementApplicableElementsSet(
	// final String className) {
	// return applicableElementCache.getElementsSet(className);
	// }
	//
	// /**
	// * @param applicableElement
	// * an ApplicableElement
	// * @return a List with all incoming Impact relations to the specified ApplicableElement
	// */
	// public List<Impact> getApplicableIncomingImpactRelations(
	// final ApplicableElement applicableElement) {
	// return applicableElementCache.getIncomingImpactRelations(applicableElement);
	// }
	//
	// /**
	// * @param element
	// * an applicable Element
	// * @return a List with all incoming Impact relations to the specified applicable Element
	// */
	// public List<Impact> getApplicableIncomingImpactRelations(final Element element) {
	// return applicableElementCache.getIncomingImpactRelations(element);
	// }
	//
	// /**
	// * @param element
	// * an applicable Element
	// * @return the ApplicableElement for the specified applicable Element
	// */
	// public ApplicableElement getApplicableElementForElement(final Element element) {
	// return applicableElementCache.getApplicableElement(element);
	// }
	//
	// /**
	// * @param applicableElement
	// * an ApplicableElement
	// * @return the referenced applicable Element for the specified ApplicableElement
	// */
	// public Element getElementForApplicableElement(final ApplicableElement applicableElement) {
	// return applicableElementCache.getElement(applicableElement);
	// }
	//
	// /**
	// * @param applicableElement
	// * an ApplicableElement
	// * @return a List with all outgoing Impact relations from the specified ApplicableElement
	// */
	// public List<Impact> getApplicableOutgoingImpactRelations(
	// final ApplicableElement applicableElement) {
	// return applicableElementCache.getOutgoingImpactRelations(applicableElement);
	// }
	//
	// /**
	// * @param element
	// * an applicable Element
	// * @return a List with all outgoing Impact relations from the specified applicable Element
	// */
	// public List<Impact> getApplicableOutgoingImpactRelations(final Element element) {
	// return applicableElementCache.getOutgoingImpactRelations(element);
	// }
	//
	// /**
	// * @param applicableElement
	// * an ApplicableElement
	// * @return a List with all outgoing Offset relations from the specified ApplicableElement
	// */
	// public List<Offset> getApplicableOutgoingOffsetRelations(
	// final ApplicableElement applicableElement) {
	// return applicableElementCache.getOutgoingOffsetRelations(applicableElement);
	// }
	//
	// /**
	// * @param element
	// * an applicable Element
	// * @return a List with all outgoing Offset relations from the specified applicable Element
	// */
	// public List<Offset> getApplicableOutgoingOffsetRelations(final Element element) {
	// return applicableElementCache.getOutgoingOffsetRelations(element);
	// }
	//
	// /**
	// * @param applicableElement
	// * an ApplicableElement
	// * @return a List with all incoming Offset relations to the specified ApplicableElement
	// */
	// public List<Offset> getApplicableIncomingOffsetRelations(
	// final ApplicableElement applicableElement) {
	// return applicableElementCache.getIncomingOffsetRelations(applicableElement);
	// }
	//
	// /**
	// * @param element
	// * an applicable Element
	// * @return a List with all incoming Offset relations to the specified applicable Element
	// */
	// public List<Offset> getApplicableIncomingOffsetRelations(final Element element) {
	// return applicableElementCache.getIncomingOffsetRelations(element);
	// }
	//
	// /**
	// * @param applicableElement
	// * an ApplicableElement
	// * @return a List with all incoming Decomposition relations to the specified ApplicableElement
	// */
	// public List<Decomposition> getApplicableIncomingDecompositionRelations(
	// final ApplicableElement applicableElement) {
	// return applicableElementCache.getIncomingDecompositionRelations(applicableElement);
	// }
	//
	// /**
	// * @param element
	// * an applicable Element
	// * @return a List with all incoming Decomposition relations to the specified applicable
	// Element
	// */
	// public List<Decomposition> getApplicableIncomingDecompositionRelations(final Element element)
	// {
	// return applicableElementCache.getIncomingDecompositionRelations(element);
	// }
	//
	// /**
	// * @param applicableElement
	// * an ApplicableElement
	// * @return a List with all outgoing Decomposition relations from the specified
	// ApplicableElement
	// */
	// public List<Decomposition> getApplicableOutgoingDecompositionRelations(
	// final ApplicableElement applicableElement) {
	// return applicableElementCache.getOutgoingDecompositionRelations(applicableElement);
	// }
	//
	// /**
	// * @param element
	// * an applicable Element
	// * @return a List with all outgoing Decomposition relations from the specified applicable
	// * Element
	// */
	// public List<Decomposition> getApplicableOutgoingDecompositionRelations(final Element element)
	// {
	// return applicableElementCache.getOutgoingDecompositionRelations(element);
	// }
	//
	// /**
	// * @param element
	// * an applicable Element
	// * @return the outgoing IsA relation from the specified applicable Element
	// */
	// public isA getApplicableOutgoingIsARelations(final Element element) {
	// return applicableElementCache.getOutgoingIsARelation(element);
	// }
	//
	// /**
	// * @param element
	// * an applicable Element
	// * @return a List with all incoming IsA relations to the specified applicable Element
	// */
	// public List<isA> getApplicableIncomingIsARelations(final Element element) {
	// return applicableElementCache.getIncomingIsARelations(element);
	// }
	//
	// /**
	// * @param applicableElement
	// * an ApplicableElement
	// * @return the outgoing IsA relation from the specified ApplicableElement
	// */
	// public isA getApplicableOutgoingIsARelations(final ApplicableElement applicableElement) {
	// return applicableElementCache.getOutgoingIsARelations(applicableElement);
	// }
	//
	// /**
	// * @param applicableElement
	// * an ApplicableElement
	// * @return a List with all incoming IsA relations to the specified ApplicableElement
	// */
	//
	// public List<isA> getApplicableIncomingIsARelations(final ApplicableElement applicableElement)
	// {
	// return applicableElementCache.getIncomingIsARelations(applicableElement);
	// }
	//
	/**
	 * Initializes all caches
	 */
	public void initCache() {

		initAKMCache();
	}

	/**
	 * Initializes the AKM (Architecture Knowledge Model) cache
	 */
	public void initAKMCache() {
		if (mAKMCache != null) {
			mAKMCache.initCache();
		}
	}

	//
	// /**
	// * Initializes only the GSS cache
	// */
	// public void initGSSCache() {
	// if (gssCache != null) {
	// gssCache.initCache();
	// }
	// notifyCacheChangeListeners();
	// }
	//
	// /**
	// * Initializes only the GSS cache
	// */
	// public void initApplicableElementCache() {
	// if (applicableElementCache != null) {
	// applicableElementCache.initCache();
	// }
	// notifyCacheChangeListeners();
	// }
	//
	// /**
	// * @param applicableElement
	// * an ApplicableElement
	// * @return a List with all incoming Relations to the specified ApplicableElement
	// */
	// public List<Relation> getAllApplicableIncomingRelations(
	// final ApplicableElement applicableElement) {
	// return applicableElementCache.getAllIncomingRelations(applicableElement);
	// }
	//
	// /**
	// * @param applicableElement
	// * an ApplicableElement
	// * @return a List with all outgoing Relations from the specified ApplicableElement
	// */
	// public List<Relation> getAllApplicableOutgoingRelations(
	// final ApplicableElement applicableElement) {
	// return applicableElementCache.getAllOutgoingRelations(applicableElement);
	// }
	//
	// /**
	// * @param element
	// * an applicable Element
	// * @return a List with all incoming Relations to the specified applicable Element
	// */
	// public List<Relation> getAllApplicableIncomingRelations(final Element element) {
	// return applicableElementCache.getAllIncomingRelations(element);
	// }
	//
	// /**
	// * @param element
	// * an applicable Element
	// * @return a List with all outgoing Relations from the specified applicable Element
	// */
	// public List<Relation> getAllApplicableOutgoingRelations(final Element element) {
	// return applicableElementCache.getAllOutgoingRelations(element);
	// }
	//
	// /**
	// * @return a List with all cached applicable Elements
	// */
	// public List<Element> getAllApplicableElementElements() {
	// return applicableElementCache.getAllElements();
	// }
	//
	// /**
	// * @return a List with all cached ApplicableElements
	// */
	// public List<ApplicableElement> getAllApplicableElements() {
	// return applicableElementCache.getAllApplicableElements();
	// }
	//
	// /**
	// * @param layer
	// * a GSSLayer (GSSLayer.layer1..GSSLayer.layer4) note: layer1 equals layer 4
	// * @return a List with all cached applicable Elements
	// */
	// public List<Element> getAllApplicableElementElement(final int layer) {
	// return applicableElementCache.getAllElements(layer);
	// }
	//
	// /**
	// * @param layer
	// * a GSSLayer (GSSLayer.layer1..GSSLayer.layer4) note: layer1 equals layer 4
	// * @return a List with all cached applicable root Elements
	// */
	// public List<Element> getRootApplicableElementElements(final int layer) {
	// return applicableElementCache.getRootElements(layer);
	// }
	//
	// /**
	// * @param layer
	// * an GSSLayer (GSSLayer.layer1..GSSLayer.layer4) note: layer1 equals layer 4
	// * @return a List with all cached applicable leaf Elements
	// */
	// public List<Element> getLeafApplicableElementElements(final int layer) {
	// return applicableElementCache.getLeafElements(layer);
	// }
	//
	// /**
	// * @param element
	// * an Element
	// * @return true if the specified applicable Element isn't a root or leaf
	// */
	// public boolean isInnerNodeApplicableElementElement(final Element element) {
	// return applicableElementCache.isInnerNodeElement(element);
	// }
	//
	// /**
	// * adds the specified relation as an applicable relation to the specified ApplicableElements
	// and
	// * caches the relation
	// *
	// * @param sourceApplicableElement
	// * the ApplicableElement for the source of the Relation
	// * @param targetApplicableElement
	// * the ApplicableElement for the target of the Relation
	// * @param relation
	// * a Relation between two applicable Elements
	// */
	//
	// public void addRelation(final ApplicableElement sourceApplicableElement,
	// final ApplicableElement targetApplicableElement, final Relation relation) {
	// applicableElementCache.addRelation(sourceApplicableElement, targetApplicableElement,
	// relation);
	// notifyCacheChangeListeners();
	// }
	//
	// /**
	// * adds the specified relation from an Element with undefined satisfaction of the Precondition
	// * to the specified ApplicableElement and caches the relation
	// *
	// * @param sourceApplicableElement
	// * the ApplicableElement for the source of the Relation
	// * @param relation
	// * a relation from an Element with undefined satisfaction
	// */
	// public void addRelationForUndefinedApplicableness(
	// final ApplicableElement targetApplicableElement, final Relation relation) {
	// applicableElementCache.addRelationForUndefinedApplicableness(targetApplicableElement,
	// relation);
	// notifyCacheChangeListeners();
	// }
	//
	// /**
	// * Creates an ApplicableElement for the specified Element and caches the ApplicableElement
	// *
	// * @param element
	// * an Element
	// * @return the created ApplicableElement
	// */
	// public ApplicableElement createApplicableElement(final Element element) {
	// ApplicableElement result = applicableElementCache.createApplicableElement(element);
	// notifyCacheChangeListeners();
	// return result;
	// }
	//
	// /**
	// * Creates a Rating relation between the specified Elements and caches the Rating relation
	// *
	// * @param sourceElement
	// * the source Element of the Rating relation
	// * @param targetElement
	// * the target Element of the Rating relation
	// * @param weight
	// * the weight of the Rating relation
	// * @return the created ApplicableElement
	// */
	// public Rating createRatingRelation(final Element sourceElement, final Element targetElement,
	// final float weight) {
	// Rating result =
	// applicableElementCache.createRatingRelation(sourceElement, targetElement, weight);
	// notifyCacheChangeListeners();
	// return result;
	// }
	//
	// /**
	// * @param sourceElement
	// * the source Element of a Rating relation
	// * @param targetElement
	// * the target Element of a Rating relation
	// * @return the weight of the found Rating relation between the specified Elements
	// */
	// public float getRatingWeight(final Element sourceElement, final Element targetElement) {
	// return applicableElementCache.getRatingWeight(sourceElement, targetElement);
	// }
	//
	// /**
	// * @return the used GSS
	// */
	// public GSS getGss() {
	// return this.gss;
	// }
	//
	// /**
	// * calculates the level of the specified Element
	// *
	// * @param element
	// * an Element
	// * @return the calculates level (0..2) for the layout for zest
	// */
	// public int getLevel(final Element element) {
	// return gssCache.getLevel(element);
	// }
	//
	// /**
	// * calculates the GSS layer of the specified Element
	// *
	// * @param element
	// * an Element
	// * @return the calculates layer within the GSS layout (GSSLayer.layer1..GSSLayer.layer4)
	// */
	// public static int getGSSLayer(final Element element) {
	// return GSSCache.getGSSLayer(element);
	// }
	//
	// /**
	// * calculates the sub level of the specified Element
	// *
	// * @param element
	// * an Element
	// * @return the calculates sub level (0..*) for the layout for zest
	// */
	// public int getSublevel(final Element element) {
	// return gssCache.getSublevel(element);
	// }
	//
	// /**
	// * @param element
	// * an Element
	// * @return true if Element is not a leaf and not a root Element
	// */
	// public boolean isInnerNode(final Element element) {
	// return gssCache.isInnerNode(element);
	// }
	//
	// /**
	// * @param element
	// * an Element
	// * @return true if Element is a leaf Element
	// */
	// public boolean isLeaf(final Element element) {
	// return gssCache.isLeaf(element);
	// }
	//
	// /**
	// * @param element
	// * an Element
	// * @return true if Element is a root Element
	// */
	// public boolean isRoot(final Element element) {
	// return gssCache.isRoot(element);
	// }
	//
	// /**
	// * @return a List with all cached Elements
	// */
	// public List<Element> getAllElements() {
	// return gssCache.getAllElements();
	// }
	//
	// /**
	// * @param the
	// * layer of the Element (1..4)
	// * @return a List with all cached Elements
	// */
	// public List<Element> getAllElements(final int layer) {
	// return gssCache.getAllElements(layer);
	// }
	//
	// /**
	// * @param the
	// * layer of the Element (1..4)
	// * @return a List with all cached root Elements
	// */
	// public List<Element> getRootElements(final int layer) {
	// return gssCache.getRootElements(layer);
	// }
	//
	// /**
	// * @param the
	// * layer of the Element (1..4)
	// * @return a List with all cached leaf Elements
	// */
	//
	// public List<Element> getLeafElements(final int layer) {
	// return gssCache.getLeafElements(layer);
	// }
	//
	// /**
	// * @param relation
	// * a Relation
	// * @return the target Element of the specified Relation
	// */
	// public Element getTargetOfRelation(final Relation relation) {
	// return gssCache.getTargetOfRelation(relation);
	// }
	//
	// /**
	// * @param relation
	// * a Relation
	// * @return the source Element of the specified Relation
	// */
	// public Element getSourceOfRelation(final Relation relation) {
	// return gssCache.getSourceOfRelation(relation);
	// }
	//
	// /**
	// * @param element
	// * an Element
	// * @return a List with all outgoing Relations for the specified Element
	// */
	// public List<Relation> getAllOutgoingRelationsForElement(final Element element) {
	// return gssCache.getAllOutgoingRelationsForElement(element);
	// }
	//
	// /**
	// * @param element
	// * an Element
	// * @return a List with all incoming Relations for the specified Element
	// */
	// public List<Relation> getAllIncomingRelationsForElement(final Element element) {
	// return gssCache.getAllIncomingRelationsForElement(element);
	// }
	//
	// /**
	// * @param element
	// * an Element
	// * @param relationClassName
	// * the class name of a Relation
	// * @return a List with all outgoing Relations with the specified class name for the specified
	// * Element
	// */
	// public List<Relation> getAllOutgoingRelationsForElement(final Element element,
	// final String relationClassName) {
	// return gssCache.getAllOutgoingRelationsForElement(element, relationClassName);
	// }
	//
	// /**
	// * @param element
	// * an Element
	// * @param relationClassName
	// * the class name of a Relation
	// * @return a List with all incoming Relations with the specified class name for the specified
	// * Element
	// */
	// public List<Relation> getAllIncomingRelationsForElement(final Element element,
	// final String relationClassName) {
	// return gssCache.getAllIncomingRelationsForElement(element, relationClassName);
	// }
	//
	// /**
	// * @return a List with all cached Relations
	// */
	// public List<Relation> getAllRelations() {
	// return gssCache.getAllRelations();
	// }
	//
	// /**
	// * @param relationClassName
	// * the class name of a Relation
	// * @return a List with all cached Relations with the specified class name
	// */
	// public List<Relation> getAllRelations(final String relationClassName) {
	// return gssCache.getAllRelations(relationClassName);
	// }
	//
	// /**
	// * @param relation
	// * a Relation
	// * @return the cached weight for the specified relation as Float
	// */
	// public Float getRelationWeight(final Relation relation) {
	// return gssCache.getRelationWeight(relation);
	// }
	//
	// /**
	// * @param relation
	// * a Relation
	// * @return the cached weight for the specified relation as String
	// */
	// public String getRelationWeightString(final Relation relation) {
	// return gssCache.getRelationWeightString(relation);
	// }
	//
	// /**
	// * @param selectedGoal
	// * a Goal
	// * @return a List with all Rating relations to the specified Goal
	// */
	// public List<Rating> getRatingRelationsTo(final Goal selectedGoal) {
	// return applicableElementCache.getRatingRelationsTo(selectedGoal);
	// }
	//
	// public SelectedGoalsSet getSelectedGoalsSet() {
	// return (SelectedGoalsSet) selectedGoalsCache.getPrioritizedElementSet();
	// }
	//
	// public PrioritizedDecomposition getSelectedGoalsPriorizedDecomposition(
	// final Decomposition decomposition) {
	// return selectedGoalsCache.getPrioritizedDecomposition(decomposition);
	// }
	//
	// public Decomposition getSelectedGoalsDecomposition(
	// final PrioritizedDecomposition priorizedDecomposition) {
	// return selectedGoalsCache.getDecomposition(priorizedDecomposition);
	// }
	//
	// public List<PrioritizedDecomposition> getSelectedGoalsPriorizedDecompositionsForSource(
	// final Goal source) {
	// return selectedGoalsCache.getPrioritizedDecompositionsForSource(source);
	// }
	//
	// public List<PrioritizedDecomposition> getSelectedGoalsPriorizedDecompositionsForTarget(
	// final Goal target) {
	// return selectedGoalsCache.getPrioritizedDecompositionsForTarget(target);
	//
	// }
	//
	// public PrioritizedDecomposition getSelectedGoalsPriorizedDecompositionsBetween(
	// final Goal source, final Goal target) {
	// return selectedGoalsCache.getPrioritizedDecompositionsBetween(source, target);
	// }
	//
	// public PrioritizedElement getSelectedGoaForGoal(final Goal element) {
	// return selectedGoalsCache.getPrioritizedElement(element);
	// }
	//
	// public Goal getGoalForSelectedGoal(final PrioritizedElement priorizedElement) {
	// return (Goal) selectedGoalsCache.getElement(priorizedElement);
	// }
	//
	// public void setSelectedGoalPriorizedDecompositionWeight(final Goal source, final Goal target,
	// final Integer newPriority) {
	//
	// selectedGoalsCache.setWeight(source, target, newPriority);
	// notifyCacheChangeListeners();
	// }
	//
	// public Integer
	// getSelectedGoalPriorizedDecompositionWeight(final Goal source, final Goal target) {
	//
	// return selectedGoalsCache.getWeight(source, target);
	//
	// }
	//
	// public void setSelecteddGoalPriority(final Goal element, final Integer newPriority) {
	// selectedGoalsCache.setPriority(element, newPriority);
	// notifyCacheChangeListeners();
	// }
	//
	// public Goal getSelectedGoalPriorizedDecompositionTarget(
	// final PrioritizedDecomposition priorizedDecomposition) {
	//
	// return (Goal) selectedGoalsCache.getTarget(priorizedDecomposition);
	// }
	//
	// public Float getSelectedGoalPriority(final Goal element) {
	//
	// return selectedGoalsCache.getPrioritizedElementPriority(element);
	//
	// }
	//
	// public Integer getSelectedGoalPriorizedDecompositionWeight(
	// final PrioritizedDecomposition priorizedDecomposition) {
	// return selectedGoalsCache.getPrioritizedDecompositionWeight(priorizedDecomposition);
	// }
	//
	// /**
	// * save all changes stored by the cache to the containment model element instance
	// */
	// public void flushSelectedGoalsCache() {
	// selectedGoalsCache.flush();
	// }
	//
	// public void initSelectedGoalCache() {
	// if (selectedGoalsCache != null) {
	// selectedGoalsCache.initCache();
	// }
	// notifyCacheChangeListeners();
	// }
	//
	// public Set<PrioritizedDecomposition> getSelectedGoalsDecompositions() {
	// return selectedGoalsCache.getPrioritizedDecompositions();
	//
	// }
	//
	// public Set<PrioritizedElement> getSelectedGoals() {
	// return selectedGoalsCache.getPrioritizedElements();
	// }
	//
	// public List<Element> getRootSelectedGoals() {
	// return selectedGoalsCache.getRootPrioritizedElements();
	// }
	//
	// /**
	// * @param source
	// * an Element
	// * @param target
	// * an Element
	// * @return the Decomposition between the two specified Elements
	// */
	// public Decomposition getDecompositionBetween(final Element source, final Element target) {
	// return gssCache.getDecompositionBetween(source, target);
	//
	// }
	//
	// public void repairSelectedGoalsPrioritiesAndWeights() {
	// selectedGoalsCache.repairPrioritiesAndWeights();
	// notifyCacheChangeListeners();
	// }
	//
	// public PrioritizedDecomposition getPriorizedGoalDecompositionForDecomposition(
	// final Decomposition decomposition) {
	// return selectedGoalsCache.getPrioritizedDecompositionForDecomposition(decomposition);
	// }
	//
	// public void markSelectedGoalDecompositionAsToRemove(final Decomposition decomposition) {
	// selectedGoalsCache.markDecompositionAsToRemove(decomposition);
	// notifyCacheChangeListeners();
	// }
	//
	// public void demarkSelectedGoalDecompositionAsToRemove(final Decomposition decomposition) {
	// selectedGoalsCache.demarkDecompositionAsToRemove(decomposition);
	// notifyCacheChangeListeners();
	// }
	//
	// public void markSelectedGoalAsToRemove(final Goal element) {
	// selectedGoalsCache.markElementAsToRemove(element);
	// notifyCacheChangeListeners();
	// }
	//
	// public void demarkSelectedGoalAsToRemove(final Goal element) {
	// selectedGoalsCache.demarkElementAsToRemove(element);
	// notifyCacheChangeListeners();
	// }
	//
	// public void removeMarkedGoalsAndDecompositions() {
	// selectedGoalsCache.removeMarkedElementsAndDecompositions();
	// notifyCacheChangeListeners();
	// }
	//
	// public boolean goalDecompositionIsMarkedAsToRemove(final Decomposition decomposition) {
	// return selectedGoalsCache.isMarkedAsToRemove(decomposition);
	// }
	//
	// public boolean goalIsMarkedAsToRemove(final Goal element) {
	// return selectedGoalsCache.isMarkedAsToRemove(element);
	// }
	//
	// // principles
	//
	// public SelectedPrinciplesSet getSelectedPrinciplesSet() {
	// return (SelectedPrinciplesSet) selectedPrinciplesCache.getPrioritizedElementSet();
	// }
	//
	// public PrioritizedDecomposition getSelectedPrinciplesPriorizedDecomposition(
	// final Decomposition decomposition) {
	// return selectedPrinciplesCache.getPrioritizedDecomposition(decomposition);
	// }
	//
	// public Decomposition getSelectedPrinciplesDecomposition(
	// final PrioritizedDecomposition priorizedDecomposition) {
	// return selectedPrinciplesCache.getDecomposition(priorizedDecomposition);
	// }
	//
	// public List<PrioritizedDecomposition> getSelectedPrinciplesPriorizedDecompositionsForSource(
	// final Principle source) {
	// return selectedPrinciplesCache.getPrioritizedDecompositionsForSource(source);
	// }
	//
	// public List<PrioritizedDecomposition> getSelectedPrinciplesPriorizedDecompositionsForTarget(
	// final Principle target) {
	// return selectedPrinciplesCache.getPrioritizedDecompositionsForTarget(target);
	//
	// }
	//
	// public PrioritizedDecomposition getSelectedPrinciplesPriorizedDecompositionsBetween(
	// final Principle source, final Principle target) {
	// return selectedPrinciplesCache.getPrioritizedDecompositionsBetween(source, target);
	// }
	//
	// public PrioritizedElement getSelectedGoaForPrinciple(final Principle element) {
	// return selectedPrinciplesCache.getPrioritizedElement(element);
	// }
	//
	// public Principle getPrincipleForSelectedPrinciple(final PrioritizedElement priorizedElement)
	// {
	// return (Principle) selectedPrinciplesCache.getElement(priorizedElement);
	// }
	//
	// public void setSelectedPrinciplePriorizedDecompositionWeight(final Principle source,
	// final Principle target, final Integer newPriority) {
	//
	// selectedPrinciplesCache.setWeight(source, target, newPriority);
	// notifyCacheChangeListeners();
	// }
	//
	// public Integer getSelectedPrinciplePriorizedDecompositionWeight(final Principle source,
	// final Principle target) {
	//
	// return selectedPrinciplesCache.getWeight(source, target);
	//
	// }
	//
	// public void setSelecteddPrinciplePriority(final Principle element, final Integer newPriority)
	// {
	// selectedPrinciplesCache.setPriority(element, newPriority);
	// notifyCacheChangeListeners();
	// }
	//
	// public Principle getSelectedPrinciplePriorizedDecompositionTarget(
	// final PrioritizedDecomposition priorizedDecomposition) {
	//
	// return (Principle) selectedPrinciplesCache.getTarget(priorizedDecomposition);
	// }
	//
	// public Float getSelectedPrinciplePriority(final Principle element) {
	//
	// return selectedPrinciplesCache.getPrioritizedElementPriority(element);
	//
	// }
	//
	// public Integer getSelectedPrinciplePriorizedDecompositionWeight(
	// final PrioritizedDecomposition priorizedDecomposition) {
	// return selectedPrinciplesCache.getPrioritizedDecompositionWeight(priorizedDecomposition);
	// }
	//
	// /**
	// * save all changes stored by the cache to the containment model element instance
	// */
	// public void flushSelectedPrinciplesCache() {
	// selectedPrinciplesCache.flush();
	// }
	//
	// public void initSelectedPrincipleCache() {
	// if (selectedPrinciplesCache != null) {
	// selectedPrinciplesCache.initCache();
	// }
	// notifyCacheChangeListeners();
	// }
	//
	// public Set<PrioritizedDecomposition> getSelectedPrinciplesDecompositions() {
	// return selectedPrinciplesCache.getPrioritizedDecompositions();
	//
	// }
	//
	// public Set<PrioritizedElement> getSelectedPrinciples() {
	// return selectedPrinciplesCache.getPrioritizedElements();
	// }
	//
	// public List<Element> getRootSelectedPrinciples() {
	// return selectedPrinciplesCache.getRootPrioritizedElements();
	// }
	//
	// public void repairSelectedPrinciplesPrioritiesAndWeights() {
	// selectedPrinciplesCache.repairPrioritiesAndWeights();
	// notifyCacheChangeListeners();
	// }
	//
	// public PrioritizedDecomposition getPriorizedPrinciplesDecompositionForDecomposition(
	// final Decomposition decomposition) {
	// return selectedPrinciplesCache.getPrioritizedDecompositionForDecomposition(decomposition);
	// }
	//
	// public void markSelectedPrincipleDecompositionAsToRemove(final Decomposition decomposition) {
	// selectedPrinciplesCache.markDecompositionAsToRemove(decomposition);
	// notifyCacheChangeListeners();
	// }
	//
	// public void demarkSelectedPrincipleDecompositionAsToRemove(final Decomposition decomposition)
	// {
	// selectedPrinciplesCache.demarkDecompositionAsToRemove(decomposition);
	// notifyCacheChangeListeners();
	// }
	//
	// public void markSelectedPrincipleAsToRemove(final Principle element) {
	// selectedPrinciplesCache.markElementAsToRemove(element);
	// notifyCacheChangeListeners();
	// }
	//
	// public void demarkSelectedPrincipleAsToRemove(final Principle element) {
	// selectedPrinciplesCache.demarkElementAsToRemove(element);
	// notifyCacheChangeListeners();
	// }
	//
	// public void removeMarkedPrinciplesAndDecompositions() {
	// selectedPrinciplesCache.removeMarkedElementsAndDecompositions();
	// notifyCacheChangeListeners();
	// }
	//
	// public boolean principleDecompositionIsMarkedAsToRemove(final Decomposition decomposition) {
	// return selectedPrinciplesCache.isMarkedAsToRemove(decomposition);
	// }
	//
	// public boolean principleIsMarkedAsToRemove(final Principle element) {
	// return selectedPrinciplesCache.isMarkedAsToRemove(element);
	// }
	//
	// public Float getIndirectRatingWeight(final ConstrainedElement sourceElement,
	// final Element targetElement) {
	// return applicableElementCache.getIndirectRatingWeight(sourceElement, targetElement);
	// }

}
