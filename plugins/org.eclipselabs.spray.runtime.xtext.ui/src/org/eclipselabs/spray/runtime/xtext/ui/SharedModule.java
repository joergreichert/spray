package org.eclipselabs.spray.runtime.xtext.ui;

import org.eclipse.xtext.builder.impl.ToBeBuiltComputer;
import org.eclipselabs.spray.runtime.xtext.ui.builder.JdtToBeBuiltComputerExt;

import com.google.inject.AbstractModule;

@SuppressWarnings("restriction")
public class SharedModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ToBeBuiltComputer.class).to(JdtToBeBuiltComputerExt.class);
    }
}
