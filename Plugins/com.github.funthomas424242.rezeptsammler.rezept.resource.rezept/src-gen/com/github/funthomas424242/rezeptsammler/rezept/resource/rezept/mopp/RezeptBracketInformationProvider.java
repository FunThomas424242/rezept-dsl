/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.util.ArrayList;
import java.util.Collection;

/**
 * This class provides information about how brackets must be handled in the
 * editor (e.g., whether they must be closed automatically).
 */
public class RezeptBracketInformationProvider {
	
	public Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptBracketPair> getBracketPairs() {
		Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptBracketPair> result = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptBracketPair>();
		result.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptBracketPair("{", "}", true, true));
		result.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptBracketPair("\"", "\"", false, false));
		return result;
	}
	
}
