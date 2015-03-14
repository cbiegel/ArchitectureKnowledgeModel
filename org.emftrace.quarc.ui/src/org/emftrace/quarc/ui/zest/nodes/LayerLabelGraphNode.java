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


package org.emftrace.quarc.ui.zest.nodes;

import org.eclipse.swt.graphics.Color;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.IContainer;

/**
 * A GraphNode used by the GSSGraphLayoutAlgorithm to draw a caption for a GSS layer or to draw a separator between two layers
 * 
 * @author Daniel Motschmann
 *
 */
public class LayerLabelGraphNode extends GraphNode{

	/**
	 * the constructor
	 * @param graphModel a Zest GraphModel
	 * @param style the SWT style of the node
	 */
	public LayerLabelGraphNode(IContainer graphModel, int style) {
		super(graphModel, style);
		this.setBackgroundColor(new Color(null, 255,255,255));
	}

}
