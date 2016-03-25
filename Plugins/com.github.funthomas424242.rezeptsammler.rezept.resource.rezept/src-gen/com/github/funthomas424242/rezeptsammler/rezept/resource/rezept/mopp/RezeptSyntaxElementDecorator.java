/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.util.ArrayList;
import java.util.List;

public class RezeptSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private RezeptSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private List<Integer> indicesToPrint = new ArrayList<Integer>();
	
	public RezeptSyntaxElementDecorator(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement decoratedElement, RezeptSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.grammar.RezeptSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public RezeptSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
