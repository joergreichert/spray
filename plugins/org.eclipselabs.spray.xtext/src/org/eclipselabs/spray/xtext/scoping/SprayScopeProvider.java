/*
 * generated by Xtext
 */
package org.eclipselabs.spray.xtext.scoping;

import static org.eclipselabs.spray.mm.spray.SprayPackage.Literals.COLOR_CONSTANT_REF__FIELD;
import static org.eclipselabs.spray.mm.spray.SprayPackage.Literals.CONNECTION_IN_SPRAY;
import static org.eclipselabs.spray.mm.spray.SprayPackage.Literals.CONNECTION_IN_SPRAY__FROM;
import static org.eclipselabs.spray.mm.spray.SprayPackage.Literals.CONNECTION_IN_SPRAY__TO;
import static org.eclipselabs.spray.mm.spray.SprayPackage.Literals.CREATE_BEHAVIOR;
import static org.eclipselabs.spray.mm.spray.SprayPackage.Literals.CREATE_BEHAVIOR__ASK_FOR;
import static org.eclipselabs.spray.mm.spray.SprayPackage.Literals.CREATE_BEHAVIOR__CONTAINMENT_REFERENCE;
import static org.eclipselabs.spray.mm.spray.SprayPackage.Literals.DIAGRAM__MODEL_TYPE;
import static org.eclipselabs.spray.mm.spray.SprayPackage.Literals.META_CLASS;
import static org.eclipselabs.spray.mm.spray.SprayPackage.Literals.META_CLASS__TYPE;
import static org.eclipselabs.spray.mm.spray.SprayPackage.Literals.META_REFERENCE;
import static org.eclipselabs.spray.mm.spray.SprayPackage.Literals.META_REFERENCE__LABEL_PROPERTY;
import static org.eclipselabs.spray.mm.spray.SprayPackage.Literals.META_REFERENCE__TARGET;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.FilteringScope;
import org.eclipse.xtext.scoping.impl.MapBasedScope;
import org.eclipse.xtext.scoping.impl.SingletonScope;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.scoping.LocalVariableScopeContext;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipselabs.spray.mm.spray.ColorConstantRef;
import org.eclipselabs.spray.mm.spray.ConnectionInSpray;
import org.eclipselabs.spray.mm.spray.CreateBehavior;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.SprayPackage;
import org.eclipselabs.spray.xtext.api.IColorConstantTypeProvider;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * This class contains custom scoping description.
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on
 * how and when to use it
 */
@SuppressWarnings("restriction")
public class SprayScopeProvider extends XbaseScopeProvider {
    @Inject
    private IJvmModelAssociations      associations;
    @Inject
    private IJvmTypeProvider.Factory   typeProviderFactory;
    @Inject(optional = true)
    private IColorConstantTypeProvider colorConstantTypeProvider;

    private IResourceDescriptions      dscriptions = null;

    public void listVisibleResources() {
        ResourceDescriptionsProvider serviceProvider = AppInjectedAccess.getit(); // AppInjectedAccess.resourceDescriptionsProvider;
        dscriptions = serviceProvider.createResourceDescriptions();
        for (IResourceDescription rd : dscriptions.getAllResourceDescriptions()) {
            System.out.println("Resource: " + rd.getURI());
            for (IEObjectDescription od : rd.getExportedObjects()) {
                if (od.getEClass().getName().startsWith("Shape")) {
                    System.out.println("Shape scope name : [" + od.getName() + "] qualified [" + od.getQualifiedName() + "]");
                } else {
                    //                    System.out.println("Any qualified name : " + od.getName());
                }
            }
        }
    }

    @Override
    public IScope getScope(EObject context, EReference reference) {
        //        System.out.println("getScope: " + context.toString() + " ref " + reference.toString());
        //        if (reference == META_CLASS__REPRESENTED_BY_SHAPE) {
        //            listVisibleResources();
        //            return super.getScope(context, reference);
        //        }
        //
        if (reference == DIAGRAM__MODEL_TYPE) {
            return scope_Diagram_ModelType(context, reference);
        } else if (reference == META_CLASS__TYPE) {
            return scope_MetaClass_Type(context, reference);
        } else if (reference == CREATE_BEHAVIOR__CONTAINMENT_REFERENCE) {
            return scope_CreateBehavior_ContainmentReference(context, reference);
        } else if (context.eClass() == CONNECTION_IN_SPRAY && reference == CONNECTION_IN_SPRAY__FROM) {
            final MetaClass metaClass = EcoreUtil2.getContainerOfType(context, MetaClass.class);
            final IScope result = MapBasedScope.createScope(IScope.NULLSCOPE, Scopes.scopedElementsFor(metaClass.getType().getEAllReferences()));
            return result;
        } else if (context.eClass() == CONNECTION_IN_SPRAY && reference == CONNECTION_IN_SPRAY__TO) {
            final ConnectionInSpray connection = (ConnectionInSpray) context;
            final MetaClass metaClass = EcoreUtil2.getContainerOfType(context, MetaClass.class);
            // filter 'from' from the possible references
            Iterable<EReference> targetReferences = Iterables.filter(metaClass.getType().getEAllReferences(), new Predicate<EReference>() {
                @Override
                public boolean apply(EReference input) {
                    return input != connection.getFrom();
                }
            });
            final IScope result = MapBasedScope.createScope(IScope.NULLSCOPE, Scopes.scopedElementsFor(targetReferences));
            return result;
        } else if (context.eClass() == META_REFERENCE && reference == META_REFERENCE__TARGET) {
            if (context.eContainer().eClass() == META_CLASS) {
                // non-containment references
                final MetaClass metaClass = EcoreUtil2.getContainerOfType(context, MetaClass.class);
                Iterable<EReference> nonContainmentReferences = Iterables.filter(metaClass.getType().getEAllReferences(), new Predicate<EReference>() {
                    @Override
                    public boolean apply(EReference input) {
                        return !input.isContainment();
                    }
                });
                final IScope result = MapBasedScope.createScope(IScope.NULLSCOPE, Scopes.scopedElementsFor(nonContainmentReferences));
                return result;
            } else {
                final MetaClass metaClass = EcoreUtil2.getContainerOfType(context, MetaClass.class);
                final IScope result = MapBasedScope.createScope(IScope.NULLSCOPE, Scopes.scopedElementsFor(metaClass.getType().getEAllContainments()));
                return result;
            }
        } else if (context.eClass() == META_REFERENCE && reference == META_REFERENCE__LABEL_PROPERTY) {
            MetaReference metaRef = (MetaReference) context;
            EReference ref = metaRef.getTarget();
            if (ref.eIsProxy()) {
                ref = (EReference) EcoreUtil.resolve(ref, context);
                if (ref.eIsProxy()) {
                    // still a proxy?
                    return IScope.NULLSCOPE;
                }
            }
            final IScope result = MapBasedScope.createScope(IScope.NULLSCOPE, Scopes.scopedElementsFor(metaRef.getTarget().getEReferenceType().getEAllAttributes()));
            return result;
        } else if (context.eClass() == CREATE_BEHAVIOR && reference == CREATE_BEHAVIOR__ASK_FOR) {
            CreateBehavior createBehavior = (CreateBehavior) context;
            EReference ref = createBehavior.getContainmentReference();
            if (ref.eIsProxy()) {
                ref = (EReference) EcoreUtil.resolve(ref, context);
                if (ref.eIsProxy()) {
                    // still a proxy?
                    return IScope.NULLSCOPE;
                }
            }
            Iterable<EAttribute> simpleAttributes = Iterables.filter(createBehavior.getContainmentReference().getEReferenceType().getEAllAttributes(), new Predicate<EAttribute>() {
                @Override
                public boolean apply(EAttribute input) {
                    return input.getEType() instanceof EDataType;
                }
            });
            final IScope result = MapBasedScope.createScope(IScope.NULLSCOPE, Scopes.scopedElementsFor(simpleAttributes));
            return result;
        } else if (reference == TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE) {
            ColorConstantRef colorConstant = EcoreUtil2.getContainerOfType(context, ColorConstantRef.class);
            if (colorConstant != null) {
                return getColorConstantTypeScope(colorConstant);
            }
        } else if (reference == COLOR_CONSTANT_REF__FIELD) {
            return getColorConstantFieldScope(context);
        }

        IScope scope = super.getScope(context, reference);
        //        System.out.print("scope returned: ");
        //        for (IEObjectDescription od : scope.getAllElements()) {
        //            System.out.print(od.getName() + ", ");
        //        }
        //        System.out.println("!");
        return scope;
    }

    protected IScope scope_CreateBehavior_ContainmentReference(EObject context, EReference reference) {
        final MetaClass mc = EcoreUtil2.getContainerOfType(context, MetaClass.class);
        if (mc == null) {
            return IScope.NULLSCOPE;
        }
        Diagram diagram = mc.getDiagram();
        final EClass diagramModelType = diagram.getModelType();
        Predicate<EReference> filter = new Predicate<EReference>() {
            @Override
            public boolean apply(EReference input) {
                boolean superType = false;
                if (mc != null && mc.getType() != null) {
                    superType = input.getEReferenceType().isSuperTypeOf(mc.getType());
                }
                return superType;
            }
        };
        // get all containments of EClass contained in this package
        List<EReference> containmentReferences = new ArrayList<EReference>();
        EClass eClassInAllScope = null;
        if (diagramModelType.getEPackage() != null) {
            for (EClassifier classifier : diagramModelType.getEPackage().getEClassifiers()) {
                if (classifier instanceof EClass) {
                    eClassInAllScope = (EClass) classifier;
                    containmentReferences.addAll(eClassInAllScope.getEAllContainments());
                }
            }
        }
        return Scopes.scopeFor(Iterables.filter(containmentReferences, filter));
    }

    protected IScope scope_MetaClass_Type(EObject context, EReference reference) {
        // TODO Restrict to containment types
        Diagram diagram = EcoreUtil2.getContainerOfType(context, Diagram.class);
        // all eClasses that are direct containments of context's diagram model type
        final EClass diagramModelType = diagram.getModelType();

        //        Function<EReference, EClass> referenceToEClass = new Function<EReference, EClass>() {
        //            @Override
        //            public EClass apply(EReference from) {
        //                return from.getEReferenceType();
        //            }
        //        };
        //        Iterable<EClass> containmentTypes = Iterables.transform(diagramModelType.getEAllContainments(), referenceToEClass);
        // include all non abstract sub classes of the contained types contained in the all scope

        List<EClass> containedTypes = new ArrayList<EClass>();
        EClass eClassInAllScope = null;
        //        EClass containedType = null;
        if (diagramModelType.getEPackage() != null) {
            for (EClassifier classifier : diagramModelType.getEPackage().getEClassifiers()) {
                if (classifier instanceof EClass) {
                    eClassInAllScope = (EClass) classifier;
                    //                for (Iterator<EClass> containmentIterator = containmentTypes.iterator(); containmentIterator.hasNext();) {
                    //                    containedType = containmentIterator.next();
                    if (!eClassInAllScope.isAbstract() && !eClassInAllScope.equals(diagramModelType)
                    //                            && containedType.isSuperTypeOf(eClassInAllScope)
                    ) {
                        containedTypes.add(eClassInAllScope);
                    }
                    //                }
                }
            }
        }
        return Scopes.scopeFor(containedTypes);
    }

    protected IScope scope_Diagram_ModelType(EObject context, EReference reference) {
        // filter out types with URL schema qualified names
        final IScope scope = delegateGetScope(context, reference);
        final Predicate<IEObjectDescription> filter = new Predicate<IEObjectDescription>() {
            @Override
            public boolean apply(IEObjectDescription input) {
                return !input.getQualifiedName().toString().startsWith("http://");
            }
        };
        return new FilteringScope(scope, filter);
    }

    protected IScope getColorConstantTypeScope(ColorConstantRef colorConstantRef) {
        IScope typesScope = delegateGetScope(colorConstantRef, TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE);

        Predicate<IEObjectDescription> colorConstantsFilter = new Predicate<IEObjectDescription>() {
            @Override
            public boolean apply(IEObjectDescription input) {
                if (input.getEObjectOrProxy() instanceof JvmGenericType) {
                    return isColorConstant((JvmGenericType) input.getEObjectOrProxy());
                } else {
                    return false;
                }
            }

            private boolean isColorConstant(JvmGenericType type) {
                if ("org.eclipse.graphiti.util.IColorConstant".equals(type.getIdentifier())) {
                    return true;
                }
                for (JvmTypeReference itfRef : type.getExtendedInterfaces()) {
                    if (isColorConstant(itfRef)) {
                        return true;
                    }
                }
                for (JvmTypeReference superTypeRef : type.getSuperTypes()) {
                    if (isColorConstant(superTypeRef)) {
                        return true;
                    }
                }
                return false;
            }

            private boolean isColorConstant(JvmTypeReference typeRef) {
                if ("org.eclipse.graphiti.util.IColorConstant".equals(typeRef.getIdentifier())) {
                    return true;
                }
                JvmGenericType type = (JvmGenericType) typeRef.getType();
                for (JvmTypeReference itfRef : type.getExtendedInterfaces()) {
                    if ("org.eclipse.graphiti.util.IColorConstant".equals(itfRef.getIdentifier())) {
                        return true;
                    }
                }
                for (JvmTypeReference superTypeRef : type.getSuperTypes()) {
                    if (isColorConstant(superTypeRef)) {
                        return true;
                    }
                }
                return false;
            }
        };

        IScope result = new FilteringScope(typesScope, colorConstantsFilter);
        return result;
    }

    protected IScope getColorConstantFieldScope(EObject context) {
        if (context instanceof ColorConstantRef && ((ColorConstantRef) context).getType() != null) {
            JvmTypeReference typeRef = ((ColorConstantRef) context).getType();
            if (!(typeRef.getType() instanceof JvmGenericType))
                return IScope.NULLSCOPE;

            JvmGenericType type = (JvmGenericType) typeRef.getType();
            Iterable<JvmField> fields = Iterables.filter(type.getMembers(), JvmField.class);
            // Filter out all fields that are not of type IColorConstant

            // fields = Iterables.filter(fields, colorConstantsFilter);
            Function<JvmField, IEObjectDescription> toObjDesc = new Function<JvmField, IEObjectDescription>() {
                @Override
                public IEObjectDescription apply(JvmField from) {
                    return EObjectDescription.create(from.getSimpleName(), from);
                }
            };
            final IScope scope = MapBasedScope.createScope(IScope.NULLSCOPE, Iterables.transform(fields, toObjDesc));
            return scope;
        } else {
            if (colorConstantTypeProvider == null) {
                // colorConstantTypeProvider not set => no implicit colors
                return IScope.NULLSCOPE;
            }
            // implicit color constants
            IJvmTypeProvider typeProvider = typeProviderFactory.findOrCreateTypeProvider(context.eResource().getResourceSet());
            // get the Jvm Type that represents a color (Graphiti: IColorConstant)
            JvmDeclaredType colorJvmType = (JvmDeclaredType) typeProvider.findTypeByName(colorConstantTypeProvider.getColorType().getName());
            if (colorJvmType == null) {
                return null;
            }
            final JvmDeclaredType colorJvmType2 = colorJvmType;
            // this filter selects members that have the required type 'colorJvmType'
            Predicate<JvmMember> memberFilter = new Predicate<JvmMember>() {
                @Override
                public boolean apply(JvmMember input) {
                    if (input instanceof JvmField) {
                        return ((JvmField) input).getType().getType() == colorJvmType2;
                    } else if (input instanceof JvmOperation) {
                        return ((JvmOperation) input).getReturnType().getType() == colorJvmType2;
                    } else {
                        return false;
                    }
                }
            };
            // Function to create IEObjectDescriptions for JvmMembers
            Function<JvmMember, QualifiedName> trafo = new Function<JvmMember, QualifiedName>() {
                @Override
                public QualifiedName apply(JvmMember from) {
                    return QualifiedName.create(from.getSimpleName().toLowerCase());
                }
            };
            // for each class, create a scope with the JvmFields of the class
            IScope scope = IScope.NULLSCOPE;
            for (Class<?> clazz : colorConstantTypeProvider.getColorConstantTypes()) {
                JvmType t = typeProvider.findTypeByName(clazz.getName());
                if (t != null && t instanceof JvmDeclaredType) {
                    scope = Scopes.scopeFor(Iterables.filter(((JvmDeclaredType) t).getMembers(), memberFilter), trafo, scope);
                }
            }
            return scope;
        }
    }

    /**
     * Create the local variable scope for expressions.
     * The method will bind a variable 'this' which refers to the JvmType of the EClass associated with the current MetaClass.
     */
    @Override
    protected IScope createLocalVarScope(IScope parentScope, LocalVariableScopeContext scopeContext) {
        // bind the EClass of the context's MetaClass, only if the context is for a Spray DSL element.
        // all others context objects (like expressions) should be handled by default behavior
        if (scopeContext.getContext().eClass().getEPackage() == SprayPackage.eINSTANCE) {
            // Look up the containment hierarchy of the current object to find the MetaClass
            MetaClass mc = EcoreUtil2.getContainerOfType(scopeContext.getContext(), MetaClass.class);
            if (mc != null) {
                // get the JvmType for MetaClass. It is inferred by the SprayJvmModelInferrer
                JvmGenericType jvmType = (JvmGenericType) getJvmType(mc);
                if (jvmType == null || jvmType.getMembers().isEmpty()) {
                    // should not happen!
                    return IScope.NULLSCOPE;
                }
                // the JvmType has a field named 'ecoreClass'
                JvmField eClassField = (JvmField) jvmType.getMembers().get(0);
                Assert.isTrue(eClassField.getSimpleName().equals("ecoreClass"));
                // get the JvmType of the associated EClass
                JvmType jvmTypeOfEcoreClass = eClassField.getType().getType();
                // bind the EClass' JvmType as variable 'this'
                IScope result = new SingletonScope(EObjectDescription.create(XbaseScopeProvider.THIS, jvmTypeOfEcoreClass), super.createLocalVarScope(parentScope, scopeContext));
                return result;
            }
        }
        return super.createLocalVarScope(parentScope, scopeContext);
    }

    protected JvmType getJvmType(EObject context) {
        Iterable<JvmType> jvmTypes = Iterables.filter(associations.getJvmElements(context), JvmType.class);
        Iterator<JvmType> it = jvmTypes.iterator();
        JvmType result = it.hasNext() ? it.next() : null;
        return result;
    }

}
