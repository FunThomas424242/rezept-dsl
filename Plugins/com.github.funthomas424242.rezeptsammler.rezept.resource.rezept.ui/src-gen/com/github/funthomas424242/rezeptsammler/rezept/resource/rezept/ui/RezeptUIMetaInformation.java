/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui;

import org.eclipse.core.resources.IResource;

public class RezeptUIMetaInformation extends com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptMetaInformation {
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptHoverTextProvider getHoverTextProvider() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptHoverTextProvider();
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptImageProvider getImageProvider() {
		return com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptImageProvider.INSTANCE;
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptColorManager createColorManager() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(com.github.funthomas424242.rezeptsammler.rezept.resource.reze
	 * pt.IRezeptTextResource,
	 * com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptColorMa
	 * nager) instead.
	 */
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptTokenScanner createTokenScanner(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptColorManager colorManager) {
		return (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptTokenScanner) createTokenScanner(null, colorManager);
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.IRezeptTokenScanner createTokenScanner(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource resource, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptColorManager colorManager) {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptTokenScanner(resource, colorManager);
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptCodeCompletionHelper createCodeCompletionHelper() {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptCodeCompletionHelper();
	}
	
	@SuppressWarnings("rawtypes")
	public Object createResourceAdapter(Object adaptableObject, Class adapterType, IResource resource) {
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.debug.RezeptLineBreakpointAdapter();
	}
	
}
