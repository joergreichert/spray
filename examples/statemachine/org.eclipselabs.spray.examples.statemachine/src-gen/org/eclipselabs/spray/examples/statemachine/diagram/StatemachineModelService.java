/*************************************************************************************
 *
 * Generated on Sun Mar 25 15:23:33 CEST 2012 by Spray ModelService.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.statemachine.diagram;

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
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachineFactory;


/**
 * This class gives access to the domain model root element for a diagram.
 * On first access, a new resource will be created to which the model
 * is added.
 */
public class StatemachineModelService {
    public static final String FILE_EXTENSION = "statemachine";
    protected IPeService peService;
    protected IDiagramTypeProvider dtp;
    
    public StatemachineModelService (IDiagramTypeProvider dtp) {
        this.dtp = dtp;
        this.peService = Graphiti.getPeService();
    }
    
    public Statemachine getModel () {
        final Diagram diagram = dtp.getDiagram();
        Statemachine model = (Statemachine) dtp.getFeatureProvider().getBusinessObjectForPictogramElement(diagram);
        if (model == null) {
            model = createModel();
        }
        return model;
    }
    
    /**
     * Creates the domain model element and store it in the file. Overwrite to set required properties on creation.
     */
    protected Statemachine createModel () {
        final Diagram diagram = dtp.getDiagram();
        try {
            Statemachine model = StatemachineFactory.eINSTANCE.createStatemachine();
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

    protected void createModelResourceAndAddModel (final Statemachine model) throws CoreException, IOException {
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
}
