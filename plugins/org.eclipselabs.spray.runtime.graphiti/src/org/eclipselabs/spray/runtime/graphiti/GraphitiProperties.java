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
package org.eclipselabs.spray.runtime.graphiti;

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IPeService;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService.SprayAlignment;

public class GraphitiProperties {

    static private IPeService peService = Graphiti.getPeService();

    static public void set(PictogramElement shape, String key, String value) {
        peService.setPropertyValue(shape, key, value);
    }

    static public void set(PictogramElement shape, String key, int value) {
        peService.setPropertyValue(shape, key, Integer.toString(value));
    }

    static public void set(PictogramElement shape, String key, boolean value) {
        peService.setPropertyValue(shape, key, Boolean.toString(value));
    }

    static public String get(PictogramElement shape, String key) {
        return peService.getPropertyValue(shape, key);
    }

    static public void set(PictogramElement shape, String key, SprayAlignment value) {
        peService.setPropertyValue(shape, key, value.name());
    }

    static public SprayAlignment getSprayAlignmentValue(PictogramElement shape, String key) {
        String intString = peService.getPropertyValue(shape, key);
        SprayAlignment result;
        try {
            result = SprayAlignment.valueOf(intString);
        } catch (Exception e) {
            result = SprayAlignment.NONE;
        }
        return result;
    }

    static public int getIntValue(PictogramElement shape, String key) {
        String intString = peService.getPropertyValue(shape, key);
        int result;
        try {
            result = Integer.parseInt(intString);
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }

    static public boolean getBooleanValue(PictogramElement shape, String key) {
        String bool = peService.getPropertyValue(shape, key);
        boolean result = false;
        try {
            result = Boolean.parseBoolean(bool);
        } catch (NumberFormatException e) {
            result = false;
        }
        return result;
    }

}
