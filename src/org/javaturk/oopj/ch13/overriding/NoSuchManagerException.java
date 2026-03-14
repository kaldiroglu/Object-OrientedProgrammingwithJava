package org.javaturk.oopj.ch13.overriding;

public class NoSuchManagerException extends NoSuchEmployeeException {

	public NoSuchManagerException(String message) {
		super(message);
	}
}
