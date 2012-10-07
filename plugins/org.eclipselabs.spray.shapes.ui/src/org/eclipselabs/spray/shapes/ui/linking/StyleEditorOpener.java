package org.eclipselabs.spray.shapes.ui.linking;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLEditorOpener;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLResourceVisitor;
import org.eclipselabs.spray.styles.styles.Style;

import com.google.inject.Inject;

public class StyleEditorOpener extends DSLEditorOpener<Style> {

	private static final String STYLE_DSL_EDITORID = "org.eclipselabs.spray.styles.Style";

	@Inject(optional = true)
	private IWorkbench workbench;
	
	public StyleEditorOpener(Style eObject) {
		super(eObject);
	}
	
	@Override
	protected String getDSLEditorId() {
		return STYLE_DSL_EDITORID;
	}

	@Override
	protected DSLResourceVisitor<Style> getDSLResourceVisitor(ResourceSet rs) {
		return new StyleResourceVisitor(rs);
	}

	@Override
	protected boolean areEObjectsEqual(Style givenStyle,
			Style styleToInspect) {
		return styleToInspect.getName().equals(
						givenStyle.getName());
	}

	@Override
	protected IWorkbench getWorkbench() {
		if(workbench == null) {
			return PlatformUI.getWorkbench();
		}
		return workbench;
	}	
}
