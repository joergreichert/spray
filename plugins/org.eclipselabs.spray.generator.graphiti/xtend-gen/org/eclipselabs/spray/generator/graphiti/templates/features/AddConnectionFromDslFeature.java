/**
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 */
package org.eclipselabs.spray.generator.graphiti.templates.features;

import com.google.common.base.Objects;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.SprayCompiler;
import org.eclipselabs.spray.mm.spray.ConnectionInSpray;
import org.eclipselabs.spray.mm.spray.ConnectionReference;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.ShapeInSpray;
import org.eclipselabs.spray.mm.spray.SprayStyleRef;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class AddConnectionFromDslFeature extends FileGenerator<MetaClass> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  @Inject
  @Extension
  private SprayCompiler _sprayCompiler;
  
  private SprayStyleRef styleRef = null;
  
  public SprayStyleRef setAttributes(final MetaClass metaClass, final SprayStyleRef ssr) {
    return this.styleRef = ssr;
  }
  
  @Override
  public CharSequence generateBaseFile(final MetaClass modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    return this.mainFile(modelElement, _baseClassName);
  }
  
  @Override
  public CharSequence generateExtensionFile(final MetaClass modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    return this.mainExtensionPointFile(modelElement, _className);
  }
  
  public CharSequence mainExtensionPointFile(final MetaClass metaClass, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends ");
    _builder.append(className, "");
    _builder.append("Base {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mainFile(final MetaClass metaClass, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    ShapeInSpray _representedBy = metaClass.getRepresentedBy();
    final ConnectionInSpray connection = ((ConnectionInSpray) _representedBy);
    _builder.newLineIfNotEmpty();
    CharSequence _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IAddConnectionContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IAddContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.Text;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Connection;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.Polyline;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IGaService;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddConnectionFeature;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.rendering.ConnectionRendering;");
    _builder.newLine();
    {
      boolean _notEquals = (!Objects.equal(this.styleRef, null));
      if (_notEquals) {
        _builder.append("import ");
        String _qualifiedName = this._namingExtensions.qualifiedName(this.styleRef);
        _builder.append(_qualifiedName, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("import org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle;");
        _builder.newLine();
      }
    }
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.shape.ISprayConnection;");
    _builder.newLine();
    _builder.append("import ");
    ConnectionReference _connection = connection.getConnection();
    String _qualifiedName_1 = this._namingExtensions.qualifiedName(_connection);
    _builder.append(_qualifiedName_1, "");
    _builder.append("Connection;");
    _builder.newLineIfNotEmpty();
    _builder.append("import com.google.common.base.Function;");
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@SuppressWarnings(\"unused\")");
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractAddConnectionFeature {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(metaClass);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(final IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("gaService = ");
    Diagram _diagram = metaClass.getDiagram();
    String _activatorClassName = this._namingExtensions.getActivatorClassName(_diagram);
    String _shortName = this._namingExtensions.shortName(_activatorClassName);
    _builder.append(_shortName, "        ");
    _builder.append(".get(IGaService.class);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generate_canAdd = this.generate_canAdd(metaClass);
    _builder.append(_generate_canAdd, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_add = this.generate_add(metaClass);
    _builder.append(_generate_add, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalMethods = this.generate_additionalMethods(metaClass);
    _builder.append(_generate_additionalMethods, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_canAdd(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("   ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("* {@inheritDoc}");
    _builder.newLine();
    _builder.append("* ");
    _builder.newLine();
    _builder.append("* @return <code>true</code> if given business object is an {@link ");
    String _itfName = this._namingExtensions.getItfName(metaClass);
    _builder.append(_itfName, "");
    _builder.append("} and context is of type {@link IAddConnectionContext}");
    _builder.newLineIfNotEmpty();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public boolean canAdd(IAddContext context) {");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("if (context instanceof IAddConnectionContext");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("&& context.getNewObject() instanceof ");
    String _itfName_1 = this._namingExtensions.getItfName(metaClass);
    _builder.append(_itfName_1, "       ");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("       ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_add(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    ShapeInSpray _representedBy = metaClass.getRepresentedBy();
    final ConnectionInSpray connection = ((ConnectionInSpray) _representedBy);
    _builder.newLineIfNotEmpty();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public PictogramElement add(IAddContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("IAddConnectionContext addConContext = (IAddConnectionContext) context;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// TODO: Domain object");
    _builder.newLine();
    _builder.append("    ");
    String _itfName = this._namingExtensions.getItfName(metaClass);
    _builder.append(_itfName, "    ");
    _builder.append(" addedDomainObject = (");
    String _itfName_1 = this._namingExtensions.getItfName(metaClass);
    _builder.append(_itfName_1, "    ");
    _builder.append(") context.getNewObject();");
    _builder.newLineIfNotEmpty();
    {
      SprayStyleRef _style = metaClass.getStyle();
      boolean _notEquals = (!Objects.equal(_style, null));
      if (_notEquals) {
        _builder.append("    ");
        _builder.append("final ISprayStyle style = new ");
        SprayStyleRef _style_1 = metaClass.getStyle();
        String _qualifiedName = this._namingExtensions.qualifiedName(_style_1);
        _builder.append(_qualifiedName, "    ");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
      } else {
        boolean _notEquals_1 = (!Objects.equal(this.styleRef, null));
        if (_notEquals_1) {
          _builder.append("    ");
          _builder.append("final ISprayStyle style = new ");
          String _qualifiedName_1 = this._namingExtensions.qualifiedName(this.styleRef);
          _builder.append(_qualifiedName_1, "    ");
          _builder.append("();");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("    ");
          _builder.append("final ISprayStyle style = new org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle();");
          _builder.newLine();
        }
      }
    }
    _builder.append("    ");
    _builder.append("ISprayConnection connection = new ");
    ConnectionReference _connection = connection.getConnection();
    String _simpleName = this._namingExtensions.simpleName(_connection);
    _builder.append(_simpleName, "    ");
    _builder.append("Connection(getFeatureProvider());");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("Connection result = (Connection) connection.getConnection(getDiagram(), style, addConContext.getSourceAnchor(), addConContext.getTargetAnchor());");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// render the connections between the same Start- and End-Anchor");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ConnectionRendering.startRendering(addConContext.getSourceAnchor(), addConContext.getTargetAnchor());");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// create link and wire it");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("peService.setPropertyValue(result , PROPERTY_MODEL_TYPE, ");
    String _literalConstant = this._namingExtensions.getLiteralConstant(metaClass);
    _builder.append(_literalConstant, "    ");
    _builder.append(".getName());");
    _builder.newLineIfNotEmpty();
    {
      String _alias = metaClass.getAlias();
      boolean _notEquals_2 = (!Objects.equal(_alias, null));
      if (_notEquals_2) {
        _builder.append("    ");
        _builder.append("// store alias name");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("peService.setPropertyValue(result , PROPERTY_ALIAS, \"");
        String _alias_1 = metaClass.getAlias();
        _builder.append(_alias_1, "    ");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("link(result , addedDomainObject);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("for(ConnectionDecorator conDecorator : result.getConnectionDecorators()) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("link(conDecorator, addedDomainObject);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("setDoneChanges(true);");
    _builder.newLine();
    _builder.append("   \t");
    _builder.append("updatePictogramElement(result);");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return result;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence propertyAssignmentFunction(final XExpression xexp, final String valueName, final String returnType, final String metaClassName, final String metaClassAttribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(returnType, "");
    _builder.append(" ");
    _builder.append(valueName, "");
    _builder.append(" = new Function<");
    _builder.append(metaClassName, "");
    _builder.append(", ");
    _builder.append(returnType, "");
    _builder.append(">() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(returnType, "\t");
    _builder.append(" apply(");
    _builder.append(metaClassName, "\t");
    _builder.append(" modelElement) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _compileForPropertyAssignement = this._sprayCompiler.compileForPropertyAssignement(xexp, "returnedValue", "modelElement");
    _builder.append(_compileForPropertyAssignement, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}.apply(");
    _builder.append(metaClassAttribute, "");
    _builder.append("); ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
