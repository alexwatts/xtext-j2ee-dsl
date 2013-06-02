/*
 * generated by Xtext
 */
package workflowdsl.generator

import com.google.inject.Inject
import workflowdsl.workflowDsl.AsyncronousServiceTask
import workflowdsl.workflowDsl.BasicConnector
import workflowdsl.workflowDsl.ConditionalConnector
import workflowdsl.workflowDsl.Connector
import workflowdsl.workflowDsl.ConvergingGateway
import workflowdsl.workflowDsl.DivergingGateway
import workflowdsl.workflowDsl.EndNode
import workflowdsl.workflowDsl.ExclusiveConverging
import workflowdsl.workflowDsl.ExlcusiveDiverging
import workflowdsl.workflowDsl.Gateway
import workflowdsl.workflowDsl.InputData
import workflowdsl.workflowDsl.Node
import workflowdsl.workflowDsl.OutputData
import workflowdsl.workflowDsl.ParallelConverging
import workflowdsl.workflowDsl.ParallelDiverging
import workflowdsl.workflowDsl.ServiceTask
import workflowdsl.workflowDsl.Signal
import workflowdsl.workflowDsl.StartNode
import workflowdsl.workflowDsl.StringBasedConditionalVaraible
import workflowdsl.workflowDsl.SyncronousServiceTask
import workflowdsl.workflowDsl.TaskNameInput
import workflowdsl.workflowDsl.VariableBasedInput
import workflowdsl.workflowDsl.WorkflowDefinition
import org.eclipse.emf.common.util.EList
import workflowdsl.workflowDsl.Event
import workflowdsl.workflowDsl.EventBasedInput

class BPMN2Generator  {
	
	@Inject extension WorkflowDslGeneratorExtensions generatorExtensions
	
	def compileBpmn2(WorkflowDefinition w) '''
<?xml version="1.0" encoding="UTF-8"?> 
<definitions id="Definition"
             targetNamespace="http://www.jboss.org/drools"
             typeLanguage="http://www.java.com/javaTypes"
             expressionLanguage="http://www.mvel.org/2.0"
             xmlns="http://www.omg.org/spec/BPMN/20100524/MODEL"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://www.omg.org/spec/BPMN/20100524/MODEL BPMN20.xsd"
             xmlns:g="http://www.jboss.org/drools/flow/gpd"
             xmlns:bpmndi="http://www.omg.org/spec/BPMN/20100524/DI"
             xmlns:dc="http://www.omg.org/spec/DD/20100524/DC"
             xmlns:di="http://www.omg.org/spec/DD/20100524/DI"
             xmlns:tns="http://www.jboss.org/drools">

  «FOR v:w.events»
	 «val itemDefinition = itemDefinition(v)»
	 «itemDefinition»
  «ENDFOR»

  <process processType="Private" isExecutable="true" id="«w.name».bpmn2" name="«w.name».bpmn2" tns:packageName="«w.packages.name»">

  <!-- process variables -->
  «FOR v:w.events»
	 «val property = property(v)»
	 	«property»
	 	
  «ENDFOR»
  
  <!-- process variables -->
  «FOR v:w.variables.filter(typeof(StringBasedConditionalVaraible))»
	 «val property = property(v)»
	 	«property»
	 	
  «ENDFOR»

  <!-- nodes -->
  «FOR v:w.nodes»
	 «val node = node(v, w.nodes.indexByNodeName(v.name))»
	 	«node»
	 	
  «ENDFOR»

  <!-- connections -->
  «FOR c:w.connectors»
	 «val connector = connector(c, w.nodes.indexByNodeName(c.from.name), w.nodes.indexByNodeName(c.to.name))»
	 	«connector»
	 	
  «ENDFOR»

  </process>

</definitions>		
	'''
	
	def itemDefinition(Event e) '''
		<itemDefinition id="_«e.name»Item" structureRef="java.util.Map"/>
	'''
	
	def property(Event e) '''
			<property id="«e.name»" itemSubjectRef="_«e.name»Item"/>
	'''
	
	def property(StringBasedConditionalVaraible v) '''
			<property id="«v.name»" itemSubjectRef="_«v.name»Item"/>
	'''
	
	def node(Node n, int index) '''
		«IF n instanceof StartNode»«var startNode = startNode(n as StartNode, index)»«startNode»«ENDIF»
		«IF n instanceof EndNode»«var endNode = endNode(n as EndNode, index)»«endNode»«ENDIF»
		«IF n instanceof ServiceTask»«var serviceTask = serviceTask(n as ServiceTask, index)»«serviceTask»«ENDIF»
		«IF n instanceof Gateway»«var gateway = gateway(n as Gateway, index)»«gateway»«ENDIF»
		«IF n instanceof Signal»«var signal = signal(n as Signal, index)»«signal»«ENDIF»
	'''
	
	def startNode(StartNode n, int index) '''
			<startEvent id="_«index»" name="«n.name»"/>
	'''
	
	def endNode(EndNode n, int index) '''
			<endEvent id="_«index»" name="«n.name»">
				<terminateEventDefinition/>
			</endEvent>
	'''
	
	def serviceTask(ServiceTask n, int index) '''
		«IF n instanceof AsyncronousServiceTask»«var asyncronousServiceTask = asyncronousServiceTask(n as AsyncronousServiceTask, index)»«asyncronousServiceTask»«ENDIF»
		«IF n instanceof SyncronousServiceTask»«var syncronousServiceTask = syncronousServiceTask(n as SyncronousServiceTask, index)»«syncronousServiceTask»«ENDIF»
	'''
	
	def gateway(Gateway n, int index) '''
		«IF n instanceof DivergingGateway»«var divergingGateway = divergingGateway(n as DivergingGateway, index)»«divergingGateway»«ENDIF»
		«IF n instanceof ConvergingGateway»«var convergingGateway = convergingGateway(n as ConvergingGateway, index)»«convergingGateway»«ENDIF»
	'''
	
	def divergingGateway(Gateway n, int index) '''
		«IF n instanceof ExlcusiveDiverging»«var exlcusiveDiverging = exlcusiveDiverging(n as ExlcusiveDiverging, index)»«exlcusiveDiverging»«ENDIF»
		«IF n instanceof ParallelDiverging»«var parallelDiverging = parallelDiverging(n as ParallelDiverging, index)»«parallelDiverging»«ENDIF»
	'''
	
	def convergingGateway(Gateway n, int index) '''
		«IF n instanceof ExclusiveConverging»«var exclusiveConverging = exclusiveConverging(n as ExclusiveConverging, index)»«exclusiveConverging»«ENDIF»
		«IF n instanceof ParallelConverging»«var parallelConverging = parallelConverging(n as ParallelConverging, index)»«parallelConverging»«ENDIF»
	'''
	
	def asyncronousServiceTask(AsyncronousServiceTask n, int index) '''
			<task id="_«index»" name="«n.name»"  tns:taskName="Asynchronous">
				«var inputAndOutput = inputAndOutput(n.inputs, n.output, index,  n)»«inputAndOutput»
			</task>
	'''
	
	def syncronousServiceTask(SyncronousServiceTask n, int index) '''
			<task id="_«index»" name="«n.name»"  tns:taskName="Synchronous">
				«var inputAndOutput = inputAndOutput(n.inputs, n.output, index,  n)»«inputAndOutput»
			</task>
	'''
	
	def exlcusiveDiverging(ExlcusiveDiverging n, int index) '''
			<exclusiveGateway id="_«index»" name="«n.name»" gatewayDirection="Diverging"/>
	'''
	
	def parallelDiverging(ParallelDiverging n, int index) '''
			<parallelGateway id="_«index»" name="«n.name»" gatewayDirection="Diverging"/>
	'''
	
	def exclusiveConverging(ExclusiveConverging n, int index) '''
			<exclusiveGateway id="_«index»" name="«n.name»" gatewayDirection="Converging"/>
	'''
	
	def parallelConverging(ParallelConverging n, int index) '''
			<parallelGateway id="_«index»" name="«n.name»" gatewayDirection="Converging"/>
	'''
	
	def connector(Connector c, int fromIndex, int toIndex) '''
		«IF c instanceof BasicConnector»«var basicConnector = basicConnector(c as BasicConnector, fromIndex, toIndex)»«basicConnector»«ENDIF»
		«IF c instanceof ConditionalConnector»«var conditionalConnector = conditionalConnector(c as ConditionalConnector, fromIndex, toIndex)»«conditionalConnector»«ENDIF»
	'''
	
	def basicConnector(BasicConnector c, int fromIndex, int toIndex) '''
			<sequenceFlow id="_«fromIndex»-_«toIndex»" sourceRef="_«fromIndex»" targetRef="_«toIndex»" />
	'''
	
	def conditionalConnector(ConditionalConnector c, int fromIndex, int toIndex) '''
			<sequenceFlow id="_«fromIndex»_«toIndex»" sourceRef="_«fromIndex»" targetRef="_«toIndex»" name="«c.name»">
				<conditionExpression xsi:type="tFormalExpression" >return «c.event.name».get("«c.stringBasedConditionalExpression.name»") == "«c.value»";</conditionExpression>
			</sequenceFlow>
	'''
	
	def signal(Signal n, int index) '''
			<intermediateCatchEvent id="_«index»" name="«n.name»" >
				«IF n.output != null»«var outputData = outputData(n.output, index, n)»«outputData»«ENDIF»
				«IF n.output != null»«var dataOutputAssociation = dataOutputAssociationForEvent(n.output, n.event, index, n)»«dataOutputAssociation»«ENDIF»
				«IF n.output != null»
				<outputSet>
					«var outputSet = outputSet(n.output, index, n)»«outputSet»
				</outputSet>
				«ENDIF»
				<signalEventDefinition signalRef="«n.name»"/>    	
			</intermediateCatchEvent>
	'''
	
	def inputAndOutput(EList<InputData> i, OutputData o, int index, Node n) '''
			<ioSpecification>
				«FOR id:i»
					 «var taskNameInput = dataInput(id, index, n)»«taskNameInput»
				«ENDFOR»

				«IF o != null»«var outputData = outputData(o, index, n)»«outputData»«ENDIF»
				<inputSet>
				«FOR id:i»
					 «var taskNameInputSet = taskNameInputSet(id, index, n)»«taskNameInputSet»
				«ENDFOR»
				</inputSet>
				<outputSet>
				«IF o != null»«var outputData = outputData(o, index, n)»«outputData»«ENDIF»
				</outputSet>
			</ioSpecification>
			«FOR id:i»
					 «var dataInputAssociation = dataInputAssociation(id, index, n)»«dataInputAssociation»
			«ENDFOR»
			«IF o != null»«var dataOutputAssociation = dataOutputAssociation(o, index, n)»«dataOutputAssociation»«ENDIF»
	'''
	
	def dispatch dataInput(InputData t, int index, Node n) '''			
	'''
	
	def dispatch dataInput(TaskNameInput t, int index, Node n) '''
					<dataInput id="_«index»_TaskNameInput" name="TaskName" />
	'''
	
	def dispatch dataInput(VariableBasedInput v, int index, Node n) '''
					<dataInput id="«v.eventParameterName»" name="«v.eventParameterName»"/>
	'''
	
	def dispatch dataInput(EventBasedInput v, int index, Node n) '''
					<dataInput id="«v.eventParameterName»" name="«v.eventParameterName»"/>
	'''
	
	def outputData(OutputData o, int index, Node n ) '''
					<dataOutput id="_«index»_result" name="_«index»_Result" />
	'''
	
	def dispatch taskNameInputSet(InputData i, int index, Node n) '''
	'''
	
	def dispatch taskNameInputSet(TaskNameInput t, int index, Node n) '''
						<dataInputRefs>_«index»_TaskNameInput</dataInputRefs>
	'''
	
	def dispatch taskNameInputSet(VariableBasedInput v, int index, Node n) '''
						<dataInputRefs>«v.eventParameterName»</dataInputRefs>
	'''
	
	def dispatch taskNameInputSet(EventBasedInput v, int index, Node n) '''
						<dataInputRefs>«v.eventParameterName»</dataInputRefs>
	'''
	
	def outputSet(OutputData o, int index, Node n) '''
						<dataOutputRefs>_«index»_result</dataOutputRefs>
	'''

	def dispatch dataInputAssociation(InputData i, int index, Node n) '''
	'''
	
	def dispatch dataInputAssociation(TaskNameInput t, int index, Node n) '''
					<dataInputAssociation>
						<targetRef>_«index»_TaskNameInput</targetRef>
						<assignment>
							<from xsi:type="tFormalExpression">«n.name»</from>
							<to xsi:type="tFormalExpression">_«index»_TaskNameInput</to>
						</assignment>
					</dataInputAssociation>
	'''
	
	def dispatch dataInputAssociation(VariableBasedInput v, int index, Node n) '''
					<dataInputAssociation>
						<sourceRef>«v.variable.name»</sourceRef>
						<targetRef>«v.eventParameterName»</targetRef>
					</dataInputAssociation>
	'''
	
	def dispatch dataInputAssociation(EventBasedInput v, int index, Node n) '''
					<dataInputAssociation>
						<sourceRef>«v.event.name».get("«v.variable.name»")</sourceRef>
						<targetRef>«v.eventParameterName»</targetRef>
					</dataInputAssociation>
	'''
	
	def dataOutputAssociation(OutputData o, int index, Node n) '''
					<dataOutputAssociation>
						<sourceRef>_«index»_result</sourceRef>
						<targetRef>«o.value.name»</targetRef>
					</dataOutputAssociation>
	'''
	
	def dataOutputAssociationForEvent(OutputData o, Event e, int index, Node n) '''
					<dataOutputAssociation>
						<sourceRef>_«index»_result</sourceRef>
						<targetRef>«e.name»</targetRef>
					</dataOutputAssociation>
	'''
	
}