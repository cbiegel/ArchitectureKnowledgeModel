
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


package org.emftrace.quarc.ui.views;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.part.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.ui.*;
import org.eclipse.swt.SWT;
import org.emftrace.metamodel.QUARCModel.GSS.ConstrainedElement;
import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.metamodel.QUARCModel.Query.SelectedGoalsPriorities;
import org.emftrace.quarc.core.aggregations.AbstractCalculator;
import org.emftrace.quarc.core.aggregations.MaxCalculator;
import org.emftrace.quarc.core.aggregations.MinCalculator;
import org.emftrace.quarc.core.aggregations.AvgCalculator;
import org.emftrace.quarc.core.aggregations.WeightedMaxCalculator;
import org.emftrace.quarc.core.aggregations.WeightedMinCalculator;
import org.emftrace.quarc.core.aggregations.WeightedAvgCalculator;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.cache.GSSLayer;
import org.emftrace.quarc.ui.editors.QUARCModelElementEditor;
import org.emftrace.quarc.ui.editors.formpages.AbstractGSSFormPage;
import org.emftrace.quarc.ui.editors.inputs.ICompareElementsEditorInput;
import org.emftrace.quarc.ui.external.ColumnViewerSorter;
import org.emftrace.quarc.ui.helpers.DefaultColors;
import org.emftrace.quarc.ui.zest.figures.listeners.IExpandListener;
import org.emftrace.quarc.ui.zest.nodes.GSSElementGraphNode;
import org.emftrace.quarc.ui.zestgpraphbuilders.AbstractElementGraphBuilder;
import org.emftrace.quarc.ui.zestgpraphbuilders.GSSQueryResultGraphBuilder;
import org.emftrace.quarc.ui.zestgpraphbuilders.SelectedGoalsGraphBuilder;
import org.emftrace.ui.modelelementopener.EMFTraceModelElementOpener;
import org.emftrace.ui.util.UIHelper;

/**
 * A View for properties
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class PropertiesView extends ViewPart {

	private HashMap<EObject, Boolean> lockedMap;
	private HashMap<Spinner, EObject> spinnersMap;
	private HashMap<Scale, EObject> scalesMap;

	private int lastSelectedTagItemIndex;

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "quarc_gssquerygui.views.PropertiesView";

	/**
	 * The constructor.
	 */
	public PropertiesView() {
		lockedMap = new HashMap<EObject, Boolean>();
		spinnersMap = new HashMap<Spinner, EObject>();
		scalesMap = new HashMap<Scale, EObject>();
		lastSelectedTagItemIndex = 0; // solution instrument <-> goal rating
										// page is selected by default
	}

	private Composite composite;
	private Composite parentComposite;
	private ISelectionListener selectionServiceListener;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets
	 * .Composite)
	 */
	public void createPartControl(Composite parent) {

		parentComposite = new Composite(parent, SWT.NONE);

		GridLayout layout = new GridLayout(1, false);
		parentComposite.setLayout(layout);

		selectionServiceListener = new ISelectionListener() {
			public void selectionChanged(IWorkbenchPart sourcepart,
					ISelection selection) {
				if (sourcepart instanceof QUARCModelElementEditor && ((QUARCModelElementEditor)sourcepart).getModelElement() instanceof QueryResultSet) {

					AbstractElementGraphBuilder builder = ((AbstractGSSFormPage) ((QUARCModelElementEditor) sourcepart)
							.getActivePageInstance()).getBuilder();
					if (builder instanceof GSSQueryResultGraphBuilder) {
						showUIForRatings(builder);
					}
				} else 
					if (sourcepart instanceof QUARCModelElementEditor && ((QUARCModelElementEditor)sourcepart).getModelElement() instanceof SelectedGoalsPriorities) {

					AbstractElementGraphBuilder builder = ((AbstractGSSFormPage) ((QUARCModelElementEditor) sourcepart)
							.getActivePageInstance()).getBuilder();
					if (builder instanceof SelectedGoalsGraphBuilder) {
						showScales((SelectedGoalsGraphBuilder) builder);
					}
				} else {
					if (composite != null) {
						composite.dispose();
					}
				}

			}
		};
		getSite().getWorkbenchWindow().getSelectionService()
				.addSelectionListener(selectionServiceListener);

	}

	/**
	 * show scales for priority selection
	 * 
	 * @param builder
	 *            a SelectedGoalsGraphBuilder
	 */
	protected void showScales(final SelectedGoalsGraphBuilder builder) {

		lockedMap.clear();
		spinnersMap.clear();
		scalesMap.clear();
		if (composite != null)
			composite.dispose();
		parentComposite.setLayout(new FillLayout());
		composite = new Composite(parentComposite, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		// PriorizedElementsCache priorizedElementsCache ;
		if (builder.getSelectedElements().isEmpty()) {
			List<Element> elements = builder.getCacheManager()
					.getRootSelectedGoals();
			for (Element element : elements)
				buildScaleForRoot(element, composite, builder,
						builder.getCacheManager());
			setLockStateForControls();
			// if (builder.getCacheManager().getRootPriorizedGoals().size() ==
			// 1)
		} else {
			Element target = builder.getSelectedElements().get(0);
			List<Element> elements = builder
					.getDirectChildrenOfSelectedElements();
			for (Element source : elements)
				buildScaleForInnerElement((Goal) target, (Goal) source,
						composite, builder, builder.getCacheManager());
			setLockStateForControls();
		}
		composite.layout();
		parentComposite.layout();
	}

	/**
	 * load lock state form cache and set these states to controles
	 */
	private void setLockStateForControls() {
		int notLockedElements = 0;
		for (Entry<EObject, Boolean> entry : lockedMap.entrySet()) {
			if (entry.getValue() == false) // is locked
				notLockedElements++;
		}
		if (notLockedElements == 0) {
			for (Entry<Scale, EObject> entry : scalesMap.entrySet()) {
				entry.getKey().setEnabled(false);
			}
			for (Entry<Spinner, EObject> entry : spinnersMap.entrySet()) {
				entry.getKey().setEnabled(false);
			}
		} else {
			if (notLockedElements == 1) {

				for (Entry<Scale, EObject> entry : scalesMap.entrySet()) {
					entry.getKey().setEnabled(lockedMap.get(entry.getValue()));
				}
				for (Entry<Spinner, EObject> entry : spinnersMap.entrySet()) {
					entry.getKey().setEnabled(lockedMap.get(entry.getValue()));
				}
			} else {
				for (Entry<Scale, EObject> entry : scalesMap.entrySet()) {
					entry.getKey().setEnabled(true);
				}
				for (Entry<Spinner, EObject> entry : spinnersMap.entrySet()) {
					entry.getKey().setEnabled(true);
				}
			}
		}
	}

	protected static String LOCKED_STATE_STRING = "\u00CF";
	protected static String UNLOCKED_STATE_STRING = "\u00D0";
	private static Font lockButtonFont = new Font(Display.getDefault(),
			"Webdings", 12, SWT.NONE);

	/**
	 * show a scale and other controls for priority selection for a root goal
	 * 
	 * @param rootElement
	 *            a Goal
	 * @param parentComposite
	 *            a the parent composite
	 * @param builder
	 *            a SelectedGoalsGraphBuilder
	 * @param cacheManager
	 *            a CacheManager
	 */
	private void buildScaleForRoot(final Element rootElement,
			Composite parentComposite, final SelectedGoalsGraphBuilder builder,
			final CacheManager cacheManager) {

		Composite composite = new Composite(parentComposite, SWT.NONE);
		composite.setLayout(new GridLayout(4, false));
		Label goalNameLabel = new Label(composite, SWT.NONE);
		goalNameLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false,
				false, 1, 1));
		goalNameLabel.setText(rootElement.getName());
		final Label priorityLabel = new Label(composite, SWT.NONE);
		udaptePriorityLabel(priorityLabel, cacheManager, (Goal) rootElement);
		priorityLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true,
				false, 3, 1));

		final Scale scale = new Scale(composite, SWT.NONE);

		scale.setMinimum(0);
		scale.setMaximum(100);
		scale.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		scale.setSelection(cacheManager.getSelectedGoalPriority(
				(Goal) rootElement).intValue());

		final Spinner spinner = new Spinner(composite, SWT.NONE);

		spinner.setMinimum(0);
		spinner.setMaximum(100);
		spinner.setSelection(scale.getSelection());
		spinner.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, false, false,
				1, 1));

		final Button lockButton = new Button(composite, SWT.TOGGLE);
		lockButton.setText(UNLOCKED_STATE_STRING);
		lockButton.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, false,
				false, 1, 1));

		final Button deselectButton = new Button(composite, SWT.TOGGLE);
		deselectButton.setImage(PlatformUI.getWorkbench().getSharedImages()
				.getImage(ISharedImages.IMG_TOOL_DELETE));
		deselectButton.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, false,
				false, 1, 1));
		deselectButton.setSelection(cacheManager
				.goalIsMarkedAsToRemove((Goal) rootElement));
		deselectButton.setSelection(cacheManager
				.goalIsMarkedAsToRemove((Goal) rootElement));
		deselectButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (deselectButton.getSelection()) {
					builder.deselectRootElement((Goal) rootElement);
					scale.setSelection(0);
					spinner.setSelection(0);

					updateRelatedScales(spinner, scale, rootElement,
							spinner.getSelection(), cacheManager, true);
					lockButton.setSelection(true);
					lockButton.setText(LOCKED_STATE_STRING);
					setLockStateForControls();
					spinner.setEnabled(false);
					scale.setEnabled(false);
					lockButton.setEnabled(false);

				} else {
					builder.reselectRootElement((Goal) rootElement);
					spinner.setEnabled(true);
					scale.setEnabled(true);
					lockButton.setEnabled(true);
				}
				udaptePriorityLabel(priorityLabel, cacheManager,
						(Goal) rootElement);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		lockedMap.put(rootElement, false);
		scalesMap.put(scale, rootElement);
		spinnersMap.put(spinner, rootElement);

		scale.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				updateRelatedScales(spinner, scale, rootElement,
						scale.getSelection(), cacheManager, false);
				udaptePriorityLabel(priorityLabel, cacheManager,
						(Goal) rootElement);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		spinner.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
	
				updateRelatedScales(spinner, scale, rootElement,
						spinner.getSelection(), cacheManager, false);
				udaptePriorityLabel(priorityLabel, cacheManager,
						(Goal) rootElement);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		lockButton.setFont(lockButtonFont);
		lockButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (lockButton.getSelection())
					lockButton.setText(LOCKED_STATE_STRING);
				else
					lockButton.setText(UNLOCKED_STATE_STRING);

				lockedMap.put(rootElement, lockButton.getSelection());
				setLockStateForControls();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

	}

	/**
	 * updates the related scales and spinners 
	 *  
	 * @param spinnerthe changed spinner
	 * @param scale the changed scale
	 * @param changedElement the changed goal/principle 
	 * @param newValue the new value
	 * @param cacheManager a CacheManager
	 * @param remove goal/principle should be removed
	 */
	protected void updateRelatedScales(Spinner spinner, Scale scale,
			EObject changedElement, int newValue, CacheManager cacheManager,
			boolean remove) {
		if (remove) {
			lockedMap.put(changedElement, true);
			newValue = 0;
		}

		int old = 0;
		int sumOfNotLocked = 0;
		int numberOfNotLockedElements = 0;
		int diff = 0;
		for (Entry<Scale, EObject> entry : scalesMap.entrySet()) {

			EObject element = entry.getValue();

			if (!element.equals(changedElement)
					&& (!lockedMap.containsKey(element) || lockedMap
							.get(element) == false)) {

				numberOfNotLockedElements++;
				sumOfNotLocked += entry.getKey().getSelection();
			}
		}

		if (changedElement instanceof Element) {
			old = cacheManager.getSelectedGoalPriority((Goal) changedElement)
					.intValue();

			diff = calcMaxAllowedChange(old, newValue, sumOfNotLocked);
			calcMinAllowedChange(old, newValue, sumOfNotLocked);
			cacheManager.setSelecteddGoalPriority((Goal) changedElement, old
					+ diff);

		} else if (changedElement instanceof Decomposition) {
			old = cacheManager
					.getSelectedGoalPriorizedDecompositionWeight(
							(Goal) cacheManager
									.getSourceOfRelation((Decomposition) changedElement),
							(Goal) cacheManager
									.getTargetOfRelation((Decomposition) changedElement));
			diff = calcMaxAllowedChange(old, newValue, sumOfNotLocked);
			cacheManager
					.setSelectedGoalPriorizedDecompositionWeight(
							(Goal) cacheManager
									.getSourceOfRelation((Decomposition) changedElement),
							(Goal) cacheManager
									.getTargetOfRelation((Decomposition) changedElement),
							old + diff);

		}

		if (remove) {
			spinner.setSelection(0);
			scale.setSelection(0);
			spinner.setEnabled(false);
			scale.setEnabled(false);
		} else {
			scale.setSelection(old + diff);
			spinner.setSelection(old + diff);
		}
		
		while (diff != 0){
		int diffForEachNotLockedElement = numberOfNotLockedElements != 0 ? diff
				* -1 / numberOfNotLockedElements : 0;
		int modDiffForEachNotLockedElement = numberOfNotLockedElements != 0 ? diff
				* -1 % numberOfNotLockedElements
				: 0;

		int i = 0;
		for (Entry<Scale, EObject> entry : scalesMap.entrySet()) {
			EObject element = entry.getValue();

			if (!element.equals(changedElement)
					&& (!lockedMap.containsKey(element) || lockedMap
							.get(element) == false)) {
				
				float newValueForElement = 0;
				float oldValue = 0;
				if (element instanceof Element) {
				 oldValue = cacheManager
							.getSelectedGoalPriority((Goal) element);
				} else 
					if (element instanceof Decomposition) {
						
					 oldValue = cacheManager
								.getSelectedGoalPriorizedDecompositionWeight(
										(Goal) cacheManager
												.getSourceOfRelation((Decomposition) element),
										(Goal) cacheManager
												.getTargetOfRelation((Decomposition) element));
					}
					

					if (oldValue == 0 && diff > 0 || oldValue == 100 && diff < 0){
						continue;
					}
					i++;
					newValueForElement = addModulo(i,
					modDiffForEachNotLockedElement, oldValue
										+ diffForEachNotLockedElement);
				
					
					if (newValueForElement < 0){
						newValueForElement = 0 ;
						numberOfNotLockedElements++;
					} else 	if (newValueForElement > 100){
						newValueForElement = 100 ;
						numberOfNotLockedElements++;
					} 
					
					diff += newValueForElement - oldValue;
					
					
					if (element instanceof Element) {
					newValueForElement = addModulo(i,
							modDiffForEachNotLockedElement, oldValue
									+ diffForEachNotLockedElement);
					cacheManager.setSelecteddGoalPriority((Goal) element,
							(int) newValueForElement);
					}else
					if (element instanceof Decomposition) {
					cacheManager
							.setSelectedGoalPriorizedDecompositionWeight(
									(Goal) cacheManager
											.getSourceOfRelation((Decomposition) element),
									(Goal) cacheManager
											.getTargetOfRelation((Decomposition) element),
									(int) newValueForElement);
					}
				
				entry.getKey().setSelection((int) newValueForElement);
			
				for (Entry<Spinner, EObject> mapentry : spinnersMap.entrySet()) {

					if (mapentry.getValue().equals(element)) {

						mapentry.getKey()
								.setSelection((int) newValueForElement);
						break;
					}
				}
			
			}

		}
		if (	remove && scalesMap.entrySet().size() == 1 )
			break;
		}

	}

	/**
	 * calcs the minimal allows change
	 * @param oldValue the old value
	 * @param newValue the new value
	 * @param sumOfNotLocked the sum of locked priorities of locked goals/priniples
	 * @return the minimal allows change
	 */
	private int calcMinAllowedChange(int oldValue, int newValue,
			int sumOfNotLocked) {
		return Math.min(newValue - oldValue, sumOfNotLocked);
	}

	private float addModulo(int count, int modDiffForEachNotLockedElement,
			float newValueForElement) {
		float result = newValueForElement;
		if (modDiffForEachNotLockedElement > 0
				&& count <= modDiffForEachNotLockedElement)
			result++;
		else if (modDiffForEachNotLockedElement < 0
				&& count <= modDiffForEachNotLockedElement * -1)
			result--;
		return result;
	}

	/**
	 * calcs the maximal allows change
	 * @param oldValue the old value
	 * @param newValue the new value
	 * @param sumOfNotLocked the sum of locked priorities of locked goals/priniples
	 * @return the minimal allows change
	 */
	private int calcMaxAllowedChange(int oldValue, int newValue,
			int sumOfNotLocked) {
		int diff = newValue - oldValue;
		if (diff > 0)
			return Math.min(diff, sumOfNotLocked);
		else
			return Math.max(diff, sumOfNotLocked - 100);
	}

	/**
	 * creates scales and spinners for the inner elements / decompositions
	 * @param target the target of a decomposition
	 * @param source the source of a decomposition
	 * @param parentComposite the parent composite
	 * @param builder a SelectedGoalsGraphBuilder
	 * @param cacheManager a CacheManager
	 */
	private void buildScaleForInnerElement(final Goal target,
			final Goal source, Composite parentComposite,
			final SelectedGoalsGraphBuilder builder,
			final CacheManager cacheManager) {

		final Decomposition decomposition = cacheManager
				.getDecompositionBetween(source, target);
		Composite composite = new Composite(parentComposite, SWT.NONE);
		composite.setLayout(new GridLayout(4, false));
		Label goalNameLabel = new Label(composite, SWT.NONE);
		goalNameLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false,
				false, 1, 1));
		goalNameLabel.setText(source.getName());
		final Label priorityLabel = new Label(composite, SWT.NONE);
		udaptePriorityLabel(priorityLabel, cacheManager, source, target);
		priorityLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true,
				false, 3, 1));

		final Scale scale = new Scale(composite, SWT.NONE);

		scale.setMinimum(0);
		scale.setMaximum(100);
		scale.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		scale.setSelection(cacheManager
				.getSelectedGoalPriorizedDecompositionWeight(source, target));

		final Spinner spinner = new Spinner(composite, SWT.NONE);

		spinner.setMinimum(0);
		spinner.setMaximum(100);
		spinner.setSelection(scale.getSelection());
		spinner.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, false, false,
				1, 1));

		final Button lockButton = new Button(composite, SWT.TOGGLE);

		lockButton.setFont(lockButtonFont);
		lockButton.setText(UNLOCKED_STATE_STRING);
		lockButton.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, false,
				false, 1, 1));

		final Button deselectButton = new Button(composite, SWT.TOGGLE);
		deselectButton.setImage(PlatformUI.getWorkbench().getSharedImages()
				.getImage(ISharedImages.IMG_TOOL_DELETE));
			
		deselectButton.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, false,
				false, 1, 1));
		deselectButton.setSelection(cacheManager
				.goalDecompositionIsMarkedAsToRemove(decomposition));
		
		deselectButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (deselectButton.getSelection()) {
					builder.deselectDecomposition(decomposition);
					scale.setSelection(0);
					spinner.setSelection(0);

					updateRelatedScales(spinner, scale, decomposition,
							scale.getSelection(), cacheManager, true);
					lockButton.setSelection(true);
					lockButton.setText(LOCKED_STATE_STRING);
					setLockStateForControls();
					spinner.setEnabled(false);
					scale.setEnabled(false);
					lockButton.setEnabled(false);
				} else {
					builder.reselectDecomposition(decomposition);
					scale.setSelection(cacheManager
							.getSelectedGoalPriorizedDecompositionWeight(cacheManager
									.getSelectedGoalsPriorizedDecomposition(decomposition)));
					spinner.setEnabled(true);
					scale.setEnabled(true);
					lockButton.setEnabled(true);
				}
				udaptePriorityLabel(priorityLabel, cacheManager, source, target);

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		lockedMap
				.put(decomposition, cacheManager
						.goalDecompositionIsMarkedAsToRemove(decomposition));
		scalesMap.put(scale, decomposition);
		spinnersMap.put(spinner, decomposition);

		scale.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				spinner.setSelection(scale.getSelection());
				updateRelatedScales(spinner, scale, decomposition,
						scale.getSelection(), cacheManager, false);
				udaptePriorityLabel(priorityLabel, cacheManager, source, target);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		spinner.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				scale.setSelection(spinner.getSelection());
				updateRelatedScales(spinner, scale, decomposition,
						spinner.getSelection(), cacheManager, false);
				udaptePriorityLabel(priorityLabel, cacheManager, source, target);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		lockButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (lockButton.getSelection())
					lockButton.setText(LOCKED_STATE_STRING);
				else
					lockButton.setText(UNLOCKED_STATE_STRING);
				lockedMap.put(decomposition, lockButton.getSelection());
				setLockStateForControls();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		composite.layout();
		parentComposite.layout();
	}

	/**
	 * update the priority label for an inner element /decomposition
	 * @param priorityLabel the Label
	 * @param cacheManager a CacheManager
	 * @param source the source of the decomposition
	 * @param target the target of the decomposition
	 */
	private void udaptePriorityLabel(Label priorityLabel,
			CacheManager cacheManager, Goal source, Goal target) {

		float totalPriority = cacheManager.getSelectedGoalPriority(source);
		float priorityFromTarget = cacheManager.getSelectedGoalPriority(target)
				* cacheManager.getSelectedGoalPriorizedDecompositionWeight(
						source, target) / 100.0f;

		String targetName = target.getName();
		float priorityFromOther = totalPriority - priorityFromTarget;

		priorityLabel.setText(String.format(
				"total priority: %.2f (%.2f from %s + %.2f from other goals)",
				totalPriority, priorityFromTarget, targetName,
				priorityFromOther));
		priorityLabel.getParent().layout();
	}

	/**
	 * update the priority label for a root element 
	 * @param priorityLabel the Label
	 * @param cacheManager a CacheManager
	 * @param goal a goal
	 */
	private void udaptePriorityLabel(Label priorityLabel,
			CacheManager cacheManager, Goal goal) {

		float totalPriority = cacheManager.getSelectedGoalPriority(goal);
		priorityLabel.setText(String.format("total priority: %.2f",
				totalPriority));
		priorityLabel.getParent().layout();
	}

	/**
	 * build the ui for the visualization of the ratings in a table
	 * @param builder the AbstractElementGraphBuilder of the EditorPart showing the QueryResult
	 */
	protected void showUIForRatings(final AbstractElementGraphBuilder builder) {

		if (composite != null)
			composite.dispose();
		parentComposite.setLayout(new FillLayout());
		composite = new Composite(parentComposite, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));

		Composite groupComposite = new Composite(composite, SWT.NONE);
		groupComposite.setLayout(new GridLayout(3, false));

		Group labelsGroup = new Group(groupComposite, SWT.NONE);
		labelsGroup.setText("show values as:");
		labelsGroup.setLayout(new GridLayout(2, true));
		labelsGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,
				1, 1));
		labelsGroup.setToolTipText("please select a technique used to display rating-values here");

		Group hightlightGroup = new Group(groupComposite, SWT.NONE);
		hightlightGroup.setText("highlight technique:");
		hightlightGroup.setLayout(new GridLayout(2, true));
		hightlightGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		hightlightGroup.setToolTipText("please select a technique used to highlight rating-values here");

		final Button floatvalueCheckbox = new Button(labelsGroup, SWT.RADIO);
		floatvalueCheckbox.setText("numbers");
		floatvalueCheckbox.setSelection(true);
		floatvalueCheckbox.setToolTipText("show values by numbers");
		floatvalueCheckbox.setLayoutData( new GridData(SWT.LEFT, SWT.FILL, false, true));

		final Button symbolsCheckbox = new Button(labelsGroup, SWT.RADIO);
		symbolsCheckbox.setText("+/- symbols");
		symbolsCheckbox.setSelection(false);
		symbolsCheckbox.setToolTipText("show values by +/- symboles");
		symbolsCheckbox.setLayoutData( new GridData(SWT.LEFT, SWT.FILL, false, true));
		
		final Button grlSymbolsCheckbox = new Button(labelsGroup, SWT.RADIO);
		grlSymbolsCheckbox.setText("GRL symbolic");
		grlSymbolsCheckbox.setSelection(false);
		grlSymbolsCheckbox.setToolTipText("show values by the GRL symbolic");
		grlSymbolsCheckbox.setLayoutData( new GridData(SWT.LEFT, SWT.FILL, false, true));

		final Button noneCheckbox = new Button(hightlightGroup, SWT.RADIO);
		noneCheckbox.setText("none");
		noneCheckbox.setSelection(true);
		noneCheckbox.setToolTipText("do not highlight");
		noneCheckbox.setLayoutData( new GridData(SWT.LEFT, SWT.FILL, false, true));
		

		final Button heatmapCheckbox = new Button(hightlightGroup, SWT.RADIO);
		heatmapCheckbox.setText("heatmap");
		heatmapCheckbox.setSelection(false);
		heatmapCheckbox.setToolTipText("use a heatmapt as highlight technique");
		heatmapCheckbox.setLayoutData( new GridData(SWT.LEFT, SWT.FILL, false, true));
		
		
		final Button attributeExplorerCheckbox = new Button(hightlightGroup,
				SWT.RADIO);
		attributeExplorerCheckbox.setText("attribute explorer");
		attributeExplorerCheckbox.setToolTipText("use a attribute explorer as highlight technique here");
		attributeExplorerCheckbox.setLayoutData( new GridData(SWT.LEFT, SWT.FILL, false, true));

		final Group thresholdGroup = new Group(groupComposite, SWT.NONE);
		thresholdGroup.setText("minimal threshold:");
		thresholdGroup.setLayout(new GridLayout(3, false));
		thresholdGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		thresholdGroup.setToolTipText("please select a minimal threshold for the attribute explorer here");

		final Scale thresholdScale = new Scale(thresholdGroup, SWT.NONE);
		thresholdScale.setMinimum(0);
		thresholdScale.setMaximum(200);
		thresholdScale.setSelection(100);
		thresholdScale.setToolTipText("please select a minimal threshold for the attribute explorer here");
		
		
		final Spinner thresholdSpinner = new Spinner(thresholdGroup, SWT.NONE);
		thresholdSpinner.setMinimum(-100);
		thresholdSpinner.setMaximum(100);
		thresholdSpinner.setSelection(0);
		thresholdSpinner.setToolTipText("please select a minimal threshold for the attribute explorer here");

		final Combo thresholdCombo = new Combo(thresholdGroup, SWT.DROP_DOWN);
		thresholdCombo.add("makes");
		thresholdCombo.add("some positive");
		thresholdCombo.add("helps");
		thresholdCombo.add("neutral");
		thresholdCombo.add("hurts");
		thresholdCombo.add("some negative");
		thresholdCombo.add("breaks");
		thresholdCombo.setToolTipText("please select a minimal threshold for the attribute explorer here");

		thresholdCombo.select(3);
		thresholdGroup.setEnabled(false);
		thresholdScale.setEnabled(false);
		thresholdSpinner.setEnabled(false);
		thresholdCombo.setEnabled(false);

		attributeExplorerCheckbox.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				boolean enabled = attributeExplorerCheckbox.getSelection();
				thresholdGroup.setEnabled(enabled);
				thresholdScale.setEnabled(enabled);
				thresholdSpinner.setEnabled(enabled);
				thresholdCombo.setEnabled(enabled);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		thresholdScale.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				thresholdSpinner.setSelection(thresholdScale.getSelection() - 100);
				updateThresholdComboSelection(thresholdSpinner, thresholdCombo);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		thresholdSpinner.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				thresholdScale.setSelection(thresholdSpinner.getSelection() + 100);
				updateThresholdComboSelection(thresholdSpinner, thresholdCombo);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		thresholdCombo.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				switch (thresholdCombo.getSelectionIndex()) {
				case 0:
					thresholdScale.setSelection(176);
					thresholdSpinner.setSelection(76);
					break;
				case 1:
					thresholdScale.setSelection(126);
					thresholdSpinner.setSelection(26);
					break;
				case 2:
					thresholdScale.setSelection(101);
					thresholdSpinner.setSelection(1);
					break;
				case 3:
					thresholdScale.setSelection(100);
					thresholdSpinner.setSelection(0);
					break;
				case 4:
					thresholdScale.setSelection(99);
					thresholdSpinner.setSelection(-1);
					break;
				case 5:
					thresholdScale.setSelection(74);
					thresholdSpinner.setSelection(-26);
					break;
				case 6:
					thresholdScale.setSelection(24);
					thresholdSpinner.setSelection(-76);
					break;

				default:
					break;
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		final TabFolder tabFolder = new TabFolder(composite, SWT.BOTTOM);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,
				1));

		TabItem siTabItem = new TabItem(tabFolder, SWT.NONE);
		siTabItem.setText("Solution Instruments <-> Goals");

		TabItem spTabItem = new TabItem(tabFolder, SWT.NONE);
		spTabItem.setText("Solution Principles <-> Goals");

		TabItem sipTabItem = new TabItem(tabFolder, SWT.NONE);
		sipTabItem.setText("Solution Instruments <-> Solution Principles");

		tabFolder.setSelection(lastSelectedTagItemIndex);

		tabFolder.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				lastSelectedTagItemIndex = tabFolder.getSelectionIndex();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		final TableViewer siTableViewer = new TableViewer(tabFolder, SWT.CHECK);
		createMenu(siTableViewer, builder);

		Table siTable = siTableViewer.getTable();
		siTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		siTable.setLinesVisible(true);
		siTable.setHeaderVisible(true);

		siTabItem.setControl(siTable);

		final TableViewer spTableViewer = new TableViewer(tabFolder, SWT.CHECK);
		createMenu(spTableViewer, builder);

		Table spTable = spTableViewer.getTable();
		spTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		spTable.setLinesVisible(true);
		spTable.setHeaderVisible(true);

		spTabItem.setControl(spTable);

		final TableViewer sipTableViewer = new TableViewer(tabFolder, SWT.CHECK);
		createMenu(sipTableViewer, builder);
		Table sipTable = sipTableViewer.getTable();
		sipTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,
				1));
		sipTable.setLinesVisible(true);
		sipTable.setHeaderVisible(true);

		sipTabItem.setControl(sipTable);

		fillSiTable(siTableViewer, builder, heatmapCheckbox, symbolsCheckbox, grlSymbolsCheckbox,
				attributeExplorerCheckbox, thresholdSpinner, thresholdScale,
				thresholdCombo);
		fillSpTable(spTableViewer, builder, heatmapCheckbox, symbolsCheckbox, grlSymbolsCheckbox,
				attributeExplorerCheckbox, thresholdSpinner, thresholdScale,
				thresholdCombo);
		fillSipTable(sipTableViewer, builder, heatmapCheckbox, symbolsCheckbox, grlSymbolsCheckbox,
				attributeExplorerCheckbox, thresholdSpinner, thresholdScale,
				thresholdCombo);

		composite.layout();
		parentComposite.layout();

	}

	/**
	 * updates the selection of the threshold combo
	 * @param thresholdSpinner the spinner with the current threshold
	 * @param thresholdCombo the threshold combo
	 */
	protected void updateThresholdComboSelection(Spinner thresholdSpinner,
			Combo thresholdCombo) {
		int value = thresholdSpinner.getSelection();
		if (value < -75)
			thresholdCombo.select(6);
		else if (value < -25)
			thresholdCombo.select(5);
		else if (value < 0)
			thresholdCombo.select(4);
		else if (value == 0)
			thresholdCombo.select(3);
		else if (value <= 25)
			thresholdCombo.select(2);
		else if (value <= 75)
			thresholdCombo.select(1);
		else
			thresholdCombo.select(0);

	}

	/**
	 * paint & fill the TableView the rating values of Solution Instruments to Goals
	 * @param tableViewer the TableViewer
	 * @param builder the AbstractElementGraphBuilder
	 * @param heatmapCheckbox the heatmap checkbox
	 * @param symbolsCheckbox the symbols checkbox
	 * @param grlSymbolsCheckbox the GRL symbols checkbox
	 * @param attributeExplorerCheckbox the attribute explorer checkbox
	 * @param thresholdSpinner the threshold Spinner
	 * @param thresholdScale  the threshold Scale 
	 * @param thresholdCombo the threshold Combo
	 */
	private void fillSiTable(final TableViewer tableViewer,
			final AbstractElementGraphBuilder builder,
			final Button heatmapCheckbox, final Button symbolsCheckbox, final Button grlSymbolsCheckbox,
			final Button attributeExplorerCheckbox, final Spinner thresholdSpinner,
			final Scale thresholdScale, final Combo thresholdCombo) {

		fillTable(tableViewer, builder, heatmapCheckbox, symbolsCheckbox, grlSymbolsCheckbox,
				attributeExplorerCheckbox, thresholdSpinner, thresholdScale,
				thresholdCombo, true);

		if (builder.getSelectedElements().isEmpty()) {
			tableViewer.setInput(builder.getCacheManager()
					.getLeafApplicableElementElements(GSSLayer.layer4));
		} else {
			tableViewer.setInput(builder.getMarkedLeafSolutionInstruments());
		}

	}

	/**
	 * paint & fill the TableView the rating values of Priniples to Goals
	 * @param tableViewer the TableViewer
	 * @param builder the AbstractElementGraphBuilder
	 * @param heatmapCheckbox the heatmap checkbox
	 * @param symbolsCheckbox the symbols checkbox
	 * @grlSymbolsCheckbox the GRL symbols checkbox
	 * @param attributeExplorerCheckbox the attribute explorer checkbox
	 * @param thresholdSpinner the threshold Spinner
	 * @param thresholdScale  the threshold Scale 
	 * @param thresholdCombo the threshold Combo
	 */
	private void fillSpTable(final TableViewer tableViewer,
			final AbstractElementGraphBuilder builder,
			final Button heatmapCheckbox, final Button symbolsCheckbox, final Button grlSymbolsCheckbox,
			final Button filterEnabledCheckbox, final Spinner thresholdSpinner,
			final Scale thresholdScale, final Combo thresholdCombo) {
		fillTable(tableViewer, builder, heatmapCheckbox, symbolsCheckbox, grlSymbolsCheckbox, 
				filterEnabledCheckbox, thresholdSpinner, thresholdScale,
				thresholdCombo, true);

		if (builder.getSelectedElements().isEmpty()) {
			tableViewer.setInput(builder.getCacheManager()
					.getLeafApplicableElementElements(GSSLayer.layer3));
		} else {
			tableViewer.setInput(builder.getMarkedLeafPrinciples());
		}

	}

	/**
	 * fills the TableViewer with ratings
	 * @param tableViewer a TableViewer
	 * @param builder the AbstractElementGraphBuilder
	 * @param builder the AbstractElementGraphBuilder
	 * @param heatmapCheckbox the heatmap checkbox
	 * @param symbolsCheckbox the symbols checkbox
	 * @grlSymbolsCheckbox the GRL symbols checkbox
	 * @param attributeExplorerCheckbox the attribute explorer checkbox
	 * @param thresholdSpinner the threshold Spinner
	 * @param thresholdScale  the threshold Scale 
	 * @param thresholdCombo the threshold Combo
	 * @param showRatingsToGoals show Ratings to Goals (true) of Priniplies (false)
	 */
	private void fillTable(final TableViewer tableViewer,
			final AbstractElementGraphBuilder builder,
			final Button heatmapCheckbox, final Button symbolsCheckbox, final Button grlSymbolsCheckbox,
			final Button attributeExplorerCheckbox, final Spinner thresholdSpinner,
			final Scale thresholdScale, final Combo thresholdCombo,
			final boolean showRatingsToGoals) {

	
		TableViewerColumn indexColumn = new TableViewerColumn(tableViewer,
				SWT.NONE);
		TableViewerColumn nameColumn = new TableViewerColumn(tableViewer,
				SWT.NONE);
		indexColumn.getColumn().setText("rank");
		indexColumn.getColumn().setWidth(75);
		indexColumn.getColumn().setToolTipText("the rank of the alternative element");
		nameColumn.getColumn().setText("name");
		nameColumn.getColumn().setWidth(250);
		nameColumn.getColumn().setToolTipText("the name of the alternative element");
				

		heatmapCheckbox.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				tableViewer.refresh();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}

		});
		

		thresholdSpinner.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				tableViewer.refresh();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}

		});

		thresholdScale.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				tableViewer.refresh();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}

		});

		attributeExplorerCheckbox.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				tableViewer.refresh();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}

		});

		thresholdCombo.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				tableViewer.refresh();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}

		});

		symbolsCheckbox.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				tableViewer.refresh();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}

		});
		
		grlSymbolsCheckbox.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				tableViewer.refresh();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}

		});

		nameColumn.setLabelProvider(new CellLabelProvider() {
			public void update(ViewerCell cell) {
				cell.setText(((Element) cell.getElement()).getName());
			}
		});

		indexColumn.setLabelProvider(new CellLabelProvider() {
			public void update(ViewerCell cell) {
				cell.setText(String.valueOf(tableViewer.getTable().indexOf(
						(TableItem) cell.getItem()) + 1)); // +1 due to index
															// starts with 0
			}
		});

		new ColumnViewerSorter(tableViewer, nameColumn) {

			protected int doCompare(Viewer viewer, Object e1, Object e2) {
				return ((Element) e1).getName().compareTo(
						((Element) e2).getName());
			}

		};

		final HashMap<TableColumn, Element> elementColumnMap = new HashMap<TableColumn, Element>();

		/////add an ExpandListener to all nodes
		final IExpandListener expandListener = new IExpandListener() {
			
			@Override
			public void expanded() {
				tableViewer.refresh();
				
			}
			
			@Override
			public void collapsed() {
				tableViewer.refresh();
				
			}
		};
		
		for (Object node : builder.getZestGraph().getNodes()){
			if (node instanceof GSSElementGraphNode){
				((GSSElementGraphNode)node).getElementFigure().addExpandListener(expandListener);
			}
		}
		
		/////remove the ExpandListener after dispose
		tableViewer.getTable().addDisposeListener( new DisposeListener() {
			
			@Override
			public void widgetDisposed(DisposeEvent e) {
				for (Object node : builder.getZestGraph().getNodes()){
					if (node instanceof GSSElementGraphNode){
						((GSSElementGraphNode)node).getElementFigure().removeExpandListener(expandListener);
					}
				}
				
			}
		});
		
		//the content provider
		///show elements of visible nodes only
		tableViewer.setContentProvider( new ArrayContentProvider(){

			@Override
			public Object[] getElements(Object inputElement) {
				@SuppressWarnings("unchecked") 
				//TODO suppresswarning!
				List<Element> inputList = (List<Element>) inputElement;
				List<Element> result = new ArrayList<Element>();
				for (Element e : inputList){
					if (builder.getNodeForElement(e).isVisbile())
						result.add(e);
				}
			Element [] output = new Element[result.size()];
			int i = 0;
			for (Element e : result){
				output[i] = e;
				i++;
			}
			return output;
			}
			
		});

		final List<Element> leafElements = new ArrayList<Element>();
		final List<Element> markedLeafElements = new ArrayList<Element>();
		boolean hasMarkedElements = !builder.getSelectedElements().isEmpty();

		if (showRatingsToGoals) {
			leafElements.addAll(builder.getCacheManager()
					.getLeafApplicableElementElements(GSSLayer.layer1));
			if (hasMarkedElements)
				markedLeafElements.addAll(builder.getMarkedLeafGoals());
		} else {
			leafElements.addAll(builder.getCacheManager()
					.getLeafApplicableElementElements(GSSLayer.layer3));
			if (hasMarkedElements)
				markedLeafElements.addAll(builder.getMarkedLeafPrinciples());

		}

		boolean weightsIncluded = false;
		if (showRatingsToGoals)
			weightsIncluded = !builder.getCacheManager().getSelectedGoals()
					.isEmpty();
		else
			weightsIncluded = !builder.getCacheManager()
					.getSelectedPrinciples().isEmpty();

		for (final Object leafElement : leafElements) {
			// if (leafElement instanceof GSS.Goal) {
			if (weightsIncluded) {
				final TableViewerColumn weightedImpactViewerColumn = new TableViewerColumn(
						tableViewer, SWT.NONE);
				elementColumnMap.put(weightedImpactViewerColumn.getColumn(),
						(Element) leafElement);

				Float priority = null;

				if (leafElement instanceof Goal) {
					priority = builder.getCacheManager()
							.getSelectedGoalPriority((Goal) leafElement);
				} else if (leafElement instanceof Principle) {
					priority = builder.getCacheManager()
							.getSelectedPrinciplePriority(
									(Principle) leafElement);
				}
				if (priority == null)
					priority = 0.0f;

				weightedImpactViewerColumn.getColumn().setText(
						String.format("%s (%.2f)",
								((Element) leafElement).getName(), priority));
				weightedImpactViewerColumn.getColumn().setToolTipText("the weighted rating to "+((Element) leafElement).getName());
				
				weightedImpactViewerColumn.getColumn().setWidth(100);

				weightedImpactViewerColumn.getColumn().setMoveable(true);
				weightedImpactViewerColumn.getColumn().setResizable(true);
				new ColumnViewerSorter(tableViewer, weightedImpactViewerColumn) {

					protected int doCompare(Viewer viewer, Object e1, Object e2) {
						Element element = elementColumnMap.get(tableViewer
								.getTable().getSortColumn());
						Float v1 = calcWeightedImpact(builder, element,
								(Element) e1);
						Float v2 = calcWeightedImpact(builder, element,
								(Element) e2);
						return v1.compareTo(v2);
					}
				};

				weightedImpactViewerColumn
						.setLabelProvider(new CellLabelProvider() {
							public void update(ViewerCell cell) {

								String weightString = calcWeightedImpactString(
										builder,(Element) leafElement,
										(Element) cell.getElement());
								float impact = calcWeightedImpact(builder,
										(Element)leafElement,
										(Element) cell.getElement());

								Color backgroundColor = null;
								Color foregroundColor = null;
								if (symbolsCheckbox.getSelection()) {

									setSymbol(cell, impact);
								} else if (grlSymbolsCheckbox.getSelection()) {
									setGRLSymbol(cell, impact);
								} else {
									cell.setFont(Display.getDefault()
											.getSystemFont());
									cell.setText(weightString);
								}

								if (attributeExplorerCheckbox.getSelection()) {
									if (impact >= thresholdSpinner
											.getSelection()) {
										backgroundColor = new Color(null, 255,
												255, 0);
										foregroundColor = new Color(null, 0, 0,
												0);
									} else {
										backgroundColor = new Color(null, 255,
												255, 255);
										foregroundColor = new Color(null, 0, 0,
												0);
									}
								} else if (heatmapCheckbox.getSelection()) {

									backgroundColor = DefaultColors
											.getBackgroundColor(impact);
									foregroundColor = DefaultColors
											.getForegroundColor(impact);
								} else {

									backgroundColor = new Color(null, 255, 255,
											255);
									foregroundColor = new Color(null, 0, 0, 0);
								}

								cell.setBackground(backgroundColor);
								cell.setForeground(foregroundColor);

							}

						});

			}

			final TableViewerColumn unweightedImpactViewerColumn = new TableViewerColumn(
					tableViewer, SWT.NONE);

			elementColumnMap.put(unweightedImpactViewerColumn.getColumn(),
					(Element) leafElement);

			unweightedImpactViewerColumn.getColumn().setText(
					String.format("%s", ((Element) leafElement).getName()));
			
			unweightedImpactViewerColumn.getColumn().setToolTipText("the rating to "+((Element) leafElement).getName());
			
			unweightedImpactViewerColumn.getColumn().setWidth(100);

			unweightedImpactViewerColumn.getColumn().setMoveable(true);

			unweightedImpactViewerColumn.getColumn().setResizable(true);

			new ColumnViewerSorter(tableViewer, unweightedImpactViewerColumn) {

				protected int doCompare(Viewer viewer, Object e1, Object e2) {
					Element element = elementColumnMap.get(tableViewer
							.getTable().getSortColumn());
					Float v1 = getRating(builder, element, (Element) e1);
					Float v2 = getRating(builder, element, (Element) e2);
					return v1.compareTo(v2);
				}
			};

			unweightedImpactViewerColumn
					.setLabelProvider(new CellLabelProvider() {
						public void update(ViewerCell cell) {

							String weightString = getRatingString(builder,
									(Element)leafElement, (Element) cell.getElement());
							float impact = getRating(builder, (Element)leafElement,
									(Element) cell.getElement());

							Color backgroundColor = null;
							Color foregroundColor = null;
							if (symbolsCheckbox.getSelection()) {

								setSymbol(cell, impact);

							} else if (grlSymbolsCheckbox.getSelection()) {
								setGRLSymbol(cell, impact);
							} else {
								cell.setFont(Display.getDefault()
										.getSystemFont());
								cell.setText(weightString);
							}

							if (attributeExplorerCheckbox.getSelection()) {
								if (impact >= thresholdSpinner.getSelection()) {
									backgroundColor = new Color(null, 255, 255,
											0);
									foregroundColor = new Color(null, 0, 0, 0);
								} else {
									backgroundColor = new Color(null, 255, 255,
											255);
									foregroundColor = new Color(null, 0, 0, 0);
								}
							} else if (heatmapCheckbox.getSelection()) {

								backgroundColor = DefaultColors
										.getBackgroundColor(impact);
								foregroundColor = DefaultColors
										.getForegroundColor(impact);

							} else {

								backgroundColor = new Color(null, 255, 255, 255);
								foregroundColor = new Color(null, 0, 0, 0);
							}

							cell.setBackground(backgroundColor);
							cell.setForeground(foregroundColor);

						}

					});

			// }
		}

		setCalculators(leafElements, builder, tableViewer, symbolsCheckbox, grlSymbolsCheckbox,
				heatmapCheckbox, attributeExplorerCheckbox, thresholdSpinner,
				weightsIncluded, "[global]", "of all seleted goals");

		if (hasMarkedElements)
			setCalculators(markedLeafElements, builder, tableViewer,
					symbolsCheckbox, grlSymbolsCheckbox, heatmapCheckbox, attributeExplorerCheckbox,
					thresholdSpinner, weightsIncluded, "[selection]", "of the currently selection of the seleted goals only");

	}

	/**
	 * writes the GRL symbol of a rating value to the ViewerCell
	 * @param cell a ViewerCell
	 * @param weight the rating value
	 */
	protected void setGRLSymbol(ViewerCell cell, Float weight) {

			if (weight == null) {
				cell.setText("neutral");
			} else if (weight < -75.0f) {
				cell.setText("breaks");
			} else if (weight < -25.0f) {
				cell.setText("some negative");
			} else if (weight < 0.0f) {
				cell.setText("hurt");
			} else if (weight == 0.0f) {
				cell.setText("");
			} else if (weight <= 25.0f) {
				cell.setText("helps");
			} else if (weight <= 75.0f) {
				cell.setText("some positive");
			} else {
				cell.setText("makes");
			}
		
	}

	/**
	 * paint & fill the TableView the rating values of Solution Instruments to Priniples
	 * @param tableViewer the TableViewer
	 * @param builder the AbstractElementGraphBuilder
	 * @param heatmapCheckbox the heatmap checkbox
	 * @param symbolsCheckbox the symbols checkbox
	 * @grlSymbolsCheckbox the GRL symbols checkbox
	 * @param attributeExplorerCheckbox the attribute explorer checkbox
	 * @param thresholdSpinner the threshold Spinner
	 * @param thresholdScale  the threshold Scale 
	 * @param thresholdCombo the threshold Combo
	 */
	private void fillSipTable(final TableViewer tableViewer,
			final AbstractElementGraphBuilder builder,
			final Button heatmapCheckbox, final Button symbolsCheckbox, final Button grlSymbolsCheckbox,
			final Button filterEnabledCheckbox, final Spinner thresholdSpinner,
			final Scale thresholdScale, final Combo thresholdCombo) {

		fillTable(tableViewer, builder, heatmapCheckbox, symbolsCheckbox, grlSymbolsCheckbox,
				filterEnabledCheckbox, thresholdSpinner, thresholdScale,
				thresholdCombo, false);

		if (builder.getSelectedElements().isEmpty()) {
			tableViewer.setInput(builder.getCacheManager()
					.getLeafApplicableElementElements(GSSLayer.layer4));
		} else {
			tableViewer.setInput(builder.getMarkedLeafSolutionInstruments());
		}

	}

	private void setCalculators(List<Element> leafElements,
			AbstractElementGraphBuilder builder, final TableViewer tableViewer,
			final Button symbolsCheckbox, final Button grlSymbolsCheckbox, final Button heatmapCheckbox,
			final Button filterEnabledCheckbox, final Spinner thresholdSpinner,
			boolean weightsIncluded, String decoratorString,  String tooltipDecoratorString) {
		HashMap<String, AbstractCalculator> calculators = new HashMap<String, AbstractCalculator>();
		decoratorString = " " + decoratorString;
		final HashMap<TableColumn, AbstractCalculator> calculatorsColumnMap = new HashMap<TableColumn, AbstractCalculator>();
		calculators.put("max", new MaxCalculator(
				leafElements, builder.getCacheManager()));
		calculators.put("min", new MinCalculator(
				leafElements, builder.getCacheManager()));
		calculators.put("avg", new AvgCalculator(
				leafElements, builder.getCacheManager()));
		if (weightsIncluded) {
			calculators.put(
					"weighted max",
					new WeightedMaxCalculator(leafElements, builder
							.getCacheManager()));
			calculators.put(
					"weighted min",
					new WeightedMinCalculator(leafElements, builder
							.getCacheManager()));
			calculators.put(
					"weighted avg",
					new WeightedAvgCalculator(leafElements, builder
							.getCacheManager()));
		}
		for (Entry<String, AbstractCalculator> entry : calculators.entrySet()) {
			final AbstractCalculator calculator = entry.getValue();
			String caption = entry.getKey();
			final TableViewerColumn viewerColumn = new TableViewerColumn(
					tableViewer, SWT.NONE);
			TableColumn tableColumn = viewerColumn.getColumn();
			calculatorsColumnMap.put(tableColumn, calculator);
			tableColumn.setText(caption + decoratorString);
			tableColumn.setToolTipText(caption + " " +tooltipDecoratorString);
			tableColumn.setWidth(100);

			tableColumn.setMoveable(true);
			tableColumn.setResizable(true);

			viewerColumn.setLabelProvider(new CellLabelProvider() {
				public void update(ViewerCell cell) {

					Float weight = calculator
							.calcAggregation((ConstrainedElement) cell
									.getElement());

					setCellTooltip(cell, weight);
					if (symbolsCheckbox.getSelection()) {
						setSymbol(cell, weight);
					} else if (grlSymbolsCheckbox.getSelection()) {
						setGRLSymbol(cell, weight);
					} else {
						String texString = calculator
								.calcAggregationAsString((ConstrainedElement) cell
										.getElement());
						cell.setFont(Display.getDefault().getSystemFont());
						cell.setText(texString);
					}
					Color backgroundColor = null;
					Color foregroundColor = null;

					if (filterEnabledCheckbox.getSelection()) {
						if (weight >= thresholdSpinner.getSelection()) {
							backgroundColor = new Color(null, 255, 255, 0);
							foregroundColor = new Color(null, 0, 0, 0);
						} else {
							backgroundColor = new Color(null, 255, 255, 255);
							foregroundColor = new Color(null, 0, 0, 0);
						}
					} else if (heatmapCheckbox.getSelection()) {

						backgroundColor = DefaultColors
								.getBackgroundColor(weight);
						foregroundColor = DefaultColors
								.getForegroundColor(weight);

					} else {

						backgroundColor = new Color(null, 255, 255, 255);
						foregroundColor = new Color(null, 0, 0, 0);
					}
					cell.setBackground(backgroundColor);

					cell.setForeground(foregroundColor);
				}
			});

			new ColumnViewerSorter(tableViewer, viewerColumn) {

				protected int doCompare(Viewer viewer, Object e1, Object e2) {
					AbstractCalculator calculator = calculatorsColumnMap
							.get(tableViewer.getTable().getSortColumn());

					Float v1 = calculator
							.calcAggregation((ConstrainedElement) e1);
					Float v2 = calculator
							.calcAggregation((ConstrainedElement) e2);
					return v1.compareTo(v2);
				}

			};
		}

	}

	protected void setCellTooltip(ViewerCell cell, Float weight) {
		
		
	}

	/**
	 * writes the symbol of a rating value to the ViewerCell
	 * @param cell a ViewerCell
	 * @param weight the rating value
	 */
	protected void setSymbol(ViewerCell cell, Float weight) {

		if (weight == null) {
			cell.setText( "" );
		} else if (weight < -75.0f) {
			cell.setText("- - -");
		} else if (weight < -25.0f) {
			cell.setText(" - - ");
		} else if (weight < 0.0f) {
			cell.setText("  -  ");
		} else if (weight == 0.0f) {
			cell.setText("");
		} else if (weight <= 25.0f) {
			cell.setText("  +  ");
		} else if (weight <= 75.0f) {
			cell.setText(" + + ");
		} else {
			cell.setText("+ + +");
		}
	}

	/**
	 * create the default Menu for the TableViewer
	 * 
	 * @param tableViewer the TableViewer
	 * @param builder the AbstractElementGraphBuilder
	 */
	private void createMenu(final TableViewer tableViewer,
			final AbstractElementGraphBuilder builder) {

		org.eclipse.swt.widgets.Menu menu = new org.eclipse.swt.widgets.Menu(
				composite);
		tableViewer.getTable().setMenu(menu);

		MenuItem compareSelectedItemsMenuItem = new MenuItem(menu, SWT.NONE);
		compareSelectedItemsMenuItem.setText("compare selected elements");
		MenuItem openEditorForSelectedItemsMenuItem = new MenuItem(menu,
				SWT.NONE);
		openEditorForSelectedItemsMenuItem.setText("open with editor");
		MenuItem selectAllMenuItem = new MenuItem(menu, SWT.NONE);
		selectAllMenuItem.setText("select all");
		MenuItem deselectAllMenuItem = new MenuItem(menu, SWT.NONE);
		deselectAllMenuItem.setText("deselect all");
		MenuItem swapSelectionMenuItem = new MenuItem(menu, SWT.NONE);
		swapSelectionMenuItem.setText("swap selection");


		compareSelectedItemsMenuItem
				.addSelectionListener(new SelectionListener() {

					@Override
					public void widgetSelected(SelectionEvent e) {
						List<Element> checkedElements = getCheckedElements(tableViewer);
						IWorkbenchPage workbenchPage = getSite().getPage();
						ICompareElementsEditorInput editorInput = new ICompareElementsEditorInput(
								checkedElements, builder.getCacheManager()
										.getAccessLayer(), builder
										.getCacheManager());
						try {
							workbenchPage.openEditor(editorInput,
									 UIHelper.QUARC_ELEMENTS_COMPARE_EDITOR_ID);
						} catch (PartInitException partInitException) {
							partInitException.printStackTrace();
						}
					}

					@Override
					public void widgetDefaultSelected(SelectionEvent e) {
					}
				});

		openEditorForSelectedItemsMenuItem
				.addSelectionListener(new SelectionListener() {

					@Override
					public void widgetSelected(SelectionEvent e) {
						List<Element> checkedElements = getCheckedElements(tableViewer);
						for (Element element : checkedElements)
							// ModelOpenHelper.openModel(element);
							EMFTraceModelElementOpener.open(element);
					}

					@Override
					public void widgetDefaultSelected(SelectionEvent e) {
					}
				});

		selectAllMenuItem.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				for (TableItem item : tableViewer.getTable().getItems())
					item.setChecked(true);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		deselectAllMenuItem.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				for (TableItem item : tableViewer.getTable().getItems())
					item.setChecked(false);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		swapSelectionMenuItem.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				for (TableItem item : tableViewer.getTable().getItems())
					item.setChecked(!item.getChecked());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

	}

	/**
	 * @param tableViewer a TableViewer
	 * @return the selected Element of the TableViewer
	 */
	protected Element getSelectedElement(TableViewer tableViewer) {
		Element result = null;

		if (tableViewer.getTable().getSelectionIndex() != -1)
			result = (Element) tableViewer.getElementAt(tableViewer.getTable()
					.getSelectionIndex());
		return result;
	}

	/**
	 * @param tableViewer a TableViewer
	 * @return a List with all checked Elements of the TableViewer
	 */
	protected List<Element> getCheckedElements(TableViewer tableViewer) {
		List<Element> result = new ArrayList<Element>();
		for (int index = 0; index < tableViewer.getTable().getItems().length; index++) {
			TableItem item = tableViewer.getTable().getItem(index);
			if (item.getChecked()) {
				result.add((Element) tableViewer.getElementAt(index));

			}

		}
		return result;
	}

	/**
	 * calcs & formats the weighted rating value
	 * @param builder the AbstractElementGraphBuilder
	 * @param leafElement a leaf Element (Gaol or Principle)
	 * @param element the rated Element
	 * @return the formated weighted rating value
	 */
	protected String calcWeightedImpactString(
			AbstractElementGraphBuilder builder, EObject leafElement,
			Element element) {
		return String.format("%.2f",
				calcWeightedImpact(builder, leafElement, element));
	}

	/**
	 * calcs the weighted rating value
	 * @param builder the AbstractElementGraphBuilder
	 * @param leafElement a leaf Element (Gaol or Principle)
	 * @param element the rated Element
	 * @return the weighted rating value
	 */
	protected float calcWeightedImpact(AbstractElementGraphBuilder builder,
			EObject leafElement, Element element) {
		Float ratingWeight = builder.getCacheManager().getIndirectRatingWeight(
				(ConstrainedElement) element, (Element) leafElement);
		Float priority = null;
		if (leafElement instanceof Goal) {
			priority = builder.getCacheManager().getSelectedGoalPriority(
					(Goal) leafElement);
		}
		if (ratingWeight == null)
			ratingWeight = 0f;
		if (priority == null)
			priority = 0f;
		float weightedImpact = ratingWeight * priority /100.0f;
		return weightedImpact;
	}

	/**
	 * 
	 * @param builder a AbstractElementGraphBuilder
	 * @param leafElement a leaf Element (Gaol or Principle)
	 * @param element a Element
	 * @return gets the rating between the two specified Elements from cache
	 */
	protected float getRating(AbstractElementGraphBuilder builder,
			EObject leafElement, Element element) {
		Float ratingWeight = builder.getCacheManager().getIndirectRatingWeight(
				(ConstrainedElement) element, (Element) leafElement);
		if (ratingWeight == null)
			ratingWeight = 0f;
		return ratingWeight;
	}

	/**
	 * 
	 * @param builder a AbstractElementGraphBuilder
	 * @param leafElement a leaf Element (Gaol or Principle)
	 * @param element a Element
	 * @return gets the formated rating between the two specified Elements from cache
	 */
	protected String getRatingString(AbstractElementGraphBuilder builder,
			EObject leafGoal, Element element) {
		return String.format("%.2f", getRating(builder, leafGoal, element));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		parentComposite.setFocus();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		getSite().getWorkbenchWindow().getSelectionService()
				.removeSelectionListener(selectionServiceListener);
		super.dispose();
	}
}