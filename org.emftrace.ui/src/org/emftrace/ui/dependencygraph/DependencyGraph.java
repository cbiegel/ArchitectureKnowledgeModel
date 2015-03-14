/*******************************************************************************
 * Copyright (c) 2010-2013 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.emftrace.ui.dependencygraph;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.LinkModel.Trace;
import org.emftrace.metamodel.LinkModel.TraceLink;
import org.emftrace.metamodel.ReportModel.ImpactReport;
import org.emftrace.ui.activator.Activator;

/**
 * An extension of the Zest graph to display dependency graphs
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class DependencyGraph extends Graph 
{	
	/**
	 * The current {@link AccessLayer}
	 */
	private AccessLayer accessLayer;
		
	/**
	 * The current {@link ECPProject}
	 */
	private ECPProject project;
	
	/**
	 * The {@link Font font} used by the graph
	 */
	private static final Font graphFont = new Font(null, "Arial", 8, SWT.NONE);
	
	/**
	 * The color for incoming relations
	 */
	private static final int incomingLinkColor = SWT.COLOR_RED;
	
	/**
	 * The color for outgoing relations
	 */
	private static final int outgoingLinkColor = SWT.COLOR_GRAY;
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Adjust the label of each node.
	 * 
	 * @param model the {@link EObject model} which is represented by a node
	 * 
	 * @return the label for the node
	 */
	private String getFormatedNodeLabel(EObject model)
	{
		String label = "";
		String name  = accessLayer.getNameOfModel(model);
		String type  = model.eClass().getName();
		String nameSpace = "";
		String typeSpace = "";	
		
		int diff = type.length()-name.length()+4;
		
		if( diff > 0 )
			for(int i = 0; i < diff; i++)
				nameSpace += " ";
		
		if( diff < 0 )
			for(int i = 0; i < (-diff/2)+1; i++)
				typeSpace += " ";
		
		label = nameSpace + name + "\n" + typeSpace + "<<" + type + ">>";
		
		return label;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Constructor
	 * 
	 * @param parent      the parent composite controlling this graph
	 * @param style       style settings for the graph
	 * @param accessLayer the current {@link AccessLayer}
	 */
	public DependencyGraph(Composite parent, int style, AccessLayer newAccessLayer)
	{
		super(parent, style);
		this.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,1));
		
		project = null;
		accessLayer = newAccessLayer;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Build a dependency graph from a {@link Trace}.
	 * 
	 * @param trace the trace
	 */
	public void buildFromTrace(Trace trace)
	{				
		List<DependencyGraphNode> nodes  = new ArrayList<DependencyGraphNode>();
		List<DependencyGraphEdge> edges  = new ArrayList<DependencyGraphEdge>();
		List<TraceLink>           links  = trace.getTraceabilityLinks();
		List<EObject>             models = new ArrayList<EObject>();
							
		for(int i = 0; i < links.size(); i++)
		{
			EObject src = links.get(i).getSource();
			EObject dst = links.get(i).getTarget();
			
			DependencyGraphNode source = null;
			DependencyGraphNode target = null;
			
			if( !models.contains(src) )
			{
				String name = getFormatedNodeLabel(src);
				source = new DependencyGraphNode(this, SWT.NONE, name, src, false, null, false);
				nodes.add(source);
				models.add(src);
			}	
			else source = nodes.get(models.indexOf(src));
			
			source.setFont(graphFont);
			
			if( !models.contains(dst) )
			{
				String name = getFormatedNodeLabel(dst);
				target = new DependencyGraphNode(this, SWT.NONE, name, dst, false, null, false);
				nodes.add(target);
				models.add(dst);
			}
			else target = nodes.get(models.indexOf(dst));
			
			target.setFont(graphFont);
			
			DependencyGraphEdge edge = new DependencyGraphEdge(this, ZestStyles.CONNECTIONS_DIRECTED, source, target, links.get(i));
			edge.setText("<<"+links.get(i).getType().getName()+">>");
			edges.add(edge);
			edge.setFont(graphFont);
		}
		
		adjustEdgesAfterImpactAnalysis();
		
		this.setLayoutAlgorithm(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Build a dependency graph based on a {@link EObject model's} dependencies.
	 * 
	 * @param model   the selected model
	 * @param project the project containing the model
	 */
	public void buildForModel(EObject model, ECPProject newProject, boolean incoming, boolean outgoing)
	{		
		project = newProject;
		
		List<DependencyGraphEdge> edges  = new ArrayList<DependencyGraphEdge>();
		List<EObject>             links  = accessLayer.getElements(project, "TraceLink");
		List<EObject>             models = new ArrayList<EObject>();
		List<TraceLink>           links2  = new ArrayList<TraceLink>();		
		
		for(int i = 0; i < links.size(); i++)
		{
			TraceLink link = (TraceLink)links.get(i);
			
			if( link.getSource() == model && !models.contains(link.getTarget()) && outgoing )
			{
				models.add(link.getTarget());
				links2.add(link);
			}
			if( link.getTarget() == model && !models.contains(link.getSource()) && incoming ) 
			{
				models.add(link.getSource());
				links2.add(link);
			}
		}
		
		String name = getFormatedNodeLabel(model);
		DependencyGraphNode centerNode = checkIfNodeAlreadyExists(model);
		
		if( centerNode == null) 
			centerNode = new DependencyGraphNode(this, SWT.NONE, name, model, true, null, true);
		else 
			centerNode.setAsLocalRoot(true);
			
		centerNode.setFont(graphFont);
		
		for(int i = 0; i < models.size(); i++)
		{
			name = getFormatedNodeLabel(models.get(i));
			DependencyGraphNode node = checkIfNodeAlreadyExists(models.get(i));
			
			if( node == null) node = new DependencyGraphNode(this, SWT.NONE, name, models.get(i), false, centerNode, true);
			
			node.setFont(graphFont);
			
			DependencyGraphEdge edge = checkIfEdgeAlreadyExists(links2.get(i));
			
			if( centerNode.getModel() == links2.get(i).getSource() ) 
			{
				if( edge == null )
				{
					edge = new DependencyGraphEdge(this, ZestStyles.CONNECTIONS_DIRECTED, centerNode, node, links2.get(i));
					edge.setText("<<"+links2.get(i).getType().getName()+">>");			
					edges.add(edge);
				}
				
				edge.setFont(graphFont);				
				edge.changeLineColor(this.getParent().getDisplay().getSystemColor(outgoingLinkColor));
			}
			else
			{
				if( edge == null )
				{
					edge = new DependencyGraphEdge(this, ZestStyles.CONNECTIONS_DIRECTED, node, centerNode, links2.get(i));
					edge.setText("<<"+links2.get(i).getType().getName()+">>");			
					edges.add(edge);
				}
				
				edge.setFont(graphFont);
				edge.changeLineColor(this.getParent().getDisplay().getSystemColor(incomingLinkColor));
			}
		}
		
		equalizeNodeSizes(getNodes());
		
		adjustEdgesAfterImpactAnalysis();
				
		FisheyeLayoutAlgorithm layouter = new FisheyeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING, this);
				
		this.setLayoutAlgorithm(layouter, true);
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Equalizes the size of all {@link DependencyGraphNode nodes} in a graph
	 * 
	 * @param nodes the current list of nodes
	 */
	private void equalizeNodeSizes(List<DependencyGraphNode> nodes)
	{
		if( nodes.isEmpty() ) return;
		
		int max = 0;
		int height = nodes.get(0).getSize().height;
		
		for(int i = 0; i < nodes.size(); i++)
			if( nodes.get(i).getSize().width > max ) 
				max = nodes.get(i).getSize().width;
		
		for(int i = 0; i < nodes.size(); i++)
			nodes.get(i).setSize(max, height);
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Checks whether a {@link EObject model} is already contained by a graph
	 * 
	 * @param model the model
	 * @return the node if it exists
	 */	
	private DependencyGraphNode checkIfNodeAlreadyExists(EObject model)
	{
		List<DependencyGraphNode> nodes = getNodes();
		
		for(int i = 0; i < nodes.size(); i++)
			if( nodes.get(i).getModel() == model )
				return nodes.get(i);
		
		return null;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Checks whether a {@link traceability-link TraceLink} is already contained by a graph
	 * 
	 * @param link the traceability link
	 * @return the edge if it exists
	 */
	private DependencyGraphEdge checkIfEdgeAlreadyExists(TraceLink link)
	{
		List<DependencyGraphEdge> edges = getConnections();
		
		for(int i = 0; i < edges.size(); i++)
			if( edges.get(i).getLink() == link )
				return edges.get(i);
		
		return null;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Checks whether there exists a relation between a {@link DependencyGraphNode node} and the selected {@link EObject model}
	 * @param node  the node
	 * @param model the model
	 * @return true if both are connected
	 */
	private boolean isRelatedTo(DependencyGraphNode node, EObject model)
	{
		List<DependencyGraphEdge> edges = getConnections();
		
		for(int i = 0; i < edges.size(); i++)
		{
			DependencyGraphNode src  = (DependencyGraphNode)edges.get(i).getSource();
			DependencyGraphNode dst  = (DependencyGraphNode)edges.get(i).getDestination();
			
			if( src == node && dst.getModel() == model ) return true;
			if( dst == node && src.getModel() == model ) return true;
		}
		
		return false;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Un-highlight all highlighted nodes if they are not central nodes of sub-graphs
	 */
	public void unhilightNodes()
	{
		List<DependencyGraphNode> nodes = getNodes();
		
		for(int i = 0; i < nodes.size(); i++)
			nodes.get(i).unhighlight();
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Checks whether a {@link EObject model} can be expaned to a sub-graph
	 * 
	 * @param node the current model
	 * @return true if the node can be expanded
	 */
	public boolean isExpansionPossible(EObject model)
	{
		List<DependencyGraphEdge> edges = getConnections();
		List<EObject> links = accessLayer.getElements(project, "TraceLink");
		
		int existingEdges = 0;
		int existingLinks = 0;
		
		for(int i = 0; i < edges.size(); i++)
			if( ((DependencyGraphNode) edges.get(i).getSource()).getModel() == model || ((DependencyGraphNode) edges.get(i).getDestination()).getModel() == model )
				existingEdges++;	
		
		for(int i = 0; i < links.size(); i++)
			if( ((TraceLink) links.get(i)).getSource() == model || ((TraceLink) links.get(i)).getTarget() == model )
				existingLinks++;
		
		if( existingEdges == existingLinks ) return false;
		
		return true;
	}
		
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Removes all {@link DependencyGraphNode nodes} and {@link DependencyGraphEdge edges} from the graph which are
	 * not directly related to a selected {@link EObject model}
	 * 
	 * @param model the selected model
	 */
	public void reduceToSingleGraph(EObject model)
	{
		List<DependencyGraphNode> nodes = getNodes();
		DependencyGraphNode node = checkIfNodeAlreadyExists(model);
			
		for(int i = 0; i < nodes.size(); i++)
		{
			if( nodes.get(i).getModel() == model ) continue;
			
			if( !isRelatedTo(nodes.get(i), model) )
			{
				nodes.get(i).dispose();
				i--;
			}
		}
			
		for(int i = 0; i < nodes.size(); i++) 
		{
			nodes.get(i).reset();
			nodes.get(i).setParentNode(node);
		}

		node.setAsLocalRoot(true);
		node.setParentNode(null);
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	public void deleteAllNodes()
	{
		List<DependencyGraphNode> nodes = getNodes();
			
		for(int i = 0; i < nodes.size(); i++)
		{
			nodes.get(i).dispose();
			i--;
		}
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Returns the current active {@link ECPProject}
	 * 
	 * @return the current project
	 */
	ECPProject getProject()
	{
		return project;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Link {@link ImpactReport impact reports} and corresponding  {@link TraceLink traceability links}, and display
	 * this information in the graph (as annotation to edges-labels)
	 */
	public void adjustEdgesAfterImpactAnalysis()
	{
		List<DependencyGraphEdge> edges = getConnections();
		List<EObject> allImpacts = Activator.getAccessLayer().getElements(project, "ImpactReport");	
		
		if( allImpacts.isEmpty() ) return;
		
		List<ImpactReport> impacts = new ArrayList<ImpactReport>();
		
		for(int i = 0; i < edges.size(); i++)
		{		
			for(int j = 0; j < allImpacts.size(); j++)
			{
				List<EObject> source = ((ImpactReport) allImpacts.get(j)).getImpactSources();
				List<EObject> target = ((ImpactReport) allImpacts.get(j)).getAffectedElements();
				
				EObject linkSrc = ((DependencyGraphNode) edges.get(i).getSource()).getModel();
				EObject linkDst = ((DependencyGraphNode) edges.get(i).getDestination()).getModel();
				
				if( (source.contains(linkSrc) || target.contains(linkSrc)) && (source.contains(linkDst) || target.contains(linkDst)) )
					impacts.add((ImpactReport)allImpacts.get(j));
			}
			
			if( impacts.isEmpty() ) continue;
			
			String text = edges.get(i).getText();
			
			int idx = text.indexOf("\n");
			
			if( idx != -1 )	text = text.substring(0, idx);
				
			if( impacts.size() == 1 ) 
				text += "\n" + impacts.size() + " impact";
			else
				text += "\n" + impacts.size() + " impacts";
			
			edges.get(i).setText(text);
			edges.get(i).createMenu(impacts);
			impacts.clear();
		}
	}
}