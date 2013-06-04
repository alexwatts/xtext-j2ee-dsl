package ajw.xtext.tests.jbpm;

import java.util.List;

import org.drools.KnowledgeBase;
import org.drools.runtime.StatefulKnowledgeSession;

public interface JbpmJUnit {

	void setUp() throws Exception;

	void tearDown() throws Exception;

	StatefulKnowledgeSession createKnowledgeSession(KnowledgeBase kbase);

	StatefulKnowledgeSession restoreSession(StatefulKnowledgeSession ksession, boolean noCache);

	List<String> getTriggeredNodes(long processInstanceId);

	void clearHistory();

}
