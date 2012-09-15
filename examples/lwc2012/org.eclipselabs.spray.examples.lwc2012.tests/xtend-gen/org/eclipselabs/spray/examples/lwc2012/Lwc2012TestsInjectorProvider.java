package org.eclipselabs.spray.examples.lwc2012;

import com.google.common.base.Objects;
import com.google.inject.Injector;
import org.eclipse.xtext.junit4.GlobalRegistries;
import org.eclipse.xtext.junit4.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.eclipse.xtext.junit4.IRegistryConfigurator;
import org.eclipselabs.spray.examples.lwc2012.Lwc2012TestsStandaloneSetup;

@SuppressWarnings("all")
public class Lwc2012TestsInjectorProvider implements IInjectorProvider, IRegistryConfigurator {
  protected GlobalStateMemento stateBeforeInjectorCreation;
  
  protected GlobalStateMemento stateAfterInjectorCreation;
  
  protected Injector injector;
  
  public Injector getInjector() {
    boolean _equals = Objects.equal(this.injector, null);
    if (_equals) {
      GlobalStateMemento _makeCopyOfGlobalState = GlobalRegistries.makeCopyOfGlobalState();
      this.stateBeforeInjectorCreation = _makeCopyOfGlobalState;
      Injector _internalCreateInjector = this.internalCreateInjector();
      this.injector = _internalCreateInjector;
      GlobalStateMemento _makeCopyOfGlobalState_1 = GlobalRegistries.makeCopyOfGlobalState();
      this.stateAfterInjectorCreation = _makeCopyOfGlobalState_1;
    }
    return this.injector;
  }
  
  public Injector internalCreateInjector() {
    Lwc2012TestsStandaloneSetup _lwc2012TestsStandaloneSetup = new Lwc2012TestsStandaloneSetup();
    Injector _createInjectorAndDoEMFRegistration = _lwc2012TestsStandaloneSetup.createInjectorAndDoEMFRegistration();
    Injector _injector = this.injector = _createInjectorAndDoEMFRegistration;
    return _injector;
  }
  
  public void restoreRegistry() {
    this.stateBeforeInjectorCreation.restoreGlobalState();
  }
  
  public void setupRegistry() {
    this.getInjector();
    this.stateAfterInjectorCreation.restoreGlobalState();
  }
}
