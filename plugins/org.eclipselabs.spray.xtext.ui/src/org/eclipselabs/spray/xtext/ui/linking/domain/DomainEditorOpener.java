package org.eclipselabs.spray.xtext.ui.linking.domain;

import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLEditorOpener;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLResourceVisitor;

import com.google.inject.Inject;

public class DomainEditorOpener extends DSLEditorOpener<EClassifier> {

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
    protected IEditorPart open(IWorkbenchPage activePage, IFile file) throws PartInitException {
        IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());
        return activePage.openEditor(new FileEditorInput(file), desc.getId());
    }

    @Override
    protected DSLResourceVisitor<EClassifier> getDSLResourceVisitor(ResourceSet rs) {
        eObjectResourceVisitor.setResourceSet(rs);
        return eObjectResourceVisitor;
    }

    protected void selectAndReveal(IEditorPart openEditor, final URI uri, final EReference crossReference, final int indexInList, final boolean select) {
        if (openEditor instanceof EcoreEditor) {
            EcoreEditor ecoreEditor = (EcoreEditor) openEditor;
            Resource res = ecoreEditor.getEditingDomain().getResourceSet().getResource(uri, true);
            EObject object = res.getEObject(uri.fragment());
            if (object != null) {
                ecoreEditor.setSelectionToViewer(Collections.singleton(object));
            }
        }
    }

    @Override
    protected boolean areEObjectsEqual(EClassifier givenEObject, EClassifier eObjectToInspect) {
        return eObjectToInspect.getName().equals(givenEObject.getName());
    }

    @Override
    protected IWorkbench getWorkbench() {
        if (workbench == null) {
            return PlatformUI.getWorkbench();
        }
        return workbench;
    }
}
