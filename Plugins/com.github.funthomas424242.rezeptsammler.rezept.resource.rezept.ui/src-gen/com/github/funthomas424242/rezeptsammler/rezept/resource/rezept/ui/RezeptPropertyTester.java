/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.ui.part.FileEditorInput;

public class RezeptPropertyTester extends PropertyTester {
	
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (receiver instanceof IResource) {
			IResource resource = (IResource) receiver;
			return hasMatchingURI(resource);
		} else if (receiver instanceof FileEditorInput) {
			FileEditorInput editorInput = (FileEditorInput) receiver;
			IFile file = editorInput.getFile();
			return hasMatchingURI(file);
		}
		return false;
	}
	
	private boolean hasMatchingURI(IResource resource) {
		String path = resource.getLocationURI().getPath();
		return path.endsWith("." + new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptMetaInformation().getSyntaxName());
	}
	
}
