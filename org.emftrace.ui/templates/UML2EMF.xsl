<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmi:version="2.1" xmlns:xmi="http://schema.omg.org/spec/XMI/2.1" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:uml="http://www.eclipse.org/uml2/3.0.0/UML" xmlns:UML="UMLModel">
	<xsl:output method="xml" indent="yes" version="1.0"/>
	<xsl:strip-space elements="*"/>
		
	<!-- replace the namespaces -->
	<xsl:template name="replaceCharsInString">
	  <xsl:param name="stringIn"/>
	  <xsl:choose>
		<xsl:when test="contains($stringIn,'uml')">
		  <xsl:value-of select="concat(substring-before($stringIn,'uml'),'UML')"/>
		  <xsl:call-template name="replaceCharsInString">
			<xsl:with-param name="stringIn" select="substring-after($stringIn,'uml')"/>
		  </xsl:call-template>
		</xsl:when>
		<xsl:otherwise>
		  <xsl:value-of select="$stringIn"/>
		</xsl:otherwise>
	  </xsl:choose>
	</xsl:template>
	
	<!-- template for header info -->
	<xsl:template name="Header">
		<xsl:if test="@xmi:id">
			<xsl:attribute name="umlID">
				<xsl:value-of select="@xmi:id"/>
			</xsl:attribute>
		</xsl:if>
	</xsl:template>
	
	<!--  process basic element info  -->
	<xsl:template name="ProcessElem">
		<xsl:for-each select="@xmi:type">
			<xsl:attribute name="xsi:type">
				<xsl:variable name="valueString"><xsl:value-of select="."/></xsl:variable>
				<xsl:call-template name="replaceCharsInString">
					<xsl:with-param name="stringIn" select="string($valueString)"/>
				</xsl:call-template>
			</xsl:attribute>
		</xsl:for-each>
		<xsl:call-template name="Header"/>
		<xsl:call-template name="ConvertAttr"/>
		<!-- The specific handling of 'ownedPort' is necessary because Visual Paradigm 
			treats ports differently than UML2Tools. Here the the IDs of the ports are 
			collected into one string attribute, because ownedPort is not a containment 
			reference in our metamodel, instead ownedAttribute is one. -->
		<xsl:if test="./ownedPort">
			<xsl:variable name="ports">
				<xsl:for-each select="ownedPort">
					<xsl:choose>
						<xsl:when test="position()=last()">
							<xsl:value-of select="@xmi:id"/>
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="concat(@xmi:id, ' ')"/>
						</xsl:otherwise>
					</xsl:choose>
				</xsl:for-each>
			</xsl:variable>
			<xsl:element name="ownedPort">
				<xsl:value-of select="$ports"/>
			</xsl:element>
		</xsl:if>
		<xsl:apply-templates/>
	</xsl:template>	
	
	<!-- convert model elements -->
	<xsl:template match="*">
		<xsl:choose>
			<!-- classes which are not part of UML  (local-name() = 'packagedElement') or  -->
			<xsl:when test="(local-name() = 'javaDetail') or (local-name() = 'Extend') or (local-name() = 'Property') or (local-name() = 'Include') or (local-name() = 'UseCase') or (local-name() = 'containedNode') or (local-name() = 'Extension') or (local-name() = 'DiagramElement') or (local-name() = 'Diagram') or (local-name() = 'Documentation') or (@xmi:type = 'uml:Stereotype') or (local-name() = 'profileApplication')">
			</xsl:when>
			<xsl:when test="(@xmi:type = 'uml:CombinedFragment') or (@xmi:type = 'uml:Action') or (@xmi:type = 'DiagramOverview') or (@xmi:type = 'uml:ControlFlow')">
			</xsl:when>
			<!-- the test for 'Model' is used for compatibility to the Visual Paradigm UML 
				export file, which uses another root element than UML2Tools -->
			<xsl:when test="(local-name() = 'Package') or (local-name() = 'Model')">
				<xsl:call-template name="Package"/>
			</xsl:when>
			<!-- This is necessary because Visual Paradigm handles ports differently than 
				UML2Tools and than represented in our metamodel. -->
			<xsl:when test="(local-name() = 'ownedPort')">
				<xsl:call-template name="Port"/>
			</xsl:when>
			<xsl:when test="(local-name() = 'DeploymentSpecification')">
				<xsl:call-template name="DeploymentSpecification"/>
			</xsl:when>	
			<xsl:when test="(local-name() = 'Profile')">
				<xsl:call-template name="Profile"/>
			</xsl:when>	
			<xsl:when test="(name() = 'memberEnd')">
				<xsl:attribute name="memberEnd">
					<xsl:value-of select="@xmi:idref"/>
				</xsl:attribute>
 			</xsl:when>
			<xsl:when test="(@xmi:type = 'uml:Pseudostate')">
				<xsl:call-template name="ProcessPseudostate"/>
 			</xsl:when>
			<xsl:when test="(local-name() = 'importedElement')">
			</xsl:when>	
			<xsl:when test="(local-name() = 'elementImport')">
			</xsl:when>
			<xsl:otherwise>
				<xsl:choose>
					<xsl:when test="(local-name() = 'ownedMember')">
						<xsl:element name="packagedElement">
							<xsl:call-template name="ProcessElem"/>
						</xsl:element>
					</xsl:when>
					<xsl:otherwise>
						<xsl:element name="{name(.)}">
							<xsl:call-template name="ProcessElem"/>
						</xsl:element>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<!--  convert element attributes  -->
	<xsl:template name="ConvertAttr">
		<xsl:for-each select="@*">
			<xsl:variable name="TempValue">
				<xsl:value-of select="."/>
			</xsl:variable>
			<xsl:choose>
 				<xsl:when test="(name() = 'indirectlyInstantiated') or (name() = 'isActive') or (name() = 'realizingClassifier') or (name() = 'javaDetail') or (name() = 'changeability') or (name() = 'kind') or (name() = 'isNavigable') or (name() = 'ownerScope') or (name() = 'extension') or (name() = 'isLeaf') or (name() = 'isAbstract') or (name() = 'xmi:type') or (name() = 'xmi:id') or (name() = 'xmi:version') or (name() = 'xsi:schemaLocation')">
 				</xsl:when>
 				<xsl:when test="(name() = 'name') and ($TempValue = '')">
 				</xsl:when>
				<xsl:when test="(name() = 'xmi:idref')">
					<xsl:value-of select="."/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:variable name="AttrName">
						<xsl:value-of select="name()"/>
					</xsl:variable>
					<xsl:element name="{$AttrName}">
						<xsl:variable name="AttrVal">
							<xsl:value-of select="."/>
						</xsl:variable>
						<xsl:choose>
							<xsl:when test="$AttrVal = '*'">
								<xsl:value-of select="-1"/>
							</xsl:when>
 							<xsl:otherwise>
								<xsl:value-of select="."/>
							</xsl:otherwise>
						</xsl:choose>
					</xsl:element>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>
	</xsl:template>
	
	<!-- convert Package -->
	<xsl:template name="Package">
		<xsl:element name="UML:Package">	
			<xsl:attribute name="xmi:version">2.1</xsl:attribute>
			<xsl:call-template name="Header"/>
			<xsl:call-template name="ConvertAttr"/>
			<xsl:apply-templates/>			
		</xsl:element>
	</xsl:template>
	
	<!-- convert Profile -->
	<xsl:template name="Profile">
		<xsl:element name="UML:Profile">	
			<xsl:attribute name="xmi:version">2.1</xsl:attribute>
			<xsl:call-template name="Header"/>
			<xsl:call-template name="ConvertAttr"/>
			<xsl:apply-templates/>			
		</xsl:element>
	</xsl:template>
	
	<!-- convert DeploymentSpecification -->
	<xsl:template name="DeploymentSpecification">
		<xsl:element name="UML:DeploymentSpecification">	
			<xsl:attribute name="xmi:version">2.1</xsl:attribute>
			<xsl:call-template name="Header"/>
			<xsl:call-template name="ConvertAttr"/>
			<xsl:apply-templates/>			
		</xsl:element>
	</xsl:template>
	
	<!-- convert Ports -->
	<!-- This template was introduced to enable import for Visual Paradigm UML models, 
		which exports ports differently as 'ownedPort' element than UML2Tools as 
		'ownedAttribute" -->
	<xsl:template name="Port">
		<xsl:element name="ownedAttribute">	
			<xsl:call-template name="ProcessElem"/>
			<xsl:apply-templates/>			
		</xsl:element>
	</xsl:template>
	
	<xsl:template name="ProcessPseudostate">
		<xsl:element name="node">
			<xsl:attribute name="xsi:type">
				<xsl:choose>
					<xsl:when test="(@kind = 'initial')">UML:InitialNode</xsl:when>
					<xsl:when test="(@kind = 'final')">UML:ActivityFinalNode</xsl:when>
					<xsl:otherwise>UML:DecisionNode</xsl:otherwise>
				</xsl:choose>
			</xsl:attribute>
			<xsl:attribute name="name">
				<xsl:value-of select="@name"/>
			</xsl:attribute>
			<xsl:call-template name="Header"/>
			<xsl:if test="@kind">
			</xsl:if>
		</xsl:element>
	</xsl:template>
				
</xsl:stylesheet>