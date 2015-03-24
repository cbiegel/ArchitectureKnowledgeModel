package org.emftrace.akm.ui.zest.figures;

import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.Label;
import org.emftrace.akm.ui.zest.nodes.ASTAGraphNode;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.Benefit;

/**
 * A Figure used for {@link ASTAGraphNode}s.
 * 
 * @author Christopher Biegel
 * 
 */
public class BenefitsFigure extends AbstractASTAFigure {

	// ===========================================================
	// Constructors
	// ===========================================================

	/**
	 * The constructor
	 * 
	 * @param pBenefitsList
	 *            A list of all {@link Benefit} elements of this figure
	 */
	public BenefitsFigure(final List<Benefit> pBenefitsList) {
		super();

		Label titleLabel = getTitleLabel();
		mBorderFigure.add(titleLabel);
		addBenefits(pBenefitsList);
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public Label getTitleLabel() {
		// Added 2 whitespaces in order to make the title the same length as "Drawbacks"
		Label titleLabel = new Label("Benefits  ");
		titleLabel.setFont(DEFAULT_FONT_TITLE);
		GridData layoutData = new GridData(GridData.CENTER);
		mGridLayout.setConstraint(titleLabel, layoutData);
		return titleLabel;
	}

	@Override
	public String getTitle() {
		return "Benefits";
	}

	// ===========================================================
	// Methods
	// ===========================================================

	/**
	 * Adds a list of {@link Benefit}s to this figure.<br>
	 * All {@link Benefit} elements in this list will be added to this figure
	 * 
	 * @param pBenefitsList
	 *            The list of Benefits to add to this figure.
	 */
	private void addBenefits(final List<Benefit> pBenefitsList) {

		for (Benefit benefit : pBenefitsList) {
			Label benefitLabel = new Label(benefit.getName());
			benefitLabel.setFont(DEFAULT_FONT);
			GridData layoutData = new GridData(GridData.BEGINNING);
			mGridLayout.setConstraint(benefitLabel, layoutData);

			mContentsList.add(benefitLabel);
			mASTAMap.put(benefitLabel, benefit);
			mLabelMap.put(benefit.getName(), benefitLabel);

			mBorderFigure.add(benefitLabel);
		}
	}
}
