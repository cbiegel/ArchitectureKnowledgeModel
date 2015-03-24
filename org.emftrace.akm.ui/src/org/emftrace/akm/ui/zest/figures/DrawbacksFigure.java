package org.emftrace.akm.ui.zest.figures;

import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.Label;
import org.emftrace.akm.ui.zest.nodes.ASTAGraphNode;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.Drawback;

/**
 * A Figure used for {@link ASTAGraphNode}s.
 * 
 * @author Christopher Biegel
 * 
 */
public class DrawbacksFigure extends AbstractASTAFigure {

	// ===========================================================
	// Constructors
	// ===========================================================

	public DrawbacksFigure(final List<Drawback> pDrawbacksList) {
		super();

		Label titleLabel = getTitleLabel();
		mBorderFigure.add(titleLabel);
		addDrawbacks(pDrawbacksList);
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public Label getTitleLabel() {
		Label titleLabel = new Label("Drawbacks");
		titleLabel.setFont(DEFAULT_FONT_TITLE);
		GridData layoutData = new GridData(GridData.CENTER);
		mGridLayout.setConstraint(titleLabel, layoutData);
		return titleLabel;
	}

	@Override
	public String getTitle() {
		return "Drawbacks";
	}

	// ===========================================================
	// Methods
	// ===========================================================

	/**
	 * Adds a list of {@link Drawback}s to this figure.<br>
	 * All {@link Drawback} elements in this list will be added to this figure
	 * 
	 * @param pDrawbacksList
	 *            The list of Drawbacks to add to this figure.
	 */
	private void addDrawbacks(final List<Drawback> pDrawbacksList) {

		for (Drawback drawback : pDrawbacksList) {
			Label drawbackLabel = new Label(drawback.getName());
			drawbackLabel.setFont(DEFAULT_FONT);
			GridData layoutData = new GridData(GridData.BEGINNING);
			mGridLayout.setConstraint(drawbackLabel, layoutData);

			mContentsList.add(drawbackLabel);
			mASTAMap.put(drawbackLabel, drawback);
			mLabelMap.put(drawback.getName(), drawbackLabel);

			mBorderFigure.add(drawbackLabel);
		}
	}
}
