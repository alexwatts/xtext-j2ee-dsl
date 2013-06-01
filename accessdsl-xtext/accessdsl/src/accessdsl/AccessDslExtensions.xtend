/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package accessdsl

import jpadsl.jPADsl.PackageDeclaration
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmDeclaredType
import jpadsl.jPADsl.Type
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.BasicEList
import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.common.types.JvmTypeReference

class AccessDslExtensions {

	
	/**
	 * computes the qualified name if its 
	 *  a PackageDeclaration, an Entity or a JvmDeclaredType
	 * returns null otherwise
	 */
	def String packageName(Object o) {
		switch(o) {
			PackageDeclaration : concatPath(packageName(o.eContainer), o.name)
			EObject : packageName(o.eContainer)
			JvmDeclaredType : o.packageName
			default: null
		}
	}
	
	def concatPath(String prefix, String suffix) {
		if (prefix.nullOrEmpty) 
			suffix 
		else 
			prefix + "." + suffix
	}
	
	def String qualifiedName(Type t) {
		
		if (packageName(t) == null) {
			
			return t.name;
			
		} else {
			
			var builder = new StringBuilder();
			
			builder.append(packageName(t));
			builder.append(".");
			builder.append(t.name);
				
			return builder.toString();
		}
	}
	
	def String qualifiedName(PackageDeclaration p) {
		
		
		if (qualifiedName(p) == null) {
			
			return p.name;
			
		} else {
			
			var builder = new StringBuilder();
			
			builder.append(qualifiedName(p));
			builder.append(".");
			builder.append(p.name);
			
			return builder.toString();
		}
	}


	
}