/*
 * generated by Xtext
 */
package workflowdsl.generator

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import workflowdsl.workflowDsl.AssertFlow
import workflowdsl.workflowDsl.AssertWait
import workflowdsl.workflowDsl.FireSignal
import workflowdsl.workflowDsl.ProcessVariable
import workflowdsl.workflowDsl.Test
import workflowdsl.workflowDsl.WorkflowDefinition

class JBPMUnitTestGenerator  {
	
	@Inject extension WorkflowDslGeneratorExtensions generatorExtensions
	
	def compileJBPMUnitTest(WorkflowDefinition w) '''
package ajw.xtext.tests;

import static ajw.xtext.tests.jbpm.util.WorkflowTestUtil.assertProcessInstanceActive;
import static ajw.xtext.tests.jbpm.util.WorkflowTestUtil.assertProcessInstanceCompleted;

import java.util.HashMap;
import java.util.Map;

import org.drools.KnowledgeBase;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.process.ProcessInstance;
import org.junit.Ignore;
import org.junit.Test;

import ajw.xtext.tests.jbpm.base.JbpmJUnitTestCase;

public class «w.name.toFirstUpper»Test extends JbpmJUnitTestCase {
	
	private static final String WORKFLOW = "«w.name».bpmn2";
	
	«FOR t:w.tests»
	 «val test = test(t)»
	 «test»
    «ENDFOR»

}		
	'''
	
	def test(Test t) '''
		«FOR af:t.assertFlow»
		 «val testFLow = testFLow(t.name, af, t.processVariables, t.fireSignal)»
		 «testFLow»
	    «ENDFOR»
		
	    «FOR aw:t.assertWait»
		 «val testWait = testWait(t.name, aw, t.processVariables, t.fireSignal)»
		 «testWait»
	    «ENDFOR»
	'''
	
	def testFLow(String testName, AssertFlow af, EList<ProcessVariable> variables, EList<FireSignal> signals) '''
	@Test
	public void test«testName.toFirstLower»() throws Exception {
		KnowledgeBase kbase = createKnowledgeBase(WORKFLOW);
		StatefulKnowledgeSession ksession = attachSynchronousHandler(createKnowledgeSession(kbase));
		
		Map<String,Object> processVariables = new HashMap<String, Object>();
		
		«FOR pv:variables»
		processVariables.put("«pv.variable.name»", "«pv.value.value»");
	    «ENDFOR»
		
		ProcessInstance process = ksession.startProcess(WORKFLOW, processVariables);
		
		Map<String, Object> variables = new HashMap<String, Object>();
		
		«FOR s:signals»
			«val fireSignal = fireSignal(s)»«fireSignal»
	    «ENDFOR»
		
		assertNodeTriggered(process.getId()
				«FOR n:af.nodes»
				 , "«n.name»"
			    «ENDFOR»
				);
				
		assertProcessInstanceCompleted(process.getId(), ksession);
	}
	'''
	
	def fireSignal(FireSignal s) '''
		«IF s.^case != null»variables.put("«s.^case.stringBasedConditionalExpression.name»","«s.^case.value»");«ENDIF»
		ksession.signalEvent("«s.fireSignal.name»", variables ,process.getId());
	'''

	
	def testWait(String testName, AssertWait aw, EList<ProcessVariable> variables, EList<FireSignal> signals) '''
	@Test
	public void test«testName.toFirstLower»() throws Exception {
		KnowledgeBase kbase = createKnowledgeBase(WORKFLOW);
	
		StatefulKnowledgeSession ksession = attachSynchronousHandler(createKnowledgeSession(kbase));

		Map<String,Object> processVariables = new HashMap<String, Object>();
		
		«FOR pv:variables»
		processVariables.put("«pv.variable.name»", "«pv.value.name»");
	    «ENDFOR»
	    
	    Map<String, Object> variables = new HashMap<String, Object>();

		ProcessInstance process = ksession.startProcess(WORKFLOW, processVariables);
		
		«FOR s:signals»
			«val fireSignal = fireSignal(s)»«fireSignal»
	    «ENDFOR»

		assertNodeTriggered(process.getId()
				«FOR n:aw.nodes»
				 , "«n.name»"
			    «ENDFOR»
				);

		assertProcessInstanceActive(process.getId(), ksession);
	}
	'''
	
}