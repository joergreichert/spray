package org.eclipselabs.spray.shapes.ui.syntaxcoloring;

import java.util.HashSet;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class ShapeTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	private HashSet<String> layoutShapeDefinition = new HashSet<String>();
	private HashSet<String> layoutShapeKeywords = new HashSet<String>();
	private HashSet<String> layoutShapeAttribKeywords = new HashSet<String>();

	public ShapeTokenToAttributeIdMapper() {
		layoutShapeDefinition.add("'shape'");
		layoutShapeDefinition.add("'connection'");
		layoutShapeKeywords.add("'ellipse'");
		layoutShapeKeywords.add("'rectangle'");
		layoutShapeKeywords.add("'rounded-rectangle'");
		layoutShapeKeywords.add("'polygon'");
		layoutShapeKeywords.add("'polyline'");
		layoutShapeKeywords.add("'line'");
		layoutShapeKeywords.add("'placing'");
		layoutShapeAttribKeywords.add("'style'");
		layoutShapeAttribKeywords.add("'size-min'");
		layoutShapeAttribKeywords.add("'size-max'");
		layoutShapeAttribKeywords.add("'stretching'");
		layoutShapeAttribKeywords.add("'proportional'");
		layoutShapeAttribKeywords.add("'connection-type'");
		layoutShapeAttribKeywords.add("'position'");
		layoutShapeAttribKeywords.add("'size'");
		layoutShapeAttribKeywords.add("'point'");
		layoutShapeAttribKeywords.add("'curve'");
		layoutShapeAttribKeywords.add("'align'");
		layoutShapeAttribKeywords.add("'anchor'");
	}

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if (layoutShapeDefinition.contains(tokenName)) {
			return ShapeHighlightingConfiguration.KEYWORDSHAPEDEF_ID;
		}
		if (layoutShapeKeywords.contains(tokenName)) {
			return ShapeHighlightingConfiguration.KEYWORD_ID;
		}
		if (layoutShapeAttribKeywords.contains(tokenName)) {
			return ShapeHighlightingConfiguration.KEYWORDATTRIB_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}

	public String getId(int tokenType) {
		return getMappedValue(tokenType);
	}
}