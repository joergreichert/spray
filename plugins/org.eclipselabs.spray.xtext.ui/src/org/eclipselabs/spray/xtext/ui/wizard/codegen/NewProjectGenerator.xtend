package org.eclipselabs.spray.xtext.ui.wizard.codegen

import javax.inject.Inject
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipselabs.spray.xtext.ui.wizard.SprayProjectInfo

class NewProjectGenerator {
    @Inject SprayModelGenerator generateModel
    
    def doGenerate (SprayProjectInfo projectInfo, IFileSystemAccess fsa) {
        generateModel.doGenerate(projectInfo, fsa)
        generateBuildProperties(projectInfo, fsa)
        generateAntUpdatePluginXmlLaunch(projectInfo, fsa)
        generateAntUpdatePluginXml(projectInfo, fsa)
    }
    
    def generateBuildProperties (SprayProjectInfo pi, IFileSystemAccess fsa) {
       val content = '''
        source.. = «pi.javaMainSrcDir»/,\
                   «pi.javaGenSrcDir»/,\
                   «pi.sprayModelDir»/
        bin.includes = META-INF/,\
        			   ant-update-plugin-xml.xml,\
                       plugin.xml,\
                       icons/,\
                       «pi.sprayModelDir»/
       '''
       fsa.generateFile("build.properties", pi.projectName, content);
    }
    
    def generateAntUpdatePluginXml(SprayProjectInfo pi, IFileSystemAccess fsa) {
		val content = '''
			<!-- see http://5ise.quanxinquanyi.de/2013/01/11/avoiding-manual-merge-when-generating-plugin-xml-with-xtextxtend/ -->
			<project default="updateAll">
				
				<target name="findFile">
					<fileset id="matches" dir="${basedir}">
					    <filename name="plugin.xml"/>
					</fileset>
					<condition property="foundFile">
						<resourcecount when="greater" count="0" refid="matches" />
					</condition>
				</target>	
			
				<target name="ensureFileExists" depends="findFile" unless="foundFile">
					<copy file="src-gen/plugin.xml" todir="${basedir}" />
					<antcall target="findFile" />
				</target>	

				<target name="updateAll" depends="ensureFileExists" if="foundFile">
			
					«generateAntCall("plugin_diagramtype.xml", "DIAGRAM TYPE")»
			
					«generateAntCall("plugin_diagramtypeprovider.xml", "DIAGRAM TYPE PROVIDER")»
			
					«generateAntCall("plugin_graphitieditor.xml", "GRAPHITI EDITOR EXTENSION")»
			
					«generateAntCall("plugin_imageprovider.xml", "IMAGE PROVIDER")»
			
					«generateAntCall("plugin_newdiagramwizard.xml", "NEW DIAGRAM WIZARD")»
			
					«generateAntCall("plugin_propertysections.xml", "PROPERTY SECTIONS")»
			
					«generateAntCall("plugin_propertytabs.xml", "PROPERTY TAB")»
					
				</target>
			
				<target name="findInFile">
					<fileset id="matches" dir="${basedir}">
					    <filename name="plugin.xml"/>
						<containsregexp 
							expression="${commentSegment}"/>
					</fileset>
					<condition property="foundInFile">
						<resourcecount when="greater" count="0" refid="matches" />
					</condition>
				</target>
				
				<target name="readSegmentFileContent" depends="findInFile" if="foundInFile">
					<loadfile property="segmentFileContent" srcfile="${basedir}/src-gen/${segmentFileName}" />
				</target>	
			
				<target name="updateWithContent" depends="readSegmentFileContent" if="segmentFileContent">
			
					<replaceregexp 
						file="plugin.xml" 
						match="${commentMatchString}" 
						replace="&lt;!-- ${commentSegment} AUTOGEN START -->${line.separator}
							${segmentFileContent}
							&lt;!-- ${commentSegment} AUTOGEN END -->" 
						flags="gis" 
						byline="false" 
					/>
					<echo message="Regenerating content of ${commentMatchString} in plugin.xml with content from ${segmentFileName}" />
				</target>
			
				<target name="updateWithEmptyContent" depends="readSegmentFileContent" unless="segmentFileContent">
					<replaceregexp 
						file="plugin.xml" 
						match="${commentMatchString}" 
						replace="&lt;!-- ${commentSegment} AUTOGEN START -->${line.separator}
						&lt;!-- ${commentSegment} AUTOGEN END -->" 
						flags="gis" 
						byline="false" 
					/>
				</target>
			
				<target name="update" depends="updateWithEmptyContent, updateWithContent" />
			
			</project>
		'''
       fsa.generateFile("ant-update-plugin-xml.xml", pi.projectName, content);
    }
    
    def private generateAntCall(String segmentFileName, String commentSegment) '''
		<antcall target="update">
			<param name="segmentFileName" value="«segmentFileName»" />
			<param name="commentSegment" value="«commentSegment»" />
			<param name="commentMatchString" value="&lt;!-- «commentSegment» AUTOGEN START --&gt;(.+?)\&lt;!-- «commentSegment» AUTOGEN END --&gt;" />
		</antcall>
    '''
    
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
				<stringAttribute key="org.eclipse.ui.externaltools.ATTR_LOCATION" value="${workspace_loc:/«pi.projectName»/ant-update-plugin-xml.xml}"/>
				<stringAttribute key="org.eclipse.ui.externaltools.ATTR_RUN_BUILD_KINDS" value="full,incremental,"/>
				<booleanAttribute key="org.eclipse.ui.externaltools.ATTR_TRIGGERS_CONFIGURED" value="true"/>
				<stringAttribute key="org.eclipse.ui.externaltools.ATTR_WORKING_DIRECTORY" value="${workspace_loc:/«pi.projectName»}"/>
			</launchConfiguration>
    	'''
       fsa.generateFile("/.externalToolBuilders/Update plugin.xml.launch", pi.projectName, content);
    }
}