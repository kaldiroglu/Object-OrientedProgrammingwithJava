package org.javaturk.oopj.ch11.defaultMethods;

public interface Printable {
	
	void view();
	
	void print();

//	public void format();
	
	default void format(){

		System.out.println("Printable is being formatted.");
	}
}
