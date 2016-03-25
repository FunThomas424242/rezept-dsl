/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStreamsProxy;

public class RezeptDebugProcess extends com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugElement implements IProcess, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.IRezeptDebugEventListener {
	
	private ILaunch launch;
	
	private boolean terminated = false;
	
	public RezeptDebugProcess(ILaunch launch) {
		super(launch.getDebugTarget());
		this.launch = launch;
	}
	
	public boolean canTerminate() {
		return !terminated;
	}
	
	public boolean isTerminated() {
		return terminated;
	}
	
	public void terminate() throws DebugException {
		terminated = true;
	}
	
	public String getLabel() {
		return null;
	}
	
	public ILaunch getLaunch() {
		return launch;
	}
	
	public IStreamsProxy getStreamsProxy() {
		return null;
	}
	
	public void setAttribute(String key, String value) {
	}
	
	public String getAttribute(String key) {
		return null;
	}
	
	public int getExitValue() throws DebugException {
		return 0;
	}
	
	public void handleMessage(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage message) {
		if (message.hasType(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes.TERMINATED)) {
			terminated = true;
		} else {
			// ignore other events
		}
	}
	
}
