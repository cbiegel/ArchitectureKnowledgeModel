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

import java.text.NumberFormat;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.QUARCModel.GSS.ConstrainedElement;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Goal;
import org.emftrace.metamodel.QUARCModel.GSS.Principle;
import org.emftrace.metamodel.QUARCModel.Query.PrioritizedElement;
import org.emftrace.metamodel.QUARCModel.Query.SelectedGoalsPriorities;
import org.emftrace.quarc.core.cache.CacheManager;
import org.emftrace.quarc.core.cache.GSSLayer;
import org.emftrace.quarc.core.cache.ICacheChangedListener;
import org.emftrace.quarc.ui.editors.CompareElementsEditor;
import org.emftrace.quarc.ui.editors.QUARCModelElementEditor;
import org.emftrace.quarc.ui.editors.formpages.AbstractGSSFormPage;
import org.emftrace.quarc.ui.zestgpraphbuilders.AbstractElementGraphBuilder;
import org.emftrace.quarc.ui.zestgpraphbuilders.SelectedGoalsGraphBuilder;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.experimental.chart.swt.ChartComposite;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.RectangleEdge;
import org.jfree.util.Rotation;


/**
 * A View for diagrammers
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class RatioView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "quarc_gssquerygui.views.RatioView";
	private Composite parentComposite;


	/**
	 * the constructor
	 */
	public RatioView() {

	}


	private Composite composite;
	private ISelectionListener selectionServiceListener;

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {

		parent.setLayout(new FillLayout());

		parentComposite = new Composite(parent, SWT.NONE);
		parentComposite.setLayout(new FillLayout());

		selectionServiceListener = new ISelectionListener() {
			public void selectionChanged(IWorkbenchPart sourcepart,
					ISelection selection) {
				
				if (sourcepart instanceof QUARCModelElementEditor && ((QUARCModelElementEditor)sourcepart).getModelElement() instanceof SelectedGoalsPriorities) {

					AbstractElementGraphBuilder builder = ((AbstractGSSFormPage) ((QUARCModelElementEditor) sourcepart)
							.getActivePageInstance()).getBuilder();
					if (builder instanceof SelectedGoalsGraphBuilder)
						showChart((SelectedGoalsGraphBuilder) builder);

				} else if (sourcepart instanceof CompareElementsEditor) {

					showSpiderChartForElementsToCompare((CompareElementsEditor) sourcepart);
				}

				else {
					if (composite != null)
						composite.dispose();
				}

			}

		};

		getSite().getWorkbenchWindow().getSelectionService()
				.addSelectionListener(selectionServiceListener);
	}

	/**
	 * shows a SpiderChart for the CompareElementsEditorPart
	 * @param sourcepart a CompareElementsEditorPart
	 */
	protected void showSpiderChartForElementsToCompare(
			CompareElementsEditor sourcepart) {

		if ((!parentComposite.isDisposed() && (composite == null || composite
				.isDisposed()))) {
			composite = new Composite(parentComposite, SWT.NONE);
			composite.setLayout(new FillLayout());

			final TabFolder tabFolder = new TabFolder(composite, SWT.BOTTOM);
			tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
					true, 1, 1));
			tabFolder.setLayout(new FillLayout());

			TabItem gTabItem = new TabItem(tabFolder, SWT.NONE);
			gTabItem.setText("ratings to goals");

			TabItem pTabItem = new TabItem(tabFolder, SWT.NONE);
			pTabItem.setText("ratings to principles/flaws");

			gTabItem.setControl(buildSpiderChartForRatings(sourcepart,
					tabFolder, true, false));
			pTabItem.setControl(buildSpiderChartForRatings(sourcepart,
					tabFolder, false, false));

			if (!sourcepart.getCacheManager().getSelectedGoals().isEmpty()) {
				TabItem wgTabItem = new TabItem(tabFolder, SWT.NONE);
				wgTabItem.setText("weighted ratings to goals");
				wgTabItem.setControl(buildSpiderChartForRatings(sourcepart,
						tabFolder, true, true));
			}
			if (!sourcepart.getCacheManager().getSelectedPrinciples().isEmpty()) {
				TabItem wpTabItem = new TabItem(tabFolder, SWT.NONE);
				wpTabItem.setText("weighted ratings to principles/flaws");

				wpTabItem.setControl(buildSpiderChartForRatings(sourcepart,
						tabFolder, false, true));
			}

			composite.layout();
			parentComposite.layout();
		}

	}

	/**
	 * @param sourcepart
	 *            a CompareElementsEditorPart
	 * @param parent
	 *            the parent Composite
	 * @param showGoalRatings
	 *            true == show ratings to goals; false == show ratings to
	 *            principles
	 * @param weighted
	 *            show weighted ratings
	 * @return a composite with the created chart
	 */
	protected Composite buildSpiderChartForRatings(
			CompareElementsEditor sourcepart, Composite parent,
			boolean showGoalRatings, boolean weighted) {

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new FillLayout());
		final DefaultCategoryDataset dataset = createSpiderDataset(
				sourcepart.getElements(), sourcepart.getAccessLayer(),
				sourcepart.getCacheManager(), showGoalRatings, weighted);
		JFreeChart chart = createSpiderChart(dataset, weighted);
		ChartComposite chartComposite = new ChartComposite(composite, SWT.NONE,
				chart, true);
		chartComposite.setVisible(true);
		// composite.layout();
		// parent.layout();
		return composite;
	}

	/**
	 * create a SpiderChart 
	 * @param dataset the dataset for the chart
	 * @param weighted include weights?
	 * @return the created SpiderChart
	 */
	private JFreeChart createSpiderChart(DefaultCategoryDataset dataset,
			boolean weighted) {

		SpiderWebPlot plot = new SpiderWebPlot(dataset);
		plot.setMaxValue(200.0f);

		plot.setStartAngle(54);
		plot.setInteriorGap(0.40);
		plot.setToolTipGenerator(new CategoryToolTipGenerator() {

			@Override
			public String generateToolTip(CategoryDataset dataset, int section,
					int index) {
				Float ratingValue = (Float) dataset.getValue(section, index);
				if (ratingValue == null)
					ratingValue = 0.0f;
				else
					ratingValue -= 100.0f;
				return String.valueOf("(" + dataset.getRowKey(section) + ","
						+ dataset.getColumnKey(index) + ") = "
						+ String.format("%.2f", ratingValue));
			}

		});
		plot.setNoDataMessage("No data to display");
		String titleStr = "ratings of selected elements";
		if (weighted)
			titleStr = "weighted " + titleStr;
		JFreeChart chart = new JFreeChart(titleStr, TextTitle.DEFAULT_FONT,
				plot, false);
		LegendTitle legend = new LegendTitle(plot);
		legend.setPosition(RectangleEdge.BOTTOM);
		chart.addSubtitle(legend);
		ChartUtilities.applyCurrentTheme(chart);
		return chart;

	}

	

	/**
	 * create a SpiderChart 
	 * @param elements a List with all Elements
	 * @param accessLayer an AccessLayer
	 * @param cacheManager a CacheManager
	 * @param showGoalRating show ratings to Goals? (true) or to Priniciples (false)
	 * @param weighted include weights?
	 * @return the created Dataset
	 */
	private DefaultCategoryDataset createSpiderDataset(List<Element> elements,
			AccessLayer accessLayer, CacheManager cacheManager,
			boolean showGoalRating, boolean weighted) {
		DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
		for (Element element : elements) {
			List<Element> leafElements = null;
			if (showGoalRating == true)
				leafElements = cacheManager
						.getLeafApplicableElementElements(GSSLayer.layer1);
			else
				leafElements = cacheManager
						.getLeafApplicableElementElements(GSSLayer.layer3);
			for (Element leafElement : leafElements) {
				if (leafElement.getClass() == element.getClass())
					continue; // skip case principle <-> principle
				Float ratingValue = cacheManager.getIndirectRatingWeight(
						(ConstrainedElement) element, leafElement);
				if (ratingValue == null) {
					ratingValue = 0.0f;
				}

				if (weighted) {
					Float weight = 0.0f;
					if (leafElement instanceof Principle)
						weight = cacheManager
								.getSelectedPrinciplePriority((Principle) leafElement);
					if (leafElement instanceof Goal)
						weight = cacheManager
								.getSelectedGoalPriority((Goal) leafElement);
					if (weight == null)
						weight = 0.0f;
					ratingValue = (ratingValue * weight / 100.0f) + 100;
				} else {
					ratingValue += 100.0f;
				}

				categoryDataset.addValue(ratingValue,
						accessLayer.getAttributeValue(element, "name"),
						accessLayer.getAttributeValue(leafElement, "name"));

			}
		}

		return categoryDataset;
	}

	/**
	 * Show a PieChart for the priorities of the goals
	 * @param builder a SelectedGoalsGraphBuilder
	 */
	protected void showChart(SelectedGoalsGraphBuilder builder) {
		if ((!parentComposite.isDisposed() && (composite == null || composite
				.isDisposed()))) {
			composite = new Composite(parentComposite, SWT.NONE);
			composite.setLayout(new FillLayout());
			final PieDataset dataset = createDataset(builder);
			JFreeChart chart = createChart(dataset);
			ChartComposite chartComposite = new ChartComposite(composite,
					SWT.NONE, chart, true);
			chartComposite.setVisible(true);

			composite.layout();
			parentComposite.layout();
		}

	}

	/**
	 * create a PieChart for the priorities of the goals
	 * @param dataset the used Dataset
	 * @return the created Chart
	 */
	private JFreeChart createChart(PieDataset dataset) {

		JFreeChart chart = ChartFactory.createPieChart3D(
				"priorities of selected goals", // chart
				// title
				dataset, // data
				true, // include legend
				true, false);

		final org.jfree.chart.plot.PiePlot3D plot = (org.jfree.chart.plot.PiePlot3D) chart
				.getPlot();
		plot.setStartAngle(290);
		plot.setDirection(Rotation.CLOCKWISE);
		plot.setForegroundAlpha(0.5f);
		plot.setNoDataMessage("No data to display");
		plot.setLabelGenerator(new org.jfree.chart.labels.StandardPieSectionLabelGenerator(
				"{0} = {2}", NumberFormat.getNumberInstance(), NumberFormat
						.getPercentInstance()));

		return chart;
	}

	/**
	 * create a Dataset for the PieChart of the priorities of the goals
	 * @param builder the SelectedGoalsGraphBuilder
	 * @return the created Chart
	 */
	private PieDataset createDataset(final SelectedGoalsGraphBuilder builder) {
		final DefaultPieDataset result = new DefaultPieDataset();
		updateDataSet(builder, result);
		builder.getCacheManager().addCacheChangedListener(
				new ICacheChangedListener() {

					@Override
					public void changed() {
						updateDataSet(builder, result);

					}
				});

		return result;
	}

	/**
	 * updates the specied DefaultPieDataset
	 * @param builder the SelectedGoalsGraphBuilder
	 * @param dataSet a DefaultPieDataset
	 */
	protected void updateDataSet(SelectedGoalsGraphBuilder builder,
			DefaultPieDataset dataSet) {
		dataSet.clear();
		for (PrioritizedElement element : builder.getCacheManager()
				.getSelectedGoals())
			if (builder.getCacheManager().isLeaf(
					((PrioritizedElement) element).getElement())) {
				Float priority = builder.getCacheManager()
						.getSelectedGoalPriority(
								(Goal) ((PrioritizedElement) element)
										.getElement());
				if (priority == null)
					priority = 0f;
				String name = ((Goal) ((PrioritizedElement) element).getElement())
						.getName();
				if (name == null)
					name = "unnamed";
				dataSet.setValue("Goal \"" + name + "\"", priority);

			}
	}

	/* (non-Javadoc)
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
