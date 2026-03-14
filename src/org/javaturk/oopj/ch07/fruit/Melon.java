package org.javaturk.oopj.ch07.fruit;

public class Melon extends Fruit{

	@Override
	public void eat(){
		System.out.println("Melon is being eaten.");
	}
	
	public void cut(){
		System.out.println("Melon is being cut.");
	}
}
