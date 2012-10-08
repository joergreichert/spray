package org.eclipselabs.spray.shapes.ui.hover;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider;
import org.eclipselabs.spray.shapes.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition;

import com.google.inject.Inject;

public class ShapesEObjectDocumentationProvider extends
		MultiLineCommentDocumentationProvider {

	@Inject
	private IJavaProjectProvider javaProjectProvider;

	@Inject
	private ImageResourceVisitor imageResourceVisitor;
	
	@Override
	public String getDocumentation(EObject o) {
		String shapeName = null;
		if (o instanceof ShapeDefinition) {
			shapeName = ((ShapeDefinition) o).getName();
		} else if (o instanceof ConnectionDefinition) {
			shapeName = ((ConnectionDefinition) o).getName();
		}
		if (shapeName != null) {
			IJavaProject javaProject = javaProjectProvider.getJavaProject(o
					.eResource().getResourceSet());
			if (javaProject != null) {
				try {
					imageResourceVisitor.setShapeName(shapeName);
					javaProject.getProject().accept(imageResourceVisitor);
					String imagePath = imageResourceVisitor.getImagePath();
					if (imagePath != null) {
						String alternativeText = "Shapes preview for "
								+ shapeName;
						return //super.getDocumentation(o) + 
								"<br /><br /><img src=\"" + imagePath
								+ "\" alt=\"" + alternativeText + "\" />";
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		return super.getDocumentation(o);
	}
}
