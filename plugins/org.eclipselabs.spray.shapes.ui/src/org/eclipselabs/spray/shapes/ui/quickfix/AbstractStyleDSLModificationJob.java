package org.eclipselabs.spray.shapes.ui.quickfix;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;
import org.eclipselabs.spray.styles.Gradient;
import org.eclipselabs.spray.styles.GradientLayout;
import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.styles.StyleContainer;
import org.eclipselabs.spray.styles.StyleLayout;
import org.eclipselabs.spray.styles.StylesFactory;

public abstract class AbstractStyleDSLModificationJob extends IUnitOfWork.Void<XtextResource> {
    public enum ModificationJobType {
        STYLE,
        GRADIENT;

        public AbstractStyleDSLModificationJob create(final IXtextDocument shapeXtextDocument, final Issue issue) {
            AbstractStyleDSLModificationJob job = null;
            if (this == ModificationJobType.STYLE) {
                job = new StyleModificationJob(shapeXtextDocument, issue);
            } else if (this == ModificationJobType.GRADIENT) {
                job = new GradientModificationJob(shapeXtextDocument, issue);
            }
            return job;
        }
    }

    private IXtextDocument shapeXtextDocument;
    private Issue          issue;
    protected EObject      newElement;

    protected AbstractStyleDSLModificationJob(final IXtextDocument shapeXtextDocument, final Issue issue) {
        AbstractStyleDSLModificationJob.this.shapeXtextDocument = shapeXtextDocument;
        AbstractStyleDSLModificationJob.this.issue = issue;
    }

    @Override
    public void process(XtextResource styleResource) throws Exception {
    	StyleContainer styleContainer = null;
        for (EObject eo : styleResource.getContents()) {
            if (eo instanceof StyleContainer) {
            	styleContainer = (StyleContainer) eo;
                break;
            }
        }
        if (styleContainer != null) {
            String elementName = shapeXtextDocument.get(issue.getOffset(), issue.getLength());
            newElement = createNewElement(styleContainer, elementName);
        }
    }

    protected abstract EObject createNewElement(StyleContainer styleContainer, String elementName);

    private static class StyleModificationJob extends AbstractStyleDSLModificationJob {

        StyleModificationJob(IXtextDocument sprayXtextDocument, Issue issue) {
            super(sprayXtextDocument, issue);
        }

        @Override
        protected EObject createNewElement(StyleContainer styleContainer, String styleName) {
            Style style = StylesFactory.eINSTANCE.createStyle();
            style.setName(styleName);
            StyleLayout styleLayout = StylesFactory.eINSTANCE.createStyleLayout();
            style.setLayout(styleLayout);
            styleContainer.getStyleContainerElement().add(style);
            return style;
        }
    }

    private static class GradientModificationJob extends AbstractStyleDSLModificationJob {

        GradientModificationJob(IXtextDocument sprayXtextDocument, Issue issue) {
            super(sprayXtextDocument, issue);
        }

        @Override
        protected EObject createNewElement(StyleContainer styleContainer, String gradientName) {
            Gradient gradient = StylesFactory.eINSTANCE.createGradient();
       		gradient.setName(gradientName);
            GradientLayout gradientLayout = StylesFactory.eINSTANCE.createGradientLayout();
            gradient.setLayout(gradientLayout);
            styleContainer.getStyleContainerElement().add(gradient);
            return gradient;
        }
    }

    public EObject getNewElement() {
        return newElement;
    }
}
