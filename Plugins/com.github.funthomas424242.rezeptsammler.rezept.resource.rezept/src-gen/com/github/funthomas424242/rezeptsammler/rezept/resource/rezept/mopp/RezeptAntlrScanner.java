/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import org.antlr.runtime3_4_0.ANTLRStringStream;
import org.antlr.runtime3_4_0.Lexer;
import org.antlr.runtime3_4_0.Token;

public class RezeptAntlrScanner implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextScanner {
	
	private Lexer antlrLexer;
	
	public RezeptAntlrScanner(Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextToken result = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new ANTLRStringStream(text));
	}
	
}
