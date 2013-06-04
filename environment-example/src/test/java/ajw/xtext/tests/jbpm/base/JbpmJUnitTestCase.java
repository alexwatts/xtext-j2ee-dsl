package ajw.xtext.tests.jbpm.base;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;

import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.process.WorkItem;
import org.drools.runtime.process.WorkItemHandler;
import org.drools.runtime.process.WorkItemManager;
import org.drools.runtime.process.WorkflowProcessInstance;
import org.junit.After;
import org.junit.Before;

import ajw.xtext.tests.jbpm.JbpmJUnit;

public abstract class JbpmJUnitTestCase {

	protected final static String EOL = System.getProperty("line.separator");

	private TestWorkItemHandler workItemHandler = new TestWorkItemHandler();

	private final JbpmJUnit jbpmJUnit;

	private static class ServiceLocator {
		private static JbpmJUnit SERVICE = loadService();

		private static JbpmJUnit loadService() {
			ServiceLoader<JbpmJUnit> loader = ServiceLoader.load(JbpmJUnit.class);
			return loader.iterator().next();
		}
	}

	public JbpmJUnitTestCase() {
		this(ServiceLocator.SERVICE);
	}

	public JbpmJUnitTestCase(JbpmJUnit jbpmJUnit) {
		this.jbpmJUnit = jbpmJUnit;
	}

	@Before
	public void setUp() throws Exception {
		jbpmJUnit.setUp();
	}

	@After
	public void tearDown() throws Exception {
		jbpmJUnit.tearDown();
	}

	protected StatefulKnowledgeSession createKnowledgeSession(String... process) {
		KnowledgeBase kbase = createKnowledgeBase(process);
		return createKnowledgeSession(kbase);
	}

	protected StatefulKnowledgeSession createKnowledgeSession(KnowledgeBase kbase) {
		return jbpmJUnit.createKnowledgeSession(kbase);
	}

	protected KnowledgeBase createKnowledgeBase(String... processes) {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		for (String process : processes) {
			kbuilder.add(ResourceFactory.newClassPathResource(process), ResourceType.BPMN2);
		}
		return kbuilder.newKnowledgeBase();
	}

	protected KnowledgeBase createKnowledgeBase(Map<String, ResourceType> resources) throws Exception {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		for (Map.Entry<String, ResourceType> entry : resources.entrySet()) {
			kbuilder.add(ResourceFactory.newClassPathResource(entry.getKey()), entry.getValue());
		}
		return kbuilder.newKnowledgeBase();
	}

	protected KnowledgeBase createKnowledgeBaseGuvnor(String... packages) throws Exception {
		return createKnowledgeBaseGuvnor(false, "http://localhost:8080/drools-guvnor", "admin", "admin", packages);
	}

	protected KnowledgeBase createKnowledgeBaseGuvnorAssets(String pkg, String... assets) throws Exception {
		return createKnowledgeBaseGuvnor(false, "http://localhost:8080/drools-guvnor", "admin", "admin", pkg, assets);
	}

	protected KnowledgeBase createKnowledgeBaseGuvnor(boolean dynamic, String url, String username, String password, String pkg, String... assets) throws Exception {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder();
		String changeSet = "<change-set xmlns='http://drools.org/drools-5.0/change-set'"
				+ EOL
				+ "            xmlns:xs='http://www.w3.org/2001/XMLSchema-instance'"
				+ EOL
				+ "            xs:schemaLocation='http://drools.org/drools-5.0/change-set http://anonsvn.jboss.org/repos/labs/labs/jbossrules/trunk/drools-api/src/main/resources/change-set-1.0.0.xsd' >"
				+ EOL + "    <add>" + EOL;
		for (String a : assets) {
			if (a.indexOf(".bpmn") >= 0) {
				a = a.substring(0, a.indexOf(".bpmn"));
			}
			changeSet += "        <resource source='"
					+ url
					+ "/rest/packages/"
					+ pkg
					+ "/assets/"
					+ a
					+ "/binary' type='BPMN2' basicAuthentication=\"enabled\" username=\""
					+ username + "\" password=\"" + password + "\" />" + EOL;
		}
		changeSet += "    </add>" + EOL + "</change-set>";
		kbuilder.add(
				ResourceFactory.newByteArrayResource(changeSet.getBytes()),
				ResourceType.CHANGE_SET);
		return kbuilder.newKnowledgeBase();
	}
	
	protected static KnowledgeBase createKnowledgeBaseWithGuvnorServer( ) throws Exception {
            KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
           File changeSet = new File("src/change-set.xml");
            kbuilder.add(
                            ResourceFactory.newByteArrayResource(getBytesFromFile(changeSet)),
                            ResourceType.CHANGE_SET);
            return kbuilder.newKnowledgeBase();
    }
	
	// Returns the contents of the file in a byte array.
	public static byte[] getBytesFromFile(File file) throws IOException {
	    InputStream is = new FileInputStream(file);

	    // Get the size of the file
	    long length = file.length();

	    // Create the byte array to hold the data
	    byte[] bytes = new byte[(int)length];

	    // Read in the bytes
	    int offset = 0;
	    int numRead = 0;
	    while (offset < bytes.length
	           && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
	        offset += numRead;
	    }

	    // Ensure all the bytes have been read in
	    if (offset < bytes.length) {
	        throw new IOException("Could not completely read file "+file.getName());
	    }

	    // Close the input stream and return bytes
	    is.close();
	    return bytes;
	}

	protected KnowledgeBase createKnowledgeBaseGuvnor(boolean dynamic,
			String url, String username, String password, String... packages)
			throws Exception {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder();
		String changeSet = "<change-set xmlns='http://drools.org/drools-5.0/change-set'"
				+ EOL
				+ "            xmlns:xs='http://www.w3.org/2001/XMLSchema-instance'"
				+ EOL
				+ "            xs:schemaLocation='http://drools.org/drools-5.0/change-set http://anonsvn.jboss.org/repos/labs/labs/jbossrules/trunk/drools-api/src/main/resources/change-set-1.0.0.xsd' >"
				+ EOL + "    <add>" + EOL;
		for (String p : packages) {
			changeSet += "        <resource source='"
					+ url
					+ "/rest/packages/"
					+ p
					+ "/binary' type='PKG' basicAuthentication=\"enabled\" username=\""
					+ username + "\" password=\"" + password + "\" />" + EOL;
		}
		changeSet += "    </add>" + EOL + "</change-set>";
		kbuilder.add(
				ResourceFactory.newByteArrayResource(changeSet.getBytes()),
				ResourceType.CHANGE_SET);
		return kbuilder.newKnowledgeBase();
	}

	public Object getVariableValue(String name, long processInstanceId, StatefulKnowledgeSession ksession) {
		return ((WorkflowProcessInstance) ksession.getProcessInstance(processInstanceId)).getVariable(name);
	}

	public TestWorkItemHandler getTestWorkItemHandler() {
		return workItemHandler;
	}

	public static class TestWorkItemHandler implements WorkItemHandler {

		private List<WorkItem> workItems = new ArrayList<WorkItem>();

		public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
			workItems.add(workItem);
		}

		public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		}

		public WorkItem getWorkItem() {
			if (workItems.size() == 0) {
				return null;
			}
			if (workItems.size() == 1) {
				WorkItem result = workItems.get(0);
				this.workItems.clear();
				return result;
			} else {
				throw new IllegalArgumentException(
						"More than one work item active");
			}
		}

		public List<WorkItem> getWorkItems() {
			List<WorkItem> result = new ArrayList<WorkItem>(workItems);
			workItems.clear();
			return result;
		}

	}

	protected void clearHistory() {
		jbpmJUnit.clearHistory();
	}

	protected StatefulKnowledgeSession restoreSession(
			StatefulKnowledgeSession ksession, boolean noCache) {
		return jbpmJUnit.restoreSession(ksession, noCache);
	}

	protected StatefulKnowledgeSession attachSynchronousHandler(StatefulKnowledgeSession ksession) {
		ksession.getWorkItemManager().registerWorkItemHandler("Synchronous",
				new WorkItemHandler() {

					public void executeWorkItem(WorkItem workItem,
							WorkItemManager manager) {
						System.out.println("Executing...");
						manager.completeWorkItem(workItem.getId(), null);
					}

					public void abortWorkItem(WorkItem workItem,
							WorkItemManager manager) {
						System.out.println("Aborting...");
						manager.completeWorkItem(workItem.getId(), null);
					}
				});
		
		ksession.getWorkItemManager().registerWorkItemHandler("Asynchronous",
				new WorkItemHandler() {

					
					public void executeWorkItem(WorkItem workItem,
							WorkItemManager manager) {
						System.out.println("Executing...");
						manager.completeWorkItem(workItem.getId(), null);
					}

					
					public void abortWorkItem(WorkItem workItem,
							WorkItemManager manager) {
						System.out.println("Aborting...");
						manager.completeWorkItem(workItem.getId(), null);
					}
				});
		
		
		return ksession;
	}

	public void assertNodeTriggered(long processInstanceId, String... expectedNodeNames) {
		List<String> triggeredNodes = jbpmJUnit.getTriggeredNodes(processInstanceId);

		assertOnlyExpectedNodesAreTriggered(triggeredNodes, expectedNodeNames);
// Works with databases but not with the InMemory KnowledgeBase
//		assertdNodesAreTriggeredInOrder(triggeredNodes, expectedNodeNames);
	}

	private void assertOnlyExpectedNodesAreTriggered(List<String> triggeredNodes, String... expectedNodeNames) {
		List<String> notTriggeredNodes = notTriggeredNodes(triggeredNodes, expectedNodeNames);

		assertTrue(notTriggeredNodesMessage(notTriggeredNodes), notTriggeredNodes.isEmpty());
		assertEquals("Unexpected nodes triggered: expected " + Arrays.toString(expectedNodeNames) + ", actual " + triggeredNodes
				,expectedNodeNames.length, triggeredNodes.size());
	}

	private void assertdNodesAreTriggeredInOrder(List<String> triggeredNodes, String... expectedNodeNames) {
		List<String> notTriggeredInOrder = notTriggeredInOrder(triggeredNodes, expectedNodeNames);

		assertTrue(notTriggeredInOrderMessage(notTriggeredInOrder), notTriggeredInOrder.isEmpty());
		assertEquals("Some nodes are not triggered in order: expected " + Arrays.toString(expectedNodeNames) + ", actual " + triggeredNodes
				,expectedNodeNames.length, triggeredNodes.size());
	}
	
	private String notTriggeredInOrderMessage(List<String> notTriggeredinOrder) {
		if (notTriggeredinOrder.isEmpty())
			return "";

		StringBuilder msgBuilder = new StringBuilder();
		for (String name : notTriggeredinOrder) {
			msgBuilder.append(", ");
			msgBuilder.append(name);
		}
		return "Node(s) not executed in expected order: " + msgBuilder.substring(2);
	}

	private String notTriggeredNodesMessage(List<String> notTriggeredNodes) {
		if (notTriggeredNodes.isEmpty())
			return "";

		StringBuilder msgBuilder = new StringBuilder();
		for (String name : notTriggeredNodes) {
			msgBuilder.append(", ");
			msgBuilder.append(name);
		}
		return "Node(s) not executed: " + msgBuilder.substring(2);
	}

	private List<String> notTriggeredNodes(List<String> triggeredNodes, String... expectedNodeNames) {
		List<String> notTriggeredNodes = new ArrayList<String>();
		for (String expected : expectedNodeNames) {
			if (!triggeredNodes.contains(expected)) {
				notTriggeredNodes.add(expected);
			}
		}
		return notTriggeredNodes;
	}

	private List<String> notTriggeredInOrder(List<String> triggeredNodes, String... expectedNodeNames) {
		List<String> notTriggeredInOrder = new ArrayList<String>();
		int i = 0;
		for (String expected : expectedNodeNames) {
			String actualNode = triggeredNodes.get(i);
			if (!actualNode.equals(expected)) {
				notTriggeredInOrder.add(expected);
			}
			i++;
		}
		return notTriggeredInOrder;
	}

}

