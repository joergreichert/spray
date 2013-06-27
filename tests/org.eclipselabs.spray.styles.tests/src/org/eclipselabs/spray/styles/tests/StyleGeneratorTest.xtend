package org.eclipselabs.spray.styles.tests

import javax.inject.Inject
import com.google.inject.Provider
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipselabs.spray.styles.Gradient
import org.eclipselabs.spray.styles.Style
import org.eclipselabs.spray.styles.StyleContainer
import org.eclipselabs.spray.styles.generator.StylesGenerator
import org.eclipselabs.spray.styles.tests.util.StyleTestsInjectorProvider
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(StyleTestsInjectorProvider))
class StyleGeneratorTest {
    @Inject Provider<JavaGenFile> genFileProvider
	@Inject extension ParseHelper<StyleContainer> parseHelper
	@Inject extension StylesGenerator styleGenerator
	
	def private styleModelFull() '''
		style MyStyle {
		   description = "My description"
			transparency     	 = 0.5
			background-color 	 = black
			gradient-orientation = horizontal
			highlighting (
				selected         = RGB(0,100,0)
				multiselected    = RGB(0,100,100)
		 		allowed          = RGB(0,100,200)
		 		unallowed        = RGB(100,0,0)
			)
			line-color       	 = gray
			line-width       	 = 3
			line-style       	 = dash-dot
			font-name        	 = "Arial"
		    font-color       	 = blue
		    font-size        	 = 18
		    font-italic      	 = yes
		    font-bold        	 = yes
		}
	'''

	@Test
	def testGenerateStyleModelFull() {
		val fsa = new InMemoryFileSystemAccess
        val JavaGenFile java = genFileProvider.get()
        java.access = fsa
		java.doGenerateStyle(styleModelFull.parse.styleContainerElement.filter(typeof(Style)).head)
		val entries = fsa.files.entrySet
		assertEquals("Expected file count generated", 1, entries.size)
		assertEquals("In expected file output generated", "DEFAULT_OUTPUTstyles/MyStyleBase.java", entries.head.key)
		assertEquals("Expected file content generated", styleModelFullExpectedContent.toString, entries.head.value.toString)
	}
	
	def private styleModelFullExpectedContent() '''
		/**
		 * This is a generated Style class for Spray.
		 */
		package styles;
		
		import org.eclipse.graphiti.mm.pictograms.Diagram;
		import org.eclipse.graphiti.mm.algorithms.styles.Style;
		import org.eclipse.graphiti.mm.algorithms.styles.Color;
		import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
		import org.eclipse.graphiti.services.Graphiti;
		import org.eclipse.graphiti.services.IGaService;
		import org.eclipse.graphiti.util.ColorConstant;
		import org.eclipse.graphiti.util.IColorConstant;
		import org.eclipse.graphiti.mm.algorithms.styles.AdaptedGradientColoredAreas;
		import org.eclipse.graphiti.util.IGradientType;
		import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
		import org.eclipse.graphiti.util.IPredefinedRenderingStyle;
		import org.eclipselabs.spray.styles.generator.util.GradientUtilClass;
		
		
		/**
		 * This is a generated Style class for Spray.
		 * Description: My description
		 */
		@SuppressWarnings("all")
		public class MyStyleBase extends org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle {
		
			/**
			 * This method creates a Style and returns the defined style.
			 * Description: My description
			 */
			@Override
			public Style newStyle(Diagram diagram) {
				IGaService gaService = Graphiti.getGaService();
		
				// Creating Style with given id and description
				Style style = super.newStyle(diagram);
				style.setId("MyStyle");
				style.setDescription("My description");
		
				// transparency value
				style.setTransparency(0.5);
				
				
				// line attributes
				style.setLineVisible(true);
				style.setForeground(gaService.manageColor(diagram, IColorConstant.GRAY));
				style.setLineWidth(3);
				style.setLineStyle(LineStyle.DASHDOT);
				
				// font attributes
				String fontName = "Arial";
				int fontSize = 18;
				boolean fontItalic = true;
				boolean fontBold = true;
				style.setFont(gaService.manageFont(diagram, fontName, fontSize, fontItalic, fontBold));
				
				gaService.setRenderingStyle(style, getColorSchema());
				
				return style;
			}
		
		    /**
			 * This method returns the font color for the style. 
			 * The font color will be returned separated, because Graphiti allows just the foreground color.
			 * The foreground color will be used for lines and fonts at the same time.
			 */
			@Override
			public Color getFontColor(Diagram diagram) {
				IGaService gaService = Graphiti.getGaService();
				return gaService.manageColor(diagram, IColorConstant.BLUE);
			}
		
			 /**
			 * This method returns Color Schema of the Style
			 */
			public AdaptedGradientColoredAreas getColorSchema() {
				final AdaptedGradientColoredAreas agca =
				StylesFactory.eINSTANCE.createAdaptedGradientColoredAreas();
				agca.setDefinedStyleId("LWC2012CorporateStyle_Color_Schema_ID");
				agca.setGradientType(IGradientType.HORIZONTAL);
				agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
															GradientUtilClass.getOneColorGradient("000000"));
															
				agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
															GradientUtilClass.getOneColorGradient("006400"));
				agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
															GradientUtilClass.getOneColorGradient("006464"));
				agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_ACTION_ALLOWED,
															GradientUtilClass.getOneColorGradient("0064C8"));
				agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_ACTION_FORBIDDEN,
															GradientUtilClass.getOneColorGradient("640000"));
				return agca;
			}
		}
	'''
		
	def private styleModelMin() '''
		style MyMinStyle {
		}
	'''

	@Test
	def testGenerateStyleModelMin() {
		val fsa = new InMemoryFileSystemAccess
        val JavaGenFile java = genFileProvider.get()
        java.access = fsa
		java.doGenerateStyle(styleModelMin.parse.styleContainerElement.filter(typeof(Style)).head)
		val entries = fsa.files.entrySet
		assertEquals("Expected file count generated", 1, entries.size)
		assertEquals("In expected file output generated", "DEFAULT_OUTPUTstyles/MyMinStyleBase.java", entries.head.key)
		assertEquals("Expected file content generated", styleModelMinExpectedContent.toString, entries.head.value.toString)
	}
	
	def private styleModelMinExpectedContent() '''
		/**
		 * This is a generated Style class for Spray.
		 */
		package styles;
		
		import org.eclipse.graphiti.mm.pictograms.Diagram;
		import org.eclipse.graphiti.mm.algorithms.styles.Style;
		import org.eclipse.graphiti.mm.algorithms.styles.Color;
		import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
		import org.eclipse.graphiti.services.Graphiti;
		import org.eclipse.graphiti.services.IGaService;
		import org.eclipse.graphiti.util.ColorConstant;
		import org.eclipse.graphiti.util.IColorConstant;
		import org.eclipse.graphiti.mm.algorithms.styles.AdaptedGradientColoredAreas;
		import org.eclipse.graphiti.util.IGradientType;
		import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
		import org.eclipse.graphiti.util.IPredefinedRenderingStyle;
		import org.eclipselabs.spray.styles.generator.util.GradientUtilClass;
		
		
		/**
		 * This is a generated Style class for Spray.
		 * Description: 
		 */
		@SuppressWarnings("all")
		public class MyMinStyleBase extends org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle {
		
			/**
			 * This method creates a Style and returns the defined style.
			 * Description: 
			 */
			@Override
			public Style newStyle(Diagram diagram) {
				IGaService gaService = Graphiti.getGaService();
		
				// Creating Style with given id and description
				Style style = super.newStyle(diagram);
				style.setId("MyMinStyle");
				style.setDescription("");
		
				// transparency value
				
				// background attributes
				
				// line attributes
				
				// font attributes
				String fontName = style.getFont().getName();
				int fontSize = style.getFont().getSize();
				boolean fontItalic = style.getFont().isItalic();
				boolean fontBold = style.getFont().isBold();
				style.setFont(gaService.manageFont(diagram, fontName, fontSize, fontItalic, fontBold));
				
				
				return style;
			}
		
		    /**
			 * This method returns the font color for the style. 
			 * The font color will be returned separated, because Graphiti allows just the foreground color.
			 * The foreground color will be used for lines and fonts at the same time.
			 */
			@Override
			public Color getFontColor(Diagram diagram) {
				return super.getFontColor(diagram);
			}
		
			 /**
			 * This method returns Color Schema of the Style
			 */
			public AdaptedGradientColoredAreas getColorSchema() {
				return null;	
			}
		}
	'''		
	
	def private styleModelOther() '''
		style MyOtherStyle {
			background-color 	 = blue
			line-width       	 = 1
			line-color       	 = transparent
			font-name        	 = "Times New Roman"
		    font-color       	 = blue
		    font-italic      	 = no
		    font-bold        	 = no
		}
	'''

	@Test
	def testGenerateStyleModelOther() {
		val fsa = new InMemoryFileSystemAccess
        val JavaGenFile java = genFileProvider.get()
        java.access = fsa
		java.doGenerateStyle(styleModelOther.parse.styleContainerElement.filter(typeof(Style)).head)
		val entries = fsa.files.entrySet
		assertEquals("Expected file count generated", 1, entries.size)
		assertEquals("In expected file output generated", "DEFAULT_OUTPUTstyles/MyOtherStyleBase.java", entries.head.key)
		assertEquals("Expected file content generated", styleModelOtherExpectedContent.toString, entries.head.value.toString)
	}
	
	def private styleModelOtherExpectedContent() '''
		/**
		 * This is a generated Style class for Spray.
		 */
		package styles;
		
		import org.eclipse.graphiti.mm.pictograms.Diagram;
		import org.eclipse.graphiti.mm.algorithms.styles.Style;
		import org.eclipse.graphiti.mm.algorithms.styles.Color;
		import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
		import org.eclipse.graphiti.services.Graphiti;
		import org.eclipse.graphiti.services.IGaService;
		import org.eclipse.graphiti.util.ColorConstant;
		import org.eclipse.graphiti.util.IColorConstant;
		import org.eclipse.graphiti.mm.algorithms.styles.AdaptedGradientColoredAreas;
		import org.eclipse.graphiti.util.IGradientType;
		import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
		import org.eclipse.graphiti.util.IPredefinedRenderingStyle;
		import org.eclipselabs.spray.styles.generator.util.GradientUtilClass;
		
		
		/**
		 * This is a generated Style class for Spray.
		 * Description: 
		 */
		@SuppressWarnings("all")
		public class MyOtherStyleBase extends org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle {
		
			/**
			 * This method creates a Style and returns the defined style.
			 * Description: 
			 */
			@Override
			public Style newStyle(Diagram diagram) {
				IGaService gaService = Graphiti.getGaService();
		
				// Creating Style with given id and description
				Style style = super.newStyle(diagram);
				style.setId("MyOtherStyle");
				style.setDescription("");
		
				// transparency value
				
				// background attributes
				style.setFilled(true);
				style.setBackground(gaService.manageColor(diagram, IColorConstant.BLUE));
				
				// line attributes
				style.setLineVisible(false);
				style.setForeground(null);
				
				// font attributes
				String fontName = "Times New Roman";
				int fontSize = style.getFont().getSize();
				boolean fontItalic = false;
				boolean fontBold = false;
				style.setFont(gaService.manageFont(diagram, fontName, fontSize, fontItalic, fontBold));
				
				
				return style;
			}
		
		    /**
			 * This method returns the font color for the style. 
			 * The font color will be returned separated, because Graphiti allows just the foreground color.
			 * The foreground color will be used for lines and fonts at the same time.
			 */
			@Override
			public Color getFontColor(Diagram diagram) {
				IGaService gaService = Graphiti.getGaService();
				return gaService.manageColor(diagram, IColorConstant.BLUE);
			}
		
			 /**
			 * This method returns Color Schema of the Style
			 */
			public AdaptedGradientColoredAreas getColorSchema() {
				return null;	
			}
		}
	'''
	
	def private styleModelInheritence() '''
		style MyParentStyle {
			background-color 	 = yellow
		    font-color       	 = blue
		}

		style MyChildStyle extends MyParentStyle {
		    font-color       	 = black
		}
	'''

	@Test
	def testGenerateStyleModelInheritence() {
		val fsa = new InMemoryFileSystemAccess
        val JavaGenFile java = genFileProvider.get()
        java.access = fsa
		styleModelInheritence.parse.styleContainerElement.filter(typeof(Style)).forEach(style|java.doGenerateStyle(style))
		val entries = fsa.files.entrySet
		assertEquals("Expected file count generated", 2, entries.size)
		val parentEntry = entries.findFirst(e|e.key.equals("DEFAULT_OUTPUTstyles/MyParentStyleBase.java"))
		assertNotNull(/*"In expected file output generated for parent style", "DEFAULT_OUTPUTstyles/MyParentStyle.java",*/ parentEntry)
		val childEntry = entries.findFirst(e|e.key.equals("DEFAULT_OUTPUTstyles/MyChildStyleBase.java"))
		assertNotNull(/*"In expected file output generated for child style", "DEFAULT_OUTPUTstyles/MyChildStyle.java",*/ childEntry)
		assertEquals("Expected file content generated for child style", styleModelInheritenceExpectedChildContent.toString, childEntry.value.toString)
	}	
	
	def private styleModelInheritenceExpectedChildContent() '''
		/**
		 * This is a generated Style class for Spray.
		 */
		package styles;
		
		import org.eclipse.graphiti.mm.pictograms.Diagram;
		import org.eclipse.graphiti.mm.algorithms.styles.Style;
		import org.eclipse.graphiti.mm.algorithms.styles.Color;
		import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
		import org.eclipse.graphiti.services.Graphiti;
		import org.eclipse.graphiti.services.IGaService;
		import org.eclipse.graphiti.util.ColorConstant;
		import org.eclipse.graphiti.util.IColorConstant;
		import styles.MyParentStyle;
		import org.eclipse.graphiti.mm.algorithms.styles.AdaptedGradientColoredAreas;
		import org.eclipse.graphiti.util.IGradientType;
		import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
		import org.eclipse.graphiti.util.IPredefinedRenderingStyle;
		import org.eclipselabs.spray.styles.generator.util.GradientUtilClass;
		
		
		/**
		 * This is a generated Style class for Spray.
		 * Description: 
		 */
		@SuppressWarnings("all")
		public class MyChildStyleBase extends MyParentStyle {
		
			/**
			 * This method creates a Style and returns the defined style.
			 * Description: 
			 */
			@Override
			public Style newStyle(Diagram diagram) {
				IGaService gaService = Graphiti.getGaService();
		
				// Creating Style with given id and description
				Style style = super.newStyle(diagram);
				style.setId("MyChildStyle");
				style.setDescription("");
		
				// transparency value
				
				// background attributes
				
				// line attributes
				
				// font attributes
				String fontName = style.getFont().getName();
				int fontSize = style.getFont().getSize();
				boolean fontItalic = style.getFont().isItalic();
				boolean fontBold = style.getFont().isBold();
				style.setFont(gaService.manageFont(diagram, fontName, fontSize, fontItalic, fontBold));
				
				
				return style;
			}
		
		    /**
			 * This method returns the font color for the style. 
			 * The font color will be returned separated, because Graphiti allows just the foreground color.
			 * The foreground color will be used for lines and fonts at the same time.
			 */
			@Override
			public Color getFontColor(Diagram diagram) {
				IGaService gaService = Graphiti.getGaService();
				return gaService.manageColor(diagram, IColorConstant.BLACK);
			}
		
			 /**
			 * This method returns Color Schema of the Style
			 */
			public AdaptedGradientColoredAreas getColorSchema() {
				return null;	
			}
		}
	'''
	
	def private gradientModel() '''
		gradient MyGradient {
			area (color = blue, offset = 0.0)
			area (color = gray, offset = 1.0)
		}
		
		style MyStyle {
			background-color = MyGradient
		}		
	'''

	@Test
	def testGenerateGradientModel() {
		val fsa = new InMemoryFileSystemAccess
        val JavaGenFile java = genFileProvider.get()
        java.access = fsa
		java.doGenerateStyle(gradientModel.parse.styleContainerElement.filter(typeof(Style)).head)
		java.doGenerateGradient(gradientModel.parse.styleContainerElement.filter(typeof(Gradient)).head)
		val entries = fsa.files.entrySet
		assertEquals("Expected file count generated", 2, entries.size)
		val gradientEntry = entries.findFirst(e|e.key.equals("DEFAULT_OUTPUTgradients/MyGradientBase.java"))
		assertNotNull(/*"In expected file output generated for child style", "DEFAULT_OUTPUTgradients/MyGradient.java",*/ gradientEntry)
		assertEquals("Expected file content generated for child style", gradientModelExpectedGradientContent.toString, gradientEntry.value.toString)
		val styleEntry = entries.findFirst(e|e.key.equals("DEFAULT_OUTPUTstyles/MyStyleBase.java"))
		assertNotNull(/*"In expected file output generated for style", "DEFAULT_OUTPUTstyles/MyStyle.java",*/ styleEntry)
		assertEquals("Expected file content generated for child style", gradientModelExpectedStyleContent.toString, styleEntry.value.toString)
	}	

	def private gradientModelExpectedGradientContent() '''
		/**
		 * This is a generated Gradient class for Spray.
		 */
		package gradients;
		
		import org.eclipse.emf.common.util.EList;
		import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea;
		import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredAreas;
		import org.eclipse.graphiti.mm.algorithms.styles.LocationType;
		import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
		import org.eclipse.graphiti.util.IGradientType;
		import org.eclipselabs.spray.runtime.graphiti.styles.ISprayGradient;
		import org.eclipse.graphiti.util.IPredefinedRenderingStyle;
		import org.eclipse.graphiti.util.PredefinedColoredAreas;
		
		/**
		 * Description: 
		 */
		@SuppressWarnings("all")
		public class MyGradientBase extends PredefinedColoredAreas implements ISprayGradient {
		    
		    /**
		     * This method returns the gradient color area.
		     * Description: 
		     */
		     public GradientColoredAreas getGradientColoredAreas( ) {
		         final GradientColoredAreas gradientColoredAreas = org.eclipse.graphiti.mm.algorithms.styles.StylesFactory.eINSTANCE.createGradientColoredAreas();
		         final EList<org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();
		         addGradientColoredArea(gcas,"0000FF",0,org.eclipse.graphiti.mm.algorithms.styles.LocationType.LOCATION_TYPE_RELATIVE, "808080",100,org.eclipse.graphiti.mm.algorithms.styles.LocationType.LOCATION_TYPE_RELATIVE);
		         return gradientColoredAreas;
		     }
		
		}
	'''		
	
	def private gradientModelExpectedStyleContent() '''
		/**
		 * This is a generated Style class for Spray.
		 */
		package styles;
		
		import org.eclipse.graphiti.mm.pictograms.Diagram;
		import org.eclipse.graphiti.mm.algorithms.styles.Style;
		import org.eclipse.graphiti.mm.algorithms.styles.Color;
		import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
		import org.eclipse.graphiti.services.Graphiti;
		import org.eclipse.graphiti.services.IGaService;
		import org.eclipse.graphiti.util.ColorConstant;
		import org.eclipse.graphiti.util.IColorConstant;
		import org.eclipse.graphiti.mm.algorithms.styles.AdaptedGradientColoredAreas;
		import org.eclipse.graphiti.util.IGradientType;
		import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
		import org.eclipse.graphiti.util.IPredefinedRenderingStyle;
		import org.eclipselabs.spray.styles.generator.util.GradientUtilClass;
		
		
		/**
		 * This is a generated Style class for Spray.
		 * Description: 
		 */
		@SuppressWarnings("all")
		public class MyStyleBase extends org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle {
		
			/**
			 * This method creates a Style and returns the defined style.
			 * Description: 
			 */
			@Override
			public Style newStyle(Diagram diagram) {
				IGaService gaService = Graphiti.getGaService();
		
				// Creating Style with given id and description
				Style style = super.newStyle(diagram);
				style.setId("MyStyle");
				style.setDescription("");
		
				// transparency value
				
				
				// line attributes
				
				// font attributes
				String fontName = style.getFont().getName();
				int fontSize = style.getFont().getSize();
				boolean fontItalic = style.getFont().isItalic();
				boolean fontBold = style.getFont().isBold();
				style.setFont(gaService.manageFont(diagram, fontName, fontSize, fontItalic, fontBold));
				
				gaService.setRenderingStyle(style, getColorSchema());
				
				return style;
			}
		
		    /**
			 * This method returns the font color for the style. 
			 * The font color will be returned separated, because Graphiti allows just the foreground color.
			 * The foreground color will be used for lines and fonts at the same time.
			 */
			@Override
			public Color getFontColor(Diagram diagram) {
				return super.getFontColor(diagram);
			}
		
			 /**
			 * This method returns Color Schema of the Style
			 */
			public AdaptedGradientColoredAreas getColorSchema() {
				final AdaptedGradientColoredAreas agca =
				StylesFactory.eINSTANCE.createAdaptedGradientColoredAreas();
				agca.setDefinedStyleId("LWC2012CorporateStyle_Color_Schema_ID");
				agca.setGradientType(IGradientType.HORIZONTAL);
				agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
															new gradients.MyGradient().getGradientColoredAreas( ));
															
				return agca;
			}
		}
	'''		
}