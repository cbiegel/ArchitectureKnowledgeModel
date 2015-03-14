package org.emftrace.akm.ui.editors.formpages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.emftrace.akm.ui.zestgraphbuilders.FeaturesExplorationGraphBuilder;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel;

public class ArchitectureKnowledgeModelElementFormPage extends AbstractAKMFormPage {

	public ArchitectureKnowledgeModelElementFormPage(final FormEditor editor, final String id,
			final String title, final EObject modelElement) {
		super(editor, id, title, modelElement);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.forms.editor.FormPage#createFormContent(org.eclipse.ui
	 * .forms.IManagedForm)
	 */
	@Override
	protected void createFormContent(final IManagedForm managedForm) {
		super.createFormContent(managedForm);
		managedFormComposite = managedForm.getForm().getBody();
		managedFormComposite.setLayout(new FillLayout()); // set any Layout
		builder = new FeaturesExplorationGraphBuilder(managedFormComposite, SWT.NONE, getSite(), (ArchitectureKnowledgeModel)modelElement, accessLayer);
		builder.build();
	}

}