/*******************************************************************************
 * Copyright (c) 2010-2012 Software Systems/Process Informatics Group,
 * Ilmenau University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor: Daniel Motschmann
 ******************************************************************************/ 

package org.emftrace.quarc.ui.wizards.pages;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Semaphore;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.emftrace.metamodel.QUARCModel.Constraints.BooleanTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage;
import org.emftrace.metamodel.QUARCModel.Constraints.EnumTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.FloatTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.IntegerTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.NumericalTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.RegularExpressionTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.StringTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalPropertiesCatalogue;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalPropertyCategory;
import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;
import org.emftrace.quarc.core.conditions.ExcludeEObjectCondition;
import org.emftrace.quarc.core.conditions.NGramCheckCondition;
import org.emftrace.quarc.core.conditions.NGramCheckEObjectCondition;
import org.emftrace.quarc.core.helpers.ConstraintValueValidator;
import org.emftrace.ui.controls.FilteredContentProviderResultItem;
import org.emftrace.ui.controls.ResultItemViewText;




/**
 * A WizardPage for the creation of a new Constraint
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class SelectPropertyWizardPage extends WizardPage {

	private final Color invalidBackgroundColor = new Color(null, 255, 182, 193);  //light pink
	private Text filterText;
	private Tree propertyTree;
	private TechnicalPropertiesCatalogue cataloguge;
	private Map<TreeItem, TechnicalProperty> propertyMap;
	private Map<TechnicalProperty, TreeItem> itemMap;
	private Thread searchPropertiesThread;
	private Semaphore threadLock;

	private Combo valueCombo;
	private Label unitLabel;
	private Scale nScale;
	private Scale minCorrelationScale;
	private Spinner minCorrelationSpinner;
	private Spinner nSpinner;
	private Button stopButton;
	private Button refreshButton;
	private HashMap<EObject, HashMap<String, HashMap<String, Integer>>> matchesMap;
	private AssignedConstraintsSet assignedConstraintedSet;
	private ResultItemViewText descriptionText;
	private Map<TechnicalProperty, FilteredContentProviderResultItem> filteredContentProviderResultItemMap;
	private Label progressLabel;
	private ProgressBar progressBar;

	/**
	 * the constructor
	 * 
	 * @param pageName the page name
	 * @param cataloguge a TechnicalPropertiesCatalogue
	 * @param assignedConstraintedSet an AssignedConstraintsSet
	 */
	public SelectPropertyWizardPage(String pageName,
			TechnicalPropertiesCatalogue cataloguge,
			AssignedConstraintsSet assignedConstraintedSet) {
		super(pageName);
	    setTitle("Create new constraint wizard");
        setMessage("Please select a technical property and a value for the new constraint");
		this.cataloguge = cataloguge;
		this.propertyMap = new HashMap<TreeItem, TechnicalProperty>();
		this.threadLock = new Semaphore(1, true);
		this.assignedConstraintedSet = assignedConstraintedSet;
		this.matchesMap = new HashMap<EObject, HashMap<String, HashMap<String, Integer>>>();
		this.filteredContentProviderResultItemMap = new HashMap<TechnicalProperty, FilteredContentProviderResultItem>();
		this.itemMap = new HashMap<TechnicalProperty, TreeItem>();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));

		addSearchHeader(composite);

		addSlidersForNGram(composite);

		Label resultLabel = new Label(composite, SWT.NONE);
		resultLabel.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false,
				false, 1, 1));
		resultLabel.setText("found technical properties:");

		Label descriptionLabel = new Label(composite, SWT.NONE);
		descriptionLabel.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false,
				false, 1, 1));
		descriptionLabel.setText("description:");

		propertyTree = new Tree(composite, SWT.BORDER);
		GridData gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		propertyTree.setLayoutData(gridData);
		final TreeColumn propertyColumn = new TreeColumn(propertyTree, SWT.NONE);
		propertyColumn.setText("property");
		propertyColumn.setWidth(300);
		final TreeColumn aliasColumn = new TreeColumn(propertyTree, SWT.NONE);
		aliasColumn.setText("alias");
		aliasColumn.setWidth(200);
		propertyTree.setHeaderVisible(true);
		
		propertyTree.setToolTipText("possible technical properties for the constraint");

		descriptionText = new ResultItemViewText(composite, SWT.BORDER | SWT.MULTI);
		gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		descriptionText.setLayoutData(gridData);
		descriptionText.setToolTipText("the decription of the selected technical property");


		setControl(composite);

		final SelectPropertyWizardPage thisWizardPage = this;
		propertyTree.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				TechnicalProperty selectedProperty = thisWizardPage
						.getSelectedProperty();

				if (selectedProperty != null)
					descriptionText
							.setItemToDisplay(filteredContentProviderResultItemMap
									.get(selectedProperty));
				else
					descriptionText.setItemToDisplay(null);

				valueCombo.setText("");
				valueCombo.removeAll();
				valueCombo.setEnabled(selectedProperty != null
						&& !(selectedProperty instanceof TechnicalPropertyCategory));


				unitLabel.setText("");
				if (selectedProperty != null){
					if (selectedProperty instanceof EnumTechnicalProperty) {

						for (String possibleValue : ((EnumTechnicalProperty) selectedProperty)
								.getPossibleValues()) {
							valueCombo.add(possibleValue);
						}
						valueCombo.select(0);
					} else if (selectedProperty instanceof StringTechnicalProperty) {

					} else if (selectedProperty instanceof FloatTechnicalProperty
							|| selectedProperty instanceof IntegerTechnicalProperty) {

						String unitStr = ((NumericalTechnicalProperty) selectedProperty)
								.getUnit();
						if (unitStr == null)
							unitStr = "";
						unitLabel.setText(unitStr);
						
						
						String unitDescriptionStr = ((NumericalTechnicalProperty) selectedProperty)
								.getUnitDescription();
						if (unitDescriptionStr == null)
							unitLabel.setToolTipText("no description avalible");
						else 
							unitLabel.setToolTipText(unitDescriptionStr);
					} else if (selectedProperty instanceof BooleanTechnicalProperty) {

						valueCombo.add("true");
						valueCombo.add("false");
						valueCombo.select(0);

					} else if (selectedProperty instanceof RegularExpressionTechnicalProperty) {

					}else if (selectedProperty instanceof TechnicalPropertyCategory) {
						setErrorMessage("please select a technical property");
					}}
					else
				getWizard().getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		Composite valueComposite = new Composite(composite, SWT.NONE);
		valueComposite.setLayout( new GridLayout(2, false));
		valueComposite.setLayoutData( new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		Label valueLabel = new Label(valueComposite, SWT.NONE);
		valueLabel.setText("value");

		gridData = new GridData();
		gridData.horizontalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		valueLabel.setLayoutData(gridData);

		valueCombo = new Combo(composite, SWT.BORDER | SWT.DROP_DOWN);
		valueCombo.setToolTipText("please enter here a value for the technical property");
		gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		valueCombo.setLayoutData(gridData);
		valueCombo.setEnabled(false);

		valueCombo.addVerifyListener(new VerifyListener() {

			@Override
			public void verifyText(VerifyEvent e) {
				String text = valueCombo.getText(); // calculate new text
				text = text.substring(0, e.start) + e.text
						+ text.substring(e.end, text.length());
	
				String errorMessage = ConstraintValueValidator.validateValue(text,  getSelectedProperty());
				setErrorMessage(errorMessage);
				if (errorMessage!= null){
					valueCombo.setBackground(invalidBackgroundColor);
					valueCombo.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
				}
				else {
					valueCombo.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
					valueCombo.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_BLACK));
				}
				getWizard().getContainer().updateButtons();
			}
		});

		unitLabel = new Label(composite, SWT.NONE);
		setControl(composite);
		gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.grabExcessHorizontalSpace = false;
		unitLabel.setLayoutData(gridData);
		unitLabel.setText("");
		unitLabel.setToolTipText("the expected unit for the value");

		progressLabel = new Label(composite, SWT.NONE);
		progressLabel.setText("progress:");

		progressBar = new ProgressBar(composite, SWT.INDETERMINATE);
		gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.horizontalAlignment = SWT.FILL;
		progressBar.setLayoutData(gridData);
		progressBar.setToolTipText("the current progress of the search");
		searchProperties(null, getN(), getMinCorrelation(), cataloguge, assignedConstraintedSet);
		getContainer().updateButtons();
	}

	/**
	 * shows or hides the progressbar
	 * @param isVisible true = show; false = hide
	 */
	protected void setProgressBarVisbile(final boolean isVisible){
		Display.getDefault().syncExec( new Runnable() {
			
			@Override
			public void run() {
				progressLabel.setVisible(isVisible);
				progressBar.setVisible(isVisible);
				if (isVisible)
					progressBar.setState(SWT.NORMAL);
				else
					progressBar.setState(SWT.PAUSED);	
			}
		});
	}

	/**
	 * @param property a TechnicalProperty
	 * @return a List with all matches
	 */
	protected List<String> getMatches(TechnicalProperty property) {
		List<String> result = new ArrayList<String>();
		if (matchesMap.get(property) != null)
			result.addAll(matchesMap.get(property).keySet());
		return result;
	}

	/**
	 * creates the header
	 * @return the selected filter word
	 */
	protected String getFilterWord() {
		return filterText.getText() != ""? filterText.getText() : null;
	}

	/**
	 * creates the header
	 * @param parent the parent composite
	 */
	private void addSearchHeader(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData( new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));

		composite.setLayout(new GridLayout(4, false));
		Label filterLabel = new Label(composite, SWT.NONE);
		filterLabel.setText("filter");

		GridData gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.horizontalAlignment = SWT.LEFT;
		gridData.grabExcessHorizontalSpace = false;
		filterLabel.setLayoutData(gridData);

		filterText = new Text(composite, SWT.BORDER);
		gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		filterText.setLayoutData(gridData);
		
		filterText.setToolTipText("please enter here a filter term");

		refreshButton = new Button(composite, SWT.NONE);
		refreshButton.setText("refresh");
		refreshButton.setToolTipText("restart the search");

		refreshButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				searchProperties(getFilterWord(), getN(), getMinCorrelation(),  cataloguge,
						assignedConstraintedSet);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.horizontalAlignment = SWT.LEFT;
		gridData.grabExcessHorizontalSpace = false;
		refreshButton.setLayoutData(gridData);

		stopButton = new Button(composite, SWT.NONE);
		stopButton.setText("stop");
		stopButton.setToolTipText("stop the search");

		stopButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (searchPropertiesThread != null) {
					searchPropertiesThread.interrupt();
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.horizontalAlignment = SWT.LEFT;
		gridData.grabExcessHorizontalSpace = false;
		stopButton.setLayoutData(gridData);

		filterText.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {
				searchProperties(getFilterWord(), getN(), getMinCorrelation(),  cataloguge,
						assignedConstraintedSet);

			}

			@Override
			public void keyPressed(KeyEvent e) {
			}
		});

	}

	/**
	 * adds the Sliders for the NGram parameters
	 * @param parent the parent composite
	 */
	private void addSlidersForNGram(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);

		composite.setLayoutData( new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));

		composite.setLayout(new GridLayout(4, false));
		Label nCaptionLabel = new Label(composite, SWT.NONE);
		nCaptionLabel.setText("n");
		GridData gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.horizontalAlignment = SWT.LEFT;
		gridData.grabExcessHorizontalSpace = false;
		nCaptionLabel.setLayoutData(gridData);

		nScale = new Scale(composite, SWT.NONE);
		nScale.setMaximum(10);
		nScale.setMinimum(2);
		nScale.setIncrement(1);
		nScale.setPageIncrement(1);
		nScale.setSelection(3);
		gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = false;
		nScale.setLayoutData(gridData);
		nScale.setToolTipText("select here the number of calculated subpatterns used for the NGram similarity check");

		nSpinner = new Spinner(composite, SWT.NONE);
		nSpinner.setMinimum(nScale.getMinimum());
		nSpinner.setMaximum(nScale.getMaximum());
		nSpinner.setSelection(nScale.getSelection());
		gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.horizontalAlignment = SWT.LEFT;
		gridData.grabExcessHorizontalSpace = false;
		nSpinner.setLayoutData(gridData);
		nSpinner.setToolTipText(nScale.getToolTipText());
		nSpinner.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				nScale.setSelection(nSpinner.getSelection());
				if (getFilterWord() != null && getFilterWord() != "")
					searchProperties(getFilterWord(), getN(), getMinCorrelation(),  cataloguge,
							assignedConstraintedSet);

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		nScale.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				nSpinner.setSelection(nScale.getSelection());
				if (getFilterWord() != null && getFilterWord() != "")
					searchProperties(getFilterWord(), getN(), getMinCorrelation(),  cataloguge,
							assignedConstraintedSet);

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		new Label(composite, SWT.NONE); //dummy

		Label minCorrelationCaptionLabel = new Label(composite, SWT.NONE);

		minCorrelationCaptionLabel.setText("min correlation");
		gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.horizontalAlignment = SWT.LEFT;
		gridData.grabExcessHorizontalSpace = false;
		minCorrelationCaptionLabel.setLayoutData(gridData);

		minCorrelationScale = new Scale(composite, SWT.NONE);
		minCorrelationScale.setMaximum(100);
		minCorrelationScale.setMinimum(0);
		minCorrelationScale.setSelection(80);

		gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		minCorrelationScale.setLayoutData(gridData);
		minCorrelationScale.setToolTipText("select here the minimal correlation used for the NGram similarity check");

		minCorrelationSpinner = new Spinner(composite, SWT.NONE);
		minCorrelationSpinner.setMaximum(minCorrelationScale.getMaximum());
		minCorrelationSpinner.setMinimum(minCorrelationScale.getMinimum());
		minCorrelationSpinner.setSelection(minCorrelationScale.getSelection());
		minCorrelationSpinner.setToolTipText(minCorrelationScale.getToolTipText());
		gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.horizontalAlignment = SWT.LEFT;
		gridData.grabExcessHorizontalSpace = false;
		minCorrelationSpinner.setLayoutData(gridData);

		Label percentLabel = new Label(composite, SWT.NONE);
		percentLabel.setText("%");
		gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.horizontalAlignment = SWT.LEFT;
		gridData.grabExcessHorizontalSpace = false;
		percentLabel.setLayoutData(gridData);

		minCorrelationScale.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				minCorrelationSpinner.setSelection(minCorrelationScale
						.getSelection());
				searchProperties(getFilterWord(), getN(), getMinCorrelation(),  cataloguge,
						assignedConstraintedSet);

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		minCorrelationSpinner.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				minCorrelationScale.setSelection(minCorrelationSpinner
						.getSelection());
				searchProperties(getFilterWord(), getN(), getMinCorrelation(), cataloguge,
						assignedConstraintedSet);

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

	}

	/**
	 * merges the Hits of the 1st map with the 2nd map into the 1st map
	 * @param sourceMap the map with all old hits
	 * @param mapWitNewEntries the map with all new hits
	 */
	protected void mergeHits(
			HashMap<EObject, HashMap<String, HashMap<String, Integer>>> sourceMap,
			HashMap<EObject, HashMap<String, HashMap<String, Integer>>> mapWitNewEntries) {

		for (Entry<EObject, HashMap<String, HashMap<String, Integer>>> entry : mapWitNewEntries
				.entrySet()) {
			EObject property = entry.getKey();
			HashMap<String, HashMap<String, Integer>> newHitsMap = entry
					.getValue();
			if (sourceMap.containsKey(property)) {
				// put all new hits with merging
				for (Entry<String, HashMap<String, Integer>> matchedWordsEntry : newHitsMap
						.entrySet()) {
					String eAttributeName = matchedWordsEntry.getKey();
					HashMap<String, Integer> macthedWordsWithNumberMap = matchedWordsEntry
							.getValue();
					if (sourceMap.get(property).containsKey(eAttributeName)) {

						for (Entry<String, Integer> matchedWord : matchedWordsEntry
								.getValue().entrySet()) {

							if (sourceMap.get(property).get(eAttributeName)
									.containsKey(matchedWord.getKey())) {
								sourceMap
										.get(property)
										.get(eAttributeName)
										.put(matchedWord.getKey(),
												matchedWord.getValue()
														+ sourceMap
																.get(property)
																.get(eAttributeName)
																.get(matchedWord
																		.getKey()));
							} else {
								sourceMap
										.get(property)
										.get(eAttributeName)
										.put(matchedWord.getKey(),
												matchedWord.getValue());

							}
						}
					} else {
						sourceMap.get(property).put(eAttributeName,
								macthedWordsWithNumberMap);
					}
				}

			} else {
				// put all new hits without merging
				sourceMap.put(property, newHitsMap);
			}

		}

	}

	/**
	 * searches Technical Properties matching the filter
	 * 
	 * @param filter a text used as filter
	 * @param n the number of sub patterns for nGram Check
	 * @param minCorrelation the min correlation for nGram Check
	 * @param cataloguge a TechnicalPropertiesCatalogue
	 * @param assignedConstraintsSet a AssignedConstraintsSet
	 */
	private void searchProperties(final String filter, final int n, final float minCorrelation,
			final TechnicalPropertiesCatalogue cataloguge,
			final AssignedConstraintsSet assignedConstraintsSet) {

		if (searchPropertiesThread != null) {
			searchPropertiesThread.interrupt();
		}

		searchPropertiesThread = new Thread(new Runnable() {

			public void run() {
				setStopButtonEnable(true);
				setRefreshButtonEnable(false);
				setProgressBarVisbile(true);

				threadLock.acquireUninterruptibly(); // wait until other thread
														// is dead
				try {
					matchesMap.clear();

					clearTree();
					showPendingItem();

					NGramCheckCondition nGramCheckCondition = new NGramCheckCondition(
							n, filter, minCorrelation, true, true);

					NGramCheckEObjectCondition condition1 = new NGramCheckEObjectCondition(
							ConstraintsPackage.eINSTANCE.getTechnicalProperty_Name(),
							nGramCheckCondition, cataloguge);

					NGramCheckEObjectCondition condition2 = new NGramCheckEObjectCondition(
							ConstraintsPackage.eINSTANCE
									.getTechnicalProperty_Description(),
							nGramCheckCondition, cataloguge);

					NGramCheckEObjectCondition condition3 = new NGramCheckEObjectCondition(
							ConstraintsPackage.eINSTANCE
									.getTechnicalProperty_Alias(),
							nGramCheckCondition, cataloguge);

					List<EObject> exclude = new ArrayList<EObject>();
					for (Constraint assignedConstraint : assignedConstraintedSet
							.getAssignedConstraints())
						exclude.add(assignedConstraint.getTechnicalProperty());

					EObjectCondition condition0 = new ExcludeEObjectCondition(
							exclude);

					SELECT statement = new SELECT(new FROM(cataloguge
							.getCatalogueProperties()), new WHERE(condition0
							.AND(condition1.OR(condition2.OR(condition3)))));
					for (Object object : statement.execute()) {
						addTreeItem((TechnicalProperty) object);

					}

					matchesMap.putAll(condition1.getHits());
					mergeHits(matchesMap, condition2.getHits());
					mergeHits(matchesMap, condition3.getHits());

					filteredContentProviderResultItemMap.clear();

					for (Entry<EObject, HashMap<String, HashMap<String, Integer>>> entry : matchesMap
							.entrySet()) {
						filteredContentProviderResultItemMap.put(
								(TechnicalProperty) entry.getKey(),
								FilteredContentProviderResultItemInterface
										.createFilteredContentProviderResultItem(
												entry.getKey(),
												entry.getValue()));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

				removePending();
				decoradeTreeItemsWithSize();
				setStopButtonEnable(false);
				setRefreshButtonEnable(true);
				setProgressBarVisbile(false);
				threadLock.release(); // release lock

			}

		});

		searchPropertiesThread.run();

	}

	/**
	 * @return the number of sub patterns  selected by the user
	 */
	protected int getN() {
		return nSpinner.getSelection();
	}

	/**
	 * @return the min correlation selected by the user
	 */
	protected float getMinCorrelation() {
		return minCorrelationSpinner.getSelection() / 100.0f;
	}

	private TreeItem pendingItem;

	/**
	 * shows the pending... message
	 */
	protected void showPendingItem() {

		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				pendingItem = new TreeItem(propertyTree, SWT.NONE, 0);
				pendingItem.setText(0, "pending...");
			}
		});
	}
	
	/**
	 * removes the pending... message
	 */
	protected void removePending() {
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				if (propertyTree.isDisposed())
					return; // return if dialog is closed already

				if (pendingItem != null) {
					// propertyTable.removeAll();
					pendingItem.dispose();
					pendingItem = null;

				}
			}
		});

	}

	/**
	 * creates a TreeItem for the specified TechnicalProperty
	 * @param property the new TechnicalProperty
	 */
	protected void addTreeItem(final TechnicalProperty property) {

		if (itemMap.containsKey(property))
			return;

		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				if (propertyTree.isDisposed())
					return; // return if dialog is closed already
				try {
					TreeItem parentItem = buildOrGetParentTreeItems(property);
					;
					removePending();
					int index = 0;
					String name = property.getName();
					if (name == null)
						name = "unnamed property";
					TreeItem newItem;
					if (parentItem == null) {
						for (TreeItem item : propertyTree.getItems()) {
							if (item.getText().compareTo(name) > 0)
								break;
							index++;
						}
						newItem = new TreeItem(propertyTree, SWT.NONE, index);

					} else {

						for (TreeItem item : parentItem.getItems()) {
							if (item.getText() != null
									&& item.getText().compareTo(name) > 0)
								break;
							index++;

						}
						newItem = new TreeItem(parentItem, SWT.NONE, index);

					}

					String aliasString = property.getAlias() == null
							|| property.getAlias().size() == 0 ? "[]"
							: property.getAlias().toString();
					newItem.setText(0, name);
					newItem.setText(1, aliasString);
					addItemToCache(newItem, property);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * puts the specified pair of TreeItem TechnicalProperty into the cache
	 * @param newItem the TreeItem for the new TechnicalProperty
	 * @param property the new TechnicalProperty
	 */
	protected void addItemToCache(TreeItem newItem, TechnicalProperty property) {
		propertyMap.put(newItem, property);
		itemMap.put(property, newItem);
	}

	
	/**
	 * creates or get the parent TreeItem for a new TechnicalProperty
	 * @param property the new TechnicalProperty
	 * @return the existing or new created parent TreeItem
	 */
	private TreeItem buildOrGetParentTreeItems(TechnicalProperty property) {

		EObject containment = (property.eContainer());


		if (containment instanceof TechnicalPropertiesCatalogue) {

			return null;

		} else {
			if (itemMap.containsKey(containment)) {
				System.out.println("containsKey containment" + containment
						+ " / " + itemMap.get(containment));
				return itemMap.get(containment);
			}
			System.out.println("containment instanceof PropertyItem");

			TreeItem containmentTreeItem = buildOrGetParentTreeItems((TechnicalProperty) containment);
			TreeItem newItem;
			String name = ((TechnicalProperty) containment).getName();
			int index = 0;
			if (containmentTreeItem != null) {

				for (TreeItem item : containmentTreeItem.getItems()) {
					if (item.getText().compareTo(name) > 0)
						break;
					index++;
				}
				newItem = new TreeItem(containmentTreeItem, SWT.NONE, index);
			} else {
				for (TreeItem item : propertyTree.getItems()) {
					if (item.getText().compareTo(name) > 0)
						break;
					index++;
				}
				newItem = new TreeItem(propertyTree, SWT.NONE, index);
			}

			newItem.setText(0, name);
			addItemToCache(newItem, (TechnicalProperty) containment);
			return newItem;

		}
	}

	/**
	 * clears the Tree and all Maps by using the UI thread
	 */
	protected void clearTree() {

		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				if (propertyTree.isDisposed())
					return; // return if dialog is closed already
				descriptionText.setItemToDisplay(null);
				propertyTree.removeAll();
				propertyMap.clear();
				itemMap.clear();
				matchesMap.clear();

				valueCombo.setEnabled(false);
				filteredContentProviderResultItemMap.clear();

				getWizard().getContainer().updateButtons();
			}
		});

	}

	/**
	 * Decorates each TreeItem having children with the number of children by using the UI thread
	 */
	protected void decoradeTreeItemsWithSize() {

		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				if (propertyTree.isDisposed())
					return; // return if dialog is closed already

				for (Entry<TechnicalProperty, TreeItem> entry : itemMap.entrySet()) {
					TechnicalProperty property = entry.getKey();

						if (!property.getEntries().isEmpty()) {	//	if (property instanceof TechnicalPropertyCategory) {
						TreeItem treeItem = entry.getValue();
						int size = calcSizeOfAllChildren(treeItem);
						treeItem.setText(0, treeItem.getText(0) + " (" + size
								+ ")");
					}
				}
			}
		});

	}

	/**
	 * calculates the number of all children (direct and indirect once) for the specified TreeItem
	 * @param treeItem a TreeItem
	 * @return the calculated number of children
	 */
	protected int calcSizeOfAllChildren(TreeItem treeItem) {
		int childrenCount = 0;

		for (TreeItem directChild : treeItem.getItems()) {
			TechnicalProperty subProperty = propertyMap.get(directChild);
			childrenCount += calcSizeOfAllChildren(directChild);
			if (subProperty instanceof TechnicalPropertyCategory) {
			//	childrenCount += calcSizeOfAllChildren(directChild);
			} else {
				childrenCount++;
			}
		}
		return childrenCount;

	}

	/**
	 * enables or disables the stop button by using the UI thread
	 * @param enabled the new enabled state
	 * 
	 */
	protected void setStopButtonEnable(final boolean enabled) {

		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				stopButton.setEnabled(enabled);
			}
		});

	}

	/**
	 * enables or disables the refresh button by using the UI thread
	 * @param enabled the new enabled state
	 * 
	 */
	protected void setRefreshButtonEnable(final boolean enabled) {

		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				refreshButton.setEnabled(enabled);
			}
		});

	}
	
	/**
	 * @return the TechnicalProperty for the constraint selected by the user 
	 */
	public TechnicalProperty getSelectedProperty() {
		if (propertyTree == null) return null;
		return propertyTree.getSelection().length == 0 ? null : propertyMap
				.get(propertyTree.getSelection()[0]);
	}


	/**
	 * @return the value for the constraint entered by the user 
	 */
	public String getValue() {
		return valueCombo.getText();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.WizardPage#canFlipToNextPage()
	 */
	@Override
	public boolean canFlipToNextPage() {
		return false;
	}
}
