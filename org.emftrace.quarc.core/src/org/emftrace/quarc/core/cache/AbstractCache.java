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

import org.eclipse.emf.ecore.EObject;
import org.emftrace.core.accesslayer.AccessLayer;

/**
 * Abstract base class for all caches managed by CacheManager
 * 
 * @author Daniel Motschmann
 *
 */
public abstract class AbstractCache {

	/**
	 * the input of the cache
	 */
	private EObject input;
	
	/**
	 * @return the input of the cache
	 */
	public EObject getInput(){
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
	 * @param queryResultSet a QueryResultSet which contains the ApplicableElements
	 * @param accessLayer an AccessLayer
	 */
	public AbstractCache(EObject input, AccessLayer accessLayer){
		this.input = input;
		this.accessLayer = accessLayer;
	}
	
	/**
	 * initialized the cache
	 */
	public abstract void initCache();
}
