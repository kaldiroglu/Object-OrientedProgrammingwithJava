package org.javaturk.oopj.ch13.closable;

import java.io.IOException;

public class ClosableClass implements AutoCloseable{
	private String name;
	private boolean open;
	
	public ClosableClass(String name, boolean b) throws IOException {
		System.out.println("Closable object is constructed: " + name);
		this.name = name;

		if(b){
			System.out.println("Throwing a IOException!");
			throw new IOException();
		}
		open = true;
	}

	@Override
	public void close() throws Exception {
		System.out.println("Closing ClosableClass object: " + name);
		if(!open)
			throw new Exception("Kapalıyım zaten kardesim!");
		open = false;
	}
	
	public void doSomething(){
		System.out.println("Doing something!");
	}
	
	public boolean isOpen(){
		return open;
	}
}
