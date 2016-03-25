/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.action.IAction;

public class RezeptOutlinePageActionProvider {
	
	public List<IAction> getActions(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		List<IAction> defaultActions = new ArrayList<IAction>();
		defaultActions.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
