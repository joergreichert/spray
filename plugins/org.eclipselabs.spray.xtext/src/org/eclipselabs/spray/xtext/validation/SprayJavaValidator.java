package org.eclipselabs.spray.xtext.validation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.eclipselabs.spray.mm.spray.AliasableElement;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.SprayPackage;
import org.eclipselabs.spray.xtext.util.GenModelHelper;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class SprayJavaValidator extends AbstractSprayJavaValidator {
    @Inject
    private GenModelHelper genModelHelper;

    /**
     * Add additional EReferences for type conformance validation of expressions.
     */
    @Override
    protected Set<EReference> getTypeConformanceCheckedReferences() {
        Set<EReference> references = new HashSet<EReference>(super.getTypeConformanceCheckedReferences());
        references.add(SprayPackage.Literals.TEXT__VALUE);
        return references;
    }

    @Check
    public void checkGenModelAvailable(MetaClass clazz) {
        EClass type = clazz.getType();
        try {
            // call of getEPackageClassName will result in an IllegalStateException when no GenModel was found
            if (type.eIsProxy()) {
                return; // scoping problem; will be reported as separate problem
            }
            genModelHelper.getEPackageClassName(type);
        } catch (IllegalStateException e) {
            error("No genmodel registered for EClass " + type.getName(), clazz, SprayPackage.Literals.META_CLASS__TYPE, IssueCodes.MISSING_GENMODEL);
        }
    }

    @Check
    public void checkDuplicateAliasName(final AliasableElement element) {
        if (element.getAlias() == null)
            return;

        final Predicate<AliasableElement> filter = new Predicate<AliasableElement>() {
            @Override
            public boolean apply(AliasableElement input) {
                return element.getAlias().equals(input.getAlias());
            }
        };

        if (element instanceof MetaClass) {
            Diagram diagram = (Diagram) element.eContainer();
            if (element != Iterables.find(diagram.getMetaClassesList(), filter)) {
                error("Duplicate alias name " + element.getAlias(), element, SprayPackage.Literals.ALIASABLE_ELEMENT__ALIAS, IssueCodes.DUPLICATE_ALIAS_NAME, element.getAlias());
            }
        } else {
            MetaClass clazz = EcoreUtil2.getContainerOfType(element, MetaClass.class);
            List<AliasableElement> elements = EcoreUtil2.eAllOfType(clazz, AliasableElement.class);
            elements.remove(clazz);
            // ignore the first element with the alias, but raise errors for all following
            if (element != Iterables.find(elements, filter)) {
                error("Duplicate alias name " + element.getAlias(), element, SprayPackage.Literals.ALIASABLE_ELEMENT__ALIAS, IssueCodes.DUPLICATE_ALIAS_NAME, element.getAlias());
            }
        }
    }

    @Check
    public void checkDuplicateConnectionReferences(final MetaClass element) {
        MetaReference found = null;
        for (MetaReference ref : element.getReferences()) {
            found = Iterables.find(Arrays.asList(element.getReferences()), getDuplicateConnectionReferenceFilter(ref));
            if (found != null && found != ref) {
                String referenceName = getReferenceName(ref);
                error("Duplicate connection reference: " + referenceName, element, SprayPackage.Literals.META_CLASS__REFERENCES, IssueCodes.DUPLICATE_CONNECTION_REFERENCE, referenceName);
            }
        }
    }

    private String getReferenceName(MetaReference ref) {
        String name = ref.getTarget().getName();
        if (name == null) {
            name = EcoreUtil2.getURI(ref.getTarget()).toString();
        }
        return name + " : connection ()";
    }

    private Predicate<? super MetaReference> getDuplicateConnectionReferenceFilter(final MetaReference reference) {
        return new Predicate<MetaReference>() {
            @Override
            public boolean apply(MetaReference input) {
                return reference.getTarget().equals(input.getTarget());
            }
        };
    }

    @Check
    public void checkConnectionReferenceToContainmentFeature(final MetaClass element) {
        for (MetaReference ref : element.getReferences()) {
            if ((ref.getTarget() != null && ref.getTarget().isContainment()) || ref.getTarget().eIsProxy()) {
                String referenceName = getReferenceName(ref);
                error("Connection reference to containment reference not supported yet: " + referenceName, element, SprayPackage.Literals.META_CLASS__REFERENCES, IssueCodes.CONTAINMENT_CONNECTION_REFERENCE, referenceName);
            }
        }
    }
}
