/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept;


/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IRezeptCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
