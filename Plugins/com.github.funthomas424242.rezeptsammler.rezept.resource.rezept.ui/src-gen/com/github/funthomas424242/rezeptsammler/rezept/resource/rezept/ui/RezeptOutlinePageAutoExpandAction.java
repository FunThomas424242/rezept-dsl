/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui;

import org.eclipse.jface.action.IAction;

public class RezeptOutlinePageAutoExpandAction extends com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.AbstractRezeptOutlinePageAction {
	
	public RezeptOutlinePageAutoExpandAction(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
