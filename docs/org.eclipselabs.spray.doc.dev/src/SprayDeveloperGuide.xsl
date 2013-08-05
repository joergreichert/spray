<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xslt="http://www.w3.org/1999/XSL/Format"
	xmlns="http://www.w3.org/1999/XSL/Format" xmlns:old="SprayDeveloperGuide.xml"
	xmlns:date="http://exslt.org/dates-and-times" exclude-result-prefixes="old date">
	<xsl:output indent="yes" omit-xml-declaration="yes" />


	<!-- Modifying the root node with font-attributes -->
	<xsl:template match="xslt:root">
		<root font-family="Times" font-size="12pt"
			xmlns="http://www.w3.org/1999/XSL/Format">
			<xsl:apply-templates select="@*|node()" />
		</root>
	</xsl:template>


	<!-- Replace footer with header and new footer deklaration -->
	<xsl:template match="xslt:region-after">
		<xsl:comment>
			header and footer Declaration
		</xsl:comment>
		<region-before extent="2cm" precedence="false"
			region-name="header" />
		<region-after extent="2cm" precedence="false"
			region-name="footer" />
	</xsl:template>


	<!-- Add margin top to region body -->
	<xsl:template match="xslt:region-body">
		<region-body margin-bottom="3cm" margin-top="2cm" />
	</xsl:template>


	<!-- Replace all footer Elements with Header and new Footer -->
	<xsl:template match="xslt:static-content[@flow-name='footer']">
		<xsl:comment>
			Header
		</xsl:comment>
		<static-content flow-name="header">
			<block font-size="10.0pt" text-align="right">
				<xsl:comment>
					external Graphic with dynamic Source (searching for url of src)
				</xsl:comment>
				<xsl:element name="external-graphic">
					<xsl:attribute name="src"><xsl:value-of
						select="//xslt:block/xslt:external-graphic/@src" /></xsl:attribute>
					<xsl:attribute name="width">20%</xsl:attribute>
					<xsl:attribute name="content-height">20%</xsl:attribute>
					<xsl:attribute name="content-width">scale-to-fit</xsl:attribute>
					<xsl:attribute name="scaling">uniform</xsl:attribute>
				</xsl:element>
			</block>
			<xsl:comment>
				Horizontalline
			</xsl:comment>
			<block>
				<leader leader-pattern="rule" rule-thickness="1.0pt"
					leader-length="100%" />
			</block>
		</static-content>
		<xsl:comment>
			Footer
		</xsl:comment>
		<static-content flow-name="footer">
			<block>
				<leader leader-pattern="rule" rule-thickness="1.0pt"
					leader-length="100%" />
			</block>
			<block font-size="10.0pt" text-align="center">
				-
				<page-number />
				-
			</block>
		</static-content>
	</xsl:template>


	<!-- Modifying the Titlepage -->
	<xsl:template
		match="//xslt:flow/xslt:block/xslt:block[text()='Spray Developer Guide']">
		<xsl:comment>
			Beginning with Logo
		</xsl:comment>
		<block text-align="center" id="SprayAquickwayofcreatingGraphiti">
			<xsl:element name="external-graphic">
				<xsl:attribute name="src"><xsl:value-of
					select="//xslt:block/xslt:external-graphic/@src" /></xsl:attribute>
				<xsl:attribute name="width">80%</xsl:attribute>
				<xsl:attribute name="content-height">80%</xsl:attribute>
				<xsl:attribute name="content-width">scale-to-fit</xsl:attribute>
				<xsl:attribute name="scaling">uniform</xsl:attribute>
			</xsl:element>
		</block>
		<xsl:comment>
			Title
		</xsl:comment>
		<block font-weight="bold" font-size="25pt" text-align="center"
			space-before="19pt">
			Spray Developer Guide
		</block>
		<xsl:comment>
			Authors
		</xsl:comment>
		<block font-size="14pt" text-align="center" space-before="19pt">Jos
			Warmer, Karsten Thoms, Joerg Reichert
		</block>
		<xsl:comment>
			Dynamic Date in Format DD. MonthName YYYY
		</xsl:comment>
		<block font-weight="italic" font-size="14pt" text-align="center"
			space-before="19pt">
			<xsl:value-of select="date:day-in-month()" />
			.&#160;
			<xsl:value-of select="date:month-name()" />
			&#160;
			<xsl:value-of select="date:year()" />
		</block>
	</xsl:template>


	<!-- Underline Hyperlinks -->
	<xsl:template match="//xslt:inline[starts-with(text(),'http')]">
		<inline text-decoration="underline" color="blue">
			<xsl:value-of select="."></xsl:value-of>
		</inline>
	</xsl:template>


	<!-- Formatter codeblocks and delete the obsolete parent node --> <!-- Child have to contain text! -->
	<xsl:template match="//xslt:block[@font-family='monospace'][xslt:block[@font-family='monospace'][text()!='']]">
		<xsl:copy>
			<xsl:copy-of select="@*" />
			<xsl:attribute name="background-color">rgb(246, 244, 240)</xsl:attribute>
			<xsl:attribute name="border-width">1px</xsl:attribute>
			<xsl:attribute name="border-style">solid</xsl:attribute>
			<xsl:attribute name="border-color">rgb(212,212,212)</xsl:attribute>
			<xsl:attribute name="padding">2px</xsl:attribute>
			<xsl:attribute name="page-break-inside">avoid</xsl:attribute>
			<xsl:copy-of select="./node()/text()" />
		</xsl:copy>
		<xsl:apply-templates />
	</xsl:template>


	<!-- Copy template‚ -->
	<xsl:template match="node()|@*">
		<xsl:copy>
			<xsl:apply-templates select="node()|@*" />
		</xsl:copy>
	</xsl:template>


	<!-- Alternative Copy-template -->
	<!-- <xsl:template match="*"> <xsl:copy> <xsl:copy-of select="attribute::*[. 
		!= '']" /> <xsl:apply-templates /> </xsl:copy> </xsl:template> -->


	<!-- Remove unwanted Contents -->
	<!-- Titlepage in table of contents -->
	<xsl:template match="//xslt:block[xslt:inline[text()='Authors:']]">
		<xsl:comment>
			Moved Logo,Authors and headline to Titlepage
		</xsl:comment>
	</xsl:template>
	<xsl:template match="//xslt:block[@id='SprayAquickwayofcreatingGraphiti']" />
	<xsl:template match="//xslt:block[xslt:inline[text()='Developer Guide']]" />

	<!-- old places of spraylogo -->
	<xsl:template match="//xslt:block[xslt:external-graphic]" />

	<!-- block which are surrounded by same -->
	<xsl:template
		match="//xslt:block[@font-family='monospace']/xslt:block[@font-family='monospace']" />

</xsl:stylesheet>