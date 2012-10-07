package org.eclipselabs.spray.shapes.linking;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;

import com.google.inject.Inject;


public class ShapeLinkingService extends DefaultLinkingService {

	@Inject private IJvmModelAssociations modelAssocs;
	
	@Override
	public List<EObject> getLinkedObjects(EObject context,
			EReference reference, INode node) throws IllegalNodeException {
		if(context instanceof JvmTypeReference) {
			JvmTypeReference ref = (JvmTypeReference) context;
			Set<EObject> sourceElements = modelAssocs.getSourceElements(ref);
			if(sourceElements.size() > 0) {
				return new ArrayList<EObject>(sourceElements);
			}
		}
		return super.getLinkedObjects(context, reference, node);
	}

}
