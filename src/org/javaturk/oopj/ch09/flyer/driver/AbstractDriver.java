package org.javaturk.oopj.ch09.flyer.driver;


public abstract class AbstractDriver implements Driver{
	
	protected String name;

	public AbstractDriver(String name) {
		this.name = name;
	}
}
