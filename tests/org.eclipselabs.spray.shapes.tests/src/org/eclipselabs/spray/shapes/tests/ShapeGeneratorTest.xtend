package org.eclipselabs.spray.shapes.tests

import javax.inject.Inject
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipselabs.spray.shapes.ShapeContainer
import org.eclipselabs.spray.shapes.ShapeDefinition
import org.eclipselabs.spray.shapes.generator.ShapeGenerator
import org.eclipselabs.spray.shapes.tests.util.ShapeTestsInjectorProvider
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile
import com.google.inject.Provider

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(ShapeTestsInjectorProvider))
class ShapeGeneratorTest {
    @Inject Provider<JavaGenFile> genFileProvider
	@Inject extension ParseHelper<ShapeContainer> parseHelper
	@Inject extension ShapeGenerator shapeGenerator
	
	def private shapeModelLine() '''
		shape MyShape {
			line {
				point(x=10, y=15)
				point(x=80, y=85)
			}
		}
	'''

	@Test
	def testGenerateShapeModelLine() {
		val fsa = new InMemoryFileSystemAccess
        val JavaGenFile java = genFileProvider.get()
        java.access = fsa
		java.generateJava(shapeModelLine.parse.shapeContainerElement.filter(typeof(ShapeDefinition)).head)
		val entries = fsa.files.entrySet
		assertEquals("Expected file count generated", 1, entries.size)
		assertEquals("In expected file output generated", "DEFAULT_OUTPUTshapes/MyShapeShapeBase.java", entries.head.key)
		assertEquals("Expected file content generated", shapeModelLineExpectedContent.toString, entries.head.value.toString)
	}
	
	def private shapeModelLineExpectedContent() '''
        /**
         * This is a generated Shape for Spray
         */
        package shapes;
        
        import java.util.List;
        import java.util.ArrayList;
        import org.eclipse.graphiti.mm.algorithms.styles.Point;
        import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
        
        import org.eclipse.graphiti.datatypes.IDimension;
        import org.eclipse.graphiti.features.*;
        import org.eclipse.graphiti.features.context.IAddContext;
        import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
        import org.eclipse.graphiti.services.Graphiti;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipse.graphiti.services.IPeService;
        import org.eclipse.graphiti.services.IPeCreateService;
        import org.eclipse.graphiti.util.ColorConstant;
        import org.eclipse.graphiti.util.IColorConstant;
        
        import org.eclipse.graphiti.mm.pictograms.*;
        import org.eclipse.graphiti.mm.algorithms.*;
        import org.eclipse.graphiti.mm.algorithms.styles.*;
        
        import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayAbstractLayoutManager;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutType;
        
        import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
        import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayShape;
        import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;
        import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;
        
        @SuppressWarnings("all")
        public class MyShapeShapeBase extends DefaultSprayShape {
            
            public static enum TextIds {
            }
            
            public MyShapeShapeBase(IFeatureProvider fp) {
                super(fp);
            }
            
            @Override
            public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle) {
                // Create a ContainerShape for this Shape
                Diagram diagram = peService.getDiagramForShape(targetContainer);
                ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);
                SprayLayoutService.setId(containerShape, "MyShape.containerShape");
                
                // define general layout for ContainerShape
                sprayStyle.getStyle(diagram).setProportional(false);
                sprayStyle.getStyle(diagram).setStretchH(false);
                sprayStyle.getStyle(diagram).setStretchV(false);
                
                // layout data
                SprayLayoutType containerLayout = SprayLayoutType.FIT;
                SprayLayoutService.setLayoutManager(containerShape, containerLayout, 0, 0, true);
                SprayLayoutService.getLayoutData(containerShape).setVisible(true);
                
                createCascadedElements(diagram, containerShape, sprayStyle);
                createAnchorPoints(diagram, containerShape);
                
                // Fix the broken coordinate syaten for not active container shapes
                SprayAbstractLayoutManager.fixOffset(containerShape);
                
                return containerShape;
            }
            
            // START GENERATING CASCADED ELEMENTS
            protected void createCascadedElements(Diagram diagram, ContainerShape containerShape, ISprayStyle sprayStyle) {
                IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
                directEditingInfo.setMainPictogramElement(containerShape);
                directEditingInfo.setPictogramElement(containerShape);
                
                GraphicsAlgorithm element_0 = gaService.createInvisibleRectangle(containerShape);
                element_0.setStyle(sprayStyle.getStyle(diagram));
                SprayLayoutService.setShapeFromDsl(containerShape, true);
                gaService.setLocationAndSize(element_0, 0, 0, 80, 85);
                
                
                createElement_1(diagram, containerShape, sprayStyle);
                
                
                // Set start values for height and width as properties on the element for Layout Feature
                SprayLayoutManager.setSizePictogramProperties(containerShape);
            }
            
            protected Shape createElement_1(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
                List<Point> pointList_1 = new ArrayList<Point>();
                pointList_1.add(gaService.createPoint(10, 15, 0, 0));
                pointList_1.add(gaService.createPoint(80, 85, 0, 0));
                Shape shape_1 = peCreateService.createShape(parentShape, false);
                SprayLayoutService.setId(shape_1, "MyShape.shape_1");
                Polyline element_1 = gaService.createPlainPolyline(shape_1, pointList_1);
                ISprayStyle style_1 = sprayStyle;
                element_1.setStyle(style_1.getStyle(diagram));
                return shape_1;
            }
            // STOP GENERATING CASCADED ELEMENTS
            
            protected void createAnchorPoints(Diagram diagram, ContainerShape containerShape) {
                peCreateService.createChopboxAnchor(containerShape);
            }
            
            public SprayLayoutManager getShapeLayout() {
                SprayLayoutManager layoutManager = new SprayLayoutManager();
                layoutManager.setMinSizeWidth(-1);
                layoutManager.setMaxSizeWidth(-1);
                layoutManager.setMinSizeHeight(-1);
                layoutManager.setMaxSizeHeight(-1);
                layoutManager.setStretchHorizontal(true);
                layoutManager.setStretchVertical(true);
                return layoutManager;
            }
            
        }
	'''
	
	def private shapeModelPolyline() '''
		shape MyShape {
			polyline {
				point(x=10, y=15)
				point(x=80, y=85)
				point(x=140, y=145)
				point(x=170, y=175)
			}
		}
	'''

	@Test
	def testGenerateShapeModelPolyline() {
		val fsa = new InMemoryFileSystemAccess
        val JavaGenFile java = genFileProvider.get()
        java.access = fsa
		java.generateJava(shapeModelPolyline.parse.shapeContainerElement.filter(typeof(ShapeDefinition)).head)
		val entries = fsa.files.entrySet
		assertEquals("Expected file count generated", 1, entries.size)
		assertEquals("In expected file output generated", "DEFAULT_OUTPUTshapes/MyShapeShapeBase.java", entries.head.key)
		assertEquals("Expected file content generated", shapeModelPolylineExpectedContent.toString, entries.head.value.toString)
	}
	
	def private shapeModelPolylineExpectedContent() '''
        /**
         * This is a generated Shape for Spray
         */
        package shapes;
        
        import java.util.List;
        import java.util.ArrayList;
        import org.eclipse.graphiti.mm.algorithms.styles.Point;
        import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
        
        import org.eclipse.graphiti.datatypes.IDimension;
        import org.eclipse.graphiti.features.*;
        import org.eclipse.graphiti.features.context.IAddContext;
        import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
        import org.eclipse.graphiti.services.Graphiti;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipse.graphiti.services.IPeService;
        import org.eclipse.graphiti.services.IPeCreateService;
        import org.eclipse.graphiti.util.ColorConstant;
        import org.eclipse.graphiti.util.IColorConstant;
        
        import org.eclipse.graphiti.mm.pictograms.*;
        import org.eclipse.graphiti.mm.algorithms.*;
        import org.eclipse.graphiti.mm.algorithms.styles.*;
        
        import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayAbstractLayoutManager;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutType;
        
        import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
        import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayShape;
        import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;
        import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;
        
        @SuppressWarnings("all")
        public class MyShapeShapeBase extends DefaultSprayShape {
            
            public static enum TextIds {
            }
            
            public MyShapeShapeBase(IFeatureProvider fp) {
                super(fp);
            }
            
            @Override
            public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle) {
                // Create a ContainerShape for this Shape
                Diagram diagram = peService.getDiagramForShape(targetContainer);
                ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);
                SprayLayoutService.setId(containerShape, "MyShape.containerShape");
                
                // define general layout for ContainerShape
                sprayStyle.getStyle(diagram).setProportional(false);
                sprayStyle.getStyle(diagram).setStretchH(false);
                sprayStyle.getStyle(diagram).setStretchV(false);
                
                // layout data
                SprayLayoutType containerLayout = SprayLayoutType.FIT;
                SprayLayoutService.setLayoutManager(containerShape, containerLayout, 0, 0, true);
                SprayLayoutService.getLayoutData(containerShape).setVisible(true);
                
                createCascadedElements(diagram, containerShape, sprayStyle);
                createAnchorPoints(diagram, containerShape);
                
                // Fix the broken coordinate syaten for not active container shapes
                SprayAbstractLayoutManager.fixOffset(containerShape);
                
                return containerShape;
            }
            
            // START GENERATING CASCADED ELEMENTS
            protected void createCascadedElements(Diagram diagram, ContainerShape containerShape, ISprayStyle sprayStyle) {
                IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
                directEditingInfo.setMainPictogramElement(containerShape);
                directEditingInfo.setPictogramElement(containerShape);
                
                GraphicsAlgorithm element_0 = gaService.createInvisibleRectangle(containerShape);
                element_0.setStyle(sprayStyle.getStyle(diagram));
                SprayLayoutService.setShapeFromDsl(containerShape, true);
                gaService.setLocationAndSize(element_0, 0, 0, 170, 175);
                
                
                createElement_1(diagram, containerShape, sprayStyle);
                
                
                // Set start values for height and width as properties on the element for Layout Feature
                SprayLayoutManager.setSizePictogramProperties(containerShape);
            }
            
            protected Shape createElement_1(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
                List<Point> pointList_1 = new ArrayList<Point>();
                pointList_1.add(gaService.createPoint(10, 15, 0, 0));
                pointList_1.add(gaService.createPoint(80, 85, 0, 0));
                pointList_1.add(gaService.createPoint(140, 145, 0, 0));
                pointList_1.add(gaService.createPoint(170, 175, 0, 0));
                ContainerShape shape_1 = peCreateService.createContainerShape(parentShape, false);
                SprayLayoutService.setId(shape_1, "MyShape.shape_1");
                Polyline element_1 = gaService.createPlainPolyline(shape_1, pointList_1);
                ISprayStyle style_1 = sprayStyle;
                element_1.setStyle(style_1.getStyle(diagram));
                return shape_1;
            }
            // STOP GENERATING CASCADED ELEMENTS
            
            protected void createAnchorPoints(Diagram diagram, ContainerShape containerShape) {
                peCreateService.createChopboxAnchor(containerShape);
            }
            
            public SprayLayoutManager getShapeLayout() {
                SprayLayoutManager layoutManager = new SprayLayoutManager();
                layoutManager.setMinSizeWidth(-1);
                layoutManager.setMaxSizeWidth(-1);
                layoutManager.setMinSizeHeight(-1);
                layoutManager.setMaxSizeHeight(-1);
                layoutManager.setStretchHorizontal(true);
                layoutManager.setStretchVertical(true);
                return layoutManager;
            }
            
        }
    '''
	
	def private shapeModelRectangle() '''
		shape MyShape {
			rectangle {
				position(x=10, y=15)
				size(width=80, height=85)
			}
		}
	'''

	@Test
	def testGenerateShapeModelRectangle() {
		val fsa = new InMemoryFileSystemAccess
        val JavaGenFile java = genFileProvider.get()
        java.access = fsa
		java.generateJava(shapeModelRectangle.parse.shapeContainerElement.filter(typeof(ShapeDefinition)).head)
		val entries = fsa.files.entrySet
		assertEquals("Expected file count generated", 1, entries.size)
		assertEquals("In expected file output generated", "DEFAULT_OUTPUTshapes/MyShapeShapeBase.java", entries.head.key)
		assertEquals("Expected file content generated", shapeModelRectangleExpectedContent.toString, entries.head.value.toString)
	}
	
	def private shapeModelRectangleExpectedContent() '''
        /**
         * This is a generated Shape for Spray
         */
        package shapes;
        
        import java.util.List;
        import java.util.ArrayList;
        import org.eclipse.graphiti.mm.algorithms.styles.Point;
        import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
        
        import org.eclipse.graphiti.datatypes.IDimension;
        import org.eclipse.graphiti.features.*;
        import org.eclipse.graphiti.features.context.IAddContext;
        import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
        import org.eclipse.graphiti.services.Graphiti;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipse.graphiti.services.IPeService;
        import org.eclipse.graphiti.services.IPeCreateService;
        import org.eclipse.graphiti.util.ColorConstant;
        import org.eclipse.graphiti.util.IColorConstant;
        
        import org.eclipse.graphiti.mm.pictograms.*;
        import org.eclipse.graphiti.mm.algorithms.*;
        import org.eclipse.graphiti.mm.algorithms.styles.*;
        
        import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayAbstractLayoutManager;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutType;
        
        import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
        import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayShape;
        import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;
        import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;
        
        @SuppressWarnings("all")
        public class MyShapeShapeBase extends DefaultSprayShape {
            
            public static enum TextIds {
            }
            
            public MyShapeShapeBase(IFeatureProvider fp) {
                super(fp);
            }
            
            @Override
            public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle) {
                // Create a ContainerShape for this Shape
                Diagram diagram = peService.getDiagramForShape(targetContainer);
                ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);
                SprayLayoutService.setId(containerShape, "MyShape.containerShape");
                
                // define general layout for ContainerShape
                sprayStyle.getStyle(diagram).setProportional(false);
                sprayStyle.getStyle(diagram).setStretchH(false);
                sprayStyle.getStyle(diagram).setStretchV(false);
                
                // layout data
                SprayLayoutType containerLayout = SprayLayoutType.FIT;
                SprayLayoutService.setLayoutManager(containerShape, containerLayout, 0, 0, true);
                SprayLayoutService.getLayoutData(containerShape).setVisible(true);
                
                createCascadedElements(diagram, containerShape, sprayStyle);
                createAnchorPoints(diagram, containerShape);
                
                // Fix the broken coordinate syaten for not active container shapes
                SprayAbstractLayoutManager.fixOffset(containerShape);
                
                return containerShape;
            }
            
            // START GENERATING CASCADED ELEMENTS
            protected void createCascadedElements(Diagram diagram, ContainerShape containerShape, ISprayStyle sprayStyle) {
                IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
                directEditingInfo.setMainPictogramElement(containerShape);
                directEditingInfo.setPictogramElement(containerShape);
                
                GraphicsAlgorithm element_0 = gaService.createInvisibleRectangle(containerShape);
                element_0.setStyle(sprayStyle.getStyle(diagram));
                SprayLayoutService.setShapeFromDsl(containerShape, true);
                gaService.setLocationAndSize(element_0, 0, 0, 90, 100);
                
                
                createElement_1(diagram, containerShape, sprayStyle);
                
                
                // Set start values for height and width as properties on the element for Layout Feature
                SprayLayoutManager.setSizePictogramProperties(containerShape);
            }
            
            protected Shape createElement_1(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
                ContainerShape shape_1 = peCreateService.createContainerShape(parentShape, false);
                SprayLayoutService.setId(shape_1, "MyShape.shape_1");
                SprayLayoutService.setCompartment(shape_1, false);
                Rectangle element_1 = gaService.createPlainRectangle(shape_1);
                ISprayStyle style_1 = sprayStyle;
                element_1.setStyle(style_1.getStyle(diagram));
                gaService.setLocationAndSize(element_1, 10, 15, 80, 85);
                SprayLayoutService.setLayoutData(shape_1, 80, 85, true);
                return shape_1;
            }
            // STOP GENERATING CASCADED ELEMENTS
            
            protected void createAnchorPoints(Diagram diagram, ContainerShape containerShape) {
                peCreateService.createChopboxAnchor(containerShape);
            }
            
            public SprayLayoutManager getShapeLayout() {
                SprayLayoutManager layoutManager = new SprayLayoutManager();
                layoutManager.setMinSizeWidth(-1);
                layoutManager.setMaxSizeWidth(-1);
                layoutManager.setMinSizeHeight(-1);
                layoutManager.setMaxSizeHeight(-1);
                layoutManager.setStretchHorizontal(true);
                layoutManager.setStretchVertical(true);
                return layoutManager;
            }
            
        }
	'''		
	
	@Test
	def testIssue248Regression() {
		val fsa = new InMemoryFileSystemAccess
        val JavaGenFile java = genFileProvider.get()
        java.access = fsa
		java.generateJava(issue248ExampleModel.parse.shapeContainerElement.filter(typeof(ShapeDefinition)).head)
		val entries = fsa.files.entrySet
		assertEquals("Expected file count generated", 1, entries.size)
		assertEquals("In expected file output generated", "DEFAULT_OUTPUTshapes/TabShapeShapeBase.java", entries.head.key)
		assertEquals("Expected file content generated", issue248ExampleModelExpectedContent.toString, entries.head.value.toString)
	}
	
	def private issue248ExampleModel() '''
		shape TabShape {
			stretching(horizontal=false, vertical=false)
			rectangle style TabStyle {
				compartment (
					id = tabCompartment
					layout = fixed
					spacing=2
					margin=2
				)
				position (x=0, y=20)
				size (width=600, height=400)
				style (background-color=RGB (192, 192, 192))
			}
			text{
					align(horizontal=center,vertical=middle)
					position(x=0, y=0)
					size(width=600,height=20)
					style(background-color=blue font-color=red transparency=0.1)
					id=tabID
			}
		}
	'''
	
	def private issue248ExampleModelExpectedContent() '''
        /**
         * This is a generated Shape for Spray
         */
        package shapes;
        
        import java.util.List;
        import java.util.ArrayList;
        import org.eclipse.graphiti.mm.algorithms.styles.Point;
        import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
        
        import org.eclipse.graphiti.datatypes.IDimension;
        import org.eclipse.graphiti.features.*;
        import org.eclipse.graphiti.features.context.IAddContext;
        import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
        import org.eclipse.graphiti.services.Graphiti;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipse.graphiti.services.IPeService;
        import org.eclipse.graphiti.services.IPeCreateService;
        import org.eclipse.graphiti.util.ColorConstant;
        import org.eclipse.graphiti.util.IColorConstant;
        
        import org.eclipse.graphiti.mm.pictograms.*;
        import org.eclipse.graphiti.mm.algorithms.*;
        import org.eclipse.graphiti.mm.algorithms.styles.*;
        
        import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayAbstractLayoutManager;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutType;
        
        import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
        import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayShape;
        import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;
        import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;
        
        @SuppressWarnings("all")
        public class TabShapeShapeBase extends DefaultSprayShape {
            
            public static enum TextIds {
                tabCompartment,
                tabID
            }
            
            public TabShapeShapeBase(IFeatureProvider fp) {
                super(fp);
            }
            
            @Override
            public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle) {
                // Create a ContainerShape for this Shape
                Diagram diagram = peService.getDiagramForShape(targetContainer);
                ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);
                SprayLayoutService.setId(containerShape, "TabShape.containerShape");
                
                // define general layout for ContainerShape
                sprayStyle.getStyle(diagram).setProportional(false);
                sprayStyle.getStyle(diagram).setStretchH(false);
                SprayLayoutService.getLayoutData(containerShape).setHorizontalStrechable(false);
                sprayStyle.getStyle(diagram).setStretchV(false);
                SprayLayoutService.getLayoutData(containerShape).setVerticalStrechable(false);
                
                // layout data
                SprayLayoutType containerLayout = SprayLayoutType.FIT;
                SprayLayoutService.setLayoutManager(containerShape, containerLayout, 0, 0, true);
                SprayLayoutService.getLayoutData(containerShape).setVisible(true);
                
                createCascadedElements(diagram, containerShape, sprayStyle);
                createAnchorPoints(diagram, containerShape);
                
                // Fix the broken coordinate syaten for not active container shapes
                SprayAbstractLayoutManager.fixOffset(containerShape);
                
                return containerShape;
            }
            
            // START GENERATING CASCADED ELEMENTS
            protected void createCascadedElements(Diagram diagram, ContainerShape containerShape, ISprayStyle sprayStyle) {
                IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
                directEditingInfo.setMainPictogramElement(containerShape);
                directEditingInfo.setPictogramElement(containerShape);
                
                GraphicsAlgorithm element_0 = gaService.createInvisibleRectangle(containerShape);
                element_0.setStyle(sprayStyle.getStyle(diagram));
                SprayLayoutService.setShapeFromDsl(containerShape, true);
                gaService.setLocationAndSize(element_0, 0, 0, 600, 420);
                
                // Invisible rectangle around the elements (because more then one element is on first layer).
                ContainerShape invisibleShape = peCreateService.createContainerShape(containerShape, false);
                SprayLayoutService.setId(invisibleShape, "TabShape.invisibleShape");
                SprayLayoutType layout_1 = SprayLayoutType.TOP;
                SprayLayoutService.setLayoutManager(containerShape, layout_1, 0, 0);
                
                GraphicsAlgorithm element_1 = gaService.createPlainRectangle(invisibleShape);
                element_1.setStyle(sprayStyle.getStyle(diagram));
                element_1.setFilled(false);
                element_1.setLineVisible(false);
                gaService.setLocationAndSize(element_1, 0, 0, 600, 420);
                
                createElement_2(diagram, containerShape, sprayStyle);
                createElement_3(diagram, containerShape, sprayStyle);
                
                
                // Set start values for height and width as properties on the element for Layout Feature
                SprayLayoutManager.setSizePictogramProperties(containerShape);
            }
            
            protected Shape createElement_2(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
                ContainerShape shape_2 = peCreateService.createContainerShape(parentShape, true);
                SprayLayoutService.setId(shape_2, "TabShape.shape_2");
                SprayLayoutService.setCompartment(shape_2, true);
                GraphitiProperties.set(shape_2, ISprayConstants.TEXT_ID, "tabCompartment");
                SprayLayoutType layout_2 = SprayLayoutType.FIXED;
                SprayLayoutService.setLayoutManager(shape_2, layout_2, 2, 2, true);
                SprayLayoutService.setLayoutData(shape_2, 600, 400);
                Rectangle element_2 = gaService.createPlainRectangle(shape_2);
                ISprayStyle style_2 = new styles.();
                element_2.setStyle(style_2.getStyle(diagram));
                gaService.setLocationAndSize(element_2, 0, 20, 600, 400);
                SprayLayoutService.setLayoutData(shape_2, 600, 400, true);
                element_2.setBackground(gaService.manageColor(diagram,new ColorConstant(192, 192, 192)));
                return shape_2;
            }
            protected Shape createElement_3(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
                Shape shape_3 = peCreateService.createShape(parentShape, false);
                SprayLayoutService.setId(shape_3, "TabShape.shape_3");
                Text element_3 = gaService.createPlainText(shape_3);
                ISprayStyle style_3 = sprayStyle;
                element_3.setStyle(style_3.getStyle(diagram));
                gaService.setLocationAndSize(element_3, 0, 0, 600, 20);
                SprayLayoutService.setLayoutData(shape_3, 600, 20, true);
                element_3.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
                element_3.setVerticalAlignment(Orientation.ALIGNMENT_MIDDLE);
                peService.setPropertyValue(element_3, ISprayConstants.TEXT_ID, TextIds.tabID.name());
                peService.setPropertyValue(shape_3, ISprayConstants.TEXT_ID, TextIds.tabID.name());
                element_3.setValue("");
                element_3.setBackground(gaService.manageColor(diagram,IColorConstant.BLUE));
                element_3.setTransparency(0.1);
                {
                    Style style = element_3.getStyle();
                    String fontName = style.getFont().getName();
                    int fontSize = style.getFont().getSize();
                    element_3.setForeground(gaService.manageColor(diagram,IColorConstant.RED));
                    boolean fontItalic = style.getFont().isItalic();
                    boolean fontBold = style.getFont().isBold();
                    style.setFont(gaService.manageFont(diagram, fontName, fontSize, fontItalic, fontBold));
                }
                getFeatureProvider().getDirectEditingInfo().setGraphicsAlgorithm(element_3);
                return shape_3;
            }
            // STOP GENERATING CASCADED ELEMENTS
            
            protected void createAnchorPoints(Diagram diagram, ContainerShape containerShape) {
                peCreateService.createChopboxAnchor(containerShape);
            }
            
            public SprayLayoutManager getShapeLayout() {
                SprayLayoutManager layoutManager = new SprayLayoutManager();
                layoutManager.setMinSizeWidth(-1);
                layoutManager.setMaxSizeWidth(-1);
                layoutManager.setMinSizeHeight(-1);
                layoutManager.setMaxSizeHeight(-1);
                layoutManager.setStretchHorizontal(false);
                layoutManager.setStretchVertical(false);
                return layoutManager;
            }
            
        }
	'''
}