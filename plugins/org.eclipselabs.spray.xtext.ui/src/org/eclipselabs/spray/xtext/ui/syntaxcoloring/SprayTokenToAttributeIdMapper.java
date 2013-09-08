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
package org.eclipselabs.spray.xtext.ui.syntaxcoloring;

import java.util.HashSet;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class SprayTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

    private HashSet<String> layoutKeywords = new HashSet<String>();

    public SprayTokenToAttributeIdMapper() {
        layoutKeywords.add("'text'");
        layoutKeywords.add("'container'");
        layoutKeywords.add("'width'");
        layoutKeywords.add("'connection'");
        layoutKeywords.add("'color'");
        layoutKeywords.add("'fill'");
        layoutKeywords.add("'line'");
        layoutKeywords.add("'bold'");
        layoutKeywords.add("'italic'");
        layoutKeywords.add("'icon'");
        layoutKeywords.add("'shape'");
        //        for (Color color : Color.values()) {
        //            System.out.println(color.getLiteral() + "::" + color.getName());
        //            layoutKeywords.add("'" + color.getName().toLowerCase() + "'");
        //        }
    }

    @Override
    protected String calculateId(String tokenName, int tokenType) {
        if (layoutKeywords.contains(tokenName)) {
            return SprayHighlightingConfiguration.LAYOUT_ID;
        }
        return super.calculateId(tokenName, tokenType);
    }

    public String getId(int tokenType) {
        return getMappedValue(tokenType);
    }

}
