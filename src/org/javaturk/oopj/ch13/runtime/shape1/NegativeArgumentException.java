package org.javaturk.oopj.ch13.runtime.shape1;

public class NegativeArgumentException extends Exception {
	private double argument;
	
//	private static String message = "";
	
	public NegativeArgumentException(String message, double argument) {
		super(message);
		this.argument = argument;
	}
	
	public NegativeArgumentException(String message) {
		super(message);
	}

	public double getArgument() {
		return argument;
	}
}
