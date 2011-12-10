package org.eclipselabs.spray.generator.graphiti.templates.features;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.LayoutExtensions;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.SprayElementNameProvider;
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions;
import org.eclipselabs.spray.mm.spray.Container;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.Layout;
import org.eclipselabs.spray.mm.spray.Line;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.SprayElement;
import org.eclipselabs.spray.mm.spray.Text;

@SuppressWarnings("all")
public class AddShapeFeature extends FileGenerator {
  @Inject
  private LayoutExtensions _layoutExtensions;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private NamingExtensions _namingExtensions;
  
  @Inject
  private SprayElementNameProvider _sprayElementNameProvider;
  
  @Inject
  private DiagramExtensions _diagramExtensions;
  
  public CharSequence generateBaseFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    CharSequence _mainFile = this.mainFile(((Container) modelElement), _baseClassName);
    return _mainFile;
  }
  
  public CharSequence generateExtensionFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    CharSequence _mainExtensionPointFile = this.mainExtensionPointFile(((Container) modelElement), _className);
    return _mainExtensionPointFile;
  }
  
  public CharSequence mainExtensionPointFile(final Container container, final String className) {
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
  
  public CharSequence mainFile(final Container container, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    String _constainerClass = GeneratorUtil.constainerClass(container);
    String containerType = _constainerClass;
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
    _builder.append("import ");
    MetaClass _represents = container.getRepresents();
    String _javaInterfaceName = this._namingExtensions.getJavaInterfaceName(_represents);
    _builder.append(_javaInterfaceName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IAddContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.Text;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.Polyline;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.Orientation;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ContainerShape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Diagram;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Shape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IGaService;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddFeature;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;");
    _builder.newLine();
    _builder.append("import ");
    String _util_package = GeneratorUtil.util_package();
    _builder.append(_util_package, "");
    _builder.append(".ISprayContainer;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _util_package_1 = GeneratorUtil.util_package();
    _builder.append(_util_package_1, "");
    _builder.append(".");
    _builder.append(containerType, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _util_package_2 = GeneratorUtil.util_package();
    _builder.append(_util_package_2, "");
    _builder.append(".SprayContainerService;");
    _builder.newLineIfNotEmpty();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractAddFeature {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected final static String typeOrAliasName = \"");
    MetaClass _represents_1 = container.getRepresents();
    String _visibleName = this._namingExtensions.getVisibleName(_represents_1);
    _builder.append(_visibleName, "    ");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected Diagram targetDiagram = null;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected ");
    _builder.append(containerType, "    ");
    _builder.append(" container = null;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(container);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("container = new ");
    _builder.append(containerType, "        ");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("gaService = ");
    Diagram _diagram = this._diagramExtensions.getDiagram(container);
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
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public boolean canAdd(IAddContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final EObject newObject = (EObject) context.getNewObject();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (newObject instanceof ");
    MetaClass _represents_2 = container.getRepresents();
    String _name = this._namingExtensions.getName(_represents_2);
    _builder.append(_name, "        ");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("// check if user wants to add to a diagram");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (context.getTargetContainer() instanceof Diagram) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    CharSequence _overrideHeader_1 = this.overrideHeader();
    _builder.append(_overrideHeader_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public PictogramElement add(IAddContext context) {");
    _builder.newLine();
    _builder.append("        ");
    MetaClass _represents_3 = container.getRepresents();
    String _name_1 = this._namingExtensions.getName(_represents_3);
    _builder.append(_name_1, "        ");
    _builder.append(" addedModelElement = (");
    MetaClass _represents_4 = container.getRepresents();
    String _name_2 = this._namingExtensions.getName(_represents_4);
    _builder.append(_name_2, "        ");
    _builder.append(") context.getNewObject();");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("targetDiagram = peService.getDiagramForShape(context.getTargetContainer());");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ContainerShape containerShape = container.createContainer(context, addedModelElement);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ContainerShape textContainer = SprayContainerService.findTextShape(containerShape);");
    _builder.newLine();
    {
      boolean _hasFillColor = this._layoutExtensions.hasFillColor(container);
      if (_hasFillColor) {
        _builder.append("        ");
        _builder.append("textContainer.getGraphicsAlgorithm().setBackground(manageColor(");
        String _fillColor = this._layoutExtensions.fillColor(container);
        _builder.append(_fillColor, "        ");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    _builder.append("link(containerShape, addedModelElement);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("link(textContainer, addedModelElement);");
    _builder.newLine();
    _builder.newLine();
    {
      SprayElement[] _parts = container.getParts();
      for(final SprayElement part : _parts) {
        _builder.append("        ");
        _builder.append("create");
        EClass _eClass = part.eClass();
        String _name_3 = _eClass.getName();
        _builder.append(_name_3, "        ");
        String _shapeName = this._sprayElementNameProvider.getShapeName(part);
        String _firstUpper = StringExtensions.toFirstUpper(_shapeName);
        _builder.append(_firstUpper, "        ");
        _builder.append("(context, addedModelElement, textContainer);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// add a chopbox anchor to the shape");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("peCreateService.createChopboxAnchor(containerShape);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// call the update and layout features");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("updatePictogramElement(containerShape);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("layoutPictogramElement(containerShape);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("setDoneChanges(true);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return containerShape;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    {
      SprayElement[] _parts_1 = container.getParts();
      for(final SprayElement part_1 : _parts_1) {
        _builder.append("    ");
        MetaClass _represents_5 = container.getRepresents();
        CharSequence _createShape = this.createShape(part_1, _represents_5);
        _builder.append(_createShape, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generate_additionalFields_1 = this.generate_additionalFields(container);
    _builder.append(_generate_additionalFields_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _createShape(final SprayElement part, final MetaClass cls) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("protected void create");
    EClass _eClass = part.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    String _shapeName = this._sprayElementNameProvider.getShapeName(part);
    _builder.append(_shapeName, "");
    _builder.append(" (IAddContext context, ");
    String _name_1 = this._namingExtensions.getName(cls);
    _builder.append(_name_1, "");
    _builder.append(" addedModelElement, ContainerShape containerShape) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("System.out.println(\"Spray: unhandled Container child [");
    Class<? extends Object> _class = part.getClass();
    String _name_2 = _class.getName();
    _builder.append(_name_2, "    ");
    _builder.append("]\");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _createShape(final Line line, final MetaClass cls) {
    StringConcatenation _builder = new StringConcatenation();
    String _shapeName = this._sprayElementNameProvider.getShapeName(line);
    String _firstLower = StringExtensions.toFirstLower(_shapeName);
    final String varname = _firstLower;
    _builder.newLineIfNotEmpty();
    _builder.append("// Part is Line");
    _builder.newLine();
    _builder.append("protected void createLine");
    String _shapeName_1 = this._sprayElementNameProvider.getShapeName(line);
    _builder.append(_shapeName_1, "");
    _builder.append(" (IAddContext context, ");
    String _name = this._namingExtensions.getName(cls);
    _builder.append(_name, "");
    _builder.append(" addedModelElement, ContainerShape containerShape) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("// create shape for line");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Shape ");
    _builder.append(varname, "    ");
    _builder.append(" = peCreateService.createShape(containerShape, false);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("// create and set graphics algorithm");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Polyline polyline = gaService.createPolyline(");
    _builder.append(varname, "    ");
    _builder.append(", new int[] { 0, 0, 0, 0 });");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("polyline.setForeground(manageColor(");
    String _lineColor = this._layoutExtensions.lineColor(line);
    _builder.append(_lineColor, "    ");
    _builder.append(" ));");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("polyline.setLineWidth(");
    Layout _layout = line.getLayout();
    int _lineWidth = _layout.getLineWidth();
    _builder.append(_lineWidth, "    ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    {
      Layout _layout_1 = line.getLayout();
      int _lineWidth_1 = _layout_1.getLineWidth();
      boolean _operator_equals = IntegerExtensions.operator_equals(_lineWidth_1, 0);
      if (_operator_equals) {
        _builder.append("polyline.setLineVisible(false);");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("gaService.setLocation(polyline, 0, 0);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("peService.setPropertyValue(");
    _builder.append(varname, "    ");
    _builder.append(", ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.LINE);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _createShape(final Text text, final MetaClass cls) {
    StringConcatenation _builder = new StringConcatenation();
    String _shapeName = this._sprayElementNameProvider.getShapeName(text);
    String _firstLower = StringExtensions.toFirstLower(_shapeName);
    final String varname = _firstLower;
    _builder.newLineIfNotEmpty();
    _builder.append("// Part is Text");
    _builder.newLine();
    _builder.append("protected void createText");
    String _shapeName_1 = this._sprayElementNameProvider.getShapeName(text);
    _builder.append(_shapeName_1, "");
    _builder.append(" (IAddContext context, ");
    String _name = this._namingExtensions.getName(cls);
    _builder.append(_name, "");
    _builder.append(" addedModelElement, ContainerShape containerShape) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("String type = \"");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(text);
    _builder.append(_fullyQualifiedName, "    ");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("// create shape for text and set text graphics algorithm");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Shape ");
    _builder.append(varname, "    ");
    _builder.append(" = peCreateService.createShape(containerShape, false);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("Text text = gaService.createDefaultText(getDiagram(), ");
    _builder.append(varname, "    ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("text.setFont(gaService.manageFont(getDiagram(), text.getFont().getName(), 12, ");
    Layout _layout = text.getLayout();
    boolean _isItalic = _layout.isItalic();
    _builder.append(_isItalic, "    ");
    _builder.append(", ");
    Layout _layout_1 = text.getLayout();
    boolean _isBold = _layout_1.isBold();
    _builder.append(_isBold, "    ");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("text.setForeground(manageColor(");
    String _lineColor = this._layoutExtensions.lineColor(text);
    _builder.append(_lineColor, "    ");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("gaService.setLocationAndSize(text, 0, 0, 0, 0);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("peService.setPropertyValue(");
    _builder.append(varname, "    ");
    _builder.append(", ISprayConstants.PROPERTY_MODEL_TYPE, type);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("peService.setPropertyValue(");
    _builder.append(varname, "    ");
    _builder.append(", ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.TEXT);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("// create link and wire it");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("link(");
    _builder.append(varname, "    ");
    _builder.append(", addedModelElement);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _createShape(final MetaReference metaRef, final MetaClass cls) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = this._namingExtensions.getName(metaRef);
    String _firstLower = StringExtensions.toFirstLower(_name);
    final String varname = _firstLower;
    _builder.newLineIfNotEmpty();
    EReference _target = metaRef.getTarget();
    final EReference target = _target;
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("// Part is reference list");
    _builder.newLine();
    _builder.append("protected void createMetaReference");
    String _shapeName = this._sprayElementNameProvider.getShapeName(metaRef);
    _builder.append(_shapeName, "");
    _builder.append(" (IAddContext context, ");
    String _name_1 = this._namingExtensions.getName(cls);
    _builder.append(_name_1, "");
    _builder.append(" addedModelElement, ContainerShape containerShape) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("// Create a dummy invisible line to have an anchor point for adding new elements to the list");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Shape dummy = peCreateService.createShape(containerShape, false);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("peService.setPropertyValue(dummy, ISprayConstants.PROPERTY_MODEL_TYPE, ");
    EClass _eReferenceType = target.getEReferenceType();
    String _literalConstant = this._namingExtensions.getLiteralConstant(_eReferenceType);
    _builder.append(_literalConstant, "    ");
    _builder.append(".getName());");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("Polyline p = gaService.createPolyline(dummy, new int[] { 0, 0, 0, 0 });");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("p.setForeground(manageColor(");
    String _shortName = this._namingExtensions.shortName(org.eclipse.graphiti.util.IColorConstant.class);
    _builder.append(_shortName, "    ");
    _builder.append(".BLACK));");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("p.setLineWidth(0);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("p.setLineVisible(false);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("gaService.setLocation(p, 0, 0);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("peService.setPropertyValue(dummy, ISprayContainer.CONCEPT_SHAPE_KEY, ISprayContainer.LINE);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("for (");
    EClass _eReferenceType_1 = target.getEReferenceType();
    String _javaInterfaceName = this._namingExtensions.getJavaInterfaceName(_eReferenceType_1);
    String _shortName_1 = this._namingExtensions.shortName(_javaInterfaceName);
    _builder.append(_shortName_1, "    ");
    _builder.append(" prop: addedModelElement.get");
    String _name_2 = target.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper, "    ");
    _builder.append("()) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createShape(final SprayElement line, final MetaClass cls) {
    if (line instanceof Line) {
      return _createShape((Line)line, cls);
    } else if (line instanceof Text) {
      return _createShape((Text)line, cls);
    } else if (line instanceof MetaReference) {
      return _createShape((MetaReference)line, cls);
    } else if (line != null) {
      return _createShape(line, cls);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(line, cls).toString());
    }
  }
}
