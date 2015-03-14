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

import java.util.Date;

import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.GSS.GSS;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.metamodel.QUARCModel.Query.SelectedGoalsSet;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.gssquery.preselector.Preselector;
import org.emftrace.quarc.core.gssquery.ratingscalculator.RatingsCalculator;

import org.emftrace.ui.command.AbstractCommand;

import com.ibm.icu.text.SimpleDateFormat;



/**
 * The GSSQueryProcessor accepts, validates and executes a specified GSSQuery
 * 
 * @author Daniel Motschmann
 * @version 1.0
 * 
 * 
 */
public class GSSQueryProcessor extends AbstractCommand{

	
	private GSSQuery gssQuery;
	private Preselector preselector;
	private RatingsCalculator ratingsCalculator;
	private AccessLayer accessLayer;
	private QueryResultSet queryResultSet;
	private CacheManager cacheManager;
	private SelectedGoalsSet selectedGoalsSet;
	private boolean goalsAndPrinciplesOnly;
	
	/**
	 * the constructor
	 * 
	 * @param gssQuery a GSSQuery
	 * @param accessLayer an AccessLayer
	 * @param gss a GSS
	 * @param assignedConstraintsSet an AssignedConstraintsSet
	 * @param includedTags a List with to include Tags
	 * @param goalsAndPrinciplesOnly preselect only goals and principles
	 */
	public GSSQueryProcessor(GSSQuery gssQuery, AccessLayer accessLayer, GSS gss, AssignedConstraintsSet assignedConstraintsSet, boolean goalsAndPrinciplesOnly){
		super("processing query "+gssQuery.getName()+" ...");
		this.gssQuery  = gssQuery;
		this.goalsAndPrinciplesOnly = goalsAndPrinciplesOnly;
		this.queryResultSet = QueryFactory.eINSTANCE.createQueryResultSet();
		this.cacheManager = new CacheManager(gss, this.queryResultSet,accessLayer);
		this.selectedGoalsSet = gssQuery.getSelectedGoalsSet();
		this.preselector = new Preselector(this.gssQuery, this.queryResultSet, this.accessLayer,cacheManager, assignedConstraintsSet, selectedGoalsSet, goalsAndPrinciplesOnly );
		this.ratingsCalculator = new RatingsCalculator(this.gssQuery, this.queryResultSet, this.accessLayer, cacheManager);	
	//	this.scoreCalculator = new ScoreCalculator(gssQuery, queryResultSet, accessLayer, cacheManager);

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
	
	

	/* (non-Javadoc)
	 * @see sharedcomponents.commands.AbstractCommand#doRun()
	 */
	@Override
	protected void doRun() {
		cacheManager.initCache();
		
		if (!goalsAndPrinciplesOnly)
			gssQuery.setTimestamp(new SimpleDateFormat("MM.dd.yyyy HH:mm:ss z").format(new Date()));
		
		preselector.runWithoutUnicaseCommand();
		
		if (!goalsAndPrinciplesOnly)
		ratingsCalculator.runWithoutUnicaseCommand();
		
		
		gssQuery.setChanged(false);
		if (gssQuery.getAssignedConstraintsSet()!= null)
		gssQuery.getAssignedConstraintsSet().setChanged(false);
		if (gssQuery.getSelectedGoalsSet()!= null)
		gssQuery.getSelectedGoalsSet().setChanged(false);
		if (gssQuery.getSelectedPrinciplesSet()!= null)
		gssQuery.getSelectedPrinciplesSet().setChanged(false);
	}
	
	
}
