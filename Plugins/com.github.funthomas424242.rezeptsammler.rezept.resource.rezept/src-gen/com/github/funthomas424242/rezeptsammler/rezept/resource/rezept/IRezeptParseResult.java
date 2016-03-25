/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept;

import java.util.Collection;
import org.eclipse.emf.ecore.EObject;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IRezeptParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptCommand<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource>> getPostParseCommands();
	
	/**
	 * Returns a map that can be used to retrieve the position of objects in the
	 * parsed text.
	 */
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptLocationMap getLocationMap();
	
}
