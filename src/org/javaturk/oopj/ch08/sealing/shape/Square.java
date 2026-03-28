package org.javaturk.oopj.ch08.sealing.shape;

public non-sealed class Square extends Shape {
	
	protected double side;

	public Square(String name, double side) {
		super(name);
		this.side = side;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a square.");		
	}

	@Override
	public void erase()  {
		System.out.println("Erasing a square.");
	}

	@Override
	public double calculateArea() {
		return side * side;
	}

	@Override
	public double calculateCircumference() {
		return 4 * side;
	}
}
