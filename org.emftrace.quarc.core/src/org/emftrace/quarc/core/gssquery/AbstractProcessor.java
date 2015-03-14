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

package org.emftrace.quarc.core.gssquery;

import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.ui.command.AbstractCommand;




/**
 * Abstract class for all GSSPhases
 * 
 * @author Daniel Motschmann
 * @version 1.0
 * 
 */

public abstract class AbstractProcessor extends AbstractCommand {
	
	/**
	 * the specified GSSQuery 
	 */
	protected GSSQuery gssQuery;
	
	/**
	 * an EMFTrace AccessLayer instance
	 */
	protected AccessLayer accessLayer;
	
	/**
	 * a CacheManager 
	 */
	protected CacheManager cacheManager;
	
	/**
	 * a Cache for Elements their Relations
	 */
	protected QueryResultSet queryResultSet;
	

	/**
	 * the constructor 
	 * @param gssQuery a GSSQuery
	 * @param queryResultSet a QueryResultSet
	 * @param accessLayer an AccessLayer
	 * @param cacheManager a CacheManager
	 */
	public AbstractProcessor(GSSQuery gssQuery, QueryResultSet queryResultSet, AccessLayer accessLayer, CacheManager cacheManager){
		this.gssQuery = gssQuery;
		this.accessLayer = accessLayer;
		this.cacheManager = cacheManager;
		this.queryResultSet = queryResultSet;
	}
	
	
	/**
	 * getter for the specified GSSQuery 
	 */
	public GSSQuery getGSSQuery(){
		return this.gssQuery;
	}
	
	/**
	 * getter for the calculated QueryResult 
	 */
	public QueryResultSet getQueryResultSet(){
		return this.queryResultSet;
	}
}
