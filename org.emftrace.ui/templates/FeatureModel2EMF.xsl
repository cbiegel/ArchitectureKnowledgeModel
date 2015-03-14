<?xml version="1.0" encoding="ASCII"?>
<xsl:stylesheet xmi:version="2.1" xmlns:xmi="http://schema.omg.org/spec/XMI/2.1" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:cm="http://www.pure-systems.com/consul/model" xmlns:pvmodel="http://pure-variants.com/pvmodel" xmlns:FeatureModel="FeatureModel" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:org.unicase.metamodel="http://unicase.org/metamodel">
	<xsl:output method="xml" indent="yes" version="1.0"/>
	<xsl:strip-space elements="*"/>
	
	<!-- convert model elements -->
	<xsl:template match="*">
		<xsl:choose>
			<xsl:when test="(local-name() = 'consulmodel')">
				<xsl:element name="FeatureModel:ConsulModel">
					<xsl:call-template name="ConvertAttributes"/>
					<xsl:apply-templates/>
				</xsl:element>
			</xsl:when>
			<xsl:when test="(local-name() = 'target')">
				<xsl:element name="target">
					<xsl:attribute name="content">
						<xsl:value-of select="."/>
					</xsl:attribute>
					<xsl:call-template name="ConvertAttributes"/>
					<xsl:apply-templates/>
				</xsl:element>
			</xsl:when>
			<xsl:when test="(local-name() = 'script')">
				<xsl:element name="script">
					<xsl:attribute name="content">
						<xsl:value-of select="."/>
					</xsl:attribute>
					<xsl:call-template name="ConvertAttributes"/>
					<xsl:apply-templates/>
				</xsl:element>
			</xsl:when>
			<xsl:when test="(local-name() = 'constant')">
				<xsl:element name="value">
					<xsl:attribute name="content">
						<xsl:value-of select="."/>
					</xsl:attribute>
					<xsl:attribute name="xsi:type">FeatureModel:Constant</xsl:attribute>
					<xsl:call-template name="ConvertAttributes"/>
					<xsl:apply-templates/>
				</xsl:element>
			</xsl:when>
			<xsl:otherwise>
				<xsl:element name="{local-name()}">
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
				<xsl:when test="(local-name() = 'restriction')">
					<xsl:attribute name="restrictionid">
						<xsl:value-of select="."/>
					</xsl:attribute>
 				</xsl:when>
				<xsl:otherwise>
					<xsl:attribute name="{local-name()}">					  
						<xsl:value-of select="."/>
					</xsl:attribute>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>
	</xsl:template>
	
</xsl:stylesheet>