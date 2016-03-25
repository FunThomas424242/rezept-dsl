/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;

public class RezeptDebugVariable extends com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugElement implements IVariable {
	
	private String name;
	private IValue value;
	private String referenceTypeName;
	
	public RezeptDebugVariable(IDebugTarget debugTarget, String name, IValue value, String referenceTypeName) {
		super(debugTarget);
		this.name = name;
		this.value = value;
		this.referenceTypeName = referenceTypeName;
	}
	
	public boolean supportsValueModification() {
		return false;
	}
	
	public void setValue(IValue value) throws DebugException {
		throw new DebugException(new Status(IStatus.ERROR, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptPlugin.PLUGIN_ID, "Can't set variable."));
	}
	
	public void setValue(String expression) throws DebugException {
		throw new DebugException(new Status(IStatus.ERROR, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptPlugin.PLUGIN_ID, "Can't set variable."));
	}
	
	public boolean verifyValue(IValue value) throws DebugException {
		throw new DebugException(new Status(IStatus.ERROR, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptPlugin.PLUGIN_ID, "Can't set variable."));
	}
	
	public boolean verifyValue(String expression) throws DebugException {
		throw new DebugException(new Status(IStatus.ERROR, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptPlugin.PLUGIN_ID, "Can't set variable."));
	}
	
	public IValue getValue() throws DebugException {
		return value;
	}
	
	public String getName() throws DebugException {
		return name;
	}
	
	public String getReferenceTypeName() throws DebugException {
		return referenceTypeName;
	}
	
	public boolean hasValueChanged() throws DebugException {
		return true;
	}
	
}
