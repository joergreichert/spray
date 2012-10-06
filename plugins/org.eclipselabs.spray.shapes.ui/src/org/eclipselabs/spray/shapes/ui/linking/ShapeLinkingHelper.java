package org.eclipselabs.spray.shapes.ui.linking;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.common.types.xtext.ui.TypeAwareHyperlinkHelper;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.XtextReadonlyEditorInput;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkLabelProvider;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipselabs.spray.styles.styles.Style;
import org.eclipselabs.spray.styles.styles.StyleContainer;
import org.eclipselabs.spray.styles.styles.StyleContainerElement;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

public class ShapeLinkingHelper extends TypeAwareHyperlinkHelper {
	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;

	@Inject
	private IJvmModelAssociations modelAssocs;

	@Inject
	private IJavaProjectProvider javaProjectProvider;

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

	@Inject
	@HyperlinkLabelProvider
	private ILabelProvider labelProvider;

	@Inject
	private Provider<XtextHyperlink> hyperlinkProvider;

	@Inject
	private IStorage2UriMapper mapper;

	@Inject
	@Named(Constants.LANGUAGE_NAME)
	private String editorID;

	@Inject(optional = true)
	private IWorkbench workbench;

	private static final Logger logger = Logger
			.getLogger(ShapeLinkingHelper.class);

	@Inject
	private IURIEditorOpener uriEditorOpener;

	@Inject
	private ILocationInFileProvider locationProvider;

	public void createHyperlinksByOffset(final XtextResource xtextResource,
			int offset, final IHyperlinkAcceptor acceptor) {
		final INode crossRefNode = eObjectAtOffsetHelper.getCrossReferenceNode(
				xtextResource, new TextRegion(offset, 0));
		if (crossRefNode == null)
			return;
		EObject crossLinkedEObject = eObjectAtOffsetHelper
				.getCrossReferencedElement(crossRefNode);

		if (crossLinkedEObject instanceof JvmType) {
			final JvmType jvmType = (JvmType) crossLinkedEObject;
			Set<EObject> sourceElements = modelAssocs
					.getSourceElements(jvmType);
			if (sourceElements.size() > 0) {
				EObject emfCrossLinkedEObject = sourceElements.iterator().next();
				if (emfCrossLinkedEObject != null
						&& !emfCrossLinkedEObject.eIsProxy()) {
					Region region = new Region(crossRefNode.getOffset(),
							crossRefNode.getLength());
					createHyperlinksTo(xtextResource, region,
							emfCrossLinkedEObject, acceptor);
				}
			} else {
				IJavaProject javaProject = javaProjectProvider
						.getJavaProject(xtextResource.getResourceSet());
				try {
					javaProject.getProject().accept(new IResourceVisitor() {

						@Override
						public boolean visit(IResource resource)
								throws CoreException {
							if ("style".equals(resource.getFileExtension())
									&& !resource.getFullPath()
											.toPortableString()
											.contains("/bin/")
									&& !resource.getFullPath()
											.toPortableString()
											.contains("/target/")) {
								Resource res = xtextResource.getResourceSet()
										.getResource(
												URI.createURI(resource
														.getLocationURI()
														.toString()), true);
								try {
									res.load(Collections.EMPTY_MAP);
								} catch (IOException e) {
									e.printStackTrace();
								}
								for (EObject eo : res.getContents()) {
									if (eo instanceof StyleContainer) {
										StyleContainer styleContainer = (StyleContainer) eo;
										for (StyleContainerElement ele : styleContainer
												.getStyleContainerElement()) {
											if (ele instanceof Style) {
												Style style = (Style) ele;
												if (style != null
														&& !style.eIsProxy()
														&& jvmType
																.getSimpleName()
																.equals(style
																		.getName())) {
													Region region = new Region(
															crossRefNode
																	.getOffset(),
															crossRefNode
																	.getLength());
													ShapeLinkingHelper.this
															.createHyperlinksTo(
																	xtextResource,
																	region,
																	style,
																	acceptor);
												}
											}
										}
									}
								}
							} else if (resource instanceof IContainer) {
								for (IResource child : ((IContainer) resource)
										.members()) {
									visit(child);
								}
							}
							return false;
						}
					});
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		if (crossLinkedEObject != null && !crossLinkedEObject.eIsProxy()) {
			Region region = new Region(crossRefNode.getOffset(),
					crossRefNode.getLength());
			createHyperlinksTo(xtextResource, region, crossLinkedEObject,
					acceptor);
		}
	}

	private IFile file = null;

	private IFile getFile(final Style style) {
		file = null;
		IJavaProject javaProject = javaProjectProvider.getJavaProject(style
				.eResource().getResourceSet());
		try {
			javaProject.getProject().accept(new IResourceVisitor() {

				@Override
				public boolean visit(IResource resource) throws CoreException {
					if ("style".equals(resource.getFileExtension())) {
						Resource res = style
								.eResource()
								.getResourceSet()
								.getResource(
										URI.createURI(resource.getLocationURI()
												.toString()), true);
						try {
							res.load(Collections.EMPTY_MAP);
						} catch (IOException e) {
							e.printStackTrace();
						}
						for (EObject eo : res.getContents()) {
							if (eo instanceof StyleContainer) {
								StyleContainer styleContainer = (StyleContainer) eo;
								for (StyleContainerElement ele : styleContainer
										.getStyleContainerElement()) {
									if (ele instanceof Style
											&& ((Style) ele).getName().equals(
													style.getName())) {
										file = (IFile) resource;
										break;
									}
								}
							}
						}
					} else if (resource instanceof IContainer) {
						for (IResource child : ((IContainer) resource)
								.members()) {
							visit(child);
						}
					}
					return false;
				}
			});
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return file;
	}

	@Override
	public void createHyperlinksTo(XtextResource from, Region region,
			final EObject to, IHyperlinkAcceptor acceptor) {
		if (to instanceof Style) {
			final URIConverter uriConverter = from.getResourceSet()
					.getURIConverter();
			final String hyperlinkText = labelProvider.getText(to) + " (Xtext)";
			final URI uri = EcoreUtil.getURI(to);
			final URI normalized = uriConverter.normalize(uri);

			XtextHyperlink result = new XtextHyperlink() {

				public void open() {
					LanguageSpecificURIEditorOpener opener = new LanguageSpecificURIEditorOpener() {

						public IEditorPart open(URI uri,
								EReference crossReference, int indexInList,
								boolean select) {
							try {
								IFile file = getFile((Style) to);
								if (file != null) {
									IEditorInput editorInput = new FileEditorInput(
											file);
									IWorkbenchPage activePage = workbench
											.getActiveWorkbenchWindow()
											.getActivePage();
									String editorID = "org.eclipselabs.spray.styles.Style";
									IEditorPart editor = IDE.openEditor(
											activePage, editorInput, editorID);
									selectAndReveal(editor, uri,
											crossReference, indexInList, select);
									return EditorUtils.getXtextEditor(editor);
								}
							} catch (WrappedException e) {
								logger.error(
										"Error while opening editor part for EMF URI '"
												+ uri + "'", e.getCause());
							} catch (PartInitException partInitException) {
								logger.error(
										"Error while opening editor part for EMF URI '"
												+ uri + "'", partInitException);
							}
							return null;
						}

						@Override
						protected void selectAndReveal(IEditorPart openEditor,
								final URI uri, final EReference crossReference,
								final int indexInList, final boolean select) {
							final XtextEditor xtextEditor = EditorUtils
									.getXtextEditor(openEditor);
							if (xtextEditor != null) {
								xtextEditor.getDocument().readOnly(
										new IUnitOfWork.Void<XtextResource>() {
											@Override
											public void process(
													XtextResource resource)
													throws Exception {
												if (resource != null) {
													EObject object = findEObjectByURI(
															uri, resource);
													if (object != null) {
														ITextRegion location = (crossReference != null) ? locationProvider
																.getSignificantTextRegion(
																		object,
																		crossReference,
																		indexInList)
																: locationProvider
																		.getSignificantTextRegion(object);
														if (select) {
															xtextEditor
																	.selectAndReveal(
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
										});
							}
						}
					};
					boolean select = true;
					opener.open(uri, select);
				}
			};
			result.setHyperlinkRegion(region);
			result.setURI(normalized);
			result.setHyperlinkText(hyperlinkText);
			acceptor.accept(result);
		} else {
			super.createHyperlinksTo(from, region, to, acceptor);
		}
	}
}
