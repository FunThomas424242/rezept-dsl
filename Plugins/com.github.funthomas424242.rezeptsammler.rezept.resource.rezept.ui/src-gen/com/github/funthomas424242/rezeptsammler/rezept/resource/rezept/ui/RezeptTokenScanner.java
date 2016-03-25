/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

/**
 * An adapter from the Eclipse
 * <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface to the
 * generated lexer.
 */
public class RezeptTokenScanner implements com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.IRezeptTokenScanner {
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextScanner lexer;
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextToken currentToken;
	private List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextToken> nextTokens;
	private int offset;
	private String languageId;
	private IPreferenceStore store;
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptColorManager colorManager;
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource resource;
	
	/**
	 * <p>
	 * Creates a new RezeptTokenScanner.
	 * </p>
	 * 
	 * @param resource The resource to scan
	 * @param colorManager A manager to obtain color objects
	 */
	public RezeptTokenScanner(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextResource resource, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptColorManager colorManager) {
		this.resource = resource;
		this.colorManager = colorManager;
		this.lexer = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptMetaInformation().createLexer();
		this.languageId = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptMetaInformation().getSyntaxName();
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptUIPlugin plugin = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptUIPlugin.getDefault();
		if (plugin != null) {
			this.store = plugin.getPreferenceStore();
		}
		this.nextTokens = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextToken>();
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public IToken nextToken() {
		boolean isOriginalToken = true;
		if (!nextTokens.isEmpty()) {
			currentToken = nextTokens.remove(0);
			isOriginalToken = false;
		} else {
			currentToken = lexer.getNextToken();
		}
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return Token.EOF;
		}
		
		if (isOriginalToken) {
			splitCurrentToken();
		}
		
		TextAttribute textAttribute = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenStyle staticStyle = getStaticTokenStyle();
			// now call dynamic token styler to allow to apply modifications to the static
			// style
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenStyle dynamicStyle = getDynamicTokenStyle(staticStyle);
			if (dynamicStyle != null) {
				textAttribute = getTextAttribute(dynamicStyle);
			}
		}
		
		return new Token(textAttribute);
	}
	
	public void setRange(IDocument document, int offset, int length) {
		this.offset = offset;
		try {
			lexer.setText(document.get(offset, length));
		} catch (BadLocationException e) {
			// ignore this error. It might occur during editing when locations are outdated
			// quickly.
		}
	}
	
	public String getTokenText() {
		return currentToken.getText();
	}
	
	public int[] convertToIntArray(RGB rgb) {
		if (rgb == null) {
			return null;
		}
		return new int[] {rgb.red, rgb.green, rgb.blue};
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenStyle getStaticTokenStyle() {
		String tokenName = currentToken.getName();
		String enableKey = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.StyleProperty.ENABLE);
		if (store == null) {
			return null;
		}
		
		boolean enabled = store.getBoolean(enableKey);
		if (!enabled) {
			return null;
		}
		
		String colorKey = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.StyleProperty.COLOR);
		RGB foregroundRGB = PreferenceConverter.getColor(store, colorKey);
		RGB backgroundRGB = null;
		boolean bold = store.getBoolean(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.StyleProperty.BOLD));
		boolean italic = store.getBoolean(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.StyleProperty.ITALIC));
		boolean strikethrough = store.getBoolean(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.StyleProperty.STRIKETHROUGH));
		boolean underline = store.getBoolean(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.StyleProperty.UNDERLINE));
		return new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyle(convertToIntArray(foregroundRGB), convertToIntArray(backgroundRGB), bold, italic, strikethrough, underline);
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenStyle getDynamicTokenStyle(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenStyle staticStyle) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptDynamicTokenStyler dynamicTokenStyler = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptDynamicTokenStyler();
		dynamicTokenStyler.setOffset(offset);
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenStyle dynamicStyle = dynamicTokenStyler.getDynamicTokenStyle(resource, currentToken, staticStyle);
		return dynamicStyle;
	}
	
	public TextAttribute getTextAttribute(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenStyle tokeStyle) {
		int[] foregroundColorArray = tokeStyle.getColorAsRGB();
		Color foregroundColor = null;
		if (colorManager != null) {
			foregroundColor = colorManager.getColor(new RGB(foregroundColorArray[0], foregroundColorArray[1], foregroundColorArray[2]));
		}
		int[] backgroundColorArray = tokeStyle.getBackgroundColorAsRGB();
		Color backgroundColor = null;
		if (backgroundColorArray != null) {
			RGB backgroundRGB = new RGB(backgroundColorArray[0], backgroundColorArray[1], backgroundColorArray[2]);
			if (colorManager != null) {
				backgroundColor = colorManager.getColor(backgroundRGB);
			}
		}
		int style = SWT.NORMAL;
		if (tokeStyle.isBold()) {
			style = style | SWT.BOLD;
		}
		if (tokeStyle.isItalic()) {
			style = style | SWT.ITALIC;
		}
		if (tokeStyle.isStrikethrough()) {
			style = style | TextAttribute.STRIKETHROUGH;
		}
		if (tokeStyle.isUnderline()) {
			style = style | TextAttribute.UNDERLINE;
		}
		return new TextAttribute(foregroundColor, backgroundColor, style);
	}
	
	/**
	 * Tries to split the current token if it contains task items.
	 */
	public void splitCurrentToken() {
		final String text = currentToken.getText();
		final String name = currentToken.getName();
		final int line = currentToken.getLine();
		final int charStart = currentToken.getOffset();
		final int column = currentToken.getColumn();
		
		List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTaskItem> taskItems = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTaskItemDetector().findTaskItems(text, line, charStart);
		
		// this is the offset for the next token to be added
		int offset = charStart;
		int itemBeginRelative;
		List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextToken> newItems = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTextToken>();
		for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTaskItem taskItem : taskItems) {
			int itemBegin = taskItem.getCharStart();
			int itemLine = taskItem.getLine();
			int itemColumn = 0;
			
			itemBeginRelative = itemBegin - charStart;
			// create token before task item
			String textBefore = text.substring(offset - charStart, itemBeginRelative);
			int textBeforeLength = textBefore.length();
			newItems.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTextToken(name, textBefore, offset, textBeforeLength, line, column, true));
			
			// create token for the task item itself
			offset = offset + textBeforeLength;
			String itemText = taskItem.getKeyword();
			int itemTextLength = itemText.length();
			newItems.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTextToken(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME, itemText, offset, itemTextLength, itemLine, itemColumn, true));
			
			offset = offset + itemTextLength;
		}
		
		if (!taskItems.isEmpty()) {
			// create token after last task item
			String textAfter = text.substring(offset - charStart);
			newItems.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptTextToken(name, textAfter, offset, textAfter.length(), line, column, true));
		}
		
		if (!newItems.isEmpty()) {
			// replace tokens
			currentToken = newItems.remove(0);
			nextTokens = newItems;
		}
		
	}
}
