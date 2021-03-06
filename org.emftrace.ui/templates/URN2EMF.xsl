<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:URN="URNModel" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" indent="yes" version="1.0"/>
	<xsl:strip-space elements="*"/>
	
	<!-- define the variables -->
	<xsl:variable name="VERSION">2.0</xsl:variable>
	
	<!--  convert element attributes  -->
	<xsl:template name="ConvertAttr">
		<xsl:for-each select="@*">
			<xsl:choose>
 				<xsl:when test="(name() = 'xsi:type')">
 				</xsl:when>
				<xsl:otherwise>
					<xsl:variable name="AttrName">
						<xsl:value-of select="name()"/>
					</xsl:variable>
					<xsl:element name="{$AttrName}">
						<xsl:value-of select="."/>
					</xsl:element>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>
	</xsl:template>
	
	<!-- replace the namespaces -->
	<xsl:template name="replaceCharsInString">
	  <xsl:param name="stringIn"/>
	  <xsl:choose>
		<xsl:when test="contains($stringIn,'xsi')">
		  <xsl:value-of select="concat(substring-before($stringIn,'xsi'),'')"/>
		  <xsl:call-template name="replaceCharsInString">
			<xsl:with-param name="stringIn" select="substring-after($stringIn,'xsi')"/>
		  </xsl:call-template>
		</xsl:when>
		<xsl:otherwise>
		  <xsl:value-of select="$stringIn"/>
		</xsl:otherwise>
	  </xsl:choose>
	</xsl:template>
	
	<!--  process basic element info  -->
	<xsl:template name="ProcessElem">
		<xsl:for-each select="@xsi:type">
			<xsl:attribute name="xsi:type">
				<xsl:variable name="valueString">URN:<xsl:value-of select="."/></xsl:variable>
				<xsl:call-template name="replaceCharsInString">
					<xsl:with-param name="stringIn" select="string($valueString)"/>
				</xsl:call-template>
			</xsl:attribute>
		</xsl:for-each>
		<xsl:call-template name="ConvertAttr"/>
		<xsl:apply-templates/>
	</xsl:template>	
			
	<!-- convert URN spec -->
	<xsl:template name="URNspec">
		<xsl:element name="URN:URNspec">
			<xsl:attribute name="xmi:version">
				<xsl:value-of select="$VERSION"/>
			</xsl:attribute>
			<xsl:call-template name="ProcessElem"/>
		</xsl:element>
	</xsl:template>
		
	<!-- convert strategies -->
	<xsl:template name="Strategie">
		<xsl:element name="strategies">
			<xsl:for-each select="*">	
				<xsl:choose>
					<xsl:when test="(local-name() = 'strategies')">
						<xsl:element name="group">
							<xsl:call-template name="ProcessElem"/>
						</xsl:element>
					</xsl:when>
					<xsl:otherwise>
						<xsl:element name="{name(.)}">
							<xsl:call-template name="ProcessElem"/>
						</xsl:element>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:for-each>
		</xsl:element>
	</xsl:template>
	
	<!-- convert model elements -->
	<xsl:template match="*">
		<xsl:choose>
			<xsl:when test="(local-name() = 'URNspec')">
				<xsl:call-template name="URNspec"/>
			</xsl:when>
			<xsl:when test="(local-name() = 'strategies')">
				<xsl:call-template name="Strategie"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:element name="{name(.)}">
					<xsl:call-template name="ProcessElem"/>
				</xsl:element>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
		
</xsl:stylesheet>