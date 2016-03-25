/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui;

import org.eclipse.jface.action.IAction;

public class RezeptOutlinePageExpandAllAction extends com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.AbstractRezeptOutlinePageAction {
	
	public RezeptOutlinePageExpandAllAction(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
