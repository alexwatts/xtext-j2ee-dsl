/*
 * generated by Xtext
 */
package accessdsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.*
import org.eclipse.xtext.xbase.*
import org.eclipse.xtext.common.types.*
import java.util.*
import com.google.inject.Inject
import accessdsl.accessDsl.*
import accessdsl.generator.*


class AccessDslGenerator implements IGenerator {
	
	@Inject extension AccessDslGeneratorExtensions generatorExtensions
	
	@Inject extension ContainerGenerator containerGenerator
	
	@Inject extension EJBAccessorGenerator accessorGenerator
	
	@Inject extension EJBAccessorInterfaceGenerator accessorInterfaceGenerator
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		var resourceSet = resource.resourceSet
		
		//ignore the other models, but process the accessdsl model
		for (r : resourceSet.resources) {
		
			if (r.contents.head instanceof accessdsl.accessDsl.Model) {
				
				var model = r.contents.head as Model
			
				var unit = model.unit
			
				for(container: unit.containers) {
					fsa.generateFile(unit.^package.name.replaceAll("\\.","/")+"/" + container.name.toFirstUpper + ".java", container.compileContainer(unit))
				}
				
				fsa.generateFile(unit.^package.name.replaceAll("\\.","/")+"/" + unit.name.toFirstUpper + "AccessorBean.java", unit.compileAccessor)
				
				fsa.generateFile(unit.^package.name.replaceAll("\\.","/")+"/" + unit.name.toFirstUpper + "Accessor.java", unit.compileAccessorInterface)
				
			}
	}
	
}


}