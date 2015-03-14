<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:cm="http://www.pure-systems.com/consul/model" xmlns:pvmodel="http://pure-variants.com/pvmodel" xmlns:FeatureModel="FeatureModel"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	exclude-result-prefixes="pvmodel xsi" version="1.0">
	
	<!-- convert model elements -->
	<xsl:template match="*">
		<xsl:choose>
			<xsl:when test="(local-name() = 'ConsulModel')">
				<xsl:element name="cm:consulmodel">
					<xsl:call-template name="ConvertAttributes"/>
					<xsl:apply-templates/>
				</xsl:element>
			</xsl:when>
			<xsl:when test="@xsi:type">
				<xsl:element name="cm:constant">
					<xsl:call-template name="ConvertAttributes"/>
					<xsl:value-of select="@content"/>
					<xsl:apply-templates/>
				</xsl:element>
			</xsl:when>
			<xsl:when test="(local-name() = 'target')">
				<xsl:element name="cm:target">
					<xsl:call-template name="ConvertAttributes"/>
					<xsl:value-of select="@content"/>
					<xsl:apply-templates/>
				</xsl:element>
			</xsl:when>
			<xsl:when test="(local-name() = 'script')">
				<xsl:element name="cm:script">
					<xsl:call-template name="ConvertAttributes"/>
					<xsl:value-of select="@content"/>
					<xsl:apply-templates/>
				</xsl:element>
			</xsl:when>
			<xsl:otherwise>	
				<xsl:variable name="modelname">
					<xsl:value-of select="local-name()"/>
				</xsl:variable>
				<xsl:element name="{concat('cm:',$modelname)}">
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
 				<xsl:when test="(name() = 'content') or (name() = 'xsi:type') or (name() = 'xmi:type') or (name() = 'xmi:id') or (name() = 'xmi:version')">
 				</xsl:when>
				<xsl:when test="(local-name() = 'restrictionid')">
					<xsl:attribute name="cm:restriction">
						<xsl:value-of select="."/>
					</xsl:attribute>
 				</xsl:when>
				<xsl:otherwise>
					<xsl:variable name="AttrName">
						<xsl:value-of select="name()"/>
					</xsl:variable>
					<xsl:attribute name="{concat('cm:',$AttrName)}">
						<xsl:value-of select="."/>
					</xsl:attribute>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>
	</xsl:template>
	
</xsl:stylesheet>