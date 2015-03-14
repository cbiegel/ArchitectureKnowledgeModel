/*******************************************************************************
 * Copyright (c) 2006, 2007 Tom Schindl and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl - initial API and implementation
 *******************************************************************************/

package org.emftrace.quarc.ui.external;

import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;


/**
 * A ViewerComparator for a JFace TableViewer
 * 
 * @author Tom Schindl <tom.schindl@bestsolution.at>
 * 
 * source: http://dev.eclipse.org/viewcvs/viewvc.cgi/org.eclipse.jface.snippets/Eclipse%20JFace%20Snippets/org/eclipse/jface/snippets/viewers/Snippet040TableViewerSorting.java?view=co
 */

public abstract class ColumnViewerSorter extends ViewerComparator {
	
	public static final int ASC = 1;

	public static final int NONE = 0;

	public static final int DESC = -1;

	private int sortDirection = 0;

	private TableViewerColumn column;

	private ColumnViewer viewer;

	/**
	 * the constructor
	 * 
	 * @param viewer a ColumnViewer
	 * @param column a TableViewerColumn of the specified ColumnViewer
	 */
	public ColumnViewerSorter(ColumnViewer viewer, TableViewerColumn column) {
		this.column = column;
		this.viewer = viewer;
		this.column.getColumn().addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (ColumnViewerSorter.this.viewer.getComparator() != null) {
					if (ColumnViewerSorter.this.viewer.getComparator() == ColumnViewerSorter.this) {
						int tdirection = ColumnViewerSorter.this.sortDirection;

						if (tdirection == ASC) {
							setSorter(ColumnViewerSorter.this, DESC);
						} else if (tdirection == DESC) {
							setSorter(ColumnViewerSorter.this, NONE);
						}
					} else {
						setSorter(ColumnViewerSorter.this, ASC);
					}
				} else {
					setSorter(ColumnViewerSorter.this, ASC);
				}
			}
		});
	}

	/**
	 * sets a Sorter and sort direction
	 * @param sorter a ColumnViewerSorter
	 * @param direction the sort direction (-1 = descending, 0 = none, 1 = ascending)
	 */
	public void setSorter(ColumnViewerSorter sorter, int direction) {
		if (direction == NONE) {
			column.getColumn().getParent().setSortColumn(null);
			column.getColumn().getParent().setSortDirection(SWT.NONE);
			viewer.setComparator(null);
		} else {
			column.getColumn().getParent().setSortColumn(column.getColumn());
			sorter.sortDirection = direction;

			if (direction == ASC) {
				column.getColumn().getParent().setSortDirection(SWT.DOWN);
			} else {
				column.getColumn().getParent().setSortDirection(SWT.UP);
			}

			if (viewer.getComparator() == sorter) {
				viewer.refresh();
			} else {
				viewer.setComparator(sorter);
			}

		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ViewerComparator#compare(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	public int compare(Viewer viewer, Object e1, Object e2) {
		return sortDirection * doCompare(viewer, e1, e2);
	}

	/**
	 * Implementation of the compare 
	 * @param viewer a Viewer
	 * @param e1 the 1st object to compare
	 * @param e2 the 2nd object to compare
	 * @return the result of the compare
	 */
	protected abstract int doCompare(Viewer viewer, Object e1, Object e2);
}
