package org.javaturk.oopj.ch08.sealing.shape;

public sealed abstract class Shape permits Circle, Square, Rectangle {

	protected String name;

	public Shape(String name) {
		this.name = name;
	}

	public abstract void draw();

	public abstract void erase();

	public abstract double calculateArea();

	public abstract double calculateCircumference();

	public String getName() {
		return name;
	}
}