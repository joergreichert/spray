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
package org.eclipselabs.spray.generator.common;

import java.io.File;
import java.util.Date;


public class GeneratorUtil {

    public static String gen_dir() {
        return ProjectProperties.getSrcGenPath();
        //	    return "src-gen";
    }

    public static String man_dir() {
        return ProjectProperties.getSrcManPath();
        //	    return "src";
    }

    protected static String diagramPackage = "org.spray.examples.businessdomain.diagram";

    //	public void setDiagramPackage(String name ){
    //	    diagramPackage = name;
    //	}
    public static String main_package() {
        return ProjectProperties.getMainPackage();
    }

    public static String pluginId() {
        return ProjectProperties.getPluginId();
    }

    public static String diagram_package() {
        return ProjectProperties.getDiagramPackage();
    }

    public static String feature_package() {
        return ProjectProperties.getFeaturePackage();
    }

    public static String property_package() { //  GLOBALVAR property_package;
        return ProjectProperties.getPropertyPackage();
    }

    public static String styles_package() { //  GLOBALVAR property_package;
        return ProjectProperties.getStylesPackage();
    }

    public static String shapes_package() { //  GLOBALVAR property_package;
        return ProjectProperties.getShapesPackage();
    }

    public static String util_package() {
        return ProjectProperties.getUtilPackage();
    }

    public static String base(String name) {
        return name.split("\\.")[0];
    }

    //    public static String constainerClass(ContainerInSpray container) {
    //        if (container.getLayout().getFigure().equalsIgnoreCase("rectangle")) {
    //            return "SprayRectangleContainer";
    //        } else if (container.getLayout().getFigure().equalsIgnoreCase("Diamond")) {
    //            return "SprayDiamondContainer";
    //        } else if (container.getLayout().getFigure().equalsIgnoreCase("PmwCalculationConcept")) {
    //            return "SprayPmwCalcContainer";
    //        } else if (container.getLayout().getFigure().equalsIgnoreCase("PmwCalculationPart")) {
    //            return "SprayPmwCalcContainer";
    //        } else if (container.getLayout().getFigure().equalsIgnoreCase("PmwProduct")) {
    //            return "SprayConceptContainer";
    //        } else if (container.getLayout().getFigure().equalsIgnoreCase("RequestSpecConcept")) {
    //            return "SprayPmwRequestContainer";
    //        } else {
    //            return "SprayRectangleContainer";
    //        }
    //    }

    public static String timestamp() {
        if (ProjectProperties.getHeaderTimestamp()) {
            return "on " + new Date() + " ";
        } else {
            return "";
        }
    }

    public static boolean fileExist(String path) {
        File f = new File(path);
        return f.exists();
    }
}
