package org.eclipselabs.spray.xtext.ui.linking.domain;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLEditorOpener;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLResourceVisitor;

import com.google.inject.Inject;

public class DomainEditorOpener extends DSLEditorOpener<EObject> {

    private static final String   ECORE_EDITORID = "org.eclipse.ecore.Ecore";

    @Inject(optional = true)
    private IWorkbench            workbench;

    @Inject
    private DomainResourceVisitor eObjectResourceVisitor;

    @Override
    protected String getDSLEditorId() {
        return ECORE_EDITORID;
    }

    @Override
    protected DSLResourceVisitor<EObject> getDSLResourceVisitor(ResourceSet rs) {
        eObjectResourceVisitor.setResourceSet(rs);
        return eObjectResourceVisitor;
    }

    @Override
    protected boolean areEObjectsEqual(EObject givenEObject, EObject eObjectToInspect) {
        return eObjectToInspect.equals(givenEObject);
    }

    @Override
    protected IWorkbench getWorkbench() {
        if (workbench == null) {
            return PlatformUI.getWorkbench();
        }
        return workbench;
    }
}
