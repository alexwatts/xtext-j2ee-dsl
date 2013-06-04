package ajw.xtext.tests.jbpm.util;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.drools.definition.process.Node;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.process.ProcessInstance;
import org.jbpm.workflow.instance.impl.WorkflowProcessInstanceImpl;

public final class WorkflowTestUtil {

	public static void assertProcessInstanceCompleted(long processInstanceId, StatefulKnowledgeSession ksession) {
		assertNull(ksession.getProcessInstance(processInstanceId));
	}

	public static void assertProcessInstanceAborted(long processInstanceId, StatefulKnowledgeSession ksession) {
		assertNull(ksession.getProcessInstance(processInstanceId));
	}

	public static void assertProcessInstanceActive(long processInstanceId, StatefulKnowledgeSession ksession) {
		assertNotNull(ksession.getProcessInstance(processInstanceId));
	}

	public static void assertNumOfIncommingConnections(ProcessInstance process, String nodeName, int num) {
		assertNodeExists(process, nodeName);
		WorkflowProcessInstanceImpl instance = (WorkflowProcessInstanceImpl) process;
		for (Node node : instance.getNodeContainer().getNodes()) {
			if (node.getName().equals(nodeName)) {
				if (node.getIncomingConnections().size() != num) {
					fail("Expected incomming connections: " + num + " - found " + node.getIncomingConnections().size());
				} else {
					break;
				}
			}
		}
	}

	public static void assertNumOfOutgoingConnections(ProcessInstance process, String nodeName, int num) {
		assertNodeExists(process, nodeName);
		WorkflowProcessInstanceImpl instance = (WorkflowProcessInstanceImpl) process;
		for (Node node : instance.getNodeContainer().getNodes()) {
			if (node.getName().equals(nodeName)) {
				if (node.getOutgoingConnections().size() != num) {
					fail("Expected outgoing connections: " + num + " - found " + node.getOutgoingConnections().size());
				} else {
					break;
				}
			}
		}
	}

	public static void assertNodeExists(ProcessInstance process, String... nodeNames) {
		WorkflowProcessInstanceImpl instance = (WorkflowProcessInstanceImpl) process;
		List<String> names = new ArrayList<String>();
		for (String nodeName : nodeNames) {
			names.add(nodeName);
		}

		for (Node node : instance.getNodeContainer().getNodes()) {
			if (names.contains(node.getName())) {
				names.remove(node.getName());
			}
		}

		if (!names.isEmpty()) {
			String s = names.get(0);
			for (int i = 1; i < names.size(); i++) {
				s += ", " + names.get(i);
			}
			fail("Node(s) do not exist: " + s);
		}
	}

	public static void assertVersionEquals(ProcessInstance process, String version) { WorkflowProcessInstanceImpl instance = (WorkflowProcessInstanceImpl) process;
		if (!instance.getWorkflowProcess().getVersion().equals(version)) {
			fail("Expected version: " + version + " - found " + instance.getWorkflowProcess().getVersion());
		}
	}

	public static void assertProcessNameEquals(ProcessInstance process, String name) {
		WorkflowProcessInstanceImpl instance = (WorkflowProcessInstanceImpl) process;
		if (!instance.getWorkflowProcess().getName().equals(name)) {
			fail("Expected name: " + name + " - found " + instance.getWorkflowProcess().getName());
		}
	}

	public static void assertPackageNameEquals(ProcessInstance process, String packageName) {
		WorkflowProcessInstanceImpl instance = (WorkflowProcessInstanceImpl) process;
		if (!instance.getWorkflowProcess().getPackageName().equals(packageName)) {
			fail("Expected package name: " + packageName + " - found " + instance.getWorkflowProcess().getPackageName());
		}
	}

}

