package org.eclipselabs.spray.generator.graphiti.util;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.spray.mm.spray.Behavior;
import org.eclipselabs.spray.mm.spray.CustomBehavior;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.SprayFactory;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.eclipselabs.spray.xtext.generator.ImportUtil;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link NamingExtensions}
 * 
 * @author Karsten Thoms
 */
@RunWith(XtextRunner.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class NamingExtensionsTest {
    @Inject
    private NamingExtensions fixture;
    @Inject
    private ImportUtil       importUtil;

    private Diagram          diagram;
    private MetaClass        clsEClass;
    private MetaClass        clsEClassAliased;
    private MetaClass        clsEClassifier;
    private MetaReference    reference;
    private MetaReference    reference2;
    private Behavior         behavior;

    @BeforeClass
    public static void static_init() {
        StandaloneSetup setup = new StandaloneSetup();
        setup.setPlatformUri(".");
        setup.setScanClassPath(true);
        EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
        EPackage.Registry.INSTANCE.put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
        EcorePlugin.getEPackageNsURIToGenModelLocationMap().put(EcorePackage.eNS_URI, URI.createURI("platform:/resource/org.eclipse.emf.ecore/model/Ecore.genmodel"));
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());
    }

    @Before
    public void init() {
        assertEquals("diagrams", ProjectProperties.getDiagramPackage());
        assertEquals("features", ProjectProperties.getFeaturePackage());
        assertEquals("property", ProjectProperties.getPropertyPackage());
        importUtil.initImports("");

        diagram = SprayFactory.eINSTANCE.createDiagram();
        diagram.setName("ediag");

        clsEClass = SprayFactory.eINSTANCE.createMetaClass();
        clsEClass.setType(EcorePackage.Literals.ECLASS);
        clsEClass.setIcon("ecore/EClass.gif");
        diagram.getMetaClassesList().add(clsEClass);

        clsEClassifier = SprayFactory.eINSTANCE.createMetaClass();
        clsEClassifier.setType(EcorePackage.Literals.ECLASSIFIER);
        diagram.getMetaClassesList().add(clsEClassifier);

        // MetaClass with alias name: EClass => EcoreClass
        clsEClassAliased = SprayFactory.eINSTANCE.createMetaClass();
        clsEClassAliased.setType(EcorePackage.Literals.ECLASS);
        clsEClassAliased.setAlias("EcoreClass");
        diagram.getMetaClassesList().add(clsEClassAliased);

        reference = SprayFactory.eINSTANCE.createMetaReference();
        reference.setTarget(EcorePackage.Literals.ECLASS__EALL_OPERATIONS);
        clsEClass.getReferencesList().add(reference);

        reference2 = SprayFactory.eINSTANCE.createMetaReference();
        reference2.setTarget(EcorePackage.Literals.ECLASSIFIER__EPACKAGE);
        clsEClassifier.getReferencesList().add(reference2);

        behavior = SprayFactory.eINSTANCE.createCustomBehavior();
        behavior.setName("sampleBehavior");
        clsEClass.getBehaviorsList().add(behavior);
    }

    //---------------------------------------------------------------------------------------------
    // Class names for Diagram
    //---------------------------------------------------------------------------------------------
    @Test
    public void test_getDiagramTypeProviderClassName() {
        assertEquals("diagrams.EdiagDiagramTypeProvider", fixture.getDiagramTypeProviderClassName(diagram));
    }

    @Test
    public void test_getDiagramTypeProviderSimpleClassName() {
        assertEquals("EdiagDiagramTypeProvider", fixture.getDiagramTypeProviderSimpleClassName(diagram));
    }

    @Test
    public void test_getFeatureProviderClassName() {
        assertEquals("diagrams.EdiagFeatureProvider", fixture.getFeatureProviderClassName(diagram));
    }

    @Test
    public void test_getFeatureProviderSimpleClassName() {
        assertEquals("EdiagFeatureProvider", fixture.getFeatureProviderSimpleClassName(diagram));
    }

    @Test
    public void test_getImageProviderClassName() {
        assertEquals("diagrams.EdiagImageProvider", fixture.getImageProviderClassName(diagram));
    }

    @Test
    public void test_getImageProviderSimpleClassName() {
        assertEquals("EdiagImageProvider", fixture.getImageProviderSimpleClassName(diagram));
    }

    @Test
    public void test_getToolBehaviorProviderClassName() {
        assertEquals("diagrams.EdiagToolBehaviorProvider", fixture.getToolBehaviorProviderClassName(diagram));
    }

    @Test
    public void test_getToolBehaviorProviderSimpleClassName() {
        assertEquals("EdiagToolBehaviorProvider", fixture.getToolBehaviorProviderSimpleClassName(diagram));
    }

    @Test
    public void test_getDiagramEditorClassName() {
        assertEquals("diagrams.EdiagDiagramEditor", fixture.getDiagramEditorClassName(diagram));
    }

    @Test
    public void test_getDiagramEditorSimpleClassName() {
        assertEquals("EdiagDiagramEditor", fixture.getDiagramEditorSimpleClassName(diagram));
    }

    @Test
    public void test_getGuiceModuleClassName() {
        assertEquals("spray.EdiagModule", fixture.getGuiceModuleClassName(diagram));
    }

    @Test
    public void test_getGuiceModuleSimpleClassName() {
        assertEquals("EdiagModule", fixture.getGuiceModuleSimpleClassName(diagram));
    }

    @Test
    public void test_getModelServiceClassName() {
        assertEquals("diagrams.EdiagModelService", fixture.getModelServiceClassName(diagram));
    }

    @Test
    public void test_getModelServiceSimpleClassName() {
        assertEquals("EdiagModelService", fixture.getModelServiceSimpleClassName(diagram));
    }

    //---------------------------------------------------------------------------------------------
    // Class names for MetaClass
    //---------------------------------------------------------------------------------------------
    @Test
    public void test_getAddFeatureClassName_MetaClass() {
        assertEquals("features.EdiagAddEClassFeature", fixture.getAddFeatureClassName(clsEClass));
    }

    @Test
    public void test_getAddFeatureSimpleClassName_MetaClass() {
        assertEquals("EdiagAddEClassFeature", fixture.getAddFeatureSimpleClassName(clsEClass));
    }

    @Test
    public void test_getAddFeatureSimpleClassName_AliasedMetaClass() {
        assertEquals("EdiagAddEcoreClassFeature", fixture.getAddFeatureSimpleClassName(clsEClassAliased));
    }

    @Test
    public void test_getFeatureClassName_MetaClass_FeatureType() {
        assertEquals("features.EdiagLayoutEClassFeature", fixture.getFeatureClassName(clsEClass, FeatureType.Layout));
    }

    @Test
    public void test_getFeatureSimpleClassName_MetaClass_FeatureType() {
        assertEquals("EdiagLayoutEClassFeature", fixture.getFeatureSimpleClassName(clsEClass, FeatureType.Layout));
    }

    @Test
    public void test_getFilterClassName() {
        assertEquals("property.EClassFilter", fixture.getFilterClassName(clsEClass));
    }

    @Test
    public void test_getFilterSimpleClassName() {
        assertEquals("EClassFilter", fixture.getFilterSimpleClassName(clsEClass));
    }

    //---------------------------------------------------------------------------------------------
    // Class names for MetaReference
    //---------------------------------------------------------------------------------------------
    @Test
    public void test_getCreateFeatureClassName_MetaReference() {
        assertEquals("features.EdiagCreateEClassEAllOperationsEOperationFeature", fixture.getCreateFeatureClassName(reference));
    }

    @Test
    public void test_getFeatureClassName_MetaReference_String() {
        assertEquals("features.EdiagLayoutEClassEAllOperationsEOperationFeature", fixture.getFeatureClassName(reference, FeatureType.Layout));
    }

    @Test
    public void test_getAddReferenceAsConnectionFeatureClassName() {
        assertEquals("features.EdiagAddReferenceEClassEAllOperationsFeature", fixture.getAddReferenceAsConnectionFeatureClassName(reference));
    }

    @Test
    public void test_getAddReferenceAsConnectionFeatureSimpleClassName() {
        assertEquals("EdiagAddReferenceEClassEAllOperationsFeature", fixture.getAddReferenceAsConnectionFeatureSimpleClassName(reference));
    }

    @Test
    public void test_getCreateReferenceAsListFeatureClassName() {
        assertEquals("features.EdiagCreateEClassEAllOperationsEOperationFeature", fixture.getCreateReferenceAsListFeatureClassName(reference));
    }

    @Test
    public void test_getCreateReferenceAsListFeatureSimpleClassName() {
        assertEquals("EdiagCreateEClassEAllOperationsEOperationFeature", fixture.getCreateReferenceAsListFeatureSimpleClassName(reference));
    }

    /**
     * Use here the MetaClass for EClassifier and EDataType as subtype of it. Reference is EClassifier->EPackage
     */
    @Test
    public void test_getCreateReferenceAsListFeatureClassName_MetaReference_EClass() {
        assertEquals("features.EdiagCreateEClassifierEPackageEDataTypeFeature", fixture.getCreateReferenceAsListFeatureClassName(reference2, EcorePackage.Literals.EDATA_TYPE));
    }

    @Test
    public void test_getCreateReferenceAsListFeatureSimpleClassName_MetaReference_EClass() {
        assertEquals("EdiagCreateEClassifierEPackageEDataTypeFeature", fixture.getCreateReferenceAsListFeatureSimpleClassName(reference2, EcorePackage.Literals.EDATA_TYPE));
    }

    @Test
    public void test_getAddReferenceAsListFeatureClassName() {
        assertEquals("features.EdiagAddEClassEAllOperationsListFeature", fixture.getAddReferenceAsListFeatureClassName(reference));
    }

    @Test
    public void test_getAddReferenceAsListFeatureSimpleClassName() {
        assertEquals("EdiagAddEClassEAllOperationsListFeature", fixture.getAddReferenceAsListFeatureSimpleClassName(reference));
    }

    @Test
    public void test_getUpdateReferenceAsListFeatureClassName() {
        assertEquals("features.EdiagUpdateEClassEAllOperationsFeature", fixture.getUpdateReferenceAsListFeatureClassName(reference));
    }

    @Test
    public void test_getUpdateReferenceAsListFeatureSimpleClassName() {
        assertEquals("EdiagUpdateEClassEAllOperationsFeature", fixture.getUpdateReferenceAsListFeatureSimpleClassName(reference));
    }

    @Test
    public void test_getAddReferenceFeatureClassName_MetaReference() {
        assertEquals("features.EdiagCreateEClassEAllOperationsEOperationFeature", fixture.getCreateFeatureClassName(reference));
    }

    @Test
    public void test_getCreateReferenceAsConnectionFeatureClassName() {
        assertEquals("features.EdiagCreateEClassEAllOperationsFeature", fixture.getCreateReferenceAsConnectionFeatureClassName(reference));
    }

    @Test
    public void test_getCreateReferenceAsConnectionFeatureSimpleClassName() {
        assertEquals("EdiagCreateEClassEAllOperationsFeature", fixture.getCreateReferenceAsConnectionFeatureSimpleClassName(reference));
    }

    @Test
    public void test_getDeleteReferenceFeatureClassName() {
        assertEquals("features.EdiagDeleteReferenceEClassEAllOperationsFeature", fixture.getDeleteReferenceFeatureClassName(reference));
    }

    @Test
    public void test_getDeleteReferenceFeatureSimpleClassName() {
        assertEquals("EdiagDeleteReferenceEClassEAllOperationsFeature", fixture.getDeleteReferenceFeatureSimpleClassName(reference));
    }

    //---------------------------------------------------------------------------------------------
    // Class names for Behavior
    //---------------------------------------------------------------------------------------------
    @Test
    public void test_getCustomFeatureClassName() {
        assertEquals("features.EdiagCustomSampleBehaviorFeature", fixture.getCustomFeatureClassName((CustomBehavior) behavior));
    }

    @Test
    public void test_getCustomFeatureSimpleClassName() {
        assertEquals("EdiagCustomSampleBehaviorFeature", fixture.getCustomFeatureSimpleClassName((CustomBehavior) behavior));
    }

    //---------------------------------------------------------------------------------------------
    // Class names for EClass
    //---------------------------------------------------------------------------------------------
    @Test
    public void test_getFilterClassName_EClass() {
        assertEquals("property.EClassFilter", fixture.getFilterClassName(EcorePackage.Literals.ECLASS));
    }

    @Test
    public void test_getFilterSimpleClassName_EClass() {
        assertEquals("EClassFilter", fixture.getFilterSimpleClassName(EcorePackage.Literals.ECLASS));
    }

    //---------------------------------------------------------------------------------------------
    // Class names for EAttribute
    //---------------------------------------------------------------------------------------------
    @Test
    public void test_getPropertySectionClassName() {
        assertEquals("property.EClassAbstractSection", fixture.getPropertySectionClassName(EcorePackage.Literals.ECLASS__ABSTRACT));
    }

    @Test
    public void test_getPropertySectionSimpleClassName() {
        assertEquals("EClassAbstractSection", fixture.getPropertySectionSimpleClassName(EcorePackage.Literals.ECLASS__ABSTRACT));
    }

    //---------------------------------------------------------------------------------------------
    // Other names for MetaClass
    //---------------------------------------------------------------------------------------------
    @Test
    public void test_getDiagramName() {
        assertEquals("ediag", fixture.getDiagramName(clsEClass));
    }

    @Test
    public void test_getImageBaseName() {
        assertEquals("ecore_eclass", fixture.getImageBaseName(clsEClass.getIcon()));
    }

    //---------------------------------------------------------------------------------------------
    // Names from GenModel
    //---------------------------------------------------------------------------------------------
    @Test
    public void test_getJavaInterfaceName() {
        assertEquals("org.eclipse.emf.ecore.EClass", fixture.getJavaInterfaceName(clsEClass.getType()));
    }

    @Test
    public void test_getEPackageClassName() {
        assertEquals("org.eclipse.emf.ecore.EcorePackage", fixture.getEPackageClassName(clsEClass.getType()));
    }

    @Test
    public void test_getEFactoryInterfaceName() {
        assertEquals("org.eclipse.emf.ecore.EcoreFactory", fixture.getEFactoryInterfaceName(clsEClass.getType()));
    }

    @Test
    public void test_getLiteralConstant() {
        assertEquals("EcorePackage.Literals.ECLASS", fixture.getLiteralConstant(clsEClass.getType()));
    }

    @Test
    public void test_getLiteralConstant_EReference() {
        assertEquals("EcorePackage.Literals.ECLASS__EALL_OPERATIONS", fixture.getLiteralConstant(reference.getTarget()));
    }

    //---------------------------------------------------------------------------------------------
    // Other names
    //---------------------------------------------------------------------------------------------
    @Test
    public void test_getActivatorClassName() {
        assertEquals("spray.Activator", fixture.getActivatorClassName(diagram));
    }

    @Test
    public void test_getActivatorSimpleClassName() {
        assertEquals("Activator", fixture.getActivatorSimpleClassName(diagram));
    }

    @Test
    public void test_getImageIdentifier() {
        assertEquals("EDIAG__ECORE_ECLASS", fixture.getImageIdentifier(diagram, clsEClass.getIcon()));
    }

}
