/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug;

import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IDebugTarget;

public abstract class RezeptDebugElement extends DebugElement {
	
	/**
	 * Constructs a new debug element in the given target.
	 */
	public RezeptDebugElement(IDebugTarget target) {
		super(target);
	}
	
	public String getModelIdentifier() {
		return com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptPlugin.DEBUG_MODEL_ID;
	}
	
	/**
	 * <p>
	 * Returns the breakpoint manager.
	 * </p>
	 * 
	 * @return the breakpoint manager
	 */
	protected IBreakpointManager getBreakpointManager() {
		return DebugPlugin.getDefault().getBreakpointManager();
	}
	
}
