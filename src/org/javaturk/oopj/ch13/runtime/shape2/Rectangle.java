package org.javaturk.oopj.ch13.runtime.shape2;

public class Rectangle implements Shape {
	double shortSide;
	double longSide;	

	public Rectangle(double shortSide, double longSide){
		if(shortSide < 0)
			throw new IllegalArgumentException("Can not pass negative values: " + shortSide);
		
		if(longSide < 0)
			throw new IllegalArgumentException("Can not pass negative values: " + longSide);
		
		this.shortSide = shortSide;
		this.longSide = longSide;
	}

	public double calculateArea() {
		return shortSide * longSide;
	}

	public double calculateCircumference() {
		return shortSide + longSide;
	}

	public void draw() {
		System.out.println("Drawing the rectangle.");
	}

	public void erase() {
		System.out.println("Erasing the rectangle.");
	}
}
