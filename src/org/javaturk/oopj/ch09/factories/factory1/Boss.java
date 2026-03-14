package org.javaturk.oopj.ch09.factories.factory1;

public class Boss implements Worker{
	
	public void youWorkToo(){
		System.out.println("Boss is working for you :)");
	}

	@Override
	public void work() {
		youWorkToo();
	}
}
