package org.eclipselabs.spray.runtime.graphiti.styles;

import java.awt.Color;
import java.lang.reflect.Field;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredAreas;
import org.eclipse.graphiti.mm.algorithms.styles.LocationType;
import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.PredefinedColoredAreas;

public class GradientUtilClass extends PredefinedColoredAreas {

    public static String colorConstantToHexString(String colorName) {

        Class<?> colorConstant = org.eclipse.graphiti.util.ColorConstant.class;

        try {
            Field f = colorConstant.getField(colorName.toUpperCase());
            ColorConstant constant = (ColorConstant) f.get(colorConstant);
            Color color = new Color(constant.getRed(), constant.getGreen(), constant.getBlue());
            return Integer.toHexString((color.getRGB() & 0xffffff) | 0x1000000).substring(1).toUpperCase();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Color color = new Color(255, 255, 255);
        return Integer.toHexString((color.getRGB() & 0xffffff) | 0x1000000).substring(1).toUpperCase();

    }

    public static String RGBColorToHexString(int red, int green, int blue) {
        Color color = new Color(red, green, blue);
        return Integer.toHexString((color.getRGB() & 0xffffff) | 0x1000000).substring(1).toUpperCase();
    }

    public static GradientColoredAreas getOneColorGradient(String color) {

        // Create Gradient
        final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE.createGradientColoredAreas();

        final EList<GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();

        addGradientColoredArea(gcas, color, 0, LocationType.LOCATION_TYPE_RELATIVE, color, 100, LocationType.LOCATION_TYPE_RELATIVE);

        return gradientColoredAreas;

    }

//    	public static GradientColoredAreas getOneColorGradient(String colorName){
//    		// Create Gradient
//    			final GradientColoredAreas gradientColoredAreas = 
//    						StylesFactory.eINSTANCE.createGradientColoredAreas();
//    
//    			final EList<GradientColoredArea> gcas =
//    						gradientColoredAreas.getGradientColor();
//    				
//    			String hexColor = colorConstantToHexString(colorName);
//    				
//    			addGradientColoredArea(gcas,hexColor,0,LocationType.LOCATION_TYPE_RELATIVE,
//    									   hexColor,100,LocationType.LOCATION_TYPE_RELATIVE);
//    				
//    			return gradientColoredAreas;
//    		
//    	}

}
