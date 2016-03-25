/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui;

import java.util.Collection;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * This class can be used to initialize default preference values.
 */
public class RezeptPreferenceInitializer extends AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		initializeDefaultsContentAssist();
		
		IPreferenceStore store = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	protected void initializeDefaultBrackets() {
		IPreferenceStore store = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptMetaInformation());
	}
	
	protected void initializeDefaultBrackets(IPreferenceStore store, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptBracketSet bracketSet = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptBracketSet();
		final Collection<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside(), bracketPair.isCloseAfterEnter());
			}
		}
		store.setDefault(languageId + com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.serialize());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		IPreferenceStore store = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptMetaInformation());
	}
	
	protected void initializeDefaultSyntaxHighlighting(IPreferenceStore store, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void initializeDefaultsContentAssist() {
		IPreferenceStore store = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptUIPlugin.getDefault().getPreferenceStore();
		store.setDefault(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptPreferenceConstants.EDITOR_CONTENT_ASSIST_ENABLED, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptPreferenceConstants.EDITOR_CONTENT_ASSIST_ENABLED_DEFAULT);
		store.setDefault(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptPreferenceConstants.EDITOR_CONTENT_ASSIST_DELAY, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptPreferenceConstants.EDITOR_CONTENT_ASSIST_DELAY_DEFAULT);
		store.setDefault(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptPreferenceConstants.EDITOR_CONTENT_ASSIST_TRIGGERS, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptPreferenceConstants.EDITOR_CONTENT_ASSIST_TRIGGERS_DEFAULT);
	}
	
	protected void setProperties(IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	protected String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
	
}

