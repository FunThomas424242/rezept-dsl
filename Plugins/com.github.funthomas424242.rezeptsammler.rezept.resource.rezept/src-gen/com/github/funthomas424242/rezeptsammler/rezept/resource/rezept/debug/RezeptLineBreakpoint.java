/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;

public class RezeptLineBreakpoint extends LineBreakpoint {
	
	private static final String LINE_BREAKPOINT_MARKER_ID = "com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.lineBreakpoint.marker";
	
	public RezeptLineBreakpoint() {
		super();
	}
	
	public RezeptLineBreakpoint(final IResource resource, final int lineNumber) throws DebugException {
		this(resource, lineNumber, -1, -1);
	}
	
	public RezeptLineBreakpoint(final IResource resource, final int lineNumber, final int charStart, final int charEnd) throws DebugException {
		IWorkspaceRunnable runnable = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				IMarker marker = resource.createMarker(LINE_BREAKPOINT_MARKER_ID);
				setMarker(marker);
				marker.setAttribute(IBreakpoint.ENABLED, Boolean.TRUE);
				marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
				marker.setAttribute(IMarker.CHAR_START, charStart);
				marker.setAttribute(IMarker.CHAR_END, charEnd);
				marker.setAttribute(IBreakpoint.ID, getModelIdentifier());
				marker.setAttribute(IMarker.MESSAGE, "Line Breakpoint: " + resource.getName() + " [line: " + lineNumber + "]");
				marker.setAttribute(IMarker.LOCATION, resource.getRawLocation().toPortableString());
			}
		};
		run(getMarkerRule(resource), runnable);
	}
	
	public String getModelIdentifier() {
		return com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptPlugin.DEBUG_MODEL_ID;
	}
	
	public void install(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugTarget target) {
		try {
			String location = (String) getMarker().getAttribute(IMarker.LOCATION);
			target.getDebugProxy().addLineBreakpoint(location, getLineNumber());
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	public void remove(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugTarget target) {
		try {
			String location = (String) getMarker().getAttribute(IMarker.LOCATION);
			target.getDebugProxy().removeLineBreakpoint(location, getLineNumber());
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
}
