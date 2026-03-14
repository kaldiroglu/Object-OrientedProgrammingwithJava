package org.javaturk.oopj.ch04.sealing.shape;

public sealed class Shape permits Circle, Square, Rectangle {

	protected String name;

	public Shape(String name) {
		this.name = name;
	}

	public void draw(){
		System.out.println("Drawing " + name);
	}

	public void erase(){
		System.out.println("Erasing " + name);
	}

	public String getName() {
		return name;
	}
}