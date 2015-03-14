package org.emftrace.akm.ui.editors.formpages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.emftrace.akm.ui.zestgraphbuilders.AbstractElementGraphBuilder;
import org.emftrace.core.accesslayer.AccessLayer;

/**
 * the used FormPage to build a Graph
 * 
 * @author Daniel Motschmann
 * 
 */
public abstract class AbstractAKMFormPage extends FormPage {

	/**
	 * the ModelElement form the Input
	 */
	protected EObject modelElement;

	/**
	 * the AccessLayer
	 */
	protected AccessLayer accessLayer;

	/**
	 * the Composite of the ManagedForm
	 */
	protected Composite managedFormComposite;

	/**
	 * the builder for the controls
	 */
	protected AbstractElementGraphBuilder builder;

	/**
	 * the constructor for GSSQueryFormPage
	 * 
	 * @param editor
	 *            the parent FormEditor
	 * @param id
	 *            the page id
	 * @param title
	 *            the page title
	 * @param modelElement
	 *            a ModelElement
	 */
	public AbstractAKMFormPage(final FormEditor editor, final String id, final String title,
			final EObject modelElement) {
		super(editor, id, title);
		this.modelElement = modelElement;
		this.accessLayer = new AccessLayer(false);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.forms.editor.FormPage#setFocus()
	 */
	@Override
	public void setFocus() {
		super.setFocus();
		managedFormComposite.setFocus();
		managedFormComposite.getChildren()[0].setFocus();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.forms.editor.FormPage#dispose()
	 */
	@Override
	public void dispose() {
		// dispose listener etc. here

		if (builder != null) {
			builder.dispose();
		}
		super.dispose();
	}

	public AbstractElementGraphBuilder getBuilder() {
		return builder;
	}

}
