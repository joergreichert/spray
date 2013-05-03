package org.eclipselabs.spray.shapes.tests

import com.google.inject.Inject
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
			
			public MyShapeBase(IFeatureProvider fp) {
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
				
				// creates the cascaded elements (figures)
				IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
				directEditingInfo.setMainPictogramElement(containerShape);
				directEditingInfo.setPictogramElement(containerShape);
				
				GraphicsAlgorithm element_0 = gaService.createInvisibleRectangle(containerShape);
				element_0.setStyle(sprayStyle.getStyle(diagram));
				SprayLayoutService.setShapeFromDsl(containerShape, true);
				gaService.setLocationAndSize(element_0, 0, 0, 80, 85);
				
				List<Point> pointList_1 = new ArrayList<Point>();
				pointList_1.add(gaService.createPoint(10, 15, 0, 0));
				pointList_1.add(gaService.createPoint(80, 85, 0, 0));
				Shape shape_1 = peCreateService.createShape(containerShape, false);
				SprayLayoutService.setId(shape_1, "MyShape.shape_1");
				Polyline element_1 = gaService.createPlainPolyline(shape_1, pointList_1);
				ISprayStyle style_1 = sprayStyle;
				element_1.setStyle(style_1.getStyle(diagram));
				
				
				// Set start values for height and width as properties on the element for Layout Feature
				SprayLayoutManager.setSizePictogramProperties(containerShape);
				
				// creates the anchors
				peCreateService.createChopboxAnchor(containerShape);
				
				// Fix the broken coordinate syaten for not active container shapes
		        SprayAbstractLayoutManager.fixOffset(containerShape);
				return containerShape;
			}
		
			public SprayLayoutManager getShapeLayout() {
				SprayLayoutManager layoutManager = new SprayLayoutManager( );
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
			
			public MyShapeBase(IFeatureProvider fp) {
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
				
				// creates the cascaded elements (figures)
				IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
				directEditingInfo.setMainPictogramElement(containerShape);
				directEditingInfo.setPictogramElement(containerShape);
				
				GraphicsAlgorithm element_0 = gaService.createInvisibleRectangle(containerShape);
				element_0.setStyle(sprayStyle.getStyle(diagram));
				SprayLayoutService.setShapeFromDsl(containerShape, true);
				gaService.setLocationAndSize(element_0, 0, 0, 170, 175);
				
				List<Point> pointList_1 = new ArrayList<Point>();
				pointList_1.add(gaService.createPoint(10, 15, 0, 0));
				pointList_1.add(gaService.createPoint(80, 85, 0, 0));
				pointList_1.add(gaService.createPoint(140, 145, 0, 0));
				pointList_1.add(gaService.createPoint(170, 175, 0, 0));
				ContainerShape shape_1 = peCreateService.createContainerShape(containerShape, false);
				SprayLayoutService.setId(shape_1, "MyShape.shape_1");
				Polyline element_1 = gaService.createPlainPolyline(shape_1, pointList_1);
				ISprayStyle style_1 = sprayStyle;
				element_1.setStyle(style_1.getStyle(diagram));
				
				
				// Set start values for height and width as properties on the element for Layout Feature
				SprayLayoutManager.setSizePictogramProperties(containerShape);
				
				// creates the anchors
				peCreateService.createChopboxAnchor(containerShape);
				
				// Fix the broken coordinate syaten for not active container shapes
		        SprayAbstractLayoutManager.fixOffset(containerShape);
				return containerShape;
			}
		
			public SprayLayoutManager getShapeLayout() {
				SprayLayoutManager layoutManager = new SprayLayoutManager( );
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
			
			public MyShapeBase(IFeatureProvider fp) {
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
				
				// creates the cascaded elements (figures)
				IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
				directEditingInfo.setMainPictogramElement(containerShape);
				directEditingInfo.setPictogramElement(containerShape);
				
				GraphicsAlgorithm element_0 = gaService.createInvisibleRectangle(containerShape);
				element_0.setStyle(sprayStyle.getStyle(diagram));
				SprayLayoutService.setShapeFromDsl(containerShape, true);
				gaService.setLocationAndSize(element_0, 0, 0, 90, 100);
				
				ContainerShape shape_1 = peCreateService.createContainerShape(containerShape, false);
				SprayLayoutService.setId(shape_1, "MyShape.shape_1");
				SprayLayoutService.setCompartment(shape_1, false);
				Rectangle element_1 = gaService.createPlainRectangle(shape_1);
				ISprayStyle style_1 = sprayStyle;
				element_1.setStyle(style_1.getStyle(diagram));
				gaService.setLocationAndSize(element_1, 10, 15, 80, 85);
				SprayLayoutService.setLayoutData(shape_1, 80, 85, true);
				// start RECURSIVEcREATION shape_1
				
				// end RECURSIVEcREATION shape_1
				
				
				// Set start values for height and width as properties on the element for Layout Feature
				SprayLayoutManager.setSizePictogramProperties(containerShape);
				
				// creates the anchors
				peCreateService.createChopboxAnchor(containerShape);
				
				// Fix the broken coordinate syaten for not active container shapes
		        SprayAbstractLayoutManager.fixOffset(containerShape);
				return containerShape;
			}
		
			public SprayLayoutManager getShapeLayout() {
				SprayLayoutManager layoutManager = new SprayLayoutManager( );
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
}