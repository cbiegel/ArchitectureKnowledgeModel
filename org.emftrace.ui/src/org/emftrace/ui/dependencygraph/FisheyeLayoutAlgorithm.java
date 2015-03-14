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

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
import org.eclipse.zest.layouts.dataStructures.InternalNode;
import org.eclipse.zest.layouts.dataStructures.InternalRelationship;

/**
 * An extension of the Zest SpringLayoutAlgorithm to create dependency graphs
 * 
 * @author  Steffen Lehnert
 * @version 1.0
 */
public class FisheyeLayoutAlgorithm extends SpringLayoutAlgorithm
{	
	/**
	 * Stores a reference to the graph of which the layout shall be computed
	 */
	private DependencyGraph graph;
	
    ///////////////////////////////////////////////////////////////////////////

	/**
	 * Costructor
	 * 
	 * @param styles
	 * @param newAccessLayer
	 * @param newModel
	 * @param newGraph
	 * @param subgraphList
	 */
	public FisheyeLayoutAlgorithm(int styles, DependencyGraph newGraph)
	{
		super(styles);
		graph = newGraph;
	}
	
    ///////////////////////////////////////////////////////////////////////////

	/**
	 * Apply the actual layout-algorithm
	 */
    protected void applyLayoutInternal(InternalNode[] entitiesToLayout, InternalRelationship[] relationshipsToConsider, double boundsX, double boundsY, double boundsWidth, double boundsHeight) 
    {
    	createFisheyelayout((int)boundsWidth, (int)boundsHeight);
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Computes the distance between a node of a sub-graph and its center
     * 
     * @param nodes a list of all nodes of a sub-graph
     * @param edges a list of all edges of a sub-graph
     * @return the distance between a node of the graph and its center
     */
    private int calculateDistanceFromCenterNode(List<DependencyGraphNode> nodes, List<DependencyGraphEdge> edges)
    {
		int maxNode = 0;
		int maxEdge = 0;
		int pixelPerLetter = 8;
		
		for(int i = 0; i < nodes.size(); i++)
			if( nodes.get(i).getSize().width > maxNode ) 
				maxNode = nodes.get(i).getSize().width;
		
		for(int i = 0; i < edges.size(); i++)
		{
			String text = edges.get(i).getText();
			
			int idx = text.indexOf("\n");
			
			if( idx == -1  )
			{
				if( text.length() > maxEdge )
					maxEdge = text.length();
			}
			else
			{
				String subStr = text.substring(0, idx);
				if( subStr.length() > maxEdge )
					maxEdge = subStr.length();				
			}
		}
        
		int distance = maxNode*nodes.size()/4;
		
		int edgeDistance = pixelPerLetter * maxEdge + maxNode + 50;
        
        if( (edgeDistance) > distance ) 
        	return edgeDistance;
        else
        	return distance;
    }
    
    ///////////////////////////////////////////////////////////////////////////
                
    /**
     * Returns the {@link DependencyGraphNode central node} of a sub-graph
     * 
     * @param subGraphIndex the index of the subgraph
     * @return the center node of the subgraph
     */
    private DependencyGraphNode getCenterNodeOfSubgraph()
    {   	
        for(int i = 0; i < graph.getNodes().size(); i++)
        {
        	DependencyGraphNode node = (DependencyGraphNode) graph.getNodes().get(i);
        	if( node.isLocalRoot() )
        		return node;
        }
        
        return null;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Adjusts a {@link DependencyGraphNode node's} position according to its local center
     * 
     * @param centerPosition the position of the center node
     * @param position the position of the current node
     * @param angle the angle between the center node and the current node
     */
    private void normalizeNodePositions(Point centerPosition, Point position, float angle)
    {
    	if( angle < Math.PI/2 )                            //
    	{                                                  //   | x
    		position.x = centerPosition.x + position.x;    // --+-->
    		position.y = centerPosition.y - position.y;    //   |
    	}                                                  //   v
    	
    	if( angle >= Math.PI/2 && angle < Math.PI )        //
    	{												   //   |
    		position.x = centerPosition.x + (-position.x); // --+-->
    		position.y = centerPosition.y + position.y;    //   | x
    	}                                                  //   v
    	
    	if( angle >= Math.PI && angle < 1.5f*Math.PI )     //
    	{                                                  //   |
    		position.x = centerPosition.x + position.x;    // --+-->
    		position.y = centerPosition.y + (-position.y); // x |
    	}                                                  //   v
    	
    	if( angle >= 1.5f*Math.PI )                        //
    	{                                                  // x |
    		position.x = centerPosition.x - position.x;    // --+--->
    		position.y = centerPosition.y + position.y;    //   |
    	}    	                                           //   v
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Returns all internal edges of a subgraph, i.e. those who are not related to other sub-graphs
     * 
     * @param nodes the nodes of a subgraph
     * @return the list of internal edges of a subgraph
     */
    private List<DependencyGraphEdge> getInternalSubGraphRelations(List<DependencyGraphNode> nodes)
    {
    	List<DependencyGraphEdge> edges = graph.getConnections();
    	List<DependencyGraphEdge> result = new ArrayList<DependencyGraphEdge>();
    	    	
    	for(int i = 0; i < edges.size(); i++)
    		if( nodes.contains(edges.get(i).getSource()) && nodes.contains(edges.get(i).getDestination()) )
    			result.add(edges.get(i));
    	
    	return result;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Calculate the position of a local center/root node
     * 
     * @param windowWidth  width of the window in pixel
     * @param windowHeight height of the window in pixel
     * @return the 2d coordinates for the local center/root node
     */
    private Point calculatePositionOfCenterNode(int windowWidth, int windowHeight)
    {
    	return (new PrecisionPoint(windowWidth/2, windowHeight/2)); 
    }
            
    ///////////////////////////////////////////////////////////////////////////
        
    /**
     * Arranges the nodes according to a fisheye-style
     * 
     * @param windowWidth the width of the screen in pixel
     * @param windowHeight the height of the screen in pixel
     */
    private void createFisheyelayout(int windowWidth, int windowHeight)
    {            					
		List<DependencyGraphNode> nodes = graph.getNodes();
		List<DependencyGraphEdge> edges = getInternalSubGraphRelations(nodes);
		
		DependencyGraphNode centerNode = getCenterNodeOfSubgraph();       
        
		Point centerPosition = calculatePositionOfCenterNode(windowWidth, windowHeight);
        centerNode.setLocation(centerPosition.x,centerPosition.y);
       	                       
    	int offset = 0;
        int distanceFromCenter = calculateDistanceFromCenterNode(nodes,edges);
        
    	float angle = 0.0f;
    	float angleOffset = 360.0f  / ((float)(nodes.size()-1));
    	
        for(int i = 0; i < nodes.size(); i++)
        {
        	if( nodes.get(i).isLocalRoot() )
        	{
        		offset++;
        		continue;
        	}
        	        	
        	angle = (float)(i-offset) * angleOffset;
        	angle = (float)(angle * Math.PI / 180.0f);
        	        	        	
        	int posX = (int)(Math.cos(angle) * distanceFromCenter);
        	int posY = (int)(Math.sin(angle) * distanceFromCenter);
        	
        	Point position = new PrecisionPoint(posX, posY);
        	normalizeNodePositions(centerPosition, position, angle);       	
        	        	
        	nodes.get(i).setLocation(position.x,position.y);
        }
        
        centerNode.highlight();
    }
}