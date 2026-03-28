package org.javaturk.oopj.ch08.sealing.shape;

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

	@Override
	public void erase()  {
		System.out.println("Erasing a rectangle.");
	}

	@Override
	public double calculateArea() {
		return shortSide * longSide;
	}

	@Override
	public double calculateCircumference() {
		return 2 * (shortSide + longSide);
	}
}
