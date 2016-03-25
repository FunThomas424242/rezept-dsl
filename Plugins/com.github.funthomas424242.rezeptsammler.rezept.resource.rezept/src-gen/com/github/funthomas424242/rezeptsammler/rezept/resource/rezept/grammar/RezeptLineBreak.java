/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar;


public class RezeptLineBreak extends com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement {
	
	private final int tabs;
	
	public RezeptLineBreak(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
