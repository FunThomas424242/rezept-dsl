/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used when computing code completion proposals hold groups of
 * expected elements which belong to the same follow set.
 */
public class RezeptFollowSetGroupList {
	
	private int lastFollowSetID = -1;
	private List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptFollowSetGroup> followSetGroups = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptFollowSetGroup>();
	
	public RezeptFollowSetGroupList(List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal> expectedTerminals) {
		for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal expectedTerminal : expectedTerminals) {
			addExpectedTerminal(expectedTerminal);
		}
	}
	
	private void addExpectedTerminal(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptExpectedTerminal expectedTerminal) {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptFollowSetGroup group;
		
		int followSetID = expectedTerminal.getFollowSetID();
		if (followSetID == lastFollowSetID) {
			if (followSetGroups.isEmpty()) {
				group = addNewGroup();
			} else {
				group = followSetGroups.get(followSetGroups.size() - 1);
			}
		} else {
			group = addNewGroup();
			lastFollowSetID = followSetID;
		}
		
		group.add(expectedTerminal);
	}
	
	public List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptFollowSetGroup> getFollowSetGroups() {
		return followSetGroups;
	}
	
	private com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptFollowSetGroup addNewGroup() {
		com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptFollowSetGroup group = new com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.mopp.RezeptFollowSetGroup();
		followSetGroups.add(group);
		return group;
	}
	
}
