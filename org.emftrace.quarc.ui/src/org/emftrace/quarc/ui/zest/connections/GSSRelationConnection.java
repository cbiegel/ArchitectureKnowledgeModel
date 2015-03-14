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

package org.emftrace.quarc.ui.zest.connections;

import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;

/**
 * A GraphConnection for GSS.Rations
 * 
 * @author Daniel Motschmann
 *
 */
public class GSSRelationConnection extends GraphConnection{

	private Relation relation;

	/**the constructor
	 * 
	 * @param graphModel the parent Graph
	 * @param style the SWT Style
	 * @param source the source node
	 * @param destination the target node
	 * @param relation the Relation
	 */
	public GSSRelationConnection(Graph graphModel, int style, GraphNode source,
			GraphNode destination, Relation relation) {
		super(graphModel, style, source, destination);
		this.relation = relation;
	}

	/**
	 *
	 * @return the Relation of the connection
	 */
	public Relation getRelation() {
		return relation;
	}


}
