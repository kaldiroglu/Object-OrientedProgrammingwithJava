package org.javaturk.oopj.ch04.sealing.shape;

public final class FilledRectangle extends Rectangle {

	private String color;

	public FilledRectangle(String name, double shortSide, double longSide, String color) {
		super(name, shortSide, longSide);
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle and filling it with " + color + ".");
	}
}
