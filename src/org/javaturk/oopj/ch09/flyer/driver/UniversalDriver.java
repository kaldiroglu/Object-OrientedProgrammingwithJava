package org.javaturk.oopj.ch09.flyer.driver;

import org.javaturk.oopj.ch09.flyer.vehicle.*;

public class UniversalDriver extends AbstractDriver{
	
	public UniversalDriver(String name) {
		super(name);
	}

	@Override
	public void drive(Vehicle vehicle) {
		park(vehicle);		
	}
	
	public void park(Vehicle vehicle) {
		System.out.println("\n" + name + " is parking " + vehicle);
		vehicle.turnOn();
		vehicle.go();
		vehicle.stop();
		vehicle.turnOff();		
	}
}
