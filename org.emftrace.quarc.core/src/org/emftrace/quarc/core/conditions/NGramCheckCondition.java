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

package org.emftrace.quarc.core.conditions;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.query.conditions.strings.StringAdapter;
import org.eclipse.emf.query.conditions.strings.StringCondition;
import org.emftrace.core.rules.util.NGramCheck;


/**
 * an StringCondition with a NGramCheckCondition
 * 
 * @author Daniel Motschmann
 *
 */
public class NGramCheckCondition extends StringCondition {

	private float minCorrelation;
	private int n;
	private String text;
	private boolean wordByWord;
	private boolean isSatisfiedIfTextIsNull;
	private Map<String, Integer> hits;

	
	
	/**
	 * 
	 * the constructor
	 * 
	 * @param n the number of subpatterns
	 * @param text the input string for the ngram check
	 * @param minCorrelation the minimal correlation
	 * @param wordByWord compare the whole string or only words of this string
	 * @param isSatisfiedIfTextIsNull condition is satisfied if input text is null
	 */
	public NGramCheckCondition(int n, String text, float minCorrelation, boolean wordByWord, boolean isSatisfiedIfTextIsNull) {
		super(new StringAdapter() {

			@Override
			public String getString(Object object) {
				return object == null? null : (String) object;
			}
			
		});
		this.minCorrelation = minCorrelation;
		this.n = n;
		this.text = text;
		this.wordByWord= wordByWord;
		this.isSatisfiedIfTextIsNull = isSatisfiedIfTextIsNull;		
		this.hits = new HashMap<String, Integer>();
	}

	
	/**
	 * @return a map with the found matched words
	 */
	public Map<String, Integer> getLastHits(){
		return hits;
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.query.conditions.strings.StringCondition#isSatisfied(java.lang.String)
	 */
	@Override
	public boolean isSatisfied(String term) {
		
		hits.clear();
		try {
			

	if (text== null || text == "" )
			return isSatisfiedIfTextIsNull;
		if (wordByWord){
			boolean result = false;
			for (String word : splitTerm(term)){
				result = result || compareWords(n, text, word, minCorrelation);
			}
			return result;
		} else 
		return compareWords(n, text, term, minCorrelation);
		} catch (Exception e) {
		
			e.printStackTrace();
			return false;
		}
	
	}

	/**
	 * compare two words with the ngram allgorithm
	 * @param n the number of subpatterns
	 * @param text1 the 1st string
	 * @param text2 the 2nd string 
	 * @param minCorrelation the minimal correlation
	 * @return the result of the ngram check
	 */
	private boolean compareWords(int n, String text1, String text2,
			float minCorrelation) {
		if (text2 == null)
			return false;
		boolean result = (text2.length() == 1 || text1.length() == 1? text2.equals(text1) : NGramCheck.compareWords(n, text1, text2, minCorrelation));
		putHit(text2);
		return result;
	}
	
	/**
	 * puts a matched word into cache
	 * 
	 * @param text a matched word
	 */
	private void putHit(String text) {
		if (hits.containsKey(text))
			hits.put(text, hits.get(text));
		 else
			 hits.put(text, 1);
	}

	/**
	 * splits the string into an Array with words
	 * 
	 * @param term
	 *            the term          
	 * @return the list of words
	 */
	protected static String[] splitTerm(String term) {
		if (term == null)
			return null;
		return term.split(" ");
	}


}
