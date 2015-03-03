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
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class AddConnectionFeature extends FileGenerator<MetaClass> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
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
    _builder.append("//  /**");
    _builder.newLine();
    _builder.append("//   * {@inheritDoc}");
    _builder.newLine();
    _builder.append("//   */");
    _builder.newLine();
    _builder.append("//  @Override");
    _builder.newLine();
    _builder.append("//  protected GraphicsAlgorithm createConnectionStartDecorator (final IAddConnectionContext context,");
    _builder.newLine();
    _builder.append("//          final Connection connection) {");
    _builder.newLine();
    _builder.append("//      final ConnectionDecorator cd = peCreateService.createConnectionDecorator(");
    _builder.newLine();
    _builder.append("//              connection, /* active */false, /* location */0.0, /* isRelative */");
    _builder.newLine();
    _builder.append("//              true);");
    _builder.newLine();
    _builder.append("//      final Polyline polyline = gaService.createPolyline(cd, new int[] {");
    _builder.newLine();
    _builder.append("//              -15, 10, 0, 0, -15, -10 });");
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.append("//      polyline.setForeground(manageColor(IColorConstant.BLACK));");
    _builder.newLine();
    _builder.append("//      polyline.setLineWidth(1);");
    _builder.newLine();
    _builder.append("//      ");
    _builder.newLine();
    _builder.append("//      return polyline;");
    _builder.newLine();
    _builder.append("//      return null;");
    _builder.newLine();
    _builder.append("//  }");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//  /**");
    _builder.newLine();
    _builder.append("//   * {@inheritDoc}");
    _builder.newLine();
    _builder.append("//   */");
    _builder.newLine();
    _builder.append("//  @Override");
    _builder.newLine();
    _builder.append("//  protected GraphicsAlgorithm createConnectionEndDecorator (final IAddConnectionContext context,");
    _builder.newLine();
    _builder.append("//          Connection connection) {");
    _builder.newLine();
    _builder.append("//      final ConnectionDecorator cd = peCreateService.createConnectionDecorator(");
    _builder.newLine();
    _builder.append("//              connection, /* active */false, /* location */1.0, /* isRelative */");
    _builder.newLine();
    _builder.append("//              true);");
    _builder.newLine();
    _builder.append("//      final Polygon polygon = gaService.createPolygon(cd, new int[] {");
    _builder.newLine();
    _builder.append("//              -12, 8, 0, 0, -12, -8, -12, 8 });");
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.append("//      polygon.setForeground(manageColor(IColorConstant.BLACK));");
    _builder.newLine();
    _builder.append("//      polygon.setBackground(manageColor(IColorConstant.WHITE));");
    _builder.newLine();
    _builder.append("//      polygon.setFilled(Boolean.TRUE);");
    _builder.newLine();
    _builder.append("//      polygon.setLineWidth(1);");
    _builder.newLine();
    _builder.append("//      ");
    _builder.newLine();
    _builder.append("//      return polygon;");
    _builder.newLine();
    _builder.append("//  }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mainFile(final MetaClass metaClass, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _javaInterfaceName = this._namingExtensions.getJavaInterfaceName(metaClass);
    _builder.append(_javaInterfaceName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
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
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.rendering.ConnectionRendering;");
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
    CharSequence _generate_connectionLine = this.generate_connectionLine(metaClass);
    _builder.append(_generate_connectionLine, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
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
    _builder.append("public boolean canAdd(final IAddContext context) {");
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
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public PictogramElement add(final IAddContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final IAddConnectionContext addConContext = (IAddConnectionContext) context;");
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
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final Connection connection = createConnectionLine (addConContext);");
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
    _builder.append("peService.setPropertyValue(connection, PROPERTY_MODEL_TYPE, ");
    String _literalConstant = this._namingExtensions.getLiteralConstant(metaClass);
    _builder.append(_literalConstant, "    ");
    _builder.append(".getName());");
    _builder.newLineIfNotEmpty();
    {
      String _alias = metaClass.getAlias();
      boolean _notEquals = (!Objects.equal(_alias, null));
      if (_notEquals) {
        _builder.append("    ");
        _builder.append("// store alias name");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("peService.setPropertyValue(connection , PROPERTY_ALIAS, \"");
        String _alias_1 = metaClass.getAlias();
        _builder.append(_alias_1, "    ");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("decorateConnection (addConContext, connection);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("link(connection, addedDomainObject);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("setDoneChanges(true);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return connection;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_connectionLine(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("protected Connection createConnectionLine (final IAddConnectionContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// CONNECTION WITH POLYLINE");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final Connection connection = peCreateService.createFreeFormConnection(getDiagram());");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("connection.setStart(context.getSourceAnchor());");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("connection.setEnd(context.getTargetAnchor());");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final Polyline polyline = gaService.createPolyline(connection);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("polyline.setLineWidth(1);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return connection;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
