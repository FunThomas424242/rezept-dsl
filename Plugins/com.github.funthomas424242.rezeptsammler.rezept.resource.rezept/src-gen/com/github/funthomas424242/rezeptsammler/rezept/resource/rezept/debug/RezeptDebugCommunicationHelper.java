/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class RezeptDebugCommunicationHelper {
	
	public void sendEvent(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage message, PrintStream stream) {
		synchronized (stream) {
			stream.println(message.serialize());
		}
	}
	
	/**
	 * <p>
	 * Sends a message using the given stream and waits for an answer.
	 * </p>
	 * 
	 * @param messageType the type of message to send
	 * @param stream the stream to send the message to
	 * @param reader the reader to obtain the answer from
	 * @param parameters additional parameter to send
	 * 
	 * @return the answer that is received
	 */
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage sendAndReceive(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage message, PrintStream stream, BufferedReader reader) {
		synchronized (stream) {
			sendEvent(message, stream);
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage response = receive(reader);
			return response;
		}
	}
	
	/**
	 * <p>
	 * Receives a message from the given reader. This method block until a message has
	 * arrived.
	 * </p>
	 * 
	 * @param reader the read to obtain the message from
	 * 
	 * @return the received message
	 */
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage receive(BufferedReader reader) {
		try {
			String response = reader.readLine();
			if (response == null) {
				return null;
			}
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage receivedMessage = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.debug.RezeptDebugMessage.deserialize(response);
			return receivedMessage;
		} catch (IOException e) {
			return null;
		}
	}
	
}
