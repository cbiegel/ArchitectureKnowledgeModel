package org.emftrace.akm.ui.zestgraphbuilders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
import org.emftrace.akm.ui.windows.EditAKMElementWindow;
import org.emftrace.akm.ui.zest.figures.AKMElementFigure;
import org.emftrace.akm.ui.zest.figures.ASTAExplorationFigure;
import org.emftrace.akm.ui.zest.figures.AbstractASTAFigure;
import org.emftrace.akm.ui.zest.figures.AbstractDecoratorFigure;
import org.emftrace.akm.ui.zest.figures.BenefitsFigure;
import org.emftrace.akm.ui.zest.figures.DrawbacksFigure;
import org.emftrace.akm.ui.zest.figures.ElementFigure;
import org.emftrace.akm.ui.zest.figures.TechnologyFeatureFigure;
import org.emftrace.akm.ui.zest.figures.TechnologySolutionFigure;
import org.emftrace.akm.ui.zest.graph.AKMGraph;
import org.emftrace.akm.ui.zest.layouts.BenefitsAndDrawbacksExplorationLayoutAlgorithm;
import org.emftrace.akm.ui.zest.layouts.FeatureExplorationLayoutAlgorithm;
import org.emftrace.akm.ui.zest.nodes.AKMElementGraphNode;
import org.emftrace.akm.ui.zest.nodes.ASTAExplorationGraphNode;
import org.emftrace.akm.ui.zest.nodes.ASTAGraphNode;
import org.emftrace.akm.ui.zest.nodes.AbstractAKMGraphNode;
import org.emftrace.akm.ui.zest.nodes.LayerLabelGraphNode;
import org.emftrace.akm.ui.zest.nodes.TechnologyFeatureGraphNode;
import org.emftrace.akm.ui.zest.nodes.TechnologySolutionGraphNode;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTA;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ASTARelation;
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

/**
 * This class builds the default graph for an Architecture Knowledge Model.<br>
 * It handles the logic of the UI components and serves as a central control component for the
 * graph's logic.<br>
 * This class contains parts of the QUARC project and was modified for the AKM project.
 * 
 * @author Christopher Biegel
 * 
 */
public abstract class AbstractElementGraphBuilder extends AbstractGUIBuilder {

	// ===========================================================
	// Constants
	// ===========================================================

	/**
	 * The default font for labels
	 */
	protected static final Font DEFAULT_LABEL_FONT = new Font(null, "Arial", 10, SWT.NORMAL);

	/**
	 * The default font for titles
	 */
	protected static final Font DEFAULT_TITLE_FONT = new Font(null, "Arial", 12, SWT.BOLD);

	/**
	 * Contains strings for the external representation of ASTA types (these strings are be
	 * displayed as the ASTA type filter buttons' text)
	 */
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

	/**
	 * The default weights of the main SashForm
	 */
	private static final int[] GRAPH_SASH_FORM_WEIGHTS = { 75, 25 };

	/**
	 * The default weights of the SashForm that separates the sidebar components
	 */
	private static final int[] SIDE_SASH_FORM_WEIGHTS = { 50, 50 };

	// ===========================================================
	// Fields
	// ===========================================================

	/**
	 * The {@link AKMGraph} that is controlled by this class
	 */
	protected AKMGraph mZestGraph;

	/**
	 * The {@link ArchitectureKnowledgeModel} element which is the root of the graph
	 */
	protected EObject mInputContainer;

	/**
	 * A map for GraphNodes of Elements
	 */
	protected HashMap<ArchitectureKnowledgeModelBase, AbstractAKMGraphNode> mNodeMap;

	/**
	 * The most recently selected node in the graph
	 */
	protected AbstractAKMGraphNode mLastSelectedNode;

	/**
	 * The used WorkbenchPartSite
	 */
	protected IWorkbenchPartSite mWorkbenchPartSite;

	/**
	 * The used CacheManager
	 */
	protected CacheManager cacheManager;

	/**
	 * The scale used for select the zoom level
	 */
	private Scale mZoomScale;

	/**
	 * A label used for show the current zoom level
	 */
	private Label zoomLevelLabel;

	/**
	 * A ZoomManager for the zest graph
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

	/**
	 * A Map that maps {@link CapabilityType}s to their respective filter buttons
	 */
	private static Map<CapabilityType, Button> mCapabilityTypeButtonMap;

	/**
	 * A Map that maps {@link ASTA} types to their respective filter buttons
	 */
	private static Map<String, Button> mASTATypeButtonMap;

	/**
	 * A map for the Elements and their added ModelElementChangeListeners
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

	/**
	 * A List that contains all nodes that are currently visible in the graph
	 */
	private List<AbstractAKMGraphNode> mCurrentlyVisibleNodesList;

	/**
	 * The default layout algorithm for the graph
	 */
	private FeatureExplorationLayoutAlgorithm mDefaultLayout;

	/**
	 * The default MenuItem of the graph nodes
	 */
	private MenuItem mDefaultMenuItem;

	/**
	 * A Map that contains all nodes that are introduced with the Benefit&Drawback Exploration View
	 * so they can later be disposed from the graph upon exiting this view
	 */
	private Map<ArchitectureKnowledgeModelBase, AbstractAKMGraphNode> mBenefitDrawbackExplorationNodeMap;

	/**
	 * A List that contains all connections that are introduced with the Benefit&Drawback
	 * Exploration View so they can later be disposed from the graph upon exiting this view
	 */
	private List<GraphConnection> mBenefitDrawbackConnectionList;

	/**
	 * The main SashForm that separates the graph and the sidebar
	 */
	private SashForm mGraphSideSashForm;

	/**
	 * The SashForm that separates the contents of the sidebar
	 */
	private SashForm mSideBarSashForm;

	// ===========================================================
	// Constructors
	// ===========================================================

	/**
	 * The constructor
	 * 
	 * @param pParentComposite
	 *            The parent Composite of this Composite
	 * @param pStyle
	 *            The SWT style to be used for this Composite
	 * @param pWorkbenchPartSite
	 *            The workbench part sites for this Composite
	 * @param pInputContainer
	 *            The {@link ArchitectureKnowledgeModel} element
	 * @param pAccessLayer
	 *            The access layer
	 */
	public AbstractElementGraphBuilder(final Composite pParentComposite, final int pStyle,
			final IWorkbenchPartSite pWorkbenchPartSite, final EObject pInputContainer,
			final AccessLayer pAccessLayer) {
		super(pAccessLayer, pParentComposite);
		mInputContainer = pInputContainer;
		mNodeMap = new HashMap<ArchitectureKnowledgeModelBase, AbstractAKMGraphNode>();
		mWorkbenchPartSite = pWorkbenchPartSite;
		this.ecpModelChangeListenerMap =
				new HashMap<ECPModelElementChangeListener, ArchitectureKnowledgeModelBase>();
		mCapabilityTypeButtonMap = new HashMap<CapabilityType, Button>();
		mASTATypeButtonMap = new HashMap<String, Button>();
		mCurrentlyVisibleNodesList = new ArrayList<AbstractAKMGraphNode>();
		mBenefitDrawbackExplorationNodeMap =
				new HashMap<ArchitectureKnowledgeModelBase, AbstractAKMGraphNode>();
		mBenefitDrawbackConnectionList = new ArrayList<GraphConnection>();
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	/**
	 * @return The zest Graph
	 */
	public AKMGraph getZestGraph() {
		return mZestGraph;
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	protected void doBuild() {
		super.doBuild();

		// Layout for the bodyComposite
		FormLayout layout = new FormLayout();
		layout.marginHeight = 5;
		layout.marginWidth = 5;
		bodyComposite.setLayout(layout);

		mGraphSideSashForm = new SashForm(bodyComposite, SWT.HORIZONTAL);
		mGraphSideSashForm.SASH_WIDTH = 5;
		FormData graphSideSashFormData = new FormData();
		graphSideSashFormData.top = new FormAttachment(0, 0);
		graphSideSashFormData.bottom = new FormAttachment(85, 0);
		graphSideSashFormData.left = new FormAttachment(0, 0);
		graphSideSashFormData.right = new FormAttachment(100, 0);
		mGraphSideSashForm.setLayoutData(graphSideSashFormData);
		mGraphSideSashForm.setBackground(mGraphSideSashForm.getDisplay().getSystemColor(
				SWT.COLOR_GRAY));

		// Graph
		mZestGraph = new AKMGraph(mGraphSideSashForm, SWT.BORDER);

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
		Composite sideBarComposite = new Composite(mGraphSideSashForm, SWT.BORDER);
		sideBarComposite.setBackground(bodyComposite.getBackground());
		sideBarComposite.setLayout(new GridLayout(1, true));

		mSideBarSashForm = new SashForm(sideBarComposite, SWT.VERTICAL);
		mSideBarSashForm.SASH_WIDTH = 5;
		mSideBarSashForm.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		mSideBarSashForm
				.setBackground(mSideBarSashForm.getDisplay().getSystemColor(SWT.COLOR_GRAY));

		mFilterGroup = new Group(mSideBarSashForm, SWT.SHADOW_ETCHED_IN);
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
		mDetailGroup = new Group(mSideBarSashForm, SWT.SHADOW_ETCHED_IN);
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
		mGraphSideSashForm.setWeights(GRAPH_SASH_FORM_WEIGHTS);

		// The Composite for the bottom bar (contains zoom controls)
		Composite bottomBarComposite = createZoomBarComposite();
		FormData bottombarFormData = new FormData();
		bottombarFormData.top = new FormAttachment(mGraphSideSashForm, 5);
		bottombarFormData.bottom = new FormAttachment(100, 0);
		bottombarFormData.left = new FormAttachment(0, 0);
		bottombarFormData.right = new FormAttachment(100, 0);
		bottomBarComposite.setLayoutData(bottombarFormData);
	}

	// ===========================================================
	// Methods
	// ===========================================================

	/**
	 * Implementation of the creation of a Zest graph
	 * 
	 * @param pAKMGraph
	 *            The ZEST Graph
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

	/**
	 * Create the UI component for the zoom bar
	 * 
	 * @return The UI component for the zoom bar
	 */
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

				// Reset Sashforms
				mGraphSideSashForm.setWeights(GRAPH_SASH_FORM_WEIGHTS);
				mSideBarSashForm.setWeights(SIDE_SASH_FORM_WEIGHTS);

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
		if (!(pSelectedNode instanceof ASTAGraphNode)
				&& !(pSelectedNode instanceof ASTAExplorationGraphNode)) {
			createLabelWithSeparator("Name", detailsTitlesComposite, false, true);
			if (abstractNodeElement.getName() != null) {
				createLabelWithSeparator(abstractNodeElement.getName(), detailsContentsComposite,
						true, false);
			}
			// The ID element
			createLabelWithSeparator("ID", detailsTitlesComposite, false, true);
			if (abstractNodeElement.getID() != null) {
				createLabelWithSeparator(abstractNodeElement.getID(), detailsContentsComposite,
						true, false);
			}

			// Fill the detail composite with node-specific information
			if (abstractNodeElement instanceof TechnologySolution) {

				TechnologySolution technologySolutionElement =
						(TechnologySolution) abstractNodeElement;
				// The Description element
				createLabelWithoutSeparator("Description", detailsTitlesComposite, false, true);
				if (technologySolutionElement.getDescription() != null) {
					createLabelWithoutSeparator(technologySolutionElement.getDescription(),
							detailsContentsComposite, true, false);
				}
			} else if (abstractNodeElement instanceof TechnologyFeature) {

				TechnologyFeature technologyFeatureElement =
						(TechnologyFeature) abstractNodeElement;

				// The Capability Type element
				createLabelWithSeparator("Capability Type", detailsTitlesComposite, false, true);
				if (technologyFeatureElement.getCapabilityType() != null) {
					createLabelWithSeparator(technologyFeatureElement.getCapabilityType()
							.getLiteral(), detailsContentsComposite, true, false);
				}

				// The Description element
				createLabelWithoutSeparator("Description", detailsTitlesComposite, false, true);
				if (technologyFeatureElement.getDescription() != null) {
					createLabelWithoutSeparator(technologyFeatureElement.getDescription(),
							detailsContentsComposite, true, false);
				}
			}
		} else if (pSelectedNode instanceof ASTAExplorationGraphNode) {

			ASTAExplorationGraphNode astaNode = (ASTAExplorationGraphNode) pSelectedNode;
			ASTA astaElement = astaNode.getASTAElement();

			updateASTAElementDetails(astaElement, detailsTitlesComposite, detailsContentsComposite);

		} else {

			ASTAGraphNode astaNode = (ASTAGraphNode) pSelectedNode;
			AbstractASTAFigure figure = (AbstractASTAFigure) astaNode.getAKMFigure();

			if (!figure.isLabelSelected()) {

				createLabelWithoutSeparator(astaNode.getTitle(), detailsTitlesComposite, false,
						true);
				createLabelWithoutSeparator("" + astaNode.getContentCount(),
						detailsContentsComposite, true, false);
			} else {
				ASTA selectedElement = figure.getASTAElementForLabel(figure.getSelectedLabel());

				updateASTAElementDetails(selectedElement, detailsTitlesComposite,
						detailsContentsComposite);
			}
		}

		// These lines are needed in order to display content within a ScrolledComposite object
		scrollComposite.setContent(detailsBodyComposite);
		detailsBodyComposite.setSize(detailsBodyComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		// Update the detail composite
		mDetailGroup.layout();
	}

	/**
	 * Updates the details view for the given {@link ASTA} element
	 * 
	 * @param pASTAElement
	 *            The {@link ASTA} element to update the details for
	 * @param pDetailsTitlesComposite
	 *            The Composite for the detail titles
	 * @param pDetailsContentsComposite
	 *            The Composite for the detail contents
	 */
	private void updateASTAElementDetails(final ASTA pASTAElement,
			final Composite pDetailsTitlesComposite, final Composite pDetailsContentsComposite) {

		// The name element
		createLabelWithSeparator("Name", pDetailsTitlesComposite, false, true);
		if (pASTAElement.getName() != null) {
			createLabelWithSeparator(pASTAElement.getName(), pDetailsContentsComposite, true, false);
		}

		// The type element
		String typeString = pASTAElement.getClass().getSimpleName().replaceAll("Impl", "");
		createLabelWithSeparator("Type", pDetailsTitlesComposite, false, true);
		createLabelWithSeparator(typeString, pDetailsContentsComposite, true, false);

		// Check to see if the ASTA element is concern-based
		if (pASTAElement instanceof ConcernBasedBenefit) {
			ConcernBasedBenefit concernBasedelement = (ConcernBasedBenefit) pASTAElement;

			// The concern element
			createLabelWithSeparator("Concern", pDetailsTitlesComposite, false, true);
			if (concernBasedelement.getConcern() != null) {
				createLabelWithSeparator(concernBasedelement.getConcern(),
						pDetailsContentsComposite, true, false);
			}
		} else if (pASTAElement instanceof ConcernBasedDrawback) {
			ConcernBasedDrawback concernBasedelement = (ConcernBasedDrawback) pASTAElement;

			// The concern element
			createLabelWithSeparator("Concern", pDetailsTitlesComposite, false, true);
			if (concernBasedelement.getConcern() != null) {
				createLabelWithSeparator(concernBasedelement.getConcern(),
						pDetailsContentsComposite, true, false);
			}
		}

		// The condition element
		createLabelWithSeparator("Condition", pDetailsTitlesComposite, false, true);
		if (pASTAElement.getCondition() != null) {
			createLabelWithSeparator(pASTAElement.getCondition(), pDetailsContentsComposite, true,
					false);
		}

		// The capability type element
		createLabelWithSeparator("Capability Type", pDetailsTitlesComposite, false, true);
		if (pASTAElement.getCapabilityType() != null) {
			createLabelWithSeparator(pASTAElement.getCapabilityType().getLiteral(),
					pDetailsContentsComposite, true, false);
		}

		// The description element
		createLabelWithoutSeparator("Description", pDetailsTitlesComposite, false, true);
		if (pASTAElement.getDescription() != null) {
			createLabelWithoutSeparator(pASTAElement.getDescription(), pDetailsContentsComposite,
					true, false);
		}
	}

	/**
	 * Creates a Label with the given text and parent. Also creates a separator and adds it to the
	 * parent after the label.
	 */
	private void createLabelWithSeparator(final String pLabelText, final Composite pParent,
			final boolean pAddWhiteSpaceBeginning, final boolean pAddWhiteSpaceEnd) {

		String text = pLabelText;

		if (pAddWhiteSpaceBeginning) {
			text = "    " + pLabelText;
		}

		if (pAddWhiteSpaceEnd) {
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

	/**
	 * Create a Label without a Separator line underneath it
	 * 
	 * @param pLabel
	 *            Text The text of the label
	 * @param pParent
	 *            The parent Composite of the label
	 * @param pAddWhiteSpaceBeginning
	 *            Whether to add whitespace at the beginning of the text
	 * @param pAddWhiteSpaceEnd
	 *            Whether to add whitespace at the end of the text
	 */
	private void createLabelWithoutSeparator(final String pLabelText, final Composite pParent,
			final boolean pAddWhiteSpaceBeginning, final boolean pAddWhiteSpaceEnd) {
		String text = pLabelText;

		if (pAddWhiteSpaceBeginning) {
			text = "    " + pLabelText;
		}

		if (pAddWhiteSpaceEnd) {
			text += "    ";
		}

		Label label = new Label(pParent, SWT.NONE);
		label.setText(text);
		label.setBackground(label.getParent().getBackground());
	}

	/**
	 * Create the title label for the details Composite
	 */
	private void createDetailsTitleLabel() {

		Label nameLabel = new Label(mDetailGroup, SWT.NONE);
		nameLabel.setAlignment(SWT.CENTER);
		nameLabel.setText(mDefaultDetailsTitleString);
		nameLabel.setBackground(nameLabel.getParent().getBackground());
		nameLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		mDetailGroup.layout();
	}

	/**
	 * Create the node filter buttons and their UI components
	 */
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
	 * Sets the zoom level selected by the zoomScale
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
	 * @param pGraph
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
	 * @param pIsExpandable
	 *            Is node expandable?
	 * @return The created node (sub-type of {@link AbstractAKMGraphNode})
	 */
	protected AbstractAKMGraphNode createAKMElementNode(final AKMGraph pGraph, final int pStyle,
			final ArchitectureKnowledgeModelBase pAKMElement, final int pLevel,
			final int pSublevel, final boolean pIsLeaf, final boolean pIsExpandable,
			final boolean pIsASTAExploration) {

		ElementFigure elementFigure =
				createElementFigure(pAKMElement, pIsLeaf, pIsExpandable, null, pIsASTAExploration);

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
		} else if ((pAKMElement instanceof ASTA) && pIsASTAExploration) {

			ASTA asta = (ASTA) pAKMElement;
			node =
					new ASTAExplorationGraphNode(pGraph, pStyle, elementFigure, pLevel, pSublevel,
							asta);
		}

		// Throw exception if the type of the node is unknown
		if (node == null) {
			new Exception(
					"[org.emftrace.akm.ui.zestgraphbuilders.AbstractElementGraphBuilder.createAKMElementGraphNode():]"
							+ "\tCould not determine the type of the given AKM element")
					.printStackTrace();
		}

		if (!pIsASTAExploration) {
			mNodeMap.put(pAKMElement, node);
		}

		setContextMenu(node, pAKMElement, pIsASTAExploration);
		return node;
	}

	/**
	 * Creates a new ASTAGraphNode for the Benefits
	 * 
	 * @param pGraph
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
	 * @param pIsExpandable
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
			setContextMenu(node, benefit, false);
		}

		return node;
	}

	/**
	 * Creates a new ASTAGraphNode for the Drawbacks
	 * 
	 * @param pGraph
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
	 * @param pIsExpandable
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
			setContextMenu(node, drawback, false);
		}

		return node;
	}

	/**
	 * Creates a Draw2D Figure for an element
	 * 
	 * @param pAKMElement
	 *            The element to create a figure for
	 * @param isLeaf
	 *            Whether this figure is a leaf in graph hierarchy
	 * @param isExpandable
	 *            Whether this figure is expandable
	 * @param pTopFigure
	 *            The top figure for this figure
	 * @param pIsASTAExploration
	 *            Whether this figure is created for the Benefit&Drawback Exploration View
	 * @return The created {@link ElementFigure}
	 */
	protected ElementFigure createElementFigure(final ArchitectureKnowledgeModelBase pAKMElement,
			final boolean isLeaf, final boolean isExpandable, final Figure pTopFigure,
			final boolean pIsASTAExploration) {

		ElementFigure elementFigure = null;
		Figure footFigure = null;

		Figure globalTopFigure = new Figure();

		if (pTopFigure != null) {
			globalTopFigure.add(pTopFigure);
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
		} else if ((pAKMElement instanceof ASTA) && pIsASTAExploration) {
			ASTA asta = (ASTA) pAKMElement;

			bodyFigure = new ASTAExplorationFigure(asta.getName(), isExpandable);

		} else {
			new Exception("Element type has no supported ElementFigure").printStackTrace();
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

	/**
	 * Creates a figure for a list of {@link Benefit}s
	 * 
	 * @param pBenefitsList
	 *            The list of {@link Benefit}s for the figure
	 * @param pParentElement
	 *            The parent element of the {@link Benefit}s
	 * @return The created figure
	 */
	protected BenefitsFigure createBenefitFigure(final List<Benefit> pBenefitsList,
			final TechnologyFeature pParentElement) {

		BenefitsFigure figure = new BenefitsFigure(pBenefitsList);

		figure.setToolTip(createBenefitsDrawbacksTooltipFigure("Benefits", pParentElement));

		return figure;
	}

	/**
	 * Creates a figure for a list of {@link Drawback}s
	 * 
	 * @param pBenefitsList
	 *            The list of {@link Drawback}s for the figure
	 * @param pParentElement
	 *            The parent element of the {@link Drawback}s
	 * @return The created figure
	 */
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
		titleLabel.setFont(DEFAULT_TITLE_FONT);
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
		attributesAndFeaturesLabel.setFont(DEFAULT_LABEL_FONT);
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
			titleLabel.setFont(DEFAULT_LABEL_FONT);
		} else {
			titleLabel = new org.eclipse.draw2d.Label("");
			parentNameLabel = new org.eclipse.draw2d.Label("");
		}

		tooltipFigure.add(titleLabel);
		tooltipFigure.add(parentNameLabel);
		tooltipFigure.setSize(-1, -1);

		return tooltipFigure;
	}

	/**
	 * Sets the context menu for a {@link AbstractAKMGraphNode}
	 * 
	 * @param pNode
	 *            The node to set its context menu for
	 * @param pAKMElement
	 *            The element of the node
	 * @param pIsASTAExploration
	 *            Whether this context menu is created for the Benefits&Drawbacks Exploration View
	 */
	protected void setContextMenu(final AbstractAKMGraphNode pNode,
			final ArchitectureKnowledgeModelBase pAKMElement, final boolean pIsASTAExploration) {

		Menu menu = new Menu(getZestGraph().getShell(), SWT.POP_UP);

		if (!(pNode instanceof ASTAGraphNode)) {
			if (!(pNode instanceof AKMElementGraphNode)) {
				addOpenElementMenuItem(menu, pAKMElement);
			} else {
				ArchitectureKnowledgeModel model = (ArchitectureKnowledgeModel) pAKMElement;
				addEditIDAndNameMenuItem(menu, model);
			}

			if ((pNode instanceof TechnologySolutionGraphNode) && !pIsASTAExploration) {
				addFeaturesExplorationMenuItem(menu, pNode, pAKMElement);
			}

			if (!pIsASTAExploration) {
				addCloseMenuMenuItem(menu);
				pNode.setMenu(menu);
			}
		} else {

			ASTAGraphNode astaNode = (ASTAGraphNode) pNode;
			AbstractASTAFigure astaFigure = (AbstractASTAFigure) astaNode.getAKMFigure();
			ASTA astaElement = (ASTA) pAKMElement;
			org.eclipse.draw2d.Label label = astaFigure.getLabelForASTAElement(astaElement);

			addOpenElementMenuItem(menu, pAKMElement);
			addBenefitsDrawbacksExplorationMenuItem(menu, astaNode, astaElement);
			addCloseMenuMenuItem(menu);

			astaFigure.setContextMenu(label, menu);
		}
	}

	/**
	 * Adds an "Open Element" MenuItem to a menu
	 * 
	 * @param pMenu
	 *            The menu to modify
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

	/**
	 * Adds an "Explore Features" MenuItem to a menu
	 * 
	 * @param pMenu
	 *            The menu to modify
	 * @param pNode
	 *            The node of the menu
	 * @param pAKMElement
	 *            the Element displayed by the node
	 */
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

				// Show only this node (TechnologySolution) and its children
				pNode.show();
				pNode.showChildren();
				pNode.collapseChildren();

				Menu menu = new Menu(getZestGraph().getShell(), SWT.POP_UP);
				AbstractElementGraphBuilder.this.addOpenElementMenuItem(menu, pAKMElement);
				AbstractElementGraphBuilder.this.addExitFeaturesExplorationMenuItem(menu, pNode,
						pAKMElement);
				AbstractElementGraphBuilder.this.addCloseMenuMenuItem(menu);
				pNode.setMenu(menu);

				mZestGraph.applyLayout();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}

		});
	}

	/**
	 * Adds an "Exit Features Exploration" MenuItem to a menu
	 * 
	 * @param pMenu
	 *            The menu to modify
	 * @param pNode
	 *            The node of the menu
	 * @param pAKMElement
	 *            the Element displayed by the node
	 */
	protected void addExitFeaturesExplorationMenuItem(final Menu pMenu,
			final AbstractAKMGraphNode pNode, final ArchitectureKnowledgeModelBase pAKMElement) {

		MenuItem exitFeaturesExplorationMenuItem = new MenuItem(pMenu, SWT.PUSH);
		exitFeaturesExplorationMenuItem.setText("Exit Features Exploration");
		exitFeaturesExplorationMenuItem.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {

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
				AbstractElementGraphBuilder.this.addCloseMenuMenuItem(menu);
				pNode.setMenu(menu);

				mZestGraph.applyLayout();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}
		});
	}

	/**
	 * Adds an "Edit This Element" MenuItem to a menu
	 * 
	 * @param pMenu
	 *            The menu to modify
	 * @param pModel
	 *            The model of the node
	 */
	protected void addEditIDAndNameMenuItem(final Menu pMenu,
			final ArchitectureKnowledgeModel pModel) {

		MenuItem editMenuItem = new MenuItem(pMenu, SWT.PUSH);
		editMenuItem.setText("Edit This Element");
		editMenuItem.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {

				new EditAKMElementWindow(mZestGraph.getShell(), pModel);
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}
		});
	}

	/**
	 * Adds a "Explore Features" MenuItem to a menu
	 * 
	 * @param pMenu
	 *            The menu to modify
	 * @param pNode
	 *            The node of the menu
	 * @param pAKMElement
	 *            the Element displayed by the node
	 */
	protected void addBenefitsDrawbacksExplorationMenuItem(final Menu pMenu,
			final ASTAGraphNode pNode, final ASTA pAKMElement) {

		MenuItem featuresExplorationMenuItem = new MenuItem(pMenu, SWT.PUSH);
		featuresExplorationMenuItem.setText("Explore this ASTA");
		featuresExplorationMenuItem.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {

				// Save the current graph's layout algorithm
				mDefaultLayout =
						(FeatureExplorationLayoutAlgorithm) mZestGraph.getLayoutAlgorithm();

				// Save the current state of visible nodes
				mCurrentlyVisibleNodesList.clear();
				for (Object node : mZestGraph.getNodes()) {
					if (node instanceof AbstractAKMGraphNode) {

						AbstractAKMGraphNode akmNode = (AbstractAKMGraphNode) node;

						if (akmNode.isVisible()) {
							mCurrentlyVisibleNodesList.add(akmNode);
						}

						akmNode.hide();

					} else if (node instanceof LayerLabelGraphNode) {
						((LayerLabelGraphNode) node).setVisible(false);
					}
				}

				initializeBenefitsAndDrawbacksExploration(pAKMElement);

				mZestGraph.applyLayout();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}

		});
	}

	/**
	 * Adds an "Exit ASTA Exploration" MenuItem to a menu
	 * 
	 * @param pMenu
	 *            The menu to modify
	 * @param pAKMElement
	 *            the Element displayed by the node
	 */
	protected void addExitBenefitsDrawbacksExplorationMenuItem(final Menu pMenu,
			final ASTA pAKMElement) {

		MenuItem featuresExplorationMenuItem = new MenuItem(pMenu, SWT.PUSH);
		featuresExplorationMenuItem.setText("Exit ASTA Exploration");
		featuresExplorationMenuItem.addSelectionListener(new SelectionListener() {

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

				cleanupBenefitDrawbackExploration();

				mDefaultLayout.setThisLayoutAlgorithm();

				mZestGraph.applyLayout();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}

		});
	}

	/**
	 * Adds a "Close" MenuItem to a menu
	 * 
	 * @param pMenu
	 *            The menu to modify
	 */
	protected void addCloseMenuMenuItem(final Menu pMenu) {

		MenuItem closeMenuMenuItem = new MenuItem(pMenu, SWT.PUSH);
		closeMenuMenuItem.setText("Close");
	}

	/**
	 * Initializes the Benefits&Drawbacks Exploration View
	 * 
	 * @param pASTAElement
	 *            The ASTA element for the view
	 */
	private void initializeBenefitsAndDrawbacksExploration(final ASTA pASTAElement) {

		mBenefitDrawbackExplorationNodeMap.clear();

		AbstractAKMGraphNode astaNode =
				createAKMElementNode(mZestGraph, SWT.NONE, pASTAElement, 2, 0, false, false, true);
		mBenefitDrawbackExplorationNodeMap.put(pASTAElement, astaNode);

		Menu menu = new Menu(getZestGraph().getShell(), SWT.POP_UP);
		addOpenElementMenuItem(menu, pASTAElement);
		addExitBenefitsDrawbacksExplorationMenuItem(menu, pASTAElement);
		addCloseMenuMenuItem(menu);
		astaNode.setMenu(menu);

		List<Object> graphNodesList = new ArrayList<Object>(mZestGraph.getNodes());

		for (Object node : graphNodesList) {
			if (node instanceof TechnologyFeatureGraphNode) {
				TechnologyFeatureGraphNode technologyFeatureNode =
						(TechnologyFeatureGraphNode) node;
				TechnologyFeature technologyFeature =
						(TechnologyFeature) technologyFeatureNode.getAKMBaseElement();

				if (technologyFeature.getASTA().contains(pASTAElement)) {
					TechnologySolutionGraphNode technologySolutionNode =
							(TechnologySolutionGraphNode) technologyFeatureNode.getParentNode();
					TechnologySolution technologySolution =
							(TechnologySolution) technologySolutionNode.getAKMBaseElement();

					AbstractAKMGraphNode newSolutionNode =
							createAKMElementNode(mZestGraph, SWT.NONE, technologySolution, 0, 0,
									false, false, true);
					AbstractAKMGraphNode newFeatureNode =
							createAKMElementNode(mZestGraph, SWT.NONE, technologyFeature, 1, 0,
									false, false, true);
					mBenefitDrawbackExplorationNodeMap.put(technologyFeature, newFeatureNode);
					mBenefitDrawbackExplorationNodeMap.put(technologySolution, newSolutionNode);
					GraphConnection solutionFeatureConnection =
							createConnection(newSolutionNode, newFeatureNode);
					GraphConnection featureASTAConnection =
							createConnection(newFeatureNode, astaNode);
					featureASTAConnection.setText("has");
				}
			}
		}

		// In case of Drawbacks, check for "improved by" or "solved by" relations
		if (pASTAElement instanceof Drawback) {
			List<AbstractAKMGraphNode> newSolutionNodesList = new ArrayList<AbstractAKMGraphNode>();
			ArchitectureKnowledgeModel model = (ArchitectureKnowledgeModel) mInputContainer;

			for (ASTARelation relation : model.getRelations().getASTARelation()) {
				if (relation.getSourceElement() == pASTAElement) {
					TechnologyFeature technologyFeature = relation.getTargetElement();
					TechnologySolution technologySolution =
							(TechnologySolution) mNodeMap.get(technologyFeature).getParentNode()
									.getAKMBaseElement();

					AbstractAKMGraphNode newFeatureNode =
							createAKMElementNode(mZestGraph, SWT.NONE, technologyFeature, 3, 0,
									false, false, true);
					mBenefitDrawbackExplorationNodeMap.put(technologyFeature, newFeatureNode);

					if (!newSolutionNodesList.isEmpty()) {
						for (AbstractAKMGraphNode node : newSolutionNodesList) {
							if (node.getAKMBaseElement() != technologySolution) {
								AbstractAKMGraphNode newSolutionNode =
										createAKMElementNode(mZestGraph, SWT.NONE,
												technologySolution, 4, 0, false, false, true);
								newSolutionNodesList.add(newSolutionNode);
								mBenefitDrawbackExplorationNodeMap.put(technologySolution,
										newSolutionNode);
								createConnection(newSolutionNode, newFeatureNode);
							} else {
								createConnection(node, newFeatureNode);
							}
						}
					} else {
						AbstractAKMGraphNode newSolutionNode =
								createAKMElementNode(mZestGraph, SWT.NONE, technologySolution, 4,
										0, false, false, true);
						newSolutionNodesList.add(newSolutionNode);
						mBenefitDrawbackExplorationNodeMap.put(technologySolution, newSolutionNode);
						GraphConnection solutionFeatureConnection =
								createConnection(newSolutionNode, newFeatureNode);
					}

					GraphConnection featureASTAConnection =
							createConnection(astaNode, newFeatureNode);
					featureASTAConnection.setText(relation.getType().getLiteral());
				}
			}
		}

		new BenefitsAndDrawbacksExplorationLayoutAlgorithm(ZestStyles.NODES_NO_LAYOUT_RESIZE,
				mZestGraph);

		// Set filter buttons to inactive
		for (Button button : mCapabilityTypeButtonMap.values()) {
			button.setEnabled(false);
		}
		for (Button button : mASTATypeButtonMap.values()) {
			button.setEnabled(false);
		}
	}

	/**
	 * Cleans up after exiting the Benefits&Drawbacks Exploration View
	 */
	private void cleanupBenefitDrawbackExploration() {

		// Clean up the node map
		for (Iterator<Map.Entry<ArchitectureKnowledgeModelBase, AbstractAKMGraphNode>> it =
				mNodeMap.entrySet().iterator(); it.hasNext();) {
			Map.Entry<ArchitectureKnowledgeModelBase, AbstractAKMGraphNode> entry = it.next();
			for (Entry<ArchitectureKnowledgeModelBase, AbstractAKMGraphNode> benefitDrawbackEntry : mBenefitDrawbackExplorationNodeMap
					.entrySet()) {
				if (entry == benefitDrawbackEntry) {
					it.remove();
				}
			}
		}

		// Remove the nodes from the graph
		for (AbstractAKMGraphNode node : mBenefitDrawbackExplorationNodeMap.values()) {
			node.setVisible(false);
			node.dispose();
		}

		// Remove the connections from the graph
		for (GraphConnection connection : mBenefitDrawbackConnectionList) {
			connection.setVisible(false);
			connection.dispose();
		}

		// Enable filter buttons
		for (Button button : mCapabilityTypeButtonMap.values()) {
			button.setEnabled(true);
		}
		for (Button button : mASTATypeButtonMap.values()) {
			button.setEnabled(true);
		}
	}

	/**
	 * Creates a connection between two nodes by their elements
	 * 
	 * @param pSourceElement
	 *            The element of the source node of the connection
	 * @param pTargetElement
	 *            The element of the target node of the connection
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
	 * Creates a connection between two nodes
	 * 
	 * @param pSourceNode
	 *            The source node of the connection
	 * @param pTargetNode
	 *            The target node of the connection
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
	 * Fires a SelectionChangedEvent to all listening SelectionChangedListeners
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
	 * Inits the Cachemanager
	 */
	protected abstract void initCache();
}