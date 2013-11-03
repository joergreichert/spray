package org.eclipselabs.spray.shapes.tests.util

public class LineEndingNormalizer {

	def String normalizeLineEndings(CharSequence initial) {
		return initial.toString.replaceAll("(\r\n|\r)", "\n").trim;
	}
}