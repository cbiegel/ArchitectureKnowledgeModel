<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmi:version="2.1" xmlns:xmi="http://schema.omg.org/spec/XMI/2.1" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:bpmn="http://www.omg.org/spec/BPMN/20100524/MODEL-XMI" xmlns:BPMN="BPMN2Model">
	<xsl:output method="xml" indent="yes" version="1.0"/>
	<xsl:strip-space elements="*"/>
			
	<!-- convert model elements -->
	<xsl:template match="*">
		<xsl:choose>
			<xsl:when test="(local-name() = 'Models')">
				<xsl:element name="BPMNProject">
					<xsl:call-template name="ConvertModels"/>
				</xsl:element>
			</xsl:when>
		</xsl:choose>
	</xsl:template>
	
	<xsl:template name="ConvertModels">
		<xsl:choose>
			<xsl:when test="(@modelType = 'BPMessage')">
				<xsl:call-template name="Message"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPTextAnnotation')">
				<xsl:call-template name="TextAnnotation"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPPool')">
				<xsl:call-template name="Pool"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPTask')">
				<xsl:call-template name="Task"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPServiceTask')">
				<xsl:call-template name="ServiceTask"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPImplWebService')">
				<xsl:call-template name="ImplWebService"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPProcedure')">
				<xsl:call-template name="Procedure"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPProcedureStep')">
				<xsl:call-template name="ProcedureStep"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPIntermediateEvent')">
				<xsl:call-template name="IntermediateEvent"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPSignalTrigger')">
				<xsl:call-template name="SignalTrigger"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPDataStore')">
				<xsl:call-template name="DataStore"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPLane')">
				<xsl:call-template name="Lane"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPStartEvent')">
				<xsl:call-template name="StartEvent"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPEndEvent')">
				<xsl:call-template name="EndEvent"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPSubProcess')">
				<xsl:call-template name="SubProcess"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPGateway')">
				<xsl:call-template name="Gateway"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPGatewayDataBasedXOR')">
				<xsl:call-template name="GatewayDataBasedXOR"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPGate')">
				<xsl:call-template name="Gate"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPDataObject')">
				<xsl:call-template name="DataObject"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPMIOrderingParallel')">
				<xsl:call-template name="OrderingParallel"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPReceiveTask')">
				<xsl:call-template name="ReceiveTask"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPTimerTrigger')">
				<xsl:call-template name="TimerTrigger"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPGatewayComplex')">
				<xsl:call-template name="GatewayComplex"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPLoopMultiInstance')">
				<xsl:call-template name="LoopMultiInstance"/>
			</xsl:when>
			<xsl:when test="(@modelType = 'BPInput')">
				<xsl:call-template name="Input"/>
			</xsl:when>
		</xsl:choose>
	</xsl:template>
	
	<xsl:template name="Message">
		<xsl:element name="Message">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="TextAnnotation">
		<xsl:element name="TextAnnotation">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="Pool">
		<xsl:element name="Pool">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="Task">
		<xsl:element name="Task">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="ServiceTask">
		<xsl:element name="ServiceTask">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="ImplWebService">
		<xsl:element name="ImplWebService">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="Procedure">
		<xsl:element name="Procedure">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="ProcedureStep">
		<xsl:element name="ProcedureStep">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="IntermediateEvent">
		<xsl:element name="IntermediateEvent">
		</xsl:element>
	</xsl:template>

	<xsl:template name="SignalTrigger">
		<xsl:element name="SignalTrigger">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="DataStore">
		<xsl:element name="DataStore">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="Lane">
		<xsl:element name="Lane">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="StartEvent">
		<xsl:element name="StartEvent">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="EndEvent">
		<xsl:element name="EndEvent">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="SubProcess">
		<xsl:element name="SubProcess">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="Gateway">
		<xsl:element name="Gateway">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="GatewayDataBasedXOR">
		<xsl:element name="GatewayDataBasedXOR">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="Gate">
		<xsl:element name="Gate">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="DataObject">
		<xsl:element name="DataObject">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="OrderingParallel">
		<xsl:element name="OrderingParallel">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="ReceiveTask">
		<xsl:element name="ReceiveTask">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="TimerTrigger">
		<xsl:element name="TimerTrigger">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="GatewayComplex">
		<xsl:element name="GatewayComplex">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="LoopMultiInstance">
		<xsl:element name="LoopMultiInstance">
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="Input">
		<xsl:element name="Input">
		</xsl:element>
	</xsl:template>
	
</xsl:stylesheet>