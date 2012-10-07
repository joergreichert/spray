package org.eclipselabs.spray.runtime.xtext.ui.linking;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public abstract class DSLEditorOpener<T extends EObject> extends
		LanguageSpecificURIEditorOpener {
	private static final Logger logger = Logger
			.getLogger(DSLEditorOpener.class);

	private final T eObject;

	public DSLEditorOpener(T eObject) {
		this.eObject = eObject;
	}

	@Override
	public IEditorPart open(URI uri, EReference crossReference,
			int indexInList, boolean select) {
		try {
			IFile file = getFile(eObject);
			if (file != null) {
				IEditorInput editorInput = new FileEditorInput(file);
				if (getWorkbench() != null) {
					IWorkbenchPage activePage = getWorkbench()
							.getActiveWorkbenchWindow().getActivePage();
					IEditorPart editor = IDE.openEditor(activePage,
							editorInput, getDSLEditorId());
					selectAndReveal(editor, uri, crossReference, indexInList,
							select);
					return EditorUtils.getXtextEditor(editor);
				}
				return null;
			}
		} catch (WrappedException e) {
			logger.error("Error while opening editor part for EMF URI '" + uri
					+ "'", e.getCause());
		} catch (PartInitException partInitException) {
			logger.error("Error while opening editor part for EMF URI '" + uri
					+ "'", partInitException);
		}
		return null;
	}

	protected void selectAndReveal(IEditorPart openEditor, final URI uri,
			final EReference crossReference, final int indexInList,
			final boolean select) {
		final XtextEditor xtextEditor = EditorUtils.getXtextEditor(openEditor);
		if (xtextEditor != null) {
			xtextEditor.getDocument().readOnly(
					new IUnitOfWork.Void<XtextResource>() {
						@Override
						public void process(XtextResource resource)
								throws Exception {
							if (resource != null) {
								EObject object = findEObjectByURI(uri, resource);
								if (object != null) {
									ILocationInFileProvider locationProvider = getLocationProvider();
									if (locationProvider != null) {
										ITextRegion location = (crossReference != null) ? locationProvider
												.getSignificantTextRegion(
														object, crossReference,
														indexInList)
												: locationProvider
														.getSignificantTextRegion(object);
										if (select) {
											xtextEditor.selectAndReveal(
													location.getOffset(),
													location.getLength());
										} else {
											xtextEditor.reveal(
													location.getOffset(),
													location.getLength());
										}
									}
								}
							}
						}
					});
		}
	}
	
	@Override
	public ILocationInFileProvider getLocationProvider() {
		ILocationInFileProvider lp = super.getLocationProvider();
		if(lp == null) {
			lp = new DefaultLocationInFileProvider();
			setLocationProvider(lp);
		}
		return lp;
	}

	protected abstract IWorkbench getWorkbench();

	private IFile getFile(final T eObject) {
		ResourceSet rs = eObject.eResource().getResourceSet();
		DSLResourceVisitor<T> visitor = getDSLResourceVisitor(rs);
		final Map<IResource, List<T>> fileToEObjects = visitor
				.getFileToEObjectsMap();
		return getEObjectFile(eObject, fileToEObjects);
	}

	private IFile getEObjectFile(final T eObject,
			Map<IResource, List<T>> fileToEObjects) {
		for (Map.Entry<IResource, List<T>> entrySet : fileToEObjects.entrySet()) {
			for (T ele : entrySet.getValue()) {
				if (areEObjectsEqual(eObject, ele)) {
					return (IFile) entrySet.getKey();
				}
			}
		}
		return null;
	}

	protected abstract String getDSLEditorId();

	protected abstract DSLResourceVisitor<T> getDSLResourceVisitor(
			ResourceSet rs);

	protected abstract boolean areEObjectsEqual(T givenEObject,
			T eObjectToInspect);
}
