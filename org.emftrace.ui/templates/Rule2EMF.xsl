<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:RuleModel="RuleModel">
	<xsl:output method="xml" indent="yes" version="1.0"/>
	<xsl:strip-space elements="*"/>
	
	<!-- clear everything -->
	<xsl:template match="*">
	</xsl:template>
		
	<xsl:template match="Rule"> 
		<xsl:element name="RuleModel:Rule">
			<xsl:attribute name="RuleID">
				<xsl:value-of select="@RuleID"/>
			</xsl:attribute>
			<xsl:choose>
				<xsl:when test="@Description">
					<xsl:attribute name="Description">
						<xsl:value-of select="@Description"/>
					</xsl:attribute>
				</xsl:when>
			</xsl:choose>
			<xsl:apply-templates/>
		</xsl:element>
	</xsl:template>
	
	<xsl:template match="Elements">
		<xsl:element name="Elements">
			<xsl:attribute name="Type">
				<xsl:value-of select="@Type"/>
			</xsl:attribute>
			<xsl:attribute name="Alias">
				<xsl:value-of select="@Alias"/>
			</xsl:attribute>
		</xsl:element>
	</xsl:template>
	
	<xsl:template match="Actions">
		<xsl:element name="Actions">
			<xsl:choose>
				<xsl:when test="@ActionType">
					<xsl:attribute name="ActionType">
						<xsl:value-of select="@ActionType"/>
					</xsl:attribute>
				</xsl:when>
			</xsl:choose>
			<xsl:choose>
				<xsl:when test="@ResultType">
					<xsl:attribute name="ResultType">
						<xsl:value-of select="@ResultType"/>
					</xsl:attribute>
				</xsl:when>
			</xsl:choose>
			<xsl:choose>
				<xsl:when test="@SourceElement">
					<xsl:attribute name="SourceElement">
						<xsl:value-of select="@SourceElement"/>
					</xsl:attribute>
				</xsl:when>
			</xsl:choose>
			<xsl:choose>
				<xsl:when test="@TargetElement">
					<xsl:attribute name="TargetElement">
						<xsl:value-of select="@TargetElement"/>
					</xsl:attribute>
				</xsl:when>
			</xsl:choose>
		</xsl:element>
	</xsl:template>
	
	<xsl:template match="Conditions">
		<xsl:element name="Conditions">
			<xsl:choose>
				<xsl:when test="@Type">
					<xsl:attribute name="Type">
						<xsl:value-of select="@Type"/>
					</xsl:attribute>
				</xsl:when>
			</xsl:choose>
			<xsl:apply-templates/>
		</xsl:element>
	</xsl:template>
	
	<xsl:template match="LogicConditions">
		<xsl:element name="LogicConditions">
			<xsl:choose>
				<xsl:when test="@Type">
					<xsl:attribute name="Type">
						<xsl:value-of select="@Type"/>
					</xsl:attribute>
				</xsl:when>
			</xsl:choose>
			<xsl:apply-templates/>
		</xsl:element>
	</xsl:template>
	
	<xsl:template match="BaseConditions">
		<xsl:element name="BaseConditions">
			<xsl:choose>
				<xsl:when test="@Type">
					<xsl:attribute name="Type">
						<xsl:value-of select="@Type"/>
					</xsl:attribute>
				</xsl:when>
			</xsl:choose>
			<xsl:attribute name="Source">
				<xsl:value-of select="@Source"/>
			</xsl:attribute>
			<xsl:choose>
				<xsl:when test="@Target">
					<xsl:attribute name="Target">
						<xsl:value-of select="@Target"/>
					</xsl:attribute>
				</xsl:when>
				<xsl:when test="@Value">
					<xsl:attribute name="Value">
						<xsl:value-of select="@Value"/>
					</xsl:attribute>
				</xsl:when>
			</xsl:choose>
		</xsl:element>
	</xsl:template>
	
</xsl:stylesheet>