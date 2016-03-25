/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug;

import java.util.List;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;

public class RezeptDebugThread extends com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugElement implements IThread, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.IRezeptDebugEventListener {
	
	private boolean suspended = false;
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugTarget debugTarget;
	
	public RezeptDebugThread(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugTarget target) {
		super(target);
		this.debugTarget = target;
	}
	
	public IBreakpoint[] getBreakpoints() {
		return null;
	}
	
	public String getName() throws DebugException {
		return "Thread [main]";
	}
	
	public int getPriority() throws DebugException {
		return 0;
	}
	
	public IStackFrame[] getStackFrames() throws DebugException {
		if (isSuspended()) {
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage stack = this.debugTarget.getDebugProxy().getStack();
			String framesData = stack.getArgument(0);
			if (framesData != null && !"".equals(framesData)) {
				List<String> frames = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptStringUtil.decode(framesData, '#');
				IStackFrame[] theFrames = new IStackFrame[frames.size()];
				for (int i = 0; i < frames.size(); i++) {
					String data = frames.get(i);
					theFrames[frames.size() - i - 1] = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptStackFrame(getTarget(), data);
				}
				return theFrames;
			}
		}
		return new IStackFrame[0];
	}
	
	public IStackFrame getTopStackFrame() throws DebugException {
		IStackFrame[] frames = getStackFrames();
		if (frames.length > 0) {
			return frames[0];
		}
		return null;
	}
	
	public boolean hasStackFrames() throws DebugException {
		return isSuspended();
	}
	
	public boolean canResume() {
		return isSuspended();
	}
	
	public boolean canSuspend() {
		return !isSuspended();
	}
	
	public boolean isSuspended() {
		return suspended && !isTerminated();
	}
	
	public void resume() throws DebugException {
		debugTarget.getDebugProxy().resume();
		suspended = false;
	}
	
	public void suspend() throws DebugException {
		suspended = true;
		fireSuspendEvent(DebugEvent.BREAKPOINT);
	}
	
	public boolean canStepInto() {
		return true;
	}
	
	public boolean canStepOver() {
		return true;
	}
	
	public boolean canStepReturn() {
		return true;
	}
	
	public boolean isStepping() {
		return false;
	}
	
	public void stepInto() throws DebugException {
		getTarget().getDebugProxy().stepInto();
	}
	
	public void stepOver() throws DebugException {
		getTarget().getDebugProxy().stepOver();
	}
	
	public void stepReturn() throws DebugException {
		getTarget().getDebugProxy().stepReturn();
	}
	
	public boolean canTerminate() {
		return !isTerminated();
	}
	
	public boolean isTerminated() {
		return getDebugTarget().isTerminated();
	}
	
	public void terminate() throws DebugException {
		getTarget().getDebugProxy().terminate();
	}
	
	public void handleMessage(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage message) {
		if (message.hasType(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes.STARTED)) {
			fireCreationEvent();
		} else if (message.hasType(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes.RESUMED)) {
			suspended = false;
			fireResumeEvent(0);
		} else if (message.hasType(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes.SUSPENDED)) {
			suspended = true;
			fireSuspendEvent(DebugEvent.BREAKPOINT);
		} else if (message.hasType(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes.TERMINATED)) {
			// ignore this event
		} else {
			System.out.println("ERROR " + this.getClass().getName() + ".handleMessage(" + message + ") unknown event");
		}
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugTarget getTarget() {
		return debugTarget;
	}
	
}
