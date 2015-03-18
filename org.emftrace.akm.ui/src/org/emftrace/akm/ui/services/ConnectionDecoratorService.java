package org.emftrace.akm.ui.services;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelBase;

public class ConnectionDecoratorService {

	// ===========================================================
	// Constants
	// ===========================================================

	// Constants for various font sizes
	private static final Font DECORATION_FONT_TINY = new Font(null, "Arial", 6, SWT.NONE);
	private static final Font DECORATION_FONT_SMALL = new Font(null, "Arial", 8, SWT.NONE);
	private static final Font DECORATION_FONT_NORMAL = new Font(null, "Arial", 10, SWT.BOLD);
	private static final Font DECORATION_FONT_LARGE = new Font(null, "Arial", 12, SWT.BOLD);

	// ===========================================================
	// Methods
	// ===========================================================

	/**
	 * Decorates the specified GraphConnection in style of URN and adds a tooltip for the AKM
	 * elements
	 * 
	 * @param pConnection
	 *            The GraphConnection object to decorate
	 * @param pSourceElement
	 *            The source element of the connection
	 * @param pTargetElement
	 *            The target element of the connection
	 */
	public static void decoradeConnection(final GraphConnection pConnection,
			final ArchitectureKnowledgeModelBase pSourceElement,
			final ArchitectureKnowledgeModelBase pTargetElement) {

		pConnection.setLineColor(ColorConstants.black);
		pConnection.setLineWidth(1);

		// decorateWithWeight(pConnection, "");

		// TODO CB: Tooltip entfernen? (Wird er überhaupt benötigt?)
		pConnection.setTooltip(createTooltipFigure(pConnection, pSourceElement, pTargetElement));
	}

	/**
	 * decorates the GraphConnection with the following figure:<br>
	 * <br>
	 * ?<br>
	 * <br>
	 * see Rec. ITU-T Z.151 (11/2008) page 27<br>
	 * <br>
	 * 
	 * @param connection
	 *            a GraphConnection
	 */
	private static void decorateWithWeight(final GraphConnection connection, final String weight) {

		ConnectionEndpointLocator relationshipLocator =
				new ConnectionEndpointLocator(connection.getConnectionFigure(), true);
		relationshipLocator.setUDistance(0);
		relationshipLocator.setVDistance(10);

		Figure decoractionFigure = new Figure();

		ToolbarLayout layout = new ToolbarLayout();
		decoractionFigure.setLayoutManager(layout);
		decoractionFigure.setOpaque(false);

		Label weightLabel = new Label(weight);
		weightLabel.setFont(DECORATION_FONT_SMALL);
		decoractionFigure.add(weightLabel);

		decoractionFigure.setSize(-1, -1);
		((PolylineConnection) connection.getConnectionFigure()).add(decoractionFigure,
				relationshipLocator);

	}

	/**
	 * Create a Figure for a tooltip for the connection of GraphNodes
	 * 
	 * @param pConnection
	 *            The GraphConnection object to decorate
	 * @param pSourceElement
	 *            The source element of the connection
	 * @param pTargetElement
	 *            The target element of the connection
	 * @return The created tooltip Figure
	 */
	private static IFigure createTooltipFigure(final GraphConnection pConnection,
			final ArchitectureKnowledgeModelBase pSourceElement,
			final ArchitectureKnowledgeModelBase pTargetElement) {

		Figure tooltipFigure = new Figure();

		ToolbarLayout layout = new ToolbarLayout();
		tooltipFigure.setLayoutManager(layout);
		tooltipFigure.setOpaque(true);

		String relationType = "has";
		// TODO CB Andere relationTypes? (z.B. für B&D-View)

		String sourceName = pSourceElement != null ? pSourceElement.getName() : "";
		String targetName = pTargetElement != null ? pTargetElement.getName() : "";

		String tooltipText = "";
		// 3 free spaces before and behind each line start and line end due to aesthetic reasons
		// (prevent text to border on tooltip bounds)
		tooltipText += "\n";
		tooltipText += "   Source:\t" + sourceName + "   \n";
		tooltipText += "   Target:\t" + targetName + "   \n";

		Label titleLabel = new Label("   " + relationType + "   ");
		titleLabel.setFont(DECORATION_FONT_LARGE);

		tooltipFigure.add(titleLabel);

		Label valuesLabel = new Label(tooltipText);
		valuesLabel.setFont(DECORATION_FONT_NORMAL);
		tooltipFigure.add(valuesLabel);
		tooltipFigure.setSize(-1, -1);

		return tooltipFigure;
	}

	/**
	 * decorates the GraphConnection with the following figure:<br>
	 * <br>
	 * â—�<br>
	 * +<br>
	 * <br>
	 * see Rec. ITU-T Z.151 (11/2008) page 27<br>
	 * <br>
	 * 
	 * @param pConnection
	 *            a GraphConnection
	 */
	private static void decorateWithMakeFigure(final GraphConnection pConnection) {

		ConnectionEndpointLocator relationshipLocator =
				new ConnectionEndpointLocator(pConnection.getConnectionFigure(), true);
		relationshipLocator.setUDistance(10);
		relationshipLocator.setVDistance(10);

		Figure decoractionFigure = new Figure();

		ToolbarLayout layout = new ToolbarLayout();
		decoractionFigure.setLayoutManager(layout);
		decoractionFigure.setOpaque(false);

		Label upperHelpLabel = new Label("\u25CF"); // = "â—�"
		upperHelpLabel.setFont(DECORATION_FONT_SMALL);
		decoractionFigure.add(upperHelpLabel);

		Label lowerHelpLabel = new Label("+");
		lowerHelpLabel.setFont(DECORATION_FONT_LARGE);
		decoractionFigure.add(lowerHelpLabel);

		decoractionFigure.setSize(-1, -1);
		((PolylineConnection) pConnection.getConnectionFigure()).add(decoractionFigure,
				relationshipLocator);
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
