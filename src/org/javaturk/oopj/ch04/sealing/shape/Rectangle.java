package org.javaturk.oopj.ch04.sealing.shape;

public sealed class Rectangle extends Shape permits FilledRectangle {
	
	protected double shortSide;
	protected double longSide;

	public Rectangle(String name, double shortSide, double longSide) {
		super(name);
		this.shortSide = shortSide;
		this.longSide = longSide;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle.");
	}
}
