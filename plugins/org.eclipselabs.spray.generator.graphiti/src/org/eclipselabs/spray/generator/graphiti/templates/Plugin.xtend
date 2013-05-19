package org.eclipselabs.spray.generator.graphiti.templates

import com.google.inject.Inject
import org.eclipselabs.spray.generator.common.GeneratorUtil
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import static extension org.eclipselabs.spray.generator.common.XtendProperties.*
import org.eclipselabs.spray.mm.spray.Diagram

import org.eclipselabs.spray.generator.common.templates.TemplateUtil

class Plugin extends TemplateUtil {
    @Inject extension NamingExtensions

    def generateStub(String diagramName) '''
    	<?xml version="1.0" encoding="UTF-8"?>
    	<?eclipse version="3.0"?>
    	«pluginHeader(this)»
    	<plugin>
    	  
    	  <!-- GRAPHITI EDITOR EXTENSION AUTOGEN START -->
    	  <!-- GRAPHITI EDITOR EXTENSION AUTOGEN END -->
    	  
    	  <extension
    	       point="org.eclipse.graphiti.ui.diagramTypes">
    	    <!-- DIAGRAM TYPE AUTOGEN START -->
    	    <!-- DIAGRAM TYPE AUTOGEN END -->
    	  </extension>
    	  
    	  <extension
    	       point="org.eclipse.graphiti.ui.diagramTypeProviders">
    	    <!-- DIAGRAM TYPE PROVIDER AUTOGEN START -->
    	    <!-- DIAGRAM TYPE PROVIDER AUTOGEN END -->
    	  </extension>
    	  
    	  <extension
    	       point="org.eclipse.graphiti.ui.imageProviders">
    	    <!-- IMAGE PROVIDER AUTOGEN START -->
    	    <!-- IMAGE PROVIDER AUTOGEN END -->
    	  </extension>
    	  
    	  <extension
    	       point="org.eclipse.ui.views.properties.tabbed.propertyContributor">
    	  </extension>
    	  
    	  <extension
    	       point="org.eclipse.ui.views.properties.tabbed.propertyContributor">
    	    <propertyContributor contributorId="«diagramName».PropertyContributor">
    	       <propertyCategory category="«diagramName»Category">
    	       </propertyCategory>
    	    </propertyContributor>
    	  </extension>
    	  
    	  <extension
    	       point="org.eclipse.ui.views.properties.tabbed.propertyTabs">
    	    <propertyTabs contributorId="«diagramName».PropertyContributor">
    	      <!-- PROPERTY TAB AUTOGEN START -->
    	      <!-- PROPERTY TAB AUTOGEN END -->
    	    </propertyTabs>
    	  </extension>
    	  
    	  <!-- PROPERTY SECTIONS AUTOGEN START -->
    	  <!-- PROPERTY SECTIONS AUTOGEN END -->
    	  
    	  <!-- NEW DIAGRAM WIZARD AUTOGEN START -->
    	  <!-- NEW DIAGRAM WIZARD AUTOGEN END -->
    	  
    	</plugin>
	'''

    def generate(Diagram diagram) '''
    	«val diagramName = diagram.name»
    	<?xml version="1.0" encoding="UTF-8"?>
    	<?eclipse version="3.0"?>
    	«pluginHeader(this)»
    	<plugin>
    	  
    	  <!-- GRAPHITI EDITOR EXTENSION AUTOGEN START -->
    	  «diagram.generate_graphitiEditorExtension»
    	  <!-- GRAPHITI EDITOR EXTENSION AUTOGEN END -->
    	  
    	  <extension
    	       point="org.eclipse.graphiti.ui.diagramTypes">
    	    <!-- DIAGRAM TYPE AUTOGEN START -->
    	    «generate_diagramType(diagramName)»
    	    <!-- DIAGRAM TYPE AUTOGEN END -->
    	  </extension>
    	  
    	  <extension
    	       point="org.eclipse.graphiti.ui.diagramTypeProviders">
    	    <!-- DIAGRAM TYPE PROVIDER AUTOGEN START -->
    	    «diagram.generate_diagramTypeProvider(diagramName)»
    	    <!-- DIAGRAM TYPE PROVIDER AUTOGEN END -->
    	  </extension>
    	  
    	  <extension
    	       point="org.eclipse.graphiti.ui.imageProviders">
    	    <!-- IMAGE PROVIDER AUTOGEN START -->
    	    «diagram.generate_imageProvider»
    	    <!-- IMAGE PROVIDER AUTOGEN END -->
    	  </extension>
    	  
    	  <extension
    	       point="org.eclipse.ui.views.properties.tabbed.propertyContributor">
    	  </extension>
    	  
    	  <extension
    	       point="org.eclipse.ui.views.properties.tabbed.propertyContributor">
    	    <propertyContributor contributorId="«diagramName».PropertyContributor">
    	       <propertyCategory category="«diagramName»Category">
    	       </propertyCategory>
    	    </propertyContributor>
    	  </extension>
    	  
    	  <extension
    	       point="org.eclipse.ui.views.properties.tabbed.propertyTabs">
    	    <propertyTabs contributorId="«diagramName».PropertyContributor">
    	      <!-- PROPERTY TAB AUTOGEN START -->
    	      «generate_propertyTab(diagramName)»
    	      <!-- PROPERTY TAB AUTOGEN END -->
    	    </propertyTabs>
    	  </extension>
    	  
    	  <!-- PROPERTY SECTIONS AUTOGEN START -->
    	  «diagram.generate_propertySections(diagramName)»
    	  <!-- PROPERTY SECTIONS AUTOGEN END -->
    	  
    	  <!-- NEW DIAGRAM WIZARD AUTOGEN START -->
    	  «generate_newDiagramWizard(diagram)»
    	  <!-- NEW DIAGRAM WIZARD AUTOGEN END -->
    	  
    	</plugin>
    '''
    
    def generate_graphitiEditorExtension(Diagram diagram) '''
       <!-- Potentially redefine the EDITOR EXTENSION TO ALLOW FOR OUR OWN EDITOR SUBCLASS TO BE USED. 
       <extension
             point="org.eclipse.ui.editors">
          <editor
              class="«diagram.extensionFactoryClassName»:«diagram.diagramEditorClassName»"
              contributorClass="org.eclipse.graphiti.ui.editor.DiagramEditorActionBarContributor"
              default="true"
              extensions="diagram"
              icon="icons/diagram.gif"
              id="«diagram.diagramEditorClassName»"
              matchingStrategy="org.eclipse.graphiti.ui.editor.DiagramEditorFactory$DiagramEditorMatchingStrategy"
              name="%_diagram_editor_name">
           <contentTypeBinding
                 contentTypeId="org.eclipse.graphiti.content.diagram">
           </contentTypeBinding>
          </editor>
       </extension>
       -->
    '''
    
    def generate_diagramType(String diagramName) '''
        <diagramType
          description="This is the diagram type for the «diagramName» diagram type"
          id="«GeneratorUtil::diagram_package()».«diagramName.toFirstUpper»DiagramType"
          name="«diagramName» Graphiti Diagram Type"
          type="«diagramName»">
        </diagramType>
    '''
    
    def generate_diagramTypeProvider(Diagram diagram, String diagramName) '''
        <diagramTypeProvider
          class="«diagram.extensionFactoryClassName»:«diagram.diagramTypeProviderClassName»"
          description="This is my editor for the «diagramName» diagram type"
          id="«diagram.diagramTypeProviderClassName»"
          name="«diagramName» editor">
          <diagramType
                id="«GeneratorUtil::diagram_package()».«diagramName.toFirstUpper»DiagramType">
          </diagramType>
            <imageProvider
                   id="«diagram.imageProviderClassName»">
             </imageProvider>
        </diagramTypeProvider>
    '''
    
    def generate_imageProvider(Diagram diagram) '''
      <imageProvider
            class="«diagram.extensionFactoryClassName»:«diagram.imageProviderClassName»"
               id="«diagram.imageProviderClassName»">
      </imageProvider>
    '''
    
    def generate_propertyTab(String diagramName) '''
      <propertyTab label="Main" category="«diagramName»Category"
          id="«diagramName».main.tab">
      </propertyTab>
    '''
    
    def generate_propertySections(Diagram diagram, String diagramName) '''
        «FOR cls : diagram.metaClasses »
          «setValue("PreviousSection", null)»
          <extension
              point="org.eclipse.ui.views.properties.tabbed.propertySections">
              <propertySections contributorId="«diagramName».PropertyContributor">
            «FOR property : cls.type.EAllAttributes»
                  <propertySection tab="«diagramName».main.tab"
                   class="«diagram.extensionFactoryClassName»:«cls.type.getPropertySectionClassName(property)»"
                   filter="«cls.filterClassName»"
                   «IF getValue("PreviousSection") != null»
                   afterSection="«getValue("PreviousSection")»"
                   «ENDIF»
                   «setValue("PreviousSection", diagramName + ".main.tab." + cls.getName + "." + property.name)»
                   id="«getValue("PreviousSection")»">
                  </propertySection>
            «ENDFOR»
              </propertySections>
          </extension>
          
        «ENDFOR»
    '''
    
    def generate_newDiagramWizard (Diagram diagram) '''
       <extension
             point="org.eclipse.ui.newWizards">
             <category
                name="«diagram.name»"
                id="org.eclipselabs.spray.«diagram.name»">
                </category>
          <wizard
                category="org.eclipselabs.spray.«diagram.name»"
                class="«diagram.extensionFactoryClassName»:org.eclipselabs.spray.runtime.graphiti.wizard.NewDiagramWizard"
                descriptionImage="icons/«diagram.name»-32.png"
                icon="icons/«diagram.name»-16.png"
                id="org.eclipselabs.spray.«diagram.name».NewDiagramWizard"
                name="New «diagram.name» Diagram"
                preferredPerspectives="org.eclipse.graphiti.examples.common.perspective.GFPerspective"
                project="false">
          </wizard>
       </extension>
    '''
}
