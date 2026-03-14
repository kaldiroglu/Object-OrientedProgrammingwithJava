package org.javaturk.oopj.ch07.fruit;

public class Banana extends Fruit{
	@Override
	public void eat(){
		System.out.println("Banana is being eaten.");
	}
	
	public void peel(){
		System.out.println("Banana is being peeled.");
	}
}
