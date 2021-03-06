package org.emftrace.akm.core.cache;

import org.eclipse.emf.ecore.EObject;
import org.emftrace.core.accesslayer.AccessLayer;

/**
 * This class was taken from the QUARC project
 */
public abstract class AbstractCache {

	/**
	 * the input of the cache
	 */
	private EObject input;

	/**
	 * @return the input of the cache
	 */
	public EObject getInput() {
		return input;
	}

	/**
	 * an AccessLayer
	 */
	private AccessLayer accessLayer;

	/**
	 * @return the used AccessLayer
	 */
	public AccessLayer getAccessLayer() {
		return accessLayer;
	}

	/**
	 * the constructor
	 * 
	 * @param queryResultSet
	 *            a QueryResultSet which contains the ApplicableElements
	 * @param accessLayer
	 *            an AccessLayer
	 */
	public AbstractCache(final EObject input, final AccessLayer accessLayer) {
		this.input = input;
		this.accessLayer = accessLayer;
	}

	/**
	 * initialize the cache
	 */
	public abstract void initCache();

}
