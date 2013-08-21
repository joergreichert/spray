<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns="http://www.w3.org/1999/xhtml"
	xmlns:xhtml="http://www.w3.org/1999/xhtml" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xs="http://www.w3.org/2001/XMLSchema" exclude-result-prefixes="xhtml xsl xs">

	<!-- <xsl:output method="xml" version="1.0" encoding="UTF-8" doctype-public="-//W3C//DTD 
		XHTML 1.1//EN" doctype-system="http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd" 
		indent="yes" /> -->
	<xsl:output method="xml" version='1.0' encoding='utf-8'
		doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
		indent="yes" />
	<!--================================================================================= -->


	<!--========= Head ================================================================== -->
	<xsl:template match="xhtml:head">
		<xsl:copy>
			<link rel="stylesheet" type="text/css" href="style.css">
			</link>
			<link href="prettyprintsrc/prettify.css" type="text/css" rel="stylesheet">
			</link>
			<!-- To get sepereted close tag for script enter 2 Slashes between them -->
			<script src="prettyprintsrc/prettify.js" type="text/javascript">//</script>
			<xsl:apply-templates select="@*|node()" />
		</xsl:copy>
	</xsl:template>
	<!--================================================================================= -->


	<!--========= Body ================================================================== -->
	<xsl:template match="xhtml:body">
		<xsl:copy>
			<xsl:attribute name="onload">prettyPrint()</xsl:attribute>
			<div class="content">
				<xsl:apply-templates select="@*|node()" />
			</div>
		</xsl:copy>
	</xsl:template>
	<!--================================================================================= -->


	<!--========= Title ================================================================= -->
	<!-- <xsl:template match="xhtml:body/p"> <xsl:copy> <div class="title"> 
		<xsl:apply-templates select="@*|node()" /> </div> <hr /> </xsl:copy> </xsl:template> -->
	<!--================================================================================= -->


	<!--========= CodeBlocks ============================================================= -->
	<xsl:template match="xhtml:pre[xhtml:code]">
		<pre class="prettyprint linenums" id="quine">
			<xsl:value-of select="./xhtml:code" />
		</pre>
	</xsl:template>
	<!--================================================================================= -->
	
	
	<!--========= TOC =================================================================== -->
	<xsl:template match="xhtml:ol[@class='toc']">
		<ol class="toc" style="list-style: disc;">
			<xsl:apply-templates select="@*|node()" />
		</ol>
	</xsl:template>
	<!--================================================================================= -->

	<!--========= Copy ================================================================== -->
	<!-- Copy template -->
	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()" />
		</xsl:copy>
	</xsl:template>
	<!--================================================================================= -->


	<!--========= Remove ================================================================ -->
	<xsl:template match="@shape" />
	<!--================================================================================= -->


	<!--========= TODO ================================================================== -->

	<!--================================================================================= -->

</xsl:stylesheet>