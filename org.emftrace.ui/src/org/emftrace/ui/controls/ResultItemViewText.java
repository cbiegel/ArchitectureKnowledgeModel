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

package org.emftrace.ui.controls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;



/**
 * Widget for a text based visualization for a ModelElement and found matches
 * 
 * @author Daniel Motschmann
 * @version 1.0
 */
public class ResultItemViewText extends AbstractResultItemView{
	
	/**
	 * 
	 */
	protected String filteredWord;
	
	/**
	 * 
	 */
	protected StyledText styledText;

	/**
	 * the constructor 
	 * @param parent a parent composite
	 * @param style the SWT style
	 */
	public ResultItemViewText(Composite parent, int style) {
		super(parent, style);
		styledText = new StyledText(parent, style);
		styledText.setEditable(false);
		styledText.setWordWrap(true);
		styledText.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_INFO_BACKGROUND));
	}
	
	
	
	/* (non-Javadoc)
	 * @see emffit_controls.resultview.AbstractResultItemView#setItemToDisplay(java.lang.String, emffit_controls.providers.FilteredContentProviderResultItem)
	 */
	public void setItemToDisplay(FilteredContentProviderResultItem item){	
		this.item = item;

		displayHits(this.item);
	}
	
	/* (non-Javadoc)
	 * @see emffit_controls.resultview.AbstractResultItemView#setLayoutData(org.eclipse.swt.layout.GridData)
	 */
	@Override
	public void setLayoutData(GridData data){
		styledText.setLayoutData(data);	
	}
	
	/* (non-Javadoc)
	 * @see emffit_controls.resultview.AbstractResultItemView#displayHits(java.lang.String, emffit_controls.providers.FilteredContentProviderResultItem)
	 */
	@Override
	protected void displayHits(FilteredContentProviderResultItem item) {

		styledText.setText("");
		
		//generate a list with all hits
		HashMap<String, Integer> hitList = new HashMap<String, Integer>();
		List<Integer> attributeLines = new ArrayList<Integer>();

		if (item != null && item.getHits() != null) {

			for (Entry<String, List<String>> entry : item.getHits().entrySet()) {
				List<String> hittedList = entry.getValue();
				for (String str : hittedList) {
					if (str != null)
						str = str.toLowerCase();
					if (hitList.containsKey(str)) {
						int oldHitCount = hitList.get(str);
						hitList.remove(str);
						hitList.put(str, oldHitCount + 1);
					} else {
						hitList.put(str, 1);
					}
				}
			}
		}

		//display head 
		List<StyleRange> ranges = new ArrayList<StyleRange>();

		String headText;
		if (hitList.size() > 0) {
			headText = "following results are marked:\n";
			int hitId = 0;
			for (Entry<String, Integer> hitEntry : hitList.entrySet()) {
				int startOffset = headText.length();
				headText += hitEntry.getKey();
				if ((hitId < hitList.size()-1))
					headText += ",\n";
				ranges.add(createFoundStyleRange(startOffset, hitEntry.getKey()
						.length(), getColorForHitId(hitId)));
				hitId += 1;
			}
			headText += "\n\n";
		} else {
			headText = "";
		}

		//generate the body
		String displayedText ="";
		if (item != null) {

			for (Entry<String, String> entry : item.getContent().entrySet()) {
				String attributeName = entry.getKey();
				String attributeStringValue;
				if (entry.getValue() != null){
					 attributeStringValue = entry.getValue();
				} else {
					attributeStringValue  = "";
				}
				int offset = displayedText.length() + headText.length();
				final String attributeLabel = "attribute: ";
				ranges.add(createAttributeLabelStyle(offset, attributeLabel
						.length() + 1));
				displayedText += attributeLabel;

				offset = displayedText.length() + headText.length();
				ranges.add(createAttributeNameStyle(offset, attributeName
						.length()));
				displayedText += attributeName + "\n";

				attributeLines.add((headText+displayedText).split("\n").length-1);

				offset = displayedText.length() + headText.length();
				ranges.add(createAttributeValueStyle(offset,
						attributeStringValue.length()));
				displayedText += attributeStringValue + "\n\n";

				int hitId = 0;
				for (Entry<String, Integer> hitEntry : hitList.entrySet()) {

					String matchedWord = hitEntry.getKey();
					String lowerCaseAttributeStringValue = attributeStringValue.toLowerCase();
					String lowerCaseMatchedWord = matchedWord.toLowerCase();

					int i = 0;
					if (lowerCaseMatchedWord!= null && lowerCaseMatchedWord != "")
					while (lowerCaseAttributeStringValue.indexOf(
							lowerCaseMatchedWord, i) > -1) {
						//System.out.println("i="+i);
					//	System.out.println("lowerCaseMatchedWord="+lowerCaseMatchedWord);
						int foundAt = lowerCaseAttributeStringValue
								.indexOf(lowerCaseMatchedWord, i)
								+ offset;
						int length = matchedWord.length();
						ranges.add(createFoundStyleRange(foundAt, length,
								getColorForHitId(hitId)));
						i = foundAt - offset + length;

					}
					hitId += 1;
				}
				
				

			}
		} else {
			displayedText = "no item selected";
		}

		//set text
		styledText.setText(headText + displayedText);
		
		//set styles for all found hits
		for (StyleRange styleRange : ranges) {
			styledText.setStyleRange(styleRange);
		}
		//set styles for all lines with attribute names
		for (int lineNumber : attributeLines) {
			styledText.setLineBackground(lineNumber, 1, Display.getCurrent()
					.getSystemColor(SWT.COLOR_GRAY));
		}

	}

	/**
	 * Array with different colors to highlight matches
	 */
	final int[] colors = { SWT.COLOR_YELLOW, SWT.COLOR_CYAN, SWT.COLOR_MAGENTA,
			SWT.COLOR_GREEN, SWT.COLOR_BLUE };

	/**
	 * get a color for highlight the matched word
	 * @param hitId an index for the matched word
	 * @return the color
	 */
	private int getColorForHitId(int hitId) {
		hitId = hitId % colors.length;
		return colors[hitId];
	}

	/**
	 * creates StyleRange at the specified position with the specified color 
	 * @param start the start of the range
	 * @param length the length of the range
	 * @param swtColorConst a constant for a SWT color
	 * @return the created StyleRange
	 */
	private StyleRange createFoundStyleRange(int start, int length,
			int swtColorConst) {
		return new StyleRange(start, length, null, Display.getDefault()
				.getSystemColor(swtColorConst));
	}

	/**
	 * creates StyleRange at the specified position for an attribute label
	 * @param start the start of the range
	 * @param length the length of the range
	 * @return the created StyleRange
	 */
	private StyleRange createAttributeLabelStyle(int start, int length) {
		StyleRange result = new StyleRange(start, length, null, null);
		result.fontStyle = SWT.ITALIC;
		return result;
	}

	/**
	 * creates StyleRange at the specified position for an attribute name
	 * @param start the start of the range
	 * @param length the length of the range
	 * @return the created StyleRange
	 */
	private StyleRange createAttributeNameStyle(int start, int length) {
		StyleRange result = new StyleRange(start, length, null, null);
		result.fontStyle = SWT.BOLD;
		return result;
	}

	/**
	 * creates StyleRange at the specified position for an attribute value
	 * @param start the start of the range
	 * @param length the length of the range
	 * @return the created StyleRange
	 */
	private StyleRange createAttributeValueStyle(int start, int length) {
		StyleRange result = new StyleRange(start, length, null, null);
		return result;
	}


	/**
	 * setter for the tooltip
	 * @param tooltip the new tooltip string
	 */
	public void setToolTipText(String tooltip) {
		styledText.setToolTipText(tooltip);
		
	}
}
