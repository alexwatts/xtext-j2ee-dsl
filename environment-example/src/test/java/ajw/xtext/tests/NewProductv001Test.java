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

public class NewProductv001Test extends JbpmJUnitTestCase {
	
	private static final String WORKFLOW = "newProductv001.bpmn2";
	
	@Test
	public void testproductAuctionCreated() throws Exception {
		KnowledgeBase kbase = createKnowledgeBase(WORKFLOW);
		StatefulKnowledgeSession ksession = attachSynchronousHandler(createKnowledgeSession(kbase));
		
		Map<String,Object> processVariables = new HashMap<String, Object>();
		
		
		ProcessInstance process = ksession.startProcess(WORKFLOW, processVariables);
		
		Map<String, Object> variables = new HashMap<String, Object>();
		
		variables.put("completionStatus","complete");
		ksession.signalEvent("CompleteProduct", variables ,process.getId());
		variables.put("completionStatus","sale");
		ksession.signalEvent("CompletedProduct", variables ,process.getId());
		variables.put("auctionCreationStatus","auctionCreated");
		ksession.signalEvent("PendingProduct", variables ,process.getId());
		
		assertNodeTriggered(process.getId()
				, "Start"
				, "CompleteProduct"
				, "CompleteOrCancel"
				, "CompletedProduct"
				, "SaleOrCancel"
				, "PendingProduct"
				, "CreateAuction"
				, "AuctionCreatedOrNot"
				, "SaleEnd"
				);
				
		assertProcessInstanceCompleted(process.getId(), ksession);
	}
	
	@Test
	public void testproductAuctionNotCreated() throws Exception {
		KnowledgeBase kbase = createKnowledgeBase(WORKFLOW);
		StatefulKnowledgeSession ksession = attachSynchronousHandler(createKnowledgeSession(kbase));
		
		Map<String,Object> processVariables = new HashMap<String, Object>();
		
		
		ProcessInstance process = ksession.startProcess(WORKFLOW, processVariables);
		
		Map<String, Object> variables = new HashMap<String, Object>();
		
		variables.put("completionStatus","complete");
		ksession.signalEvent("CompleteProduct", variables ,process.getId());
		variables.put("completionStatus","sale");
		ksession.signalEvent("CompletedProduct", variables ,process.getId());
		variables.put("auctionCreationStatus","auctionNotCreated");
		ksession.signalEvent("PendingProduct", variables ,process.getId());
		ksession.signalEvent("FailedAuctionCreation", variables ,process.getId());
		
		assertNodeTriggered(process.getId()
				, "Start"
				, "CompleteProduct"
				, "CompleteOrCancel"
				, "CompletedProduct"
				, "SaleOrCancel"
				, "PendingProduct"
				, "CreateAuction"
				, "AuctionCreatedOrNot"
				, "FailedAuctionCreation"
				, "NotSaleEnd"
				);
				
		assertProcessInstanceCompleted(process.getId(), ksession);
	}
	
	@Test
	public void testproductCompletedUncancelledFlow() throws Exception {
		KnowledgeBase kbase = createKnowledgeBase(WORKFLOW);
		StatefulKnowledgeSession ksession = attachSynchronousHandler(createKnowledgeSession(kbase));
		
		Map<String,Object> processVariables = new HashMap<String, Object>();
		
		
		ProcessInstance process = ksession.startProcess(WORKFLOW, processVariables);
		
		Map<String, Object> variables = new HashMap<String, Object>();
		
		variables.put("completionStatus","completeCancel");
		ksession.signalEvent("CompleteProduct", variables ,process.getId());
		ksession.signalEvent("UncancelProduct", variables ,process.getId());
		
		assertNodeTriggered(process.getId()
				, "Start"
				, "CompleteProduct"
				, "CompleteOrCancel"
				, "RejoinAfterCancel"
				, "UncancelProduct"
				, "UncancelEnd"
				);
				
		assertProcessInstanceCompleted(process.getId(), ksession);
	}
	
	@Test
	public void testproductReadyForSaleUncancelledFlow() throws Exception {
		KnowledgeBase kbase = createKnowledgeBase(WORKFLOW);
		StatefulKnowledgeSession ksession = attachSynchronousHandler(createKnowledgeSession(kbase));
		
		Map<String,Object> processVariables = new HashMap<String, Object>();
		
		
		ProcessInstance process = ksession.startProcess(WORKFLOW, processVariables);
		
		Map<String, Object> variables = new HashMap<String, Object>();
		
		variables.put("completionStatus","complete");
		ksession.signalEvent("CompleteProduct", variables ,process.getId());
		variables.put("completionStatus","saleCancel");
		ksession.signalEvent("CompletedProduct", variables ,process.getId());
		ksession.signalEvent("UncancelProduct", variables ,process.getId());
		
		assertNodeTriggered(process.getId()
				, "Start"
				, "CompleteProduct"
				, "CompleteOrCancel"
				, "CompletedProduct"
				, "SaleOrCancel"
				, "RejoinAfterCancel"
				, "UncancelProduct"
				, "UncancelEnd"
				);
				
		assertProcessInstanceCompleted(process.getId(), ksession);
	}
	

}		
