package org.eclipselabs.spray.xtext.ui.wizard.codegen

import org.eclipselabs.spray.xtext.ui.wizard.SprayProjectInfo
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject

class NewProjectGenerator {
    @Inject SprayModelGenerator generateModel
    
    def doGenerate (SprayProjectInfo projectInfo, IFileSystemAccess fsa) {
        generateModel.doGenerate(projectInfo, fsa)
        generateBuildProperties(projectInfo, fsa)
//        generateAntUpdatePluginXmlLaunch(projectInfo, fsa)
//        generateAntUpdatePluginXml(projectInfo, fsa)
    }
    
    def generateBuildProperties (SprayProjectInfo pi, IFileSystemAccess fsa) {
       val content = '''
        source.. = «pi.javaMainSrcDir»/,\
                   «pi.javaGenSrcDir»/,\
                   «pi.sprayModelDir»/
        bin.includes = META-INF/,\
                       plugin.xml,\
                       icons/,\
                       «pi.sprayModelDir»/
       '''
       fsa.generateFile("build.properties", pi.projectName, content);
    }
    
    def generateAntUpdatePluginXml(SprayProjectInfo pi, IFileSystemAccess fsa) {
		val content = '''
			<!-- see http://5ise.quanxinquanyi.de/2013/01/11/avoiding-manual-merge-when-generating-plugin-xml-with-xtextxtend/ --> 
			<project>
			   <target name="update">
			
			       <replaceregexp file  = "plugin.xml"
			             match = "\s*&lt;/plugin>\s*"
			             replace = ""
			       		flags = "sg"/>
			
			             <replaceregexp file="plugin.xml"
			               match="\&lt;!-- AUTOGEN START -->.*\&lt;!-- AUTOGEN END -->"
			               replace=""
			               flags="sg"
							/>
			
					<concat destfile="plugin.xml" append="yes">&lt;!-- AUTOGEN START --></concat>
			
			        <concat destfile="plugin.xml" append="yes">
			        	  <fileset dir="src-gen" includes="plugin.xml"/>
			
			        </concat>
			
			        <concat destfile="plugin.xml" append="yes"> &lt;!-- AUTOGEN END -->
			&lt;/plugin>
			</concat>
			    </target>
			
			</project>
		'''
       fsa.generateFile("ant-update-plugin-xml.xml", pi.projectName, content);
    }
    
    def generateAntUpdatePluginXmlLaunch(SprayProjectInfo pi, IFileSystemAccess fsa) {
    	val content = '''
			<?xml version="1.0" encoding="UTF-8" standalone="no"?>
			<launchConfiguration type="org.eclipse.ant.AntBuilderLaunchConfigurationType">
				<booleanAttribute key="org.eclipse.ant.ui.ATTR_TARGETS_UPDATED" value="true"/>
				<booleanAttribute key="org.eclipse.ant.ui.DEFAULT_VM_INSTALL" value="false"/>
				<booleanAttribute key="org.eclipse.debug.ui.ATTR_LAUNCH_IN_BACKGROUND" value="false"/>
				<stringAttribute key="org.eclipse.jdt.launching.CLASSPATH_PROVIDER" value="org.eclipse.ant.ui.AntClasspathProvider"/>
				<booleanAttribute key="org.eclipse.jdt.launching.DEFAULT_CLASSPATH" value="true"/>
				<stringAttribute key="org.eclipse.jdt.launching.PROJECT_ATTR" value="«pi.projectName»"/>
				<stringAttribute key="org.eclipse.ui.externaltools.ATTR_LOCATION" value="${project_loc}/ant-update-plugin-xml.xml"/>
				<stringAttribute key="org.eclipse.ui.externaltools.ATTR_RUN_BUILD_KINDS" value="full,incremental,"/>
				<booleanAttribute key="org.eclipse.ui.externaltools.ATTR_TRIGGERS_CONFIGURED" value="true"/>
				<stringAttribute key="org.eclipse.ui.externaltools.ATTR_WORKING_DIRECTORY" value="${project_loc}"/>
			</launchConfiguration>
    	'''
       fsa.generateFile("/.externalToolBuilders/Update plugin.xml.launch", pi.projectName, content);
    }
}