package org.eclipselabs.spray.generator.graphiti.tests;

import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.xtext.util.Modules2;
import org.eclipselabs.spray.generator.graphiti.GraphitiGeneratorModule;
import org.eclipselabs.spray.runtime.graphiti.GraphitiRuntimeModule;
import org.eclipselabs.spray.shapes.ShapesPackage;
import org.eclipselabs.spray.styles.StylesPackage;
import org.eclipselabs.spray.xtext.SprayRuntimeModule;
import org.eclipselabs.spray.xtext.SprayStandaloneSetup;

import BusinessDomainDsl.BusinessDomainDslPackage;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SprayTestsStandaloneSetup extends SprayStandaloneSetup {
    @Override
    public Injector createInjector() {
        return Guice.createInjector(Modules2.mixin(new SprayRuntimeModule(), new GraphitiRuntimeModule(), new GraphitiGeneratorModule(), new SprayTestsModule()));
    }

    @Override
    public Injector createInjectorAndDoEMFRegistration() {
        EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
	    EPackage.Registry.INSTANCE.put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
        EPackage.Registry.INSTANCE.put(XMLNamespacePackage.eNS_URI, XMLNamespacePackage.eINSTANCE);

        EPackage.Registry.INSTANCE.put(StylesPackage.eNS_URI, StylesPackage.eINSTANCE);
        EPackage.Registry.INSTANCE.put(ShapesPackage.eNS_URI, ShapesPackage.eINSTANCE);

        EPackage.Registry.INSTANCE.put(BusinessDomainDslPackage.eNS_URI, BusinessDomainDslPackage.eINSTANCE);
        EcorePlugin.getEPackageNsURIToGenModelLocationMap().put(BusinessDomainDslPackage.eNS_URI, URI.createURI("../../examples/one/org.mod4j.dsl.businessdomain.mm/model/BusinessDomainDsl.genmodel"));        
        Injector injector = super.createInjectorAndDoEMFRegistration();
        ResourceSet rs = injector.getInstance(ResourceSet.class);
        
        Map<URI, URI> uriMap = rs.getURIConverter().getURIMap(); 
        uriMap.put( 
        	URI.createURI("platform:/plugin/org.eclipse.emf.ecore/model/XMLNamespace.genmodel"), 
        	URI.createURI("platform:/resource/org.eclipse.emf.ecore/model/XMLNamespace.genmodel")); 
        uriMap.put( 
        	URI.createURI("platform:/plugin/org.eclipse.emf.ecore/model/XMLNamespace.ecore"), 
        	URI.createURI("platform:/resource/org.eclipse.emf.ecore/model/XMLNamespace.ecore")); 
        uriMap.put( 
            	URI.createURI("BusinessDomainDsl.ecore"), 
            	URI.createURI("../../examples/one/org.mod4j.dsl.businessdomain.mm/model/BusinessDomainDsl.ecore")); 
        
        return injector;
    }
}
