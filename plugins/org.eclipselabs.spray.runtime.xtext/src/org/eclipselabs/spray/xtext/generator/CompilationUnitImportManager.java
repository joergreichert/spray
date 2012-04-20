package org.eclipselabs.spray.xtext.generator;

import com.google.inject.ImplementedBy;

@ImplementedBy(DefaultCompilationUnitImportManager.class)
public interface CompilationUnitImportManager {

    public String shortName(String qualifiedName);

    public void addImport(String qualifiedName);

    public void addImports(String... qualifiedNames);

}
