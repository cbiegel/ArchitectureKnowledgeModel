package org.emftrace.akm.ui.editors;

import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormPage;
import org.emftrace.akm.ui.editors.formpages.ArchitectureKnowledgeModelElementFormPage;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel;
import org.emftrace.ui.editors.ModelElementEditor;
import org.emftrace.ui.util.UIHelper;

/**
 * Model Editor class.<br>
 * This class is registered as one of EMFTrace's editors.
 * 
 * @author Christopher Biegel
 * 
 */
public class ArchitectureKnowledgeModelEditor extends ModelElementEditor {

	// ===========================================================
	// Constants
	// ===========================================================

	/**
	 * The ID of this editor that is used to register this editor with EMFTrace.
	 */
	public static final String PAGE_ID = UIHelper.AKM_EDITOR;
	// ===========================================================
	// Fields
	// ===========================================================

	/**
	 * Title of the view this editor uses
	 */
	private final String sDefaultPageName = "Features Exploration View";

	/**
	 * The FormPage of this editor
	 */
	private FormPage mPage;

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	protected void addPages() {

		// Determine the page type
		if (modelElement instanceof ArchitectureKnowledgeModel) {
			mPage =
					new ArchitectureKnowledgeModelElementFormPage(this, PAGE_ID, sDefaultPageName,
							modelElement);
		}

		// Add the page
		try {
			addPage(mPage);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setFocus() {
		super.setFocus();
		mPage.setFocus();
	}
}
