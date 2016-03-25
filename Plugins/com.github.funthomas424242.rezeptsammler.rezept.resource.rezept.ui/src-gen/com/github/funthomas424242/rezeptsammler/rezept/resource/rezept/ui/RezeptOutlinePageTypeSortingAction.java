/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui;

import org.eclipse.jface.action.IAction;

public class RezeptOutlinePageTypeSortingAction extends com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.AbstractRezeptOutlinePageAction {
	
	public RezeptOutlinePageTypeSortingAction(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
