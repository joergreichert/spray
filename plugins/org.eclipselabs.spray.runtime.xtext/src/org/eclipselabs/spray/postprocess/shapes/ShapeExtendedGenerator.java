package org.eclipselabs.spray.postprocess.shapes;

import org.eclipse.xtext.XtextRuntimeModule;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.generator.Generator;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ShapeExtendedGenerator extends Generator {

    public ShapeExtendedGenerator() {
        new XtextStandaloneSetup() {
            @Override
            public Injector createInjector() {
                return Guice.createInjector(new XtextRuntimeModule() {
                    public java.lang.Class<? extends org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor> bindIXtext2EcorePostProcessor() {
                        return ShapeEcorePostProcessor.class;
                    }
                });
            }
        }.createInjectorAndDoEMFRegistration();
    }
}
