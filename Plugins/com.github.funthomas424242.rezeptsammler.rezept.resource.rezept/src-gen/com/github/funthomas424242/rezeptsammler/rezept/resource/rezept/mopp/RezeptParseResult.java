/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.ecore.EObject;

public class RezeptParseResult implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptParseResult {
	
	private EObject root;
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptLocationMap locationMap;
	
	private Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptCommand<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource>> commands = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptCommand<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource>>();
	
	public RezeptParseResult() {
		super();
	}
	
	public EObject getRoot() {
		return root;
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void setRoot(EObject root) {
		this.root = root;
	}
	
	public void setLocationMap(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptLocationMap locationMap) {
		this.locationMap = locationMap;
	}
	
	public Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptCommand<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
