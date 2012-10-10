package org.eclipselabs.spray.xtext.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.ui.editor.hover.DispatchingEObjectTextHover;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider.IInformationControlCreatorProvider;

import com.google.inject.Inject;

public class SprayEObjectTextHover extends DispatchingEObjectTextHover {
    private IInformationControlCreatorProvider lastCreatorProvider;

    @Inject
    private IEObjectHoverProvider              hoverProvider;

    @Override
    public Object getHoverInfo(EObject first, ITextViewer textViewer, IRegion hoverRegion) {
        if (first instanceof JvmGenericType && hasExpectedShapeSuperType((JvmGenericType) first)) {
            if (hoverProvider == null)
                return null;
            IInformationControlCreatorProvider creatorProvider = hoverProvider.getHoverInfo(first, textViewer, hoverRegion);
            if (creatorProvider == null)
                return null;
            this.lastCreatorProvider = creatorProvider;
            return lastCreatorProvider.getInfo();
        } else {
            return super.getHoverInfo(first, textViewer, hoverRegion);
        }
    }

    private boolean hasExpectedShapeSuperType(JvmGenericType type) {
        for (JvmTypeReference superType : type.getSuperTypes()) {
            if ("org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayShape".equals(superType.getQualifiedName()) || "org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayConnection".equals(superType.getQualifiedName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public IInformationControlCreator getHoverControlCreator() {
        return this.lastCreatorProvider == null ? null : lastCreatorProvider.getHoverControlCreator();
    }
}
