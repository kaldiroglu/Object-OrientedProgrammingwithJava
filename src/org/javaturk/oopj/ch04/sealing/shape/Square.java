package org.javaturk.oopj.ch04.sealing.shape;

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
}
