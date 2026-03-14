package org.javaturk.oopj.ch11.multipleInheritance;

public interface Actor extends Artist {
	
	@Override
	default void play(){
		System.out.println("Actor plays!");
	}
}




 

