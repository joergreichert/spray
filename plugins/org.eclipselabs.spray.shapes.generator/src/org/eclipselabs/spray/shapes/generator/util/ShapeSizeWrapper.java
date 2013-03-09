package org.eclipselabs.spray.shapes.generator.util;

public class ShapeSizeWrapper {

	private int width;
	private int heigth;

	public ShapeSizeWrapper(int width, int heigth) {
		this.width = width;
		this.heigth = heigth;
	}

	public void add(ShapeSizeWrapper shapeSize) {
		width = width + shapeSize.getWidth();
		heigth = heigth + shapeSize.getHeigth();
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
}
