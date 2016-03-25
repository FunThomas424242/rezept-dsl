/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;


/**
 * A single pair of brackets.
 */
public class RezeptBracketPair implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptBracketPair {
	
	private String openingBracket;
	
	private String closingBracket;
	
	private boolean closingEnabledInside;
	
	private boolean closeAfterEnter;
	
	public String getOpeningBracket() {
		return openingBracket;
	}
	
	public String getClosingBracket() {
		return closingBracket;
	}
	
	public boolean isClosingEnabledInside() {
		return closingEnabledInside;
	}
	
	public boolean isCloseAfterEnter() {
		return closeAfterEnter;
	}
	
	public void setOpeningBracket(String openingBracket) {
		this.openingBracket = openingBracket;
	}
	
	public void setClosingBracket(String closingBracket) {
		this.closingBracket = closingBracket;
	}
	
	public void setClosingEnabledInside(boolean closingEnabledInside) {
		this.closingEnabledInside = closingEnabledInside;
	}
	
	public void setCloseAfterEnter(boolean closeAfterEnter) {
		this.closeAfterEnter = closeAfterEnter;
	}
	
	public RezeptBracketPair(String openingBracket, String closingBracket, boolean closingEnabledInside, boolean closeAfterEnter) {
		super();
		this.openingBracket = openingBracket;
		this.closingBracket = closingBracket;
		this.closingEnabledInside = closingEnabledInside;
		this.closeAfterEnter = closeAfterEnter;
	}
	
}
