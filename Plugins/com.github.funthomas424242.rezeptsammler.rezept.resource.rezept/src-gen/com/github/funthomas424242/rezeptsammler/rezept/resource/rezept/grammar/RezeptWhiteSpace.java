/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar;


public class RezeptWhiteSpace extends com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptFormattingElement {
	
	private final int amount;
	
	public RezeptWhiteSpace(int amount, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
