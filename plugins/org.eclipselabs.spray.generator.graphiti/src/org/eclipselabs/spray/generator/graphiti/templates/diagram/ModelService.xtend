package org.eclipselabs.spray.generator.graphiti.templates.diagram

import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.Diagram

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*

class ModelService extends FileGenerator<Diagram> {
    @Inject extension NamingExtensions
    
    override CharSequence generateBaseFile(Diagram modelElement) {
        mainFile( modelElement, javaGenFile.className)
    }

    def mainFile(Diagram diagram, String className) '''
        «header(this)»
        «val modelClassName = diagram.modelType.itfName»
        package «diagram_package()»;
        
        import java.io.IOException;
        
        import org.eclipse.core.resources.IResource;
        import org.eclipse.core.resources.IWorkspaceRoot;
        import org.eclipse.core.resources.ResourcesPlugin;
        import org.eclipse.core.runtime.CoreException;
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.emf.ecore.InternalEObject;
        import org.eclipse.emf.common.util.URI;
        import org.eclipse.emf.ecore.resource.Resource;
        import org.eclipse.emf.ecore.resource.ResourceSet;
        import org.eclipse.emf.ecore.util.EcoreUtil;
        import org.eclipse.graphiti.dt.IDiagramTypeProvider;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.services.Graphiti;
        import org.eclipse.graphiti.services.IPeService;
        import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
        // MARKER_IMPORT
        
        /**
         * This class gives access to the domain model root element for a diagram.
         * On first access, a new resource will be created to which the model
         * is added.
         */
        public class «className» implements ISprayConstants {
            public static final String FILE_EXTENSION = "«diagram.modelFileExtension»";
            protected IPeService peService;
            protected IDiagramTypeProvider dtp;
            «generate_additionalFields(diagram)»
            
            static protected «className» modelService = null;
            
            /**
             * return the model service, create one if it does not exist yet.
             */
            static public «className» getModelService(IDiagramTypeProvider dtp){
           	    modelService = new «className»(dtp);
                return modelService;
            }
            
            /**
             * return the model service.
             * returns null if there is no model service.
             */
            static public «className» getModelService(){
                return modelService;
            }
            
            protected «className» (IDiagramTypeProvider dtp) {
                this.dtp = dtp;
                this.peService = Graphiti.getPeService();
            }
            
            public «modelClassName» getModel () {
                final Diagram diagram = dtp.getDiagram();
                Resource r = diagram.eResource();
                ResourceSet set = r.getResourceSet();
                EObject bo = (EObject) dtp.getFeatureProvider().getBusinessObjectForPictogramElement(diagram);
                «modelClassName» model = null;
                // If its a proxy, resolve it
               if( bo != null && bo.eIsProxy() ){
                    if( bo instanceof InternalEObject) {
                        model = («modelClassName»)set.getEObject(((InternalEObject) bo).eProxyURI(), true);
                    }
                }
                if (model == null) {
                    model = createModel();
                }
                return model;
            }
            
            public Object getBusinessObject(PictogramElement pe){
        		return dtp.getFeatureProvider().getBusinessObjectForPictogramElement(dtp.getDiagram());
        	}
            
            /**
             * Creates the domain model element and store it in the file. Overwrite to set required properties on creation.
             */
            protected «modelClassName» createModel () {
                final Diagram diagram = dtp.getDiagram();
                try {
                    «modelClassName» model = «diagram.modelType.EFactoryInterfaceName.shortName».eINSTANCE.create«diagram.modelType.name»();
                    createModelResourceAndAddModel (model);
                    peService.setPropertyValue(diagram, PROPERTY_URI, EcoreUtil.getURI(model).toString());
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