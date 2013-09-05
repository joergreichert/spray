/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.runtime.graphiti.tb;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;
import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;
import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * Spray specific base class
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public abstract class AbstractSprayToolBehaviorProvider extends org.eclipse.graphiti.tb.DefaultToolBehaviorProvider implements ISprayConstants {
    protected final Map<String, IPaletteCompartmentEntry> paletteCompartments              = Maps.newHashMap();
    /** Key for the default palette compartment */
    protected static final String                         COMPARTMENT_DEFAULT              = "Other";
    private static final IRenderingDecoratorProvider[]    NO_RENDERING_DECORATOR_PROVIDERS = new IRenderingDecoratorProvider[0];

    public AbstractSprayToolBehaviorProvider(IDiagramTypeProvider diagramTypeProvider) {
        super(diagramTypeProvider);
    }

    @Override
    public IPaletteCompartmentEntry[] getPalette() {
        Iterable<IPaletteCompartmentEntry> palette = buildPaletteCompartments();
        buildCreationTools();
        // remove empty tools
        Predicate<IPaletteCompartmentEntry> filter = new Predicate<IPaletteCompartmentEntry>() {
            @Override
            public boolean apply(IPaletteCompartmentEntry input) {
                return !input.getToolEntries().isEmpty();
            }
        };
        return Iterables.toArray(Iterables.filter(palette, filter), IPaletteCompartmentEntry.class);
    }

    @Override
    public PictogramElement getSelection(PictogramElement originalPe, PictogramElement[] oldSelection) {
        if (SprayLayoutService.isCompartment(originalPe)) {
            ContainerShape shape = (ContainerShape) originalPe;
            ContainerShape parent = shape.getContainer();
            while (parent != null && (!SprayLayoutService.isShapeFromDsl(parent))) {
                parent = parent.getContainer();
            }
            return parent;
        }
        return super.getSelection(originalPe, oldSelection);
    }

    /**
     * Retrieves a palette compartment by name. The method will create a new compartment on first
     * call for a given name.
     * 
     * @param name
     * @return
     */
    protected final IPaletteCompartmentEntry getPaletteCompartment(String name) {
        IPaletteCompartmentEntry compartment = paletteCompartments.get(name);
        if (compartment == null) {
            compartment = new PaletteCompartmentEntry(name, null);
            configurePaletteCompartment(compartment);
            paletteCompartments.put(name, compartment);
        }
        return compartment;
    }

    /**
     * Build the palette entries. Clients might want to override this method to create
     * additional entries. The order of the built palette compartments defines
     * the order in the palette.
     * 
     * @return
     */
    protected Iterable<IPaletteCompartmentEntry> buildPaletteCompartments() {
        return Lists.newArrayList(getPaletteCompartment(COMPARTMENT_DEFAULT));
    }

    /**
     * Build the creation tools in the palette. The method should be implemented
     * by calls of the method buildCreationTool().
     * 
     * <pre>
     * buildCreationTool(new MyCreateFeature(this.getFeatureProvider()));
     * </pre>
     */
    protected abstract void buildCreationTools();

    /**
     * Clients may do additional configurations when a PaletteCompartment is
     * created
     * 
     * @param compartment
     */
    protected void configurePaletteCompartment(IPaletteCompartmentEntry compartment) {
    }

    protected IPaletteCompartmentEntry getPaletteCompartmentForFeature(IFeature feature) {
        return getPaletteCompartment(COMPARTMENT_DEFAULT);
    }

    protected void buildCreationTool(ICreateFeature createFeature) {
        ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);
        PaletteCompartmentEntry compartment = (PaletteCompartmentEntry) getPaletteCompartmentForFeature(createFeature);
        compartment.addToolEntry(objectCreationToolEntry);
    }

    protected void buildCreationTool(ICreateConnectionFeature createFeature) {
        ConnectionCreationToolEntry objectCreationToolEntry = new ConnectionCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId());
        objectCreationToolEntry.addCreateConnectionFeature((ICreateConnectionFeature) createFeature);
        PaletteCompartmentEntry compartment = (PaletteCompartmentEntry) getPaletteCompartmentForFeature(createFeature);
        compartment.addToolEntry(objectCreationToolEntry);
    }

    /**
     * If the associated business object is contained in an XtextResource, use the {@link IEObjectDocumentationProvider} to
     * retrieve the tooltip text.
     */
    @Override
    public String getToolTip(GraphicsAlgorithm ga) {
        EObject bo = (EObject) getFeatureProvider().getBusinessObjectForPictogramElement(ga.getPictogramElement());
        if (bo != null && bo.eResource() != null && bo.eResource() instanceof XtextResource) {
            XtextResource res = (XtextResource) bo.eResource();
            IEObjectDocumentationProvider documentationProvider = res.getResourceServiceProvider().get(IEObjectDocumentationProvider.class);
            return documentationProvider.getDocumentation(bo);
        }
        return super.getTitleToolTip();
    }

    /**
     * {@inheritDoc} This implementation will delegate to instances of IRenderingDecoratorProvider to get decorators for a pictogram element.
     * 
     * @see {@link #getRenderingDecoratorProviders()}
     */
    @Override
    public IDecorator[] getDecorators(PictogramElement pe) {
        final IRenderingDecoratorProvider[] renderingDecoratorProviders = getRenderingDecoratorProviders();
        for (IRenderingDecoratorProvider renderingDecoratorProvider : renderingDecoratorProviders) {
            IDecorator[] decorators = renderingDecoratorProvider.getDecorators(pe);
            if (decorators != null) {
                return decorators;
            }
        }
        return super.getDecorators(pe);
    }

    /**
     * Clients may override this method to provide a custom set of rendering decorator providers.
     * 
     * @return
     */
    protected IRenderingDecoratorProvider[] getRenderingDecoratorProviders() {
        return NO_RENDERING_DECORATOR_PROVIDERS;
    }

}
