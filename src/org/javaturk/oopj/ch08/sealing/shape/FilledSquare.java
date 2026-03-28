package org.javaturk.oopj.ch08.sealing.shape;

public class FilledSquare extends Square {

	private String color;

	public FilledSquare(String name, double size, String color) {
		super(name, size);
		this.color = color;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a square and filling it with " + color);		
	}

	@Override
	public void erase() {
		System.out.println("Erasing a square and filling it with " + color);
	}

}
