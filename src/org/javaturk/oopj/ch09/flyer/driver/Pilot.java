package org.javaturk.oopj.ch09.flyer.driver;

import org.javaturk.oopj.ch09.flyer.vehicle.*;

public class Pilot extends AbstractDriver{
	
	public Pilot(String name) {
		super(name);
		Object o;
	}

	@Override
	public void drive(Vehicle vehicle){
		vehicle.turnOn();
		vehicle.go();
		vehicle.stop();
		vehicle.hashCode();
		fly(vehicle);
	}
	
	public void fly(Airplane airPlane){
		airPlane.fly();
	}
	
	private void fly(Vehicle vehicle){
		if(vehicle instanceof Airplane plane){
			//Airplane plane = (Airplane) vehicle;
			System.out.println("\nFlying an Airplane: " + plane);
			plane.turnOn();
			plane.takeOff();
			plane.fly();
			plane.land();
			plane.turnOff();
		}
		else{
			vehicle.turnOn();
			vehicle.go();
			vehicle.stop();
			vehicle.turnOff();
		}
	}
}
