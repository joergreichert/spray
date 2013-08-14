<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns="http://www.w3.org/1999/xhtml"
	xmlns:xhtml="http://www.w3.org/1999/xhtml" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xs="http://www.w3.org/2001/XMLSchema" exclude-result-prefixes="xhtml xsl xs">

	<xsl:output method="xml" version="1.0" encoding="UTF-8"
		doctype-public="-//W3C//DTD XHTML 1.1//EN" doctype-system="http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd"
		indent="yes" />
	<!--================================================================================= -->


	<!--========= Head ================================================================== -->
	<xsl:template match="xhtml:head">
		<xsl:copy>
			<link rel="stylesheet" type="text/css" href="style.css" />
			<script
				src="https://google-code-prettify.googlecode.com/svn/loader/run_prettify.js?autoload=true&amp;lang=css"
				defer="defer"></script>
			<style>
				.operative {
				font-weight: bold;
				border: 1px solid yellow
				}
			</style>
			<xsl:apply-templates select="@*|node()" />
		</xsl:copy>
	</xsl:template>
	<!--================================================================================= -->


	<!--========= Body ================================================================== -->
	<xsl:template match="xhtml:body">
		<xsl:copy>
			<div class="content">
				<xsl:apply-templates select="@*|node()" />
			</div>
		</xsl:copy>
	</xsl:template>
	<!--================================================================================= -->


	<!--========= Title ================================================================= -->
	<xsl:variable name="titleposition">
	
	</xsl:variable>
	<xsl:template match="xhtml:body/p">
		<xsl:copy>
			<div class="title">
				<xsl:apply-templates select="@*|node()" />
			</div>
		</xsl:copy>
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