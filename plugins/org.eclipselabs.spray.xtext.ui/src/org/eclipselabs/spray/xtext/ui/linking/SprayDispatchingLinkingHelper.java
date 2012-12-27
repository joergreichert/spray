package org.eclipselabs.spray.xtext.ui.linking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.xtext.ui.TypeAwareHyperlinkHelper;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment;
import org.eclipselabs.spray.mm.spray.ShapeDslKey;
import org.eclipselabs.spray.mm.spray.ShapePropertyAssignment;
import org.eclipselabs.spray.mm.spray.SprayPackage;
import org.eclipselabs.spray.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.TextBody;
import org.eclipselabs.spray.shapes.ui.linking.connection.ConnectionLinkingHelper;
import org.eclipselabs.spray.shapes.ui.linking.shape.ShapeLinkingHelper;
import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.styles.ui.linking.style.StyleLinkingHelper;
import org.eclipselabs.spray.xtext.ui.linking.domain.DomainLinkingHelper;
import org.eclipselabs.spray.xtext.util.TextBodyFetcher;

import com.google.inject.Inject;

public class SprayDispatchingLinkingHelper extends TypeAwareHyperlinkHelper {
    @Inject
    private EObjectAtOffsetHelper   eObjectAtOffsetHelper;

    @Inject
    private TextBodyFetcher         textBodyFetcher;

    @Inject
    private IContainer.Manager      containerManager;

    @Inject
    private IJvmModelAssociations   modelAssocs;

    @Inject
    private ConnectionLinkingHelper connectionLinkingHelper;

    @Inject
    private ShapeLinkingHelper      shapeLinkingHelper;

    @Inject
    private StyleLinkingHelper      styleLinkingHelper;

    @Inject
    private DomainLinkingHelper     domainLinkingHelper;

    public void createHyperlinksByOffset(final XtextResource xtextResource, int offset, final IHyperlinkAcceptor acceptor) {
        final INode crossRefNode = eObjectAtOffsetHelper.getCrossReferenceNode(xtextResource, new TextRegion(offset, 0));
        if (crossRefNode != null) {
            EObject crossLinkedEObject = eObjectAtOffsetHelper.getCrossReferencedElement(crossRefNode);

            if (crossLinkedEObject instanceof JvmType) {
                final JvmType jvmType = (JvmType) crossLinkedEObject;
                Set<EObject> sourceElements = modelAssocs.getSourceElements(jvmType);
                if (sourceElements.size() > 0) {
                    createHyperlinkFromAssociatedEObjects(xtextResource, acceptor, crossRefNode, sourceElements);
                } else {
                    shapeLinkingHelper.createHyperlinksFromMatchingEObjectsInProject(xtextResource, acceptor, crossRefNode, jvmType);
                    connectionLinkingHelper.createHyperlinksFromMatchingEObjectsInProject(xtextResource, acceptor, crossRefNode, jvmType);
                    styleLinkingHelper.createHyperlinksFromMatchingEObjectsInProject(xtextResource, acceptor, crossRefNode, jvmType);
                    domainLinkingHelper.createHyperlinksFromMatchingEObjectsInProject(xtextResource, acceptor, crossRefNode, jvmType);
                }
            }
            if (crossLinkedEObject != null && !crossLinkedEObject.eIsProxy()) {
                Region region = getHyperlinkRegion(crossRefNode);
                createHyperlinksTo(xtextResource, region, crossLinkedEObject, acceptor);
            }
        } else {
            IParseResult parseResult = xtextResource.getParseResult();
            if (parseResult != null) {

                final ILeafNode leafNode = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), offset);

                if (leafNode == null) {
                    return;
                }

                final EObject semanticObject = NodeModelUtils.findActualSemanticObjectFor(leafNode);
                List<INode> nodes = new ArrayList<INode>();
                if (semanticObject instanceof ShapeDslKey) {
                    nodes.addAll(NodeModelUtils.findNodesForFeature(semanticObject, SprayPackage.Literals.SHAPE_DSL_KEY__DSL_KEY));
                    Region region = null;
                    Set<TextBody> textBodies = new HashSet<TextBody>();
                    for (INode node : nodes) {
                        region = getHyperlinkRegion(node);
                        if (node.getText() != null) {
                            if (semanticObject.eContainer() instanceof ShapePropertyAssignment) {
                                textBodies = textBodyFetcher.getTextBodysForId(semanticObject.eContainer(), textBodyFetcher.getShapeContainerElementResolver(), textBodyFetcher.getPropertyAssignmentIdFilter(node.getText()));
                            } else if (semanticObject.eContainer() instanceof ShapeCompartmentAssignment) {
                                textBodies = textBodyFetcher.getTextBodysForId(semanticObject.eContainer(), textBodyFetcher.getShapeContainerElementResolver(), textBodyFetcher.getCompartmentAssignmentIdFilter(node.getText()));
                            }
                            for (TextBody textBody : textBodies) {
                                createHyperlinksTo(xtextResource, region, textBody, acceptor);
                            }
                        }
                    }
                }
            }
        }
    }

    private void createHyperlinkFromAssociatedEObjects(final XtextResource xtextResource, final IHyperlinkAcceptor acceptor, final INode crossRefNode, Set<EObject> sourceElements) {
        EObject emfCrossLinkedEObject = sourceElements.iterator().next();
        if (emfCrossLinkedEObject != null && !emfCrossLinkedEObject.eIsProxy()) {
            Region region = getHyperlinkRegion(crossRefNode);
            createHyperlinksTo(xtextResource, region, emfCrossLinkedEObject, acceptor);
        }
    }

    private Region getHyperlinkRegion(final INode crossRefNode) {
        return new Region(crossRefNode.getOffset(), crossRefNode.getLength());
    }

    @Override
    public void createHyperlinksTo(XtextResource from, Region region, final EObject to, IHyperlinkAcceptor acceptor) {
        if (to instanceof ShapeDefinition) {
            shapeLinkingHelper.createHyperlinksTo(from, region, to, acceptor);
        } else if (to instanceof ConnectionDefinition) {
            connectionLinkingHelper.createHyperlinksTo(from, region, to, acceptor);
        } else if (to instanceof Style) {
            styleLinkingHelper.createHyperlinksTo(from, region, to, acceptor);
        } else if ((to instanceof EClassifier)) {
            domainLinkingHelper.createHyperlinksTo(from, region, to, acceptor);
        } else {
            super.createHyperlinksTo(from, region, to, acceptor);
        }
    }
}
