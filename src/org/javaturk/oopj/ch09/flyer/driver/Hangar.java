package org.javaturk.oopj.ch09.flyer.driver;

import org.javaturk.oopj.ch09.flyer.vehicle.*;

public class Hangar {
	protected String name;

	public Hangar(String name) {
		this.name = name;
	}

	public void store(Airplane plane) {
		System.out.println("\nStoring the airplane: " + plane + " in " + name + " hangar.");
		plane.go();
		plane.takeOff();
		plane.land();
	}

	@Override
	public String toString() {
		return "Hangar [name=" + name + "]";
	}
}
