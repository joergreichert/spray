package org.eclipselabs.spray.styles.tests.util;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.util.Modules2;
import org.eclipselabs.spray.styles.StyleRuntimeModule;
import org.eclipselabs.spray.styles.StyleStandaloneSetup;
import org.eclipselabs.spray.styles.StylesPackage;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class StyleTestsStandaloneSetup extends StyleStandaloneSetup {
    @Override
    public Injector createInjector() {
        return Guice.createInjector(Modules2.mixin(new StyleRuntimeModule(), new StyleTestsModule()));
    }

    @Override
    public Injector createInjectorAndDoEMFRegistration() {
        EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
        EPackage.Registry.INSTANCE.put(StylesPackage.eNS_URI, StylesPackage.eINSTANCE);
        return super.createInjectorAndDoEMFRegistration();
    }
}
