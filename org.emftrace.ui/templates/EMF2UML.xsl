<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xmi="http://schema.omg.org/spec/XMI/2.1" xmi:version="2.1" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:uml="http://www.eclipse.org/uml2/3.0.0/UML" xmlns:UML="UMLModel">
	<xsl:output method="xml" indent="yes" version="1.0"/>
	<xsl:strip-space elements="*"/>
	
	<!-- replace the namespaces -->
	<xsl:template name="replaceCharsInString">
	  <xsl:param name="stringIn"/>
	  <xsl:choose>
		<xsl:when test="contains($stringIn,'UML')">
		  <xsl:value-of select="concat(substring-before($stringIn,'UML'),'uml')"/>
		  <xsl:call-template name="replaceCharsInString">
			<xsl:with-param name="stringIn" select="substring-after($stringIn,'UML')"/>
		  </xsl:call-template>
		</xsl:when>
		<xsl:otherwise>
		  <xsl:value-of select="$stringIn"/>
		</xsl:otherwise>
	  </xsl:choose>
	</xsl:template>
	
	<!--  process basic element info  -->
	<xsl:template name="ProcessElem">
		<!-- EMFStore handles the exported XML representation of model elements via 
			'saveObjectToResource' differently than its internal XML representation; 
			in the first case the xsi namespace is converted to xmi 
			(xsi:type -> xmi:type) in the latter not. 
			Therefore, we need to consider both cases, for automatic export by EMFTrace 
			and for manual export via EMFStore ucm format and a subsequent XSL transformation  -->
		<xsl:for-each select="@xsi:type|@xmi:type">
			<xsl:attribute name="xmi:type">
				<xsl:variable name="valueString"><xsl:value-of select="."/></xsl:variable>
				<xsl:call-template name="replaceCharsInString">
					<xsl:with-param name="stringIn" select="string($valueString)"/>
				</xsl:call-template>
			</xsl:attribute>
		</xsl:for-each>
		<xsl:call-template name="ConvertAttr"/>
		<xsl:apply-templates/>
	</xsl:template>	
	
	<!-- convert model elements -->
	<xsl:template match="*">
		<xsl:choose>
			<xsl:when test="(local-name() = 'Package')">
				<xsl:call-template name="Package"/>
			</xsl:when>	
			<xsl:when test="(local-name() = 'DeploymentSpecification')">
				<xsl:call-template name="DeploymentSpecification"/>
			</xsl:when>	
			<xsl:when test="(local-name() = 'Profile')">
				<xsl:call-template name="Profile"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:element name="{name(.)}">
					<xsl:call-template name="ProcessElem"/>
				</xsl:element>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<!--  convert element attributes  -->
	<xsl:template name="ConvertAttr">
		<xsl:for-each select="@*">
			<xsl:choose>
				<!-- Again as with the ProcessElement template xmi and xsi are considered. -->
 				<xsl:when test="(name() = 'xsi:type') or (name() = 'xmi:type') or (name() = 'xmi:version') or (name() = 'identifier') or (name() = 'creator') or (name() = 'creationDate')">
 				</xsl:when>
 				<xsl:when test="(name() = 'umlID')">
 					<xsl:attribute name="xmi:id">
 						<xsl:value-of select="."/>
 					</xsl:attribute>
 				</xsl:when>
				<xsl:otherwise>
					<xsl:variable name="AttrName">
						<xsl:value-of select="name()"/>
					</xsl:variable>
					<xsl:attribute name="{$AttrName}">
						<xsl:variable name="AttrVal">
							<xsl:value-of select="."/>
						</xsl:variable>
						<xsl:choose>
							<xsl:when test="$AttrVal = '-1'">
								<xsl:value-of select="*"/>
							</xsl:when>
 							<xsl:otherwise>
								<xsl:value-of select="."/>
							</xsl:otherwise>
						</xsl:choose>
					</xsl:attribute>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>
	</xsl:template>
	
	<!-- convert Profile -->
	<xsl:template name="Profile">
		<xsl:element name="uml:Profile">	
			<xsl:attribute name="xmi:version">2.1</xsl:attribute>
			<xsl:call-template name="ConvertAttr"/>
			<xsl:apply-templates/>			
		</xsl:element>
	</xsl:template>
	
	<!-- convert Package -->
	<xsl:template name="Package">
		<!-- Visual Paradigm needs 'Model' here instead of 'Package', the UML2Tools can cope with both. -->
		<xsl:element name="uml:Model">
			<xsl:attribute name="xmi:version">2.1</xsl:attribute>
			<xsl:call-template name="ConvertAttr"/>
			<xsl:element name="elementImport">
				<xsl:attribute name="xmi:id">_1</xsl:attribute>
				<xsl:element name="importedElement">
					<xsl:attribute name="xmi:type">uml:PrimitiveType</xsl:attribute>	
					<xsl:attribute name="href">pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Boolean</xsl:attribute>
				</xsl:element>
			</xsl:element>
			<xsl:element name="elementImport">
				<xsl:attribute name="xmi:id">_1</xsl:attribute>
				<xsl:element name="importedElement">
					<xsl:attribute name="xmi:type">uml:PrimitiveType</xsl:attribute>	
					<xsl:attribute name="href">pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String</xsl:attribute>
				</xsl:element>
			</xsl:element>
			<xsl:element name="elementImport">
				<xsl:attribute name="xmi:id">_1</xsl:attribute>
				<xsl:element name="importedElement">
					<xsl:attribute name="xmi:type">uml:PrimitiveType</xsl:attribute>	
					<xsl:attribute name="href">pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#UnlimitedNatural</xsl:attribute>
				</xsl:element>
			</xsl:element>
			<xsl:element name="elementImport">
				<xsl:attribute name="xmi:id">_1</xsl:attribute>
				<xsl:element name="importedElement">
					<xsl:attribute name="xmi:type">uml:PrimitiveType</xsl:attribute>	
					<xsl:attribute name="href">pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer</xsl:attribute>
				</xsl:element>
			</xsl:element>
			<xsl:apply-templates/>			
		</xsl:element>
	</xsl:template>
	
	<!-- convert DeploymentSpecification -->
	<xsl:template name="DeploymentSpecification">
		<xsl:element name="uml:DeploymentSpecification">	
			<xsl:attribute name="xmi:version">2.1</xsl:attribute>
			<xsl:call-template name="ConvertAttr"/>
			<xsl:apply-templates/>			
		</xsl:element>
	</xsl:template>
			
</xsl:stylesheet>