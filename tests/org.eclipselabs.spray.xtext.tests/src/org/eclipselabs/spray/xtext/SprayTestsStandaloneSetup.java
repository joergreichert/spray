package org.eclipselabs.spray.xtext;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.util.Modules2;
import org.eclipselabs.spray.generator.graphiti.GraphitiGeneratorModule;
import org.eclipselabs.spray.runtime.graphiti.GraphitiRuntimeModule;
import org.eclipselabs.spray.shapes.ShapeRuntimeModule;
import org.eclipselabs.spray.shapes.ShapeStandaloneSetup;
import org.eclipselabs.spray.shapes.ShapesPackage;
import org.eclipselabs.spray.styles.StyleRuntimeModule;
import org.eclipselabs.spray.styles.StyleStandaloneSetup;
import org.eclipselabs.spray.styles.StylesPackage;

import BusinessDomainDsl.BusinessDomainDslPackage;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SprayTestsStandaloneSetup extends SprayStandaloneSetup {
    @Override
    public Injector createInjector() {
        return Guice.createInjector(Modules2.mixin(new StyleRuntimeModule(), new ShapeRuntimeModule(), new SprayRuntimeModule(), new GraphitiRuntimeModule(), new GraphitiGeneratorModule(), new SprayTestsModule()));
    }

    @Override
    public Injector createInjectorAndDoEMFRegistration() {
        ShapeStandaloneSetup.doSetup();
        StyleStandaloneSetup.doSetup();
        EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
        EPackage.Registry.INSTANCE.put(StylesPackage.eNS_URI, StylesPackage.eINSTANCE);
        EPackage.Registry.INSTANCE.put(ShapesPackage.eNS_URI, ShapesPackage.eINSTANCE);
        EcorePlugin.getEPackageNsURIToGenModelLocationMap().put(BusinessDomainDslPackage.eNS_URI, URI.createURI("classpath:/mod4j/BusinessDomainDsl.genmodel"));
        // avoid exception: Cannot create a resource for <URI>; a registered resource factory is needed
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());
        return super.createInjectorAndDoEMFRegistration();
    }
}
