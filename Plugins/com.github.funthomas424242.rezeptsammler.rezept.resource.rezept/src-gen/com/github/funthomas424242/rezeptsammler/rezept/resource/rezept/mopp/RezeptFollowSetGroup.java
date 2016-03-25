/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * This class is used when computing code completion proposals to group a set of
 * expected elements which belong to the same follow set.
 */
public class RezeptFollowSetGroup {
	
	private List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal> expectedTerminals = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal>();
	
	public void add(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal expectedTerminal) {
		expectedTerminals.add(expectedTerminal);
	}
	
	public List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal> getExpectedTerminals() {
		return expectedTerminals;
	}
	
	public int getStartExcludingHiddenTokens() {
		int lastStart = -1;
		for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal expectedTerminal : expectedTerminals) {
			int nextStart = expectedTerminal.getStartExcludingHiddenTokens();
			if (lastStart < 0) {
				lastStart = nextStart;
			} else if (lastStart != nextStart) {
				System.err.println("Found terminals in same follow set with different start.");
			}
		}
		
		return lastStart;
	}
	
	public EClass getRule() {
		EClass lastRule = null;
		for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal expectedTerminal : expectedTerminals) {
			EClass nextRule = expectedTerminal.getTerminal().getRuleMetaclass();
			if (lastRule == null) {
				lastRule = nextRule;
			} else if (lastRule != nextRule) {
				System.err.println("Found terminals in same follow set with different rule.");
			}
		}
		
		return lastRule;
	}
	
	public boolean hasSameStartExcludingHiddenTokens(int lastStartExcludingHiddenTokens) {
		if (lastStartExcludingHiddenTokens < 0) {
			return false;
		}
		
		return lastStartExcludingHiddenTokens == getStartExcludingHiddenTokens();
	}
	
	public boolean hasDifferentRule(EClass lastRule) {
		if (lastRule == null) {
			return true;
		}
		
		return lastRule != getRule();
	}
	
	public EObject getContainer() {
		EObject lastContainer = null;
		for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal expectedTerminal : expectedTerminals) {
			EObject nextContainer = expectedTerminal.getContainer();
			if (lastContainer == null) {
				lastContainer = nextContainer;
			} else if (lastContainer != nextContainer) {
				System.err.println("Found terminals in same follow set with different container.");
			}
		}
		
		return lastContainer;
	}
	
	@Override
	public String toString() {
		return "RezeptFollowSetGroup" + expectedTerminals;
	}
	
}
