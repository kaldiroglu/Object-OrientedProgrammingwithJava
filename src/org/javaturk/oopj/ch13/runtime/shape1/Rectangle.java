package org.javaturk.oopj.ch13.runtime.shape1;

public class Rectangle implements Shape {
	double shortSide;
	double longSide;	

	public Rectangle(double shortSide, double longSide) throws NegativeArgumentException {
		if(shortSide < 0)
			throw new NegativeArgumentException("Can not pass negative values for short side: ", shortSide);
		
		if(longSide < 0)
			throw new NegativeArgumentException("Can not pass negative values for long side: ", longSide);
		
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
