package org.eclipselabs.spray.examples.lwc2012;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import java.util.ArrayList;
import java.util.Map;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.util.Modules2;
import org.eclipse.xtext.xbase.XbaseStandaloneSetup;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipselabs.spray.shapes.ShapeRuntimeModule;
import org.eclipselabs.spray.styles.StyleRuntimeModule;
import org.eclipselabs.spray.xtext.SprayRuntimeModule;

@SuppressWarnings("all")
public class Lwc2012TestsStandaloneSetup implements ISetup {
  public Injector createInjectorAndDoEMFRegistration() {
    Injector _xblockexpression = null;
    {
      XbaseStandaloneSetup.doSetup();
      final Injector injector = this.createInjector();
      this.register(injector);
      _xblockexpression = (injector);
    }
    return _xblockexpression;
  }
  
  public Injector createInjector() {
    StyleRuntimeModule _styleRuntimeModule = new StyleRuntimeModule();
    ShapeRuntimeModule _shapeRuntimeModule = new ShapeRuntimeModule();
    SprayRuntimeModule _sprayRuntimeModule = new SprayRuntimeModule();
    Module _mixin = Modules2.mixin(_styleRuntimeModule, _shapeRuntimeModule, _sprayRuntimeModule);
    Injector _createInjector = Guice.createInjector(_mixin);
    return _createInjector;
  }
  
  public void register(final Injector injector) {
    final IResourceFactory resourceFactory = injector.<IResourceFactory>getInstance(IResourceFactory.class);
    final IResourceServiceProvider serviceProvider = injector.<IResourceServiceProvider>getInstance(IResourceServiceProvider.class);
    final ArrayList<String> extensions = CollectionLiterals.<String>newArrayList("spray", "shape", "style");
    for (final String ext : extensions) {
      {
        Map<String,Object> _extensionToFactoryMap = Registry.INSTANCE.getExtensionToFactoryMap();
        _extensionToFactoryMap.put(ext, resourceFactory);
        Map<String,Object> _extensionToFactoryMap_1 = org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap();
        _extensionToFactoryMap_1.put(ext, serviceProvider);
      }
    }
  }
}
