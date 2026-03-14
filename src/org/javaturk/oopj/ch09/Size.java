package org.javaturk.oopj.ch09;


import org.javaturk.oopj.ch09.extending.AnInterface;

public enum Size implements AnInterface {

	SMALL, MEDIUM, LARGE, EXTRA_LARGE;

	@Override
	public void doThis() {
		System.out.println("I am doing this :)");
	}
}
