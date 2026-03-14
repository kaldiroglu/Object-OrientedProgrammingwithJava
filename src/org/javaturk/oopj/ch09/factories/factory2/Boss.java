package org.javaturk.oopj.ch09.factories.factory2;

public class Boss extends Person implements Worker{
	
	public Boss(String name){
		super(name);
	}
	
	public void youWorkToo(){
		System.out.println("Boss is working for you :)");
	}


	@Override
	public void work() {
		youWorkToo();
	}

	@Override
	public void live() {
		System.out.println("Just living :)");
	}
}
