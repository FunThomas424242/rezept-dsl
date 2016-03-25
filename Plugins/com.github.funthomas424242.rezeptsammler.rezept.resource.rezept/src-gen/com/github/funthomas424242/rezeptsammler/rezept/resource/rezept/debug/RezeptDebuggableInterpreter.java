/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <p>
 * A DebuggableInterpreter is a facade for interpreters that adds debug support.
 * </p>
 * 
 * @param <ResultType> the result type of the actual interpreter
 * @param <ContextType> the context type of the actual interpreter
 */
public class RezeptDebuggableInterpreter<ResultType, ContextType> extends com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.AbstractRezeptDebuggable {
	
	/**
	 * The actual interpreter. Interpretation is delegated to this object.
	 */
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.AbstractRezeptInterpreter<ResultType, ContextType> interpreterDelegate;
	
	/**
	 * To check whether we must stop the execution after step over/into/return, we use
	 * a closure
	 */
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptCommand<EObject> stopCondition;
	
	/**
	 * The port of the socket that is used to send debug events to the Eclipse
	 * debugging framework
	 */
	private int eventPort;
	
	/**
	 * This map is used to remember the IDs of stack frame elements
	 */
	Map<Integer, EObject> stackFrameMap = new LinkedHashMap<Integer, EObject>();
	
	/**
	 * The ID of the last stack frame element
	 */
	int stackFrameID = 0;
	
	public RezeptDebuggableInterpreter(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.AbstractRezeptInterpreter<ResultType, ContextType> interpreterDelegate, int eventPort) {
		this.eventPort = eventPort;
		this.interpreterDelegate = interpreterDelegate;
		this.interpreterDelegate.addListener(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptInterpreterListener() {
			
			public void handleInterpreteObject(EObject element) {
				// check whether we have hit an element after a step over/into/return
				evaluateStep(element);
				// if we are stepping we do ignore breakpoints
				if (stopCondition != null) {
					return;
				}
				// check whether we have hit a line breakpoint
				int line = getLine(element);
				EObject parent = element.eContainer();
				if (parent != null) {
					int parentLine = getLine(parent);
					if (line == parentLine) {
						return;
					}
				}
				if (line >= 0) {
					evaluateLineBreakpoint(element.eResource().getURI(), line);
				}
			}
		});
	}
	
	private ResultType interprete(ContextType context) {
		startUpAndWait();
		// start interpretation when the debugger has sent the resume signal
		ResultType result = interpreterDelegate.interprete(context);
		terminate();
		return result;
	}
	
	public ResultType interprete(ContextType context, boolean debugMode) {
		setDebugMode(debugMode);
		startEventSocket(eventPort);
		
		ResultType result = interprete(context);
		return result;
	}
	
	public String[] getStack() {
		EObject next = interpreterDelegate.getNextObjectToInterprete();
		List<EObject> parents = new ArrayList<EObject>();
		EObject current = next;
		while (current != null) {
			parents.add(current);
			current = current.eContainer();
		}
		String[] stack = new String[parents.size()];
		int i = parents.size();
		for (EObject parent : parents) {
			String serializedStackElement = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptStringUtil.encode(',', new String[] {parent.eClass().getName(), Integer.toString(stackFrameID), parent.eResource().getURI().toString(), Integer.toString(getLine(parent)), Integer.toString(getCharStart(parent)), Integer.toString(getCharEnd(parent))});
			stack[--i] = serializedStackElement;
			stackFrameMap.put(stackFrameID++, parent);
		}
		return stack;
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.AbstractRezeptInterpreter<ResultType, ContextType> getInterpreterDelegate() {
		return interpreterDelegate;
	}
	
	private int getLine(EObject element) {
		int line = -1;
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptLocationMap locationMap = getLocationMap(element);
		if (locationMap != null) {
			line = locationMap.getLine(element);
		}
		return line;
	}
	
	private int getCharStart(EObject element) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptLocationMap locationMap = getLocationMap(element);
		if (locationMap != null) {
			return locationMap.getCharStart(element);
		}
		return -1;
	}
	
	private int getCharEnd(EObject element) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptLocationMap locationMap = getLocationMap(element);
		if (locationMap != null) {
			return locationMap.getCharEnd(element) + 1;
		}
		return -1;
	}
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptLocationMap getLocationMap(EObject element) {
		Resource resource = element.eResource();
		if (resource instanceof com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource) {
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource textResource = (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource) resource;
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptLocationMap locationMap = textResource.getLocationMap();
			return locationMap;
		}
		return null;
	}
	
	private void evaluateStep(EObject element) {
		// create local copy to avoid race conditions
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptCommand<EObject> stopCheck = stopCondition;
		if (stopCheck != null && stopCheck.execute(element)) {
			stopCondition = null;
			// suspending after step...
			setSuspend(true);
			sendEvent(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes.SUSPENDED, true);
			return;
		}
		waitIfSuspended();
	}
	
	public void terminate() {
		interpreterDelegate.terminate();
		super.terminate();
	}
	
	public void stepOver() {
		final EObject current = interpreterDelegate.getNextObjectToInterprete();
		final int currentLevel = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptEObjectUtil.getDepth(current);
		stopCondition = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptCommand<EObject>() {
			public boolean execute(EObject element) {
				// For step over, we stop at the next object that is at the same level or higher
				int depth = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptEObjectUtil.getDepth(element);
				boolean sameOrHigher = depth <= currentLevel;
				boolean differentElement = element != current;
				return sameOrHigher && differentElement;
			}
		};
		resume();
	}
	
	public void stepInto() {
		stopCondition = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptCommand<EObject>() {
			public boolean execute(EObject element) {
				// For step into, we stop at the next object
				return true;
			}
		};
		resume();
	}
	
	public void stepReturn() {
		EObject current = interpreterDelegate.getNextObjectToInterprete();
		final int parentLevel = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptEObjectUtil.getDepth(current) - 1;
		stopCondition = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptCommand<EObject>() {
			public boolean execute(EObject element) {
				// For step return, we stop at the next object that is at least one level higher
				int depth = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptEObjectUtil.getDepth(element);
				return depth <= parentLevel;
			}
		};
		resume();
	}
	
	public Map<String, Object> getFrameVariables(String stackFrame) {
		int stackFrameID = Integer.parseInt(stackFrame);
		Map<String, Object> frameVariables = new LinkedHashMap<String, Object>();
		frameVariables.put("this", stackFrameMap.get(stackFrameID));
		frameVariables.put("context", getInterpreterDelegate().getCurrentContext());
		return frameVariables;
	}
	
}
