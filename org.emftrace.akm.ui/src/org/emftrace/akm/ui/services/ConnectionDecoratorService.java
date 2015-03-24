package org.emftrace.akm.ui.services;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelBase;

/**
 * This class is used to decorade GraphConnections (e.g. with a TooltipFigure).<br>
 * This class originates from the QUARC project and was modified for the AKM project.
 * 
 * @author Christopher Biegel
 * 
 */
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

		pConnection.setTooltip(createTooltipFigure(pConnection, pSourceElement, pTargetElement));
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

		String relationType = "Connection";

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
}
