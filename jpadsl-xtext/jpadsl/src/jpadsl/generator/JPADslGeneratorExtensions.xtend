/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package jpadsl.generator

import java.util.ArrayList
import jpadsl.JPADslExtensions

import static extension java.lang.Character.*


class JPADslGeneratorExtensions extends JPADslExtensions {
	
	def String substituteCamelsForUpperCaseAndUnderScores(String name) {
		
		val result = new StringBuilder()
		val i  = new Integer(0);
		
		//Ignore the first character
		result.append(name.substring(0,1).toUpperCase);
		
		val characters = name.substring(1, name.length).toCharArray();

		for (Character c : characters) {
			
			if (c.isUpperCase()) {
				result.append("_");
			}
			
			result.append(c.toUpperCase());
			 
		}	
		
		return result.toString();
	}
	
	def String generateJoinTableIdentifier(String prefix, String entityA, String entityB) {

		var tables = new ArrayList<String>();

		tables.add(entityA);
		tables.add(entityB);
		
		tables.sort();
		
		var concatenation = prefix + tables.get(0) + "_" + tables.get(1);
		
		if (concatenation.length() < 30) {
			
			return concatenation;
			
		} else {
			
			return generateJoinTableIdentifier(
					prefix, 
					tables.get(0).substring(0, tables.get(0).length() -2), 
					tables.get(1).substring(0, tables.get(1).length() -2));
			
		}
		
	}
	
	def String toPlural(String name) {

		return name + "s";
	}
	
	def String toSingular(String name) {

		return name.substring(0, name.length - 1);
		
	}
	
}