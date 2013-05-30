/*
 * generated by Xtext
 */
package accessdsl.generator

import accessdsl.accessDsl.QueryAndTypeMapping
import accessdsl.accessDsl.Unit
import com.google.inject.Inject
import accessdsl.accessDsl.QueryMapping
import org.eclipse.xtext.common.types.JvmFormalParameter
import accessdsl.accessDsl.MultipleResultQueryMapping
import accessdsl.accessDsl.SingleResultQueryMapping
import accessdsl.accessDsl.StateAdjustment
import accessdsl.accessDsl.PersistOperation
import accessdsl.accessDsl.StateOperation
import accessdsl.accessDsl.PersistAndAssociateOperation
import accessdsl.accessDsl.AssociateOperation
import jpadsl.jPADsl.RelationshipAttribute
import jpadsl.jPADsl.SingularRelationshipAttribute
import jpadsl.jPADsl.MultipleRelationshipAttribute

class AccessorGenerator  {
	
	@Inject extension AccessDslGeneratorExtensions generatorExtensions
	
	def compileAccessor(Unit u) '''
/**
 * «u.name.toFirstUpper() + "AccessorBean.java"»
 */
 
 package «u.^package.name»;
 
 import «u.^package.name + ".*"»;
 import javax.ejb.*;
 import javax.persistence.*;
 import java.util.*;
 import java.io.Serializable;
 

public class «u.name.toFirstUpper() + "Accessor"» {
	
	private EntityManager em;

	//A Constructor which initialises the accessor
	//and is provided an Entity Manager
	public «u.name.toFirstUpper() + "Accessor"»(EntityManager em) {
		this.em = em;
	}

	«FOR qm:u.querymapping»
		«val querymapping = queryMapping(qm)»
		«querymapping»
	«ENDFOR»
	
	«FOR sa:u.stateAdjustment»
		«val stateAdjustment = stateAdjustment(sa)»
		«stateAdjustment»
	«ENDFOR»

}
'''	

	def queryMapping(QueryAndTypeMapping qm) '''
	
	«IF qm.query instanceof MultipleResultQueryMapping»
	public List<«qm.typeMapping.name»> «qm.name» ( «FOR qp:qm.queryParameters»«val queryParamater = queryParameter(qp,qm.queryParameters.last)»«queryParamater»«ENDFOR»   ) {
		
		final Query query = em.createNamedQuery("«qm.query.namedQuery.name»");
		
		List<«qm.typeMapping.name»> containers = new ArrayList<«qm.typeMapping.name»>();
		
		List<Object«IF qm.typeMapping.containerElements.size > 1»[]«ELSE»«ENDIF»> results = (List<Object«IF qm.typeMapping.containerElements.size > 1»[]«ELSE»«ENDIF»>) query.getResultList();
		
		for (Object«IF qm.typeMapping.containerElements.size > 1»[]«ELSE»«ENDIF» row : results) {
			containers.add(new «qm.typeMapping.name»(row));
		}
		
		return containers;
		
	}
	«ELSE»
	public «qm.typeMapping.name» «qm.name» ( «FOR qp:qm.queryParameters»«val queryParamater = queryParameter(qp,qm.queryParameters.last)»«queryParamater»«ENDFOR» ) {
		
		final Query query = em.createNamedQuery("«qm.query.namedQuery.name»");
		
        «IF !qm.queryParameters.isEmpty()»«FOR qp:qm.queryParameters»
        query.setParameter("«qp.name»", «qp.name»);
        «ENDFOR»
        «ENDIF»
		
		return new «qm.typeMapping.name»(query.getSingleResult());
		
	}
	«ENDIF»
	'''
	
	def queryParameter(JvmFormalParameter qp, JvmFormalParameter last) '''«qp.parameterType.simpleName» «qp.name»«IF qp != last», «ENDIF»'''
	
	
	def queryParameterLiteral(JvmFormalParameter qp, JvmFormalParameter last) '''«qp.name»«IF qp != last», «ENDIF»'''
	
	
	
	def stateAdjustment(StateAdjustment sa)'''
	«val stateOperation = stateOperation(sa.stateOperation, sa.name)»«stateOperation»
	'''

	def dispatch stateOperation(StateOperation so, String name)'''
	'''

	def dispatch stateOperation(PersistOperation pe, String name)'''
	public «pe.this.name» «name» («pe.this.name» «pe.this.name.toFirstLower») {
		em.persist(«pe.this.name.toFirstLower»);
		return «pe.this.name.toFirstLower»;
	}
	'''

	def dispatch stateOperation(PersistAndAssociateOperation pe, String name)'''
	public «pe.newEntity.name» «name» («pe.newEntity.name» «pe.newEntity.name.toFirstLower», «pe.existingEntity.name» «pe.existingEntity.name.toFirstLower») {
		em.persist(«pe.newEntity.name.toFirstLower»);
		
		«pe.existingEntity.name.toFirstLower»«val setOrAddMethodCall = setOrAddMethodCall(pe.associaltion, pe.associaltion.name.toFirstUpper, pe.newEntity.name.toFirstLower)»«setOrAddMethodCall»
		
		return «pe.newEntity.name.toFirstLower»;
	}
	'''
	
	def dispatch stateOperation(AssociateOperation pe, String name)'''
	public «pe.this.name» «name» («pe.this.name» «pe.this.name.toFirstLower», «pe.that.name» «pe.that.name.toFirstLower») {
		
		«pe.this.name.toFirstLower»«val setOrAddMethodCall = setOrAddMethodCall(pe.associaltion, pe.associaltion.name.toFirstUpper, pe.that.name.toFirstLower)»«setOrAddMethodCall»
		
		return «pe.this.name.toFirstLower»;
	}
	'''

	def dispatch setOrAddMethodCall(RelationshipAttribute re, String associationName, String elementName)''''''
	
	def dispatch setOrAddMethodCall(SingularRelationshipAttribute re, String associationName, String elementName)'''.set«associationName»(«elementName»);'''
	
	def dispatch setOrAddMethodCall(MultipleRelationshipAttribute re, String associationName, String elementName)'''.add«re.type.referenced.name.toFirstUpper»(«elementName»);'''
	

}