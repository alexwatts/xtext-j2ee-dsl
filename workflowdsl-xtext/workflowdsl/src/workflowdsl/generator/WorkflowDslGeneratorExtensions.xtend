/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package workflowdsl.generator

import org.eclipse.emf.common.util.EList
import workflowdsl.WorkflowDslExtensions
import workflowdsl.workflowDsl.AsyncronousServiceTask
import workflowdsl.workflowDsl.Node
import workflowdsl.workflowDsl.SyncronousServiceTask
import workflowdsl.workflowDsl.WorkflowDefinition
import static extension java.lang.Character.*


class WorkflowDslGeneratorExtensions extends WorkflowDslExtensions {
	
	def int indexByNodeName(EList<Node> nodes, String nodeName) {
		var it = nodes.iterator();
		var x = 1;
		while (it.hasNext) {
			var node = it.next();
			if (node.name.equals(nodeName)) {
				return x;
			}
			x = x + 1;
		}
		
		return 0;
	}
	
	def Boolean containsAsyncronousTasks(WorkflowDefinition w) {
		return w.nodes.filter(typeof(AsyncronousServiceTask)).size > 0
	}
	
	def Boolean containsSyncronousTasks(WorkflowDefinition w) {
		return w.nodes.filter(typeof(SyncronousServiceTask)).size > 0
	}
	
	def String substituteCamelsForUpperCaseAndUnderScores(String name) {
		
		val result = new StringBuilder()
		
		//Ignore the first character
		result.append(name.substring(0,1).toUpperCase);
		if (name.length > 1) {
			val characters = name.substring(1, name.length).toCharArray();
	
			for (Character c : characters) {
				
				if (c.isUpperCase()) {
					result.append("_");
				}
				
				result.append(c.toUpperCase());
				 
			}
		
		}
		
		return result.toString();
	}
	
}