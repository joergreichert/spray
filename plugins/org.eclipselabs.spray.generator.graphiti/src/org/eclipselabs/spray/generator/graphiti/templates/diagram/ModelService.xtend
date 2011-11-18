package org.eclipselabs.spray.generator.graphiti.templates.diagram

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.Diagram

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*

class ModelService extends FileGenerator {
    @Inject extension NamingExtensions
    
    override StringConcatenation generateBaseFile(EObject modelElement) {
        mainFile( modelElement as Diagram, javaGenFile.className)
    }

    def mainFile(Diagram diagram, String className) '''
        «header(this)»
        «val modelClassName = diagram.modelType.javaInterfaceName.shortName»
        package «diagram_package()»;
        
        import java.io.IOException;
        
        import org.eclipse.core.resources.IResource;
        import org.eclipse.core.resources.IWorkspaceRoot;
        import org.eclipse.core.resources.ResourcesPlugin;
        import org.eclipse.core.runtime.CoreException;
        import org.eclipse.emf.common.util.URI;
        import org.eclipse.emf.ecore.resource.Resource;
        import org.eclipse.emf.ecore.resource.ResourceSet;
        import org.eclipse.emf.ecore.util.EcoreUtil;
        import org.eclipse.graphiti.dt.IDiagramTypeProvider;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.graphiti.services.Graphiti;
        import org.eclipse.graphiti.services.IPeService;
        import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
        // MARKER_IMPORT
        
        /**
         * This class gives access to the domain model root element for a diagram.
         * On first access, a new resource will be created to which the model
         * is added.
         */
        public class «className» {
            public static final String FILE_EXTENSION = "«diagram.modelFileExtension»";
            protected IPeService peService;
            protected IDiagramTypeProvider dtp;
            «generate_additionalFields(diagram)»
            
            public «className» (IDiagramTypeProvider dtp) {
                this.dtp = dtp;
                this.peService = Graphiti.getPeService();
            }
            
            public «modelClassName» getModel () {
                final Diagram diagram = dtp.getDiagram();
                «modelClassName» model = («modelClassName») dtp.getFeatureProvider().getBusinessObjectForPictogramElement(diagram);
                if (model == null) {
                    model = createModel();
                }
                return model;
            }
            
            /**
             * Creates the domain model element and store it in the file. Overwrite to set required properties on creation.
             */
            protected «modelClassName» createModel () {
                final Diagram diagram = dtp.getDiagram();
                try {
                    «modelClassName» model = «diagram.modelType.EFactoryInterfaceName.shortName».eINSTANCE.create«modelClassName»();
                    createModelResourceAndAddModel (model);
                    peService.setPropertyValue(diagram, ISprayConstants.PROPERTY_URI, EcoreUtil.getURI(model).toString());
                    // link the diagram with the model element
                    dtp.getFeatureProvider().link(diagram, model);
                    return model;
                } catch (CoreException e) {
                    e.printStackTrace();
                    return null;
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        
            protected void createModelResourceAndAddModel (final «modelClassName» model) throws CoreException, IOException {
                final Diagram diagram = dtp.getDiagram();
                URI uri = diagram.eResource().getURI();
                uri = uri.trimFragment();
                uri = uri.trimFileExtension();
                uri = uri.appendFileExtension(FILE_EXTENSION);
                ResourceSet rSet = diagram.eResource().getResourceSet();
                final IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
                IResource file = workspaceRoot.findMember(uri.toPlatformString(true));
                if (file == null || !file.exists()) {
                    Resource resource = rSet.createResource(uri);
                    resource.setTrackingModification(true);
                    resource.getContents().add(model);
                } else {
                    final Resource resource = rSet.getResource(uri, true);
                    resource.getContents().add(model);
                }
            }
            «generate_additionalFields(diagram)»
        }
    '''
}