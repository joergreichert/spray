/*
 * <copyright>
 * Copyright (c) 2012 The Spray Project.
 * http://code.google.com/a/eclipselabs.org/p/spray
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipselabs.spray.xtext.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipselabs.spray.mm.spray.ConnectionInSpray;
import org.eclipselabs.spray.mm.spray.ConnectionReference;
import org.eclipselabs.spray.mm.spray.ShapeFromDsl;
import org.eclipselabs.spray.mm.spray.ShapeInSpray;
import org.eclipselabs.spray.mm.spray.ShapeReference;
import org.eclipselabs.spray.shapes.CompartmentInfo;
import org.eclipselabs.spray.shapes.CompartmentShape;
import org.eclipselabs.spray.shapes.ShapeContainerElement;
import org.eclipselabs.spray.shapes.ShapesPackage;
import org.eclipselabs.spray.shapes.TextBody;
import org.eclipselabs.spray.xtext.scoping.AppInjectedAccess;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import javax.inject.Inject;

/**
 * @author Reichert
 *         Created on 27.12.2012
 */
public class TextBodyFetcher {

    @Inject
    private IQualifiedNameConverter qnConverter;

    private IResourceDescriptions   dscriptions                    = null;
    private Predicate<EObject>      containerIsCompartmentFilter   = null;
    private Predicate<EObject>      textBodyFilter                 = null;
    private Predicate<EObject>      propertyAssignmentIdsFilter    = null;
    private Predicate<EObject>      compartmentAssignmentIdsFilter = null;

    public Predicate<EObject> getPropertyAssignmentIdFilter(final String id) {
        return new Predicate<EObject>() {
            public boolean apply(EObject eo) {
                return getPropertyAssignmentIdsFilter().apply(eo) && getTextBodyIdFilter(id).apply(eo);
            }
        };
    }

    public Predicate<EObject> getCompartmentAssignmentIdFilter(final String id) {
        return new Predicate<EObject>() {
            public boolean apply(EObject eo) {
                return getCompartmentAssignmentIdsFilter().apply(eo) && getTextBodyIdFilter(id).apply(eo);
            }
        };
    }

    public Predicate<EObject> getPropertyAssignmentIdsFilter() {
        if (propertyAssignmentIdsFilter == null) {
            propertyAssignmentIdsFilter = new Predicate<EObject>() {
                public boolean apply(EObject eo) {
                    return getTextBodyFilter().apply(eo) && !getContainerIsCompartmentFilter().apply(eo);
                }
            };
        }
        return propertyAssignmentIdsFilter;
    }

    public Predicate<EObject> getCompartmentAssignmentIdsFilter() {
        if (compartmentAssignmentIdsFilter == null) {
            compartmentAssignmentIdsFilter = new Predicate<EObject>() {
                public boolean apply(EObject eo) {
                    return getTextBodyFilter().apply(eo) && getContainerIsCompartmentFilter().apply(eo);
                }
            };
        }
        return compartmentAssignmentIdsFilter;
    }

    public Predicate<EObject> getTextBodyFilter() {
        if (textBodyFilter == null) {
            textBodyFilter = new Predicate<EObject>() {
                public boolean apply(EObject eo) {
                    return eo instanceof TextBody;
                }
            };
        }
        return textBodyFilter;
    }

    public Predicate<EObject> getTextBodyIdFilter(final String id) {
        return new Predicate<EObject>() {
            public boolean apply(EObject eo) {
                return getTextBodyFilter().apply(eo) && (id != null && id.equals(((TextBody) eo).getValue()));
            }
        };
    }

    public Predicate<EObject> getContainerIsCompartmentFilter() {
        if (containerIsCompartmentFilter == null) {
            containerIsCompartmentFilter = new Predicate<EObject>() {
                public boolean apply(EObject eo) {
                    return eo.eContainer() instanceof CompartmentShape || eo.eContainer() instanceof CompartmentInfo;
                }
            };
        }
        return containerIsCompartmentFilter;
    }

    public Function<ShapeContainerElement, ShapeContainerElement> getShapeContainerElementResolver() {
        return new Function<ShapeContainerElement, ShapeContainerElement>() {

            public ShapeContainerElement apply(ShapeContainerElement dslShape) {
                if (dslShape.eIsProxy() && dslShape.getName() != null) {
                    if (dscriptions == null) {
                        ResourceDescriptionsProvider serviceProvider = AppInjectedAccess.getit();
                        dscriptions = serviceProvider.createResourceDescriptions();
                    }
                    Iterator<IEObjectDescription> eObjects = dscriptions.getExportedObjects(ShapesPackage.Literals.SHAPE_DEFINITION, qnConverter.toQualifiedName(dslShape.getName()), false).iterator();
                    if (eObjects.hasNext()) {
                        dslShape = (ShapeContainerElement) eObjects.next().getEObjectOrProxy();
                    }
                }
                return dslShape;
            }
        };
    }

    public Set<String> getTextBodyIds(EObject model, Function<ShapeContainerElement, ShapeContainerElement> shapeContainerElementResolver, Predicate<EObject> filterPredicate) {
        Function<EObject, String> textBodyIdExtractor = new Function<EObject, String>() {
            public String apply(EObject eo) {
                return ((TextBody) eo).getValue();
            }
        };
        return getTextBodyIds(model, shapeContainerElementResolver, filterPredicate, textBodyIdExtractor);
    }

    public Set<TextBody> getTextBodysForId(EObject model, Function<ShapeContainerElement, ShapeContainerElement> shapeContainerElementResolver, Predicate<EObject> filterPredicate) {
        Function<EObject, TextBody> textBodyIdExtractor = new Function<EObject, TextBody>() {
            public TextBody apply(EObject eo) {
                return (TextBody) eo;
            }
        };
        return getTextBodyIds(model, shapeContainerElementResolver, filterPredicate, textBodyIdExtractor);
    }

    private <T> Set<T> getTextBodyIds(EObject model, Function<ShapeContainerElement, ShapeContainerElement> shapeContainerElementResolver, Predicate<EObject> filterPredicate, Function<EObject, T> resultExtractor) {
        Set<T> results = new HashSet<T>();
        ShapeInSpray shapeRef = EcoreUtil2.getContainerOfType(model, ShapeInSpray.class);
        if (shapeRef != null) {
            ShapeContainerElement shapeContainerElement = null;
            if (shapeRef instanceof ShapeFromDsl) {
                ShapeReference shapeReference = ((ShapeFromDsl) shapeRef).getShape();
                if (shapeReference != null) {
                    shapeContainerElement = shapeReference.getDslShape();
                }
            } else if (shapeRef instanceof ConnectionInSpray) {
                ConnectionReference connectionReference = ((ConnectionInSpray) shapeRef).getConnection();
                if (connectionReference != null) {
                    shapeContainerElement = connectionReference.getDslConnection();
                }
            }
            if (shapeContainerElement != null) {
                shapeContainerElement = shapeContainerElementResolver.apply(shapeContainerElement);

                results = Sets.newHashSet(Iterables.transform(Iterables.filter(IteratorExtensions.toIterable(shapeContainerElement.eAllContents()), filterPredicate), resultExtractor));
            }
        }
        return results;
    }
}
