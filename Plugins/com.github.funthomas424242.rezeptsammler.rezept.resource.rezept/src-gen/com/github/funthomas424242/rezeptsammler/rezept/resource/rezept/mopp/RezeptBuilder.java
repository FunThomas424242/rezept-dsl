/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;

public class RezeptBuilder implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptBuilder {
	
	public boolean isBuildingNeeded(URI uri) {
		// Change this to return true to enable building of all resources.
		return false;
	}
	
	public IStatus build(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptResource resource, IProgressMonitor monitor) {
		// Set option 'overrideBuilder' to 'false' and then perform build here.
		
		// We use one tick from the parent monitor because the BuilderAdapter reserves one
		// tick for the Builder.
		SubProgressMonitor subMonitor = new SubProgressMonitor(monitor, 1);
		subMonitor.beginTask("Building " + resource.getURI().lastSegment(), 10);
		// The actual work of the builder can be performed here.
		subMonitor.worked(10);
		subMonitor.done();
		return Status.OK_STATUS;
	}
	
	/**
	 * Handles the deletion of the given resource.
	 */
	public IStatus handleDeletion(URI uri, IProgressMonitor monitor) {
		// by default nothing is done when a resource is deleted
		return Status.OK_STATUS;
	}
	
}
