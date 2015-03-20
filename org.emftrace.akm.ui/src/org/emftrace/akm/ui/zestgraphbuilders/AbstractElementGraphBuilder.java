package org.emftrace.akm.ui.zestgraphbuilders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.OrderedLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.edit.spi.util.ECPModelElementChangeListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.zest.core.viewers.internal.ZoomManager;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutStyles;
import org.emftrace.akm.core.cache.CacheManager;
import org.emftrace.akm.ui.helpers.CapabilityTypeColorCoding;
import org.emftrace.akm.ui.services.ConnectionDecoratorService;
import org.emftrace.akm.ui.zest.figures.AKMElementFigure;
import org.emftrace.akm.ui.zest.figures.AbstractASTAFigure;
import org.emftrace.akm.ui.zest.figures.AbstractDecoratorFigure;
import org.emftrace.akm.ui.zest.figures.BenefitsFigure;
import org.emftrace.akm.ui.zest.figures.DrawbacksFigure;
import org.emftrace.akm.ui.zest.figures.ElementFigure;
import org.emftrace.akm.ui.zest.figures.SoftGoalFigure;
import org.emftrace.akm.ui.zest.figures.TechnologyFeatureFigure;
import org.emftrace.akm.ui.zest.figures.TechnologySolutionFigure;
import org.emftrace.akm.ui.zest.graph.AKMGraph;
import org.emftrace.akm.ui.zest.layouts.FeatureExplorationLayoutAlgorithm;
import org.emftrace.akm.ui.zest.nodes.AKMElementGraphNode;
import org.emftrace.akm.ui.zest.nodes.ASTAGraphNode;
import org.emftrace.akm.ui.zest.nodes.AbstractAKMGraphNode;
import org.emftrace.akm.ui.zest.nodes.TechnologyFeatureGraphNode;
import org.emftrace.akm.ui.zest.nodes.TechnologySolutionGraphNode;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelBase;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.Benefit;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.CapabilityType;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedBenefit;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ConcernBasedDrawback;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.Drawback;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.FeatureBasedBenefit;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.FeatureBasedDrawback;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologyFeature;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolution;
import org.emftrace.ui.editors.builders.AbstractGUIBuilder;
import org.emftrace.ui.modelelementopener.EMFTraceModelElementOpener;

public abstract class AbstractElementGraphBuilder extends AbstractGUIBuilder {

	private static final String[] ASTA_TYPES_EXTERNAL_REPRESENTATION = { "Feature-based",
			"Feature-based", "Concern-based", "Concern-based" };

	/**
	 * Contains strings for the internal representation of ASTA types.<br>
	 * Index 0 = {@link FeatureBasedBenefit}<br>
	 * Index 1 = {@link FeatureBasedDrawback}<br>
	 * Index 2 = {@link ConcernBasedBenefit}<br>
	 * Index 3 = {@link ConcernBasedDrawback}
	 */
	private static final String[] ASTA_TYPES_INTERNAL_REPRESENTATION = { "FeatureBasedBenefit",
			"FeatureBasedDrawback", "ConcernBasedBenefit", "ConcernBasedDrawback" };

	protected AKMGraph mZestGraph;

	protected EObject mInputContainer;

	/**
	 * the SWT style
	 */
	private int mStyle;

	/**
	 * a map for GraphNodes of Elements
	 */
	protected HashMap<ArchitectureKnowledgeModelBase, AbstractAKMGraphNode> mNodeMap;

	/**
	 * The most recently selected node in the graph
	 */
	protected AbstractAKMGraphNode mLastSelectedNode;

	/**
	 * the used WorkbenchPartSite
	 */
	protected IWorkbenchPartSite mWorkbenchPartSite;

	/**
	 * the used CacheManager
	 */
	protected CacheManager cacheManager;

	/**
	 * the scale used for select the zoom level
	 */
	private Scale mZoomScale;

	/**
	 * a label used for show the current zoom level
	 */
	private Label zoomLevelLabel;

	/**
	 * a ZoomManager for the zest graph
	 */
	private ZoomManager zoomManager;

	/**
	 * The Composite containing filters for the graph
	 */
	private Group mFilterGroup;

	/**
	 * The Composite containing labels for the details of a node
	 */
	private Group mDetailGroup;

	private static Map<CapabilityType, Button> mCapabilityTypeButtonMap;

	private static Map<String, Button> mASTATypeButtonMap;

	/**
	 * a map for the Elements and their added ModelElementChangeListeners
	 */
	private Map<ECPModelElementChangeListener, ArchitectureKnowledgeModelBase> ecpModelChangeListenerMap;

	/**
	 * An interface for the SelectionProvider of Eclipse
	 */
	private ISelectionProvider mSelectionProvider;

	/**
	 * The default label of the details composite title that will be used when no nodes are selected
	 */
	private final String mDefaultDetailsTitleString = "";

	/**
	 * A list with SelectionChangedListeners used by the SelectionProvider
	 */
	private List<ISelectionChangedListener> mSelectionChangedListeners;

	private List<AbstractAKMGraphNode> mCurrentlyVisibleNodesList;

	protected static Font defaultLabelFont = new Font(null, "Arial", 10, SWT.NORMAL);
	protected static Font defaultTitleFont = new Font(null, "Arial", 12, SWT.BOLD);

	private MenuItem mDefaultMenuItem;

	/**
	 * the constructor
	 * 
	 * @param parent
	 *            the parent Composite
	 * @param pStyle
	 *            the SWT sytle
	 * @param inputObject
	 *            a container with elements for the Graph
	 */
	public AbstractElementGraphBuilder(final Composite pParentComposite, final int pStyle,
			final IWorkbenchPartSite pWorkbenchPartSite, final EObject pInputContainer,
			final AccessLayer pAccessLayer) {
		super(pAccessLayer, pParentComposite);
		mStyle = pStyle;
		mInputContainer = pInputContainer;
		mNodeMap = new HashMap<ArchitectureKnowledgeModelBase, AbstractAKMGraphNode>();
		mWorkbenchPartSite = pWorkbenchPartSite;
		this.ecpModelChangeListenerMap =
				new HashMap<ECPModelElementChangeListener, ArchitectureKnowledgeModelBase>();
		mCapabilityTypeButtonMap = new HashMap<CapabilityType, Button>();
		mASTATypeButtonMap = new HashMap<String, Button>();
		mCurrentlyVisibleNodesList = new ArrayList<AbstractAKMGraphNode>();
	}

	@Override
	protected void doBuild() {
		super.doBuild();

		// Layout for the bodyComposite
		FormLayout layout = new FormLayout();
		layout.marginHeight = 5;
		layout.marginWidth = 5;
		bodyComposite.setLayout(layout);

		// SashForm between the graph and the side bar
		SashForm graphSideSashForm = new SashForm(bodyComposite, SWT.HORIZONTAL);
		graphSideSashForm.SASH_WIDTH = 5;
		FormData graphSideSashFormData = new FormData();
		graphSideSashFormData.top = new FormAttachment(0, 0);
		graphSideSashFormData.bottom = new FormAttachment(85, 0);
		graphSideSashFormData.left = new FormAttachment(0, 0);
		graphSideSashFormData.right = new FormAttachment(100, 0);
		graphSideSashForm.setLayoutData(graphSideSashFormData);
		graphSideSashForm.setBackground(graphSideSashForm.getDisplay().getSystemColor(
				SWT.COLOR_GRAY));

		// Graph
		mZestGraph = new AKMGraph(graphSideSashForm, SWT.BORDER);

		FeatureExplorationLayoutAlgorithm featureExplorationLayout =
				new FeatureExplorationLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING,
						mZestGraph);

		buildCustomGraph(mZestGraph);
		mZestGraph.setConnectionStyle(ZestStyles.CONNECTIONS_DIRECTED);

		mSelectionChangedListeners = new ArrayList<ISelectionChangedListener>();

		mSelectionProvider = new ISelectionProvider() {

			@Override
			public void setSelection(final ISelection selection) {

			}

			@Override
			public void removeSelectionChangedListener(final ISelectionChangedListener listener) {
				mSelectionChangedListeners.remove(listener);

			}

			@Override
			public ISelection getSelection() {
				return new StructuredSelection(mZestGraph.getSelection());
			}

			@Override
			public void addSelectionChangedListener(final ISelectionChangedListener listener) {
				mSelectionChangedListeners.add(listener);

			}
		};

		mWorkbenchPartSite.setSelectionProvider(mSelectionProvider);

		mZestGraph.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				notifySelectionService();

				AbstractAKMGraphNode selectedNode = null;
				// Update the contents of the details Composite with information about the selected
				// node
				if (!mZestGraph.getSelection().isEmpty()
						&& (mZestGraph.getSelection().get(0) instanceof AbstractAKMGraphNode)) {

					selectedNode = (AbstractAKMGraphNode) mZestGraph.getSelection().get(0);
				}

				// Only perform the update if the seletion has changed
				if (mLastSelectedNode != selectedNode) {
					mLastSelectedNode = selectedNode;

					updateNodeDetails(selectedNode);
				}
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}

		});

		// The Composite for the side bar (contains filterComposite and detailsComposite)
		Composite sideBarComposite = new Composite(graphSideSashForm, SWT.BORDER);
		sideBarComposite.setBackground(bodyComposite.getBackground());
		sideBarComposite.setLayout(new GridLayout(1, true));

		// SashForm for the side bar composite
		SashForm sideBarSashForm = new SashForm(sideBarComposite, SWT.VERTICAL);
		sideBarSashForm.SASH_WIDTH = 5;
		sideBarSashForm.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		sideBarSashForm.setBackground(sideBarSashForm.getDisplay().getSystemColor(SWT.COLOR_GRAY));

		mFilterGroup = new Group(sideBarSashForm, SWT.SHADOW_ETCHED_IN);
		mFilterGroup.setText("Filters");
		GridLayout filterGroupLayout = new GridLayout(1, false);
		filterGroupLayout.marginHeight = 5;
		filterGroupLayout.marginWidth = 0;
		filterGroupLayout.verticalSpacing = 5;
		mFilterGroup.setLayout(filterGroupLayout);
		mFilterGroup.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		mFilterGroup.setBackground(mFilterGroup.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		createNodeFilters();

		// The Composite for the node details
		mDetailGroup = new Group(sideBarSashForm, SWT.SHADOW_ETCHED_IN);
		mDetailGroup.setText("Node Details");
		GridLayout detailCompositeLayout = new GridLayout(1, false);
		detailCompositeLayout.marginHeight = 5;
		detailCompositeLayout.marginWidth = 5;
		detailCompositeLayout.verticalSpacing = 10;
		mDetailGroup.setLayout(detailCompositeLayout);
		mDetailGroup.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		mDetailGroup.setBackground(mDetailGroup.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		createDetailsTitleLabel();

		// Set the weights for the children of the main SashForm
		graphSideSashForm.setWeights(new int[] { 75, 25 });

		// The Composite for the bottom bar (contains zoom controls)
		Composite bottomBarComposite = createZoomBarComposite();
		FormData bottombarFormData = new FormData();
		bottombarFormData.top = new FormAttachment(graphSideSashForm, 5);
		bottombarFormData.bottom = new FormAttachment(100, 0);
		bottombarFormData.left = new FormAttachment(0, 0);
		bottombarFormData.right = new FormAttachment(100, 0);
		bottomBarComposite.setLayoutData(bottombarFormData);
	}

	/**
	 * implementation of the creation of a Zest graph<br>
	 * must be extended by subclasses
	 * 
	 * @param zestGraph
	 *            a Zest Graph
	 * @return a List with all created nodes
	 */
	protected void buildCustomGraph(final AKMGraph pAKMGraph) {

		initCache();
		mNodeMap.clear();

		pAKMGraph.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {

				for (Object node : ((Graph) e.widget).getNodes()) {
					((GraphNode) node).unhighlight();
					if (node instanceof AbstractAKMGraphNode) {
						((AbstractAKMGraphNode) node).unmark();
					}
				}
				for (Object connection : ((Graph) e.widget).getConnections()) {
					((GraphConnection) connection).unhighlight();
				}
				for (int i = 0; i < ((Graph) e.widget).getSelection().size(); i++) {
					if (((Graph) e.widget).getSelection().get(i) instanceof AbstractAKMGraphNode) {
						AbstractAKMGraphNode selectedNode =
								(AbstractAKMGraphNode) ((Graph) e.widget).getSelection().get(i);

						selectedNode.highlight();
						selectedNode.mark();
						selectedNode.markChildren();
						selectedNode.markParents();
					}
				}
			}
		});
	}

	private Composite createZoomBarComposite() {

		// Composite
		Composite zoomBarComposite = new Composite(bodyComposite, SWT.NONE);
		zoomBarComposite.setLayout(new GridLayout(6, false));
		zoomBarComposite.setOrientation(SWT.RIGHT_TO_LEFT);
		zoomBarComposite.setBackground(bodyComposite.getBackground());

		// Reset Layout Button
		Button bReset = new Button(zoomBarComposite, SWT.NONE);
		bReset.setText("Reset layout");
		bReset.setLayoutData(new GridData(1, 1, false, false));
		bReset.setBackground(bReset.getParent().getBackground());
		bReset.setToolTipText("Reset the layout");
		bReset.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {

				// Reset nodes
				for (Object node : mZestGraph.getNodes()) {
					if (node instanceof AKMElementGraphNode) {
						((AbstractAKMGraphNode) node).setVisible(true);
					} else if (node instanceof TechnologySolutionGraphNode) {
						((AbstractAKMGraphNode) node).setVisible(true);
						((AbstractAKMGraphNode) node).collapseChildren();
						((AbstractAKMGraphNode) node).collapse(true);
						((AbstractAKMGraphNode) node).setIsCollapsed(true);
					} else if (node instanceof AbstractAKMGraphNode) {
						((AbstractAKMGraphNode) node).hide();
					}
				}

				// Deselect all nodes
				mZestGraph.deselectAllNodes();

				// Reset capability type filters
				for (Button button : mCapabilityTypeButtonMap.values()) {
					if (!button.getSelection()) {
						button.setSelection(true);
					}
				}

				// Reset ASTA type filters
				for (Button button : mASTATypeButtonMap.values()) {
					if (!button.getSelection()) {
						button.setSelection(true);
					}
				}

				mZestGraph.applyLayout();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {

			}
		});

		// Zoom Level Label
		zoomLevelLabel = new Label(zoomBarComposite, SWT.NONE);
		zoomLevelLabel.setLayoutData(new org.eclipse.swt.layout.GridData(SWT.RIGHT, SWT.TOP, false,
				false, 1, 1));
		zoomLevelLabel.setText("100%");
		zoomLevelLabel.setBackground(zoomLevelLabel.getParent().getBackground());
		zoomLevelLabel.setToolTipText("The current zoom level");

		zoomManager = new ZoomManager(mZestGraph.getRootLayer(), mZestGraph.getViewport());

		// Increase Zoom Button
		Button bPlus = new Button(zoomBarComposite, SWT.NONE);
		bPlus.setText("+");
		bPlus.setLayoutData(new GridData(1, 1, false, false));
		bPlus.setBackground(bPlus.getParent().getBackground());
		bPlus.setToolTipText("Increase the zoom level");
		bPlus.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				mZoomScale.setSelection(mZoomScale.getSelection() + 1);
				updateZoom();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}
		});

		// Zoom Scale
		mZoomScale = new Scale(zoomBarComposite, SWT.NONE);
		mZoomScale.setLayoutData(new GridData(1, 1, false, false));
		mZoomScale.setMinimum(0);
		mZoomScale.setMaximum(4);
		mZoomScale.setSelection(2);
		mZoomScale.setPageIncrement(1);
		mZoomScale.setIncrement(1);
		mZoomScale.setBackground(mZoomScale.getParent().getBackground());
		mZoomScale.setToolTipText("Use the slider to set the zoom level");
		mZoomScale.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				updateZoom();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {

			}
		});
		mZoomScale.setOrientation(SWT.LEFT_TO_RIGHT);

		// Decrease Zoom Button
		Button bMinus = new Button(zoomBarComposite, SWT.NONE);
		bMinus.setText("-");
		bMinus.setLayoutData(new GridData(1, 1, false, false));
		bMinus.setBackground(bMinus.getParent().getBackground());
		bMinus.setToolTipText("Decrease the zoom level");
		bMinus.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				mZoomScale.setSelection(mZoomScale.getSelection() - 1);
				updateZoom();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}
		});

		// Zoom Label
		Label zoomLabel = new Label(zoomBarComposite, SWT.NONE);
		zoomLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1));
		zoomLabel.setText("Zoom level");
		zoomLabel.setBackground(zoomLabel.getParent().getBackground());

		return zoomBarComposite;
	}

	/**
	 * Updates the contents of the details composite with information about the currently selected
	 * node
	 * 
	 * @param pSelectedNode
	 *            The currently selected node.<br>
	 *            If the node is null, all contents of the details composite will be disposed.
	 */
	protected void updateNodeDetails(final AbstractAKMGraphNode pSelectedNode) {

		// Clear the contents of the Composite
		for (Control c : mDetailGroup.getChildren()) {
			c.dispose();
		}

		// If the node is null (all nodes are deselected), just create the default title
		if ((pSelectedNode == null)
				|| (!(pSelectedNode instanceof ASTAGraphNode) && (pSelectedNode.getAKMBaseElement() == null))) {

			createDetailsTitleLabel();
			return;
		}

		// Label with the name of the node (serves as the head of the details composite)
		Label nameLabel = new Label(mDetailGroup, SWT.NONE);
		nameLabel.setAlignment(SWT.CENTER);
		if (pSelectedNode.getAKMBaseElement() != null) {
			if (pSelectedNode.getAKMBaseElement().getName() != null) {
				nameLabel.setText(pSelectedNode.getAKMBaseElement().getName());
			}
		} else if (pSelectedNode instanceof ASTAGraphNode) {
			nameLabel.setText(((ASTAGraphNode) pSelectedNode).getTitle());
		}
		nameLabel.setBackground(nameLabel.getParent().getBackground());
		nameLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// Scrollable composite (serves as a container for the detailsBodyComposite)
		ScrolledComposite scrollComposite =
				new ScrolledComposite(mDetailGroup, SWT.H_SCROLL | SWT.V_SCROLL);
		scrollComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		scrollComposite.setBackground(scrollComposite.getParent().getBackground());

		// Composite with the details of the node
		Composite detailsBodyComposite = new Composite(scrollComposite, SWT.NONE);
		GridLayout detailsBodyLayout = new GridLayout(2, false);
		detailsBodyLayout.horizontalSpacing = 0;
		detailsBodyLayout.verticalSpacing = 0;
		detailsBodyLayout.marginTop = 0;
		detailsBodyLayout.marginBottom = 0;
		detailsBodyComposite.setLayout(detailsBodyLayout);
		detailsBodyComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		detailsBodyComposite.setBackground(detailsBodyComposite.getParent().getBackground());

		// Composite with the titles of the details (e.g. Name, ID, ...)
		Composite detailsTitlesComposite = new Composite(detailsBodyComposite, SWT.BORDER);
		GridLayout detailsTitlesLayout = new GridLayout(1, false);
		detailsTitlesLayout.marginRight = -5;
		detailsTitlesLayout.marginTop = 0;
		detailsTitlesLayout.marginBottom = 0;
		detailsTitlesComposite.setLayout(detailsTitlesLayout);
		detailsTitlesComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		detailsTitlesComposite.setBackground(detailsTitlesComposite.getParent().getBackground());

		// Composite with the contents of the details (e.g. Name = "Element 1")
		Composite detailsContentsComposite = new Composite(detailsBodyComposite, SWT.BORDER);
		GridLayout detailsContentsLayout = new GridLayout(1, false);
		detailsContentsLayout.marginLeft = -5;
		detailsContentsLayout.marginTop = 0;
		detailsContentsLayout.marginBottom = 0;
		detailsContentsComposite.setLayout(detailsContentsLayout);
		detailsContentsComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		detailsContentsComposite.setBackground(detailsTitlesComposite.getParent().getBackground());

		// The abstract AKM element of the currently selected node
		ArchitectureKnowledgeModelBase abstractNodeElement = pSelectedNode.getAKMBaseElement();

		// Fill the detail composite with general contents (information about the currently selected
		// node)
		// The Name element
		if (!(pSelectedNode instanceof ASTAGraphNode)) {
			createLabelWithSeparator("Name", detailsTitlesComposite, true);
			if (abstractNodeElement.getName() != null) {
				createLabelWithSeparator(abstractNodeElement.getName(), detailsContentsComposite,
						false);
			}
			// The ID element
			createLabelWithSeparator("ID", detailsTitlesComposite, true);
			if (abstractNodeElement.getID() != null) {
				createLabelWithSeparator(abstractNodeElement.getID(), detailsContentsComposite,
						false);
			}

			// Fill the detail composite with node-specific information
			if (abstractNodeElement instanceof TechnologySolution) {

				TechnologySolution technologySolutionElement =
						(TechnologySolution) abstractNodeElement;
				// The Description element
				createLabelWithoutSeparator("Description", detailsTitlesComposite, true);
				if (technologySolutionElement.getDescription() != null) {
					createLabelWithoutSeparator(technologySolutionElement.getDescription(),
							detailsContentsComposite, false);
				}
			} else if (abstractNodeElement instanceof TechnologyFeature) {

				TechnologyFeature technologyFeatureElement =
						(TechnologyFeature) abstractNodeElement;

				// The Capability Type element
				createLabelWithSeparator("Capability Type", detailsTitlesComposite, true);
				if (technologyFeatureElement.getCapabilityType() != null) {
					createLabelWithSeparator(technologyFeatureElement.getCapabilityType()
							.getLiteral(), detailsContentsComposite, false);
				}

				// The Description element
				createLabelWithoutSeparator("Description", detailsTitlesComposite, true);
				if (technologyFeatureElement.getDescription() != null) {
					createLabelWithoutSeparator(technologyFeatureElement.getDescription(),
							detailsContentsComposite, false);
				}
			}
		} else {

			ASTAGraphNode astaNode = (ASTAGraphNode) pSelectedNode;
			AbstractASTAFigure figure = (AbstractASTAFigure) astaNode.getAKMFigure();

			if (!figure.isLabelSelected()) {

				createLabelWithoutSeparator(astaNode.getTitle(), detailsTitlesComposite, true);
				createLabelWithoutSeparator("" + astaNode.getContentCount(),
						detailsContentsComposite, false);
			} else {
				ASTA selectedElement = figure.getASTAElementForLabel(figure.getSelectedLabel());

				// The name element
				createLabelWithSeparator("Name", detailsTitlesComposite, true);
				if (selectedElement.getName() != null) {
					createLabelWithSeparator(selectedElement.getName(), detailsContentsComposite,
							false);
				}

				// The type element
				String typeString =
						selectedElement.getClass().getSimpleName().replaceAll("Impl", "");
				createLabelWithSeparator("Type", detailsTitlesComposite, true);
				createLabelWithSeparator(typeString, detailsContentsComposite, false);

				// Check to see if the ASTA element is concern-based
				if (selectedElement instanceof ConcernBasedBenefit) {
					ConcernBasedBenefit concernBasedelement = (ConcernBasedBenefit) selectedElement;

					// The concern element
					createLabelWithSeparator("Concern", detailsTitlesComposite, true);
					if (concernBasedelement.getConcern() != null) {
						createLabelWithSeparator(concernBasedelement.getConcern(),
								detailsContentsComposite, false);
					}
				} else if (selectedElement instanceof ConcernBasedDrawback) {
					ConcernBasedDrawback concernBasedelement =
							(ConcernBasedDrawback) selectedElement;

					// The concern element
					createLabelWithSeparator("Concern", detailsTitlesComposite, true);
					if (concernBasedelement.getConcern() != null) {
						createLabelWithSeparator(concernBasedelement.getConcern(),
								detailsContentsComposite, false);
					}
				}

				// The condition element
				createLabelWithSeparator("Condition", detailsTitlesComposite, true);
				if (selectedElement.getCondition() != null) {
					createLabelWithSeparator(selectedElement.getCondition(),
							detailsContentsComposite, false);
				}

				// The capability type element
				createLabelWithSeparator("Capability Type", detailsTitlesComposite, true);
				if (selectedElement.getCapabilityType() != null) {
					createLabelWithSeparator(selectedElement.getCapabilityType().getLiteral(),
							detailsContentsComposite, false);
				}

				// The description element
				createLabelWithoutSeparator("Description", detailsTitlesComposite, true);
				if (selectedElement.getDescription() != null) {
					createLabelWithoutSeparator(selectedElement.getDescription(),
							detailsContentsComposite, false);
				}
			}
		}

		// These lines are needed in order to display content within a ScrolledComposite object
		scrollComposite.setContent(detailsBodyComposite);
		detailsBodyComposite.setSize(detailsBodyComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		// Update the detail composite
		mDetailGroup.layout();
	}

	/**
	 * Creates a Label with the given text and parent. Also creates a separator and adds it to the
	 * parent after the label.
	 */
	private void createLabelWithSeparator(final String pLabelText, final Composite pParent,
			final boolean pAddWhiteSpace) {

		String text = pLabelText;

		if (pAddWhiteSpace) {
			text += "    ";
		}

		Label label = new Label(pParent, SWT.NONE);
		label.setText(text);
		label.setBackground(label.getParent().getBackground());

		Label separator = new Label(pParent, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData separatorData = new GridData(SWT.FILL, SWT.TOP, true, false);
		separatorData.horizontalSpan = 2;
		separator.setLayoutData(separatorData);
	}

	private void createLabelWithoutSeparator(final String pLabelText, final Composite pParent,
			final boolean pAddWhiteSpace) {
		String text = pLabelText;

		if (pAddWhiteSpace) {
			text += "    ";
		}

		Label label = new Label(pParent, SWT.NONE);
		label.setText(text);
		label.setBackground(label.getParent().getBackground());
	}

	private void createDetailsTitleLabel() {

		Label nameLabel = new Label(mDetailGroup, SWT.NONE);
		nameLabel.setAlignment(SWT.CENTER);
		nameLabel.setText(mDefaultDetailsTitleString);
		nameLabel.setBackground(nameLabel.getParent().getBackground());
		nameLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		mDetailGroup.layout();
	}

	private void createNodeFilters() {

		// ExpandBar containing the ExpandItems for the filters
		ExpandBar expandBar = new ExpandBar(mFilterGroup, SWT.V_SCROLL);
		expandBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		expandBar.setBackground(expandBar.getParent().getBackground());

		// Composite for the capability type filters
		Composite capabilityTypeFilterComposite = new Composite(expandBar, SWT.NONE);
		GridLayout capabilityTypeFilterCompositeLayout = new GridLayout(2, false);
		capabilityTypeFilterCompositeLayout.marginLeft = 0;
		capabilityTypeFilterCompositeLayout.marginTop = 10;
		capabilityTypeFilterCompositeLayout.marginRight = 0;
		capabilityTypeFilterCompositeLayout.marginBottom = 10;
		capabilityTypeFilterComposite.setLayout(capabilityTypeFilterCompositeLayout);
		capabilityTypeFilterComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		// Create a new checkbox button for each capability type
		for (CapabilityType capabilityType : CapabilityType.values()) {
			Button capabilityTypeButton = new Button(capabilityTypeFilterComposite, SWT.CHECK);
			String name = capabilityType.getLiteral().replaceAll("Capability", "");
			capabilityTypeButton.setText(name);
			capabilityTypeButton.setSelection(true);
			capabilityTypeButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

			capabilityTypeButton.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(final SelectionEvent event) {
					mZestGraph.applyLayout();
				}
			});

			mCapabilityTypeButtonMap.put(capabilityType, capabilityTypeButton);
		}

		// ExpandItem containing the capability type filters
		ExpandItem capabilityTypesExpandItem = new ExpandItem(expandBar, SWT.NONE, 0);
		capabilityTypesExpandItem.setText("Feature Capability Types Filter");
		capabilityTypesExpandItem.setHeight(capabilityTypeFilterComposite.computeSize(SWT.DEFAULT,
				SWT.DEFAULT).y);
		capabilityTypesExpandItem.setControl(capabilityTypeFilterComposite);
		capabilityTypesExpandItem.setExpanded(false);

		// Composite for the capability type filters
		Composite astaTypeFilterComposite = new Composite(expandBar, SWT.NONE);
		GridLayout astaTypeFilterCompositeLayout = new GridLayout(2, false);
		astaTypeFilterCompositeLayout.marginLeft = 0;
		astaTypeFilterCompositeLayout.marginTop = 10;
		astaTypeFilterCompositeLayout.marginRight = 0;
		astaTypeFilterCompositeLayout.marginBottom = 10;
		astaTypeFilterComposite.setLayout(astaTypeFilterCompositeLayout);
		astaTypeFilterComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		// Title label for benefit filters
		GridData headerData = new GridData(SWT.FILL, SWT.FILL, true, true);
		Label benefitHeader = new Label(astaTypeFilterComposite, SWT.NONE);
		benefitHeader.setAlignment(SWT.CENTER);
		benefitHeader.setLayoutData(headerData);
		benefitHeader.setText("Benefits");

		// Title label for drawback filters
		Label drawbackHeader = new Label(astaTypeFilterComposite, SWT.NONE);
		drawbackHeader.setAlignment(SWT.CENTER);
		drawbackHeader.setLayoutData(headerData);
		drawbackHeader.setText("Drawbacks");

		// Create Buttons for the ASTA types filter
		for (int i = 0; i < ASTA_TYPES_EXTERNAL_REPRESENTATION.length; i++) {
			String astaTypeExternal = ASTA_TYPES_EXTERNAL_REPRESENTATION[i];

			Button astaTypeButton = new Button(astaTypeFilterComposite, SWT.CHECK);
			astaTypeButton.setText(astaTypeExternal);
			astaTypeButton.setSelection(true);
			astaTypeButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

			astaTypeButton.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(final SelectionEvent event) {
					mZestGraph.applyLayout();
				}
			});

			String astaTypeInternal = ASTA_TYPES_INTERNAL_REPRESENTATION[i];
			mASTATypeButtonMap.put(astaTypeInternal, astaTypeButton);
		}

		// ExpandItem containing the ASTA types filters
		ExpandItem astaTypesExpanditem = new ExpandItem(expandBar, SWT.NONE, 1);
		astaTypesExpanditem.setText("ASTA Types Filter");
		astaTypesExpanditem
				.setHeight(astaTypeFilterComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		astaTypesExpanditem.setControl(astaTypeFilterComposite);
		astaTypesExpanditem.setExpanded(false);

		expandBar.setSpacing(8);
	}

	/**
	 * Determines whether the given capability type is filtered or not
	 * 
	 * @param pCapabilityType
	 *            The capability type to check
	 * @return True, if the capabilityType should be displayed (the corresponding filter button is
	 *         checked). If the button is unchecked, returns false.
	 */
	public static boolean isCapabilityTypeFilterActive(final CapabilityType pCapabilityType) {

		return (mCapabilityTypeButtonMap.containsKey(pCapabilityType) && mCapabilityTypeButtonMap
				.get(pCapabilityType).getSelection());
	}

	/**
	 * Determines whether the given ASTA type is filtered or not
	 * 
	 * @param pASTA
	 *            The ASTA type to check
	 * @return True, if the ASTA type should be displayed (the corresponding filter button is
	 *         checked). If the button is unchecked, returns false.
	 */
	public static boolean isASTATypeFilterActive(final ASTA pASTA) {

		String astaType = "";

		if (pASTA instanceof FeatureBasedBenefit) {
			astaType = ASTA_TYPES_INTERNAL_REPRESENTATION[0];
		} else if (pASTA instanceof FeatureBasedDrawback) {
			astaType = ASTA_TYPES_INTERNAL_REPRESENTATION[1];
		} else if (pASTA instanceof ConcernBasedBenefit) {
			astaType = ASTA_TYPES_INTERNAL_REPRESENTATION[2];
		} else if (pASTA instanceof ConcernBasedDrawback) {
			astaType = ASTA_TYPES_INTERNAL_REPRESENTATION[3];
		}

		return (mASTATypeButtonMap.containsKey(astaType) && mASTATypeButtonMap.get(astaType)
				.getSelection());
	}

	/**
	 * sets the zoom level selected by the zoomScale
	 */
	protected void updateZoom() {

		double zoomlevel = 1.0d;
		switch (mZoomScale.getSelection()) {
		case 0:
			zoomlevel = 0.50;
			zoomLevelLabel.setText("50%");
			break;

		case 1:
			zoomlevel = 0.75d;
			zoomLevelLabel.setText("75%");
			break;
		case 2:
			zoomlevel = 1.0d;
			zoomLevelLabel.setText("100%");
			break;
		case 3:
			zoomlevel = 2.0d;
			zoomLevelLabel.setText("200%");
			break;
		case 4:
			zoomlevel = 4.0d;
			zoomLevelLabel.setText("400%");
			break;

		}
		zoomManager.setZoom(zoomlevel);
	}

	/**
	 * Creates a new TechnologySolutionGraphNode for the specified Element
	 * 
	 * @param graph
	 *            The containment zest Graph
	 * @param pStyle
	 *            The SWT style of the new node
	 * @param pAKMElement
	 *            The AKM element represented by this node
	 * @param pLevel
	 *            The level of the node
	 * @param pSublevel
	 *            The sub level of the node
	 * @param pIsLeaf
	 *            Is node a leaf?
	 * @param isExpandable
	 *            Is node expandable?
	 * @return The created node (sub-type of {@link AbstractAKMGraphNode})
	 */
	protected AbstractAKMGraphNode createAKMElementNode(final AKMGraph pGraph, final int pStyle,
			final ArchitectureKnowledgeModelBase pAKMElement, final int pLevel,
			final int pSublevel, final boolean pIsLeaf, final boolean isExpandable) {

		ElementFigure elementFigure = createElementFigure(pAKMElement, pIsLeaf, isExpandable, null);

		AbstractAKMGraphNode node = null;

		// Determine the type of the graph node and create a corresponding node object
		if (pAKMElement instanceof ArchitectureKnowledgeModel) {

			ArchitectureKnowledgeModel model = (ArchitectureKnowledgeModel) pAKMElement;
			node = new AKMElementGraphNode(pGraph, pStyle, elementFigure, pLevel, pSublevel, model);
		} else if (pAKMElement instanceof TechnologySolution) {

			TechnologySolution technologySolution = (TechnologySolution) pAKMElement;
			node =
					new TechnologySolutionGraphNode(pGraph, pStyle, elementFigure, pLevel,
							pSublevel, technologySolution);
		} else if (pAKMElement instanceof TechnologyFeature) {

			// Determine the color of the figure's border and change the figure accordingly
			TechnologyFeature technologyFeature = (TechnologyFeature) pAKMElement;
			node =
					new TechnologyFeatureGraphNode(pGraph, pStyle, elementFigure, pLevel,
							pSublevel, technologyFeature);
		}

		// Throw exception if the type of the node is unknown
		if (node == null) {
			new Exception(
					"[org.emftrace.akm.ui.zestgraphbuilders.AbstractElementGraphBuilder.createAKMElementGraphNode():]"
							+ "\tCould not determine the type of the given AKM element")
					.printStackTrace();
		}

		mNodeMap.put(pAKMElement, node);

		setContextMenu(node, pAKMElement);
		return node;
	}

	/**
	 * Creates a new ASTAGraphNode for the Benefits
	 * 
	 * @param graph
	 *            The containment zest Graph
	 * @param pStyle
	 *            The SWT style of the new node
	 * @param pAKMElement
	 *            The AKM element represented by this node
	 * @param pLevel
	 *            The level of the node
	 * @param pSublevel
	 *            The sub level of the node
	 * @param pIsLeaf
	 *            Is node a leaf?
	 * @param isExpandable
	 *            Is node expandable?
	 * @return The created node (sub-type of {@link AbstractAKMGraphNode})
	 */
	protected AbstractAKMGraphNode createBenefitsNode(final AKMGraph pGraph,
			final List<Benefit> pBenefitsList, final int pLevel, final int pSublevel,
			final TechnologyFeature pParentElement) {

		BenefitsFigure benefitFigure = createBenefitFigure(pBenefitsList, pParentElement);

		ASTAGraphNode node = new ASTAGraphNode(pGraph, SWT.NONE, benefitFigure, pLevel, pSublevel);

		mNodeMap.put(null, node);

		for (Benefit benefit : pBenefitsList) {
			setContextMenu(node, benefit);
		}

		return node;
	}

	/**
	 * Creates a new ASTAGraphNode for the Drawbacks
	 * 
	 * @param graph
	 *            The containment zest Graph
	 * @param pStyle
	 *            The SWT style of the new node
	 * @param pAKMElement
	 *            The AKM element represented by this node
	 * @param pLevel
	 *            The level of the node
	 * @param pSublevel
	 *            The sub level of the node
	 * @param pIsLeaf
	 *            Is node a leaf?
	 * @param isExpandable
	 *            Is node expandable?
	 * @return The created node (sub-type of {@link AbstractAKMGraphNode})
	 */
	protected AbstractAKMGraphNode createDrawbacksNode(final AKMGraph pGraph,
			final List<Drawback> pDrawbacksList, final int pLevel, final int pSublevel,
			final TechnologyFeature pParentElement) {

		DrawbacksFigure drawbackFigure = createDrawbackFigure(pDrawbacksList, pParentElement);

		ASTAGraphNode node = new ASTAGraphNode(pGraph, SWT.NONE, drawbackFigure, pLevel, pSublevel);

		mNodeMap.put(null, node);

		for (Drawback drawback : pDrawbacksList) {
			setContextMenu(node, drawback);
		}

		return node;
	}

	/**
	 * 
	 * Creates a draw2d Figure for an element
	 * 
	 */
	protected ElementFigure createElementFigure(final ArchitectureKnowledgeModelBase pAKMElement,
			final boolean isLeaf, final boolean isExpandable, final Figure topFigure) {

		ElementFigure elementFigure = null;
		Figure footFigure = null;

		// if (!isLeaf) {
		// // TODO CB Relations-Typ dynamisch ermitteln
		// decompostionTypeFigure = new RefinementTypeFigure("is a");
		// }

		Figure globalTopFigure = new Figure();

		if (topFigure != null) {
			globalTopFigure.add(topFigure);
		}

		ToolbarLayout globalTopFigureLayout = new ToolbarLayout(false);

		globalTopFigureLayout.setMinorAlignment(OrderedLayout.ALIGN_BOTTOMRIGHT);
		globalTopFigure.setLayoutManager(globalTopFigureLayout);
		globalTopFigure.setOpaque(false);

		AbstractDecoratorFigure bodyFigure = null;

		if (pAKMElement instanceof ArchitectureKnowledgeModel) {
			ArchitectureKnowledgeModel akm = (ArchitectureKnowledgeModel) pAKMElement;

			bodyFigure = new AKMElementFigure(akm.getName(), isExpandable);
		} else if (pAKMElement instanceof TechnologySolution) {
			TechnologySolution technologySolution = (TechnologySolution) pAKMElement;

			bodyFigure = new TechnologySolutionFigure(technologySolution.getName(), isExpandable);
		} else if (pAKMElement instanceof TechnologyFeature) {
			TechnologyFeature technologyFeature = (TechnologyFeature) pAKMElement;

			Color capabilityColor =
					CapabilityTypeColorCoding.getColorForCapabilityType(technologyFeature
							.getCapabilityType());

			// if (!technologyFeature.getASTA().isEmpty()) {
			// footFigure = new org.eclipse.draw2d.Label("ASTA");
			// footFigure.setFont(defaultLabelFont);
			// }

			bodyFigure =
					new TechnologyFeatureFigure(pAKMElement.getName(), isExpandable,
							capabilityColor);
		} else {

			// TODO CB: SoftGoalFigure entfernen
			bodyFigure = new SoftGoalFigure(pAKMElement.getName(), isExpandable);
		}

		elementFigure = new ElementFigure(bodyFigure, footFigure, globalTopFigure);

		if ((bodyFigure != null) && (pAKMElement != null)) {
			final AbstractDecoratorFigure finalBodyFigure = bodyFigure;

			ECPModelElementChangeListener ecpModelChangeListener =
					new ECPModelElementChangeListener(pAKMElement) {

						@Override
						public void onChange(final Notification notification) {
							finalBodyFigure.setName(pAKMElement.getName());
						}
					};

			ecpModelChangeListenerMap.put(ecpModelChangeListener, pAKMElement);
			pAKMElement.addModelElementChangeListener(ecpModelChangeListener);

		}

		elementFigure.setToolTip(createTooltipFigure(pAKMElement));
		return elementFigure;
	}

	protected BenefitsFigure createBenefitFigure(final List<Benefit> pBenefitsList,
			final TechnologyFeature pParentElement) {

		BenefitsFigure figure = new BenefitsFigure(pBenefitsList);

		figure.setToolTip(createBenefitsDrawbacksTooltipFigure("Benefits", pParentElement));

		return figure;
	}

	protected DrawbacksFigure createDrawbackFigure(final List<Drawback> pDrawbacksList,
			final TechnologyFeature pParentElement) {

		DrawbacksFigure figure = new DrawbacksFigure(pDrawbacksList);

		figure.setToolTip(createBenefitsDrawbacksTooltipFigure("Drawbacks", pParentElement));

		return figure;
	}

	/**
	 * Creates a Figure for a Tooltip for the AKM element
	 * 
	 * @param pAKMElement
	 *            An AKM element (e.g. TechnologySolution, Feature, ...)
	 * @return The created IFigure
	 */
	protected IFigure createTooltipFigure(final ArchitectureKnowledgeModelBase pAKMElement) {

		Figure tooltipFigure = new Figure();

		ToolbarLayout layout = new ToolbarLayout();
		tooltipFigure.setLayoutManager(layout);
		tooltipFigure.setOpaque(true);
		String name = pAKMElement.getName();
		if (name == null) {
			name = "";
		}
		org.eclipse.draw2d.Label titleLabel =
				new org.eclipse.draw2d.Label("   " + pAKMElement.getName() + "   ");
		titleLabel.setFont(defaultTitleFont);
		tooltipFigure.add(titleLabel);

		String attributesAndFeaturesText = "";

		if (pAKMElement instanceof ArchitectureKnowledgeModel) {
			attributesAndFeaturesText = "Architecture Knowledge Model";
		} else if (pAKMElement instanceof TechnologySolution) {
			attributesAndFeaturesText = "Technology Solution";
		} else if (pAKMElement instanceof TechnologyFeature) {
			attributesAndFeaturesText = "Technology Feature";
		}

		org.eclipse.draw2d.Label attributesAndFeaturesLabel =
				new org.eclipse.draw2d.Label(" " + attributesAndFeaturesText + " \n");
		attributesAndFeaturesLabel.setFont(defaultLabelFont);
		tooltipFigure.add(attributesAndFeaturesLabel);
		tooltipFigure.setSize(-1, -1);

		return tooltipFigure;
	}

	/**
	 * Creates a Figure for a Tooltip for the AKM element
	 * 
	 * @param pAKMElement
	 *            An AKM element (e.g. TechnologySolution, Feature, ...)
	 * @return The created IFigure
	 */
	protected IFigure createBenefitsDrawbacksTooltipFigure(final String pAstaType,
			final TechnologyFeature pParentElement) {

		Figure tooltipFigure = new Figure();

		FlowLayout layout = new FlowLayout(true);
		tooltipFigure.setLayoutManager(layout);
		tooltipFigure.setOpaque(true);
		String parentName = pParentElement.getName();
		org.eclipse.draw2d.Label titleLabel = null;
		org.eclipse.draw2d.Label parentNameLabel = null;

		if (parentName != null) {

			parentNameLabel = new org.eclipse.draw2d.Label(parentName);
			parentNameLabel.setFont(new Font(null, "Arial", 10, SWT.BOLD));

			titleLabel = new org.eclipse.draw2d.Label(pAstaType + " of");
			titleLabel.setFont(defaultLabelFont);
		} else {
			titleLabel = new org.eclipse.draw2d.Label("");
			parentNameLabel = new org.eclipse.draw2d.Label("");
		}

		tooltipFigure.add(titleLabel);
		tooltipFigure.add(parentNameLabel);
		tooltipFigure.setSize(-1, -1);

		return tooltipFigure;
	}

	protected void setContextMenu(final AbstractAKMGraphNode pNode,
			final ArchitectureKnowledgeModelBase pAKMElement) {

		Menu menu = new Menu(getZestGraph().getShell(), SWT.POP_UP);

		if (!(pNode instanceof ASTAGraphNode)) {
			addOpenElementMenuItem(menu, pAKMElement);

			if (pNode instanceof TechnologySolutionGraphNode) {
				addFeaturesExplorationMenuItem(menu, pNode, pAKMElement);
			}

			addCloseMenuMenuItem(menu);
			pNode.setMenu(menu);
		} else {
			// TODO CB: Add B&D-Exploration MenuItem

			ASTAGraphNode astaNode = (ASTAGraphNode) pNode;
			AbstractASTAFigure astaFigure = (AbstractASTAFigure) astaNode.getAKMFigure();
			ASTA astaElement = (ASTA) pAKMElement;
			org.eclipse.draw2d.Label label = astaFigure.getLabelForASTAElement(astaElement);

			addOpenElementMenuItem(menu, pAKMElement);
			addCloseMenuMenuItem(menu);

			astaFigure.setContextMenu(label, menu);
		}
	}

	/**
	 * setter for a Popup-Menu for a Node
	 * 
	 * @param pAKMElement
	 *            the Element displayed by the node
	 */
	protected void addOpenElementMenuItem(final Menu pMenu,
			final ArchitectureKnowledgeModelBase pAKMElement) {

		mDefaultMenuItem = new MenuItem(pMenu, SWT.PUSH);
		mDefaultMenuItem.setText("Open Element");
		mDefaultMenuItem.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {

				EMFTraceModelElementOpener.open(pAKMElement);
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}
		});
	}

	protected void addFeaturesExplorationMenuItem(final Menu pMenu,
			final AbstractAKMGraphNode pNode, final ArchitectureKnowledgeModelBase pAKMElement) {

		MenuItem featuresExplorationMenuItem = new MenuItem(pMenu, SWT.PUSH);
		featuresExplorationMenuItem.setText("Explore Features");
		featuresExplorationMenuItem.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {

				mCurrentlyVisibleNodesList.clear();

				for (Object node : mZestGraph.getNodes()) {
					if (node instanceof AbstractAKMGraphNode) {

						AbstractAKMGraphNode akmNode = (AbstractAKMGraphNode) node;

						// Save the current state of visible nodes
						if (akmNode.isVisible()) {
							mCurrentlyVisibleNodesList.add(akmNode);
						}

						akmNode.hide();
					}
				}
				pNode.show();
				pNode.showChildren();
				pNode.collapseChildren();

				Menu menu = new Menu(getZestGraph().getShell(), SWT.POP_UP);
				AbstractElementGraphBuilder.this.addOpenElementMenuItem(menu, pAKMElement);
				AbstractElementGraphBuilder.this.addExitFeaturesExplorationMenuItem(menu, pNode,
						pAKMElement);
				pNode.setMenu(menu);

				mZestGraph.applyLayout();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}

		});
	}

	protected void addExitFeaturesExplorationMenuItem(final Menu pMenu,
			final AbstractAKMGraphNode pNode, final ArchitectureKnowledgeModelBase pAKMElement) {

		MenuItem exitFeaturesExplorationMenuItem = new MenuItem(pMenu, SWT.PUSH);
		exitFeaturesExplorationMenuItem.setText("Exit Features Exploration");
		exitFeaturesExplorationMenuItem.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {

				// TODO CB: Vorherigen Zustand des Graphen wiederherstellen
				for (Object node : mZestGraph.getNodes()) {
					if (node instanceof AbstractAKMGraphNode) {
						AbstractAKMGraphNode akmNode = (AbstractAKMGraphNode) node;

						if (mCurrentlyVisibleNodesList.contains(akmNode)) {
							akmNode.setVisible(true);
						} else {
							akmNode.setVisible(false);
						}
					}
				}

				Menu menu = new Menu(getZestGraph().getShell(), SWT.POP_UP);
				AbstractElementGraphBuilder.this.addOpenElementMenuItem(menu, pAKMElement);
				AbstractElementGraphBuilder.this.addFeaturesExplorationMenuItem(menu, pNode,
						pAKMElement);
				pNode.setMenu(menu);

				mZestGraph.applyLayout();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}
		});
	}

	protected void addBenefitsDrawbacksExplorationMenuItem(final Menu pMenu,
			final AbstractAKMGraphNode pNode, final ArchitectureKnowledgeModelBase pAKMElement) {

		MenuItem featuresExplorationMenuItem = new MenuItem(pMenu, SWT.PUSH);
		featuresExplorationMenuItem.setText("Explore this ASTA");
		featuresExplorationMenuItem.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {

				mCurrentlyVisibleNodesList.clear();

				for (Object node : mZestGraph.getNodes()) {
					if (node instanceof AbstractAKMGraphNode) {

						AbstractAKMGraphNode akmNode = (AbstractAKMGraphNode) node;

						// Save the current state of visible nodes
						if (akmNode.isVisible()) {
							mCurrentlyVisibleNodesList.add(akmNode);
						}

						akmNode.hide();
					}
				}

				// TODO CB: B&D-Exploration initialisieren (Layout)

				Menu menu = new Menu(getZestGraph().getShell(), SWT.POP_UP);
				AbstractElementGraphBuilder.this.addOpenElementMenuItem(menu, pAKMElement);
				// TODO CB: ExitB&D-View

				pNode.setMenu(menu);

				mZestGraph.applyLayout();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}

		});
	}

	protected void addCloseMenuMenuItem(final Menu pMenu) {

		MenuItem closeMenuMenuItem = new MenuItem(pMenu, SWT.PUSH);
		closeMenuMenuItem.setText("Close");
	}

	/**
	 * creates a connection for a relation
	 * 
	 * @param relation
	 *            a Relation between Elements
	 */
	protected GraphConnection createConnection(final ArchitectureKnowledgeModelBase pSourceElement,
			final ArchitectureKnowledgeModelBase pTargetElement) {

		// Get the GraphNode objects for the elements
		GraphNode sourceNode = getNodeForElement(pSourceElement);
		GraphNode targetNode = getNodeForElement(pTargetElement);

		// Throw exception if the corresponding GraphNode objects of the elements could not be found
		if (sourceNode == null) {
			new Exception("Could not find GraphNode object for source element " + pSourceElement)
					.printStackTrace();
		}

		if (targetNode == null) {
			new Exception("Could not find GraphNode object for target element " + pTargetElement)
					.printStackTrace();
		}

		// Create a new GraphConnection and use the ConnectionDecorator to decorate it
		final GraphConnection connection =
				new GraphConnection(mZestGraph, ZestStyles.CONNECTIONS_DIRECTED, sourceNode,
						targetNode);

		ConnectionDecoratorService.decoradeConnection(connection, pSourceElement, pTargetElement);

		return connection;
	}

	/**
	 * creates a connection for a relation
	 * 
	 * @param relation
	 *            a Relation between Elements
	 */
	protected GraphConnection createConnection(final GraphNode pSourceNode,
			final GraphNode pTargetNode) {

		// Create a new GraphConnection and use the ConnectionDecorator to decorate it
		final GraphConnection connection =
				new GraphConnection(mZestGraph, ZestStyles.CONNECTIONS_DIRECTED, pSourceNode,
						pTargetNode);

		connection.setLineColor(ColorConstants.black);
		connection.setLineWidth(1);

		return connection;
	}

	/**
	 * Finds the GraphNode object of the specified AKM element
	 * 
	 * @param pAKMElement
	 *            An ArchitectureKnowledgeModel element
	 * @return The GraphNode object of the specified element (if it exists)
	 */
	public AbstractAKMGraphNode getNodeForElement(final ArchitectureKnowledgeModelBase pAKMElement) {
		if (mNodeMap.containsKey(pAKMElement)) {
			return mNodeMap.get(pAKMElement);
		}
		return null;
	}

	/**
	 * fires a SelectionChangedEvent to all listening SelectionChangedListeners
	 */
	public void notifySelectionService() {
		for (ISelectionChangedListener listener : mSelectionChangedListeners) {

			SelectionChangedEvent event =
					new SelectionChangedEvent(mSelectionProvider, new StructuredSelection(
							mZestGraph.getSelection()));
			try {
				listener.selectionChanged(event);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @return the zest Graph
	 */
	public AKMGraph getZestGraph() {
		return mZestGraph;
	}

	/**
	 * inits the Cachemanager
	 */
	protected abstract void initCache();
}