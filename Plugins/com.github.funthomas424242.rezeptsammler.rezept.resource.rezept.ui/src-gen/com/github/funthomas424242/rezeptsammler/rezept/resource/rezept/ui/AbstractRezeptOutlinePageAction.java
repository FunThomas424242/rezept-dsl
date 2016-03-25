/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;

public abstract class AbstractRezeptOutlinePageAction extends Action {
	
	private String preferenceKey = this.getClass().getSimpleName() + ".isChecked";
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptOutlinePageTreeViewer treeViewer;
	
	public AbstractRezeptOutlinePageAction(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptOutlinePageTreeViewer treeViewer, String text, int style) {
		super(text, style);
		this.treeViewer = treeViewer;
	}
	
	public void initialize(String imagePath) {
		ImageDescriptor descriptor = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptImageProvider.INSTANCE.getImageDescriptor(imagePath);
		setDisabledImageDescriptor(descriptor);
		setImageDescriptor(descriptor);
		setHoverImageDescriptor(descriptor);
		boolean checked = com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptUIPlugin.getDefault().getPreferenceStore().getBoolean(preferenceKey);
		valueChanged(checked, false);
	}
	
	@Override
	public void run() {
		if (keepState()) {
			valueChanged(isChecked(), true);
		} else {
			runBusy(true);
		}
	}
	
	public void runBusy(final boolean on) {
		BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {
			public void run() {
				runInternal(on);
			}
		});
	}
	
	public abstract void runInternal(boolean on);
	
	private void valueChanged(boolean on, boolean store) {
		setChecked(on);
		runBusy(on);
		if (store) {
			com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptUIPlugin.getDefault().getPreferenceStore().setValue(preferenceKey, on);
		}
	}
	
	public boolean keepState() {
		return true;
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptOutlinePageTreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptOutlinePageTreeViewerComparator getTreeViewerComparator() {
		return (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.ui.RezeptOutlinePageTreeViewerComparator) treeViewer.getComparator();
	}
	
}
