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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaReferenceExtensions;
import org.eclipselabs.spray.mm.spray.ConnectionInSpray;
import org.eclipselabs.spray.mm.spray.ConnectionReference;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.SprayStyleRef;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class AddReferenceAsConnectionFeature extends FileGenerator<MetaReference> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  @Inject
  @Extension
  private MetaReferenceExtensions _metaReferenceExtensions;
  
  private SprayStyleRef styleRef = null;
  
  public SprayStyleRef setAttributes(final SprayStyleRef ssr) {
    return this.styleRef = ssr;
  }
  
  @Override
  public CharSequence generateBaseFile(final MetaReference modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    return this.mainFile(modelElement, _baseClassName);
  }
  
  @Override
  public CharSequence generateExtensionFile(final MetaReference modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    return this.mainExtensionPointFile(modelElement, _className);
  }
  
  public CharSequence mainExtensionPointFile(final MetaReference metaReference, final String className) {
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
    _builder.append("(final IFeatureProvider fp) {");
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
  
  public CharSequence mainFile(final MetaReference reference, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IAddConnectionContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IAddContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.AnchorContainer;");
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
    {
      ConnectionInSpray _representedBy = reference.getRepresentedBy();
      ConnectionReference _connection = _representedBy.getConnection();
      boolean _notEquals = (!Objects.equal(_connection, null));
      if (_notEquals) {
        _builder.append("import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;");
        _builder.newLine();
        _builder.append("import org.eclipselabs.spray.runtime.graphiti.shape.ISprayConnection;");
        _builder.newLine();
        _builder.append("import ");
        ConnectionInSpray _representedBy_1 = reference.getRepresentedBy();
        ConnectionReference _connection_1 = _representedBy_1.getConnection();
        String _qualifiedName = this._namingExtensions.qualifiedName(_connection_1);
        _builder.append(_qualifiedName, "");
        _builder.append("Connection;");
        _builder.newLineIfNotEmpty();
      }
    }
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
    CharSequence _generate_additionalFields = this.generate_additionalFields(reference);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
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
    Diagram _diagram = this._metaReferenceExtensions.getDiagram(reference);
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
    CharSequence _generate_canAdd = this.generate_canAdd(reference);
    _builder.append(_generate_canAdd, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_add = this.generate_add(reference);
    _builder.append(_generate_add, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_removeExisting = this.generate_removeExisting(reference);
    _builder.append(_generate_removeExisting, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalMethods = this.generate_additionalMethods(reference);
    _builder.append(_generate_additionalMethods, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_add(final MetaReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    final EReference target = reference.getTarget();
    _builder.newLineIfNotEmpty();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public PictogramElement add(final IAddContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final IAddConnectionContext addConContext = (IAddConnectionContext) context;");
    _builder.newLine();
    _builder.append("    ");
    MetaClass _metaClass = reference.getMetaClass();
    EClass _type = _metaClass.getType();
    String _itfName = this._namingExtensions.getItfName(_type);
    _builder.append(_itfName, "    ");
    _builder.append(" addedDomainObject = (");
    MetaClass _metaClass_1 = reference.getMetaClass();
    String _itfName_1 = this._namingExtensions.getItfName(_metaClass_1);
    _builder.append(_itfName_1, "    ");
    _builder.append(") context.getNewObject();");
    _builder.newLineIfNotEmpty();
    {
      int _upperBound = target.getUpperBound();
      boolean _equals = (_upperBound == 1);
      if (_equals) {
        _builder.append("    ");
        _builder.append("removeExisting(context);");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    {
      ConnectionInSpray _representedBy = reference.getRepresentedBy();
      ConnectionReference _connection = _representedBy.getConnection();
      boolean _equals_1 = Objects.equal(_connection, null);
      if (_equals_1) {
        _builder.append("    ");
        _builder.append("// CONNECTION WITH POLYLINE");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("final Connection connection = peCreateService.createFreeFormConnection(getDiagram());");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("connection.setStart(addConContext.getSourceAnchor());");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("connection.setEnd(addConContext.getTargetAnchor());");
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("// TRY");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("final AnchorContainer parent = connection.getStart().getParent();");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("final EObject start = (EObject) getBusinessObjectForPictogramElement(parent);");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("final AnchorContainer child = connection.getEnd().getParent();");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("final EObject end = (EObject) getBusinessObjectForPictogramElement(child);");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("//END TRY");
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("final Polyline polyline = gaService.createPolyline(connection);");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("polyline.setLineWidth(1);");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("decorateConnection (addConContext, connection);");
        _builder.newLine();
      } else {
        {
          MetaClass _metaClass_2 = reference.getMetaClass();
          SprayStyleRef _style = _metaClass_2.getStyle();
          boolean _notEquals = (!Objects.equal(_style, null));
          if (_notEquals) {
            _builder.append("    ");
            _builder.append("final ISprayStyle style = new ");
            MetaClass _metaClass_3 = reference.getMetaClass();
            SprayStyleRef _style_1 = _metaClass_3.getStyle();
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
        _builder.append("final ISprayConnection iSprayConnection = new ");
        ConnectionInSpray _representedBy_1 = reference.getRepresentedBy();
        ConnectionReference _connection_1 = _representedBy_1.getConnection();
        String _simpleName = this._namingExtensions.simpleName(_connection_1);
        _builder.append(_simpleName, "    ");
        _builder.append("Connection(getFeatureProvider());");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("final Connection connection = (Connection) iSprayConnection.getConnection(getDiagram(), style, addConContext.getSourceAnchor(), addConContext.getTargetAnchor());");
        _builder.newLine();
      }
    }
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
    _builder.append("peService.setPropertyValue(connection, PROPERTY_MODEL_TYPE, \"");
    MetaClass _metaClass_4 = reference.getMetaClass();
    EClass _type_1 = _metaClass_4.getType();
    String _name = _type_1.getName();
    _builder.append(_name, "    ");
    _builder.append(".");
    String _name_1 = target.getName();
    _builder.append(_name_1, "    ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("peService.setPropertyValue(connection, PROPERTY_REFERENCE, (String)context.getProperty(PROPERTY_REFERENCE));");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("peService.setPropertyValue(connection, PROPERTY_TARGETOBJECT, (String)context.getProperty(PROPERTY_TARGETOBJECT));");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("link(connection, addedDomainObject);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("for(ConnectionDecorator conDecorator : connection.getConnectionDecorators()) {");
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
    _builder.append("    ");
    _builder.append("return connection;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_canAdd(final MetaReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean canAdd(final IAddContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// return true if given business object is an ");
    MetaClass _metaClass = reference.getMetaClass();
    EClass _type = _metaClass.getType();
    String _name = _type.getName();
    _builder.append(_name, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("// note, that the context must be an instance of IAddConnectionContext");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (context instanceof IAddConnectionContext");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("&& context.getNewObject() instanceof ");
    MetaClass _metaClass_1 = reference.getMetaClass();
    String _itfName = this._namingExtensions.getItfName(_metaClass_1);
    _builder.append(_itfName, "        ");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_removeExisting(final MetaReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("protected void removeExisting(final IAddContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final IAddConnectionContext addConContext = (IAddConnectionContext) context;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final ");
    MetaClass _metaClass = reference.getMetaClass();
    String _itfName = this._namingExtensions.getItfName(_metaClass);
    _builder.append(_itfName, "    ");
    _builder.append(" addedDomainObject = (");
    MetaClass _metaClass_1 = reference.getMetaClass();
    String _itfName_1 = this._namingExtensions.getItfName(_metaClass_1);
    _builder.append(_itfName_1, "    ");
    _builder.append(") context.getNewObject();");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("final Object[] pictogramElements = peService.getLinkedPictogramElements(new EObject[] { addedDomainObject }, getDiagram());");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("for (final Object pict : pictogramElements) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if( pict instanceof PictogramElement){");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("final PictogramElement p = (PictogramElement)pict;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if( \"");
    EReference _target = reference.getTarget();
    EClassifier _eType = _target.getEType();
    String _name = _eType.getName();
    _builder.append(_name, "            ");
    _builder.append("\".equals(peService.getPropertyValue(p, PROPERTY_REFERENCE))){");
    _builder.newLineIfNotEmpty();
    _builder.append("                ");
    _builder.append("peService.deletePictogramElement(p) ;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("setDoneChanges(true);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_createArrow(final MetaReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    _builder.append("protected Polyline createArrow(final GraphicsAlgorithmContainer gaContainer) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final Polyline polyline = gaCreateService.createPolyline(gaContainer, new int[] { -15, 10, 0, 0, -15, -10 });");
    _builder.newLine();
    _builder.append("//        polyline.setStyle(StyleUtil.getStyleForEClass(getDiagram()));");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("polyline.setLineWidth(1);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return polyline;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
