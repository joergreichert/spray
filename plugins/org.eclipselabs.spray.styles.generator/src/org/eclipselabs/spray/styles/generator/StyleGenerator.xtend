/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.styles.generator

import org.eclipselabs.spray.generator.common.ProjectProperties
import org.eclipselabs.spray.styles.Color
import org.eclipselabs.spray.styles.ColorConstantRef
import org.eclipselabs.spray.styles.ColorWithTransparency
import org.eclipselabs.spray.styles.GradientAllignment
import org.eclipselabs.spray.styles.GradientRef
import org.eclipselabs.spray.styles.LineStyle
import org.eclipselabs.spray.styles.RGBColor
import org.eclipselabs.spray.styles.Style
import org.eclipselabs.spray.styles.StyleLayout
import org.eclipselabs.spray.styles.Transparent
import org.eclipselabs.spray.styles.YesNoBool
import org.eclipselabs.spray.styles.generator.util.GradientUtilClass
import org.eclipselabs.spray.xtext.generator.FileGenerator
import org.eclipselabs.spray.xtext.generator.filesystem.GenFile
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile
import javax.inject.Inject

class StyleGenerator extends FileGenerator<Style> {
    @Inject extension GradientGenerator gradientGenerator

    def filepath(Style s) {
        s.packagePath + s.className + ".java"
    }

    def gapClassName(Style s) {
        s.name.toFirstUpper
    }

    def className(Style s) {
        s.gapClassName + "Base"
    }

    def packageName(Style s) {
        ProjectProperties::stylesPackage
    }

    def packagePath(Style s) {
        ProjectProperties::toPath(ProjectProperties::stylesPackage)
    }

    override generate(Style style, GenFile genFile) {
        (genFile as JavaGenFile).setPackageAndClass(style.packageName, style.gapClassName)
        super.generate(style, genFile)
    }

    override CharSequence generateBaseFile(Style style) {
        compile(style)
    }

    override CharSequence generateExtensionFile(Style style) {
        mainExtensionPointFile(style)
    }

    def mainExtensionPointFile(Style style) '''
        «extensionHeader(this)»
        package «style.packageName»;
         
        public class «style.gapClassName» extends «style.className» {
         
        }
    '''

    def compile(Style s) {
        '''
            «s.head»
            
            «s.body»
        '''
    }

    def head(Style s) {

        '''
            /**
             * This is a generated Style class for Spray.
             */
            package «s.packageName»;
            
            import org.eclipse.graphiti.mm.pictograms.Diagram;
            import org.eclipse.graphiti.mm.algorithms.styles.Style;
            import org.eclipse.graphiti.mm.algorithms.styles.Color;
            import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
            import org.eclipse.graphiti.services.Graphiti;
            import org.eclipse.graphiti.services.IGaService;
            import org.eclipse.graphiti.util.ColorConstant;
            import org.eclipse.graphiti.util.IColorConstant;
            «IF s.superStyle == null»
            «ELSE»
                import «s.superStyle.qualifiedName»;
            «ENDIF»
            «IF s.superStyleFromDsl != null»
                import «s.packageName».«s.superStyleFromDsl.name»;
            «ENDIF»
            import org.eclipse.graphiti.mm.algorithms.styles.AdaptedGradientColoredAreas;
            import org.eclipse.graphiti.util.IGradientType;
            import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
            import org.eclipse.graphiti.util.IPredefinedRenderingStyle;
            import org.eclipselabs.spray.styles.generator.util.GradientUtilClass;
        '''
    }

    def body(Style s) {
        '''
            /**
             * This is a generated Style class for Spray.
             * Description: «s.description»
             */
            @SuppressWarnings("all")
            public class «s.className» extends «s.createSuperStyle» {
                
                /**
                 * The IGaService instance for the whole class.
                 */
                private IGaService gaService = Graphiti.getGaService();
                
                /**
                 * This method creates and defines a Style and returns it. 
                 * Description: «s.description»
                 * 
                 * @return The defined Style
                 */
                @Override
                public Style newStyle(Diagram diagram) {
                    Style style = super.newStyle(diagram);
                    style.setId("«s.name»");
                    style.setDescription("«s.description»");
                    
                    defineStyleTransparency(diagram, style);
                    defineBackground(diagram, style);
                    defineLineAttributes(diagram, style);
                    defineFontAttributes(diagram, style);
                    
                    return style;
                }
                
                /**
                 * This method will be called from the newStyle-method for defining the Style transparency.
                 * @param diagram the diagram attribute
                 * @param style the Style attribute, where the transparency will be set.
                 */
                protected void defineStyleTransparency(Diagram diagram, Style style) {
                    «s.layout.createTransparencyAttributes»
                }
                
                /**
                 * This method will be called from the newStyle-method for defining the Style background.
                 * If a gradient is been used, then a color schema will be set for the background.
                 * @param diagram the diagram attribute
                 * @param style the Style attribute, where the background will be set.
                 */
                protected void defineBackground(Diagram diagram, Style style) {
                    «IF s.layout.checkColorSchemaNecessary»
                        «setColorSchema»
                    «ELSE»
                        «s.layout.createBackgroundAttributes»
                    «ENDIF»
                }
                
                /**
                 * This method will be called from the newStyle-method for defining the Style line attributes.
                 * @param diagram the diagram attribute
                 * @param style the Style attribute, where the line attributes will be set.
                 */
                protected void defineLineAttributes(Diagram diagram, Style style) {
                    «s.layout.createLineAttributes»
                }
                
                /**
                 * This method will be called from the newStyle-method for defining the Style font attributes.
                 * @param diagram the diagram attribute
                 * @param style the Style attribute, where the font attributes will be set.
                 */
                protected void defineFontAttributes(Diagram diagram, Style style) {
                    «s.layout.createFontAttributes»
                }
                
                /**
                 * This method returns the font color for the style. 
                 * The font color will be returned separatly, because Graphiti allows just the foreground color.
                 * The foreground color will be used for lines and fonts at the same time.
                 */
                @Override
                public Color getFontColor(Diagram diagram) {
                    «s.layout.createFontColor»
                }
                
                /**
                 * This method returns Color Schema of the Style
                 */
                public AdaptedGradientColoredAreas getColorSchema() {
                    «s.layout.createStyleColorSchema(s)»
                }
            }
        '''
    }

    def createSuperStyle(Style s) {
        if (s.superStyle == null) {
            if (s.superStyleFromDsl == null) {
                "org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle"
            } else {
                s.superStyleFromDsl.name;
            }
        } else {
            s.superStyle.simpleName
        }
    }

    def getStyle(Style s) {
        if (s.superStyle == null) {
            if (s.superStyleFromDsl == null) {
                '''gaService.createStyle(diagram, "«s.name»");'''
            } else {
                '''super.getStyle(diagram);'''
            }
        } else {
            '''super.getStyle(diagram);'''
        }
    }

    def createTransparencyAttributes(StyleLayout l) {
        '''
            «IF !(l == null || l.transparency == Double::MIN_VALUE)»
                style.setTransparency(«l.transparency»);
            «ENDIF»
        '''
    }

    def createBackgroundAttributes(StyleLayout l) {
        '''
            «IF l == null || l.background == null»
            «ELSEIF l.background instanceof Transparent»
                style.setFilled(false);
                style.setBackground(null);
            «ELSE»
                style.setFilled(true);
                style.setBackground(gaService.manageColor(diagram, «l.background.createColorValue»));
            «ENDIF»
        '''
    }

    def createLineAttributes(StyleLayout l) {
        '''
            «IF l == null || l.lineColor == null»
            «ELSEIF l.lineColor instanceof Transparent»
                style.setLineVisible(false);
                style.setForeground(null);
            «ELSE»
                style.setLineVisible(true);
                style.setForeground(gaService.manageColor(diagram, «l.lineColor.createColorValue»));
                «IF l.lineWidth > 0»
                    style.setLineWidth(«Math::max(l.lineWidth, 1)»);
                «ENDIF»
                «IF l.lineStyle != LineStyle::NULL»
                    style.setLineStyle(LineStyle.«l.lineStyle.name»);
                «ENDIF»
            «ENDIF»
        '''
    }

    def createFontAttributes(StyleLayout l) {
        '''
            «IF l == null || l.fontName == null»
                String fontName = style.getFont().getName();
            «ELSE»
                String fontName = "«l.fontName»";
            «ENDIF»
            «IF l == null || l.fontSize == Integer::MIN_VALUE»
                int fontSize = style.getFont().getSize();
            «ELSE»
                int fontSize = «l.fontSize»;
            «ENDIF»
            «IF l == null || l.fontItalic == YesNoBool::NULL»
                boolean fontItalic = style.getFont().isItalic();
            «ELSE»
                boolean fontItalic = «l.fontItalic.transformYesNoToBoolean»;
            «ENDIF»
            «IF l == null || l.fontBold == YesNoBool::NULL»
                boolean fontBold = style.getFont().isBold();
            «ELSE»
                boolean fontBold = «l.fontBold.transformYesNoToBoolean»;
            «ENDIF»
            style.setFont(gaService.manageFont(diagram, fontName, fontSize, fontItalic, fontBold));
        '''
    }

    def createFontColor(StyleLayout l) {
        if (l == null || l.fontColor == null) {
            '''return super.getFontColor(diagram);'''
        } else {
            l.fontColor.createFontColor
        }
    }

    def createFontColor(ColorWithTransparency c) {
        '''
            IGaService gaService = Graphiti.getGaService();
            return gaService.manageColor(diagram, «c.createColorValue»);
        '''
    }

    def transformYesNoToBoolean(YesNoBool yesNo) {
        if(yesNo == YesNoBool::YES) "true" else "false"
    }

    def dispatch createColorValue(Transparent c) {
        "null"
    }

    def dispatch createColorValue(ColorConstantRef c) {
        '''IColorConstant.«c.value.name»'''
    }

    def dispatch createColorValue(RGBColor c) {
        '''new ColorConstant(«c.red», «c.green», «c.blue»)'''
    }

    def createStyleColorSchema(StyleLayout l, Style s) {
        var gradientOrientation = l.gradient_orientation.mapGradientOrientation
        '''
            «IF l.checkColorSchemaNecessary == false»
                return null;
                «ELSE»
                final AdaptedGradientColoredAreas agca =
                StylesFactory.eINSTANCE.createAdaptedGradientColoredAreas();
                agca.setDefinedStyleId("«s.createStyleGradientID»");
                agca.setGradientType(«gradientOrientation»);
                agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT, «l.background.gradientColoredAreas»);
                «IF l.highlighting != null»
                    «IF l.highlighting.selected != null»
                        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED, «l.highlighting.selected.gradientColoredAreas»);
                    «ENDIF»
                    «IF l.highlighting.multiselected != null»
                        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED, «l.highlighting.multiselected.gradientColoredAreas»);
                    «ENDIF»
                    «IF l.highlighting.allowed != null»
                        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_ACTION_ALLOWED, «l.highlighting.allowed.gradientColoredAreas»);
                    «ENDIF»
                    «IF l.highlighting.unallowed != null»
                        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_ACTION_FORBIDDEN, «l.highlighting.unallowed.gradientColoredAreas»);
                    «ENDIF»
                «ENDIF»
                return agca;
                «ENDIF»
        '''
    }

    def mapGradientOrientation(GradientAllignment ga) {
        if (ga == null) {
            '''IGradientType.«GradientAllignment::VERTICAL.name»'''
        } else {
            if (ga == GradientAllignment::HORIZONTAL) {
                '''IGradientType.«GradientAllignment::HORIZONTAL.name»'''
            } else {
                '''IGradientType.«GradientAllignment::VERTICAL.name»'''
            }
        }
    }

    def checkColorSchemaNecessary(StyleLayout l) {
        if ((l.highlighting == null) && !(l.background instanceof GradientRef)) {
            return false
        } else {
            return true
        }
    }

    def createStyleGradientID(Style s) {
        '''«s.className»_Color_Schema_ID'''
    }

    def setColorSchema() {
        '''gaService.setRenderingStyle(style, getColorSchema());'''
    }

    def dispatch gradientColoredAreas(GradientRef cg) {
        if (cg.gradientRef != null) {
            '''new «cg.gradientRef.qualifiedName»().getGradientColoredAreas( )'''
        } else {
            '''new «gradientGenerator.packageName(null)».«cg.gradientRefFromDsl.name»().getGradientColoredAreas( )'''
        }
    }

    def dispatch gradientColoredAreas(Color cg) {
        '''GradientUtilClass.getOneColorGradient("«cg.createColorHexValue»")'''
    }

    def dispatch gradientColoredAreas(Transparent cg) {
        '''GradientUtilClass.getOneColorGradient(«cg»)'''
    }

    def dispatch createColorHexValue(ColorConstantRef c) {
        '''«GradientUtilClass::colorConstantToHexString(c)»'''
    }

    def dispatch createColorHexValue(RGBColor c) {
        '''«GradientUtilClass::RGBColorToHexString(c)»'''
    }
}
