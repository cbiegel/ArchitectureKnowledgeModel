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

package org.emftrace.quarc.ui.zestgpraphbuilders;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPartSite;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.GSS;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.ui.zest.graph.GSSGraph;


/**
 * A GraphBuilder for the model element GSS 
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class GSSGraphBuilder extends AbstractElementGraphBuilder {
	
	/**
	 * the constructor
	 * 
	 * @param parent
	 * @param style
	 * @param iWorkbenchPartSite
	 * @param inputContainer
	 * @param accessLayer
	 */
	public GSSGraphBuilder(Composite parent, int style, IWorkbenchPartSite iWorkbenchPartSite, GSS inputContainer, AccessLayer accessLayer) {
		super(parent, style, iWorkbenchPartSite, inputContainer, accessLayer);
		this.accessLayer = accessLayer;
	}

	/* (non-Javadoc)
	 * @see org.emftrace.quarc.ui.zestgpraphbuilders.AbstractElementGraphBuilder#buildCustomGraph(org.emftrace.quarc.ui.zest.graph.GSSGraph)
	 */
	@Override
	protected void buildCustomGraph(final GSSGraph zestGraph) {

		super.buildCustomGraph(zestGraph);

		// create a node for each applicable Element
		 for (Element element : cacheManager.getAllElements()) {

			int level = cacheManager.getLevel(element);
			int sublevel = cacheManager.getSublevel(element);
			
			createNode(zestGraph, SWT.NONE, element, 
					level, sublevel, cacheManager.isLeaf(element), !cacheManager.getAllIncomingRelationsForElement(element).isEmpty());
		}
		
		 for (Element element : cacheManager.getAllElements()) {
		// create connections for all (outgoing) relations
		for (Relation outgoingRelation: cacheManager.getAllOutgoingRelationsForElement(element)) {
			createConnection(outgoingRelation);
		}	
		}
		
	}

	/* (non-Javadoc)
	 * @see org.emftrace.quarc.ui.zestgpraphbuilders.AbstractElementGraphBuilder#initCache()
	 */
	@Override
	protected void initCache() {
		cacheManager = new CacheManager((GSS) getInput(), accessLayer);
		cacheManager.initCache();
	}
}
