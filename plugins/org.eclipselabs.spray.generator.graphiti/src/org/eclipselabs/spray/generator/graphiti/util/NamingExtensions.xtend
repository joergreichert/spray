package org.eclipselabs.spray.generator.graphiti.util

import javax.inject.Inject
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.util.SimpleAttributeResolver
import org.eclipselabs.spray.mm.spray.AliasableElement
import org.eclipselabs.spray.mm.spray.CustomBehavior
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.mm.spray.MetaReference
import org.eclipselabs.spray.mm.spray.ShapeFromDsl
import org.eclipselabs.spray.xtext.generator.importmanager.ImportUtil
import org.eclipselabs.spray.xtext.util.GenModelHelper

import static org.eclipse.xtext.EcoreUtil2.*
import static org.eclipselabs.spray.generator.common.GeneratorUtil.*
import org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment
import org.eclipselabs.spray.mm.spray.ShapeReference
import org.eclipselabs.spray.mm.spray.ConnectionReference
import org.eclipselabs.spray.mm.spray.ShapeDslKey
import org.eclipselabs.spray.mm.spray.SprayStyleRef
import org.eclipselabs.spray.generator.common.ProjectProperties import org.eclipselabs.spray.styles.Style
import org.eclipselabs.spray.shapes.ShapeStyleRef

/**
 * Computation of class names, file names etc.
 * @author Karsten Thoms
 */
class NamingExtensions {
    @Inject GenModelHelper genModelHelper
    @Inject ImportUtil importUtil

//    def dispatch String qualifiedName(ShapeDslKey shapeRef) {
//        if( shapeRef.dslKey!= null){
//            return "org.eclipselabs.spray.shapes." + shapeRef.dslShape.name.toFirstUpper
//        } else {
//            return shapeRef.jvmShape.qualifiedName;
//        }   
//    }
    
    def dispatch String simpleName(ShapeDslKey shapeRef) {
        if( shapeRef.dslKey != null){
            return shapeRef.dslKey
        } else {
            return shapeRef.jvmKey.simpleName;
        }   
    }
    
    def dispatch String qualifiedName(ShapeReference shapeRef) {
        if( shapeRef.dslShape != null){
            return ProjectProperties::shapesPackage + "." + shapeRef.dslShape.name.toFirstUpper
        } else {
            return shapeRef.jvmShape.qualifiedName;
        }   
    }
    
    def dispatch String simpleName(ShapeReference shapeRef) {
        if( shapeRef.dslShape != null){
            return shapeRef.dslShape.name.toFirstUpper
        } else {
            return shapeRef.jvmShape.simpleName;
        }   
    }
    
    def dispatch String qualifiedName(ConnectionReference shapeRef) {
        if( shapeRef.dslConnection != null){
            return ProjectProperties::shapesPackage + "." + shapeRef.dslConnection.name.toFirstUpper
        } else {
            return shapeRef.jvmConnection.qualifiedName;
        }   
    }
    
    def dispatch String simpleName(ConnectionReference shapeRef) {
        if( shapeRef.dslConnection != null){
            return shapeRef.dslConnection.name.toFirstUpper
        } else {
            return shapeRef.jvmConnection.simpleName;
        }   
    }

    def dispatch String qualifiedName(SprayStyleRef styleRef) {
        if( styleRef.javaStyle != null){
            return styleRef.javaStyle.qualifiedName;
        } else {
            return styleRef.dslStyle.qualifiedName
        }   
    }
    
    def dispatch String qualifiedName(ShapeStyleRef styleRef) {
        if( styleRef.javaStyle != null){
            return styleRef.javaStyle.qualifiedName;
        } else {
            return styleRef.dslStyle.qualifiedName
        }   
    }
    
    def dispatch String qualifiedName(Style style) {
        return ProjectProperties::stylesPackage + "." + style.name.toFirstUpper
    }
    
    def dispatch String simpleName(SprayStyleRef styleRef) {
        if( styleRef.javaStyle != null){
            return styleRef.javaStyle.simpleName;
        } else {
            return styleRef.dslStyle.name.toFirstUpper
        }   
    }
    
    def dispatch String getName (EObject obj) {
        SimpleAttributeResolver::NAME_RESOLVER.apply(obj)
    }

    def dispatch String getName (MetaClass metaClass) {
        if (metaClass.type!=null) metaClass.type.name else null
    }
    def dispatch String getName (MetaReference ref) {
        ref.target.name
    }

    /**
     * The visible name is the element's alias if set, otherwise the element's name
     */
    def String getVisibleName (AliasableElement elem) {
        if (elem.alias != null && elem.alias.length > 0)
           return elem.alias
        else
           return elem.name
    }
    
    def String getLabelPropertyName (MetaReference ref) {
//        if (ref.labelProperty != null)
//           ref.labelProperty.name
//        else
           "name" 
    }
    
    //---------------------------------------------------------------------------------------------
    // Class names for Diagram
    //---------------------------------------------------------------------------------------------
    def getDiagramTypeProviderClassName (Diagram diagram) {
        diagram_package() + "." + diagram.getDiagramTypeProviderSimpleClassName
    }
    def getDiagramTypeProviderSimpleClassName (Diagram diagram) {
        diagram.name.toFirstUpper + "DiagramTypeProvider"
    }
    def getFeatureProviderClassName (Diagram diagram) {
        diagram_package() + "." + diagram.getFeatureProviderSimpleClassName
    }
    def getFeatureProviderSimpleClassName (Diagram diagram) {
        diagram.name.toFirstUpper + "FeatureProvider"
    }
    def getImageProviderClassName (Diagram diagram) {
        diagram_package() + "." + diagram.getImageProviderSimpleClassName
    }
    def getImageProviderSimpleClassName (Diagram diagram) {
        diagram.name.toFirstUpper + "ImageProvider"
    }
    def getToolBehaviorProviderClassName (Diagram diagram) {
        diagram_package() + "." + diagram.getToolBehaviorProviderSimpleClassName
    }
    def getToolBehaviorProviderSimpleClassName (Diagram diagram) {
        diagram.name.toFirstUpper + "ToolBehaviorProvider"
    }
    def getDiagramEditorClassName (Diagram diagram) {
        diagram_package() + "." + diagram.getDiagramEditorSimpleClassName
    }
    def getDiagramEditorSimpleClassName (Diagram diagram) {
        diagram.name.toFirstUpper() + "DiagramEditor"
    }
    def getGuiceModuleClassName (Diagram diagram) {
        main_package() + "." + getGuiceModuleSimpleClassName(diagram)
    }
    def getGuiceModuleSimpleClassName (Diagram diagram) {
        diagram.name.toFirstUpper+"Module"
    }
    def getModelServiceClassName (Diagram diagram) {
        diagram_package + "." + diagram.getModelServiceSimpleClassName
    }
    def getModelServiceSimpleClassName (Diagram diagram) {
        diagram.name.toFirstUpper() + "ModelService"
    }
    //---------------------------------------------------------------------------------------------
    // Class names for MetaClass
    //---------------------------------------------------------------------------------------------
    def getCreateFeatureClassName (MetaClass clazz) {
        getFeatureClassName (clazz, FeatureType::Create)
    }
    def getCreateFeatureSimpleClassName (MetaClass clazz) {
        getFeatureSimpleClassName (clazz, FeatureType::Create)
    }
    def getAddFeatureClassName (MetaClass clazz) {
        getFeatureClassName (clazz, FeatureType::Add)
    }
    def getAddFeatureSimpleClassName (MetaClass clazz) {
        getFeatureSimpleClassName (clazz, FeatureType::Add)
    }
    def getUpdateFeatureClassName (MetaClass clazz) {
        getFeatureClassName (clazz, FeatureType::Update)
    }
    def getUpdateFeatureSimpleClassName (MetaClass clazz) {
        getFeatureSimpleClassName (clazz, FeatureType::Update)
    }
    def getLayoutFeatureClassName (MetaClass clazz) {
        getFeatureClassName (clazz, FeatureType::Layout)
    }
    def getLayoutFeatureSimpleClassName (MetaClass clazz) {
        getFeatureSimpleClassName (clazz, FeatureType::Layout)
    }
    def getDirectEditFeatureClassName (MetaClass clazz) {
        getFeatureClassName (clazz, FeatureType::DirectEdit)
    }
    def getDirectEditFeatureSimpleClassName (MetaClass clazz) {
        getFeatureSimpleClassName (clazz, FeatureType::DirectEdit)
    }
    
    def getCopyFeatureClassName (Diagram clazz) {
   		getDiagramClassName(clazz, FeatureType::Copy)
    }   
    
    def getCopyFeatureSimpleClassName (Diagram clazz) {
    	getDiagramSimpleClassName(clazz, FeatureType::Copy)
    }
    
    def getPasteFeatureClassName (Diagram clazz) {
    	getDiagramClassName(clazz, FeatureType::Paste)
    }
        
    def getPasteFeatureSimpleClassName (Diagram clazz) {
		getDiagramSimpleClassName(clazz, FeatureType::Paste)
    }
    
    def getResizeFeatureClassName (MetaClass clazz) {
        getFeatureClassName (clazz, FeatureType::Resize)
    }
    def getResizeFeatureSimpleClassName (MetaClass clazz) {
        getFeatureSimpleClassName (clazz, FeatureType::Resize)
    }
    def getMoveFeatureClassName (MetaClass clazz) {
        getFeatureClassName (clazz, FeatureType::Move)
    }
    def getMoveFeatureSimpleClassName (MetaClass clazz) {
        getFeatureSimpleClassName (clazz, FeatureType::Move)
    }

    /**
     * Result example:
     * Diagram = "mod4j", MetaClass = "BusinessClass", featureType="Add" 
     * Result = "Mod4jAddBusinessClassFeature"
     */
    def getFeatureClassName (MetaClass clazz, FeatureType featureType) {
        feature_package() + "." + getFeatureSimpleClassName(clazz, featureType)
    }

    def getFeatureSimpleClassName (MetaClass clazz, FeatureType featureType) {
        clazz.diagram.name.toFirstUpper + featureType + clazz.visibleName + "Feature"
    }
    
    def getDiagramClassName (Diagram clazz, FeatureType featureType) {
    	feature_package() + "." + getDiagramSimpleClassName(clazz, featureType)
    }
    
    def getDiagramSimpleClassName (Diagram clazz, FeatureType featureType) {
    	clazz.name.toFirstUpper + featureType + "Feature"
    }
    
    def dispatch getFilterClassName (MetaClass clazz) {
        property_package() + "." + clazz.getFilterSimpleClassName
    }
    def dispatch getFilterSimpleClassName (MetaClass clazz) {
        clazz.type.name+"Filter"
    }

    //---------------------------------------------------------------------------------------------
    // Class names for MetaReference
    //---------------------------------------------------------------------------------------------
    def getCreateFeatureClassName (MetaReference reference) {
        getFeatureClassName (reference, FeatureType::Create)
    }
    def getAddFeatureClassName (MetaReference reference) {
        getFeatureClassName (reference, FeatureType::Add)
    }
    def getUpdateFeatureClassName (MetaReference reference) {
        getFeatureClassName (reference, FeatureType::Update)
    }
    def getFeatureClassName (MetaReference reference, FeatureType featureType) {
        val cls = getContainerOfType(reference, typeof(MetaClass))
        feature_package() + "." + cls.diagram.name.toFirstUpper + featureType + cls.type.name + reference.target.name.toFirstUpper + reference.target.EReferenceType.name + "Feature"
    }    
    def getAddReferenceAsConnectionFeatureClassName (MetaReference reference) {
        feature_package() + "." + reference.getAddReferenceAsConnectionFeatureSimpleClassName 
    }
    def getAddReferenceAsConnectionFeatureSimpleClassName (MetaReference reference) {
        val cls = getContainerOfType(reference, typeof(MetaClass))
        cls.diagram.name.toFirstUpper + "AddReference" + cls.type.name + reference.target.name.toFirstUpper + "Feature" 
    }
    def getCreateReferenceAsListFeatureClassName (MetaReference reference) {
        feature_package() + "." + reference.getCreateReferenceAsListFeatureSimpleClassName
    }
    def getCreateReferenceAsListFeatureSimpleClassName (MetaReference reference) {
        val cls = getContainerOfType(reference, typeof(MetaClass))
        cls.diagram.name.toFirstUpper + "Create" + cls.type.name + reference.name.toFirstUpper + reference.target.EReferenceType.name + "Feature"
    }
    def getUpdateReferenceAsListFeatureClassName (MetaReference reference) {
        feature_package() + "." + reference.getUpdateReferenceAsListFeatureSimpleClassName
    }
    def getUpdateReferenceAsListFeatureSimpleClassName (MetaReference reference) {
        val cls = getContainerOfType(reference, typeof(MetaClass))
        cls.diagram.name.toFirstUpper + "Update" + cls.type.name + reference.target.name.toFirstUpper + "Feature"
    }
    def getCreateReferenceAsListFeatureClassName (MetaReference reference, EClass subClass) {
        feature_package() + "." + reference.getCreateReferenceAsListFeatureSimpleClassName(subClass)
    }
    def getCreateReferenceAsListFeatureSimpleClassName (MetaReference reference, EClass subClass) {
        val cls = getContainerOfType(reference, typeof(MetaClass))
        cls.diagram.name.toFirstUpper + "Create" + cls.type.name + reference.target.name.toFirstUpper + subClass.name + "Feature"
    }
    def getAddReferenceAsListFeatureClassName (MetaReference reference) {
        feature_package() + "." + reference.getAddReferenceAsListFeatureSimpleClassName 
    }
    def getAddReferenceAsListFeatureSimpleClassName (MetaReference reference) {
        val cls = getContainerOfType(reference, typeof(MetaClass))
        cls.diagram.name.toFirstUpper + "Add" + cls.type.name + reference.target.name.toFirstUpper + "ListFeature" 
    }
    def getCreateReferenceAsConnectionFeatureClassName (MetaReference reference) {
        feature_package() + "." + reference.getCreateReferenceAsConnectionFeatureSimpleClassName
    }
    def getCreateReferenceAsConnectionFeatureSimpleClassName (MetaReference reference) {
        val cls = getContainerOfType(reference, typeof(MetaClass))
        cls.diagram.name.toFirstUpper + "Create" + cls.type.name + reference.target.name.toFirstUpper + "Feature"
    }
    def getDeleteReferenceFeatureClassName (MetaReference reference) {
        feature_package() + "." +  reference.getDeleteReferenceFeatureSimpleClassName
    }
    def getDeleteReferenceFeatureSimpleClassName (MetaReference reference) {
        val cls = getContainerOfType(reference, typeof(MetaClass))
        cls.diagram.name.toFirstUpper + "DeleteReference" + cls.type.name + reference.target.name.toFirstUpper + "Feature"
    }
    //---------------------------------------------------------------------------------------------
    // Class names for Behaviour
    //---------------------------------------------------------------------------------------------
    /**
     * Returns the qualified class name of the ICustomFeature represented by a CustomBehavior.
     */
    def getCustomFeatureClassName (CustomBehavior behavior) {
        if (behavior.realizedBy == null)
            (feature_package() + "." + behavior.getCustomFeatureSimpleClassName)
        else
            behavior.realizedBy.type.qualifiedName
    }
    def getCustomFeatureSimpleClassName (CustomBehavior behavior) {
        val diagram = getContainerOfType(behavior, typeof(Diagram))
        diagram.name.toFirstUpper + "Custom" + behavior.name.toFirstUpper  + "Feature"
    }
    
    //---------------------------------------------------------------------------------------------
    // Class names for EClass
    //---------------------------------------------------------------------------------------------
    def dispatch getFilterClassName (EClass clazz) {
        property_package() + "." + clazz.getFilterSimpleClassName
    }
    def dispatch getFilterSimpleClassName (EClass clazz) {
        clazz.name+"Filter"
    }
    //---------------------------------------------------------------------------------------------
    // Class names for EAttribute
    //---------------------------------------------------------------------------------------------
    def getPropertySectionClassName (EAttribute attribute) {
        property_package() + "." + attribute.getPropertySectionSimpleClassName
    }
    def getPropertySectionSimpleClassName (EAttribute attribute) {
        attribute.EContainingClass.name + attribute.name.toFirstUpper + "Section"
    }
    def getPropertySectionClassName (EClass clazz, EAttribute attribute) {
        property_package() + "." + getPropertySectionSimpleClassName(clazz,attribute)
    }
    def getPropertySectionSimpleClassName (EClass clazz, EAttribute attribute) {
        clazz.name + attribute.name.toFirstUpper + "Section"
    }
    //---------------------------------------------------------------------------------------------
    // Names from GenModel
    //---------------------------------------------------------------------------------------------
    /**
     * Computes the qualified Interface name of the EClass and shortens it using the shortName() function.
     */
    def String getItfName (MetaClass clazz) {
        this.getJavaInterfaceName(clazz.type)
    }
    /**
     * Computes the qualified Interface name of the EClass and shortens it using the shortName() function.
     */
    def String getItfName (EClass clazz) {
        this.getJavaInterfaceName(clazz)
    }

    def String getJavaInterfaceName (MetaClass clazz) {
        this.getJavaInterfaceName(clazz.type)
    }
    def String getJavaInterfaceName (EClass eClass) {
        genModelHelper.getJavaInterfaceName(eClass)
    }
    def String getJavaInterfaceName (EClassifier eClassifier) {
        genModelHelper.getJavaInterfaceName(eClassifier)
    }
    def String getEPackageClassName (MetaClass clazz) {
        this.getEPackageClassName(clazz.type)
    }
    def String getEPackageClassName (EClassifier eClassifier) {
        // remove the need to register Ecore Genmodel in a standalone workflow
        // although this usually is not a problem, we had some on CI for the examples project
        if (eClassifier.EPackage==EcorePackage::eINSTANCE)
            "org.eclipse.emf.ecore.EcorePackage"
        else
            genModelHelper.getEPackageClassifierName(eClassifier)
    }
    def String getEFactoryInterfaceName (EClass eClass) {
        if (eClass.EPackage==EcorePackage::eINSTANCE)
            "org.eclipse.emf.ecore.EcoreFactory"
        else
            genModelHelper.getEFactoryInterfaceName(eClass)
    }
    def String getEFactoryInterfaceName (MetaClass clazz) {
        this.getEFactoryInterfaceName(clazz.type)
    }
    def String getEFactoryInterfaceName (EDataType dataType) {
        if (dataType.EPackage==EcorePackage::eINSTANCE)
            "org.eclipse.emf.ecore.EcoreFactory"
        else
            genModelHelper.getEFactoryInterfaceName(dataType)
    }
    def String getLiteralConstant (EClass eClass) {
        genModelHelper.getEPackageClassName(eClass).shortName+".Literals."+genModelHelper.getLiteralConstant(eClass)
    }
    def String getLiteralConstant (MetaReference reference) {
        reference.target.literalConstant
    }
    def String getLiteralConstant (EReference eReference) {
        genModelHelper.getEPackageClassName(eReference.EContainingClass).shortName+".Literals."+genModelHelper.getLiteralConstant(eReference)
    }
    def String getLiteralConstant (MetaClass clazz) {
        getLiteralConstant(clazz.type)
    }
    //---------------------------------------------------------------------------------------------
    // Other names for MetaClass
    //---------------------------------------------------------------------------------------------
    def String getDiagramName (MetaClass clazz) {
        clazz.diagram.name
    }
    //---------------------------------------------------------------------------------------------
    // Other names
    //---------------------------------------------------------------------------------------------
    def getActivatorClassName (Diagram diagram) {
        main_package() + "." + getActivatorSimpleClassName(diagram)
    }
    def getActivatorSimpleClassName (Diagram diagram) {
        "Activator"
    }
    def getExtensionFactoryClassName (Diagram diagram) {
        main_package() + ".internal." + getExtensionFactorySimpleClassName(diagram)
    }
    def getExtensionFactorySimpleClassName (Diagram diagram) {
        "ExecutableExtensionFactory"
    }
    def String getImageIdentifier (Diagram diagram, String imagePath) {
        if (imagePath==null) return null
        // strip file extension and replace all non-word characters by underscore
        return diagram.name.toUpperCase+"__"+imagePath.substring(0, imagePath.lastIndexOf('.')).replaceAll("\\W","_").toUpperCase
    }
    def String getImageBaseName (String imagePath) {
        if (imagePath==null) return null
        // strip file extension and replace all non-word characters by underscore
        return imagePath.substring(0, imagePath.lastIndexOf('.')).replaceAll("\\W","_").toLowerCase
    }
    
    def String getModelFileExtension (EObject ctx) {
        return ProjectProperties::getModelFileExtension();
    }
    def String shortName (JvmTypeReference typeRef) {
        return importUtil.shortName(typeRef)
    }
    def String shortName (String qualifiedName) {
        return importUtil.shortName(qualifiedName)
    }
    def String shortName (Class<?> clazz) {
        return importUtil.shortName(clazz)
    }
    
    // And complex queries
    def Iterable<ShapeCompartmentAssignment> getReferencesTo (MetaClass metaClass ) {
        var referringShapes = metaClass.diagram.metaClasses.map(cls | cls.representedBy).filter(typeof(ShapeFromDsl))
        var references = referringShapes.map(s | s.referencesList).flatten   				
        var result = references.filter(r | (metaClass.type == r.reference.EReferenceType) || metaClass.type.EAllSuperTypes.contains(r.reference.EReferenceType))
        result
    }
    def Iterable<ShapeFromDsl> xgetReferringShapes (MetaClass metaClass ) {
        metaClass.diagram.metaClasses.map(cls | cls.representedBy).filter(typeof(ShapeFromDsl))
    }
}

