package org.eclipselabs.spray.xtext.util;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

import com.google.inject.Inject;

/**
 * This class computes an EClass' Java class name from looking up the EClass' GenModel from the {@link EcorePlugin#getEPackageNsURIToGenModelLocationMap() EPackage to GenModel map}.
 * 
 * @author Karsten Thoms
 */
public class GenModelHelper {
    @Inject
    private IQualifiedNameProvider qualifiedNameProvider;
    @Inject
    private ResourceSet            resourceSet;

    public String getJavaInterfaceName(EClass eClass) {
        if (eClass == null) {
            return null;
        }
        GenClass genClass = getGenClass(eClass);
        return genClass != null ? genClass.getQualifiedInterfaceName() : null;
    }

    public String getEPackageClassName(EClass eClass) {
        GenClass genClass = getGenClass(eClass);
        return genClass != null ? genClass.getGenPackage().getQualifiedPackageInterfaceName() : null;
    }

    public String getEFactoryInterfaceName(EClass eClass) {
        GenClass genClass = getGenClass(eClass);
        return genClass != null ? genClass.getGenPackage().getQualifiedFactoryInterfaceName() : null;
    }

    public String getEFactoryInterfaceName(EDataType dataType) {
        GenDataType genDataType = getGenDataType(dataType);
        return genDataType != null ? genDataType.getQualifiedInstanceClassName() : null;
    }

    public String getLiteralConstant(EClass eClass) {
        GenClass genClass = getGenClass(eClass);
        if (genClass == null) {
            return null;
        } else {
            return genClass.getClassifierID();
        }
    }

    public String getLiteralConstant(EStructuralFeature feature) {
        // TODO
        GenFeature genClass = getGenFeature(feature);
        if (genClass == null) {
            return null;
        } else {
            // TODO: Find appropriate method in GenFeature
            return getLiteralConstant(feature.getEContainingClass()) + "__" + genClass.getFormattedName().replace(" ", "_").toUpperCase();
        }

    }

    public String getFileExtension(EClass eClass) {
        GenPackage pck = getGenPackage(eClass);
        return pck.getFileExtension();
    }

    protected GenClass getGenClass(EClass eClass) {
        GenModel genModel = getGenModel(eClass);
        for (GenPackage pck : genModel.getAllGenPackagesWithClassifiers()) {
            for (GenClass genClass : pck.getGenClasses()) {
                EClass c = genClass.getEcoreClass();
                // Normally we would just compare the EClasses, but it might be that they came from different URIs.
                // In a unit test the Ecore model is read for example with a classpath URI, while the Genmodel refers to the same
                // EClasses from a platform URI.
                // As a workaround we compute the qualified names of the EClasses. This workaround should be removed later when possible.
                if (qualifiedNameProvider.getFullyQualifiedName(eClass).equals(qualifiedNameProvider.getFullyQualifiedName(c))) {
                    return genClass;
                }
            }
        }
        return null;
    }

    protected GenDataType getGenDataType(EDataType eDataType) {
        GenModel genModel = getGenModel(eDataType);
        for (GenPackage pck : genModel.getAllGenPackagesWithClassifiers()) {
            for (GenDataType genDataType : pck.getGenDataTypes()) {
                EDataType d = genDataType.getEcoreDataType();
                // Normally we would just compare the EClasses, but it might be that they came from different URIs.
                // In a unit test the Ecore model is read for example with a classpath URI, while the Genmodel refers to the same
                // EClasses from a platform URI.
                // As a workaround we compute the qualified names of the EClasses. This workaround should be removed later when possible.
                if (qualifiedNameProvider.getFullyQualifiedName(eDataType).equals(qualifiedNameProvider.getFullyQualifiedName(d))) {
                    return genDataType;
                } else if (d.eIsProxy()) {
                    genDataType.setEcoreDataType(eDataType);
                    return genDataType;
                }
            }
        }
        return null;
    }

    protected GenFeature getGenFeature(EStructuralFeature feature) {
        GenClass genClass = getGenClass(feature.getEContainingClass());
        for (GenFeature f : genClass.getAllGenFeatures()) {
            if (qualifiedNameProvider.getFullyQualifiedName(f.getEcoreFeature()).equals(qualifiedNameProvider.getFullyQualifiedName(feature))) {
                return f;
            }
        }
        return null;
    }

    protected GenPackage getGenPackage(EClass eClass) {
        GenModel genModel = getGenModel(eClass);
        for (GenPackage pck : genModel.getAllGenPackagesWithClassifiers()) {
            for (GenClass genClass : pck.getGenClasses()) {
                EClass c = genClass.getEcoreClass();
                // Normally we would just compare the EClasses, but it might be that they came from different URIs.
                // In a unit test the Ecore model is read for example with a classpath URI, while the Genmodel refers to the same
                // EClasses from a platform URI.
                // As a workaround we compute the qualified names of the EClasses. This workaround should be removed later when possible.
                if (qualifiedNameProvider.getFullyQualifiedName(eClass).equals(qualifiedNameProvider.getFullyQualifiedName(c))) {
                    return pck;
                }
            }
        }
        return null;
    }

    public GenModel getGenModel(EClassifier eClassifier) {
        if (eClassifier == null) {
            throw new IllegalStateException("Cannot determine interface name for EClass, since the EClass is null");
        }
        if (eClassifier.eIsProxy()) {
            throw new IllegalStateException("Cannot determine interface name for EClass, since the EClass is an unresolved proxy (" + EcoreUtil.getURI(eClassifier) + ")");
        }
        if (eClassifier.getEPackage() == null) {
            throw new IllegalStateException("EPackage of EClass '" + eClassifier + "' is null.");
        }
        URI genModelUri = EcorePlugin.getEPackageNsURIToGenModelLocationMap().get(eClassifier.getEPackage().getNsURI());
        if (genModelUri == null) {
            throw new IllegalStateException("GenModel for EPackage '" + eClassifier.getEPackage().getNsURI() + "' must be registered.");
        }
        Resource res = resourceSet.getResource(genModelUri, true);
        EcoreUtil.resolveAll(res);

        GenModel genModel = (GenModel) res.getContents().get(0);
        return genModel;
    }

}
