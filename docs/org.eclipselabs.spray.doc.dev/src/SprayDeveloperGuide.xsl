<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xslt="http://www.w3.org/1999/XSL/Format"
	xmlns="http://www.w3.org/1999/XSL/Format" xmlns:old="SprayDeveloperGuide.xml"
	xmlns:date="http://exslt.org/dates-and-times" exclude-result-prefixes="old date">
	<xsl:output indent="yes" omit-xml-declaration="yes" />
	<!--================================================================================= -->


	<!--========= Logo ================================================================== -->
	<!-- template to replace a string from text -->
	<xsl:template name="string-replace-all">
		<xsl:param name="text" />
		<xsl:param name="replace" />
		<xsl:param name="by" />
		<xsl:choose>
			<xsl:when test="contains($text, $replace)">
				<xsl:value-of select="substring-before($text,$replace)" />
				<xsl:value-of select="$by" />
				<xsl:call-template name="string-replace-all">
					<xsl:with-param name="text"
						select="substring-after($text,$replace)" />
					<xsl:with-param name="replace" select="$replace" />
					<xsl:with-param name="by" select="$by" />
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$text" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<!-- search for url and replace it with better resolution -->
	<xsl:variable name="newSrc">
		<xsl:call-template name="string-replace-all">
			<xsl:with-param name="text"
				select="//xslt:block/xslt:external-graphic/@src[contains(.,'Spray-Logo-C.png)')]" />
			<xsl:with-param name="replace" select="'.png)'" />
			<xsl:with-param name="by" select="'-Big.png)'" />
		</xsl:call-template>
	</xsl:variable>
	<!--================================================================================= -->


	<!--========= Header/Footer ========================================================= -->
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
		<region-body margin-bottom="2cm" margin-top="2cm" />
	</xsl:template>

	<!-- Replace all footer Elements with Header and new Footer -->
	<xsl:template match="xslt:static-content[@flow-name='footer']">
		<xsl:comment>
			Header
		</xsl:comment>
		<static-content flow-name="header">
			<block font-size="9.0pt" text-align-last="justify" margin-left="0em"
				margin-bottom="0em" margin-top="0em">
				<xsl:comment>
					external Graphic with dynamic Source (searching for url of src)
				</xsl:comment>
				<retrieve-marker retrieve-class-name="title"
					retrieve-position="first-starting-within-page" retrieve-boundary="page-sequence" />
				<leader leader-pattern="dots" leader-pattern-width="10pt"
					color="rgb(255,255,255)" />
				<xsl:element name="external-graphic">
					<xsl:attribute name="src"><xsl:value-of
						select="$newSrc" /></xsl:attribute>
					<xsl:attribute name="content-height">1cm</xsl:attribute>
				</xsl:element>
				&#160;
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


	<!-- prepare chapters for header -->
	<xsl:template
		match="//xslt:flow/xslt:block[@id][position()=1][not(xslt:inline)]/text()">
		<marker marker-class-name="title">
			<xsl:value-of select="."></xsl:value-of>
		</marker>
		<xsl:value-of select="." />
	</xsl:template>
	<!--================================================================================= -->


	<!--========= Titlepage ============================================================= -->
	<!-- Generate/Modifying the Titlepage -->
	<xsl:template
		match="//xslt:flow/xslt:block/xslt:block[text()='Spray Developer Guide']">
		<xsl:comment>
			Beginning with Logo
		</xsl:comment>
		<block text-align="center" id="SprayAquickwayofcreatingGraphiti">
			<xsl:element name="external-graphic">
				<xsl:attribute name="src"><xsl:value-of select="$newSrc" /></xsl:attribute>
				<xsl:attribute name="content-height">50%</xsl:attribute>
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
	<!--================================================================================= -->


	<!--========= Formatter ============================================================= -->
	<!-- Modifying the root node with font-attributes -->
	<xsl:template match="xslt:root">
		<root font-family="Times" font-size="12pt"
			xmlns="http://www.w3.org/1999/XSL/Format">
			<xsl:apply-templates select="@*|node()" />
		</root>
	</xsl:template>

	<!-- Underline Hyperlinks -->
	<xsl:template match="//xslt:inline[starts-with(text(),'http')]">
		<xsl:comment>
			Hyperlink
		</xsl:comment>
		<inline text-decoration="underline" color="blue">
			<xsl:value-of select="."></xsl:value-of>
		</inline>
	</xsl:template>

	<!-- Format codeblocks and delete the obsolete parent node --> <!-- Child have to contain text! -->
	<xsl:template
		match="//xslt:block[@font-family='monospace'][xslt:block[@font-family='monospace'][text()!='']]">
		<xsl:comment>
			Codeblock
		</xsl:comment>
		<xsl:copy>
			<xsl:copy-of select="@*" />
			<xsl:attribute name="background-color">rgb(246, 244, 240)</xsl:attribute>
			<xsl:attribute name="border-width">1px</xsl:attribute>
			<xsl:attribute name="border-style">solid</xsl:attribute>
			<xsl:attribute name="border-color">rgb(212,212,212)</xsl:attribute>
			<xsl:attribute name="padding">2px</xsl:attribute>
			<xsl:attribute name="padding-left">6px</xsl:attribute>
			<xsl:attribute name="page-break-inside">avoid</xsl:attribute>
			<xsl:attribute name="margin-left">0em</xsl:attribute>
			<xsl:attribute name="margin-right">0em</xsl:attribute>
			<xsl:copy-of select="./node()/text()" />
		</xsl:copy>
		<xsl:apply-templates />
	</xsl:template>
	<!--================================================================================= -->


	<!--========= Table of Content ====================================================== -->
	<!-- Fancy Table of Contents like 1.2. Chapter ................ 3 -->
	<xsl:template
		match="//xslt:list-item-body/xslt:block/xslt:basic-link[@internal-destination]">
		<block text-align-last="justify" margin-left="0em" space-before="5pt">
			<xsl:choose>
				<!-- test for rootChapter -->
				<xsl:when test="../xslt:list-block and ../../../../../../xslt:flow">
					<!-- TODO seperate RootChapter by linebreak -->
					<!-- <block>&#160;</block> -->
					<inline font-weight="bold">
						<xsl:copy>
							<xsl:apply-templates select="node()|@*" />
						</xsl:copy>
					</inline>
					<leader leader-pattern="dots" leader-pattern-width="5pt"
						color="white" />
					<xsl:element name="page-number-citation">
						<xsl:attribute name="ref-id"><xsl:value-of
							select="./@internal-destination" />
              </xsl:attribute>
					</xsl:element>
				</xsl:when>
				<xsl:otherwise>
					<!-- SubChapter -->
					<xsl:copy>
						<xsl:apply-templates select="node()|@*" />
					</xsl:copy>
					<leader leader-pattern="dots" leader-pattern-width="5pt" />
					<xsl:element name="page-number-citation">
						<xsl:attribute name="ref-id"><xsl:value-of
							select="./@internal-destination" />
        </xsl:attribute>
					</xsl:element>
				</xsl:otherwise>
			</xsl:choose>
		</block>
	</xsl:template>
	<!--================================================================================= -->


	<!--========= Table ================================================================= -->
	<xsl:template
		match="//xslt:table">
		<xsl:comment>
			Table
		</xsl:comment>
		<xsl:copy>
			<xsl:copy-of select="@*" />
			<xsl:attribute name="max-width">85%</xsl:attribute>
			<xsl:attribute name="min-width">40%</xsl:attribute>
		<xsl:attribute name="border">1px solid black</xsl:attribute>
		<xsl:apply-templates />
		</xsl:copy>
	</xsl:template>
	
		<xsl:template
		match="//xslt:table-row">
		<xsl:comment>
			Table-row
		</xsl:comment>
		<xsl:copy>
			<xsl:copy-of select="@*" />
			<xsl:attribute name="border">1px solid black</xsl:attribute>
		<xsl:apply-templates />
		</xsl:copy>
	</xsl:template>
	
			<xsl:template
		match="//xslt:table-cell">
		<xsl:comment>
			Table-cell
		</xsl:comment>
		<xsl:copy>
			<xsl:copy-of select="@*" />
			<xsl:attribute name="border">1px solid black</xsl:attribute>
			<xsl:attribute name="padding-left">5px</xsl:attribute>
			<xsl:attribute name="padding-right">3px</xsl:attribute>
		<xsl:apply-templates />
		</xsl:copy>
	</xsl:template>
	<!--================================================================================= -->


	<!--========= Copy ================================================================== -->
	<!-- Copy template -->
	<xsl:template match="node()|@*">
		<xsl:copy>
			<xsl:apply-templates select="node()|@*" />
		</xsl:copy>
	</xsl:template>


	<!-- Alternative Copy-template -->
	<!-- <xsl:template match="*"> <xsl:copy> <xsl:copy-of select="attribute::*[. 
		!= '']" /> <xsl:apply-templates /> </xsl:copy> </xsl:template> -->
	<!--================================================================================= -->


	<!--========= Remove ================================================================ -->
	<!-- REMOVE unwanted Contents -->
	<!-- Titlepage in table of contents -->
	<xsl:template match="//xslt:block[xslt:inline[text()='Authors:']]">
		<xsl:comment>
			Moved Logo,Authors and headline to Titlepage
		</xsl:comment>
	</xsl:template>
	<xsl:template match="//xslt:block[@id='SprayAquickwayofcreatingGraphiti']" />
	<xsl:template match="//xslt:block[xslt:inline[text()='Developer Guide']]" />

	<!-- old places of spraylogo -->
	<xsl:template
		match="//xslt:block[xslt:external-graphic/@src[contains(.,'Spray-Logo-C.png')]]" />

	<!-- block which are surrounded by same -->
	<xsl:template
		match="//xslt:block[@font-family='monospace']/xslt:block[@font-family='monospace']" />
	<!--================================================================================= -->


	<!--========= TODO ================================================================== -->
	<!-- TODO seperate RootChapter by linebreak -->
	<!-- <!- Template for Fancy Table of Contents -> <xsl:template match="//xslt:list-item/xslt:list-item-label"> 
		<xsl:choose> <xsl:when test="../xslt:list-item-body/xslt:block/xslt:block/xslt:inline[@font-weight='bold']/xslt:basic-link[@internal-destination]"> 
		<block>&#160;</block> </xsl:when> </xsl:choose> <xsl:copy> <xsl:apply-templates 
		select="node()|@*" /> </xsl:copy> </xsl:template> -->
	<!--================================================================================= -->

</xsl:stylesheet>