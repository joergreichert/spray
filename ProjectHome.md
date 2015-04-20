<table border='0'>
<tr>
<td>
<img src='http://spray.eclipselabs.org.codespot.com/git.wiki/images/logo/Spray-Logo-C.png' />

The Graphiti framework is a new approach to create highly sophisticated visual editors on top of the GEF framework. Graphiti can easily be integrated with EMF as the domain modeling framework. The creation of visual editors is done in Java, programming against the Graphiti framework API. It is fairly simple, but yet repetitive, which makes it a candidate to be supported by the means of model-driven development.<br>
<br>
Spray aims to provide Domain Specific Languages (DSL) (implemented with <a href='http://www.eclipse.org/Xtext'>Xtext</a>) to describe Visual DSL Editors against the Graphiti runtime, and provide code generation (implemented with <a href='http://www.eclipse.org/xtend/'>Xtend</a>) to create the boilerplate code for realizing the implementation against the Graphiti framework. Potentially the Spray DSL can be used to generate code for other graphical editor frameworks as well, although it is not the primary focus of the project now.<br>
<br>
The generated code is structured in such a way that one can always extend/overwrite the generated code with handwritten Java to add advanced Graphiti features that are not supported directly by the Spray DSL. Therefore Spray makes use of the <a href='http://heikobehrens.net/2009/04/23/generation-gap-pattern/'>"Generation Gap Pattern"</a>.<br>
<br>
With the help of the tools created with Spray, Graphiti based diagram editors can be created much faster and reliable than doing it purely by hand.<br>
<br>
The code is in early state and subject to change.<br>
<br>
<h2>Documentation</h2>
A short introduction to Spray can be found in the <a href='http://code.google.com/a/eclipselabs.org/p/spray/downloads/list'>downloads section</a>. Find more documentation here:<br>
<br>
<table border='0'>
<tr><td> </td><td>Release Version</td><td>CI Build Version</td></tr>
<tr>
<td>User Guide</td>
<td></td>
<td><a href='http://spray.eclipselabs.org.codespot.com/files/SprayUserGuide.pdf'>PDF</a></td>
<td><a href='https://spray.ci.cloudbees.com/job/spray-docs-build/lastSuccessfulBuild/artifact/docs/org.eclipselabs.spray.doc.user/docs/html/SprayUserGuide.html'>HTML</a></td>
<td><a href='https://spray.ci.cloudbees.com/job/spray-docs-build/lastSuccessfulBuild/artifact/docs/org.eclipselabs.spray.doc.user/docs/pdf/SprayUserGuide.pdf'>PDF</a></td>
</tr>
<tr>
<td>Developer Guide</td>
<td></td>
<td><a href='http://spray.eclipselabs.org.codespot.com/files/SprayDeveloperGuide.pdf'>PDF</a></td>
<td><a href='https://spray.ci.cloudbees.com/job/spray-docs-build/lastSuccessfulBuild/artifact/docs/org.eclipselabs.spray.doc.dev/docs/html/SprayDeveloperGuide.html'>HTML</a></td>
<td><a href='https://spray.ci.cloudbees.com/job/spray-docs-build/lastSuccessfulBuild/artifact/docs/org.eclipselabs.spray.doc.dev/docs/pdf/SprayDeveloperGuide.pdf'>PDF</a></td>
</tr>
</table>

<table border='0'>
<tr>
<td>
<img src='http://web-static-cloudfront.s3.amazonaws.com/images/badges/BuiltOnDEV.png' />
</td>
</tr></table>

<h2>Eclipse SDK</h2>

Predefined Eclipse packages for developing Spray based projects are available for download. Note that we only support 64 bit versions.<br>
<br>
<table border='0'>
<tr colspan='3'><td>Spray SDK for Eclipse Juno</td></tr>
<tr>
<td width='200px'>
<a href='https://spray.ci.cloudbees.com/job/spray-distrobuilder/lastSuccessfulBuild/artifact/devtools/org.eclipselabs.spray.dev.distrobuilder/target/dist/eclipse-SDK-4.3-win32-x86_64-Spray-0.5.0-SNAPSHOT.zip'>Windows (64bit)</a>
</td>
<td width='200px'>
<a href='https://spray.ci.cloudbees.com/job/spray-distrobuilder/lastSuccessfulBuild/artifact/devtools/org.eclipselabs.spray.dev.distrobuilder/target/dist/eclipse-SDK-4.3-macosx-cocoa-x86_64-Spray-0.5.0-SNAPSHOT.tar.gz'>Mac OSX (64bit)</a>
</td>
<td width='200px'>
<a href='https://spray.ci.cloudbees.com/job/spray-distrobuilder/lastSuccessfulBuild/artifact/devtools/org.eclipselabs.spray.dev.distrobuilder/target/dist/eclipse-SDK-4.3RC3-linux-gtk-x86_64-Spray-0.5.0-SNAPSHOT.tar.gz'>Linux GTK (64bit)</a>
</td>
</tr>
</table>

<hr />

Note that another open project is also called Spray. Follow the link to get to the <i><a href='https://github.com/spray/spray/wiki'>Spray lightweigt Scala framework for RESTful web services</a></i>.<br>
<br>
</td>
<blockquote><td valign='top'>
<wiki:gadget url="http://www.ohloh.net/p/586769/widgets/project_partner_badge.xml" height="53" border="0"/><br>
</td>
</tr>
</table></blockquote>
