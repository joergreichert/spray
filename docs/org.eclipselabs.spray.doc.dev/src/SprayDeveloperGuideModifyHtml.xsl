<?xml version="1.0" encoding="UTF-8"?>
<!-- ***************************************************************************
 *  Copyright (c)  The Spray Project.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Spray Dev Team - initial API and implementation
**************************************************************************** -->
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
			<xsl:comment>
			***************************************************************************
			* Copyright (c) The Spray Project.
			* All rights reserved. This program and the accompanying materials
			* are made available under the terms of the Eclipse Public License
			v1.0
			* which accompanies this distribution, and is available at
			* http://www.eclipse.org/legal/epl-v10.html
			*
			* Contributors:
			* Spray Dev Team - initial API and implementation
			****************************************************************************
		</xsl:comment>
		<xsl:copy>
			<link rel="stylesheet" type="text/css" href="style.css">
			</link>
			<link href="prettyprintsrc/prettify.css" type="text/css" rel="stylesheet">
			</link>
			<!-- To get sepereted close tag for script enter 2 Slashes between them -->
			<script src="prettyprintsrc/prettify.js" type="text/javascript">//</script>
			<script type="text/javascript" src="copy2clipboard/jquery.js">//</script>
			<script type="text/javascript" src="copy2clipboard/ZeroClipboard.js">//</script>
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


	<!--========= Chapter =============================================================== -->
	<!-- <xsl:template match="xhtml:h5"> <xsl:copy> <xsl:number level="any" 
		from="xhtml:h1" count="xhtml:h2" /> <xsl:text>.</xsl:text> <xsl:number level="any" 
		from="xhtml:h2" count="xhtml:h3" /> <xsl:text>.</xsl:text> <xsl:number level="any" 
		from="xhtml:h3" count="xhtml:h4" /> <xsl:text>.</xsl:text> <xsl:number level="any" 
		from="xhtml:h4" count="xhtml:h5" /> <xsl:text>. </xsl:text> <xsl:apply-templates 
		/> </xsl:copy> </xsl:template> <xsl:template match="xhtml:h4"> <xsl:copy> 
		<xsl:number level="any" from="xhtml:h1" count="xhtml:h2" /> <xsl:text>.</xsl:text> 
		<xsl:number level="any" from="xhtml:h2" count="xhtml:h3" /> <xsl:text>.</xsl:text> 
		<xsl:number level="any" from="xhtml:h3" count="xhtml:h4" /> <xsl:text>. </xsl:text> 
		<xsl:apply-templates /> </xsl:copy> </xsl:template> <xsl:template match="xhtml:h3"> 
		<xsl:copy> <xsl:number level="any" from="xhtml:h1" count="xhtml:h2" /> <xsl:text>.</xsl:text> 
		<xsl:number level="any" from="xhtml:h2" count="xhtml:h3" /> <xsl:text>. </xsl:text> 
		<xsl:apply-templates /> </xsl:copy> </xsl:template> <xsl:template match="xhtml:h2"> 
		<xsl:copy> <xsl:number level="any" from="xhtml:h1" count="xhtml:h2" /> <xsl:text>. 
		</xsl:text> <xsl:apply-templates /> </xsl:copy> </xsl:template> <xsl:template 
		match="xhtml:h1"> <xsl:copy> <xsl:number /> <xsl:text>. </xsl:text> <xsl:apply-templates 
		/> </xsl:copy> </xsl:template> -->
	<!--================================================================================= -->
	
	
	<!--========= CodeBlocks ============================================================= -->
	<xsl:template match="xhtml:pre[xhtml:code]">
		<xsl:variable name="number">
			<xsl:number />
		</xsl:variable>
		<xsl:variable name="clipboardbutton">
			<xsl:text>'#copy2clip_btn</xsl:text>
			<xsl:value-of select="$number"></xsl:value-of>
			<xsl:text>'</xsl:text>
		</xsl:variable>
		<pre class="prettyprint linenums" id="quine {$number}">
			<xsl:value-of select="./xhtml:code" />
		</pre>
		<div id="copy2clip_btn{$number}" data-clipboard-target="quine {$number}"
			title="Click to copy to clipboard." data-copied-hint="copied!" class="copy2clip_btn">
			Clipboard
		</div>
		<xsl:element name="script">
			<xsl:attribute name="language">Javascript</xsl:attribute>
			<xsl:text>
			var clip = new ZeroClipboard( $(
			</xsl:text>
			<xsl:value-of select="$clipboardbutton"></xsl:value-of>
			<xsl:text>
			),{moviePath:
			"./copy2clipboard/ZeroClipboard.swf"} );
			
			clip.setHandCursor( true );
            clip.setCSSEffects( true );
			</xsl:text>
		</xsl:element>
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
