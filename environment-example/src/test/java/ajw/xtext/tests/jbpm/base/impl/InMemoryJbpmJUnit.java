package ajw.xtext.tests.jbpm.base.impl;

import java.util.ArrayList;
import java.util.List;


import org.drools.KnowledgeBase;
import org.drools.audit.WorkingMemoryInMemoryLogger;
import org.drools.audit.event.LogEvent;
import org.drools.audit.event.RuleFlowNodeLogEvent;
import org.drools.runtime.StatefulKnowledgeSession;

import ajw.xtext.tests.jbpm.JbpmJUnit;

public class InMemoryJbpmJUnit implements JbpmJUnit {

	private WorkingMemoryInMemoryLogger logger;

	
	public void setUp() throws Exception {
	}

	
	public void tearDown() throws Exception {
	}

	
	public StatefulKnowledgeSession createKnowledgeSession(KnowledgeBase kbase) {
		StatefulKnowledgeSession result = kbase.newStatefulKnowledgeSession();
		logger = new WorkingMemoryInMemoryLogger(result);
		return result;
	}

	
	public StatefulKnowledgeSession restoreSession(StatefulKnowledgeSession ksession, boolean noCache) {
		return ksession;
	}

	
	public List<String> getTriggeredNodes(long processInstanceId) {
		List<String> triggeredNodes = new ArrayList<String>();
		for (LogEvent event : logger.getLogEvents()) {
			if (event instanceof RuleFlowNodeLogEvent) {
				RuleFlowNodeLogEvent logEvent = (RuleFlowNodeLogEvent) event;
				if (logEvent.getType() == RuleFlowNodeLogEvent.AFTER_RULEFLOW_NODE_TRIGGERED) {
					triggeredNodes.add(logEvent.getNodeName());
				}
			}
		}
		return triggeredNodes;
	}

	
	public void clearHistory() {
		logger.clear();
	}

}

