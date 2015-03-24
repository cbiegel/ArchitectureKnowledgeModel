package org.emftrace.akm.ui.services;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;

/**
 * This class contains services for UI components.
 * 
 * @author Christopher Biegel
 */
public class UIComponentsService {

	// ===========================================================
	// Methods
	// ===========================================================

	/**
	 * Creates an IFigure object for a Tooltip for the specified text
	 * 
	 * @param pText
	 *            The text to be displayed on the tooltip
	 * @return The created IFigure containing the given text
	 */
	public static IFigure createTooltipFigure(final String pText) {

		Figure tooltipFigure = new Figure();

		ToolbarLayout layout = new ToolbarLayout();
		tooltipFigure.setLayoutManager(layout);
		tooltipFigure.setOpaque(true);

		org.eclipse.draw2d.Label label = new org.eclipse.draw2d.Label(pText);
		label.setFont(new Font(null, "Arial", 10, SWT.NORMAL));
		tooltipFigure.add(label);

		tooltipFigure.setSize(-1, -1);

		return tooltipFigure;
	}
}
