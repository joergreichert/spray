package org.eclipselabs.spray.xtext;

import java.util.Set;

import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipselabs.spray.mm.spray.SprayFactory;
import org.eclipselabs.spray.mm.spray.SprayPackage;
import org.eclipselabs.spray.xtext.api.IConstants;
import org.eclipselabs.spray.xtext.customizing.SprayQualifiedNameProvider;
import org.eclipselabs.spray.xtext.customizing.SpraySimpleNameProvider;
import org.eclipselabs.spray.xtext.customizing.SprayTypeProvider;
import org.eclipselabs.spray.xtext.scoping.AppInjectedAccess;
import org.eclipselabs.spray.xtext.scoping.SprayImportedNamespaceScopeProvider;
import org.eclipselabs.spray.xtext.scoping.SprayScopeProvider;
import org.eclipselabs.spray.xtext.util.TextBodyFetcher;

import com.google.common.collect.Sets;
import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class SprayRuntimeModule extends AbstractSprayRuntimeModule {

    @Override
    public void configure(Binder binder) {
        binder.requestStaticInjection(AppInjectedAccess.class);
        // bind well known EPackage and EFactory instances
        binder.bind(SprayPackage.class).toInstance(SprayPackage.eINSTANCE);
        binder.bind(SprayFactory.class).toInstance(SprayFactory.eINSTANCE);
        binder.bind(EcorePackage.class).toInstance(EcorePackage.eINSTANCE);
        binder.bind(EcoreFactory.class).toInstance(EcoreFactory.eINSTANCE);
        super.configure(binder);
    }

    @Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return SprayQualifiedNameProvider.class;
    }

    @Override
    public Class<? extends IdentifiableSimpleNameProvider> bindIdentifiableSimpleNameProvider() {
        return SpraySimpleNameProvider.class;
    }

    @Override
    public Class<? extends ITypeProvider> bindITypeProvider() {
        return SprayTypeProvider.class;
    }

    public void configureValidIconFileExtensions(Binder binder) {
        binder.bind(Set.class).annotatedWith(Names.named(IConstants.NAME_VALID_ICON_FILE_EXTENSIONS)).toInstance(Sets.newHashSet("gif", "png", "bmp", "ico"));
    }

    public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
        return SprayScopeProvider.class;
    }

    /**
     * Implicit imports
     */
    @Override
    public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
        binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(SprayImportedNamespaceScopeProvider.class);
    }

    public Class<? extends TextBodyFetcher> bindTextBodyFetcher() {
        return TextBodyFetcher.class;
    }
}
