package org.eclipselabs.spray.generator.graphiti.util;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.compiler.IAppendable;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.FakeTreeAppendable;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

@SuppressWarnings("restriction")
public class SprayCompiler extends XbaseCompiler {
    @Inject
    private ITypeProvider    typeProvider;

    @Inject
    private XtextResourceSet resourceSet;

    private String           metaClassVariable;

    public String compile(XExpression value, ImportManager importManager) {
        ITreeAppendable appendable = new FakeTreeAppendable(importManager);
        IAppendable result = compile(value, appendable, typeProvider.getExpectedType(value));
        return result.toString();
    }

    public String compileForPropertyAssignement(XExpression expression, String valueName, String metaClassVariable) {
        setMetaClassVariable(metaClassVariable);
        ITreeAppendable appendable = new FakeTreeAppendable(new ImportManager(false));
        JvmTypeReference type = typeProvider.getExpectedType(expression);
        if (type != null) {
            try {
                IAppendable result = compile(expression, appendable, type);
                return result.toString();
            } catch (Exception e) {
                e.printStackTrace();
                return "/* could not compile " + print(expression) + " with type " + type + " because of " + e.getCause() + " */";
            }
        } else {
            return "/* could not calculate type for " + expression + " */";
        }
    }

    private String print(XExpression exp) {
        if (exp instanceof XBinaryOperation) {
            XBinaryOperation binExp = (XBinaryOperation) exp;
            return "(" + print(binExp.getLeftOperand()) + ") " + binExp.getConcreteSyntaxFeatureName() + " (" + print(binExp.getRightOperand()) + ")";
        } else {
            return exp.toString();
        }

    }

    public String getReturnTypeForPropertyAssignment(JvmFormalParameter key) {
        if (key != null && key.getParameterType() != null) {
            return key.getParameterType().getQualifiedName();
        }
        return "String";
    }

    @Override
    protected boolean isVariableDeclarationRequired(XExpression expr, ITreeAppendable b) {
        JvmIdentifiableElement feature = null;
        if (expr instanceof XAbstractFeatureCall && ((feature = ((XAbstractFeatureCall) expr).getFeature()) instanceof JvmGenericType || resolve((XAbstractFeatureCall) expr, feature))) {
            return false;
        }
        return super.isVariableDeclarationRequired(expr, b);
    }

    private boolean resolve(XAbstractFeatureCall expr, JvmIdentifiableElement feature) {
        if (feature.eIsProxy()) {
            EObject resolved = EcoreUtil.resolve(feature, resourceSet);
            if (resolved instanceof JvmIdentifiableElement) {
                feature = (JvmIdentifiableElement) resolved;
            }
        }
        return feature.eIsProxy();
    }

    @Override
    protected String getVarName(Object ex, ITreeAppendable appendable) {
        if (ex instanceof JvmGenericType) {
            return metaClassVariable != null ? metaClassVariable : "this";
        }
        return super.getVarName(ex, appendable);
    }

    @Override
    protected String getReferenceName(XExpression expr, ITreeAppendable b) {
        if (expr instanceof XFeatureCall) {
            if (((XFeatureCall) expr).getFeature() instanceof JvmGenericType) {
                return metaClassVariable != null ? metaClassVariable : "this";
            }
        }
        return super.getReferenceName(expr, b);
    }

    public String getMetaClassVariable() {
        return metaClassVariable;
    }

    public void setMetaClassVariable(String metaClassVariable) {
        this.metaClassVariable = metaClassVariable;
    }

}
