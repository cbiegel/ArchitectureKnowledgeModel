package org.emftrace.akm.ui.zest.figures;

import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.Label;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.Benefit;

public class BenefitsFigure extends AbstractASTAFigure {

	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================
	public BenefitsFigure(final List<Benefit> pBenefitsList) {

		super();

		Label titleLabel = getTitleLabel();

		mBorderFigure.add(titleLabel);

		addBenefits(pBenefitsList);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

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

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
