package org.eclipselabs.spray.runtime.graphiti.xtext.tb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.Property;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IPeService;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.xtext.ui.util.IssueUtil;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipselabs.spray.runtime.graphiti.containers.ISprayContainer;
import org.eclipselabs.spray.runtime.graphiti.containers.SprayContainerService;
import org.eclipselabs.spray.runtime.graphiti.tb.IRenderingDecoratorProvider;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class XtextValidationDecoratorProvider implements IRenderingDecoratorProvider {
    protected IPeService             peService;
    protected final IFeatureProvider fp;

    class MarkerForEObjectPredicate implements Predicate<IMarker> {
        private final EObject object;

        public MarkerForEObjectPredicate(EObject object) {
            this.object = object;
        }

        @Override
        public boolean apply(IMarker input) {
            Issue issue = new IssueUtil().createIssue(input);
            URI uri = issue.getUriToProblem();
            return EcoreUtil.getURI(object).equals(uri);
        }
    }

    public XtextValidationDecoratorProvider(IFeatureProvider fp) {
        this.fp = fp;
        peService = Graphiti.getPeService();
    }

    @Override
    public IDecorator[] getDecorators(PictogramElement pe) {
        Property concept = peService.getProperty(pe, ISprayContainer.CONCEPT_SHAPE_KEY);

        if (concept == null || !"TopContainer".equals(concept.getValue()))
            return null;

        pe = SprayContainerService.findTextShape((ContainerShape) pe);
        EObject bo = (EObject) fp.getBusinessObjectForPictogramElement(pe);
        if (bo == null || bo.eIsProxy() || bo.eResource() == null)
            return null;

        List<IMarker> markers = Lists.newArrayList(findMarkers(bo));
        if (!markers.isEmpty()) {
            IDecorator decorator = new ImageDecorator(getImageIdForDecorator(markers));
            final String message = buildMessage(markers);
            decorator.setMessage(message);
            return new IDecorator[]{decorator};
        } else {
            return null;
        }
    }

    private String getImageIdForDecorator(Iterable<IMarker> markers) {
        int maxSeverity = IMarker.SEVERITY_INFO;
        for (IMarker m : markers) {
            maxSeverity = Math.max(maxSeverity, m.getAttribute(IMarker.SEVERITY, 0));
        }
        switch (maxSeverity) {
        case IMarker.SEVERITY_ERROR:
            return IPlatformImageConstants.IMG_ECLIPSE_ERROR_TSK;
        case IMarker.SEVERITY_WARNING:
            return IPlatformImageConstants.IMG_ECLIPSE_WARNING_TSK;
        default:
            return IPlatformImageConstants.IMG_ECLIPSE_INFORMATION_TSK;
        }
    }

    private String buildMessage(Iterable<IMarker> marker) {
        StringBuilder b = new StringBuilder();
        try {
            b.append(IterableExtensions.head(marker).getAttribute(IMarker.MESSAGE));

            for (IMarker d : IterableExtensions.drop(marker, 1)) {
                b.append("\n");
                b.append(d.getAttribute(IMarker.MESSAGE));
            }
            return b.toString();
        } catch (CoreException e) {
            return "";
        }
    }

    protected Iterable<IMarker> findMarkers(EObject o) {
        IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(o.eResource().getURI().toPlatformString(true));
        try {
            IMarker[] markers = resource.findMarkers("org.eclipse.xtext.ui.check", true, IResource.DEPTH_INFINITE);
            return Iterables.filter(Arrays.asList(markers), new MarkerForEObjectPredicate(o));
        } catch (CoreException e) {
            return Collections.emptyList();
        }
    }

}
