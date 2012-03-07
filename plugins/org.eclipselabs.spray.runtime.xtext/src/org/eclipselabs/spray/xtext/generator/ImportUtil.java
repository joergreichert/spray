package org.eclipselabs.spray.xtext.generator;

import org.eclipse.xtext.common.types.JvmTypeReference;

@SuppressWarnings("restriction")
public class ImportUtil {
    private org.eclipse.xtext.xbase.compiler.ImportManager xbaseImportManager;
    private org.eclipse.emf.codegen.util.ImportManager     emfImportManager;

    public ImportUtil() {
        initImports("");
    }

    public void initImports(String compilationUnitPackage) {
        xbaseImportManager = new org.eclipse.xtext.xbase.compiler.ImportManager(/* organizeImports */true);
        emfImportManager = new org.eclipse.emf.codegen.util.ImportManager(compilationUnitPackage);
    }

    public String shortName(JvmTypeReference typeRef) {
        checkState();
        return emfImportManager.getImportedName(typeRef.getIdentifier(), true);
    }

    public String shortName(String qualifiedName) {
        checkState();
        return emfImportManager.getImportedName(qualifiedName, true);
    }

    public String shortName(Class<?> clazz) {
        checkState();
        return emfImportManager.getImportedName(clazz.getName(), true);
    }

    public String printImports() {
        checkState();
        StringBuilder builder = new StringBuilder();
        for (String i : emfImportManager.getImports()) {
            builder.append("import ").append(i).append(';').append(System.getProperty("line.separator"));
        }
        return builder.toString();
    }

    private void checkState() {
        if (emfImportManager == null)
            throw new IllegalStateException("Call initImports() first");
    }

    public org.eclipse.xtext.xbase.compiler.ImportManager getXbaseImportManager() {
        return xbaseImportManager;
    }

}
