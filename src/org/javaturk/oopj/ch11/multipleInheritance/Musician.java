package org.javaturk.oopj.ch11.multipleInheritance;

public interface Musician extends Artist {
	
	@Override
	default void play(){
		System.out.println("Musician plays!");
	}
}
