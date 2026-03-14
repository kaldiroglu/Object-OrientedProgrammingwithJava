package org.javaturk.oopj.ch09.flyer.driver;

import org.javaturk.oopj.ch09.flyer.vehicle.*;
public class Harbour {
	protected String name;
	
	public Harbour(String name) {
		this.name = name;
	}

	public void enter(Floatable floatable){
		System.out.println("\n" + floatable + " has entered the harbour: " + name);
		floatable.floatNow();
		floatable.park();
//		floatable.turnOn();
	}

	@Override
	public String toString() {
		return "Harbour [name=" + name + "]";
	}
}
