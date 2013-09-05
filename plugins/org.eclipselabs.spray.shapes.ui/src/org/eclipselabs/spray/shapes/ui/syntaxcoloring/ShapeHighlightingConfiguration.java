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
package org.eclipselabs.spray.shapes.ui.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class ShapeHighlightingConfiguration extends DefaultHighlightingConfiguration {

	private static final RGB   RGB_DARKGREEN 		= 	new RGB(46,  139, 87);
    private static final RGB   RGB_ORANGE 			= 	new RGB(255, 140, 000);
    private static final RGB   RGB_RED 				= 	new RGB(178, 34,  34);
    
    public static final String KEYWORDSHAPEDEF_ID 	= 	"KeywordsShapeDefinition";
    public static final String KEYWORD_ID  			= 	"KeywordsShapes";
    public static final String KEYWORDATTRIB_ID 	= 	"KeywordsAttribShapes";

    @Override
    public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(PUNCTUATION_ID, "Punctuation character", punctuationTextStyle());
		acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", commentTextStyle());
		acceptor.acceptDefaultHighlighting(STRING_ID, "String", stringTextStyle());
		// acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number", numberTextStyle());
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(INVALID_TOKEN_ID, "Invalid Symbol", errorTextStyle());

		acceptor.acceptDefaultHighlighting(KEYWORDSHAPEDEF_ID, "keywordsShapeDef", keywordShapeDefTextStyle());
    	acceptor.acceptDefaultHighlighting(KEYWORD_ID, "keywordsShape", keywordTextStyle());
        acceptor.acceptDefaultHighlighting(KEYWORDATTRIB_ID, "keywordsAttributes", keywordAttribTextStyle());
    }

    public TextStyle keywordShapeDefTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setStyle(SWT.BOLD);
        textStyle.setColor(RGB_DARKGREEN);
        return textStyle;
    }
    
    public TextStyle keywordTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setStyle(SWT.BOLD);
        textStyle.setColor(RGB_ORANGE);
        return textStyle;
    }
    
    public TextStyle keywordAttribTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setStyle(SWT.BOLD);
        textStyle.setColor(RGB_RED);
        return textStyle;
    }
}
