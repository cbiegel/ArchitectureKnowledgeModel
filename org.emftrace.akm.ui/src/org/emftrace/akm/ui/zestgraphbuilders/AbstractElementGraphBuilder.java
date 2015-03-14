package org.emftrace.akm.ui.zestgraphbuilders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.Figure;
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
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
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
import org.emftrace.akm.ui.zest.connections.ConnectionDecoratorService;
import org.emftrace.akm.ui.zest.graph.AKMGraph;
import org.emftrace.akm.ui.zest.layouts.FeatureExplorationLayoutAlgorithm;
import org.emftrace.akm.ui.zest.nodes.AKMElementGraphNode;
import org.emftrace.akm.ui.zest.nodes.AbstractAKMGraphNode;
import org.emftrace.akm.ui.zest.nodes.TechnologySolutionGraphNode;
import org.emftrace.core.accesslayer.AccessLayer;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModel;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.ArchitectureKnowledgeModelBase;
import org.emftrace.metamodel.ArchitectureKnowledgeModel.TechnologySolution;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.quarc.ui.zest.figures.AbstractDecoratorFigure;
import org.emftrace.quarc.ui.zest.figures.ElementFigure;
import org.emftrace.quarc.ui.zest.figures.SoftGoalFigure;
import org.emftrace.ui.editors.builders.AbstractGUIBuilder;
import org.emftrace.ui.modelelementopener.EMFTraceModelElementOpener;

public abstract class AbstractElementGraphBuilder extends AbstractGUIBuilder {

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
	 * a map for the Connections of Relations
	 */
	protected HashMap<Relation, GraphConnection> mRelationMap;

	/**
	 * a map for the Relations of Connections
	 */
	protected HashMap<GraphConnection, Relation> mConnectionMap;

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
	 * The Composite containing labels for the details of a node
	 */
	private Composite mDetailComposite;

	/**
	 * a map for the Elements and their added ModelElementChangeListeners
	 */
	private Map<ECPModelElementChangeListener, ArchitectureKnowledgeModelBase> ecpModelChangeListenerMap;

	/**
	 * An interface for the SelectionProvider of Eclipse
	 */
	private ISelectionProvider mSelectionProvider;

	/**
	 * A list with SelectionChangedListeners used by the SelectionProvider
	 */
	private List<ISelectionChangedListener> mSelectionChangedListeners;

	protected static Font defaultLabelFont = new Font(null, "Arial", 10, SWT.NORMAL);
	protected static Font defaultTitleFont = new Font(null, "Arial", 12, SWT.BOLD);

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
		mRelationMap = new HashMap<Relation, GraphConnection>();
		mConnectionMap = new HashMap<GraphConnection, Relation>();
		mWorkbenchPartSite = pWorkbenchPartSite;
		this.ecpModelChangeListenerMap =
				new HashMap<ECPModelElementChangeListener, ArchitectureKnowledgeModelBase>();

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
				new FeatureExplorationLayoutAlgorithm(LayoutStyles.NONE, mZestGraph);

		featureExplorationLayout.setCaptionsForLayers("goals", 0);
		featureExplorationLayout.setToolTipsForLayers(
				createTooltipFigure("all goals of the goal solution scheme"), 0);

		featureExplorationLayout.setCaptionsForLayers("principles", 1);
		featureExplorationLayout.setToolTipsForLayers(
				createTooltipFigure("all principles of the goal solution scheme"), 1);

		featureExplorationLayout.setCaptionsForLayers("solution instruments", 2);
		featureExplorationLayout.setToolTipsForLayers(
				createTooltipFigure("all solution instruments of the goal solution scheme"), 2);

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

		Button testButton = new Button(sideBarSashForm, SWT.BORDER);
		testButton.setText("TESTBUTTON");

		// The Composite for the node details
		mDetailComposite = new Composite(sideBarSashForm, SWT.BORDER);
		GridLayout detailCompositeLayout = new GridLayout(1, false);
		detailCompositeLayout.marginHeight = 5;
		detailCompositeLayout.marginWidth = 5;
		detailCompositeLayout.verticalSpacing = 10;
		mDetailComposite.setLayout(detailCompositeLayout);
		mDetailComposite.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		mDetailComposite.setBackground(mDetailComposite.getDisplay()
				.getSystemColor(SWT.COLOR_WHITE));

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
				for (Object node : mZestGraph.getNodes()) {
					if (node instanceof AbstractAKMGraphNode) {
						((AbstractAKMGraphNode) node).setIsExpanded();
						((AbstractAKMGraphNode) node).show();
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
		for (Control c : mDetailComposite.getChildren()) {
			c.dispose();
		}

		// If the node is null (all nodes are deselected), don't create any new contents for the
		// composite
		if (pSelectedNode == null) {
			return;
		}

		// Label with the name of the node (serves as the head of the details composite)
		Label nameLabel = new Label(mDetailComposite, SWT.NONE);
		nameLabel.setAlignment(SWT.CENTER);
		nameLabel.setText(pSelectedNode.getAKMBaseElement().getName());
		nameLabel.setBackground(nameLabel.getParent().getBackground());
		nameLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// Scrollable composite (serves as a container for the detailsBodyComposite)
		ScrolledComposite scrollComposite =
				new ScrolledComposite(mDetailComposite, SWT.H_SCROLL | SWT.V_SCROLL);
		scrollComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		scrollComposite.setBackground(scrollComposite.getParent().getBackground());

		// Composite with the details of the node
		Composite detailsBodyComposite = new Composite(scrollComposite, SWT.NONE);
		GridLayout detailsBodyLayout = new GridLayout(2, false);
		detailsBodyLayout.horizontalSpacing = 5;
		detailsBodyComposite.setLayout(detailsBodyLayout);
		detailsBodyComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		detailsBodyComposite.setBackground(detailsBodyComposite.getParent().getBackground());

		// Composite with the titles of the details (e.g. Name, ID, ...)
		Composite detailsTitlesComposite = new Composite(detailsBodyComposite, SWT.NONE);
		GridLayout detailsTitlesLayout = new GridLayout(1, false);
		detailsTitlesComposite.setLayout(detailsTitlesLayout);
		detailsTitlesComposite.setLayoutData(new GridData(GridData.FILL_VERTICAL));
		detailsTitlesComposite.setBackground(detailsTitlesComposite.getParent().getBackground());

		// Composite with the contents of the details (e.g. Name = "Element 1")
		Composite detailsContentsComposite = new Composite(detailsBodyComposite, SWT.NONE);
		GridLayout detailsContentsLayout = new GridLayout(1, false);
		detailsContentsComposite.setLayout(detailsContentsLayout);
		detailsContentsComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		detailsContentsComposite.setBackground(detailsTitlesComposite.getParent().getBackground());

		Label testLabel1 = new Label(detailsTitlesComposite, SWT.NONE);
		testLabel1.setText("TEST 1");
		testLabel1.setBackground(nameLabel.getParent().getBackground());

		Label separator = new Label(detailsTitlesComposite, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData separatorData = new GridData(SWT.FILL, SWT.TOP, true, false);
		separatorData.horizontalSpan = 2;
		separator.setLayoutData(separatorData);

		Label testLabel2 = new Label(detailsTitlesComposite, SWT.NONE);
		testLabel2.setText("TEST 2");
		testLabel2.setBackground(nameLabel.getParent().getBackground());

		Label testLabel3 = new Label(detailsTitlesComposite, SWT.NONE);
		testLabel3.setText("TEST 31313131313113");
		testLabel3.setBackground(nameLabel.getParent().getBackground());

		Label testLabel4 = new Label(detailsTitlesComposite, SWT.NONE);
		testLabel4.setText("TEST 4");
		testLabel4.setBackground(nameLabel.getParent().getBackground());

		Label testLabel5 = new Label(detailsTitlesComposite, SWT.NONE);
		testLabel5.setText("TEST 5");
		testLabel5.setBackground(nameLabel.getParent().getBackground());

		Label testLabel6 = new Label(detailsTitlesComposite, SWT.NONE);
		testLabel6.setText("TEST 6");
		testLabel6.setBackground(nameLabel.getParent().getBackground());

		Label testLabel7 = new Label(detailsTitlesComposite, SWT.NONE);
		testLabel7.setText("TEST 7");
		testLabel7.setBackground(nameLabel.getParent().getBackground());

		Label testLabel8 = new Label(detailsTitlesComposite, SWT.NONE);
		testLabel8.setText("TEST 8");
		testLabel8.setBackground(nameLabel.getParent().getBackground());

		Label testLabelLong = new Label(detailsContentsComposite, SWT.NONE);
		testLabelLong
				.setText("Dies ist ein sehr langes Label, um die Breite der Composite zu testen!");
		testLabelLong.setBackground(nameLabel.getParent().getBackground());

		separator = new Label(detailsContentsComposite, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator.setLayoutData(separatorData);

		// These lines are needed in order to display content within a ScrolledComposite object
		scrollComposite.setContent(detailsBodyComposite);
		detailsBodyComposite.setSize(detailsBodyComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		// Update the detail composite
		mDetailComposite.layout();
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

		ElementFigure figure = createModelFigure(pAKMElement, pIsLeaf, isExpandable, null);

		AbstractAKMGraphNode node = null;

		// Determine the type of the graph node and create a corresponding node object
		if (pAKMElement instanceof ArchitectureKnowledgeModel) {

			ArchitectureKnowledgeModel model = (ArchitectureKnowledgeModel) pAKMElement;
			node = new AKMElementGraphNode(pGraph, pStyle, figure, pLevel, pSublevel, model);
		} else if (pAKMElement instanceof TechnologySolution) {

			TechnologySolution technologySolution = (TechnologySolution) pAKMElement;
			node =
					new TechnologySolutionGraphNode(pGraph, pStyle, figure, pLevel, pSublevel,
							technologySolution);
		}

		// Throw exception if the type of the node is unknown
		if (node == null) {
			new Exception(
					"[org.emftrace.akm.ui.zestgraphbuilders.AbstractElementGraphBuilder.createAKMElementGraphNode():]"
							+ "\tCould not determine the type of the given AKM element")
					.printStackTrace();
		}

		mNodeMap.put(pAKMElement, node);

		setDefaultMenu(node, pAKMElement);
		return node;
	}

	/**
	 * 
	 * Creates a draw2d Figure for an element
	 * 
	 */
	protected ElementFigure createModelFigure(final ArchitectureKnowledgeModelBase pAKMElement,
			final boolean isLeaf, final boolean isExpandable, final Figure topFigure) {

		ElementFigure elementFigure = null;
		Figure decompostionTypeFigure = null;

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
		bodyFigure = new SoftGoalFigure(pAKMElement.getName(), isExpandable);
		elementFigure = new ElementFigure(bodyFigure, decompostionTypeFigure, globalTopFigure);

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

		// TODO CB Beschreibung holen und einf�gen
		String attributesAndFeaturesText = "TEST DESCRIPTION!!!!!!11";
		// if (pModel.getDescription() != null) {
		// attributesAndFeaturesText += " Description: \n "
		// + formatDescription(pModel.getDescription());
		// }

		// if ((element instanceof ConstrainedElement) &&
		// (((ConstrainedElement)element).getPrecondition() != null) &&
		// (!((ConstrainedElement)element).getPrecondition().getLogicConditions().isEmpty() ||
		// !((ConstrainedElement)element).getPrecondition().getBaseConditions().isEmpty())){
		//
		// attributesAndFeaturesText += " Precondition: \n " +
		// PreconditionFinder.formatConditionString(((ConstrainedElement)element).getPrecondition());
		//
		// }

		org.eclipse.draw2d.Label attributesAndFeaturesLabel =
				new org.eclipse.draw2d.Label(" " + attributesAndFeaturesText + " \n");
		attributesAndFeaturesLabel.setFont(defaultLabelFont);
		tooltipFigure.add(attributesAndFeaturesLabel);
		tooltipFigure.setSize(-1, -1);

		return tooltipFigure;
	}

	/**
	 * setter for a Popup-Menu for a Node
	 * 
	 * @param pNode
	 *            a GSSElementGraphNode
	 * @param pAKMElement
	 *            the Element displayed by the node
	 */
	protected void setDefaultMenu(final AbstractAKMGraphNode pNode,
			final ArchitectureKnowledgeModelBase pAKMElement) {

		Menu menu = new Menu(getZestGraph().getShell(), SWT.POP_UP);

		MenuItem item = new MenuItem(menu, SWT.PUSH);
		item.setText("open");
		item.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {

				EMFTraceModelElementOpener.open(pAKMElement);
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}
		});

		item = new MenuItem(menu, SWT.PUSH);
		item.setText("show this node with predecessors offset");
		item.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				for (Object node : mZestGraph.getNodes()) {
					if (node instanceof AbstractAKMGraphNode) {
						((AbstractAKMGraphNode) node).hide();
					}
				}
				pNode.show();

				pNode.showParents();
				mZestGraph.applyLayout();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}

		});

		item = new MenuItem(menu, SWT.PUSH);
		item.setText("show only this node with successors only");
		item.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				for (Object node : mZestGraph.getNodes()) {
					if (node instanceof AbstractAKMGraphNode) {
						((AbstractAKMGraphNode) node).hide();
					}
				}
				pNode.show();
				pNode.showChildren();
				mZestGraph.applyLayout();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}

		});

		item = new MenuItem(menu, SWT.PUSH);
		item.setText("show this node with predecessors and successors only");
		item.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				for (Object node : mZestGraph.getNodes()) {
					if (node instanceof AbstractAKMGraphNode) {
						((AbstractAKMGraphNode) node).hide();
					}
				}
				pNode.show();
				pNode.showChildren();
				pNode.showParents();
				mZestGraph.applyLayout();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}

		});

		pNode.setMenu(menu);
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
	 * creates a Figure for a Tooltip for the specified text
	 * 
	 * @param text
	 *            a String
	 * @return the created IFigure
	 */
	protected static IFigure createTooltipFigure(final String text) {

		Figure tooltipFigure = new Figure();

		ToolbarLayout layout = new ToolbarLayout();
		tooltipFigure.setLayoutManager(layout);
		tooltipFigure.setOpaque(true);

		org.eclipse.draw2d.Label label = new org.eclipse.draw2d.Label(text);
		label.setFont(new Font(null, "Arial", 10, SWT.NORMAL));
		tooltipFigure.add(label);

		tooltipFigure.setSize(-1, -1);

		return tooltipFigure;
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