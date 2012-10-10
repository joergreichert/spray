package org.eclipselabs.spray.generator.graphiti.util;

import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.IAppendable;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipselabs.spray.mm.spray.TextInSpray;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class SprayCompiler extends XbaseCompiler {
    @Inject
    private ITypeProvider typeProvider;

    private String        metaClassVariable;

    public String compile(TextInSpray operation, ImportManager importManager) {
        StringBuilderBasedAppendable appendable = new StringBuilderBasedAppendable(importManager);
        IAppendable result = compile(operation.getValue(), appendable, typeProvider.getExpectedType(operation.getValue()));
        return result.toString();
    }

    public String compileForPropertyAssignement(XExpression expression, String valueName, String metaClassVariable) {
        setMetaClassVariable(metaClassVariable);
        StringBuilderBasedAppendable appendable = new StringBuilderBasedAppendable(new ImportManager(false));
        IAppendable result = compile(expression, appendable, typeProvider.getExpectedType(expression));
        return result.toString();
    }

    public String getReturnTypeForPropertyAssignment(JvmFormalParameter key) {
        if (key != null && key.getParameterType() != null) {
            return key.getParameterType().getQualifiedName();
        }
        return "String";
    }

    @Override
    protected boolean isVariableDeclarationRequired(XExpression expr, IAppendable b) {
        if (expr instanceof XAbstractFeatureCall && ((XAbstractFeatureCall) expr).getFeature() instanceof JvmGenericType) {
            return false;
        }
        return super.isVariableDeclarationRequired(expr, b);
    }

    @Override
    protected String getVarName(Object ex, IAppendable appendable) {
        if (ex instanceof JvmGenericType) {
            return metaClassVariable != null ? metaClassVariable : "this";
        }
        return super.getVarName(ex, appendable);
    }

    public String getMetaClassVariable() {
        return metaClassVariable;
    }

    public void setMetaClassVariable(String metaClassVariable) {
        this.metaClassVariable = metaClassVariable;
    }
}
