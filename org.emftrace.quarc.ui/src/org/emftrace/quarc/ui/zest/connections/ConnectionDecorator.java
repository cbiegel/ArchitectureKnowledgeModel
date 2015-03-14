
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

package org.emftrace.quarc.ui.zest.connections;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
//import org.eclipse.emf.emfstore.common.model.util.ModelElementChangeListener;
import org.eclipse.emf.ecp.edit.spi.util.ECPModelElementChangeListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.emftrace.metamodel.QUARCModel.GSS.Decomposition;
import org.emftrace.metamodel.QUARCModel.GSS.Element;
import org.emftrace.metamodel.QUARCModel.GSS.Impact;
import org.emftrace.metamodel.QUARCModel.GSS.Offset;
import org.emftrace.metamodel.QUARCModel.GSS.Relation;
import org.emftrace.metamodel.QUARCModel.GSS.isA;
import org.emftrace.metamodel.QUARCModel.Query.Rating;
import org.emftrace.quarc.ui.helpers.DefaultColors;


/**
 * Decorator for Zest GraphConnections in the style of URN/GRL (see Rec. ITU-T
 * Z.151 (11/2008) page 27)
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class ConnectionDecorator {

	/**
	 * decorates the specified GraphConnection in style of URN, add a text for
	 * weight and a tooltip for the Element
	 * 
	 * @param connection
	 *            the GraphConnection to decorate
	 * @param relation
	 *            the Relation for the GraphConnection
	 * @param source
	 *            the source Element of the Relation
	 * @param target
	 *            the target Element of the Relation
	 * @param weight
	 *            the weight of the Relation
	 */
	public static void decoradeConnection(final GraphConnection connection,
			final Relation relation, Element source, Element target, String weight) {		
		
		float fWeight = weight != null? Float.valueOf(weight) : 0;
		
		connection.setLineColor(ColorConstants.black);

		connection.setLineWidth(1);

		if (weight != null)
		connection.setLineColor( DefaultColors.getConnectionColor(fWeight));
		
		if (relation instanceof Offset)
			connection.setLineStyle(SWT.LINE_DASH);
		
		decorateWithWeight(connection, weight);
		
		connection.setTooltip(createTooltipFigure(connection, relation, source, target, weight)); 
		if (relation instanceof Decomposition) {
			drawDecompositionConnectionEnd(connection);

		} else if (relation instanceof Impact || relation instanceof Offset) {
			
			if (fWeight < -75.0f) {
				decorateWithBrakeFigure(connection);
			}
				else	if (fWeight < -25.0f) {
					decorateWithSomeNegativeFigure(connection);
				}
				else	if (fWeight < -0.0f) {
					decorateWithHurtsFigure(connection);
				}
				else	if (fWeight == 0.0f) {
					decorateWithUnknownFigure(connection);
				}
				else	if (fWeight <= 25.0f) {
					decorateWithHelpsFigure(connection);
				}
				else	if (fWeight <= 75.0f) {
					decorateWithSomePositiveFigure(connection);
				}
				else {
					decorateWithMakeFigure(connection);
				}
	
		}

		final ECPModelElementChangeListener ecpModelElementChangeListener = new ECPModelElementChangeListener(relation) {
			
			@Override
			public void onChange(Notification notification) {
				if (relation instanceof Impact)
				decoradeConnection(connection, relation, relation.getSource(), relation.getTarget(), ((Impact)relation).getWeight());
				else
				if (relation instanceof Offset)
				decoradeConnection(connection, relation, relation.getSource(), relation.getTarget(), ((Offset)relation).getValue());
				else
				if (relation instanceof Rating)
				decoradeConnection(connection, relation, relation.getSource(), relation.getTarget(), ((Rating)relation).getWeight());
				else

				decoradeConnection(connection, relation, relation.getSource(), relation.getTarget(), "");
				
			}
		};

		relation.addModelElementChangeListener(ecpModelElementChangeListener);
		
		connection.addDisposeListener( new DisposeListener() {
			
			@Override
			public void widgetDisposed(DisposeEvent e) {
				relation.removeModelElementChangeListener(ecpModelElementChangeListener);
				
			}
		});
	}
	private static Font decoractionFontTiny= new Font(null, "Arial", 6, SWT.NONE);
	private static Font decoractionFontSmall= new Font(null, "Arial", 8, SWT.NONE);
	private static Font decoractionFontNormal= new Font(null, "Arial", 10, SWT.BOLD);
	private static Font decoractionFontLarge= new Font(null, "Arial", 12, SWT.BOLD);
	
	/**
	 * decorates the GraphConnection with the following figure:<br>
	 * <br>
	 * ?<br>
	 * <br>
	 * see Rec. ITU-T Z.151 (11/2008) page 27<br>
	 * <br>
	 * 
	 * @param connection
	 *            a GraphConnection
	 */
	private static void decorateWithWeight(
			GraphConnection connection, String weight) {

		ConnectionEndpointLocator relationshipLocator = new ConnectionEndpointLocator(
				(PolylineConnection) connection.getConnectionFigure(), true);
		relationshipLocator.setUDistance(0);
		relationshipLocator.setVDistance(10);

		Figure decoractionFigure = new Figure();

		ToolbarLayout layout = new ToolbarLayout();
		decoractionFigure.setLayoutManager(layout);
		decoractionFigure.setOpaque(false);

		Label weightLabel = new Label(weight);
		weightLabel.setFont(decoractionFontSmall);
		decoractionFigure.add(weightLabel);

		decoractionFigure.setSize(-1, -1);
		((PolylineConnection) connection.getConnectionFigure()).add(
				decoractionFigure, relationshipLocator);

	}

	/**
	 * decorates the GraphConnection with the following figure:<br>
	 * <br>
	 * _<br>
	 * <br>
	 * see Rec. ITU-T Z.151 (11/2008) page 27<br>
	 * <br>
	 * 
	 * @param connection
	 *            a GraphConnection
	 */
	private static void decorateWithSomeNegativeFigure(
			GraphConnection connection) {

		ConnectionEndpointLocator relationshipLocator = new ConnectionEndpointLocator(
				(PolylineConnection) connection.getConnectionFigure(), true);
		relationshipLocator.setUDistance(10);
		relationshipLocator.setVDistance(10);

		Figure decoractionFigure = new Figure();

		ToolbarLayout layout = new ToolbarLayout();
		decoractionFigure.setLayoutManager(layout);
		decoractionFigure.setOpaque(false);

		Label minusLabel = new Label("_");
		minusLabel.setFont(decoractionFontLarge);
		decoractionFigure.add(minusLabel);

		decoractionFigure.setSize(-1, -1);
		((PolylineConnection) connection.getConnectionFigure()).add(
				decoractionFigure, relationshipLocator);

	}
	
	/**
	 * decorates the GraphConnection with the following figure:<br>
	 * <br>
	 * ?<br>
	 * <br>
	 * see Rec. ITU-T Z.151 (11/2008) page 27<br>
	 * <br>
	 * 
	 * @param connection
	 *            a GraphConnection
	 */
	private static void decorateWithUnknownFigure(
			GraphConnection connection) {

		ConnectionEndpointLocator relationshipLocator = new ConnectionEndpointLocator(
				(PolylineConnection) connection.getConnectionFigure(), true);
		relationshipLocator.setUDistance(10);
		relationshipLocator.setVDistance(10);

		Figure decoractionFigure = new Figure();

		ToolbarLayout layout = new ToolbarLayout();
		decoractionFigure.setLayoutManager(layout);
		decoractionFigure.setOpaque(false);

		Label minusLabel = new Label("?");
		minusLabel.setFont(decoractionFontLarge);
		decoractionFigure.add(minusLabel);

		decoractionFigure.setSize(-1, -1);
		((PolylineConnection) connection.getConnectionFigure()).add(
				decoractionFigure, relationshipLocator);

	}

	/**
	 * decorates the GraphConnection with the following figure:<br>
	 * <br>
	 * +<br>
	 * <br>
	 * see Rec. ITU-T Z.151 (11/2008) page 27<br>
	 * <br>
	 * 
	 * @param connection
	 *            a GraphConnection
	 */
	private static void decorateWithSomePositiveFigure(
			GraphConnection connection) {

		ConnectionEndpointLocator relationshipLocator = new ConnectionEndpointLocator(
				(PolylineConnection) connection.getConnectionFigure(), true);
		relationshipLocator.setUDistance(10);
		relationshipLocator.setVDistance(10);

		Figure decoractionFigure = new Figure();

		ToolbarLayout layout = new ToolbarLayout();
		decoractionFigure.setLayoutManager(layout);
		decoractionFigure.setOpaque(false);

		Label plusLabel = new Label("+");
		plusLabel.setFont(decoractionFontLarge);
		decoractionFigure.add(plusLabel);

		decoractionFigure.setSize(-1, -1);
		((PolylineConnection) connection.getConnectionFigure()).add(
				decoractionFigure, relationshipLocator);

	}

	/**
	 * decorates the end of the GraphConnection with the following figure (by
	 * replacing the arrow)<br>
	 * <br>
	 *    |<br>
	 * -- +------------<br>
	 *    |<br>
	 * <br>
	 * see Rec. ITU-T Z.151 (11/2008) page 45<br>
	 * <br>
	 * note: the AND, IOR or XOR figure will be drawn on the ElementFigure by a
	 * Builder if required<br>
	 * <br>
	 * 
	 * @param connection
	 *            a GraphConnection
	 */
	private static void drawDecompositionConnectionEnd(
			GraphConnection connection) {
		PolygonDecoration decoration = new PolygonDecoration();

		PointList decorationPointList = new PointList();
		decorationPointList.addPoint(0, 0);
		decorationPointList.addPoint(-1, 0);
		decorationPointList.addPoint(-1, -2);
		decorationPointList.addPoint(-1, +2);
		decorationPointList.addPoint(-1, 0);
		decoration.setTemplate(decorationPointList);

		((PolylineConnection) connection.getConnectionFigure())
				.setTargetDecoration(decoration);

	}

	/**
	 * decorates the GraphConnection with the following figure:<br>
	 * <br>
	 * _<br>
	 * â—�<br>
	 * <br>
	 * see Rec. ITU-T Z.151 (11/2008) page 27<br>
	 * <br>
	 * 
	 * @param connection
	 *            a GraphConnection
	 */
	private static void decorateWithHurtsFigure(GraphConnection connection) {

		ConnectionEndpointLocator relationshipLocator = new ConnectionEndpointLocator(
				(PolylineConnection) connection.getConnectionFigure(), true);
		relationshipLocator.setUDistance(10);
		relationshipLocator.setVDistance(10);

		Figure decoractionFigure = new Figure();

		ToolbarLayout layout = new ToolbarLayout();
		decoractionFigure.setLayoutManager(layout);
		decoractionFigure.setOpaque(false);

		Label upperHurtLabel = new Label("_");
		upperHurtLabel.setFont(decoractionFontLarge);
		decoractionFigure.add(upperHurtLabel);

		Label lowerHurtLabel = new Label("\u25CF"); // = "â—�"
		lowerHurtLabel.setFont(decoractionFontTiny);
		decoractionFigure.add(lowerHurtLabel);
		decoractionFigure.setSize(-1, -1);
		((PolylineConnection) connection.getConnectionFigure()).add(
				decoractionFigure, relationshipLocator);

	}

	/**
	 * decorates the GraphConnection with the following figure:<br>
	 * <br>
	 * +<br>
	 * â—�<br>
	 * <br>
	 * see Rec. ITU-T Z.151 (11/2008) page 27<br>
	 * <br>
	 * 
	 * @param connection
	 *            a GraphConnection
	 */
	private static void decorateWithHelpsFigure(GraphConnection connection) {

		ConnectionEndpointLocator relationshipLocator = new ConnectionEndpointLocator(
				(PolylineConnection) connection.getConnectionFigure(), true);
		relationshipLocator.setUDistance(10);
		relationshipLocator.setVDistance(10);

		Figure decoractionFigure = new Figure();

		ToolbarLayout layout = new ToolbarLayout();
		decoractionFigure.setLayoutManager(layout);
		decoractionFigure.setOpaque(false);

		Label upperHelpLabel = new Label("+");
		upperHelpLabel.setFont(decoractionFontLarge);
		decoractionFigure.add(upperHelpLabel);

		Label lowerHelpLabel = new Label("\u25CF"); // = "â—�"
		lowerHelpLabel.setFont(decoractionFontTiny);
		decoractionFigure.add(lowerHelpLabel);
		decoractionFigure.setSize(-1, -1);
		((PolylineConnection) connection.getConnectionFigure()).add(
				decoractionFigure, relationshipLocator);
	}

	
	/**
	 * decorates the GraphConnection with the following figure:<br>
	 * <br>
	 * â—�<br>
	 * +<br>
	 * <br>
	 * see Rec. ITU-T Z.151 (11/2008) page 27<br>
	 * <br>
	 * 
	 * @param connection
	 *            a GraphConnection
	 */
	private static void decorateWithMakeFigure(GraphConnection connection) {

		ConnectionEndpointLocator relationshipLocator = new ConnectionEndpointLocator(
				(PolylineConnection) connection.getConnectionFigure(), true);
		relationshipLocator.setUDistance(10);
		relationshipLocator.setVDistance(10);

		Figure decoractionFigure = new Figure();

		ToolbarLayout layout = new ToolbarLayout();
		decoractionFigure.setLayoutManager(layout);
		decoractionFigure.setOpaque(false);

		Label upperHelpLabel = new Label("\u25CF"); // = "â—�"
		upperHelpLabel.setFont(decoractionFontSmall);
		decoractionFigure.add(upperHelpLabel);
		
		Label lowerHelpLabel = new Label("+");
		lowerHelpLabel.setFont(decoractionFontLarge);
		decoractionFigure.add(lowerHelpLabel);
		
		decoractionFigure.setSize(-1, -1);
		((PolylineConnection) connection.getConnectionFigure()).add(
				decoractionFigure, relationshipLocator);
	}
	
	
	/**
	 * decorates the GraphConnection with the following figure:<br>
	 * <br>
	 * â—�<br>
	 * -<br>
	 * <br>
	 * see Rec. ITU-T Z.151 (11/2008) page 27<br>
	 * <br>
	 * 
	 * @param connection
	 *            a GraphConnection
	 */
	private static void decorateWithBrakeFigure(GraphConnection connection) {

		ConnectionEndpointLocator relationshipLocator = new ConnectionEndpointLocator(
				(PolylineConnection) connection.getConnectionFigure(), true);
		relationshipLocator.setUDistance(10);
		relationshipLocator.setVDistance(10);

		Figure decoractionFigure = new Figure();

		ToolbarLayout layout = new ToolbarLayout();
		decoractionFigure.setLayoutManager(layout);
		decoractionFigure.setOpaque(false);

		Label upperHelpLabel = new Label("\u25CF"); // = "â—�"
		upperHelpLabel.setFont(decoractionFontSmall);
		decoractionFigure.add(upperHelpLabel);
		
		Label lowerHelpLabel = new Label("-");
		lowerHelpLabel.setFont(decoractionFontLarge);
		decoractionFigure.add(lowerHelpLabel);
		
		decoractionFigure.setSize(-1, -1);
		((PolylineConnection) connection.getConnectionFigure()).add(
				decoractionFigure, relationshipLocator);
	}

	
	
	/**
	 * create a Figure for a tooltip for the Relation of a GraphNode
	 * @param connection the GraphConnection to decorate
	 * @param relation the Relation represented by the GraphConnection
	 * @param source the source Element of the Relation
	 * @param target the target Element of the Relation
	 * @param weight the weight of the Relation
	 * @return the created Figure
	 */
	private static IFigure createTooltipFigure(GraphConnection connection,
			Relation relation, Element source, Element target, String weight) {
		
		Figure tooltipFigure = new Figure();

		ToolbarLayout layout = new ToolbarLayout();
		tooltipFigure.setLayoutManager(layout);
		tooltipFigure.setOpaque(true);
		
		String relationType = "";
	if (relation instanceof Impact){
		relationType = "Impact";
	} else 	if (relation instanceof Decomposition){
		relationType = "Decomposition";
	} else 	if (relation instanceof isA){
		relationType = "IsA";
		} else 	if (relation instanceof Offset){
			relationType = "Offset";
		}  else  {
			relationType = "Relation";
		}
		
	
		String sourceName = source != null? source.getName() : "";
		String targetName = target != null? target.getName() : "";;
		
		String tooltipText = "";
		//3 free spaces before and behind each line start and line end due to ascetic reasons (prevent text to border on tooltip bounds)
		tooltipText += "\n";
		tooltipText += "   Source:\t"+ sourceName+"   \n";
		tooltipText += "   Target:\t"+ targetName+"   \n";
		
		if (weight != ""){
			tooltipText += "   Weight:\t"+ weight+"   \n";	
		}
		
		Label titleLabel = new Label("   "+relationType+"   ");
		titleLabel.setFont(decoractionFontLarge);

		tooltipFigure.add(titleLabel);

		Label valuesLabel = new Label(tooltipText);
		valuesLabel.setFont(decoractionFontNormal);
		tooltipFigure.add(valuesLabel);
		tooltipFigure.setSize(-1, -1);	
		
		return tooltipFigure;
	}



}
