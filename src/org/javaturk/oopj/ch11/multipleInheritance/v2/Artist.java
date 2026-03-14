package org.javaturk.oopj.ch11.multipleInheritance.v2;

public interface Artist {
	
	default void play(){
		System.out.println("Artist plays!");
	}
}
