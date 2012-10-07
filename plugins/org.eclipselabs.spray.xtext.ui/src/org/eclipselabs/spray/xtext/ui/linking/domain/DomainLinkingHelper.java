package org.eclipselabs.spray.xtext.ui.linking.domain;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLEditorOpener;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLLinkingHelper;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLResourceVisitor;
import org.eclipselabs.spray.shapes.shapes.Shape;
import org.eclipselabs.spray.styles.styles.Style;

import com.google.inject.Inject;

public class DomainLinkingHelper extends DSLLinkingHelper<EObject> {

    @Inject
    private EObjectAtOffsetHelper eObjectAtOffsetHelper;

    @Inject
    private IJvmModelAssociations modelAssocs;

    @Inject
    private DomainEditorOpener    eObjectEditorOpener;

    @Inject
    private DomainResourceVisitor eObjectResourceVisitor;

    @Override
    protected DSLResourceVisitor<EObject> getDSLResourceVisitor(final XtextResource xtextResource) {
        eObjectResourceVisitor.setResourceSet(xtextResource.getResourceSet());
        return eObjectResourceVisitor;
    }

    @Override
    protected boolean isExpectedType(final EObject to) {
        return (to instanceof EObject) && !(to instanceof Style) && !(to instanceof Shape);
    }

    @Override
    protected DSLEditorOpener<EObject> getDSLEditorOpener(EObject to) {
        eObjectEditorOpener.setEObject(to);
        return eObjectEditorOpener;
    }

    @Override
    protected String getName(EObject eObject) {
        return eObject.eClass().getName();
    }

    @Override
    protected Set<EObject> getSourceElements(JvmType jvmType) {
        return modelAssocs.getSourceElements(jvmType);
    }

    @Override
    protected EObjectAtOffsetHelper getEObjectAtOffsetHelper() {
        return eObjectAtOffsetHelper;
    }
}
