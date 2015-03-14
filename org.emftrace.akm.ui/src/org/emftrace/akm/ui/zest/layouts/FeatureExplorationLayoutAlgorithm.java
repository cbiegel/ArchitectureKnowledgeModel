package org.emftrace.akm.ui.zest.layouts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.draw2d.IFigure;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.layouts.algorithms.AbstractLayoutAlgorithm;
import org.eclipse.zest.layouts.dataStructures.InternalNode;
import org.eclipse.zest.layouts.dataStructures.InternalRelationship;
import org.emftrace.akm.ui.zest.nodes.AbstractAKMGraphNode;
import org.emftrace.quarc.ui.zest.nodes.LayerLabelGraphNode;

/**
 * A layout algorithm for a GSS graph
 * 
 * @author Daniel Motschmann
 * @version 1.0
 * 
 */
public class FeatureExplorationLayoutAlgorithm extends AbstractLayoutAlgorithm {

	private int xOffset = 50;
	private int yOffset = 50;
	private int leftSpace = 40;
	private int topSpace = 20;

	private HashMap<Integer, Integer> totalLevelOffset; // sum of sublevel of ancestor
	private Graph graph;
	private PaintListener paintListener;
	private ArrayList<LayerLabelGraphNode> layerLabelGraphNodeList;
	private int longestX;
	private int longestY;
	private int highestNumberOfNodes;
	private HashMap<Integer, Integer> sublevelCount;
	private ArrayList<LayerLabelGraphNode> layerLinesGraphNodeList;

	/**
	 * the constructor
	 */
	public FeatureExplorationLayoutAlgorithm(final int styles, final Graph graph) {
		super(styles);
		this.graph = graph;
		graph.setLayoutAlgorithm(this, false);

		// Layout must be applied _after_ the zest graph is completely painted.
		// Otherwise the LayoutAlgorithm can't get the dimensions of the ElementFigures.
		paintListener = new PaintListener() {

			@Override
			public void paintControl(final PaintEvent e) {
				graph.applyLayout();
			}
		};

		graph.getGraph().addPaintListener(paintListener);
		graph.getGraph().addDisposeListener(new DisposeListener() {

			@Override
			public void widgetDisposed(final DisposeEvent e) {
				if (paintListener != null) {
					graph.getGraph().removePaintListener(paintListener);
				}
				graph.getGraph().removeDisposeListener(this);

			}
		});

		layerCaptions = new HashMap<Integer, String>();

		layerLabelGraphNodeList = new ArrayList<LayerLabelGraphNode>();

		LayerLabelGraphNode nodeLayer1 = new LayerLabelGraphNode(graph, SWT.NONE);
		layerLabelGraphNodeList.add(nodeLayer1);
		setCaptionsForLayers("goals", 0);
		nodeLayer1.setVisible(false);

		LayerLabelGraphNode nodeLayer2 = new LayerLabelGraphNode(graph, SWT.NONE);
		layerLabelGraphNodeList.add(nodeLayer2);
		setCaptionsForLayers("principles", 1);
		nodeLayer2.setVisible(false);

		LayerLabelGraphNode nodeLayer3 = new LayerLabelGraphNode(graph, SWT.NONE);
		layerLabelGraphNodeList.add(nodeLayer3);
		setCaptionsForLayers("solution instruments", 2);
		nodeLayer3.setVisible(false);

		layerLinesGraphNodeList = new ArrayList<LayerLabelGraphNode>();

		LayerLabelGraphNode nodeLayer4 = new LayerLabelGraphNode(graph, SWT.NONE);
		layerLinesGraphNodeList.add(nodeLayer4);
		nodeLayer4.setVisible(false);

		LayerLabelGraphNode nodeLayer5 = new LayerLabelGraphNode(graph, SWT.NONE);
		layerLinesGraphNodeList.add(nodeLayer5);
		nodeLayer5.setVisible(false);

	}

	private Map<Integer, String> layerCaptions;

	private String formatCaption(final String text, final int height) {
		String result = "";
		int heightLeft = height;
		int i = 0;
		int charHeight = 16;
		while ((heightLeft > charHeight) && (i < text.length())) {
			result += text.substring(i, i + 1) + "\n";
			heightLeft -= charHeight;
			i++;
		}
		if ((heightLeft <= charHeight) && (i < text.length())) {
			result += "...";
		}
		return result;
	}

	public void setCaptionsForLayers(final String layerCaption, final int layerIndex) {
		layerCaptions.put(layerIndex, layerCaption);
		GraphNode node = layerLabelGraphNodeList.get(layerIndex);
		String formatedCaption = formatCaption(layerCaption, node.getSize().height);
		node.setText(formatedCaption);
	}

	public void setToolTipsForLayers(final IFigure tooltip, final int layerIndex) {

		GraphNode node = layerLabelGraphNodeList.get(layerIndex);

		node.setTooltip(tooltip);
	}

	private void repairCaptions() {
		for (Entry<Integer, String> entry : layerCaptions.entrySet()) {
			setCaptionsForLayers(entry.getValue(), entry.getKey());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.zest.layouts.algorithms.AbstractLayoutAlgorithm#applyLayoutInternal(org.eclipse
	 * .zest.layouts.dataStructures.InternalNode[],
	 * org.eclipse.zest.layouts.dataStructures.InternalRelationship[], double, double, double,
	 * double)
	 */
	@Override
	protected void applyLayoutInternal(final InternalNode[] entitiesToLayout,
			final InternalRelationship[] relationshipsToConsider, final double boundsX,
			final double boundsY, final double boundsWidth, final double boundsHeight) {
		// create a list with all visible nodes and create the layout with these nodes

		List<AbstractAKMGraphNode> nodes = new ArrayList<AbstractAKMGraphNode>();
		for (InternalNode internalNode : entitiesToLayout) {
			if (internalNode.getLayoutEntity().getGraphData() instanceof AbstractAKMGraphNode) {
				AbstractAKMGraphNode graphNode =
						(AbstractAKMGraphNode) internalNode.getLayoutEntity().getGraphData();
				if (graphNode.isVisible()) {
					nodes.add(graphNode);
				} else {
					((GraphNode) internalNode.getLayoutEntity().getGraphData()).setLocation(0, 0);
				}
			}
		}
		createLayout(nodes);

	}

	/**
	 * create the layout
	 * 
	 * @param nodes
	 *            a List with all GSSElementGraphNodes of the Graph
	 */
	private void createLayout(final List<AbstractAKMGraphNode> nodes) {

		// find the highest sublevel of each level
		sublevelCount = new HashMap<Integer, Integer>();
		for (AbstractAKMGraphNode node : nodes) {
			if (!(sublevelCount.containsKey(node.getLevel()))
					|| ((node.getSubLevel() + 1) > sublevelCount.get(node.getLevel()))) {
				sublevelCount.put(node.getLevel(), node.getSubLevel() + 1);
			}
		}

		// calculates and caches the sum of sublevels of all levels over a level
		totalLevelOffset = new HashMap<Integer, Integer>();
		for (Integer level : sublevelCount.keySet()) {
			int sum = 0;
			for (Entry<Integer, Integer> entrySet : sublevelCount.entrySet()) {
				if (entrySet.getKey() < level) {
					sum += entrySet.getValue();
				}
			}

			totalLevelOffset.put(level, sum);
		}

		// create the GSS level-hierarchy:
		// the hierarchy consists of level with sublevels
		List<List<AbstractAKMGraphNode>> levelList = new ArrayList<List<AbstractAKMGraphNode>>();
		for (int i = 0; i < nodes.size(); i++) {
			int totalLevel =
					totalLevelOffset.get(nodes.get(i).getLevel()) + nodes.get(i).getSubLevel();
			if (levelList.size() <= totalLevel) {
				int requiredLevels = (totalLevel - levelList.size()) + 1;
				for (int j = 0; j < requiredLevels; j++) {
					levelList.add(new ArrayList<AbstractAKMGraphNode>());
				}

				levelList.get(totalLevel).add(nodes.get(i));
			} else {
				levelList.get(totalLevel).add(nodes.get(i));
			}
		}

		highestNumberOfNodes = calcHighestNumberOfNodes(levelList);
		longestX = calcLongestX(levelList);
		longestY = calcLongestY(levelList);
		// align nodes and compute positions:
		adjustLevels(levelList);
		paintLayerCaptions();
	}

	private int calcLongestY(final List<List<AbstractAKMGraphNode>> levels) {
		int longestY = 0;
		for (int k = 0; k < levels.size(); k++) {
			for (int j = 0; j < levels.get(k).size(); j++) {
				if (levels.get(k).get(j).getElementFigureHeight() > longestY) {
					longestY = levels.get(k).get(j).getElementFigureHeight();
				}
			}
		}
		return longestY;
	}

	/**
	 * paints the nodes with the layer captions
	 * 
	 * @param levels
	 *            a level hierarchy
	 */
	private void paintLayerCaptions() {

		for (GraphNode node : layerLabelGraphNodeList) {
			node.setVisible(false);
		}

		for (GraphNode node : layerLinesGraphNodeList) {
			node.setVisible(false);
		}

		for (int i = 0; i < totalLevelOffset.size(); i++) {
			GraphNode captionNode = layerLabelGraphNodeList.get(i);

			captionNode.setVisible(true);

			int height = (sublevelCount.get(i) * (longestY + yOffset)) - 15;
			int width = captionNode.getSize().width;
			captionNode.setSize(width, height);

			int x = 5;
			int y = (totalLevelOffset.get(i) * (longestY + yOffset)) + 5;
			captionNode.setLocation(x, y);
			if (i > 0) {
				// don't draw a line at the top
				GraphNode lineNode = layerLinesGraphNodeList.get(i - 1);
				lineNode.setSize((longestX + xOffset) * highestNumberOfNodes, 1);
				lineNode.setLocation(x, y - 8);
				lineNode.setVisible(true);
			}
		}

		repairCaptions();
	}

	/**
	 * sets the location for each node
	 * 
	 * @param levels
	 *            a level hierarchy
	 */
	private void adjustLevels(final List<List<AbstractAKMGraphNode>> levels) {
		// search for the level with the largest amount of nodes:

		if ((longestX != 0) && (paintListener != null)) {
			graph.removePaintListener(paintListener);
			paintListener = null;
		}

		int lengthOffset = longestX;

		// compute the position of each node:
		for (int i = 0; i < levels.size(); i++) {
			for (int j = 0; j < levels.get(i).size(); j++) {
				int additionalXOffset =
						((highestNumberOfNodes * (lengthOffset + xOffset)) - (levels.get(i).size() * (lengthOffset + xOffset))) / 2;

				int xPos = leftSpace + additionalXOffset + (j * (xOffset + lengthOffset));
				int yPos =
						topSpace
								+ ((totalLevelOffset.get(levels.get(i).get(j).getLevel()) + levels
										.get(i).get(j).getSubLevel()) * (longestY + yOffset));

				levels.get(i).get(j).setLocation(xPos, yPos);
			}
		}
	}

	private int calcHighestNumberOfNodes(final List<List<AbstractAKMGraphNode>> levels) {
		int highestNumberOfNodes = 0;

		for (int i = 0; i < levels.size(); i++) {
			if (levels.get(i).size() > highestNumberOfNodes) {
				highestNumberOfNodes = levels.get(i).size();
			}
		}
		return highestNumberOfNodes;
	}

	// search for the longest node label:
	private int calcLongestX(final List<List<AbstractAKMGraphNode>> levels) {
		int longestX = 0;
		for (int i = 0; i < levels.size(); i++) {
			for (int j = 0; j < levels.get(i).size(); j++) {
				if (levels.get(i).get(j).getElementFigureWidth() > longestX) {
					longestX = levels.get(i).get(j).getElementFigureWidth();
				}
			}
		}
		return longestX;
	}

	@Override
	public void setLayoutArea(final double x, final double y, final double width,
			final double height) {

	}

	@Override
	protected boolean isValidConfiguration(final boolean asynchronous, final boolean continuous) {
		return true;
	}

	@Override
	protected void preLayoutAlgorithm(final InternalNode[] entitiesToLayout,
			final InternalRelationship[] relationshipsToConsider, final double x, final double y,
			final double width, final double height) {
	}

	@Override
	protected void postLayoutAlgorithm(final InternalNode[] entitiesToLayout,
			final InternalRelationship[] relationshipsToConsider) {
	}

	@Override
	protected int getTotalNumberOfLayoutSteps() {
		return 0;
	}

	@Override
	protected int getCurrentLayoutStep() {
		return 0;
	}
}