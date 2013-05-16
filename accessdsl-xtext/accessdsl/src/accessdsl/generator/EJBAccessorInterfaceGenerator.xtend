/*
 * generated by Xtext
 */
package accessdsl.generator

import accessdsl.accessDsl.QueryAndTypeMapping
import accessdsl.accessDsl.Unit
import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmFormalParameter

class EJBAccessorInterfaceGenerator  {
	
	@Inject extension AccessDslGeneratorExtensions generatorExtensions
	
	def compileAccessorInterface(Unit u) '''
/**
 * «u.name.toFirstUpper() + "EJBAccessor.java"»
 */
 
 package «u.^package.name»;
 
 import «u.^package.name + ".*"»;
 import javax.ejb.*;
 import java.util.List;

 
/**
 * Local Interface for an EJB Accessor
 */
@Local
public interface «u.name.toFirstUpper() + "EJBAccessor"» {
	
	«FOR qm:u.querymapping»
		«val querymapping = queryMapping(qm)»
		«querymapping»
	«ENDFOR»
}
	'''
	
	def queryMapping(QueryAndTypeMapping qm) '''
	public «qm.typeMapping.name» «qm.name» ( «FOR qp:qm.queryParameters»«val queryParamater = queryParameter(qp,qm.queryParameters.last)»«queryParamater»«ENDFOR» );
	'''
	
	def queryParameter(JvmFormalParameter qp, JvmFormalParameter last) '''«qp.parameterType.simpleName» «qp.name»«IF qp != last», «ENDIF»'''
	

}