package org.eclipselabs.spray.xtext.generator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.codegen.util.ImportManager;

import com.google.inject.Singleton;

@Singleton
public class DefaultCompilationUnitImportManager implements CompilationUnitImportManager {

    private static final ThreadLocal<ImportManager> THREAD_LOCAL = new ThreadLocal<ImportManager>();

    private static final Log                        LOGGER       = LogFactory.getLog(DefaultCompilationUnitImportManager.class);

    public void enter(String compilationUnitPackage) {
        if (THREAD_LOCAL.get() != null) {
            throw new IllegalStateException("Es wurde bereits ein ImportManager initialisiert.");
        }
        THREAD_LOCAL.set(new ImportManager(compilationUnitPackage));
    }

    public void exit() {
        if (THREAD_LOCAL.get() == null) {
            LOGGER.warn("Es existiert aktuell kein ImportManager.");
        }
        THREAD_LOCAL.set(null);
    }

    @Override
    public String shortName(String qualifiedName) {
        checkDelegate();
        return THREAD_LOCAL.get().getImportedName(qualifiedName, true);
    }

    public String insertImports() {
        checkDelegate();
        return THREAD_LOCAL.get().computeSortedImports();
    }

    @Override
    public void addImport(String qualifiedName) {
        checkDelegate();
        THREAD_LOCAL.get().addImport(qualifiedName);
    }

    @Override
    public void addImports(String... qualifiedNames) {
        for (String qualifiedName : qualifiedNames) {
            addImport(qualifiedName);
        }
    }

    private void checkDelegate() {
        if (THREAD_LOCAL.get() == null) {
            throw new IllegalStateException("DefaultCompilationUnitImportManager#enter() must be invoked first.");
        }
    }
}
