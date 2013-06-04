package ajw.xtext.tests.jbpm.base.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.persistence.jpa.JPAKnowledgeService;
import org.drools.runtime.Environment;
import org.drools.runtime.EnvironmentName;
import org.drools.runtime.KnowledgeSessionConfiguration;
import org.drools.runtime.StatefulKnowledgeSession;
import org.jbpm.process.audit.JPAProcessInstanceDbLog;
import org.jbpm.process.audit.JPAWorkingMemoryDbLogger;
import org.jbpm.process.audit.NodeInstanceLog;

import ajw.xtext.tests.jbpm.JbpmJUnit;
import bitronix.tm.TransactionManagerServices;

public class JpaJbpmJUnit implements JbpmJUnit {

	private static final String PERSISTENCE_UNIT = "org.jbpm.persistence.jpa.test";

	private EntityManagerFactory emf;
	private JPAProcessInstanceDbLog log;

	
	public void setUp() throws Exception {
        emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
	}

	
	public void tearDown() throws Exception {
		closeEntityManagerFactory();
	}

	private void closeEntityManagerFactory() {
		if (emf != null) {
			emf.close();
		}
	}

	
	public StatefulKnowledgeSession createKnowledgeSession(KnowledgeBase kbase) {
		Environment env = initEnvironment(emf);
		StatefulKnowledgeSession result = JPAKnowledgeService.newStatefulKnowledgeSession(kbase, null, env);
		new JPAWorkingMemoryDbLogger(result);
		if (log == null) {
			log = new JPAProcessInstanceDbLog(result.getEnvironment());
		}
		return result;
	}

	private Environment initEnvironment(EntityManagerFactory factory) {
		Environment env = KnowledgeBaseFactory.newEnvironment();
		env.set(EnvironmentName.ENTITY_MANAGER_FACTORY, factory);
		env.set(EnvironmentName.TRANSACTION_MANAGER, TransactionManagerServices.getTransactionManager());
		return env;
	}

	
	public StatefulKnowledgeSession restoreSession(StatefulKnowledgeSession ksession, boolean noCache) {
		int id = ksession.getId();
		KnowledgeBase kbase = ksession.getKnowledgeBase();
		Environment env = null;
		if (noCache) {
			closeEntityManagerFactory();
			emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
			env = initEnvironment(emf);
		} else {
			env = ksession.getEnvironment();
		}
		KnowledgeSessionConfiguration config = ksession.getSessionConfiguration();
		StatefulKnowledgeSession result = JPAKnowledgeService.loadStatefulKnowledgeSession(id, kbase, config, env);
		new JPAWorkingMemoryDbLogger(result);
		return result;
	}

	
	public void clearHistory() {
		if (log == null) {
			log = new JPAProcessInstanceDbLog();
		}
		log.clear();
	}

	
	public List<String> getTriggeredNodes(long processInstanceId) {
		List<String> triggeredNodes = new ArrayList<String>();
		List<NodeInstanceLog> logs = log.findNodeInstances(processInstanceId);
		if (logs != null) {
			for (NodeInstanceLog l: logs) {
				String nodeName = l.getNodeName();
				if (l.getType() == NodeInstanceLog.TYPE_ENTER) {
					triggeredNodes.add(nodeName);
				}
			}
		}
		return triggeredNodes;
	}

}

