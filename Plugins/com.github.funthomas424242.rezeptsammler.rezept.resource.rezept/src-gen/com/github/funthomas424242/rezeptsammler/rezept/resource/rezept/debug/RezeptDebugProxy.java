/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class RezeptDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private PrintStream output;
	
	private BufferedReader reader;
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugTarget debugTarget;
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugCommunicationHelper communicationHelper = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugCommunicationHelper();
	
	public RezeptDebugProxy(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugTarget debugTarget, int requestPort) throws UnknownHostException, IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws UnknownHostException, IOException {
		// creating client proxy socket (trying to connect)...
		Socket client = new Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			BufferedInputStream input = new BufferedInputStream(client.getInputStream());
			reader = new BufferedReader(new InputStreamReader(input));
		} catch (IOException e) {
			System.out.println(e);
		}
		try {
			output = new PrintStream(client.getOutputStream());
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes.EXIT);
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage getStack() {
		return sendCommandAndRead(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage message = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage message = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public IVariable[] getStackVariables(String stackFrame) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage response = sendCommandAndRead(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public IVariable[] getVariables(String... requestedIDs) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage response = sendCommandAndRead(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugVariable[] variables  = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			Map<String, String> properties = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			Map<String, Long> childVariables = new TreeMap<String, Long>(new Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			IValue value = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugVariable variable = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes command, String... parameters) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage message = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage sendCommandAndRead(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes command, String... parameters) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage message = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
