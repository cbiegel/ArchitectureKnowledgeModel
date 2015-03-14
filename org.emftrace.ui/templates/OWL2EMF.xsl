<?xml version="1.0" encoding="ASCII"?>
<xsl:stylesheet xmi:version="2.1" xmlns:xmi="http://schema.omg.org/spec/XMI/2.1" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:owl="http://www.w3.org/2002/07/owl#" xmlns:OWL="OWLModel" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:org.unicase.metamodel="http://unicase.org/metamodel">
	<xsl:output method="xml" indent="yes" version="1.0"/>
	<xsl:strip-space elements="*"/>
	
	<!-- convert model elements -->
	<xsl:template match="*">
		<xsl:choose>
			<xsl:when test="(local-name() = 'Ontology')">
				<xsl:call-template name="Ontology"/>
			</xsl:when>
			<xsl:when test="(local-name() = 'IRI')">
				<xsl:call-template name="IRI"/>
			</xsl:when>
			<xsl:when test="(local-name() = 'Literal')">
				<xsl:call-template name="Literal"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:element name="{name(.)}">
					<xsl:call-template name="ConvertAttributes"/>
					<xsl:apply-templates/>
				</xsl:element>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<!--  convert element attributes  -->
	<xsl:template name="ConvertAttributes">
		<xsl:for-each select="@*">
			<xsl:choose>
 				<xsl:when test="(name() = 'xmi:type') or (name() = 'xmi:id') or (name() = 'xmi:version')">
 				</xsl:when>
				<xsl:otherwise>
					<xsl:variable name="AttrName">
						<xsl:value-of select="name()"/>
					</xsl:variable>
					<xsl:attribute name="{$AttrName}">
						<xsl:value-of select="."/>
					</xsl:attribute>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>
	</xsl:template>
	
	<!-- convert Ontology -->
	<xsl:template name="Ontology">
		<xsl:element name="OWL:Ontology">
			<xsl:attribute name="xmi:version">2.1</xsl:attribute>
			<xsl:call-template name="ConvertAttributes"/>
			<xsl:apply-templates/>
		</xsl:element>
	</xsl:template>
	
	<!-- convert Literal -->
	<xsl:template name="Literal">
		<xsl:element name="Literal">
			<xsl:attribute name="value">
				<xsl:value-of select="."/>
			</xsl:attribute>
		</xsl:element>
	</xsl:template>
	
	<!-- convert IRI -->
	<xsl:template name="IRI">
		<xsl:element name="IRI">
			<xsl:attribute name="value">
				<xsl:value-of select="."/>
			</xsl:attribute>
		</xsl:element>
	</xsl:template>	
	
</xsl:stylesheet>