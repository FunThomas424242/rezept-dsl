/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui;

import org.eclipse.emf.ecore.EObject;

public class RezeptHoverTextProvider implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptHoverTextProvider {
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptDefaultHoverTextProvider defaultProvider = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptDefaultHoverTextProvider();
	
	public String getHoverText(EObject container, EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
