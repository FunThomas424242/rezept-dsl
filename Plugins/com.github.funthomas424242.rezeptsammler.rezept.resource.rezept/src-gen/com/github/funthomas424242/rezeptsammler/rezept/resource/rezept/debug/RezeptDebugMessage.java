/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug;

import java.util.ArrayList;
import java.util.List;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class RezeptDebugMessage {
	
	private static final char DELIMITER = ':';
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes messageType;
	private String[] arguments;
	
	public RezeptDebugMessage(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public RezeptDebugMessage(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes messageType, List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		List<String> parts = new ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptStringUtil.encode(DELIMITER, parts);
	}
	
	public static RezeptDebugMessage deserialize(String response) {
		List<String> parts = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes type = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes.valueOf(messageType);
		RezeptDebugMessage message = new RezeptDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.ERezeptDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util.RezeptStringUtil.explode(arguments, ", ") + "]";
	}
	
}
